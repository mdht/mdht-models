/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.domain.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPackage;
import org.openhealthtools.mdht.uml.cda.apitest.domain.AgeObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.CauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.Comment;
import org.openhealthtools.mdht.uml.cda.apitest.domain.Condition;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.apitest.domain.DomainFactory;
import org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage;
import org.openhealthtools.mdht.uml.cda.apitest.domain.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.FamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.apitest.domain.HealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.PatientSummary;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.Severity;
import org.openhealthtools.mdht.uml.cda.apitest.domain.StatusObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.TreatingProvider;
import org.openhealthtools.mdht.uml.cda.apitest.impl.APITestPackageImpl;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainPackageImpl extends EPackageImpl implements DomainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass episodeObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ageObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass severityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass causeOfDeathObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyHistoryObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treatingProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemListSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientSummaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalHeaderConstraintsEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DomainPackageImpl() {
		super(eNS_URI, DomainFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DomainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DomainPackage init() {
		if (isInited) return (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Obtain or create and register package
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DomainPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CDAPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		APITestPackageImpl theAPITestPackage = (APITestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(APITestPackage.eNS_URI) instanceof APITestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(APITestPackage.eNS_URI) : APITestPackage.eINSTANCE);

		// Create package meta-data objects
		theDomainPackage.createPackageContents();
		theAPITestPackage.createPackageContents();

		// Initialize created meta-data
		theDomainPackage.initializePackageContents();
		theAPITestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDomainPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DomainPackage.eNS_URI, theDomainPackage);
		return theDomainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusObservation() {
		return statusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpisodeObservation() {
		return episodeObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionEntry() {
		return conditionEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgeObservation() {
		return ageObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeverity() {
		return severityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemStatusObservation() {
		return problemStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthStatusObservation() {
		return healthStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCauseOfDeathObservation() {
		return causeOfDeathObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistoryObservation() {
		return familyHistoryObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTreatingProvider() {
		return treatingProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemListSection() {
		return problemListSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientSummary() {
		return patientSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralHeaderConstraints() {
		return generalHeaderConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFactory getDomainFactory() {
		return (DomainFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		statusObservationEClass = createEClass(STATUS_OBSERVATION);

		conditionEClass = createEClass(CONDITION);

		episodeObservationEClass = createEClass(EPISODE_OBSERVATION);

		conditionEntryEClass = createEClass(CONDITION_ENTRY);

		ageObservationEClass = createEClass(AGE_OBSERVATION);

		severityEClass = createEClass(SEVERITY);

		problemStatusObservationEClass = createEClass(PROBLEM_STATUS_OBSERVATION);

		healthStatusObservationEClass = createEClass(HEALTH_STATUS_OBSERVATION);

		commentEClass = createEClass(COMMENT);

		causeOfDeathObservationEClass = createEClass(CAUSE_OF_DEATH_OBSERVATION);

		familyHistoryObservationEClass = createEClass(FAMILY_HISTORY_OBSERVATION);

		treatingProviderEClass = createEClass(TREATING_PROVIDER);

		problemListSectionEClass = createEClass(PROBLEM_LIST_SECTION);

		patientSummaryEClass = createEClass(PATIENT_SUMMARY);

		generalHeaderConstraintsEClass = createEClass(GENERAL_HEADER_CONSTRAINTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CDAPackage theCDAPackage = (CDAPackage)EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);
		DatatypesPackage theDatatypesPackage = (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);
		VocabPackage theVocabPackage = (VocabPackage)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		problemStatusObservationEClass.getESuperTypes().add(this.getStatusObservation());
		healthStatusObservationEClass.getESuperTypes().add(this.getStatusObservation());
		causeOfDeathObservationEClass.getESuperTypes().add(this.getFamilyHistoryObservation());
		patientSummaryEClass.getESuperTypes().add(this.getGeneralHeaderConstraints());

		// Initialize classes and features; add operations and parameters
		initEClass(statusObservationEClass, StatusObservation.class, "StatusObservation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(statusObservationEClass, theCDAPackage.getObservation(), "toCDAType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(statusObservationEClass, theDatatypesPackage.getCE(), "getValue", 1, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = addEOperation(statusObservationEClass, this.getStatusObservation(), "setValue", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCE(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(statusObservationEClass, theDatatypesPackage.getED(), "getText", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(statusObservationEClass, this.getStatusObservation(), "setText", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getED(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(conditionEClass, theCDAPackage.getAct(), "toCDAType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(conditionEClass, theDatatypesPackage.getII(), "getIds", 1, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(conditionEClass, this.getCondition(), "addId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getII(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(conditionEClass, theDatatypesPackage.getCD(), "getCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(conditionEClass, this.getCondition(), "setCode", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCD(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(conditionEClass, theDatatypesPackage.getCS(), "getStatusCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(conditionEClass, this.getCondition(), "setStatusCode", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCS(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(conditionEClass, theDatatypesPackage.getIVL_TS(), "getEffectiveTime", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(conditionEClass, this.getCondition(), "setEffectiveTime", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getIVL_TS(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(conditionEClass, this.getEpisodeObservation(), "getEpisodeObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(conditionEClass, this.getCondition(), "setEpisodeObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getEpisodeObservation(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(conditionEClass, this.getConditionEntry(), "getProblemEntries", 1, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(conditionEClass, this.getCondition(), "addProblemEntry", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getConditionEntry(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(conditionEClass, this.getTreatingProvider(), "getTreatingProvider", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(conditionEClass, this.getCondition(), "setTreatingProvider", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getTreatingProvider(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(episodeObservationEClass, EpisodeObservation.class, "EpisodeObservation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(episodeObservationEClass, theCDAPackage.getObservation(), "toCDAType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(episodeObservationEClass, theDatatypesPackage.getCD(), "getCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(episodeObservationEClass, this.getEpisodeObservation(), "setCode", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCD(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(episodeObservationEClass, theDatatypesPackage.getCD(), "getValue", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(episodeObservationEClass, this.getEpisodeObservation(), "setValue", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCD(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(conditionEntryEClass, ConditionEntry.class, "ConditionEntry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(conditionEntryEClass, theCDAPackage.getObservation(), "toCDAType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(conditionEntryEClass, theVocabPackage.getActClass(), "getClassCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(conditionEntryEClass, this.getConditionEntry(), "setClassCode", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theVocabPackage.getActClass(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(conditionEntryEClass, theDatatypesPackage.getII(), "getIds", 1, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(conditionEntryEClass, this.getConditionEntry(), "addId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getII(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(conditionEntryEClass, theDatatypesPackage.getCD(), "getProblemType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(conditionEntryEClass, this.getConditionEntry(), "setProblemType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCD(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(conditionEntryEClass, theDatatypesPackage.getED(), "getProblemName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(conditionEntryEClass, this.getConditionEntry(), "setProblemName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getED(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(conditionEntryEClass, theDatatypesPackage.getIVL_TS(), "getProblemDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(conditionEntryEClass, this.getConditionEntry(), "setProblemDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getIVL_TS(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(conditionEntryEClass, theDatatypesPackage.getCD(), "getProblemCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(conditionEntryEClass, this.getConditionEntry(), "setProblemCode", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCD(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(conditionEntryEClass, this.getAgeObservation(), "getAgeAtOnset", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(conditionEntryEClass, this.getConditionEntry(), "setAgeAtOnset", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getAgeObservation(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(conditionEntryEClass, this.getSeverity(), "getSeverity", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(conditionEntryEClass, this.getConditionEntry(), "setSeverity", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getSeverity(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(conditionEntryEClass, this.getProblemStatusObservation(), "getProblemStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(conditionEntryEClass, this.getConditionEntry(), "setProblemStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getProblemStatusObservation(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(conditionEntryEClass, this.getHealthStatusObservation(), "getHealthStatusObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(conditionEntryEClass, this.getConditionEntry(), "setHealthStatusObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHealthStatusObservation(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(conditionEntryEClass, this.getComment(), "getComments", 1, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(conditionEntryEClass, this.getConditionEntry(), "addComment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getComment(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(conditionEntryEClass, this.getCauseOfDeathObservation(), "getCauseOfDeath", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(conditionEntryEClass, this.getConditionEntry(), "setCauseOfDeath", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCauseOfDeathObservation(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(ageObservationEClass, AgeObservation.class, "AgeObservation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(ageObservationEClass, theCDAPackage.getObservation(), "toCDAType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(ageObservationEClass, theDatatypesPackage.getANY(), "getValue", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(ageObservationEClass, this.getAgeObservation(), "setValue", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getANY(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(severityEClass, Severity.class, "Severity", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(severityEClass, theCDAPackage.getObservation(), "toCDAType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(severityEClass, theDatatypesPackage.getED(), "getText", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(severityEClass, this.getSeverity(), "setText", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getED(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(severityEClass, theDatatypesPackage.getCD(), "getValue", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(severityEClass, this.getSeverity(), "setValue", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCD(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(problemStatusObservationEClass, ProblemStatusObservation.class, "ProblemStatusObservation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(problemStatusObservationEClass, this.getProblemStatusObservation(), "setValue", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCE(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(healthStatusObservationEClass, HealthStatusObservation.class, "HealthStatusObservation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(healthStatusObservationEClass, this.getHealthStatusObservation(), "setValue", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCE(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(commentEClass, theCDAPackage.getAct(), "toCDAType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(commentEClass, theDatatypesPackage.getED(), "getText", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(commentEClass, this.getComment(), "setText", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getED(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(commentEClass, theCDAPackage.getAuthor(), "getAuthor", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(commentEClass, this.getComment(), "setAuthor", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theCDAPackage.getAuthor(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(causeOfDeathObservationEClass, CauseOfDeathObservation.class, "CauseOfDeathObservation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(causeOfDeathObservationEClass, theDatatypesPackage.getIVL_TS(), "getTimeOfDeath", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(causeOfDeathObservationEClass, this.getCauseOfDeathObservation(), "setTimeOfDeath", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getIVL_TS(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(causeOfDeathObservationEClass, this.getAgeObservation(), "getAgeAtDeath", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(causeOfDeathObservationEClass, this.getCauseOfDeathObservation(), "setAgeAtDeath", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getAgeObservation(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(familyHistoryObservationEClass, FamilyHistoryObservation.class, "FamilyHistoryObservation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(familyHistoryObservationEClass, theCDAPackage.getObservation(), "toCDAType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(familyHistoryObservationEClass, theVocabPackage.getActClassObservation(), "getClassCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(familyHistoryObservationEClass, this.getFamilyHistoryObservation(), "setClassCode", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theVocabPackage.getActClassObservation(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(familyHistoryObservationEClass, theVocabPackage.getx_ActMoodDocumentObservation(), "getMoodCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(familyHistoryObservationEClass, this.getFamilyHistoryObservation(), "setMoodCode", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theVocabPackage.getx_ActMoodDocumentObservation(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(familyHistoryObservationEClass, theDatatypesPackage.getII(), "getIds", 1, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(familyHistoryObservationEClass, this.getFamilyHistoryObservation(), "addId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getII(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(familyHistoryObservationEClass, theDatatypesPackage.getCD(), "getCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(familyHistoryObservationEClass, this.getFamilyHistoryObservation(), "setCode", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCD(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(familyHistoryObservationEClass, this.getAgeObservation(), "getAgeObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(familyHistoryObservationEClass, this.getFamilyHistoryObservation(), "setAgeObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getAgeObservation(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(treatingProviderEClass, TreatingProvider.class, "TreatingProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(treatingProviderEClass, theCDAPackage.getAssignedEntity(), "toCDAType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(treatingProviderEClass, theDatatypesPackage.getII(), "getTreatingProviderIDs", 1, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(treatingProviderEClass, this.getTreatingProvider(), "addTreatingProviderID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getII(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(problemListSectionEClass, ProblemListSection.class, "ProblemListSection", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(problemListSectionEClass, theCDAPackage.getSection(), "toCDAType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(problemListSectionEClass, theDatatypesPackage.getST(), "getTitle", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(problemListSectionEClass, this.getProblemListSection(), "setTitle", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getST(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(problemListSectionEClass, theCDAPackage.getStrucDocText(), "getText", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(problemListSectionEClass, this.getProblemListSection(), "setText", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theCDAPackage.getStrucDocText(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(problemListSectionEClass, this.getCondition(), "getConditions", 1, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(problemListSectionEClass, this.getProblemListSection(), "addCondition", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCondition(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(patientSummaryEClass, PatientSummary.class, "PatientSummary", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(patientSummaryEClass, theDatatypesPackage.getCE(), "getCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(patientSummaryEClass, this.getPatientSummary(), "setCode", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCE(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(generalHeaderConstraintsEClass, GeneralHeaderConstraints.class, "GeneralHeaderConstraints", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(generalHeaderConstraintsEClass, theCDAPackage.getClinicalDocument(), "toCDAType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(generalHeaderConstraintsEClass, theDatatypesPackage.getCS(), "getLanguageCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, this.getGeneralHeaderConstraints(), "setLanguageCode", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCS(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(generalHeaderConstraintsEClass, theDatatypesPackage.getII(), "getSetId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, this.getGeneralHeaderConstraints(), "setSetId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getII(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(generalHeaderConstraintsEClass, theDatatypesPackage.getST(), "getTitle", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(generalHeaderConstraintsEClass, this.getGeneralHeaderConstraints(), "setTitle", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getST(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create annotations
		// duplicates
		createDuplicatesAnnotations();
	}

	/**
	 * Initializes the annotations for <b>duplicates</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDuplicatesAnnotations() {
		String source = "duplicates";																																										
		addAnnotation
		  (problemStatusObservationEClass, 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (healthStatusObservationEClass, 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  (causeOfDeathObservationEClass, 
		   source, 
		   new String[] {
		   });																		
		addAnnotation
		  (patientSummaryEClass, 
		   source, 
		   new String[] {
		   });					
	}

} //DomainPackageImpl
