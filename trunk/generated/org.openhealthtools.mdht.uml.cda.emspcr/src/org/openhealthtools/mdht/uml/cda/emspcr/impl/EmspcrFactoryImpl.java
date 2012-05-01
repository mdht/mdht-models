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
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmspcrFactoryImpl extends EFactoryImpl implements EmspcrFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EmspcrFactory init()
  {
    try
    {
      EmspcrFactory theEmspcrFactory = (EmspcrFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/emspcr"); 
      if (theEmspcrFactory != null)
      {
        return theEmspcrFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EmspcrFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmspcrFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EmspcrPackage.PATIENT_CARE_REPORT: return createPatientCareReport();
      case EmspcrPackage.EMS_BILLING: return createEMSBilling();
      case EmspcrPackage.EMS_INJURY_INCIDENT_DESCRIPTION: return createEMSInjuryIncidentDescription();
      case EmspcrPackage.EMS_CARDIAC_ARREST_EVENT: return createEMSCardiacArrestEvent();
      case EmspcrPackage.EMS_ADVANCE_DIRECTIVES: return createEMSAdvanceDirectives();
      case EmspcrPackage.EMS_ALLERGIES_AND_ADVERSE_REACTIONS: return createEMSAllergiesAndAdverseReactions();
      case EmspcrPackage.EMS_CURRENT_MEDICATION_SECTION: return createEMSCurrentMedicationSection();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatientCareReport createPatientCareReport()
  {
    PatientCareReportImpl patientCareReport = new PatientCareReportImpl();
    return patientCareReport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSBilling createEMSBilling()
  {
    EMSBillingImpl emsBilling = new EMSBillingImpl();
    return emsBilling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSInjuryIncidentDescription createEMSInjuryIncidentDescription()
  {
    EMSInjuryIncidentDescriptionImpl emsInjuryIncidentDescription = new EMSInjuryIncidentDescriptionImpl();
    return emsInjuryIncidentDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSCardiacArrestEvent createEMSCardiacArrestEvent()
  {
    EMSCardiacArrestEventImpl emsCardiacArrestEvent = new EMSCardiacArrestEventImpl();
    return emsCardiacArrestEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSAdvanceDirectives createEMSAdvanceDirectives()
  {
    EMSAdvanceDirectivesImpl emsAdvanceDirectives = new EMSAdvanceDirectivesImpl();
    return emsAdvanceDirectives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSAllergiesAndAdverseReactions createEMSAllergiesAndAdverseReactions()
  {
    EMSAllergiesAndAdverseReactionsImpl emsAllergiesAndAdverseReactions = new EMSAllergiesAndAdverseReactionsImpl();
    return emsAllergiesAndAdverseReactions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSCurrentMedicationSection createEMSCurrentMedicationSection()
  {
    EMSCurrentMedicationSectionImpl emsCurrentMedicationSection = new EMSCurrentMedicationSectionImpl();
    return emsCurrentMedicationSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmspcrPackage getEmspcrPackage()
  {
    return (EmspcrPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EmspcrPackage getPackage()
  {
    return EmspcrPackage.eINSTANCE;
  }

} //EmspcrFactoryImpl
