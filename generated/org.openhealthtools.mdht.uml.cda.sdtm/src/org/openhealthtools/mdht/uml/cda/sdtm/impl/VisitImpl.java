/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability;
import org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.Visit;
import org.openhealthtools.mdht.uml.cda.sdtm.VitalSign;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.VisitOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visit</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VisitImpl extends org.eclipse.mdht.uml.cda.impl.EncounterImpl implements Visit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.VISIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitHumanClinicalVitalSign(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitHumanClinicalVitalSign(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitPlannedStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitPlannedStudyDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitECGTestResult(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitECGTestResult(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitPhysicalExamination(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitPhysicalExamination(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitMicrobiologySpecimen(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitMicrobiologySpecimen(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitMicrobiologySusceptibility(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitMicrobiologySusceptibility(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitPharmacokineticConcentrationFinding(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitPharmacokineticConcentrationFinding(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitFindingAbout(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitDrugAccountability(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitDrugAccountability(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitStudyDayPeriod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitHumanClinicalLaboratoryTestResult(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitHumanClinicalLaboratoryTestResult(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitQuestionnaireFinding(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitQuestionnaireFinding(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVisitPharmacokineticParameterFinding(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VisitOperations.validateVisitPharmacokineticParameterFinding(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VitalSign> getHumanClinicalVitalSigns() {
		return VisitOperations.getHumanClinicalVitalSigns(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedStudyDay getPlannedStudyDay() {
		return VisitOperations.getPlannedStudyDay(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ECGTestResult> getECGTestResults() {
		return VisitOperations.getECGTestResults(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalExaminationFinding> getPhysicalExaminations() {
		return VisitOperations.getPhysicalExaminations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicrobiologySpecimenFinding getMicrobiologySpecimen() {
		return VisitOperations.getMicrobiologySpecimen(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicrobiologySusceptibility getMicrobiologySusceptibility() {
		return VisitOperations.getMicrobiologySusceptibility(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PharmacokineticConcentrationFinding getPharmacokineticConcentrationFinding() {
		return VisitOperations.getPharmacokineticConcentrationFinding(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FindingAbout> getFindingAbouts() {
		return VisitOperations.getFindingAbouts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DrugAccountability getDrugAccountability() {
		return VisitOperations.getDrugAccountability(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyDayPeriod getStudyDayPeriod() {
		return VisitOperations.getStudyDayPeriod(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return VisitOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return VisitOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return VisitOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return VisitOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HumanClinicalLaboratoryTestResult> getHumanClinicalLaboratoryTestResults() {
		return VisitOperations.getHumanClinicalLaboratoryTestResults(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuestionnaireFinding> getQuestionnaireFindings() {
		return VisitOperations.getQuestionnaireFindings(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PharmacokineticParameterFinding> getPharmacokineticParameterFindings() {
		return VisitOperations.getPharmacokineticParameterFindings(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Visit init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public Visit init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //VisitImpl
