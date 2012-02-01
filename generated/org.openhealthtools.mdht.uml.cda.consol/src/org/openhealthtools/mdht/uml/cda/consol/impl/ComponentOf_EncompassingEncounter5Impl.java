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

import org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter5;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.ComponentOf_EncompassingEncounter5Operations;
import org.openhealthtools.mdht.uml.cda.impl.EncompassingEncounterImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Of Encompassing Encounter5</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ComponentOf_EncompassingEncounter5Impl extends EncompassingEncounterImpl implements
		ComponentOf_EncompassingEncounter5 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentOf_EncompassingEncounter5Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.COMPONENT_OF_ENCOMPASSING_ENCOUNTER5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncompassingEncounter5Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComponentOf_EncompassingEncounter5Operations.validateEncompassingEncounter5Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncompassingEncounter5Location(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComponentOf_EncompassingEncounter5Operations.validateEncompassingEncounter5Location(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncompassingEncounter5EncounterParticipant(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ComponentOf_EncompassingEncounter5Operations.validateEncompassingEncounter5EncounterParticipant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentOf_EncompassingEncounter5 init() {
    	CDAUtil.init(this);
    	return this;
	}
} // ComponentOf_EncompassingEncounter5Impl
