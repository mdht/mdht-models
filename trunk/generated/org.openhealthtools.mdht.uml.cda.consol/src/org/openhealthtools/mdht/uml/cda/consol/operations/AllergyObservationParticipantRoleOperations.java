/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.AllergyObservationParticipantRole;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ParticipantRoleOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Observation Participant Role</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservationParticipantRole#validateAllergyObservationParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservationParticipantRole#validateAllergyObservationParticipantRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Role Playing Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergyObservationParticipantRoleOperations extends ParticipantRoleOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyObservationParticipantRoleOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationParticipantRoleClassCode(AllergyObservationParticipantRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Role Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantRoleClassCode(AllergyObservationParticipantRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.classCode.oclIsUndefined() and self.classCode.oclIsKindOf(vocab::RoleClassRoot) and "
			+ "let value : vocab::RoleClassRoot = self.classCode.oclAsType(vocab::RoleClassRoot) in "
			+ "value = vocab::RoleClassRoot::MANU";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationParticipantRoleClassCode(AllergyObservationParticipantRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Role Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantRoleClassCode(AllergyObservationParticipantRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.classCode.oclIsUndefined() and self.classCode.oclIsKindOf(vocab::RoleClassRoot) and 
	 * let value : vocab::RoleClassRoot = self.classCode.oclAsType(vocab::RoleClassRoot) in 
	 * value = vocab::RoleClassRoot::MANU
	 * @param allergyObservationParticipantRole The receiving '<em><b>Allergy Observation Participant Role</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyObservationParticipantRoleClassCode(
			AllergyObservationParticipantRole allergyObservationParticipantRole, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION_PARTICIPANT_ROLE);
			try {
				VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservationParticipantRole)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION_PARTICIPANT_ROLE__ALLERGY_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("AllergyObservationParticipantRoleClassCode"),
					new Object[] { allergyObservationParticipantRole }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyObservationParticipantRolePlayingEntity(AllergyObservationParticipantRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Role Playing Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantRolePlayingEntity(AllergyObservationParticipantRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyObservationParticipantRolePlayingEntity(AllergyObservationParticipantRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Role Playing Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyObservationParticipantRolePlayingEntity(AllergyObservationParticipantRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity))
	 * @param allergyObservationParticipantRole The receiving '<em><b>Allergy Observation Participant Role</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyObservationParticipantRolePlayingEntity(
			AllergyObservationParticipantRole allergyObservationParticipantRole, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_OBSERVATION_PARTICIPANT_ROLE);
			try {
				VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyObservationParticipantRole)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_OBSERVATION_PARTICIPANT_ROLE__ALLERGY_OBSERVATION_PARTICIPANT_ROLE_PLAYING_ENTITY,
					ConsolPlugin.INSTANCE.getString("AllergyObservationParticipantRolePlayingEntity"),
					new Object[] { allergyObservationParticipantRole }));
			}
			return false;
		}
		return true;
	}

} // AllergyObservationParticipantRoleOperations
