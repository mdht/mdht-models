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
import org.openhealthtools.mdht.uml.cda.emspcr.PatientArrivedAtDestinationTime;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Arrived At Destination Time</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientArrivedAtDestinationTime#validatePatientArrivedAtDestinationTimeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Arrived At Destination Time Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientArrivedAtDestinationTime#validatePatientArrivedAtDestinationTimeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Arrived At Destination Time Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientArrivedAtDestinationTime#validatePatientArrivedAtDestinationTimeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Arrived At Destination Time Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientArrivedAtDestinationTime#validatePatientArrivedAtDestinationTimeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Arrived At Destination Time Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientArrivedAtDestinationTime#validatePatientArrivedAtDestinationTimeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Arrived At Destination Time Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientArrivedAtDestinationTimeOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientArrivedAtDestinationTimeOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientArrivedAtDestinationTimeTemplateId(PatientArrivedAtDestinationTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Arrived At Destination Time Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientArrivedAtDestinationTimeTemplateId(PatientArrivedAtDestinationTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.44')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientArrivedAtDestinationTimeTemplateId(PatientArrivedAtDestinationTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Arrived At Destination Time Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientArrivedAtDestinationTimeTemplateId(PatientArrivedAtDestinationTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientArrivedAtDestinationTime The receiving '<em><b>Patient Arrived At Destination Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientArrivedAtDestinationTimeTemplateId(
			PatientArrivedAtDestinationTime patientArrivedAtDestinationTime, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_ARRIVED_AT_DESTINATION_TIME);
			try {
				VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientArrivedAtDestinationTime)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_ARRIVED_AT_DESTINATION_TIME__PATIENT_ARRIVED_AT_DESTINATION_TIME_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("PatientArrivedAtDestinationTimeTemplateId"),
					new Object[] { patientArrivedAtDestinationTime }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientArrivedAtDestinationTimeMoodCode(PatientArrivedAtDestinationTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Arrived At Destination Time Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientArrivedAtDestinationTimeMoodCode(PatientArrivedAtDestinationTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientArrivedAtDestinationTimeMoodCode(PatientArrivedAtDestinationTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Arrived At Destination Time Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientArrivedAtDestinationTimeMoodCode(PatientArrivedAtDestinationTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientArrivedAtDestinationTime The receiving '<em><b>Patient Arrived At Destination Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientArrivedAtDestinationTimeMoodCode(
			PatientArrivedAtDestinationTime patientArrivedAtDestinationTime, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_ARRIVED_AT_DESTINATION_TIME);
			try {
				VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientArrivedAtDestinationTime)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_ARRIVED_AT_DESTINATION_TIME__PATIENT_ARRIVED_AT_DESTINATION_TIME_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("PatientArrivedAtDestinationTimeMoodCode"),
					new Object[] { patientArrivedAtDestinationTime }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientArrivedAtDestinationTimeCodeP(PatientArrivedAtDestinationTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Arrived At Destination Time Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientArrivedAtDestinationTimeCodeP(PatientArrivedAtDestinationTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientArrivedAtDestinationTimeCodeP(PatientArrivedAtDestinationTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Arrived At Destination Time Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientArrivedAtDestinationTimeCodeP(PatientArrivedAtDestinationTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientArrivedAtDestinationTime The receiving '<em><b>Patient Arrived At Destination Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientArrivedAtDestinationTimeCodeP(
			PatientArrivedAtDestinationTime patientArrivedAtDestinationTime, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_ARRIVED_AT_DESTINATION_TIME);
			try {
				VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientArrivedAtDestinationTime)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_ARRIVED_AT_DESTINATION_TIME__PATIENT_ARRIVED_AT_DESTINATION_TIME_CODE_P,
					EmspcrPlugin.INSTANCE.getString("PatientArrivedAtDestinationTimeCodeP"),
					new Object[] { patientArrivedAtDestinationTime }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.PatientArrivedAtDestinationTimeCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.emspcr.PatientArrivedAtDestinationTimeCodeP", passToken);
				}
				passToken.add(patientArrivedAtDestinationTime);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientArrivedAtDestinationTimeCode(PatientArrivedAtDestinationTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Arrived At Destination Time Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientArrivedAtDestinationTimeCode(PatientArrivedAtDestinationTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '69476-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientArrivedAtDestinationTimeCode(PatientArrivedAtDestinationTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Arrived At Destination Time Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientArrivedAtDestinationTimeCode(PatientArrivedAtDestinationTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientArrivedAtDestinationTime The receiving '<em><b>Patient Arrived At Destination Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientArrivedAtDestinationTimeCode(
			PatientArrivedAtDestinationTime patientArrivedAtDestinationTime, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.PatientArrivedAtDestinationTimeCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(patientArrivedAtDestinationTime)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_ARRIVED_AT_DESTINATION_TIME);
			try {
				VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientArrivedAtDestinationTime)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_ARRIVED_AT_DESTINATION_TIME__PATIENT_ARRIVED_AT_DESTINATION_TIME_CODE,
					EmspcrPlugin.INSTANCE.getString("PatientArrivedAtDestinationTimeCode"),
					new Object[] { patientArrivedAtDestinationTime }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientArrivedAtDestinationTimeValue(PatientArrivedAtDestinationTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Arrived At Destination Time Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientArrivedAtDestinationTimeValue(PatientArrivedAtDestinationTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::TS)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientArrivedAtDestinationTimeValue(PatientArrivedAtDestinationTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Arrived At Destination Time Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientArrivedAtDestinationTimeValue(PatientArrivedAtDestinationTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientArrivedAtDestinationTime The receiving '<em><b>Patient Arrived At Destination Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientArrivedAtDestinationTimeValue(
			PatientArrivedAtDestinationTime patientArrivedAtDestinationTime, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_ARRIVED_AT_DESTINATION_TIME);
			try {
				VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientArrivedAtDestinationTime)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PATIENT_ARRIVED_AT_DESTINATION_TIME__PATIENT_ARRIVED_AT_DESTINATION_TIME_VALUE,
					EmspcrPlugin.INSTANCE.getString("PatientArrivedAtDestinationTimeValue"),
					new Object[] { patientArrivedAtDestinationTime }));
			}

			return false;
		}
		return true;
	}

} // PatientArrivedAtDestinationTimeOperations
