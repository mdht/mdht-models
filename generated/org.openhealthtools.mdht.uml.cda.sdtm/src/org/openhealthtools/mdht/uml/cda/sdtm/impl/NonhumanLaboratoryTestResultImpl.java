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

import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.FastingStatus;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.Toxicity;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.NonhumanLaboratoryTestResultOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nonhuman Laboratory Test Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NonhumanLaboratoryTestResultImpl extends ObservationImpl implements NonhumanLaboratoryTestResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonhumanLaboratoryTestResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultMethodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultMethodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultMethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultInterpretationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultInterpretationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultInterpretationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultGroupIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultSpecimenInformation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultStudyTestPerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultStudyTestPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultExclusionIndicator(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultExclusionIndicator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultPlannedStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultPlannedStudyDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultStudyDayPeriod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultTimingReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultToxicity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultToxicity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultSubCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanLaboratoryTestResultFastingStatus(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultFastingStatus(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier getGroupIdentifier() {
		return NonhumanLaboratoryTestResultOperations.getGroupIdentifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenInformation getSpecimenInformation() {
		return NonhumanLaboratoryTestResultOperations.getSpecimenInformation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return NonhumanLaboratoryTestResultOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExclusionReason getExclusionIndicator() {
		return NonhumanLaboratoryTestResultOperations.getExclusionIndicator(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedStudyDay getPlannedStudyDay() {
		return NonhumanLaboratoryTestResultOperations.getPlannedStudyDay(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyDayPeriod getStudyDayPeriod() {
		return NonhumanLaboratoryTestResultOperations.getStudyDayPeriod(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimingReference getTimingReference() {
		return NonhumanLaboratoryTestResultOperations.getTimingReference(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return NonhumanLaboratoryTestResultOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return NonhumanLaboratoryTestResultOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return NonhumanLaboratoryTestResultOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return NonhumanLaboratoryTestResultOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Toxicity getToxicity() {
		return NonhumanLaboratoryTestResultOperations.getToxicity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return NonhumanLaboratoryTestResultOperations.getCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory getSubCategory() {
		return NonhumanLaboratoryTestResultOperations.getSubCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FastingStatus getFastingStatus() {
		return NonhumanLaboratoryTestResultOperations.getFastingStatus(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonhumanLaboratoryTestResult init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public NonhumanLaboratoryTestResult init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //NonhumanLaboratoryTestResultImpl
