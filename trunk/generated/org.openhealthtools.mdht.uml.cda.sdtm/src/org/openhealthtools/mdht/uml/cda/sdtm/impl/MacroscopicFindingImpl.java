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
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DeathRelationship;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.MacroscopicFindingOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Macroscopic Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MacroscopicFindingImpl extends ObservationImpl implements MacroscopicFinding {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MacroscopicFindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.MACROSCOPIC_FINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMacroscopicFindingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MacroscopicFindingOperations.validateMacroscopicFindingTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMacroscopicFindingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MacroscopicFindingOperations.validateMacroscopicFindingClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMacroscopicFindingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MacroscopicFindingOperations.validateMacroscopicFindingMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMacroscopicFindingCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MacroscopicFindingOperations.validateMacroscopicFindingCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMacroscopicFindingCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MacroscopicFindingOperations.validateMacroscopicFindingCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMacroscopicFindingId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MacroscopicFindingOperations.validateMacroscopicFindingId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMacroscopicFindingValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MacroscopicFindingOperations.validateMacroscopicFindingValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMacroscopicFindingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MacroscopicFindingOperations.validateMacroscopicFindingStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMacroscopicFindingMassIdentification(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MacroscopicFindingOperations.validateMacroscopicFindingMassIdentification(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMacroscopicFindingGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MacroscopicFindingOperations.validateMacroscopicFindingGroupIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMacroscopicFindingSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MacroscopicFindingOperations.validateMacroscopicFindingSpecimenInformation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMacroscopicFindingBodySystemorOrganClass(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MacroscopicFindingOperations.validateMacroscopicFindingBodySystemorOrganClass(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMacroscopicFindingNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MacroscopicFindingOperations.validateMacroscopicFindingNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMacroscopicFindingStudyTestPerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MacroscopicFindingOperations.validateMacroscopicFindingStudyTestPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMacroscopicFindingStudyFindingEvaluator(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MacroscopicFindingOperations.validateMacroscopicFindingStudyFindingEvaluator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMacroscopicFindingEventSeverity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MacroscopicFindingOperations.validateMacroscopicFindingEventSeverity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMacroscopicFindingDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MacroscopicFindingOperations.validateMacroscopicFindingDataCollection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMacroscopicFindingComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MacroscopicFindingOperations.validateMacroscopicFindingComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMacroscopicFindingDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MacroscopicFindingOperations.validateMacroscopicFindingDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMacroscopicFindingRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MacroscopicFindingOperations.validateMacroscopicFindingRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMacroscopicFindingSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MacroscopicFindingOperations.validateMacroscopicFindingSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMacroscopicFindingDeathRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MacroscopicFindingOperations.validateMacroscopicFindingDeathRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier getGroupIdentifier() {
		return MacroscopicFindingOperations.getGroupIdentifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenInformation getSpecimenInformation() {
		return MacroscopicFindingOperations.getSpecimenInformation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodySystemorOrganClass getBodySystemorOrganClass() {
		return MacroscopicFindingOperations.getBodySystemorOrganClass(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return MacroscopicFindingOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventorFindingSeverity getEventSeverity() {
		return MacroscopicFindingOperations.getEventSeverity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCollection getDataCollection() {
		return MacroscopicFindingOperations.getDataCollection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return MacroscopicFindingOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return MacroscopicFindingOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return MacroscopicFindingOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return MacroscopicFindingOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeathRelationship getDeathRelationship() {
		return MacroscopicFindingOperations.getDeathRelationship(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MacroscopicFinding init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public MacroscopicFinding init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //MacroscopicFindingImpl
