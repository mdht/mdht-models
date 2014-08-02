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

import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.PhysicalExaminationFindingOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Examination Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PhysicalExaminationFindingImpl extends ObservationImpl implements PhysicalExaminationFinding {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalExaminationFindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExaminationFindingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExaminationFindingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExaminationFindingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExaminationFindingId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExaminationFindingCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExaminationFindingCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExaminationFindingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExaminationFindingValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExaminationFindingMethodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingMethodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExaminationFindingMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingMethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExaminationFindingTargetSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingTargetSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExaminationFindingTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExaminationFindingGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingGroupIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExaminationFindingBodySystemorOrganClass(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingBodySystemorOrganClass(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExaminationFindingNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExaminationFindingStudyFindingEvaluator(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingStudyFindingEvaluator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExaminationFindingDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingDataCollection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExaminationFindingComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExaminationFindingDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExaminationFindingRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExaminationFindingSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExaminationFindingCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExaminationFindingSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingSubCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExaminationFindingFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingFindingAbout(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier getGroupIdentifier() {
		return PhysicalExaminationFindingOperations.getGroupIdentifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodySystemorOrganClass getBodySystemorOrganClass() {
		return PhysicalExaminationFindingOperations.getBodySystemorOrganClass(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return PhysicalExaminationFindingOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCollection getDataCollection() {
		return PhysicalExaminationFindingOperations.getDataCollection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return PhysicalExaminationFindingOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return PhysicalExaminationFindingOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return PhysicalExaminationFindingOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return PhysicalExaminationFindingOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return PhysicalExaminationFindingOperations.getCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory getSubCategory() {
		return PhysicalExaminationFindingOperations.getSubCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FindingAbout> getFindingAbouts() {
		return PhysicalExaminationFindingOperations.getFindingAbouts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalExaminationFinding init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public PhysicalExaminationFinding init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //PhysicalExaminationFindingImpl
