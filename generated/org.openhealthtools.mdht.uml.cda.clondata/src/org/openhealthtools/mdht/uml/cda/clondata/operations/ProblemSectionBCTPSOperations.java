/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.clondata.BreastCancerConcernAct;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.LastMenstrualPeriod;
import org.openhealthtools.mdht.uml.cda.clondata.ProblemSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemSectionEntriesOptionalOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Section BCTPS</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ProblemSectionBCTPS#validateProblemSectionBCTPSBreastCancerConcernAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section BCTPS Breast Cancer Concern Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ProblemSectionBCTPS#validateProblemSectionBCTPSLastMenstrualPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section BCTPS Last Menstrual Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ProblemSectionBCTPS#getBreastCancerConcernAct() <em>Get Breast Cancer Concern Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ProblemSectionBCTPS#getLastMenstrualPeriod() <em>Get Last Menstrual Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ProblemSectionBCTPS#validateProblemSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProblemSectionBCTPSOperations extends ProblemSectionEntriesOptionalOperations {
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
	protected ProblemSectionBCTPSOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemSectionBCTPSBreastCancerConcernAct(ProblemSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section BCTPS Breast Cancer Concern Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionBCTPSBreastCancerConcernAct(ProblemSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_SECTION_BCTPS_BREAST_CANCER_CONCERN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(clondata::BreastCancerConcernAct))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemSectionBCTPSBreastCancerConcernAct(ProblemSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section BCTPS Breast Cancer Concern Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionBCTPSBreastCancerConcernAct(ProblemSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_SECTION_BCTPS_BREAST_CANCER_CONCERN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemSectionBCTPS The receiving '<em><b>Problem Section BCTPS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemSectionBCTPSBreastCancerConcernAct(ProblemSectionBCTPS problemSectionBCTPS,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_SECTION_BCTPS_BREAST_CANCER_CONCERN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getProblemSectionBCTPS());
			try {
				VALIDATE_PROBLEM_SECTION_BCTPS_BREAST_CANCER_CONCERN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROBLEM_SECTION_BCTPS_BREAST_CANCER_CONCERN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_SECTION_BCTPS_BREAST_CANCER_CONCERN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				problemSectionBCTPS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.PROBLEM_SECTION_BCTPS__PROBLEM_SECTION_BCTPS_BREAST_CANCER_CONCERN_ACT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ProblemSectionBCTPSProblemSectionBCTPSBreastCancerConcernAct",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										problemSectionBCTPS, context) }),
						new Object[] { problemSectionBCTPS }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemSectionBCTPSLastMenstrualPeriod(ProblemSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section BCTPS Last Menstrual Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionBCTPSLastMenstrualPeriod(ProblemSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_SECTION_BCTPS_LAST_MENSTRUAL_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(clondata::LastMenstrualPeriod))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemSectionBCTPSLastMenstrualPeriod(ProblemSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section BCTPS Last Menstrual Period</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionBCTPSLastMenstrualPeriod(ProblemSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_SECTION_BCTPS_LAST_MENSTRUAL_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemSectionBCTPS The receiving '<em><b>Problem Section BCTPS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemSectionBCTPSLastMenstrualPeriod(ProblemSectionBCTPS problemSectionBCTPS,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_SECTION_BCTPS_LAST_MENSTRUAL_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getProblemSectionBCTPS());
			try {
				VALIDATE_PROBLEM_SECTION_BCTPS_LAST_MENSTRUAL_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROBLEM_SECTION_BCTPS_LAST_MENSTRUAL_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_SECTION_BCTPS_LAST_MENSTRUAL_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				problemSectionBCTPS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.PROBLEM_SECTION_BCTPS__PROBLEM_SECTION_BCTPS_LAST_MENSTRUAL_PERIOD,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ProblemSectionBCTPSProblemSectionBCTPSLastMenstrualPeriod",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										problemSectionBCTPS, context) }),
						new Object[] { problemSectionBCTPS }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getBreastCancerConcernAct(ProblemSectionBCTPS) <em>Get Breast Cancer Concern Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreastCancerConcernAct(ProblemSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BREAST_CANCER_CONCERN_ACT__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(clondata::BreastCancerConcernAct))->asSequence()->any(true).oclAsType(clondata::BreastCancerConcernAct)";

	/**
	 * The cached OCL query for the '{@link #getBreastCancerConcernAct(ProblemSectionBCTPS) <em>Get Breast Cancer Concern Act</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreastCancerConcernAct(ProblemSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BREAST_CANCER_CONCERN_ACT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static BreastCancerConcernAct getBreastCancerConcernAct(ProblemSectionBCTPS problemSectionBCTPS) {

		if (GET_BREAST_CANCER_CONCERN_ACT__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getProblemSectionBCTPS(),
				CLONDATAPackage.eINSTANCE.getProblemSectionBCTPS().getEAllOperations().get(64));
			try {
				GET_BREAST_CANCER_CONCERN_ACT__EOCL_QRY = helper.createQuery(GET_BREAST_CANCER_CONCERN_ACT__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_BREAST_CANCER_CONCERN_ACT__EOCL_QRY);
		return (BreastCancerConcernAct) query.evaluate(problemSectionBCTPS);
	}

	/**
	 * The cached OCL expression body for the '{@link #getLastMenstrualPeriod(ProblemSectionBCTPS) <em>Get Last Menstrual Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastMenstrualPeriod(ProblemSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_LAST_MENSTRUAL_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(clondata::LastMenstrualPeriod))->asSequence()->any(true).oclAsType(clondata::LastMenstrualPeriod)";

	/**
	 * The cached OCL query for the '{@link #getLastMenstrualPeriod(ProblemSectionBCTPS) <em>Get Last Menstrual Period</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastMenstrualPeriod(ProblemSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_LAST_MENSTRUAL_PERIOD__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static LastMenstrualPeriod getLastMenstrualPeriod(ProblemSectionBCTPS problemSectionBCTPS) {

		if (GET_LAST_MENSTRUAL_PERIOD__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getProblemSectionBCTPS(),
				CLONDATAPackage.eINSTANCE.getProblemSectionBCTPS().getEAllOperations().get(65));
			try {
				GET_LAST_MENSTRUAL_PERIOD__EOCL_QRY = helper.createQuery(GET_LAST_MENSTRUAL_PERIOD__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_LAST_MENSTRUAL_PERIOD__EOCL_QRY);
		return (LastMenstrualPeriod) query.evaluate(problemSectionBCTPS);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemSectionEntriesOptionalTemplateId(ProblemSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionEntriesOptionalTemplateId(ProblemSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.2.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemSectionEntriesOptionalTemplateId(ProblemSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionEntriesOptionalTemplateId(ProblemSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemSectionBCTPS The receiving '<em><b>Problem Section BCTPS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemSectionEntriesOptionalTemplateId(ProblemSectionBCTPS problemSectionBCTPS,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getProblemSectionBCTPS());
			try {
				VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				problemSectionBCTPS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.PROBLEM_SECTION_BCTPS__PROBLEM_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ProblemSectionBCTPSProblemSectionEntriesOptionalTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										problemSectionBCTPS, context) }),
						new Object[] { problemSectionBCTPS }));
			}

			return false;
		}
		return true;
	}

} // ProblemSectionBCTPSOperations
