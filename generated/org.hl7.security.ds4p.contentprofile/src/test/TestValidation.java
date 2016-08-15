package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.util.DSP4Util;

public class TestValidation {

	public static void main(String[] args) throws FileNotFoundException, Exception {

		CONTENTPROFILEPackage.eINSTANCE.getMandatoryDocumentAssignedAuthor();

		ValidationHandler handler = new ValidationHandler() {

			@Override
			public void handleError(Diagnostic diagnostic) {
				System.out.println(diagnostic.getMessage());

			}

			@Override
			public void handleWarning(Diagnostic diagnostic) {
				System.out.println(diagnostic.getMessage());
			}

			@Override
			public void handleInfo(Diagnostic diagnostic) {
				System.out.println(diagnostic.getMessage());
			}

		};
		
		DSP4Util.validateAsDSP4(new FileInputStream("samples/SegmentedDocumentContentProfileSample.xml"),handler);

	}

}
