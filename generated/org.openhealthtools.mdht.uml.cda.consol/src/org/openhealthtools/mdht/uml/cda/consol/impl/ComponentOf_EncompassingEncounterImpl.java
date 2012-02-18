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

import org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.ComponentOf_EncompassingEncounterOperations;

import org.openhealthtools.mdht.uml.cda.impl.EncompassingEncounterImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Of Encompassing Encounter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ComponentOf_EncompassingEncounterImpl extends EncompassingEncounterImpl implements
		ComponentOf_EncompassingEncounter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentOf_EncompassingEncounterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.COMPONENT_OF_ENCOMPASSING_ENCOUNTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncompassingEncounterEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComponentOf_EncompassingEncounterOperations.validateEncompassingEncounterEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncompassingEncounterId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComponentOf_EncompassingEncounterOperations.validateEncompassingEncounterId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentOf_EncompassingEncounter init() {
    	CDAUtil.init(this);
    	return this;
	}
} // ComponentOf_EncompassingEncounterImpl
