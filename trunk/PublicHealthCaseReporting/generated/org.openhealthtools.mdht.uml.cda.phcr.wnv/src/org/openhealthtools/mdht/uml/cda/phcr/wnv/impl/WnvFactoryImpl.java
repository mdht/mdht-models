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
package org.openhealthtools.mdht.uml.cda.phcr.wnv.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.*;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WestNileVirusCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvFactory;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPackage;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvSignsAndSymptomsObservation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WnvFactoryImpl extends EFactoryImpl implements WnvFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static WnvFactory init()
  {
		try {
			WnvFactory theWnvFactory = (WnvFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/phcr/wnv"); 
			if (theWnvFactory != null) {
				return theWnvFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WnvFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WnvFactoryImpl()
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
			case WnvPackage.WEST_NILE_VIRUS_CASE_REPORT: return createWestNileVirusCaseReport();
			case WnvPackage.WNV_PHCR_CLINICAL_INFORMATION_SECTION: return createWnvPhcrClinicalInformationSection();
			case WnvPackage.WNV_CASE_OBSERVATION: return createWnvCaseObservation();
			case WnvPackage.WNV_SIGNS_AND_SYMPTOMS_OBSERVATION: return createWnvSignsAndSymptomsObservation();
			case WnvPackage.WNV_PHCR_RELEVANT_DX_TESTS_SECTION: return createWnvPhcrRelevantDxTestsSection();
			case WnvPackage.WNV_RESULT_OBSERVATION: return createWnvResultObservation();
			case WnvPackage.WNV_RESULT_ORGANIZER: return createWnvResultOrganizer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WestNileVirusCaseReport createWestNileVirusCaseReport()
  {
		WestNileVirusCaseReportImpl westNileVirusCaseReport = new WestNileVirusCaseReportImpl();
		return westNileVirusCaseReport;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WnvPhcrClinicalInformationSection createWnvPhcrClinicalInformationSection()
  {
		WnvPhcrClinicalInformationSectionImpl wnvPhcrClinicalInformationSection = new WnvPhcrClinicalInformationSectionImpl();
		return wnvPhcrClinicalInformationSection;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WnvCaseObservation createWnvCaseObservation()
  {
		WnvCaseObservationImpl wnvCaseObservation = new WnvCaseObservationImpl();
		return wnvCaseObservation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WnvSignsAndSymptomsObservation createWnvSignsAndSymptomsObservation()
  {
		WnvSignsAndSymptomsObservationImpl wnvSignsAndSymptomsObservation = new WnvSignsAndSymptomsObservationImpl();
		return wnvSignsAndSymptomsObservation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WnvPhcrRelevantDxTestsSection createWnvPhcrRelevantDxTestsSection()
  {
		WnvPhcrRelevantDxTestsSectionImpl wnvPhcrRelevantDxTestsSection = new WnvPhcrRelevantDxTestsSectionImpl();
		return wnvPhcrRelevantDxTestsSection;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WnvResultObservation createWnvResultObservation() {
		WnvResultObservationImpl wnvResultObservation = new WnvResultObservationImpl();
		return wnvResultObservation;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WnvResultOrganizer createWnvResultOrganizer() {
		WnvResultOrganizerImpl wnvResultOrganizer = new WnvResultOrganizerImpl();
		return wnvResultOrganizer;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WnvPackage getWnvPackage()
  {
		return (WnvPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static WnvPackage getPackage()
  {
		return WnvPackage.eINSTANCE;
	}

} //WnvFactoryImpl
