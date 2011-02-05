package org.openhealthtools.mdht.uml.cda.consol.tests;

import org.eclipse.emf.common.util.Diagnostic;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.consol.CONSOLFactory;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GeneralHeaderConstraints generalHeaderConstraints = CONSOLFactory.eINSTANCE.createGeneralHeaderConstraints().init();

		try {
			
		System.out.println("***** Generate Consolidated *****");
		
		CDAUtil.save(generalHeaderConstraints, System.out);

		System.out.println("\n\n***** Validate generated CCD *****");
	
			validate(generalHeaderConstraints);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

	private static void validate(ClinicalDocument clinicalDocument) throws Exception {
		boolean valid = CDAUtil.validate(clinicalDocument, new BasicValidationHandler() {
			@Override
			public void handleError(Diagnostic diagnostic) {
				System.out.println("ERROR: " + diagnostic.getMessage());
			}
			@Override
			public void handleWarning(Diagnostic diagnostic) {
				System.out.println("WARNING: " + diagnostic.getMessage());
			}
			@Override
			public void handleInfo(Diagnostic diagnostic) {
				System.out.println("INFO: " + diagnostic.getMessage());
			}
		});
		
		if (valid) {
			System.out.println("Document is valid");
		} else {
			System.out.println("Document is invalid");
		}
	}
}
