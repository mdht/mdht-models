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
import org.openhealthtools.mdht.uml.cda.emspcr.ProcedureNumberOfAttemptsObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Number Of Attempts Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureNumberOfAttemptsObservation#validateProcedureNumberOfAttemptsObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Number Of Attempts Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureNumberOfAttemptsObservation#validateProcedureNumberOfAttemptsObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Number Of Attempts Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureNumberOfAttemptsObservation#validateProcedureNumberOfAttemptsObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Number Of Attempts Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureNumberOfAttemptsObservation#validateProcedureNumberOfAttemptsObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Number Of Attempts Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureNumberOfAttemptsObservation#validateProcedureNumberOfAttemptsObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Number Of Attempts Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureNumberOfAttemptsObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureNumberOfAttemptsObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNumberOfAttemptsObservationTemplateId(ProcedureNumberOfAttemptsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Number Of Attempts Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNumberOfAttemptsObservationTemplateId(ProcedureNumberOfAttemptsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.132')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNumberOfAttemptsObservationTemplateId(ProcedureNumberOfAttemptsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Number Of Attempts Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNumberOfAttemptsObservationTemplateId(ProcedureNumberOfAttemptsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNumberOfAttemptsObservation The receiving '<em><b>Procedure Number Of Attempts Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureNumberOfAttemptsObservationTemplateId(
			ProcedureNumberOfAttemptsObservation procedureNumberOfAttemptsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNumberOfAttemptsObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION__PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("ProcedureNumberOfAttemptsObservationTemplateId"),
					new Object[] { procedureNumberOfAttemptsObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNumberOfAttemptsObservationMoodCode(ProcedureNumberOfAttemptsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Number Of Attempts Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNumberOfAttemptsObservationMoodCode(ProcedureNumberOfAttemptsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNumberOfAttemptsObservationMoodCode(ProcedureNumberOfAttemptsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Number Of Attempts Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNumberOfAttemptsObservationMoodCode(ProcedureNumberOfAttemptsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNumberOfAttemptsObservation The receiving '<em><b>Procedure Number Of Attempts Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureNumberOfAttemptsObservationMoodCode(
			ProcedureNumberOfAttemptsObservation procedureNumberOfAttemptsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNumberOfAttemptsObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION__PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("ProcedureNumberOfAttemptsObservationMoodCode"),
					new Object[] { procedureNumberOfAttemptsObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNumberOfAttemptsObservationCodeP(ProcedureNumberOfAttemptsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Number Of Attempts Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNumberOfAttemptsObservationCodeP(ProcedureNumberOfAttemptsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNumberOfAttemptsObservationCodeP(ProcedureNumberOfAttemptsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Number Of Attempts Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNumberOfAttemptsObservationCodeP(ProcedureNumberOfAttemptsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNumberOfAttemptsObservation The receiving '<em><b>Procedure Number Of Attempts Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureNumberOfAttemptsObservationCodeP(
			ProcedureNumberOfAttemptsObservation procedureNumberOfAttemptsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNumberOfAttemptsObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION__PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_CODE_P,
					EmspcrPlugin.INSTANCE.getString("ProcedureNumberOfAttemptsObservationCodeP"),
					new Object[] { procedureNumberOfAttemptsObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ProcedureNumberOfAttemptsObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.emspcr.ProcedureNumberOfAttemptsObservationCodeP", passToken);
				}
				passToken.add(procedureNumberOfAttemptsObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNumberOfAttemptsObservationCode(ProcedureNumberOfAttemptsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Number Of Attempts Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNumberOfAttemptsObservationCode(ProcedureNumberOfAttemptsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67543-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNumberOfAttemptsObservationCode(ProcedureNumberOfAttemptsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Number Of Attempts Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNumberOfAttemptsObservationCode(ProcedureNumberOfAttemptsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNumberOfAttemptsObservation The receiving '<em><b>Procedure Number Of Attempts Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureNumberOfAttemptsObservationCode(
			ProcedureNumberOfAttemptsObservation procedureNumberOfAttemptsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.ProcedureNumberOfAttemptsObservationCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(procedureNumberOfAttemptsObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNumberOfAttemptsObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION__PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_CODE,
					EmspcrPlugin.INSTANCE.getString("ProcedureNumberOfAttemptsObservationCode"),
					new Object[] { procedureNumberOfAttemptsObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNumberOfAttemptsObservationValue(ProcedureNumberOfAttemptsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Number Of Attempts Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNumberOfAttemptsObservationValue(ProcedureNumberOfAttemptsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNumberOfAttemptsObservationValue(ProcedureNumberOfAttemptsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Number Of Attempts Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNumberOfAttemptsObservationValue(ProcedureNumberOfAttemptsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNumberOfAttemptsObservation The receiving '<em><b>Procedure Number Of Attempts Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureNumberOfAttemptsObservationValue(
			ProcedureNumberOfAttemptsObservation procedureNumberOfAttemptsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNumberOfAttemptsObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION__PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_VALUE,
					EmspcrPlugin.INSTANCE.getString("ProcedureNumberOfAttemptsObservationValue"),
					new Object[] { procedureNumberOfAttemptsObservation }));
			}

			return false;
		}
		return true;
	}

} // ProcedureNumberOfAttemptsObservationOperations
