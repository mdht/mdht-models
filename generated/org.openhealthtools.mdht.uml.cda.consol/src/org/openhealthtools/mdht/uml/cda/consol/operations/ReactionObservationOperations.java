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
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reaction Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationSeverityObservationInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Severity Observation Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationProcedureActivityProcedureInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Procedure Activity Procedure Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationMedicationActivityInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Medication Activity Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationSeverityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Severity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationProcedureActivityProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Procedure Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#getSeverityObservation() <em>Get Severity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#getProcedureActivityProcedures() <em>Get Procedure Activity Procedures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#getMedicationActivities() <em>Get Medication Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReactionObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReactionObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationTextReference(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationTextReference(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined() implies not self.text.reference.value.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationTextReference(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationTextReference(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REACTION_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined() implies not self.text.reference.value.oclIsUndefined()
	 * @param reactionObservation The receiving '<em><b>Reaction Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReactionObservationTextReference(ReactionObservation reactionObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REACTION_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION);
			try {
				VALIDATE_REACTION_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REACTION_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REACTION_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reactionObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.REACTION_OBSERVATION__REACTION_OBSERVATION_TEXT_REFERENCE,
					ConsolPlugin.INSTANCE.getString("ReactionObservationTextReference"),
					new Object[] { reactionObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationReferenceValue(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationReferenceValue(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.getSection().text.getText(self.text.reference.value.substring(2, self.text.reference.value.size())).oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationReferenceValue(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationReferenceValue(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REACTION_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.getSection().text.getText(self.text.reference.value.substring(2, self.text.reference.value.size())).oclIsUndefined()
	 * @param reactionObservation The receiving '<em><b>Reaction Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReactionObservationReferenceValue(ReactionObservation reactionObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REACTION_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION);
			try {
				VALIDATE_REACTION_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REACTION_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REACTION_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reactionObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.REACTION_OBSERVATION__REACTION_OBSERVATION_REFERENCE_VALUE,
					ConsolPlugin.INSTANCE.getString("ReactionObservationReferenceValue"),
					new Object[] { reactionObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationSeverityObservationInversionInd(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Severity Observation Inversion Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationSeverityObservationInversionInd(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsKindOf(consol::SeverityObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationSeverityObservationInversionInd(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Severity Observation Inversion Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationSeverityObservationInversionInd(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsKindOf(consol::SeverityObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)
	 * @param reactionObservation The receiving '<em><b>Reaction Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReactionObservationSeverityObservationInversionInd(
			ReactionObservation reactionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION);
			try {
				VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reactionObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.REACTION_OBSERVATION__REACTION_OBSERVATION_SEVERITY_OBSERVATION_INVERSION_IND,
					ConsolPlugin.INSTANCE.getString("ReactionObservationSeverityObservationInversionInd"),
					new Object[] { reactionObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationProcedureActivityProcedureInversionInd(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Procedure Activity Procedure Inversion Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationProcedureActivityProcedureInversionInd(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsKindOf(consol::ProcedureActivityProcedure))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationProcedureActivityProcedureInversionInd(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Procedure Activity Procedure Inversion Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationProcedureActivityProcedureInversionInd(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsKindOf(consol::ProcedureActivityProcedure))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)
	 * @param reactionObservation The receiving '<em><b>Reaction Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReactionObservationProcedureActivityProcedureInversionInd(
			ReactionObservation reactionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION);
			try {
				VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reactionObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.REACTION_OBSERVATION__REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE_INVERSION_IND,
					ConsolPlugin.INSTANCE.getString("ReactionObservationProcedureActivityProcedureInversionInd"),
					new Object[] { reactionObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationMedicationActivityInversionInd(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Medication Activity Inversion Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationMedicationActivityInversionInd(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsKindOf(consol::MedicationActivity))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationMedicationActivityInversionInd(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Medication Activity Inversion Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationMedicationActivityInversionInd(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsKindOf(consol::MedicationActivity))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)
	 * @param reactionObservation The receiving '<em><b>Reaction Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReactionObservationMedicationActivityInversionInd(
			ReactionObservation reactionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION);
			try {
				VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reactionObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.REACTION_OBSERVATION__REACTION_OBSERVATION_MEDICATION_ACTIVITY_INVERSION_IND,
					ConsolPlugin.INSTANCE.getString("ReactionObservationMedicationActivityInversionInd"),
					new Object[] { reactionObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationTemplateId(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationTemplateId(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.9')";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationTemplateId(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationTemplateId(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REACTION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.9')
	 * @param reactionObservation The receiving '<em><b>Reaction Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReactionObservationTemplateId(ReactionObservation reactionObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REACTION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION);
			try {
				VALIDATE_REACTION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REACTION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REACTION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reactionObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.REACTION_OBSERVATION__REACTION_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ReactionObservationTemplateId"),
					new Object[] { reactionObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationClassCode(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationClassCode(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationClassCode(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationClassCode(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REACTION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('classCode')
	 * @param reactionObservation The receiving '<em><b>Reaction Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReactionObservationClassCode(ReactionObservation reactionObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REACTION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION);
			try {
				VALIDATE_REACTION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REACTION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REACTION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reactionObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.REACTION_OBSERVATION__REACTION_OBSERVATION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("ReactionObservationClassCode"),
					new Object[] { reactionObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationMoodCode(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationMoodCode(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationMoodCode(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationMoodCode(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REACTION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param reactionObservation The receiving '<em><b>Reaction Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReactionObservationMoodCode(ReactionObservation reactionObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REACTION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION);
			try {
				VALIDATE_REACTION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REACTION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REACTION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reactionObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.REACTION_OBSERVATION__REACTION_OBSERVATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("ReactionObservationMoodCode"),
					new Object[] { reactionObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationId(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationId(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationId(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationId(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REACTION_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)
	 * @param reactionObservation The receiving '<em><b>Reaction Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReactionObservationId(ReactionObservation reactionObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REACTION_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION);
			try {
				VALIDATE_REACTION_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REACTION_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REACTION_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reactionObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.REACTION_OBSERVATION__REACTION_OBSERVATION_ID,
					ConsolPlugin.INSTANCE.getString("ReactionObservationId"), new Object[] { reactionObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationCode(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationCode(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationCode(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationCode(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REACTION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param reactionObservation The receiving '<em><b>Reaction Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReactionObservationCode(ReactionObservation reactionObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REACTION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION);
			try {
				VALIDATE_REACTION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REACTION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REACTION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reactionObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.REACTION_OBSERVATION__REACTION_OBSERVATION_CODE,
					ConsolPlugin.INSTANCE.getString("ReactionObservationCode"), new Object[] { reactionObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationText(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationText(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationText(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationText(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REACTION_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
	 * @param reactionObservation The receiving '<em><b>Reaction Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReactionObservationText(ReactionObservation reactionObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REACTION_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION);
			try {
				VALIDATE_REACTION_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REACTION_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REACTION_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reactionObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.REACTION_OBSERVATION__REACTION_OBSERVATION_TEXT,
					ConsolPlugin.INSTANCE.getString("ReactionObservationText"), new Object[] { reactionObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationStatusCode(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationStatusCode(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("
			+ "value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationStatusCode(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationStatusCode(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REACTION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param reactionObservation The receiving '<em><b>Reaction Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReactionObservationStatusCode(ReactionObservation reactionObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REACTION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION);
			try {
				VALIDATE_REACTION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REACTION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REACTION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reactionObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.REACTION_OBSERVATION__REACTION_OBSERVATION_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("ReactionObservationStatusCode"),
					new Object[] { reactionObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationEffectiveTime(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationEffectiveTime(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationEffectiveTime(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationEffectiveTime(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REACTION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param reactionObservation The receiving '<em><b>Reaction Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReactionObservationEffectiveTime(ReactionObservation reactionObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REACTION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION);
			try {
				VALIDATE_REACTION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REACTION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REACTION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reactionObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.REACTION_OBSERVATION__REACTION_OBSERVATION_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("ReactionObservationEffectiveTime"),
					new Object[] { reactionObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationValue(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationValue(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '234422006')))";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationValue(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationValue(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REACTION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '234422006')))
	 * @param reactionObservation The receiving '<em><b>Reaction Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReactionObservationValue(ReactionObservation reactionObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REACTION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION);
			try {
				VALIDATE_REACTION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REACTION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REACTION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reactionObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.REACTION_OBSERVATION__REACTION_OBSERVATION_VALUE,
					ConsolPlugin.INSTANCE.getString("ReactionObservationValue"), new Object[] { reactionObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationSeverityObservation(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Severity Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationSeverityObservation(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SeverityObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationSeverityObservation(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Severity Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationSeverityObservation(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SeverityObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param reactionObservation The receiving '<em><b>Reaction Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReactionObservationSeverityObservation(ReactionObservation reactionObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION);
			try {
				VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reactionObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.REACTION_OBSERVATION__REACTION_OBSERVATION_SEVERITY_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("ReactionObservationSeverityObservation"),
					new Object[] { reactionObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationProcedureActivityProcedure(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Procedure Activity Procedure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationProcedureActivityProcedure(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(consol::ProcedureActivityProcedure) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationProcedureActivityProcedure(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Procedure Activity Procedure</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationProcedureActivityProcedure(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(consol::ProcedureActivityProcedure) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)
	 * @param reactionObservation The receiving '<em><b>Reaction Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReactionObservationProcedureActivityProcedure(
			ReactionObservation reactionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION);
			try {
				VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reactionObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.REACTION_OBSERVATION__REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE,
					ConsolPlugin.INSTANCE.getString("ReactionObservationProcedureActivityProcedure"),
					new Object[] { reactionObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReactionObservationMedicationActivity(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Medication Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationMedicationActivity(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(consol::MedicationActivity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateReactionObservationMedicationActivity(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Medication Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReactionObservationMedicationActivity(ReactionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(consol::MedicationActivity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)
	 * @param reactionObservation The receiving '<em><b>Reaction Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReactionObservationMedicationActivity(ReactionObservation reactionObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REACTION_OBSERVATION);
			try {
				VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reactionObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.REACTION_OBSERVATION__REACTION_OBSERVATION_MEDICATION_ACTIVITY,
					ConsolPlugin.INSTANCE.getString("ReactionObservationMedicationActivity"),
					new Object[] { reactionObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getSeverityObservation(ReactionObservation) <em>Get Severity Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverityObservation(ReactionObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SEVERITY_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SeverityObservation))->asSequence()->first().oclAsType(consol::SeverityObservation)";

	/**
	 * The cached OCL query for the '{@link #getSeverityObservation(ReactionObservation) <em>Get Severity Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverityObservation(ReactionObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SEVERITY_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SeverityObservation))->asSequence()->first().oclAsType(consol::SeverityObservation)
	 * @param reactionObservation The receiving '<em><b>Reaction Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static SeverityObservation getSeverityObservation(ReactionObservation reactionObservation) {
		if (GET_SEVERITY_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REACTION_OBSERVATION,
				ConsolPackage.Literals.REACTION_OBSERVATION.getEAllOperations().get(66));
			try {
				GET_SEVERITY_OBSERVATION__EOCL_QRY = helper.createQuery(GET_SEVERITY_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SEVERITY_OBSERVATION__EOCL_QRY);
		return (SeverityObservation) query.evaluate(reactionObservation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureActivityProcedures(ReactionObservation) <em>Get Procedure Activity Procedures</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureActivityProcedures(ReactionObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureActivityProcedure)).oclAsType(consol::ProcedureActivityProcedure)";

	/**
	 * The cached OCL query for the '{@link #getProcedureActivityProcedures(ReactionObservation) <em>Get Procedure Activity Procedures</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureActivityProcedures(ReactionObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureActivityProcedure)).oclAsType(consol::ProcedureActivityProcedure)
	 * @param reactionObservation The receiving '<em><b>Reaction Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ProcedureActivityProcedure> getProcedureActivityProcedures(
			ReactionObservation reactionObservation) {
		if (GET_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REACTION_OBSERVATION,
				ConsolPackage.Literals.REACTION_OBSERVATION.getEAllOperations().get(67));
			try {
				GET_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_QRY = helper.createQuery(GET_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProcedureActivityProcedure> result = (Collection<ProcedureActivityProcedure>) query.evaluate(reactionObservation);
		return new BasicEList.UnmodifiableEList<ProcedureActivityProcedure>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationActivities(ReactionObservation) <em>Get Medication Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationActivities(ReactionObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_ACTIVITIES__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity)).oclAsType(consol::MedicationActivity)";

	/**
	 * The cached OCL query for the '{@link #getMedicationActivities(ReactionObservation) <em>Get Medication Activities</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationActivities(ReactionObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_ACTIVITIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity)).oclAsType(consol::MedicationActivity)
	 * @param reactionObservation The receiving '<em><b>Reaction Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<MedicationActivity> getMedicationActivities(ReactionObservation reactionObservation) {
		if (GET_MEDICATION_ACTIVITIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.REACTION_OBSERVATION,
				ConsolPackage.Literals.REACTION_OBSERVATION.getEAllOperations().get(68));
			try {
				GET_MEDICATION_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_MEDICATION_ACTIVITIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MedicationActivity> result = (Collection<MedicationActivity>) query.evaluate(reactionObservation);
		return new BasicEList.UnmodifiableEList<MedicationActivity>(result.size(), result.toArray());
	}

} // ReactionObservationOperations
