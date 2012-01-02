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
import org.openhealthtools.mdht.uml.cda.consol.InFulfillmentOf_Order;

import org.openhealthtools.mdht.uml.cda.consol.operations.InFulfillmentOf_OrderOperations;

import org.openhealthtools.mdht.uml.cda.impl.OrderImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Fulfillment Of Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InFulfillmentOf_OrderImpl extends OrderImpl implements InFulfillmentOf_Order {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InFulfillmentOf_OrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.IN_FULFILLMENT_OF_ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InFulfillmentOf_OrderOperations.validateOrderId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InFulfillmentOf_Order init() {
		CDAUtil.init(this);
		return this;
	}
} // InFulfillmentOf_OrderImpl
