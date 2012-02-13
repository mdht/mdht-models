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
import org.openhealthtools.mdht.uml.cda.consol.CustodianRole_CustodianEntity;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.PlayingEntityOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Custodian Role Custodian Entity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CustodianRole_CustodianEntity#validateCustodianEntityName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Entity Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustodianRole_CustodianEntityOperations extends PlayingEntityOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustodianRole_CustodianEntityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCustodianEntityName(CustodianRole_CustodianEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Entity Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCustodianEntityName(CustodianRole_CustodianEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CUSTODIAN_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.name->isEmpty() or self.name->exists(element | element.isNullFlavorUndefined())) implies (not self.name->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateCustodianEntityName(CustodianRole_CustodianEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Entity Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCustodianEntityName(CustodianRole_CustodianEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CUSTODIAN_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.name->isEmpty() or self.name->exists(element | element.isNullFlavorUndefined())) implies (not self.name->isEmpty())
	 * @param custodianRole_CustodianEntity The receiving '<em><b>Custodian Role Custodian Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCustodianEntityName(CustodianRole_CustodianEntity custodianRole_CustodianEntity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CUSTODIAN_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CUSTODIAN_ROLE_CUSTODIAN_ENTITY);
			try {
				VALIDATE_CUSTODIAN_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CUSTODIAN_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CUSTODIAN_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			custodianRole_CustodianEntity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CUSTODIAN_ROLE_CUSTODIAN_ENTITY__CUSTODIAN_ENTITY_NAME,
					ConsolPlugin.INSTANCE.getString("CustodianEntityName"),
					new Object[] { custodianRole_CustodianEntity }));
			}
			return false;
		}
		return true;
	}

} // CustodianRole_CustodianEntityOperations
