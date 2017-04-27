/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.AssayQuantitation;
import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DeathRelationship;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.FastingStatus;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PositionofSubject;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.Toxicity;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.StudySubjectFindingOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Subject Finding</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StudySubjectFindingImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements StudySubjectFinding {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudySubjectFindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.STUDY_SUBJECT_FINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingMethodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingMethodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingMethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingInterpretationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingInterpretationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingInterpretationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingTargetSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingTargetSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingStudyTestOrganization(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingStudyTestOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingGroupIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingSpecimenInformation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingToxicity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingToxicity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingSubCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingPositionofSubject(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingPositionofSubject(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingBodySystemorOrganClass(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingBodySystemorOrganClass(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingFastingStatus(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingFastingStatus(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingStudyFindingEvaluator(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingStudyFindingEvaluator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingEventorFindingSeverity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingEventorFindingSeverity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingDeathRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingDeathRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingAssayQuantitation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingAssayQuantitation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudySubjectFindingFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudySubjectFindingOperations.validateStudySubjectFindingFindingAbout(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return StudySubjectFindingOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier getGroupIdentifier() {
		return StudySubjectFindingOperations.getGroupIdentifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenInformation getSpecimenInformation() {
		return StudySubjectFindingOperations.getSpecimenInformation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return StudySubjectFindingOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return StudySubjectFindingOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return StudySubjectFindingOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return StudySubjectFindingOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Toxicity getToxicity() {
		return StudySubjectFindingOperations.getToxicity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return StudySubjectFindingOperations.getCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory getSubCategory() {
		return StudySubjectFindingOperations.getSubCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositionofSubject getPositionofSubject() {
		return StudySubjectFindingOperations.getPositionofSubject(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodySystemorOrganClass getBodySystemorOrganClass() {
		return StudySubjectFindingOperations.getBodySystemorOrganClass(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FastingStatus getFastingStatus() {
		return StudySubjectFindingOperations.getFastingStatus(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventorFindingSeverity getEventorFindingSeverity() {
		return StudySubjectFindingOperations.getEventorFindingSeverity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeathRelationship getDeathRelationship() {
		return StudySubjectFindingOperations.getDeathRelationship(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssayQuantitation getAssayQuantitation() {
		return StudySubjectFindingOperations.getAssayQuantitation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FindingAbout> getFindingAbouts() {
		return StudySubjectFindingOperations.getFindingAbouts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudySubjectFinding init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public StudySubjectFinding init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //StudySubjectFindingImpl
