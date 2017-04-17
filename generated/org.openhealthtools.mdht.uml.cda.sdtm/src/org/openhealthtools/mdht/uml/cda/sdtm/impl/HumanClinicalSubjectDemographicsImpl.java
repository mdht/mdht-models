/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics;
import org.openhealthtools.mdht.uml.cda.sdtm.ReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyArm;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.HumanClinicalSubjectDemographicsOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Human Clinical Subject Demographics</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HumanClinicalSubjectDemographicsImpl extends org.eclipse.mdht.uml.cda.impl.ActImpl implements HumanClinicalSubjectDemographics {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HumanClinicalSubjectDemographicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsDataCollection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsStudyArm(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsStudyArm(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsParticipant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsParticipant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsReferencePeriod(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsReferencePeriod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsFindingAbout(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsAgeAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsAgeAssociationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAge(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAge(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsLocationParticipationStudySiteClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsLocationParticipationStudySiteClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsLocationParticipationStudySiteAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsLocationParticipationStudySiteAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsLocationParticipationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsLocationParticipationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCollection getDataCollection() {
		return HumanClinicalSubjectDemographicsOperations.getDataCollection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StudyArm> getStudyArms() {
		return HumanClinicalSubjectDemographicsOperations.getStudyArms(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return HumanClinicalSubjectDemographicsOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return HumanClinicalSubjectDemographicsOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return HumanClinicalSubjectDemographicsOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return HumanClinicalSubjectDemographicsOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferencePeriod getReferencePeriod() {
		return HumanClinicalSubjectDemographicsOperations.getReferencePeriod(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FindingAbout> getFindingAbouts() {
		return HumanClinicalSubjectDemographicsOperations.getFindingAbouts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HumanClinicalSubjectDemographics init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public HumanClinicalSubjectDemographics init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //HumanClinicalSubjectDemographicsImpl
