/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.ClinicalStatement;
import org.eclipse.mdht.uml.cda.Encounter;
import org.eclipse.mdht.uml.cda.Observation;
import org.eclipse.mdht.uml.cda.Organizer;
import org.eclipse.mdht.uml.cda.Procedure;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.SubstanceAdministration;
import org.eclipse.mdht.uml.hl7.rim.Act;
import org.eclipse.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.cda.clondata.AnthracyclinesLifetimeDose;
import org.openhealthtools.mdht.uml.cda.clondata.BodyHeight;
import org.openhealthtools.mdht.uml.cda.clondata.BodySurfaceArea;
import org.openhealthtools.mdht.uml.cda.clondata.BodyWeight;
import org.openhealthtools.mdht.uml.cda.clondata.BreastCancerConcernAct;
import org.openhealthtools.mdht.uml.cda.clondata.BreastCancerDiagnosisObservation;
import org.openhealthtools.mdht.uml.cda.clondata.BreastCancerProcedures;
import org.openhealthtools.mdht.uml.cda.clondata.BreastTNMClinicalCategory;
import org.openhealthtools.mdht.uml.cda.clondata.BreastTNMMetastasisCategory;
import org.openhealthtools.mdht.uml.cda.clondata.BreastTNMNodeCategory;
import org.openhealthtools.mdht.uml.cda.clondata.BreastTNMTumorCategory;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.CardiacFunctionObservation;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapeuticDrugTherapyDiscontinued;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivity;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivityPlan;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyProtocolReference;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyRegimenPlans;
import org.openhealthtools.mdht.uml.cda.clondata.ClinicalDrugTrial;
import org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary;
import org.openhealthtools.mdht.uml.cda.clondata.EncountersSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.EstrogenReceptorStatus;
import org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryPedigree;
import org.openhealthtools.mdht.uml.cda.clondata.FamilyHistorySectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryofCancerNone;
import org.openhealthtools.mdht.uml.cda.clondata.FunctionalStatusSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.HER2ReceptorStatus;
import org.openhealthtools.mdht.uml.cda.clondata.HospitalizationWithReason;
import org.openhealthtools.mdht.uml.cda.clondata.LastMenstrualPeriod;
import org.openhealthtools.mdht.uml.cda.clondata.LymphNodeSamplingResultOrganizer;
import org.openhealthtools.mdht.uml.cda.clondata.MedicationsSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.MolecularDiagnosticTestingOrganizer;
import org.openhealthtools.mdht.uml.cda.clondata.NeurotoxicityImpairmentofADLs;
import org.openhealthtools.mdht.uml.cda.clondata.NumberofLymphNodesPositive;
import org.openhealthtools.mdht.uml.cda.clondata.NumberofLymphNodesRemovedandExamined;
import org.openhealthtools.mdht.uml.cda.clondata.OncotypeDXScore;
import org.openhealthtools.mdht.uml.cda.clondata.PlanofCareActivityReconstructionProcedure;
import org.openhealthtools.mdht.uml.cda.clondata.PlanofCareRadiationActivity;
import org.openhealthtools.mdht.uml.cda.clondata.PlanofCareSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.PostTreatmentDiseaseStatus;
import org.openhealthtools.mdht.uml.cda.clondata.ProblemSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.ProceduresSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.ProgesteroneReceptorStatus;
import org.openhealthtools.mdht.uml.cda.clondata.RadiationTherapyCareCompleted;
import org.openhealthtools.mdht.uml.cda.clondata.ReceptorStatusOrganizer;
import org.openhealthtools.mdht.uml.cda.clondata.ResultsSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.VitalSignsOrganizerBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.VitalSignsSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;

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
 * @see org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage
 * @generated
 */
