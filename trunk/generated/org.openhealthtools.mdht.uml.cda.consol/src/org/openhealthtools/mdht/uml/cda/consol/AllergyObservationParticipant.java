/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.Participant2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allergy Observation Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAllergyObservationParticipant()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AllergyObservationParticipantTypeCode AllergyObservationParticipantParticipantRole' typeCode='CSM'"
 * @generated
 */
public interface AllergyObservationParticipant extends Participant2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.typeCode.oclIsUndefined() and self.typeCode.oclIsKindOf(vocab::ParticipationType) and 
	 * let value : vocab::ParticipationType = self.typeCode.oclAsType(vocab::ParticipationType) in 
	 * value = vocab::ParticipationType::CSM
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.typeCode.oclIsUndefined() and self.typeCode.oclIsKindOf(vocab::ParticipationType) and \r\nlet value : vocab::ParticipationType = self.typeCode.oclAsType(vocab::ParticipationType) in \r\nvalue = vocab::ParticipationType::CSM'"
	 * @generated
	 */
	boolean validateAllergyObservationParticipantTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole))'"
	 * @generated
	 */
	boolean validateAllergyObservationParticipantParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyObservationParticipant init();
} // AllergyObservationParticipant
