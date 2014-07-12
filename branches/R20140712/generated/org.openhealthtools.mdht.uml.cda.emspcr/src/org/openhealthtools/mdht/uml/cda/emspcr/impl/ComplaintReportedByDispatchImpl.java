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

import org.openhealthtools.mdht.uml.cda.emspcr.ComplaintReportedByDispatch;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ComplaintReportedByDispatchOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complaint Reported By Dispatch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ComplaintReportedByDispatchImpl extends ObservationImpl implements ComplaintReportedByDispatch {
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
		return ComplaintReportedByDispatchOperations.validateComplaintReportedByDispatchTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaintReportedByDispatchMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComplaintReportedByDispatchOperations.validateComplaintReportedByDispatchMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaintReportedByDispatchCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComplaintReportedByDispatchOperations.validateComplaintReportedByDispatchCodeP(
			this, diagnostics, context);
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
		return ComplaintReportedByDispatchOperations.validateComplaintReportedByDispatchValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaintReportedByDispatchValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComplaintReportedByDispatchOperations.validateComplaintReportedByDispatchValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplaintReportedByDispatch init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplaintReportedByDispatch init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ComplaintReportedByDispatchImpl
