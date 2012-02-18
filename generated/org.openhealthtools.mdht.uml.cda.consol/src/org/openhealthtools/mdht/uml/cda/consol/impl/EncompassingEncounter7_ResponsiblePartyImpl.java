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
import org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter7_ResponsibleParty;

import org.openhealthtools.mdht.uml.cda.consol.operations.EncompassingEncounter7_ResponsiblePartyOperations;

import org.openhealthtools.mdht.uml.cda.impl.ResponsiblePartyImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encompassing Encounter7 Responsible Party</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EncompassingEncounter7_ResponsiblePartyImpl extends ResponsiblePartyImpl implements
		EncompassingEncounter7_ResponsibleParty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncompassingEncounter7_ResponsiblePartyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsiblePartyAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncompassingEncounter7_ResponsiblePartyOperations.validateResponsiblePartyAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncompassingEncounter7_ResponsibleParty init() {
    	CDAUtil.init(this);
    	return this;
	}
} // EncompassingEncounter7_ResponsiblePartyImpl
