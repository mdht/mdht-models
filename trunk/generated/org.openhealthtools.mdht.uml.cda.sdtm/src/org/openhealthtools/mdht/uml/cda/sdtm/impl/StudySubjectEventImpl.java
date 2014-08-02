/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantTreatment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.EventDuration;
import org.openhealthtools.mdht.uml.cda.sdtm.EventOutcome;
import org.openhealthtools.mdht.uml.cda.sdtm.EventPattern;
import org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.NonStudyTreatmentRelationship;
import org.openhealthtools.mdht.uml.cda.sdtm.OtherTreatmentActionTaken;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentActionTaken;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentCausality;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.Toxicity;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.StudySubjectEventOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Subject Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StudySubjectEventImpl extends ObservationImpl implements StudySubjectEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudySubjectEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.STUDY_SUBJECT_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventTargetSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventTargetSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventGroupIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventEventSeverity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventEventSeverity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventPreSpecifiedEvent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventPreSpecifiedEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventStudyDayPeriod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventBodySystemorOrganClass(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventBodySystemorOrganClass(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventDataCollection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventSeriousEvent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventSeriousEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventStudyTreatmentActionTaken(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventStudyTreatmentActionTaken(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventOtherTreatmentActionTaken(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventOtherTreatmentActionTaken(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventStudyTreatmentCausality(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventStudyTreatmentCausality(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventNonStudyTreatmentRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventNonStudyTreatmentRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventEventPattern(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventEventPattern(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventEventOutcome(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventEventOutcome(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventConcomitantTreatment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventConcomitantTreatment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventToxicity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventToxicity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventSubCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventFindingAbout(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectEventEventDuration(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectEventOperations.validateStudySubjectEventEventDuration(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier getGroupIdentifier() {
		return StudySubjectEventOperations.getGroupIdentifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventorFindingSeverity getEventSeverity() {
		return StudySubjectEventOperations.getEventSeverity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreSpecifiedEvent getPreSpecifiedEvent() {
		return StudySubjectEventOperations.getPreSpecifiedEvent(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyDayPeriod getStudyDayPeriod() {
		return StudySubjectEventOperations.getStudyDayPeriod(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodySystemorOrganClass getBodySystemorOrganClass() {
		return StudySubjectEventOperations.getBodySystemorOrganClass(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return StudySubjectEventOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return StudySubjectEventOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return StudySubjectEventOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return StudySubjectEventOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCollection getDataCollection() {
		return StudySubjectEventOperations.getDataCollection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return StudySubjectEventOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeriousEvent getSeriousEvent() {
		return StudySubjectEventOperations.getSeriousEvent(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyTreatmentActionTaken getStudyTreatmentActionTaken() {
		return StudySubjectEventOperations.getStudyTreatmentActionTaken(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OtherTreatmentActionTaken getOtherTreatmentActionTaken() {
		return StudySubjectEventOperations.getOtherTreatmentActionTaken(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyTreatmentCausality getStudyTreatmentCausality() {
		return StudySubjectEventOperations.getStudyTreatmentCausality(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonStudyTreatmentRelationship getNonStudyTreatmentRelationship() {
		return StudySubjectEventOperations.getNonStudyTreatmentRelationship(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventPattern getEventPattern() {
		return StudySubjectEventOperations.getEventPattern(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventOutcome getEventOutcome() {
		return StudySubjectEventOperations.getEventOutcome(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcomitantTreatment getConcomitantTreatment() {
		return StudySubjectEventOperations.getConcomitantTreatment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Toxicity getToxicity() {
		return StudySubjectEventOperations.getToxicity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return StudySubjectEventOperations.getCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory getSubCategory() {
		return StudySubjectEventOperations.getSubCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FindingAbout> getFindingAbouts() {
		return StudySubjectEventOperations.getFindingAbouts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventDuration getEventDuration() {
		return StudySubjectEventOperations.getEventDuration(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudySubjectEvent init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public StudySubjectEvent init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //StudySubjectEventImpl
