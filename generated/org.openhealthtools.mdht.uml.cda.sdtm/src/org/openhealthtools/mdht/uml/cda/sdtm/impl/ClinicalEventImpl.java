/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StartRelativetoReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StopRelativetoReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.ClinicalEventOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clinical Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ClinicalEventImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements ClinicalEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClinicalEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.CLINICAL_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalEventTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalEventOperations.validateClinicalEventTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalEventClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalEventOperations.validateClinicalEventClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalEventMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalEventOperations.validateClinicalEventMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalEventCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalEventOperations.validateClinicalEventCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalEventCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalEventOperations.validateClinicalEventCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalEventCodeVS(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalEventOperations.validateClinicalEventCodeVS(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalEventEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalEventOperations.validateClinicalEventEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalEventId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalEventOperations.validateClinicalEventId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalEventStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalEventOperations.validateClinicalEventStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalEventValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalEventOperations.validateClinicalEventValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalEventValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalEventOperations.validateClinicalEventValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalEventPreSpecifiedEvent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalEventOperations.validateClinicalEventPreSpecifiedEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalEventNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalEventOperations.validateClinicalEventNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalEventBodySystemorOrganClass(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalEventOperations.validateClinicalEventBodySystemorOrganClass(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalEventDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalEventOperations.validateClinicalEventDataCollection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalEventEventSeverity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalEventOperations.validateClinicalEventEventSeverity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalEventComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalEventOperations.validateClinicalEventComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalEventDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalEventOperations.validateClinicalEventDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalEventRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalEventOperations.validateClinicalEventRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalEventSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalEventOperations.validateClinicalEventSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalEventStartRelativetoReferencePeriod(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalEventOperations.validateClinicalEventStartRelativetoReferencePeriod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalEventStopRelativetoReferencePeriod(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalEventOperations.validateClinicalEventStopRelativetoReferencePeriod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalEventCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalEventOperations.validateClinicalEventCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateClinicalEventFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalEventOperations.validateClinicalEventFindingAbout(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreSpecifiedEvent getPreSpecifiedEvent() {
		return ClinicalEventOperations.getPreSpecifiedEvent(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return ClinicalEventOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodySystemorOrganClass getBodySystemorOrganClass() {
		return ClinicalEventOperations.getBodySystemorOrganClass(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCollection getDataCollection() {
		return ClinicalEventOperations.getDataCollection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventorFindingSeverity getEventSeverity() {
		return ClinicalEventOperations.getEventSeverity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return ClinicalEventOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return ClinicalEventOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return ClinicalEventOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return ClinicalEventOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartRelativetoReferencePeriod getStartRelativetoReferencePeriod() {
		return ClinicalEventOperations.getStartRelativetoReferencePeriod(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopRelativetoReferencePeriod getStopRelativetoReferencePeriod() {
		return ClinicalEventOperations.getStopRelativetoReferencePeriod(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return ClinicalEventOperations.getCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory getSubCategory() {
		return ClinicalEventOperations.getSubCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FindingAbout> getFindingAbouts() {
		return ClinicalEventOperations.getFindingAbouts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClinicalEvent init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public ClinicalEvent init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //ClinicalEventImpl
