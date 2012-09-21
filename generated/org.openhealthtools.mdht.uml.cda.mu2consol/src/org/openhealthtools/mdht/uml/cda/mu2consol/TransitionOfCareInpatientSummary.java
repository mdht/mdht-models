/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Of Care Inpatient Summary</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getTransitionOfCareInpatientSummary()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='TransitionOfCareInpatientSummaryInpatientEncounterDiagnoses TransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection TransitionOfCareInpatientSummaryHospitalDischargeMedicationsSection TransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisSectionTemplateId TransitionOfCareInpatientSummaryMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis TransitionOfCareInpatientSummaryHospitalDischargeDiagnosisSectionTemplateId TransitionOfCareInpatientSummaryMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis' constraints.validation.query='TransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisSectionTemplateId TransitionOfCareInpatientSummaryMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis TransitionOfCareInpatientSummaryHospitalDischargeDiagnosisSectionTemplateId TransitionOfCareInpatientSummaryMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis'"
 * @generated
 */
public interface TransitionOfCareInpatientSummary extends SummaryOfCareRecord {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ( self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::ProblemSection)) or 
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::PostoperativeDiagnosisSection)) or  
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::PostprocedureDiagnosisSection)) or 
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::EncountersSection)) or 
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::AssessmentSection)) or 
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::AssessmentAndPlanSection)) or 
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::HospitalAdmissionDiagnosisSection)) or 
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::HospitalDischargeDiagnosisSection)) )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='( self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::ProblemSection)) or \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::PostoperativeDiagnosisSection)) or  \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::PostprocedureDiagnosisSection)) or \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::EncountersSection)) or \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::AssessmentSection)) or \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::AssessmentAndPlanSection)) or \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::HospitalAdmissionDiagnosisSection)) or \r\nself.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::HospitalDischargeDiagnosisSection)) )'"
	 * @generated
	 */
	boolean validateTransitionOfCareInpatientSummaryInpatientEncounterDiagnoses(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))'"
	 * @generated
	 */
	boolean validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSection))'"
	 * @generated
	 */
	boolean validateTransitionOfCareInpatientSummaryHospitalDischargeMedicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getHospitalAdmissionDiagnosisSection()->excluding(null)->reject(getHospitalAdmissionDiagnosisSection().templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.43'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getHospitalAdmissionDiagnosisSection()->excluding(null)->reject(getHospitalAdmissionDiagnosisSection().templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.43\'))'"
	 * @generated
	 */
	boolean validateTransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getHospitalAdmissionDiagnosisSection()->excluding(null)->reject(getHospitalAdmissionDiagnosisSection().entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::HospitalAdmissionDiagnosis)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getHospitalAdmissionDiagnosisSection()->excluding(null)->reject(getHospitalAdmissionDiagnosisSection().entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::HospitalAdmissionDiagnosis)))'"
	 * @generated
	 */
	boolean validateTransitionOfCareInpatientSummaryMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getHospitalDischargeDiagnosisSection()->excluding(null)->reject(getHospitalDischargeDiagnosisSection().templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.24'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getHospitalDischargeDiagnosisSection()->excluding(null)->reject(getHospitalDischargeDiagnosisSection().templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.24\'))'"
	 * @generated
	 */
	boolean validateTransitionOfCareInpatientSummaryHospitalDischargeDiagnosisSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getHospitalDischargeDiagnosisSection()->excluding(null)->reject(getHospitalDischargeDiagnosisSection().entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::HospitalDischargeDiagnosis)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getHospitalDischargeDiagnosisSection()->excluding(null)->reject(getHospitalDischargeDiagnosisSection().entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::HospitalDischargeDiagnosis)))'"
	 * @generated
	 */
	boolean validateTransitionOfCareInpatientSummaryMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))->asSequence()->any(true).oclAsType(consol::HospitalDischargeInstructionsSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))->asSequence()->any(true).oclAsType(consol::HospitalDischargeInstructionsSection)'"
	 * @generated
	 */
	HospitalDischargeInstructionsSection getHospitalDischargeInstructionsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSection))->asSequence()->any(true).oclAsType(consol::HospitalDischargeMedicationsSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSection))->asSequence()->any(true).oclAsType(consol::HospitalDischargeMedicationsSection)'"
	 * @generated
	 */
	HospitalDischargeMedicationsSection getHospitalDischargeMedicationsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::HospitalAdmissionDiagnosisSection))->asSequence()->any(true).oclAsType(mu2consol::HospitalAdmissionDiagnosisSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::HospitalAdmissionDiagnosisSection))->asSequence()->any(true).oclAsType(mu2consol::HospitalAdmissionDiagnosisSection)'"
	 * @generated
	 */
	HospitalAdmissionDiagnosisSection getHospitalAdmissionDiagnosisSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::HospitalDischargeDiagnosisSection))->asSequence()->any(true).oclAsType(mu2consol::HospitalDischargeDiagnosisSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::HospitalDischargeDiagnosisSection))->asSequence()->any(true).oclAsType(mu2consol::HospitalDischargeDiagnosisSection)'"
	 * @generated
	 */
	HospitalDischargeDiagnosisSection getHospitalDischargeDiagnosisSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionOfCareInpatientSummary init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransitionOfCareInpatientSummary init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // TransitionOfCareInpatientSummary
