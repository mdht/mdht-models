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
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;

import org.openhealthtools.mdht.uml.cda.mu2consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo;

import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>VDT Inpatient Patient Info</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoMedicationList(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Medication List</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Can Have Either Vital Signs Requied Or Optional Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Can Have Either Allergy Required Or Optional Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Infomu2consol Social History Section Smoking Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Infomu2consol Hospital Admission Medications Section Entries Optional Admission Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfomu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Infomu2consol Allergies Section Entries Optional Allergy Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Infomu2consol Plan Of Care Section Care Planning For Plan Of Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getHospitalAdmissionMedicationsSectionEntriesOptional() <em>Get Hospital Admission Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getHospitalDischargeMedicationsSection() <em>Get Hospital Discharge Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getAllergiesSection() <em>Get Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getResultsSection() <em>Get Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getVitalSignsSectionEntriesOptional() <em>Get Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getProceduresSection() <em>Get Procedures Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VDTInpatientPatientInfoOperations extends GeneralHeaderConstraintsOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected VDTInpatientPatientInfoOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateVDTInpatientPatientInfoResponsibleParty(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Responsible Party</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfoResponsibleParty(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_VDT_INPATIENT_PATIENT_INFO_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(responsibleParty->one(responsibleParty : "+
"cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(rim::Participation)))";

	/**
   * The cached OCL invariant for the '{@link #validateVDTInpatientPatientInfoResponsibleParty(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Responsible Party</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfoResponsibleParty(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Query<?, ?, ?> VALIDATE_VDT_INPATIENT_PATIENT_INFO_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(responsibleParty->one(responsibleParty : 
   * 
   * cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(rim::Participation)))
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public static  boolean validateVDTInpatientPatientInfoResponsibleParty(VDTInpatientPatientInfo vdtInpatientPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_VDT_INPATIENT_PATIENT_INFO_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_VDT_INPATIENT_PATIENT_INFO_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_VDT_INPATIENT_PATIENT_INFO_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(vdtInpatientPatientInfo);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_RESPONSIBLE_PARTY,
             Mu2consolPlugin.INSTANCE.getString("VDTInpatientPatientInfoResponsibleParty"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateVDTInpatientPatientInfoMedicationList(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Medication List</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfoMedicationList(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_VDT_INPATIENT_PATIENT_INFO_MEDICATION_LIST__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::MedicationsSection)) or  "+
" self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalAdmissionMedicationsSectionEntriesOptional)) or "+
" self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalDischargeMedicationsSection)))";

	/**
   * The cached OCL invariant for the '{@link #validateVDTInpatientPatientInfoMedicationList(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Medication List</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfoMedicationList(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_VDT_INPATIENT_PATIENT_INFO_MEDICATION_LIST__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::MedicationsSection)) or  
   *  self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalAdmissionMedicationsSectionEntriesOptional)) or 
   *  self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalDischargeMedicationsSection)))
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateVDTInpatientPatientInfoMedicationList(VDTInpatientPatientInfo vdtInpatientPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_VDT_INPATIENT_PATIENT_INFO_MEDICATION_LIST__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO);
      try
      {
        VALIDATE_VDT_INPATIENT_PATIENT_INFO_MEDICATION_LIST__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VDT_INPATIENT_PATIENT_INFO_MEDICATION_LIST__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VDT_INPATIENT_PATIENT_INFO_MEDICATION_LIST__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vdtInpatientPatientInfo))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_MEDICATION_LIST,
             Mu2consolPlugin.INSTANCE.getString("VDTInpatientPatientInfoMedicationList"),
             new Object [] { vdtInpatientPatientInfo }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateVDTInpatientPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Can Have Either Vital Signs Requied Or Optional Entry</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_VDT_INPATIENT_PATIENT_INFO_CAN_HAVE_EITHER_VITAL_SIGNS_REQUIED_OR_OPTIONAL_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::VitalSignsSection)) or  "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::VitalSignsSectionEntriesOptional)))";

	/**
   * The cached OCL invariant for the '{@link #validateVDTInpatientPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Can Have Either Vital Signs Requied Or Optional Entry</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_VDT_INPATIENT_PATIENT_INFO_CAN_HAVE_EITHER_VITAL_SIGNS_REQUIED_OR_OPTIONAL_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::VitalSignsSection)) or  
   * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::VitalSignsSectionEntriesOptional)))
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateVDTInpatientPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry(VDTInpatientPatientInfo vdtInpatientPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_VDT_INPATIENT_PATIENT_INFO_CAN_HAVE_EITHER_VITAL_SIGNS_REQUIED_OR_OPTIONAL_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO);
      try
      {
        VALIDATE_VDT_INPATIENT_PATIENT_INFO_CAN_HAVE_EITHER_VITAL_SIGNS_REQUIED_OR_OPTIONAL_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VDT_INPATIENT_PATIENT_INFO_CAN_HAVE_EITHER_VITAL_SIGNS_REQUIED_OR_OPTIONAL_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VDT_INPATIENT_PATIENT_INFO_CAN_HAVE_EITHER_VITAL_SIGNS_REQUIED_OR_OPTIONAL_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vdtInpatientPatientInfo))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_CAN_HAVE_EITHER_VITAL_SIGNS_REQUIED_OR_OPTIONAL_ENTRY,
             Mu2consolPlugin.INSTANCE.getString("VDTInpatientPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry"),
             new Object [] { vdtInpatientPatientInfo }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateVDTInpatientPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Can Have Either Allergy Required Or Optional Entry</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_VDT_INPATIENT_PATIENT_INFO_CAN_HAVE_EITHER_ALLERGY_REQUIRED_OR_OPTIONAL_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::AllergiesSection)) or  "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::AllergiesSectionEntriesOptional)))";

	/**
   * The cached OCL invariant for the '{@link #validateVDTInpatientPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Can Have Either Allergy Required Or Optional Entry</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_VDT_INPATIENT_PATIENT_INFO_CAN_HAVE_EITHER_ALLERGY_REQUIRED_OR_OPTIONAL_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::AllergiesSection)) or  
   * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::AllergiesSectionEntriesOptional)))
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateVDTInpatientPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry(VDTInpatientPatientInfo vdtInpatientPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_VDT_INPATIENT_PATIENT_INFO_CAN_HAVE_EITHER_ALLERGY_REQUIRED_OR_OPTIONAL_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO);
      try
      {
        VALIDATE_VDT_INPATIENT_PATIENT_INFO_CAN_HAVE_EITHER_ALLERGY_REQUIRED_OR_OPTIONAL_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VDT_INPATIENT_PATIENT_INFO_CAN_HAVE_EITHER_ALLERGY_REQUIRED_OR_OPTIONAL_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VDT_INPATIENT_PATIENT_INFO_CAN_HAVE_EITHER_ALLERGY_REQUIRED_OR_OPTIONAL_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vdtInpatientPatientInfo))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_CAN_HAVE_EITHER_ALLERGY_REQUIRED_OR_OPTIONAL_ENTRY,
             Mu2consolPlugin.INSTANCE.getString("VDTInpatientPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry"),
             new Object [] { vdtInpatientPatientInfo }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateVDTInpatientPatientInfoSocialHistorySection(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Social History Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfoSocialHistorySection(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_VDT_INPATIENT_PATIENT_INFO_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::SocialHistorySection))";

	/**
   * The cached OCL invariant for the '{@link #validateVDTInpatientPatientInfoSocialHistorySection(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Social History Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfoSocialHistorySection(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_VDT_INPATIENT_PATIENT_INFO_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::SocialHistorySection))
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateVDTInpatientPatientInfoSocialHistorySection(VDTInpatientPatientInfo vdtInpatientPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_VDT_INPATIENT_PATIENT_INFO_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO);
      try
      {
        VALIDATE_VDT_INPATIENT_PATIENT_INFO_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VDT_INPATIENT_PATIENT_INFO_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VDT_INPATIENT_PATIENT_INFO_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vdtInpatientPatientInfo))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_SOCIAL_HISTORY_SECTION,
             Mu2consolPlugin.INSTANCE.getString("VDTInpatientPatientInfoSocialHistorySection"),
             new Object [] { vdtInpatientPatientInfo }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateVDTInpatientPatientInfoProblemSection(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Problem Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfoProblemSection(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_VDT_INPATIENT_PATIENT_INFO_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))";

	/**
   * The cached OCL invariant for the '{@link #validateVDTInpatientPatientInfoProblemSection(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Problem Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfoProblemSection(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_VDT_INPATIENT_PATIENT_INFO_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateVDTInpatientPatientInfoProblemSection(VDTInpatientPatientInfo vdtInpatientPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_VDT_INPATIENT_PATIENT_INFO_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO);
      try
      {
        VALIDATE_VDT_INPATIENT_PATIENT_INFO_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VDT_INPATIENT_PATIENT_INFO_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VDT_INPATIENT_PATIENT_INFO_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vdtInpatientPatientInfo))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_PROBLEM_SECTION,
             Mu2consolPlugin.INSTANCE.getString("VDTInpatientPatientInfoProblemSection"),
             new Object [] { vdtInpatientPatientInfo }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateVDTInpatientPatientInfoResultsSection(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Results Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfoResultsSection(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_VDT_INPATIENT_PATIENT_INFO_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))";

	/**
   * The cached OCL invariant for the '{@link #validateVDTInpatientPatientInfoResultsSection(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Results Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfoResultsSection(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_VDT_INPATIENT_PATIENT_INFO_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateVDTInpatientPatientInfoResultsSection(VDTInpatientPatientInfo vdtInpatientPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_VDT_INPATIENT_PATIENT_INFO_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO);
      try
      {
        VALIDATE_VDT_INPATIENT_PATIENT_INFO_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VDT_INPATIENT_PATIENT_INFO_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VDT_INPATIENT_PATIENT_INFO_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vdtInpatientPatientInfo))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_RESULTS_SECTION,
             Mu2consolPlugin.INSTANCE.getString("VDTInpatientPatientInfoResultsSection"),
             new Object [] { vdtInpatientPatientInfo }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateVDTInpatientPatientInfoPlanOfCareSection(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Plan Of Care Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfoPlanOfCareSection(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_VDT_INPATIENT_PATIENT_INFO_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PlanOfCareSection))";

	/**
   * The cached OCL invariant for the '{@link #validateVDTInpatientPatientInfoPlanOfCareSection(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Plan Of Care Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfoPlanOfCareSection(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_VDT_INPATIENT_PATIENT_INFO_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PlanOfCareSection))
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateVDTInpatientPatientInfoPlanOfCareSection(VDTInpatientPatientInfo vdtInpatientPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_VDT_INPATIENT_PATIENT_INFO_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO);
      try
      {
        VALIDATE_VDT_INPATIENT_PATIENT_INFO_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VDT_INPATIENT_PATIENT_INFO_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VDT_INPATIENT_PATIENT_INFO_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vdtInpatientPatientInfo))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_PLAN_OF_CARE_SECTION,
             Mu2consolPlugin.INSTANCE.getString("VDTInpatientPatientInfoPlanOfCareSection"),
             new Object [] { vdtInpatientPatientInfo }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateVDTInpatientPatientInfoProceduresSection(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Procedures Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfoProceduresSection(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_VDT_INPATIENT_PATIENT_INFO_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection))";

	/**
   * The cached OCL invariant for the '{@link #validateVDTInpatientPatientInfoProceduresSection(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Procedures Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfoProceduresSection(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_VDT_INPATIENT_PATIENT_INFO_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection))
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateVDTInpatientPatientInfoProceduresSection(VDTInpatientPatientInfo vdtInpatientPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_VDT_INPATIENT_PATIENT_INFO_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO);
      try
      {
        VALIDATE_VDT_INPATIENT_PATIENT_INFO_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VDT_INPATIENT_PATIENT_INFO_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_VDT_INPATIENT_PATIENT_INFO_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vdtInpatientPatientInfo))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFO_PROCEDURES_SECTION,
             Mu2consolPlugin.INSTANCE.getString("VDTInpatientPatientInfoProceduresSection"),
             new Object [] { vdtInpatientPatientInfo }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateVDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservation(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Infomu2consol Social History Section Smoking Status Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservation(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSocialHistorySection()->excluding(null)->reject(getSocialHistorySection().entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::SmokingStatusObservation)))";

	/**
   * The cached OCL invariant for the '{@link #validateVDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservation(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Infomu2consol Social History Section Smoking Status Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservation(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Query<?, ?, ?> VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getSocialHistorySection()->excluding(null)->reject(getSocialHistorySection().entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::SmokingStatusObservation)))
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public static  boolean validateVDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservation(VDTInpatientPatientInfo vdtInpatientPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(vdtInpatientPatientInfo);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFOMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION,
             Mu2consolPlugin.INSTANCE.getString("VDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservation"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateVDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Infomu2consol Hospital Admission Medications Section Entries Optional Admission Medication</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getHospitalAdmissionMedicationsSectionEntriesOptional()->excluding(null)->reject(getHospitalAdmissionMedicationsSectionEntriesOptional().entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::AdmissionMedication)))";

	/**
   * The cached OCL invariant for the '{@link #validateVDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Infomu2consol Hospital Admission Medications Section Entries Optional Admission Medication</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Query<?, ?, ?> VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getHospitalAdmissionMedicationsSectionEntriesOptional()->excluding(null)->reject(getHospitalAdmissionMedicationsSectionEntriesOptional().entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::AdmissionMedication)))
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public static  boolean validateVDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(VDTInpatientPatientInfo vdtInpatientPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(vdtInpatientPatientInfo);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFOMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION,
             Mu2consolPlugin.INSTANCE.getString("VDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateVDTInpatientPatientInfomu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Infomu2consol Allergies Section Entries Optional Allergy Problem Act</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfomu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllergiesSectionEntriesOptional()->excluding(null)->reject(getAllergiesSectionEntriesOptional().entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::AllergyProblemAct)))";

	/**
   * The cached OCL invariant for the '{@link #validateVDTInpatientPatientInfomu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Infomu2consol Allergies Section Entries Optional Allergy Problem Act</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfomu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Query<?, ?, ?> VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllergiesSectionEntriesOptional()->excluding(null)->reject(getAllergiesSectionEntriesOptional().entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::AllergyProblemAct)))
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public static  boolean validateVDTInpatientPatientInfomu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(VDTInpatientPatientInfo vdtInpatientPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(vdtInpatientPatientInfo);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFOMU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT,
             Mu2consolPlugin.INSTANCE.getString("VDTInpatientPatientInfomu2consolAllergiesSectionEntriesOptionalAllergyProblemAct"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateVDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Infomu2consol Plan Of Care Section Care Planning For Plan Of Care</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getPlanOfCareSection()->excluding(null)->reject(getPlanOfCareSection().getActs()->exists(a : cda::Act | a.oclIsKindOf(consol::PlanOfCareActivityAct)) or getPlanOfCareSection().getObservations()->exists(o : cda::Observation | o.oclIsKindOf(consol::PlanOfCareActivityObservation)) or getPlanOfCareSection().getEncounters()->exists(e : cda::Encounter | e.oclIsKindOf(consol::PlanOfCareActivityEncounter)))";

	/**
   * The cached OCL invariant for the '{@link #validateVDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Infomu2consol Plan Of Care Section Care Planning For Plan Of Care</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateVDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare(VDTInpatientPatientInfo, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Query<?, ?, ?> VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getPlanOfCareSection()->excluding(null)->reject(getPlanOfCareSection().getActs()->exists(a : cda::Act | a.oclIsKindOf(consol::PlanOfCareActivityAct)) or getPlanOfCareSection().getObservations()->exists(o : cda::Observation | o.oclIsKindOf(consol::PlanOfCareActivityObservation)) or getPlanOfCareSection().getEncounters()->exists(e : cda::Encounter | e.oclIsKindOf(consol::PlanOfCareActivityEncounter)))
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public static  boolean validateVDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare(VDTInpatientPatientInfo vdtInpatientPatientInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(vdtInpatientPatientInfo);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.VDT_INPATIENT_PATIENT_INFO__VDT_INPATIENT_PATIENT_INFOMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE,
             Mu2consolPlugin.INSTANCE.getString("VDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getSocialHistorySection(VDTInpatientPatientInfo) <em>Get Social History Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSocialHistorySection(VDTInpatientPatientInfo)
   * @generated
   * @ordered
   */
	protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::SocialHistorySection))->asSequence()->any(true).oclAsType(mu2consol::SocialHistorySection)";

	/**
   * The cached OCL query for the '{@link #getSocialHistorySection(VDTInpatientPatientInfo) <em>Get Social History Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSocialHistorySection(VDTInpatientPatientInfo)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::SocialHistorySection))->asSequence()->any(true).oclAsType(mu2consol::SocialHistorySection)
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  SocialHistorySection getSocialHistorySection(VDTInpatientPatientInfo vdtInpatientPatientInfo) {
    if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO, Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO.getEAllOperations().get(188));
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
    return (SocialHistorySection) query.evaluate(vdtInpatientPatientInfo);
  }

	/**
   * The cached OCL expression body for the '{@link #getProblemSection(VDTInpatientPatientInfo) <em>Get Problem Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getProblemSection(VDTInpatientPatientInfo)
   * @generated
   * @ordered
   */
	protected static final String GET_PROBLEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))->asSequence()->any(true).oclAsType(consol::ProblemSection)";

	/**
   * The cached OCL query for the '{@link #getProblemSection(VDTInpatientPatientInfo) <em>Get Problem Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getProblemSection(VDTInpatientPatientInfo)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))->asSequence()->any(true).oclAsType(consol::ProblemSection)
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  ProblemSection getProblemSection(VDTInpatientPatientInfo vdtInpatientPatientInfo) {
    if (GET_PROBLEM_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO, Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO.getEAllOperations().get(189));
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
    return (ProblemSection) query.evaluate(vdtInpatientPatientInfo);
  }

	/**
   * The cached OCL expression body for the '{@link #getMedicationsSection(VDTInpatientPatientInfo) <em>Get Medications Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMedicationsSection(VDTInpatientPatientInfo)
   * @generated
   * @ordered
   */
	protected static final String GET_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->any(true).oclAsType(consol::MedicationsSection)";

	/**
   * The cached OCL query for the '{@link #getMedicationsSection(VDTInpatientPatientInfo) <em>Get Medications Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMedicationsSection(VDTInpatientPatientInfo)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->any(true).oclAsType(consol::MedicationsSection)
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  MedicationsSection getMedicationsSection(VDTInpatientPatientInfo vdtInpatientPatientInfo) {
    if (GET_MEDICATIONS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO, Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO.getEAllOperations().get(190));
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
    return (MedicationsSection) query.evaluate(vdtInpatientPatientInfo);
  }

	/**
   * The cached OCL expression body for the '{@link #getHospitalAdmissionMedicationsSectionEntriesOptional(VDTInpatientPatientInfo) <em>Get Hospital Admission Medications Section Entries Optional</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHospitalAdmissionMedicationsSectionEntriesOptional(VDTInpatientPatientInfo)
   * @generated
   * @ordered
   */
	protected static final String GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::HospitalAdmissionMedicationsSectionEntriesOptional))->asSequence()->any(true).oclAsType(mu2consol::HospitalAdmissionMedicationsSectionEntriesOptional)";

	/**
   * The cached OCL query for the '{@link #getHospitalAdmissionMedicationsSectionEntriesOptional(VDTInpatientPatientInfo) <em>Get Hospital Admission Medications Section Entries Optional</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHospitalAdmissionMedicationsSectionEntriesOptional(VDTInpatientPatientInfo)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::HospitalAdmissionMedicationsSectionEntriesOptional))->asSequence()->any(true).oclAsType(mu2consol::HospitalAdmissionMedicationsSectionEntriesOptional)
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  HospitalAdmissionMedicationsSectionEntriesOptional getHospitalAdmissionMedicationsSectionEntriesOptional(VDTInpatientPatientInfo vdtInpatientPatientInfo) {
    if (GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO, Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO.getEAllOperations().get(191));
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
    return (HospitalAdmissionMedicationsSectionEntriesOptional) query.evaluate(vdtInpatientPatientInfo);
  }

	/**
   * The cached OCL expression body for the '{@link #getHospitalDischargeMedicationsSection(VDTInpatientPatientInfo) <em>Get Hospital Discharge Medications Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHospitalDischargeMedicationsSection(VDTInpatientPatientInfo)
   * @generated
   * @ordered
   */
	protected static final String GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSection))->asSequence()->any(true).oclAsType(consol::HospitalDischargeMedicationsSection)";

	/**
   * The cached OCL query for the '{@link #getHospitalDischargeMedicationsSection(VDTInpatientPatientInfo) <em>Get Hospital Discharge Medications Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHospitalDischargeMedicationsSection(VDTInpatientPatientInfo)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSection))->asSequence()->any(true).oclAsType(consol::HospitalDischargeMedicationsSection)
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  HospitalDischargeMedicationsSection getHospitalDischargeMedicationsSection(VDTInpatientPatientInfo vdtInpatientPatientInfo) {
    if (GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO, Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO.getEAllOperations().get(192));
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
    return (HospitalDischargeMedicationsSection) query.evaluate(vdtInpatientPatientInfo);
  }

	/**
   * The cached OCL expression body for the '{@link #getAllergiesSection(VDTInpatientPatientInfo) <em>Get Allergies Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAllergiesSection(VDTInpatientPatientInfo)
   * @generated
   * @ordered
   */
	protected static final String GET_ALLERGIES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))->asSequence()->any(true).oclAsType(consol::AllergiesSection)";

	/**
   * The cached OCL query for the '{@link #getAllergiesSection(VDTInpatientPatientInfo) <em>Get Allergies Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAllergiesSection(VDTInpatientPatientInfo)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))->asSequence()->any(true).oclAsType(consol::AllergiesSection)
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  AllergiesSection getAllergiesSection(VDTInpatientPatientInfo vdtInpatientPatientInfo) {
    if (GET_ALLERGIES_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO, Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO.getEAllOperations().get(193));
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
    return (AllergiesSection) query.evaluate(vdtInpatientPatientInfo);
  }

	/**
   * The cached OCL expression body for the '{@link #getAllergiesSectionEntriesOptional(VDTInpatientPatientInfo) <em>Get Allergies Section Entries Optional</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAllergiesSectionEntriesOptional(VDTInpatientPatientInfo)
   * @generated
   * @ordered
   */
	protected static final String GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::AllergiesSectionEntriesOptional))->asSequence()->any(true).oclAsType(mu2consol::AllergiesSectionEntriesOptional)";

	/**
   * The cached OCL query for the '{@link #getAllergiesSectionEntriesOptional(VDTInpatientPatientInfo) <em>Get Allergies Section Entries Optional</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAllergiesSectionEntriesOptional(VDTInpatientPatientInfo)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::AllergiesSectionEntriesOptional))->asSequence()->any(true).oclAsType(mu2consol::AllergiesSectionEntriesOptional)
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional(VDTInpatientPatientInfo vdtInpatientPatientInfo) {
    if (GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO, Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO.getEAllOperations().get(194));
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
    return (AllergiesSectionEntriesOptional) query.evaluate(vdtInpatientPatientInfo);
  }

	/**
   * The cached OCL expression body for the '{@link #getResultsSection(VDTInpatientPatientInfo) <em>Get Results Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getResultsSection(VDTInpatientPatientInfo)
   * @generated
   * @ordered
   */
	protected static final String GET_RESULTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))->asSequence()->any(true).oclAsType(consol::ResultsSection)";

	/**
   * The cached OCL query for the '{@link #getResultsSection(VDTInpatientPatientInfo) <em>Get Results Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getResultsSection(VDTInpatientPatientInfo)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_RESULTS_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))->asSequence()->any(true).oclAsType(consol::ResultsSection)
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  ResultsSection getResultsSection(VDTInpatientPatientInfo vdtInpatientPatientInfo) {
    if (GET_RESULTS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO, Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO.getEAllOperations().get(195));
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
    return (ResultsSection) query.evaluate(vdtInpatientPatientInfo);
  }

	/**
   * The cached OCL expression body for the '{@link #getVitalSignsSection(VDTInpatientPatientInfo) <em>Get Vital Signs Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getVitalSignsSection(VDTInpatientPatientInfo)
   * @generated
   * @ordered
   */
	protected static final String GET_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))->asSequence()->any(true).oclAsType(consol::VitalSignsSection)";

	/**
   * The cached OCL query for the '{@link #getVitalSignsSection(VDTInpatientPatientInfo) <em>Get Vital Signs Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getVitalSignsSection(VDTInpatientPatientInfo)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))->asSequence()->any(true).oclAsType(consol::VitalSignsSection)
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  VitalSignsSection getVitalSignsSection(VDTInpatientPatientInfo vdtInpatientPatientInfo) {
    if (GET_VITAL_SIGNS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO, Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO.getEAllOperations().get(196));
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
    return (VitalSignsSection) query.evaluate(vdtInpatientPatientInfo);
  }

	/**
   * The cached OCL expression body for the '{@link #getVitalSignsSectionEntriesOptional(VDTInpatientPatientInfo) <em>Get Vital Signs Section Entries Optional</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getVitalSignsSectionEntriesOptional(VDTInpatientPatientInfo)
   * @generated
   * @ordered
   */
	protected static final String GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::VitalSignsSectionEntriesOptional)";

	/**
   * The cached OCL query for the '{@link #getVitalSignsSectionEntriesOptional(VDTInpatientPatientInfo) <em>Get Vital Signs Section Entries Optional</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getVitalSignsSectionEntriesOptional(VDTInpatientPatientInfo)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::VitalSignsSectionEntriesOptional)
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional(VDTInpatientPatientInfo vdtInpatientPatientInfo) {
    if (GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO, Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO.getEAllOperations().get(197));
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
    return (VitalSignsSectionEntriesOptional) query.evaluate(vdtInpatientPatientInfo);
  }

	/**
   * The cached OCL expression body for the '{@link #getPlanOfCareSection(VDTInpatientPatientInfo) <em>Get Plan Of Care Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPlanOfCareSection(VDTInpatientPatientInfo)
   * @generated
   * @ordered
   */
	protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PlanOfCareSection))->asSequence()->any(true).oclAsType(mu2consol::PlanOfCareSection)";

	/**
   * The cached OCL query for the '{@link #getPlanOfCareSection(VDTInpatientPatientInfo) <em>Get Plan Of Care Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPlanOfCareSection(VDTInpatientPatientInfo)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PlanOfCareSection))->asSequence()->any(true).oclAsType(mu2consol::PlanOfCareSection)
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  PlanOfCareSection getPlanOfCareSection(VDTInpatientPatientInfo vdtInpatientPatientInfo) {
    if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO, Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO.getEAllOperations().get(198));
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
    return (PlanOfCareSection) query.evaluate(vdtInpatientPatientInfo);
  }

	/**
   * The cached OCL expression body for the '{@link #getProceduresSection(VDTInpatientPatientInfo) <em>Get Procedures Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getProceduresSection(VDTInpatientPatientInfo)
   * @generated
   * @ordered
   */
	protected static final String GET_PROCEDURES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection))->asSequence()->any(true).oclAsType(consol::ProceduresSection)";

	/**
   * The cached OCL query for the '{@link #getProceduresSection(VDTInpatientPatientInfo) <em>Get Procedures Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getProceduresSection(VDTInpatientPatientInfo)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection))->asSequence()->any(true).oclAsType(consol::ProceduresSection)
   * @param vdtInpatientPatientInfo The receiving '<em><b>VDT Inpatient Patient Info</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  ProceduresSection getProceduresSection(VDTInpatientPatientInfo vdtInpatientPatientInfo) {
    if (GET_PROCEDURES_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO, Mu2consolPackage.Literals.VDT_INPATIENT_PATIENT_INFO.getEAllOperations().get(199));
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
    return (ProceduresSection) query.evaluate(vdtInpatientPatientInfo);
  }

} // VDTInpatientPatientInfoOperations