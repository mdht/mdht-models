/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.clondata.BreastCancerDiagnosisObservation;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Breast Cancer Diagnosis Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastCancerDiagnosisObservation#validateBreastCancerDiagnosisObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Diagnosis Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastCancerDiagnosisObservation#validateBreastCancerDiagnosisObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Diagnosis Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastCancerDiagnosisObservation#validateBreastCancerDiagnosisObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Diagnosis Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastCancerDiagnosisObservation#validateBreastCancerDiagnosisObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Diagnosis Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastCancerDiagnosisObservation#validateBreastCancerDiagnosisObservationTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Diagnosis Observation Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastCancerDiagnosisObservation#validateBreastCancerDiagnosisObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Diagnosis Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastCancerDiagnosisObservation#validateBreastCancerDiagnosisObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Diagnosis Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.BreastCancerDiagnosisObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BreastCancerDiagnosisObservationOperations extends ProblemObservationOperations {
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
	protected BreastCancerDiagnosisObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastCancerDiagnosisObservationCodeP(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Diagnosis Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastCancerDiagnosisObservationCodeP(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastCancerDiagnosisObservationCodeP(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Diagnosis Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastCancerDiagnosisObservationCodeP(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastCancerDiagnosisObservation The receiving '<em><b>Breast Cancer Diagnosis Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastCancerDiagnosisObservationCodeP(
			BreastCancerDiagnosisObservation breastCancerDiagnosisObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastCancerDiagnosisObservation());
			try {
				VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastCancerDiagnosisObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_CANCER_DIAGNOSIS_OBSERVATION__BREAST_CANCER_DIAGNOSIS_OBSERVATION_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastCancerDiagnosisObservationBreastCancerDiagnosisObservationCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastCancerDiagnosisObservation, context) }),
						new Object[] { breastCancerDiagnosisObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastCancerDiagnosisObservationCode(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Diagnosis Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastCancerDiagnosisObservationCode(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '282291009' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastCancerDiagnosisObservationCode(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Diagnosis Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastCancerDiagnosisObservationCode(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastCancerDiagnosisObservation The receiving '<em><b>Breast Cancer Diagnosis Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastCancerDiagnosisObservationCode(
			BreastCancerDiagnosisObservation breastCancerDiagnosisObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastCancerDiagnosisObservation());
			try {
				VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastCancerDiagnosisObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_CANCER_DIAGNOSIS_OBSERVATION__BREAST_CANCER_DIAGNOSIS_OBSERVATION_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastCancerDiagnosisObservationBreastCancerDiagnosisObservationCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastCancerDiagnosisObservation, context) }),
						new Object[] { breastCancerDiagnosisObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastCancerDiagnosisObservationEffectiveTime(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Diagnosis Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastCancerDiagnosisObservationEffectiveTime(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastCancerDiagnosisObservationEffectiveTime(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Diagnosis Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastCancerDiagnosisObservationEffectiveTime(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastCancerDiagnosisObservation The receiving '<em><b>Breast Cancer Diagnosis Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastCancerDiagnosisObservationEffectiveTime(
			BreastCancerDiagnosisObservation breastCancerDiagnosisObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastCancerDiagnosisObservation());
			try {
				VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastCancerDiagnosisObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_CANCER_DIAGNOSIS_OBSERVATION__BREAST_CANCER_DIAGNOSIS_OBSERVATION_EFFECTIVE_TIME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastCancerDiagnosisObservationBreastCancerDiagnosisObservationEffectiveTime",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastCancerDiagnosisObservation, context) }),
						new Object[] { breastCancerDiagnosisObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastCancerDiagnosisObservation The receiving '<em><b>Breast Cancer Diagnosis Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastCancerDiagnosisObservationTargetSiteCodeP(
			BreastCancerDiagnosisObservation breastCancerDiagnosisObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastCancerDiagnosisObservation());
			try {
				VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastCancerDiagnosisObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_CANCER_DIAGNOSIS_OBSERVATION__BREAST_CANCER_DIAGNOSIS_OBSERVATION_TARGET_SITE_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastCancerDiagnosisObservationBreastCancerDiagnosisObservationTargetSiteCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastCancerDiagnosisObservation, context) }),
						new Object[] { breastCancerDiagnosisObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastCancerDiagnosisObservationTargetSiteCode(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Diagnosis Observation Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastCancerDiagnosisObservationTargetSiteCode(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->size() = 1 and self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastCancerDiagnosisObservationTargetSiteCode(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Diagnosis Observation Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastCancerDiagnosisObservationTargetSiteCode(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateBreastCancerDiagnosisObservationTargetSiteCodeP(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Diagnosis Observation Target Site Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastCancerDiagnosisObservationTargetSiteCodeP(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastCancerDiagnosisObservationTargetSiteCodeP(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Diagnosis Observation Target Site Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastCancerDiagnosisObservationTargetSiteCodeP(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastCancerDiagnosisObservation The receiving '<em><b>Breast Cancer Diagnosis Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastCancerDiagnosisObservationTargetSiteCode(
			BreastCancerDiagnosisObservation breastCancerDiagnosisObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastCancerDiagnosisObservation());
			try {
				VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastCancerDiagnosisObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_CANCER_DIAGNOSIS_OBSERVATION__BREAST_CANCER_DIAGNOSIS_OBSERVATION_TARGET_SITE_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastCancerDiagnosisObservationBreastCancerDiagnosisObservationTargetSiteCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastCancerDiagnosisObservation, context) }),
						new Object[] { breastCancerDiagnosisObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastCancerDiagnosisObservationValueP(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Diagnosis Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastCancerDiagnosisObservationValueP(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastCancerDiagnosisObservationValueP(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Diagnosis Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastCancerDiagnosisObservationValueP(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastCancerDiagnosisObservation The receiving '<em><b>Breast Cancer Diagnosis Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastCancerDiagnosisObservationValueP(
			BreastCancerDiagnosisObservation breastCancerDiagnosisObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastCancerDiagnosisObservation());
			try {
				VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastCancerDiagnosisObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_CANCER_DIAGNOSIS_OBSERVATION__BREAST_CANCER_DIAGNOSIS_OBSERVATION_VALUE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastCancerDiagnosisObservationBreastCancerDiagnosisObservationValueP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastCancerDiagnosisObservation, context) }),
						new Object[] { breastCancerDiagnosisObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBreastCancerDiagnosisObservationValue(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Diagnosis Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastCancerDiagnosisObservationValue(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateBreastCancerDiagnosisObservationValue(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Breast Cancer Diagnosis Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBreastCancerDiagnosisObservationValue(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastCancerDiagnosisObservation The receiving '<em><b>Breast Cancer Diagnosis Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBreastCancerDiagnosisObservationValue(
			BreastCancerDiagnosisObservation breastCancerDiagnosisObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastCancerDiagnosisObservation());
			try {
				VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_BREAST_CANCER_DIAGNOSIS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastCancerDiagnosisObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_CANCER_DIAGNOSIS_OBSERVATION__BREAST_CANCER_DIAGNOSIS_OBSERVATION_VALUE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastCancerDiagnosisObservationBreastCancerDiagnosisObservationValue",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastCancerDiagnosisObservation, context) }),
						new Object[] { breastCancerDiagnosisObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationTemplateId(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationTemplateId(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(BreastCancerDiagnosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param breastCancerDiagnosisObservation The receiving '<em><b>Breast Cancer Diagnosis Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationTemplateId(
			BreastCancerDiagnosisObservation breastCancerDiagnosisObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getBreastCancerDiagnosisObservation());
			try {
				VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				breastCancerDiagnosisObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.BREAST_CANCER_DIAGNOSIS_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"BreastCancerDiagnosisObservationProblemObservationTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										breastCancerDiagnosisObservation, context) }),
						new Object[] { breastCancerDiagnosisObservation }));
			}

			return false;
		}
		return true;
	}

} // BreastCancerDiagnosisObservationOperations
