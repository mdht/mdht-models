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
import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation;
import org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Substance Or Device Allergy Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Allergy Status Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Reaction Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Severity Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationAllergyStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Allergy Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationReactionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationSeverityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Severity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity CE Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity CE Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#getAllergyStatusObservation() <em>Get Allergy Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#getReactionObservations() <em>Get Reaction Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#getSeverityObservation() <em>Get Severity Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstanceOrDeviceAllergyObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceOrDeviceAllergyObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Allergy Status Inversion Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::AllergyStatusObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Allergy Status Inversion Indicator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator"),
					new Object[] { substanceOrDeviceAllergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Reaction Inversion Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::ReactionObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Reaction Inversion Indicator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationReactionInversionIndicator"),
					new Object[] { substanceOrDeviceAllergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Severity Inversion Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::SeverityObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Severity Inversion Indicator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationSeverityInversionIndicator"),
					new Object[] { substanceOrDeviceAllergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationTemplateId(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationTemplateId(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.24.3.90')";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationTemplateId(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationTemplateId(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationTemplateId(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationTemplateId"),
					new Object[] { substanceOrDeviceAllergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationClassCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationClassCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationClassCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationClassCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationClassCode(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationClassCode"),
					new Object[] { substanceOrDeviceAllergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationMoodCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationMoodCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationMoodCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationMoodCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationMoodCode(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationMoodCode"),
					new Object[] { substanceOrDeviceAllergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationId(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationId(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationId(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationId(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationId(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ID,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationId"),
					new Object[] { substanceOrDeviceAllergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationCodeP(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationCodeP(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationCodeP(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationCodeP(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationCodeP(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE_P,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationCodeP"),
					new Object[] { substanceOrDeviceAllergyObservation }));
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
				passToken.add(substanceOrDeviceAllergyObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationCode(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservationCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(substanceOrDeviceAllergyObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationCode"),
					new Object[] { substanceOrDeviceAllergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationStatusCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationStatusCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationStatusCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationStatusCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationStatusCode(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationStatusCode"),
					new Object[] { substanceOrDeviceAllergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationStatusCodeP(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationStatusCodeP(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationStatusCodeP(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationStatusCodeP(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationStatusCodeP(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_STATUS_CODE_P,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationStatusCodeP"),
					new Object[] { substanceOrDeviceAllergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationEffectiveTime(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationEffectiveTime(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationEffectiveTime(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationEffectiveTime(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationEffectiveTime(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationEffectiveTime"),
					new Object[] { substanceOrDeviceAllergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationValue(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationValue(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationValue(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationValue(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationValue(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationValue"),
					new Object[] { substanceOrDeviceAllergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationAllergyStatusObservation(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Allergy Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationAllergyStatusObservation(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AllergyStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationAllergyStatusObservation(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Allergy Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationAllergyStatusObservation(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationAllergyStatusObservation(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationAllergyStatusObservation"),
					new Object[] { substanceOrDeviceAllergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationReactionObservation(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Reaction Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationReactionObservation(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReactionObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationReactionObservation(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Reaction Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationReactionObservation(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationReactionObservation(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationReactionObservation"),
					new Object[] { substanceOrDeviceAllergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationSeverityObservation(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Severity Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationSeverityObservation(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SeverityObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationSeverityObservation(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Severity Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationSeverityObservation(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationSeverityObservation(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationSeverityObservation"),
					new Object[] { substanceOrDeviceAllergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipant(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipant(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipant(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipant(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationParticipant(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceOrDeviceAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT,
					ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationParticipant"),
					new Object[] { substanceOrDeviceAllergyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity CE Original Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null).code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((originalText.oclIsUndefined() or originalText.isNullFlavorUndefined()) implies (not originalText.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity CE Original Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(substanceOrDeviceAllergyObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_ORIGINAL_TEXT,
						ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity CE Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null).code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (not translation->isEmpty()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity CE Translation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(substanceOrDeviceAllergyObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_TRANSLATION,
						ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Original Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(not code.originalText.reference.value.oclIsUndefined() implies not getSection().text.getText(code.originalText.reference.value.substring(2, code.originalText.reference.value.size())).oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Original Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(substanceOrDeviceAllergyObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(not code.originalText.reference.oclIsUndefined() implies code.originalText.reference.value->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(substanceOrDeviceAllergyObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Original Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(not code.originalText.oclIsUndefined() implies not code.originalText.reference.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Original Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(substanceOrDeviceAllergyObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE,
						ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(isDefined('classCode') and classCode=vocab::EntityClassRoot::MMAT)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCode(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(substanceOrDeviceAllergyObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(substanceOrDeviceAllergyObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null)->reject(isDefined('classCode') and classCode=vocab::RoleClassRoot::MANU)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCode(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(substanceOrDeviceAllergyObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null)->reject(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(substanceOrDeviceAllergyObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY,
						ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantTypeCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantTypeCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(typeCode=vocab::ParticipationType::CSM)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantTypeCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantTypeCode(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservationParticipantTypeCode(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(substanceOrDeviceAllergyObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationParticipantTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRole(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRole(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRole(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRole(SubstanceOrDeviceAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation The receiving '<em><b>Substance Or Device Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRole(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(substanceOrDeviceAllergyObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE,
						ConsolPlugin.INSTANCE.getString("SubstanceOrDeviceAllergyObservationParticipantParticipantRole"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergyStatusObservation(SubstanceOrDeviceAllergyObservation) <em>Get Allergy Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergyStatusObservation(SubstanceOrDeviceAllergyObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGY_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyStatusObservation))->asSequence()->any(true).oclAsType(consol::AllergyStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getAllergyStatusObservation(SubstanceOrDeviceAllergyObservation) <em>Get Allergy Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergyStatusObservation(SubstanceOrDeviceAllergyObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGY_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AllergyStatusObservation getAllergyStatusObservation(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation) {
		if (GET_ALLERGY_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION,
				ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION.getEAllOperations().get(79));
			try {
				GET_ALLERGY_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_ALLERGY_STATUS_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGY_STATUS_OBSERVATION__EOCL_QRY);
		return (AllergyStatusObservation) query.evaluate(substanceOrDeviceAllergyObservation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReactionObservations(SubstanceOrDeviceAllergyObservation) <em>Get Reaction Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservations(SubstanceOrDeviceAllergyObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REACTION_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation)).oclAsType(consol::ReactionObservation)";

	/**
	 * The cached OCL query for the '{@link #getReactionObservations(SubstanceOrDeviceAllergyObservation) <em>Get Reaction Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservations(SubstanceOrDeviceAllergyObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REACTION_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ReactionObservation> getReactionObservations(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation) {
		if (GET_REACTION_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION,
				ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION.getEAllOperations().get(80));
			try {
				GET_REACTION_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_REACTION_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REACTION_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ReactionObservation> result = (Collection<ReactionObservation>) query.evaluate(substanceOrDeviceAllergyObservation);
		return new BasicEList.UnmodifiableEList<ReactionObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSeverityObservation(SubstanceOrDeviceAllergyObservation) <em>Get Severity Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverityObservation(SubstanceOrDeviceAllergyObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SEVERITY_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SeverityObservation))->asSequence()->any(true).oclAsType(consol::SeverityObservation)";

	/**
	 * The cached OCL query for the '{@link #getSeverityObservation(SubstanceOrDeviceAllergyObservation) <em>Get Severity Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverityObservation(SubstanceOrDeviceAllergyObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SEVERITY_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static SeverityObservation getSeverityObservation(
			SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation) {
		if (GET_SEVERITY_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION,
				ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION.getEAllOperations().get(81));
			try {
				GET_SEVERITY_OBSERVATION__EOCL_QRY = helper.createQuery(GET_SEVERITY_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SEVERITY_OBSERVATION__EOCL_QRY);
		return (SeverityObservation) query.evaluate(substanceOrDeviceAllergyObservation);
	}

} // SubstanceOrDeviceAllergyObservationOperations
