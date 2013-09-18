/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Transition Of Care Ambulatory Summary</b></em>' model
 * objects. <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary#validateTransitionOfCareAmbulatorySummaryProviderNameAndContactInfo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Provider Name And Contact Info</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary#validateTransitionOfCareAmbulatorySummaryReasonForReferral(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Reason For Referral</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary#validateTransitionOfCareAmbulatorySummaryEncounterDiagnoses(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Encounter Diagnoses</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary#validateTransitionOfCareAmbulatorySummaryMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary#getMedicationsSection() <em>Get Medications Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionOfCareAmbulatorySummaryOperations extends
		SummaryOfCareRecordOperations {
	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	protected TransitionOfCareAmbulatorySummaryOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateTransitionOfCareAmbulatorySummaryProviderNameAndContactInfo(TransitionOfCareAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Provider Name And Contact Info</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTransitionOfCareAmbulatorySummaryProviderNameAndContactInfo(TransitionOfCareAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->notEmpty() and self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->exists(assignedEntity->excluding(null).assignedPerson->excluding(null).name->notEmpty() and assignedEntity->excluding(null).addr->notEmpty() and assignedEntity->excluding(null).telecom->notEmpty())) or (self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->notEmpty() and self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->exists(assignedEntity->excluding(null).assignedPerson->excluding(null).name->notEmpty() and assignedEntity->excluding(null).addr->notEmpty() and assignedEntity->excluding(null).telecom->notEmpty())) or (self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->notEmpty() and self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->exists(assignedEntity->excluding(null).assignedPerson->excluding(null).name->notEmpty() and assignedEntity->excluding(null).addr->notEmpty() and assignedEntity->excluding(null).telecom->notEmpty()))";

	/**
   * The cached OCL invariant for the '{@link #validateTransitionOfCareAmbulatorySummaryProviderNameAndContactInfo(TransitionOfCareAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Provider Name And Contact Info</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTransitionOfCareAmbulatorySummaryProviderNameAndContactInfo(TransitionOfCareAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param transitionOfCareAmbulatorySummary The receiving '<em><b>Transition Of Care Ambulatory Summary</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateTransitionOfCareAmbulatorySummaryProviderNameAndContactInfo(TransitionOfCareAmbulatorySummary transitionOfCareAmbulatorySummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.TRANSITION_OF_CARE_AMBULATORY_SUMMARY);
      try
      {
        VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(transitionOfCareAmbulatorySummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.TRANSITION_OF_CARE_AMBULATORY_SUMMARY__TRANSITION_OF_CARE_AMBULATORY_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO,
             Mu2consolPlugin.INSTANCE.getString("TransitionOfCareAmbulatorySummaryTransitionOfCareAmbulatorySummaryProviderNameAndContactInfo"),
             new Object [] { transitionOfCareAmbulatorySummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateTransitionOfCareAmbulatorySummaryReasonForReferral(TransitionOfCareAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Reason For Referral</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTransitionOfCareAmbulatorySummaryReasonForReferral(TransitionOfCareAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_REASON_FOR_REFERRAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::PlanOfCareSection)) or "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::AssessmentAndPlanSection)) or self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::ReasonForReferralSection))";

	/**
   * The cached OCL invariant for the '{@link #validateTransitionOfCareAmbulatorySummaryReasonForReferral(TransitionOfCareAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Reason For Referral</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTransitionOfCareAmbulatorySummaryReasonForReferral(TransitionOfCareAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_REASON_FOR_REFERRAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param transitionOfCareAmbulatorySummary The receiving '<em><b>Transition Of Care Ambulatory Summary</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateTransitionOfCareAmbulatorySummaryReasonForReferral(TransitionOfCareAmbulatorySummary transitionOfCareAmbulatorySummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_REASON_FOR_REFERRAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.TRANSITION_OF_CARE_AMBULATORY_SUMMARY);
      try
      {
        VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_REASON_FOR_REFERRAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_REASON_FOR_REFERRAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_REASON_FOR_REFERRAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(transitionOfCareAmbulatorySummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.TRANSITION_OF_CARE_AMBULATORY_SUMMARY__TRANSITION_OF_CARE_AMBULATORY_SUMMARY_REASON_FOR_REFERRAL,
             Mu2consolPlugin.INSTANCE.getString("TransitionOfCareAmbulatorySummaryTransitionOfCareAmbulatorySummaryReasonForReferral"),
             new Object [] { transitionOfCareAmbulatorySummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateTransitionOfCareAmbulatorySummaryEncounterDiagnoses(TransitionOfCareAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Encounter Diagnoses</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTransitionOfCareAmbulatorySummaryEncounterDiagnoses(TransitionOfCareAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_ENCOUNTER_DIAGNOSES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(  self.getSections()->exists( sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::AssessmentSection) and sec.getObservations()->exists(obs : cda::Observation | not obs.oclIsUndefined() and obs.oclIsKindOf(consol::ProblemObservation)) )  )  or  (  self.getSections()->exists( sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::AssessmentAndPlanSection) and sec.getObservations()->exists(obs : cda::Observation | not obs.oclIsUndefined() and obs.oclIsKindOf(consol::ProblemObservation)) )  )  or  (  self.getSections()->exists( sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::PostoperativeDiagnosisSection) and sec.getObservations()->exists(obs : cda::Observation | not obs.oclIsUndefined() and obs.oclIsKindOf(consol::ProblemObservation)) )  )  or  (  self.getSections()->exists(sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::ProblemSection) and ( sec.getActs()->exists(a : cda::Act | not a.oclIsUndefined() and a.oclIsKindOf(consol::ProblemConcernAct) or sec.getObservations()->exists(obs : cda::Observation | not obs.oclIsUndefined() and obs.oclIsKindOf(consol::ProblemObservation)) ) ) )  )  or  (  self.getSections()->exists( sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::HospitalAdmissionDiagnosisSection) and sec.getActs()->exists(a : cda::Act | not a.oclIsUndefined() and a.oclIsKindOf(consol::HospitalAdmissionDiagnosis)) )  )  or  (  self.getSections()->exists( sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::HospitalDischargeDiagnosisSection) and sec.getActs()->exists(a : cda::Act | not a.oclIsUndefined() and a.oclIsKindOf(consol::HospitalDischargeDiagnosis)) )  )  or  (  self.getSections()->exists(sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::EncountersSection) and ( sec.getEncounters()->exists(enc : cda::Encounter | not enc.oclIsUndefined() and enc.oclIsKindOf(consol::EncounterActivities) or sec.getActs()->exists(a : cda::Act | not a.oclIsUndefined() and a.oclIsKindOf(consol::EncounterDiagnosis)) ) ) )  )";

	/**
   * The cached OCL invariant for the '{@link #validateTransitionOfCareAmbulatorySummaryEncounterDiagnoses(TransitionOfCareAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Encounter Diagnoses</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTransitionOfCareAmbulatorySummaryEncounterDiagnoses(TransitionOfCareAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_ENCOUNTER_DIAGNOSES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param transitionOfCareAmbulatorySummary The receiving '<em><b>Transition Of Care Ambulatory Summary</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateTransitionOfCareAmbulatorySummaryEncounterDiagnoses(TransitionOfCareAmbulatorySummary transitionOfCareAmbulatorySummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_ENCOUNTER_DIAGNOSES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.TRANSITION_OF_CARE_AMBULATORY_SUMMARY);
      try
      {
        VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_ENCOUNTER_DIAGNOSES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_ENCOUNTER_DIAGNOSES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_ENCOUNTER_DIAGNOSES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(transitionOfCareAmbulatorySummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.TRANSITION_OF_CARE_AMBULATORY_SUMMARY__TRANSITION_OF_CARE_AMBULATORY_SUMMARY_ENCOUNTER_DIAGNOSES,
             Mu2consolPlugin.INSTANCE.getString("TransitionOfCareAmbulatorySummaryTransitionOfCareAmbulatorySummaryEncounterDiagnoses"),
             new Object [] { transitionOfCareAmbulatorySummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateTransitionOfCareAmbulatorySummaryMedicationsSection(TransitionOfCareAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Medications Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTransitionOfCareAmbulatorySummaryMedicationsSection(TransitionOfCareAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))";

	/**
   * The cached OCL invariant for the '{@link #validateTransitionOfCareAmbulatorySummaryMedicationsSection(TransitionOfCareAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Medications Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTransitionOfCareAmbulatorySummaryMedicationsSection(TransitionOfCareAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param transitionOfCareAmbulatorySummary The receiving '<em><b>Transition Of Care Ambulatory Summary</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateTransitionOfCareAmbulatorySummaryMedicationsSection(TransitionOfCareAmbulatorySummary transitionOfCareAmbulatorySummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.TRANSITION_OF_CARE_AMBULATORY_SUMMARY);
      try
      {
        VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(transitionOfCareAmbulatorySummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.TRANSITION_OF_CARE_AMBULATORY_SUMMARY__TRANSITION_OF_CARE_AMBULATORY_SUMMARY_MEDICATIONS_SECTION,
             Mu2consolPlugin.INSTANCE.getString("TransitionOfCareAmbulatorySummaryTransitionOfCareAmbulatorySummaryMedicationsSection"),
             new Object [] { transitionOfCareAmbulatorySummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getMedicationsSection(TransitionOfCareAmbulatorySummary) <em>Get Medications Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMedicationsSection(TransitionOfCareAmbulatorySummary)
   * @generated
   * @ordered
   */
	protected static final String GET_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->any(true).oclAsType(consol::MedicationsSection)";

	/**
   * The cached OCL query for the '{@link #getMedicationsSection(TransitionOfCareAmbulatorySummary) <em>Get Medications Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMedicationsSection(TransitionOfCareAmbulatorySummary)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  MedicationsSection getMedicationsSection(TransitionOfCareAmbulatorySummary transitionOfCareAmbulatorySummary) {
    if (GET_MEDICATIONS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.TRANSITION_OF_CARE_AMBULATORY_SUMMARY, Mu2consolPackage.Literals.TRANSITION_OF_CARE_AMBULATORY_SUMMARY.getEAllOperations().get(318));
      try
      {
        GET_MEDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_SECTION__EOCL_QRY);
    return (MedicationsSection) query.evaluate(transitionOfCareAmbulatorySummary);
  }

} // TransitionOfCareAmbulatorySummaryOperations