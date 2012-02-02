/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.EncounterParticipant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encompassing Encounter5 Encounter Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getEncompassingEncounter5_EncounterParticipant()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation typeCode='REF' constraints.validation.error='EncounterParticipantTypeCode'"
 * @generated
 */
public interface EncompassingEncounter5_EncounterParticipant extends EncounterParticipant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.typeCode=vocab::x_EncounterParticipant::REF
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.typeCode=vocab::x_EncounterParticipant::REF'"
	 * @generated
	 */
	boolean validateEncounterParticipantTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncompassingEncounter5_EncounterParticipant init();
} // EncompassingEncounter5_EncounterParticipant
