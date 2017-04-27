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
import org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.PositionofSubject;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.ECGTestResultOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECG Test Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ECGTestResultImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements ECGTestResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECGTestResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.ECG_TEST_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultMethodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultMethodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultMethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultInterpretationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultInterpretationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultInterpretationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultGroupIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultLeadLocationAssociation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultLeadLocationAssociation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultTimingReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultStudyTestPerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultStudyTestPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultStudyFindingEvaluator(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultStudyFindingEvaluator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultAssociatedConsciousness(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultAssociatedConsciousness(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultPlannedStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultPlannedStudyDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultStudyDayPeriod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultSubCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultPositionofSubject(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultPositionofSubject(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultFindingAbout(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultleadLocationAssociationecgLeadLocationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultleadLocationAssociationecgLeadLocationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultleadLocationAssociationecgLeadLocationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultleadLocationAssociationecgLeadLocationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultleadLocationAssociationecgLeadLocationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultleadLocationAssociationecgLeadLocationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultleadLocationAssociationecgLeadLocationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultleadLocationAssociationecgLeadLocationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultleadLocationAssociationecgLeadLocationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultleadLocationAssociationecgLeadLocationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultleadLocationAssociationecgLeadLocationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultleadLocationAssociationecgLeadLocationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultleadLocationAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultleadLocationAssociationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultleadLocationAssociationEcgLeadLocation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultleadLocationAssociationEcgLeadLocation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultassociatedConsciousnessconsciousnessStateClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultassociatedConsciousnessconsciousnessStateClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultassociatedConsciousnessconsciousnessStateCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultassociatedConsciousnessconsciousnessStateCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultassociatedConsciousnessconsciousnessStateCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultassociatedConsciousnessconsciousnessStateCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultassociatedConsciousnessconsciousnessStateMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultassociatedConsciousnessconsciousnessStateMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultassociatedConsciousnessconsciousnessStateValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultassociatedConsciousnessconsciousnessStateValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultassociatedConsciousnessconsciousnessStateValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultassociatedConsciousnessconsciousnessStateValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultassociatedConsciousnessTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultassociatedConsciousnessTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateECGTestResultassociatedConsciousnessConsciousnessState(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ECGTestResultOperations.validateECGTestResultassociatedConsciousnessConsciousnessState(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier getGroupIdentifier() {
		return ECGTestResultOperations.getGroupIdentifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return ECGTestResultOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimingReference getTimingReference() {
		return ECGTestResultOperations.getTimingReference(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedStudyDay getPlannedStudyDay() {
		return ECGTestResultOperations.getPlannedStudyDay(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyDayPeriod getStudyDayPeriod() {
		return ECGTestResultOperations.getStudyDayPeriod(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return ECGTestResultOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return ECGTestResultOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return ECGTestResultOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return ECGTestResultOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return ECGTestResultOperations.getCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory getSubCategory() {
		return ECGTestResultOperations.getSubCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositionofSubject getPositionofSubject() {
		return ECGTestResultOperations.getPositionofSubject(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FindingAbout> getFindingAbouts() {
		return ECGTestResultOperations.getFindingAbouts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ECGTestResult init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public ECGTestResult init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //ECGTestResultImpl
