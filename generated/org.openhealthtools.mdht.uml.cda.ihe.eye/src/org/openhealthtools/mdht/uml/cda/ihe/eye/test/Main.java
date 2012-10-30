package org.openhealthtools.mdht.uml.cda.ihe.eye.test;

import java.io.FileInputStream;

import org.eclipse.emf.common.util.Diagnostic;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ihe.eye.EyePackage;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.cda.util.ValidationResult;

public class Main {
	public static void main(String[] args) throws Exception {
		EyePackage.eINSTANCE.eClass();
		
		ValidationResult result = new ValidationResult();
		ClinicalDocument clinicalDocument = CDAUtil.load(new FileInputStream("resources/GEE_MDHT_Generated-03.xml"), result);
		
		for (Diagnostic diagnostic : result.getErrorDiagnostics()) {
			System.out.println("ERROR: " + diagnostic.getMessage());
		}
		
		for (Diagnostic diagnostic : result.getWarningDiagnostics()) {
			System.out.println("WARNING: " + diagnostic.getMessage());
		}
		
		for (Diagnostic diagnostic : result.getInfoDiagnostics()) {
			System.out.println("INFO: " + diagnostic.getMessage());
		}
	}
}
