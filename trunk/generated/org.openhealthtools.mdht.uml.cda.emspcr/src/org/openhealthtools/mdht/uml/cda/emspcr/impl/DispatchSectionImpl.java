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
import org.openhealthtools.mdht.uml.cda.emspcr.DispatchSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.DispatchSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dispatch Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DispatchSectionImpl extends SectionImpl implements DispatchSection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected DispatchSectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.DISPATCH_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDispatchSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispatchSectionOperations.validateDispatchSectionTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDispatchSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispatchSectionOperations.validateDispatchSectionCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDispatchSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispatchSectionOperations.validateDispatchSectionTitle(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDispatchSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispatchSectionOperations.validateDispatchSectionText(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDispatchSectionEmergencyMedicalDispatchObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DispatchSectionOperations.validateDispatchSectionEmergencyMedicalDispatchObservation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDispatchSectionComplaintReportedByDispatch(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DispatchSectionOperations.validateDispatchSectionComplaintReportedByDispatch(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EmergencyMedicalDispatchObservation getEmergencyMedicalDispatchObservation() {
		return DispatchSectionOperations.getEmergencyMedicalDispatchObservation(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ComplaintReportedByDispatch getComplaintReportedByDispatch() {
		return DispatchSectionOperations.getComplaintReportedByDispatch(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public DispatchSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // DispatchSectionImpl
