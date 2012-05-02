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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;

import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;

import org.openhealthtools.mdht.uml.cda.emspcr.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage
 * @generated
 */
public class EmspcrAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EmspcrPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmspcrAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EmspcrPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EmspcrSwitch<Adapter> modelSwitch =
    new EmspcrSwitch<Adapter>()
    {
      @Override
      public Adapter casePatientCareReport(PatientCareReport object)
      {
        return createPatientCareReportAdapter();
      }
      @Override
      public Adapter caseEMSBilling(EMSBilling object)
      {
        return createEMSBillingAdapter();
      }
      @Override
      public Adapter caseEMSInjuryIncidentDescription(EMSInjuryIncidentDescription object)
      {
        return createEMSInjuryIncidentDescriptionAdapter();
      }
      @Override
      public Adapter caseEMSCardiacArrestEvent(EMSCardiacArrestEvent object)
      {
        return createEMSCardiacArrestEventAdapter();
      }
      @Override
      public Adapter caseEMSAdvanceDirectives(EMSAdvanceDirectives object)
      {
        return createEMSAdvanceDirectivesAdapter();
      }
      @Override
      public Adapter caseEMSAllergiesAndAdverseReactions(EMSAllergiesAndAdverseReactions object)
      {
        return createEMSAllergiesAndAdverseReactionsAdapter();
      }
      @Override
      public Adapter caseEMSCurrentMedicationSection(EMSCurrentMedicationSection object)
      {
        return createEMSCurrentMedicationSectionAdapter();
      }
      @Override
      public Adapter caseInfrastructureRoot(InfrastructureRoot object)
      {
        return createInfrastructureRootAdapter();
      }
      @Override
      public Adapter caseAct(Act object)
      {
        return createActAdapter();
      }
      @Override
      public Adapter caseClinicalDocument(ClinicalDocument object)
      {
        return createClinicalDocumentAdapter();
      }
      @Override
      public Adapter caseGeneralHeaderConstraints(GeneralHeaderConstraints object)
      {
        return createGeneralHeaderConstraintsAdapter();
      }
      @Override
      public Adapter caseSection(Section object)
      {
        return createSectionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport <em>Patient Care Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport
   * @generated
   */
  public Adapter createPatientCareReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBilling <em>EMS Billing</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSBilling
   * @generated
   */
  public Adapter createEMSBillingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescription <em>EMS Injury Incident Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescription
   * @generated
   */
  public Adapter createEMSInjuryIncidentDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEvent <em>EMS Cardiac Arrest Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEvent
   * @generated
   */
  public Adapter createEMSCardiacArrestEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectives <em>EMS Advance Directives</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectives
   * @generated
   */
  public Adapter createEMSAdvanceDirectivesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactions <em>EMS Allergies And Adverse Reactions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactions
   * @generated
   */
  public Adapter createEMSAllergiesAndAdverseReactionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection <em>EMS Current Medication Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection
   * @generated
   */
  public Adapter createEMSCurrentMedicationSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot <em>Infrastructure Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot
   * @generated
   */
  public Adapter createInfrastructureRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.Act <em>Act</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.hl7.rim.Act
   * @generated
   */
  public Adapter createActAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument <em>Clinical Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument
   * @generated
   */
  public Adapter createClinicalDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints <em>General Header Constraints</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints
   * @generated
   */
  public Adapter createGeneralHeaderConstraintsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.Section
   * @generated
   */
  public Adapter createSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //EmspcrAdapterFactory
