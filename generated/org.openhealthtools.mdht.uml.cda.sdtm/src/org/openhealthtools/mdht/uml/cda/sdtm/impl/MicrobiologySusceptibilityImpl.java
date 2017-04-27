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
import org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.ResultCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.MicrobiologySusceptibilityOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microbiology Susceptibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MicrobiologySusceptibilityImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements MicrobiologySusceptibility {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicrobiologySusceptibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilityEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilityValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilityMethodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityMethodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilityMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityMethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilityInterpretationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityInterpretationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilityInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityInterpretationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilityEventStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityEventStudyDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilityTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityTimingReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilityGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityGroupIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilityStudyTestPerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityStudyTestPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilityNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilityComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilityDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilityRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilitySupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitySupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilityCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilitySubCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitySubCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilityResultCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityResultCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicrobiologySusceptibilityFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityFindingAbout(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventStudyDay getEventStudyDay() {
		return MicrobiologySusceptibilityOperations.getEventStudyDay(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimingReference getTimingReference() {
		return MicrobiologySusceptibilityOperations.getTimingReference(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier getGroupIdentifier() {
		return MicrobiologySusceptibilityOperations.getGroupIdentifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return MicrobiologySusceptibilityOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return MicrobiologySusceptibilityOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return MicrobiologySusceptibilityOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return MicrobiologySusceptibilityOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return MicrobiologySusceptibilityOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return MicrobiologySusceptibilityOperations.getCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory getSubCategory() {
		return MicrobiologySusceptibilityOperations.getSubCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultCategory getResultCategory() {
		return MicrobiologySusceptibilityOperations.getResultCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FindingAbout> getFindingAbouts() {
		return MicrobiologySusceptibilityOperations.getFindingAbouts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicrobiologySusceptibility init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public MicrobiologySusceptibility init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //MicrobiologySusceptibilityImpl
