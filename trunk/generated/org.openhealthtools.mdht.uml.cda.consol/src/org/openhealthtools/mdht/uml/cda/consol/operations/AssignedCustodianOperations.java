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

import org.openhealthtools.mdht.uml.cda.consol.AssignedCustodian;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assigned Custodian</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedCustodian#validateConsolAssignedCustodianCustodianOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Assigned Custodian Custodian Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignedCustodianOperations extends
		org.openhealthtools.mdht.uml.cda.operations.AssignedCustodianOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignedCustodianOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsolAssignedCustodianCustodianOrganization(AssignedCustodian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Assigned Custodian Custodian Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolAssignedCustodianCustodianOrganization(AssignedCustodian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSOL_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(cda::CustodianOrganization))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsolAssignedCustodianCustodianOrganization(AssignedCustodian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Assigned Custodian Custodian Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolAssignedCustodianCustodianOrganization(AssignedCustodian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSOL_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(cda::CustodianOrganization))
	 * @param assignedCustodian The receiving '<em><b>Assigned Custodian</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsolAssignedCustodianCustodianOrganization(AssignedCustodian assignedCustodian,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSOL_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSIGNED_CUSTODIAN);
			try {
				VALIDATE_CONSOL_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSOL_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSOL_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			assignedCustodian)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ASSIGNED_CUSTODIAN__CONSOL_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION,
					ConsolPlugin.INSTANCE.getString("ConsolAssignedCustodianCustodianOrganization"),
					new Object[] { assignedCustodian }));
			}
			return false;
		}
		return true;
	}

} // AssignedCustodianOperations
