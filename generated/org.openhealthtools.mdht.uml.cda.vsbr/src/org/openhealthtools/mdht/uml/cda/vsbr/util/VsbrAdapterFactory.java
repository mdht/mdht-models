/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.Section;

import org.openhealthtools.mdht.uml.cda.vsbr.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage
 * @generated
 */
public class VsbrAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VsbrPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VsbrAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VsbrPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VsbrSwitch<Adapter> modelSwitch = new VsbrSwitch<Adapter>() {
		@Override
		public Adapter caseReportingBirthInformationfromaclinicalsettingtovitalrecords(
				ReportingBirthInformationfromaclinicalsettingtovitalrecords object) {
			return createReportingBirthInformationfromaclinicalsettingtovitalrecordsAdapter();
		}

		@Override
		public Adapter caseAntenatalTestingandSurveillanceSection(AntenatalTestingandSurveillanceSection object) {
			return createAntenatalTestingandSurveillanceSectionAdapter();
		}

		@Override
		public Adapter casePrenatalCare(PrenatalCare object) {
			return createPrenatalCareAdapter();
		}

		@Override
		public Adapter casePriorPregnancyHistorySection(PriorPregnancyHistorySection object) {
			return createPriorPregnancyHistorySectionAdapter();
		}

		@Override
		public Adapter caseDateofLastLiveBirth(DateofLastLiveBirth object) {
			return createDateofLastLiveBirthAdapter();
		}

		@Override
		public Adapter caseLastMenstrualPeriodDate(LastMenstrualPeriodDate object) {
			return createLastMenstrualPeriodDateAdapter();
		}

		@Override
		public Adapter caseNumberofBirthsNowLiving(NumberofBirthsNowLiving object) {
			return createNumberofBirthsNowLivingAdapter();
		}

		@Override
		public Adapter caseNumberofLiveBirthsnowDead(NumberofLiveBirthsnowDead object) {
			return createNumberofLiveBirthsnowDeadAdapter();
		}

		@Override
		public Adapter caseOtherPregnancyOutcome(OtherPregnancyOutcome object) {
			return createOtherPregnancyOutcomeAdapter();
		}

		@Override
		public Adapter caseEstimateofGestation(EstimateofGestation object) {
			return createEstimateofGestationAdapter();
		}

		@Override
		public Adapter caseHistoryofInfectionSection(HistoryofInfectionSection object) {
			return createHistoryofInfectionSectionAdapter();
		}

		@Override
		public Adapter caseInfectionPresent(InfectionPresent object) {
			return createInfectionPresentAdapter();
		}

		@Override
		public Adapter caseNewbornDeliverySection(NewbornDeliverySection object) {
			return createNewbornDeliverySectionAdapter();
		}

		@Override
		public Adapter caseBirthOrder(BirthOrder object) {
			return createBirthOrderAdapter();
		}

		@Override
		public Adapter caseNumberofInfantsBornAlive(NumberofInfantsBornAlive object) {
			return createNumberofInfantsBornAliveAdapter();
		}

		@Override
		public Adapter caseCongenitalAnomaly(CongenitalAnomaly object) {
			return createCongenitalAnomalyAdapter();
		}

		@Override
		public Adapter caseNewbornsVitalSignsSection(NewbornsVitalSignsSection object) {
			return createNewbornsVitalSignsSectionAdapter();
		}

		@Override
		public Adapter caseVitalSignsObservation(VitalSignsObservation object) {
			return createVitalSignsObservationAdapter();
		}

		@Override
		public Adapter caseAbnormalConditionoftheNewborn(AbnormalConditionoftheNewborn object) {
			return createAbnormalConditionoftheNewbornAdapter();
		}

		@Override
		public Adapter caseInfantLiving(InfantLiving object) {
			return createInfantLivingAdapter();
		}

		@Override
		public Adapter caseInfantBreastfed(InfantBreastfed object) {
			return createInfantBreastfedAdapter();
		}

		@Override
		public Adapter caseInfantTransfer(InfantTransfer object) {
			return createInfantTransferAdapter();
		}

		@Override
		public Adapter casePlurality(Plurality object) {
			return createPluralityAdapter();
		}

		@Override
		public Adapter caseLaborandDeliverySection(LaborandDeliverySection object) {
			return createLaborandDeliverySectionAdapter();
		}

		@Override
		public Adapter caseLaborandDeliveryInformation(LaborandDeliveryInformation object) {
			return createLaborandDeliveryInformationAdapter();
		}

