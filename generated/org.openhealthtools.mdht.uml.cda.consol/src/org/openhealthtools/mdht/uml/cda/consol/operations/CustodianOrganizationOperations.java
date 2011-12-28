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
import org.openhealthtools.mdht.uml.cda.consol.CustodianOrganization;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Custodian Organization</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CustodianOrganization#validateConsolCustodianOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Custodian Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CustodianOrganization#validateConsolCustodianOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Custodian Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CustodianOrganization#validateConsolCustodianOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Custodian Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CustodianOrganization#validateConsolCustodianOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Custodian Organization Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustodianOrganizationOperations extends
		org.openhealthtools.mdht.uml.cda.operations.CustodianOrganizationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustodianOrganizationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsolCustodianOrganizationAddr(CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Custodian Organization Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolCustodianOrganizationAddr(CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.addr.oclIsUndefined() or self.addr.isNullFlavorUndefined()) implies (not self.addr.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsolCustodianOrganizationAddr(CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Custodian Organization Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolCustodianOrganizationAddr(CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.addr.oclIsUndefined() or self.addr.isNullFlavorUndefined()) implies (not self.addr.oclIsUndefined())
	 * @param custodianOrganization The receiving '<em><b>Custodian Organization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsolCustodianOrganizationAddr(CustodianOrganization custodianOrganization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CUSTODIAN_ORGANIZATION);
			try {
				VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			custodianOrganization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CUSTODIAN_ORGANIZATION__CONSOL_CUSTODIAN_ORGANIZATION_ADDR,
					ConsolPlugin.INSTANCE.getString("ConsolCustodianOrganizationAddr"),
					new Object[] { custodianOrganization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsolCustodianOrganizationId(CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Custodian Organization Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolCustodianOrganizationId(CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsolCustodianOrganizationId(CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Custodian Organization Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolCustodianOrganizationId(CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param custodianOrganization The receiving '<em><b>Custodian Organization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsolCustodianOrganizationId(CustodianOrganization custodianOrganization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CUSTODIAN_ORGANIZATION);
			try {
				VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			custodianOrganization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CUSTODIAN_ORGANIZATION__CONSOL_CUSTODIAN_ORGANIZATION_ID,
					ConsolPlugin.INSTANCE.getString("ConsolCustodianOrganizationId"),
					new Object[] { custodianOrganization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsolCustodianOrganizationName(CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Custodian Organization Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolCustodianOrganizationName(CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.name.oclIsUndefined() or self.name.isNullFlavorUndefined()) implies (not self.name.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsolCustodianOrganizationName(CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Custodian Organization Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolCustodianOrganizationName(CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.name.oclIsUndefined() or self.name.isNullFlavorUndefined()) implies (not self.name.oclIsUndefined())
	 * @param custodianOrganization The receiving '<em><b>Custodian Organization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsolCustodianOrganizationName(CustodianOrganization custodianOrganization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CUSTODIAN_ORGANIZATION);
			try {
				VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			custodianOrganization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CUSTODIAN_ORGANIZATION__CONSOL_CUSTODIAN_ORGANIZATION_NAME,
					ConsolPlugin.INSTANCE.getString("ConsolCustodianOrganizationName"),
					new Object[] { custodianOrganization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsolCustodianOrganizationTelecom(CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Custodian Organization Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolCustodianOrganizationTelecom(CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.telecom.oclIsUndefined() or self.telecom.isNullFlavorUndefined()) implies (not self.telecom.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsolCustodianOrganizationTelecom(CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Custodian Organization Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolCustodianOrganizationTelecom(CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.telecom.oclIsUndefined() or self.telecom.isNullFlavorUndefined()) implies (not self.telecom.oclIsUndefined())
	 * @param custodianOrganization The receiving '<em><b>Custodian Organization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsolCustodianOrganizationTelecom(CustodianOrganization custodianOrganization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CUSTODIAN_ORGANIZATION);
			try {
				VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			custodianOrganization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CUSTODIAN_ORGANIZATION__CONSOL_CUSTODIAN_ORGANIZATION_TELECOM,
					ConsolPlugin.INSTANCE.getString("ConsolCustodianOrganizationTelecom"),
					new Object[] { custodianOrganization }));
			}
			return false;
		}
		return true;
	}

} // CustodianOrganizationOperations
