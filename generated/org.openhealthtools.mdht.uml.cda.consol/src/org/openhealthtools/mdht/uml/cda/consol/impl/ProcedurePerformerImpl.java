/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ProcedurePerformer;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedurePerformerOperations;
import org.openhealthtools.mdht.uml.cda.impl.Performer2Impl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Performer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProcedurePerformerImpl extends Performer2Impl implements ProcedurePerformer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedurePerformerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROCEDURE_PERFORMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedurePerformerAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedurePerformerOperations.validateProcedurePerformerAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedurePerformerAssignedEntityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedurePerformerOperations.validateProcedurePerformerAssignedEntityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedurePerformerAssignedEntityAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedurePerformerOperations.validateProcedurePerformerAssignedEntityAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedurePerformerAssignedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedurePerformerOperations.validateProcedurePerformerAssignedEntityTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedurePerformerAssignedEntityRepOrg(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedurePerformerOperations.validateProcedurePerformerAssignedEntityRepOrg(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedurePerformerAssignedEntityRepOrgId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedurePerformerOperations.validateProcedurePerformerAssignedEntityRepOrgId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedurePerformerAssignedEntityRepOrgName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedurePerformerOperations.validateProcedurePerformerAssignedEntityRepOrgName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedurePerformerAssignedEntityRepOrgAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedurePerformerOperations.validateProcedurePerformerAssignedEntityRepOrgAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedurePerformerAssignedEntityRepOrgTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedurePerformerOperations.validateProcedurePerformerAssignedEntityRepOrgTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedurePerformer init() {
		CDAUtil.init(this);
		return this;
	}
} // ProcedurePerformerImpl
