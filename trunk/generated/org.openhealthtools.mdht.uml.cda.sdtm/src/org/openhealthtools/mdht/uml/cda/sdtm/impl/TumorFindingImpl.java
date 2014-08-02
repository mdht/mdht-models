/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DeathRelationship;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.ResultCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.TumorFindingOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tumor Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TumorFindingImpl extends ObservationImpl implements TumorFinding {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TumorFindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.TUMOR_FINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingMethodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingMethodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingMethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingGroupIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingSpecimenInformation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingMassIdentification(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingMassIdentification(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingStudyTestPerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingStudyTestPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingDetectionDelayAssociation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingDetectionDelayAssociation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingResultCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingResultCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingDeathRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingDeathRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingdetectionDelayAssociationdetectionDelayClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingdetectionDelayAssociationdetectionDelayClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingdetectionDelayAssociationdetectionDelayCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingdetectionDelayAssociationdetectionDelayCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingdetectionDelayAssociationdetectionDelayMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingdetectionDelayAssociationdetectionDelayMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingdetectionDelayAssociationdetectionDelayValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingdetectionDelayAssociationdetectionDelayValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTumorFindingdetectionDelayAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TumorFindingOperations.validateTumorFindingdetectionDelayAssociationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier getGroupIdentifier() {
		return TumorFindingOperations.getGroupIdentifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenInformation getSpecimenInformation() {
		return TumorFindingOperations.getSpecimenInformation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return TumorFindingOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment getComment() {
		return TumorFindingOperations.getComment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return TumorFindingOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedRecord getRelatedRecord() {
		return TumorFindingOperations.getRelatedRecord(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplementalValue getSupplementalValue() {
		return TumorFindingOperations.getSupplementalValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultCategory getResultCategory() {
		return TumorFindingOperations.getResultCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeathRelationship getDeathRelationship() {
		return TumorFindingOperations.getDeathRelationship(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TumorFinding init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public TumorFinding init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //TumorFindingImpl
