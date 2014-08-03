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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservation2InstructionsInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Instructions Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationIndication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Indication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationMedicationActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Medication Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationInstruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#getConsolIndication2s() <em>Get Consol Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#getConsolMedicationActivity2s() <em>Get Consol Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#getConsolInstruction2() <em>Get Consol Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Target Site Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureActivityObservation2Operations extends ProcedureActivityObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureActivityObservation2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservation2InstructionsInversion(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Instructions Inversion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservation2InstructionsInversion(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsTypeOf(consol::Instruction2))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservation2InstructionsInversion(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Instructions Inversion</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservation2InstructionsInversion(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityObservation2InstructionsInversion(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION2_INSTRUCTIONS_INVERSION,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservation2InstructionsInversion"),
					new Object[] { procedureActivityObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservationIndication2(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Indication2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationIndication2(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservationIndication2(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Indication2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationIndication2(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityObservationIndication2(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION_INDICATION2,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationIndication2"),
					new Object[] { procedureActivityObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservationMedicationActivity2(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Medication Activity2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationMedicationActivity2(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(consol::MedicationActivity2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservationMedicationActivity2(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Medication Activity2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationMedicationActivity2(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityObservationMedicationActivity2(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY2,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationMedicationActivity2"),
					new Object[] { procedureActivityObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservationInstruction2(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Instruction2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationInstruction2(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instruction2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservationInstruction2(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Instruction2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationInstruction2(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityObservationInstruction2(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTION2,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationInstruction2"),
					new Object[] { procedureActivityObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolIndication2s(ProcedureActivityObservation2) <em>Get Consol Indication2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolIndication2s(ProcedureActivityObservation2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_INDICATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication2)).oclAsType(consol::Indication2)";

	/**
	 * The cached OCL query for the '{@link #getConsolIndication2s(ProcedureActivityObservation2) <em>Get Consol Indication2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolIndication2s(ProcedureActivityObservation2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_INDICATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Indication2> getConsolIndication2s(ProcedureActivityObservation2 procedureActivityObservation2) {
		if (GET_CONSOL_INDICATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2,
				ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2.getEAllOperations().get(101));
			try {
				GET_CONSOL_INDICATION2S__EOCL_QRY = helper.createQuery(GET_CONSOL_INDICATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_INDICATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Indication2> result = (Collection<Indication2>) query.evaluate(procedureActivityObservation2);
		return new BasicEList.UnmodifiableEList<Indication2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolMedicationActivity2s(ProcedureActivityObservation2) <em>Get Consol Medication Activity2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolMedicationActivity2s(ProcedureActivityObservation2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_MEDICATION_ACTIVITY2S__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity2)).oclAsType(consol::MedicationActivity2)";

	/**
	 * The cached OCL query for the '{@link #getConsolMedicationActivity2s(ProcedureActivityObservation2) <em>Get Consol Medication Activity2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolMedicationActivity2s(ProcedureActivityObservation2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_MEDICATION_ACTIVITY2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<MedicationActivity2> getConsolMedicationActivity2s(
			ProcedureActivityObservation2 procedureActivityObservation2) {
		if (GET_CONSOL_MEDICATION_ACTIVITY2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2,
				ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2.getEAllOperations().get(102));
			try {
				GET_CONSOL_MEDICATION_ACTIVITY2S__EOCL_QRY = helper.createQuery(GET_CONSOL_MEDICATION_ACTIVITY2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_MEDICATION_ACTIVITY2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MedicationActivity2> result = (Collection<MedicationActivity2>) query.evaluate(procedureActivityObservation2);
		return new BasicEList.UnmodifiableEList<MedicationActivity2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolInstruction2(ProcedureActivityObservation2) <em>Get Consol Instruction2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolInstruction2(ProcedureActivityObservation2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_INSTRUCTION2__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2))->asSequence()->any(true).oclAsType(consol::Instruction2)";

	/**
	 * The cached OCL query for the '{@link #getConsolInstruction2(ProcedureActivityObservation2) <em>Get Consol Instruction2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolInstruction2(ProcedureActivityObservation2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_INSTRUCTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static Instruction2 getConsolInstruction2(ProcedureActivityObservation2 procedureActivityObservation2) {
		if (GET_CONSOL_INSTRUCTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2,
				ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2.getEAllOperations().get(103));
			try {
				GET_CONSOL_INSTRUCTION2__EOCL_QRY = helper.createQuery(GET_CONSOL_INSTRUCTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_INSTRUCTION2__EOCL_QRY);
		return (Instruction2) query.evaluate(procedureActivityObservation2);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservationTemplateId(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationTemplateId(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.13.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservationTemplateId(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationTemplateId(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityObservationTemplateId(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationTemplateId"),
					new Object[] { procedureActivityObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityObservationTargetSiteCode(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationTargetSiteCode(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityObservationTargetSiteCode(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityObservationTargetSiteCode(ProcedureActivityObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityObservation2 The receiving '<em><b>Procedure Activity Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureActivityObservationTargetSiteCode(
			ProcedureActivityObservation2 procedureActivityObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ACTIVITY_OBSERVATION2);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureActivityObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ACTIVITY_OBSERVATION2__PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE,
					ConsolPlugin.INSTANCE.getString("ProcedureActivityObservationTargetSiteCode"),
					new Object[] { procedureActivityObservation2 }));
			}

			return false;
		}
		return true;
	}

} // ProcedureActivityObservation2Operations
