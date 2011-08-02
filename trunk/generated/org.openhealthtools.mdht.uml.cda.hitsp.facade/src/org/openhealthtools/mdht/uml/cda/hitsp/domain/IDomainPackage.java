/*******************************************************************************
 * Copyright (c) 2011 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.domain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainFactory
 * @generated
 */
public interface IDomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "domain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/hitsp/domain";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "domain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IDomainPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AllergyDrugSensitivityImpl <em>Allergy Drug Sensitivity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AllergyDrugSensitivityImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getAllergyDrugSensitivity()
	 * @generated
	 */
	int ALLERGY_DRUG_SENSITIVITY = 0;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Allergy Drug Sensitivity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_DRUG_SENSITIVITY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationImpl <em>Medication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedication()
	 * @generated
	 */
	int MEDICATION = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Medication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationTypeImpl <em>Medication Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationTypeImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicationType()
	 * @generated
	 */
	int MEDICATION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Medication Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationOrderInformationImpl <em>Medication Order Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationOrderInformationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicationOrderInformation()
	 * @generated
	 */
	int MEDICATION_ORDER_INFORMATION = 3;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Medication Order Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ORDER_INFORMATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ConditionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 4;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ProblemEntryImpl <em>Problem Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ProblemEntryImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getProblemEntry()
	 * @generated
	 */
	int PROBLEM_ENTRY = 5;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Problem Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PatientSummaryImpl <em>Patient Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PatientSummaryImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getPatientSummary()
	 * @generated
	 */
	int PATIENT_SUMMARY = 6;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Patient Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AdvanceDirectivesSectionImpl <em>Advance Directives Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AdvanceDirectivesSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getAdvanceDirectivesSection()
	 * @generated
	 */
	int ADVANCE_DIRECTIVES_SECTION = 7;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Advance Directives Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVES_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AllergiesReactionsSectionImpl <em>Allergies Reactions Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AllergiesReactionsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getAllergiesReactionsSection()
	 * @generated
	 */
	int ALLERGIES_REACTIONS_SECTION = 8;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Allergies Reactions Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIES_REACTIONS_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.CommentImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 9;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ProblemListSectionImpl <em>Problem List Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ProblemListSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getProblemListSection()
	 * @generated
	 */
	int PROBLEM_LIST_SECTION = 10;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Problem List Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.EncountersSectionImpl <em>Encounters Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.EncountersSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getEncountersSection()
	 * @generated
	 */
	int ENCOUNTERS_SECTION = 11;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Encounters Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.EncounterImpl <em>Encounter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.EncounterImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getEncounter()
	 * @generated
	 */
	int ENCOUNTER = 12;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Encounter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ImmunizationsSectionImpl <em>Immunizations Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ImmunizationsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getImmunizationsSection()
	 * @generated
	 */
	int IMMUNIZATIONS_SECTION = 13;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Immunizations Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATIONS_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ImmunizationImpl <em>Immunization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ImmunizationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getImmunization()
	 * @generated
	 */
	int IMMUNIZATION = 14;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Immunization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUNIZATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PayersSectionImpl <em>Payers Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PayersSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getPayersSection()
	 * @generated
	 */
	int PAYERS_SECTION = 15;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Payers Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYERS_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationsSectionImpl <em>Medications Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicationsSection()
	 * @generated
	 */
	int MEDICATIONS_SECTION = 16;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Medications Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PlanOfCareSectionImpl <em>Plan Of Care Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PlanOfCareSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getPlanOfCareSection()
	 * @generated
	 */
	int PLAN_OF_CARE_SECTION = 17;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Plan Of Care Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SurgeriesSectionImpl <em>Surgeries Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SurgeriesSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getSurgeriesSection()
	 * @generated
	 */
	int SURGERIES_SECTION = 18;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Surgeries Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURGERIES_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ProcedureImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getProcedure()
	 * @generated
	 */
	int PROCEDURE = 19;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SupportImpl <em>Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SupportImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getSupport()
	 * @generated
	 */
	int SUPPORT = 20;

	/**
	 * The number of structural features of the '<em>Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.VitalSignsSectionImpl <em>Vital Signs Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.VitalSignsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getVitalSignsSection()
	 * @generated
	 */
	int VITAL_SIGNS_SECTION = 21;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Vital Signs Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DiagnosticResultsSectionImpl <em>Diagnostic Results Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DiagnosticResultsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getDiagnosticResultsSection()
	 * @generated
	 */
	int DIAGNOSTIC_RESULTS_SECTION = 22;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Diagnostic Results Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ResultImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 23;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.VitalSignImpl <em>Vital Sign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.VitalSignImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getVitalSign()
	 * @generated
	 */
	int VITAL_SIGN = 24;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Vital Sign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HistoryOfPastIllnessSectionImpl <em>History Of Past Illness Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HistoryOfPastIllnessSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getHistoryOfPastIllnessSection()
	 * @generated
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION = 25;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>History Of Past Illness Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ChiefComplaintSectionImpl <em>Chief Complaint Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ChiefComplaintSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getChiefComplaintSection()
	 * @generated
	 */
	int CHIEF_COMPLAINT_SECTION = 26;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Chief Complaint Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHIEF_COMPLAINT_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ReasonForReferralSectionImpl <em>Reason For Referral Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ReasonForReferralSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getReasonForReferralSection()
	 * @generated
	 */
	int REASON_FOR_REFERRAL_SECTION = 27;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Reason For Referral Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FOR_REFERRAL_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HistoryOfPresentIllnessImpl <em>History Of Present Illness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HistoryOfPresentIllnessImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getHistoryOfPresentIllness()
	 * @generated
	 */
	int HISTORY_OF_PRESENT_ILLNESS = 28;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>History Of Present Illness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OF_PRESENT_ILLNESS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.FunctionalStatusSectionImpl <em>Functional Status Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.FunctionalStatusSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getFunctionalStatusSection()
	 * @generated
	 */
	int FUNCTIONAL_STATUS_SECTION = 29;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Functional Status Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_STATUS_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HospitalAdmissionDiagnosisSectionImpl <em>Hospital Admission Diagnosis Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HospitalAdmissionDiagnosisSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getHospitalAdmissionDiagnosisSection()
	 * @generated
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION = 30;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Hospital Admission Diagnosis Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DischargeDiagnosisSectionImpl <em>Discharge Diagnosis Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DischargeDiagnosisSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getDischargeDiagnosisSection()
	 * @generated
	 */
	int DISCHARGE_DIAGNOSIS_SECTION = 31;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Discharge Diagnosis Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIAGNOSIS_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AdmissionMedicationHistorySectionImpl <em>Admission Medication History Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AdmissionMedicationHistorySectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getAdmissionMedicationHistorySection()
	 * @generated
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION = 32;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Admission Medication History Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HospitalDischargeMedicationsSectionImpl <em>Hospital Discharge Medications Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HospitalDischargeMedicationsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getHospitalDischargeMedicationsSection()
	 * @generated
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION = 33;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Hospital Discharge Medications Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationsAdministeredSectionImpl <em>Medications Administered Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationsAdministeredSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicationsAdministeredSection()
	 * @generated
	 */
	int MEDICATIONS_ADMINISTERED_SECTION = 34;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Medications Administered Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATIONS_ADMINISTERED_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PhysicalExamSectionImpl <em>Physical Exam Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PhysicalExamSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getPhysicalExamSection()
	 * @generated
	 */
	int PHYSICAL_EXAM_SECTION = 35;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Physical Exam Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_EXAM_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ReviewOfSystemsSectionImpl <em>Review Of Systems Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ReviewOfSystemsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getReviewOfSystemsSection()
	 * @generated
	 */
	int REVIEW_OF_SYSTEMS_SECTION = 36;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Review Of Systems Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OF_SYSTEMS_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HospitalCourseSectionImpl <em>Hospital Course Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HospitalCourseSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getHospitalCourseSection()
	 * @generated
	 */
	int HOSPITAL_COURSE_SECTION = 37;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Hospital Course Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_COURSE_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AssessmentAndPlanSectionImpl <em>Assessment And Plan Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AssessmentAndPlanSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getAssessmentAndPlanSection()
	 * @generated
	 */
	int ASSESSMENT_AND_PLAN_SECTION = 38;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Assessment And Plan Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_AND_PLAN_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.FamilyHistorySectionImpl <em>Family History Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.FamilyHistorySectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getFamilyHistorySection()
	 * @generated
	 */
	int FAMILY_HISTORY_SECTION = 39;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Family History Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SocialHistorySectionImpl <em>Social History Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SocialHistorySectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getSocialHistorySection()
	 * @generated
	 */
	int SOCIAL_HISTORY_SECTION = 40;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Social History Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicalEquipmentSectionImpl <em>Medical Equipment Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicalEquipmentSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicalEquipmentSection()
	 * @generated
	 */
	int MEDICAL_EQUIPMENT_SECTION = 41;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Medical Equipment Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_EQUIPMENT_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.LanguageSpokenImpl <em>Language Spoken</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.LanguageSpokenImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getLanguageSpoken()
	 * @generated
	 */
	int LANGUAGE_SPOKEN = 42;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SPOKEN__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Language Spoken</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_SPOKEN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.InsuranceProviderImpl <em>Insurance Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.InsuranceProviderImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getInsuranceProvider()
	 * @generated
	 */
	int INSURANCE_PROVIDER = 43;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Insurance Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_PROVIDER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HealthcareProviderImpl <em>Healthcare Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HealthcareProviderImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getHealthcareProvider()
	 * @generated
	 */
	int HEALTHCARE_PROVIDER = 44;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCARE_PROVIDER__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Healthcare Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCARE_PROVIDER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationNormalDoseImpl <em>Medication Normal Dose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationNormalDoseImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicationNormalDose()
	 * @generated
	 */
	int MEDICATION_NORMAL_DOSE = 45;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE__CDA_TYPE = MEDICATION__CDA_TYPE;

	/**
	 * The number of structural features of the '<em>Medication Normal Dose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_NORMAL_DOSE_FEATURE_COUNT = MEDICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationSplitDoseImpl <em>Medication Split Dose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationSplitDoseImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicationSplitDose()
	 * @generated
	 */
	int MEDICATION_SPLIT_DOSE = 46;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE__CDA_TYPE = MEDICATION__CDA_TYPE;

	/**
	 * The number of structural features of the '<em>Medication Split Dose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SPLIT_DOSE_FEATURE_COUNT = MEDICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationTaperedDoseImpl <em>Medication Tapered Dose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationTaperedDoseImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicationTaperedDose()
	 * @generated
	 */
	int MEDICATION_TAPERED_DOSE = 47;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE__CDA_TYPE = MEDICATION__CDA_TYPE;

	/**
	 * The number of structural features of the '<em>Medication Tapered Dose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TAPERED_DOSE_FEATURE_COUNT = MEDICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationConditionalDoseImpl <em>Medication Conditional Dose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationConditionalDoseImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicationConditionalDose()
	 * @generated
	 */
	int MEDICATION_CONDITIONAL_DOSE = 48;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE__CDA_TYPE = MEDICATION__CDA_TYPE;

	/**
	 * The number of structural features of the '<em>Medication Conditional Dose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_CONDITIONAL_DOSE_FEATURE_COUNT = MEDICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationCombinationMedicationImpl <em>Medication Combination Medication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationCombinationMedicationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicationCombinationMedication()
	 * @generated
	 */
	int MEDICATION_COMBINATION_MEDICATION = 49;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION__CDA_TYPE = MEDICATION__CDA_TYPE;

	/**
	 * The number of structural features of the '<em>Medication Combination Medication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_COMBINATION_MEDICATION_FEATURE_COUNT = MEDICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SupportGuardianImpl <em>Support Guardian</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SupportGuardianImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getSupportGuardian()
	 * @generated
	 */
	int SUPPORT_GUARDIAN = 50;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_GUARDIAN__CDA_TYPE = SUPPORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Support Guardian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_GUARDIAN_FEATURE_COUNT = SUPPORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SupportParticipantImpl <em>Support Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SupportParticipantImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getSupportParticipant()
	 * @generated
	 */
	int SUPPORT_PARTICIPANT = 51;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_PARTICIPANT__CDA_TYPE = SUPPORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Support Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_PARTICIPANT_FEATURE_COUNT = SUPPORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.UnstructuredDocumentImpl <em>Unstructured Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.UnstructuredDocumentImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getUnstructuredDocument()
	 * @generated
	 */
	int UNSTRUCTURED_DOCUMENT = 52;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Unstructured Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_DOCUMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationInformationImpl <em>Medication Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationInformationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicationInformation()
	 * @generated
	 */
	int MEDICATION_INFORMATION = 53;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_INFORMATION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Medication Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_INFORMATION_FEATURE_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAllergyDrugSensitivity <em>Allergy Drug Sensitivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allergy Drug Sensitivity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAllergyDrugSensitivity
	 * @generated
	 */
	EClass getAllergyDrugSensitivity();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAllergyDrugSensitivity#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAllergyDrugSensitivity#getCDAType()
	 * @see #getAllergyDrugSensitivity()
	 * @generated
	 */
	EReference getAllergyDrugSensitivity_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedication
	 * @generated
	 */
	EClass getMedication();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedication#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedication#getCDAType()
	 * @see #getMedication()
	 * @generated
	 */
	EReference getMedication_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationType <em>Medication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationType
	 * @generated
	 */
	EClass getMedicationType();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationType#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationType#getCDAType()
	 * @see #getMedicationType()
	 * @generated
	 */
	EReference getMedicationType_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationOrderInformation <em>Medication Order Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Order Information</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationOrderInformation
	 * @generated
	 */
	EClass getMedicationOrderInformation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationOrderInformation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationOrderInformation#getCDAType()
	 * @see #getMedicationOrderInformation()
	 * @generated
	 */
	EReference getMedicationOrderInformation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ICondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ICondition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ICondition#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ICondition#getCDAType()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IProblemEntry <em>Problem Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem Entry</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IProblemEntry
	 * @generated
	 */
	EClass getProblemEntry();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IProblemEntry#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IProblemEntry#getCDAType()
	 * @see #getProblemEntry()
	 * @generated
	 */
	EReference getProblemEntry_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPatientSummary <em>Patient Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient Summary</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPatientSummary
	 * @generated
	 */
	EClass getPatientSummary();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPatientSummary#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPatientSummary#getCDAType()
	 * @see #getPatientSummary()
	 * @generated
	 */
	EReference getPatientSummary_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdvanceDirectivesSection <em>Advance Directives Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advance Directives Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdvanceDirectivesSection
	 * @generated
	 */
	EClass getAdvanceDirectivesSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdvanceDirectivesSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdvanceDirectivesSection#getCDAType()
	 * @see #getAdvanceDirectivesSection()
	 * @generated
	 */
	EReference getAdvanceDirectivesSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAllergiesReactionsSection <em>Allergies Reactions Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allergies Reactions Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAllergiesReactionsSection
	 * @generated
	 */
	EClass getAllergiesReactionsSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAllergiesReactionsSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAllergiesReactionsSection#getCDAType()
	 * @see #getAllergiesReactionsSection()
	 * @generated
	 */
	EReference getAllergiesReactionsSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IComment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IComment#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IComment#getCDAType()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IProblemListSection <em>Problem List Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem List Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IProblemListSection
	 * @generated
	 */
	EClass getProblemListSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IProblemListSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IProblemListSection#getCDAType()
	 * @see #getProblemListSection()
	 * @generated
	 */
	EReference getProblemListSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncountersSection <em>Encounters Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encounters Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncountersSection
	 * @generated
	 */
	EClass getEncountersSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncountersSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncountersSection#getCDAType()
	 * @see #getEncountersSection()
	 * @generated
	 */
	EReference getEncountersSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncounter <em>Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encounter</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncounter
	 * @generated
	 */
	EClass getEncounter();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncounter#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncounter#getCDAType()
	 * @see #getEncounter()
	 * @generated
	 */
	EReference getEncounter_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IImmunizationsSection <em>Immunizations Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immunizations Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IImmunizationsSection
	 * @generated
	 */
	EClass getImmunizationsSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IImmunizationsSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IImmunizationsSection#getCDAType()
	 * @see #getImmunizationsSection()
	 * @generated
	 */
	EReference getImmunizationsSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IImmunization <em>Immunization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immunization</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IImmunization
	 * @generated
	 */
	EClass getImmunization();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IImmunization#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IImmunization#getCDAType()
	 * @see #getImmunization()
	 * @generated
	 */
	EReference getImmunization_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPayersSection <em>Payers Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payers Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPayersSection
	 * @generated
	 */
	EClass getPayersSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPayersSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPayersSection#getCDAType()
	 * @see #getPayersSection()
	 * @generated
	 */
	EReference getPayersSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationsSection <em>Medications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medications Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationsSection
	 * @generated
	 */
	EClass getMedicationsSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationsSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationsSection#getCDAType()
	 * @see #getMedicationsSection()
	 * @generated
	 */
	EReference getMedicationsSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareSection <em>Plan Of Care Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Care Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareSection
	 * @generated
	 */
	EClass getPlanOfCareSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareSection#getCDAType()
	 * @see #getPlanOfCareSection()
	 * @generated
	 */
	EReference getPlanOfCareSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISurgeriesSection <em>Surgeries Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surgeries Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISurgeriesSection
	 * @generated
	 */
	EClass getSurgeriesSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISurgeriesSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISurgeriesSection#getCDAType()
	 * @see #getSurgeriesSection()
	 * @generated
	 */
	EReference getSurgeriesSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IProcedure
	 * @generated
	 */
	EClass getProcedure();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IProcedure#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IProcedure#getCDAType()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupport <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Support</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupport
	 * @generated
	 */
	EClass getSupport();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSignsSection <em>Vital Signs Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vital Signs Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSignsSection
	 * @generated
	 */
	EClass getVitalSignsSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSignsSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSignsSection#getCDAType()
	 * @see #getVitalSignsSection()
	 * @generated
	 */
	EReference getVitalSignsSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IDiagnosticResultsSection <em>Diagnostic Results Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagnostic Results Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDiagnosticResultsSection
	 * @generated
	 */
	EClass getDiagnosticResultsSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IDiagnosticResultsSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDiagnosticResultsSection#getCDAType()
	 * @see #getDiagnosticResultsSection()
	 * @generated
	 */
	EReference getDiagnosticResultsSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IResult
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IResult#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IResult#getCDAType()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSign <em>Vital Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vital Sign</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSign
	 * @generated
	 */
	EClass getVitalSign();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSign#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSign#getCDAType()
	 * @see #getVitalSign()
	 * @generated
	 */
	EReference getVitalSign_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IHistoryOfPastIllnessSection <em>History Of Past Illness Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History Of Past Illness Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IHistoryOfPastIllnessSection
	 * @generated
	 */
	EClass getHistoryOfPastIllnessSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IHistoryOfPastIllnessSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IHistoryOfPastIllnessSection#getCDAType()
	 * @see #getHistoryOfPastIllnessSection()
	 * @generated
	 */
	EReference getHistoryOfPastIllnessSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IChiefComplaintSection <em>Chief Complaint Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chief Complaint Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IChiefComplaintSection
	 * @generated
	 */
	EClass getChiefComplaintSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IChiefComplaintSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IChiefComplaintSection#getCDAType()
	 * @see #getChiefComplaintSection()
	 * @generated
	 */
	EReference getChiefComplaintSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IReasonForReferralSection <em>Reason For Referral Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reason For Referral Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IReasonForReferralSection
	 * @generated
	 */
	EClass getReasonForReferralSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IReasonForReferralSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IReasonForReferralSection#getCDAType()
	 * @see #getReasonForReferralSection()
	 * @generated
	 */
	EReference getReasonForReferralSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IHistoryOfPresentIllness <em>History Of Present Illness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History Of Present Illness</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IHistoryOfPresentIllness
	 * @generated
	 */
	EClass getHistoryOfPresentIllness();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IHistoryOfPresentIllness#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IHistoryOfPresentIllness#getCDAType()
	 * @see #getHistoryOfPresentIllness()
	 * @generated
	 */
	EReference getHistoryOfPresentIllness_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IFunctionalStatusSection <em>Functional Status Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Status Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IFunctionalStatusSection
	 * @generated
	 */
	EClass getFunctionalStatusSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IFunctionalStatusSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IFunctionalStatusSection#getCDAType()
	 * @see #getFunctionalStatusSection()
	 * @generated
	 */
	EReference getFunctionalStatusSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IHospitalAdmissionDiagnosisSection <em>Hospital Admission Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospital Admission Diagnosis Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IHospitalAdmissionDiagnosisSection
	 * @generated
	 */
	EClass getHospitalAdmissionDiagnosisSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IHospitalAdmissionDiagnosisSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IHospitalAdmissionDiagnosisSection#getCDAType()
	 * @see #getHospitalAdmissionDiagnosisSection()
	 * @generated
	 */
	EReference getHospitalAdmissionDiagnosisSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IDischargeDiagnosisSection <em>Discharge Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discharge Diagnosis Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDischargeDiagnosisSection
	 * @generated
	 */
	EClass getDischargeDiagnosisSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IDischargeDiagnosisSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDischargeDiagnosisSection#getCDAType()
	 * @see #getDischargeDiagnosisSection()
	 * @generated
	 */
	EReference getDischargeDiagnosisSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdmissionMedicationHistorySection <em>Admission Medication History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admission Medication History Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdmissionMedicationHistorySection
	 * @generated
	 */
	EClass getAdmissionMedicationHistorySection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdmissionMedicationHistorySection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdmissionMedicationHistorySection#getCDAType()
	 * @see #getAdmissionMedicationHistorySection()
	 * @generated
	 */
	EReference getAdmissionMedicationHistorySection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IHospitalDischargeMedicationsSection <em>Hospital Discharge Medications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospital Discharge Medications Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IHospitalDischargeMedicationsSection
	 * @generated
	 */
	EClass getHospitalDischargeMedicationsSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IHospitalDischargeMedicationsSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IHospitalDischargeMedicationsSection#getCDAType()
	 * @see #getHospitalDischargeMedicationsSection()
	 * @generated
	 */
	EReference getHospitalDischargeMedicationsSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationsAdministeredSection <em>Medications Administered Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medications Administered Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationsAdministeredSection
	 * @generated
	 */
	EClass getMedicationsAdministeredSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationsAdministeredSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationsAdministeredSection#getCDAType()
	 * @see #getMedicationsAdministeredSection()
	 * @generated
	 */
	EReference getMedicationsAdministeredSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPhysicalExamSection <em>Physical Exam Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Exam Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPhysicalExamSection
	 * @generated
	 */
	EClass getPhysicalExamSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPhysicalExamSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPhysicalExamSection#getCDAType()
	 * @see #getPhysicalExamSection()
	 * @generated
	 */
	EReference getPhysicalExamSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IReviewOfSystemsSection <em>Review Of Systems Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Review Of Systems Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IReviewOfSystemsSection
	 * @generated
	 */
	EClass getReviewOfSystemsSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IReviewOfSystemsSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IReviewOfSystemsSection#getCDAType()
	 * @see #getReviewOfSystemsSection()
	 * @generated
	 */
	EReference getReviewOfSystemsSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IHospitalCourseSection <em>Hospital Course Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospital Course Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IHospitalCourseSection
	 * @generated
	 */
	EClass getHospitalCourseSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IHospitalCourseSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IHospitalCourseSection#getCDAType()
	 * @see #getHospitalCourseSection()
	 * @generated
	 */
	EReference getHospitalCourseSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAssessmentAndPlanSection <em>Assessment And Plan Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment And Plan Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAssessmentAndPlanSection
	 * @generated
	 */
	EClass getAssessmentAndPlanSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAssessmentAndPlanSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAssessmentAndPlanSection#getCDAType()
	 * @see #getAssessmentAndPlanSection()
	 * @generated
	 */
	EReference getAssessmentAndPlanSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IFamilyHistorySection <em>Family History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family History Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IFamilyHistorySection
	 * @generated
	 */
	EClass getFamilyHistorySection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IFamilyHistorySection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IFamilyHistorySection#getCDAType()
	 * @see #getFamilyHistorySection()
	 * @generated
	 */
	EReference getFamilyHistorySection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISocialHistorySection <em>Social History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social History Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISocialHistorySection
	 * @generated
	 */
	EClass getSocialHistorySection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISocialHistorySection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISocialHistorySection#getCDAType()
	 * @see #getSocialHistorySection()
	 * @generated
	 */
	EReference getSocialHistorySection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicalEquipmentSection <em>Medical Equipment Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medical Equipment Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicalEquipmentSection
	 * @generated
	 */
	EClass getMedicalEquipmentSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicalEquipmentSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicalEquipmentSection#getCDAType()
	 * @see #getMedicalEquipmentSection()
	 * @generated
	 */
	EReference getMedicalEquipmentSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ILanguageSpoken <em>Language Spoken</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Spoken</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ILanguageSpoken
	 * @generated
	 */
	EClass getLanguageSpoken();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ILanguageSpoken#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ILanguageSpoken#getCDAType()
	 * @see #getLanguageSpoken()
	 * @generated
	 */
	EReference getLanguageSpoken_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IInsuranceProvider <em>Insurance Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insurance Provider</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IInsuranceProvider
	 * @generated
	 */
	EClass getInsuranceProvider();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IInsuranceProvider#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IInsuranceProvider#getCDAType()
	 * @see #getInsuranceProvider()
	 * @generated
	 */
	EReference getInsuranceProvider_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IHealthcareProvider <em>Healthcare Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Healthcare Provider</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IHealthcareProvider
	 * @generated
	 */
	EClass getHealthcareProvider();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IHealthcareProvider#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IHealthcareProvider#getCDAType()
	 * @see #getHealthcareProvider()
	 * @generated
	 */
	EReference getHealthcareProvider_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationNormalDose <em>Medication Normal Dose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Normal Dose</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationNormalDose
	 * @generated
	 */
	EClass getMedicationNormalDose();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationSplitDose <em>Medication Split Dose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Split Dose</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationSplitDose
	 * @generated
	 */
	EClass getMedicationSplitDose();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationTaperedDose <em>Medication Tapered Dose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Tapered Dose</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationTaperedDose
	 * @generated
	 */
	EClass getMedicationTaperedDose();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationConditionalDose <em>Medication Conditional Dose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Conditional Dose</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationConditionalDose
	 * @generated
	 */
	EClass getMedicationConditionalDose();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationCombinationMedication <em>Medication Combination Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Combination Medication</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationCombinationMedication
	 * @generated
	 */
	EClass getMedicationCombinationMedication();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupportGuardian <em>Support Guardian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Support Guardian</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupportGuardian
	 * @generated
	 */
	EClass getSupportGuardian();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupportGuardian#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupportGuardian#getCDAType()
	 * @see #getSupportGuardian()
	 * @generated
	 */
	EReference getSupportGuardian_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupportParticipant <em>Support Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Support Participant</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupportParticipant
	 * @generated
	 */
	EClass getSupportParticipant();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupportParticipant#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupportParticipant#getCDAType()
	 * @see #getSupportParticipant()
	 * @generated
	 */
	EReference getSupportParticipant_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IUnstructuredDocument <em>Unstructured Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unstructured Document</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IUnstructuredDocument
	 * @generated
	 */
	EClass getUnstructuredDocument();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IUnstructuredDocument#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IUnstructuredDocument#getCDAType()
	 * @see #getUnstructuredDocument()
	 * @generated
	 */
	EReference getUnstructuredDocument_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationInformation <em>Medication Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Information</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationInformation
	 * @generated
	 */
	EClass getMedicationInformation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationInformation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationInformation#getCDAType()
	 * @see #getMedicationInformation()
	 * @generated
	 */
	EReference getMedicationInformation_CDAType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IDomainFactory getDomainFactory();

} // IDomainPackage
