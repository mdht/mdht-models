/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter3_EncounterParticipant;

import org.openhealthtools.mdht.uml.cda.consol.operations.EncompassingEncounter3_EncounterParticipantOperations;
import org.openhealthtools.mdht.uml.cda.impl.EncounterParticipantImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encompassing Encounter3 Encounter Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EncompassingEncounter3_EncounterParticipantImpl extends EncounterParticipantImpl implements
		EncompassingEncounter3_EncounterParticipant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncompassingEncounter3_EncounterParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterParticipantAssignedEntityHasPersonOrOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncompassingEncounter3_EncounterParticipantOperations.validateEncounterParticipantAssignedEntityHasPersonOrOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterParticipantAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncompassingEncounter3_EncounterParticipantOperations.validateEncounterParticipantAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncompassingEncounter3_EncounterParticipant init() {
    	CDAUtil.init(this);
    	return this;
	}
} // EncompassingEncounter3_EncounterParticipantImpl