public class CLONDATASwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CLONDATAPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLONDATASwitch() {
		if (modelPackage == null) {
			modelPackage = CLONDATAPackage.eINSTANCE;
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
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty()
					? defaultCase(theEObject)
					: doSwitch(eSuperTypes.get(0), theEObject);
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
		switch (classifierID) {
			case CLONDATAPackage.ANTHRACYCLINES_LIFETIME_DOSE: {
				AnthracyclinesLifetimeDose anthracyclinesLifetimeDose = (AnthracyclinesLifetimeDose) theEObject;
				T result = caseAnthracyclinesLifetimeDose(anthracyclinesLifetimeDose);
				if (result == null) {
					result = caseSubstanceAdministration(anthracyclinesLifetimeDose);
				}
				if (result == null) {
					result = caseClinicalStatement(anthracyclinesLifetimeDose);
				}
				if (result == null) {
					result = caseAct(anthracyclinesLifetimeDose);
				}
				if (result == null) {
					result = caseInfrastructureRoot(anthracyclinesLifetimeDose);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.BREAST_TNM_METASTASIS_CATEGORY: {
				BreastTNMMetastasisCategory breastTNMMetastasisCategory = (BreastTNMMetastasisCategory) theEObject;
				T result = caseBreastTNMMetastasisCategory(breastTNMMetastasisCategory);
				if (result == null) {
					result = caseObservation(breastTNMMetastasisCategory);
				}
				if (result == null) {
					result = caseClinicalStatement(breastTNMMetastasisCategory);
				}
				if (result == null) {
					result = caseAct(breastTNMMetastasisCategory);
				}
				if (result == null) {
					result = caseInfrastructureRoot(breastTNMMetastasisCategory);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.BREAST_TNM_CLINICAL_CATEGORY: {
				BreastTNMClinicalCategory breastTNMClinicalCategory = (BreastTNMClinicalCategory) theEObject;
				T result = caseBreastTNMClinicalCategory(breastTNMClinicalCategory);
				if (result == null) {
					result = caseCDA_Act(breastTNMClinicalCategory);
				}
				if (result == null) {
					result = caseClinicalStatement(breastTNMClinicalCategory);
				}
				if (result == null) {
					result = caseAct(breastTNMClinicalCategory);
				}
				if (result == null) {
					result = caseInfrastructureRoot(breastTNMClinicalCategory);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.BREAST_TNM_NODE_CATEGORY: {
				BreastTNMNodeCategory breastTNMNodeCategory = (BreastTNMNodeCategory) theEObject;
				T result = caseBreastTNMNodeCategory(breastTNMNodeCategory);
				if (result == null) {
					result = caseObservation(breastTNMNodeCategory);
				}
				if (result == null) {
					result = caseClinicalStatement(breastTNMNodeCategory);
				}
				if (result == null) {
					result = caseAct(breastTNMNodeCategory);
				}
				if (result == null) {
					result = caseInfrastructureRoot(breastTNMNodeCategory);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.BREAST_TNM_TUMOR_CATEGORY: {
				BreastTNMTumorCategory breastTNMTumorCategory = (BreastTNMTumorCategory) theEObject;
				T result = caseBreastTNMTumorCategory(breastTNMTumorCategory);
				if (result == null) {
					result = caseObservation(breastTNMTumorCategory);
				}
				if (result == null) {
					result = caseClinicalStatement(breastTNMTumorCategory);
				}
				if (result == null) {
					result = caseAct(breastTNMTumorCategory);
				}
				if (result == null) {
					result = caseInfrastructureRoot(breastTNMTumorCategory);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED: {
				ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued = (ChemotherapeuticDrugTherapyDiscontinued) theEObject;
				T result = caseChemotherapeuticDrugTherapyDiscontinued(chemotherapeuticDrugTherapyDiscontinued);
				if (result == null) {
					result = caseObservation(chemotherapeuticDrugTherapyDiscontinued);
				}
				if (result == null) {
					result = caseClinicalStatement(chemotherapeuticDrugTherapyDiscontinued);
				}
				if (result == null) {
					result = caseAct(chemotherapeuticDrugTherapyDiscontinued);
				}
				if (result == null) {
					result = caseInfrastructureRoot(chemotherapeuticDrugTherapyDiscontinued);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.CHEMOTHERAPY_PROTOCOL_REFERENCE: {
				ChemotherapyProtocolReference chemotherapyProtocolReference = (ChemotherapyProtocolReference) theEObject;
				T result = caseChemotherapyProtocolReference(chemotherapyProtocolReference);
				if (result == null) {
					result = caseCDA_Act(chemotherapyProtocolReference);
				}
				if (result == null) {
					result = caseClinicalStatement(chemotherapyProtocolReference);
				}
				if (result == null) {
					result = caseAct(chemotherapyProtocolReference);
				}
				if (result == null) {
					result = caseInfrastructureRoot(chemotherapyProtocolReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.CLINICAL_DRUG_TRIAL: {
				ClinicalDrugTrial clinicalDrugTrial = (ClinicalDrugTrial) theEObject;
				T result = caseClinicalDrugTrial(clinicalDrugTrial);
				if (result == null) {
					result = caseCDA_Act(clinicalDrugTrial);
				}
				if (result == null) {
					result = caseClinicalStatement(clinicalDrugTrial);
				}
				if (result == null) {
					result = caseAct(clinicalDrugTrial);
				}
				if (result == null) {
					result = caseInfrastructureRoot(clinicalDrugTrial);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.HOSPITALIZATION_WITH_REASON: {
				HospitalizationWithReason hospitalizationWithReason = (HospitalizationWithReason) theEObject;
				T result = caseHospitalizationWithReason(hospitalizationWithReason);
				if (result == null) {
					result = caseEncounter(hospitalizationWithReason);
				}
				if (result == null) {
					result = caseClinicalStatement(hospitalizationWithReason);
				}
				if (result == null) {
					result = caseAct(hospitalizationWithReason);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalizationWithReason);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.FAMILY_HISTORYOF_CANCER_NONE: {
				FamilyHistoryofCancerNone familyHistoryofCancerNone = (FamilyHistoryofCancerNone) theEObject;
				T result = caseFamilyHistoryofCancerNone(familyHistoryofCancerNone);
				if (result == null) {
					result = caseObservation(familyHistoryofCancerNone);
				}
				if (result == null) {
					result = caseClinicalStatement(familyHistoryofCancerNone);
				}
				if (result == null) {
					result = caseAct(familyHistoryofCancerNone);
				}
				if (result == null) {
					result = caseInfrastructureRoot(familyHistoryofCancerNone);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.FAMILY_HISTORY_PEDIGREE: {
				FamilyHistoryPedigree familyHistoryPedigree = (FamilyHistoryPedigree) theEObject;
				T result = caseFamilyHistoryPedigree(familyHistoryPedigree);
				if (result == null) {
					result = caseCDA_Act(familyHistoryPedigree);
				}
				if (result == null) {
					result = caseClinicalStatement(familyHistoryPedigree);
				}
				if (result == null) {
					result = caseAct(familyHistoryPedigree);
				}
				if (result == null) {
					result = caseInfrastructureRoot(familyHistoryPedigree);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.LAST_MENSTRUAL_PERIOD: {
				LastMenstrualPeriod lastMenstrualPeriod = (LastMenstrualPeriod) theEObject;
				T result = caseLastMenstrualPeriod(lastMenstrualPeriod);
				if (result == null) {
					result = caseObservation(lastMenstrualPeriod);
				}
				if (result == null) {
					result = caseClinicalStatement(lastMenstrualPeriod);
				}
				if (result == null) {
					result = caseAct(lastMenstrualPeriod);
				}
				if (result == null) {
					result = caseInfrastructureRoot(lastMenstrualPeriod);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.CHEMOTHERAPY_MEDICATION_ACTIVITY: {
				ChemotherapyMedicationActivity chemotherapyMedicationActivity = (ChemotherapyMedicationActivity) theEObject;
				T result = caseChemotherapyMedicationActivity(chemotherapyMedicationActivity);
				if (result == null) {
					result = caseMedicationActivity(chemotherapyMedicationActivity);
				}
				if (result == null) {
					result = caseSubstanceAdministration(chemotherapyMedicationActivity);
				}
				if (result == null) {
					result = caseClinicalStatement(chemotherapyMedicationActivity);
				}
				if (result == null) {
					result = caseAct(chemotherapyMedicationActivity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(chemotherapyMedicationActivity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.ONCOTYPE_DX_SCORE: {
				OncotypeDXScore oncotypeDXScore = (OncotypeDXScore) theEObject;
				T result = caseOncotypeDXScore(oncotypeDXScore);
				if (result == null) {
					result = caseResultObservation(oncotypeDXScore);
				}
				if (result == null) {
					result = caseObservation(oncotypeDXScore);
				}
				if (result == null) {
					result = caseClinicalStatement(oncotypeDXScore);
				}
				if (result == null) {
					result = caseAct(oncotypeDXScore);
				}
				if (result == null) {
					result = caseInfrastructureRoot(oncotypeDXScore);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.CHEMOTHERAPY_REGIMEN_PLANS: {
				ChemotherapyRegimenPlans chemotherapyRegimenPlans = (ChemotherapyRegimenPlans) theEObject;
				T result = caseChemotherapyRegimenPlans(chemotherapyRegimenPlans);
				if (result == null) {
					result = caseProcedure(chemotherapyRegimenPlans);
				}
				if (result == null) {
					result = caseClinicalStatement(chemotherapyRegimenPlans);
				}
				if (result == null) {
					result = caseAct(chemotherapyRegimenPlans);
				}
				if (result == null) {
					result = caseInfrastructureRoot(chemotherapyRegimenPlans);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE: {
				PlanofCareActivityReconstructionProcedure planofCareActivityReconstructionProcedure = (PlanofCareActivityReconstructionProcedure) theEObject;
				T result = casePlanofCareActivityReconstructionProcedure(planofCareActivityReconstructionProcedure);
				if (result == null) {
					result = casePlanOfCareActivityProcedure(planofCareActivityReconstructionProcedure);
				}
				if (result == null) {
					result = caseProcedure(planofCareActivityReconstructionProcedure);
				}
				if (result == null) {
					result = caseClinicalStatement(planofCareActivityReconstructionProcedure);
				}
				if (result == null) {
					result = caseAct(planofCareActivityReconstructionProcedure);
				}
				if (result == null) {
					result = caseInfrastructureRoot(planofCareActivityReconstructionProcedure);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN: {
				ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan = (ChemotherapyMedicationActivityPlan) theEObject;
				T result = caseChemotherapyMedicationActivityPlan(chemotherapyMedicationActivityPlan);
				if (result == null) {
					result = casePlanOfCareActivitySubstanceAdministration(chemotherapyMedicationActivityPlan);
				}
				if (result == null) {
					result = caseSubstanceAdministration(chemotherapyMedicationActivityPlan);
				}
				if (result == null) {
					result = caseClinicalStatement(chemotherapyMedicationActivityPlan);
				}
				if (result == null) {
					result = caseAct(chemotherapyMedicationActivityPlan);
				}
				if (result == null) {
					result = caseInfrastructureRoot(chemotherapyMedicationActivityPlan);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.POST_TREATMENT_DISEASE_STATUS: {
				PostTreatmentDiseaseStatus postTreatmentDiseaseStatus = (PostTreatmentDiseaseStatus) theEObject;
				T result = casePostTreatmentDiseaseStatus(postTreatmentDiseaseStatus);
				if (result == null) {
					result = caseObservation(postTreatmentDiseaseStatus);
				}
				if (result == null) {
					result = caseClinicalStatement(postTreatmentDiseaseStatus);
				}
				if (result == null) {
					result = caseAct(postTreatmentDiseaseStatus);
				}
				if (result == null) {
					result = caseInfrastructureRoot(postTreatmentDiseaseStatus);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.BREAST_CANCER_CONCERN_ACT: {
				BreastCancerConcernAct breastCancerConcernAct = (BreastCancerConcernAct) theEObject;
				T result = caseBreastCancerConcernAct(breastCancerConcernAct);
				if (result == null) {
					result = caseProblemConcernAct(breastCancerConcernAct);
				}
				if (result == null) {
					result = caseCDA_Act(breastCancerConcernAct);
				}
				if (result == null) {
					result = caseClinicalStatement(breastCancerConcernAct);
				}
				if (result == null) {
					result = caseAct(breastCancerConcernAct);
				}
				if (result == null) {
					result = caseInfrastructureRoot(breastCancerConcernAct);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.BREAST_CANCER_DIAGNOSIS_OBSERVATION: {
				BreastCancerDiagnosisObservation breastCancerDiagnosisObservation = (BreastCancerDiagnosisObservation) theEObject;
				T result = caseBreastCancerDiagnosisObservation(breastCancerDiagnosisObservation);
				if (result == null) {
					result = caseProblemObservation(breastCancerDiagnosisObservation);
				}
				if (result == null) {
					result = caseObservation(breastCancerDiagnosisObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(breastCancerDiagnosisObservation);
				}
				if (result == null) {
					result = caseAct(breastCancerDiagnosisObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(breastCancerDiagnosisObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.NEUROTOXICITY_IMPAIRMENTOF_AD_LS: {
				NeurotoxicityImpairmentofADLs neurotoxicityImpairmentofADLs = (NeurotoxicityImpairmentofADLs) theEObject;
				T result = caseNeurotoxicityImpairmentofADLs(neurotoxicityImpairmentofADLs);
				if (result == null) {
					result = caseObservation(neurotoxicityImpairmentofADLs);
				}
				if (result == null) {
					result = caseClinicalStatement(neurotoxicityImpairmentofADLs);
				}
				if (result == null) {
					result = caseAct(neurotoxicityImpairmentofADLs);
				}
				if (result == null) {
					result = caseInfrastructureRoot(neurotoxicityImpairmentofADLs);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.RADIATION_THERAPY_CARE_COMPLETED: {
				RadiationTherapyCareCompleted radiationTherapyCareCompleted = (RadiationTherapyCareCompleted) theEObject;
				T result = caseRadiationTherapyCareCompleted(radiationTherapyCareCompleted);
				if (result == null) {
					result = caseProcedureActivityAct(radiationTherapyCareCompleted);
				}
				if (result == null) {
					result = caseCDA_Act(radiationTherapyCareCompleted);
				}
				if (result == null) {
					result = caseClinicalStatement(radiationTherapyCareCompleted);
				}
				if (result == null) {
					result = caseAct(radiationTherapyCareCompleted);
				}
				if (result == null) {
					result = caseInfrastructureRoot(radiationTherapyCareCompleted);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.BREAST_CANCER_PROCEDURES: {
				BreastCancerProcedures breastCancerProcedures = (BreastCancerProcedures) theEObject;
				T result = caseBreastCancerProcedures(breastCancerProcedures);
				if (result == null) {
					result = caseProcedureActivityProcedure(breastCancerProcedures);
				}
				if (result == null) {
					result = caseProcedure(breastCancerProcedures);
				}
				if (result == null) {
					result = caseClinicalStatement(breastCancerProcedures);
				}
				if (result == null) {
					result = caseAct(breastCancerProcedures);
				}
				if (result == null) {
					result = caseInfrastructureRoot(breastCancerProcedures);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.CARDIAC_FUNCTION_OBSERVATION: {
				CardiacFunctionObservation cardiacFunctionObservation = (CardiacFunctionObservation) theEObject;
				T result = caseCardiacFunctionObservation(cardiacFunctionObservation);
				if (result == null) {
					result = caseResultObservation(cardiacFunctionObservation);
				}
				if (result == null) {
					result = caseObservation(cardiacFunctionObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(cardiacFunctionObservation);
				}
				if (result == null) {
					result = caseAct(cardiacFunctionObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(cardiacFunctionObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.ESTROGEN_RECEPTOR_STATUS: {
				EstrogenReceptorStatus estrogenReceptorStatus = (EstrogenReceptorStatus) theEObject;
				T result = caseEstrogenReceptorStatus(estrogenReceptorStatus);
				if (result == null) {
					result = caseResultObservation(estrogenReceptorStatus);
				}
				if (result == null) {
					result = caseObservation(estrogenReceptorStatus);
				}
				if (result == null) {
					result = caseClinicalStatement(estrogenReceptorStatus);
				}
				if (result == null) {
					result = caseAct(estrogenReceptorStatus);
				}
				if (result == null) {
					result = caseInfrastructureRoot(estrogenReceptorStatus);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.HER2_RECEPTOR_STATUS: {
				HER2ReceptorStatus her2ReceptorStatus = (HER2ReceptorStatus) theEObject;
				T result = caseHER2ReceptorStatus(her2ReceptorStatus);
				if (result == null) {
					result = caseResultObservation(her2ReceptorStatus);
				}
				if (result == null) {
					result = caseObservation(her2ReceptorStatus);
				}
				if (result == null) {
					result = caseClinicalStatement(her2ReceptorStatus);
				}
				if (result == null) {
					result = caseAct(her2ReceptorStatus);
				}
				if (result == null) {
					result = caseInfrastructureRoot(her2ReceptorStatus);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.NUMBEROF_LYMPH_NODES_POSITIVE: {
				NumberofLymphNodesPositive numberofLymphNodesPositive = (NumberofLymphNodesPositive) theEObject;
				T result = caseNumberofLymphNodesPositive(numberofLymphNodesPositive);
				if (result == null) {
					result = caseResultObservation(numberofLymphNodesPositive);
				}
				if (result == null) {
					result = caseObservation(numberofLymphNodesPositive);
				}
				if (result == null) {
					result = caseClinicalStatement(numberofLymphNodesPositive);
				}
				if (result == null) {
					result = caseAct(numberofLymphNodesPositive);
				}
				if (result == null) {
					result = caseInfrastructureRoot(numberofLymphNodesPositive);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED: {
				NumberofLymphNodesRemovedandExamined numberofLymphNodesRemovedandExamined = (NumberofLymphNodesRemovedandExamined) theEObject;
				T result = caseNumberofLymphNodesRemovedandExamined(numberofLymphNodesRemovedandExamined);
				if (result == null) {
					result = caseResultObservation(numberofLymphNodesRemovedandExamined);
				}
				if (result == null) {
					result = caseObservation(numberofLymphNodesRemovedandExamined);
				}
				if (result == null) {
					result = caseClinicalStatement(numberofLymphNodesRemovedandExamined);
				}
				if (result == null) {
					result = caseAct(numberofLymphNodesRemovedandExamined);
				}
				if (result == null) {
					result = caseInfrastructureRoot(numberofLymphNodesRemovedandExamined);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.PROGESTERONE_RECEPTOR_STATUS: {
				ProgesteroneReceptorStatus progesteroneReceptorStatus = (ProgesteroneReceptorStatus) theEObject;
				T result = caseProgesteroneReceptorStatus(progesteroneReceptorStatus);
				if (result == null) {
					result = caseResultObservation(progesteroneReceptorStatus);
				}
				if (result == null) {
					result = caseObservation(progesteroneReceptorStatus);
				}
				if (result == null) {
					result = caseClinicalStatement(progesteroneReceptorStatus);
				}
				if (result == null) {
					result = caseAct(progesteroneReceptorStatus);
				}
				if (result == null) {
					result = caseInfrastructureRoot(progesteroneReceptorStatus);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.LYMPH_NODE_SAMPLING_RESULT_ORGANIZER: {
				LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer = (LymphNodeSamplingResultOrganizer) theEObject;
				T result = caseLymphNodeSamplingResultOrganizer(lymphNodeSamplingResultOrganizer);
				if (result == null) {
					result = caseResultOrganizer(lymphNodeSamplingResultOrganizer);
				}
				if (result == null) {
					result = caseOrganizer(lymphNodeSamplingResultOrganizer);
				}
				if (result == null) {
					result = caseClinicalStatement(lymphNodeSamplingResultOrganizer);
				}
				if (result == null) {
					result = caseAct(lymphNodeSamplingResultOrganizer);
				}
				if (result == null) {
					result = caseInfrastructureRoot(lymphNodeSamplingResultOrganizer);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER: {
				MolecularDiagnosticTestingOrganizer molecularDiagnosticTestingOrganizer = (MolecularDiagnosticTestingOrganizer) theEObject;
				T result = caseMolecularDiagnosticTestingOrganizer(molecularDiagnosticTestingOrganizer);
				if (result == null) {
					result = caseResultOrganizer(molecularDiagnosticTestingOrganizer);
				}
				if (result == null) {
					result = caseOrganizer(molecularDiagnosticTestingOrganizer);
				}
				if (result == null) {
					result = caseClinicalStatement(molecularDiagnosticTestingOrganizer);
				}
				if (result == null) {
					result = caseAct(molecularDiagnosticTestingOrganizer);
				}
				if (result == null) {
					result = caseInfrastructureRoot(molecularDiagnosticTestingOrganizer);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.RECEPTOR_STATUS_ORGANIZER: {
				ReceptorStatusOrganizer receptorStatusOrganizer = (ReceptorStatusOrganizer) theEObject;
				T result = caseReceptorStatusOrganizer(receptorStatusOrganizer);
				if (result == null) {
					result = caseResultOrganizer(receptorStatusOrganizer);
				}
				if (result == null) {
					result = caseOrganizer(receptorStatusOrganizer);
				}
				if (result == null) {
					result = caseClinicalStatement(receptorStatusOrganizer);
				}
				if (result == null) {
					result = caseAct(receptorStatusOrganizer);
				}
				if (result == null) {
					result = caseInfrastructureRoot(receptorStatusOrganizer);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.BODY_HEIGHT: {
				BodyHeight bodyHeight = (BodyHeight) theEObject;
				T result = caseBodyHeight(bodyHeight);
				if (result == null) {
					result = caseVitalSignObservation(bodyHeight);
				}
				if (result == null) {
					result = caseObservation(bodyHeight);
				}
				if (result == null) {
					result = caseClinicalStatement(bodyHeight);
				}
				if (result == null) {
					result = caseAct(bodyHeight);
				}
				if (result == null) {
					result = caseInfrastructureRoot(bodyHeight);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.BODY_SURFACE_AREA: {
				BodySurfaceArea bodySurfaceArea = (BodySurfaceArea) theEObject;
				T result = caseBodySurfaceArea(bodySurfaceArea);
				if (result == null) {
					result = caseVitalSignObservation(bodySurfaceArea);
				}
				if (result == null) {
					result = caseObservation(bodySurfaceArea);
				}
				if (result == null) {
					result = caseClinicalStatement(bodySurfaceArea);
				}
				if (result == null) {
					result = caseAct(bodySurfaceArea);
				}
				if (result == null) {
					result = caseInfrastructureRoot(bodySurfaceArea);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.BODY_WEIGHT: {
				BodyWeight bodyWeight = (BodyWeight) theEObject;
				T result = caseBodyWeight(bodyWeight);
				if (result == null) {
					result = caseVitalSignObservation(bodyWeight);
				}
				if (result == null) {
					result = caseObservation(bodyWeight);
				}
				if (result == null) {
					result = caseClinicalStatement(bodyWeight);
				}
				if (result == null) {
					result = caseAct(bodyWeight);
				}
				if (result == null) {
					result = caseInfrastructureRoot(bodyWeight);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.ENCOUNTERS_SECTION_BCTPS: {
				EncountersSectionBCTPS encountersSectionBCTPS = (EncountersSectionBCTPS) theEObject;
				T result = caseEncountersSectionBCTPS(encountersSectionBCTPS);
				if (result == null) {
					result = caseEncountersSectionEntriesOptional(encountersSectionBCTPS);
				}
				if (result == null) {
					result = caseSection(encountersSectionBCTPS);
				}
				if (result == null) {
					result = caseAct(encountersSectionBCTPS);
				}
				if (result == null) {
					result = caseInfrastructureRoot(encountersSectionBCTPS);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.FAMILY_HISTORY_SECTION_BCTPS: {
				FamilyHistorySectionBCTPS familyHistorySectionBCTPS = (FamilyHistorySectionBCTPS) theEObject;
				T result = caseFamilyHistorySectionBCTPS(familyHistorySectionBCTPS);
				if (result == null) {
					result = caseFamilyHistorySection(familyHistorySectionBCTPS);
				}
				if (result == null) {
					result = caseSection(familyHistorySectionBCTPS);
				}
				if (result == null) {
					result = caseAct(familyHistorySectionBCTPS);
				}
				if (result == null) {
					result = caseInfrastructureRoot(familyHistorySectionBCTPS);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.FUNCTIONAL_STATUS_SECTION_BCTPS: {
				FunctionalStatusSectionBCTPS functionalStatusSectionBCTPS = (FunctionalStatusSectionBCTPS) theEObject;
				T result = caseFunctionalStatusSectionBCTPS(functionalStatusSectionBCTPS);
				if (result == null) {
					result = caseFunctionalStatusSection(functionalStatusSectionBCTPS);
				}
				if (result == null) {
					result = caseSection(functionalStatusSectionBCTPS);
				}
				if (result == null) {
					result = caseAct(functionalStatusSectionBCTPS);
				}
				if (result == null) {
					result = caseInfrastructureRoot(functionalStatusSectionBCTPS);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.MEDICATIONS_SECTION_BCTPS: {
				MedicationsSectionBCTPS medicationsSectionBCTPS = (MedicationsSectionBCTPS) theEObject;
				T result = caseMedicationsSectionBCTPS(medicationsSectionBCTPS);
				if (result == null) {
					result = caseMedicationsSection(medicationsSectionBCTPS);
				}
				if (result == null) {
					result = caseMedicationsSectionEntriesOptional(medicationsSectionBCTPS);
				}
				if (result == null) {
					result = caseSection(medicationsSectionBCTPS);
				}
				if (result == null) {
					result = caseAct(medicationsSectionBCTPS);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationsSectionBCTPS);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.PLANOF_CARE_SECTION_BCTPS: {
				PlanofCareSectionBCTPS planofCareSectionBCTPS = (PlanofCareSectionBCTPS) theEObject;
				T result = casePlanofCareSectionBCTPS(planofCareSectionBCTPS);
				if (result == null) {
					result = casePlanOfCareSection(planofCareSectionBCTPS);
				}
				if (result == null) {
					result = caseSection(planofCareSectionBCTPS);
				}
				if (result == null) {
					result = caseAct(planofCareSectionBCTPS);
				}
				if (result == null) {
					result = caseInfrastructureRoot(planofCareSectionBCTPS);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.PLANOF_CARE_RADIATION_ACTIVITY: {
				PlanofCareRadiationActivity planofCareRadiationActivity = (PlanofCareRadiationActivity) theEObject;
				T result = casePlanofCareRadiationActivity(planofCareRadiationActivity);
				if (result == null) {
					result = casePlanOfCareActivityAct(planofCareRadiationActivity);
				}
				if (result == null) {
					result = caseCDA_Act(planofCareRadiationActivity);
				}
				if (result == null) {
					result = caseClinicalStatement(planofCareRadiationActivity);
				}
				if (result == null) {
					result = caseAct(planofCareRadiationActivity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(planofCareRadiationActivity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.PROBLEM_SECTION_BCTPS: {
				ProblemSectionBCTPS problemSectionBCTPS = (ProblemSectionBCTPS) theEObject;
				T result = caseProblemSectionBCTPS(problemSectionBCTPS);
				if (result == null) {
					result = caseProblemSectionEntriesOptional(problemSectionBCTPS);
				}
				if (result == null) {
					result = caseSection(problemSectionBCTPS);
				}
				if (result == null) {
					result = caseAct(problemSectionBCTPS);
				}
				if (result == null) {
					result = caseInfrastructureRoot(problemSectionBCTPS);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.PROCEDURES_SECTION_BCTPS: {
				ProceduresSectionBCTPS proceduresSectionBCTPS = (ProceduresSectionBCTPS) theEObject;
				T result = caseProceduresSectionBCTPS(proceduresSectionBCTPS);
				if (result == null) {
					result = caseProceduresSectionEntriesOptional(proceduresSectionBCTPS);
				}
				if (result == null) {
					result = caseSection(proceduresSectionBCTPS);
				}
				if (result == null) {
					result = caseAct(proceduresSectionBCTPS);
				}
				if (result == null) {
					result = caseInfrastructureRoot(proceduresSectionBCTPS);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.RESULTS_SECTION_BCTPS: {
				ResultsSectionBCTPS resultsSectionBCTPS = (ResultsSectionBCTPS) theEObject;
				T result = caseResultsSectionBCTPS(resultsSectionBCTPS);
				if (result == null) {
					result = caseResultsSectionEntriesOptional(resultsSectionBCTPS);
				}
				if (result == null) {
					result = caseSection(resultsSectionBCTPS);
				}
				if (result == null) {
					result = caseAct(resultsSectionBCTPS);
				}
				if (result == null) {
					result = caseInfrastructureRoot(resultsSectionBCTPS);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.VITAL_SIGNS_SECTION_BCTPS: {
				VitalSignsSectionBCTPS vitalSignsSectionBCTPS = (VitalSignsSectionBCTPS) theEObject;
				T result = caseVitalSignsSectionBCTPS(vitalSignsSectionBCTPS);
				if (result == null) {
					result = caseVitalSignsSectionEntriesOptional(vitalSignsSectionBCTPS);
				}
				if (result == null) {
					result = caseSection(vitalSignsSectionBCTPS);
				}
				if (result == null) {
					result = caseAct(vitalSignsSectionBCTPS);
				}
				if (result == null) {
					result = caseInfrastructureRoot(vitalSignsSectionBCTPS);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.VITAL_SIGNS_ORGANIZER_BCTPS: {
				VitalSignsOrganizerBCTPS vitalSignsOrganizerBCTPS = (VitalSignsOrganizerBCTPS) theEObject;
				T result = caseVitalSignsOrganizerBCTPS(vitalSignsOrganizerBCTPS);
				if (result == null) {
					result = caseVitalSignsOrganizer(vitalSignsOrganizerBCTPS);
				}
				if (result == null) {
					result = caseOrganizer(vitalSignsOrganizerBCTPS);
				}
				if (result == null) {
					result = caseClinicalStatement(vitalSignsOrganizerBCTPS);
				}
				if (result == null) {
					result = caseAct(vitalSignsOrganizerBCTPS);
				}
				if (result == null) {
					result = caseInfrastructureRoot(vitalSignsOrganizerBCTPS);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CLONDATAPackage.CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY: {
				ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary = (ClinicalOncologyTreatmentPlanandSummary) theEObject;
				T result = caseClinicalOncologyTreatmentPlanandSummary(clinicalOncologyTreatmentPlanandSummary);
				if (result == null) {
					result = caseGeneralHeaderConstraints(clinicalOncologyTreatmentPlanandSummary);
				}
				if (result == null) {
					result = caseClinicalDocument(clinicalOncologyTreatmentPlanandSummary);
				}
				if (result == null) {
					result = caseAct(clinicalOncologyTreatmentPlanandSummary);
				}
				if (result == null) {
					result = caseInfrastructureRoot(clinicalOncologyTreatmentPlanandSummary);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anthracyclines Lifetime Dose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anthracyclines Lifetime Dose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnthracyclinesLifetimeDose(AnthracyclinesLifetimeDose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breast TNM Metastasis Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breast TNM Metastasis Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreastTNMMetastasisCategory(BreastTNMMetastasisCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breast TNM Clinical Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breast TNM Clinical Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreastTNMClinicalCategory(BreastTNMClinicalCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breast TNM Node Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breast TNM Node Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreastTNMNodeCategory(BreastTNMNodeCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breast TNM Tumor Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breast TNM Tumor Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreastTNMTumorCategory(BreastTNMTumorCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chemotherapeutic Drug Therapy Discontinued</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chemotherapeutic Drug Therapy Discontinued</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChemotherapeuticDrugTherapyDiscontinued(ChemotherapeuticDrugTherapyDiscontinued object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chemotherapy Protocol Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chemotherapy Protocol Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChemotherapyProtocolReference(ChemotherapyProtocolReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Drug Trial</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Drug Trial</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalDrugTrial(ClinicalDrugTrial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospitalization With Reason</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospitalization With Reason</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalizationWithReason(HospitalizationWithReason object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family Historyof Cancer None</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family Historyof Cancer None</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyHistoryofCancerNone(FamilyHistoryofCancerNone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family History Pedigree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family History Pedigree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyHistoryPedigree(FamilyHistoryPedigree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Last Menstrual Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Last Menstrual Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLastMenstrualPeriod(LastMenstrualPeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chemotherapy Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chemotherapy Medication Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChemotherapyMedicationActivity(ChemotherapyMedicationActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oncotype DX Score</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oncotype DX Score</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOncotypeDXScore(OncotypeDXScore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chemotherapy Regimen Plans</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chemotherapy Regimen Plans</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChemotherapyRegimenPlans(ChemotherapyRegimenPlans object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planof Care Activity Reconstruction Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planof Care Activity Reconstruction Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanofCareActivityReconstructionProcedure(PlanofCareActivityReconstructionProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chemotherapy Medication Activity Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chemotherapy Medication Activity Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChemotherapyMedicationActivityPlan(ChemotherapyMedicationActivityPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Treatment Disease Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Treatment Disease Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostTreatmentDiseaseStatus(PostTreatmentDiseaseStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breast Cancer Concern Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breast Cancer Concern Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreastCancerConcernAct(BreastCancerConcernAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breast Cancer Diagnosis Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breast Cancer Diagnosis Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreastCancerDiagnosisObservation(BreastCancerDiagnosisObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neurotoxicity Impairmentof AD Ls</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neurotoxicity Impairmentof AD Ls</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeurotoxicityImpairmentofADLs(NeurotoxicityImpairmentofADLs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radiation Therapy Care Completed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radiation Therapy Care Completed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadiationTherapyCareCompleted(RadiationTherapyCareCompleted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breast Cancer Procedures</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breast Cancer Procedures</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreastCancerProcedures(BreastCancerProcedures object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardiac Function Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardiac Function Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardiacFunctionObservation(CardiacFunctionObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Estrogen Receptor Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Estrogen Receptor Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEstrogenReceptorStatus(EstrogenReceptorStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HER2 Receptor Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HER2 Receptor Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHER2ReceptorStatus(HER2ReceptorStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numberof Lymph Nodes Positive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numberof Lymph Nodes Positive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberofLymphNodesPositive(NumberofLymphNodesPositive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numberof Lymph Nodes Removedand Examined</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numberof Lymph Nodes Removedand Examined</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberofLymphNodesRemovedandExamined(NumberofLymphNodesRemovedandExamined object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Progesterone Receptor Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Progesterone Receptor Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgesteroneReceptorStatus(ProgesteroneReceptorStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lymph Node Sampling Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lymph Node Sampling Result Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLymphNodeSamplingResultOrganizer(LymphNodeSamplingResultOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molecular Diagnostic Testing Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molecular Diagnostic Testing Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolecularDiagnosticTestingOrganizer(MolecularDiagnosticTestingOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receptor Status Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receptor Status Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceptorStatusOrganizer(ReceptorStatusOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Height</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Height</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyHeight(BodyHeight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Surface Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Surface Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodySurfaceArea(BodySurfaceArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Weight</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Weight</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyWeight(BodyWeight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounters Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounters Section BCTPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncountersSectionBCTPS(EncountersSectionBCTPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family History Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family History Section BCTPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyHistorySectionBCTPS(FamilyHistorySectionBCTPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Status Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Status Section BCTPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalStatusSectionBCTPS(FunctionalStatusSectionBCTPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medications Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medications Section BCTPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationsSectionBCTPS(MedicationsSectionBCTPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planof Care Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planof Care Section BCTPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanofCareSectionBCTPS(PlanofCareSectionBCTPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planof Care Radiation Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planof Care Radiation Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanofCareRadiationActivity(PlanofCareRadiationActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Section BCTPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemSectionBCTPS(ProblemSectionBCTPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedures Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedures Section BCTPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProceduresSectionBCTPS(ProceduresSectionBCTPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Results Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Results Section BCTPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultsSectionBCTPS(ResultsSectionBCTPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vital Signs Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Signs Section BCTPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSignsSectionBCTPS(VitalSignsSectionBCTPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vital Signs Organizer BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Signs Organizer BCTPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSignsOrganizerBCTPS(VitalSignsOrganizerBCTPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Oncology Treatment Planand Summary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Oncology Treatment Planand Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalOncologyTreatmentPlanandSummary(ClinicalOncologyTreatmentPlanandSummary object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceAdministration(SubstanceAdministration object) {
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
	public T caseCDA_Act(org.eclipse.mdht.uml.cda.Act object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounter(Encounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints(GeneralHeaderConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationActivity(MedicationActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultObservation(ResultObservation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivityProcedure(PlanOfCareActivityProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Substance Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivitySubstanceAdministration(PlanOfCareActivitySubstanceAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Concern Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Concern Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemConcernAct(ProblemConcernAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemObservation(ProblemObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Activity Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureActivityAct(ProcedureActivityAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Activity Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureActivityProcedure(ProcedureActivityProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizer(Organizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultOrganizer(ResultOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vital Sign Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Sign Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSignObservation(VitalSignObservation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Encounters Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounters Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncountersSectionEntriesOptional(EncountersSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family History Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyHistorySection(FamilyHistorySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Status Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalStatusSection(FunctionalStatusSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medications Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medications Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationsSectionEntriesOptional(MedicationsSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medications Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationsSection(MedicationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareSection(PlanOfCareSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivityAct(PlanOfCareActivityAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemSectionEntriesOptional(ProblemSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedures Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedures Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProceduresSectionEntriesOptional(ProceduresSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Results Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Results Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultsSectionEntriesOptional(ResultsSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vital Signs Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Signs Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSignsSectionEntriesOptional(VitalSignsSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Signs Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSignsOrganizer(VitalSignsOrganizer object) {
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

} // CLONDATASwitch
