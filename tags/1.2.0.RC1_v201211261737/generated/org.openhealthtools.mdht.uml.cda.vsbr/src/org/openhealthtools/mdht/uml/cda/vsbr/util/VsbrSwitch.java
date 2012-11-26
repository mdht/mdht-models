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
public class VsbrSwitch<T>
{
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
  public VsbrSwitch()
  {
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
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
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
      case VsbrPackage.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION:
      {
        BirthReportingPrenatalExperienceSection birthReportingPrenatalExperienceSection = (BirthReportingPrenatalExperienceSection)theEObject;
        T result = caseBirthReportingPrenatalExperienceSection(birthReportingPrenatalExperienceSection);
        if (result == null) result = caseSection(birthReportingPrenatalExperienceSection);
        if (result == null) result = caseAct(birthReportingPrenatalExperienceSection);
        if (result == null) result = caseInfrastructureRoot(birthReportingPrenatalExperienceSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.PRE_NATAL_CARE:
      {
        PreNatalCare preNatalCare = (PreNatalCare)theEObject;
        T result = casePreNatalCare(preNatalCare);
        if (result == null) result = caseCDA_Act(preNatalCare);
        if (result == null) result = caseClinicalStatement(preNatalCare);
        if (result == null) result = caseAct(preNatalCare);
        if (result == null) result = caseInfrastructureRoot(preNatalCare);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.HEIGHT:
      {
        Height height = (Height)theEObject;
        T result = caseHeight(height);
        if (result == null) result = caseObservation(height);
        if (result == null) result = caseClinicalStatement(height);
        if (result == null) result = caseAct(height);
        if (result == null) result = caseInfrastructureRoot(height);
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
      case VsbrPackage.NUMBEROF_BIRTHS_STILL_LIVING:
      {
        NumberofBirthsStillLiving numberofBirthsStillLiving = (NumberofBirthsStillLiving)theEObject;
        T result = caseNumberofBirthsStillLiving(numberofBirthsStillLiving);
        if (result == null) result = caseObservation(numberofBirthsStillLiving);
        if (result == null) result = caseClinicalStatement(numberofBirthsStillLiving);
        if (result == null) result = caseAct(numberofBirthsStillLiving);
        if (result == null) result = caseInfrastructureRoot(numberofBirthsStillLiving);
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
      case VsbrPackage.OTHER_PREGNANCY_OUTCOMES:
      {
        OtherPregnancyOutcomes otherPregnancyOutcomes = (OtherPregnancyOutcomes)theEObject;
        T result = caseOtherPregnancyOutcomes(otherPregnancyOutcomes);
        if (result == null) result = caseObservation(otherPregnancyOutcomes);
        if (result == null) result = caseClinicalStatement(otherPregnancyOutcomes);
        if (result == null) result = caseAct(otherPregnancyOutcomes);
        if (result == null) result = caseInfrastructureRoot(otherPregnancyOutcomes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.BIRTH_REPORTING_INFECTIONS_PRESENT:
      {
        BirthReportingInfectionsPresent birthReportingInfectionsPresent = (BirthReportingInfectionsPresent)theEObject;
        T result = caseBirthReportingInfectionsPresent(birthReportingInfectionsPresent);
        if (result == null) result = caseObservation(birthReportingInfectionsPresent);
        if (result == null) result = caseClinicalStatement(birthReportingInfectionsPresent);
        if (result == null) result = caseAct(birthReportingInfectionsPresent);
        if (result == null) result = caseInfrastructureRoot(birthReportingInfectionsPresent);
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
      case VsbrPackage.MATERNAL_MORBIDITIES:
      {
        MaternalMorbidities maternalMorbidities = (MaternalMorbidities)theEObject;
        T result = caseMaternalMorbidities(maternalMorbidities);
        if (result == null) result = caseObservation(maternalMorbidities);
        if (result == null) result = caseClinicalStatement(maternalMorbidities);
        if (result == null) result = caseAct(maternalMorbidities);
        if (result == null) result = caseInfrastructureRoot(maternalMorbidities);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.CHARACTERISTICSOF_LABORAND_DELIVERY:
      {
        CharacteristicsofLaborandDelivery characteristicsofLaborandDelivery = (CharacteristicsofLaborandDelivery)theEObject;
        T result = caseCharacteristicsofLaborandDelivery(characteristicsofLaborandDelivery);
        if (result == null) result = caseObservation(characteristicsofLaborandDelivery);
        if (result == null) result = caseClinicalStatement(characteristicsofLaborandDelivery);
        if (result == null) result = caseAct(characteristicsofLaborandDelivery);
        if (result == null) result = caseInfrastructureRoot(characteristicsofLaborandDelivery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.LABOR_ONSETS:
      {
        LaborOnsets laborOnsets = (LaborOnsets)theEObject;
        T result = caseLaborOnsets(laborOnsets);
        if (result == null) result = caseObservation(laborOnsets);
        if (result == null) result = caseClinicalStatement(laborOnsets);
        if (result == null) result = caseAct(laborOnsets);
        if (result == null) result = caseInfrastructureRoot(laborOnsets);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.OBSTETRIC_PROCEDURES:
      {
        ObstetricProcedures obstetricProcedures = (ObstetricProcedures)theEObject;
        T result = caseObstetricProcedures(obstetricProcedures);
        if (result == null) result = caseObservation(obstetricProcedures);
        if (result == null) result = caseClinicalStatement(obstetricProcedures);
        if (result == null) result = caseAct(obstetricProcedures);
        if (result == null) result = caseInfrastructureRoot(obstetricProcedures);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.ATTEMPTED_FORCEPS_DELIVERY:
      {
        AttemptedForcepsDelivery attemptedForcepsDelivery = (AttemptedForcepsDelivery)theEObject;
        T result = caseAttemptedForcepsDelivery(attemptedForcepsDelivery);
        if (result == null) result = caseObservation(attemptedForcepsDelivery);
        if (result == null) result = caseClinicalStatement(attemptedForcepsDelivery);
        if (result == null) result = caseAct(attemptedForcepsDelivery);
        if (result == null) result = caseInfrastructureRoot(attemptedForcepsDelivery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.ATTEMPTED_VACUUM_EXTRACTION:
      {
        AttemptedVacuumExtraction attemptedVacuumExtraction = (AttemptedVacuumExtraction)theEObject;
        T result = caseAttemptedVacuumExtraction(attemptedVacuumExtraction);
        if (result == null) result = caseObservation(attemptedVacuumExtraction);
        if (result == null) result = caseClinicalStatement(attemptedVacuumExtraction);
        if (result == null) result = caseAct(attemptedVacuumExtraction);
        if (result == null) result = caseInfrastructureRoot(attemptedVacuumExtraction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.FETAL_PRESENTATION:
      {
        FetalPresentation fetalPresentation = (FetalPresentation)theEObject;
        T result = caseFetalPresentation(fetalPresentation);
        if (result == null) result = caseObservation(fetalPresentation);
        if (result == null) result = caseClinicalStatement(fetalPresentation);
        if (result == null) result = caseAct(fetalPresentation);
        if (result == null) result = caseInfrastructureRoot(fetalPresentation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.ROUTEAND_METHODOF_DELIVERY:
      {
        RouteandMethodofDelivery routeandMethodofDelivery = (RouteandMethodofDelivery)theEObject;
        T result = caseRouteandMethodofDelivery(routeandMethodofDelivery);
        if (result == null) result = caseObservation(routeandMethodofDelivery);
        if (result == null) result = caseClinicalStatement(routeandMethodofDelivery);
        if (result == null) result = caseAct(routeandMethodofDelivery);
        if (result == null) result = caseInfrastructureRoot(routeandMethodofDelivery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.BODY_WEIGHTAT_DELIVERY:
      {
        BodyWeightatDelivery bodyWeightatDelivery = (BodyWeightatDelivery)theEObject;
        T result = caseBodyWeightatDelivery(bodyWeightatDelivery);
        if (result == null) result = caseObservation(bodyWeightatDelivery);
        if (result == null) result = caseClinicalStatement(bodyWeightatDelivery);
        if (result == null) result = caseAct(bodyWeightatDelivery);
        if (result == null) result = caseInfrastructureRoot(bodyWeightatDelivery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.NEWBORN_SECTION:
      {
        NewbornSection newbornSection = (NewbornSection)theEObject;
        T result = caseNewbornSection(newbornSection);
        if (result == null) result = caseSection(newbornSection);
        if (result == null) result = caseAct(newbornSection);
        if (result == null) result = caseInfrastructureRoot(newbornSection);
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
      case VsbrPackage.APGAR_SCORE:
      {
        ApgarScore apgarScore = (ApgarScore)theEObject;
        T result = caseApgarScore(apgarScore);
        if (result == null) result = caseObservation(apgarScore);
        if (result == null) result = caseClinicalStatement(apgarScore);
        if (result == null) result = caseAct(apgarScore);
        if (result == null) result = caseInfrastructureRoot(apgarScore);
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
      case VsbrPackage.CONGENITAL_ANOMALIESOFTHE_NEWBORN:
      {
        CongenitalAnomaliesoftheNewborn congenitalAnomaliesoftheNewborn = (CongenitalAnomaliesoftheNewborn)theEObject;
        T result = caseCongenitalAnomaliesoftheNewborn(congenitalAnomaliesoftheNewborn);
        if (result == null) result = caseObservation(congenitalAnomaliesoftheNewborn);
        if (result == null) result = caseClinicalStatement(congenitalAnomaliesoftheNewborn);
        if (result == null) result = caseAct(congenitalAnomaliesoftheNewborn);
        if (result == null) result = caseInfrastructureRoot(congenitalAnomaliesoftheNewborn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.WEIGHT:
      {
        Weight weight = (Weight)theEObject;
        T result = caseWeight(weight);
        if (result == null) result = caseObservation(weight);
        if (result == null) result = caseClinicalStatement(weight);
        if (result == null) result = caseAct(weight);
        if (result == null) result = caseInfrastructureRoot(weight);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION:
      {
        FetalDeathReportingPrenatalExperienceSection fetalDeathReportingPrenatalExperienceSection = (FetalDeathReportingPrenatalExperienceSection)theEObject;
        T result = caseFetalDeathReportingPrenatalExperienceSection(fetalDeathReportingPrenatalExperienceSection);
        if (result == null) result = caseSection(fetalDeathReportingPrenatalExperienceSection);
        if (result == null) result = caseAct(fetalDeathReportingPrenatalExperienceSection);
        if (result == null) result = caseInfrastructureRoot(fetalDeathReportingPrenatalExperienceSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.FETAL_DEATH_REPORTING_INFECTIONS_PRESENT:
      {
        FetalDeathReportingInfectionsPresent fetalDeathReportingInfectionsPresent = (FetalDeathReportingInfectionsPresent)theEObject;
        T result = caseFetalDeathReportingInfectionsPresent(fetalDeathReportingInfectionsPresent);
        if (result == null) result = caseObservation(fetalDeathReportingInfectionsPresent);
        if (result == null) result = caseClinicalStatement(fetalDeathReportingInfectionsPresent);
        if (result == null) result = caseAct(fetalDeathReportingInfectionsPresent);
        if (result == null) result = caseInfrastructureRoot(fetalDeathReportingInfectionsPresent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.FETUS_SECTION:
      {
        FetusSection fetusSection = (FetusSection)theEObject;
        T result = caseFetusSection(fetusSection);
        if (result == null) result = caseSection(fetusSection);
        if (result == null) result = caseAct(fetusSection);
        if (result == null) result = caseInfrastructureRoot(fetusSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.ABNORMAL_CONDITIONSOFTHE_NEWBORN:
      {
        AbnormalConditionsoftheNewborn abnormalConditionsoftheNewborn = (AbnormalConditionsoftheNewborn)theEObject;
        T result = caseAbnormalConditionsoftheNewborn(abnormalConditionsoftheNewborn);
        if (result == null) result = caseObservation(abnormalConditionsoftheNewborn);
        if (result == null) result = caseClinicalStatement(abnormalConditionsoftheNewborn);
        if (result == null) result = caseAct(abnormalConditionsoftheNewborn);
        if (result == null) result = caseInfrastructureRoot(abnormalConditionsoftheNewborn);
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
      case VsbrPackage.PREPREGNANCY_BODY_WEIGHT:
      {
        PrepregnancyBodyWeight prepregnancyBodyWeight = (PrepregnancyBodyWeight)theEObject;
        T result = casePrepregnancyBodyWeight(prepregnancyBodyWeight);
        if (result == null) result = caseObservation(prepregnancyBodyWeight);
        if (result == null) result = caseClinicalStatement(prepregnancyBodyWeight);
        if (result == null) result = caseAct(prepregnancyBodyWeight);
        if (result == null) result = caseInfrastructureRoot(prepregnancyBodyWeight);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsbrPackage.RISK_FACTORS:
      {
        RiskFactors riskFactors = (RiskFactors)theEObject;
        T result = caseRiskFactors(riskFactors);
        if (result == null) result = caseObservation(riskFactors);
        if (result == null) result = caseClinicalStatement(riskFactors);
        if (result == null) result = caseAct(riskFactors);
        if (result == null) result = caseInfrastructureRoot(riskFactors);
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
  public T caseReportingBirthInformationfromaclinicalsettingtovitalrecords(ReportingBirthInformationfromaclinicalsettingtovitalrecords object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Birth Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Birth Reporting Prenatal Experience Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBirthReportingPrenatalExperienceSection(BirthReportingPrenatalExperienceSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pre Natal Care</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pre Natal Care</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreNatalCare(PreNatalCare object)
  {
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
  public T caseLaborandDeliverySection(LaborandDeliverySection object)
  {
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
  public T caseLaborandDeliveryInformation(LaborandDeliveryInformation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Newborn Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Newborn Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewbornSection(NewbornSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fetal Death Reporting Prenatal Experience Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fetal Death Reporting Prenatal Experience Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFetalDeathReportingPrenatalExperienceSection(FetalDeathReportingPrenatalExperienceSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fetus Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fetus Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFetusSection(FetusSection object)
  {
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
  public T caseReportingFetalDeathInformationfromaclinicalsettingtovitalrecords(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Height</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Height</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeight(Height object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body Weightat Delivery</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body Weightat Delivery</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBodyWeightatDelivery(BodyWeightatDelivery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prepregnancy Body Weight</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prepregnancy Body Weight</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrepregnancyBodyWeight(PrepregnancyBodyWeight object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numberof Births Still Living</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numberof Births Still Living</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberofBirthsStillLiving(NumberofBirthsStillLiving object)
  {
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
  public T caseDateofLastLiveBirth(DateofLastLiveBirth object)
  {
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
  public T caseNumberofLiveBirthsnowDead(NumberofLiveBirthsnowDead object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Other Pregnancy Outcomes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Other Pregnancy Outcomes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOtherPregnancyOutcomes(OtherPregnancyOutcomes object)
  {
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
  public T caseLastMenstrualPeriodDate(LastMenstrualPeriodDate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Birth Reporting Infections Present</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Birth Reporting Infections Present</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBirthReportingInfectionsPresent(BirthReportingInfectionsPresent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Labor Onsets</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Labor Onsets</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLaborOnsets(LaborOnsets object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fetal Death Reporting Infections Present</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fetal Death Reporting Infections Present</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFetalDeathReportingInfectionsPresent(FetalDeathReportingInfectionsPresent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Obstetric Procedures</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Obstetric Procedures</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObstetricProcedures(ObstetricProcedures object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Risk Factors</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Risk Factors</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRiskFactors(RiskFactors object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Characteristicsof Laborand Delivery</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Characteristicsof Laborand Delivery</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCharacteristicsofLaborandDelivery(CharacteristicsofLaborandDelivery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Maternal Morbidities</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Maternal Morbidities</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMaternalMorbidities(MaternalMorbidities object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abnormal Conditionsofthe Newborn</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abnormal Conditionsofthe Newborn</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbnormalConditionsoftheNewborn(AbnormalConditionsoftheNewborn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Congenital Anomaliesofthe Newborn</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Congenital Anomaliesofthe Newborn</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCongenitalAnomaliesoftheNewborn(CongenitalAnomaliesoftheNewborn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attempted Forceps Delivery</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attempted Forceps Delivery</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttemptedForcepsDelivery(AttemptedForcepsDelivery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attempted Vacuum Extraction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attempted Vacuum Extraction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttemptedVacuumExtraction(AttemptedVacuumExtraction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fetal Presentation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fetal Presentation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFetalPresentation(FetalPresentation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Routeand Methodof Delivery</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Routeand Methodof Delivery</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRouteandMethodofDelivery(RouteandMethodofDelivery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weight</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weight</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeight(Weight object)
  {
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
  public T caseEstimateofGestation(EstimateofGestation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Apgar Score</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Apgar Score</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApgarScore(ApgarScore object)
  {
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
  public T casePlurality(Plurality object)
  {
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
  public T caseNumberofInfantsBornAlive(NumberofInfantsBornAlive object)
  {
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
  public T caseBirthOrder(BirthOrder object)
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
  public T caseInfrastructureRoot(InfrastructureRoot object)
  {
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
  public T caseAct(Act object)
  {
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
  public T caseClinicalDocument(ClinicalDocument object)
  {
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
  public T caseSection(Section object)
  {
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
  public T caseClinicalStatement(ClinicalStatement object)
  {
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
  public T caseCDA_Act(org.openhealthtools.mdht.uml.cda.Act object)
  {
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
  public T caseObservation(Observation object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //VsbrSwitch
