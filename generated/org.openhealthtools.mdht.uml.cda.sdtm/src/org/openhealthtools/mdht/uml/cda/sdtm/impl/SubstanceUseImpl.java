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
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.EventDuration;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StartRelativetoReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StopRelativetoReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.SubstanceUseOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SubstanceUseImpl extends org.eclipse.mdht.uml.cda.impl.SubstanceAdministrationImpl implements SubstanceUse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.SUBSTANCE_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseMaxDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseRouteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseRouteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseRouteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseConsumableMaterial(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseConsumableMaterial(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUsePreSpecifiedEvent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUsePreSpecifiedEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseDataCollection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseStudyDayPeriod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseStartRelativetoReferencePeriod(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseStartRelativetoReferencePeriod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseStopRelativetoReferencePeriod(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseStopRelativetoReferencePeriod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseSubCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseFindingAbout(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceUseEventDuration(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceUseOperations.validateSubstanceUseEventDuration(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreSpecifiedEvent getPreSpecifiedEvent() {
		return SubstanceUseOperations.getPreSpecifiedEvent(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return SubstanceUseOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCollection getDataCollection() {
		return SubstanceUseOperations.getDataCollection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyDayPeriod getStudyDayPeriod() {
		return SubstanceUseOperations.getStudyDayPeriod(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return SubstanceUseOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return SubstanceUseOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return SubstanceUseOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return SubstanceUseOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartRelativetoReferencePeriod getStartRelativetoReferencePeriod() {
		return SubstanceUseOperations.getStartRelativetoReferencePeriod(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopRelativetoReferencePeriod getStopRelativetoReferencePeriod() {
		return SubstanceUseOperations.getStopRelativetoReferencePeriod(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return SubstanceUseOperations.getCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory getSubCategory() {
		return SubstanceUseOperations.getSubCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FindingAbout> getFindingAbouts() {
		return SubstanceUseOperations.getFindingAbouts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventDuration getEventDuration() {
		return SubstanceUseOperations.getEventDuration(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceUse init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public SubstanceUse init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //SubstanceUseImpl
