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

import org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.DoseAdjustmentReason;
import org.openhealthtools.mdht.uml.cda.sdtm.EventDuration;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.NonhumanExposureOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nonhuman Exposure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NonhumanExposureImpl extends SubstanceAdministrationImpl implements NonhumanExposure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonhumanExposureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.NONHUMAN_EXPOSURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanExposureTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanExposureOperations.validateNonhumanExposureTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanExposureClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanExposureOperations.validateNonhumanExposureClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanExposureMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanExposureOperations.validateNonhumanExposureMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanExposureDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanExposureOperations.validateNonhumanExposureDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanExposureEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanExposureOperations.validateNonhumanExposureEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanExposureId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanExposureOperations.validateNonhumanExposureId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanExposureRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanExposureOperations.validateNonhumanExposureRouteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanExposureRouteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanExposureOperations.validateNonhumanExposureRouteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanExposureMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanExposureOperations.validateNonhumanExposureMaxDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanExposureText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanExposureOperations.validateNonhumanExposureText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanExposureApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanExposureOperations.validateNonhumanExposureApproachSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanExposureApproachSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanExposureOperations.validateNonhumanExposureApproachSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanExposureConsumableMaterial(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanExposureOperations.validateNonhumanExposureConsumableMaterial(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanExposureTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanExposureOperations.validateNonhumanExposureTimingReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanExposureStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanExposureOperations.validateNonhumanExposureStudyDayPeriod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanExposureComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanExposureOperations.validateNonhumanExposureComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanExposureDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanExposureOperations.validateNonhumanExposureDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanExposureRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanExposureOperations.validateNonhumanExposureRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanExposureSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanExposureOperations.validateNonhumanExposureSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanExposureDoseAdjustmentReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanExposureOperations.validateNonhumanExposureDoseAdjustmentReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanExposureCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanExposureOperations.validateNonhumanExposureCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanExposureSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanExposureOperations.validateNonhumanExposureSubCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanExposureEventDuration(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanExposureOperations.validateNonhumanExposureEventDuration(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimingReference getTimingReference() {
		return NonhumanExposureOperations.getTimingReference(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyDayPeriod getStudyDayPeriod() {
		return NonhumanExposureOperations.getStudyDayPeriod(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return NonhumanExposureOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return NonhumanExposureOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return NonhumanExposureOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return NonhumanExposureOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoseAdjustmentReason getDoseAdjustmentReason() {
		return NonhumanExposureOperations.getDoseAdjustmentReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return NonhumanExposureOperations.getCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory getSubCategory() {
		return NonhumanExposureOperations.getSubCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventDuration getEventDuration() {
		return NonhumanExposureOperations.getEventDuration(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonhumanExposure init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public NonhumanExposure init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //NonhumanExposureImpl
