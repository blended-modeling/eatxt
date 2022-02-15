package org.bumble.eatxt.converter;

import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.nodemodel.INode;

public class UUID2XtextConverter extends Ecore2XtextTerminalConverters {
	
	@ValueConverter(rule = "UUID")
	public IValueConverter<String> UUID() {
		return new AbstractNullSafeConverter<String>() {
			@Override
			protected String internalToValue(String string, INode node) {
				return STRING().toValue(string, node);
			}

			@Override
			protected String internalToString(String value) {
				return STRING().toString(value);
			}
		};
	}
}