/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.impl.ProcedureActivityProcedureImpl;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.InternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ProcedureEntryProcedureActivityProcedureOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Entry Procedure Activity Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProcedureEntryProcedureActivityProcedureImpl extends ProcedureActivityProcedureImpl implements
		ProcedureEntryProcedureActivityProcedure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureEntryProcedureActivityProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureInternalReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureInternalReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureInternalReferenceReason(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureInternalReferenceReason(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureHasTextReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureHasTextReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedurePriorityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedurePriorityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounter(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounter(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureApproachSiteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureApproachSiteCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalReference getInternalReference() {
		return ProcedureEntryProcedureActivityProcedureOperations.getInternalReference(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalReference> getInternalReferenceReasons() {
		return ProcedureEntryProcedureActivityProcedureOperations.getInternalReferenceReasons(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedureText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureEntryProcedureActivityProcedure init() {
		CDAUtil.init(this);
		return this;
	}
} // ProcedureEntryProcedureActivityProcedureImpl
