/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.impl.ProcedureActivityProcedureImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.Procedure;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProcedureOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProcedureImpl extends ProcedureActivityProcedureImpl implements Procedure {
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
	public boolean validateEmspcrProcedureEmspcrProcedureAbandonedProcedureRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateEmspcrProcedureEmspcrProcedureAbandonedProcedureRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmspcrProcedureEmspcrProcedureProcedurePriorRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateEmspcrProcedureEmspcrProcedureProcedurePriorRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmspcrProcedureEmspcrProcedureProcedureNumberOfAttemptsRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateEmspcrProcedureEmspcrProcedureProcedureNumberOfAttemptsRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmspcrProcedureEmspcrProcedureProcedureSuccessfulRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateEmspcrProcedureEmspcrProcedureProcedureSuccessfulRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmspcrProcedureEmspcrProcedureProcedureComplicationsRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateEmspcrProcedureEmspcrProcedureProcedureComplicationsRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmspcrProcedureEmspcrProcedureProcedurePatientResponseRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateEmspcrProcedureEmspcrProcedureProcedurePatientResponseRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmspcrProcedureEmspcrProcedureProcedurePerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateEmspcrProcedureEmspcrProcedureProcedurePerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmspcrProcedureEmspcrProcedureAirwayConfirmationRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateEmspcrProcedureEmspcrProcedureAirwayConfirmationRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmspcrProcedureCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateEmspcrProcedureCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmspcrProcedureEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateEmspcrProcedureEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmspcrProcedureStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateEmspcrProcedureStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmspcrProcedureStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateEmspcrProcedureStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmspcrProcedureApproachSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateEmspcrProcedureApproachSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmspcrProcedureApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateEmspcrProcedureApproachSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmspcrProcedureNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateEmspcrProcedureNegationInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityProcedureTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateProcedureActivityProcedureTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Procedure init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //ProcedureImpl
