
package org.openhealthtools.mdht.uml.cda.mu2consol.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.IValidationContext;
import org.openhealthtools.mdht.uml.validation.provider.AbstractMultiConstraint;

public class Mu2consolConstraintValidator extends AbstractMultiConstraint{
	
	
	public Mu2consolConstraintValidator() {
		super();
		System.out.println("Enter Mu2consolValidator Constructor");
		// TODO Auto-generated constructor stub
	}

	public Mu2consolConstraintValidator(String validationMethodPrefix) {
		super(validationMethodPrefix);
		// TODO Auto-generated constructor stub
	}

	public IStatus  validateProblemEntry (IValidationContext context){
		System.out.println("Enter validateProblemEntry");
		IStatus result = context.createSuccessStatus();
		
		return result;
		
	}
	
}