		@Override
		public Adapter caseCharacteristicofLaborandDelivery(CharacteristicofLaborandDelivery object) {
			return createCharacteristicofLaborandDeliveryAdapter();
		}

		@Override
		public Adapter casePlannedHomeBirth(PlannedHomeBirth object) {
			return createPlannedHomeBirthAdapter();
		}

		@Override
		public Adapter caseMaternalTransfer(MaternalTransfer object) {
			return createMaternalTransferAdapter();
		}

		@Override
		public Adapter caseMaternalMorbidity(MaternalMorbidity object) {
			return createMaternalMorbidityAdapter();
		}

		@Override
		public Adapter casePregnancyRiskFactor(PregnancyRiskFactor object) {
			return createPregnancyRiskFactorAdapter();
		}

		@Override
		public Adapter caseMothersVitalSignsSection(MothersVitalSignsSection object) {
			return createMothersVitalSignsSectionAdapter();
		}

		@Override
		public Adapter caseLaborandDeliveryProcedureSection(LaborandDeliveryProcedureSection object) {
			return createLaborandDeliveryProcedureSectionAdapter();
		}

		@Override
		public Adapter caseObstetricProcedure(ObstetricProcedure object) {
			return createObstetricProcedureAdapter();
		}

		@Override
		public Adapter caseMethodofDelivery(MethodofDelivery object) {
			return createMethodofDeliveryAdapter();
		}

		@Override
		public Adapter caseOnsetofLabor(OnsetofLabor object) {
			return createOnsetofLaborAdapter();
		}

		@Override
		public Adapter caseFetalDeliverySection(FetalDeliverySection object) {
			return createFetalDeliverySectionAdapter();
		}

		@Override
		public Adapter caseAutopsyPerformance(AutopsyPerformance object) {
			return createAutopsyPerformanceAdapter();
		}

		@Override
		public Adapter caseFetalDeathOccurrance(FetalDeathOccurrance object) {
			return createFetalDeathOccurranceAdapter();
		}

		@Override
		public Adapter caseFetalDeliveryTime(FetalDeliveryTime object) {
			return createFetalDeliveryTimeAdapter();
		}

		@Override
		public Adapter caseReportingFetalDeathInformationfromaclinicalsettingtovitalrecords(
				ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords object) {
			return createReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAdapter();
		}

		@Override
		public Adapter caseInfrastructureRoot(InfrastructureRoot object) {
			return createInfrastructureRootAdapter();
		}

		@Override
		public Adapter caseAct(Act object) {
			return createActAdapter();
		}

		@Override
		public Adapter caseClinicalDocument(ClinicalDocument object) {
			return createClinicalDocumentAdapter();
		}

		@Override
		public Adapter caseSection(Section object) {
			return createSectionAdapter();
		}

		@Override
		public Adapter caseClinicalStatement(ClinicalStatement object) {
			return createClinicalStatementAdapter();
		}

		@Override
		public Adapter caseCDA_Act(org.openhealthtools.mdht.uml.cda.Act object) {
			return createCDA_ActAdapter();
		}

		@Override
		public Adapter caseObservation(Observation object) {
			return createObservationAdapter();
		}

