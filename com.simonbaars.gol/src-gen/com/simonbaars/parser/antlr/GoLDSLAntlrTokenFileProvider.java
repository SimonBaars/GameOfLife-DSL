/*
 * generated by Xtext 2.19.0
 */
package com.simonbaars.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GoLDSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/simonbaars/parser/antlr/internal/InternalGoLDSL.tokens");
	}
}
