/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics;
import org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet;
import org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem;
import org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement;
import org.openhealthtools.mdht.uml.cda.sdtm.Visit;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Human Clinical Subject Data Document Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#validateHumanClinicalSubjectDataDocumentSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#validateHumanClinicalSubjectDataDocumentSectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#validateHumanClinicalSubjectDataDocumentSectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#validateHumanClinicalSubjectDataDocumentSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#validateHumanClinicalSubjectDataDocumentSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#validateHumanClinicalSubjectDataDocumentSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#validateHumanClinicalSubjectDataDocumentSectionHumanClinicalSubjectDemographics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Human Clinical Subject Demographics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#validateHumanClinicalSubjectDataDocumentSectionHumanClinicalVisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Human Clinical Visit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#validateHumanClinicalSubjectDataDocumentSectionExposureAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Exposure Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#validateHumanClinicalSubjectDataDocumentSectionSubjectElement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Subject Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#validateHumanClinicalSubjectDataDocumentSectionDisposition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Disposition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#validateHumanClinicalSubjectDataDocumentSectionMedicalHistory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Medical History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#validateHumanClinicalSubjectDataDocumentSectionProtocolDeviation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Protocol Deviation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#validateHumanClinicalSubjectDataDocumentSectionClinicalEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Clinical Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#validateHumanClinicalSubjectDataDocumentSectionSubjectCharacteristic(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Subject Characteristic</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#validateHumanClinicalSubjectDataDocumentSectionStudySubjectEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Study Subject Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#validateHumanClinicalSubjectDataDocumentSectionStudySubjectFinding(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Study Subject Finding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#validateHumanClinicalSubjectDataDocumentSectionStudySubjectIntervention(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Study Subject Intervention</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#validateHumanClinicalSubjectDataDocumentSectionComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#validateHumanClinicalSubjectDataDocumentSectionAdverseEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Adverse Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#validateHumanClinicalSubjectDataDocumentSectionInclusionorExclusionCriteriaNotMet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Inclusionor Exclusion Criteria Not Met</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#validateHumanClinicalSubjectDataDocumentSectionFindingAbout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Finding About</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#validateHumanClinicalSubjectDataDocumentSectionexposureAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Sectionexposure Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#validateHumanClinicalSubjectDataDocumentSectionexposureAssociationExposureSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Sectionexposure Association Exposure Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#getHumanClinicalSubjectDemographics() <em>Get Human Clinical Subject Demographics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#getHumanClinicalVisits() <em>Get Human Clinical Visits</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#getSubjectElements() <em>Get Subject Elements</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#getDispositions() <em>Get Dispositions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#getMedicalHistories() <em>Get Medical Histories</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#getProtocolDeviations() <em>Get Protocol Deviations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#getClinicalEvents() <em>Get Clinical Events</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#getSubjectCharacteristics() <em>Get Subject Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#getStudySubjectEvents() <em>Get Study Subject Events</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#getStudySubjectFindings() <em>Get Study Subject Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#getStudySubjectInterventions() <em>Get Study Subject Interventions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#getComments() <em>Get Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#getAdverseEvents() <em>Get Adverse Events</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#getInclusionorExclusionCriteriaNotMets() <em>Get Inclusionor Exclusion Criteria Not Mets</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection#getFindingAbouts() <em>Get Finding Abouts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HumanClinicalSubjectDataDocumentSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HumanClinicalSubjectDataDocumentSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentSectionTemplateId(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionTemplateId(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.13')";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentSectionTemplateId(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionTemplateId(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDataDocumentSection The receiving '<em><b>Human Clinical Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDataDocumentSectionTemplateId(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentSection, context) }),
						 new Object [] { humanClinicalSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentSectionClassCode(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionClassCode(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode') and self.classCode=vocab::ActClass::DOCSECT";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentSectionClassCode(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionClassCode(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDataDocumentSection The receiving '<em><b>Human Clinical Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDataDocumentSectionClassCode(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentSectionClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentSection, context) }),
						 new Object [] { humanClinicalSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentSectionMoodCode(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionMoodCode(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::ActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentSectionMoodCode(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionMoodCode(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDataDocumentSection The receiving '<em><b>Human Clinical Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDataDocumentSectionMoodCode(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentSectionMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentSection, context) }),
						 new Object [] { humanClinicalSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentSectionCode(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionCode(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = 'HUStbd' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentSectionCode(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionCode(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDataDocumentSection The receiving '<em><b>Human Clinical Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDataDocumentSectionCode(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentSectionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentSection, context) }),
						 new Object [] { humanClinicalSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentSectionCodeP(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionCodeP(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentSectionCodeP(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionCodeP(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDataDocumentSection The receiving '<em><b>Human Clinical Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDataDocumentSectionCodeP(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentSectionCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentSection, context) }),
						 new Object [] { humanClinicalSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentSectionText(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionText(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentSectionText(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionText(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDataDocumentSection The receiving '<em><b>Human Clinical Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDataDocumentSectionText(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_TEXT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentSectionText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentSection, context) }),
						 new Object [] { humanClinicalSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentSectionHumanClinicalSubjectDemographics(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Human Clinical Subject Demographics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionHumanClinicalSubjectDemographics(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(sdtm::HumanClinicalSubjectDemographics) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentSectionHumanClinicalSubjectDemographics(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Human Clinical Subject Demographics</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionHumanClinicalSubjectDemographics(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDataDocumentSection The receiving '<em><b>Human Clinical Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDataDocumentSectionHumanClinicalSubjectDemographics(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentSectionHumanClinicalSubjectDemographics", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentSection, context) }),
						 new Object [] { humanClinicalSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentSectionHumanClinicalVisit(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Human Clinical Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionHumanClinicalVisit(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_HUMAN_CLINICAL_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(sdtm::Visit) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentSectionHumanClinicalVisit(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Human Clinical Visit</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionHumanClinicalVisit(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_HUMAN_CLINICAL_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDataDocumentSection The receiving '<em><b>Human Clinical Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDataDocumentSectionHumanClinicalVisit(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_HUMAN_CLINICAL_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_HUMAN_CLINICAL_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_HUMAN_CLINICAL_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_HUMAN_CLINICAL_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_HUMAN_CLINICAL_VISIT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentSectionHumanClinicalVisit", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentSection, context) }),
						 new Object [] { humanClinicalSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentSectionExposureAssociation(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Exposure Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionExposureAssociation(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_EXPOSURE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentSectionExposureAssociation(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Exposure Association</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionExposureAssociation(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_EXPOSURE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDataDocumentSection The receiving '<em><b>Human Clinical Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDataDocumentSectionExposureAssociation(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_EXPOSURE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_EXPOSURE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_EXPOSURE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_EXPOSURE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_EXPOSURE_ASSOCIATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentSectionExposureAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentSection, context) }),
						 new Object [] { humanClinicalSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentSectionSubjectElement(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Subject Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionSubjectElement(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(sdtm::SubjectElement) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentSectionSubjectElement(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Subject Element</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionSubjectElement(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDataDocumentSection The receiving '<em><b>Human Clinical Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDataDocumentSectionSubjectElement(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_ELEMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentSectionSubjectElement", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentSection, context) }),
						 new Object [] { humanClinicalSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentSectionDisposition(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Disposition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionDisposition(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(sdtm::HumanClinicalDisposition) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentSectionDisposition(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Disposition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionDisposition(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDataDocumentSection The receiving '<em><b>Human Clinical Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDataDocumentSectionDisposition(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_DISPOSITION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentSectionDisposition", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentSection, context) }),
						 new Object [] { humanClinicalSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentSectionMedicalHistory(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Medical History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionMedicalHistory(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::MedicalHistoryItem) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentSectionMedicalHistory(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Medical History</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionMedicalHistory(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDataDocumentSection The receiving '<em><b>Human Clinical Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDataDocumentSectionMedicalHistory(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_MEDICAL_HISTORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentSectionMedicalHistory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentSection, context) }),
						 new Object [] { humanClinicalSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentSectionProtocolDeviation(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Protocol Deviation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionProtocolDeviation(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_PROTOCOL_DEVIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::ProtocolDeviation) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentSectionProtocolDeviation(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Protocol Deviation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionProtocolDeviation(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_PROTOCOL_DEVIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDataDocumentSection The receiving '<em><b>Human Clinical Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDataDocumentSectionProtocolDeviation(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_PROTOCOL_DEVIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_PROTOCOL_DEVIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_PROTOCOL_DEVIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_PROTOCOL_DEVIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_PROTOCOL_DEVIATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentSectionProtocolDeviation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentSection, context) }),
						 new Object [] { humanClinicalSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentSectionClinicalEvent(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Clinical Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionClinicalEvent(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CLINICAL_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::ClinicalEvent) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentSectionClinicalEvent(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Clinical Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionClinicalEvent(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CLINICAL_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDataDocumentSection The receiving '<em><b>Human Clinical Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDataDocumentSectionClinicalEvent(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CLINICAL_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CLINICAL_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CLINICAL_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CLINICAL_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_CLINICAL_EVENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentSectionClinicalEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentSection, context) }),
						 new Object [] { humanClinicalSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentSectionSubjectCharacteristic(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Subject Characteristic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionSubjectCharacteristic(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::SubjectCharacteristic) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentSectionSubjectCharacteristic(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Subject Characteristic</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionSubjectCharacteristic(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDataDocumentSection The receiving '<em><b>Human Clinical Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDataDocumentSectionSubjectCharacteristic(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_CHARACTERISTIC,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentSectionSubjectCharacteristic", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentSection, context) }),
						 new Object [] { humanClinicalSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentSectionStudySubjectEvent(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Study Subject Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionStudySubjectEvent(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::StudySubjectEvent) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentSectionStudySubjectEvent(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Study Subject Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionStudySubjectEvent(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDataDocumentSection The receiving '<em><b>Human Clinical Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDataDocumentSectionStudySubjectEvent(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_EVENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentSectionStudySubjectEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentSection, context) }),
						 new Object [] { humanClinicalSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentSectionStudySubjectFinding(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Study Subject Finding</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionStudySubjectFinding(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::StudySubjectFinding) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentSectionStudySubjectFinding(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Study Subject Finding</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionStudySubjectFinding(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDataDocumentSection The receiving '<em><b>Human Clinical Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDataDocumentSectionStudySubjectFinding(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_FINDING,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentSectionStudySubjectFinding", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentSection, context) }),
						 new Object [] { humanClinicalSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentSectionStudySubjectIntervention(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Study Subject Intervention</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionStudySubjectIntervention(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_INTERVENTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(sdtm::StudySubjectIntervention) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentSectionStudySubjectIntervention(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Study Subject Intervention</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionStudySubjectIntervention(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_INTERVENTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDataDocumentSection The receiving '<em><b>Human Clinical Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDataDocumentSectionStudySubjectIntervention(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_INTERVENTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_INTERVENTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_INTERVENTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_INTERVENTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_INTERVENTION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentSectionStudySubjectIntervention", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentSection, context) }),
						 new Object [] { humanClinicalSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentSectionComment(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionComment(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Comment) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentSectionComment(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionComment(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDataDocumentSection The receiving '<em><b>Human Clinical Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDataDocumentSectionComment(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_COMMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentSectionComment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentSection, context) }),
						 new Object [] { humanClinicalSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentSectionAdverseEvent(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Adverse Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionAdverseEvent(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_ADVERSE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::AdverseEvent) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentSectionAdverseEvent(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Adverse Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionAdverseEvent(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_ADVERSE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDataDocumentSection The receiving '<em><b>Human Clinical Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDataDocumentSectionAdverseEvent(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_ADVERSE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_ADVERSE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_ADVERSE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_ADVERSE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_ADVERSE_EVENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentSectionAdverseEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentSection, context) }),
						 new Object [] { humanClinicalSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentSectionInclusionorExclusionCriteriaNotMet(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Inclusionor Exclusion Criteria Not Met</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionInclusionorExclusionCriteriaNotMet(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::InclusionorExclusionCriteriaNotMet) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentSectionInclusionorExclusionCriteriaNotMet(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Inclusionor Exclusion Criteria Not Met</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionInclusionorExclusionCriteriaNotMet(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDataDocumentSection The receiving '<em><b>Human Clinical Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDataDocumentSectionInclusionorExclusionCriteriaNotMet(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentSectionInclusionorExclusionCriteriaNotMet", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentSection, context) }),
						 new Object [] { humanClinicalSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentSectionFindingAbout(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Finding About</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionFindingAbout(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::FindingAbout) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentSectionFindingAbout(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Section Finding About</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionFindingAbout(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDataDocumentSection The receiving '<em><b>Human Clinical Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDataDocumentSectionFindingAbout(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION_FINDING_ABOUT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentSectionFindingAbout", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentSection, context) }),
						 new Object [] { humanClinicalSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentSectionexposureAssociationTypeCode(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Sectionexposure Association Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionexposureAssociationTypeCode(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTIONEXPOSURE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentSectionexposureAssociationTypeCode(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Sectionexposure Association Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionexposureAssociationTypeCode(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTIONEXPOSURE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDataDocumentSection The receiving '<em><b>Human Clinical Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDataDocumentSectionexposureAssociationTypeCode(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTIONEXPOSURE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTIONEXPOSURE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTIONEXPOSURE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTIONEXPOSURE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTIONEXPOSURE_ASSOCIATION_TYPE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentSectionexposureAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentSection, context) }),
						 new Object [] { humanClinicalSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDataDocumentSectionexposureAssociationExposureSubstanceAdministration(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Sectionexposure Association Exposure Substance Administration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionexposureAssociationExposureSubstanceAdministration(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTIONEXPOSURE_ASSOCIATION_EXPOSURE_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(substanceAdministration->one(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(sdtm::HumanClinicalExposure)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDataDocumentSectionexposureAssociationExposureSubstanceAdministration(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Sectionexposure Association Exposure Substance Administration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHumanClinicalSubjectDataDocumentSectionexposureAssociationExposureSubstanceAdministration(HumanClinicalSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTIONEXPOSURE_ASSOCIATION_EXPOSURE_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param humanClinicalSubjectDataDocumentSection The receiving '<em><b>Human Clinical Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHumanClinicalSubjectDataDocumentSectionexposureAssociationExposureSubstanceAdministration(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTIONEXPOSURE_ASSOCIATION_EXPOSURE_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTIONEXPOSURE_ASSOCIATION_EXPOSURE_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTIONEXPOSURE_ASSOCIATION_EXPOSURE_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTIONEXPOSURE_ASSOCIATION_EXPOSURE_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION__HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTIONEXPOSURE_ASSOCIATION_EXPOSURE_SUBSTANCE_ADMINISTRATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDataDocumentSectionexposureAssociationExposureSubstanceAdministration", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDataDocumentSection, context) }),
						 new Object [] { humanClinicalSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getHumanClinicalSubjectDemographics(HumanClinicalSubjectDataDocumentSection) <em>Get Human Clinical Subject Demographics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanClinicalSubjectDemographics(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::HumanClinicalSubjectDemographics))->asSequence()->any(true).oclAsType(sdtm::HumanClinicalSubjectDemographics)";

	/**
	 * The cached OCL query for the '{@link #getHumanClinicalSubjectDemographics(HumanClinicalSubjectDataDocumentSection) <em>Get Human Clinical Subject Demographics</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanClinicalSubjectDemographics(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  HumanClinicalSubjectDemographics getHumanClinicalSubjectDemographics(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection) {
		if (GET_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(79));
			try {
				GET_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__EOCL_QRY = helper.createQuery(GET_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__EOCL_QRY);
		return (HumanClinicalSubjectDemographics) query.evaluate(humanClinicalSubjectDataDocumentSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHumanClinicalVisits(HumanClinicalSubjectDataDocumentSection) <em>Get Human Clinical Visits</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanClinicalVisits(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HUMAN_CLINICAL_VISITS__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(sdtm::Visit)).oclAsType(sdtm::Visit)";

	/**
	 * The cached OCL query for the '{@link #getHumanClinicalVisits(HumanClinicalSubjectDataDocumentSection) <em>Get Human Clinical Visits</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanClinicalVisits(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HUMAN_CLINICAL_VISITS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<Visit> getHumanClinicalVisits(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection) {
		if (GET_HUMAN_CLINICAL_VISITS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(80));
			try {
				GET_HUMAN_CLINICAL_VISITS__EOCL_QRY = helper.createQuery(GET_HUMAN_CLINICAL_VISITS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HUMAN_CLINICAL_VISITS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Visit> result = (Collection<Visit>) query.evaluate(humanClinicalSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<Visit>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubjectElements(HumanClinicalSubjectDataDocumentSection) <em>Get Subject Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectElements(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUBJECT_ELEMENTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::SubjectElement)).oclAsType(sdtm::SubjectElement)";

	/**
	 * The cached OCL query for the '{@link #getSubjectElements(HumanClinicalSubjectDataDocumentSection) <em>Get Subject Elements</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectElements(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUBJECT_ELEMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<SubjectElement> getSubjectElements(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection) {
		if (GET_SUBJECT_ELEMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(81));
			try {
				GET_SUBJECT_ELEMENTS__EOCL_QRY = helper.createQuery(GET_SUBJECT_ELEMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUBJECT_ELEMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SubjectElement> result = (Collection<SubjectElement>) query.evaluate(humanClinicalSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<SubjectElement>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDispositions(HumanClinicalSubjectDataDocumentSection) <em>Get Dispositions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispositions(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DISPOSITIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::HumanClinicalDisposition)).oclAsType(sdtm::HumanClinicalDisposition)";

	/**
	 * The cached OCL query for the '{@link #getDispositions(HumanClinicalSubjectDataDocumentSection) <em>Get Dispositions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispositions(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DISPOSITIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<HumanClinicalDisposition> getDispositions(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection) {
		if (GET_DISPOSITIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(82));
			try {
				GET_DISPOSITIONS__EOCL_QRY = helper.createQuery(GET_DISPOSITIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DISPOSITIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<HumanClinicalDisposition> result = (Collection<HumanClinicalDisposition>) query.evaluate(humanClinicalSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<HumanClinicalDisposition>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicalHistories(HumanClinicalSubjectDataDocumentSection) <em>Get Medical Histories</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalHistories(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICAL_HISTORIES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::MedicalHistoryItem)).oclAsType(sdtm::MedicalHistoryItem)";

	/**
	 * The cached OCL query for the '{@link #getMedicalHistories(HumanClinicalSubjectDataDocumentSection) <em>Get Medical Histories</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalHistories(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICAL_HISTORIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<MedicalHistoryItem> getMedicalHistories(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection) {
		if (GET_MEDICAL_HISTORIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(83));
			try {
				GET_MEDICAL_HISTORIES__EOCL_QRY = helper.createQuery(GET_MEDICAL_HISTORIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICAL_HISTORIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MedicalHistoryItem> result = (Collection<MedicalHistoryItem>) query.evaluate(humanClinicalSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<MedicalHistoryItem>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProtocolDeviations(HumanClinicalSubjectDataDocumentSection) <em>Get Protocol Deviations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolDeviations(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROTOCOL_DEVIATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::ProtocolDeviation)).oclAsType(sdtm::ProtocolDeviation)";

	/**
	 * The cached OCL query for the '{@link #getProtocolDeviations(HumanClinicalSubjectDataDocumentSection) <em>Get Protocol Deviations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolDeviations(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROTOCOL_DEVIATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<ProtocolDeviation> getProtocolDeviations(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection) {
		if (GET_PROTOCOL_DEVIATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(84));
			try {
				GET_PROTOCOL_DEVIATIONS__EOCL_QRY = helper.createQuery(GET_PROTOCOL_DEVIATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROTOCOL_DEVIATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProtocolDeviation> result = (Collection<ProtocolDeviation>) query.evaluate(humanClinicalSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<ProtocolDeviation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getClinicalEvents(HumanClinicalSubjectDataDocumentSection) <em>Get Clinical Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalEvents(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CLINICAL_EVENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::ClinicalEvent)).oclAsType(sdtm::ClinicalEvent)";

	/**
	 * The cached OCL query for the '{@link #getClinicalEvents(HumanClinicalSubjectDataDocumentSection) <em>Get Clinical Events</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalEvents(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CLINICAL_EVENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<ClinicalEvent> getClinicalEvents(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection) {
		if (GET_CLINICAL_EVENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(85));
			try {
				GET_CLINICAL_EVENTS__EOCL_QRY = helper.createQuery(GET_CLINICAL_EVENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CLINICAL_EVENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ClinicalEvent> result = (Collection<ClinicalEvent>) query.evaluate(humanClinicalSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<ClinicalEvent>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubjectCharacteristics(HumanClinicalSubjectDataDocumentSection) <em>Get Subject Characteristics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectCharacteristics(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUBJECT_CHARACTERISTICS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SubjectCharacteristic)).oclAsType(sdtm::SubjectCharacteristic)";

	/**
	 * The cached OCL query for the '{@link #getSubjectCharacteristics(HumanClinicalSubjectDataDocumentSection) <em>Get Subject Characteristics</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectCharacteristics(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUBJECT_CHARACTERISTICS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<SubjectCharacteristic> getSubjectCharacteristics(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection) {
		if (GET_SUBJECT_CHARACTERISTICS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(86));
			try {
				GET_SUBJECT_CHARACTERISTICS__EOCL_QRY = helper.createQuery(GET_SUBJECT_CHARACTERISTICS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUBJECT_CHARACTERISTICS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SubjectCharacteristic> result = (Collection<SubjectCharacteristic>) query.evaluate(humanClinicalSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<SubjectCharacteristic>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getStudySubjectEvents(HumanClinicalSubjectDataDocumentSection) <em>Get Study Subject Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudySubjectEvents(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STUDY_SUBJECT_EVENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::StudySubjectEvent)).oclAsType(sdtm::StudySubjectEvent)";

	/**
	 * The cached OCL query for the '{@link #getStudySubjectEvents(HumanClinicalSubjectDataDocumentSection) <em>Get Study Subject Events</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudySubjectEvents(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STUDY_SUBJECT_EVENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<StudySubjectEvent> getStudySubjectEvents(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection) {
		if (GET_STUDY_SUBJECT_EVENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(87));
			try {
				GET_STUDY_SUBJECT_EVENTS__EOCL_QRY = helper.createQuery(GET_STUDY_SUBJECT_EVENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_SUBJECT_EVENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<StudySubjectEvent> result = (Collection<StudySubjectEvent>) query.evaluate(humanClinicalSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<StudySubjectEvent>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getStudySubjectFindings(HumanClinicalSubjectDataDocumentSection) <em>Get Study Subject Findings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudySubjectFindings(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STUDY_SUBJECT_FINDINGS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::StudySubjectFinding)).oclAsType(sdtm::StudySubjectFinding)";

	/**
	 * The cached OCL query for the '{@link #getStudySubjectFindings(HumanClinicalSubjectDataDocumentSection) <em>Get Study Subject Findings</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudySubjectFindings(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STUDY_SUBJECT_FINDINGS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<StudySubjectFinding> getStudySubjectFindings(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection) {
		if (GET_STUDY_SUBJECT_FINDINGS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(88));
			try {
				GET_STUDY_SUBJECT_FINDINGS__EOCL_QRY = helper.createQuery(GET_STUDY_SUBJECT_FINDINGS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_SUBJECT_FINDINGS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<StudySubjectFinding> result = (Collection<StudySubjectFinding>) query.evaluate(humanClinicalSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<StudySubjectFinding>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getStudySubjectInterventions(HumanClinicalSubjectDataDocumentSection) <em>Get Study Subject Interventions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudySubjectInterventions(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STUDY_SUBJECT_INTERVENTIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(sdtm::StudySubjectIntervention)).oclAsType(sdtm::StudySubjectIntervention)";

	/**
	 * The cached OCL query for the '{@link #getStudySubjectInterventions(HumanClinicalSubjectDataDocumentSection) <em>Get Study Subject Interventions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudySubjectInterventions(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STUDY_SUBJECT_INTERVENTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<StudySubjectIntervention> getStudySubjectInterventions(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection) {
		if (GET_STUDY_SUBJECT_INTERVENTIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(89));
			try {
				GET_STUDY_SUBJECT_INTERVENTIONS__EOCL_QRY = helper.createQuery(GET_STUDY_SUBJECT_INTERVENTIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_SUBJECT_INTERVENTIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<StudySubjectIntervention> result = (Collection<StudySubjectIntervention>) query.evaluate(humanClinicalSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<StudySubjectIntervention>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(HumanClinicalSubjectDataDocumentSection) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment)).oclAsType(sdtm::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComments(HumanClinicalSubjectDataDocumentSection) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<Comment> getComments(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection) {
		if (GET_COMMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(90));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(humanClinicalSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdverseEvents(HumanClinicalSubjectDataDocumentSection) <em>Get Adverse Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdverseEvents(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVERSE_EVENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::AdverseEvent)).oclAsType(sdtm::AdverseEvent)";

	/**
	 * The cached OCL query for the '{@link #getAdverseEvents(HumanClinicalSubjectDataDocumentSection) <em>Get Adverse Events</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdverseEvents(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADVERSE_EVENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<AdverseEvent> getAdverseEvents(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection) {
		if (GET_ADVERSE_EVENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(91));
			try {
				GET_ADVERSE_EVENTS__EOCL_QRY = helper.createQuery(GET_ADVERSE_EVENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADVERSE_EVENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AdverseEvent> result = (Collection<AdverseEvent>) query.evaluate(humanClinicalSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<AdverseEvent>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getInclusionorExclusionCriteriaNotMets(HumanClinicalSubjectDataDocumentSection) <em>Get Inclusionor Exclusion Criteria Not Mets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclusionorExclusionCriteriaNotMets(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::InclusionorExclusionCriteriaNotMet)).oclAsType(sdtm::InclusionorExclusionCriteriaNotMet)";

	/**
	 * The cached OCL query for the '{@link #getInclusionorExclusionCriteriaNotMets(HumanClinicalSubjectDataDocumentSection) <em>Get Inclusionor Exclusion Criteria Not Mets</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclusionorExclusionCriteriaNotMets(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<InclusionorExclusionCriteriaNotMet> getInclusionorExclusionCriteriaNotMets(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection) {
		if (GET_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(92));
			try {
				GET_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METS__EOCL_QRY = helper.createQuery(GET_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<InclusionorExclusionCriteriaNotMet> result = (Collection<InclusionorExclusionCriteriaNotMet>) query.evaluate(humanClinicalSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<InclusionorExclusionCriteriaNotMet>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getFindingAbouts(HumanClinicalSubjectDataDocumentSection) <em>Get Finding Abouts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FINDING_ABOUTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::FindingAbout)).oclAsType(sdtm::FindingAbout)";

	/**
	 * The cached OCL query for the '{@link #getFindingAbouts(HumanClinicalSubjectDataDocumentSection) <em>Get Finding Abouts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(HumanClinicalSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FINDING_ABOUTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<FindingAbout> getFindingAbouts(HumanClinicalSubjectDataDocumentSection humanClinicalSubjectDataDocumentSection) {
		if (GET_FINDING_ABOUTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(93));
			try {
				GET_FINDING_ABOUTS__EOCL_QRY = helper.createQuery(GET_FINDING_ABOUTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FINDING_ABOUTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FindingAbout> result = (Collection<FindingAbout>) query.evaluate(humanClinicalSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<FindingAbout>(result.size(), result.toArray());
	}

} // HumanClinicalSubjectDataDocumentSectionOperations