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

import org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter4;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.ComponentOf_EncompassingEncounter4Operations;

import org.openhealthtools.mdht.uml.cda.impl.EncompassingEncounterImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Of Encompassing Encounter4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ComponentOf_EncompassingEncounter4Impl extends EncompassingEncounterImpl implements
		ComponentOf_EncompassingEncounter4 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentOf_EncompassingEncounter4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.COMPONENT_OF_ENCOMPASSING_ENCOUNTER4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncompassingEncounter4EffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComponentOf_EncompassingEncounter4Operations.validateEncompassingEncounter4EffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncompassingEncounter4Id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComponentOf_EncompassingEncounter4Operations.validateEncompassingEncounter4Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncompassingEncounter4Location(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComponentOf_EncompassingEncounter4Operations.validateEncompassingEncounter4Location(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncompassingEncounter4ResponsibleParty(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ComponentOf_EncompassingEncounter4Operations.validateEncompassingEncounter4ResponsibleParty(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncompassingEncounter4EncounterParticipant(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ComponentOf_EncompassingEncounter4Operations.validateEncompassingEncounter4EncounterParticipant(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentOf_EncompassingEncounter4 init() {
		CDAUtil.init(this);
		return this;
	}
} // ComponentOf_EncompassingEncounter4Impl
