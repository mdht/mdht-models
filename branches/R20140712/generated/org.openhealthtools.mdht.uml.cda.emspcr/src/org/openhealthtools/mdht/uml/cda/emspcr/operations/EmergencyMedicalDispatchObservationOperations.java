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

import org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Emergency Medical Dispatch Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservation#validateEmergencyMedicalDispatchObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Medical Dispatch Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservation#validateEmergencyMedicalDispatchObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Medical Dispatch Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservation#validateEmergencyMedicalDispatchObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Medical Dispatch Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservation#validateEmergencyMedicalDispatchObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Medical Dispatch Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservation#validateEmergencyMedicalDispatchObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Medical Dispatch Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservation#validateEmergencyMedicalDispatchObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Medical Dispatch Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmergencyMedicalDispatchObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmergencyMedicalDispatchObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEmergencyMedicalDispatchObservationTemplateId(EmergencyMedicalDispatchObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Medical Dispatch Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEmergencyMedicalDispatchObservationTemplateId(EmergencyMedicalDispatchObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.73')";

	/**
	 * The cached OCL invariant for the '{@link #validateEmergencyMedicalDispatchObservationTemplateId(EmergencyMedicalDispatchObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Medical Dispatch Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEmergencyMedicalDispatchObservationTemplateId(EmergencyMedicalDispatchObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emergencyMedicalDispatchObservation The receiving '<em><b>Emergency Medical Dispatch Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEmergencyMedicalDispatchObservationTemplateId(
			EmergencyMedicalDispatchObservation emergencyMedicalDispatchObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMERGENCY_MEDICAL_DISPATCH_OBSERVATION);
			try {
				VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emergencyMedicalDispatchObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("EmergencyMedicalDispatchObservationTemplateId"),
					new Object[] { emergencyMedicalDispatchObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEmergencyMedicalDispatchObservationMoodCode(EmergencyMedicalDispatchObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Medical Dispatch Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEmergencyMedicalDispatchObservationMoodCode(EmergencyMedicalDispatchObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateEmergencyMedicalDispatchObservationMoodCode(EmergencyMedicalDispatchObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Medical Dispatch Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEmergencyMedicalDispatchObservationMoodCode(EmergencyMedicalDispatchObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emergencyMedicalDispatchObservation The receiving '<em><b>Emergency Medical Dispatch Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEmergencyMedicalDispatchObservationMoodCode(
			EmergencyMedicalDispatchObservation emergencyMedicalDispatchObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMERGENCY_MEDICAL_DISPATCH_OBSERVATION);
			try {
				VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emergencyMedicalDispatchObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("EmergencyMedicalDispatchObservationMoodCode"),
					new Object[] { emergencyMedicalDispatchObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEmergencyMedicalDispatchObservationCodeP(EmergencyMedicalDispatchObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Medical Dispatch Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEmergencyMedicalDispatchObservationCodeP(EmergencyMedicalDispatchObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEmergencyMedicalDispatchObservationCodeP(EmergencyMedicalDispatchObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Medical Dispatch Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEmergencyMedicalDispatchObservationCodeP(EmergencyMedicalDispatchObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emergencyMedicalDispatchObservation The receiving '<em><b>Emergency Medical Dispatch Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEmergencyMedicalDispatchObservationCodeP(
			EmergencyMedicalDispatchObservation emergencyMedicalDispatchObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMERGENCY_MEDICAL_DISPATCH_OBSERVATION);
			try {
				VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emergencyMedicalDispatchObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_CODE_P,
					EmspcrPlugin.INSTANCE.getString("EmergencyMedicalDispatchObservationCodeP"),
					new Object[] { emergencyMedicalDispatchObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservationCodeP", passToken);
				}
				passToken.add(emergencyMedicalDispatchObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEmergencyMedicalDispatchObservationCode(EmergencyMedicalDispatchObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Medical Dispatch Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEmergencyMedicalDispatchObservationCode(EmergencyMedicalDispatchObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67488-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEmergencyMedicalDispatchObservationCode(EmergencyMedicalDispatchObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Medical Dispatch Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEmergencyMedicalDispatchObservationCode(EmergencyMedicalDispatchObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emergencyMedicalDispatchObservation The receiving '<em><b>Emergency Medical Dispatch Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEmergencyMedicalDispatchObservationCode(
			EmergencyMedicalDispatchObservation emergencyMedicalDispatchObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservationCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(emergencyMedicalDispatchObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMERGENCY_MEDICAL_DISPATCH_OBSERVATION);
			try {
				VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emergencyMedicalDispatchObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_CODE,
					EmspcrPlugin.INSTANCE.getString("EmergencyMedicalDispatchObservationCode"),
					new Object[] { emergencyMedicalDispatchObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEmergencyMedicalDispatchObservationValue(EmergencyMedicalDispatchObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Medical Dispatch Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEmergencyMedicalDispatchObservationValue(EmergencyMedicalDispatchObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17151-4' or value.code = 'LA17152-2' or value.code = 'LA17153-0' or value.code = 'LA32-8')))";

	/**
	 * The cached OCL invariant for the '{@link #validateEmergencyMedicalDispatchObservationValue(EmergencyMedicalDispatchObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Medical Dispatch Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEmergencyMedicalDispatchObservationValue(EmergencyMedicalDispatchObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emergencyMedicalDispatchObservation The receiving '<em><b>Emergency Medical Dispatch Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEmergencyMedicalDispatchObservationValue(
			EmergencyMedicalDispatchObservation emergencyMedicalDispatchObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMERGENCY_MEDICAL_DISPATCH_OBSERVATION);
			try {
				VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emergencyMedicalDispatchObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_VALUE,
					EmspcrPlugin.INSTANCE.getString("EmergencyMedicalDispatchObservationValue"),
					new Object[] { emergencyMedicalDispatchObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEmergencyMedicalDispatchObservationValueP(EmergencyMedicalDispatchObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Medical Dispatch Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEmergencyMedicalDispatchObservationValueP(EmergencyMedicalDispatchObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateEmergencyMedicalDispatchObservationValueP(EmergencyMedicalDispatchObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Medical Dispatch Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEmergencyMedicalDispatchObservationValueP(EmergencyMedicalDispatchObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emergencyMedicalDispatchObservation The receiving '<em><b>Emergency Medical Dispatch Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEmergencyMedicalDispatchObservationValueP(
			EmergencyMedicalDispatchObservation emergencyMedicalDispatchObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMERGENCY_MEDICAL_DISPATCH_OBSERVATION);
			try {
				VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emergencyMedicalDispatchObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__EMERGENCY_MEDICAL_DISPATCH_OBSERVATION_VALUE_P,
					EmspcrPlugin.INSTANCE.getString("EmergencyMedicalDispatchObservationValueP"),
					new Object[] { emergencyMedicalDispatchObservation }));
			}

			return false;
		}
		return true;
	}

} // EmergencyMedicalDispatchObservationOperations
