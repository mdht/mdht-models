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

import org.openhealthtools.mdht.uml.cda.sdtm.AssayQuantitation;
import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.FastingStatus;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.PharmacokineticConcentrationFindingOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pharmacokinetic Concentration Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PharmacokineticConcentrationFindingImpl extends ObservationImpl implements PharmacokineticConcentrationFinding {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PharmacokineticConcentrationFindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingMethodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingMethodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingMethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingInterpretationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingInterpretationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingInterpretationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingGroupIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingSpecimenInformation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingStudyTestPerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingStudyTestPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingPlannedStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingPlannedStudyDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingExclusionReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingExclusionReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingSubCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingFastingStatus(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingFastingStatus(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingAssayQuantitation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingAssayQuantitation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticConcentrationFindingFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingFindingAbout(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier getGroupIdentifier() {
		return PharmacokineticConcentrationFindingOperations.getGroupIdentifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenInformation getSpecimenInformation() {
		return PharmacokineticConcentrationFindingOperations.getSpecimenInformation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return PharmacokineticConcentrationFindingOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedStudyDay getPlannedStudyDay() {
		return PharmacokineticConcentrationFindingOperations.getPlannedStudyDay(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExclusionReason getExclusionReason() {
		return PharmacokineticConcentrationFindingOperations.getExclusionReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return PharmacokineticConcentrationFindingOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return PharmacokineticConcentrationFindingOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return PharmacokineticConcentrationFindingOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return PharmacokineticConcentrationFindingOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return PharmacokineticConcentrationFindingOperations.getCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory getSubCategory() {
		return PharmacokineticConcentrationFindingOperations.getSubCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FastingStatus getFastingStatus() {
		return PharmacokineticConcentrationFindingOperations.getFastingStatus(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssayQuantitation getAssayQuantitation() {
		return PharmacokineticConcentrationFindingOperations.getAssayQuantitation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FindingAbout> getFindingAbouts() {
		return PharmacokineticConcentrationFindingOperations.getFindingAbouts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PharmacokineticConcentrationFinding init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public PharmacokineticConcentrationFinding init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //PharmacokineticConcentrationFindingImpl
