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

import org.openhealthtools.mdht.uml.cda.consol.AssignedCustodian_CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.CustodianOrganizationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assigned Custodian Custodian Organization</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedCustodian_CustodianOrganization#validateCustodianOrganizationHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Organization Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedCustodian_CustodianOrganization#validateCustodianOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedCustodian_CustodianOrganization#validateCustodianOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedCustodian_CustodianOrganization#validateCustodianOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedCustodian_CustodianOrganization#validateCustodianOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Organization Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignedCustodian_CustodianOrganizationOperations extends CustodianOrganizationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignedCustodian_CustodianOrganizationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCustodianOrganizationHasNationalProviderIdentifier(AssignedCustodian_CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Organization Has National Provider Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCustodianOrganizationHasNationalProviderIdentifier(AssignedCustodian_CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CUSTODIAN_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id->exists( root='2.16.840.1.113883.4.6' )";

	/**
	 * The cached OCL invariant for the '{@link #validateCustodianOrganizationHasNationalProviderIdentifier(AssignedCustodian_CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Organization Has National Provider Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCustodianOrganizationHasNationalProviderIdentifier(AssignedCustodian_CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CUSTODIAN_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id->exists( root='2.16.840.1.113883.4.6' )
	 * @param assignedCustodian_CustodianOrganization The receiving '<em><b>Assigned Custodian Custodian Organization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCustodianOrganizationHasNationalProviderIdentifier(
			AssignedCustodian_CustodianOrganization assignedCustodian_CustodianOrganization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CUSTODIAN_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION);
			try {
				VALIDATE_CUSTODIAN_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CUSTODIAN_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CUSTODIAN_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(assignedCustodian_CustodianOrganization)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION__CUSTODIAN_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER,
						 ConsolPlugin.INSTANCE.getString("CustodianOrganizationHasNationalProviderIdentifier"),
						 new Object [] { assignedCustodian_CustodianOrganization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCustodianOrganizationAddr(AssignedCustodian_CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Organization Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCustodianOrganizationAddr(AssignedCustodian_CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.addr.oclIsUndefined() or self.addr.isNullFlavorUndefined()) implies (not self.addr.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCustodianOrganizationAddr(AssignedCustodian_CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Organization Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCustodianOrganizationAddr(AssignedCustodian_CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.addr.oclIsUndefined() or self.addr.isNullFlavorUndefined()) implies (not self.addr.oclIsUndefined())
	 * @param assignedCustodian_CustodianOrganization The receiving '<em><b>Assigned Custodian Custodian Organization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCustodianOrganizationAddr(
			AssignedCustodian_CustodianOrganization assignedCustodian_CustodianOrganization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION);
			try {
				VALIDATE_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(assignedCustodian_CustodianOrganization)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION__CUSTODIAN_ORGANIZATION_ADDR,
						 ConsolPlugin.INSTANCE.getString("CustodianOrganizationAddr"),
						 new Object [] { assignedCustodian_CustodianOrganization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCustodianOrganizationId(AssignedCustodian_CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Organization Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCustodianOrganizationId(AssignedCustodian_CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateCustodianOrganizationId(AssignedCustodian_CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Organization Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCustodianOrganizationId(AssignedCustodian_CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param assignedCustodian_CustodianOrganization The receiving '<em><b>Assigned Custodian Custodian Organization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCustodianOrganizationId(
			AssignedCustodian_CustodianOrganization assignedCustodian_CustodianOrganization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION);
			try {
				VALIDATE_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(assignedCustodian_CustodianOrganization)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION__CUSTODIAN_ORGANIZATION_ID,
						 ConsolPlugin.INSTANCE.getString("CustodianOrganizationId"),
						 new Object [] { assignedCustodian_CustodianOrganization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCustodianOrganizationName(AssignedCustodian_CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Organization Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCustodianOrganizationName(AssignedCustodian_CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.name.oclIsUndefined() or self.name.isNullFlavorUndefined()) implies (not self.name.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCustodianOrganizationName(AssignedCustodian_CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Organization Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCustodianOrganizationName(AssignedCustodian_CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.name.oclIsUndefined() or self.name.isNullFlavorUndefined()) implies (not self.name.oclIsUndefined())
	 * @param assignedCustodian_CustodianOrganization The receiving '<em><b>Assigned Custodian Custodian Organization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCustodianOrganizationName(
			AssignedCustodian_CustodianOrganization assignedCustodian_CustodianOrganization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION);
			try {
				VALIDATE_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(assignedCustodian_CustodianOrganization)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION__CUSTODIAN_ORGANIZATION_NAME,
						 ConsolPlugin.INSTANCE.getString("CustodianOrganizationName"),
						 new Object [] { assignedCustodian_CustodianOrganization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCustodianOrganizationTelecom(AssignedCustodian_CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Organization Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCustodianOrganizationTelecom(AssignedCustodian_CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.telecom.oclIsUndefined() or self.telecom.isNullFlavorUndefined()) implies (not self.telecom.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCustodianOrganizationTelecom(AssignedCustodian_CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Organization Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCustodianOrganizationTelecom(AssignedCustodian_CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.telecom.oclIsUndefined() or self.telecom.isNullFlavorUndefined()) implies (not self.telecom.oclIsUndefined())
	 * @param assignedCustodian_CustodianOrganization The receiving '<em><b>Assigned Custodian Custodian Organization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCustodianOrganizationTelecom(
			AssignedCustodian_CustodianOrganization assignedCustodian_CustodianOrganization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION);
			try {
				VALIDATE_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(assignedCustodian_CustodianOrganization)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION__CUSTODIAN_ORGANIZATION_TELECOM,
						 ConsolPlugin.INSTANCE.getString("CustodianOrganizationTelecom"),
						 new Object [] { assignedCustodian_CustodianOrganization }));
			}
			return false;
		}
		return true;
	}

} // AssignedCustodian_CustodianOrganizationOperations
