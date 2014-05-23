/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DrugVehicle;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct;

import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationActivity2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Activity2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ImmunizationActivity2Impl extends ImmunizationActivityImpl implements ImmunizationActivity2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationActivity2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2AuthorParticipation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivity2SubstanceAdministeredAct(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivity2SubstanceAdministeredAct(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceAdministeredAct> getSubstanceAdministeredActs() {
		return ImmunizationActivity2Operations.getSubstanceAdministeredActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DrugVehicle> getConsolDrugVehicles() {
		return ImmunizationActivity2Operations.getConsolDrugVehicles(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructions getConsolInstructions() {
		return ImmunizationActivity2Operations.getConsolInstructions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityRepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityRepeatNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityAdministrationUnitCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityAdministrationUnitCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityAdministrationUnitCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityAdministrationUnitCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityNegationInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateImmunizationActivityDrugVehicle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivity2Operations.validateImmunizationActivityDrugVehicle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationActivity2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationActivity2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ImmunizationActivity2Impl
