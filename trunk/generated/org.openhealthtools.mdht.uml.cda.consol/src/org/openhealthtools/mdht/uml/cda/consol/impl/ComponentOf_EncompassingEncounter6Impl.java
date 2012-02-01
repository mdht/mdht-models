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

import org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter6;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.ComponentOf_EncompassingEncounter6Operations;

import org.openhealthtools.mdht.uml.cda.impl.EncompassingEncounterImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Of Encompassing Encounter6</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ComponentOf_EncompassingEncounter6Impl extends EncompassingEncounterImpl implements
		ComponentOf_EncompassingEncounter6 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentOf_EncompassingEncounter6Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.COMPONENT_OF_ENCOMPASSING_ENCOUNTER6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncompassingEncounter6EffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComponentOf_EncompassingEncounter6Operations.validateEncompassingEncounter6EffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncompassingEncounter6Id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComponentOf_EncompassingEncounter6Operations.validateEncompassingEncounter6Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncompassingEncounter6Location(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComponentOf_EncompassingEncounter6Operations.validateEncompassingEncounter6Location(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentOf_EncompassingEncounter6 init() {
    	CDAUtil.init(this);
    	return this;
	}
} // ComponentOf_EncompassingEncounter6Impl
