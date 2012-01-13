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
import org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter4_EncounterParticipant;

import org.openhealthtools.mdht.uml.cda.consol.operations.EncompassingEncounter4_EncounterParticipantOperations;

import org.openhealthtools.mdht.uml.cda.impl.EncounterParticipantImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encompassing Encounter4 Encounter Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EncompassingEncounter4_EncounterParticipantImpl extends EncounterParticipantImpl implements
		EncompassingEncounter4_EncounterParticipant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncompassingEncounter4_EncounterParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterParticipantAssignedEntityHasPersonOrOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncompassingEncounter4_EncounterParticipantOperations.validateEncounterParticipantAssignedEntityHasPersonOrOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterParticipantAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncompassingEncounter4_EncounterParticipantOperations.validateEncounterParticipantAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncompassingEncounter4_EncounterParticipant init() {
		CDAUtil.init(this);
		return this;
	}
} // EncompassingEncounter4_EncounterParticipantImpl
