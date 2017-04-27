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
import org.openhealthtools.mdht.uml.cda.emspcr.ComplaintDuration;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ComplaintDurationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complaint Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ComplaintDurationImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements ComplaintDuration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplaintDurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.COMPLAINT_DURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaintDurationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComplaintDurationOperations.validateComplaintDurationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaintDurationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComplaintDurationOperations.validateComplaintDurationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaintDurationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComplaintDurationOperations.validateComplaintDurationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaintDurationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComplaintDurationOperations.validateComplaintDurationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaintDurationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComplaintDurationOperations.validateComplaintDurationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplaintDuration init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ComplaintDuration init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // ComplaintDurationImpl
