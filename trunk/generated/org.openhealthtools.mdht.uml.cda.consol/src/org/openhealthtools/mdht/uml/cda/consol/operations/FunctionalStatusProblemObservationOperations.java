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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationHasTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Has Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationHasOnsetDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Has Onset Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationHasResolutionDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Has Resolution Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationValueNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Value Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationNonMedicinalSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Non Medicinal Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationCaregiverCharacteristics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Caregiver Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#getNonMedicinalSupplyActivities() <em>Get Non Medicinal Supply Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#getCaregiverCharacteristicss() <em>Get Caregiver Characteristicss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
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
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusProblemObservationHasTextReference(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Has Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationHasTextReference(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined() implies self.text->forAll(reference->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusProblemObservationHasTextReference(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Has Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationHasTextReference(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateFunctionalStatusProblemObservationHasTextReference(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE,
						 ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationHasTextReference"),
						 new Object [] { functionalStatusProblemObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusProblemObservationTextReferenceValue(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationTextReferenceValue(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.text->forAll(reference->size() = 1) implies self.text->forAll(reference->one(value->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusProblemObservationTextReferenceValue(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationTextReferenceValue(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateFunctionalStatusProblemObservationTextReferenceValue(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_TEXT_REFERENCE_VALUE,
						 ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationTextReferenceValue"),
						 new Object [] { functionalStatusProblemObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusProblemObservationHasTextReferenceValue(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Has Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationHasTextReferenceValue(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.reference.value.oclIsUndefined() implies not self.getSection().text.getText(self.text.reference.value.substring(2, self.text.reference.value.size())).oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusProblemObservationHasTextReferenceValue(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Has Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationHasTextReferenceValue(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateFunctionalStatusProblemObservationHasTextReferenceValue(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE_VALUE,
						 ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationHasTextReferenceValue"),
						 new Object [] { functionalStatusProblemObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusProblemObservationHasOnsetDate(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Has Onset Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationHasOnsetDate(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.low.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusProblemObservationHasOnsetDate(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Has Onset Date</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationHasOnsetDate(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateFunctionalStatusProblemObservationHasOnsetDate(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_ONSET_DATE,
						 ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationHasOnsetDate"),
						 new Object [] { functionalStatusProblemObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusProblemObservationHasResolutionDate(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Has Resolution Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationHasResolutionDate(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.high.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusProblemObservationHasResolutionDate(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Has Resolution Date</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationHasResolutionDate(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateFunctionalStatusProblemObservationHasResolutionDate(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_RESOLUTION_DATE,
						 ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationHasResolutionDate"),
						 new Object [] { functionalStatusProblemObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusProblemObservationValueNullFlavor(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Value Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationValueNullFlavor(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->forAll(val | not val.isNullFlavorUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusProblemObservationValueNullFlavor(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Value Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationValueNullFlavor(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateFunctionalStatusProblemObservationValueNullFlavor(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_VALUE_NULL_FLAVOR,
						 ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationValueNullFlavor"),
						 new Object [] { functionalStatusProblemObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusProblemObservationClassCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationClassCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusProblemObservationClassCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationClassCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateFunctionalStatusProblemObservationClassCode(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationClassCode"),
						 new Object [] { functionalStatusProblemObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusProblemObservationMoodCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationMoodCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusProblemObservationMoodCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationMoodCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateFunctionalStatusProblemObservationMoodCode(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationMoodCode"),
						 new Object [] { functionalStatusProblemObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusProblemObservationNegationInd(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Negation Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationNegationInd(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusProblemObservationNegationInd(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Negation Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationNegationInd(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateFunctionalStatusProblemObservationNegationInd(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_NEGATION_IND,
						 ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationNegationInd"),
						 new Object [] { functionalStatusProblemObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusProblemObservationId(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationId(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusProblemObservationId(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationId(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateFunctionalStatusProblemObservationId(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_ID,
						 ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationId"),
						 new Object [] { functionalStatusProblemObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusProblemObservationCodeP(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationCodeP(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusProblemObservationCodeP(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationCodeP(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateFunctionalStatusProblemObservationCodeP(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationCodeP"),
						 new Object [] { functionalStatusProblemObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservationCodeP", passToken);
				}
				passToken.add(functionalStatusProblemObservation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusProblemObservationCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '248536006' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusProblemObservationCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateFunctionalStatusProblemObservationCode(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(functionalStatusProblemObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CODE,
						 ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationCode"),
						 new Object [] { functionalStatusProblemObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusProblemObservationText(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationText(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusProblemObservationText(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationText(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateFunctionalStatusProblemObservationText(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_TEXT,
						 ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationText"),
						 new Object [] { functionalStatusProblemObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusProblemObservationStatusCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationStatusCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusProblemObservationStatusCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationStatusCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateFunctionalStatusProblemObservationStatusCode(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationStatusCode"),
						 new Object [] { functionalStatusProblemObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusProblemObservationEffectiveTime(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationEffectiveTime(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusProblemObservationEffectiveTime(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationEffectiveTime(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateFunctionalStatusProblemObservationEffectiveTime(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationEffectiveTime"),
						 new Object [] { functionalStatusProblemObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusProblemObservationValueP(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationValueP(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusProblemObservationValueP(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationValueP(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateFunctionalStatusProblemObservationValueP(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_VALUE_P,
						 ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationValueP"),
						 new Object [] { functionalStatusProblemObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservationValueP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservationValueP", passToken);
				}
				passToken.add(functionalStatusProblemObservation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusProblemObservationValue(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationValue(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusProblemObservationValue(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationValue(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateFunctionalStatusProblemObservationValue(
			FunctionalStatusProblemObservation functionalStatusProblemObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservationValueP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(functionalStatusProblemObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_VALUE,
						 ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationValue"),
						 new Object [] { functionalStatusProblemObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusProblemObservationMethodCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusProblemObservationMethodCode(FunctionalStatusProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

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
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_METHOD_CODE,
						 ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationMethodCode"),
						 new Object [] { functionalStatusProblemObservation }));
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
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY,
						 ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationNonMedicinalSupplyActivity"),
						 new Object [] { functionalStatusProblemObservation }));
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
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CAREGIVER_CHARACTERISTICS,
						 ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationCaregiverCharacteristics"),
						 new Object [] { functionalStatusProblemObservation }));
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
				VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION,
						 ConsolPlugin.INSTANCE.getString("FunctionalStatusProblemObservationAssessmentScaleObservation"),
						 new Object [] { functionalStatusProblemObservation }));
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
			helper.setOperationContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION, ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION.getEAllOperations().get(99));
			try {
				GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NonMedicinalSupplyActivity> result = (Collection<NonMedicinalSupplyActivity>) query.evaluate(functionalStatusProblemObservation);
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
			helper.setOperationContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION, ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION.getEAllOperations().get(100));
			try {
				GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY = helper.createQuery(GET_CAREGIVER_CHARACTERISTICSS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CaregiverCharacteristics> result = (Collection<CaregiverCharacteristics>) query.evaluate(functionalStatusProblemObservation);
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
			helper.setOperationContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION, ConsolPackage.Literals.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION.getEAllOperations().get(101));
			try {
				GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AssessmentScaleObservation> result = (Collection<AssessmentScaleObservation>) query.evaluate(functionalStatusProblemObservation);
		return new BasicEList.UnmodifiableEList<AssessmentScaleObservation>(result.size(), result.toArray());
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
				VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(functionalStatusProblemObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProblemObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(functionalStatusProblemObservation, context) }),
						 new Object [] { functionalStatusProblemObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // FunctionalStatusProblemObservationOperations
