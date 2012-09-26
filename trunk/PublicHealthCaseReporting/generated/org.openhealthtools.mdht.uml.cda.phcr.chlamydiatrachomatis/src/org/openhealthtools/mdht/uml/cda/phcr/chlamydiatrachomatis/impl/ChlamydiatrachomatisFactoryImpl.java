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
package org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChlamydiatrachomatisFactoryImpl extends EFactoryImpl implements ChlamydiatrachomatisFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChlamydiatrachomatisFactory init() {
		try {
			ChlamydiatrachomatisFactory theChlamydiatrachomatisFactory = (ChlamydiatrachomatisFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/phcr/chlamydiatrachomatis"); 
			if (theChlamydiatrachomatisFactory != null) {
				return theChlamydiatrachomatisFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ChlamydiatrachomatisFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChlamydiatrachomatisFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT: return createChlamydiatrachomatisPublicHealthCaseReport();
			case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION: return createChlamydiatrachomatisPHCRClinicalInformationSection();
			case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_CASE_OBSERVATION: return createChlamydiatrachomatisCaseObservation();
			case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION: return createChlamydiatrachomatisPHCRRelevantDxTestsSection();
			case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION: return createChlamydiatrachomatisResultObservation();
			case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER: return createchlamydiatrachomatisResultOrganizer();
			case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION: return createChlamydiatrachomatisPHCRTreatmentInformationSection();
			case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT: return createChlamydiatrachomatisTherapeuticRegimenAct();
			case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION: return createChlamydiatrachomatisTreatmentGivenSubstanceAdministration();
			case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION: return createChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChlamydiatrachomatisPublicHealthCaseReport createChlamydiatrachomatisPublicHealthCaseReport() {
		ChlamydiatrachomatisPublicHealthCaseReportImpl chlamydiatrachomatisPublicHealthCaseReport = new ChlamydiatrachomatisPublicHealthCaseReportImpl();
		return chlamydiatrachomatisPublicHealthCaseReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChlamydiatrachomatisPHCRClinicalInformationSection createChlamydiatrachomatisPHCRClinicalInformationSection() {
		ChlamydiatrachomatisPHCRClinicalInformationSectionImpl chlamydiatrachomatisPHCRClinicalInformationSection = new ChlamydiatrachomatisPHCRClinicalInformationSectionImpl();
		return chlamydiatrachomatisPHCRClinicalInformationSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChlamydiatrachomatisCaseObservation createChlamydiatrachomatisCaseObservation() {
		ChlamydiatrachomatisCaseObservationImpl chlamydiatrachomatisCaseObservation = new ChlamydiatrachomatisCaseObservationImpl();
		return chlamydiatrachomatisCaseObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChlamydiatrachomatisPHCRRelevantDxTestsSection createChlamydiatrachomatisPHCRRelevantDxTestsSection() {
		ChlamydiatrachomatisPHCRRelevantDxTestsSectionImpl chlamydiatrachomatisPHCRRelevantDxTestsSection = new ChlamydiatrachomatisPHCRRelevantDxTestsSectionImpl();
		return chlamydiatrachomatisPHCRRelevantDxTestsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChlamydiatrachomatisResultObservation createChlamydiatrachomatisResultObservation() {
		ChlamydiatrachomatisResultObservationImpl chlamydiatrachomatisResultObservation = new ChlamydiatrachomatisResultObservationImpl();
		return chlamydiatrachomatisResultObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public chlamydiatrachomatisResultOrganizer createchlamydiatrachomatisResultOrganizer() {
		chlamydiatrachomatisResultOrganizerImpl chlamydiatrachomatisResultOrganizer = new chlamydiatrachomatisResultOrganizerImpl();
		return chlamydiatrachomatisResultOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChlamydiatrachomatisPHCRTreatmentInformationSection createChlamydiatrachomatisPHCRTreatmentInformationSection() {
		ChlamydiatrachomatisPHCRTreatmentInformationSectionImpl chlamydiatrachomatisPHCRTreatmentInformationSection = new ChlamydiatrachomatisPHCRTreatmentInformationSectionImpl();
		return chlamydiatrachomatisPHCRTreatmentInformationSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChlamydiatrachomatisTherapeuticRegimenAct createChlamydiatrachomatisTherapeuticRegimenAct() {
		ChlamydiatrachomatisTherapeuticRegimenActImpl chlamydiatrachomatisTherapeuticRegimenAct = new ChlamydiatrachomatisTherapeuticRegimenActImpl();
		return chlamydiatrachomatisTherapeuticRegimenAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChlamydiatrachomatisTreatmentGivenSubstanceAdministration createChlamydiatrachomatisTreatmentGivenSubstanceAdministration() {
		ChlamydiatrachomatisTreatmentGivenSubstanceAdministrationImpl chlamydiatrachomatisTreatmentGivenSubstanceAdministration = new ChlamydiatrachomatisTreatmentGivenSubstanceAdministrationImpl();
		return chlamydiatrachomatisTreatmentGivenSubstanceAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration createChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration() {
		ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministrationImpl chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration = new ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministrationImpl();
		return chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChlamydiatrachomatisPackage getChlamydiatrachomatisPackage() {
		return (ChlamydiatrachomatisPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ChlamydiatrachomatisPackage getPackage() {
		return ChlamydiatrachomatisPackage.eINSTANCE;
	}

} //ChlamydiatrachomatisFactoryImpl
