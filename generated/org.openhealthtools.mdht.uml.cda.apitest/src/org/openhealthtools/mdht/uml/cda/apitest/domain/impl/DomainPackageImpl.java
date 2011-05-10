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
import org.openhealthtools.mdht.uml.cda.apitest.domain.DomainFactory;
import org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IAgeObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ICauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IComment;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IEpisodeObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IFamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IGeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IHealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IPatientSummary;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemListSection;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ISeverity;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IStatusObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ITreatingProvider;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;

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
	private EClass iStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iEpisodeObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iProblemEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iAgeObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSeverityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iProblemStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iHealthStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iCommentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iCauseOfDeathObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iFamilyHistoryObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iTreatingProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iProblemListSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPatientSummaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iGeneralHeaderConstraintsEClass = null;

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

		// Create package meta-data objects
		theDomainPackage.createPackageContents();

		// Initialize created meta-data
		theDomainPackage.initializePackageContents();

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
	public EClass getIStatusObservation() {
		return iStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICondition() {
		return iConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEpisodeObservation() {
		return iEpisodeObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIProblemEntry() {
		return iProblemEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIAgeObservation() {
		return iAgeObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISeverity() {
		return iSeverityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIProblemStatusObservation() {
		return iProblemStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIHealthStatusObservation() {
		return iHealthStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIComment() {
		return iCommentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICauseOfDeathObservation() {
		return iCauseOfDeathObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIFamilyHistoryObservation() {
		return iFamilyHistoryObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getITreatingProvider() {
		return iTreatingProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIProblemListSection() {
		return iProblemListSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPatientSummary() {
		return iPatientSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIGeneralHeaderConstraints() {
		return iGeneralHeaderConstraintsEClass;
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
		iStatusObservationEClass = createEClass(ISTATUS_OBSERVATION);

		iConditionEClass = createEClass(ICONDITION);

		iEpisodeObservationEClass = createEClass(IEPISODE_OBSERVATION);

		iProblemEntryEClass = createEClass(IPROBLEM_ENTRY);

		iAgeObservationEClass = createEClass(IAGE_OBSERVATION);

		iSeverityEClass = createEClass(ISEVERITY);

		iProblemStatusObservationEClass = createEClass(IPROBLEM_STATUS_OBSERVATION);

		iHealthStatusObservationEClass = createEClass(IHEALTH_STATUS_OBSERVATION);

		iCommentEClass = createEClass(ICOMMENT);

		iCauseOfDeathObservationEClass = createEClass(ICAUSE_OF_DEATH_OBSERVATION);

		iFamilyHistoryObservationEClass = createEClass(IFAMILY_HISTORY_OBSERVATION);

		iTreatingProviderEClass = createEClass(ITREATING_PROVIDER);

		iProblemListSectionEClass = createEClass(IPROBLEM_LIST_SECTION);

		iPatientSummaryEClass = createEClass(IPATIENT_SUMMARY);

		iGeneralHeaderConstraintsEClass = createEClass(IGENERAL_HEADER_CONSTRAINTS);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		iProblemStatusObservationEClass.getESuperTypes().add(this.getIStatusObservation());
		iHealthStatusObservationEClass.getESuperTypes().add(this.getIStatusObservation());
		iCauseOfDeathObservationEClass.getESuperTypes().add(this.getIFamilyHistoryObservation());
		iPatientSummaryEClass.getESuperTypes().add(this.getIGeneralHeaderConstraints());

		// Initialize classes and features; add operations and parameters
		initEClass(iStatusObservationEClass, IStatusObservation.class, "IStatusObservation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iStatusObservationEClass, theCDAPackage.getObservation(), "toCDAType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iStatusObservationEClass, theDatatypesPackage.getCE(), "getValue", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iStatusObservationEClass, theDatatypesPackage.getCE(), "withValue", 1, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = addEOperation(iStatusObservationEClass, this.getIStatusObservation(), "withValue", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCE(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iStatusObservationEClass, theDatatypesPackage.getED(), "getText", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iStatusObservationEClass, theDatatypesPackage.getED(), "withText", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iStatusObservationEClass, this.getIStatusObservation(), "withText", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getED(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iConditionEClass, ICondition.class, "ICondition", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iConditionEClass, theCDAPackage.getAct(), "toCDAType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iConditionEClass, theDatatypesPackage.getII(), "getIds", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iConditionEClass, theDatatypesPackage.getII(), "addId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iConditionEClass, this.getICondition(), "addId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getII(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iConditionEClass, theDatatypesPackage.getCD(), "getCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iConditionEClass, theDatatypesPackage.getCD(), "withCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iConditionEClass, this.getICondition(), "withCode", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCD(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iConditionEClass, theDatatypesPackage.getCS(), "getStatusCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iConditionEClass, theDatatypesPackage.getCS(), "withStatusCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iConditionEClass, this.getICondition(), "withStatusCode", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCS(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iConditionEClass, theDatatypesPackage.getIVL_TS(), "getEffectiveTime", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iConditionEClass, theDatatypesPackage.getIVL_TS(), "withEffectiveTime", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iConditionEClass, this.getICondition(), "withEffectiveTime", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getIVL_TS(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iConditionEClass, this.getIEpisodeObservation(), "withEpisodeObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iConditionEClass, this.getICondition(), "withEpisodeObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getIEpisodeObservation(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iConditionEClass, this.getIProblemEntry(), "addProblemEntry", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iConditionEClass, this.getICondition(), "addProblemEntry", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getIProblemEntry(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iConditionEClass, this.getITreatingProvider(), "withTreatingProvider", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iConditionEClass, this.getICondition(), "withTreatingProvider", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getITreatingProvider(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iEpisodeObservationEClass, IEpisodeObservation.class, "IEpisodeObservation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iEpisodeObservationEClass, theCDAPackage.getObservation(), "toCDAType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iEpisodeObservationEClass, theDatatypesPackage.getCD(), "getCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iEpisodeObservationEClass, theDatatypesPackage.getCD(), "withCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iEpisodeObservationEClass, this.getIEpisodeObservation(), "withCode", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCD(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iEpisodeObservationEClass, theDatatypesPackage.getCD(), "getValue", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iEpisodeObservationEClass, theDatatypesPackage.getCD(), "withValue", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iEpisodeObservationEClass, this.getIEpisodeObservation(), "withValue", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCD(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iProblemEntryEClass, IProblemEntry.class, "IProblemEntry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iProblemEntryEClass, theCDAPackage.getObservation(), "toCDAType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iProblemEntryEClass, theDatatypesPackage.getII(), "getIds", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iProblemEntryEClass, theDatatypesPackage.getII(), "addId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iProblemEntryEClass, this.getIProblemEntry(), "addId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getII(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iProblemEntryEClass, theDatatypesPackage.getCD(), "getProblemType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iProblemEntryEClass, theDatatypesPackage.getCD(), "withProblemType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iProblemEntryEClass, this.getIProblemEntry(), "withProblemType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCD(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iProblemEntryEClass, theDatatypesPackage.getED(), "getProblemName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iProblemEntryEClass, theDatatypesPackage.getED(), "withProblemName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iProblemEntryEClass, this.getIProblemEntry(), "withProblemName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getED(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iProblemEntryEClass, theDatatypesPackage.getIVL_TS(), "getProblemDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iProblemEntryEClass, theDatatypesPackage.getIVL_TS(), "withProblemDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iProblemEntryEClass, this.getIProblemEntry(), "withProblemDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getIVL_TS(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iProblemEntryEClass, theDatatypesPackage.getCD(), "getProblemCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iProblemEntryEClass, theDatatypesPackage.getCD(), "withProblemCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iProblemEntryEClass, this.getIProblemEntry(), "withProblemCode", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCD(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iProblemEntryEClass, this.getIAgeObservation(), "withAgeAtOnset", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iProblemEntryEClass, this.getIProblemEntry(), "withAgeAtOnset", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getIAgeObservation(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iProblemEntryEClass, this.getISeverity(), "withSeverity", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iProblemEntryEClass, this.getIProblemEntry(), "withSeverity", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getISeverity(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iProblemEntryEClass, this.getIProblemStatusObservation(), "withProblemStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iProblemEntryEClass, this.getIProblemEntry(), "withProblemStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getIProblemStatusObservation(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iProblemEntryEClass, this.getIHealthStatusObservation(), "withHealthStatusObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iProblemEntryEClass, this.getIProblemEntry(), "withHealthStatusObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getIHealthStatusObservation(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iProblemEntryEClass, this.getIComment(), "addComment", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iProblemEntryEClass, this.getIProblemEntry(), "addComment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getIComment(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iProblemEntryEClass, this.getICauseOfDeathObservation(), "withCauseOfDeath", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iProblemEntryEClass, this.getIProblemEntry(), "withCauseOfDeath", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getICauseOfDeathObservation(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iAgeObservationEClass, IAgeObservation.class, "IAgeObservation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iAgeObservationEClass, theCDAPackage.getObservation(), "toCDAType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iAgeObservationEClass, theDatatypesPackage.getANY(), "getValue", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iAgeObservationEClass, theDatatypesPackage.getANY(), "withValue", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iAgeObservationEClass, this.getIAgeObservation(), "withValue", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getANY(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iSeverityEClass, ISeverity.class, "ISeverity", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iSeverityEClass, theCDAPackage.getObservation(), "toCDAType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iSeverityEClass, theDatatypesPackage.getED(), "getText", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iSeverityEClass, theDatatypesPackage.getED(), "withText", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iSeverityEClass, this.getISeverity(), "withText", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getED(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iSeverityEClass, theDatatypesPackage.getCD(), "getValue", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iSeverityEClass, theDatatypesPackage.getCD(), "withValue", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iSeverityEClass, this.getISeverity(), "withValue", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCD(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iProblemStatusObservationEClass, IProblemStatusObservation.class, "IProblemStatusObservation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iProblemStatusObservationEClass, this.getIProblemStatusObservation(), "withValue", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCE(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iHealthStatusObservationEClass, IHealthStatusObservation.class, "IHealthStatusObservation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iHealthStatusObservationEClass, this.getIHealthStatusObservation(), "withValue", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCE(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iCommentEClass, IComment.class, "IComment", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iCommentEClass, theCDAPackage.getAct(), "toCDAType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iCommentEClass, theDatatypesPackage.getED(), "getText", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iCommentEClass, theDatatypesPackage.getED(), "withText", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iCommentEClass, this.getIComment(), "withText", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getED(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iCommentEClass, theCDAPackage.getAuthor(), "withAuthor", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iCommentEClass, this.getIComment(), "withAuthor", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theCDAPackage.getAuthor(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iCauseOfDeathObservationEClass, ICauseOfDeathObservation.class, "ICauseOfDeathObservation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iCauseOfDeathObservationEClass, theDatatypesPackage.getIVL_TS(), "getTimeOfDeath", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iCauseOfDeathObservationEClass, theDatatypesPackage.getIVL_TS(), "withTimeOfDeath", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iCauseOfDeathObservationEClass, this.getICauseOfDeathObservation(), "withTimeOfDeath", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getIVL_TS(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iCauseOfDeathObservationEClass, this.getIAgeObservation(), "withAgeAtDeath", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iCauseOfDeathObservationEClass, this.getICauseOfDeathObservation(), "withAgeAtDeath", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getIAgeObservation(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iFamilyHistoryObservationEClass, IFamilyHistoryObservation.class, "IFamilyHistoryObservation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iFamilyHistoryObservationEClass, theCDAPackage.getObservation(), "toCDAType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iFamilyHistoryObservationEClass, theDatatypesPackage.getII(), "getIds", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iFamilyHistoryObservationEClass, theDatatypesPackage.getII(), "addId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iFamilyHistoryObservationEClass, this.getIFamilyHistoryObservation(), "addId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getII(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iFamilyHistoryObservationEClass, theDatatypesPackage.getCD(), "getCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iFamilyHistoryObservationEClass, theDatatypesPackage.getCD(), "withCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iFamilyHistoryObservationEClass, this.getIFamilyHistoryObservation(), "withCode", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCD(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iFamilyHistoryObservationEClass, this.getIAgeObservation(), "withAgeObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iFamilyHistoryObservationEClass, this.getIFamilyHistoryObservation(), "withAgeObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getIAgeObservation(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iTreatingProviderEClass, ITreatingProvider.class, "ITreatingProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iTreatingProviderEClass, theCDAPackage.getAssignedEntity(), "toCDAType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iTreatingProviderEClass, theDatatypesPackage.getII(), "getTreatingProviderIDs", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iTreatingProviderEClass, theDatatypesPackage.getII(), "addTreatingProviderID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iTreatingProviderEClass, this.getITreatingProvider(), "addTreatingProviderID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getII(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iProblemListSectionEClass, IProblemListSection.class, "IProblemListSection", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iProblemListSectionEClass, theCDAPackage.getSection(), "toCDAType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iProblemListSectionEClass, theDatatypesPackage.getST(), "getTitle", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iProblemListSectionEClass, theDatatypesPackage.getST(), "withTitle", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iProblemListSectionEClass, this.getIProblemListSection(), "withTitle", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getST(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iProblemListSectionEClass, theCDAPackage.getStrucDocText(), "getText", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iProblemListSectionEClass, theCDAPackage.getStrucDocText(), "withText", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iProblemListSectionEClass, this.getIProblemListSection(), "withText", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theCDAPackage.getStrucDocText(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iProblemListSectionEClass, this.getICondition(), "addCondition", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iProblemListSectionEClass, this.getIProblemListSection(), "addCondition", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getICondition(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iPatientSummaryEClass, IPatientSummary.class, "IPatientSummary", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iPatientSummaryEClass, theDatatypesPackage.getCE(), "getCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iPatientSummaryEClass, theDatatypesPackage.getCE(), "withCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iPatientSummaryEClass, this.getIPatientSummary(), "withCode", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCE(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iPatientSummaryEClass, this.getIProblemListSection(), "withProblemListSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iPatientSummaryEClass, this.getIPatientSummary(), "withProblemListSection", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getIProblemListSection(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iGeneralHeaderConstraintsEClass, IGeneralHeaderConstraints.class, "IGeneralHeaderConstraints", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iGeneralHeaderConstraintsEClass, theCDAPackage.getClinicalDocument(), "toCDAType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iGeneralHeaderConstraintsEClass, theDatatypesPackage.getCS(), "getLanguageCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iGeneralHeaderConstraintsEClass, theDatatypesPackage.getCS(), "withLanguageCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iGeneralHeaderConstraintsEClass, this.getIGeneralHeaderConstraints(), "withLanguageCode", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCS(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iGeneralHeaderConstraintsEClass, theDatatypesPackage.getII(), "getSetId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iGeneralHeaderConstraintsEClass, theDatatypesPackage.getII(), "withSetId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iGeneralHeaderConstraintsEClass, this.getIGeneralHeaderConstraints(), "withSetId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getII(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iGeneralHeaderConstraintsEClass, theDatatypesPackage.getST(), "getTitle", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(iGeneralHeaderConstraintsEClass, theDatatypesPackage.getST(), "withTitle", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iGeneralHeaderConstraintsEClass, this.getIGeneralHeaderConstraints(), "withTitle", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getST(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

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
		  (iProblemStatusObservationEClass, 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (iHealthStatusObservationEClass, 
		   source, 
		   new String[] {
		   });											
		addAnnotation
		  (iCauseOfDeathObservationEClass, 
		   source, 
		   new String[] {
		   });																																				
		addAnnotation
		  (iPatientSummaryEClass, 
		   source, 
		   new String[] {
		   });																			
	}

} //DomainPackageImpl
