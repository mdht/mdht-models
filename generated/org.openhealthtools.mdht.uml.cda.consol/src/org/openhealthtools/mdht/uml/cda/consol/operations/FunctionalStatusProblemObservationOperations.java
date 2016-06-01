/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Functional Status Problem Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationNonMedicinalSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Non Medicinal Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationCaregiverCharacteristics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Caregiver Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#getNonMedicinalSupplyActivities() <em>Get Non Medicinal Supply Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#getCaregiverCharacteristicss() <em>Get Caregiver Characteristicss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationHasTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationHasOnsetDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Onset Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationHasResolutionDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Resolution Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationValueNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionalStatusProblemObservationOperations extends ProblemObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalStatusProblemObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusProblemObservationMethodCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationMethodCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (( not self.methodCode->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusProblemObservationMethodCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationMethodCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusProblemObservation The receiving '<em><b>Functional Status Problem Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFunctionalStatusProblemObservationMethodCode(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_METHOD_CODE,
						ConsolPlugin.INSTANCE.getString(
							"FunctionalStatusProblemObservationFunctionalStatusProblemObservationMethodCode"),
						new Object[] { functionalStatusProblemObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusProblemObservationNonMedicinalSupplyActivity(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Non Medicinal Supply Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationNonMedicinalSupplyActivity(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.supply.oclIsUndefined() and entryRelationship.supply.oclIsKindOf(consol::NonMedicinalSupplyActivity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusProblemObservationNonMedicinalSupplyActivity(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Non Medicinal Supply Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationNonMedicinalSupplyActivity(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusProblemObservation The receiving '<em><b>Functional Status Problem Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFunctionalStatusProblemObservationNonMedicinalSupplyActivity(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY,
						ConsolPlugin.INSTANCE.getString(
							"FunctionalStatusProblemObservationFunctionalStatusProblemObservationNonMedicinalSupplyActivity"),
						new Object[] { functionalStatusProblemObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusProblemObservationCaregiverCharacteristics(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Caregiver Characteristics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationCaregiverCharacteristics(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::CaregiverCharacteristics) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusProblemObservationCaregiverCharacteristics(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Caregiver Characteristics</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationCaregiverCharacteristics(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusProblemObservation The receiving '<em><b>Functional Status Problem Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFunctionalStatusProblemObservationCaregiverCharacteristics(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CAREGIVER_CHARACTERISTICS,
						ConsolPlugin.INSTANCE.getString(
							"FunctionalStatusProblemObservationFunctionalStatusProblemObservationCaregiverCharacteristics"),
						new Object[] { functionalStatusProblemObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusProblemObservationAssessmentScaleObservation(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Assessment Scale Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationAssessmentScaleObservation(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AssessmentScaleObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusProblemObservationAssessmentScaleObservation(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Assessment Scale Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationAssessmentScaleObservation(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusProblemObservation The receiving '<em><b>Functional Status Problem Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFunctionalStatusProblemObservationAssessmentScaleObservation(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION,
						ConsolPlugin.INSTANCE.getString(
							"FunctionalStatusProblemObservationFunctionalStatusProblemObservationAssessmentScaleObservation"),
						new Object[] { functionalStatusProblemObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonMedicinalSupplyActivities(FunctionalStatusProblemObservation) <em>Get Non Medicinal Supply Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonMedicinalSupplyActivities(FunctionalStatusProblemObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity)).oclAsType(consol::NonMedicinalSupplyActivity)";

	/**
	 * The cached OCL query for the '{@link #getNonMedicinalSupplyActivities(FunctionalStatusProblemObservation) <em>Get Non Medicinal Supply Activities</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonMedicinalSupplyActivities(FunctionalStatusProblemObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<NonMedicinalSupplyActivity> getNonMedicinalSupplyActivities(
			FunctionalStatusProblemObservation functionalStatusProblemObservation) {
		if (GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION.getEAllOperations().get(82));
			try {
				GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_QRY = helper.createQuery(
					GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NonMedicinalSupplyActivity> result = (Collection<NonMedicinalSupplyActivity>) query.evaluate(
			functionalStatusProblemObservation);
		return new BasicEList.UnmodifiableEList<NonMedicinalSupplyActivity>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCaregiverCharacteristicss(FunctionalStatusProblemObservation) <em>Get Caregiver Characteristicss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaregiverCharacteristicss(FunctionalStatusProblemObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CAREGIVER_CHARACTERISTICSS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CaregiverCharacteristics)).oclAsType(consol::CaregiverCharacteristics)";

	/**
	 * The cached OCL query for the '{@link #getCaregiverCharacteristicss(FunctionalStatusProblemObservation) <em>Get Caregiver Characteristicss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaregiverCharacteristicss(FunctionalStatusProblemObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CaregiverCharacteristics> getCaregiverCharacteristicss(
			FunctionalStatusProblemObservation functionalStatusProblemObservation) {
		if (GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION.getEAllOperations().get(83));
			try {
				GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY = helper.createQuery(GET_CAREGIVER_CHARACTERISTICSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CaregiverCharacteristics> result = (Collection<CaregiverCharacteristics>) query.evaluate(
			functionalStatusProblemObservation);
		return new BasicEList.UnmodifiableEList<CaregiverCharacteristics>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentScaleObservations(FunctionalStatusProblemObservation) <em>Get Assessment Scale Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentScaleObservations(FunctionalStatusProblemObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AssessmentScaleObservation)).oclAsType(consol::AssessmentScaleObservation)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentScaleObservations(FunctionalStatusProblemObservation) <em>Get Assessment Scale Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentScaleObservations(FunctionalStatusProblemObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AssessmentScaleObservation> getAssessmentScaleObservations(
			FunctionalStatusProblemObservation functionalStatusProblemObservation) {
		if (GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION.getEAllOperations().get(84));
			try {
				GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY = helper.createQuery(
					GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AssessmentScaleObservation> result = (Collection<AssessmentScaleObservation>) query.evaluate(
			functionalStatusProblemObservation);
		return new BasicEList.UnmodifiableEList<AssessmentScaleObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationHasTextReference(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationHasTextReference(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined() implies self.text->forAll(reference->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationHasTextReference(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationHasTextReference(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusProblemObservation The receiving '<em><b>Functional Status Problem Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationHasTextReference(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE,
						ConsolPlugin.INSTANCE.getString(
							"FunctionalStatusProblemObservationProblemObservationHasTextReference"),
						new Object[] { functionalStatusProblemObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationTextReferenceValue(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTextReferenceValue(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.text->forAll(reference->size() = 1) implies self.text->forAll(reference->one(value->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationTextReferenceValue(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTextReferenceValue(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusProblemObservation The receiving '<em><b>Functional Status Problem Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationTextReferenceValue(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PROBLEM_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROBLEM_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_TEXT_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString(
							"FunctionalStatusProblemObservationProblemObservationTextReferenceValue"),
						new Object[] { functionalStatusProblemObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationHasTextReferenceValue(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationHasTextReferenceValue(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.reference.value.oclIsUndefined() implies not self.getSection().text.getText(self.text.reference.value.substring(2, self.text.reference.value.size())).oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationHasTextReferenceValue(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationHasTextReferenceValue(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusProblemObservation The receiving '<em><b>Functional Status Problem Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationHasTextReferenceValue(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString(
							"FunctionalStatusProblemObservationProblemObservationHasTextReferenceValue"),
						new Object[] { functionalStatusProblemObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationHasOnsetDate(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Onset Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationHasOnsetDate(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.low.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationHasOnsetDate(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Onset Date</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationHasOnsetDate(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusProblemObservation The receiving '<em><b>Functional Status Problem Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationHasOnsetDate(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_OBSERVATION_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PROBLEM_OBSERVATION_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_HAS_ONSET_DATE,
						ConsolPlugin.INSTANCE.getString(
							"FunctionalStatusProblemObservationProblemObservationHasOnsetDate"),
						new Object[] { functionalStatusProblemObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationHasResolutionDate(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Resolution Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationHasResolutionDate(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.high.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationHasResolutionDate(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Resolution Date</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationHasResolutionDate(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusProblemObservation The receiving '<em><b>Functional Status Problem Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationHasResolutionDate(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_OBSERVATION_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PROBLEM_OBSERVATION_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROBLEM_OBSERVATION_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_HAS_RESOLUTION_DATE,
						ConsolPlugin.INSTANCE.getString(
							"FunctionalStatusProblemObservationProblemObservationHasResolutionDate"),
						new Object[] { functionalStatusProblemObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationValueNullFlavor(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationValueNullFlavor(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->forAll(val | not val.isNullFlavorUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationValueNullFlavor(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationValueNullFlavor(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusProblemObservation The receiving '<em><b>Functional Status Problem Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationValueNullFlavor(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PROBLEM_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_VALUE_NULL_FLAVOR,
						ConsolPlugin.INSTANCE.getString(
							"FunctionalStatusProblemObservationProblemObservationValueNullFlavor"),
						new Object[] { functionalStatusProblemObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationTemplateId(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.68')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationTemplateId(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusProblemObservation The receiving '<em><b>Functional Status Problem Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationTemplateId(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"FunctionalStatusProblemObservationProblemObservationTemplateId"),
						new Object[] { functionalStatusProblemObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationClassCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationClassCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationClassCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationClassCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusProblemObservation The receiving '<em><b>Functional Status Problem Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationClassCode(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PROBLEM_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"FunctionalStatusProblemObservationProblemObservationClassCode"),
						new Object[] { functionalStatusProblemObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationMoodCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationMoodCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationMoodCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationMoodCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusProblemObservation The receiving '<em><b>Functional Status Problem Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationMoodCode(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PROBLEM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationProblemObservationMoodCode"),
						new Object[] { functionalStatusProblemObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationNegationInd(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Negation Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationNegationInd(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationNegationInd(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Negation Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationNegationInd(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusProblemObservation The receiving '<em><b>Functional Status Problem Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationNegationInd(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PROBLEM_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_NEGATION_IND,
						ConsolPlugin.INSTANCE.getString(
							"FunctionalStatusProblemObservationProblemObservationNegationInd"),
						new Object[] { functionalStatusProblemObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationId(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationId(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationId(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationId(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusProblemObservation The receiving '<em><b>Functional Status Problem Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationId(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PROBLEM_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_ID,
						ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationProblemObservationId"),
						new Object[] { functionalStatusProblemObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationCodeP(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationCodeP(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationCodeP(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationCodeP(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusProblemObservation The receiving '<em><b>Functional Status Problem Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationCodeP(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PROBLEM_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_CODE_P,
						ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationProblemObservationCodeP"),
						new Object[] { functionalStatusProblemObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.ProblemObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ProblemObservationCodeP", passToken);
				}
				passToken.add(functionalStatusProblemObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '248536006' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusProblemObservation The receiving '<em><b>Functional Status Problem Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationCode(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ProblemObservationCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(functionalStatusProblemObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PROBLEM_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PROBLEM_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_CODE,
						ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationProblemObservationCode"),
						new Object[] { functionalStatusProblemObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationText(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationText(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationText(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationText(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusProblemObservation The receiving '<em><b>Functional Status Problem Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationText(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PROBLEM_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_TEXT,
						ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationProblemObservationText"),
						new Object[] { functionalStatusProblemObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationStatusCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationStatusCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationStatusCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationStatusCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusProblemObservation The receiving '<em><b>Functional Status Problem Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationStatusCode(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"FunctionalStatusProblemObservationProblemObservationStatusCode"),
						new Object[] { functionalStatusProblemObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationEffectiveTime(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationEffectiveTime(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationEffectiveTime(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationEffectiveTime(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusProblemObservation The receiving '<em><b>Functional Status Problem Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationEffectiveTime(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString(
							"FunctionalStatusProblemObservationProblemObservationEffectiveTime"),
						new Object[] { functionalStatusProblemObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationValueP(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationValueP(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationValueP(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationValueP(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusProblemObservation The receiving '<em><b>Functional Status Problem Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationValueP(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROBLEM_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PROBLEM_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_VALUE_P,
						ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationProblemObservationValueP"),
						new Object[] { functionalStatusProblemObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.ProblemObservationValueP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ProblemObservationValueP", passToken);
				}
				passToken.add(functionalStatusProblemObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationValue(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationValue(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationValue(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationValue(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusProblemObservation The receiving '<em><b>Functional Status Problem Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemObservationValue(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ProblemObservationValueP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(functionalStatusProblemObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PROBLEM_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PROBLEM_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_VALUE,
						ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationProblemObservationValue"),
						new Object[] { functionalStatusProblemObservation }));
			}

			return false;
		}
		return true;
	}

} // FunctionalStatusProblemObservationOperations
