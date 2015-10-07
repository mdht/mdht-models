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
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection2;

import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedProcedureSection2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Procedure Section2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PlannedProcedureSection2Impl extends PlannedProcedureSectionImpl implements PlannedProcedureSection2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedProcedureSection2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PLANNED_PROCEDURE_SECTION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlannedProcedure2> getConsolPlannedProcedure2s() {
		return PlannedProcedureSection2Operations.getConsolPlannedProcedure2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedProcedureSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedProcedureSection2Operations.validatePlannedProcedureSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedProcedureSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedProcedureSection2Operations.validatePlannedProcedureSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedProcedureSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedProcedureSection2Operations.validatePlannedProcedureSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedProcedureSectionPlanOfCareActivityProcedure(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedProcedureSection2Operations.validatePlannedProcedureSectionPlanOfCareActivityProcedure(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedProcedureSection2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedProcedureSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PlannedProcedureSection2Impl
