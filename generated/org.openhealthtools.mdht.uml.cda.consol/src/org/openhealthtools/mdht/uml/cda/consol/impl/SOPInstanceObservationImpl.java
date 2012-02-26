/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PurposeofReferenceObservation;
import org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation;
import org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.SOPInstanceObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SOP Instance Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SOPInstanceObservationImpl extends ObservationImpl implements SOPInstanceObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SOPInstanceObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SOP_INSTANCE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationSOPInstanceObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationSOPInstanceObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationPurposeofReferenceObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationPurposeofReferenceObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOPInstanceObservationReferencedFramesObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SOPInstanceObservationOperations.validateSOPInstanceObservationReferencedFramesObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SOPInstanceObservation> getSOPInstanceObservations() {
		return SOPInstanceObservationOperations.getSOPInstanceObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PurposeofReferenceObservation> getPurposeofReferenceObservations() {
		return SOPInstanceObservationOperations.getPurposeofReferenceObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferencedFramesObservation> getReferencedFramesObservations() {
		return SOPInstanceObservationOperations.getReferencedFramesObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SOPInstanceObservation init() {
    	CDAUtil.init(this);
    	return this;
	}
} // SOPInstanceObservationImpl
