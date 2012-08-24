/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.InterventionsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;

import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;

import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Clinical Office Visit Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryMedicationList(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Medication List</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryMedicationAllergy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Medication Allergy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryVitalSigns(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Vital Signs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryReasonForOfficeVisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Reason For Office Visit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryCarePlanning(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Care Planning</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummarySocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryAssessmentAndPlanSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummarymu2consolSocialHistorySectionSmokingStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summarymu2consol Social History Section Smoking Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummarymu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summarymu2consol Hospital Admission Medications Section Entries Optional Admission Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummarymu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summarymu2consol Allergies Section Entries Optional Allergy Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summarymu2consol Plan Of Care Section Care Planning For Plan Of Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummarymu2consolMedicationsAdministeredSectionMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summarymu2consol Medications Administered Section Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryInstructionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Instructions Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummarymu2consolInstructionsSectionInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summarymu2consol Instructions Section Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getHospitalAdmissionMedicationsSectionEntriesOptional() <em>Get Hospital Admission Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getHospitalDischargeMedicationsSection() <em>Get Hospital Discharge Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getAllergiesSection() <em>Get Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getResultsSection() <em>Get Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getVitalSignsSectionEntriesOptional() <em>Get Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getProceduresSection() <em>Get Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getMedicationsAdministeredSection() <em>Get Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getReasonForVisitSection() <em>Get Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getChiefComplaintAndReasonForVisitSection() <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getAssessmentAndPlanSection() <em>Get Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getInstructionsSection() <em>Get Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getInterventionsSection() <em>Get Interventions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClinicalOfficeVisitSummaryOperations extends
		GeneralHeaderConstraintsOperations {
	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	protected ClinicalOfficeVisitSummaryOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryResponsibleParty(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Responsible Party</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryResponsibleParty(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(responsibleParty->one(responsibleParty : "+
"cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(rim::Participation)))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryResponsibleParty(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Responsible Party</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryResponsibleParty(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Query<?, ?, ?> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self
	 * .componentOf->excluding(null).encompassingEncounter->excluding(null)->
	 * reject(responsibleParty->one(responsibleParty :
	 * 
	 * cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and
	 * responsibleParty.oclIsKindOf(rim::Participation)))
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validateClinicalOfficeVisitSummaryResponsibleParty(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(clinicalOfficeVisitSummary);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_RESPONSIBLE_PARTY,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryResponsibleParty"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryLocation(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Location</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryLocation(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(location->one(location : cda::Location | not "+
"location.oclIsUndefined() and location.oclIsKindOf(rim::Participation)))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryLocation(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Location</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryLocation(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Query<?, ?, ?> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self
	 * .componentOf->excluding(null).encompassingEncounter->excluding(null)->
	 * reject(location->one(location : cda::Location | not
	 * 
	 * location.oclIsUndefined() and location.oclIsKindOf(rim::Participation)))
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validateClinicalOfficeVisitSummaryLocation(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(clinicalOfficeVisitSummary);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_LOCATION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryLocation"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryMedicationList(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Medication List</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryMedicationList(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_LIST__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::MedicationsSection)) or "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalDischargeMedicationsSection)) or "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::HospitalAdmissionMedicationsSectionEntriesOptional)))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryMedicationList(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Medication List</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryMedicationList(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_LIST__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::MedicationsSection)) or
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::HospitalDischargeMedicationsSection)) or
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(mu2consol::
	 * HospitalAdmissionMedicationsSectionEntriesOptional)))
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryMedicationList(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_LIST__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_LIST__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_LIST__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_LIST__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_LIST,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryMedicationList"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryMedicationAllergy(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Medication Allergy</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryMedicationAllergy(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::AllergiesSection)) or "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::AllergiesSectionEntriesOptional)))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryMedicationAllergy(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Medication Allergy</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryMedicationAllergy(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::AllergiesSection)) or self.getAllSections()->one(s
	 * : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(mu2consol::AllergiesSectionEntriesOptional)))
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryMedicationAllergy(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_ALLERGY,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryMedicationAllergy"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryVitalSigns(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Vital Signs</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryVitalSigns(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::VitalSignsSection)) or  "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::VitalSignsSectionEntriesOptional)))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryVitalSigns(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Vital Signs</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryVitalSigns(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::VitalSignsSection)) or self.getAllSections()->one(s
	 * : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::VitalSignsSectionEntriesOptional)))
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryVitalSigns(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryVitalSigns"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryReasonForOfficeVisit(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Reason For Office Visit</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryReasonForOfficeVisit(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_OFFICE_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or "+
" self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor "+
" self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryReasonForOfficeVisit(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Reason For Office Visit</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryReasonForOfficeVisit(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_OFFICE_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ChiefComplaintSection)) or
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ReasonForVisitSection))) xor
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryReasonForOfficeVisit(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_OFFICE_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_OFFICE_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_OFFICE_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_OFFICE_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_OFFICE_VISIT,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryReasonForOfficeVisit"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryCarePlanning(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Care Planning</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryCarePlanning(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::PlanOfCareSection)) or "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::AssessmentAndPlanSection)) or "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::InterventionsSection)))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryCarePlanning(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Care Planning</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryCarePlanning(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(mu2consol::PlanOfCareSection)) or
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(mu2consol::AssessmentAndPlanSection)) or
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::InterventionsSection)))
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryCarePlanning(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryCarePlanning"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummarySocialHistorySection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Social History Section</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummarySocialHistorySection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::SocialHistorySection))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummarySocialHistorySection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Social History Section</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummarySocialHistorySection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::SocialHistorySection))
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummarySocialHistorySection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummarySocialHistorySection"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryProblemSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Problem Section</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryProblemSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryProblemSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Problem Section</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryProblemSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryProblemSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryProblemSection"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryResultsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Results Section</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryResultsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryResultsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Results Section</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryResultsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryResultsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryResultsSection"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryPlanOfCareSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Plan Of Care Section</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryPlanOfCareSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PlanOfCareSection))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryPlanOfCareSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Plan Of Care Section</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryPlanOfCareSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::PlanOfCareSection))
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryPlanOfCareSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_SECTION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryPlanOfCareSection"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryProceduresSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Procedures Section</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryProceduresSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryProceduresSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Procedures Section</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryProceduresSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ProceduresSection))
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryProceduresSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryProceduresSection"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryAssessmentAndPlanSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Assessment And Plan Section</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryAssessmentAndPlanSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::AssessmentAndPlanSection))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryAssessmentAndPlanSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Assessment And Plan Section</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryAssessmentAndPlanSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::AssessmentAndPlanSection))
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryAssessmentAndPlanSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryAssessmentAndPlanSection"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryInstructionsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Instructions Section</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryInstructionsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InstructionsSection))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryInstructionsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Instructions Section</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryInstructionsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::InstructionsSection))
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryInstructionsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryInstructionsSection"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummarymu2consolSocialHistorySectionSmokingStatusObservation(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summarymu2consol Social History Section Smoking Status Observation</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummarymu2consolSocialHistorySectionSmokingStatusObservation(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::SmokingStatusObservation)))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummarymu2consolSocialHistorySectionSmokingStatusObservation(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summarymu2consol Social History Section Smoking Status Observation</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummarymu2consolSocialHistorySectionSmokingStatusObservation(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Query<?, ?, ?> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getSocialHistorySection()->excluding(null)->reject(
	 * getSocialHistorySection().entry->exists(entry : cda::Entry | not
	 * entry.observation.oclIsUndefined() and
	 * entry.observation.oclIsKindOf(consol::SmokingStatusObservation)))
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateClinicalOfficeVisitSummarymu2consolSocialHistorySectionSmokingStatusObservation(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(clinicalOfficeVisitSummary);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummarymu2consolSocialHistorySectionSmokingStatusObservation"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummarymu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summarymu2consol Hospital Admission Medications Section Entries Optional Admission Medication</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummarymu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::AdmissionMedication)))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummarymu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summarymu2consol Hospital Admission Medications Section Entries Optional Admission Medication</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummarymu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Query<?, ?, ?> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self
	 * .getHospitalAdmissionMedicationsSectionEntriesOptional()->excluding(null
	 * )->reject(getHospitalAdmissionMedicationsSectionEntriesOptional().entry->
	 * exists(entry : cda::Entry | not entry.act.oclIsUndefined() and
	 * entry.act.oclIsKindOf(consol::AdmissionMedication)))
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateClinicalOfficeVisitSummarymu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(clinicalOfficeVisitSummary);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummarymu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummarymu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summarymu2consol Allergies Section Entries Optional Allergy Problem Act</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummarymu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::AllergyProblemAct)))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummarymu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summarymu2consol Allergies Section Entries Optional Allergy Problem Act</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummarymu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Query<?, ?, ?> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllergiesSectionEntriesOptional()->excluding(null)->reject(
	 * getAllergiesSectionEntriesOptional().entry->one(entry : cda::Entry | not
	 * entry.act.oclIsUndefined() and
	 * entry.act.oclIsKindOf(consol::AllergyProblemAct)))
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateClinicalOfficeVisitSummarymu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(clinicalOfficeVisitSummary);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummarymu2consolAllergiesSectionEntriesOptionalAllergyProblemAct"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summarymu2consol Plan Of Care Section Care Planning For Plan Of Care</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(getActs()->exists(a : cda::Act | a.oclIsKindOf(consol::PlanOfCareActivityAct)) or getObservations()->exists(o : cda::Observation | o.oclIsKindOf(consol::PlanOfCareActivityObservation)) or getEncounters()->exists(e : cda::Encounter | e.oclIsKindOf(consol::PlanOfCareActivityEncounter)))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summarymu2consol Plan Of Care Section Care Planning For Plan Of Care</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Query<?, ?, ?> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self
	 * .getPlanOfCareSection()->excluding(null)->reject(getPlanOfCareSection(
	 * ).getActs()->exists(a : cda::Act |
	 * a.oclIsKindOf(consol::PlanOfCareActivityAct)) or
	 * getPlanOfCareSection().getObservations()->exists(o : cda::Observation |
	 * o.oclIsKindOf(consol::PlanOfCareActivityObservation)) or
	 * getPlanOfCareSection().getEncounters()->exists(e : cda::Encounter |
	 * e.oclIsKindOf(consol::PlanOfCareActivityEncounter)))
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(clinicalOfficeVisitSummary);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummarymu2consolMedicationsAdministeredSectionMedicationActivity(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summarymu2consol Medications Administered Section Medication Activity</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummarymu2consolMedicationsAdministeredSectionMedicationActivity(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(consol::MedicationActivity)))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummarymu2consolMedicationsAdministeredSectionMedicationActivity(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summarymu2consol Medications Administered Section Medication Activity</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummarymu2consolMedicationsAdministeredSectionMedicationActivity(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Query<?, ?, ?> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getMedicationsAdministeredSection()->excluding(null)->reject(
	 * getMedicationsAdministeredSection().entry->exists(entry : cda::Entry |
	 * not entry.substanceAdministration.oclIsUndefined() and
	 * entry.substanceAdministration.oclIsKindOf(consol::MedicationActivity)))
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateClinicalOfficeVisitSummarymu2consolMedicationsAdministeredSectionMedicationActivity(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(clinicalOfficeVisitSummary);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummarymu2consolMedicationsAdministeredSectionMedicationActivity"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryInstructionsSectionTemplateId(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Instructions Section Template Id</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryInstructionsSectionTemplateId(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(templateId->exists(id : datatypes::II | id.root = 'null'))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryInstructionsSectionTemplateId(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Instructions Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryInstructionsSectionTemplateId(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Query<?, ?, ?> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getInstructionsSection()->excluding(null)->reject(
	 * getInstructionsSection().templateId->exists(id : datatypes::II | id.root
	 * = 'null'))
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateClinicalOfficeVisitSummaryInstructionsSectionTemplateId(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(clinicalOfficeVisitSummary);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION_TEMPLATE_ID,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryInstructionsSectionTemplateId"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummarymu2consolInstructionsSectionInstructions(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summarymu2consol Instructions Section Instructions</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummarymu2consolInstructionsSectionInstructions(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::Instructions)))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummarymu2consolInstructionsSectionInstructions(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summarymu2consol Instructions Section Instructions</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummarymu2consolInstructionsSectionInstructions(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Query<?, ?, ?> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getInstructionsSection()->excluding(null)->reject(
	 * getInstructionsSection().entry->exists(entry : cda::Entry | not
	 * entry.act.oclIsUndefined() and
	 * entry.act.oclIsKindOf(consol::Instructions)))
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateClinicalOfficeVisitSummarymu2consolInstructionsSectionInstructions(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(clinicalOfficeVisitSummary);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummarymu2consolInstructionsSectionInstructions"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getSocialHistorySection(ClinicalOfficeVisitSummary) <em>Get Social History Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSocialHistorySection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::SocialHistorySection))->asSequence()->any(true).oclAsType(mu2consol::SocialHistorySection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getSocialHistorySection(ClinicalOfficeVisitSummary)
	 * <em>Get Social History Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSocialHistorySection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::SocialHistorySection
	 * ))->asSequence()->any(true).oclAsType(mu2consol::SocialHistorySection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static SocialHistorySection getSocialHistorySection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(196));
      try
      {
        GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
    return (SocialHistorySection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getProblemSection(ClinicalOfficeVisitSummary) <em>Get Problem Section</em>}' operation.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @see #getProblemSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_PROBLEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))->asSequence()->any(true).oclAsType(consol::ProblemSection)";

	/**
   * The cached OCL query for the '{@link #getProblemSection(ClinicalOfficeVisitSummary) <em>Get Problem Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getProblemSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ProblemSection))-
	 * >asSequence()->any(true).oclAsType(consol::ProblemSection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ProblemSection getProblemSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_PROBLEM_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(197));
      try
      {
        GET_PROBLEM_SECTION__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_SECTION__EOCL_QRY);
    return (ProblemSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getMedicationsSection(ClinicalOfficeVisitSummary) <em>Get Medications Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMedicationsSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->any(true).oclAsType(consol::MedicationsSection)";

	/**
   * The cached OCL query for the '{@link #getMedicationsSection(ClinicalOfficeVisitSummary) <em>Get Medications Section</em>}' query operation.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
   * @see #getMedicationsSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::MedicationsSection
	 * ))->asSequence()->any(true).oclAsType(consol::MedicationsSection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static MedicationsSection getMedicationsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_MEDICATIONS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(198));
      try
      {
        GET_MEDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_SECTION__EOCL_QRY);
    return (MedicationsSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getHospitalAdmissionMedicationsSectionEntriesOptional(ClinicalOfficeVisitSummary) <em>Get Hospital Admission Medications Section Entries Optional</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getHospitalAdmissionMedicationsSectionEntriesOptional(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::HospitalAdmissionMedicationsSectionEntriesOptional))->asSequence()->any(true).oclAsType(mu2consol::HospitalAdmissionMedicationsSectionEntriesOptional)";

	/**
   * The cached OCL query for the '{@link #getHospitalAdmissionMedicationsSectionEntriesOptional(ClinicalOfficeVisitSummary) <em>Get Hospital Admission Medications Section Entries Optional</em>}' query operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getHospitalAdmissionMedicationsSectionEntriesOptional(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and section.oclIsKindOf(mu2consol::
	 * HospitalAdmissionMedicationsSectionEntriesOptional
	 * ))->asSequence()->any(true).oclAsType(mu2consol::
	 * HospitalAdmissionMedicationsSectionEntriesOptional)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static HospitalAdmissionMedicationsSectionEntriesOptional getHospitalAdmissionMedicationsSectionEntriesOptional(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(199));
      try
      {
        GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
    return (HospitalAdmissionMedicationsSectionEntriesOptional) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
	 * The cached OCL expression body for the '
	 * {@link #getHospitalDischargeMedicationsSection(ClinicalOfficeVisitSummary)
	 * <em>Get Hospital Discharge Medications Section</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHospitalDischargeMedicationsSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSection))->asSequence()->any(true).oclAsType(consol::HospitalDischargeMedicationsSection)";

	/**
   * The cached OCL query for the '{@link #getHospitalDischargeMedicationsSection(ClinicalOfficeVisitSummary) <em>Get Hospital Discharge Medications Section</em>}' query operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getHospitalDischargeMedicationsSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::HospitalDischargeMedicationsSection
	 * ))->asSequence
	 * ()->any(true).oclAsType(consol::HospitalDischargeMedicationsSection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static HospitalDischargeMedicationsSection getHospitalDischargeMedicationsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(200));
      try
      {
        GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_QRY);
    return (HospitalDischargeMedicationsSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getAllergiesSection(ClinicalOfficeVisitSummary) <em>Get Allergies Section</em>}' operation.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @see #getAllergiesSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_ALLERGIES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))->asSequence()->any(true).oclAsType(consol::AllergiesSection)";

	/**
   * The cached OCL query for the '{@link #getAllergiesSection(ClinicalOfficeVisitSummary) <em>Get Allergies Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAllergiesSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::AllergiesSection)
	 * )->asSequence()->any(true).oclAsType(consol::AllergiesSection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static AllergiesSection getAllergiesSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_ALLERGIES_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(201));
      try
      {
        GET_ALLERGIES_SECTION__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_SECTION__EOCL_QRY);
    return (AllergiesSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
	 * The cached OCL expression body for the '
	 * {@link #getAllergiesSectionEntriesOptional(ClinicalOfficeVisitSummary)
	 * <em>Get Allergies Section Entries Optional</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAllergiesSectionEntriesOptional(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::AllergiesSectionEntriesOptional))->asSequence()->any(true).oclAsType(mu2consol::AllergiesSectionEntriesOptional)";

	/**
	 * The cached OCL query for the '
	 * {@link #getAllergiesSectionEntriesOptional(ClinicalOfficeVisitSummary)
	 * <em>Get Allergies Section Entries Optional</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAllergiesSectionEntriesOptional(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::AllergiesSectionEntriesOptional
	 * ))->asSequence
	 * ()->any(true).oclAsType(mu2consol::AllergiesSectionEntriesOptional)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(202));
      try
      {
        GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
    return (AllergiesSectionEntriesOptional) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getResultsSection(ClinicalOfficeVisitSummary) <em>Get Results Section</em>}' operation.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @see #getResultsSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_RESULTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))->asSequence()->any(true).oclAsType(consol::ResultsSection)";

	/**
   * The cached OCL query for the '{@link #getResultsSection(ClinicalOfficeVisitSummary) <em>Get Results Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getResultsSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_RESULTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ResultsSection))-
	 * >asSequence()->any(true).oclAsType(consol::ResultsSection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ResultsSection getResultsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_RESULTS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(203));
      try
      {
        GET_RESULTS_SECTION__EOCL_QRY = helper.createQuery(GET_RESULTS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS_SECTION__EOCL_QRY);
    return (ResultsSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getVitalSignsSection(ClinicalOfficeVisitSummary) <em>Get Vital Signs Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getVitalSignsSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))->asSequence()->any(true).oclAsType(consol::VitalSignsSection)";

	/**
   * The cached OCL query for the '{@link #getVitalSignsSection(ClinicalOfficeVisitSummary) <em>Get Vital Signs Section</em>}' query operation.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
   * @see #getVitalSignsSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::VitalSignsSection
	 * ))->asSequence()->any(true).oclAsType(consol::VitalSignsSection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static VitalSignsSection getVitalSignsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_VITAL_SIGNS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(204));
      try
      {
        GET_VITAL_SIGNS_SECTION__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_QRY);
    return (VitalSignsSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
	 * The cached OCL expression body for the '
	 * {@link #getVitalSignsSectionEntriesOptional(ClinicalOfficeVisitSummary)
	 * <em>Get Vital Signs Section Entries Optional</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getVitalSignsSectionEntriesOptional(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::VitalSignsSectionEntriesOptional)";

	/**
	 * The cached OCL query for the '
	 * {@link #getVitalSignsSectionEntriesOptional(ClinicalOfficeVisitSummary)
	 * <em>Get Vital Signs Section Entries Optional</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getVitalSignsSectionEntriesOptional(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional
	 * ))->asSequence
	 * ()->any(true).oclAsType(consol::VitalSignsSectionEntriesOptional)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(205));
      try
      {
        GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
    return (VitalSignsSectionEntriesOptional) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getPlanOfCareSection(ClinicalOfficeVisitSummary) <em>Get Plan Of Care Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPlanOfCareSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PlanOfCareSection))->asSequence()->any(true).oclAsType(mu2consol::PlanOfCareSection)";

	/**
   * The cached OCL query for the '{@link #getPlanOfCareSection(ClinicalOfficeVisitSummary) <em>Get Plan Of Care Section</em>}' query operation.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
   * @see #getPlanOfCareSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::PlanOfCareSection
	 * ))->asSequence()->any(true).oclAsType(mu2consol::PlanOfCareSection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static PlanOfCareSection getPlanOfCareSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(206));
      try
      {
        GET_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_QRY);
    return (PlanOfCareSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getProceduresSection(ClinicalOfficeVisitSummary) <em>Get Procedures Section</em>}' operation.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @see #getProceduresSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_PROCEDURES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection))->asSequence()->any(true).oclAsType(consol::ProceduresSection)";

	/**
   * The cached OCL query for the '{@link #getProceduresSection(ClinicalOfficeVisitSummary) <em>Get Procedures Section</em>}' query operation.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
   * @see #getProceduresSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ProceduresSection
	 * ))->asSequence()->any(true).oclAsType(consol::ProceduresSection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ProceduresSection getProceduresSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_PROCEDURES_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(207));
      try
      {
        GET_PROCEDURES_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURES_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURES_SECTION__EOCL_QRY);
    return (ProceduresSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getImmunizationsSection(ClinicalOfficeVisitSummary) <em>Get Immunizations Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getImmunizationsSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_IMMUNIZATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))->asSequence()->any(true).oclAsType(consol::ImmunizationsSection)";

	/**
   * The cached OCL query for the '{@link #getImmunizationsSection(ClinicalOfficeVisitSummary) <em>Get Immunizations Section</em>}' query operation.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
   * @see #getImmunizationsSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ImmunizationsSection
	 * ))->asSequence()->any(true).oclAsType(consol::ImmunizationsSection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ImmunizationsSection getImmunizationsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_IMMUNIZATIONS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(208));
      try
      {
        GET_IMMUNIZATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_QRY);
    return (ImmunizationsSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
	 * The cached OCL expression body for the '
	 * {@link #getMedicationsAdministeredSection(ClinicalOfficeVisitSummary)
	 * <em>Get Medications Administered Section</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMedicationsAdministeredSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::MedicationsAdministeredSection))->asSequence()->any(true).oclAsType(mu2consol::MedicationsAdministeredSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getMedicationsAdministeredSection(ClinicalOfficeVisitSummary)
	 * <em>Get Medications Administered Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMedicationsAdministeredSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::MedicationsAdministeredSection
	 * ))->asSequence
	 * ()->any(true).oclAsType(mu2consol::MedicationsAdministeredSection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static MedicationsAdministeredSection getMedicationsAdministeredSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(209));
      try
      {
        GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY);
    return (MedicationsAdministeredSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getReasonForVisitSection(ClinicalOfficeVisitSummary) <em>Get Reason For Visit Section</em>}' operation.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
   * @see #getReasonForVisitSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ReasonForVisitSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getReasonForVisitSection(ClinicalOfficeVisitSummary)
	 * <em>Get Reason For Visit Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReasonForVisitSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REASON_FOR_VISIT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ReasonForVisitSection
	 * ))->asSequence()->any(true).oclAsType(consol::ReasonForVisitSection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ReasonForVisitSection getReasonForVisitSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_REASON_FOR_VISIT_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(210));
      try
      {
        GET_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper.createQuery(GET_REASON_FOR_VISIT_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_REASON_FOR_VISIT_SECTION__EOCL_QRY);
    return (ReasonForVisitSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getChiefComplaintSection(ClinicalOfficeVisitSummary) <em>Get Chief Complaint Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getChiefComplaintSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getChiefComplaintSection(ClinicalOfficeVisitSummary)
	 * <em>Get Chief Complaint Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getChiefComplaintSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ChiefComplaintSection
	 * ))->asSequence()->any(true).oclAsType(consol::ChiefComplaintSection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ChiefComplaintSection getChiefComplaintSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(211));
      try
      {
        GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY);
    return (ChiefComplaintSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getChiefComplaintAndReasonForVisitSection(ClinicalOfficeVisitSummary) <em>Get Chief Complaint And Reason For Visit Section</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getChiefComplaintAndReasonForVisitSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintAndReasonForVisitSection)";

	/**
   * The cached OCL query for the '{@link #getChiefComplaintAndReasonForVisitSection(ClinicalOfficeVisitSummary) <em>Get Chief Complaint And Reason For Visit Section</em>}' query operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getChiefComplaintAndReasonForVisitSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection
	 * ))->asSequence
	 * ()->any(true).oclAsType(consol::ChiefComplaintAndReasonForVisitSection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(212));
      try
      {
        GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY);
    return (ChiefComplaintAndReasonForVisitSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getAssessmentAndPlanSection(ClinicalOfficeVisitSummary) <em>Get Assessment And Plan Section</em>}' operation.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
   * @see #getAssessmentAndPlanSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::AssessmentAndPlanSection))->asSequence()->any(true).oclAsType(mu2consol::AssessmentAndPlanSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getAssessmentAndPlanSection(ClinicalOfficeVisitSummary)
	 * <em>Get Assessment And Plan Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAssessmentAndPlanSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::AssessmentAndPlanSection
	 * ))->asSequence()->any
	 * (true).oclAsType(mu2consol::AssessmentAndPlanSection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static AssessmentAndPlanSection getAssessmentAndPlanSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(213));
      try
      {
        GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY);
    return (AssessmentAndPlanSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getInstructionsSection(ClinicalOfficeVisitSummary) <em>Get Instructions Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInstructionsSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_INSTRUCTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InstructionsSection))->asSequence()->any(true).oclAsType(consol::InstructionsSection)";

	/**
   * The cached OCL query for the '{@link #getInstructionsSection(ClinicalOfficeVisitSummary) <em>Get Instructions Section</em>}' query operation.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
   * @see #getInstructionsSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_INSTRUCTIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::InstructionsSection
	 * ))->asSequence()->any(true).oclAsType(consol::InstructionsSection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static InstructionsSection getInstructionsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_INSTRUCTIONS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(214));
      try
      {
        GET_INSTRUCTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_INSTRUCTIONS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_INSTRUCTIONS_SECTION__EOCL_QRY);
    return (InstructionsSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getInterventionsSection(ClinicalOfficeVisitSummary) <em>Get Interventions Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInterventionsSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_INTERVENTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InterventionsSection))->asSequence()->any(true).oclAsType(consol::InterventionsSection)";

	/**
   * The cached OCL query for the '{@link #getInterventionsSection(ClinicalOfficeVisitSummary) <em>Get Interventions Section</em>}' query operation.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
   * @see #getInterventionsSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_INTERVENTIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::InterventionsSection
	 * ))->asSequence()->any(true).oclAsType(consol::InterventionsSection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static InterventionsSection getInterventionsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_INTERVENTIONS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(215));
      try
      {
        GET_INTERVENTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_INTERVENTIONS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_INTERVENTIONS_SECTION__EOCL_QRY);
    return (InterventionsSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateGeneralHeaderConstraintsTemplateId(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = 'null')";

	/**
   * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateGeneralHeaderConstraintsTemplateId(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = 'null')
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GeneralHeaderConstraintsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(clinicalOfficeVisitSummary, context) }),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

} // ClinicalOfficeVisitSummaryOperations