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
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Transition Of Care Inpatient Summary</b></em>' model
 * objects. <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#validateTransitionOfCareInpatientSummaryMedications(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Inpatient Summary Medications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#validateTransitionOfCareInpatientSummaryEncounterDiagnoses(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Inpatient Summary Encounter Diagnoses</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Inpatient Summary Hospital Discharge Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#getHospitalDischargeInstructionsSection() <em>Get Hospital Discharge Instructions Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionOfCareInpatientSummaryOperations extends
		SummaryOfCareRecordOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionOfCareInpatientSummaryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransitionOfCareInpatientSummaryMedications(TransitionOfCareInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Inpatient Summary Medications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransitionOfCareInpatientSummaryMedications(TransitionOfCareInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::MedicationsSection)) or "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalDischargeMedicationsSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransitionOfCareInpatientSummaryMedications(TransitionOfCareInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Inpatient Summary Medications</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransitionOfCareInpatientSummaryMedications(TransitionOfCareInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::MedicationsSection)) or 
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalDischargeMedicationsSection)))
	 * @param transitionOfCareInpatientSummary The receiving '<em><b>Transition Of Care Inpatient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTransitionOfCareInpatientSummaryMedications(TransitionOfCareInpatientSummary transitionOfCareInpatientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.TRANSITION_OF_CARE_INPATIENT_SUMMARY);
			try {
				VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(transitionOfCareInpatientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.TRANSITION_OF_CARE_INPATIENT_SUMMARY__TRANSITION_OF_CARE_INPATIENT_SUMMARY_MEDICATIONS,
						 Mu2consolPlugin.INSTANCE.getString("TransitionOfCareInpatientSummaryMedications"),
						 new Object [] { transitionOfCareInpatientSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransitionOfCareInpatientSummaryEncounterDiagnoses(TransitionOfCareInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Inpatient Summary Encounter Diagnoses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransitionOfCareInpatientSummaryEncounterDiagnoses(TransitionOfCareInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_ENCOUNTER_DIAGNOSES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(  self.getSections()->exists( sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::AssessmentSection) and sec.getObservations()->exists(obs : cda::Observation | not obs.oclIsUndefined() and obs.oclIsKindOf(consol::ProblemObservation)) )  )  or  (  self.getSections()->exists( sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::AssessmentAndPlanSection) and sec.getObservations()->exists(obs : cda::Observation | not obs.oclIsUndefined() and obs.oclIsKindOf(consol::ProblemObservation)) )  )  or  (  self.getSections()->exists( sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::PostoperativeDiagnosisSection) and sec.getObservations()->exists(obs : cda::Observation | not obs.oclIsUndefined() and obs.oclIsKindOf(consol::ProblemObservation)) )  )  or  (  self.getSections()->exists(sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::ProblemSection) and ( sec.getActs()->exists(a : cda::Act | not a.oclIsUndefined() and a.oclIsKindOf(consol::ProblemConcernAct) or sec.getObservations()->exists(obs : cda::Observation | not obs.oclIsUndefined() and obs.oclIsKindOf(consol::ProblemObservation)) ) ) )  )  or  (  self.getSections()->exists( sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::HospitalAdmissionDiagnosisSection) and sec.getActs()->exists(a : cda::Act | not a.oclIsUndefined() and a.oclIsKindOf(consol::HospitalAdmissionDiagnosis)) )  )  or  (  self.getSections()->exists( sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::HospitalDischargeDiagnosisSection) and sec.getActs()->exists(a : cda::Act | not a.oclIsUndefined() and a.oclIsKindOf(consol::HospitalDischargeDiagnosis)) )  )  or  (  self.getSections()->exists(sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::EncountersSection) and ( sec.getEncounters()->exists(enc : cda::Encounter | not enc.oclIsUndefined() and enc.oclIsKindOf(consol::EncounterActivities) or sec.getActs()->exists(a : cda::Act | not a.oclIsUndefined() and a.oclIsKindOf(consol::EncounterDiagnosis)) ) ) )  )";

	/**
	 * The cached OCL invariant for the '{@link #validateTransitionOfCareInpatientSummaryEncounterDiagnoses(TransitionOfCareInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Inpatient Summary Encounter Diagnoses</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransitionOfCareInpatientSummaryEncounterDiagnoses(TransitionOfCareInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_ENCOUNTER_DIAGNOSES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (  self.getSections()->exists( sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::AssessmentSection) and sec.getObservations()->exists(obs : cda::Observation | not obs.oclIsUndefined() and obs.oclIsKindOf(consol::ProblemObservation)) )  )  or  (  self.getSections()->exists( sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::AssessmentAndPlanSection) and sec.getObservations()->exists(obs : cda::Observation | not obs.oclIsUndefined() and obs.oclIsKindOf(consol::ProblemObservation)) )  )  or  (  self.getSections()->exists( sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::PostoperativeDiagnosisSection) and sec.getObservations()->exists(obs : cda::Observation | not obs.oclIsUndefined() and obs.oclIsKindOf(consol::ProblemObservation)) )  )  or  (  self.getSections()->exists(sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::ProblemSection) and ( sec.getActs()->exists(a : cda::Act | not a.oclIsUndefined() and a.oclIsKindOf(consol::ProblemConcernAct) or sec.getObservations()->exists(obs : cda::Observation | not obs.oclIsUndefined() and obs.oclIsKindOf(consol::ProblemObservation)) ) ) )  )  or  (  self.getSections()->exists( sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::HospitalAdmissionDiagnosisSection) and sec.getActs()->exists(a : cda::Act | not a.oclIsUndefined() and a.oclIsKindOf(consol::HospitalAdmissionDiagnosis)) )  )  or  (  self.getSections()->exists( sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::HospitalDischargeDiagnosisSection) and sec.getActs()->exists(a : cda::Act | not a.oclIsUndefined() and a.oclIsKindOf(consol::HospitalDischargeDiagnosis)) )  )  or  (  self.getSections()->exists(sec : cda::Section | not sec.oclIsUndefined() and sec.oclIsKindOf(consol::EncountersSection) and ( sec.getEncounters()->exists(enc : cda::Encounter | not enc.oclIsUndefined() and enc.oclIsKindOf(consol::EncounterActivities) or sec.getActs()->exists(a : cda::Act | not a.oclIsUndefined() and a.oclIsKindOf(consol::EncounterDiagnosis)) ) ) )  )
	 * @param transitionOfCareInpatientSummary The receiving '<em><b>Transition Of Care Inpatient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTransitionOfCareInpatientSummaryEncounterDiagnoses(TransitionOfCareInpatientSummary transitionOfCareInpatientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_ENCOUNTER_DIAGNOSES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.TRANSITION_OF_CARE_INPATIENT_SUMMARY);
			try {
				VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_ENCOUNTER_DIAGNOSES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_ENCOUNTER_DIAGNOSES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_ENCOUNTER_DIAGNOSES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(transitionOfCareInpatientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.TRANSITION_OF_CARE_INPATIENT_SUMMARY__TRANSITION_OF_CARE_INPATIENT_SUMMARY_ENCOUNTER_DIAGNOSES,
						 Mu2consolPlugin.INSTANCE.getString("TransitionOfCareInpatientSummaryEncounterDiagnoses"),
						 new Object [] { transitionOfCareInpatientSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(TransitionOfCareInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Inpatient Summary Hospital Discharge Instructions Section</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(TransitionOfCareInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(TransitionOfCareInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Inpatient Summary Hospital Discharge Instructions Section</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(TransitionOfCareInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))
	 * 
	 * @param transitionOfCareInpatientSummary
	 *            The receiving '
	 *            <em><b>Transition Of Care Inpatient Summary</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(
			TransitionOfCareInpatientSummary transitionOfCareInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.TRANSITION_OF_CARE_INPATIENT_SUMMARY);
			try {
				VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(transitionOfCareInpatientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.TRANSITION_OF_CARE_INPATIENT_SUMMARY__TRANSITION_OF_CARE_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("TransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection"),
						 new Object [] { transitionOfCareInpatientSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getHospitalDischargeInstructionsSection(TransitionOfCareInpatientSummary)
	 * <em>Get Hospital Discharge Instructions Section</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHospitalDischargeInstructionsSection(TransitionOfCareInpatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))->asSequence()->any(true).oclAsType(consol::HospitalDischargeInstructionsSection)";

	/**
	 * The cached OCL query for the '{@link #getHospitalDischargeInstructionsSection(TransitionOfCareInpatientSummary) <em>Get Hospital Discharge Instructions Section</em>}' query operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHospitalDischargeInstructionsSection(TransitionOfCareInpatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::HospitalDischargeInstructionsSection
	 * ))->asSequence
	 * ()->any(true).oclAsType(consol::HospitalDischargeInstructionsSection)
	 * 
	 * @param transitionOfCareInpatientSummary
	 *            The receiving '
	 *            <em><b>Transition Of Care Inpatient Summary</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static HospitalDischargeInstructionsSection getHospitalDischargeInstructionsSection(
			TransitionOfCareInpatientSummary transitionOfCareInpatientSummary) {
		if (GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.TRANSITION_OF_CARE_INPATIENT_SUMMARY, Mu2consolPackage.Literals.TRANSITION_OF_CARE_INPATIENT_SUMMARY.getEAllOperations().get(318));
			try {
				GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_QRY);
		return (HospitalDischargeInstructionsSection) query.evaluate(transitionOfCareInpatientSummary);
	}

} // TransitionOfCareInpatientSummaryOperations