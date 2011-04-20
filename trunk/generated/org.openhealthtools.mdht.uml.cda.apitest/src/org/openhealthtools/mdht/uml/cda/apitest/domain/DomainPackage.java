/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.domain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainFactory
 * @model kind="package"
 * @generated
 */
public interface DomainPackage extends EPackage {
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
	String eNS_URI = "http:///apitest/domain.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "apitest.domain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.StatusObservation <em>Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.StatusObservation
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getStatusObservation()
	 * @generated
	 */
	int STATUS_OBSERVATION = 0;

	/**
	 * The number of structural features of the '<em>Status Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.Condition <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.Condition
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.EpisodeObservation <em>Episode Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.EpisodeObservation
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getEpisodeObservation()
	 * @generated
	 */
	int EPISODE_OBSERVATION = 2;

	/**
	 * The number of structural features of the '<em>Episode Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ConditionEntry <em>Condition Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.ConditionEntry
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getConditionEntry()
	 * @generated
	 */
	int CONDITION_ENTRY = 3;

	/**
	 * The number of structural features of the '<em>Condition Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.AgeObservation <em>Age Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.AgeObservation
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getAgeObservation()
	 * @generated
	 */
	int AGE_OBSERVATION = 4;

	/**
	 * The number of structural features of the '<em>Age Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.Severity <em>Severity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.Severity
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 5;

	/**
	 * The number of structural features of the '<em>Severity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ProblemStatusObservation <em>Problem Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.ProblemStatusObservation
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getProblemStatusObservation()
	 * @generated
	 */
	int PROBLEM_STATUS_OBSERVATION = 6;

	/**
	 * The number of structural features of the '<em>Problem Status Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION_FEATURE_COUNT = STATUS_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.HealthStatusObservation <em>Health Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.HealthStatusObservation
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getHealthStatusObservation()
	 * @generated
	 */
	int HEALTH_STATUS_OBSERVATION = 7;

	/**
	 * The number of structural features of the '<em>Health Status Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION_FEATURE_COUNT = STATUS_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.Comment <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.Comment
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 8;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.FamilyHistoryObservation <em>Family History Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.FamilyHistoryObservation
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getFamilyHistoryObservation()
	 * @generated
	 */
	int FAMILY_HISTORY_OBSERVATION = 10;

	/**
	 * The number of structural features of the '<em>Family History Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_HISTORY_OBSERVATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.CauseOfDeathObservation <em>Cause Of Death Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.CauseOfDeathObservation
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getCauseOfDeathObservation()
	 * @generated
	 */
	int CAUSE_OF_DEATH_OBSERVATION = 9;

	/**
	 * The number of structural features of the '<em>Cause Of Death Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OF_DEATH_OBSERVATION_FEATURE_COUNT = FAMILY_HISTORY_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.TreatingProvider <em>Treating Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.TreatingProvider
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getTreatingProvider()
	 * @generated
	 */
	int TREATING_PROVIDER = 11;

	/**
	 * The number of structural features of the '<em>Treating Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATING_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ProblemListSection <em>Problem List Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.ProblemListSection
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getProblemListSection()
	 * @generated
	 */
	int PROBLEM_LIST_SECTION = 12;

	/**
	 * The number of structural features of the '<em>Problem List Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.GeneralHeaderConstraints <em>General Header Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.GeneralHeaderConstraints
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getGeneralHeaderConstraints()
	 * @generated
	 */
	int GENERAL_HEADER_CONSTRAINTS = 14;

	/**
	 * The number of structural features of the '<em>General Header Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.PatientSummary <em>Patient Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.PatientSummary
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getPatientSummary()
	 * @generated
	 */
	int PATIENT_SUMMARY = 13;

