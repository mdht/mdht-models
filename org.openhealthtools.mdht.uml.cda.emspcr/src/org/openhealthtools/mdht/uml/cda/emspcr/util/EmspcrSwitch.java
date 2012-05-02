/*******************************************************************************
 * Copyright (c) 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.emspcr.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;

import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;

import org.openhealthtools.mdht.uml.cda.emspcr.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
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
      case EmspcrPackage.EMS_BILLING:
      {
        EMSBilling emsBilling = (EMSBilling)theEObject;
        T result = caseEMSBilling(emsBilling);
        if (result == null) result = caseSection(emsBilling);
        if (result == null) result = caseAct(emsBilling);
        if (result == null) result = caseInfrastructureRoot(emsBilling);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_INJURY_INCIDENT_DESCRIPTION:
      {
        EMSInjuryIncidentDescription emsInjuryIncidentDescription = (EMSInjuryIncidentDescription)theEObject;
        T result = caseEMSInjuryIncidentDescription(emsInjuryIncidentDescription);
        if (result == null) result = caseSection(emsInjuryIncidentDescription);
        if (result == null) result = caseAct(emsInjuryIncidentDescription);
        if (result == null) result = caseInfrastructureRoot(emsInjuryIncidentDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_CARDIAC_ARREST_EVENT:
      {
        EMSCardiacArrestEvent emsCardiacArrestEvent = (EMSCardiacArrestEvent)theEObject;
        T result = caseEMSCardiacArrestEvent(emsCardiacArrestEvent);
        if (result == null) result = caseSection(emsCardiacArrestEvent);
        if (result == null) result = caseAct(emsCardiacArrestEvent);
        if (result == null) result = caseInfrastructureRoot(emsCardiacArrestEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_ADVANCE_DIRECTIVES:
      {
        EMSAdvanceDirectives emsAdvanceDirectives = (EMSAdvanceDirectives)theEObject;
        T result = caseEMSAdvanceDirectives(emsAdvanceDirectives);
        if (result == null) result = caseSection(emsAdvanceDirectives);
        if (result == null) result = caseAct(emsAdvanceDirectives);
        if (result == null) result = caseInfrastructureRoot(emsAdvanceDirectives);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_ALLERGIES_AND_ADVERSE_REACTIONS:
      {
        EMSAllergiesAndAdverseReactions emsAllergiesAndAdverseReactions = (EMSAllergiesAndAdverseReactions)theEObject;
        T result = caseEMSAllergiesAndAdverseReactions(emsAllergiesAndAdverseReactions);
        if (result == null) result = caseSection(emsAllergiesAndAdverseReactions);
        if (result == null) result = caseAct(emsAllergiesAndAdverseReactions);
        if (result == null) result = caseInfrastructureRoot(emsAllergiesAndAdverseReactions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmspcrPackage.EMS_CURRENT_MEDICATION_SECTION:
      {
        EMSCurrentMedicationSection emsCurrentMedicationSection = (EMSCurrentMedicationSection)theEObject;
        T result = caseEMSCurrentMedicationSection(emsCurrentMedicationSection);
        if (result == null) result = caseSection(emsCurrentMedicationSection);
        if (result == null) result = caseAct(emsCurrentMedicationSection);
        if (result == null) result = caseInfrastructureRoot(emsCurrentMedicationSection);
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
   * Returns the result of interpreting the object as an instance of '<em>EMS Billing</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Billing</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSBilling(EMSBilling object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Injury Incident Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Injury Incident Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSInjuryIncidentDescription(EMSInjuryIncidentDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Cardiac Arrest Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Cardiac Arrest Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSCardiacArrestEvent(EMSCardiacArrestEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Advance Directives</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Advance Directives</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSAdvanceDirectives(EMSAdvanceDirectives object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMS Allergies And Adverse Reactions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMS Allergies And Adverse Reactions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMSAllergiesAndAdverseReactions(EMSAllergiesAndAdverseReactions object)
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
