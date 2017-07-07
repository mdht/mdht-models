package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.util.DS4PUtil;

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
		
		DS4PUtil.validateAsDS4P(new FileInputStream("samples/SegmentedDocumentContentProfileSample.xml"),handler);

	}

}
