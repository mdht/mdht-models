/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DeathRelationship;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.ResultCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.MicroscopicFindingOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microscopic Finding</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MicroscopicFindingImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements MicroscopicFinding {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroscopicFindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.MICROSCOPIC_FINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingMethodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingMethodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingMethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingStudyTestPerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingStudyTestPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingSpecimenInformation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingStudyFindingEvaluator(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingStudyFindingEvaluator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingEventSeverity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingEventSeverity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingDataCollection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingGroupIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingMassIdentification(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingMassIdentification(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingBodySystemorOrganClass(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingBodySystemorOrganClass(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingResultCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingResultCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMicroscopicFindingDeathRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MicroscopicFindingOperations.validateMicroscopicFindingDeathRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return MicroscopicFindingOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenInformation getSpecimenInformation() {
		return MicroscopicFindingOperations.getSpecimenInformation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventorFindingSeverity getEventSeverity() {
		return MicroscopicFindingOperations.getEventSeverity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCollection getDataCollection() {
		return MicroscopicFindingOperations.getDataCollection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier getGroupIdentifier() {
		return MicroscopicFindingOperations.getGroupIdentifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodySystemorOrganClass getBodySystemorOrganClass() {
		return MicroscopicFindingOperations.getBodySystemorOrganClass(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return MicroscopicFindingOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return MicroscopicFindingOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return MicroscopicFindingOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return MicroscopicFindingOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultCategory getResultCategory() {
		return MicroscopicFindingOperations.getResultCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeathRelationship getDeathRelationship() {
		return MicroscopicFindingOperations.getDeathRelationship(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicroscopicFinding init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public MicroscopicFinding init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //MicroscopicFindingImpl
