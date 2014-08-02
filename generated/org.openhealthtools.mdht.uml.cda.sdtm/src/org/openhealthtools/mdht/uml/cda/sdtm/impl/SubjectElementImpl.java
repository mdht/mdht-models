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

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.SubjectElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subject Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SubjectElementImpl extends ActImpl implements SubjectElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.SUBJECT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectElementTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateSubjectElementTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectElementClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateSubjectElementClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectElementMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateSubjectElementMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectElementId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateSubjectElementId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectElementCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateSubjectElementCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectElementCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateSubjectElementCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectElementEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateSubjectElementEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectElementStudyEpoch(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateSubjectElementStudyEpoch(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectElementElementOrderAssociation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateSubjectElementElementOrderAssociation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectElementComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateSubjectElementComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectElementDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateSubjectElementDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectElementRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateSubjectElementRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectElementSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateSubjectElementSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectElementFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateSubjectElementFindingAbout(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureelementOrderAssociationelementOrderCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateHumanClinicalExposureelementOrderAssociationelementOrderCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalExposureelementOrderAssociationelementOrderValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateHumanClinicalExposureelementOrderAssociationelementOrderValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectElementHumanClinicalExposureelementOrderAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateSubjectElementHumanClinicalExposureelementOrderAssociationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectElementHumanClinicalExposureelementOrderAssociationElementOrder(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateSubjectElementHumanClinicalExposureelementOrderAssociationElementOrder(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectElementOperations.validateSubjectElementHumanClinicalExposureelementOrderAssociationelementOrderValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyEpoch getStudyEpoch() {
		return SubjectElementOperations.getStudyEpoch(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return SubjectElementOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return SubjectElementOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return SubjectElementOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return SubjectElementOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FindingAbout> getFindingAbouts() {
		return SubjectElementOperations.getFindingAbouts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjectElement init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public SubjectElement init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //SubjectElementImpl
