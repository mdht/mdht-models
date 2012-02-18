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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct;

import org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActCodeCodeSystems(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Code Code Systems</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEncounterInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Encounter Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActServiceDeliveryLocationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Service Delivery Location Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActInstructionsInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Instructions Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActPriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActServiceDeliveryLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Service Delivery Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActProcedureEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#getServiceDeliveryLocations() <em>Get Service Delivery Locations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#getProcedureEncounters() <em>Get Procedure Encounters</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#getInstructions() <em>Get Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#getIndications() <em>Get Indications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#getMedicationActivity() <em>Get Medication Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureActivityActOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureActivityActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityActCodeCodeSystems(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Code Code Systems</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActCodeCodeSystems(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.codeSystem = '2.16.840.1.113883.6.1' xor self.code.codeSystem = '2.16.840.1.113883.6.96'";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityActCodeCodeSystems(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Code Code Systems</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActCodeCodeSystems(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.code.codeSystem = '2.16.840.1.113883.6.1' xor self.code.codeSystem = '2.16.840.1.113883.6.96'
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureActivityActCodeCodeSystems(ProcedureActivityAct procedureActivityAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_CODE_CODE_SYSTEMS,
						 ConsolPlugin.INSTANCE.getString("ProcedureActivityActCodeCodeSystems"),
						 new Object [] { procedureActivityAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityActCodeOriginalText(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Code Original Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActCodeOriginalText(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.originalText.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityActCodeOriginalText(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Code Original Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActCodeOriginalText(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.originalText.oclIsUndefined()
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureActivityActCodeOriginalText(ProcedureActivityAct procedureActivityAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_CODE_ORIGINAL_TEXT,
						 ConsolPlugin.INSTANCE.getString("ProcedureActivityActCodeOriginalText"),
						 new Object [] { procedureActivityAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityActOriginalTextReferenceValue(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Original Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActOriginalTextReferenceValue(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_ACT_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.originalText.oclIsUndefined() implies not self.code.originalText.reference.value.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityActOriginalTextReferenceValue(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Original Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActOriginalTextReferenceValue(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_ACT_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.originalText.oclIsUndefined() implies not self.code.originalText.reference.value.oclIsUndefined()
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureActivityActOriginalTextReferenceValue(
			ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACTIVITY_ACT_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_ACT_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_ACT_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_ACT_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_ORIGINAL_TEXT_REFERENCE_VALUE,
						 ConsolPlugin.INSTANCE.getString("ProcedureActivityActOriginalTextReferenceValue"),
						 new Object [] { procedureActivityAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityActReferenceValue(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActReferenceValue(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_ACT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.getSection().text.getText(self.code.originalText.reference.value.substring(2, self.code.originalText.reference.value.size())).oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityActReferenceValue(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActReferenceValue(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_ACT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.getSection().text.getText(self.code.originalText.reference.value.substring(2, self.code.originalText.reference.value.size())).oclIsUndefined()
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureActivityActReferenceValue(ProcedureActivityAct procedureActivityAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACTIVITY_ACT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_ACT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_ACT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_ACT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_REFERENCE_VALUE,
						 ConsolPlugin.INSTANCE.getString("ProcedureActivityActReferenceValue"),
						 new Object [] { procedureActivityAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityActEncounterInversion(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Encounter Inversion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActEncounterInversion(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_ACT_ENCOUNTER_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.encounter->size() > 0)->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityActEncounterInversion(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Encounter Inversion</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActEncounterInversion(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_ACT_ENCOUNTER_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->select(er : cda::EntryRelationship | er.encounter->size() > 0)->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureActivityActEncounterInversion(ProcedureActivityAct procedureActivityAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACTIVITY_ACT_ENCOUNTER_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_ACT_ENCOUNTER_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_ACT_ENCOUNTER_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_ACT_ENCOUNTER_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_ENCOUNTER_INVERSION,
						 ConsolPlugin.INSTANCE.getString("ProcedureActivityActEncounterInversion"),
						 new Object [] { procedureActivityAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityActServiceDeliveryLocationTypeCode(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Service Delivery Location Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActServiceDeliveryLocationTypeCode(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_ACT_SERVICE_DELIVERY_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(par : cda::Participant2 | par.participantRole.oclIsKindOf(consol::ServiceDeliveryLocation))->forAll(p : cda::Participant2 | p.typeCode=vocab::ParticipationType::LOC)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityActServiceDeliveryLocationTypeCode(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Service Delivery Location Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActServiceDeliveryLocationTypeCode(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_ACT_SERVICE_DELIVERY_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->select(par : cda::Participant2 | par.participantRole.oclIsKindOf(consol::ServiceDeliveryLocation))->forAll(p : cda::Participant2 | p.typeCode=vocab::ParticipationType::LOC)
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureActivityActServiceDeliveryLocationTypeCode(
			ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACTIVITY_ACT_SERVICE_DELIVERY_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_ACT_SERVICE_DELIVERY_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_ACT_SERVICE_DELIVERY_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_ACT_SERVICE_DELIVERY_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_SERVICE_DELIVERY_LOCATION_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("ProcedureActivityActServiceDeliveryLocationTypeCode"),
						 new Object [] { procedureActivityAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityActInstructionsInversion(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Instructions Inversion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActInstructionsInversion(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_ACT_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsKindOf(consol::Instructions))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityActInstructionsInversion(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Instructions Inversion</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActInstructionsInversion(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_ACT_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsKindOf(consol::Instructions))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureActivityActInstructionsInversion(ProcedureActivityAct procedureActivityAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACTIVITY_ACT_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_ACT_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_ACT_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_ACT_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_INSTRUCTIONS_INVERSION,
						 ConsolPlugin.INSTANCE.getString("ProcedureActivityActInstructionsInversion"),
						 new Object [] { procedureActivityAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityActTemplateId(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActTemplateId(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.12')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityActTemplateId(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActTemplateId(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.12')
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureActivityActTemplateId(ProcedureActivityAct procedureActivityAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("ProcedureActivityActTemplateId"),
						 new Object [] { procedureActivityAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityActClassCode(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActClassCode(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityActClassCode(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActClassCode(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('classCode')
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureActivityActClassCode(ProcedureActivityAct procedureActivityAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACTIVITY_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("ProcedureActivityActClassCode"),
						 new Object [] { procedureActivityAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityActId(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActId(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityActId(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActId(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureActivityActId(ProcedureActivityAct procedureActivityAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACTIVITY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_ID,
						 ConsolPlugin.INSTANCE.getString("ProcedureActivityActId"),
						 new Object [] { procedureActivityAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityActCode(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActCode(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityActCode(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActCode(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureActivityActCode(ProcedureActivityAct procedureActivityAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_CODE,
						 ConsolPlugin.INSTANCE.getString("ProcedureActivityActCode"),
						 new Object [] { procedureActivityAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityActStatusCode(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActStatusCode(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed' or value.code = 'active' or value.code = 'aborted' or value.code = 'cancelled'))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityActStatusCode(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActStatusCode(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed' or value.code = 'active' or value.code = 'aborted' or value.code = 'cancelled'))
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureActivityActStatusCode(ProcedureActivityAct procedureActivityAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACTIVITY_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("ProcedureActivityActStatusCode"),
						 new Object [] { procedureActivityAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityActEffectiveTime(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActEffectiveTime(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityActEffectiveTime(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActEffectiveTime(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureActivityActEffectiveTime(ProcedureActivityAct procedureActivityAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACTIVITY_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("ProcedureActivityActEffectiveTime"),
						 new Object [] { procedureActivityAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityActPriorityCode(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Priority Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActPriorityCode(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_ACT_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.priorityCode.oclIsUndefined() or self.priorityCode.isNullFlavorUndefined()) implies (not self.priorityCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityActPriorityCode(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Priority Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActPriorityCode(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_ACT_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.priorityCode.oclIsUndefined() or self.priorityCode.isNullFlavorUndefined()) implies (not self.priorityCode.oclIsUndefined())
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureActivityActPriorityCode(ProcedureActivityAct procedureActivityAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACTIVITY_ACT_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_ACT_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_ACT_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_ACT_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_PRIORITY_CODE,
						 ConsolPlugin.INSTANCE.getString("ProcedureActivityActPriorityCode"),
						 new Object [] { procedureActivityAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityActPerformer(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActPerformer(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_ACT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->exists(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityActPerformer(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActPerformer(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_ACT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->exists(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureActivityActPerformer(ProcedureActivityAct procedureActivityAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACTIVITY_ACT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_ACT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_ACT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_ACT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_PERFORMER,
						 ConsolPlugin.INSTANCE.getString("ProcedureActivityActPerformer"),
						 new Object [] { procedureActivityAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityActServiceDeliveryLocation(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Service Delivery Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActServiceDeliveryLocation(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_ACT_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::ServiceDeliveryLocation))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityActServiceDeliveryLocation(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Service Delivery Location</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActServiceDeliveryLocation(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_ACT_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->exists(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::ServiceDeliveryLocation))
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureActivityActServiceDeliveryLocation(
			ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACTIVITY_ACT_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_ACT_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_ACT_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_ACT_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_SERVICE_DELIVERY_LOCATION,
						 ConsolPlugin.INSTANCE.getString("ProcedureActivityActServiceDeliveryLocation"),
						 new Object [] { procedureActivityAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityActProcedureEncounter(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActProcedureEncounter(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.encounter.oclIsUndefined() and entryRelationship.encounter.oclIsKindOf(cda::Encounter) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityActProcedureEncounter(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Encounter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActProcedureEncounter(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.encounter.oclIsUndefined() and entryRelationship.encounter.oclIsKindOf(cda::Encounter) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureActivityActProcedureEncounter(ProcedureActivityAct procedureActivityAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_PROCEDURE_ENCOUNTER,
						 ConsolPlugin.INSTANCE.getString("ProcedureActivityActProcedureEncounter"),
						 new Object [] { procedureActivityAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityActInstructions(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActInstructions(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_ACT_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instructions) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityActInstructions(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Instructions</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActInstructions(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_ACT_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instructions) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureActivityActInstructions(ProcedureActivityAct procedureActivityAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACTIVITY_ACT_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_ACT_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_ACT_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_ACT_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_INSTRUCTIONS,
						 ConsolPlugin.INSTANCE.getString("ProcedureActivityActInstructions"),
						 new Object [] { procedureActivityAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityActIndication(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Indication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActIndication(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_ACT_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityActIndication(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Indication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActIndication(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_ACT_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureActivityActIndication(ProcedureActivityAct procedureActivityAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACTIVITY_ACT_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_ACT_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_ACT_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_ACT_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_INDICATION,
						 ConsolPlugin.INSTANCE.getString("ProcedureActivityActIndication"),
						 new Object [] { procedureActivityAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityActMedicationActivity(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Medication Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActMedicationActivity(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_ACT_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(consol::MedicationActivity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityActMedicationActivity(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Medication Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActMedicationActivity(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_ACT_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(consol::MedicationActivity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureActivityActMedicationActivity(ProcedureActivityAct procedureActivityAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_ACTIVITY_ACT_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_ACT_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_ACT_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_ACT_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_MEDICATION_ACTIVITY,
						 ConsolPlugin.INSTANCE.getString("ProcedureActivityActMedicationActivity"),
						 new Object [] { procedureActivityAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getServiceDeliveryLocations(ProcedureActivityAct) <em>Get Service Delivery Locations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDeliveryLocations(ProcedureActivityAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SERVICE_DELIVERY_LOCATIONS__EOCL_EXP = "self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ServiceDeliveryLocation)).oclAsType(consol::ServiceDeliveryLocation)";

	/**
	 * The cached OCL query for the '{@link #getServiceDeliveryLocations(ProcedureActivityAct) <em>Get Service Delivery Locations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDeliveryLocations(ProcedureActivityAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SERVICE_DELIVERY_LOCATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ServiceDeliveryLocation)).oclAsType(consol::ServiceDeliveryLocation)
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ServiceDeliveryLocation> getServiceDeliveryLocations(ProcedureActivityAct procedureActivityAct) {
		if (GET_SERVICE_DELIVERY_LOCATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT, ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT.getEAllOperations().get(69));
			try {
				GET_SERVICE_DELIVERY_LOCATIONS__EOCL_QRY = helper.createQuery(GET_SERVICE_DELIVERY_LOCATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SERVICE_DELIVERY_LOCATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ServiceDeliveryLocation> result = (Collection<ServiceDeliveryLocation>) query.evaluate(procedureActivityAct);
		return new BasicEList.UnmodifiableEList<ServiceDeliveryLocation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureEncounters(ProcedureActivityAct) <em>Get Procedure Encounters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureEncounters(ProcedureActivityAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_ENCOUNTERS__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(cda::Encounter)).oclAsType(cda::Encounter)";

	/**
	 * The cached OCL query for the '{@link #getProcedureEncounters(ProcedureActivityAct) <em>Get Procedure Encounters</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureEncounters(ProcedureActivityAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_ENCOUNTERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(cda::Encounter)).oclAsType(cda::Encounter)
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Encounter> getProcedureEncounters(ProcedureActivityAct procedureActivityAct) {
		if (GET_PROCEDURE_ENCOUNTERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT, ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT.getEAllOperations().get(70));
			try {
				GET_PROCEDURE_ENCOUNTERS__EOCL_QRY = helper.createQuery(GET_PROCEDURE_ENCOUNTERS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_ENCOUNTERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Encounter> result = (Collection<Encounter>) query.evaluate(procedureActivityAct);
		return new BasicEList.UnmodifiableEList<Encounter>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getInstructions(ProcedureActivityAct) <em>Get Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions(ProcedureActivityAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INSTRUCTIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instructions))->asSequence()->first().oclAsType(consol::Instructions)";

	/**
	 * The cached OCL query for the '{@link #getInstructions(ProcedureActivityAct) <em>Get Instructions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions(ProcedureActivityAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INSTRUCTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instructions))->asSequence()->first().oclAsType(consol::Instructions)
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Instructions getInstructions(ProcedureActivityAct procedureActivityAct) {
		if (GET_INSTRUCTIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT, ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT.getEAllOperations().get(71));
			try {
				GET_INSTRUCTIONS__EOCL_QRY = helper.createQuery(GET_INSTRUCTIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INSTRUCTIONS__EOCL_QRY);
		return (Instructions) query.evaluate(procedureActivityAct);
	}

	/**
	 * The cached OCL expression body for the '{@link #getIndications(ProcedureActivityAct) <em>Get Indications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndications(ProcedureActivityAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INDICATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication)).oclAsType(consol::Indication)";

	/**
	 * The cached OCL query for the '{@link #getIndications(ProcedureActivityAct) <em>Get Indications</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndications(ProcedureActivityAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INDICATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication)).oclAsType(consol::Indication)
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Indication> getIndications(ProcedureActivityAct procedureActivityAct) {
		if (GET_INDICATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT, ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT.getEAllOperations().get(72));
			try {
				GET_INDICATIONS__EOCL_QRY = helper.createQuery(GET_INDICATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INDICATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Indication> result = (Collection<Indication>) query.evaluate(procedureActivityAct);
		return new BasicEList.UnmodifiableEList<Indication>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationActivity(ProcedureActivityAct) <em>Get Medication Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationActivity(ProcedureActivityAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_ACTIVITY__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity))->asSequence()->first().oclAsType(consol::MedicationActivity)";

	/**
	 * The cached OCL query for the '{@link #getMedicationActivity(ProcedureActivityAct) <em>Get Medication Activity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationActivity(ProcedureActivityAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_ACTIVITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity))->asSequence()->first().oclAsType(consol::MedicationActivity)
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationActivity getMedicationActivity(ProcedureActivityAct procedureActivityAct) {
		if (GET_MEDICATION_ACTIVITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT, ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT.getEAllOperations().get(73));
			try {
				GET_MEDICATION_ACTIVITY__EOCL_QRY = helper.createQuery(GET_MEDICATION_ACTIVITY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_ACTIVITY__EOCL_QRY);
		return (MedicationActivity) query.evaluate(procedureActivityAct);
	}

} // ProcedureActivityActOperations
