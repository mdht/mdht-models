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

import org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.DoseAdjustmentReason;
import org.openhealthtools.mdht.uml.cda.sdtm.EventDuration;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.Indication;
import org.openhealthtools.mdht.uml.cda.sdtm.IntendedRegimen;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.StudySubjectInterventionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Subject Intervention</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StudySubjectInterventionImpl extends SubstanceAdministrationImpl implements StudySubjectIntervention {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudySubjectInterventionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionRouteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionRouteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionRouteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionMaxDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionApproachSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionApproachSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionApproachSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionGroupIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionStudyEpoch(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionStudyEpoch(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionElementOrderAssociation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionElementOrderAssociation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionTimingReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionStudyDayPeriod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionPreSpecifiedEvent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionPreSpecifiedEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionDataCollection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionIndication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionIndication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionIntendedRegimen(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionIntendedRegimen(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionDoseAdjustmentReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionDoseAdjustmentReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionSubCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionFindingAbout(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionEventDuration(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionEventDuration(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionConsumableMaterial(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionConsumableMaterial(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionelementOrderAssociationelementOrderClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionelementOrderAssociationelementOrderClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionelementOrderAssociationelementOrderCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionelementOrderAssociationelementOrderCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionelementOrderAssociationelementOrderCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionelementOrderAssociationelementOrderCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionelementOrderAssociationelementOrderMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionelementOrderAssociationelementOrderMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionelementOrderAssociationelementOrderValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionelementOrderAssociationelementOrderValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionelementOrderAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionelementOrderAssociationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectInterventionelementOrderAssociationElementOrder(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectInterventionOperations.validateStudySubjectInterventionelementOrderAssociationElementOrder(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier getGroupIdentifier() {
		return StudySubjectInterventionOperations.getGroupIdentifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyEpoch getStudyEpoch() {
		return StudySubjectInterventionOperations.getStudyEpoch(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimingReference getTimingReference() {
		return StudySubjectInterventionOperations.getTimingReference(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyDayPeriod getStudyDayPeriod() {
		return StudySubjectInterventionOperations.getStudyDayPeriod(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreSpecifiedEvent getPreSpecifiedEvent() {
		return StudySubjectInterventionOperations.getPreSpecifiedEvent(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCollection getDataCollection() {
		return StudySubjectInterventionOperations.getDataCollection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return StudySubjectInterventionOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return StudySubjectInterventionOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return StudySubjectInterventionOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return StudySubjectInterventionOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return StudySubjectInterventionOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Indication getIndication() {
		return StudySubjectInterventionOperations.getIndication(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntendedRegimen getIntendedRegimen() {
		return StudySubjectInterventionOperations.getIntendedRegimen(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoseAdjustmentReason getDoseAdjustmentReason() {
		return StudySubjectInterventionOperations.getDoseAdjustmentReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return StudySubjectInterventionOperations.getCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory getSubCategory() {
		return StudySubjectInterventionOperations.getSubCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FindingAbout> getFindingAbouts() {
		return StudySubjectInterventionOperations.getFindingAbouts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventDuration getEventDuration() {
		return StudySubjectInterventionOperations.getEventDuration(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudySubjectIntervention init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public StudySubjectIntervention init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //StudySubjectInterventionImpl
