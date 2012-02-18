/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.InFulfillmentOf_Order;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.OrderOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>In Fulfillment Of Order</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InFulfillmentOf_Order#validateOrderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Order Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InFulfillmentOf_OrderOperations extends OrderOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InFulfillmentOf_OrderOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOrderId(InFulfillmentOf_Order, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Order Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrderId(InFulfillmentOf_Order, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateOrderId(InFulfillmentOf_Order, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Order Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrderId(InFulfillmentOf_Order, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param inFulfillmentOf_Order The receiving '<em><b>In Fulfillment Of Order</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOrderId(InFulfillmentOf_Order inFulfillmentOf_Order, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IN_FULFILLMENT_OF_ORDER);
			try {
				VALIDATE_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inFulfillmentOf_Order)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.IN_FULFILLMENT_OF_ORDER__ORDER_ID,
						 ConsolPlugin.INSTANCE.getString("OrderId"),
						 new Object [] { inFulfillmentOf_Order }));
			}
			return false;
		}
		return true;
	}

} // InFulfillmentOf_OrderOperations
