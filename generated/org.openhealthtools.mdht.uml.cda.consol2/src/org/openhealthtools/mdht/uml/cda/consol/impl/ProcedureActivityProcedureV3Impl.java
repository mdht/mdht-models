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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityProcedureV3Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Activity Procedure V3</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProcedureActivityProcedureV3Impl extends ProcedureImpl implements ProcedureActivityProcedureV3 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureActivityProcedureV3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE_V3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureV3TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedureV3Operations.validateProcedureActivityProcedureV3TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureV3Id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityProcedureV3Operations.validateProcedureActivityProcedureV3Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureV3Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityProcedureV3Operations.validateProcedureActivityProcedureV3Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureV3StatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedureV3Operations.validateProcedureActivityProcedureV3StatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureV3StatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedureV3Operations.validateProcedureActivityProcedureV3StatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureV3EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedureV3Operations.validateProcedureActivityProcedureV3EffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureV3PriorityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityProcedureV3Operations.validateProcedureActivityProcedureV3PriorityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureV3PriorityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedureV3Operations.validateProcedureActivityProcedureV3PriorityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureV3MethodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedureV3Operations.validateProcedureActivityProcedureV3MethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureV3TargetSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityProcedureV3Operations.validateProcedureActivityProcedureV3TargetSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureV3TargetSiteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedureV3Operations.validateProcedureActivityProcedureV3TargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureV3ClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedureV3Operations.validateProcedureActivityProcedureV3ClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureV3MoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedureV3Operations.validateProcedureActivityProcedureV3MoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivityProcedureV3 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ProcedureActivityProcedureV3 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ProcedureActivityProcedureV3Impl
