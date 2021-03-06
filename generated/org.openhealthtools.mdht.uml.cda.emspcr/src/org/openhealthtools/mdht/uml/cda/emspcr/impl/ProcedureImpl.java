/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.Procedure;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProcedureOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProcedureImpl extends org.eclipse.mdht.uml.cda.impl.ProcedureImpl implements Procedure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PROCEDURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRProcedureAbandonedProcedureRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureOperations.validateEMSPCRProcedureAbandonedProcedureRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRProcedureProcedurePriorRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureOperations.validateEMSPCRProcedureProcedurePriorRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRProcedureProcedureNumberOfAttemptsRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureOperations.validateEMSPCRProcedureProcedureNumberOfAttemptsRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRProcedureProcedureSuccessfulRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureOperations.validateEMSPCRProcedureProcedureSuccessfulRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRProcedureProcedureComplicationsRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureOperations.validateEMSPCRProcedureProcedureComplicationsRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRProcedureProcedurePatientResponseRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureOperations.validateEMSPCRProcedureProcedurePatientResponseRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRProcedureProcedurePerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateEMSPCRProcedureProcedurePerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRProcedureAirwayConfirmationRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureOperations.validateEMSPCRProcedureAirwayConfirmationRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRProcedureReasonProcedureNotAttemptedRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureOperations.validateEMSPCRProcedureReasonProcedureNotAttemptedRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRProcedureTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateEMSPCRProcedureTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRProcedureCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateEMSPCRProcedureCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRProcedureNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateEMSPCRProcedureNegationInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRProcedureStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateEMSPCRProcedureStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRProcedureStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateEMSPCRProcedureStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRProcedureEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateEMSPCRProcedureEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRProcedureApproachSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateEMSPCRProcedureApproachSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRProcedureApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateEMSPCRProcedureApproachSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Procedure init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // ProcedureImpl
