/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection;

import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.TransitionOfCareAmbulatorySummaryOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Transition Of Care Ambulatory Summary</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TransitionOfCareAmbulatorySummaryImpl extends
		SummaryOfCareRecordImpl implements TransitionOfCareAmbulatorySummary {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionOfCareAmbulatorySummaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.TRANSITION_OF_CARE_AMBULATORY_SUMMARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOfCareAmbulatorySummaryResponsibleParty(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransitionOfCareAmbulatorySummaryOperations.validateTransitionOfCareAmbulatorySummaryResponsibleParty(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOfCareAmbulatorySummaryReasonForReferralSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransitionOfCareAmbulatorySummaryOperations.validateTransitionOfCareAmbulatorySummaryReasonForReferralSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForReferralSection getReasonForReferralSection() {
		return TransitionOfCareAmbulatorySummaryOperations.getReasonForReferralSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionOfCareAmbulatorySummary init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public TransitionOfCareAmbulatorySummary init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // TransitionOfCareAmbulatorySummaryImpl
