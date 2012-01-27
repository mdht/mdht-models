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
import org.openhealthtools.mdht.uml.cda.consol.Encounter;

import org.openhealthtools.mdht.uml.cda.consol.operations.EncounterOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EncounterImpl extends org.openhealthtools.mdht.uml.cda.impl.EncounterImpl implements Encounter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ENCOUNTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolEncounterAdmissionSourceValueSet(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncounterOperations.validateConsolEncounterAdmissionSourceValueSet(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolEncounterClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterOperations.validateConsolEncounterClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolEncounterId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterOperations.validateConsolEncounterId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolEncounterCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterOperations.validateConsolEncounterCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolEncounterText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterOperations.validateConsolEncounterText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter init() {
		CDAUtil.init(this);
		return this;
	}
} // EncounterImpl
