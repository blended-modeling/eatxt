/**
 * generated by Xtext 2.25.0
 */
package org.bumble.eastadl.simplified.formatting2;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XCollectionLiteral;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XPostfixOperation;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XSynchronizedExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.formatting2.XbaseFormatter;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XImportSection;

@SuppressWarnings("all")
public class EastAdlSimplifiedFormatter extends XbaseFormatter {
  @Override
  protected void _format(final XBlockExpression expr, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<XBlockExpression>surround(expr, _function);
    EList<XExpression> _expressions = expr.getExpressions();
    for (final XExpression child : _expressions) {
      {
        final ISemanticRegion sem = this.textRegionExtensions.immediatelyFollowing(child).keyword(";");
        if ((sem != null)) {
          final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
            it.noSpace();
          };
          document.prepend(sem, _function_1);
          XExpression _last = IterableExtensions.<XExpression>last(expr.getExpressions());
          boolean _notEquals = (!Objects.equal(child, _last));
          if (_notEquals) {
            final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
              it.newLine();
            };
            document.append(sem, _function_2);
          }
        } else {
          XExpression _last_1 = IterableExtensions.<XExpression>last(expr.getExpressions());
          boolean _notEquals_1 = (!Objects.equal(child, _last_1));
          if (_notEquals_1) {
            final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
              it.newLine();
            };
            document.<XExpression>append(child, _function_3);
          }
        }
        document.<XExpression>format(child);
      }
    }
  }
  
  @Override
  protected void formatBody(final XExpression expr, final boolean forceMultiline, @Extension final IFormattableDocument doc) {
    if ((expr == null)) {
      return;
    }
    if ((expr instanceof XBlockExpression)) {
      final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
        it.newLine();
      };
      doc.<XBlockExpression>prepend(((XBlockExpression)expr), _function);
    } else {
      if ((forceMultiline || this.textRegionExtensions.previousHiddenRegion(expr).isMultiline())) {
        final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
          it.indent();
        };
        doc.<XExpression>surround(doc.<XExpression>prepend(expr, _function_1), _function_2);
      } else {
        final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
          it.oneSpace();
        };
        doc.<XExpression>prepend(expr, _function_3);
      }
    }
    doc.<XExpression>format(expr);
  }
  
  @Override
  protected void formatBodyInline(final XExpression expr, final boolean forceMultiline, @Extension final IFormattableDocument doc) {
    if ((expr == null)) {
      return;
    }
    if ((expr instanceof XBlockExpression)) {
      final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
        it.newLine();
      };
      doc.<XBlockExpression>surround(((XBlockExpression)expr), _function);
    } else {
      if ((forceMultiline || this.textRegionExtensions.previousHiddenRegion(expr).isMultiline())) {
        final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
          it.indent();
        };
        final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        doc.<XExpression>append(doc.<XExpression>surround(doc.<XExpression>prepend(expr, _function_1), _function_2), _function_3);
      } else {
        final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
          it.oneSpace();
        };
        doc.<XExpression>surround(expr, _function_4);
      }
    }
    doc.<XExpression>format(expr);
  }
  
  @Override
  protected void formatBodyParagraph(final XExpression expr, @Extension final IFormattableDocument doc) {
    if ((expr == null)) {
      return;
    }
    if ((expr instanceof XBlockExpression)) {
      final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
        it.newLine();
      };
      doc.<XBlockExpression>surround(((XBlockExpression)expr), _function);
    } else {
      final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
        it.oneSpace();
      };
      doc.<XExpression>surround(expr, _function_1);
    }
    doc.<XExpression>format(expr);
  }
  
  @Override
  public void format(final Object expr, final IFormattableDocument document) {
    if (expr instanceof JvmTypeParameter) {
      _format((JvmTypeParameter)expr, document);
      return;
    } else if (expr instanceof JvmFormalParameter) {
      _format((JvmFormalParameter)expr, document);
      return;
    } else if (expr instanceof XtextResource) {
      _format((XtextResource)expr, document);
      return;
    } else if (expr instanceof XAssignment) {
      _format((XAssignment)expr, document);
      return;
    } else if (expr instanceof XBinaryOperation) {
      _format((XBinaryOperation)expr, document);
      return;
    } else if (expr instanceof XDoWhileExpression) {
      _format((XDoWhileExpression)expr, document);
      return;
    } else if (expr instanceof XFeatureCall) {
      _format((XFeatureCall)expr, document);
      return;
    } else if (expr instanceof XMemberFeatureCall) {
      _format((XMemberFeatureCall)expr, document);
      return;
    } else if (expr instanceof XPostfixOperation) {
      _format((XPostfixOperation)expr, document);
      return;
    } else if (expr instanceof XWhileExpression) {
      _format((XWhileExpression)expr, document);
      return;
    } else if (expr instanceof XFunctionTypeRef) {
      _format((XFunctionTypeRef)expr, document);
      return;
    } else if (expr instanceof JvmGenericArrayTypeReference) {
      _format((JvmGenericArrayTypeReference)expr, document);
      return;
    } else if (expr instanceof JvmParameterizedTypeReference) {
      _format((JvmParameterizedTypeReference)expr, document);
      return;
    } else if (expr instanceof JvmWildcardTypeReference) {
      _format((JvmWildcardTypeReference)expr, document);
      return;
    } else if (expr instanceof XBasicForLoopExpression) {
      _format((XBasicForLoopExpression)expr, document);
      return;
    } else if (expr instanceof XBlockExpression) {
      _format((XBlockExpression)expr, document);
      return;
    } else if (expr instanceof XCastedExpression) {
      _format((XCastedExpression)expr, document);
      return;
    } else if (expr instanceof XClosure) {
      _format((XClosure)expr, document);
      return;
    } else if (expr instanceof XCollectionLiteral) {
      _format((XCollectionLiteral)expr, document);
      return;
    } else if (expr instanceof XConstructorCall) {
      _format((XConstructorCall)expr, document);
      return;
    } else if (expr instanceof XForLoopExpression) {
      _format((XForLoopExpression)expr, document);
      return;
    } else if (expr instanceof XIfExpression) {
      _format((XIfExpression)expr, document);
      return;
    } else if (expr instanceof XInstanceOfExpression) {
      _format((XInstanceOfExpression)expr, document);
      return;
    } else if (expr instanceof XReturnExpression) {
      _format((XReturnExpression)expr, document);
      return;
    } else if (expr instanceof XSwitchExpression) {
      _format((XSwitchExpression)expr, document);
      return;
    } else if (expr instanceof XSynchronizedExpression) {
      _format((XSynchronizedExpression)expr, document);
      return;
    } else if (expr instanceof XThrowExpression) {
      _format((XThrowExpression)expr, document);
      return;
    } else if (expr instanceof XTryCatchFinallyExpression) {
      _format((XTryCatchFinallyExpression)expr, document);
      return;
    } else if (expr instanceof XTypeLiteral) {
      _format((XTypeLiteral)expr, document);
      return;
    } else if (expr instanceof XVariableDeclaration) {
      _format((XVariableDeclaration)expr, document);
      return;
    } else if (expr instanceof JvmTypeConstraint) {
      _format((JvmTypeConstraint)expr, document);
      return;
    } else if (expr instanceof XExpression) {
      _format((XExpression)expr, document);
      return;
    } else if (expr instanceof XImportDeclaration) {
      _format((XImportDeclaration)expr, document);
      return;
    } else if (expr instanceof XImportSection) {
      _format((XImportSection)expr, document);
      return;
    } else if (expr instanceof EObject) {
      _format((EObject)expr, document);
      return;
    } else if (expr == null) {
      _format((Void)null, document);
      return;
    } else if (expr != null) {
      _format(expr, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expr, document).toString());
    }
  }
}