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
import org.openhealthtools.mdht.uml.cda.consol.InFulfillmentOf;

import org.openhealthtools.mdht.uml.cda.consol.operations.InFulfillmentOfOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Fulfillment Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InFulfillmentOfImpl extends org.openhealthtools.mdht.uml.cda.impl.InFulfillmentOfImpl implements
		InFulfillmentOf {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InFulfillmentOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.IN_FULFILLMENT_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolInFulfillmentOfOrder(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InFulfillmentOfOperations.validateConsolInFulfillmentOfOrder(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InFulfillmentOf init() {
		CDAUtil.init(this);
		return this;
	}
} // InFulfillmentOfImpl
