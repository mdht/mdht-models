/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.EpisodeObservationImpl <em>Episode Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.EpisodeObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getEpisodeObservation()
	 * @generated
	 */
	int EPISODE_OBSERVATION = 1;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationImpl <em>Medication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedication()
	 * @generated
	 */
	int MEDICATION = 14;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationSeriesNumberObservationImpl <em>Medication Series Number Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationSeriesNumberObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicationSeriesNumberObservation()
	 * @generated
	 */
	int MEDICATION_SERIES_NUMBER_OBSERVATION = 15;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationStatusObservationImpl <em>Medication Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationStatusObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicationStatusObservation()
	 * @generated
	 */
	int MEDICATION_STATUS_OBSERVATION = 16;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ReactionObservationImpl <em>Reaction Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ReactionObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getReactionObservation()
	 * @generated
	 */
	int REACTION_OBSERVATION = 17;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SeverityObservationImpl <em>Severity Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SeverityObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getSeverityObservation()
	 * @generated
	 */
	int SEVERITY_OBSERVATION = 18;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ProductInstanceImpl <em>Product Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ProductInstanceImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getProductInstance()
	 * @generated
	 */
	int PRODUCT_INSTANCE = 19;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.InternalReferenceImpl <em>Internal Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.InternalReferenceImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getInternalReference()
	 * @generated
	 */
	int INTERNAL_REFERENCE = 20;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PatientMedicalInstructionsImpl <em>Patient Medical Instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PatientMedicalInstructionsImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getPatientMedicalInstructions()
	 * @generated
	 */
	int PATIENT_MEDICAL_INSTRUCTIONS = 21;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationTypeImpl <em>Medication Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationTypeImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicationType()
	 * @generated
	 */
	int MEDICATION_TYPE = 22;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationOrderInformationImpl <em>Medication Order Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationOrderInformationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicationOrderInformation()
	 * @generated
	 */
	int MEDICATION_ORDER_INFORMATION = 23;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationFullfillmentInstructionsImpl <em>Medication Fullfillment Instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationFullfillmentInstructionsImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicationFullfillmentInstructions()
	 * @generated
	 */
	int MEDICATION_FULLFILLMENT_INSTRUCTIONS = 24;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ConditionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 25;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ProblemEntryImpl <em>Problem Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ProblemEntryImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getProblemEntry()
	 * @generated
	 */
	int PROBLEM_ENTRY = 3;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AllergyIntoleranceImpl <em>Allergy Intolerance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AllergyIntoleranceImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getAllergyIntolerance()
	 * @generated
	 */
	int ALLERGY_INTOLERANCE = 2;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AgeObservationImpl <em>Age Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AgeObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getAgeObservation()
	 * @generated
	 */
	int AGE_OBSERVATION = 4;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SeverityImpl <em>Severity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SeverityImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 5;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.StatusObservationImpl <em>Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.StatusObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getStatusObservation()
	 * @generated
	 */
	int STATUS_OBSERVATION = 7;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ProblemStatusObservationImpl <em>Problem Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ProblemStatusObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getProblemStatusObservation()
	 * @generated
	 */
	int PROBLEM_STATUS_OBSERVATION = 6;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HealthStatusObservationImpl <em>Health Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HealthStatusObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getHealthStatusObservation()
	 * @generated
	 */
	int HEALTH_STATUS_OBSERVATION = 8;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PatientSummaryImpl <em>Patient Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PatientSummaryImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getPatientSummary()
	 * @generated
	 */
	int PATIENT_SUMMARY = 26;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AdvanceDirectivesSectionImpl <em>Advance Directives Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AdvanceDirectivesSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getAdvanceDirectivesSection()
	 * @generated
	 */
	int ADVANCE_DIRECTIVES_SECTION = 46;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AdvanceDirectiveImpl <em>Advance Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AdvanceDirectiveImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getAdvanceDirective()
	 * @generated
	 */
	int ADVANCE_DIRECTIVE = 47;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AdvanceDirectiveVerificationImpl <em>Advance Directive Verification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AdvanceDirectiveVerificationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getAdvanceDirectiveVerification()
	 * @generated
	 */
	int ADVANCE_DIRECTIVE_VERIFICATION = 48;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AdvanceDirectiveStatusObservationImpl <em>Advance Directive Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AdvanceDirectiveStatusObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getAdvanceDirectiveStatusObservation()
	 * @generated
	 */
	int ADVANCE_DIRECTIVE_STATUS_OBSERVATION = 49;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AdvanceDirectiveReferenceImpl <em>Advance Directive Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AdvanceDirectiveReferenceImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getAdvanceDirectiveReference()
	 * @generated
	 */
	int ADVANCE_DIRECTIVE_REFERENCE = 50;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AllergiesReactionsSectionImpl <em>Allergies Reactions Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AllergiesReactionsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getAllergiesReactionsSection()
	 * @generated
	 */
	int ALLERGIES_REACTIONS_SECTION = 51;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SimpleObservationImpl <em>Simple Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SimpleObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getSimpleObservation()
	 * @generated
	 */
	int SIMPLE_OBSERVATION = 12;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.FamilyHistoryObservationImpl <em>Family History Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.FamilyHistoryObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getFamilyHistoryObservation()
	 * @generated
	 */
	int FAMILY_HISTORY_OBSERVATION = 11;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.CauseOfDeathObservationImpl <em>Cause Of Death Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.CauseOfDeathObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getCauseOfDeathObservation()
	 * @generated
	 */
	int CAUSE_OF_DEATH_OBSERVATION = 10;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ProblemEntryReactionObservationContainerImpl <em>Problem Entry Reaction Observation Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ProblemEntryReactionObservationContainerImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getProblemEntryReactionObservationContainer()
	 * @generated
	 */
	int PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER = 13;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ProblemListSectionImpl <em>Problem List Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ProblemListSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getProblemListSection()
	 * @generated
	 */
	int PROBLEM_LIST_SECTION = 52;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.EncountersSectionImpl <em>Encounters Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.EncountersSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getEncountersSection()
	 * @generated
	 */
	int ENCOUNTERS_SECTION = 53;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.EncountersActivityImpl <em>Encounters Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.EncountersActivityImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getEncountersActivity()
	 * @generated
	 */
	int ENCOUNTERS_ACTIVITY = 54;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.EncounterLocationImpl <em>Encounter Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.EncounterLocationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getEncounterLocation()
	 * @generated
	 */
	int ENCOUNTER_LOCATION = 55;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.EncounterImpl <em>Encounter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.EncounterImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getEncounter()
	 * @generated
	 */
	int ENCOUNTER = 56;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ImmunizationsSectionImpl <em>Immunizations Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ImmunizationsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getImmunizationsSection()
	 * @generated
	 */
	int IMMUNIZATIONS_SECTION = 57;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ImmunizationImpl <em>Immunization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ImmunizationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getImmunization()
	 * @generated
	 */
	int IMMUNIZATION = 58;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PayersSectionImpl <em>Payers Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PayersSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getPayersSection()
	 * @generated
	 */
	int PAYERS_SECTION = 59;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PayerEntityImpl <em>Payer Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PayerEntityImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getPayerEntity()
	 * @generated
	 */
	int PAYER_ENTITY = 62;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.CoveredPartyImpl <em>Covered Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.CoveredPartyImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getCoveredParty()
	 * @generated
	 */
	int COVERED_PARTY = 63;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PolicySubscriberImpl <em>Policy Subscriber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PolicySubscriberImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getPolicySubscriber()
	 * @generated
	 */
	int POLICY_SUBSCRIBER = 64;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationsSectionImpl <em>Medications Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicationsSection()
	 * @generated
	 */
	int MEDICATIONS_SECTION = 65;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PlanOfCareSectionImpl <em>Plan Of Care Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PlanOfCareSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getPlanOfCareSection()
	 * @generated
	 */
	int PLAN_OF_CARE_SECTION = 66;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PlanOfCareActivityImpl <em>Plan Of Care Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PlanOfCareActivityImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getPlanOfCareActivity()
	 * @generated
	 */
	int PLAN_OF_CARE_ACTIVITY = 68;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PlanOfCareActivityActImpl <em>Plan Of Care Activity Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PlanOfCareActivityActImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getPlanOfCareActivityAct()
	 * @generated
	 */
	int PLAN_OF_CARE_ACTIVITY_ACT = 67;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PlanOfCareActivityEncounterImpl <em>Plan Of Care Activity Encounter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PlanOfCareActivityEncounterImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getPlanOfCareActivityEncounter()
	 * @generated
	 */
	int PLAN_OF_CARE_ACTIVITY_ENCOUNTER = 69;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PlanOfCareActivityObservationImpl <em>Plan Of Care Activity Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PlanOfCareActivityObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getPlanOfCareActivityObservation()
	 * @generated
	 */
	int PLAN_OF_CARE_ACTIVITY_OBSERVATION = 70;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PlanOfCareActivityProcedureImpl <em>Plan Of Care Activity Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PlanOfCareActivityProcedureImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getPlanOfCareActivityProcedure()
	 * @generated
	 */
	int PLAN_OF_CARE_ACTIVITY_PROCEDURE = 71;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PlanOfCareActivitySubstanceAdministrationImpl <em>Plan Of Care Activity Substance Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PlanOfCareActivitySubstanceAdministrationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getPlanOfCareActivitySubstanceAdministration()
	 * @generated
	 */
	int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION = 72;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PlanOfCareActivitySupplyImpl <em>Plan Of Care Activity Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PlanOfCareActivitySupplyImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getPlanOfCareActivitySupply()
	 * @generated
	 */
	int PLAN_OF_CARE_ACTIVITY_SUPPLY = 73;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SurgeriesSectionImpl <em>Surgeries Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SurgeriesSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getSurgeriesSection()
	 * @generated
	 */
	int SURGERIES_SECTION = 77;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ProcedureImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getProcedure()
	 * @generated
	 */
	int PROCEDURE = 74;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PregnancyHistorySectionImpl <em>Pregnancy History Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PregnancyHistorySectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getPregnancyHistorySection()
	 * @generated
	 */
	int PREGNANCY_HISTORY_SECTION = 75;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PregnancyObservationImpl <em>Pregnancy Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PregnancyObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getPregnancyObservation()
	 * @generated
	 */
	int PREGNANCY_OBSERVATION = 76;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ExternalReferenceImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getExternalReference()
	 * @generated
	 */
	int EXTERNAL_REFERENCE = 78;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ProcedureEntryImpl <em>Procedure Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ProcedureEntryImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getProcedureEntry()
	 * @generated
	 */
	int PROCEDURE_ENTRY = 80;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ProcedureEntryProcedureActivityProcedureImpl <em>Procedure Entry Procedure Activity Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ProcedureEntryProcedureActivityProcedureImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getProcedureEntryProcedureActivityProcedure()
	 * @generated
	 */
	int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE = 79;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SupportImpl <em>Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SupportImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getSupport()
	 * @generated
	 */
	int SUPPORT = 81;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.VitalSignsSectionImpl <em>Vital Signs Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.VitalSignsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getVitalSignsSection()
	 * @generated
	 */
	int VITAL_SIGNS_SECTION = 82;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.VitalSignsOrganizerImpl <em>Vital Signs Organizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.VitalSignsOrganizerImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getVitalSignsOrganizer()
	 * @generated
	 */
	int VITAL_SIGNS_ORGANIZER = 83;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.VitalSignObservationImpl <em>Vital Sign Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.VitalSignObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getVitalSignObservation()
	 * @generated
	 */
	int VITAL_SIGN_OBSERVATION = 84;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DiagnosticResultsSectionImpl <em>Diagnostic Results Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DiagnosticResultsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getDiagnosticResultsSection()
	 * @generated
	 */
	int DIAGNOSTIC_RESULTS_SECTION = 85;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ResultImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 36;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.VitalSignImpl <em>Vital Sign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.VitalSignImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getVitalSign()
	 * @generated
	 */
	int VITAL_SIGN = 86;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HistoryOfPastIllnessSectionImpl <em>History Of Past Illness Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HistoryOfPastIllnessSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getHistoryOfPastIllnessSection()
	 * @generated
	 */
	int HISTORY_OF_PAST_ILLNESS_SECTION = 87;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ChiefComplaintSectionImpl <em>Chief Complaint Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ChiefComplaintSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getChiefComplaintSection()
	 * @generated
	 */
	int CHIEF_COMPLAINT_SECTION = 88;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ReasonForReferralSectionImpl <em>Reason For Referral Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ReasonForReferralSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getReasonForReferralSection()
	 * @generated
	 */
	int REASON_FOR_REFERRAL_SECTION = 89;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HistoryOfPresentIllnessImpl <em>History Of Present Illness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HistoryOfPresentIllnessImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getHistoryOfPresentIllness()
	 * @generated
	 */
	int HISTORY_OF_PRESENT_ILLNESS = 90;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.FunctionalStatusSectionImpl <em>Functional Status Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.FunctionalStatusSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getFunctionalStatusSection()
	 * @generated
	 */
	int FUNCTIONAL_STATUS_SECTION = 43;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PurposeSectionImpl <em>Purpose Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PurposeSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getPurposeSection()
	 * @generated
	 */
	int PURPOSE_SECTION = 44;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PurposeActivityImpl <em>Purpose Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PurposeActivityImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getPurposeActivity()
	 * @generated
	 */
	int PURPOSE_ACTIVITY = 45;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HospitalAdmissionDiagnosisSectionImpl <em>Hospital Admission Diagnosis Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HospitalAdmissionDiagnosisSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getHospitalAdmissionDiagnosisSection()
	 * @generated
	 */
	int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION = 91;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DischargeDiagnosisSectionImpl <em>Discharge Diagnosis Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DischargeDiagnosisSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getDischargeDiagnosisSection()
	 * @generated
	 */
	int DISCHARGE_DIAGNOSIS_SECTION = 92;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AdmissionMedicationHistorySectionImpl <em>Admission Medication History Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AdmissionMedicationHistorySectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getAdmissionMedicationHistorySection()
	 * @generated
	 */
	int ADMISSION_MEDICATION_HISTORY_SECTION = 93;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HospitalDischargeMedicationsSectionImpl <em>Hospital Discharge Medications Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HospitalDischargeMedicationsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getHospitalDischargeMedicationsSection()
	 * @generated
	 */
	int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION = 94;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationsAdministeredSectionImpl <em>Medications Administered Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationsAdministeredSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicationsAdministeredSection()
	 * @generated
	 */
	int MEDICATIONS_ADMINISTERED_SECTION = 95;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PhysicalExamSectionImpl <em>Physical Exam Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PhysicalExamSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getPhysicalExamSection()
	 * @generated
	 */
	int PHYSICAL_EXAM_SECTION = 96;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ReviewOfSystemsSectionImpl <em>Review Of Systems Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ReviewOfSystemsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getReviewOfSystemsSection()
	 * @generated
	 */
	int REVIEW_OF_SYSTEMS_SECTION = 121;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HospitalCourseSectionImpl <em>Hospital Course Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HospitalCourseSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getHospitalCourseSection()
	 * @generated
	 */
	int HOSPITAL_COURSE_SECTION = 122;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AssessmentAndPlanSectionImpl <em>Assessment And Plan Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AssessmentAndPlanSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getAssessmentAndPlanSection()
	 * @generated
	 */
	int ASSESSMENT_AND_PLAN_SECTION = 123;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.FamilyHistorySectionImpl <em>Family History Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.FamilyHistorySectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getFamilyHistorySection()
	 * @generated
	 */
	int FAMILY_HISTORY_SECTION = 27;

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
	int SOCIAL_HISTORY_SECTION = 30;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SocialHistoryImpl <em>Social History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SocialHistoryImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getSocialHistory()
	 * @generated
	 */
	int SOCIAL_HISTORY = 31;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SocialHistoryStatusObservationImpl <em>Social History Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SocialHistoryStatusObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getSocialHistoryStatusObservation()
	 * @generated
	 */
	int SOCIAL_HISTORY_STATUS_OBSERVATION = 32;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SocialHistoryObservationImpl <em>Social History Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SocialHistoryObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getSocialHistoryObservation()
	 * @generated
	 */
	int SOCIAL_HISTORY_OBSERVATION = 33;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ResultsSectionImpl <em>Results Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ResultsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getResultsSection()
	 * @generated
	 */
	int RESULTS_SECTION = 34;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ResultOrganizerImpl <em>Result Organizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ResultOrganizerImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getResultOrganizer()
	 * @generated
	 */
	int RESULT_ORGANIZER = 35;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ResultObservationImpl <em>Result Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ResultObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getResultObservation()
	 * @generated
	 */
	int RESULT_OBSERVATION = 37;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicalEquipmentSectionImpl <em>Medical Equipment Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicalEquipmentSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicalEquipmentSection()
	 * @generated
	 */
	int MEDICAL_EQUIPMENT_SECTION = 38;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SupplyActivityImpl <em>Supply Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SupplyActivityImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getSupplyActivity()
	 * @generated
	 */
	int SUPPLY_ACTIVITY = 39;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.FulfillmentInstructionImpl <em>Fulfillment Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.FulfillmentInstructionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getFulfillmentInstruction()
	 * @generated
	 */
	int FULFILLMENT_INSTRUCTION = 40;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationActivityImpl <em>Medication Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationActivityImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicationActivity()
	 * @generated
	 */
	int MEDICATION_ACTIVITY = 41;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PatientInstructionImpl <em>Patient Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PatientInstructionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getPatientInstruction()
	 * @generated
	 */
	int PATIENT_INSTRUCTION = 42;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.LanguageSpokenImpl <em>Language Spoken</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.LanguageSpokenImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getLanguageSpoken()
	 * @generated
	 */
	int LANGUAGE_SPOKEN = 124;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.InsuranceProviderImpl <em>Insurance Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.InsuranceProviderImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getInsuranceProvider()
	 * @generated
	 */
	int INSURANCE_PROVIDER = 60;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HealthcareProviderImpl <em>Healthcare Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HealthcareProviderImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getHealthcareProvider()
	 * @generated
	 */
	int HEALTHCARE_PROVIDER = 125;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationNormalDoseImpl <em>Medication Normal Dose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationNormalDoseImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicationNormalDose()
	 * @generated
	 */
	int MEDICATION_NORMAL_DOSE = 126;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationSplitDoseImpl <em>Medication Split Dose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationSplitDoseImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicationSplitDose()
	 * @generated
	 */
	int MEDICATION_SPLIT_DOSE = 127;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationTaperedDoseImpl <em>Medication Tapered Dose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationTaperedDoseImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicationTaperedDose()
	 * @generated
	 */
	int MEDICATION_TAPERED_DOSE = 128;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationConditionalDoseImpl <em>Medication Conditional Dose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationConditionalDoseImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicationConditionalDose()
	 * @generated
	 */
	int MEDICATION_CONDITIONAL_DOSE = 129;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationCombinationMedicationImpl <em>Medication Combination Medication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationCombinationMedicationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicationCombinationMedication()
	 * @generated
	 */
	int MEDICATION_COMBINATION_MEDICATION = 130;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SupportGuardianImpl <em>Support Guardian</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SupportGuardianImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getSupportGuardian()
	 * @generated
	 */
	int SUPPORT_GUARDIAN = 131;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SupportParticipantImpl <em>Support Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.SupportParticipantImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getSupportParticipant()
	 * @generated
	 */
	int SUPPORT_PARTICIPANT = 132;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.UnstructuredDocumentImpl <em>Unstructured Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.UnstructuredDocumentImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getUnstructuredDocument()
	 * @generated
	 */
	int UNSTRUCTURED_DOCUMENT = 133;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ScanOriginalAuthorImpl <em>Scan Original Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ScanOriginalAuthorImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getScanOriginalAuthor()
	 * @generated
	 */
	int SCAN_ORIGINAL_AUTHOR = 134;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ScanningDeviceImpl <em>Scanning Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ScanningDeviceImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getScanningDevice()
	 * @generated
	 */
	int SCANNING_DEVICE = 135;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ScanDataEntererImpl <em>Scan Data Enterer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ScanDataEntererImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getScanDataEnterer()
	 * @generated
	 */
	int SCAN_DATA_ENTERER = 136;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationInformationImpl <em>Medication Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationInformationImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMedicationInformation()
	 * @generated
	 */
	int MEDICATION_INFORMATION = 137;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.UnstructuredOrScannedDocumentImpl <em>Unstructured Or Scanned Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.UnstructuredOrScannedDocumentImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getUnstructuredOrScannedDocument()
	 * @generated
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT = 138;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ReferralSummaryImpl <em>Referral Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ReferralSummaryImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getReferralSummary()
	 * @generated
	 */
	int REFERRAL_SUMMARY = 139;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DischargeSummaryImpl <em>Discharge Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DischargeSummaryImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getDischargeSummary()
	 * @generated
	 */
	int DISCHARGE_SUMMARY = 140;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DischargeDietImpl <em>Discharge Diet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DischargeDietImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getDischargeDiet()
	 * @generated
	 */
	int DISCHARGE_DIET = 141;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.FamilyHistoryImpl <em>Family History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.FamilyHistoryImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getFamilyHistory()
	 * @generated
	 */
	int FAMILY_HISTORY = 28;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.FamilyHistoryOrganizerImpl <em>Family History Organizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.FamilyHistoryOrganizerImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getFamilyHistoryOrganizer()
	 * @generated
	 */
	int FAMILY_HISTORY_ORGANIZER = 29;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_ORGANIZER__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Family History Organizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_ORGANIZER_FEATURE_COUNT = 1;

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
	int SOCIAL_HISTORY_OBSERVATION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Social History Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_OBSERVATION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Results Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OBSERVATION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Result Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OBSERVATION_FEATURE_COUNT = 1;

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
	int PURPOSE_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Purpose Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Purpose Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_ACTIVITY_FEATURE_COUNT = 1;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.GeneralAppearanceSectionImpl <em>General Appearance Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.GeneralAppearanceSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getGeneralAppearanceSection()
	 * @generated
	 */
	int GENERAL_APPEARANCE_SECTION = 97;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.VisibleImplantedMedicalDevicesSectionImpl <em>Visible Implanted Medical Devices Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.VisibleImplantedMedicalDevicesSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getVisibleImplantedMedicalDevicesSection()
	 * @generated
	 */
	int VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION = 98;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.IntegumentarySystemSectionImpl <em>Integumentary System Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.IntegumentarySystemSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getIntegumentarySystemSection()
	 * @generated
	 */
	int INTEGUMENTARY_SYSTEM_SECTION = 99;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HeadSectionImpl <em>Head Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HeadSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getHeadSection()
	 * @generated
	 */
	int HEAD_SECTION = 100;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.EyesSectionImpl <em>Eyes Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.EyesSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getEyesSection()
	 * @generated
	 */
	int EYES_SECTION = 101;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.EarsNoseMouthThroatSectionImpl <em>Ears Nose Mouth Throat Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.EarsNoseMouthThroatSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getEarsNoseMouthThroatSection()
	 * @generated
	 */
	int EARS_NOSE_MOUTH_THROAT_SECTION = 102;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.EarsSectionImpl <em>Ears Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.EarsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getEarsSection()
	 * @generated
	 */
	int EARS_SECTION = 103;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.NoseSectionImpl <em>Nose Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.NoseSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getNoseSection()
	 * @generated
	 */
	int NOSE_SECTION = 104;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MouthThroatTeethSectionImpl <em>Mouth Throat Teeth Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MouthThroatTeethSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMouthThroatTeethSection()
	 * @generated
	 */
	int MOUTH_THROAT_TEETH_SECTION = 105;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.NeckSectionImpl <em>Neck Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.NeckSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getNeckSection()
	 * @generated
	 */
	int NECK_SECTION = 106;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.EndocrineSystemSectionImpl <em>Endocrine System Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.EndocrineSystemSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getEndocrineSystemSection()
	 * @generated
	 */
	int ENDOCRINE_SYSTEM_SECTION = 107;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ThoraxLungsSectionImpl <em>Thorax Lungs Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ThoraxLungsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getThoraxLungsSection()
	 * @generated
	 */
	int THORAX_LUNGS_SECTION = 108;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ChestWallSectionImpl <em>Chest Wall Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ChestWallSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getChestWallSection()
	 * @generated
	 */
	int CHEST_WALL_SECTION = 109;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.BreastSectionImpl <em>Breast Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.BreastSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getBreastSection()
	 * @generated
	 */
	int BREAST_SECTION = 110;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HeartSectionImpl <em>Heart Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.HeartSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getHeartSection()
	 * @generated
	 */
	int HEART_SECTION = 111;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.RespiratorySystemSectionImpl <em>Respiratory System Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.RespiratorySystemSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getRespiratorySystemSection()
	 * @generated
	 */
	int RESPIRATORY_SYSTEM_SECTION = 112;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AbdomenSectionImpl <em>Abdomen Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.AbdomenSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getAbdomenSection()
	 * @generated
	 */
	int ABDOMEN_SECTION = 113;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.LymphaticSectionImpl <em>Lymphatic Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.LymphaticSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getLymphaticSection()
	 * @generated
	 */
	int LYMPHATIC_SECTION = 114;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.VesselsSectionImpl <em>Vessels Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.VesselsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getVesselsSection()
	 * @generated
	 */
	int VESSELS_SECTION = 115;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MusculoskeletalSystemSectionImpl <em>Musculoskeletal System Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MusculoskeletalSystemSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getMusculoskeletalSystemSection()
	 * @generated
	 */
	int MUSCULOSKELETAL_SYSTEM_SECTION = 116;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.NeurologicSystemSectionImpl <em>Neurologic System Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.NeurologicSystemSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getNeurologicSystemSection()
	 * @generated
	 */
	int NEUROLOGIC_SYSTEM_SECTION = 117;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.GenitaliaSectionImpl <em>Genitalia Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.GenitaliaSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getGenitaliaSection()
	 * @generated
	 */
	int GENITALIA_SECTION = 118;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.RectumSectionImpl <em>Rectum Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.RectumSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getRectumSection()
	 * @generated
	 */
	int RECTUM_SECTION = 119;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ExtremitiesSectionImpl <em>Extremities Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ExtremitiesSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getExtremitiesSection()
	 * @generated
	 */
	int EXTREMITIES_SECTION = 120;

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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PayerEntryImpl <em>Payer Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PayerEntryImpl
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainPackageImpl#getPayerEntry()
	 * @generated
	 */
	int PAYER_ENTRY = 61;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Payer Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYER_ENTRY_FEATURE_COUNT = 1;

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
	int PREGNANCY_HISTORY_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Pregnancy History Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_HISTORY_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION__CDA_TYPE = SIMPLE_OBSERVATION__CDA_TYPE;

	/**
	 * The number of structural features of the '<em>Pregnancy Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGNANCY_OBSERVATION_FEATURE_COUNT = SIMPLE_OBSERVATION_FEATURE_COUNT + 0;

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
	 * The number of structural features of the '<em>Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_FEATURE_COUNT = 0;

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
	int VITAL_SIGNS_ORGANIZER__CDA_TYPE = RESULT_ORGANIZER__CDA_TYPE;

	/**
	 * The number of structural features of the '<em>Vital Signs Organizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER_FEATURE_COUNT = RESULT_ORGANIZER_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_APPEARANCE_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>General Appearance Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_APPEARANCE_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Visible Implanted Medical Devices Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGUMENTARY_SYSTEM_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Integumentary System Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGUMENTARY_SYSTEM_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Head Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYES_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Eyes Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EYES_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_NOSE_MOUTH_THROAT_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Ears Nose Mouth Throat Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_NOSE_MOUTH_THROAT_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Ears Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOSE_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Nose Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOSE_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTH_THROAT_TEETH_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Mouth Throat Teeth Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTH_THROAT_TEETH_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECK_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Neck Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECK_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOCRINE_SYSTEM_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Endocrine System Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDOCRINE_SYSTEM_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THORAX_LUNGS_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Thorax Lungs Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THORAX_LUNGS_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEST_WALL_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Chest Wall Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEST_WALL_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAST_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Breast Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAST_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Heart Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPIRATORY_SYSTEM_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Respiratory System Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPIRATORY_SYSTEM_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABDOMEN_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Abdomen Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABDOMEN_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LYMPHATIC_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Lymphatic Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LYMPHATIC_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSELS_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Vessels Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSELS_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSCULOSKELETAL_SYSTEM_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Musculoskeletal System Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSCULOSKELETAL_SYSTEM_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUROLOGIC_SYSTEM_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Neurologic System Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUROLOGIC_SYSTEM_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENITALIA_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Genitalia Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENITALIA_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTUM_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Rectum Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTUM_SECTION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTREMITIES_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Extremities Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTREMITIES_SECTION_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_ORIGINAL_AUTHOR__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Scan Original Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_ORIGINAL_AUTHOR_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANNING_DEVICE__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Scanning Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCANNING_DEVICE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_DATA_ENTERER__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Scan Data Enterer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_DATA_ENTERER_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT__CDA_TYPE = UNSTRUCTURED_DOCUMENT__CDA_TYPE;

	/**
	 * The number of structural features of the '<em>Unstructured Or Scanned Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_OR_SCANNED_DOCUMENT_FEATURE_COUNT = UNSTRUCTURED_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Referral Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_SUMMARY_FEATURE_COUNT = 1;

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
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IEpisodeObservation <em>Episode Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Episode Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IEpisodeObservation
	 * @generated
	 */
	EClass getEpisodeObservation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IEpisodeObservation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IEpisodeObservation#getCDAType()
	 * @see #getEpisodeObservation()
	 * @generated
	 */
	EReference getEpisodeObservation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAllergyIntolerance <em>Allergy Intolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allergy Intolerance</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAllergyIntolerance
	 * @generated
	 */
	EClass getAllergyIntolerance();

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
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationSeriesNumberObservation <em>Medication Series Number Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Series Number Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationSeriesNumberObservation
	 * @generated
	 */
	EClass getMedicationSeriesNumberObservation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationSeriesNumberObservation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationSeriesNumberObservation#getCDAType()
	 * @see #getMedicationSeriesNumberObservation()
	 * @generated
	 */
	EReference getMedicationSeriesNumberObservation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationStatusObservation <em>Medication Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationStatusObservation
	 * @generated
	 */
	EClass getMedicationStatusObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IReactionObservation <em>Reaction Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reaction Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IReactionObservation
	 * @generated
	 */
	EClass getReactionObservation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IReactionObservation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IReactionObservation#getCDAType()
	 * @see #getReactionObservation()
	 * @generated
	 */
	EReference getReactionObservation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISeverityObservation <em>Severity Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Severity Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISeverityObservation
	 * @generated
	 */
	EClass getSeverityObservation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISeverityObservation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISeverityObservation#getCDAType()
	 * @see #getSeverityObservation()
	 * @generated
	 */
	EReference getSeverityObservation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IProductInstance <em>Product Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Instance</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IProductInstance
	 * @generated
	 */
	EClass getProductInstance();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IProductInstance#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IProductInstance#getCDAType()
	 * @see #getProductInstance()
	 * @generated
	 */
	EReference getProductInstance_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IInternalReference <em>Internal Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IInternalReference
	 * @generated
	 */
	EClass getInternalReference();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IInternalReference#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IInternalReference#getCDAType()
	 * @see #getInternalReference()
	 * @generated
	 */
	EReference getInternalReference_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPatientMedicalInstructions <em>Patient Medical Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient Medical Instructions</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPatientMedicalInstructions
	 * @generated
	 */
	EClass getPatientMedicalInstructions();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPatientMedicalInstructions#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPatientMedicalInstructions#getCDAType()
	 * @see #getPatientMedicalInstructions()
	 * @generated
	 */
	EReference getPatientMedicalInstructions_CDAType();

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
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationFullfillmentInstructions <em>Medication Fullfillment Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Fullfillment Instructions</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationFullfillmentInstructions
	 * @generated
	 */
	EClass getMedicationFullfillmentInstructions();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationFullfillmentInstructions#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationFullfillmentInstructions#getCDAType()
	 * @see #getMedicationFullfillmentInstructions()
	 * @generated
	 */
	EReference getMedicationFullfillmentInstructions_CDAType();

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
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAgeObservation <em>Age Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Age Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAgeObservation
	 * @generated
	 */
	EClass getAgeObservation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAgeObservation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAgeObservation#getCDAType()
	 * @see #getAgeObservation()
	 * @generated
	 */
	EReference getAgeObservation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Severity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISeverity
	 * @generated
	 */
	EClass getSeverity();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISeverity#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISeverity#getCDAType()
	 * @see #getSeverity()
	 * @generated
	 */
	EReference getSeverity_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IProblemStatusObservation <em>Problem Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IProblemStatusObservation
	 * @generated
	 */
	EClass getProblemStatusObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IStatusObservation <em>Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IStatusObservation
	 * @generated
	 */
	EClass getStatusObservation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IStatusObservation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IStatusObservation#getCDAType()
	 * @see #getStatusObservation()
	 * @generated
	 */
	EReference getStatusObservation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IHealthStatusObservation <em>Health Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IHealthStatusObservation
	 * @generated
	 */
	EClass getHealthStatusObservation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IHealthStatusObservation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IHealthStatusObservation#getCDAType()
	 * @see #getHealthStatusObservation()
	 * @generated
	 */
	EReference getHealthStatusObservation_CDAType();

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
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdvanceDirective <em>Advance Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advance Directive</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdvanceDirective
	 * @generated
	 */
	EClass getAdvanceDirective();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdvanceDirective#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdvanceDirective#getCDAType()
	 * @see #getAdvanceDirective()
	 * @generated
	 */
	EReference getAdvanceDirective_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdvanceDirectiveVerification <em>Advance Directive Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advance Directive Verification</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdvanceDirectiveVerification
	 * @generated
	 */
	EClass getAdvanceDirectiveVerification();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdvanceDirectiveVerification#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdvanceDirectiveVerification#getCDAType()
	 * @see #getAdvanceDirectiveVerification()
	 * @generated
	 */
	EReference getAdvanceDirectiveVerification_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdvanceDirectiveStatusObservation <em>Advance Directive Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advance Directive Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdvanceDirectiveStatusObservation
	 * @generated
	 */
	EClass getAdvanceDirectiveStatusObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdvanceDirectiveReference <em>Advance Directive Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advance Directive Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdvanceDirectiveReference
	 * @generated
	 */
	EClass getAdvanceDirectiveReference();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdvanceDirectiveReference#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdvanceDirectiveReference#getCDAType()
	 * @see #getAdvanceDirectiveReference()
	 * @generated
	 */
	EReference getAdvanceDirectiveReference_CDAType();

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
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ICauseOfDeathObservation <em>Cause Of Death Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cause Of Death Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ICauseOfDeathObservation
	 * @generated
	 */
	EClass getCauseOfDeathObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IFamilyHistoryObservation <em>Family History Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family History Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IFamilyHistoryObservation
	 * @generated
	 */
	EClass getFamilyHistoryObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISimpleObservation <em>Simple Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISimpleObservation
	 * @generated
	 */
	EClass getSimpleObservation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISimpleObservation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISimpleObservation#getCDAType()
	 * @see #getSimpleObservation()
	 * @generated
	 */
	EReference getSimpleObservation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IProblemEntryReactionObservationContainer <em>Problem Entry Reaction Observation Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem Entry Reaction Observation Container</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IProblemEntryReactionObservationContainer
	 * @generated
	 */
	EClass getProblemEntryReactionObservationContainer();

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
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncountersActivity <em>Encounters Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encounters Activity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncountersActivity
	 * @generated
	 */
	EClass getEncountersActivity();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncountersActivity#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncountersActivity#getCDAType()
	 * @see #getEncountersActivity()
	 * @generated
	 */
	EReference getEncountersActivity_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncounterLocation <em>Encounter Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encounter Location</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncounterLocation
	 * @generated
	 */
	EClass getEncounterLocation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncounterLocation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncounterLocation#getCDAType()
	 * @see #getEncounterLocation()
	 * @generated
	 */
	EReference getEncounterLocation_CDAType();

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
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPayerEntity <em>Payer Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payer Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPayerEntity
	 * @generated
	 */
	EClass getPayerEntity();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPayerEntity#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPayerEntity#getCDAType()
	 * @see #getPayerEntity()
	 * @generated
	 */
	EReference getPayerEntity_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ICoveredParty <em>Covered Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Covered Party</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ICoveredParty
	 * @generated
	 */
	EClass getCoveredParty();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ICoveredParty#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ICoveredParty#getCDAType()
	 * @see #getCoveredParty()
	 * @generated
	 */
	EReference getCoveredParty_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPolicySubscriber <em>Policy Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Subscriber</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPolicySubscriber
	 * @generated
	 */
	EClass getPolicySubscriber();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPolicySubscriber#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPolicySubscriber#getCDAType()
	 * @see #getPolicySubscriber()
	 * @generated
	 */
	EReference getPolicySubscriber_CDAType();

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
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivityAct <em>Plan Of Care Activity Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Care Activity Act</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivityAct
	 * @generated
	 */
	EClass getPlanOfCareActivityAct();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivityAct#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivityAct#getCDAType()
	 * @see #getPlanOfCareActivityAct()
	 * @generated
	 */
	EReference getPlanOfCareActivityAct_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivity <em>Plan Of Care Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Care Activity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivity
	 * @generated
	 */
	EClass getPlanOfCareActivity();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivityEncounter <em>Plan Of Care Activity Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Care Activity Encounter</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivityEncounter
	 * @generated
	 */
	EClass getPlanOfCareActivityEncounter();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivityEncounter#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivityEncounter#getCDAType()
	 * @see #getPlanOfCareActivityEncounter()
	 * @generated
	 */
	EReference getPlanOfCareActivityEncounter_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivityObservation <em>Plan Of Care Activity Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Care Activity Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivityObservation
	 * @generated
	 */
	EClass getPlanOfCareActivityObservation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivityObservation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivityObservation#getCDAType()
	 * @see #getPlanOfCareActivityObservation()
	 * @generated
	 */
	EReference getPlanOfCareActivityObservation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivityProcedure <em>Plan Of Care Activity Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Care Activity Procedure</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivityProcedure
	 * @generated
	 */
	EClass getPlanOfCareActivityProcedure();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivityProcedure#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivityProcedure#getCDAType()
	 * @see #getPlanOfCareActivityProcedure()
	 * @generated
	 */
	EReference getPlanOfCareActivityProcedure_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivitySubstanceAdministration <em>Plan Of Care Activity Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Care Activity Substance Administration</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivitySubstanceAdministration
	 * @generated
	 */
	EClass getPlanOfCareActivitySubstanceAdministration();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivitySubstanceAdministration#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivitySubstanceAdministration#getCDAType()
	 * @see #getPlanOfCareActivitySubstanceAdministration()
	 * @generated
	 */
	EReference getPlanOfCareActivitySubstanceAdministration_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivitySupply <em>Plan Of Care Activity Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Care Activity Supply</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivitySupply
	 * @generated
	 */
	EClass getPlanOfCareActivitySupply();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivitySupply#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivitySupply#getCDAType()
	 * @see #getPlanOfCareActivitySupply()
	 * @generated
	 */
	EReference getPlanOfCareActivitySupply_CDAType();

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
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IExternalReference
	 * @generated
	 */
	EClass getExternalReference();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IExternalReference#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IExternalReference#getCDAType()
	 * @see #getExternalReference()
	 * @generated
	 */
	EReference getExternalReference_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IProcedureEntryProcedureActivityProcedure <em>Procedure Entry Procedure Activity Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Entry Procedure Activity Procedure</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IProcedureEntryProcedureActivityProcedure
	 * @generated
	 */
	EClass getProcedureEntryProcedureActivityProcedure();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IProcedureEntry <em>Procedure Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Entry</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IProcedureEntry
	 * @generated
	 */
	EClass getProcedureEntry();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IProcedureEntry#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IProcedureEntry#getCDAType()
	 * @see #getProcedureEntry()
	 * @generated
	 */
	EReference getProcedureEntry_CDAType();

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
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPregnancyHistorySection <em>Pregnancy History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pregnancy History Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPregnancyHistorySection
	 * @generated
	 */
	EClass getPregnancyHistorySection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPregnancyHistorySection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPregnancyHistorySection#getCDAType()
	 * @see #getPregnancyHistorySection()
	 * @generated
	 */
	EReference getPregnancyHistorySection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPregnancyObservation <em>Pregnancy Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pregnancy Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPregnancyObservation
	 * @generated
	 */
	EClass getPregnancyObservation();

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
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSignsOrganizer <em>Vital Signs Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vital Signs Organizer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSignsOrganizer
	 * @generated
	 */
	EClass getVitalSignsOrganizer();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSignObservation <em>Vital Sign Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vital Sign Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSignObservation
	 * @generated
	 */
	EClass getVitalSignObservation();

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
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPurposeSection <em>Purpose Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purpose Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPurposeSection
	 * @generated
	 */
	EClass getPurposeSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPurposeSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPurposeSection#getCDAType()
	 * @see #getPurposeSection()
	 * @generated
	 */
	EReference getPurposeSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPurposeActivity <em>Purpose Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purpose Activity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPurposeActivity
	 * @generated
	 */
	EClass getPurposeActivity();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPurposeActivity#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPurposeActivity#getCDAType()
	 * @see #getPurposeActivity()
	 * @generated
	 */
	EReference getPurposeActivity_CDAType();

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
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IGeneralAppearanceSection <em>General Appearance Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Appearance Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IGeneralAppearanceSection
	 * @generated
	 */
	EClass getGeneralAppearanceSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IGeneralAppearanceSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IGeneralAppearanceSection#getCDAType()
	 * @see #getGeneralAppearanceSection()
	 * @generated
	 */
	EReference getGeneralAppearanceSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IVisibleImplantedMedicalDevicesSection <em>Visible Implanted Medical Devices Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visible Implanted Medical Devices Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IVisibleImplantedMedicalDevicesSection
	 * @generated
	 */
	EClass getVisibleImplantedMedicalDevicesSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IVisibleImplantedMedicalDevicesSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IVisibleImplantedMedicalDevicesSection#getCDAType()
	 * @see #getVisibleImplantedMedicalDevicesSection()
	 * @generated
	 */
	EReference getVisibleImplantedMedicalDevicesSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IIntegumentarySystemSection <em>Integumentary System Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integumentary System Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IIntegumentarySystemSection
	 * @generated
	 */
	EClass getIntegumentarySystemSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IIntegumentarySystemSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IIntegumentarySystemSection#getCDAType()
	 * @see #getIntegumentarySystemSection()
	 * @generated
	 */
	EReference getIntegumentarySystemSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IHeadSection <em>Head Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Head Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IHeadSection
	 * @generated
	 */
	EClass getHeadSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IHeadSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IHeadSection#getCDAType()
	 * @see #getHeadSection()
	 * @generated
	 */
	EReference getHeadSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IEyesSection <em>Eyes Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eyes Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IEyesSection
	 * @generated
	 */
	EClass getEyesSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IEyesSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IEyesSection#getCDAType()
	 * @see #getEyesSection()
	 * @generated
	 */
	EReference getEyesSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IEarsNoseMouthThroatSection <em>Ears Nose Mouth Throat Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ears Nose Mouth Throat Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IEarsNoseMouthThroatSection
	 * @generated
	 */
	EClass getEarsNoseMouthThroatSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IEarsNoseMouthThroatSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IEarsNoseMouthThroatSection#getCDAType()
	 * @see #getEarsNoseMouthThroatSection()
	 * @generated
	 */
	EReference getEarsNoseMouthThroatSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IEarsSection <em>Ears Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ears Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IEarsSection
	 * @generated
	 */
	EClass getEarsSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IEarsSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IEarsSection#getCDAType()
	 * @see #getEarsSection()
	 * @generated
	 */
	EReference getEarsSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.INoseSection <em>Nose Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nose Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.INoseSection
	 * @generated
	 */
	EClass getNoseSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.INoseSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.INoseSection#getCDAType()
	 * @see #getNoseSection()
	 * @generated
	 */
	EReference getNoseSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMouthThroatTeethSection <em>Mouth Throat Teeth Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mouth Throat Teeth Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMouthThroatTeethSection
	 * @generated
	 */
	EClass getMouthThroatTeethSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMouthThroatTeethSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMouthThroatTeethSection#getCDAType()
	 * @see #getMouthThroatTeethSection()
	 * @generated
	 */
	EReference getMouthThroatTeethSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.INeckSection <em>Neck Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neck Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.INeckSection
	 * @generated
	 */
	EClass getNeckSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.INeckSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.INeckSection#getCDAType()
	 * @see #getNeckSection()
	 * @generated
	 */
	EReference getNeckSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IEndocrineSystemSection <em>Endocrine System Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endocrine System Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IEndocrineSystemSection
	 * @generated
	 */
	EClass getEndocrineSystemSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IEndocrineSystemSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IEndocrineSystemSection#getCDAType()
	 * @see #getEndocrineSystemSection()
	 * @generated
	 */
	EReference getEndocrineSystemSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IThoraxLungsSection <em>Thorax Lungs Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thorax Lungs Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IThoraxLungsSection
	 * @generated
	 */
	EClass getThoraxLungsSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IThoraxLungsSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IThoraxLungsSection#getCDAType()
	 * @see #getThoraxLungsSection()
	 * @generated
	 */
	EReference getThoraxLungsSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IChestWallSection <em>Chest Wall Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chest Wall Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IChestWallSection
	 * @generated
	 */
	EClass getChestWallSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IChestWallSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IChestWallSection#getCDAType()
	 * @see #getChestWallSection()
	 * @generated
	 */
	EReference getChestWallSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IBreastSection <em>Breast Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Breast Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IBreastSection
	 * @generated
	 */
	EClass getBreastSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IBreastSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IBreastSection#getCDAType()
	 * @see #getBreastSection()
	 * @generated
	 */
	EReference getBreastSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IHeartSection <em>Heart Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heart Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IHeartSection
	 * @generated
	 */
	EClass getHeartSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IHeartSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IHeartSection#getCDAType()
	 * @see #getHeartSection()
	 * @generated
	 */
	EReference getHeartSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IRespiratorySystemSection <em>Respiratory System Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Respiratory System Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IRespiratorySystemSection
	 * @generated
	 */
	EClass getRespiratorySystemSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IRespiratorySystemSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IRespiratorySystemSection#getCDAType()
	 * @see #getRespiratorySystemSection()
	 * @generated
	 */
	EReference getRespiratorySystemSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAbdomenSection <em>Abdomen Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abdomen Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAbdomenSection
	 * @generated
	 */
	EClass getAbdomenSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAbdomenSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAbdomenSection#getCDAType()
	 * @see #getAbdomenSection()
	 * @generated
	 */
	EReference getAbdomenSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ILymphaticSection <em>Lymphatic Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lymphatic Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ILymphaticSection
	 * @generated
	 */
	EClass getLymphaticSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ILymphaticSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ILymphaticSection#getCDAType()
	 * @see #getLymphaticSection()
	 * @generated
	 */
	EReference getLymphaticSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IVesselsSection <em>Vessels Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vessels Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IVesselsSection
	 * @generated
	 */
	EClass getVesselsSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IVesselsSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IVesselsSection#getCDAType()
	 * @see #getVesselsSection()
	 * @generated
	 */
	EReference getVesselsSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMusculoskeletalSystemSection <em>Musculoskeletal System Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Musculoskeletal System Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMusculoskeletalSystemSection
	 * @generated
	 */
	EClass getMusculoskeletalSystemSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMusculoskeletalSystemSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMusculoskeletalSystemSection#getCDAType()
	 * @see #getMusculoskeletalSystemSection()
	 * @generated
	 */
	EReference getMusculoskeletalSystemSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.INeurologicSystemSection <em>Neurologic System Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neurologic System Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.INeurologicSystemSection
	 * @generated
	 */
	EClass getNeurologicSystemSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.INeurologicSystemSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.INeurologicSystemSection#getCDAType()
	 * @see #getNeurologicSystemSection()
	 * @generated
	 */
	EReference getNeurologicSystemSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IGenitaliaSection <em>Genitalia Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Genitalia Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IGenitaliaSection
	 * @generated
	 */
	EClass getGenitaliaSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IGenitaliaSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IGenitaliaSection#getCDAType()
	 * @see #getGenitaliaSection()
	 * @generated
	 */
	EReference getGenitaliaSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IRectumSection <em>Rectum Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectum Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IRectumSection
	 * @generated
	 */
	EClass getRectumSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IRectumSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IRectumSection#getCDAType()
	 * @see #getRectumSection()
	 * @generated
	 */
	EReference getRectumSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IExtremitiesSection <em>Extremities Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extremities Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IExtremitiesSection
	 * @generated
	 */
	EClass getExtremitiesSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IExtremitiesSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IExtremitiesSection#getCDAType()
	 * @see #getExtremitiesSection()
	 * @generated
	 */
	EReference getExtremitiesSection_CDAType();

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
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISocialHistory <em>Social History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social History</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISocialHistory
	 * @generated
	 */
	EClass getSocialHistory();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISocialHistory#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISocialHistory#getCDAType()
	 * @see #getSocialHistory()
	 * @generated
	 */
	EReference getSocialHistory_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISocialHistoryStatusObservation <em>Social History Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social History Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISocialHistoryStatusObservation
	 * @generated
	 */
	EClass getSocialHistoryStatusObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISocialHistoryObservation <em>Social History Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social History Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISocialHistoryObservation
	 * @generated
	 */
	EClass getSocialHistoryObservation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISocialHistoryObservation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISocialHistoryObservation#getCDAType()
	 * @see #getSocialHistoryObservation()
	 * @generated
	 */
	EReference getSocialHistoryObservation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IResultsSection <em>Results Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Results Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IResultsSection
	 * @generated
	 */
	EClass getResultsSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IResultsSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IResultsSection#getCDAType()
	 * @see #getResultsSection()
	 * @generated
	 */
	EReference getResultsSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IResultOrganizer <em>Result Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Organizer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IResultOrganizer
	 * @generated
	 */
	EClass getResultOrganizer();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IResultOrganizer#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IResultOrganizer#getCDAType()
	 * @see #getResultOrganizer()
	 * @generated
	 */
	EReference getResultOrganizer_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IResultObservation <em>Result Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IResultObservation
	 * @generated
	 */
	EClass getResultObservation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IResultObservation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IResultObservation#getCDAType()
	 * @see #getResultObservation()
	 * @generated
	 */
	EReference getResultObservation_CDAType();

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
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupplyActivity <em>Supply Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supply Activity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupplyActivity
	 * @generated
	 */
	EClass getSupplyActivity();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupplyActivity#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupplyActivity#getCDAType()
	 * @see #getSupplyActivity()
	 * @generated
	 */
	EReference getSupplyActivity_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IFulfillmentInstruction <em>Fulfillment Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fulfillment Instruction</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IFulfillmentInstruction
	 * @generated
	 */
	EClass getFulfillmentInstruction();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IFulfillmentInstruction#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IFulfillmentInstruction#getCDAType()
	 * @see #getFulfillmentInstruction()
	 * @generated
	 */
	EReference getFulfillmentInstruction_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationActivity <em>Medication Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Activity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationActivity
	 * @generated
	 */
	EClass getMedicationActivity();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationActivity#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationActivity#getCDAType()
	 * @see #getMedicationActivity()
	 * @generated
	 */
	EReference getMedicationActivity_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPatientInstruction <em>Patient Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient Instruction</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPatientInstruction
	 * @generated
	 */
	EClass getPatientInstruction();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPatientInstruction#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPatientInstruction#getCDAType()
	 * @see #getPatientInstruction()
	 * @generated
	 */
	EReference getPatientInstruction_CDAType();

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
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPayerEntry <em>Payer Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payer Entry</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPayerEntry
	 * @generated
	 */
	EClass getPayerEntry();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPayerEntry#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPayerEntry#getCDAType()
	 * @see #getPayerEntry()
	 * @generated
	 */
	EReference getPayerEntry_CDAType();

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
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IScanOriginalAuthor <em>Scan Original Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scan Original Author</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IScanOriginalAuthor
	 * @generated
	 */
	EClass getScanOriginalAuthor();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IScanOriginalAuthor#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IScanOriginalAuthor#getCDAType()
	 * @see #getScanOriginalAuthor()
	 * @generated
	 */
	EReference getScanOriginalAuthor_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IScanningDevice <em>Scanning Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scanning Device</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IScanningDevice
	 * @generated
	 */
	EClass getScanningDevice();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IScanningDevice#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IScanningDevice#getCDAType()
	 * @see #getScanningDevice()
	 * @generated
	 */
	EReference getScanningDevice_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IScanDataEnterer <em>Scan Data Enterer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scan Data Enterer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IScanDataEnterer
	 * @generated
	 */
	EClass getScanDataEnterer();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IScanDataEnterer#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IScanDataEnterer#getCDAType()
	 * @see #getScanDataEnterer()
	 * @generated
	 */
	EReference getScanDataEnterer_CDAType();

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
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IUnstructuredOrScannedDocument <em>Unstructured Or Scanned Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unstructured Or Scanned Document</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IUnstructuredOrScannedDocument
	 * @generated
	 */
	EClass getUnstructuredOrScannedDocument();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IReferralSummary <em>Referral Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referral Summary</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IReferralSummary
	 * @generated
	 */
	EClass getReferralSummary();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IReferralSummary#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IReferralSummary#getCDAType()
	 * @see #getReferralSummary()
	 * @generated
	 */
	EReference getReferralSummary_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IDischargeSummary <em>Discharge Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discharge Summary</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDischargeSummary
	 * @generated
	 */
	EClass getDischargeSummary();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IDischargeSummary#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDischargeSummary#getCDAType()
	 * @see #getDischargeSummary()
	 * @generated
	 */
	EReference getDischargeSummary_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IDischargeDiet <em>Discharge Diet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discharge Diet</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDischargeDiet
	 * @generated
	 */
	EClass getDischargeDiet();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IDischargeDiet#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDischargeDiet#getCDAType()
	 * @see #getDischargeDiet()
	 * @generated
	 */
	EReference getDischargeDiet_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IFamilyHistory <em>Family History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family History</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IFamilyHistory
	 * @generated
	 */
	EClass getFamilyHistory();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IFamilyHistory#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IFamilyHistory#getCDAType()
	 * @see #getFamilyHistory()
	 * @generated
	 */
	EReference getFamilyHistory_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IFamilyHistoryOrganizer <em>Family History Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family History Organizer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IFamilyHistoryOrganizer
	 * @generated
	 */
	EClass getFamilyHistoryOrganizer();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IFamilyHistoryOrganizer#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IFamilyHistoryOrganizer#getCDAType()
	 * @see #getFamilyHistoryOrganizer()
	 * @generated
	 */
	EReference getFamilyHistoryOrganizer_CDAType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IDomainFactory getDomainFactory();

} // IDomainPackage
