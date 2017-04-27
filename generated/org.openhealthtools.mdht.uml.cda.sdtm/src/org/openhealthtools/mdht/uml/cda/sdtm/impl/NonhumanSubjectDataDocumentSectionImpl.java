/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight;
import org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain;
import org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis;
import org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption;
import org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics;
import org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement;
import org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement;
import org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.VitalSign;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.NonhumanSubjectDataDocumentSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nonhuman Subject Data Document Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NonhumanSubjectDataDocumentSectionImpl extends org.eclipse.mdht.uml.cda.impl.SectionImpl implements NonhumanSubjectDataDocumentSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonhumanSubjectDataDocumentSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionNonhumanSubjectDemographics(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionNonhumanSubjectDemographics(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionNonhumanDisposition(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionNonhumanDisposition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionSubjectElement(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionSubjectElement(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionNonhumanExposure(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionNonhumanExposure(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionBodyWeight(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionBodyWeight(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionBodyWeightGain(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionBodyWeightGain(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionClinicalObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionClinicalObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionDeathDiagnosis(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionDeathDiagnosis(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionFoodandWaterConsumption(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionFoodandWaterConsumption(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionNonhumanLaboratoryTestResult(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionNonhumanLaboratoryTestResult(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionMacroscopicFinding(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionMacroscopicFinding(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionMicroscopicFindings(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionMicroscopicFindings(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionOrganMeasurement(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionOrganMeasurement(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionPalpableMass(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionPalpableMass(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionPharmacokineticConcentrationFinding(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionPharmacokineticConcentrationFinding(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionSubjectCharacteristic(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionSubjectCharacteristic(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionTumorFinding(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionTumorFinding(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionVitalSign(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionVitalSign(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionECGTestResult(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionECGTestResult(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionStudySubjectEvent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionStudySubjectEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionStudySubjectFinding(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionStudySubjectFinding(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionStudySubjectIntervention(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionStudySubjectIntervention(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonhumanSubjectDataDocumentSectionPharmacokineticParameterFinding(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonhumanSubjectDataDocumentSectionOperations.validateNonhumanSubjectDataDocumentSectionPharmacokineticParameterFinding(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonhumanSubjectDemographics getNonhumanSubjectDemographics() {
		return NonhumanSubjectDataDocumentSectionOperations.getNonhumanSubjectDemographics(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonhumanDisposition getNonhumanDisposition() {
		return NonhumanSubjectDataDocumentSectionOperations.getNonhumanDisposition(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubjectElement> getSubjectElements() {
		return NonhumanSubjectDataDocumentSectionOperations.getSubjectElements(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NonhumanExposure> getNonhumanExposures() {
		return NonhumanSubjectDataDocumentSectionOperations.getNonhumanExposures(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BodyWeight> getBodyWeights() {
		return NonhumanSubjectDataDocumentSectionOperations.getBodyWeights(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BodyWeightGain> getBodyWeightGains() {
		return NonhumanSubjectDataDocumentSectionOperations.getBodyWeightGains(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClinicalObservation> getClinicalObservations() {
		return NonhumanSubjectDataDocumentSectionOperations.getClinicalObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeathDiagnosis getDeathDiagnosis() {
		return NonhumanSubjectDataDocumentSectionOperations.getDeathDiagnosis(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FoodandWaterConsumption> getFoodandWaterConsumptions() {
		return NonhumanSubjectDataDocumentSectionOperations.getFoodandWaterConsumptions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NonhumanLaboratoryTestResult> getNonhumanLaboratoryTestResults() {
		return NonhumanSubjectDataDocumentSectionOperations.getNonhumanLaboratoryTestResults(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MacroscopicFinding> getMacroscopicFindings() {
		return NonhumanSubjectDataDocumentSectionOperations.getMacroscopicFindings(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MicroscopicFinding> getMicroscopicFindingss() {
		return NonhumanSubjectDataDocumentSectionOperations.getMicroscopicFindingss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrganMeasurement> getOrganMeasurements() {
		return NonhumanSubjectDataDocumentSectionOperations.getOrganMeasurements(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PalpableMass> getPalpableMasss() {
		return NonhumanSubjectDataDocumentSectionOperations.getPalpableMasss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PharmacokineticConcentrationFinding> getPharmacokineticConcentrationFindings() {
		return NonhumanSubjectDataDocumentSectionOperations.getPharmacokineticConcentrationFindings(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubjectCharacteristic> getSubjectCharacteristics() {
		return NonhumanSubjectDataDocumentSectionOperations.getSubjectCharacteristics(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TumorFinding> getTumorFindings() {
		return NonhumanSubjectDataDocumentSectionOperations.getTumorFindings(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VitalSign> getVitalSigns() {
		return NonhumanSubjectDataDocumentSectionOperations.getVitalSigns(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ECGTestResult> getECGTestResults() {
		return NonhumanSubjectDataDocumentSectionOperations.getECGTestResults(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StudySubjectEvent> getStudySubjectEvents() {
		return NonhumanSubjectDataDocumentSectionOperations.getStudySubjectEvents(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StudySubjectFinding> getStudySubjectFindings() {
		return NonhumanSubjectDataDocumentSectionOperations.getStudySubjectFindings(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StudySubjectIntervention> getStudySubjectInterventions() {
		return NonhumanSubjectDataDocumentSectionOperations.getStudySubjectInterventions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return NonhumanSubjectDataDocumentSectionOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PharmacokineticParameterFinding> getPharmacokineticParameterFindings() {
		return NonhumanSubjectDataDocumentSectionOperations.getPharmacokineticParameterFindings(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonhumanSubjectDataDocumentSection init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public NonhumanSubjectDataDocumentSection init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //NonhumanSubjectDataDocumentSectionImpl
