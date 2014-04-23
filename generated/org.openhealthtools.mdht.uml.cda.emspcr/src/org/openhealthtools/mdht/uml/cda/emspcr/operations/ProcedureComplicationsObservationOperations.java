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
import org.openhealthtools.mdht.uml.cda.emspcr.ProcedureComplicationsObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Complications Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureComplicationsObservation#validateProcedureComplicationsObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Complications Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureComplicationsObservation#validateProcedureComplicationsObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Complications Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureComplicationsObservation#validateProcedureComplicationsObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Complications Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureComplicationsObservation#validateProcedureComplicationsObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Complications Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureComplicationsObservation#validateProcedureComplicationsObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Complications Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureComplicationsObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureComplicationsObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureComplicationsObservationTemplateId(ProcedureComplicationsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Complications Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureComplicationsObservationTemplateId(ProcedureComplicationsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.179')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureComplicationsObservationTemplateId(ProcedureComplicationsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Complications Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureComplicationsObservationTemplateId(ProcedureComplicationsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureComplicationsObservation The receiving '<em><b>Procedure Complications Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureComplicationsObservationTemplateId(
			ProcedureComplicationsObservation procedureComplicationsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE_COMPLICATIONS_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureComplicationsObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE_COMPLICATIONS_OBSERVATION__PROCEDURE_COMPLICATIONS_OBSERVATION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("ProcedureComplicationsObservationTemplateId"),
					new Object[] { procedureComplicationsObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureComplicationsObservationMoodCode(ProcedureComplicationsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Complications Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureComplicationsObservationMoodCode(ProcedureComplicationsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureComplicationsObservationMoodCode(ProcedureComplicationsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Complications Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureComplicationsObservationMoodCode(ProcedureComplicationsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureComplicationsObservation The receiving '<em><b>Procedure Complications Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureComplicationsObservationMoodCode(
			ProcedureComplicationsObservation procedureComplicationsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE_COMPLICATIONS_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureComplicationsObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE_COMPLICATIONS_OBSERVATION__PROCEDURE_COMPLICATIONS_OBSERVATION_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("ProcedureComplicationsObservationMoodCode"),
					new Object[] { procedureComplicationsObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureComplicationsObservationCodeP(ProcedureComplicationsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Complications Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureComplicationsObservationCodeP(ProcedureComplicationsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureComplicationsObservationCodeP(ProcedureComplicationsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Complications Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureComplicationsObservationCodeP(ProcedureComplicationsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureComplicationsObservation The receiving '<em><b>Procedure Complications Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureComplicationsObservationCodeP(
			ProcedureComplicationsObservation procedureComplicationsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE_COMPLICATIONS_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureComplicationsObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE_COMPLICATIONS_OBSERVATION__PROCEDURE_COMPLICATIONS_OBSERVATION_CODE_P,
					EmspcrPlugin.INSTANCE.getString("ProcedureComplicationsObservationCodeP"),
					new Object[] { procedureComplicationsObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ProcedureComplicationsObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.emspcr.ProcedureComplicationsObservationCodeP", passToken);
				}
				passToken.add(procedureComplicationsObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureComplicationsObservationCode(ProcedureComplicationsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Complications Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureComplicationsObservationCode(ProcedureComplicationsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67545-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureComplicationsObservationCode(ProcedureComplicationsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Complications Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureComplicationsObservationCode(ProcedureComplicationsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureComplicationsObservation The receiving '<em><b>Procedure Complications Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureComplicationsObservationCode(
			ProcedureComplicationsObservation procedureComplicationsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.ProcedureComplicationsObservationCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(procedureComplicationsObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE_COMPLICATIONS_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureComplicationsObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE_COMPLICATIONS_OBSERVATION__PROCEDURE_COMPLICATIONS_OBSERVATION_CODE,
					EmspcrPlugin.INSTANCE.getString("ProcedureComplicationsObservationCode"),
					new Object[] { procedureComplicationsObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureComplicationsObservationValue(ProcedureComplicationsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Complications Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureComplicationsObservationValue(ProcedureComplicationsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA137-2' or value.code = 'LA15098-9' or value.code = 'LA15099-7' or value.code = 'LA15424-7' or value.code = 'LA17059-9' or value.code = 'LA17392-4' or value.code = 'LA17393-2' or value.code = 'LA17394-0' or value.code = 'LA17396-5' or value.code = 'TMP-LA17397-3a' or value.code = 'LA17489-8' or value.code = 'LA17490-6' or value.code = 'LA17713-1' or value.code = 'LA17714-9' or value.code = 'LA18267-7' or value.code = 'LA18268-5' or value.code = 'LA7418-2' or value.code = 'LA7434-9' or value.code = 'LA7443-0' or value.code = 'LA7444-8' or value.code = 'LA9540-1' or value.code = 'LA9541-9' or value.code = 'LA9548-4' or value.code = 'TMP-LA17397-3b')))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureComplicationsObservationValue(ProcedureComplicationsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Complications Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureComplicationsObservationValue(ProcedureComplicationsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureComplicationsObservation The receiving '<em><b>Procedure Complications Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureComplicationsObservationValue(
			ProcedureComplicationsObservation procedureComplicationsObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE_COMPLICATIONS_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureComplicationsObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROCEDURE_COMPLICATIONS_OBSERVATION__PROCEDURE_COMPLICATIONS_OBSERVATION_VALUE,
					EmspcrPlugin.INSTANCE.getString("ProcedureComplicationsObservationValue"),
					new Object[] { procedureComplicationsObservation }));
			}

			return false;
		}
		return true;
	}

} // ProcedureComplicationsObservationOperations