		@Override
		public Adapter caseProcedure(Procedure object) {
			return createProcedureAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords <em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords
	 * @generated
	 */
	public Adapter createReportingBirthInformationfromaclinicalsettingtovitalrecordsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.AntenatalTestingandSurveillanceSection <em>Antenatal Testingand Surveillance Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.AntenatalTestingandSurveillanceSection
	 * @generated
	 */
	public Adapter createAntenatalTestingandSurveillanceSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare <em>Prenatal Care</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare
	 * @generated
	 */
	public Adapter createPrenatalCareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection <em>Prior Pregnancy History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection
	 * @generated
	 */
	public Adapter createPriorPregnancyHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.DateofLastLiveBirth <em>Dateof Last Live Birth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.DateofLastLiveBirth
	 * @generated
	 */
	public Adapter createDateofLastLiveBirthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate <em>Last Menstrual Period Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate
	 * @generated
	 */
	public Adapter createLastMenstrualPeriodDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsNowLiving <em>Numberof Births Now Living</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsNowLiving
	 * @generated
	 */
	public Adapter createNumberofBirthsNowLivingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsnowDead <em>Numberof Live Birthsnow Dead</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsnowDead
	 * @generated
	 */
	public Adapter createNumberofLiveBirthsnowDeadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcome <em>Other Pregnancy Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcome
	 * @generated
	 */
	public Adapter createOtherPregnancyOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.EstimateofGestation <em>Estimateof Gestation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.EstimateofGestation
	 * @generated
	 */
	public Adapter createEstimateofGestationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionSection <em>Historyof Infection Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionSection
	 * @generated
	 */
	public Adapter createHistoryofInfectionSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresent <em>Infection Present</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresent
	 * @generated
	 */
	public Adapter createInfectionPresentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection <em>Newborn Delivery Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection
	 * @generated
	 */
	public Adapter createNewbornDeliverySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder <em>Birth Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder
	 * @generated
	 */
	public Adapter createBirthOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofInfantsBornAlive <em>Numberof Infants Born Alive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.NumberofInfantsBornAlive
	 * @generated
	 */
	public Adapter createNumberofInfantsBornAliveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly <em>Congenital Anomaly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly
	 * @generated
	 */
	public Adapter createCongenitalAnomalyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection <em>Newborns Vital Signs Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection
	 * @generated
	 */
	public Adapter createNewbornsVitalSignsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.VitalSignsObservation <em>Vital Signs Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.VitalSignsObservation
	 * @generated
	 */
	public Adapter createVitalSignsObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionoftheNewborn <em>Abnormal Conditionofthe Newborn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionoftheNewborn
	 * @generated
	 */
	public Adapter createAbnormalConditionoftheNewbornAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantLiving <em>Infant Living</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.InfantLiving
	 * @generated
	 */
	public Adapter createInfantLivingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantBreastfed <em>Infant Breastfed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.InfantBreastfed
	 * @generated
	 */
	public Adapter createInfantBreastfedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantTransfer <em>Infant Transfer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.InfantTransfer
	 * @generated
	 */
	public Adapter createInfantTransferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.Plurality <em>Plurality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.Plurality
	 * @generated
	 */
	public Adapter createPluralityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection <em>Laborand Delivery Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection
	 * @generated
	 */
	public Adapter createLaborandDeliverySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation <em>Laborand Delivery Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation
	 * @generated
	 */
	public Adapter createLaborandDeliveryInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery <em>Characteristicof Laborand Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery
	 * @generated
	 */
	public Adapter createCharacteristicofLaborandDeliveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.PlannedHomeBirth <em>Planned Home Birth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.PlannedHomeBirth
	 * @generated
	 */
	public Adapter createPlannedHomeBirthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalTransfer <em>Maternal Transfer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.MaternalTransfer
	 * @generated
	 */
	public Adapter createMaternalTransferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity <em>Maternal Morbidity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity
	 * @generated
	 */
	public Adapter createMaternalMorbidityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor <em>Pregnancy Risk Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor
	 * @generated
	 */
	public Adapter createPregnancyRiskFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection <em>Mothers Vital Signs Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection
	 * @generated
	 */
	public Adapter createMothersVitalSignsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection <em>Laborand Delivery Procedure Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection
	 * @generated
	 */
	public Adapter createLaborandDeliveryProcedureSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedure <em>Obstetric Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedure
	 * @generated
	 */
	public Adapter createObstetricProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery <em>Methodof Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery
	 * @generated
	 */
	public Adapter createMethodofDeliveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor <em>Onsetof Labor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor
	 * @generated
	 */
	public Adapter createOnsetofLaborAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection <em>Fetal Delivery Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection
	 * @generated
	 */
	public Adapter createFetalDeliverySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance <em>Autopsy Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance
	 * @generated
	 */
	public Adapter createAutopsyPerformanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathOccurrance <em>Fetal Death Occurrance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathOccurrance
	 * @generated
	 */
	public Adapter createFetalDeathOccurranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliveryTime <em>Fetal Delivery Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliveryTime
	 * @generated
	 */
	public Adapter createFetalDeliveryTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords <em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords
	 * @generated
	 */
	public Adapter createReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot <em>Infrastructure Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot
	 * @generated
	 */
	public Adapter createInfrastructureRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.Act
	 * @generated
	 */
	public Adapter createActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument <em>Clinical Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument
	 * @generated
	 */
	public Adapter createClinicalDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement <em>Clinical Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalStatement
	 * @generated
	 */
	public Adapter createClinicalStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Act
	 * @generated
	 */
	public Adapter createCDA_ActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Observation
	 * @generated
	 */
	public Adapter createObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure
	 * @generated
	 */
	public Adapter createProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // VsbrAdapterFactory
