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
import org.openhealthtools.mdht.uml.cda.consol.InFulfillmentOf;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>In Fulfillment Of</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InFulfillmentOf#validateConsolInFulfillmentOfOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol In Fulfillment Of Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InFulfillmentOfOperations extends org.openhealthtools.mdht.uml.cda.operations.InFulfillmentOfOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InFulfillmentOfOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsolInFulfillmentOfOrder(InFulfillmentOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol In Fulfillment Of Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolInFulfillmentOfOrder(InFulfillmentOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSOL_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(cda::Order))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsolInFulfillmentOfOrder(InFulfillmentOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol In Fulfillment Of Order</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolInFulfillmentOfOrder(InFulfillmentOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSOL_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(cda::Order))
	 * @param inFulfillmentOf The receiving '<em><b>In Fulfillment Of</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsolInFulfillmentOfOrder(InFulfillmentOf inFulfillmentOf,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSOL_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IN_FULFILLMENT_OF);
			try {
				VALIDATE_CONSOL_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSOL_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSOL_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			inFulfillmentOf)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IN_FULFILLMENT_OF__CONSOL_IN_FULFILLMENT_OF_ORDER,
					ConsolPlugin.INSTANCE.getString("ConsolInFulfillmentOfOrder"), new Object[] { inFulfillmentOf }));
			}
			return false;
		}
		return true;
	}

} // InFulfillmentOfOperations
