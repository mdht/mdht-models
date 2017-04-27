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
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.ResultCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.MicrobiologySpecimenFindingOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microbiology Specimen Finding</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MicrobiologySpecimenFindingImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements MicrobiologySpecimenFinding {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicrobiologySpecimenFindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySpecimenFindingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySpecimenFindingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySpecimenFindingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySpecimenFindingId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySpecimenFindingCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySpecimenFindingCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySpecimenFindingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySpecimenFindingValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySpecimenFindingMethodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingMethodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySpecimenFindingMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingMethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySpecimenFindingInterpretationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingInterpretationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySpecimenFindingInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingInterpretationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySpecimenFindingGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingGroupIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySpecimenFindingStudyTestPerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingStudyTestPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySpecimenFindingNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySpecimenFindingSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingSpecimenInformation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySpecimenFindingComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySpecimenFindingDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySpecimenFindingRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySpecimenFindingSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySpecimenFindingCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySpecimenFindingSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingSubCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySpecimenFindingResultCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingResultCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySpecimenFindingFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingFindingAbout(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier getGroupIdentifier() {
		return MicrobiologySpecimenFindingOperations.getGroupIdentifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return MicrobiologySpecimenFindingOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenInformation getSpecimenInformation() {
		return MicrobiologySpecimenFindingOperations.getSpecimenInformation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return MicrobiologySpecimenFindingOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return MicrobiologySpecimenFindingOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return MicrobiologySpecimenFindingOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return MicrobiologySpecimenFindingOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return MicrobiologySpecimenFindingOperations.getCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory getSubCategory() {
		return MicrobiologySpecimenFindingOperations.getSubCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultCategory getResultCategory() {
		return MicrobiologySpecimenFindingOperations.getResultCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FindingAbout> getFindingAbouts() {
		return MicrobiologySpecimenFindingOperations.getFindingAbouts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicrobiologySpecimenFinding init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public MicrobiologySpecimenFinding init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //MicrobiologySpecimenFindingImpl
