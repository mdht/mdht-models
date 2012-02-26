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
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_InFulfillmentOf;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.InFulfillmentOfOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>General Header Constraints In Fulfillment Of</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_InFulfillmentOf#validateInFulfillmentOfOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate In Fulfillment Of Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralHeaderConstraints_InFulfillmentOfOperations extends InFulfillmentOfOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralHeaderConstraints_InFulfillmentOfOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInFulfillmentOfOrder(GeneralHeaderConstraints_InFulfillmentOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate In Fulfillment Of Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInFulfillmentOfOrder(GeneralHeaderConstraints_InFulfillmentOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(cda::Order))";

	/**
	 * The cached OCL invariant for the '{@link #validateInFulfillmentOfOrder(GeneralHeaderConstraints_InFulfillmentOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate In Fulfillment Of Order</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInFulfillmentOfOrder(GeneralHeaderConstraints_InFulfillmentOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(cda::Order))
	 * @param generalHeaderConstraints_InFulfillmentOf The receiving '<em><b>General Header Constraints In Fulfillment Of</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInFulfillmentOfOrder(
			GeneralHeaderConstraints_InFulfillmentOf generalHeaderConstraints_InFulfillmentOf,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF);
			try {
				VALIDATE_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints_InFulfillmentOf)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF__IN_FULFILLMENT_OF_ORDER,
						 ConsolPlugin.INSTANCE.getString("InFulfillmentOfOrder"),
						 new Object [] { generalHeaderConstraints_InFulfillmentOf }));
			}
			return false;
		}
		return true;
	}

} // GeneralHeaderConstraints_InFulfillmentOfOperations
