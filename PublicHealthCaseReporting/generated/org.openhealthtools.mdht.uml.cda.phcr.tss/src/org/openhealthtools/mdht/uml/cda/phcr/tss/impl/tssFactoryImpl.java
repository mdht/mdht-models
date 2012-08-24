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
package org.openhealthtools.mdht.uml.cda.phcr.tss.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.phcr.tss.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class tssFactoryImpl extends EFactoryImpl implements tssFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static tssFactory init() {
    try
    {
      tssFactory thetssFactory = (tssFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/phcr/tss"); 
      if (thetssFactory != null)
      {
        return thetssFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new tssFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public tssFactoryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EObject create(EClass eClass) {
    switch (eClass.getClassifierID())
    {
      case tssPackage.TOXIC_SHOCK_SYNDROME_CASE_REPORT: return createToxicShockSyndromeCaseReport();
      case tssPackage.TSS_PHCR_CLINICAL_INFORMATION_SECTION: return createTssPhcrClinicalInformationSection();
      case tssPackage.TSS_CASE_OBSERVATION: return createTssCaseObservation();
      case tssPackage.TSS_SIGNS_AND_SYMPTOMS_OBSERVATION: return createTssSignsAndSymptomsObservation();
      case tssPackage.TSS_PHCR_RELEVANT_DX_TESTS_SECTION: return createTssPhcrRelevantDxTestsSection();
      case tssPackage.TSS_RESULT_ORGANIZER: return createTssResultOrganizer();
      case tssPackage.TSS_RESULT_OBSERVATION: return createTssResultObservation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ToxicShockSyndromeCaseReport createToxicShockSyndromeCaseReport() {
    ToxicShockSyndromeCaseReportImpl toxicShockSyndromeCaseReport = new ToxicShockSyndromeCaseReportImpl();
    return toxicShockSyndromeCaseReport;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TssPhcrClinicalInformationSection createTssPhcrClinicalInformationSection() {
    TssPhcrClinicalInformationSectionImpl tssPhcrClinicalInformationSection = new TssPhcrClinicalInformationSectionImpl();
    return tssPhcrClinicalInformationSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TssCaseObservation createTssCaseObservation() {
    TssCaseObservationImpl tssCaseObservation = new TssCaseObservationImpl();
    return tssCaseObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TssSignsAndSymptomsObservation createTssSignsAndSymptomsObservation() {
    TssSignsAndSymptomsObservationImpl tssSignsAndSymptomsObservation = new TssSignsAndSymptomsObservationImpl();
    return tssSignsAndSymptomsObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TssPhcrRelevantDxTestsSection createTssPhcrRelevantDxTestsSection() {
    TssPhcrRelevantDxTestsSectionImpl tssPhcrRelevantDxTestsSection = new TssPhcrRelevantDxTestsSectionImpl();
    return tssPhcrRelevantDxTestsSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TssResultOrganizer createTssResultOrganizer() {
    TssResultOrganizerImpl tssResultOrganizer = new TssResultOrganizerImpl();
    return tssResultOrganizer;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TssResultObservation createTssResultObservation() {
    TssResultObservationImpl tssResultObservation = new TssResultObservationImpl();
    return tssResultObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public tssPackage gettssPackage() {
    return (tssPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static tssPackage getPackage() {
    return tssPackage.eINSTANCE;
  }

} //tssFactoryImpl
