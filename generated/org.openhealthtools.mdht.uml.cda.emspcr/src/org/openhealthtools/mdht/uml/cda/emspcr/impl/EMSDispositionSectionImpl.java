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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsTransportedObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionChangeAtDestinationObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.TransportModeObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSDispositionSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Disposition Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSDispositionSectionImpl extends SectionImpl implements EMSDispositionSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSDispositionSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_DISPOSITION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionNumberOfPatientsObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionNumberOfPatientsObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionIncidentDispositionObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionIncidentDispositionObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionTransportModeObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionTransportModeObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionTransportMethodObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionTransportMethodObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionReasonForChoosingDestinationObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionReasonForChoosingDestinationObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionPrearrivalActivationObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionPrearrivalActivationObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionPatientConditionChangeAtDestinationObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionPatientConditionChangeAtDestinationObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberOfPatientsTransportedObservation getNumberOfPatientsObservation() {
		return EMSDispositionSectionOperations.getNumberOfPatientsObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncidentDispositionObservation getIncidentDispositionObservation() {
		return EMSDispositionSectionOperations.getIncidentDispositionObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportModeObservation getTransportModeObservation() {
		return EMSDispositionSectionOperations.getTransportModeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportMethodObservation getTransportMethodObservation() {
		return EMSDispositionSectionOperations.getTransportMethodObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForChoosingDestinationObservation getReasonForChoosingDestinationObservation() {
		return EMSDispositionSectionOperations.getReasonForChoosingDestinationObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrearrivalActivationObservation getPrearrivalActivationObservation() {
		return EMSDispositionSectionOperations.getPrearrivalActivationObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientConditionChangeAtDestinationObservation getPatientConditionChangeAtDestinationObservation() {
		return EMSDispositionSectionOperations.getPatientConditionChangeAtDestinationObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSDispositionSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSDispositionSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EMSDispositionSectionImpl
