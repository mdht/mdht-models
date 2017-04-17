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
import org.openhealthtools.mdht.uml.cda.sdtm.FastingStatus;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.Toxicity;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.HumanClinicalLaboratoryTestResultOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Human Clinical Laboratory Test Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HumanClinicalLaboratoryTestResultImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements HumanClinicalLaboratoryTestResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HumanClinicalLaboratoryTestResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.HUMAN_CLINICAL_LABORATORY_TEST_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultMethodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultMethodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultMethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultInterpretationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultInterpretationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultInterpretationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultGroupIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultSpecimenInformation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultStudyTestOrganization(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultStudyTestOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultTimingReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultToxicity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultToxicity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultSubCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultFastingStatus(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultFastingStatus(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalLaboratoryTestResultFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultFindingAbout(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier getGroupIdentifier() {
		return HumanClinicalLaboratoryTestResultOperations.getGroupIdentifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenInformation getSpecimenInformation() {
		return HumanClinicalLaboratoryTestResultOperations.getSpecimenInformation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return HumanClinicalLaboratoryTestResultOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimingReference getTimingReference() {
		return HumanClinicalLaboratoryTestResultOperations.getTimingReference(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return HumanClinicalLaboratoryTestResultOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return HumanClinicalLaboratoryTestResultOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return HumanClinicalLaboratoryTestResultOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return HumanClinicalLaboratoryTestResultOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Toxicity getToxicity() {
		return HumanClinicalLaboratoryTestResultOperations.getToxicity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return HumanClinicalLaboratoryTestResultOperations.getCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory getSubCategory() {
		return HumanClinicalLaboratoryTestResultOperations.getSubCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FastingStatus getFastingStatus() {
		return HumanClinicalLaboratoryTestResultOperations.getFastingStatus(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FindingAbout> getFindingAbouts() {
		return HumanClinicalLaboratoryTestResultOperations.getFindingAbouts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HumanClinicalLaboratoryTestResult init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public HumanClinicalLaboratoryTestResult init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //HumanClinicalLaboratoryTestResultImpl
