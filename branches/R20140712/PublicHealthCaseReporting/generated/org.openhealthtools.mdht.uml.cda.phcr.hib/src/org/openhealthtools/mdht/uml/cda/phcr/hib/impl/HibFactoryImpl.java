/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.hib.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.phcr.hib.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HibFactoryImpl extends EFactoryImpl implements HibFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static HibFactory init()
  {
		try {
			HibFactory theHibFactory = (HibFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/phcr/hib"); 
			if (theHibFactory != null) {
				return theHibFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HibFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HibFactoryImpl()
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
		switch (eClass.getClassifierID()) {
			case HibPackage.HIB_CASE_REPORT: return createHIBCaseReport();
			case HibPackage.HIB_PHCR_CLINICAL_INFORMATION_SECTION: return createHibPhcrClinicalInformationSection();
			case HibPackage.HIB_CASE_OBSERVATION: return createHibCaseObservation();
			case HibPackage.HIB_SIGNS_AND_SYMPTOMS: return createHibSignsAndSymptoms();
			case HibPackage.HIB_PHCR_RELEVANT_DX_TESTS_SECTION: return createHibPhcrRelevantDxTestsSection();
			case HibPackage.HIB_RESULT_OBSERVATION: return createHibResultObservation();
			case HibPackage.HIB_RESULT_ORGANIZER: return createHibResultOrganizer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HIBCaseReport createHIBCaseReport()
  {
		HIBCaseReportImpl hibCaseReport = new HIBCaseReportImpl();
		return hibCaseReport;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HibPhcrClinicalInformationSection createHibPhcrClinicalInformationSection() {
		HibPhcrClinicalInformationSectionImpl hibPhcrClinicalInformationSection = new HibPhcrClinicalInformationSectionImpl();
		return hibPhcrClinicalInformationSection;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HibCaseObservation createHibCaseObservation() {
		HibCaseObservationImpl hibCaseObservation = new HibCaseObservationImpl();
		return hibCaseObservation;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HibSignsAndSymptoms createHibSignsAndSymptoms() {
		HibSignsAndSymptomsImpl hibSignsAndSymptoms = new HibSignsAndSymptomsImpl();
		return hibSignsAndSymptoms;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HibPhcrRelevantDxTestsSection createHibPhcrRelevantDxTestsSection() {
		HibPhcrRelevantDxTestsSectionImpl hibPhcrRelevantDxTestsSection = new HibPhcrRelevantDxTestsSectionImpl();
		return hibPhcrRelevantDxTestsSection;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HibResultObservation createHibResultObservation() {
		HibResultObservationImpl hibResultObservation = new HibResultObservationImpl();
		return hibResultObservation;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HibResultOrganizer createHibResultOrganizer() {
		HibResultOrganizerImpl hibResultOrganizer = new HibResultOrganizerImpl();
		return hibResultOrganizer;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HibPackage getHibPackage()
  {
		return (HibPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static HibPackage getPackage()
  {
		return HibPackage.eINSTANCE;
	}

} //HibFactoryImpl
