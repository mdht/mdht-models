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
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_InFulfillmentOf;

import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraints_InFulfillmentOfOperations;

import org.openhealthtools.mdht.uml.cda.impl.InFulfillmentOfImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Header Constraints In Fulfillment Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GeneralHeaderConstraints_InFulfillmentOfImpl extends InFulfillmentOfImpl implements
		GeneralHeaderConstraints_InFulfillmentOf {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralHeaderConstraints_InFulfillmentOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInFulfillmentOfOrder(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraints_InFulfillmentOfOperations.validateInFulfillmentOfOrder(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints_InFulfillmentOf init() {
    	CDAUtil.init(this);
    	return this;
	}
} // GeneralHeaderConstraints_InFulfillmentOfImpl
