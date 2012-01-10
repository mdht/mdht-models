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

import org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.ComponentOf_EncompassingEncounter2Operations;

import org.openhealthtools.mdht.uml.cda.impl.EncompassingEncounterImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Of Encompassing Encounter2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ComponentOf_EncompassingEncounter2Impl extends EncompassingEncounterImpl implements
		ComponentOf_EncompassingEncounter2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentOf_EncompassingEncounter2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.COMPONENT_OF_ENCOMPASSING_ENCOUNTER2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncompassingEncounter2EffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComponentOf_EncompassingEncounter2Operations.validateEncompassingEncounter2EffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncompassingEncounter2Id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComponentOf_EncompassingEncounter2Operations.validateEncompassingEncounter2Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncompassingEncounter2ResponsibleParty(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ComponentOf_EncompassingEncounter2Operations.validateEncompassingEncounter2ResponsibleParty(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncompassingEncounter2EncounterParticipant(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ComponentOf_EncompassingEncounter2Operations.validateEncompassingEncounter2EncounterParticipant(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentOf_EncompassingEncounter2 init() {
		CDAUtil.init(this);
		return this;
	}
} // ComponentOf_EncompassingEncounter2Impl
