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
import org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter2_ResponsibleParty;

import org.openhealthtools.mdht.uml.cda.consol.operations.EncompassingEncounter2_ResponsiblePartyOperations;

import org.openhealthtools.mdht.uml.cda.impl.ResponsiblePartyImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encompassing Encounter2 Responsible Party</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EncompassingEncounter2_ResponsiblePartyImpl extends ResponsiblePartyImpl implements
		EncompassingEncounter2_ResponsibleParty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncompassingEncounter2_ResponsiblePartyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncompassingEncounter2_ResponsiblePartyOperations.validateResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsiblePartyAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncompassingEncounter2_ResponsiblePartyOperations.validateResponsiblePartyAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncompassingEncounter2_ResponsibleParty init() {
    	CDAUtil.init(this);
    	return this;
	}
} // EncompassingEncounter2_ResponsiblePartyImpl
