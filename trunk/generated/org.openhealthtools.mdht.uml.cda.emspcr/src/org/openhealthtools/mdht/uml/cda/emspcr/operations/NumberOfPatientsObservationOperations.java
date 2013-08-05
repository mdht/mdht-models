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
import org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Number Of Patients Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsObservation#validateNumberOfPatientsObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsObservation#validateNumberOfPatientsObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsObservation#validateNumberOfPatientsObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsObservation#validateNumberOfPatientsObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsObservation#validateNumberOfPatientsObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberOfPatientsObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberOfPatientsObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPatientsObservationTemplateId(NumberOfPatientsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPatientsObservationTemplateId(NumberOfPatientsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.31')";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPatientsObservationTemplateId(NumberOfPatientsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPatientsObservationTemplateId(NumberOfPatientsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPatientsObservation The receiving '<em><b>Number Of Patients Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberOfPatientsObservationTemplateId(
			NumberOfPatientsObservation numberOfPatientsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NUMBER_OF_PATIENTS_OBSERVATION);
			try {
				VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			numberOfPatientsObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.NUMBER_OF_PATIENTS_OBSERVATION__NUMBER_OF_PATIENTS_OBSERVATION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("NumberOfPatientsObservationTemplateId"),
					new Object[] { numberOfPatientsObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPatientsObservationCodeP(NumberOfPatientsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPatientsObservationCodeP(NumberOfPatientsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPatientsObservationCodeP(NumberOfPatientsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPatientsObservationCodeP(NumberOfPatientsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPatientsObservation The receiving '<em><b>Number Of Patients Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberOfPatientsObservationCodeP(
			NumberOfPatientsObservation numberOfPatientsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NUMBER_OF_PATIENTS_OBSERVATION);
			try {
				VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			numberOfPatientsObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.NUMBER_OF_PATIENTS_OBSERVATION__NUMBER_OF_PATIENTS_OBSERVATION_CODE_P,
					EmspcrPlugin.INSTANCE.getString("NumberOfPatientsObservationCodeP"),
					new Object[] { numberOfPatientsObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsObservationCodeP", passToken);
				}
				passToken.add(numberOfPatientsObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPatientsObservationCode(NumberOfPatientsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPatientsObservationCode(NumberOfPatientsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67547-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPatientsObservationCode(NumberOfPatientsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPatientsObservationCode(NumberOfPatientsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPatientsObservation The receiving '<em><b>Number Of Patients Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberOfPatientsObservationCode(
			NumberOfPatientsObservation numberOfPatientsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(numberOfPatientsObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NUMBER_OF_PATIENTS_OBSERVATION);
			try {
				VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			numberOfPatientsObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.NUMBER_OF_PATIENTS_OBSERVATION__NUMBER_OF_PATIENTS_OBSERVATION_CODE,
					EmspcrPlugin.INSTANCE.getString("NumberOfPatientsObservationCode"),
					new Object[] { numberOfPatientsObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPatientsObservationValue(NumberOfPatientsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPatientsObservationValue(NumberOfPatientsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPatientsObservationValue(NumberOfPatientsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPatientsObservationValue(NumberOfPatientsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPatientsObservation The receiving '<em><b>Number Of Patients Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberOfPatientsObservationValue(
			NumberOfPatientsObservation numberOfPatientsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NUMBER_OF_PATIENTS_OBSERVATION);
			try {
				VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			numberOfPatientsObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.NUMBER_OF_PATIENTS_OBSERVATION__NUMBER_OF_PATIENTS_OBSERVATION_VALUE,
					EmspcrPlugin.INSTANCE.getString("NumberOfPatientsObservationValue"),
					new Object[] { numberOfPatientsObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNumberOfPatientsObservationMoodCode(NumberOfPatientsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPatientsObservationMoodCode(NumberOfPatientsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateNumberOfPatientsObservationMoodCode(NumberOfPatientsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNumberOfPatientsObservationMoodCode(NumberOfPatientsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param numberOfPatientsObservation The receiving '<em><b>Number Of Patients Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNumberOfPatientsObservationMoodCode(
			NumberOfPatientsObservation numberOfPatientsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NUMBER_OF_PATIENTS_OBSERVATION);
			try {
				VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			numberOfPatientsObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.NUMBER_OF_PATIENTS_OBSERVATION__NUMBER_OF_PATIENTS_OBSERVATION_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("NumberOfPatientsObservationMoodCode"),
					new Object[] { numberOfPatientsObservation }));
			}

			return false;
		}
		return true;
	}

} // NumberOfPatientsObservationOperations
