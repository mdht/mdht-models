/**
 * @author Dan Brown (Ai)
 */

package test;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.mdht.uml.cda.util.CDADiagnostic;
import org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil.ValidationStatistics;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.util.DS4PUtil;

public class DS4PValidationExample {

	public static final String SAMPLES_PATH = "samples";

	public static final String DS4P_TEST_FILE_NAME = "170.315_b8_ds4p_amb_sample1_v2.xml";

	public static void main(String[] args) {
		setup();
		runDS4PValidationUsingGenericValidationHandler();
		System.out.println();
		// use this version for an easier integration with the
		// referenceccdavalidator
		runDS4PValidationUsingSpecificValidationResult();
	}

	private static void setup() {
		System.out.println("initializing...");
		CONTENTPROFILEPackage.eINSTANCE.getMandatoryDocumentAssignedAuthor();
	}

	private static void runDS4PValidationUsingGenericValidationHandler() {
		System.out.println("runDS4PValidationUsingGenericValidationHandler:");
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

			@Override
			public boolean isCaptureValidationStatistics() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public ValidationStatistics getValidationStatistics() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void setValidationStatistics(ValidationStatistics validationStatistics) {
				// TODO Auto-generated method stub

			}
		};

		try {
			DS4PUtil.validateAsDS4P(new FileInputStream(SAMPLES_PATH + File.separator + DS4P_TEST_FILE_NAME), handler);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public static Set<String> listFilesUsingJavaIO(String dir) {
	// return Stream.of(new File(dir).listFiles()).filter(file -> !file.isDirectory()).map(File::getName).collect(
	// Collectors.toSet());
	// }
	//
	// private static void runDS4PValidationUsingSpecificValidationResult() {
	// System.out.println("runDS4PValidationUsingSpecificValidationResult:");
	//
	// try {
	//
	// for (String ds4pFile : listFilesUsingJavaIO("samples/ds4p")) {
	// ValidationResult result = new ValidationResult();
	// System.err.println(ds4pFile);
	// DS4PUtil.validateAsDS4P(new FileInputStream("samples/ds4p/" + ds4pFile), result);
	// System.out.println("Errors:");
	// parseAndPrintIssueResults(result.getErrorDiagnostics());
	// System.out.println("Warnings:");
	// parseAndPrintIssueResults(result.getWarningDiagnostics());
	// System.out.println("Info:");
	// parseAndPrintIssueResults(result.getInfoDiagnostics());
	// }
	//
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	//
	// }

	private static void parseAndPrintIssueResults(List<Diagnostic> resultDiagnostics) {
		if (resultDiagnostics.size() > 0) {
			for (Diagnostic diagnostic : resultDiagnostics) {
				CDADiagnostic cdaDiag = new CDADiagnostic(diagnostic);
				System.out.println(
					"Message: " + cdaDiag.getMessage() + System.lineSeparator() + "Path: " + cdaDiag.getPath() +
							System.lineSeparator() + "Source: " + cdaDiag.getSource());
			}
		} else {
			System.out.println("There are no results for this set of diagnostics");
		}
	}

}
