/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionChangeAtDestinationObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Condition Change At Destination Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionChangeAtDestinationObservation#validatePatientConditionChangeAtDestinationObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Change At Destination Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionChangeAtDestinationObservation#validatePatientConditionChangeAtDestinationObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Change At Destination Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionChangeAtDestinationObservation#validatePatientConditionChangeAtDestinationObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Change At Destination Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionChangeAtDestinationObservation#validatePatientConditionChangeAtDestinationObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Change At Destination Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionChangeAtDestinationObservation#validatePatientConditionChangeAtDestinationObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Change At Destination Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionChangeAtDestinationObservation#validatePatientConditionChangeAtDestinationObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Change At Destination Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientConditionChangeAtDestinationObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientConditionChangeAtDestinationObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientConditionChangeAtDestinationObservationTemplateId(PatientConditionChangeAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Change At Destination Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionChangeAtDestinationObservationTemplateId(PatientConditionChangeAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.37')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientConditionChangeAtDestinationObservationTemplateId(PatientConditionChangeAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Change At Destination Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionChangeAtDestinationObservationTemplateId(PatientConditionChangeAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientConditionChangeAtDestinationObservation The receiving '<em><b>Patient Condition Change At Destination Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientConditionChangeAtDestinationObservationTemplateId(
			PatientConditionChangeAtDestinationObservation patientConditionChangeAtDestinationObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION);
			try {
				VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientConditionChangeAtDestinationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("PatientConditionChangeAtDestinationObservationTemplateId"),
					new Object[] { patientConditionChangeAtDestinationObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientConditionChangeAtDestinationObservationCodeP(PatientConditionChangeAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Change At Destination Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionChangeAtDestinationObservationCodeP(PatientConditionChangeAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientConditionChangeAtDestinationObservationCodeP(PatientConditionChangeAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Change At Destination Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionChangeAtDestinationObservationCodeP(PatientConditionChangeAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientConditionChangeAtDestinationObservation The receiving '<em><b>Patient Condition Change At Destination Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientConditionChangeAtDestinationObservationCodeP(
			PatientConditionChangeAtDestinationObservation patientConditionChangeAtDestinationObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION);
			try {
				VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientConditionChangeAtDestinationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_CODE_P,
					EmspcrPlugin.INSTANCE.getString("PatientConditionChangeAtDestinationObservationCodeP"),
					new Object[] { patientConditionChangeAtDestinationObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionChangeAtDestinationObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionChangeAtDestinationObservationCodeP",
						passToken);
				}
				passToken.add(patientConditionChangeAtDestinationObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientConditionChangeAtDestinationObservationCode(PatientConditionChangeAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Change At Destination Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionChangeAtDestinationObservationCode(PatientConditionChangeAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67551-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientConditionChangeAtDestinationObservationCode(PatientConditionChangeAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Change At Destination Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionChangeAtDestinationObservationCode(PatientConditionChangeAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientConditionChangeAtDestinationObservation The receiving '<em><b>Patient Condition Change At Destination Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientConditionChangeAtDestinationObservationCode(
			PatientConditionChangeAtDestinationObservation patientConditionChangeAtDestinationObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionChangeAtDestinationObservationCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(patientConditionChangeAtDestinationObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION);
			try {
				VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientConditionChangeAtDestinationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_CODE,
					EmspcrPlugin.INSTANCE.getString("PatientConditionChangeAtDestinationObservationCode"),
					new Object[] { patientConditionChangeAtDestinationObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientConditionChangeAtDestinationObservationValue(PatientConditionChangeAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Change At Destination Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionChangeAtDestinationObservationValue(PatientConditionChangeAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA11011-6' or value.code = 'LA17181-1' or value.code = 'LA65-8')))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientConditionChangeAtDestinationObservationValue(PatientConditionChangeAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Change At Destination Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionChangeAtDestinationObservationValue(PatientConditionChangeAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientConditionChangeAtDestinationObservation The receiving '<em><b>Patient Condition Change At Destination Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientConditionChangeAtDestinationObservationValue(
			PatientConditionChangeAtDestinationObservation patientConditionChangeAtDestinationObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION);
			try {
				VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientConditionChangeAtDestinationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_VALUE,
					EmspcrPlugin.INSTANCE.getString("PatientConditionChangeAtDestinationObservationValue"),
					new Object[] { patientConditionChangeAtDestinationObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientConditionChangeAtDestinationObservationValueP(PatientConditionChangeAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Change At Destination Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionChangeAtDestinationObservationValueP(PatientConditionChangeAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientConditionChangeAtDestinationObservationValueP(PatientConditionChangeAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Change At Destination Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionChangeAtDestinationObservationValueP(PatientConditionChangeAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientConditionChangeAtDestinationObservation The receiving '<em><b>Patient Condition Change At Destination Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientConditionChangeAtDestinationObservationValueP(
			PatientConditionChangeAtDestinationObservation patientConditionChangeAtDestinationObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION);
			try {
				VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientConditionChangeAtDestinationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_VALUE_P,
					EmspcrPlugin.INSTANCE.getString("PatientConditionChangeAtDestinationObservationValueP"),
					new Object[] { patientConditionChangeAtDestinationObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientConditionChangeAtDestinationObservationMoodCode(PatientConditionChangeAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Change At Destination Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionChangeAtDestinationObservationMoodCode(PatientConditionChangeAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientConditionChangeAtDestinationObservationMoodCode(PatientConditionChangeAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Change At Destination Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionChangeAtDestinationObservationMoodCode(PatientConditionChangeAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientConditionChangeAtDestinationObservation The receiving '<em><b>Patient Condition Change At Destination Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientConditionChangeAtDestinationObservationMoodCode(
			PatientConditionChangeAtDestinationObservation patientConditionChangeAtDestinationObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION);
			try {
				VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientConditionChangeAtDestinationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("PatientConditionChangeAtDestinationObservationMoodCode"),
					new Object[] { patientConditionChangeAtDestinationObservation }));
			}

			return false;
		}
		return true;
	}

} // PatientConditionChangeAtDestinationObservationOperations
