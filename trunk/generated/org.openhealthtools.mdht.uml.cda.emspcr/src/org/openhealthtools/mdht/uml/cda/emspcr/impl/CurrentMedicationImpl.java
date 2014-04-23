/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedication;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.CurrentMedicationOperations;

import org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Current Medication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CurrentMedicationImpl extends SubstanceAdministrationImpl implements CurrentMedication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentMedicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.CURRENT_MEDICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrentMedicationConsumable(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CurrentMedicationOperations.validateCurrentMedicationConsumable(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrentMedicationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CurrentMedicationOperations.validateCurrentMedicationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrentMedicationNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CurrentMedicationOperations.validateCurrentMedicationNegationInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrentMedicationNullFlavor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CurrentMedicationOperations.validateCurrentMedicationNullFlavor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrentMedicationDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CurrentMedicationOperations.validateCurrentMedicationDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrentMedicationRouteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CurrentMedicationOperations.validateCurrentMedicationRouteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrentMedicationRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CurrentMedicationOperations.validateCurrentMedicationRouteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentMedication init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentMedication init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CurrentMedicationImpl
