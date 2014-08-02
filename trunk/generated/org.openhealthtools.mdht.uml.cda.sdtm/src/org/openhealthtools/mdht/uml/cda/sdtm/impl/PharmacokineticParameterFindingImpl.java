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
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.PharmacokineticParameterFindingOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pharmacokinetic Parameter Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PharmacokineticParameterFindingImpl extends ObservationImpl implements PharmacokineticParameterFinding {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PharmacokineticParameterFindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.PHARMACOKINETIC_PARAMETER_FINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticParameterFindingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticParameterFindingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticParameterFindingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticParameterFindingId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticParameterFindingCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticParameterFindingCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticParameterFindingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticParameterFindingValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticParameterFindingGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingGroupIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticParameterFindingSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingSpecimenInformation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticParameterFindingNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticParameterFindingTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingTimingReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticParameterFindingComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticParameterFindingDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticParameterFindingRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticParameterFindingSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticParameterFindingCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticParameterFindingSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingSubCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePharmacokineticParameterFindingFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingFindingAbout(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier getGroupIdentifier() {
		return PharmacokineticParameterFindingOperations.getGroupIdentifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenInformation getSpecimenInformation() {
		return PharmacokineticParameterFindingOperations.getSpecimenInformation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return PharmacokineticParameterFindingOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimingReference getTimingReference() {
		return PharmacokineticParameterFindingOperations.getTimingReference(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return PharmacokineticParameterFindingOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return PharmacokineticParameterFindingOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return PharmacokineticParameterFindingOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return PharmacokineticParameterFindingOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return PharmacokineticParameterFindingOperations.getCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory getSubCategory() {
		return PharmacokineticParameterFindingOperations.getSubCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FindingAbout> getFindingAbouts() {
		return PharmacokineticParameterFindingOperations.getFindingAbouts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PharmacokineticParameterFinding init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public PharmacokineticParameterFinding init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //PharmacokineticParameterFindingImpl
