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
import org.openhealthtools.mdht.uml.cda.consol.ProviderOrganization;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.OrganizationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Provider Organization</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderOrganization#validateProviderOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderOrganization#validateProviderOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderOrganization#validateProviderOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderOrganization#validateProviderOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Organization Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProviderOrganizationOperations extends OrganizationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProviderOrganizationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProviderOrganizationAddr(ProviderOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Organization Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderOrganizationAddr(ProviderOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVIDER_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateProviderOrganizationAddr(ProviderOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Organization Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderOrganizationAddr(ProviderOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROVIDER_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
	 * @param providerOrganization The receiving '<em><b>Provider Organization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProviderOrganizationAddr(ProviderOrganization providerOrganization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROVIDER_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVIDER_ORGANIZATION);
			try {
				VALIDATE_PROVIDER_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROVIDER_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROVIDER_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			providerOrganization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROVIDER_ORGANIZATION__PROVIDER_ORGANIZATION_ADDR,
					ConsolPlugin.INSTANCE.getString("ProviderOrganizationAddr"), new Object[] { providerOrganization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProviderOrganizationId(ProviderOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Organization Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderOrganizationId(ProviderOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVIDER_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateProviderOrganizationId(ProviderOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Organization Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderOrganizationId(ProviderOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROVIDER_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param providerOrganization The receiving '<em><b>Provider Organization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProviderOrganizationId(ProviderOrganization providerOrganization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROVIDER_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVIDER_ORGANIZATION);
			try {
				VALIDATE_PROVIDER_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROVIDER_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROVIDER_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			providerOrganization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROVIDER_ORGANIZATION__PROVIDER_ORGANIZATION_ID,
					ConsolPlugin.INSTANCE.getString("ProviderOrganizationId"), new Object[] { providerOrganization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProviderOrganizationName(ProviderOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Organization Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderOrganizationName(ProviderOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVIDER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.name->isEmpty() or self.name->exists(element | element.isNullFlavorUndefined())) implies (not self.name->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateProviderOrganizationName(ProviderOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Organization Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderOrganizationName(ProviderOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROVIDER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.name->isEmpty() or self.name->exists(element | element.isNullFlavorUndefined())) implies (not self.name->isEmpty())
	 * @param providerOrganization The receiving '<em><b>Provider Organization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProviderOrganizationName(ProviderOrganization providerOrganization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROVIDER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVIDER_ORGANIZATION);
			try {
				VALIDATE_PROVIDER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROVIDER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROVIDER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			providerOrganization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROVIDER_ORGANIZATION__PROVIDER_ORGANIZATION_NAME,
					ConsolPlugin.INSTANCE.getString("ProviderOrganizationName"), new Object[] { providerOrganization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProviderOrganizationTelecom(ProviderOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Organization Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderOrganizationTelecom(ProviderOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVIDER_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.telecom->isEmpty() or self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateProviderOrganizationTelecom(ProviderOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Organization Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderOrganizationTelecom(ProviderOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROVIDER_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.telecom->isEmpty() or self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())
	 * @param providerOrganization The receiving '<em><b>Provider Organization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProviderOrganizationTelecom(ProviderOrganization providerOrganization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROVIDER_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVIDER_ORGANIZATION);
			try {
				VALIDATE_PROVIDER_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROVIDER_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROVIDER_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			providerOrganization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROVIDER_ORGANIZATION__PROVIDER_ORGANIZATION_TELECOM,
					ConsolPlugin.INSTANCE.getString("ProviderOrganizationTelecom"),
					new Object[] { providerOrganization }));
			}
			return false;
		}
		return true;
	}

} // ProviderOrganizationOperations