	/**
	 * The number of structural features of the '<em>Patient Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SUMMARY_FEATURE_COUNT = GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.StatusObservation <em>Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.StatusObservation
	 * @generated
	 */
	EClass getStatusObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.EpisodeObservation <em>Episode Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Episode Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.EpisodeObservation
	 * @generated
	 */
	EClass getEpisodeObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ConditionEntry <em>Condition Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Entry</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.ConditionEntry
	 * @generated
	 */
	EClass getConditionEntry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.AgeObservation <em>Age Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Age Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.AgeObservation
	 * @generated
	 */
	EClass getAgeObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.Severity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Severity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.Severity
	 * @generated
	 */
	EClass getSeverity();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ProblemStatusObservation <em>Problem Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.ProblemStatusObservation
	 * @generated
	 */
	EClass getProblemStatusObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.HealthStatusObservation <em>Health Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.HealthStatusObservation
	 * @generated
	 */
	EClass getHealthStatusObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.CauseOfDeathObservation <em>Cause Of Death Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cause Of Death Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.CauseOfDeathObservation
	 * @generated
	 */
	EClass getCauseOfDeathObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.FamilyHistoryObservation <em>Family History Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family History Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.FamilyHistoryObservation
	 * @generated
	 */
	EClass getFamilyHistoryObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.TreatingProvider <em>Treating Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Treating Provider</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.TreatingProvider
	 * @generated
	 */
	EClass getTreatingProvider();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ProblemListSection <em>Problem List Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem List Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.ProblemListSection
	 * @generated
	 */
	EClass getProblemListSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.PatientSummary <em>Patient Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient Summary</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.PatientSummary
	 * @generated
	 */
	EClass getPatientSummary();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.GeneralHeaderConstraints <em>General Header Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Header Constraints</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.GeneralHeaderConstraints
	 * @generated
	 */
	EClass getGeneralHeaderConstraints();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainFactory getDomainFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.StatusObservation <em>Status Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.StatusObservation
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getStatusObservation()
		 * @generated
		 */
		EClass STATUS_OBSERVATION = eINSTANCE.getStatusObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.Condition <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.Condition
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.EpisodeObservation <em>Episode Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.EpisodeObservation
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getEpisodeObservation()
		 * @generated
		 */
		EClass EPISODE_OBSERVATION = eINSTANCE.getEpisodeObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ConditionEntry <em>Condition Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.ConditionEntry
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getConditionEntry()
		 * @generated
		 */
		EClass CONDITION_ENTRY = eINSTANCE.getConditionEntry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.AgeObservation <em>Age Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.AgeObservation
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getAgeObservation()
		 * @generated
		 */
		EClass AGE_OBSERVATION = eINSTANCE.getAgeObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.Severity <em>Severity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.Severity
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getSeverity()
		 * @generated
		 */
		EClass SEVERITY = eINSTANCE.getSeverity();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ProblemStatusObservation <em>Problem Status Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.ProblemStatusObservation
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getProblemStatusObservation()
		 * @generated
		 */
		EClass PROBLEM_STATUS_OBSERVATION = eINSTANCE.getProblemStatusObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.HealthStatusObservation <em>Health Status Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.HealthStatusObservation
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getHealthStatusObservation()
		 * @generated
		 */
		EClass HEALTH_STATUS_OBSERVATION = eINSTANCE.getHealthStatusObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.Comment <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.Comment
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.CauseOfDeathObservation <em>Cause Of Death Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.CauseOfDeathObservation
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getCauseOfDeathObservation()
		 * @generated
		 */
		EClass CAUSE_OF_DEATH_OBSERVATION = eINSTANCE.getCauseOfDeathObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.FamilyHistoryObservation <em>Family History Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.FamilyHistoryObservation
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getFamilyHistoryObservation()
		 * @generated
		 */
		EClass FAMILY_HISTORY_OBSERVATION = eINSTANCE.getFamilyHistoryObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.TreatingProvider <em>Treating Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.TreatingProvider
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getTreatingProvider()
		 * @generated
		 */
		EClass TREATING_PROVIDER = eINSTANCE.getTreatingProvider();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ProblemListSection <em>Problem List Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.ProblemListSection
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getProblemListSection()
		 * @generated
		 */
		EClass PROBLEM_LIST_SECTION = eINSTANCE.getProblemListSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.PatientSummary <em>Patient Summary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.PatientSummary
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getPatientSummary()
		 * @generated
		 */
		EClass PATIENT_SUMMARY = eINSTANCE.getPatientSummary();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.GeneralHeaderConstraints <em>General Header Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.GeneralHeaderConstraints
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getGeneralHeaderConstraints()
		 * @generated
		 */
		EClass GENERAL_HEADER_CONSTRAINTS = eINSTANCE.getGeneralHeaderConstraints();

	}

} //DomainPackage
