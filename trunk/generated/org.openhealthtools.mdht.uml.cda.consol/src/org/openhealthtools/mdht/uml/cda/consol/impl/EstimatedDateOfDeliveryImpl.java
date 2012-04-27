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
import org.openhealthtools.mdht.uml.cda.consol.EstimatedDateOfDelivery;
import org.openhealthtools.mdht.uml.cda.consol.operations.EstimatedDateOfDeliveryOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Estimated Date Of Delivery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EstimatedDateOfDeliveryImpl extends ObservationImpl implements EstimatedDateOfDelivery {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected EstimatedDateOfDeliveryImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ESTIMATED_DATE_OF_DELIVERY;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEstimatedDateOfDeliveryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimatedDateOfDeliveryOperations.validateEstimatedDateOfDeliveryTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEstimatedDateOfDeliveryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimatedDateOfDeliveryOperations.validateEstimatedDateOfDeliveryClassCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEstimatedDateOfDeliveryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimatedDateOfDeliveryOperations.validateEstimatedDateOfDeliveryCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEstimatedDateOfDeliveryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimatedDateOfDeliveryOperations.validateEstimatedDateOfDeliveryMoodCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEstimatedDateOfDeliveryStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimatedDateOfDeliveryOperations.validateEstimatedDateOfDeliveryStatusCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEstimatedDateOfDeliveryValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EstimatedDateOfDeliveryOperations.validateEstimatedDateOfDeliveryValue(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EstimatedDateOfDelivery init() {
		CDAUtil.init(this);
		return this;
	}
} // EstimatedDateOfDeliveryImpl
