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
import org.openhealthtools.mdht.uml.cda.consol.PolicyActivity_Guarantor;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.Performer2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Policy Activity Guarantor</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity_Guarantor#validateGuarantorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Guarantor Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity_Guarantor#validateGuarantorGuarantorAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Guarantor Guarantor Assigned Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolicyActivity_GuarantorOperations extends Performer2Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyActivity_GuarantorOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGuarantorTime(PolicyActivity_Guarantor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Guarantor Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGuarantorTime(PolicyActivity_Guarantor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GUARANTOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGuarantorTime(PolicyActivity_Guarantor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Guarantor Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGuarantorTime(PolicyActivity_Guarantor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GUARANTOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())
	 * @param policyActivity_Guarantor The receiving '<em><b>Policy Activity Guarantor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGuarantorTime(PolicyActivity_Guarantor policyActivity_Guarantor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GUARANTOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY_GUARANTOR);
			try {
				VALIDATE_GUARANTOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GUARANTOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GUARANTOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity_Guarantor)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.POLICY_ACTIVITY_GUARANTOR__GUARANTOR_TIME,
						 ConsolPlugin.INSTANCE.getString("GuarantorTime"),
						 new Object [] { policyActivity_Guarantor }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGuarantorGuarantorAssignedEntity(PolicyActivity_Guarantor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Guarantor Guarantor Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGuarantorGuarantorAssignedEntity(PolicyActivity_Guarantor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))";

	/**
	 * The cached OCL invariant for the '{@link #validateGuarantorGuarantorAssignedEntity(PolicyActivity_Guarantor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Guarantor Guarantor Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGuarantorGuarantorAssignedEntity(PolicyActivity_Guarantor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))
	 * @param policyActivity_Guarantor The receiving '<em><b>Policy Activity Guarantor</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGuarantorGuarantorAssignedEntity(PolicyActivity_Guarantor policyActivity_Guarantor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY_GUARANTOR);
			try {
				VALIDATE_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity_Guarantor)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.POLICY_ACTIVITY_GUARANTOR__GUARANTOR_GUARANTOR_ASSIGNED_ENTITY,
						 ConsolPlugin.INSTANCE.getString("GuarantorGuarantorAssignedEntity"),
						 new Object [] { policyActivity_Guarantor }));
			}
			return false;
		}
		return true;
	}

} // PolicyActivity_GuarantorOperations