/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.ResultCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.ClinicalObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clinical Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ClinicalObservationImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements ClinicalObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClinicalObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.CLINICAL_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationTargetSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationTargetSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationInterpretationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationInterpretationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationInterpretationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationGroupIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationBodySystemorOrganClass(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationBodySystemorOrganClass(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationStudyFindingEvaluator(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationStudyFindingEvaluator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationEventSeverity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationEventSeverity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationPlannedStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationPlannedStudyDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationDataCollection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationTimingReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationMassIdentification(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationMassIdentification(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationExclusionReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationExclusionReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationSubCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalObservationResultCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalObservationOperations.validateClinicalObservationResultCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier getGroupIdentifier() {
		return ClinicalObservationOperations.getGroupIdentifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodySystemorOrganClass getBodySystemorOrganClass() {
		return ClinicalObservationOperations.getBodySystemorOrganClass(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return ClinicalObservationOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventorFindingSeverity getEventSeverity() {
		return ClinicalObservationOperations.getEventSeverity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedStudyDay getPlannedStudyDay() {
		return ClinicalObservationOperations.getPlannedStudyDay(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCollection getDataCollection() {
		return ClinicalObservationOperations.getDataCollection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimingReference getTimingReference() {
		return ClinicalObservationOperations.getTimingReference(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExclusionReason getExclusionReason() {
		return ClinicalObservationOperations.getExclusionReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return ClinicalObservationOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return ClinicalObservationOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return ClinicalObservationOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return ClinicalObservationOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return ClinicalObservationOperations.getCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory getSubCategory() {
		return ClinicalObservationOperations.getSubCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultCategory getResultCategory() {
		return ClinicalObservationOperations.getResultCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClinicalObservation init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public ClinicalObservation init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //ClinicalObservationImpl
