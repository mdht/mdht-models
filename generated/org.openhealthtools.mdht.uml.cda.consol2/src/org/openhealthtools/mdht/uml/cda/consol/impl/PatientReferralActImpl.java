/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.PatientReferralActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Referral Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PatientReferralActImpl extends ActImpl implements PatientReferralAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientReferralActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PATIENT_REFERRAL_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActMoodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActMoodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActPriorityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActPriorityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActEntryRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActEntryRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActAuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActAuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActIndication2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActIndication2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActParticipant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActParticipant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActEntryRelationshipObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActEntryRelationshipObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActEntryRelationshipObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActEntryRelationshipObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActEntryRelationshipObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActEntryRelationshipObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActEntryRelationshipObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActEntryRelationshipObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActEntryRelationshipObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActEntryRelationshipObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActEntryRelationshipObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActEntryRelationshipObservationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActEntryRelationshipObservationPriorityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActEntryRelationshipObservationPriorityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActEntryRelationshipObservationPriorityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActEntryRelationshipObservationPriorityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActEntryRelationshipObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActEntryRelationshipObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActEntryRelationshipObservationValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActEntryRelationshipObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActEntryRelationshipTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActEntryRelationshipTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActEntryRelationshipObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActEntryRelationshipObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActParticipantParticipantRoleCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActParticipantParticipantRoleCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActParticipantParticipantRoleCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActParticipantParticipantRoleCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActParticipantTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActParticipantTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReferralActParticipantParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientReferralActOperations.validatePatientReferralActParticipantParticipantRole(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Indication2> getIndication2s() {
		return PatientReferralActOperations.getIndication2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientReferralAct init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PatientReferralAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // PatientReferralActImpl
