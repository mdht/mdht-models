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
package org.openhealthtools.mdht.uml.cda.phcr.meningococcal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeningococcalFactoryImpl extends EFactoryImpl implements MeningococcalFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static MeningococcalFactory init()
  {
		try {
			MeningococcalFactory theMeningococcalFactory = (MeningococcalFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/phcr/meningococcal"); 
			if (theMeningococcalFactory != null) {
				return theMeningococcalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MeningococcalFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MeningococcalFactoryImpl()
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
			case MeningococcalPackage.MENINGOCOCCAL_CASE_REPORT: return createMeningococcalCaseReport();
			case MeningococcalPackage.MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION: return createMeningococcalPhcrClinicalInformationSection();
			case MeningococcalPackage.MENINGOCOCCAL_CASE_OBSERVATION: return createMeningococcalCaseObservation();
			case MeningococcalPackage.MENINGOCOCCAL_SIGNS_AND_SYMPTOMS_OBSERVATION: return createMeningococcalSignsAndSymptomsObservation();
			case MeningococcalPackage.MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION: return createMeningococcalPhcrRelevantDxTestsSection();
			case MeningococcalPackage.MENINGOCOCCAL_RESULT_OBSERVATION: return createMeningococcalResultObservation();
			case MeningococcalPackage.MENINGOCOCCAL_RESULT_ORGANIZER: return createMeningococcalResultOrganizer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MeningococcalCaseReport createMeningococcalCaseReport()
  {
		MeningococcalCaseReportImpl meningococcalCaseReport = new MeningococcalCaseReportImpl();
		return meningococcalCaseReport;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeningococcalPhcrClinicalInformationSection createMeningococcalPhcrClinicalInformationSection() {
		MeningococcalPhcrClinicalInformationSectionImpl meningococcalPhcrClinicalInformationSection = new MeningococcalPhcrClinicalInformationSectionImpl();
		return meningococcalPhcrClinicalInformationSection;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeningococcalCaseObservation createMeningococcalCaseObservation() {
		MeningococcalCaseObservationImpl meningococcalCaseObservation = new MeningococcalCaseObservationImpl();
		return meningococcalCaseObservation;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeningococcalSignsAndSymptomsObservation createMeningococcalSignsAndSymptomsObservation() {
		MeningococcalSignsAndSymptomsObservationImpl meningococcalSignsAndSymptomsObservation = new MeningococcalSignsAndSymptomsObservationImpl();
		return meningococcalSignsAndSymptomsObservation;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeningococcalPhcrRelevantDxTestsSection createMeningococcalPhcrRelevantDxTestsSection() {
		MeningococcalPhcrRelevantDxTestsSectionImpl meningococcalPhcrRelevantDxTestsSection = new MeningococcalPhcrRelevantDxTestsSectionImpl();
		return meningococcalPhcrRelevantDxTestsSection;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeningococcalResultObservation createMeningococcalResultObservation() {
		MeningococcalResultObservationImpl meningococcalResultObservation = new MeningococcalResultObservationImpl();
		return meningococcalResultObservation;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeningococcalResultOrganizer createMeningococcalResultOrganizer() {
		MeningococcalResultOrganizerImpl meningococcalResultOrganizer = new MeningococcalResultOrganizerImpl();
		return meningococcalResultOrganizer;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MeningococcalPackage getMeningococcalPackage()
  {
		return (MeningococcalPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static MeningococcalPackage getPackage()
  {
		return MeningococcalPackage.eINSTANCE;
	}

} //MeningococcalFactoryImpl
