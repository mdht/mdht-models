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
import org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability;
import org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.DrugAccountabilityOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drug Accountability</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DrugAccountabilityImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements DrugAccountability {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DrugAccountabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.DRUG_ACCOUNTABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugAccountabilityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugAccountabilityOperations.validateDrugAccountabilityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugAccountabilityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugAccountabilityOperations.validateDrugAccountabilityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugAccountabilityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugAccountabilityOperations.validateDrugAccountabilityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugAccountabilityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugAccountabilityOperations.validateDrugAccountabilityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugAccountabilityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugAccountabilityOperations.validateDrugAccountabilityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugAccountabilityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugAccountabilityOperations.validateDrugAccountabilityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugAccountabilityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugAccountabilityOperations.validateDrugAccountabilityStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugAccountabilityEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugAccountabilityOperations.validateDrugAccountabilityEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugAccountabilityValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugAccountabilityOperations.validateDrugAccountabilityValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugAccountabilityGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugAccountabilityOperations.validateDrugAccountabilityGroupIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugAccountabilityNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugAccountabilityOperations.validateDrugAccountabilityNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugAccountabilityEventStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugAccountabilityOperations.validateDrugAccountabilityEventStudyDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugAccountabilityCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugAccountabilityOperations.validateDrugAccountabilityCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugAccountabilitySubCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugAccountabilityOperations.validateDrugAccountabilitySubCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugAccountabilityComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugAccountabilityOperations.validateDrugAccountabilityComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugAccountabilityDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugAccountabilityOperations.validateDrugAccountabilityDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugAccountabilityRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugAccountabilityOperations.validateDrugAccountabilityRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugAccountabilitySupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugAccountabilityOperations.validateDrugAccountabilitySupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugAccountabilityFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugAccountabilityOperations.validateDrugAccountabilityFindingAbout(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier getGroupIdentifier() {
		return DrugAccountabilityOperations.getGroupIdentifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return DrugAccountabilityOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventStudyDay getEventStudyDay() {
		return DrugAccountabilityOperations.getEventStudyDay(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return DrugAccountabilityOperations.getCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory getSubCategory() {
		return DrugAccountabilityOperations.getSubCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment getComment() {
		return DrugAccountabilityOperations.getComment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return DrugAccountabilityOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return DrugAccountabilityOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return DrugAccountabilityOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FindingAbout> getFindingAbouts() {
		return DrugAccountabilityOperations.getFindingAbouts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DrugAccountability init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public DrugAccountability init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //DrugAccountabilityImpl
