/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.DoseAdjustmentReason;
import org.openhealthtools.mdht.uml.cda.sdtm.EventDuration;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure;
import org.openhealthtools.mdht.uml.cda.sdtm.IntendedRegimen;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.HumanClinicalExposureOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Human Clinical Exposure</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HumanClinicalExposureImpl extends org.eclipse.mdht.uml.cda.impl.SubstanceAdministrationImpl implements HumanClinicalExposure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HumanClinicalExposureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureRouteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureRouteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureRouteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureMaxDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureApproachSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureApproachSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureApproachSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureGroupIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureConsumableMaterial(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureConsumableMaterial(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureStudyEpoch(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureStudyEpoch(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureElementOrderAssociation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureElementOrderAssociation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureTimingReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureStudyDayPeriod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureIntendedRegimen(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureIntendedRegimen(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureDoseAdjustmentReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureDoseAdjustmentReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureSubCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureFindingAbout(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureEventDuration(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureEventDuration(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureelementOrderAssociationelementOrderCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureelementOrderAssociationelementOrderCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureelementOrderAssociationelementOrderValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureelementOrderAssociationelementOrderValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureelementOrderAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureelementOrderAssociationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureelementOrderAssociationElementOrder(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalExposureOperations.validateHumanClinicalExposureelementOrderAssociationElementOrder(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier getGroupIdentifier() {
		return HumanClinicalExposureOperations.getGroupIdentifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyEpoch getStudyEpoch() {
		return HumanClinicalExposureOperations.getStudyEpoch(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimingReference getTimingReference() {
		return HumanClinicalExposureOperations.getTimingReference(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyDayPeriod getStudyDayPeriod() {
		return HumanClinicalExposureOperations.getStudyDayPeriod(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return HumanClinicalExposureOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return HumanClinicalExposureOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return HumanClinicalExposureOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return HumanClinicalExposureOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntendedRegimen getIntendedRegimen() {
		return HumanClinicalExposureOperations.getIntendedRegimen(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoseAdjustmentReason getDoseAdjustmentReason() {
		return HumanClinicalExposureOperations.getDoseAdjustmentReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return HumanClinicalExposureOperations.getCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory getSubCategory() {
		return HumanClinicalExposureOperations.getSubCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FindingAbout> getFindingAbouts() {
		return HumanClinicalExposureOperations.getFindingAbouts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventDuration getEventDuration() {
		return HumanClinicalExposureOperations.getEventDuration(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HumanClinicalExposure init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public HumanClinicalExposure init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //HumanClinicalExposureImpl
