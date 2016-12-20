/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physician Reading Study Performer2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer2#validatePhysicianReadingStudyPerformerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicianReadingStudyPerformer2Operations extends PhysicianReadingStudyPerformerOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicianReadingStudyPerformer2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianReadingStudyPerformerTemplateId(PhysicianReadingStudyPerformer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerTemplateId(PhysicianReadingStudyPerformer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.1' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianReadingStudyPerformerTemplateId(PhysicianReadingStudyPerformer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerTemplateId(PhysicianReadingStudyPerformer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianReadingStudyPerformer2 The receiving '<em><b>Physician Reading Study Performer2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicianReadingStudyPerformerTemplateId(
			PhysicianReadingStudyPerformer2 physicianReadingStudyPerformer2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIAN_READING_STUDY_PERFORMER2);
			try {
				VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				physicianReadingStudyPerformer2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PHYSICIAN_READING_STUDY_PERFORMER2__PHYSICIAN_READING_STUDY_PERFORMER_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"PhysicianReadingStudyPerformer2PhysicianReadingStudyPerformerTemplateId"),
						new Object[] { physicianReadingStudyPerformer2 }));
			}

			return false;
		}
		return true;
	}

} // PhysicianReadingStudyPerformer2Operations
