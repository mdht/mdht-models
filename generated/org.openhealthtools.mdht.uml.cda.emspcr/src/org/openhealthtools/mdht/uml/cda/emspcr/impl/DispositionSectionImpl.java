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

import org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionChangeAtDestinationObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.TransportModeObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.DispositionSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disposition Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DispositionSectionImpl extends SectionImpl implements DispositionSection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected DispositionSectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.DISPOSITION_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDispositionSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispositionSectionOperations.validateDispositionSectionTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDispositionSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispositionSectionOperations.validateDispositionSectionCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDispositionSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispositionSectionOperations.validateDispositionSectionCodeP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDispositionSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispositionSectionOperations.validateDispositionSectionTitle(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDispositionSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispositionSectionOperations.validateDispositionSectionText(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDispositionSectionNumberOfPatientsObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DispositionSectionOperations.validateDispositionSectionNumberOfPatientsObservation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDispositionSectionIncidentDispositionObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DispositionSectionOperations.validateDispositionSectionIncidentDispositionObservation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDispositionSectionTransportModeObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DispositionSectionOperations.validateDispositionSectionTransportModeObservation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDispositionSectionTransportMethodObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DispositionSectionOperations.validateDispositionSectionTransportMethodObservation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDispositionSectionReasonForChoosingDestinationObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DispositionSectionOperations.validateDispositionSectionReasonForChoosingDestinationObservation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDispositionSectionPrearrivalActivationObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DispositionSectionOperations.validateDispositionSectionPrearrivalActivationObservation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateDispositionSectionPatientConditionChangeAtDestinationObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispositionSectionOperations.validateDispositionSectionPatientConditionChangeAtDestinationObservation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public NumberOfPatientsObservation getNumberOfPatientsObservation() {
		return DispositionSectionOperations.getNumberOfPatientsObservation(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public IncidentDispositionObservation getIncidentDispositionObservation() {
		return DispositionSectionOperations.getIncidentDispositionObservation(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public TransportModeObservation getTransportModeObservation() {
		return DispositionSectionOperations.getTransportModeObservation(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public TransportMethodObservation getTransportMethodObservation() {
		return DispositionSectionOperations.getTransportMethodObservation(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ReasonForChoosingDestinationObservation getReasonForChoosingDestinationObservation() {
		return DispositionSectionOperations.getReasonForChoosingDestinationObservation(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PrearrivalActivationObservation getPrearrivalActivationObservation() {
		return DispositionSectionOperations.getPrearrivalActivationObservation(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PatientConditionChangeAtDestinationObservation getPatientConditionChangeAtDestinationObservation() {
		return DispositionSectionOperations.getPatientConditionChangeAtDestinationObservation(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public DispositionSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispositionSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // DispositionSectionImpl
