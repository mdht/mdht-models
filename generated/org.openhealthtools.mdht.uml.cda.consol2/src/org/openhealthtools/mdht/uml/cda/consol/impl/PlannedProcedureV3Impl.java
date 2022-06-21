/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ProcedureImpl;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureV3;

import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedProcedureV3Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Procedure V3</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PlannedProcedureV3Impl extends ProcedureImpl implements PlannedProcedureV3 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedProcedureV3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PLANNED_PROCEDURE_V3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedProcedureV3Id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedProcedureV3Operations.validatePlannedProcedureV3Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedProcedureV3Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedProcedureV3Operations.validatePlannedProcedureV3Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedProcedureV3StatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedProcedureV3Operations.validatePlannedProcedureV3StatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedProcedureV3EffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedProcedureV3Operations.validatePlannedProcedureV3EffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedProcedureV3MethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedProcedureV3Operations.validatePlannedProcedureV3MethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedProcedureV3TargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedProcedureV3Operations.validatePlannedProcedureV3TargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedProcedureV3 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedProcedureV3 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PlannedProcedureV3Impl
