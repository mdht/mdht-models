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
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_Custodian;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.CustodianOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>General Header Constraints Custodian</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_Custodian#validateCustodianAssignedCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Assigned Custodian</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralHeaderConstraints_CustodianOperations extends CustodianOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralHeaderConstraints_CustodianOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCustodianAssignedCustodian(GeneralHeaderConstraints_Custodian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Assigned Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCustodianAssignedCustodian(GeneralHeaderConstraints_Custodian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian))";

	/**
	 * The cached OCL invariant for the '{@link #validateCustodianAssignedCustodian(GeneralHeaderConstraints_Custodian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Assigned Custodian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCustodianAssignedCustodian(GeneralHeaderConstraints_Custodian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian))
	 * @param generalHeaderConstraints_Custodian The receiving '<em><b>General Header Constraints Custodian</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCustodianAssignedCustodian(
			GeneralHeaderConstraints_Custodian generalHeaderConstraints_Custodian, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS_CUSTODIAN);
			try {
				VALIDATE_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints_Custodian)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__CUSTODIAN_ASSIGNED_CUSTODIAN,
					ConsolPlugin.INSTANCE.getString("CustodianAssignedCustodian"),
					new Object[] { generalHeaderConstraints_Custodian }));
			}
			return false;
		}
		return true;
	}

} // GeneralHeaderConstraints_CustodianOperations
