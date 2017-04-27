/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantTreatment;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.EventDuration;
import org.openhealthtools.mdht.uml.cda.sdtm.EventOutcome;
import org.openhealthtools.mdht.uml.cda.sdtm.EventPattern;
import org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonStudyTreatmentRelationship;
import org.openhealthtools.mdht.uml.cda.sdtm.OtherTreatmentActionTaken;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.StartRelativetoReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StopRelativetoReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentActionTaken;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentCausality;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.Toxicity;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.AdverseEventOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adverse Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AdverseEventImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements AdverseEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdverseEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.ADVERSE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventTargetSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventTargetSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventGroupIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventBodySystemorOrganClass(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventBodySystemorOrganClass(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventEventSeverity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventEventSeverity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventPreSpecifiedEvent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventPreSpecifiedEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventStudyDayPeriod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventStartRelativetoReferencePeriod(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventStartRelativetoReferencePeriod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventStopRelativetoReferencePeriod(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventStopRelativetoReferencePeriod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventSeriousEvent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventSeriousEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventStudyTreatmentActionTaken(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventStudyTreatmentActionTaken(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventOtherTreatmentActionTaken(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventOtherTreatmentActionTaken(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventStudyTreatmentCausality(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventStudyTreatmentCausality(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventNonStudyTreatmentRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventNonStudyTreatmentRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventEventPattern(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventEventPattern(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventEventOutcome(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventEventOutcome(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventConcomitantTreatment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventConcomitantTreatment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventToxicity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventToxicity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventSubCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventFindingAbout(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdverseEventEventDuration(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdverseEventOperations.validateAdverseEventEventDuration(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier getGroupIdentifier() {
		return AdverseEventOperations.getGroupIdentifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodySystemorOrganClass getBodySystemorOrganClass() {
		return AdverseEventOperations.getBodySystemorOrganClass(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventorFindingSeverity getEventSeverity() {
		return AdverseEventOperations.getEventSeverity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreSpecifiedEvent getPreSpecifiedEvent() {
		return AdverseEventOperations.getPreSpecifiedEvent(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyDayPeriod getStudyDayPeriod() {
		return AdverseEventOperations.getStudyDayPeriod(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return AdverseEventOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return AdverseEventOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return AdverseEventOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return AdverseEventOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartRelativetoReferencePeriod getStartRelativetoReferencePeriod() {
		return AdverseEventOperations.getStartRelativetoReferencePeriod(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopRelativetoReferencePeriod getStopRelativetoReferencePeriod() {
		return AdverseEventOperations.getStopRelativetoReferencePeriod(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeriousEvent getSeriousEvent() {
		return AdverseEventOperations.getSeriousEvent(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyTreatmentActionTaken getStudyTreatmentActionTaken() {
		return AdverseEventOperations.getStudyTreatmentActionTaken(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OtherTreatmentActionTaken getOtherTreatmentActionTaken() {
		return AdverseEventOperations.getOtherTreatmentActionTaken(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyTreatmentCausality getStudyTreatmentCausality() {
		return AdverseEventOperations.getStudyTreatmentCausality(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonStudyTreatmentRelationship getNonStudyTreatmentRelationship() {
		return AdverseEventOperations.getNonStudyTreatmentRelationship(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventPattern getEventPattern() {
		return AdverseEventOperations.getEventPattern(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventOutcome getEventOutcome() {
		return AdverseEventOperations.getEventOutcome(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcomitantTreatment getConcomitantTreatment() {
		return AdverseEventOperations.getConcomitantTreatment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Toxicity getToxicity() {
		return AdverseEventOperations.getToxicity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return AdverseEventOperations.getCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory getSubCategory() {
		return AdverseEventOperations.getSubCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FindingAbout getFindingAbout() {
		return AdverseEventOperations.getFindingAbout(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventDuration getEventDuration() {
		return AdverseEventOperations.getEventDuration(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdverseEvent init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public AdverseEvent init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //AdverseEventImpl
