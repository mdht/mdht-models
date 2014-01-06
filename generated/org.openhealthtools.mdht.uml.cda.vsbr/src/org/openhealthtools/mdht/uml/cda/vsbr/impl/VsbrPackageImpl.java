/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.CDAPackage;

import org.openhealthtools.mdht.uml.cda.util.AnnotationBasedInitializer;

import org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionoftheNewborn;
import org.openhealthtools.mdht.uml.cda.vsbr.AssessmentObservation;
import org.openhealthtools.mdht.uml.cda.vsbr.AntenatalTestingandSurveillanceSection;
import org.openhealthtools.mdht.uml.cda.vsbr.AssessmentsObservation;
import org.openhealthtools.mdht.uml.cda.vsbr.AssessmentsSection;
import org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance;
import org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder;
import org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly;
import org.openhealthtools.mdht.uml.cda.vsbr.DateofLastLiveBirth;
import org.openhealthtools.mdht.uml.cda.vsbr.EstimateofGestation;
import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathOccurrance;
import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection;
import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliveryTime;
import org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionFetalDeathSection;
import org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionLiveBirthSection;
import org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionSection;
import org.openhealthtools.mdht.uml.cda.vsbr.InfantBreastfed;
import org.openhealthtools.mdht.uml.cda.vsbr.InfantLiving;
import org.openhealthtools.mdht.uml.cda.vsbr.InfantTransfer;
import org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentFetalDeath;
import org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentLiveBirth;
import org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresent;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection;
import org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate;
import org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity;
import org.openhealthtools.mdht.uml.cda.vsbr.MaternalTransfer;
import org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsObservation;
import org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection;
import org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsObservation;
import org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsNowLiving;
import org.openhealthtools.mdht.uml.cda.vsbr.NumberofInfantsBornAlive;
import org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsNowDead;
import org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsnowDead;
import org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedure;
import org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor;
import org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcome;
import org.openhealthtools.mdht.uml.cda.vsbr.PlannedHomeBirth;
import org.openhealthtools.mdht.uml.cda.vsbr.Plurality;
import org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor;
import org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare;
import org.openhealthtools.mdht.uml.cda.vsbr.PrenatalTestingandSurveillanceSection;
import org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection;
import org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords;
import org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords;
import org.openhealthtools.mdht.uml.cda.vsbr.VitalSignsObservation;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VsbrPackageImpl extends EPackageImpl implements VsbrPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass prenatalTestingandSurveillanceSectionEClass = null;

  /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass prenatalCareEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass priorPregnancyHistorySectionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass dateofLastLiveBirthEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass lastMenstrualPeriodDateEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass numberofBirthsNowLivingEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass numberofLiveBirthsNowDeadEClass = null;

  /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass otherPregnancyOutcomeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass estimateofGestationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass newbornDeliverySectionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass birthOrderEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass numberofInfantsBornAliveEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass congenitalAnomalyEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass newbornsVitalSignsSectionEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass newbornsVitalSignsObservationEClass = null;

  /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass abnormalConditionoftheNewbornEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass infantLivingEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass infantBreastfedEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass infantTransferEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pluralityEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass laborandDeliverySectionEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass laborandDeliveryProcessEClass = null;

  /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass characteristicofLaborandDeliveryEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass plannedHomeBirthEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass maternalTransferEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass maternalMorbidityEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pregnancyRiskFactorEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assessmentsSectionEClass = null;

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assessmentObservationEClass = null;

  /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mothersVitalSignsSectionEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mothersVitalSignsObservationEClass = null;

  /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass laborandDeliveryProcedureSectionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass obstetricProcedureEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass methodofDeliveryEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass onsetofLaborEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass historyofInfectionLiveBirthSectionEClass = null;

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass infectionPresentFetalDeathEClass = null;

  /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fetalDeliverySectionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass autopsyPerformanceEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fetalDeathOccurranceEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fetalDeliveryTimeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass historyofInfectionFetalDeathSectionEClass = null;

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass infectionPresentLiveBirthEClass = null;

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
     * @see org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private VsbrPackageImpl() {
        super(eNS_URI, VsbrFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link VsbrPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static VsbrPackage init() {
        if (isInited) return (VsbrPackage)EPackage.Registry.INSTANCE.getEPackage(VsbrPackage.eNS_URI);

        // Obtain or create and register package
        VsbrPackageImpl theVsbrPackage = (VsbrPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VsbrPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VsbrPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        CDAPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theVsbrPackage.createPackageContents();

        // Initialize created meta-data
        theVsbrPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theVsbrPackage, 
             new EValidator.Descriptor()
             {
                 public EValidator getEValidator()
                 {
                     return VsbrValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theVsbrPackage.freeze();

  
        // publish my initializers in the registry
        Initializer.Registry.INSTANCE.registerFactory("org.openhealthtools.mdht.uml.cda.vsbr", AnnotationBasedInitializer.FACTORY);
        Initializer.Registry.INSTANCE.initializeEPackage(theVsbrPackage);
                
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(VsbrPackage.eNS_URI, theVsbrPackage);
        return theVsbrPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getReportingBirthInformationfromaclinicalsettingtovitalrecords() {
        return reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPrenatalTestingandSurveillanceSection()
    {
        return prenatalTestingandSurveillanceSectionEClass;
    }

  /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPrenatalCare() {
        return prenatalCareEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPriorPregnancyHistorySection() {
        return priorPregnancyHistorySectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDateofLastLiveBirth() {
        return dateofLastLiveBirthEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getLastMenstrualPeriodDate() {
        return lastMenstrualPeriodDateEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getNumberofBirthsNowLiving() {
        return numberofBirthsNowLivingEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNumberofLiveBirthsNowDead()
    {
        return numberofLiveBirthsNowDeadEClass;
    }

  /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getOtherPregnancyOutcome() {
        return otherPregnancyOutcomeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEstimateofGestation() {
        return estimateofGestationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getNewbornDeliverySection() {
        return newbornDeliverySectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBirthOrder() {
        return birthOrderEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getNumberofInfantsBornAlive() {
        return numberofInfantsBornAliveEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCongenitalAnomaly() {
        return congenitalAnomalyEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getNewbornsVitalSignsSection() {
        return newbornsVitalSignsSectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNewbornsVitalSignsObservation()
    {
        return newbornsVitalSignsObservationEClass;
    }

  /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAbnormalConditionoftheNewborn() {
        return abnormalConditionoftheNewbornEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getInfantLiving() {
        return infantLivingEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getInfantBreastfed() {
        return infantBreastfedEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getInfantTransfer() {
        return infantTransferEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPlurality() {
        return pluralityEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getLaborandDeliverySection() {
        return laborandDeliverySectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLaborandDeliveryProcess()
    {
        return laborandDeliveryProcessEClass;
    }

  /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCharacteristicofLaborandDelivery() {
        return characteristicofLaborandDeliveryEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPlannedHomeBirth() {
        return plannedHomeBirthEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMaternalTransfer() {
        return maternalTransferEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMaternalMorbidity() {
        return maternalMorbidityEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPregnancyRiskFactor() {
        return pregnancyRiskFactorEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAssessmentsSection()
    {
        return assessmentsSectionEClass;
    }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAssessmentObservation()
    {
        return assessmentObservationEClass;
    }

  /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMothersVitalSignsSection() {
        return mothersVitalSignsSectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMothersVitalSignsObservation()
    {
        return mothersVitalSignsObservationEClass;
    }

  /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getLaborandDeliveryProcedureSection() {
        return laborandDeliveryProcedureSectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getObstetricProcedure() {
        return obstetricProcedureEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMethodofDelivery() {
        return methodofDeliveryEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getOnsetofLabor() {
        return onsetofLaborEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHistoryofInfectionLiveBirthSection()
    {
        return historyofInfectionLiveBirthSectionEClass;
    }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInfectionPresentFetalDeath()
    {
        return infectionPresentFetalDeathEClass;
    }

  /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFetalDeliverySection() {
        return fetalDeliverySectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAutopsyPerformance() {
        return autopsyPerformanceEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFetalDeathOccurrance() {
        return fetalDeathOccurranceEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFetalDeliveryTime() {
        return fetalDeliveryTimeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getReportingFetalDeathInformationfromaclinicalsettingtovitalrecords() {
        return reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHistoryofInfectionFetalDeathSection()
    {
        return historyofInfectionFetalDeathSectionEClass;
    }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInfectionPresentLiveBirth()
    {
        return infectionPresentLiveBirthEClass;
    }

  /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public VsbrFactory getVsbrFactory() {
        return (VsbrFactory)getEFactoryInstance();
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
        reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass = createEClass(REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);

        prenatalTestingandSurveillanceSectionEClass = createEClass(PRENATAL_TESTINGAND_SURVEILLANCE_SECTION);

        prenatalCareEClass = createEClass(PRENATAL_CARE);

        priorPregnancyHistorySectionEClass = createEClass(PRIOR_PREGNANCY_HISTORY_SECTION);

        dateofLastLiveBirthEClass = createEClass(DATEOF_LAST_LIVE_BIRTH);

        lastMenstrualPeriodDateEClass = createEClass(LAST_MENSTRUAL_PERIOD_DATE);

        numberofBirthsNowLivingEClass = createEClass(NUMBEROF_BIRTHS_NOW_LIVING);

        numberofLiveBirthsNowDeadEClass = createEClass(NUMBEROF_LIVE_BIRTHS_NOW_DEAD);

        otherPregnancyOutcomeEClass = createEClass(OTHER_PREGNANCY_OUTCOME);

        estimateofGestationEClass = createEClass(ESTIMATEOF_GESTATION);

        newbornDeliverySectionEClass = createEClass(NEWBORN_DELIVERY_SECTION);

        birthOrderEClass = createEClass(BIRTH_ORDER);

        numberofInfantsBornAliveEClass = createEClass(NUMBEROF_INFANTS_BORN_ALIVE);

        congenitalAnomalyEClass = createEClass(CONGENITAL_ANOMALY);

        newbornsVitalSignsSectionEClass = createEClass(NEWBORNS_VITAL_SIGNS_SECTION);

        newbornsVitalSignsObservationEClass = createEClass(NEWBORNS_VITAL_SIGNS_OBSERVATION);

        abnormalConditionoftheNewbornEClass = createEClass(ABNORMAL_CONDITIONOFTHE_NEWBORN);

        infantLivingEClass = createEClass(INFANT_LIVING);

        infantBreastfedEClass = createEClass(INFANT_BREASTFED);

        infantTransferEClass = createEClass(INFANT_TRANSFER);

        pluralityEClass = createEClass(PLURALITY);

        assessmentsSectionEClass = createEClass(ASSESSMENTS_SECTION);

        assessmentObservationEClass = createEClass(ASSESSMENT_OBSERVATION);

        laborandDeliverySectionEClass = createEClass(LABORAND_DELIVERY_SECTION);

        laborandDeliveryProcessEClass = createEClass(LABORAND_DELIVERY_PROCESS);

        characteristicofLaborandDeliveryEClass = createEClass(CHARACTERISTICOF_LABORAND_DELIVERY);

        plannedHomeBirthEClass = createEClass(PLANNED_HOME_BIRTH);

        maternalTransferEClass = createEClass(MATERNAL_TRANSFER);

        maternalMorbidityEClass = createEClass(MATERNAL_MORBIDITY);

        pregnancyRiskFactorEClass = createEClass(PREGNANCY_RISK_FACTOR);

        laborandDeliveryProcedureSectionEClass = createEClass(LABORAND_DELIVERY_PROCEDURE_SECTION);

        obstetricProcedureEClass = createEClass(OBSTETRIC_PROCEDURE);

        methodofDeliveryEClass = createEClass(METHODOF_DELIVERY);

        onsetofLaborEClass = createEClass(ONSETOF_LABOR);

        mothersVitalSignsSectionEClass = createEClass(MOTHERS_VITAL_SIGNS_SECTION);

        mothersVitalSignsObservationEClass = createEClass(MOTHERS_VITAL_SIGNS_OBSERVATION);

        historyofInfectionLiveBirthSectionEClass = createEClass(HISTORYOF_INFECTION_LIVE_BIRTH_SECTION);

        infectionPresentLiveBirthEClass = createEClass(INFECTION_PRESENT_LIVE_BIRTH);

        fetalDeliverySectionEClass = createEClass(FETAL_DELIVERY_SECTION);

        autopsyPerformanceEClass = createEClass(AUTOPSY_PERFORMANCE);

        fetalDeathOccurranceEClass = createEClass(FETAL_DEATH_OCCURRANCE);

        fetalDeliveryTimeEClass = createEClass(FETAL_DELIVERY_TIME);

        reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass = createEClass(REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);

        historyofInfectionFetalDeathSectionEClass = createEClass(HISTORYOF_INFECTION_FETAL_DEATH_SECTION);

        infectionPresentFetalDeathEClass = createEClass(INFECTION_PRESENT_FETAL_DEATH);
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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass.getESuperTypes().add(theCDAPackage.getClinicalDocument());
        prenatalTestingandSurveillanceSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
        prenatalCareEClass.getESuperTypes().add(theCDAPackage.getAct());
        priorPregnancyHistorySectionEClass.getESuperTypes().add(theCDAPackage.getSection());
        dateofLastLiveBirthEClass.getESuperTypes().add(theCDAPackage.getObservation());
        lastMenstrualPeriodDateEClass.getESuperTypes().add(theCDAPackage.getObservation());
        numberofBirthsNowLivingEClass.getESuperTypes().add(theCDAPackage.getObservation());
        numberofLiveBirthsNowDeadEClass.getESuperTypes().add(theCDAPackage.getObservation());
        otherPregnancyOutcomeEClass.getESuperTypes().add(theCDAPackage.getObservation());
        estimateofGestationEClass.getESuperTypes().add(theCDAPackage.getObservation());
        newbornDeliverySectionEClass.getESuperTypes().add(theCDAPackage.getSection());
        birthOrderEClass.getESuperTypes().add(theCDAPackage.getObservation());
        numberofInfantsBornAliveEClass.getESuperTypes().add(theCDAPackage.getObservation());
        congenitalAnomalyEClass.getESuperTypes().add(theCDAPackage.getObservation());
        newbornsVitalSignsSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
        newbornsVitalSignsObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
        abnormalConditionoftheNewbornEClass.getESuperTypes().add(theCDAPackage.getObservation());
        infantLivingEClass.getESuperTypes().add(theCDAPackage.getObservation());
        infantBreastfedEClass.getESuperTypes().add(theCDAPackage.getObservation());
        infantTransferEClass.getESuperTypes().add(theCDAPackage.getObservation());
        pluralityEClass.getESuperTypes().add(theCDAPackage.getObservation());
        assessmentsSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
        assessmentObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
        laborandDeliverySectionEClass.getESuperTypes().add(theCDAPackage.getSection());
        laborandDeliveryProcessEClass.getESuperTypes().add(theCDAPackage.getAct());
        characteristicofLaborandDeliveryEClass.getESuperTypes().add(theCDAPackage.getObservation());
        plannedHomeBirthEClass.getESuperTypes().add(theCDAPackage.getObservation());
        maternalTransferEClass.getESuperTypes().add(theCDAPackage.getObservation());
        maternalMorbidityEClass.getESuperTypes().add(theCDAPackage.getObservation());
        pregnancyRiskFactorEClass.getESuperTypes().add(theCDAPackage.getObservation());
        laborandDeliveryProcedureSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
        obstetricProcedureEClass.getESuperTypes().add(theCDAPackage.getProcedure());
        methodofDeliveryEClass.getESuperTypes().add(theCDAPackage.getProcedure());
        onsetofLaborEClass.getESuperTypes().add(theCDAPackage.getObservation());
        mothersVitalSignsSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
        mothersVitalSignsObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
        historyofInfectionLiveBirthSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
        infectionPresentLiveBirthEClass.getESuperTypes().add(theCDAPackage.getObservation());
        fetalDeliverySectionEClass.getESuperTypes().add(theCDAPackage.getSection());
        autopsyPerformanceEClass.getESuperTypes().add(theCDAPackage.getObservation());
        fetalDeathOccurranceEClass.getESuperTypes().add(theCDAPackage.getObservation());
        fetalDeliveryTimeEClass.getESuperTypes().add(theCDAPackage.getObservation());
        reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass.getESuperTypes().add(theCDAPackage.getClinicalDocument());
        historyofInfectionFetalDeathSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
        infectionPresentFetalDeathEClass.getESuperTypes().add(theCDAPackage.getObservation());

        // Initialize classes and features; add operations and parameters
        initEClass(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ReportingBirthInformationfromaclinicalsettingtovitalrecords.class, "ReportingBirthInformationfromaclinicalsettingtovitalrecords", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        EOperation op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = createEGenericType(ecorePackage.getEMap());
        EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTypeId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLanguageCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodian", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsPrenatalTestingAndSurveillance", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsPregnancyHistory", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsNewbornDeliverySection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLaborAndDeliverySection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsHistoryOfInfectionLiveBirthSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, this.getPrenatalTestingandSurveillanceSection(), "getPrenatalTestingAndSurveillance", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, this.getPriorPregnancyHistorySection(), "getPregnancyHistory", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, this.getNewbornDeliverySection(), "getNewbornDeliverySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, this.getLaborandDeliverySection(), "getLaborAndDeliverySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, this.getHistoryofInfectionLiveBirthSection(), "getHistoryOfInfectionLiveBirthSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(prenatalTestingandSurveillanceSectionEClass, PrenatalTestingandSurveillanceSection.class, "PrenatalTestingandSurveillanceSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(prenatalTestingandSurveillanceSectionEClass, ecorePackage.getEBoolean(), "validatePrenatalTestingandSurveillanceSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(prenatalTestingandSurveillanceSectionEClass, ecorePackage.getEBoolean(), "validatePrenatalTestingandSurveillanceSectionClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(prenatalTestingandSurveillanceSectionEClass, ecorePackage.getEBoolean(), "validatePrenatalTestingandSurveillanceSectionMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(prenatalTestingandSurveillanceSectionEClass, ecorePackage.getEBoolean(), "validatePrenatalTestingandSurveillanceSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(prenatalTestingandSurveillanceSectionEClass, ecorePackage.getEBoolean(), "validatePrenatalTestingandSurveillanceSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(prenatalTestingandSurveillanceSectionEClass, ecorePackage.getEBoolean(), "validatePrenatalTestingandSurveillanceSectionPrenatalCare", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(prenatalTestingandSurveillanceSectionEClass, this.getPrenatalCare(), "getPrenatalCare", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(prenatalCareEClass, PrenatalCare.class, "PrenatalCare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(prenatalCareEClass, ecorePackage.getEBoolean(), "validatePrenatalCareTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(prenatalCareEClass, ecorePackage.getEBoolean(), "validatePrenatalCareClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(prenatalCareEClass, ecorePackage.getEBoolean(), "validatePrenatalCareMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(prenatalCareEClass, ecorePackage.getEBoolean(), "validatePrenatalCareNegationInd", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(prenatalCareEClass, ecorePackage.getEBoolean(), "validatePrenatalCareCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(prenatalCareEClass, ecorePackage.getEBoolean(), "validatePrenatalCareCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(prenatalCareEClass, ecorePackage.getEBoolean(), "validatePrenatalCareEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(prenatalCareEClass, ecorePackage.getEBoolean(), "validatePrenatalCareEntryRelationship", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(priorPregnancyHistorySectionEClass, PriorPregnancyHistorySection.class, "PriorPregnancyHistorySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(priorPregnancyHistorySectionEClass, ecorePackage.getEBoolean(), "validatePriorPregnancyHistorySectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(priorPregnancyHistorySectionEClass, ecorePackage.getEBoolean(), "validatePriorPregnancyHistorySectionClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(priorPregnancyHistorySectionEClass, ecorePackage.getEBoolean(), "validatePriorPregnancyHistorySectionMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(priorPregnancyHistorySectionEClass, ecorePackage.getEBoolean(), "validatePriorPregnancyHistorySectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(priorPregnancyHistorySectionEClass, ecorePackage.getEBoolean(), "validatePriorPregnancyHistorySectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(priorPregnancyHistorySectionEClass, ecorePackage.getEBoolean(), "validatePriorPregnancyHistorySectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(priorPregnancyHistorySectionEClass, ecorePackage.getEBoolean(), "validatePriorPregnancyHistorySectionDateofLastLiveBirth", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(priorPregnancyHistorySectionEClass, ecorePackage.getEBoolean(), "validatePriorPregnancyHistorySectionLastMenstrualPeriodDate", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(priorPregnancyHistorySectionEClass, ecorePackage.getEBoolean(), "validatePriorPregnancyHistorySectionNumberofBirthsStillLiving", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(priorPregnancyHistorySectionEClass, ecorePackage.getEBoolean(), "validatePriorPregnancyHistorySectionNumberofLiveBirthsnowDead", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(priorPregnancyHistorySectionEClass, ecorePackage.getEBoolean(), "validatePriorPregnancyHistorySectionOtherPregnancyOutcomes", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(priorPregnancyHistorySectionEClass, ecorePackage.getEBoolean(), "validatePriorPregnancyHistorySectionEstimateofGestation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(priorPregnancyHistorySectionEClass, this.getDateofLastLiveBirth(), "getDateofLastLiveBirth", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(priorPregnancyHistorySectionEClass, this.getLastMenstrualPeriodDate(), "getLastMenstrualPeriodDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(priorPregnancyHistorySectionEClass, this.getNumberofBirthsNowLiving(), "getNumberofBirthsStillLiving", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(priorPregnancyHistorySectionEClass, this.getNumberofLiveBirthsNowDead(), "getNumberofLiveBirthsnowDead", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(priorPregnancyHistorySectionEClass, this.getOtherPregnancyOutcome(), "getOtherPregnancyOutcomes", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(priorPregnancyHistorySectionEClass, this.getEstimateofGestation(), "getEstimateofGestation", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(dateofLastLiveBirthEClass, DateofLastLiveBirth.class, "DateofLastLiveBirth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(dateofLastLiveBirthEClass, ecorePackage.getEBoolean(), "validateDateofLastLiveBirthTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(dateofLastLiveBirthEClass, ecorePackage.getEBoolean(), "validateDateofLastLiveBirthMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(dateofLastLiveBirthEClass, ecorePackage.getEBoolean(), "validateDateofLastLiveBirthCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(dateofLastLiveBirthEClass, ecorePackage.getEBoolean(), "validateDateofLastLiveBirthCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(dateofLastLiveBirthEClass, ecorePackage.getEBoolean(), "validateDateofLastLiveBirthValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(lastMenstrualPeriodDateEClass, LastMenstrualPeriodDate.class, "LastMenstrualPeriodDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(lastMenstrualPeriodDateEClass, ecorePackage.getEBoolean(), "validateLastMenstrualPeriodDateTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(lastMenstrualPeriodDateEClass, ecorePackage.getEBoolean(), "validateLastMenstrualPeriodDateClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(lastMenstrualPeriodDateEClass, ecorePackage.getEBoolean(), "validateLastMenstrualPeriodDateMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(lastMenstrualPeriodDateEClass, ecorePackage.getEBoolean(), "validateLastMenstrualPeriodDateCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(lastMenstrualPeriodDateEClass, ecorePackage.getEBoolean(), "validateLastMenstrualPeriodDateCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(lastMenstrualPeriodDateEClass, ecorePackage.getEBoolean(), "validateLastMenstrualPeriodDateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(numberofBirthsNowLivingEClass, NumberofBirthsNowLiving.class, "NumberofBirthsNowLiving", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(numberofBirthsNowLivingEClass, ecorePackage.getEBoolean(), "validateNumberofBirthsNowLivingTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numberofBirthsNowLivingEClass, ecorePackage.getEBoolean(), "validateNumberofBirthsNowLivingClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numberofBirthsNowLivingEClass, ecorePackage.getEBoolean(), "validateNumberofBirthsNowLivingMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numberofBirthsNowLivingEClass, ecorePackage.getEBoolean(), "validateNumberofBirthsNowLivingCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numberofBirthsNowLivingEClass, ecorePackage.getEBoolean(), "validateNumberofBirthsNowLivingCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numberofBirthsNowLivingEClass, ecorePackage.getEBoolean(), "validateNumberofBirthsNowLivingValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(numberofLiveBirthsNowDeadEClass, NumberofLiveBirthsNowDead.class, "NumberofLiveBirthsNowDead", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(numberofLiveBirthsNowDeadEClass, ecorePackage.getEBoolean(), "validateNumberofLiveBirthsNowDeadTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numberofLiveBirthsNowDeadEClass, ecorePackage.getEBoolean(), "validateNumberofLiveBirthsNowDeadClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numberofLiveBirthsNowDeadEClass, ecorePackage.getEBoolean(), "validateNumberofLiveBirthsNowDeadMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numberofLiveBirthsNowDeadEClass, ecorePackage.getEBoolean(), "validateNumberofLiveBirthsNowDeadCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numberofLiveBirthsNowDeadEClass, ecorePackage.getEBoolean(), "validateNumberofLiveBirthsNowDeadCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numberofLiveBirthsNowDeadEClass, ecorePackage.getEBoolean(), "validateNumberofLiveBirthsNowDeadValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(otherPregnancyOutcomeEClass, OtherPregnancyOutcome.class, "OtherPregnancyOutcome", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(otherPregnancyOutcomeEClass, ecorePackage.getEBoolean(), "validateOtherPregnancyOutcomeTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(otherPregnancyOutcomeEClass, ecorePackage.getEBoolean(), "validateOtherPregnancyOutcomeClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(otherPregnancyOutcomeEClass, ecorePackage.getEBoolean(), "validateOtherPregnancyOutcomeMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(otherPregnancyOutcomeEClass, ecorePackage.getEBoolean(), "validateOtherPregnancyOutcomeCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(otherPregnancyOutcomeEClass, ecorePackage.getEBoolean(), "validateOtherPregnancyOutcomeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(otherPregnancyOutcomeEClass, ecorePackage.getEBoolean(), "validateOtherPregnancyOutcomeEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(otherPregnancyOutcomeEClass, ecorePackage.getEBoolean(), "validateOtherPregnancyOutcomeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(estimateofGestationEClass, EstimateofGestation.class, "EstimateofGestation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(estimateofGestationEClass, ecorePackage.getEBoolean(), "validateEstimateofGestationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(estimateofGestationEClass, ecorePackage.getEBoolean(), "validateEstimateofGestationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(estimateofGestationEClass, ecorePackage.getEBoolean(), "validateEstimateofGestationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(estimateofGestationEClass, ecorePackage.getEBoolean(), "validateEstimateofGestationCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(estimateofGestationEClass, ecorePackage.getEBoolean(), "validateEstimateofGestationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(estimateofGestationEClass, ecorePackage.getEBoolean(), "validateEstimateofGestationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(newbornDeliverySectionEClass, NewbornDeliverySection.class, "NewbornDeliverySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionSubject", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionBirthOrder", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionNumberOfInfantsBornAlive", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionCongenitalAnomalies", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionNewbornsVitalSignsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionAbnormalConditionsOfTheNewborn", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionInfantLiving", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionInfantBreastfed", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionInfantTransfer", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionPlurality", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionAssessmentsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornSDTCId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornName", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornBirthTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornSubject", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionNewbornSubjectTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornDeliverySectionEClass, ecorePackage.getEBoolean(), "validateNewbornDeliverySectionNewbornSubjectRelatedSubject", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(newbornDeliverySectionEClass, this.getBirthOrder(), "getBirthOrder", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(newbornDeliverySectionEClass, this.getNumberofInfantsBornAlive(), "getNumberOfInfantsBornAlive", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(newbornDeliverySectionEClass, this.getCongenitalAnomaly(), "getCongenitalAnomaliess", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(newbornDeliverySectionEClass, this.getNewbornsVitalSignsSection(), "getNewbornsVitalSignsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(newbornDeliverySectionEClass, this.getAbnormalConditionoftheNewborn(), "getAbnormalConditionsOfTheNewborns", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(newbornDeliverySectionEClass, this.getInfantLiving(), "getInfantLiving", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(newbornDeliverySectionEClass, this.getInfantBreastfed(), "getInfantBreastfed", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(newbornDeliverySectionEClass, this.getInfantTransfer(), "getInfantTransfer", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(newbornDeliverySectionEClass, this.getPlurality(), "getPlurality", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(newbornDeliverySectionEClass, this.getAssessmentsSection(), "getAssessmentsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(birthOrderEClass, BirthOrder.class, "BirthOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(birthOrderEClass, ecorePackage.getEBoolean(), "validateBirthOrderTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(birthOrderEClass, ecorePackage.getEBoolean(), "validateBirthOrderClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(birthOrderEClass, ecorePackage.getEBoolean(), "validateBirthOrderMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(birthOrderEClass, ecorePackage.getEBoolean(), "validateBirthOrderCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(birthOrderEClass, ecorePackage.getEBoolean(), "validateBirthOrderCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(birthOrderEClass, ecorePackage.getEBoolean(), "validateBirthOrderValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(numberofInfantsBornAliveEClass, NumberofInfantsBornAlive.class, "NumberofInfantsBornAlive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(numberofInfantsBornAliveEClass, ecorePackage.getEBoolean(), "validateNumberofInfantsBornAliveTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numberofInfantsBornAliveEClass, ecorePackage.getEBoolean(), "validateNumberofInfantsBornAliveClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numberofInfantsBornAliveEClass, ecorePackage.getEBoolean(), "validateNumberofInfantsBornAliveMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numberofInfantsBornAliveEClass, ecorePackage.getEBoolean(), "validateNumberofInfantsBornAliveCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numberofInfantsBornAliveEClass, ecorePackage.getEBoolean(), "validateNumberofInfantsBornAliveCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numberofInfantsBornAliveEClass, ecorePackage.getEBoolean(), "validateNumberofInfantsBornAliveValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(congenitalAnomalyEClass, CongenitalAnomaly.class, "CongenitalAnomaly", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(congenitalAnomalyEClass, ecorePackage.getEBoolean(), "validateCongenitalAnomalyTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(congenitalAnomalyEClass, ecorePackage.getEBoolean(), "validateCongenitalAnomalyClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(congenitalAnomalyEClass, ecorePackage.getEBoolean(), "validateCongenitalAnomalyMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(congenitalAnomalyEClass, ecorePackage.getEBoolean(), "validateCongenitalAnomalyCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(congenitalAnomalyEClass, ecorePackage.getEBoolean(), "validateCongenitalAnomalyCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(congenitalAnomalyEClass, ecorePackage.getEBoolean(), "validateCongenitalAnomalyCodeVS", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(congenitalAnomalyEClass, ecorePackage.getEBoolean(), "validateCongenitalAnomalyValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(congenitalAnomalyEClass, ecorePackage.getEBoolean(), "validateCongenitalAnomalyValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(congenitalAnomalyEClass, ecorePackage.getEBoolean(), "validateCongenitalAnomalyDownConfirmationAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(congenitalAnomalyEClass, ecorePackage.getEBoolean(), "validateCongenitalAnomalyChromosomalDisorderConfirmationAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(newbornsVitalSignsSectionEClass, NewbornsVitalSignsSection.class, "NewbornsVitalSignsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(newbornsVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateNewbornsVitalSignsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornsVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateNewbornsVitalSignsSectionClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornsVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateNewbornsVitalSignsSectionMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornsVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateNewbornsVitalSignsSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornsVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateNewbornsVitalSignsSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornsVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateNewbornsVitalSignsSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornsVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateNewbornsVitalSignsSectionNewbornsVitalSignsObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(newbornsVitalSignsSectionEClass, this.getNewbornsVitalSignsObservation(), "getNewbornsVitalSignsObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(newbornsVitalSignsObservationEClass, NewbornsVitalSignsObservation.class, "NewbornsVitalSignsObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(newbornsVitalSignsObservationEClass, ecorePackage.getEBoolean(), "validateNewbornsVitalSignsObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornsVitalSignsObservationEClass, ecorePackage.getEBoolean(), "validateNewbornsVitalSignsObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornsVitalSignsObservationEClass, ecorePackage.getEBoolean(), "validateNewbornsVitalSignsObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornsVitalSignsObservationEClass, ecorePackage.getEBoolean(), "validateNewbornsVitalSignsObservationCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornsVitalSignsObservationEClass, ecorePackage.getEBoolean(), "validateNewbornsVitalSignsObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(newbornsVitalSignsObservationEClass, ecorePackage.getEBoolean(), "validateNewbornsVitalSignsObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(abnormalConditionoftheNewbornEClass, AbnormalConditionoftheNewborn.class, "AbnormalConditionoftheNewborn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(abnormalConditionoftheNewbornEClass, ecorePackage.getEBoolean(), "validateAbnormalConditionoftheNewbornTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(abnormalConditionoftheNewbornEClass, ecorePackage.getEBoolean(), "validateAbnormalConditionoftheNewbornClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(abnormalConditionoftheNewbornEClass, ecorePackage.getEBoolean(), "validateAbnormalConditionoftheNewbornMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(abnormalConditionoftheNewbornEClass, ecorePackage.getEBoolean(), "validateAbnormalConditionoftheNewbornCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(abnormalConditionoftheNewbornEClass, ecorePackage.getEBoolean(), "validateAbnormalConditionoftheNewbornCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(abnormalConditionoftheNewbornEClass, ecorePackage.getEBoolean(), "validateAbnormalConditionoftheNewbornCodeVS", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(abnormalConditionoftheNewbornEClass, ecorePackage.getEBoolean(), "validateAbnormalConditionoftheNewbornValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(abnormalConditionoftheNewbornEClass, ecorePackage.getEBoolean(), "validateAbnormalConditionoftheNewbornValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(infantLivingEClass, InfantLiving.class, "InfantLiving", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(infantLivingEClass, ecorePackage.getEBoolean(), "validateInfantLivingTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infantLivingEClass, ecorePackage.getEBoolean(), "validateInfantLivingClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infantLivingEClass, ecorePackage.getEBoolean(), "validateInfantLivingMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infantLivingEClass, ecorePackage.getEBoolean(), "validateInfantLivingCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infantLivingEClass, ecorePackage.getEBoolean(), "validateInfantLivingCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infantLivingEClass, ecorePackage.getEBoolean(), "validateInfantLivingValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(infantBreastfedEClass, InfantBreastfed.class, "InfantBreastfed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(infantBreastfedEClass, ecorePackage.getEBoolean(), "validateInfantBreastfedTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infantBreastfedEClass, ecorePackage.getEBoolean(), "validateInfantBreastfedClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infantBreastfedEClass, ecorePackage.getEBoolean(), "validateInfantBreastfedMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infantBreastfedEClass, ecorePackage.getEBoolean(), "validateInfantBreastfedCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infantBreastfedEClass, ecorePackage.getEBoolean(), "validateInfantBreastfedCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infantBreastfedEClass, ecorePackage.getEBoolean(), "validateInfantBreastfedValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(infantTransferEClass, InfantTransfer.class, "InfantTransfer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(infantTransferEClass, ecorePackage.getEBoolean(), "validateInfantTransferTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infantTransferEClass, ecorePackage.getEBoolean(), "validateInfantTransferClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infantTransferEClass, ecorePackage.getEBoolean(), "validateInfantTransferMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infantTransferEClass, ecorePackage.getEBoolean(), "validateInfantTransferCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infantTransferEClass, ecorePackage.getEBoolean(), "validateInfantTransferCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infantTransferEClass, ecorePackage.getEBoolean(), "validateInfantTransferValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infantTransferEClass, ecorePackage.getEBoolean(), "validateInfantTransferParticipant", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(pluralityEClass, Plurality.class, "Plurality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(pluralityEClass, ecorePackage.getEBoolean(), "validatePluralityTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pluralityEClass, ecorePackage.getEBoolean(), "validatePluralityClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pluralityEClass, ecorePackage.getEBoolean(), "validatePluralityMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pluralityEClass, ecorePackage.getEBoolean(), "validatePluralityCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pluralityEClass, ecorePackage.getEBoolean(), "validatePluralityCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pluralityEClass, ecorePackage.getEBoolean(), "validatePluralityValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(assessmentsSectionEClass, AssessmentsSection.class, "AssessmentsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(assessmentsSectionEClass, ecorePackage.getEBoolean(), "validateAssessmentsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(assessmentsSectionEClass, ecorePackage.getEBoolean(), "validateAssessmentsSectionClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(assessmentsSectionEClass, ecorePackage.getEBoolean(), "validateAssessmentsSectionMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(assessmentsSectionEClass, ecorePackage.getEBoolean(), "validateAssessmentsSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(assessmentsSectionEClass, ecorePackage.getEBoolean(), "validateAssessmentsSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(assessmentsSectionEClass, ecorePackage.getEBoolean(), "validateAssessmentsSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(assessmentsSectionEClass, ecorePackage.getEBoolean(), "validateAssessmentsSectionAssessmentObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(assessmentsSectionEClass, this.getAssessmentObservation(), "getAssessmentObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(assessmentObservationEClass, AssessmentObservation.class, "AssessmentObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(assessmentObservationEClass, ecorePackage.getEBoolean(), "validateAssessmentObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(assessmentObservationEClass, ecorePackage.getEBoolean(), "validateAssessmentObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(assessmentObservationEClass, ecorePackage.getEBoolean(), "validateAssessmentObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(assessmentObservationEClass, ecorePackage.getEBoolean(), "validateAssessmentObservationCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(assessmentObservationEClass, ecorePackage.getEBoolean(), "validateAssessmentObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(assessmentObservationEClass, ecorePackage.getEBoolean(), "validateAssessmentObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(laborandDeliverySectionEClass, LaborandDeliverySection.class, "LaborandDeliverySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(laborandDeliverySectionEClass, ecorePackage.getEBoolean(), "validateLaborandDeliverySectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliverySectionEClass, ecorePackage.getEBoolean(), "validateLaborandDeliverySectionClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliverySectionEClass, ecorePackage.getEBoolean(), "validateLaborandDeliverySectionMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliverySectionEClass, ecorePackage.getEBoolean(), "validateLaborandDeliverySectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliverySectionEClass, ecorePackage.getEBoolean(), "validateLaborandDeliverySectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliverySectionEClass, ecorePackage.getEBoolean(), "validateLaborandDeliverySectionLaborAndDeliveryProcess", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliverySectionEClass, ecorePackage.getEBoolean(), "validateLaborandDeliverySectionLaborAndDeliveryProceduresSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliverySectionEClass, ecorePackage.getEBoolean(), "validateLaborandDeliverySectionLaborOnsets", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliverySectionEClass, ecorePackage.getEBoolean(), "validateLaborandDeliverySectionMothersVitalSignsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(laborandDeliverySectionEClass, this.getLaborandDeliveryProcess(), "getLaborAndDeliveryProcess", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(laborandDeliverySectionEClass, this.getLaborandDeliveryProcedureSection(), "getLaborAndDeliveryProceduresSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(laborandDeliverySectionEClass, this.getOnsetofLabor(), "getLaborOnsetss", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(laborandDeliverySectionEClass, this.getMothersVitalSignsSection(), "getMothersVitalSignsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(laborandDeliveryProcessEClass, LaborandDeliveryProcess.class, "LaborandDeliveryProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(laborandDeliveryProcessEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryProcessTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliveryProcessEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryProcessClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliveryProcessEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryProcessMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliveryProcessEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryProcessCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliveryProcessEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryProcessCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliveryProcessEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryProcessAttendantParticipation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliveryProcessEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryProcessEntryRelationship", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliveryProcessEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryProcessCharacteristicsOfLaborAndDelivery", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliveryProcessEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryProcessHomeBirthPlan", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliveryProcessEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryProcessMaternalTransfer", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliveryProcessEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryProcessParticipatingLocation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliveryProcessEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryProcessMaternalMorbidities", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliveryProcessEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryProcessRiskFactors", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(laborandDeliveryProcessEClass, this.getCharacteristicofLaborandDelivery(), "getCharacteristicsOfLaborAndDeliveries", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(laborandDeliveryProcessEClass, this.getPlannedHomeBirth(), "getHomeBirthPlan", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(laborandDeliveryProcessEClass, this.getMaternalTransfer(), "getMaternalTransfer", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(laborandDeliveryProcessEClass, this.getMaternalMorbidity(), "getMaternalMorbiditiess", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(laborandDeliveryProcessEClass, this.getPregnancyRiskFactor(), "getRiskFactorss", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(characteristicofLaborandDeliveryEClass, CharacteristicofLaborandDelivery.class, "CharacteristicofLaborandDelivery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(characteristicofLaborandDeliveryEClass, ecorePackage.getEBoolean(), "validateCharacteristicofLaborandDeliveryTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(characteristicofLaborandDeliveryEClass, ecorePackage.getEBoolean(), "validateCharacteristicofLaborandDeliveryClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(characteristicofLaborandDeliveryEClass, ecorePackage.getEBoolean(), "validateCharacteristicofLaborandDeliveryMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(characteristicofLaborandDeliveryEClass, ecorePackage.getEBoolean(), "validateCharacteristicofLaborandDeliveryCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(characteristicofLaborandDeliveryEClass, ecorePackage.getEBoolean(), "validateCharacteristicofLaborandDeliveryCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(characteristicofLaborandDeliveryEClass, ecorePackage.getEBoolean(), "validateCharacteristicofLaborandDeliveryCodeVS", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(characteristicofLaborandDeliveryEClass, ecorePackage.getEBoolean(), "validateCharacteristicofLaborandDeliveryValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(characteristicofLaborandDeliveryEClass, ecorePackage.getEBoolean(), "validateCharacteristicofLaborandDeliveryValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(plannedHomeBirthEClass, PlannedHomeBirth.class, "PlannedHomeBirth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(plannedHomeBirthEClass, ecorePackage.getEBoolean(), "validatePlannedHomeBirthTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(plannedHomeBirthEClass, ecorePackage.getEBoolean(), "validatePlannedHomeBirthClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(plannedHomeBirthEClass, ecorePackage.getEBoolean(), "validatePlannedHomeBirthMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(plannedHomeBirthEClass, ecorePackage.getEBoolean(), "validatePlannedHomeBirthCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(plannedHomeBirthEClass, ecorePackage.getEBoolean(), "validatePlannedHomeBirthCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(plannedHomeBirthEClass, ecorePackage.getEBoolean(), "validatePlannedHomeBirthValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(maternalTransferEClass, MaternalTransfer.class, "MaternalTransfer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(maternalTransferEClass, ecorePackage.getEBoolean(), "validateMaternalTransferTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(maternalTransferEClass, ecorePackage.getEBoolean(), "validateMaternalTransferClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(maternalTransferEClass, ecorePackage.getEBoolean(), "validateMaternalTransferMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(maternalTransferEClass, ecorePackage.getEBoolean(), "validateMaternalTransferCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(maternalTransferEClass, ecorePackage.getEBoolean(), "validateMaternalTransferCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(maternalTransferEClass, ecorePackage.getEBoolean(), "validateMaternalTransferValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(maternalTransferEClass, ecorePackage.getEBoolean(), "validateMaternalTransferParticipant", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(maternalMorbidityEClass, MaternalMorbidity.class, "MaternalMorbidity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(maternalMorbidityEClass, ecorePackage.getEBoolean(), "validateMaternalMorbidityTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(maternalMorbidityEClass, ecorePackage.getEBoolean(), "validateMaternalMorbidityClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(maternalMorbidityEClass, ecorePackage.getEBoolean(), "validateMaternalMorbidityMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(maternalMorbidityEClass, ecorePackage.getEBoolean(), "validateMaternalMorbidityCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(maternalMorbidityEClass, ecorePackage.getEBoolean(), "validateMaternalMorbidityCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(maternalMorbidityEClass, ecorePackage.getEBoolean(), "validateMaternalMorbidityCodeVS", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(maternalMorbidityEClass, ecorePackage.getEBoolean(), "validateMaternalMorbidityValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(maternalMorbidityEClass, ecorePackage.getEBoolean(), "validateMaternalMorbidityValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(pregnancyRiskFactorEClass, PregnancyRiskFactor.class, "PregnancyRiskFactor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(pregnancyRiskFactorEClass, ecorePackage.getEBoolean(), "validatePregnancyRiskFactorTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pregnancyRiskFactorEClass, ecorePackage.getEBoolean(), "validatePregnancyRiskFactorClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pregnancyRiskFactorEClass, ecorePackage.getEBoolean(), "validatePregnancyRiskFactorMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pregnancyRiskFactorEClass, ecorePackage.getEBoolean(), "validatePregnancyRiskFactorCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pregnancyRiskFactorEClass, ecorePackage.getEBoolean(), "validatePregnancyRiskFactorCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pregnancyRiskFactorEClass, ecorePackage.getEBoolean(), "validatePregnancyRiskFactorCodeVS", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pregnancyRiskFactorEClass, ecorePackage.getEBoolean(), "validatePregnancyRiskFactorValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pregnancyRiskFactorEClass, ecorePackage.getEBoolean(), "validatePregnancyRiskFactorValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(pregnancyRiskFactorEClass, ecorePackage.getEBoolean(), "validatePregnancyRiskFactorEntryRelationship", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(laborandDeliveryProcedureSectionEClass, LaborandDeliveryProcedureSection.class, "LaborandDeliveryProcedureSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(laborandDeliveryProcedureSectionEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryProcedureSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliveryProcedureSectionEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryProcedureSectionClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliveryProcedureSectionEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryProcedureSectionMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliveryProcedureSectionEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryProcedureSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliveryProcedureSectionEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryProcedureSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliveryProcedureSectionEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryProcedureSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliveryProcedureSectionEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryProcedureSectionObstetricProcedure", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(laborandDeliveryProcedureSectionEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryProcedureSectionMethodOfDelivery", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(laborandDeliveryProcedureSectionEClass, this.getObstetricProcedure(), "getObstetricProcedures", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(laborandDeliveryProcedureSectionEClass, this.getMethodofDelivery(), "getMethodOfDelivery", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(obstetricProcedureEClass, ObstetricProcedure.class, "ObstetricProcedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(obstetricProcedureEClass, ecorePackage.getEBoolean(), "validateObstetricProcedureTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(obstetricProcedureEClass, ecorePackage.getEBoolean(), "validateObstetricProcedureClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(obstetricProcedureEClass, ecorePackage.getEBoolean(), "validateObstetricProcedureMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(obstetricProcedureEClass, ecorePackage.getEBoolean(), "validateObstetricProcedureNegationInd", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(obstetricProcedureEClass, ecorePackage.getEBoolean(), "validateObstetricProcedureCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(obstetricProcedureEClass, ecorePackage.getEBoolean(), "validateObstetricProcedureCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(methodofDeliveryEClass, MethodofDelivery.class, "MethodofDelivery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(methodofDeliveryEClass, ecorePackage.getEBoolean(), "validateMethodofDeliveryTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(methodofDeliveryEClass, ecorePackage.getEBoolean(), "validateMethodofDeliveryClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(methodofDeliveryEClass, ecorePackage.getEBoolean(), "validateMethodofDeliveryMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(methodofDeliveryEClass, ecorePackage.getEBoolean(), "validateMethodofDeliveryCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(methodofDeliveryEClass, ecorePackage.getEBoolean(), "validateMethodofDeliveryCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(methodofDeliveryEClass, ecorePackage.getEBoolean(), "validateMethodofDeliveryFinalRouteAndMethod", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(methodofDeliveryEClass, ecorePackage.getEBoolean(), "validateMethodofDeliveryFetalPresentation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(methodofDeliveryEClass, ecorePackage.getEBoolean(), "validateMethodofDeliveryHysterotomyHysterectomyAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(onsetofLaborEClass, OnsetofLabor.class, "OnsetofLabor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(onsetofLaborEClass, ecorePackage.getEBoolean(), "validateOnsetofLaborTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(onsetofLaborEClass, ecorePackage.getEBoolean(), "validateOnsetofLaborClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(onsetofLaborEClass, ecorePackage.getEBoolean(), "validateOnsetofLaborMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(onsetofLaborEClass, ecorePackage.getEBoolean(), "validateOnsetofLaborCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(onsetofLaborEClass, ecorePackage.getEBoolean(), "validateOnsetofLaborCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(onsetofLaborEClass, ecorePackage.getEBoolean(), "validateOnsetofLaborCodeVS", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(onsetofLaborEClass, ecorePackage.getEBoolean(), "validateOnsetofLaborValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(onsetofLaborEClass, ecorePackage.getEBoolean(), "validateOnsetofLaborValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(mothersVitalSignsSectionEClass, MothersVitalSignsSection.class, "MothersVitalSignsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(mothersVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateMothersVitalSignsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mothersVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateMothersVitalSignsSectionClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mothersVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateMothersVitalSignsSectionMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mothersVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateMothersVitalSignsSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mothersVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateMothersVitalSignsSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mothersVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateMothersVitalSignsSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mothersVitalSignsSectionEClass, ecorePackage.getEBoolean(), "validateMothersVitalSignsSectionMothersVitalSignsObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(mothersVitalSignsSectionEClass, this.getMothersVitalSignsObservation(), "getMothersVitalSignsObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(mothersVitalSignsObservationEClass, MothersVitalSignsObservation.class, "MothersVitalSignsObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(mothersVitalSignsObservationEClass, ecorePackage.getEBoolean(), "validateMothersVitalSignsObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mothersVitalSignsObservationEClass, ecorePackage.getEBoolean(), "validateMothersVitalSignsObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mothersVitalSignsObservationEClass, ecorePackage.getEBoolean(), "validateMothersVitalSignsObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mothersVitalSignsObservationEClass, ecorePackage.getEBoolean(), "validateMothersVitalSignsObservationCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mothersVitalSignsObservationEClass, ecorePackage.getEBoolean(), "validateMothersVitalSignsObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mothersVitalSignsObservationEClass, ecorePackage.getEBoolean(), "validateMothersVitalSignsObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(historyofInfectionLiveBirthSectionEClass, HistoryofInfectionLiveBirthSection.class, "HistoryofInfectionLiveBirthSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(historyofInfectionLiveBirthSectionEClass, ecorePackage.getEBoolean(), "validateHistoryofInfectionLiveBirthSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(historyofInfectionLiveBirthSectionEClass, ecorePackage.getEBoolean(), "validateHistoryofInfectionLiveBirthSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(historyofInfectionLiveBirthSectionEClass, ecorePackage.getEBoolean(), "validateHistoryofInfectionLiveBirthSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(historyofInfectionLiveBirthSectionEClass, ecorePackage.getEBoolean(), "validateHistoryofInfectionLiveBirthSectionInfectionPresentLiveBirth", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(historyofInfectionLiveBirthSectionEClass, this.getInfectionPresentLiveBirth(), "getInfectionPresentLiveBirths", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(infectionPresentLiveBirthEClass, InfectionPresentLiveBirth.class, "InfectionPresentLiveBirth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(infectionPresentLiveBirthEClass, ecorePackage.getEBoolean(), "validateInfectionPresentLiveBirthTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infectionPresentLiveBirthEClass, ecorePackage.getEBoolean(), "validateInfectionPresentLiveBirthClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infectionPresentLiveBirthEClass, ecorePackage.getEBoolean(), "validateInfectionPresentLiveBirthMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infectionPresentLiveBirthEClass, ecorePackage.getEBoolean(), "validateInfectionPresentLiveBirthCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infectionPresentLiveBirthEClass, ecorePackage.getEBoolean(), "validateInfectionPresentLiveBirthCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infectionPresentLiveBirthEClass, ecorePackage.getEBoolean(), "validateInfectionPresentLiveBirthCodeVS", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infectionPresentLiveBirthEClass, ecorePackage.getEBoolean(), "validateInfectionPresentLiveBirthValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infectionPresentLiveBirthEClass, ecorePackage.getEBoolean(), "validateInfectionPresentLiveBirthValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(fetalDeliverySectionEClass, FetalDeliverySection.class, "FetalDeliverySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(fetalDeliverySectionEClass, ecorePackage.getEBoolean(), "validateFetalDeliverySectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliverySectionEClass, ecorePackage.getEBoolean(), "validateFetalDeliverySectionClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliverySectionEClass, ecorePackage.getEBoolean(), "validateFetalDeliverySectionMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliverySectionEClass, ecorePackage.getEBoolean(), "validateFetalDeliverySectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliverySectionEClass, ecorePackage.getEBoolean(), "validateFetalDeliverySectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliverySectionEClass, ecorePackage.getEBoolean(), "validateFetalDeliverySectionBirthOrder", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliverySectionEClass, ecorePackage.getEBoolean(), "validateFetalDeliverySectionNumberOfInfantsBornAlive", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliverySectionEClass, ecorePackage.getEBoolean(), "validateFetalDeliverySectionAutopsyPerformance", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliverySectionEClass, ecorePackage.getEBoolean(), "validateFetalDeliverySectionFetalDeathOccurrance", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliverySectionEClass, ecorePackage.getEBoolean(), "validateFetalDeliverySectionPlurality", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliverySectionEClass, ecorePackage.getEBoolean(), "validateFetalDeliverySectionCongenitalAnomaly", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliverySectionEClass, ecorePackage.getEBoolean(), "validateFetalDeliverySectionFetalDeliveryTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliverySectionEClass, ecorePackage.getEBoolean(), "validateFetalDeliverySectionFetalDeliverySubject", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliverySectionEClass, ecorePackage.getEBoolean(), "validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliverySectionEClass, ecorePackage.getEBoolean(), "validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliverySectionEClass, ecorePackage.getEBoolean(), "validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusName", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliverySectionEClass, ecorePackage.getEBoolean(), "validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliverySectionEClass, ecorePackage.getEBoolean(), "validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliverySectionEClass, ecorePackage.getEBoolean(), "validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliverySectionEClass, ecorePackage.getEBoolean(), "validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetus", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliverySectionEClass, ecorePackage.getEBoolean(), "validateFetalDeliverySectionFetalDeliverySubjectTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliverySectionEClass, ecorePackage.getEBoolean(), "validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetus", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(fetalDeliverySectionEClass, this.getBirthOrder(), "getBirthOrder", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(fetalDeliverySectionEClass, this.getNumberofInfantsBornAlive(), "getNumberOfInfantsBornAlive", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(fetalDeliverySectionEClass, this.getAutopsyPerformance(), "getAutopsyPerformance", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(fetalDeliverySectionEClass, this.getFetalDeathOccurrance(), "getFetalDeathOccurrance", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(fetalDeliverySectionEClass, this.getPlurality(), "getPlurality", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(fetalDeliverySectionEClass, this.getCongenitalAnomaly(), "getCongenitalAnomalies", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(fetalDeliverySectionEClass, this.getFetalDeliveryTime(), "getFetalDeliveryTime", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(autopsyPerformanceEClass, AutopsyPerformance.class, "AutopsyPerformance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceUseAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(autopsyPerformanceEClass, ecorePackage.getEBoolean(), "validateAutopsyPerformanceHistologicalExamAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(fetalDeathOccurranceEClass, FetalDeathOccurrance.class, "FetalDeathOccurrance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(fetalDeathOccurranceEClass, ecorePackage.getEBoolean(), "validateFetalDeathOccurranceTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeathOccurranceEClass, ecorePackage.getEBoolean(), "validateFetalDeathOccurranceClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeathOccurranceEClass, ecorePackage.getEBoolean(), "validateFetalDeathOccurranceMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeathOccurranceEClass, ecorePackage.getEBoolean(), "validateFetalDeathOccurranceCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeathOccurranceEClass, ecorePackage.getEBoolean(), "validateFetalDeathOccurranceCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeathOccurranceEClass, ecorePackage.getEBoolean(), "validateFetalDeathOccurranceValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeathOccurranceEClass, ecorePackage.getEBoolean(), "validateFetalDeathOccurranceValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(fetalDeliveryTimeEClass, FetalDeliveryTime.class, "FetalDeliveryTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(fetalDeliveryTimeEClass, ecorePackage.getEBoolean(), "validateFetalDeliveryTimeTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliveryTimeEClass, ecorePackage.getEBoolean(), "validateFetalDeliveryTimeMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliveryTimeEClass, ecorePackage.getEBoolean(), "validateFetalDeliveryTimeCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliveryTimeEClass, ecorePackage.getEBoolean(), "validateFetalDeliveryTimeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliveryTimeEClass, ecorePackage.getEBoolean(), "validateFetalDeliveryTimeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(fetalDeliveryTimeEClass, ecorePackage.getEBoolean(), "validateFetalDeliveryTimeParticipatingLocation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords.class, "ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTypeId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborAndDeliverySection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeliverySection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsPrenatalTestingAndSurveillance", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsPregnancyHistory", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsHistoryOfInfectionFetalDeathSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, this.getLaborandDeliverySection(), "getLaborAndDeliverySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, this.getFetalDeliverySection(), "getFetalDeliverySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, this.getPrenatalTestingandSurveillanceSection(), "getPrenatalTestingAndSurveillance", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, this.getPriorPregnancyHistorySection(), "getPregnancyHistory", 1, 1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, this.getHistoryofInfectionFetalDeathSection(), "getHistoryOfInfectionFetalDeathSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(historyofInfectionFetalDeathSectionEClass, HistoryofInfectionFetalDeathSection.class, "HistoryofInfectionFetalDeathSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(historyofInfectionFetalDeathSectionEClass, ecorePackage.getEBoolean(), "validateHistoryofInfectionFetalDeathSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(historyofInfectionFetalDeathSectionEClass, ecorePackage.getEBoolean(), "validateHistoryofInfectionFetalDeathSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(historyofInfectionFetalDeathSectionEClass, ecorePackage.getEBoolean(), "validateHistoryofInfectionFetalDeathSectionInfectionPresentFetalDeath", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(historyofInfectionFetalDeathSectionEClass, this.getInfectionPresentFetalDeath(), "getInfectionPresentFetalDeaths", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(infectionPresentFetalDeathEClass, InfectionPresentFetalDeath.class, "InfectionPresentFetalDeath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(infectionPresentFetalDeathEClass, ecorePackage.getEBoolean(), "validateInfectionPresentFetalDeathTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infectionPresentFetalDeathEClass, ecorePackage.getEBoolean(), "validateInfectionPresentFetalDeathClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infectionPresentFetalDeathEClass, ecorePackage.getEBoolean(), "validateInfectionPresentFetalDeathMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infectionPresentFetalDeathEClass, ecorePackage.getEBoolean(), "validateInfectionPresentFetalDeathCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infectionPresentFetalDeathEClass, ecorePackage.getEBoolean(), "validateInfectionPresentFetalDeathCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infectionPresentFetalDeathEClass, ecorePackage.getEBoolean(), "validateInfectionPresentFetalDeathCodeVS", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infectionPresentFetalDeathEClass, ecorePackage.getEBoolean(), "validateInfectionPresentFetalDeathValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(infectionPresentFetalDeathEClass, ecorePackage.getEBoolean(), "validateInfectionPresentFetalDeathValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http://www.openhealthtools.org/mdht/uml
        createUmlAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation
        createAnnotationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthor
        createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthorAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor
        createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTarget
        createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRole
        createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRoleAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRolePatient
        createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRolePatientAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodian
        createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodianAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodian
        createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganization
        createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrPrenatalCareprenatalVisitsAssociation
        createVsbrPrenatalCareprenatalVisitsAssociationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrPrenatalCareprenatalVisitsAssociationpreNatalVisitNumber
        createVsbrPrenatalCareprenatalVisitsAssociationpreNatalVisitNumberAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornDeliverySectionNewbornSubject
        createVsbrNewbornDeliverySectionNewbornSubjectAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornDeliverySectionNewbornSubjectRoleOfNewborn
        createVsbrNewbornDeliverySectionNewbornSubjectRoleOfNewbornAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewborn
        createVsbrNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrCongenitalAnomalyDownConfirmationAssociation
        createVsbrCongenitalAnomalyDownConfirmationAssociationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrCongenitalAnomalyDownConfirmationAssociationDownConfirmation
        createVsbrCongenitalAnomalyDownConfirmationAssociationDownConfirmationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrCongenitalAnomalyChromosomalDisorderConfirmationAssociation
        createVsbrCongenitalAnomalyChromosomalDisorderConfirmationAssociationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrCongenitalAnomalyChromosomalDisorderConfirmationAssociationChromosomalDisorderConfirmation
        createVsbrCongenitalAnomalyChromosomalDisorderConfirmationAssociationChromosomalDisorderConfirmationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrInfantTransferTransferFacility
        createVsbrInfantTransferTransferFacilityAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrInfantTransferTransferFacilityFacilityRole
        createVsbrInfantTransferTransferFacilityFacilityRoleAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrInfantTransferTransferFacilityFacilityRoleFacility
        createVsbrInfantTransferTransferFacilityFacilityRoleFacilityAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcessattendantParticipation
        createVsbrLaborandDeliveryProcessattendantParticipationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcessattendantParticipationattendantRole
        createVsbrLaborandDeliveryProcessattendantParticipationattendantRoleAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcessattendantParticipationattendantRoleAttendant
        createVsbrLaborandDeliveryProcessattendantParticipationattendantRoleAttendantAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcesspaymentSourceAssociation
        createVsbrLaborandDeliveryProcesspaymentSourceAssociationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcesspaymentSourceAssociationpaymentSource
        createVsbrLaborandDeliveryProcesspaymentSourceAssociationpaymentSourceAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcessparticipatingLocation
        createVsbrLaborandDeliveryProcessparticipatingLocationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcessparticipatingLocationLocationRole
        createVsbrLaborandDeliveryProcessparticipatingLocationLocationRoleAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcessparticipatingLocationLocationRoleLocation
        createVsbrLaborandDeliveryProcessparticipatingLocationLocationRoleLocationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMaternalTransfertransferSource
        createVsbrMaternalTransfertransferSourceAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMaternalTransfertransferSourcetransferRole
        createVsbrMaternalTransfertransferSourcetransferRoleAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMaternalTransfertransferSourcetransferRoleFacility
        createVsbrMaternalTransfertransferSourcetransferRoleFacilityAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrPregnancyRiskFactorCesareanAssociation
        createVsbrPregnancyRiskFactorCesareanAssociationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrPregnancyRiskFactorCesareanAssociationNumberOfCesarianDeliveries
        createVsbrPregnancyRiskFactorCesareanAssociationNumberOfCesarianDeliveriesAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryFinalRouteandMethod
        createVsbrMethodofDeliveryFinalRouteandMethodAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryFinalRouteandMethodTrialOfLaborAssociation
        createVsbrMethodofDeliveryFinalRouteandMethodTrialOfLaborAssociationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryFinalRouteandMethodTrialOfLaborAssociationTrialOfLabor
        createVsbrMethodofDeliveryFinalRouteandMethodTrialOfLaborAssociationTrialOfLaborAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryhysterotomyHysterectomyAssociation
        createVsbrMethodofDeliveryhysterotomyHysterectomyAssociationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryhysterotomyHysterectomyAssociationhysterotomyHysterectomy
        createVsbrMethodofDeliveryhysterotomyHysterectomyAssociationhysterotomyHysterectomyAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryFetalPresentation
        createVsbrMethodofDeliveryFetalPresentationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetalDeliverySectionFetalDeliverySubject
        createVsbrFetalDeliverySectionFetalDeliverySubjectAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetalDeliverySectionFetalDeliverySubjectRoleOfFetus
        createVsbrFetalDeliverySectionFetalDeliverySubjectRoleOfFetusAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetus
        createVsbrFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrAutopsyPerformanceUseAssociation
        createVsbrAutopsyPerformanceUseAssociationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrAutopsyPerformanceUseAssociationAutopsyUse
        createVsbrAutopsyPerformanceUseAssociationAutopsyUseAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrAutopsyPerformanceHistologicalExamAssociation
        createVsbrAutopsyPerformanceHistologicalExamAssociationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrAutopsyPerformanceHistologicalExamAssociationHistologicalPlacentalExam
        createVsbrAutopsyPerformanceHistologicalExamAssociationHistologicalPlacentalExamAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetalDeliveryTimeparticipatingLocation
        createVsbrFetalDeliveryTimeparticipatingLocationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetalDeliveryTimeparticipatingLocationLocationRole
        createVsbrFetalDeliveryTimeparticipatingLocationLocationRoleAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetalDeliveryTimeparticipatingLocationLocationRoleLocation
        createVsbrFetalDeliveryTimeparticipatingLocationLocationRoleLocationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget
        createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRole
        createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRoleAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRolePatient
        createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRolePatientAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor
        createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthorAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor
        createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian
        createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodianAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodian
        createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganization
        createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationAnnotations();
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createUmlAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml";     
        addAnnotation
          (this, 
           source, 
           new String[] 
           {
             "initializers", "org.openhealthtools.mdht.uml.cda.vsbr"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createAnnotationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation";      
        addAnnotation
          (reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Reporting Birth Information from a clinical setting to vital recordsTemplateId Reporting Birth Information from a clinical setting to vital recordsMoodCode Reporting Birth Information from a clinical setting to vital recordsRealmCode Reporting Birth Information from a clinical setting to vital recordsRealmCodeP Reporting Birth Information from a clinical setting to vital recordsTypeId Reporting Birth Information from a clinical setting to vital recordsId Reporting Birth Information from a clinical setting to vital recordsCode Reporting Birth Information from a clinical setting to vital recordsCodeP Reporting Birth Information from a clinical setting to vital recordsTitle Reporting Birth Information from a clinical setting to vital recordsEffectiveTime Reporting Birth Information from a clinical setting to vital recordsConfidentialityCode Reporting Birth Information from a clinical setting to vital recordsConfidentialityCodeP Reporting Birth Information from a clinical setting to vital recordsLanguageCode Reporting Birth Information from a clinical setting to vital recordsAuthor Reporting Birth Information from a clinical setting to vital recordsCustodian Reporting Birth Information from a clinical setting to vital recordsRecordTarget Reporting Birth Information from a clinical setting to vital recordsPrenatalTestingAndSurveillance Reporting Birth Information from a clinical setting to vital recordsPregnancyHistory Reporting Birth Information from a clinical setting to vital recordsNewbornDeliverySection Reporting Birth Information from a clinical setting to vital recordsLaborAndDeliverySection Reporting Birth Information from a clinical setting to vital recordsHistoryOfInfectionLiveBirthSection",
             "templateId.root", "2.16.840.1.113883.10.20.26.1",
             "classCode", "DOCCLIN",
             "moodCode", "EVN",
             "realmCode.code", "USA",
             "code.code", "68998-4",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "U.S. standard certificate of live birth - 2003 revision"
           });                                                                                 
        addAnnotation
          (prenatalTestingandSurveillanceSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Prenatal Testing and Surveillance SectionTemplateId Prenatal Testing and Surveillance SectionClassCode Prenatal Testing and Surveillance SectionMoodCode Prenatal Testing and Surveillance SectionCode Prenatal Testing and Surveillance SectionText Prenatal Testing and Surveillance SectionPrenatalCare",
             "templateId.root", "2.16.840.1.113883.10.20.26.3",
             "classCode", "DOCSECT",
             "moodCode", "EVN",
             "code.code", "57078-8",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Antenatal testing and surveillance"
           });                        
        addAnnotation
          (prenatalCareEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Prenatal CareTemplateId Prenatal CareClassCode Prenatal CareMoodCode Prenatal CareNegationInd Prenatal CareCode Prenatal CareCodeP",
             "templateId.root", "2.16.840.1.113883.10.20.26.42",
             "classCode", "ACT",
             "moodCode", "EVN",
             "code.code", "73776-7",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "No-prenatal care"
           });                               
        addAnnotation
          (priorPregnancyHistorySectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Prior Pregnancy History SectionTemplateId Prior Pregnancy History SectionClassCode Prior Pregnancy History SectionMoodCode Prior Pregnancy History SectionCode Prior Pregnancy History SectionCodeP Prior Pregnancy History SectionText Prior Pregnancy History SectionDate of Last Live Birth Prior Pregnancy History SectionLast Menstrual Period Date Prior Pregnancy History SectionNumber of Births Still Living Prior Pregnancy History SectionNumber of Live Births now Dead Prior Pregnancy History SectionOther Pregnancy Outcomes Prior Pregnancy History SectionEstimate of Gestation",
             "templateId.root", "2.16.840.1.113883.10.20.26.12",
             "classCode", "DOCSECT",
             "moodCode", "EVN",
             "code.code", "57073-9",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Prenatal events"
           });                                               
        addAnnotation
          (dateofLastLiveBirthEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Date of Last Live BirthTemplateId Date of Last Live BirthMoodCode Date of Last Live BirthCode Date of Last Live BirthCodeP Date of Last Live BirthValue",
             "templateId.root", "2.16.840.1.113883.10.20.26.20",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "68499-3",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Date last live birth"
           });                    
        addAnnotation
          (lastMenstrualPeriodDateEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Last Menstrual Period DateTemplateId Last Menstrual Period DateClassCode Last Menstrual Period DateMoodCode Last Menstrual Period DateCode Last Menstrual Period DateCodeP Last Menstrual Period DateValue",
             "templateId.root", "2.16.840.1.113883.10.20.26.33",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "8665-2",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Date last menstrual period"
           });                       
        addAnnotation
          (numberofBirthsNowLivingEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Number of Births Now LivingTemplateId Number of Births Now LivingClassCode Number of Births Now LivingMoodCode Number of Births Now LivingCode Number of Births Now LivingCodeP Number of Births Now LivingValue",
             "templateId.root", "2.16.840.1.113883.10.20.26.36",
             "classCode", "OBS",
             "code.code", "11638-4",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Births still living"
           });                       
        addAnnotation
          (numberofLiveBirthsNowDeadEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Number of Live Births Now DeadTemplateId Number of Live Births Now DeadClassCode Number of Live Births Now DeadMoodCode Number of Live Births Now DeadCode Number of Live Births Now DeadCodeP Number of Live Births Now DeadValue",
             "templateId.root", "2.16.840.1.113883.10.20.26.38",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "68496-9",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Live births now dead"
           });                       
        addAnnotation
          (otherPregnancyOutcomeEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Other Pregnancy OutcomeTemplateId Other Pregnancy OutcomeClassCode Other Pregnancy OutcomeMoodCode Other Pregnancy OutcomeCode Other Pregnancy OutcomeCodeP Other Pregnancy OutcomeValue",
             "templateId.root", "2.16.840.1.113883.10.20.26.40",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "69043-8",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Other pregnancy outcomes"
           });                          
        addAnnotation
          (estimateofGestationEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Estimate of GestationTemplateId Estimate of GestationClassCode Estimate of GestationMoodCode Estimate of GestationCode Estimate of GestationCodeP Estimate of GestationValue",
             "templateId.root", "2.16.840.1.113883.10.20.26.21",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "11884-4",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Gestational age Estimated"
           });                       
        addAnnotation
          (newbornDeliverySectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Newborn Delivery SectionTemplateId Newborn Delivery SectionClassCode Newborn Delivery SectionMoodCode Newborn Delivery SectionCode Newborn Delivery SectionText Newborn Delivery SectionSubject Newborn Delivery SectionCongenitalAnomalies Newborn Delivery SectionNewbornsVitalSignsSection Newborn Delivery SectionAbnormalConditionsOfTheNewborn Newborn Delivery SectionInfantLiving Newborn Delivery SectionInfantBreastfed Newborn Delivery SectionPlurality Newborn Delivery SectionAssessmentsSection Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornClassCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornSDTCId Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornName Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornBirthTime Newborn Delivery SectionNewbornSubjectRoleOfNewbornClassCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornSubject Newborn Delivery SectionNewbornSubjectTypeCode Newborn Delivery SectionNewbornSubjectRelatedSubject",
             "templateId.root", "2.16.840.1.113883.10.20.26.10",
             "classCode", "DOCSECT",
             "moodCode", "EVN",
             "code.code", "57075-4",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Newborn delivery information from newborn narrative",
             "constraints.validation.info", "Newborn Delivery SectionBirthOrder Newborn Delivery SectionNumberOfInfantsBornAlive Newborn Delivery SectionInfantTransfer",
             "constraints.validation.query", "Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornClassCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornSDTCId Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornName Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornBirthTime Newborn Delivery SectionNewbornSubjectRoleOfNewbornClassCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornSubject Newborn Delivery SectionNewbornSubjectTypeCode Newborn Delivery SectionNewbornSubjectRelatedSubject"
           });                                                                                                      
        addAnnotation
          (birthOrderEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Birth OrderTemplateId Birth OrderClassCode Birth OrderMoodCode Birth OrderCode Birth OrderCodeP Birth OrderValue",
             "templateId.root", "2.16.840.1.113883.10.20.26.16",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "73771-8",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Birth order"
           });                       
        addAnnotation
          (numberofInfantsBornAliveEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Number of Infants Born AliveTemplateId Number of Infants Born AliveClassCode Number of Infants Born AliveMoodCode Number of Infants Born AliveCode Number of Infants Born AliveCodeP Number of Infants Born AliveValue",
             "templateId.root", "2.16.840.1.113883.10.20.26.37",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "73773-4",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Number of infants in this delivery born alive"
           });                       
        addAnnotation
          (congenitalAnomalyEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Congenital AnomalyTemplateId Congenital AnomalyClassCode Congenital AnomalyMoodCode Congenital AnomalyCode Congenital AnomalyCodeVS Congenital AnomalyCodeP Congenital AnomalyValue Congenital AnomalyValueP",
             "templateId.root", "2.16.840.1.113883.10.20.26.19",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "73780-9",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "code.displayName", "Congenital anomalies of the newborn"
           });                                       
        addAnnotation
          (newbornsVitalSignsSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Newborns Vital Signs SectionTemplateId Newborns Vital Signs SectionClassCode Newborns Vital Signs SectionMoodCode Newborns Vital Signs SectionCode Newborns Vital Signs SectionCodeP Newborns Vital Signs SectionText Newborns Vital Signs SectionNewbornsVitalSignsObservation",
             "templateId.root", "2.16.840.1.113883.10.20.26.11",
             "classCode", "DOCSECT",
             "moodCode", "EVN",
             "code.code", "8716-3",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Vital Signs"
           });                           
        addAnnotation
          (newbornsVitalSignsObservationEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Newborns Vital Signs ObservationTemplateId Newborns Vital Signs ObservationClassCode Newborns Vital Signs ObservationMoodCode Newborns Vital Signs ObservationCode Newborns Vital Signs ObservationCodeP Newborns Vital Signs ObservationValue",
             "templateId.root", "2.16.840.1.113883.10.20.26.46",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC"
           });                       
        addAnnotation
          (abnormalConditionoftheNewbornEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Abnormal Condition of the NewbornTemplateId Abnormal Condition of the NewbornClassCode Abnormal Condition of the NewbornMoodCode Abnormal Condition of the NewbornCode Abnormal Condition of the NewbornCodeVS Abnormal Condition of the NewbornCodeP Abnormal Condition of the NewbornValue Abnormal Condition of the NewbornValueP",
             "templateId.root", "2.16.840.1.113883.10.20.26.13",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "73812-0",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "code.displayName", "Abnormal conditions of the newborn"
           });                             
        addAnnotation
          (infantLivingEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Infant LivingTemplateId Infant LivingClassCode Infant LivingMoodCode Infant LivingCode Infant LivingCodeP Infant LivingValue",
             "templateId.root", "2.16.840.1.113883.10.20.26.28",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "73757-7",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Infant living at time of report"
           });                       
        addAnnotation
          (infantBreastfedEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Infant BreastfedTemplateId Infant BreastfedClassCode Infant BreastfedMoodCode Infant BreastfedCode Infant BreastfedCodeP Infant BreastfedValue",
             "templateId.root", "2.16.840.1.113883.10.20.26.27",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "73756-9",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Infant is being breastfed at discharge"
           });                       
        addAnnotation
          (infantTransferEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "InfantTransferTemplateId InfantTransferClassCode InfantTransferMoodCode InfantTransferCode InfantTransferCodeP InfantTransferValue",
             "templateId.root", "2.16.840.1.113883.10.20.26.29",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "73758-5",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Infant was transferred within 24 hours of delivery",
             "constraints.validation.dependOn.InfantTransferCode", "InfantTransferCodeP",
             "constraints.validation.info", "InfantTransferParticipant"
           });                             
        addAnnotation
          (pluralityEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "PluralityTemplateId PluralityClassCode PluralityMoodCode PluralityCode PluralityCodeP PluralityValue",
             "templateId.root", "2.16.840.1.113883.10.20.26.41",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "57722-1",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Birth plurality",
             "constraints.validation.dependOn.PluralityCode", "PluralityCodeP"
           });                       
        addAnnotation
          (assessmentsSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Assessments SectionTemplateId Assessments SectionClassCode Assessments SectionMoodCode Assessments SectionCode Assessments SectionCodeP Assessments SectionText Assessments SectionAssessmentObservation",
             "templateId.root", "2.16.840.1.113883.10.20.26.9",
             "classCode", "DOCSECT",
             "moodCode", "EVN",
             "code.code", "51848-0",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Assessment Note"
           });                           
        addAnnotation
          (assessmentObservationEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Assessment ObservationTemplateId Assessment ObservationClassCode Assessment ObservationMoodCode Assessment ObservationCode Assessment ObservationCodeP Assessment ObservationValue",
             "templateId.root", "2.16.840.1.113883.10.20.26.47",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC"
           });                       
        addAnnotation
          (laborandDeliverySectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Labor and Delivery SectionTemplateId Labor and Delivery SectionClassCode Labor and Delivery SectionMoodCode Labor and Delivery SectionCode Labor and Delivery SectionText Labor and Delivery SectionLaborAndDeliveryProcess Labor and Delivery SectionLaborAndDeliveryProcedures Section Labor and Delivery SectionMothersVitalSignsSection",
             "templateId.root", "2.16.840.1.113883.10.20.26.8",
             "classCode", "DOCSECT",
             "moodCode", "EVN",
             "code.code", "34079-4",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Labor and delivery section",
             "constraints.validation.info", "Labor and Delivery SectionLaborOnsets"
           });                                    
        addAnnotation
          (laborandDeliveryProcessEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Labor and Delivery ProcessTemplateId Labor and Delivery ProcessClassCode Labor and Delivery ProcessMoodCode Labor and Delivery ProcessCode Labor and Delivery ProcessCodeP Labor and Delivery ProcessAttendantParticipation Labor and Delivery ProcessEntryRelationship Labor and Delivery ProcessMaternalTransfer Labor and Delivery ProcessParticipatingLocation Labor and Delivery ProcessMaternalMorbidities Labor and Delivery ProcessRiskFactors",
             "templateId.root", "2.16.840.1.113883.10.20.26.31",
             "classCode", "ACT",
             "moodCode", "EVN",
             "code.code", "57074-7",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Labor and delivery process"
           });                                                         
        addAnnotation
          (characteristicofLaborandDeliveryEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Characteristic of Labor and DeliveryTemplateId Characteristic of Labor and DeliveryClassCode Characteristic of Labor and DeliveryMoodCode Characteristic of Labor and DeliveryCode Characteristic of Labor and DeliveryCodeVS Characteristic of Labor and DeliveryCodeP Characteristic of Labor and DeliveryValue Characteristic of Labor and DeliveryValueP",
             "templateId.root", "2.16.840.1.113883.10.20.26.18",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "73813-8",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "code.displayName", "Characteristics of labor and delivery"
           });                             
        addAnnotation
          (plannedHomeBirthEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Planned Home BirthTemplateId Planned Home BirthClassCode Planned Home BirthMoodCode Planned Home BirthCode Planned Home BirthCodeP Planned Home BirthValue",
             "templateId.root", "2.16.840.1.113883.10.20.26.26",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "73765-0",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Planned to delivery at home"
           });                       
        addAnnotation
          (maternalTransferEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Maternal TransferTemplateId Maternal TransferClassCode Maternal TransferMoodCode Maternal TransferCode Maternal TransferCodeP Maternal TransferValue",
             "templateId.root", "2.16.840.1.113883.10.20.26.35",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "73763-5",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Mother was transferred for maternal medical or fetal indications for delivery"
           });                             
        addAnnotation
          (maternalMorbidityEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Maternal MorbidityTemplateId Maternal MorbidityClassCode Maternal MorbidityMoodCode Maternal MorbidityCode Maternal MorbidityCodeVS Maternal MorbidityCodeP Maternal MorbidityValue Maternal MorbidityValueP",
             "templateId.root", "2.16.840.1.113883.10.20.26.34",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "73781-7",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "code.displayName", "Maternal morbidity"
           });                             
        addAnnotation
          (pregnancyRiskFactorEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Pregnancy Risk FactorTemplateId Pregnancy Risk FactorClassCode Pregnancy Risk FactorMoodCode Pregnancy Risk FactorCode Pregnancy Risk FactorCodeVS Pregnancy Risk FactorCodeP Pregnancy Risk FactorValue Pregnancy Risk FactorValueP",
             "templateId.root", "2.16.840.1.113883.10.20.26.44",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "73775-9",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "code.displayName", "Risk factors in this pregnancy"
           });                                  
        addAnnotation
          (laborandDeliveryProcedureSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Labor and Delivery Procedure SectionTemplateId Labor and Delivery Procedure SectionClassCode Labor and Delivery Procedure SectionMoodCode Labor and Delivery Procedure SectionCode Labor and Delivery Procedure SectionCodeP Labor and Delivery Procedure SectionText Labor and Delivery Procedure SectionMethodOfDelivery",
             "templateId.root", "2.16.840.1.113883.10.20.26.7",
             "classCode", "DOCSECT",
             "moodCode", "EVN",
             "code.code", "29300-1",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Procedure",
             "constraints.validation.info", "Labor and Delivery Procedure SectionObstetricProcedure"
           });                               
        addAnnotation
          (obstetricProcedureEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Obstetric ProcedureTemplateId Obstetric ProcedureClassCode Obstetric ProcedureMoodCode Obstetric ProcedureNegationInd Obstetric ProcedureCode Obstetric ProcedureCodeP",
             "templateId.root", "2.16.840.1.113883.10.20.26.39",
             "classCode", "PROC",
             "moodCode", "EVN",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT"
           });                       
        addAnnotation
          (methodofDeliveryEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Method of DeliveryTemplateId Method of DeliveryClassCode Method of DeliveryMoodCode Method of DeliveryCode Method of DeliveryCodeP Method of DeliveryFinalRouteAndMethod Method of DeliveryFetalPresentation Method of DeliveryHysterotomyHysterectomyAssociation",
             "templateId.root", "2.16.840.1.113883.10.20.26.45",
             "classCode", "PROC",
             "moodCode", "EVN",
             "code.code", "72149-8",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Delivery method"
           });                                   
        addAnnotation
          (onsetofLaborEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Onset of LaborTemplateId Onset of LaborClassCode Onset of LaborMoodCode Onset of LaborCode Onset of LaborCodeVS Onset of LaborCodeP Onset of LaborValue Onset of LaborValueP",
             "templateId.root", "2.16.840.1.113883.10.20.26.32",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "73774-2",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "code.displayName", "Onset of labor"
           });                             
        addAnnotation
          (mothersVitalSignsSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Mothers Vital Signs SectionTemplateId Mothers Vital Signs SectionClassCode Mothers Vital Signs SectionMoodCode Mothers Vital Signs SectionCode Mothers Vital Signs SectionCodeP Mothers Vital Signs SectionText Mothers Vital Signs SectionMothersVitalSignsObservation",
             "templateId.root", "2.16.840.1.113883.10.20.26.9",
             "classCode", "DOCSECT",
             "moodCode", "EVN",
             "code.code", "8716-3",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Vital Signs"
           });                           
        addAnnotation
          (mothersVitalSignsObservationEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Mothers Vital Signs ObservationTemplateId Mothers Vital Signs ObservationClassCode Mothers Vital Signs ObservationMoodCode Mothers Vital Signs ObservationCode Mothers Vital Signs ObservationCodeP Mothers Vital Signs ObservationValue",
             "templateId.root", "2.16.840.1.113883.10.20.26.46",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC"
           });                       
        addAnnotation
          (historyofInfectionLiveBirthSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "History of Infection: Live Birth SectionTemplateId History of Infection: Live Birth SectionCode History of Infection: Live Birth SectionText History of Infection: Live Birth SectionInfectionPresentLiveBirth",
             "templateId.root", "2.16.840.1.113883.10.20.26.5",
             "classCode", "DOCSECT",
             "moodCode", "EVN",
             "code.code", "71459-2",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Infection panel"
           });                  
        addAnnotation
          (infectionPresentLiveBirthEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Infection Present: Live BirthTemplateId Infection Present: Live BirthClassCode Infection Present: Live BirthMoodCode Infection Present: Live BirthCode Infection Present: Live BirthCodeVS Infection Present: Live BirthCodeP Infection Present: Live BirthValue Infection Present: Live BirthValueP",
             "templateId.root", "2.16.840.1.113883.10.20.26.30",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "72519-2",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "code.displayName", "InfeInfections present and or treated during this pregnancy for live birth"
           });                             
        addAnnotation
          (fetalDeliverySectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Fetal Delivery SectionTemplateId Fetal Delivery SectionClassCode Fetal Delivery SectionMoodCode Fetal Delivery SectionCode Fetal Delivery SectionText Fetal Delivery SectionBirthOrder Fetal Delivery SectionNumberOfInfantsBornAlive Fetal Delivery SectionFetalDeathOccurrance Fetal Delivery SectionPlurality Fetal Delivery SectionCongenitalAnomaly Fetal Delivery SectionFetalDeliveryTime Fetal Delivery SectionFetalDeliverySubject Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusFetusClassCode Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCode Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCode Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeP Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusClassCode Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusFetus Fetal Delivery SectionFetalDeliverySubjectTypeCode Fetal Delivery SectionFetalDeliverySubjectRoleOfFetus",
             "templateId.root", "2.16.840.1.113883.10.20.26.4",
             "classCode", "DOCSECT",
             "moodCode", "EVN",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "constraints.validation.warning", "Fetal Delivery SectionAutopsyPerformance",
             "constraints.validation.query", "Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusFetusClassCode Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCode Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusFetusName Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCode Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeP Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusClassCode Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusFetus Fetal Delivery SectionFetalDeliverySubjectTypeCode Fetal Delivery SectionFetalDeliverySubjectRoleOfFetus",
             "constraints.validation.info", "Fetal Delivery SectionFetalDeliverySubjectRoleOfFetusFetusName"
           });                                                                                 
        addAnnotation
          (autopsyPerformanceEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Autopsy PerformanceTemplateId Autopsy PerformanceClassCode Autopsy PerformanceMoodCode Autopsy PerformanceCode Autopsy PerformanceCodeP Autopsy PerformanceValue Autopsy PerformanceValueP Autopsy PerformanceHistologicalExamAssociation",
             "templateId.root", "2.16.840.1.113883.10.20.26.15",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "73768-4",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Autopsy was performed"
           });                                    
        addAnnotation
          (fetalDeathOccurranceEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Fetal Death OccurranceTemplateId Fetal Death OccurranceClassCode Fetal Death OccurranceMoodCode Fetal Death OccurranceCode Fetal Death OccurranceCodeP Fetal Death OccurranceValue Fetal Death OccurranceValueP",
             "templateId.root", "2.16.840.1.113883.10.20.26.22",
             "classCode", "ACT",
             "moodCode", "EVN",
             "code.code", "73811-2",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Estimated time of fetal death"
           });                          
        addAnnotation
          (fetalDeliveryTimeEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Fetal Delivery TimeTemplateId Fetal Delivery TimeMoodCode Fetal Delivery TimeCode Fetal Delivery TimeCodeP Fetal Delivery TimeValue Fetal Delivery TimeParticipatingLocation",
             "templateId.root", "2.16.840.1.113883.10.20.26.23",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "11778-8",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Delivery date for patient selected by practitioner using all pertinent information"
           });                          
        addAnnotation
          (reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Reporting Fetal Death Information from a clinical setting to vital recordsTemplateId Reporting Fetal Death Information from a clinical setting to vital recordsClassCode Reporting Fetal Death Information from a clinical setting to vital recordsMoodCode Reporting Fetal Death Information from a clinical setting to vital recordsRealmCode Reporting Fetal Death Information from a clinical setting to vital recordsRealmCodeP Reporting Fetal Death Information from a clinical setting to vital recordsTypeId Reporting Fetal Death Information from a clinical setting to vital recordsId Reporting Fetal Death Information from a clinical setting to vital recordsCode Reporting Fetal Death Information from a clinical setting to vital recordsCodeP Reporting Fetal Death Information from a clinical setting to vital recordsTitle Reporting Fetal Death Information from a clinical setting to vital recordsEffectiveTime Reporting Fetal Death Information from a clinical setting to vital recordsConfidentialityCode Reporting Fetal Death Information from a clinical setting to vital recordsConfidentialityCodeP Reporting Fetal Death Information from a clinical setting to vital recordsLanguageCode Reporting Fetal Death Information from a clinical setting to vital recordsAuthor Reporting Fetal Death Information from a clinical setting to vital recordsCustodian Reporting Fetal Death Information from a clinical setting to vital recordsRecordTarget Reporting Fetal Death Information from a clinical setting to vital recordsLaborAndDeliverySection Reporting Fetal Death Information from a clinical setting to vital recordsFetalDeliverySection Reporting Fetal Death Information from a clinical setting to vital recordsPrenatalTestingAndSurveillance Reporting Fetal Death Information from a clinical setting to vital recordsPregnancyHistory Reporting Fetal Death Information from a clinical setting to vital recordsHistoryOfInfectionFetalDeathSection",
             "templateId.root", "2.16.840.1.113883.10.20.26.2",
             "classCode", "DOCCLIN",
             "moodCode", "EVN",
             "realmCode.code", "US",
             "code.code", "69045-3",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "U.S. stanard report of fetal death - 2003 revision"
           });                                                                                    
        addAnnotation
          (historyofInfectionFetalDeathSectionEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "History of Infection: Fetal Death SectionTemplateId History of Infection: Fetal Death SectionCode History of Infection: Fetal Death SectionInfectionPresentFetalDeath",
             "templateId.root", "2.16.840.1.113883.10.20.26.48",
             "classCode", "DOCSECT",
             "moodCode", "EVN",
             "code.code", "71459-2",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Infection Panel"
           });               
        addAnnotation
          (infectionPresentFetalDeathEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Infection Present: Fetal DeathTemplateId Infection Present: Fetal DeathClassCode Infection Present: Fetal DeathMoodCode Infection Present: Fetal DeathCode Infection Present: Fetal DeathCodeVS Infection Present: Fetal DeathCodeP Infection Present: Fetal DeathValue Infection Present: Fetal DeathValueP",
             "templateId.root", "2.16.840.1.113883.10.20.26.49",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "73769-2",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "code.displayName", "Infections present and or treated during this pregnancy for fetal death"
           });                        
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthor</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthorAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthor";       
        addAnnotation
          (reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, 
           source, 
           new String[] 
           {
             "typeCode", "AUT",
             "constraints.validation.error", "AuthorAssignedAuthor"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor";        
        addAnnotation
          (reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "AssignedAuthorId AssignedAuthorClassCode",
             "classCode", "ASSIGNED"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTarget</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTarget";         
        addAnnotation
          (reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, 
           source, 
           new String[] 
           {
             "typeCode", "RCT",
             "constraints.validation.error", "RecordTargetTypeCode RecordTargetPatientRole"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRole</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRoleAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRole";          
        addAnnotation
          (reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, 
           source, 
           new String[] 
           {
             "classCode", "PAT",
             "constraints.validation.error", "PatientRoleClassCode PatientRoleId PatientRolePatient",
             "constraints.validation.warning", "PatientRoleAddr"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRolePatient</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRolePatientAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRolePatient";           
        addAnnotation
          (reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, 
           source, 
           new String[] 
           {
             "classCode", "PSN",
             "constraints.validation.error", "PatientClassCode PatientDeterminerCode PatientName",
             "determinerCode", "INSTANCE"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodian</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodianAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodian";            
        addAnnotation
          (reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, 
           source, 
           new String[] 
           {
             "typeCode", "CST",
             "constraints.validation.error", "CustodianTypeCode CustodianAssignedCustodian"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodian</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodian";             
        addAnnotation
          (reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, 
           source, 
           new String[] 
           {
             "classCode", "ASSIGNED",
             "constraints.validation.error", "AssignedCustodianClassCode"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganization</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganization";              
        addAnnotation
          (reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, 
           source, 
           new String[] 
           {
             "classCode", "ORG",
             "constraints.validation.error", "CustodianOrganizationClassCode CustodianOrganizationDeterminerCode CustodianOrganizationId",
             "determinerCode", "INSTANCE"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrPrenatalCareprenatalVisitsAssociation</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrPrenatalCareprenatalVisitsAssociationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrPrenatalCareprenatalVisitsAssociation";                                                                                                        
        addAnnotation
          (prenatalCareEClass, 
           source, 
           new String[] 
           {
             "typeCode", "COMP",
             "constraints.validation.error", "prenatalVisitsAssociationTypeCode prenatalVisitsAssociationObservation"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrPrenatalCareprenatalVisitsAssociationpreNatalVisitNumber</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrPrenatalCareprenatalVisitsAssociationpreNatalVisitNumberAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrPrenatalCareprenatalVisitsAssociationpreNatalVisitNumber";                                                                                                         
        addAnnotation
          (prenatalCareEClass, 
           source, 
           new String[] 
           {
             "classCode", "OBS",
             "constraints.validation.error", "preNatalVisitNumberClassCode preNatalVisitNumberMoodCode preNatalVisitNumberCode preNatalVisitNumberCodeP preNatalVisitNumberValue",
             "moodCode", "EVN",
             "code.code", "68493-6",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Prenatal visits for this pregnancy",
             "constraints.validation.dependOn.preNatalVisitNumberCode", "preNatalVisitNumberCodeP"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornDeliverySectionNewbornSubject</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrNewbornDeliverySectionNewbornSubjectAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornDeliverySectionNewbornSubject";                                                                                                                                                                                                                                                                                                
        addAnnotation
          (newbornDeliverySectionEClass, 
           source, 
           new String[] 
           {
             "typeCode", "SBJ",
             "constraints.validation.error", "NewbornSubjectTypeCode NewbornSubjectRelatedSubject"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornDeliverySectionNewbornSubjectRoleOfNewborn</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrNewbornDeliverySectionNewbornSubjectRoleOfNewbornAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornDeliverySectionNewbornSubjectRoleOfNewborn";                                                                                                                                                                                                                                                                                                 
        addAnnotation
          (newbornDeliverySectionEClass, 
           source, 
           new String[] 
           {
             "classCode", "PRS",
             "constraints.validation.error", "RoleOfNewbornClassCode RoleOfNewbornCode RoleOfNewbornSubject",
             "code.code", "CHILD",
             "code.codeSystem", "2.16.840.1.113883.5.111",
             "code.codeSystemName", "RoleCode"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewborn</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewborn";                                                                                                                                                                                                                                                                                                  
        addAnnotation
          (newbornDeliverySectionEClass, 
           source, 
           new String[] 
           {
             "classCode", "PSN",
             "constraints.validation.error", "NewbornClassCode NewbornDeterminerCode NewbornSDTCId NewbornName NewbornAdministrativeGenderCode NewbornAdministrativeGenderCodeP NewbornBirthTime",
             "determinerCode", "INSTANCE",
             "administrativeGenderCode.codeSystem", "2.16.840.1.113883.5.1",
             "administrativeGenderCode.codeSystemName", "AdministrativeGenderCode"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrCongenitalAnomalyDownConfirmationAssociation</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrCongenitalAnomalyDownConfirmationAssociationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrCongenitalAnomalyDownConfirmationAssociation";                                                                                                                                                                                                                                                                                                                                                                                                                                        
        addAnnotation
          (congenitalAnomalyEClass, 
           source, 
           new String[] 
           {
             "typeCode", "COMP",
             "constraints.validation.error", "DownConfirmationAssociationTypeCode DownConfirmationAssociationDownConfirmation"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrCongenitalAnomalyDownConfirmationAssociationDownConfirmation</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrCongenitalAnomalyDownConfirmationAssociationDownConfirmationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrCongenitalAnomalyDownConfirmationAssociationDownConfirmation";                                                                                                                                                                                                                                                                                                                                                                                                                                         
        addAnnotation
          (congenitalAnomalyEClass, 
           source, 
           new String[] 
           {
             "classCode", "OBS",
             "constraints.validation.error", "DownConfirmationClassCode DownConfirmationCode DownConfirmationCodeP DownConfirmationMoodCode DownConfirmationValue DownConfirmationValueP",
             "code.code", "73779-1",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Down syndrome karyotype status",
             "constraints.validation.dependOn.DownConfirmationCode", "DownConfirmationCodeP",
             "moodCode", "EVN",
             "value.codeSystem", "2.16.840.1.113883.6.96",
             "value.codeSystemName", "SNOMEDCT"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrCongenitalAnomalyChromosomalDisorderConfirmationAssociation</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrCongenitalAnomalyChromosomalDisorderConfirmationAssociationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrCongenitalAnomalyChromosomalDisorderConfirmationAssociation";                                                                                                                                                                                                                                                                                                                                                                                                                                          
        addAnnotation
          (congenitalAnomalyEClass, 
           source, 
           new String[] 
           {
             "typeCode", "COMP",
             "constraints.validation.error", "ChromosomalDisorderConfirmationAssociationTypeCode ChromosomalDisorderConfirmationAssociationChromosomalDisorderConfirmation"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrCongenitalAnomalyChromosomalDisorderConfirmationAssociationChromosomalDisorderConfirmation</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrCongenitalAnomalyChromosomalDisorderConfirmationAssociationChromosomalDisorderConfirmationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrCongenitalAnomalyChromosomalDisorderConfirmationAssociationChromosomalDisorderConfirmation";                                                                                                                                                                                                                                                                                                                                                                                                                                           
        addAnnotation
          (congenitalAnomalyEClass, 
           source, 
           new String[] 
           {
             "classCode", "OBS",
             "constraints.validation.error", "ChromosomalDisorderConfirmationClassCode ChromosomalDisorderConfirmationCode ChromosomalDisorderConfirmationCodeP ChromosomalDisorderConfirmationMoodCode ChromosomalDisorderConfirmationValue ChromosomalDisorderConfirmationValueP",
             "code.code", "73778-3",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Suspected chromosomal disorder karyotype status",
             "constraints.validation.dependOn.ChromosomalDisorderConfirmationCode", "ChromosomalDisorderConfirmationCodeP",
             "moodCode", "EVN",
             "value.codeSystem", "2.16.840.1.113883.6.96",
             "value.codeSystemName", "SNOMEDCT"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrInfantTransferTransferFacility</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrInfantTransferTransferFacilityAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrInfantTransferTransferFacility";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
        addAnnotation
          (infantTransferEClass, 
           source, 
           new String[] 
           {
             "typeCode", "DST",
             "constraints.validation.error", "TransferFacilityTypeCode TransferFacilityParticipantRole"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrInfantTransferTransferFacilityFacilityRole</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrInfantTransferTransferFacilityFacilityRoleAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrInfantTransferTransferFacilityFacilityRole";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
        addAnnotation
          (infantTransferEClass, 
           source, 
           new String[] 
           {
             "classCode", "SDLOC",
             "constraints.validation.error", "FacilityRoleClassCode FacilityRoleScopingEntity"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrInfantTransferTransferFacilityFacilityRoleFacility</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrInfantTransferTransferFacilityFacilityRoleFacilityAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrInfantTransferTransferFacilityFacilityRoleFacility";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
        addAnnotation
          (infantTransferEClass, 
           source, 
           new String[] 
           {
             "classCode", "ORG",
             "constraints.validation.error", "FacilityClassCode FacilityDeterminerCode FacilityName",
             "determinerCode", "INSTANCE"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcessattendantParticipation</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsbrLaborandDeliveryProcessattendantParticipationAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcessattendantParticipation";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
        addAnnotation
          (laborandDeliveryProcessEClass, 
           source, 
           new String[] 
           {
             "typeCode", "PRF",
             "constraints.validation.error", "attendantParticipationTypeCode attendantParticipationAssignedEntity"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
    }

  /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcessattendantParticipationattendantRole</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsbrLaborandDeliveryProcessattendantParticipationattendantRoleAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcessattendantParticipationattendantRole";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
        addAnnotation
          (laborandDeliveryProcessEClass, 
           source, 
           new String[] 
           {
             "classCode", "ASSIGNED",
             "constraints.validation.error", "attendantRoleClassCode attendantRoleCode attendantRoleCodeP attendantRoleAttendant",
             "constraints.validation.warning", "attendantRoleId",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    }

  /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcessattendantParticipationattendantRoleAttendant</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsbrLaborandDeliveryProcessattendantParticipationattendantRoleAttendantAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcessattendantParticipationattendantRoleAttendant";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
        addAnnotation
          (laborandDeliveryProcessEClass, 
           source, 
           new String[] 
           {
             "classCode", "PSN",
             "constraints.validation.error", "AttendantClassCode AttendantDeterminerCode AttendantName",
             "determinerCode", "INSTANCE"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
    }

  /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcesspaymentSourceAssociation</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsbrLaborandDeliveryProcesspaymentSourceAssociationAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcesspaymentSourceAssociation";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
        addAnnotation
          (laborandDeliveryProcessEClass, 
           source, 
           new String[] 
           {
             "typeCode", "COMP",
             "constraints.validation.error", "paymentSourceAssociationTypeCode paymentSourceAssociationObservation"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
    }

  /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcesspaymentSourceAssociationpaymentSource</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsbrLaborandDeliveryProcesspaymentSourceAssociationpaymentSourceAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcesspaymentSourceAssociationpaymentSource";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
        addAnnotation
          (laborandDeliveryProcessEClass, 
           source, 
           new String[] 
           {
             "classCode", "OBS",
             "constraints.validation.error", "paymentSourceClassCode paymentSourceMoodCode paymentSourceCode paymentSourceCodeP paymentSourceValue paymentSourceValueP",
             "moodCode", "EVN",
             "code.code", "68461-3",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Payment source",
             "constraints.validation.dependOn.paymentSourceCode", "paymentSourceCodeP",
             "value.codeSystem", "2.16.840.1.113883.221.5",
             "value.codeSystemName", "Source of Payment Typology"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
    }

  /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcessparticipatingLocation</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsbrLaborandDeliveryProcessparticipatingLocationAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcessparticipatingLocation";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
        addAnnotation
          (laborandDeliveryProcessEClass, 
           source, 
           new String[] 
           {
             "typeCode", "LOC",
             "constraints.validation.error", "participatingLocationTypeCode participatingLocationLocationRole"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
    }

  /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcessparticipatingLocationLocationRole</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsbrLaborandDeliveryProcessparticipatingLocationLocationRoleAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcessparticipatingLocationLocationRole";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
        addAnnotation
          (laborandDeliveryProcessEClass, 
           source, 
           new String[] 
           {
             "classCode", "BIRTHPL",
             "constraints.validation.error", "LocationRoleClassCode LocationRoleCode LocationRoleCodeP",
             "constraints.validation.warning", "LocationRoleId LocationRolePlayingEntity",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "constraints.validation.info", "LocationRoleAddr"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
    }

  /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcessparticipatingLocationLocationRoleLocation</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsbrLaborandDeliveryProcessparticipatingLocationLocationRoleLocationAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryProcessparticipatingLocationLocationRoleLocation";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
        addAnnotation
          (laborandDeliveryProcessEClass, 
           source, 
           new String[] 
           {
             "classCode", "PLC",
             "constraints.validation.error", "LocationClassCode LocationDeterminerCode",
             "determinerCode", "INSTANCE",
             "constraints.validation.warning", "LocationName",
             "constraints.validation.info", "LocationDesc"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
    }

  /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMaternalTransfertransferSource</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrMaternalTransfertransferSourceAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMaternalTransfertransferSource";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
        addAnnotation
          (maternalTransferEClass, 
           source, 
           new String[] 
           {
             "typeCode", "ORG",
             "constraints.validation.error", "transferSourceTypeCode transferSourceParticipantRole"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMaternalTransfertransferSourcetransferRole</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrMaternalTransfertransferSourcetransferRoleAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMaternalTransfertransferSourcetransferRole";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
        addAnnotation
          (maternalTransferEClass, 
           source, 
           new String[] 
           {
             "classCode", "SDLOC",
             "constraints.validation.error", "transferRoleClassCode transferRoleScopingEntity"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMaternalTransfertransferSourcetransferRoleFacility</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrMaternalTransfertransferSourcetransferRoleFacilityAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMaternalTransfertransferSourcetransferRoleFacility";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
        addAnnotation
          (maternalTransferEClass, 
           source, 
           new String[] 
           {
             "classCode", "ORG",
             "constraints.validation.error", "FacilityClassCode FacilityDeterminerCode FacilityName",
             "determinerCode", "INSTANCE"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrPregnancyRiskFactorCesareanAssociation</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrPregnancyRiskFactorCesareanAssociationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrPregnancyRiskFactorCesareanAssociation";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
        addAnnotation
          (pregnancyRiskFactorEClass, 
           source, 
           new String[] 
           {
             "typeCode", "COMP",
             "constraints.validation.error", "CesareanAssociationTypeCode CesareanAssociationObservation"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrPregnancyRiskFactorCesareanAssociationNumberOfCesarianDeliveries</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrPregnancyRiskFactorCesareanAssociationNumberOfCesarianDeliveriesAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrPregnancyRiskFactorCesareanAssociationNumberOfCesarianDeliveries";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
        addAnnotation
          (pregnancyRiskFactorEClass, 
           source, 
           new String[] 
           {
             "classCode", "OBS",
             "constraints.validation.error", "NumberOfCesarianDeliveriesClassCode NumberOfCesarianDeliveriesCode NumberOfCesarianDeliveriesCodeP NumberOfCesarianDeliveriesMoodCode NumberOfCesarianDeliveriesValue",
             "code.code", "68497-7",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Previous cesarean deliveries",
             "constraints.validation.dependOn.NumberOfCesarianDeliveriesCode", "NumberOfCesarianDeliveriesCodeP",
             "moodCode", "EVN"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryFinalRouteandMethod</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrMethodofDeliveryFinalRouteandMethodAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryFinalRouteandMethod";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
        addAnnotation
          (methodofDeliveryEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Final Route and MethodTemplateId Final Route and MethodClassCode Final Route and MethodMoodCode Final Route and MethodCode Final Route and MethodCodeP Final Route and MethodValue Final Route and MethodValueP Final Route and MethodTrialOfLaborAssociationTrialOfLaborClassCode Final Route and MethodTrialOfLaborAssociationTrialOfLaborMoodCode Final Route and MethodTrialOfLaborAssociationTrialOfLaborCodeP Final Route and MethodTrialOfLaborAssociationTrialOfLaborCode Final Route and MethodTrialOfLaborAssociationTrialOfLaborValue Final Route and MethodTrialOfLaborAssociationTypeCode Final Route and MethodTrialOfLaborAssociationTrialOfLabor",
             "templateId.root", "null",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "73762-7",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Final route and method of delivery"
           });                                                                                                                                                                                                                                                                                                                                                                                                                    
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryFinalRouteandMethodTrialOfLaborAssociation</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrMethodofDeliveryFinalRouteandMethodTrialOfLaborAssociationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryFinalRouteandMethodTrialOfLaborAssociation";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
        addAnnotation
          (methodofDeliveryEClass, 
           source, 
           new String[] 
           {
             "typeCode", "COMP",
             "constraints.validation.error", "TrialOfLaborAssociationTypeCode TrialOfLaborAssociationTrialOfLabor"
           });                                                                                                                                                                                                                                                                                                                                                                                                                   
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryFinalRouteandMethodTrialOfLaborAssociationTrialOfLabor</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrMethodofDeliveryFinalRouteandMethodTrialOfLaborAssociationTrialOfLaborAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryFinalRouteandMethodTrialOfLaborAssociationTrialOfLabor";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
        addAnnotation
          (methodofDeliveryEClass, 
           source, 
           new String[] 
           {
             "classCode", "OBS",
             "constraints.validation.error", "TrialOfLaborClassCode TrialOfLaborMoodCode TrialOfLaborCode TrialOfLaborCodeP TrialOfLaborValue",
             "moodCode", "EVN",
             "code.code", "73760-1",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "If cesarean, a trial of labor was attempted",
             "constraints.validation.dependOn.TrialOfLaborCode", "TrialOfLaborCodeP"
           });                                                                                                                                                                                                                                                                                                                                                                                                                  
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryhysterotomyHysterectomyAssociation</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrMethodofDeliveryhysterotomyHysterectomyAssociationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryhysterotomyHysterectomyAssociation";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
        addAnnotation
          (methodofDeliveryEClass, 
           source, 
           new String[] 
           {
             "typeCode", "COMP",
             "constraints.validation.error", "hysterotomyHysterectomyAssociationTypeCode hysterotomyHysterectomyAssociationHysterotomyHysterectomy"
           });                                                                                                                                                                                                                                                                                                                                                                                                                 
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryhysterotomyHysterectomyAssociationhysterotomyHysterectomy</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrMethodofDeliveryhysterotomyHysterectomyAssociationhysterotomyHysterectomyAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryhysterotomyHysterectomyAssociationhysterotomyHysterectomy";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
        addAnnotation
          (methodofDeliveryEClass, 
           source, 
           new String[] 
           {
             "classCode", "OBS",
             "constraints.validation.error", "hysterotomyHysterectomyClassCode hysterotomyHysterectomyCode hysterotomyHysterectomyCodeP hysterotomyHysterectomyMoodCode hysterotomyHysterectomyValue",
             "code.code", "73759-3",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Hysterotomy or hysterectomy was performed at delivery",
             "constraints.validation.dependOn.hysterotomyHysterectomyCode", "hysterotomyHysterectomyCodeP",
             "moodCode", "EVN"
           });                                                                                                                                                                                                                                                                                                                                                                                                                
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryFetalPresentation</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrMethodofDeliveryFetalPresentationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrMethodofDeliveryFetalPresentation";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
        addAnnotation
          (methodofDeliveryEClass, 
           source, 
           new String[] 
           {
             "constraints.validation.error", "Fetal PresentationTemplateId Fetal PresentationClassCode Fetal PresentationMoodCode Fetal PresentationCode Fetal PresentationCodeP Fetal PresentationValue Fetal PresentationValueP",
             "templateId.root", "null",
             "classCode", "OBS",
             "moodCode", "EVN",
             "code.code", "73761-9",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Fetal presentation at birth"
           });                                                                                                                                                                                                                                                                                                                                                                                                               
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetalDeliverySectionFetalDeliverySubject</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrFetalDeliverySectionFetalDeliverySubjectAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetalDeliverySectionFetalDeliverySubject";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
        addAnnotation
          (fetalDeliverySectionEClass, 
           source, 
           new String[] 
           {
             "typeCode", "SBJ",
             "constraints.validation.error", "FetalDeliverySubjectTypeCode FetalDeliverySubjectRoleOfFetus"
           });                                                                                                                                                                                                                                                                           
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetalDeliverySectionFetalDeliverySubjectRoleOfFetus</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrFetalDeliverySectionFetalDeliverySubjectRoleOfFetusAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetalDeliverySectionFetalDeliverySubjectRoleOfFetus";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
        addAnnotation
          (fetalDeliverySectionEClass, 
           source, 
           new String[] 
           {
             "classCode", "PRS",
             "constraints.validation.error", "RoleOfFetusClassCode RoleOfFetusFetus"
           });                                                                                                                                                                                                                                                                          
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetus</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetus";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
        addAnnotation
          (fetalDeliverySectionEClass, 
           source, 
           new String[] 
           {
             "classCode", "PSN",
             "constraints.validation.error", "FetusClassCode FetusDeterminerCode FetusAdministrativeGenderCode FetusAdministrativeGenderCodeP",
             "determinerCode", "INSTANCE",
             "constraints.validation.info", "FetusName",
             "administrativeGenderCode.codeSystem", "2.16.840.1.113883.5.1",
             "administrativeGenderCode.codeSystemName", "AdministrativeGenderCode"
           });                                                                                                                                                                                                                                                                         
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrAutopsyPerformanceUseAssociation</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrAutopsyPerformanceUseAssociationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrAutopsyPerformanceUseAssociation";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
        addAnnotation
          (autopsyPerformanceEClass, 
           source, 
           new String[] 
           {
             "typeCode", "COMP",
             "constraints.validation.error", "UseAssociationTypeCode UseAssociationAutopsyUse"
           });                                                                                                                                                                                              
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrAutopsyPerformanceUseAssociationAutopsyUse</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrAutopsyPerformanceUseAssociationAutopsyUseAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrAutopsyPerformanceUseAssociationAutopsyUse";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
        addAnnotation
          (autopsyPerformanceEClass, 
           source, 
           new String[] 
           {
             "code.code", "TBD",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "constraints.validation.error", "AutopsyUseCode AutopsyUseCodeP AutopsyUseValue",
             "constraints.validation.dependOn.AutopsyUseCode", "AutopsyUseCodeP"
           });                                                                                                                                                                                             
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrAutopsyPerformanceHistologicalExamAssociation</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsbrAutopsyPerformanceHistologicalExamAssociationAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrAutopsyPerformanceHistologicalExamAssociation";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
        addAnnotation
          (autopsyPerformanceEClass, 
           source, 
           new String[] 
           {
             "typeCode", "COMP",
             "constraints.validation.error", "HistologicalExamAssociationTypeCode HistologicalExamAssociationHistologicalPlacentalExam"
           });                                                                                                                                                                                            
    }

  /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrAutopsyPerformanceHistologicalExamAssociationHistologicalPlacentalExam</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsbrAutopsyPerformanceHistologicalExamAssociationHistologicalPlacentalExamAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrAutopsyPerformanceHistologicalExamAssociationHistologicalPlacentalExam";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
        addAnnotation
          (autopsyPerformanceEClass, 
           source, 
           new String[] 
           {
             "code.code", "73767-6",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Histological placental examination was performed",
             "constraints.validation.error", "HistologicalPlacentalExamCode HistologicalPlacentalExamCodeP HistologicalPlacentalExamValue HistologicalPlacentalExamValueP",
             "constraints.validation.dependOn.HistologicalPlacentalExamCode", "HistologicalPlacentalExamCodeP",
             "value.codeSystem", "2.16.840.1.113883.6.96",
             "value.codeSystemName", "SNOMEDCT"
           });                                                                                                                                                                                           
    }

  /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetalDeliveryTimeparticipatingLocation</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsbrFetalDeliveryTimeparticipatingLocationAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetalDeliveryTimeparticipatingLocation";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
        addAnnotation
          (fetalDeliveryTimeEClass, 
           source, 
           new String[] 
           {
             "typeCode", "LOC",
             "constraints.validation.error", "participatingLocationTypeCode participatingLocationLocationRole"
           });                                                                                                                                        
    }

  /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetalDeliveryTimeparticipatingLocationLocationRole</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsbrFetalDeliveryTimeparticipatingLocationLocationRoleAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetalDeliveryTimeparticipatingLocationLocationRole";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
        addAnnotation
          (fetalDeliveryTimeEClass, 
           source, 
           new String[] 
           {
             "classCode", "SDLOC",
             "constraints.validation.error", "LocationRoleClassCode LocationRoleCode LocationRoleCodeP LocationRoleLocation",
             "constraints.validation.warning", "LocationRoleId",
             "code.codeSystem", "2.16.840.1.113883.6.96",
             "code.codeSystemName", "SNOMEDCT",
             "constraints.validation.info", "LocationRoleAddr"
           });                                                                                                                                       
    }

  /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetalDeliveryTimeparticipatingLocationLocationRoleLocation</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createVsbrFetalDeliveryTimeparticipatingLocationLocationRoleLocationAnnotations()
    {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetalDeliveryTimeparticipatingLocationLocationRoleLocation";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
        addAnnotation
          (fetalDeliveryTimeEClass, 
           source, 
           new String[] 
           {
             "classCode", "PLC",
             "constraints.validation.error", "LocationClassCode LocationDeterminerCode",
             "determinerCode", "INSTANCE",
             "constraints.validation.warning", "LocationName",
             "constraints.validation.info", "LocationDesc"
           });                                                                                                                                      
    }

  /**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthorAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
        addAnnotation
          (reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, 
           source, 
           new String[] 
           {
             "typeCode", "AUT",
             "constraints.validation.error", "AuthorTypeCode AuthorAssignedAuthor"
           });                                                                                                               
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
        addAnnotation
          (reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, 
           source, 
           new String[] 
           {
             "classCode", "ASSIGNED",
             "constraints.validation.error", "AssignedAuthorClassCode AssignedAuthorId"
           });                                                                                                              
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
        addAnnotation
          (reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, 
           source, 
           new String[] 
           {
             "typeCode", "RCT",
             "constraints.validation.error", "RecordTargetTypeCode RecordTargetPatientRole"
           });                                                                                                                  
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRole</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRoleAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRole";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
        addAnnotation
          (reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, 
           source, 
           new String[] 
           {
             "classCode", "PAT",
             "constraints.validation.error", "PatientRoleClassCode PatientRoleId PatientRolePatient",
             "constraints.validation.warning", "PatientRoleAddr"
           });                                                                                                                 
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRolePatient</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRolePatientAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRolePatient";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
        addAnnotation
          (reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, 
           source, 
           new String[] 
           {
             "classCode", "PSN",
             "constraints.validation.error", "PatientClassCode PatientDeterminerCode PatientName",
             "determinerCode", "INSTANCE"
           });                                                                                                                
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodianAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
        addAnnotation
          (reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, 
           source, 
           new String[] 
           {
             "typeCode", "CST",
             "constraints.validation.error", "CustodianTypeCode CustodianAssignedCustodian"
           });                                                                                                             
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodian</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodian";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
        addAnnotation
          (reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, 
           source, 
           new String[] 
           {
             "classCode", "ASSIGNED",
             "constraints.validation.error", "AssignedCustodianClassCode AssignedCustodianRepresentedCustodianOrganization"
           });                                                                                                            
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganization</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganization";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
        addAnnotation
          (reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, 
           source, 
           new String[] 
           {
             "classCode", "ORG",
             "constraints.validation.error", "CustodianOrganizationClassCode CustodianOrganizationDeterminerCode CustodianOrganizationId",
             "determinerCode", "INSTANCE"
           });                                                                                                           
    }

} // VsbrPackageImpl
