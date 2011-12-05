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
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.Indication;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Acivity Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationPriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationProcedureEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Procedure Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#getProcedureEncounters() <em>Get Procedure Encounters</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#getInstructions() <em>Get Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#getIndications() <em>Get Indications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#getMedicationActivity() <em>Get Medication Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureAcivityObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureAcivityObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureAcivityObservationTemplateId(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationTemplateId(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.13')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureAcivityObservationTemplateId(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationTemplateId(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.13')
	 * @param procedureAcivityObservation The receiving '<em><b>Procedure Acivity Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureAcivityObservationTemplateId(
			ProcedureAcivityObservation procedureAcivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureAcivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACIVITY_OBSERVATION__PROCEDURE_ACIVITY_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ProcedureAcivityObservationTemplateId"),
					new Object[] { procedureAcivityObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureAcivityObservationClassCode(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationClassCode(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureAcivityObservationClassCode(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationClassCode(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('classCode')
	 * @param procedureAcivityObservation The receiving '<em><b>Procedure Acivity Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureAcivityObservationClassCode(
			ProcedureAcivityObservation procedureAcivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureAcivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACIVITY_OBSERVATION__PROCEDURE_ACIVITY_OBSERVATION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("ProcedureAcivityObservationClassCode"),
					new Object[] { procedureAcivityObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureAcivityObservationId(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationId(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureAcivityObservationId(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationId(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param procedureAcivityObservation The receiving '<em><b>Procedure Acivity Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureAcivityObservationId(
			ProcedureAcivityObservation procedureAcivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureAcivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACIVITY_OBSERVATION__PROCEDURE_ACIVITY_OBSERVATION_ID,
					ConsolPlugin.INSTANCE.getString("ProcedureAcivityObservationId"),
					new Object[] { procedureAcivityObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureAcivityObservationCode(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationCode(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureAcivityObservationCode(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationCode(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param procedureAcivityObservation The receiving '<em><b>Procedure Acivity Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureAcivityObservationCode(
			ProcedureAcivityObservation procedureAcivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureAcivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACIVITY_OBSERVATION__PROCEDURE_ACIVITY_OBSERVATION_CODE,
					ConsolPlugin.INSTANCE.getString("ProcedureAcivityObservationCode"),
					new Object[] { procedureAcivityObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureAcivityObservationStatusCode(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationStatusCode(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("
			+ "value.codeSystem = '2.16.840.1.113883.5.14' and (value.code = 'completed' or value.code = 'active' or value.code = 'aborted' or value.code = 'cancelled')))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureAcivityObservationStatusCode(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationStatusCode(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.codeSystem = '2.16.840.1.113883.5.14' and (value.code = 'completed' or value.code = 'active' or value.code = 'aborted' or value.code = 'cancelled')))
	 * @param procedureAcivityObservation The receiving '<em><b>Procedure Acivity Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureAcivityObservationStatusCode(
			ProcedureAcivityObservation procedureAcivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureAcivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACIVITY_OBSERVATION__PROCEDURE_ACIVITY_OBSERVATION_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("ProcedureAcivityObservationStatusCode"),
					new Object[] { procedureAcivityObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureAcivityObservationValue(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationValue(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureAcivityObservationValue(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationValue(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)
	 * @param procedureAcivityObservation The receiving '<em><b>Procedure Acivity Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureAcivityObservationValue(
			ProcedureAcivityObservation procedureAcivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureAcivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACIVITY_OBSERVATION__PROCEDURE_ACIVITY_OBSERVATION_VALUE,
					ConsolPlugin.INSTANCE.getString("ProcedureAcivityObservationValue"),
					new Object[] { procedureAcivityObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureAcivityObservationEffectiveTime(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationEffectiveTime(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureAcivityObservationEffectiveTime(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationEffectiveTime(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param procedureAcivityObservation The receiving '<em><b>Procedure Acivity Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureAcivityObservationEffectiveTime(
			ProcedureAcivityObservation procedureAcivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureAcivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACIVITY_OBSERVATION__PROCEDURE_ACIVITY_OBSERVATION_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("ProcedureAcivityObservationEffectiveTime"),
					new Object[] { procedureAcivityObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureAcivityObservationPriorityCode(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Priority Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationPriorityCode(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.priorityCode.oclIsUndefined() or self.priorityCode.isNullFlavorUndefined()) implies (not self.priorityCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureAcivityObservationPriorityCode(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Priority Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationPriorityCode(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.priorityCode.oclIsUndefined() or self.priorityCode.isNullFlavorUndefined()) implies (not self.priorityCode.oclIsUndefined())
	 * @param procedureAcivityObservation The receiving '<em><b>Procedure Acivity Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureAcivityObservationPriorityCode(
			ProcedureAcivityObservation procedureAcivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureAcivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACIVITY_OBSERVATION__PROCEDURE_ACIVITY_OBSERVATION_PRIORITY_CODE,
					ConsolPlugin.INSTANCE.getString("ProcedureAcivityObservationPriorityCode"),
					new Object[] { procedureAcivityObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureAcivityObservationMethodCode(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationMethodCode(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureAcivityObservationMethodCode(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationMethodCode(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())
	 * @param procedureAcivityObservation The receiving '<em><b>Procedure Acivity Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureAcivityObservationMethodCode(
			ProcedureAcivityObservation procedureAcivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureAcivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACIVITY_OBSERVATION__PROCEDURE_ACIVITY_OBSERVATION_METHOD_CODE,
					ConsolPlugin.INSTANCE.getString("ProcedureAcivityObservationMethodCode"),
					new Object[] { procedureAcivityObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureAcivityObservationTargetSiteCode(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationTargetSiteCode(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureAcivityObservationTargetSiteCode(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationTargetSiteCode(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))
	 * @param procedureAcivityObservation The receiving '<em><b>Procedure Acivity Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureAcivityObservationTargetSiteCode(
			ProcedureAcivityObservation procedureAcivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureAcivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACIVITY_OBSERVATION__PROCEDURE_ACIVITY_OBSERVATION_TARGET_SITE_CODE,
					ConsolPlugin.INSTANCE.getString("ProcedureAcivityObservationTargetSiteCode"),
					new Object[] { procedureAcivityObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureAcivityObservationProcedureEncounter(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Procedure Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationProcedureEncounter(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_PROCEDURE_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.encounter.oclIsUndefined() and entryRelationship.encounter.oclIsKindOf(cda::Encounter) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureAcivityObservationProcedureEncounter(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Procedure Encounter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationProcedureEncounter(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_PROCEDURE_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.encounter.oclIsUndefined() and entryRelationship.encounter.oclIsKindOf(cda::Encounter) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param procedureAcivityObservation The receiving '<em><b>Procedure Acivity Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureAcivityObservationProcedureEncounter(
			ProcedureAcivityObservation procedureAcivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_PROCEDURE_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_PROCEDURE_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_PROCEDURE_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_PROCEDURE_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureAcivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACIVITY_OBSERVATION__PROCEDURE_ACIVITY_OBSERVATION_PROCEDURE_ENCOUNTER,
					ConsolPlugin.INSTANCE.getString("ProcedureAcivityObservationProcedureEncounter"),
					new Object[] { procedureAcivityObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureAcivityObservationInstructions(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationInstructions(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instructions) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureAcivityObservationInstructions(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Instructions</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationInstructions(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instructions) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param procedureAcivityObservation The receiving '<em><b>Procedure Acivity Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureAcivityObservationInstructions(
			ProcedureAcivityObservation procedureAcivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureAcivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACIVITY_OBSERVATION__PROCEDURE_ACIVITY_OBSERVATION_INSTRUCTIONS,
					ConsolPlugin.INSTANCE.getString("ProcedureAcivityObservationInstructions"),
					new Object[] { procedureAcivityObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureAcivityObservationIndication(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Indication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationIndication(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureAcivityObservationIndication(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Indication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationIndication(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)
	 * @param procedureAcivityObservation The receiving '<em><b>Procedure Acivity Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureAcivityObservationIndication(
			ProcedureAcivityObservation procedureAcivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureAcivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACIVITY_OBSERVATION__PROCEDURE_ACIVITY_OBSERVATION_INDICATION,
					ConsolPlugin.INSTANCE.getString("ProcedureAcivityObservationIndication"),
					new Object[] { procedureAcivityObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureAcivityObservationMedicationActivity(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Medication Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationMedicationActivity(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(consol::MedicationActivity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureAcivityObservationMedicationActivity(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Medication Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAcivityObservationMedicationActivity(ProcedureAcivityObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(consol::MedicationActivity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param procedureAcivityObservation The receiving '<em><b>Procedure Acivity Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureAcivityObservationMedicationActivity(
			ProcedureAcivityObservation procedureAcivityObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACIVITY_OBSERVATION);
			try {
				VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureAcivityObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACIVITY_OBSERVATION__PROCEDURE_ACIVITY_OBSERVATION_MEDICATION_ACTIVITY,
					ConsolPlugin.INSTANCE.getString("ProcedureAcivityObservationMedicationActivity"),
					new Object[] { procedureAcivityObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureEncounters(ProcedureAcivityObservation) <em>Get Procedure Encounters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureEncounters(ProcedureAcivityObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_ENCOUNTERS__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(cda::Encounter)).oclAsType(cda::Encounter)";

	/**
	 * The cached OCL query for the '{@link #getProcedureEncounters(ProcedureAcivityObservation) <em>Get Procedure Encounters</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureEncounters(ProcedureAcivityObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_ENCOUNTERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(cda::Encounter)).oclAsType(cda::Encounter)
	 * @param procedureAcivityObservation The receiving '<em><b>Procedure Acivity Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Encounter> getProcedureEncounters(ProcedureAcivityObservation procedureAcivityObservation) {
		if (GET_PROCEDURE_ENCOUNTERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_ACIVITY_OBSERVATION,
				ConsolPackage.Literals.PROCEDURE_ACIVITY_OBSERVATION.getEAllOperations().get(63));
			try {
				GET_PROCEDURE_ENCOUNTERS__EOCL_QRY = helper.createQuery(GET_PROCEDURE_ENCOUNTERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_ENCOUNTERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Encounter> result = (Collection<Encounter>) query.evaluate(procedureAcivityObservation);
		return new BasicEList.UnmodifiableEList<Encounter>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getInstructions(ProcedureAcivityObservation) <em>Get Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions(ProcedureAcivityObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INSTRUCTIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instructions))->asSequence()->first().oclAsType(consol::Instructions)";

	/**
	 * The cached OCL query for the '{@link #getInstructions(ProcedureAcivityObservation) <em>Get Instructions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions(ProcedureAcivityObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INSTRUCTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instructions))->asSequence()->first().oclAsType(consol::Instructions)
	 * @param procedureAcivityObservation The receiving '<em><b>Procedure Acivity Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Instructions getInstructions(ProcedureAcivityObservation procedureAcivityObservation) {
		if (GET_INSTRUCTIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_ACIVITY_OBSERVATION,
				ConsolPackage.Literals.PROCEDURE_ACIVITY_OBSERVATION.getEAllOperations().get(64));
			try {
				GET_INSTRUCTIONS__EOCL_QRY = helper.createQuery(GET_INSTRUCTIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INSTRUCTIONS__EOCL_QRY);
		return (Instructions) query.evaluate(procedureAcivityObservation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getIndications(ProcedureAcivityObservation) <em>Get Indications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndications(ProcedureAcivityObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INDICATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication)).oclAsType(consol::Indication)";

	/**
	 * The cached OCL query for the '{@link #getIndications(ProcedureAcivityObservation) <em>Get Indications</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndications(ProcedureAcivityObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INDICATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication)).oclAsType(consol::Indication)
	 * @param procedureAcivityObservation The receiving '<em><b>Procedure Acivity Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Indication> getIndications(ProcedureAcivityObservation procedureAcivityObservation) {
		if (GET_INDICATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_ACIVITY_OBSERVATION,
				ConsolPackage.Literals.PROCEDURE_ACIVITY_OBSERVATION.getEAllOperations().get(65));
			try {
				GET_INDICATIONS__EOCL_QRY = helper.createQuery(GET_INDICATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INDICATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Indication> result = (Collection<Indication>) query.evaluate(procedureAcivityObservation);
		return new BasicEList.UnmodifiableEList<Indication>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationActivity(ProcedureAcivityObservation) <em>Get Medication Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationActivity(ProcedureAcivityObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_ACTIVITY__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity))->asSequence()->first().oclAsType(consol::MedicationActivity)";

	/**
	 * The cached OCL query for the '{@link #getMedicationActivity(ProcedureAcivityObservation) <em>Get Medication Activity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationActivity(ProcedureAcivityObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_ACTIVITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity))->asSequence()->first().oclAsType(consol::MedicationActivity)
	 * @param procedureAcivityObservation The receiving '<em><b>Procedure Acivity Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationActivity getMedicationActivity(ProcedureAcivityObservation procedureAcivityObservation) {
		if (GET_MEDICATION_ACTIVITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_ACIVITY_OBSERVATION,
				ConsolPackage.Literals.PROCEDURE_ACIVITY_OBSERVATION.getEAllOperations().get(66));
			try {
				GET_MEDICATION_ACTIVITY__EOCL_QRY = helper.createQuery(GET_MEDICATION_ACTIVITY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_ACTIVITY__EOCL_QRY);
		return (MedicationActivity) query.evaluate(procedureAcivityObservation);
	}

} // ProcedureAcivityObservationOperations
