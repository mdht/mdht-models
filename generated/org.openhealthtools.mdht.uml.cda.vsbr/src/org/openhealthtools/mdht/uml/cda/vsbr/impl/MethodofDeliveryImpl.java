/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ProcedureImpl;

import org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.MethodofDeliveryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Methodof Delivery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodofDeliveryImpl extends ProcedureImpl implements MethodofDelivery {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodofDeliveryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.METHODOF_DELIVERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodofDeliveryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MethodofDeliveryOperations.validateMethodofDeliveryTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodofDeliveryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MethodofDeliveryOperations.validateMethodofDeliveryClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodofDeliveryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MethodofDeliveryOperations.validateMethodofDeliveryMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodofDeliveryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MethodofDeliveryOperations.validateMethodofDeliveryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodofDeliveryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MethodofDeliveryOperations.validateMethodofDeliveryCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodofDeliveryFinalRouteAndMethod(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MethodofDeliveryOperations.validateMethodofDeliveryFinalRouteAndMethod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodofDeliveryFetalPresentation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MethodofDeliveryOperations.validateMethodofDeliveryFetalPresentation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodofDeliveryHysterotomyHysterectomyAssociation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MethodofDeliveryOperations.validateMethodofDeliveryHysterotomyHysterectomyAssociation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodofDelivery init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodofDelivery init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MethodofDeliveryImpl
