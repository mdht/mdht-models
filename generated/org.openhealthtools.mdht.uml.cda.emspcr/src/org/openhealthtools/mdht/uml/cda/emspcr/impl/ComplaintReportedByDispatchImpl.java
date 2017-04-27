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
import org.openhealthtools.mdht.uml.cda.emspcr.ComplaintReportedByDispatch;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ComplaintReportedByDispatchOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complaint Reported By Dispatch</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ComplaintReportedByDispatchImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements ComplaintReportedByDispatch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplaintReportedByDispatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.COMPLAINT_REPORTED_BY_DISPATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaintReportedByDispatchTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ComplaintReportedByDispatchOperations.validateComplaintReportedByDispatchTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaintReportedByDispatchMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComplaintReportedByDispatchOperations.validateComplaintReportedByDispatchMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaintReportedByDispatchCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComplaintReportedByDispatchOperations.validateComplaintReportedByDispatchCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaintReportedByDispatchCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComplaintReportedByDispatchOperations.validateComplaintReportedByDispatchCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaintReportedByDispatchValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComplaintReportedByDispatchOperations.validateComplaintReportedByDispatchValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaintReportedByDispatchValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComplaintReportedByDispatchOperations.validateComplaintReportedByDispatchValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplaintReportedByDispatch init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ComplaintReportedByDispatch init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // ComplaintReportedByDispatchImpl
