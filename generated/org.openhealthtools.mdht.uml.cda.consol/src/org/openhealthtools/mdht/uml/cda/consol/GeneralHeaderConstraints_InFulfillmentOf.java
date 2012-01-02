/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.InFulfillmentOf;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Header Constraints In Fulfillment Of</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getGeneralHeaderConstraints_InFulfillmentOf()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='InFulfillmentOfOrder'"
 * @generated
 */
public interface GeneralHeaderConstraints_InFulfillmentOf extends InFulfillmentOf {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(cda::Order))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(cda::Order))'"
	 * @generated
	 */
	boolean validateInFulfillmentOfOrder(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints_InFulfillmentOf init();
} // GeneralHeaderConstraints_InFulfillmentOf
