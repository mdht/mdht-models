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
import org.openhealthtools.mdht.uml.cda.consol.RecievedOrganization;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.OrganizationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Recieved Organization</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RecievedOrganization#validateRecievedOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Recieved Organization Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecievedOrganizationOperations extends OrganizationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecievedOrganizationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRecievedOrganizationName(RecievedOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Recieved Organization Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRecievedOrganizationName(RecievedOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RECIEVED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.name->isEmpty() or self.name->exists(element | element.isNullFlavorUndefined())) implies (not self.name->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateRecievedOrganizationName(RecievedOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Recieved Organization Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRecievedOrganizationName(RecievedOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RECIEVED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.name->isEmpty() or self.name->exists(element | element.isNullFlavorUndefined())) implies (not self.name->isEmpty())
	 * @param recievedOrganization The receiving '<em><b>Recieved Organization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRecievedOrganizationName(RecievedOrganization recievedOrganization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RECIEVED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RECIEVED_ORGANIZATION);
			try {
				VALIDATE_RECIEVED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RECIEVED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RECIEVED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			recievedOrganization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.RECIEVED_ORGANIZATION__RECIEVED_ORGANIZATION_NAME,
					ConsolPlugin.INSTANCE.getString("RecievedOrganizationName"), new Object[] { recievedOrganization }));
			}
			return false;
		}
		return true;
	}

} // RecievedOrganizationOperations
