package org.bumble.eastadl.simplified.parser.antlr;

import org.eclipse.xtext.parser.antlr.SyntaxErrorMessageProvider;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.MismatchedNotSetException;
import org.antlr.runtime.MismatchedSetException;
//import org.antlr.runtime.MismatchedRangeException;
import org.antlr.runtime.MismatchedTreeNodeException;
import org.antlr.runtime.UnwantedTokenException;
import org.antlr.runtime.MissingTokenException;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.Token;
import org.antlr.runtime.RecognitionException;
import com.google.inject.Inject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.GrammarUtil;

public class EastAdlSimplifiedSyntaxErrorMessageProvider extends SyntaxErrorMessageProvider {
	public static String SYNTAX_DIAGNOSTIC = "org.eclipse.xtext.diagnostics.Diagnostic.Syntax";
	
	@Inject IGrammarAccess grammarAccess;
	@Override
	public SyntaxErrorMessage getSyntaxErrorMessage(IParserErrorContext context) {

		if (null != context && null != context.getRecognitionException()) {
			return getCustomizedSyntaxErrorMessage(context);
		}

		return super.getSyntaxErrorMessage(context);	
	}
	
	public SyntaxErrorMessage getCustomizedSyntaxErrorMessage(IParserErrorContext context) {
		SyntaxErrorMessage syntaxErrorMessage = super.getSyntaxErrorMessage(context);
		
		RecognitionException e = context.getRecognitionException();
		String msg = e.getMessage();
		String[] tokenNames = context.getTokenNames();
		
		if ( e instanceof UnwantedTokenException ) {
			UnwantedTokenException ute = (UnwantedTokenException)e;
			String tokenName;
			if ( ute.expecting== Token.EOF ) {
				tokenName = "EOF";
			}
			else {
				tokenName = tokenNames[ute.expecting];
			}
			
			if (tokenName.equals("RULE_BEGIN")) 
				msg = "The intendation is incorrect!";
			else
				msg = "extraneous input "+ute.getUnexpectedToken().getText()+" expecting "+tokenName;
		}
		else if ( e instanceof MissingTokenException ) {
			MissingTokenException mte = (MissingTokenException)e;
			String tokenName;
			if ( mte.expecting== Token.EOF ) {
				tokenName = "EOF";
			}
			else {
				tokenName = tokenNames[mte.expecting];
			}
			
			if (tokenName.equals("RULE_BEGIN"))
				msg = "The intendation is incorrect!";
			else if (tokenName.equals("RULE_END"))
				msg = "The end of the previous code block is missing, possibly due to the incorrect intendation.";
			else if (tokenName.equals("RULE_ID"))
				msg = "Identifier or value is missing in this line or the previous line.";
			else
				msg = "missing "+tokenName+" at "+e.token.getText();
		}
		else if ( e instanceof MismatchedTokenException ) {
			MismatchedTokenException mte = (MismatchedTokenException)e;
			String tokenName;
			if ( mte.expecting== Token.EOF ) {
				tokenName = "EOF";
			}
			else {
				tokenName = tokenNames[mte.expecting];
			}
			
			if (tokenName.equals("RULE_BEGIN"))
				msg = "Mandatory element(s) is missing or the intendation is incorrct or the order of elements is incorrect!";
			else if (tokenName.equals("RULE_END")) {
				if (!e.token.getText().isEmpty() && e.token.getText().charAt(0) == 46)
					msg = "The end of the previous code block is missing, possibly due to the wrong form of the value.";
				else
					msg = "The end of the previous code block is missing, "
							+ "possibly due to the incorrect intendation or element missing in the previous line "
							+ "or the order of the elements is incorrect.";
			}
			else
				msg = "mismatched input "+e.token.getText()+" expecting "+tokenName;
		}
		else if ( e instanceof MismatchedTreeNodeException ) {
			MismatchedTreeNodeException mtne = (MismatchedTreeNodeException)e;
			String tokenName;
			if ( mtne.expecting==Token.EOF ) {
				tokenName = "EOF";
			}
			else {
				tokenName = tokenNames[mtne.expecting];
			}
			msg = "mismatched tree node: "+mtne.node+" expecting "+tokenName;
		}
		else if ( e instanceof NoViableAltException ) {

			if (e.token.getText().isEmpty() || e.token.getText() == null)
				msg = "Value is missing in this line or last line.";
			else {
				if (GrammarUtil.getAllKeywords(grammarAccess.getGrammar()).contains(e.token.getText()))
					msg = "Something is missing before here! " + e.token.getText()  + 
					" is a reserved keyword which is not allowed to be a value or identifier.";
				else
					msg = "no viable alternative at input "+e.token.getText() + " or value doesn't match type";
			}
		}
		else if ( e instanceof EarlyExitException ) {
			msg = "required (...)+ loop did not match anything at input "+e.token.getText();
		}
		else if ( e instanceof MismatchedSetException ) {
			MismatchedSetException mse = (MismatchedSetException)e;
			msg = "mismatched input "+e.token.getText()+" expecting set "+mse.expecting;
		}
		else if ( e instanceof MismatchedNotSetException ) {
			MismatchedNotSetException mse = (MismatchedNotSetException)e;
			msg = "mismatched input "+e.token.getText()+" expecting set "+mse.expecting;
		}
		else if ( e instanceof FailedPredicateException ) {
			FailedPredicateException fpe = (FailedPredicateException)e;
			msg = "rule "+fpe.ruleName+" failed predicate: {"+fpe.predicateText+"}?";
		}
		
		//syntaxErrorMessage = super.getSyntaxErrorMessage(context);
		syntaxErrorMessage = new SyntaxErrorMessage(msg, SYNTAX_DIAGNOSTIC);
		return syntaxErrorMessage;
	}
}
