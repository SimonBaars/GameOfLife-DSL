/*
 * generated by Xtext 2.19.0
 */
package com.simonbaars.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractGoLDSLValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(com.simonbaars.goLDSL.GoLDSLPackage.eINSTANCE);
		return result;
	}
}