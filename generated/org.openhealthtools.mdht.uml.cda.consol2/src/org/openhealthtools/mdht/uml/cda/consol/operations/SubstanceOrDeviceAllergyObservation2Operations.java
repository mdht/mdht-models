/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2;
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation2;
import org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Substance Or Device Allergy Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2ReactionInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Reaction Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2SeverityInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Severity Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationReactionObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Reaction Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationSeverityObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Severity Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergySpecificMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Playing Entity Allergy Specific Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Playing Entity Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Playing Entity Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Playing Entity Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyClassMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Playing Entity Allergy Class Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Playing Entity Allergy Food Other Substance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Substance Or Device Allergy Observation Participant Participant Role Playing Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Substance Or Device Allergy Observation Participant Participant Role Playing Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2ParticipantSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Substance Or Device Allergy Observation Participant Participant Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Substance Or Device Allergy Observation Participant Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#getConsolReactionObservation2s() <em>Get Consol Reaction Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#getConsolSeverityObservation2() <em>Get Consol Severity Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstanceOrDeviceAllergyObservation2Operations extends SubstanceOrDeviceAllergyObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceOrDeviceAllergyObservation2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservation2ReactionInversionIndicator(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Reaction Inversion Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2ReactionInversionIndicator(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::ReactionObservation2))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservation2ReactionInversionIndicator(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Reaction Inversion Indicator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2ReactionInversionIndicator(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservation2ReactionInversionIndicator(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_REACTION_INVERSION_INDICATOR,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservation2ReactionInversionIndicator"),
					new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservation2SeverityInversionIndicator(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Severity Inversion Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2SeverityInversionIndicator(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::SeverityObservation2))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservation2SeverityInversionIndicator(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Severity Inversion Indicator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2SeverityInversionIndicator(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservation2SeverityInversionIndicator(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_SEVERITY_INVERSION_INDICATOR,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservation2SeverityInversionIndicator"),
					new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationReactionObservation2(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Reaction Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationReactionObservation2(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReactionObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationReactionObservation2(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Reaction Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationReactionObservation2(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationReactionObservation2(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_OBSERVATION2,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationReactionObservation2"),
					new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationSeverityObservation2(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Severity Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationSeverityObservation2(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SeverityObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationSeverityObservation2(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Severity Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationSeverityObservation2(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationSeverityObservation2(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION2,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationSeverityObservation2"),
					new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservation2AuthorParticipation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2AuthorParticipation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservation2AuthorParticipation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2AuthorParticipation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservation2AuthorParticipation(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_AUTHOR_PARTICIPATION,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservation2AuthorParticipation"),
					new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservation2IVLTSLow(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2IVLTSLow(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservation2IVLTSLow(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2IVLTSLow(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservation2IVLTSLow(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_LOW,
						ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservation2IVLTSLow"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservation2IVLTSHigh(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2IVLTSHigh(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservation2IVLTSHigh(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2IVLTSHigh(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservation2IVLTSHigh(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_HIGH,
						ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservation2IVLTSHigh"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergySpecificMedication(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Playing Entity Allergy Specific Medication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergySpecificMedication(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_SPECIFIC_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergySpecificMedication(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Playing Entity Allergy Specific Medication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergySpecificMedication(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_SPECIFIC_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergySpecificMedication(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_SPECIFIC_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_SPECIFIC_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_SPECIFIC_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_SPECIFIC_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_SPECIFIC_MEDICATION,
						ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergySpecificMedication"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReference(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Playing Entity Original Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReference(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReference(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Playing Entity Original Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReference(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReference(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE,
						ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReference"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityReferenceValue(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Playing Entity Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityReferenceValue(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityReferenceValue(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Playing Entity Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityReferenceValue(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityReferenceValue(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityReferenceValue"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Playing Entity Original Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Playing Entity Original Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceValue"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyClassMedication(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Playing Entity Allergy Class Medication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyClassMedication(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_CLASS_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyClassMedication(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Playing Entity Allergy Class Medication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyClassMedication(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_CLASS_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyClassMedication(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_CLASS_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_CLASS_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_CLASS_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_CLASS_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_CLASS_MEDICATION,
						ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyClassMedication"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Playing Entity Allergy Food Other Substance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_FOOD_OTHER_SUBSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Playing Entity Allergy Food Other Substance</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_FOOD_OTHER_SUBSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_FOOD_OTHER_SUBSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_FOOD_OTHER_SUBSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_FOOD_OTHER_SUBSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_FOOD_OTHER_SUBSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_FOOD_OTHER_SUBSTANCE,
						ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeP(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Substance Or Device Allergy Observation Participant Participant Role Playing Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeP(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeP(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Substance Or Device Allergy Observation Participant Participant Role Playing Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeP(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeP(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE_P,
						ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Substance Or Device Allergy Observation Participant Participant Role Playing Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Substance Or Device Allergy Observation Participant Participant Role Playing Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservation2ParticipantSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Substance Or Device Allergy Observation Participant Participant Role Playing Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2ParticipantSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null)->reject(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservation2ParticipantSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Substance Or Device Allergy Observation Participant Participant Role Playing Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2ParticipantSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservation2ParticipantSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY,
						ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservation2ParticipantSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRole(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Substance Or Device Allergy Observation Participant Participant Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRole(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRole(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Substance Or Device Allergy Observation Participant Participant Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRole(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRole(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE,
						ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRole"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolReactionObservation2s(SubstanceOrDeviceAllergyObservation2) <em>Get Consol Reaction Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolReactionObservation2s(SubstanceOrDeviceAllergyObservation2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_REACTION_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation2)).oclAsType(consol::ReactionObservation2)";

	/**
	 * The cached OCL query for the '{@link #getConsolReactionObservation2s(SubstanceOrDeviceAllergyObservation2) <em>Get Consol Reaction Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolReactionObservation2s(SubstanceOrDeviceAllergyObservation2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_REACTION_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ReactionObservation2> getConsolReactionObservation2s(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2) {
		if (GET_CONSOL_REACTION_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2,
				ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2.getEAllOperations().get(100));
			try {
				GET_CONSOL_REACTION_OBSERVATION2S__EOCL_QRY = helper.createQuery(GET_CONSOL_REACTION_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_REACTION_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ReactionObservation2> result = (Collection<ReactionObservation2>) query.evaluate(substanceOrDeviceAllergyObservation2);
		return new BasicEList.UnmodifiableEList<ReactionObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolSeverityObservation2(SubstanceOrDeviceAllergyObservation2) <em>Get Consol Severity Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolSeverityObservation2(SubstanceOrDeviceAllergyObservation2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_SEVERITY_OBSERVATION2__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SeverityObservation2))->asSequence()->any(true).oclAsType(consol::SeverityObservation2)";

	/**
	 * The cached OCL query for the '{@link #getConsolSeverityObservation2(SubstanceOrDeviceAllergyObservation2) <em>Get Consol Severity Observation2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolSeverityObservation2(SubstanceOrDeviceAllergyObservation2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_SEVERITY_OBSERVATION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static SeverityObservation2 getConsolSeverityObservation2(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2) {
		if (GET_CONSOL_SEVERITY_OBSERVATION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2,
				ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2.getEAllOperations().get(101));
			try {
				GET_CONSOL_SEVERITY_OBSERVATION2__EOCL_QRY = helper.createQuery(GET_CONSOL_SEVERITY_OBSERVATION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_SEVERITY_OBSERVATION2__EOCL_QRY);
		return (SeverityObservation2) query.evaluate(substanceOrDeviceAllergyObservation2);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationTemplateId(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationTemplateId(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.24.3.90' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationTemplateId(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationTemplateId(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationTemplateId(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationTemplateId"),
					new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationEffectiveTime(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationEffectiveTime(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationEffectiveTime(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationEffectiveTime(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationEffectiveTime(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationEffectiveTime"),
					new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationValueP(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationValueP(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationValueP(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationValueP(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationValueP(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE_P,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationValueP"),
					new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservationValueP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservationValueP", passToken);
				}
				passToken.add(substanceOrDeviceAllergyObservation2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationValue(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationValue(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '420134006' or value.code = '418038007' or value.code = '419511003' or value.code = '418471000' or value.code = '419199007' or value.code = '416098002' or value.code = '414285001' or value.code = '59037007' or value.code = '235719002')))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationValue(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationValue(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationValue(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservationValueP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(substanceOrDeviceAllergyObservation2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationValue"),
					new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationCodeP(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationCodeP(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationCodeP(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationCodeP(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationCodeP(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE_P,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationCodeP"),
					new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservationCodeP", passToken);
				}
				passToken.add(substanceOrDeviceAllergyObservation2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationCode(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationCode(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationCode(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationCode(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationCode(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservationCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(substanceOrDeviceAllergyObservation2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationCode"),
					new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipant(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipant(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipant(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipant(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationParticipant(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationParticipant"),
					new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			return false;
		}
		return true;
	}

} // SubstanceOrDeviceAllergyObservation2Operations
