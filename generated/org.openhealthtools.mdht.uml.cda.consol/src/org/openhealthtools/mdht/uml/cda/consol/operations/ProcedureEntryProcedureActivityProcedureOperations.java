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

import org.openhealthtools.mdht.uml.cda.consol.AgeObservation;
import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.InternalReference;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedurePriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Has Inversion Ind For Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureInternalReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Internal Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureInternalReferenceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Internal Reference Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureAgeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedurePatientInstruction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Patient Instruction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#getInternalReference() <em>Get Internal Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#getInternalReferenceReasons() <em>Get Internal Reference Reasons</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#getProblemObservation() <em>Get Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#getProblemAct() <em>Get Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#getAgeObservation() <em>Get Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#getMedicationActivities() <em>Get Medication Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#getPatientInstructions() <em>Get Patient Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureEntryProcedureActivityProcedureOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureEntryProcedureActivityProcedureOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedureMoodCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureMoodCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode = vocab::x_DocumentProcedureMood::EVN or self.moodCode = vocab::x_DocumentProcedureMood::INT";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedureMoodCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureMoodCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode = vocab::x_DocumentProcedureMood::EVN or self.moodCode = vocab::x_DocumentProcedureMood::INT
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureEntryProcedureActivityProcedureMoodCode(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedureMoodCode"),
					new Object[] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedureHasTextReference(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Has Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureHasTextReference(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.reference.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedureHasTextReference(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Has Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureHasTextReference(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.reference.oclIsUndefined()
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureEntryProcedureActivityProcedureHasTextReference(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_TEXT_REFERENCE,
					ConsolPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedureHasTextReference"),
					new Object[] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedurePriorityCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Priority Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedurePriorityCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode = vocab::x_DocumentProcedureMood::INT and self.effectiveTime.oclIsUndefined() implies not self.priorityCode.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedurePriorityCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Priority Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedurePriorityCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode = vocab::x_DocumentProcedureMood::INT and self.effectiveTime.oclIsUndefined() implies not self.priorityCode.oclIsUndefined()
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureEntryProcedureActivityProcedurePriorityCode(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PRIORITY_CODE,
					ConsolPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedurePriorityCode"),
					new Object[] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounter(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Has Inversion Ind For Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounter(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_INVERSION_IND_FOR_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er | er.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP and er.inversionInd <> true)->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounter(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Has Inversion Ind For Encounter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounter(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_INVERSION_IND_FOR_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->select(er | er.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP and er.inversionInd <> true)->isEmpty()
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounter(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_INVERSION_IND_FOR_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_INVERSION_IND_FOR_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_INVERSION_IND_FOR_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_INVERSION_IND_FOR_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_INVERSION_IND_FOR_ENCOUNTER,
					ConsolPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedureHasInversionIndForEncounter"),
					new Object[] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedureTemplateId(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureTemplateId(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.19')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedureTemplateId(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureTemplateId(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.19')
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureEntryProcedureActivityProcedureTemplateId(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedureTemplateId"),
					new Object[] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedureClassCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureClassCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedureClassCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureClassCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('classCode')
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureEntryProcedureActivityProcedureClassCode(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedureClassCode"),
					new Object[] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedureId(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureId(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedureId(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureId(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureEntryProcedureActivityProcedureId(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_ID,
					ConsolPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedureId"),
					new Object[] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedureCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedureCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureEntryProcedureActivityProcedureCode(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CODE,
					ConsolPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedureCode"),
					new Object[] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedureText(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureText(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedureText(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureText(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureEntryProcedureActivityProcedureText(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEXT,
					ConsolPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedureText"),
					new Object[] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedureEffectiveTime(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureEffectiveTime(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedureEffectiveTime(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureEffectiveTime(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureEntryProcedureActivityProcedureEffectiveTime(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedureEffectiveTime"),
					new Object[] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedureApproachSiteCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Approach Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureApproachSiteCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.approachSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedureApproachSiteCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Approach Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureApproachSiteCode(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.approachSiteCode->isEmpty())
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureEntryProcedureActivityProcedureApproachSiteCode(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_APPROACH_SITE_CODE,
					ConsolPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedureApproachSiteCode"),
					new Object[] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedureInternalReference(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Internal Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureInternalReference(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::InternalReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedureInternalReference(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Internal Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureInternalReference(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::InternalReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureEntryProcedureActivityProcedureInternalReference(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE,
					ConsolPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedureInternalReference"),
					new Object[] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedureInternalReferenceReason(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Internal Reference Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureInternalReferenceReason(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::InternalReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedureInternalReferenceReason(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Internal Reference Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureInternalReferenceReason(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::InternalReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureEntryProcedureActivityProcedureInternalReferenceReason(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE_REASON,
					ConsolPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedureInternalReferenceReason"),
					new Object[] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedureProblemObservation(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Problem Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureProblemObservation(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AllergyObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedureProblemObservation(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Problem Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureProblemObservation(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AllergyObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureEntryProcedureActivityProcedureProblemObservation(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedureProblemObservation"),
					new Object[] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedureProblemAct(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Problem Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureProblemAct(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::AllergyProblemAct) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedureProblemAct(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Problem Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureProblemAct(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::AllergyProblemAct) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureEntryProcedureActivityProcedureProblemAct(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_ACT,
					ConsolPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedureProblemAct"),
					new Object[] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedureAgeObservation(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Age Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureAgeObservation(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AgeObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedureAgeObservation(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Age Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureAgeObservation(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AgeObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureEntryProcedureActivityProcedureAgeObservation(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_AGE_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedureAgeObservation"),
					new Object[] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedureMedicationActivity(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Medication Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureMedicationActivity(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(consol::ImmunizationActivity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedureMedicationActivity(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Medication Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedureMedicationActivity(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(consol::ImmunizationActivity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureEntryProcedureActivityProcedureMedicationActivity(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_MEDICATION_ACTIVITY,
					ConsolPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedureMedicationActivity"),
					new Object[] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEntryProcedureActivityProcedurePatientInstruction(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Patient Instruction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedurePatientInstruction(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instructions))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEntryProcedureActivityProcedurePatientInstruction(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Patient Instruction</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEntryProcedureActivityProcedurePatientInstruction(ProcedureEntryProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instructions))
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureEntryProcedureActivityProcedurePatientInstruction(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureEntryProcedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PATIENT_INSTRUCTION,
					ConsolPlugin.INSTANCE.getString("ProcedureEntryProcedureActivityProcedurePatientInstruction"),
					new Object[] { procedureEntryProcedureActivityProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getInternalReference(ProcedureEntryProcedureActivityProcedure) <em>Get Internal Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalReference(ProcedureEntryProcedureActivityProcedure)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INTERNAL_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::InternalReference))->asSequence()->first().oclAsType(consol::InternalReference)";

	/**
	 * The cached OCL query for the '{@link #getInternalReference(ProcedureEntryProcedureActivityProcedure) <em>Get Internal Reference</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalReference(ProcedureEntryProcedureActivityProcedure)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INTERNAL_REFERENCE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::InternalReference))->asSequence()->first().oclAsType(consol::InternalReference)
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static InternalReference getInternalReference(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure) {
		if (GET_INTERNAL_REFERENCE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE,
				ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE.getEAllOperations().get(67));
			try {
				GET_INTERNAL_REFERENCE__EOCL_QRY = helper.createQuery(GET_INTERNAL_REFERENCE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INTERNAL_REFERENCE__EOCL_QRY);
		return (InternalReference) query.evaluate(procedureEntryProcedureActivityProcedure);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInternalReferenceReasons(ProcedureEntryProcedureActivityProcedure) <em>Get Internal Reference Reasons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalReferenceReasons(ProcedureEntryProcedureActivityProcedure)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INTERNAL_REFERENCE_REASONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::InternalReference)).oclAsType(consol::InternalReference)";

	/**
	 * The cached OCL query for the '{@link #getInternalReferenceReasons(ProcedureEntryProcedureActivityProcedure) <em>Get Internal Reference Reasons</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalReferenceReasons(ProcedureEntryProcedureActivityProcedure)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INTERNAL_REFERENCE_REASONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::InternalReference)).oclAsType(consol::InternalReference)
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<InternalReference> getInternalReferenceReasons(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure) {
		if (GET_INTERNAL_REFERENCE_REASONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE,
				ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE.getEAllOperations().get(68));
			try {
				GET_INTERNAL_REFERENCE_REASONS__EOCL_QRY = helper.createQuery(GET_INTERNAL_REFERENCE_REASONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INTERNAL_REFERENCE_REASONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<InternalReference> result = (Collection<InternalReference>) query.evaluate(procedureEntryProcedureActivityProcedure);
		return new BasicEList.UnmodifiableEList<InternalReference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemObservation(ProcedureEntryProcedureActivityProcedure) <em>Get Problem Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemObservation(ProcedureEntryProcedureActivityProcedure)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyObservation))->asSequence()->first().oclAsType(consol::AllergyObservation)";

	/**
	 * The cached OCL query for the '{@link #getProblemObservation(ProcedureEntryProcedureActivityProcedure) <em>Get Problem Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemObservation(ProcedureEntryProcedureActivityProcedure)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyObservation))->asSequence()->first().oclAsType(consol::AllergyObservation)
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AllergyObservation getProblemObservation(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure) {
		if (GET_PROBLEM_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE,
				ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE.getEAllOperations().get(69));
			try {
				GET_PROBLEM_OBSERVATION__EOCL_QRY = helper.createQuery(GET_PROBLEM_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_OBSERVATION__EOCL_QRY);
		return (AllergyObservation) query.evaluate(procedureEntryProcedureActivityProcedure);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemAct(ProcedureEntryProcedureActivityProcedure) <em>Get Problem Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemAct(ProcedureEntryProcedureActivityProcedure)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_ACT__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::AllergyProblemAct))->asSequence()->first().oclAsType(consol::AllergyProblemAct)";

	/**
	 * The cached OCL query for the '{@link #getProblemAct(ProcedureEntryProcedureActivityProcedure) <em>Get Problem Act</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemAct(ProcedureEntryProcedureActivityProcedure)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_ACT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::AllergyProblemAct))->asSequence()->first().oclAsType(consol::AllergyProblemAct)
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AllergyProblemAct getProblemAct(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure) {
		if (GET_PROBLEM_ACT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE,
				ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE.getEAllOperations().get(70));
			try {
				GET_PROBLEM_ACT__EOCL_QRY = helper.createQuery(GET_PROBLEM_ACT__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_ACT__EOCL_QRY);
		return (AllergyProblemAct) query.evaluate(procedureEntryProcedureActivityProcedure);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAgeObservation(ProcedureEntryProcedureActivityProcedure) <em>Get Age Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeObservation(ProcedureEntryProcedureActivityProcedure)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_AGE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AgeObservation))->asSequence()->first().oclAsType(consol::AgeObservation)";

	/**
	 * The cached OCL query for the '{@link #getAgeObservation(ProcedureEntryProcedureActivityProcedure) <em>Get Age Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeObservation(ProcedureEntryProcedureActivityProcedure)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_AGE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AgeObservation))->asSequence()->first().oclAsType(consol::AgeObservation)
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AgeObservation getAgeObservation(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure) {
		if (GET_AGE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE,
				ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE.getEAllOperations().get(71));
			try {
				GET_AGE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_AGE_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_AGE_OBSERVATION__EOCL_QRY);
		return (AgeObservation) query.evaluate(procedureEntryProcedureActivityProcedure);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationActivities(ProcedureEntryProcedureActivityProcedure) <em>Get Medication Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationActivities(ProcedureEntryProcedureActivityProcedure)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_ACTIVITIES__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::ImmunizationActivity)).oclAsType(consol::ImmunizationActivity)";

	/**
	 * The cached OCL query for the '{@link #getMedicationActivities(ProcedureEntryProcedureActivityProcedure) <em>Get Medication Activities</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationActivities(ProcedureEntryProcedureActivityProcedure)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_ACTIVITIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::ImmunizationActivity)).oclAsType(consol::ImmunizationActivity)
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ImmunizationActivity> getMedicationActivities(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure) {
		if (GET_MEDICATION_ACTIVITIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE,
				ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE.getEAllOperations().get(72));
			try {
				GET_MEDICATION_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_MEDICATION_ACTIVITIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ImmunizationActivity> result = (Collection<ImmunizationActivity>) query.evaluate(procedureEntryProcedureActivityProcedure);
		return new BasicEList.UnmodifiableEList<ImmunizationActivity>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPatientInstructions(ProcedureEntryProcedureActivityProcedure) <em>Get Patient Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientInstructions(ProcedureEntryProcedureActivityProcedure)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PATIENT_INSTRUCTIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instructions)).oclAsType(consol::Instructions)";

	/**
	 * The cached OCL query for the '{@link #getPatientInstructions(ProcedureEntryProcedureActivityProcedure) <em>Get Patient Instructions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientInstructions(ProcedureEntryProcedureActivityProcedure)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PATIENT_INSTRUCTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instructions)).oclAsType(consol::Instructions)
	 * @param procedureEntryProcedureActivityProcedure The receiving '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Instructions> getPatientInstructions(
			ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure) {
		if (GET_PATIENT_INSTRUCTIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE,
				ConsolPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE.getEAllOperations().get(73));
			try {
				GET_PATIENT_INSTRUCTIONS__EOCL_QRY = helper.createQuery(GET_PATIENT_INSTRUCTIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PATIENT_INSTRUCTIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Instructions> result = (Collection<Instructions>) query.evaluate(procedureEntryProcedureActivityProcedure);
		return new BasicEList.UnmodifiableEList<Instructions>(result.size(), result.toArray());
	}

} // ProcedureEntryProcedureActivityProcedureOperations
