/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics;
import org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet;
import org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem;
import org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement;
import org.openhealthtools.mdht.uml.cda.sdtm.Visit;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.HumanClinicalSubjectDataDocumentSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Human Clinical Subject Data Document Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HumanClinicalSubjectDataDocumentSectionImpl extends org.eclipse.mdht.uml.cda.impl.SectionImpl implements HumanClinicalSubjectDataDocumentSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HumanClinicalSubjectDataDocumentSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDataDocumentSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDataDocumentSectionOperations.validateHumanClinicalSubjectDataDocumentSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDataDocumentSectionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDataDocumentSectionOperations.validateHumanClinicalSubjectDataDocumentSectionClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDataDocumentSectionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDataDocumentSectionOperations.validateHumanClinicalSubjectDataDocumentSectionMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDataDocumentSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDataDocumentSectionOperations.validateHumanClinicalSubjectDataDocumentSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDataDocumentSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDataDocumentSectionOperations.validateHumanClinicalSubjectDataDocumentSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDataDocumentSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDataDocumentSectionOperations.validateHumanClinicalSubjectDataDocumentSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDataDocumentSectionHumanClinicalSubjectDemographics(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDataDocumentSectionOperations.validateHumanClinicalSubjectDataDocumentSectionHumanClinicalSubjectDemographics(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDataDocumentSectionHumanClinicalVisit(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDataDocumentSectionOperations.validateHumanClinicalSubjectDataDocumentSectionHumanClinicalVisit(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDataDocumentSectionExposureAssociation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDataDocumentSectionOperations.validateHumanClinicalSubjectDataDocumentSectionExposureAssociation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDataDocumentSectionSubjectElement(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDataDocumentSectionOperations.validateHumanClinicalSubjectDataDocumentSectionSubjectElement(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDataDocumentSectionDisposition(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDataDocumentSectionOperations.validateHumanClinicalSubjectDataDocumentSectionDisposition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDataDocumentSectionMedicalHistory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDataDocumentSectionOperations.validateHumanClinicalSubjectDataDocumentSectionMedicalHistory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDataDocumentSectionProtocolDeviation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDataDocumentSectionOperations.validateHumanClinicalSubjectDataDocumentSectionProtocolDeviation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDataDocumentSectionClinicalEvent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDataDocumentSectionOperations.validateHumanClinicalSubjectDataDocumentSectionClinicalEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDataDocumentSectionSubjectCharacteristic(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDataDocumentSectionOperations.validateHumanClinicalSubjectDataDocumentSectionSubjectCharacteristic(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDataDocumentSectionStudySubjectEvent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDataDocumentSectionOperations.validateHumanClinicalSubjectDataDocumentSectionStudySubjectEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDataDocumentSectionStudySubjectFinding(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDataDocumentSectionOperations.validateHumanClinicalSubjectDataDocumentSectionStudySubjectFinding(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDataDocumentSectionStudySubjectIntervention(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDataDocumentSectionOperations.validateHumanClinicalSubjectDataDocumentSectionStudySubjectIntervention(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDataDocumentSectionComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDataDocumentSectionOperations.validateHumanClinicalSubjectDataDocumentSectionComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDataDocumentSectionAdverseEvent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDataDocumentSectionOperations.validateHumanClinicalSubjectDataDocumentSectionAdverseEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDataDocumentSectionInclusionorExclusionCriteriaNotMet(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDataDocumentSectionOperations.validateHumanClinicalSubjectDataDocumentSectionInclusionorExclusionCriteriaNotMet(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDataDocumentSectionFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDataDocumentSectionOperations.validateHumanClinicalSubjectDataDocumentSectionFindingAbout(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDataDocumentSectionexposureAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDataDocumentSectionOperations.validateHumanClinicalSubjectDataDocumentSectionexposureAssociationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDataDocumentSectionexposureAssociationExposureSubstanceAdministration(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HumanClinicalSubjectDataDocumentSectionOperations.validateHumanClinicalSubjectDataDocumentSectionexposureAssociationExposureSubstanceAdministration(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HumanClinicalSubjectDemographics getHumanClinicalSubjectDemographics() {
		return HumanClinicalSubjectDataDocumentSectionOperations.getHumanClinicalSubjectDemographics(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Visit> getHumanClinicalVisits() {
		return HumanClinicalSubjectDataDocumentSectionOperations.getHumanClinicalVisits(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubjectElement> getSubjectElements() {
		return HumanClinicalSubjectDataDocumentSectionOperations.getSubjectElements(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HumanClinicalDisposition> getDispositions() {
		return HumanClinicalSubjectDataDocumentSectionOperations.getDispositions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicalHistoryItem> getMedicalHistories() {
		return HumanClinicalSubjectDataDocumentSectionOperations.getMedicalHistories(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProtocolDeviation> getProtocolDeviations() {
		return HumanClinicalSubjectDataDocumentSectionOperations.getProtocolDeviations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClinicalEvent> getClinicalEvents() {
		return HumanClinicalSubjectDataDocumentSectionOperations.getClinicalEvents(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubjectCharacteristic> getSubjectCharacteristics() {
		return HumanClinicalSubjectDataDocumentSectionOperations.getSubjectCharacteristics(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StudySubjectEvent> getStudySubjectEvents() {
		return HumanClinicalSubjectDataDocumentSectionOperations.getStudySubjectEvents(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StudySubjectFinding> getStudySubjectFindings() {
		return HumanClinicalSubjectDataDocumentSectionOperations.getStudySubjectFindings(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StudySubjectIntervention> getStudySubjectInterventions() {
		return HumanClinicalSubjectDataDocumentSectionOperations.getStudySubjectInterventions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return HumanClinicalSubjectDataDocumentSectionOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AdverseEvent> getAdverseEvents() {
		return HumanClinicalSubjectDataDocumentSectionOperations.getAdverseEvents(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InclusionorExclusionCriteriaNotMet> getInclusionorExclusionCriteriaNotMets() {
		return HumanClinicalSubjectDataDocumentSectionOperations.getInclusionorExclusionCriteriaNotMets(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FindingAbout> getFindingAbouts() {
		return HumanClinicalSubjectDataDocumentSectionOperations.getFindingAbouts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HumanClinicalSubjectDataDocumentSection init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public HumanClinicalSubjectDataDocumentSection init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //HumanClinicalSubjectDataDocumentSectionImpl
