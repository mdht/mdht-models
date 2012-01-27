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
import org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter2_EncounterParticipant;

import org.openhealthtools.mdht.uml.cda.consol.operations.EncompassingEncounter2_EncounterParticipantOperations;

import org.openhealthtools.mdht.uml.cda.impl.EncounterParticipantImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encompassing Encounter2 Encounter Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EncompassingEncounter2_EncounterParticipantImpl extends EncounterParticipantImpl implements
		EncompassingEncounter2_EncounterParticipant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncompassingEncounter2_EncounterParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncompassingEncounter2_EncounterParticipantOperations.validateEncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterParticipantAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncompassingEncounter2_EncounterParticipantOperations.validateEncounterParticipantAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncompassingEncounter2_EncounterParticipant init() {
    	CDAUtil.init(this);
    	return this;
	}
} // EncompassingEncounter2_EncounterParticipantImpl
