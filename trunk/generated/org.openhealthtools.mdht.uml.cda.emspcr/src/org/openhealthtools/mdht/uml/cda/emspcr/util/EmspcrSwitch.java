/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.Section;

import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;

import org.openhealthtools.mdht.uml.cda.emspcr.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.ActRelationship;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage
 * @generated
 */
public class EmspcrSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EmspcrPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmspcrSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EmspcrPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case EmspcrPackage.PATIENT_CARE_REPORT:
      {
        PatientCareReport patientCareReport = (PatientCareReport)theEObject;
        T result = casePatientCareReport(patientCareReport);
        if (result == null) result = caseGeneralHeaderConstraints(patientCareReport);
        if (result == null) result = caseClinicalDocument(patientCareReport);
        if (result == null) result = caseAct(patientCareReport);
        if (result == null) result = caseInfrastructureRoot(patientCareReport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_BILLING_SECTION:
      {
        EMSBillingSection emsBillingSection = (EMSBillingSection)theEObject;
        T result = caseEMSBillingSection(emsBillingSection);
        if (result == null) result = caseDerivedCDASection(emsBillingSection);
        if (result == null) result = caseSection(emsBillingSection);
        if (result == null) result = caseAct(emsBillingSection);
        if (result == null) result = caseInfrastructureRoot(emsBillingSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.DERIVED_CDA_SECTION:
      {
        DerivedCDASection derivedCDASection = (DerivedCDASection)theEObject;
        T result = caseDerivedCDASection(derivedCDASection);
        if (result == null) result = caseSection(derivedCDASection);
        if (result == null) result = caseAct(derivedCDASection);
        if (result == null) result = caseInfrastructureRoot(derivedCDASection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.DERIVED_ENTRY:
      {
        DerivedEntry derivedEntry = (DerivedEntry)theEObject;
        T result = caseDerivedEntry(derivedEntry);
        if (result == null) result = caseEntry(derivedEntry);
        if (result == null) result = caseActRelationship(derivedEntry);
        if (result == null) result = caseInfrastructureRoot(derivedEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION:
      {
        EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection = (EMSInjuryIncidentDescriptionSection)theEObject;
        T result = caseEMSInjuryIncidentDescriptionSection(emsInjuryIncidentDescriptionSection);
        if (result == null) result = caseDerivedCDASection(emsInjuryIncidentDescriptionSection);
        if (result == null) result = caseSection(emsInjuryIncidentDescriptionSection);
        if (result == null) result = caseAct(emsInjuryIncidentDescriptionSection);
        if (result == null) result = caseInfrastructureRoot(emsInjuryIncidentDescriptionSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_CURRENT_MEDICATION_SECTION:
      {
        EMSCurrentMedicationSection emsCurrentMedicationSection = (EMSCurrentMedicationSection)theEObject;
        T result = caseEMSCurrentMedicationSection(emsCurrentMedicationSection);
        if (result == null) result = caseDerivedCDASection(emsCurrentMedicationSection);
        if (result == null) result = caseSection(emsCurrentMedicationSection);
        if (result == null) result = caseAct(emsCurrentMedicationSection);
        if (result == null) result = caseInfrastructureRoot(emsCurrentMedicationSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_CARDIAC_ARREST_EVENT_SECTION:
      {
        EMSCardiacArrestEventSection emsCardiacArrestEventSection = (EMSCardiacArrestEventSection)theEObject;
        T result = caseEMSCardiacArrestEventSection(emsCardiacArrestEventSection);
        if (result == null) result = caseDerivedCDASection(emsCardiacArrestEventSection);
        if (result == null) result = caseSection(emsCardiacArrestEventSection);
        if (result == null) result = caseAct(emsCardiacArrestEventSection);
        if (result == null) result = caseInfrastructureRoot(emsCardiacArrestEventSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_ADVANCE_DIRECTIVES_SECTION:
      {
        EMSAdvanceDirectivesSection emsAdvanceDirectivesSection = (EMSAdvanceDirectivesSection)theEObject;
        T result = caseEMSAdvanceDirectivesSection(emsAdvanceDirectivesSection);
        if (result == null) result = caseDerivedCDASection(emsAdvanceDirectivesSection);
        if (result == null) result = caseSection(emsAdvanceDirectivesSection);
        if (result == null) result = caseAct(emsAdvanceDirectivesSection);
        if (result == null) result = caseInfrastructureRoot(emsAdvanceDirectivesSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION:
      {
        EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection = (EMSAllergiesAndAdverseReactionsSection)theEObject;
        T result = caseEMSAllergiesAndAdverseReactionsSection(emsAllergiesAndAdverseReactionsSection);
        if (result == null) result = caseDerivedCDASection(emsAllergiesAndAdverseReactionsSection);
        if (result == null) result = caseSection(emsAllergiesAndAdverseReactionsSection);
        if (result == null) result = caseAct(emsAllergiesAndAdverseReactionsSection);
        if (result == null) result = caseInfrastructureRoot(emsAllergiesAndAdverseReactionsSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_PAST_MEDICAL_HISTORY:
      {
        EMSPastMedicalHistory emsPastMedicalHistory = (EMSPastMedicalHistory)theEObject;
        T result = caseEMSPastMedicalHistory(emsPastMedicalHistory);
        if (result == null) result = caseDerivedCDASection(emsPastMedicalHistory);
        if (result == null) result = caseSection(emsPastMedicalHistory);
        if (result == null) result = caseAct(emsPastMedicalHistory);
        if (result == null) result = caseInfrastructureRoot(emsPastMedicalHistory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_SOCIAL_HISTORY:
      {
        EMSSocialHistory emsSocialHistory = (EMSSocialHistory)theEObject;
        T result = caseEMSSocialHistory(emsSocialHistory);
        if (result == null) result = caseDerivedCDASection(emsSocialHistory);
        if (result == null) result = caseSection(emsSocialHistory);
        if (result == null) result = caseAct(emsSocialHistory);
        if (result == null) result = caseInfrastructureRoot(emsSocialHistory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_PHYSICAL_ASSESSMENT_SECTION:
      {
        EMSPhysicalAssessmentSection emsPhysicalAssessmentSection = (EMSPhysicalAssessmentSection)theEObject;
        T result = caseEMSPhysicalAssessmentSection(emsPhysicalAssessmentSection);
        if (result == null) result = caseDerivedCDASection(emsPhysicalAssessmentSection);
        if (result == null) result = caseSection(emsPhysicalAssessmentSection);
        if (result == null) result = caseAct(emsPhysicalAssessmentSection);
        if (result == null) result = caseInfrastructureRoot(emsPhysicalAssessmentSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_MEDICATIONS_ADMINISTERED_SECTION:
      {
        EMSMedicationsAdministeredSection emsMedicationsAdministeredSection = (EMSMedicationsAdministeredSection)theEObject;
        T result = caseEMSMedicationsAdministeredSection(emsMedicationsAdministeredSection);
        if (result == null) result = caseDerivedCDASection(emsMedicationsAdministeredSection);
        if (result == null) result = caseSection(emsMedicationsAdministeredSection);
        if (result == null) result = caseAct(emsMedicationsAdministeredSection);
        if (result == null) result = caseInfrastructureRoot(emsMedicationsAdministeredSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_PROCEDURES_PERFORMED_SECTION:
      {
        EMSProceduresPerformedSection emsProceduresPerformedSection = (EMSProceduresPerformedSection)theEObject;
        T result = caseEMSProceduresPerformedSection(emsProceduresPerformedSection);
        if (result == null) result = caseDerivedCDASection(emsProceduresPerformedSection);
        if (result == null) result = caseSection(emsProceduresPerformedSection);
        if (result == null) result = caseAct(emsProceduresPerformedSection);
        if (result == null) result = caseInfrastructureRoot(emsProceduresPerformedSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_PATIENT_CARE_NARRATIVE:
      {
        EMSPatientCareNarrative emsPatientCareNarrative = (EMSPatientCareNarrative)theEObject;
        T result = caseEMSPatientCareNarrative(emsPatientCareNarrative);
        if (result == null) result = caseSection(emsPatientCareNarrative);
        if (result == null) result = caseAct(emsPatientCareNarrative);
        if (result == null) result = caseInfrastructureRoot(emsPatientCareNarrative);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_SCENE_SECTION:
      {
        EMSSceneSection emsSceneSection = (EMSSceneSection)theEObject;
        T result = caseEMSSceneSection(emsSceneSection);
        if (result == null) result = caseDerivedCDASection(emsSceneSection);
        if (result == null) result = caseSection(emsSceneSection);
        if (result == null) result = caseAct(emsSceneSection);
        if (result == null) result = caseInfrastructureRoot(emsSceneSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_VITAL_SIGNS_SECTION:
      {
        EMSVitalSignsSection emsVitalSignsSection = (EMSVitalSignsSection)theEObject;
        T result = caseEMSVitalSignsSection(emsVitalSignsSection);
        if (result == null) result = caseDerivedCDASection(emsVitalSignsSection);
        if (result == null) result = caseSection(emsVitalSignsSection);
        if (result == null) result = caseAct(emsVitalSignsSection);
        if (result == null) result = caseInfrastructureRoot(emsVitalSignsSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_DISPATCH:
      {
        EMSDispatch emsDispatch = (EMSDispatch)theEObject;
        T result = caseEMSDispatch(emsDispatch);
        if (result == null) result = caseDerivedCDASection(emsDispatch);
        if (result == null) result = caseSection(emsDispatch);
        if (result == null) result = caseAct(emsDispatch);
        if (result == null) result = caseInfrastructureRoot(emsDispatch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_RESPONSE:
      {
        EMSResponse emsResponse = (EMSResponse)theEObject;
        T result = caseEMSResponse(emsResponse);
        if (result == null) result = caseDerivedCDASection(emsResponse);
        if (result == null) result = caseSection(emsResponse);
        if (result == null) result = caseAct(emsResponse);
        if (result == null) result = caseInfrastructureRoot(emsResponse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_DISPOSITION_SECTION:
      {
        EMSDispositionSection emsDispositionSection = (EMSDispositionSection)theEObject;
        T result = caseEMSDispositionSection(emsDispositionSection);
        if (result == null) result = caseDerivedCDASection(emsDispositionSection);
        if (result == null) result = caseSection(emsDispositionSection);
        if (result == null) result = caseAct(emsDispositionSection);
        if (result == null) result = caseInfrastructureRoot(emsDispositionSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_PERSONNEL_ADVERSE_EVENT:
      {
        EMSPersonnelAdverseEvent emsPersonnelAdverseEvent = (EMSPersonnelAdverseEvent)theEObject;
        T result = caseEMSPersonnelAdverseEvent(emsPersonnelAdverseEvent);
        if (result == null) result = caseDerivedCDASection(emsPersonnelAdverseEvent);
        if (result == null) result = caseSection(emsPersonnelAdverseEvent);
        if (result == null) result = caseAct(emsPersonnelAdverseEvent);
        if (result == null) result = caseInfrastructureRoot(emsPersonnelAdverseEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_PROTOCOL_SECTION:
      {
        EMSProtocolSection emsProtocolSection = (EMSProtocolSection)theEObject;
        T result = caseEMSProtocolSection(emsProtocolSection);
        if (result == null) result = caseDerivedCDASection(emsProtocolSection);
        if (result == null) result = caseSection(emsProtocolSection);
        if (result == null) result = caseAct(emsProtocolSection);
        if (result == null) result = caseInfrastructureRoot(emsProtocolSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_SITUATION_SECTION:
      {
        EMSSituationSection emsSituationSection = (EMSSituationSection)theEObject;
        T result = caseEMSSituationSection(emsSituationSection);
        if (result == null) result = caseDerivedCDASection(emsSituationSection);
        if (result == null) result = caseSection(emsSituationSection);
        if (result == null) result = caseAct(emsSituationSection);
        if (result == null) result = caseInfrastructureRoot(emsSituationSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_TIMES_SECTION:
      {
        EMSTimesSection emsTimesSection = (EMSTimesSection)theEObject;
        T result = caseEMSTimesSection(emsTimesSection);
        if (result == null) result = caseDerivedCDASection(emsTimesSection);
        if (result == null) result = caseSection(emsTimesSection);
        if (result == null) result = caseAct(emsTimesSection);
        if (result == null) result = caseInfrastructureRoot(emsTimesSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Patient Care Report</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatientCareReport(PatientCareReport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Billing Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Billing Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSBillingSection(EMSBillingSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Derived CDA Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Derived CDA Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDerivedCDASection(DerivedCDASection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Derived Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Derived Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDerivedEntry(DerivedEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Injury Incident Description Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Injury Incident Description Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSInjuryIncidentDescriptionSection(EMSInjuryIncidentDescriptionSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Current Medication Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Current Medication Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSCurrentMedicationSection(EMSCurrentMedicationSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Cardiac Arrest Event Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Cardiac Arrest Event Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSCardiacArrestEventSection(EMSCardiacArrestEventSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Advance Directives Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Advance Directives Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSAdvanceDirectivesSection(EMSAdvanceDirectivesSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Allergies And Adverse Reactions Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Allergies And Adverse Reactions Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSAllergiesAndAdverseReactionsSection(EMSAllergiesAndAdverseReactionsSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Past Medical History</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Past Medical History</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSPastMedicalHistory(EMSPastMedicalHistory object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Social History</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Social History</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSSocialHistory(EMSSocialHistory object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Physical Assessment Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Physical Assessment Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSPhysicalAssessmentSection(EMSPhysicalAssessmentSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Medications Administered Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Medications Administered Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSMedicationsAdministeredSection(EMSMedicationsAdministeredSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Procedures Performed Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Procedures Performed Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSProceduresPerformedSection(EMSProceduresPerformedSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Patient Care Narrative</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Patient Care Narrative</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSPatientCareNarrative(EMSPatientCareNarrative object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Scene Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Scene Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSSceneSection(EMSSceneSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Vital Signs Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Vital Signs Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSVitalSignsSection(EMSVitalSignsSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Dispatch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Dispatch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSDispatch(EMSDispatch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Response</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Response</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSResponse(EMSResponse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Disposition Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Disposition Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSDispositionSection(EMSDispositionSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Personnel Adverse Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Personnel Adverse Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSPersonnelAdverseEvent(EMSPersonnelAdverseEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Protocol Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Protocol Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSProtocolSection(EMSProtocolSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Situation Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Situation Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSSituationSection(EMSSituationSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Times Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Times Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSTimesSection(EMSTimesSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInfrastructureRoot(InfrastructureRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Act</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAct(Act object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClinicalDocument(ClinicalDocument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>General Header Constraints</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeneralHeaderConstraints(GeneralHeaderConstraints object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSection(Section object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Act Relationship</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Act Relationship</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActRelationship(ActRelationship object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntry(Entry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //EmspcrSwitch
