/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.uml.cda.apitest.APITestFactory;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPackage;
import org.openhealthtools.mdht.uml.cda.apitest.AgeObservation;
import org.openhealthtools.mdht.uml.cda.apitest.CauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.apitest.Comment;
import org.openhealthtools.mdht.uml.cda.apitest.Condition;
import org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.apitest.Condition_TreatingProvider;
import org.openhealthtools.mdht.uml.cda.apitest.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.apitest.FamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.apitest.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.apitest.HealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.apitest.PatientSummary;
import org.openhealthtools.mdht.uml.cda.apitest.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.apitest.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.apitest.Severity;
import org.openhealthtools.mdht.uml.cda.apitest.StatusObservation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class APITestFactoryImpl extends EFactoryImpl implements APITestFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static APITestFactory init() {
		try {
			APITestFactory theAPITestFactory = (APITestFactory) EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
			if (theAPITestFactory != null) {
				return theAPITestFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new APITestFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APITestFactoryImpl() {
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
			case APITestPackage.STATUS_OBSERVATION:
				return createStatusObservation();
			case APITestPackage.CONDITION:
				return createCondition();
			case APITestPackage.CONDITION_TREATING_PROVIDER:
				return createCondition_TreatingProvider();
			case APITestPackage.EPISODE_OBSERVATION:
				return createEpisodeObservation();
			case APITestPackage.CONDITION_ENTRY:
				return createConditionEntry();
			case APITestPackage.AGE_OBSERVATION:
				return createAgeObservation();
			case APITestPackage.SEVERITY:
				return createSeverity();
			case APITestPackage.PROBLEM_STATUS_OBSERVATION:
				return createProblemStatusObservation();
			case APITestPackage.HEALTH_STATUS_OBSERVATION:
				return createHealthStatusObservation();
			case APITestPackage.COMMENT:
				return createComment();
			case APITestPackage.CAUSE_OF_DEATH_OBSERVATION:
				return createCauseOfDeathObservation();
			case APITestPackage.FAMILY_HISTORY_OBSERVATION:
				return createFamilyHistoryObservation();
			case APITestPackage.PROBLEM_LIST_SECTION:
				return createProblemListSection();
			case APITestPackage.PATIENT_SUMMARY:
				return createPatientSummary();
			case APITestPackage.GENERAL_HEADER_CONSTRAINTS:
				return createGeneralHeaderConstraints();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusObservation createStatusObservation() {
		StatusObservationImpl statusObservation = new StatusObservationImpl();
		return statusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition_TreatingProvider createCondition_TreatingProvider() {
		Condition_TreatingProviderImpl condition_TreatingProvider = new Condition_TreatingProviderImpl();
		return condition_TreatingProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeObservation createEpisodeObservation() {
		EpisodeObservationImpl episodeObservation = new EpisodeObservationImpl();
		return episodeObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionEntry createConditionEntry() {
		ConditionEntryImpl conditionEntry = new ConditionEntryImpl();
		return conditionEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgeObservation createAgeObservation() {
		AgeObservationImpl ageObservation = new AgeObservationImpl();
		return ageObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity createSeverity() {
		SeverityImpl severity = new SeverityImpl();
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemStatusObservation createProblemStatusObservation() {
		ProblemStatusObservationImpl problemStatusObservation = new ProblemStatusObservationImpl();
		return problemStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthStatusObservation createHealthStatusObservation() {
		HealthStatusObservationImpl healthStatusObservation = new HealthStatusObservationImpl();
		return healthStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemListSection createProblemListSection() {
		ProblemListSectionImpl problemListSection = new ProblemListSectionImpl();
		return problemListSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryObservation createFamilyHistoryObservation() {
		FamilyHistoryObservationImpl familyHistoryObservation = new FamilyHistoryObservationImpl();
		return familyHistoryObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CauseOfDeathObservation createCauseOfDeathObservation() {
		CauseOfDeathObservationImpl causeOfDeathObservation = new CauseOfDeathObservationImpl();
		return causeOfDeathObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientSummary createPatientSummary() {
		PatientSummaryImpl patientSummary = new PatientSummaryImpl();
		return patientSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints createGeneralHeaderConstraints() {
		GeneralHeaderConstraintsImpl generalHeaderConstraints = new GeneralHeaderConstraintsImpl();
		return generalHeaderConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APITestPackage getAPITestPackage() {
		return (APITestPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static APITestPackage getPackage() {
		return APITestPackage.eINSTANCE;
	}

} // APITestFactoryImpl
