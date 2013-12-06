/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage
 * @generated
 */
public class VsbrSwitch<T> {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static VsbrPackage modelPackage;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public VsbrSwitch() {
    if (modelPackage == null)
    {
      modelPackage = VsbrPackage.eINSTANCE;
    }
  }

	/**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	public T doSwitch(EObject theEObject) {
    return doSwitch(theEObject.eClass(), theEObject);
  }

	/**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

	/**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID)
    {
      case VsbrPackage.REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS:
      {
        ReportingBirthInformationfromaclinicalsettingtovitalrecords reportingBirthInformationfromaclinicalsettingtovitalrecords = (ReportingBirthInformationfromaclinicalsettingtovitalrecords)theEObject;
        T result = caseReportingBirthInformationfromaclinicalsettingtovitalrecords(reportingBirthInformationfromaclinicalsettingtovitalrecords);
        if (result == null) result = caseClinicalDocument(reportingBirthInformationfromaclinicalsettingtovitalrecords);
        if (result == null) result = caseAct(reportingBirthInformationfromaclinicalsettingtovitalrecords);
        if (result == null) result = caseInfrastructureRoot(reportingBirthInformationfromaclinicalsettingtovitalrecords);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.PRENATAL_TESTINGAND_SURVEILLANCE_SECTION:
      {
        PrenatalTestingandSurveillanceSection prenatalTestingandSurveillanceSection = (PrenatalTestingandSurveillanceSection)theEObject;
        T result = casePrenatalTestingandSurveillanceSection(prenatalTestingandSurveillanceSection);
        if (result == null) result = caseSection(prenatalTestingandSurveillanceSection);
        if (result == null) result = caseAct(prenatalTestingandSurveillanceSection);
        if (result == null) result = caseInfrastructureRoot(prenatalTestingandSurveillanceSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.PRENATAL_CARE:
      {
        PrenatalCare prenatalCare = (PrenatalCare)theEObject;
        T result = casePrenatalCare(prenatalCare);
        if (result == null) result = caseCDA_Act(prenatalCare);
        if (result == null) result = caseClinicalStatement(prenatalCare);
        if (result == null) result = caseAct(prenatalCare);
        if (result == null) result = caseInfrastructureRoot(prenatalCare);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.PRIOR_PREGNANCY_HISTORY_SECTION:
      {
        PriorPregnancyHistorySection priorPregnancyHistorySection = (PriorPregnancyHistorySection)theEObject;
        T result = casePriorPregnancyHistorySection(priorPregnancyHistorySection);
        if (result == null) result = caseSection(priorPregnancyHistorySection);
        if (result == null) result = caseAct(priorPregnancyHistorySection);
        if (result == null) result = caseInfrastructureRoot(priorPregnancyHistorySection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.DATEOF_LAST_LIVE_BIRTH:
      {
        DateofLastLiveBirth dateofLastLiveBirth = (DateofLastLiveBirth)theEObject;
        T result = caseDateofLastLiveBirth(dateofLastLiveBirth);
        if (result == null) result = caseObservation(dateofLastLiveBirth);
        if (result == null) result = caseClinicalStatement(dateofLastLiveBirth);
        if (result == null) result = caseAct(dateofLastLiveBirth);
        if (result == null) result = caseInfrastructureRoot(dateofLastLiveBirth);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.LAST_MENSTRUAL_PERIOD_DATE:
      {
        LastMenstrualPeriodDate lastMenstrualPeriodDate = (LastMenstrualPeriodDate)theEObject;
        T result = caseLastMenstrualPeriodDate(lastMenstrualPeriodDate);
        if (result == null) result = caseObservation(lastMenstrualPeriodDate);
        if (result == null) result = caseClinicalStatement(lastMenstrualPeriodDate);
        if (result == null) result = caseAct(lastMenstrualPeriodDate);
        if (result == null) result = caseInfrastructureRoot(lastMenstrualPeriodDate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.NUMBEROF_BIRTHS_NOW_LIVING:
      {
        NumberofBirthsNowLiving numberofBirthsNowLiving = (NumberofBirthsNowLiving)theEObject;
        T result = caseNumberofBirthsNowLiving(numberofBirthsNowLiving);
        if (result == null) result = caseObservation(numberofBirthsNowLiving);
        if (result == null) result = caseClinicalStatement(numberofBirthsNowLiving);
        if (result == null) result = caseAct(numberofBirthsNowLiving);
        if (result == null) result = caseInfrastructureRoot(numberofBirthsNowLiving);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.NUMBEROF_LIVE_BIRTHSNOW_DEAD:
      {
        NumberofLiveBirthsnowDead numberofLiveBirthsnowDead = (NumberofLiveBirthsnowDead)theEObject;
        T result = caseNumberofLiveBirthsnowDead(numberofLiveBirthsnowDead);
        if (result == null) result = caseObservation(numberofLiveBirthsnowDead);
        if (result == null) result = caseClinicalStatement(numberofLiveBirthsnowDead);
        if (result == null) result = caseAct(numberofLiveBirthsnowDead);
        if (result == null) result = caseInfrastructureRoot(numberofLiveBirthsnowDead);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.OTHER_PREGNANCY_OUTCOME:
      {
        OtherPregnancyOutcome otherPregnancyOutcome = (OtherPregnancyOutcome)theEObject;
        T result = caseOtherPregnancyOutcome(otherPregnancyOutcome);
        if (result == null) result = caseObservation(otherPregnancyOutcome);
        if (result == null) result = caseClinicalStatement(otherPregnancyOutcome);
        if (result == null) result = caseAct(otherPregnancyOutcome);
        if (result == null) result = caseInfrastructureRoot(otherPregnancyOutcome);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.ESTIMATEOF_GESTATION:
      {
        EstimateofGestation estimateofGestation = (EstimateofGestation)theEObject;
        T result = caseEstimateofGestation(estimateofGestation);
        if (result == null) result = caseObservation(estimateofGestation);
        if (result == null) result = caseClinicalStatement(estimateofGestation);
        if (result == null) result = caseAct(estimateofGestation);
        if (result == null) result = caseInfrastructureRoot(estimateofGestation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.NEWBORN_DELIVERY_SECTION:
      {
        NewbornDeliverySection newbornDeliverySection = (NewbornDeliverySection)theEObject;
        T result = caseNewbornDeliverySection(newbornDeliverySection);
        if (result == null) result = caseSection(newbornDeliverySection);
        if (result == null) result = caseAct(newbornDeliverySection);
        if (result == null) result = caseInfrastructureRoot(newbornDeliverySection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.BIRTH_ORDER:
      {
        BirthOrder birthOrder = (BirthOrder)theEObject;
        T result = caseBirthOrder(birthOrder);
        if (result == null) result = caseObservation(birthOrder);
        if (result == null) result = caseClinicalStatement(birthOrder);
        if (result == null) result = caseAct(birthOrder);
        if (result == null) result = caseInfrastructureRoot(birthOrder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.NUMBEROF_INFANTS_BORN_ALIVE:
      {
        NumberofInfantsBornAlive numberofInfantsBornAlive = (NumberofInfantsBornAlive)theEObject;
        T result = caseNumberofInfantsBornAlive(numberofInfantsBornAlive);
        if (result == null) result = caseObservation(numberofInfantsBornAlive);
        if (result == null) result = caseClinicalStatement(numberofInfantsBornAlive);
        if (result == null) result = caseAct(numberofInfantsBornAlive);
        if (result == null) result = caseInfrastructureRoot(numberofInfantsBornAlive);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.CONGENITAL_ANOMALY:
      {
        CongenitalAnomaly congenitalAnomaly = (CongenitalAnomaly)theEObject;
        T result = caseCongenitalAnomaly(congenitalAnomaly);
        if (result == null) result = caseObservation(congenitalAnomaly);
        if (result == null) result = caseClinicalStatement(congenitalAnomaly);
        if (result == null) result = caseAct(congenitalAnomaly);
        if (result == null) result = caseInfrastructureRoot(congenitalAnomaly);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.NEWBORNS_VITAL_SIGNS_SECTION:
      {
        NewbornsVitalSignsSection newbornsVitalSignsSection = (NewbornsVitalSignsSection)theEObject;
        T result = caseNewbornsVitalSignsSection(newbornsVitalSignsSection);
        if (result == null) result = caseSection(newbornsVitalSignsSection);
        if (result == null) result = caseAct(newbornsVitalSignsSection);
        if (result == null) result = caseInfrastructureRoot(newbornsVitalSignsSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.NEWBORNS_VITAL_SIGNS_OBSERVATION:
      {
        NewbornsVitalSignsObservation newbornsVitalSignsObservation = (NewbornsVitalSignsObservation)theEObject;
        T result = caseNewbornsVitalSignsObservation(newbornsVitalSignsObservation);
        if (result == null) result = caseObservation(newbornsVitalSignsObservation);
        if (result == null) result = caseClinicalStatement(newbornsVitalSignsObservation);
        if (result == null) result = caseAct(newbornsVitalSignsObservation);
        if (result == null) result = caseInfrastructureRoot(newbornsVitalSignsObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.ABNORMAL_CONDITIONOFTHE_NEWBORN:
      {
        AbnormalConditionoftheNewborn abnormalConditionoftheNewborn = (AbnormalConditionoftheNewborn)theEObject;
        T result = caseAbnormalConditionoftheNewborn(abnormalConditionoftheNewborn);
        if (result == null) result = caseObservation(abnormalConditionoftheNewborn);
        if (result == null) result = caseClinicalStatement(abnormalConditionoftheNewborn);
        if (result == null) result = caseAct(abnormalConditionoftheNewborn);
        if (result == null) result = caseInfrastructureRoot(abnormalConditionoftheNewborn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.INFANT_LIVING:
      {
        InfantLiving infantLiving = (InfantLiving)theEObject;
        T result = caseInfantLiving(infantLiving);
        if (result == null) result = caseObservation(infantLiving);
        if (result == null) result = caseClinicalStatement(infantLiving);
        if (result == null) result = caseAct(infantLiving);
        if (result == null) result = caseInfrastructureRoot(infantLiving);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.INFANT_BREASTFED:
      {
        InfantBreastfed infantBreastfed = (InfantBreastfed)theEObject;
        T result = caseInfantBreastfed(infantBreastfed);
        if (result == null) result = caseObservation(infantBreastfed);
        if (result == null) result = caseClinicalStatement(infantBreastfed);
        if (result == null) result = caseAct(infantBreastfed);
        if (result == null) result = caseInfrastructureRoot(infantBreastfed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.INFANT_TRANSFER:
      {
        InfantTransfer infantTransfer = (InfantTransfer)theEObject;
        T result = caseInfantTransfer(infantTransfer);
        if (result == null) result = caseObservation(infantTransfer);
        if (result == null) result = caseClinicalStatement(infantTransfer);
        if (result == null) result = caseAct(infantTransfer);
        if (result == null) result = caseInfrastructureRoot(infantTransfer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.PLURALITY:
      {
        Plurality plurality = (Plurality)theEObject;
        T result = casePlurality(plurality);
        if (result == null) result = caseObservation(plurality);
        if (result == null) result = caseClinicalStatement(plurality);
        if (result == null) result = caseAct(plurality);
        if (result == null) result = caseInfrastructureRoot(plurality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.ASSESSMENTS_SECTION:
      {
        AssessmentsSection assessmentsSection = (AssessmentsSection)theEObject;
        T result = caseAssessmentsSection(assessmentsSection);
        if (result == null) result = caseSection(assessmentsSection);
        if (result == null) result = caseAct(assessmentsSection);
        if (result == null) result = caseInfrastructureRoot(assessmentsSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.ASSESSMENTS_OBSERVATION:
      {
        AssessmentsObservation assessmentsObservation = (AssessmentsObservation)theEObject;
        T result = caseAssessmentsObservation(assessmentsObservation);
        if (result == null) result = caseObservation(assessmentsObservation);
        if (result == null) result = caseClinicalStatement(assessmentsObservation);
        if (result == null) result = caseAct(assessmentsObservation);
        if (result == null) result = caseInfrastructureRoot(assessmentsObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.LABORAND_DELIVERY_SECTION:
      {
        LaborandDeliverySection laborandDeliverySection = (LaborandDeliverySection)theEObject;
        T result = caseLaborandDeliverySection(laborandDeliverySection);
        if (result == null) result = caseSection(laborandDeliverySection);
        if (result == null) result = caseAct(laborandDeliverySection);
        if (result == null) result = caseInfrastructureRoot(laborandDeliverySection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.LABORAND_DELIVERY_INFORMATION:
      {
        LaborandDeliveryInformation laborandDeliveryInformation = (LaborandDeliveryInformation)theEObject;
        T result = caseLaborandDeliveryInformation(laborandDeliveryInformation);
        if (result == null) result = caseCDA_Act(laborandDeliveryInformation);
        if (result == null) result = caseClinicalStatement(laborandDeliveryInformation);
        if (result == null) result = caseAct(laborandDeliveryInformation);
        if (result == null) result = caseInfrastructureRoot(laborandDeliveryInformation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.CHARACTERISTICOF_LABORAND_DELIVERY:
      {
        CharacteristicofLaborandDelivery characteristicofLaborandDelivery = (CharacteristicofLaborandDelivery)theEObject;
        T result = caseCharacteristicofLaborandDelivery(characteristicofLaborandDelivery);
        if (result == null) result = caseObservation(characteristicofLaborandDelivery);
        if (result == null) result = caseClinicalStatement(characteristicofLaborandDelivery);
        if (result == null) result = caseAct(characteristicofLaborandDelivery);
        if (result == null) result = caseInfrastructureRoot(characteristicofLaborandDelivery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.PLANNED_HOME_BIRTH:
      {
        PlannedHomeBirth plannedHomeBirth = (PlannedHomeBirth)theEObject;
        T result = casePlannedHomeBirth(plannedHomeBirth);
        if (result == null) result = caseObservation(plannedHomeBirth);
        if (result == null) result = caseClinicalStatement(plannedHomeBirth);
        if (result == null) result = caseAct(plannedHomeBirth);
        if (result == null) result = caseInfrastructureRoot(plannedHomeBirth);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.MATERNAL_TRANSFER:
      {
        MaternalTransfer maternalTransfer = (MaternalTransfer)theEObject;
        T result = caseMaternalTransfer(maternalTransfer);
        if (result == null) result = caseObservation(maternalTransfer);
        if (result == null) result = caseClinicalStatement(maternalTransfer);
        if (result == null) result = caseAct(maternalTransfer);
        if (result == null) result = caseInfrastructureRoot(maternalTransfer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.MATERNAL_MORBIDITY:
      {
        MaternalMorbidity maternalMorbidity = (MaternalMorbidity)theEObject;
        T result = caseMaternalMorbidity(maternalMorbidity);
        if (result == null) result = caseObservation(maternalMorbidity);
        if (result == null) result = caseClinicalStatement(maternalMorbidity);
        if (result == null) result = caseAct(maternalMorbidity);
        if (result == null) result = caseInfrastructureRoot(maternalMorbidity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.PREGNANCY_RISK_FACTOR:
      {
        PregnancyRiskFactor pregnancyRiskFactor = (PregnancyRiskFactor)theEObject;
        T result = casePregnancyRiskFactor(pregnancyRiskFactor);
        if (result == null) result = caseObservation(pregnancyRiskFactor);
        if (result == null) result = caseClinicalStatement(pregnancyRiskFactor);
        if (result == null) result = caseAct(pregnancyRiskFactor);
        if (result == null) result = caseInfrastructureRoot(pregnancyRiskFactor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.LABORAND_DELIVERY_PROCEDURE_SECTION:
      {
        LaborandDeliveryProcedureSection laborandDeliveryProcedureSection = (LaborandDeliveryProcedureSection)theEObject;
        T result = caseLaborandDeliveryProcedureSection(laborandDeliveryProcedureSection);
        if (result == null) result = caseSection(laborandDeliveryProcedureSection);
        if (result == null) result = caseAct(laborandDeliveryProcedureSection);
        if (result == null) result = caseInfrastructureRoot(laborandDeliveryProcedureSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.OBSTETRIC_PROCEDURE:
      {
        ObstetricProcedure obstetricProcedure = (ObstetricProcedure)theEObject;
        T result = caseObstetricProcedure(obstetricProcedure);
        if (result == null) result = caseProcedure(obstetricProcedure);
        if (result == null) result = caseClinicalStatement(obstetricProcedure);
        if (result == null) result = caseAct(obstetricProcedure);
        if (result == null) result = caseInfrastructureRoot(obstetricProcedure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.METHODOF_DELIVERY:
      {
        MethodofDelivery methodofDelivery = (MethodofDelivery)theEObject;
        T result = caseMethodofDelivery(methodofDelivery);
        if (result == null) result = caseProcedure(methodofDelivery);
        if (result == null) result = caseClinicalStatement(methodofDelivery);
        if (result == null) result = caseAct(methodofDelivery);
        if (result == null) result = caseInfrastructureRoot(methodofDelivery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.ONSETOF_LABOR:
      {
        OnsetofLabor onsetofLabor = (OnsetofLabor)theEObject;
        T result = caseOnsetofLabor(onsetofLabor);
        if (result == null) result = caseObservation(onsetofLabor);
        if (result == null) result = caseClinicalStatement(onsetofLabor);
        if (result == null) result = caseAct(onsetofLabor);
        if (result == null) result = caseInfrastructureRoot(onsetofLabor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.MOTHERS_VITAL_SIGNS_SECTION:
      {
        MothersVitalSignsSection mothersVitalSignsSection = (MothersVitalSignsSection)theEObject;
        T result = caseMothersVitalSignsSection(mothersVitalSignsSection);
        if (result == null) result = caseSection(mothersVitalSignsSection);
        if (result == null) result = caseAct(mothersVitalSignsSection);
        if (result == null) result = caseInfrastructureRoot(mothersVitalSignsSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.MOTHERS_VITAL_SIGNS_OBSERVATION:
      {
        MothersVitalSignsObservation mothersVitalSignsObservation = (MothersVitalSignsObservation)theEObject;
        T result = caseMothersVitalSignsObservation(mothersVitalSignsObservation);
        if (result == null) result = caseObservation(mothersVitalSignsObservation);
        if (result == null) result = caseClinicalStatement(mothersVitalSignsObservation);
        if (result == null) result = caseAct(mothersVitalSignsObservation);
        if (result == null) result = caseInfrastructureRoot(mothersVitalSignsObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.HISTORYOF_INFECTION_LIVE_BIRTH_SECTION:
      {
        HistoryofInfectionLiveBirthSection historyofInfectionLiveBirthSection = (HistoryofInfectionLiveBirthSection)theEObject;
        T result = caseHistoryofInfectionLiveBirthSection(historyofInfectionLiveBirthSection);
        if (result == null) result = caseSection(historyofInfectionLiveBirthSection);
        if (result == null) result = caseAct(historyofInfectionLiveBirthSection);
        if (result == null) result = caseInfrastructureRoot(historyofInfectionLiveBirthSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.INFECTION_PRESENT_LIVE_BIRTH:
      {
        InfectionPresentLiveBirth infectionPresentLiveBirth = (InfectionPresentLiveBirth)theEObject;
        T result = caseInfectionPresentLiveBirth(infectionPresentLiveBirth);
        if (result == null) result = caseObservation(infectionPresentLiveBirth);
        if (result == null) result = caseClinicalStatement(infectionPresentLiveBirth);
        if (result == null) result = caseAct(infectionPresentLiveBirth);
        if (result == null) result = caseInfrastructureRoot(infectionPresentLiveBirth);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.FETAL_DELIVERY_SECTION:
      {
        FetalDeliverySection fetalDeliverySection = (FetalDeliverySection)theEObject;
        T result = caseFetalDeliverySection(fetalDeliverySection);
        if (result == null) result = caseSection(fetalDeliverySection);
        if (result == null) result = caseAct(fetalDeliverySection);
        if (result == null) result = caseInfrastructureRoot(fetalDeliverySection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.AUTOPSY_PERFORMANCE:
      {
        AutopsyPerformance autopsyPerformance = (AutopsyPerformance)theEObject;
        T result = caseAutopsyPerformance(autopsyPerformance);
        if (result == null) result = caseObservation(autopsyPerformance);
        if (result == null) result = caseClinicalStatement(autopsyPerformance);
        if (result == null) result = caseAct(autopsyPerformance);
        if (result == null) result = caseInfrastructureRoot(autopsyPerformance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.FETAL_DEATH_OCCURRANCE:
      {
        FetalDeathOccurrance fetalDeathOccurrance = (FetalDeathOccurrance)theEObject;
        T result = caseFetalDeathOccurrance(fetalDeathOccurrance);
        if (result == null) result = caseObservation(fetalDeathOccurrance);
        if (result == null) result = caseClinicalStatement(fetalDeathOccurrance);
        if (result == null) result = caseAct(fetalDeathOccurrance);
        if (result == null) result = caseInfrastructureRoot(fetalDeathOccurrance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.FETAL_DELIVERY_TIME:
      {
        FetalDeliveryTime fetalDeliveryTime = (FetalDeliveryTime)theEObject;
        T result = caseFetalDeliveryTime(fetalDeliveryTime);
        if (result == null) result = caseObservation(fetalDeliveryTime);
        if (result == null) result = caseClinicalStatement(fetalDeliveryTime);
        if (result == null) result = caseAct(fetalDeliveryTime);
        if (result == null) result = caseInfrastructureRoot(fetalDeliveryTime);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS:
      {
        ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords = (ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords)theEObject;
        T result = caseReportingFetalDeathInformationfromaclinicalsettingtovitalrecords(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords);
        if (result == null) result = caseClinicalDocument(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords);
        if (result == null) result = caseAct(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords);
        if (result == null) result = caseInfrastructureRoot(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.HISTORYOF_INFECTION_FETAL_DEATH_SECTION:
      {
        HistoryofInfectionFetalDeathSection historyofInfectionFetalDeathSection = (HistoryofInfectionFetalDeathSection)theEObject;
        T result = caseHistoryofInfectionFetalDeathSection(historyofInfectionFetalDeathSection);
        if (result == null) result = caseSection(historyofInfectionFetalDeathSection);
        if (result == null) result = caseAct(historyofInfectionFetalDeathSection);
        if (result == null) result = caseInfrastructureRoot(historyofInfectionFetalDeathSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.INFECTION_PRESENT_FETAL_DEATH:
      {
        InfectionPresentFetalDeath infectionPresentFetalDeath = (InfectionPresentFetalDeath)theEObject;
        T result = caseInfectionPresentFetalDeath(infectionPresentFetalDeath);
        if (result == null) result = caseObservation(infectionPresentFetalDeath);
        if (result == null) result = caseClinicalStatement(infectionPresentFetalDeath);
        if (result == null) result = caseAct(infectionPresentFetalDeath);
        if (result == null) result = caseInfrastructureRoot(infectionPresentFetalDeath);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseReportingBirthInformationfromaclinicalsettingtovitalrecords(
			ReportingBirthInformationfromaclinicalsettingtovitalrecords object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Prenatal Testingand Surveillance Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prenatal Testingand Surveillance Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrenatalTestingandSurveillanceSection(PrenatalTestingandSurveillanceSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prenatal Care</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prenatal Care</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePrenatalCare(PrenatalCare object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Prior Pregnancy History Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prior Pregnancy History Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePriorPregnancyHistorySection(PriorPregnancyHistorySection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Dateof Last Live Birth</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dateof Last Live Birth</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDateofLastLiveBirth(DateofLastLiveBirth object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Last Menstrual Period Date</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Last Menstrual Period Date</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLastMenstrualPeriodDate(LastMenstrualPeriodDate object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Numberof Births Now Living</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numberof Births Now Living</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNumberofBirthsNowLiving(NumberofBirthsNowLiving object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Numberof Live Birthsnow Dead</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numberof Live Birthsnow Dead</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNumberofLiveBirthsnowDead(NumberofLiveBirthsnowDead object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Other Pregnancy Outcome</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Other Pregnancy Outcome</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseOtherPregnancyOutcome(OtherPregnancyOutcome object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Estimateof Gestation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Estimateof Gestation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseEstimateofGestation(EstimateofGestation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Newborn Delivery Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Newborn Delivery Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNewbornDeliverySection(NewbornDeliverySection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Birth Order</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Birth Order</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBirthOrder(BirthOrder object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Numberof Infants Born Alive</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numberof Infants Born Alive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNumberofInfantsBornAlive(NumberofInfantsBornAlive object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Congenital Anomaly</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Congenital Anomaly</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCongenitalAnomaly(CongenitalAnomaly object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Newborns Vital Signs Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Newborns Vital Signs Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNewbornsVitalSignsSection(NewbornsVitalSignsSection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Newborns Vital Signs Observation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Newborns Vital Signs Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewbornsVitalSignsObservation(NewbornsVitalSignsObservation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abnormal Conditionofthe Newborn</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abnormal Conditionofthe Newborn</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAbnormalConditionoftheNewborn(AbnormalConditionoftheNewborn object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Infant Living</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Infant Living</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseInfantLiving(InfantLiving object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Infant Breastfed</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Infant Breastfed</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseInfantBreastfed(InfantBreastfed object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Infant Transfer</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Infant Transfer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseInfantTransfer(InfantTransfer object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Plurality</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plurality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePlurality(Plurality object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Laborand Delivery Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Laborand Delivery Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLaborandDeliverySection(LaborandDeliverySection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Laborand Delivery Information</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Laborand Delivery Information</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLaborandDeliveryInformation(LaborandDeliveryInformation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Characteristicof Laborand Delivery</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Characteristicof Laborand Delivery</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCharacteristicofLaborandDelivery(CharacteristicofLaborandDelivery object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Planned Home Birth</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Planned Home Birth</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePlannedHomeBirth(PlannedHomeBirth object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Maternal Transfer</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Maternal Transfer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMaternalTransfer(MaternalTransfer object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Maternal Morbidity</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Maternal Morbidity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMaternalMorbidity(MaternalMorbidity object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Pregnancy Risk Factor</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pregnancy Risk Factor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePregnancyRiskFactor(PregnancyRiskFactor object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Assessments Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assessments Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssessmentsSection(AssessmentsSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mothers Vital Signs Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mothers Vital Signs Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMothersVitalSignsSection(MothersVitalSignsSection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Assessments Observation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assessments Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssessmentsObservation(AssessmentsObservation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mothers Vital Signs Observation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mothers Vital Signs Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMothersVitalSignsObservation(MothersVitalSignsObservation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Laborand Delivery Procedure Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Laborand Delivery Procedure Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLaborandDeliveryProcedureSection(LaborandDeliveryProcedureSection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Obstetric Procedure</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Obstetric Procedure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseObstetricProcedure(ObstetricProcedure object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Methodof Delivery</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Methodof Delivery</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMethodofDelivery(MethodofDelivery object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Onsetof Labor</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Onsetof Labor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseOnsetofLabor(OnsetofLabor object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Historyof Infection Live Birth Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Historyof Infection Live Birth Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHistoryofInfectionLiveBirthSection(HistoryofInfectionLiveBirthSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Infection Present Fetal Death</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Infection Present Fetal Death</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInfectionPresentFetalDeath(InfectionPresentFetalDeath object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fetal Delivery Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fetal Delivery Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFetalDeliverySection(FetalDeliverySection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Autopsy Performance</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Autopsy Performance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAutopsyPerformance(AutopsyPerformance object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fetal Death Occurrance</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fetal Death Occurrance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFetalDeathOccurrance(FetalDeathOccurrance object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fetal Delivery Time</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fetal Delivery Time</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFetalDeliveryTime(FetalDeliveryTime object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseReportingFetalDeathInformationfromaclinicalsettingtovitalrecords(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Historyof Infection Fetal Death Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Historyof Infection Fetal Death Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHistoryofInfectionFetalDeathSection(HistoryofInfectionFetalDeathSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Infection Present Live Birth</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Infection Present Live Birth</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInfectionPresentLiveBirth(InfectionPresentLiveBirth object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseInfrastructureRoot(InfrastructureRoot object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Act</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAct(Act object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseClinicalDocument(ClinicalDocument object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSection(Section object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseClinicalStatement(ClinicalStatement object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Act</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCDA_Act(org.openhealthtools.mdht.uml.cda.Act object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseObservation(Observation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseProcedure(Procedure object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
	public T defaultCase(EObject object) {
    return null;
  }

} // VsbrSwitch
