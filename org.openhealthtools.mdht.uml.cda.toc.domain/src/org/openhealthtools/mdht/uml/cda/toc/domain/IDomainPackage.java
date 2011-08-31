/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.domain;

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
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainFactory
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
	String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/toc/domain";

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
	IDomainPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.DischargeSummaryImpl <em>Discharge Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DischargeSummaryImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getDischargeSummary()
	 * @generated
	 */
	int DISCHARGE_SUMMARY = 0;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Discharge Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.AllergiesReactionsSectionImpl <em>Allergies Reactions Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.AllergiesReactionsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getAllergiesReactionsSection()
	 * @generated
	 */
	int ALLERGIES_REACTIONS_SECTION = 1;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.AllergyDrugSensitivityImpl <em>Allergy Drug Sensitivity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.AllergyDrugSensitivityImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getAllergyDrugSensitivity()
	 * @generated
	 */
	int ALLERGY_DRUG_SENSITIVITY = 2;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.EpisodeObservationImpl <em>Episode Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.EpisodeObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getEpisodeObservation()
	 * @generated
	 */
	int EPISODE_OBSERVATION = 3;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Episode Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.ProblemEntryImpl <em>Problem Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.ProblemEntryImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getProblemEntry()
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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.AllergyIntoleranceImpl <em>Allergy Intolerance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.AllergyIntoleranceImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getAllergyIntolerance()
	 * @generated
	 */
	int ALLERGY_INTOLERANCE = 4;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE__CDA_TYPE = PROBLEM_ENTRY__CDA_TYPE;

	/**
	 * The number of structural features of the '<em>Allergy Intolerance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_INTOLERANCE_FEATURE_COUNT = PROBLEM_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.AgeObservationImpl <em>Age Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.AgeObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getAgeObservation()
	 * @generated
	 */
	int AGE_OBSERVATION = 6;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Age Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.SeverityImpl <em>Severity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.SeverityImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 7;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Severity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.StatusObservationImpl <em>Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.StatusObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getStatusObservation()
	 * @generated
	 */
	int STATUS_OBSERVATION = 9;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Status Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.ProblemStatusObservationImpl <em>Problem Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.ProblemStatusObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getProblemStatusObservation()
	 * @generated
	 */
	int PROBLEM_STATUS_OBSERVATION = 8;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__CDA_TYPE = STATUS_OBSERVATION__CDA_TYPE;

	/**
	 * The number of structural features of the '<em>Problem Status Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION_FEATURE_COUNT = STATUS_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.HealthStatusObservationImpl <em>Health Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.HealthStatusObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getHealthStatusObservation()
	 * @generated
	 */
	int HEALTH_STATUS_OBSERVATION = 10;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Health Status Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.CommentImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 11;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.FamilyHistoryObservationImpl <em>Family History Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.FamilyHistoryObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getFamilyHistoryObservation()
	 * @generated
	 */
	int FAMILY_HISTORY_OBSERVATION = 13;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.CauseOfDeathObservationImpl <em>Cause Of Death Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.CauseOfDeathObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getCauseOfDeathObservation()
	 * @generated
	 */
	int CAUSE_OF_DEATH_OBSERVATION = 12;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.ProblemEntryReactionObservationContainerImpl <em>Problem Entry Reaction Observation Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.ProblemEntryReactionObservationContainerImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getProblemEntryReactionObservationContainer()
	 * @generated
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER = 15;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.ProblemListSectionImpl <em>Problem List Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.ProblemListSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getProblemListSection()
	 * @generated
	 */
	int PROBLEM_LIST_SECTION = 16;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.ConditionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 17;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.HospitalCourseSectionImpl <em>Hospital Course Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.HospitalCourseSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getHospitalCourseSection()
	 * @generated
	 */
	int HOSPITAL_COURSE_SECTION = 18;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.HospitalDischargeMedicationsSectionImpl <em>Hospital Discharge Medications Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.HospitalDischargeMedicationsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getHospitalDischargeMedicationsSection()
	 * @generated
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION = 19;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.MedicationImpl <em>Medication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.MedicationImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getMedication()
	 * @generated
	 */
	int MEDICATION = 20;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.MedicationSeriesNumberObservationImpl <em>Medication Series Number Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.MedicationSeriesNumberObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getMedicationSeriesNumberObservation()
	 * @generated
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION = 21;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.MedicationStatusObservationImpl <em>Medication Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.MedicationStatusObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getMedicationStatusObservation()
	 * @generated
	 */
	int MEDICATION_STATUS_OBSERVATION = 22;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.ReactionObservationImpl <em>Reaction Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.ReactionObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getReactionObservation()
	 * @generated
	 */
	int REACTION_OBSERVATION = 23;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.SeverityObservationImpl <em>Severity Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.SeverityObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getSeverityObservation()
	 * @generated
	 */
	int SEVERITY_OBSERVATION = 24;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.ProductInstanceImpl <em>Product Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.ProductInstanceImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getProductInstance()
	 * @generated
	 */
	int PRODUCT_INSTANCE = 25;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.InternalReferenceImpl <em>Internal Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.InternalReferenceImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getInternalReference()
	 * @generated
	 */
	int INTERNAL_REFERENCE = 26;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.PatientMedicalInstructionsImpl <em>Patient Medical Instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.PatientMedicalInstructionsImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getPatientMedicalInstructions()
	 * @generated
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS = 27;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.MedicationTypeImpl <em>Medication Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.MedicationTypeImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getMedicationType()
	 * @generated
	 */
	int MEDICATION_TYPE = 28;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.MedicationOrderInformationImpl <em>Medication Order Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.MedicationOrderInformationImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getMedicationOrderInformation()
	 * @generated
	 */
	int MEDICATION_ORDER_INFORMATION = 29;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.MedicationFullfillmentInstructionsImpl <em>Medication Fullfillment Instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.MedicationFullfillmentInstructionsImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getMedicationFullfillmentInstructions()
	 * @generated
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS = 30;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.DischargeDiagnosisSectionImpl <em>Discharge Diagnosis Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DischargeDiagnosisSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getDischargeDiagnosisSection()
	 * @generated
	 */
	int DISCHARGE_DIAGNOSIS_SECTION = 31;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.PlanOfCareSectionImpl <em>Plan Of Care Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.PlanOfCareSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getPlanOfCareSection()
	 * @generated
	 */
	int PLAN_OF_CARE_SECTION = 32;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.PlanOfCareActivityImpl <em>Plan Of Care Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.PlanOfCareActivityImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getPlanOfCareActivity()
	 * @generated
	 */
	int PLAN_OF_CARE_ACTIVITY = 34;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.PlanOfCareActivityActImpl <em>Plan Of Care Activity Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.PlanOfCareActivityActImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getPlanOfCareActivityAct()
	 * @generated
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT = 33;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.PlanOfCareActivityEncounterImpl <em>Plan Of Care Activity Encounter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.PlanOfCareActivityEncounterImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getPlanOfCareActivityEncounter()
	 * @generated
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER = 35;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.PlanOfCareActivityObservationImpl <em>Plan Of Care Activity Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.PlanOfCareActivityObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getPlanOfCareActivityObservation()
	 * @generated
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION = 36;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.PlanOfCareActivityProcedureImpl <em>Plan Of Care Activity Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.PlanOfCareActivityProcedureImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getPlanOfCareActivityProcedure()
	 * @generated
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE = 37;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.PlanOfCareActivitySubstanceAdministrationImpl <em>Plan Of Care Activity Substance Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.PlanOfCareActivitySubstanceAdministrationImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getPlanOfCareActivitySubstanceAdministration()
	 * @generated
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION = 38;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.PlanOfCareActivitySupplyImpl <em>Plan Of Care Activity Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.PlanOfCareActivitySupplyImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getPlanOfCareActivitySupply()
	 * @generated
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY = 39;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.ImmunizationImpl <em>Immunization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.ImmunizationImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getImmunization()
	 * @generated
	 */
	int IMMUNIZATION = 40;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.PatientInstructionImpl <em>Patient Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.PatientInstructionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getPatientInstruction()
	 * @generated
	 */
	int PATIENT_INSTRUCTION = 41;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.EncounterImpl <em>Encounter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.EncounterImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getEncounter()
	 * @generated
	 */
	int ENCOUNTER = 42;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.ProcedureImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getProcedure()
	 * @generated
	 */
	int PROCEDURE = 43;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.SurgeriesSectionImpl <em>Surgeries Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.SurgeriesSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getSurgeriesSection()
	 * @generated
	 */
	int SURGERIES_SECTION = 44;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.ExternalReferenceImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getExternalReference()
	 * @generated
	 */
	int EXTERNAL_REFERENCE = 45;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.ProcedureEntryImpl <em>Procedure Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.ProcedureEntryImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getProcedureEntry()
	 * @generated
	 */
	int PROCEDURE_ENTRY = 47;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.ProcedureEntryProcedureActivityProcedureImpl <em>Procedure Entry Procedure Activity Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.ProcedureEntryProcedureActivityProcedureImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getProcedureEntryProcedureActivityProcedure()
	 * @generated
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE = 46;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.EncounterLocationImpl <em>Encounter Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.EncounterLocationImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getEncounterLocation()
	 * @generated
	 */
	int ENCOUNTER_LOCATION = 48;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.MedicationActivityImpl <em>Medication Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.MedicationActivityImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getMedicationActivity()
	 * @generated
	 */
	int MEDICATION_ACTIVITY = 49;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.ChiefComplaintSectionImpl <em>Chief Complaint Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.ChiefComplaintSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getChiefComplaintSection()
	 * @generated
	 */
	int CHIEF_COMPLAINT_SECTION = 50;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.DischargeDietImpl <em>Discharge Diet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DischargeDietImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getDischargeDiet()
	 * @generated
	 */
	int DISCHARGE_DIET = 51;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.FamilyHistorySectionImpl <em>Family History Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.FamilyHistorySectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getFamilyHistorySection()
	 * @generated
	 */
	int FAMILY_HISTORY_SECTION = 52;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.FamilyHistoryImpl <em>Family History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.FamilyHistoryImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getFamilyHistory()
	 * @generated
	 */
	int FAMILY_HISTORY = 53;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.FunctionalStatusSectionImpl <em>Functional Status Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.FunctionalStatusSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getFunctionalStatusSection()
	 * @generated
	 */
	int FUNCTIONAL_STATUS_SECTION = 54;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.HistoryOfPresentIllnessImpl <em>History Of Present Illness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.HistoryOfPresentIllnessImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getHistoryOfPresentIllness()
	 * @generated
	 */
	int HISTORY_OF_PRESENT_ILLNESS = 55;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.HospitalDischargePhysicalImpl <em>Hospital Discharge Physical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.HospitalDischargePhysicalImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getHospitalDischargePhysical()
	 * @generated
	 */
	int HOSPITAL_DISCHARGE_PHYSICAL = 56;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.HospitalDischargeStudiesSummarySectionImpl <em>Hospital Discharge Studies Summary Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.HospitalDischargeStudiesSummarySectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getHospitalDischargeStudiesSummarySection()
	 * @generated
	 */
	int HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION = 57;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.ImmunizationsSectionImpl <em>Immunizations Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.ImmunizationsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getImmunizationsSection()
	 * @generated
	 */
	int IMMUNIZATIONS_SECTION = 58;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.SupplyActivityImpl <em>Supply Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.SupplyActivityImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getSupplyActivity()
	 * @generated
	 */
	int SUPPLY_ACTIVITY = 59;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.FulfillmentInstructionImpl <em>Fulfillment Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.FulfillmentInstructionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getFulfillmentInstruction()
	 * @generated
	 */
	int FULFILLMENT_INSTRUCTION = 60;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.ReviewOfSystemsSectionImpl <em>Review Of Systems Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.ReviewOfSystemsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getReviewOfSystemsSection()
	 * @generated
	 */
	int REVIEW_OF_SYSTEMS_SECTION = 61;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.SocialHistorySectionImpl <em>Social History Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.SocialHistorySectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getSocialHistorySection()
	 * @generated
	 */
	int SOCIAL_HISTORY_SECTION = 62;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.SocialHistoryImpl <em>Social History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.SocialHistoryImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getSocialHistory()
	 * @generated
	 */
	int SOCIAL_HISTORY = 63;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.SocialHistoryStatusObservationImpl <em>Social History Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.SocialHistoryStatusObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getSocialHistoryStatusObservation()
	 * @generated
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION = 64;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.VitalSignsSectionImpl <em>Vital Signs Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.VitalSignsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getVitalSignsSection()
	 * @generated
	 */
	int VITAL_SIGNS_SECTION = 65;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.VitalSignsOrganizerImpl <em>Vital Signs Organizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.VitalSignsOrganizerImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getVitalSignsOrganizer()
	 * @generated
	 */
	int VITAL_SIGNS_ORGANIZER = 66;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.SimpleObservationImpl <em>Simple Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.SimpleObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getSimpleObservation()
	 * @generated
	 */
	int SIMPLE_OBSERVATION = 14;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OBSERVATION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Simple Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OBSERVATION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION__CDA_TYPE = SIMPLE_OBSERVATION__CDA_TYPE;

	/**
	 * The number of structural features of the '<em>Family History Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION_FEATURE_COUNT = SIMPLE_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION__CDA_TYPE = FAMILY_HISTORY_OBSERVATION__CDA_TYPE;

	/**
	 * The number of structural features of the '<em>Cause Of Death Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION_FEATURE_COUNT = FAMILY_HISTORY_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__CDA_TYPE = PROBLEM_ENTRY__CDA_TYPE;

	/**
	 * The number of structural features of the '<em>Problem Entry Reaction Observation Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_FEATURE_COUNT = PROBLEM_ENTRY_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Medication Series Number Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION__CDA_TYPE = STATUS_OBSERVATION__CDA_TYPE;

	/**
	 * The number of structural features of the '<em>Medication Status Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_STATUS_OBSERVATION_FEATURE_COUNT = STATUS_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_OBSERVATION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Reaction Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_OBSERVATION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY_OBSERVATION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Severity Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY_OBSERVATION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Product Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Internal Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Patient Medical Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Medication Fullfillment Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS_FEATURE_COUNT = 1;

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
	 * The number of structural features of the '<em>Plan Of Care Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT__CDA_TYPE = PLAN_OF_CARE_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plan Of Care Activity Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT_FEATURE_COUNT = PLAN_OF_CARE_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__CDA_TYPE = PLAN_OF_CARE_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plan Of Care Activity Encounter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER_FEATURE_COUNT = PLAN_OF_CARE_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION__CDA_TYPE = PLAN_OF_CARE_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plan Of Care Activity Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION_FEATURE_COUNT = PLAN_OF_CARE_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE__CDA_TYPE = PLAN_OF_CARE_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plan Of Care Activity Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE_FEATURE_COUNT = PLAN_OF_CARE_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__CDA_TYPE = PLAN_OF_CARE_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plan Of Care Activity Substance Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_FEATURE_COUNT = PLAN_OF_CARE_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY__CDA_TYPE = PLAN_OF_CARE_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plan Of Care Activity Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY_FEATURE_COUNT = PLAN_OF_CARE_ACTIVITY_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_INSTRUCTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Patient Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_INSTRUCTION_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Procedure Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__CDA_TYPE = PROCEDURE_ENTRY__CDA_TYPE;

	/**
	 * The number of structural features of the '<em>Procedure Entry Procedure Activity Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_FEATURE_COUNT = PROCEDURE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER_LOCATION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Encounter Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTER_LOCATION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ACTIVITY__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Medication Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_ACTIVITY_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIET__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Discharge Diet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_DIET_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Family History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_PHYSICAL__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Hospital Discharge Physical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_PHYSICAL_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Hospital Discharge Studies Summary Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_ACTIVITY__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Supply Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_ACTIVITY_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_INSTRUCTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Fulfillment Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_INSTRUCTION_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Social History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION__CDA_TYPE = STATUS_OBSERVATION__CDA_TYPE;

	/**
	 * The number of structural features of the '<em>Social History Status Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION_FEATURE_COUNT = STATUS_OBSERVATION_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Vital Signs Organizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.VitalSignObservationImpl <em>Vital Sign Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.VitalSignObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getVitalSignObservation()
	 * @generated
	 */
	int VITAL_SIGN_OBSERVATION = 67;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN_OBSERVATION__CDA_TYPE = SIMPLE_OBSERVATION__CDA_TYPE;

	/**
	 * The number of structural features of the '<em>Vital Sign Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN_OBSERVATION_FEATURE_COUNT = SIMPLE_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.DischargeInstructionsImpl <em>Discharge Instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DischargeInstructionsImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getDischargeInstructions()
	 * @generated
	 */
	int DISCHARGE_INSTRUCTIONS = 68;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Discharge Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.AdvanceDirectivesSectionImpl <em>Advance Directives Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.AdvanceDirectivesSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getAdvanceDirectivesSection()
	 * @generated
	 */
	int ADVANCE_DIRECTIVES_SECTION = 69;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.AdvanceDirectiveImpl <em>Advance Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.AdvanceDirectiveImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getAdvanceDirective()
	 * @generated
	 */
	int ADVANCE_DIRECTIVE = 70;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Advance Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.AdvanceDirectiveVerificationImpl <em>Advance Directive Verification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.AdvanceDirectiveVerificationImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getAdvanceDirectiveVerification()
	 * @generated
	 */
	int ADVANCE_DIRECTIVE_VERIFICATION = 71;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_VERIFICATION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Advance Directive Verification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_VERIFICATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.AdvanceDirectiveStatusObservationImpl <em>Advance Directive Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.AdvanceDirectiveStatusObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getAdvanceDirectiveStatusObservation()
	 * @generated
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION = 72;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__CDA_TYPE = STATUS_OBSERVATION__CDA_TYPE;

	/**
	 * The number of structural features of the '<em>Advance Directive Status Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION_FEATURE_COUNT = STATUS_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.AdvanceDirectiveReferenceImpl <em>Advance Directive Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.AdvanceDirectiveReferenceImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getAdvanceDirectiveReference()
	 * @generated
	 */
	int ADVANCE_DIRECTIVE_REFERENCE = 73;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_REFERENCE__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Advance Directive Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCE_DIRECTIVE_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.MedicalEquipmentSectionImpl <em>Medical Equipment Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.MedicalEquipmentSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getMedicalEquipmentSection()
	 * @generated
	 */
	int MEDICAL_EQUIPMENT_SECTION = 74;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.ConsultationSummaryImpl <em>Consultation Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.ConsultationSummaryImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getConsultationSummary()
	 * @generated
	 */
	int CONSULTATION_SUMMARY = 75;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Consultation Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.MedicationsSectionImpl <em>Medications Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.MedicationsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getMedicationsSection()
	 * @generated
	 */
	int MEDICATIONS_SECTION = 76;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.DiagnosticResultsSectionImpl <em>Diagnostic Results Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DiagnosticResultsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getDiagnosticResultsSection()
	 * @generated
	 */
	int DIAGNOSTIC_RESULTS_SECTION = 77;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.ResultImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 78;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.ResultOrganizerImpl <em>Result Organizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.ResultOrganizerImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getResultOrganizer()
	 * @generated
	 */
	int RESULT_ORGANIZER = 79;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Result Organizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.EncountersSectionImpl <em>Encounters Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.EncountersSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getEncountersSection()
	 * @generated
	 */
	int ENCOUNTERS_SECTION = 80;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.EncountersActivityImpl <em>Encounters Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.EncountersActivityImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getEncountersActivity()
	 * @generated
	 */
	int ENCOUNTERS_ACTIVITY = 81;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_ACTIVITY__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Encounters Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCOUNTERS_ACTIVITY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.PayersSectionImpl <em>Payers Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.PayersSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getPayersSection()
	 * @generated
	 */
	int PAYERS_SECTION = 82;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.CoverageEntryImpl <em>Coverage Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.CoverageEntryImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getCoverageEntry()
	 * @generated
	 */
	int COVERAGE_ENTRY = 83;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_ENTRY__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Coverage Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_ENTRY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.PolicyActivityImpl <em>Policy Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.PolicyActivityImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getPolicyActivity()
	 * @generated
	 */
	int POLICY_ACTIVITY = 84;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ACTIVITY__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Policy Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ACTIVITY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.PayerEntityImpl <em>Payer Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.PayerEntityImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getPayerEntity()
	 * @generated
	 */
	int PAYER_ENTITY = 85;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTITY__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Payer Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTITY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.CoveredPartyImpl <em>Covered Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.CoveredPartyImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getCoveredParty()
	 * @generated
	 */
	int COVERED_PARTY = 86;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_PARTY__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Covered Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERED_PARTY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.PolicySubscriberImpl <em>Policy Subscriber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.PolicySubscriberImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getPolicySubscriber()
	 * @generated
	 */
	int POLICY_SUBSCRIBER = 87;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_SUBSCRIBER__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Policy Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_SUBSCRIBER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.ConsultationRequestImpl <em>Consultation Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.ConsultationRequestImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getConsultationRequest()
	 * @generated
	 */
	int CONSULTATION_REQUEST = 88;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Consultation Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.AssessmentAndPlanSectionImpl <em>Assessment And Plan Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.AssessmentAndPlanSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getAssessmentAndPlanSection()
	 * @generated
	 */
	int ASSESSMENT_AND_PLAN_SECTION = 89;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.PhysicalExamSectionImpl <em>Physical Exam Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.PhysicalExamSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getPhysicalExamSection()
	 * @generated
	 */
	int PHYSICAL_EXAM_SECTION = 90;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.ReasonForReferralSectionImpl <em>Reason For Referral Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.ReasonForReferralSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getReasonForReferralSection()
	 * @generated
	 */
	int REASON_FOR_REFERRAL_SECTION = 91;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.GeneralStatusSectionImpl <em>General Status Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.GeneralStatusSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getGeneralStatusSection()
	 * @generated
	 */
	int GENERAL_STATUS_SECTION = 92;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_STATUS_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>General Status Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_STATUS_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.HistoryOfPastIllnessSectionImpl <em>History Of Past Illness Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.HistoryOfPastIllnessSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.impl.DomainPackageImpl#getHistoryOfPastIllnessSection()
	 * @generated
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION = 93;

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
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeSummary <em>Discharge Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discharge Summary</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeSummary
	 * @generated
	 */
	EClass getDischargeSummary();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeSummary#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeSummary#getCDAType()
	 * @see #getDischargeSummary()
	 * @generated
	 */
	EReference getDischargeSummary_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAllergiesReactionsSection <em>Allergies Reactions Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allergies Reactions Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAllergiesReactionsSection
	 * @generated
	 */
	EClass getAllergiesReactionsSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAllergiesReactionsSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAllergiesReactionsSection#getCDAType()
	 * @see #getAllergiesReactionsSection()
	 * @generated
	 */
	EReference getAllergiesReactionsSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAllergyDrugSensitivity <em>Allergy Drug Sensitivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allergy Drug Sensitivity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAllergyDrugSensitivity
	 * @generated
	 */
	EClass getAllergyDrugSensitivity();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAllergyDrugSensitivity#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAllergyDrugSensitivity#getCDAType()
	 * @see #getAllergyDrugSensitivity()
	 * @generated
	 */
	EReference getAllergyDrugSensitivity_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IEpisodeObservation <em>Episode Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Episode Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IEpisodeObservation
	 * @generated
	 */
	EClass getEpisodeObservation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IEpisodeObservation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IEpisodeObservation#getCDAType()
	 * @see #getEpisodeObservation()
	 * @generated
	 */
	EReference getEpisodeObservation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAllergyIntolerance <em>Allergy Intolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allergy Intolerance</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAllergyIntolerance
	 * @generated
	 */
	EClass getAllergyIntolerance();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IProblemEntry <em>Problem Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem Entry</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IProblemEntry
	 * @generated
	 */
	EClass getProblemEntry();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IProblemEntry#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IProblemEntry#getCDAType()
	 * @see #getProblemEntry()
	 * @generated
	 */
	EReference getProblemEntry_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAgeObservation <em>Age Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Age Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAgeObservation
	 * @generated
	 */
	EClass getAgeObservation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAgeObservation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAgeObservation#getCDAType()
	 * @see #getAgeObservation()
	 * @generated
	 */
	EReference getAgeObservation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Severity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ISeverity
	 * @generated
	 */
	EClass getSeverity();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISeverity#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ISeverity#getCDAType()
	 * @see #getSeverity()
	 * @generated
	 */
	EReference getSeverity_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IProblemStatusObservation <em>Problem Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IProblemStatusObservation
	 * @generated
	 */
	EClass getProblemStatusObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IStatusObservation <em>Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IStatusObservation
	 * @generated
	 */
	EClass getStatusObservation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IStatusObservation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IStatusObservation#getCDAType()
	 * @see #getStatusObservation()
	 * @generated
	 */
	EReference getStatusObservation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IHealthStatusObservation <em>Health Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IHealthStatusObservation
	 * @generated
	 */
	EClass getHealthStatusObservation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IHealthStatusObservation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IHealthStatusObservation#getCDAType()
	 * @see #getHealthStatusObservation()
	 * @generated
	 */
	EReference getHealthStatusObservation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IComment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IComment#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IComment#getCDAType()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ICauseOfDeathObservation <em>Cause Of Death Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cause Of Death Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ICauseOfDeathObservation
	 * @generated
	 */
	EClass getCauseOfDeathObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistoryObservation <em>Family History Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family History Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistoryObservation
	 * @generated
	 */
	EClass getFamilyHistoryObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IProblemEntryReactionObservationContainer <em>Problem Entry Reaction Observation Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem Entry Reaction Observation Container</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IProblemEntryReactionObservationContainer
	 * @generated
	 */
	EClass getProblemEntryReactionObservationContainer();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IProblemListSection <em>Problem List Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem List Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IProblemListSection
	 * @generated
	 */
	EClass getProblemListSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IProblemListSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IProblemListSection#getCDAType()
	 * @see #getProblemListSection()
	 * @generated
	 */
	EReference getProblemListSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ICondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ICondition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ICondition#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ICondition#getCDAType()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalCourseSection <em>Hospital Course Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospital Course Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalCourseSection
	 * @generated
	 */
	EClass getHospitalCourseSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalCourseSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalCourseSection#getCDAType()
	 * @see #getHospitalCourseSection()
	 * @generated
	 */
	EReference getHospitalCourseSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargeMedicationsSection <em>Hospital Discharge Medications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospital Discharge Medications Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargeMedicationsSection
	 * @generated
	 */
	EClass getHospitalDischargeMedicationsSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargeMedicationsSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargeMedicationsSection#getCDAType()
	 * @see #getHospitalDischargeMedicationsSection()
	 * @generated
	 */
	EReference getHospitalDischargeMedicationsSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedication
	 * @generated
	 */
	EClass getMedication();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedication#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedication#getCDAType()
	 * @see #getMedication()
	 * @generated
	 */
	EReference getMedication_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationSeriesNumberObservation <em>Medication Series Number Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Series Number Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationSeriesNumberObservation
	 * @generated
	 */
	EClass getMedicationSeriesNumberObservation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationSeriesNumberObservation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationSeriesNumberObservation#getCDAType()
	 * @see #getMedicationSeriesNumberObservation()
	 * @generated
	 */
	EReference getMedicationSeriesNumberObservation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationStatusObservation <em>Medication Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationStatusObservation
	 * @generated
	 */
	EClass getMedicationStatusObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IReactionObservation <em>Reaction Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reaction Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IReactionObservation
	 * @generated
	 */
	EClass getReactionObservation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IReactionObservation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IReactionObservation#getCDAType()
	 * @see #getReactionObservation()
	 * @generated
	 */
	EReference getReactionObservation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISeverityObservation <em>Severity Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Severity Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ISeverityObservation
	 * @generated
	 */
	EClass getSeverityObservation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISeverityObservation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ISeverityObservation#getCDAType()
	 * @see #getSeverityObservation()
	 * @generated
	 */
	EReference getSeverityObservation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IProductInstance <em>Product Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Instance</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IProductInstance
	 * @generated
	 */
	EClass getProductInstance();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IProductInstance#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IProductInstance#getCDAType()
	 * @see #getProductInstance()
	 * @generated
	 */
	EReference getProductInstance_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IInternalReference <em>Internal Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IInternalReference
	 * @generated
	 */
	EClass getInternalReference();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IInternalReference#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IInternalReference#getCDAType()
	 * @see #getInternalReference()
	 * @generated
	 */
	EReference getInternalReference_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPatientMedicalInstructions <em>Patient Medical Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient Medical Instructions</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPatientMedicalInstructions
	 * @generated
	 */
	EClass getPatientMedicalInstructions();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPatientMedicalInstructions#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPatientMedicalInstructions#getCDAType()
	 * @see #getPatientMedicalInstructions()
	 * @generated
	 */
	EReference getPatientMedicalInstructions_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationType <em>Medication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationType
	 * @generated
	 */
	EClass getMedicationType();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationType#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationType#getCDAType()
	 * @see #getMedicationType()
	 * @generated
	 */
	EReference getMedicationType_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationOrderInformation <em>Medication Order Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Order Information</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationOrderInformation
	 * @generated
	 */
	EClass getMedicationOrderInformation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationOrderInformation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationOrderInformation#getCDAType()
	 * @see #getMedicationOrderInformation()
	 * @generated
	 */
	EReference getMedicationOrderInformation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationFullfillmentInstructions <em>Medication Fullfillment Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Fullfillment Instructions</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationFullfillmentInstructions
	 * @generated
	 */
	EClass getMedicationFullfillmentInstructions();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationFullfillmentInstructions#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationFullfillmentInstructions#getCDAType()
	 * @see #getMedicationFullfillmentInstructions()
	 * @generated
	 */
	EReference getMedicationFullfillmentInstructions_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeDiagnosisSection <em>Discharge Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discharge Diagnosis Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeDiagnosisSection
	 * @generated
	 */
	EClass getDischargeDiagnosisSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeDiagnosisSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeDiagnosisSection#getCDAType()
	 * @see #getDischargeDiagnosisSection()
	 * @generated
	 */
	EReference getDischargeDiagnosisSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareSection <em>Plan Of Care Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Care Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareSection
	 * @generated
	 */
	EClass getPlanOfCareSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareSection#getCDAType()
	 * @see #getPlanOfCareSection()
	 * @generated
	 */
	EReference getPlanOfCareSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityAct <em>Plan Of Care Activity Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Care Activity Act</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityAct
	 * @generated
	 */
	EClass getPlanOfCareActivityAct();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityAct#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityAct#getCDAType()
	 * @see #getPlanOfCareActivityAct()
	 * @generated
	 */
	EReference getPlanOfCareActivityAct_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivity <em>Plan Of Care Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Care Activity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivity
	 * @generated
	 */
	EClass getPlanOfCareActivity();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityEncounter <em>Plan Of Care Activity Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Care Activity Encounter</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityEncounter
	 * @generated
	 */
	EClass getPlanOfCareActivityEncounter();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityEncounter#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityEncounter#getCDAType()
	 * @see #getPlanOfCareActivityEncounter()
	 * @generated
	 */
	EReference getPlanOfCareActivityEncounter_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityObservation <em>Plan Of Care Activity Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Care Activity Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityObservation
	 * @generated
	 */
	EClass getPlanOfCareActivityObservation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityObservation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityObservation#getCDAType()
	 * @see #getPlanOfCareActivityObservation()
	 * @generated
	 */
	EReference getPlanOfCareActivityObservation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityProcedure <em>Plan Of Care Activity Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Care Activity Procedure</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityProcedure
	 * @generated
	 */
	EClass getPlanOfCareActivityProcedure();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityProcedure#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityProcedure#getCDAType()
	 * @see #getPlanOfCareActivityProcedure()
	 * @generated
	 */
	EReference getPlanOfCareActivityProcedure_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivitySubstanceAdministration <em>Plan Of Care Activity Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Care Activity Substance Administration</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivitySubstanceAdministration
	 * @generated
	 */
	EClass getPlanOfCareActivitySubstanceAdministration();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivitySubstanceAdministration#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivitySubstanceAdministration#getCDAType()
	 * @see #getPlanOfCareActivitySubstanceAdministration()
	 * @generated
	 */
	EReference getPlanOfCareActivitySubstanceAdministration_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivitySupply <em>Plan Of Care Activity Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Care Activity Supply</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivitySupply
	 * @generated
	 */
	EClass getPlanOfCareActivitySupply();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivitySupply#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivitySupply#getCDAType()
	 * @see #getPlanOfCareActivitySupply()
	 * @generated
	 */
	EReference getPlanOfCareActivitySupply_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IImmunization <em>Immunization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immunization</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IImmunization
	 * @generated
	 */
	EClass getImmunization();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IImmunization#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IImmunization#getCDAType()
	 * @see #getImmunization()
	 * @generated
	 */
	EReference getImmunization_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPatientInstruction <em>Patient Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient Instruction</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPatientInstruction
	 * @generated
	 */
	EClass getPatientInstruction();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPatientInstruction#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPatientInstruction#getCDAType()
	 * @see #getPatientInstruction()
	 * @generated
	 */
	EReference getPatientInstruction_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IEncounter <em>Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encounter</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IEncounter
	 * @generated
	 */
	EClass getEncounter();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IEncounter#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IEncounter#getCDAType()
	 * @see #getEncounter()
	 * @generated
	 */
	EReference getEncounter_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IProcedure
	 * @generated
	 */
	EClass getProcedure();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IProcedure#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IProcedure#getCDAType()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISurgeriesSection <em>Surgeries Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surgeries Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ISurgeriesSection
	 * @generated
	 */
	EClass getSurgeriesSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISurgeriesSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ISurgeriesSection#getCDAType()
	 * @see #getSurgeriesSection()
	 * @generated
	 */
	EReference getSurgeriesSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IExternalReference
	 * @generated
	 */
	EClass getExternalReference();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IExternalReference#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IExternalReference#getCDAType()
	 * @see #getExternalReference()
	 * @generated
	 */
	EReference getExternalReference_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IProcedureEntryProcedureActivityProcedure <em>Procedure Entry Procedure Activity Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Entry Procedure Activity Procedure</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IProcedureEntryProcedureActivityProcedure
	 * @generated
	 */
	EClass getProcedureEntryProcedureActivityProcedure();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IProcedureEntry <em>Procedure Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Entry</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IProcedureEntry
	 * @generated
	 */
	EClass getProcedureEntry();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IProcedureEntry#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IProcedureEntry#getCDAType()
	 * @see #getProcedureEntry()
	 * @generated
	 */
	EReference getProcedureEntry_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IEncounterLocation <em>Encounter Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encounter Location</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IEncounterLocation
	 * @generated
	 */
	EClass getEncounterLocation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IEncounterLocation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IEncounterLocation#getCDAType()
	 * @see #getEncounterLocation()
	 * @generated
	 */
	EReference getEncounterLocation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationActivity <em>Medication Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Activity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationActivity
	 * @generated
	 */
	EClass getMedicationActivity();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationActivity#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationActivity#getCDAType()
	 * @see #getMedicationActivity()
	 * @generated
	 */
	EReference getMedicationActivity_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IChiefComplaintSection <em>Chief Complaint Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chief Complaint Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IChiefComplaintSection
	 * @generated
	 */
	EClass getChiefComplaintSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IChiefComplaintSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IChiefComplaintSection#getCDAType()
	 * @see #getChiefComplaintSection()
	 * @generated
	 */
	EReference getChiefComplaintSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeDiet <em>Discharge Diet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discharge Diet</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeDiet
	 * @generated
	 */
	EClass getDischargeDiet();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeDiet#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeDiet#getCDAType()
	 * @see #getDischargeDiet()
	 * @generated
	 */
	EReference getDischargeDiet_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistorySection <em>Family History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family History Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistorySection
	 * @generated
	 */
	EClass getFamilyHistorySection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistorySection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistorySection#getCDAType()
	 * @see #getFamilyHistorySection()
	 * @generated
	 */
	EReference getFamilyHistorySection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistory <em>Family History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family History</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistory
	 * @generated
	 */
	EClass getFamilyHistory();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistory#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistory#getCDAType()
	 * @see #getFamilyHistory()
	 * @generated
	 */
	EReference getFamilyHistory_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IFunctionalStatusSection <em>Functional Status Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Status Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IFunctionalStatusSection
	 * @generated
	 */
	EClass getFunctionalStatusSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IFunctionalStatusSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IFunctionalStatusSection#getCDAType()
	 * @see #getFunctionalStatusSection()
	 * @generated
	 */
	EReference getFunctionalStatusSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IHistoryOfPresentIllness <em>History Of Present Illness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History Of Present Illness</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IHistoryOfPresentIllness
	 * @generated
	 */
	EClass getHistoryOfPresentIllness();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IHistoryOfPresentIllness#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IHistoryOfPresentIllness#getCDAType()
	 * @see #getHistoryOfPresentIllness()
	 * @generated
	 */
	EReference getHistoryOfPresentIllness_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargePhysical <em>Hospital Discharge Physical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospital Discharge Physical</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargePhysical
	 * @generated
	 */
	EClass getHospitalDischargePhysical();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargePhysical#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargePhysical#getCDAType()
	 * @see #getHospitalDischargePhysical()
	 * @generated
	 */
	EReference getHospitalDischargePhysical_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargeStudiesSummarySection <em>Hospital Discharge Studies Summary Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospital Discharge Studies Summary Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargeStudiesSummarySection
	 * @generated
	 */
	EClass getHospitalDischargeStudiesSummarySection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargeStudiesSummarySection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargeStudiesSummarySection#getCDAType()
	 * @see #getHospitalDischargeStudiesSummarySection()
	 * @generated
	 */
	EReference getHospitalDischargeStudiesSummarySection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IImmunizationsSection <em>Immunizations Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immunizations Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IImmunizationsSection
	 * @generated
	 */
	EClass getImmunizationsSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IImmunizationsSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IImmunizationsSection#getCDAType()
	 * @see #getImmunizationsSection()
	 * @generated
	 */
	EReference getImmunizationsSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISupplyActivity <em>Supply Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supply Activity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ISupplyActivity
	 * @generated
	 */
	EClass getSupplyActivity();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISupplyActivity#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ISupplyActivity#getCDAType()
	 * @see #getSupplyActivity()
	 * @generated
	 */
	EReference getSupplyActivity_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IFulfillmentInstruction <em>Fulfillment Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fulfillment Instruction</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IFulfillmentInstruction
	 * @generated
	 */
	EClass getFulfillmentInstruction();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IFulfillmentInstruction#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IFulfillmentInstruction#getCDAType()
	 * @see #getFulfillmentInstruction()
	 * @generated
	 */
	EReference getFulfillmentInstruction_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IReviewOfSystemsSection <em>Review Of Systems Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Review Of Systems Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IReviewOfSystemsSection
	 * @generated
	 */
	EClass getReviewOfSystemsSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IReviewOfSystemsSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IReviewOfSystemsSection#getCDAType()
	 * @see #getReviewOfSystemsSection()
	 * @generated
	 */
	EReference getReviewOfSystemsSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistorySection <em>Social History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social History Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistorySection
	 * @generated
	 */
	EClass getSocialHistorySection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistorySection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistorySection#getCDAType()
	 * @see #getSocialHistorySection()
	 * @generated
	 */
	EReference getSocialHistorySection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistory <em>Social History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social History</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistory
	 * @generated
	 */
	EClass getSocialHistory();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistory#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistory#getCDAType()
	 * @see #getSocialHistory()
	 * @generated
	 */
	EReference getSocialHistory_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistoryStatusObservation <em>Social History Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social History Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistoryStatusObservation
	 * @generated
	 */
	EClass getSocialHistoryStatusObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IVitalSignsSection <em>Vital Signs Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vital Signs Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IVitalSignsSection
	 * @generated
	 */
	EClass getVitalSignsSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IVitalSignsSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IVitalSignsSection#getCDAType()
	 * @see #getVitalSignsSection()
	 * @generated
	 */
	EReference getVitalSignsSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IVitalSignsOrganizer <em>Vital Signs Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vital Signs Organizer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IVitalSignsOrganizer
	 * @generated
	 */
	EClass getVitalSignsOrganizer();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IVitalSignsOrganizer#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IVitalSignsOrganizer#getCDAType()
	 * @see #getVitalSignsOrganizer()
	 * @generated
	 */
	EReference getVitalSignsOrganizer_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IVitalSignObservation <em>Vital Sign Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vital Sign Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IVitalSignObservation
	 * @generated
	 */
	EClass getVitalSignObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISimpleObservation <em>Simple Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ISimpleObservation
	 * @generated
	 */
	EClass getSimpleObservation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISimpleObservation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ISimpleObservation#getCDAType()
	 * @see #getSimpleObservation()
	 * @generated
	 */
	EReference getSimpleObservation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeInstructions <em>Discharge Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discharge Instructions</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeInstructions
	 * @generated
	 */
	EClass getDischargeInstructions();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeInstructions#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeInstructions#getCDAType()
	 * @see #getDischargeInstructions()
	 * @generated
	 */
	EReference getDischargeInstructions_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectivesSection <em>Advance Directives Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advance Directives Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectivesSection
	 * @generated
	 */
	EClass getAdvanceDirectivesSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectivesSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectivesSection#getCDAType()
	 * @see #getAdvanceDirectivesSection()
	 * @generated
	 */
	EReference getAdvanceDirectivesSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirective <em>Advance Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advance Directive</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirective
	 * @generated
	 */
	EClass getAdvanceDirective();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirective#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirective#getCDAType()
	 * @see #getAdvanceDirective()
	 * @generated
	 */
	EReference getAdvanceDirective_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectiveVerification <em>Advance Directive Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advance Directive Verification</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectiveVerification
	 * @generated
	 */
	EClass getAdvanceDirectiveVerification();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectiveVerification#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectiveVerification#getCDAType()
	 * @see #getAdvanceDirectiveVerification()
	 * @generated
	 */
	EReference getAdvanceDirectiveVerification_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectiveStatusObservation <em>Advance Directive Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advance Directive Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectiveStatusObservation
	 * @generated
	 */
	EClass getAdvanceDirectiveStatusObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectiveReference <em>Advance Directive Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advance Directive Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectiveReference
	 * @generated
	 */
	EClass getAdvanceDirectiveReference();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectiveReference#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectiveReference#getCDAType()
	 * @see #getAdvanceDirectiveReference()
	 * @generated
	 */
	EReference getAdvanceDirectiveReference_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicalEquipmentSection <em>Medical Equipment Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medical Equipment Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedicalEquipmentSection
	 * @generated
	 */
	EClass getMedicalEquipmentSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicalEquipmentSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedicalEquipmentSection#getCDAType()
	 * @see #getMedicalEquipmentSection()
	 * @generated
	 */
	EReference getMedicalEquipmentSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IConsultationSummary <em>Consultation Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consultation Summary</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IConsultationSummary
	 * @generated
	 */
	EClass getConsultationSummary();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IConsultationSummary#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IConsultationSummary#getCDAType()
	 * @see #getConsultationSummary()
	 * @generated
	 */
	EReference getConsultationSummary_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationsSection <em>Medications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medications Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationsSection
	 * @generated
	 */
	EClass getMedicationsSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationsSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationsSection#getCDAType()
	 * @see #getMedicationsSection()
	 * @generated
	 */
	EReference getMedicationsSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IDiagnosticResultsSection <em>Diagnostic Results Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagnostic Results Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDiagnosticResultsSection
	 * @generated
	 */
	EClass getDiagnosticResultsSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IDiagnosticResultsSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDiagnosticResultsSection#getCDAType()
	 * @see #getDiagnosticResultsSection()
	 * @generated
	 */
	EReference getDiagnosticResultsSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IResult
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IResult#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IResult#getCDAType()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IResultOrganizer <em>Result Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Organizer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IResultOrganizer
	 * @generated
	 */
	EClass getResultOrganizer();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IResultOrganizer#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IResultOrganizer#getCDAType()
	 * @see #getResultOrganizer()
	 * @generated
	 */
	EReference getResultOrganizer_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IEncountersSection <em>Encounters Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encounters Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IEncountersSection
	 * @generated
	 */
	EClass getEncountersSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IEncountersSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IEncountersSection#getCDAType()
	 * @see #getEncountersSection()
	 * @generated
	 */
	EReference getEncountersSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IEncountersActivity <em>Encounters Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encounters Activity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IEncountersActivity
	 * @generated
	 */
	EClass getEncountersActivity();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IEncountersActivity#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IEncountersActivity#getCDAType()
	 * @see #getEncountersActivity()
	 * @generated
	 */
	EReference getEncountersActivity_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPayersSection <em>Payers Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payers Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPayersSection
	 * @generated
	 */
	EClass getPayersSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPayersSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPayersSection#getCDAType()
	 * @see #getPayersSection()
	 * @generated
	 */
	EReference getPayersSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ICoverageEntry <em>Coverage Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coverage Entry</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ICoverageEntry
	 * @generated
	 */
	EClass getCoverageEntry();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ICoverageEntry#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ICoverageEntry#getCDAType()
	 * @see #getCoverageEntry()
	 * @generated
	 */
	EReference getCoverageEntry_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPolicyActivity <em>Policy Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Activity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPolicyActivity
	 * @generated
	 */
	EClass getPolicyActivity();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPolicyActivity#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPolicyActivity#getCDAType()
	 * @see #getPolicyActivity()
	 * @generated
	 */
	EReference getPolicyActivity_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPayerEntity <em>Payer Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payer Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPayerEntity
	 * @generated
	 */
	EClass getPayerEntity();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPayerEntity#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPayerEntity#getCDAType()
	 * @see #getPayerEntity()
	 * @generated
	 */
	EReference getPayerEntity_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ICoveredParty <em>Covered Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Covered Party</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ICoveredParty
	 * @generated
	 */
	EClass getCoveredParty();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ICoveredParty#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ICoveredParty#getCDAType()
	 * @see #getCoveredParty()
	 * @generated
	 */
	EReference getCoveredParty_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPolicySubscriber <em>Policy Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Subscriber</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPolicySubscriber
	 * @generated
	 */
	EClass getPolicySubscriber();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPolicySubscriber#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPolicySubscriber#getCDAType()
	 * @see #getPolicySubscriber()
	 * @generated
	 */
	EReference getPolicySubscriber_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IConsultationRequest <em>Consultation Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consultation Request</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IConsultationRequest
	 * @generated
	 */
	EClass getConsultationRequest();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IConsultationRequest#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IConsultationRequest#getCDAType()
	 * @see #getConsultationRequest()
	 * @generated
	 */
	EReference getConsultationRequest_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAssessmentAndPlanSection <em>Assessment And Plan Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment And Plan Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAssessmentAndPlanSection
	 * @generated
	 */
	EClass getAssessmentAndPlanSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAssessmentAndPlanSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAssessmentAndPlanSection#getCDAType()
	 * @see #getAssessmentAndPlanSection()
	 * @generated
	 */
	EReference getAssessmentAndPlanSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPhysicalExamSection <em>Physical Exam Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Exam Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPhysicalExamSection
	 * @generated
	 */
	EClass getPhysicalExamSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPhysicalExamSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPhysicalExamSection#getCDAType()
	 * @see #getPhysicalExamSection()
	 * @generated
	 */
	EReference getPhysicalExamSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IReasonForReferralSection <em>Reason For Referral Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reason For Referral Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IReasonForReferralSection
	 * @generated
	 */
	EClass getReasonForReferralSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IReasonForReferralSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IReasonForReferralSection#getCDAType()
	 * @see #getReasonForReferralSection()
	 * @generated
	 */
	EReference getReasonForReferralSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IGeneralStatusSection <em>General Status Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Status Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IGeneralStatusSection
	 * @generated
	 */
	EClass getGeneralStatusSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IGeneralStatusSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IGeneralStatusSection#getCDAType()
	 * @see #getGeneralStatusSection()
	 * @generated
	 */
	EReference getGeneralStatusSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IHistoryOfPastIllnessSection <em>History Of Past Illness Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History Of Past Illness Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IHistoryOfPastIllnessSection
	 * @generated
	 */
	EClass getHistoryOfPastIllnessSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IHistoryOfPastIllnessSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IHistoryOfPastIllnessSection#getCDAType()
	 * @see #getHistoryOfPastIllnessSection()
	 * @generated
	 */
	EReference getHistoryOfPastIllnessSection_CDAType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IDomainFactory getDomainFactory();

} // IDomainPackage
