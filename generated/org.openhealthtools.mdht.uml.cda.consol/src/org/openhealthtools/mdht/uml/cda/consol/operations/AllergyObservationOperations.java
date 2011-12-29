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

import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyStatusInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Status Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationReactionInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Reaction Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationSeverityInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Severity Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationProblemEntryReactionObservationContainer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Problem Entry Reaction Observation Container</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationSeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#getProblemEntryReactionObservationContainers() <em>Get Problem Entry Reaction Observation Containers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#getSeverity() <em>Get Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#getAllergyStatusObservation() <em>Get Allergy Status Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergyObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyObservationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsKindOf(consol::AllergyStatusObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyObservationAllergyStatusInversionIndicator(
			AllergyObservation allergyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR,
					ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyStatusInversionIndicator"),
					new Object[] { allergyObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsKindOf(consol::ReactionObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyObservationReactionInversionIndicator(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR,
					ConsolPlugin.INSTANCE.getString("AllergyObservationReactionInversionIndicator"),
					new Object[] { allergyObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsKindOf(consol::SeverityObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyObservationSeverityInversionIndicator(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR,
					ConsolPlugin.INSTANCE.getString("AllergyObservationSeverityInversionIndicator"),
					new Object[] { allergyObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationAllergyStatusInversionIndicator(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Status Inversion Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyStatusInversionIndicator(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsKindOf(consol::AllergyStatusObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationAllergyStatusInversionIndicator(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Status Inversion Indicator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyStatusInversionIndicator(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationReactionInversionIndicator(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Reaction Inversion Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationReactionInversionIndicator(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsKindOf(consol::ReactionObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationReactionInversionIndicator(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Reaction Inversion Indicator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationReactionInversionIndicator(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationSeverityInversionIndicator(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Severity Inversion Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationSeverityInversionIndicator(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsKindOf(consol::SeverityObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationSeverityInversionIndicator(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Severity Inversion Indicator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationSeverityInversionIndicator(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationTemplateId(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationTemplateId(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.7')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationTemplateId(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationTemplateId(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.7')
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyObservationTemplateId(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("AllergyObservationTemplateId"),
					new Object[] { allergyObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationClassCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationClassCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationClassCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationClassCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('classCode')
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyObservationClassCode(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("AllergyObservationClassCode"), new Object[] { allergyObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationMoodCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationMoodCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationMoodCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationMoodCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyObservationMoodCode(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("AllergyObservationMoodCode"), new Object[] { allergyObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationId(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationId(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationId(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationId(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyObservationId(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_ID,
					ConsolPlugin.INSTANCE.getString("AllergyObservationId"), new Object[] { allergyObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("
			+ "value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4'))
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyObservationCode(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_CODE,
					ConsolPlugin.INSTANCE.getString("AllergyObservationCode"), new Object[] { allergyObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationStatusCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationStatusCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("
			+ "value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationStatusCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationStatusCode(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyObservationStatusCode(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("AllergyObservationStatusCode"),
					new Object[] { allergyObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationEffectiveTime(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationEffectiveTime(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationEffectiveTime(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationEffectiveTime(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyObservationEffectiveTime(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("AllergyObservationEffectiveTime"),
					new Object[] { allergyObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationValue(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationValue(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '420134006' or value.code = '418038007' or value.code = '419511003' or value.code = '418471000' or value.code = '419199007' or value.code = '416098002' or value.code = '414285001' or value.code = '59037007' or value.code = '235719002')))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationValue(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationValue(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '420134006' or value.code = '418038007' or value.code = '419511003' or value.code = '418471000' or value.code = '419199007' or value.code = '416098002' or value.code = '414285001' or value.code = '59037007' or value.code = '235719002')))
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyObservationValue(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_VALUE,
					ConsolPlugin.INSTANCE.getString("AllergyObservationValue"), new Object[] { allergyObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationProblemEntryReactionObservationContainer(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Problem Entry Reaction Observation Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationProblemEntryReactionObservationContainer(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReactionObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationProblemEntryReactionObservationContainer(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Problem Entry Reaction Observation Container</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationProblemEntryReactionObservationContainer(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReactionObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyObservationProblemEntryReactionObservationContainer(
			AllergyObservation allergyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_OBSERVATION_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_OBSERVATION_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER,
					ConsolPlugin.INSTANCE.getString("AllergyObservationProblemEntryReactionObservationContainer"),
					new Object[] { allergyObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationSeverity(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Severity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationSeverity(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SeverityObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationSeverity(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Severity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationSeverity(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SeverityObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyObservationSeverity(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_OBSERVATION_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_SEVERITY,
					ConsolPlugin.INSTANCE.getString("AllergyObservationSeverity"), new Object[] { allergyObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationAllergyStatusObservation(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyStatusObservation(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AllergyStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationAllergyStatusObservation(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationAllergyStatusObservation(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AllergyStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyObservationAllergyStatusObservation(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("AllergyObservationAllergyStatusObservation"),
					new Object[] { allergyObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationParticipant(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipant(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationParticipant(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipant(AllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyObservationParticipant(AllergyObservation allergyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION);
			try {
				VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION__ALLERGY_OBSERVATION_PARTICIPANT,
					ConsolPlugin.INSTANCE.getString("AllergyObservationParticipant"),
					new Object[] { allergyObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemEntryReactionObservationContainers(AllergyObservation) <em>Get Problem Entry Reaction Observation Containers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemEntryReactionObservationContainers(AllergyObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINERS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation)).oclAsType(consol::ReactionObservation)";

	/**
	 * The cached OCL query for the '{@link #getProblemEntryReactionObservationContainers(AllergyObservation) <em>Get Problem Entry Reaction Observation Containers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemEntryReactionObservationContainers(AllergyObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation)).oclAsType(consol::ReactionObservation)
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ReactionObservation> getProblemEntryReactionObservationContainers(
			AllergyObservation allergyObservation) {
		if (GET_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ALLERGY_OBSERVATION,
				ConsolPackage.Literals.ALLERGY_OBSERVATION.getEAllOperations().get(64));
			try {
				GET_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINERS__EOCL_QRY = helper.createQuery(GET_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ReactionObservation> result = (Collection<ReactionObservation>) query.evaluate(allergyObservation);
		return new BasicEList.UnmodifiableEList<ReactionObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSeverity(AllergyObservation) <em>Get Severity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity(AllergyObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SEVERITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SeverityObservation))->asSequence()->first().oclAsType(consol::SeverityObservation)";

	/**
	 * The cached OCL query for the '{@link #getSeverity(AllergyObservation) <em>Get Severity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity(AllergyObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SEVERITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SeverityObservation))->asSequence()->first().oclAsType(consol::SeverityObservation)
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static SeverityObservation getSeverity(AllergyObservation allergyObservation) {
		if (GET_SEVERITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ALLERGY_OBSERVATION,
				ConsolPackage.Literals.ALLERGY_OBSERVATION.getEAllOperations().get(65));
			try {
				GET_SEVERITY__EOCL_QRY = helper.createQuery(GET_SEVERITY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SEVERITY__EOCL_QRY);
		return (SeverityObservation) query.evaluate(allergyObservation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergyStatusObservation(AllergyObservation) <em>Get Allergy Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergyStatusObservation(AllergyObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGY_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyStatusObservation))->asSequence()->first().oclAsType(consol::AllergyStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getAllergyStatusObservation(AllergyObservation) <em>Get Allergy Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergyStatusObservation(AllergyObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGY_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyStatusObservation))->asSequence()->first().oclAsType(consol::AllergyStatusObservation)
	 * @param allergyObservation The receiving '<em><b>Allergy Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AllergyStatusObservation getAllergyStatusObservation(AllergyObservation allergyObservation) {
		if (GET_ALLERGY_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ALLERGY_OBSERVATION,
				ConsolPackage.Literals.ALLERGY_OBSERVATION.getEAllOperations().get(66));
			try {
				GET_ALLERGY_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_ALLERGY_STATUS_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGY_STATUS_OBSERVATION__EOCL_QRY);
		return (AllergyStatusObservation) query.evaluate(allergyObservation);
	}

} // AllergyObservationOperations
