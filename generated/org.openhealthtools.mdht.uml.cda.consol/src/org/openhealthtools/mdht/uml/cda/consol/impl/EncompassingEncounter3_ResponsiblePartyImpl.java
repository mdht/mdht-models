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
import org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter3_ResponsibleParty;

import org.openhealthtools.mdht.uml.cda.consol.operations.EncompassingEncounter3_ResponsiblePartyOperations;
import org.openhealthtools.mdht.uml.cda.impl.ResponsiblePartyImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encompassing Encounter3 Responsible Party</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EncompassingEncounter3_ResponsiblePartyImpl extends ResponsiblePartyImpl implements
		EncompassingEncounter3_ResponsibleParty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncompassingEncounter3_ResponsiblePartyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsiblePartyAssignedEntityHasPersonOrOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncompassingEncounter3_ResponsiblePartyOperations.validateResponsiblePartyAssignedEntityHasPersonOrOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsiblePartyAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncompassingEncounter3_ResponsiblePartyOperations.validateResponsiblePartyAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncompassingEncounter3_ResponsibleParty init() {
		CDAUtil.init(this);
		return this;
	}
} // EncompassingEncounter3_ResponsiblePartyImpl
