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

import org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight;
import org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain;
import org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis;
import org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption;
import org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics;
import org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement;
import org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement;
import org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.VitalSign;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Nonhuman Subject Data Document Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionNonhumanSubjectDemographics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Nonhuman Subject Demographics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionNonhumanDisposition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Nonhuman Disposition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionSubjectElement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Subject Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionNonhumanExposure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Nonhuman Exposure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionBodyWeight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Body Weight</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionBodyWeightGain(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Body Weight Gain</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionClinicalObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Clinical Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionDeathDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Death Diagnosis</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionFoodandWaterConsumption(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Foodand Water Consumption</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionNonhumanLaboratoryTestResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Nonhuman Laboratory Test Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionMacroscopicFinding(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Macroscopic Finding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionMicroscopicFindings(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Microscopic Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionOrganMeasurement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Organ Measurement</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionPalpableMass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Palpable Mass</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionPharmacokineticConcentrationFinding(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Pharmacokinetic Concentration Finding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionSubjectCharacteristic(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Subject Characteristic</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionTumorFinding(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Tumor Finding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionVitalSign(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Vital Sign</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionECGTestResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section ECG Test Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionStudySubjectEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Study Subject Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionStudySubjectFinding(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Study Subject Finding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionStudySubjectIntervention(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Study Subject Intervention</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#validateNonhumanSubjectDataDocumentSectionPharmacokineticParameterFinding(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Pharmacokinetic Parameter Finding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#getNonhumanSubjectDemographics() <em>Get Nonhuman Subject Demographics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#getNonhumanDisposition() <em>Get Nonhuman Disposition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#getSubjectElements() <em>Get Subject Elements</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#getNonhumanExposures() <em>Get Nonhuman Exposures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#getBodyWeights() <em>Get Body Weights</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#getBodyWeightGains() <em>Get Body Weight Gains</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#getClinicalObservations() <em>Get Clinical Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#getDeathDiagnosis() <em>Get Death Diagnosis</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#getFoodandWaterConsumptions() <em>Get Foodand Water Consumptions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#getNonhumanLaboratoryTestResults() <em>Get Nonhuman Laboratory Test Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#getMacroscopicFindings() <em>Get Macroscopic Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#getMicroscopicFindingss() <em>Get Microscopic Findingss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#getOrganMeasurements() <em>Get Organ Measurements</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#getPalpableMasss() <em>Get Palpable Masss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#getPharmacokineticConcentrationFindings() <em>Get Pharmacokinetic Concentration Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#getSubjectCharacteristics() <em>Get Subject Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#getTumorFindings() <em>Get Tumor Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#getVitalSigns() <em>Get Vital Signs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#getECGTestResults() <em>Get ECG Test Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#getStudySubjectEvents() <em>Get Study Subject Events</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#getStudySubjectFindings() <em>Get Study Subject Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#getStudySubjectInterventions() <em>Get Study Subject Interventions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#getComments() <em>Get Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection#getPharmacokineticParameterFindings() <em>Get Pharmacokinetic Parameter Findings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonhumanSubjectDataDocumentSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonhumanSubjectDataDocumentSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionTemplateId(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionTemplateId(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.14')";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionTemplateId(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionTemplateId(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionTemplateId(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionClassCode(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionClassCode(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::DOCSECT";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionClassCode(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionClassCode(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionClassCode(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionMoodCode(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionMoodCode(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::ActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionMoodCode(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionMoodCode(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionMoodCode(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionCodeP(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionCodeP(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionCodeP(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionCodeP(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionCodeP(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionCode(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionCode(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = 'NHStbd' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionCode(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionCode(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionCode(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionText(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionText(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionText(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionText(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionText(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TEXT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionTitle(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionTitle(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionTitle(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionTitle(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionTitle(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TITLE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionTitle", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionNonhumanSubjectDemographics(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Nonhuman Subject Demographics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionNonhumanSubjectDemographics(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(sdtm::NonhumanSubjectDemographics) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionNonhumanSubjectDemographics(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Nonhuman Subject Demographics</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionNonhumanSubjectDemographics(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionNonhumanSubjectDemographics(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_SUBJECT_DEMOGRAPHICS,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionNonhumanSubjectDemographics", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionNonhumanDisposition(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Nonhuman Disposition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionNonhumanDisposition(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(sdtm::NonhumanDisposition) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionNonhumanDisposition(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Nonhuman Disposition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionNonhumanDisposition(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionNonhumanDisposition(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_DISPOSITION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionNonhumanDisposition", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionSubjectElement(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Subject Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionSubjectElement(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(sdtm::SubjectElement) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionSubjectElement(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Subject Element</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionSubjectElement(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionSubjectElement(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_ELEMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionSubjectElement", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionNonhumanExposure(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Nonhuman Exposure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionNonhumanExposure(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_EXPOSURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(sdtm::NonhumanExposure) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionNonhumanExposure(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Nonhuman Exposure</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionNonhumanExposure(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_EXPOSURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionNonhumanExposure(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_EXPOSURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_EXPOSURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_EXPOSURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_EXPOSURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_EXPOSURE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionNonhumanExposure", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionBodyWeight(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Body Weight</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionBodyWeight(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_BODY_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::BodyWeight) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionBodyWeight(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Body Weight</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionBodyWeight(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_BODY_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionBodyWeight(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_BODY_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_BODY_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_BODY_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_BODY_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_BODY_WEIGHT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionBodyWeight", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionBodyWeightGain(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Body Weight Gain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionBodyWeightGain(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_BODY_WEIGHT_GAIN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::BodyWeightGain) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionBodyWeightGain(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Body Weight Gain</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionBodyWeightGain(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_BODY_WEIGHT_GAIN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionBodyWeightGain(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_BODY_WEIGHT_GAIN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_BODY_WEIGHT_GAIN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_BODY_WEIGHT_GAIN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_BODY_WEIGHT_GAIN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_BODY_WEIGHT_GAIN,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionBodyWeightGain", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionClinicalObservation(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Clinical Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionClinicalObservation(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CLINICAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::ClinicalObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionClinicalObservation(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Clinical Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionClinicalObservation(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CLINICAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionClinicalObservation(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CLINICAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CLINICAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CLINICAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CLINICAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_CLINICAL_OBSERVATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionClinicalObservation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionDeathDiagnosis(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Death Diagnosis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionDeathDiagnosis(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_DEATH_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::DeathDiagnosis) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionDeathDiagnosis(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Death Diagnosis</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionDeathDiagnosis(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_DEATH_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionDeathDiagnosis(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_DEATH_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_DEATH_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_DEATH_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_DEATH_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_DEATH_DIAGNOSIS,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionDeathDiagnosis", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionFoodandWaterConsumption(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Foodand Water Consumption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionFoodandWaterConsumption(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_FOODAND_WATER_CONSUMPTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::FoodandWaterConsumption) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionFoodandWaterConsumption(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Foodand Water Consumption</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionFoodandWaterConsumption(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_FOODAND_WATER_CONSUMPTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionFoodandWaterConsumption(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_FOODAND_WATER_CONSUMPTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_FOODAND_WATER_CONSUMPTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_FOODAND_WATER_CONSUMPTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_FOODAND_WATER_CONSUMPTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_FOODAND_WATER_CONSUMPTION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionFoodandWaterConsumption", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionNonhumanLaboratoryTestResult(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Nonhuman Laboratory Test Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionNonhumanLaboratoryTestResult(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::NonhumanLaboratoryTestResult) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionNonhumanLaboratoryTestResult(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Nonhuman Laboratory Test Result</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionNonhumanLaboratoryTestResult(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionNonhumanLaboratoryTestResult(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_NONHUMAN_LABORATORY_TEST_RESULT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionNonhumanLaboratoryTestResult", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionMacroscopicFinding(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Macroscopic Finding</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionMacroscopicFinding(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_MACROSCOPIC_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::MacroscopicFinding) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionMacroscopicFinding(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Macroscopic Finding</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionMacroscopicFinding(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_MACROSCOPIC_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionMacroscopicFinding(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_MACROSCOPIC_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_MACROSCOPIC_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_MACROSCOPIC_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_MACROSCOPIC_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_MACROSCOPIC_FINDING,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionMacroscopicFinding", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionMicroscopicFindings(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Microscopic Findings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionMicroscopicFindings(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_MICROSCOPIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::MicroscopicFinding) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionMicroscopicFindings(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Microscopic Findings</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionMicroscopicFindings(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_MICROSCOPIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionMicroscopicFindings(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_MICROSCOPIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_MICROSCOPIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_MICROSCOPIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_MICROSCOPIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_MICROSCOPIC_FINDINGS,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionMicroscopicFindings", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionOrganMeasurement(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Organ Measurement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionOrganMeasurement(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_ORGAN_MEASUREMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::OrganMeasurement) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionOrganMeasurement(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Organ Measurement</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionOrganMeasurement(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_ORGAN_MEASUREMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionOrganMeasurement(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_ORGAN_MEASUREMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_ORGAN_MEASUREMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_ORGAN_MEASUREMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_ORGAN_MEASUREMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_ORGAN_MEASUREMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionOrganMeasurement", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionPalpableMass(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Palpable Mass</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionPalpableMass(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_PALPABLE_MASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::PalpableMass) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionPalpableMass(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Palpable Mass</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionPalpableMass(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_PALPABLE_MASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionPalpableMass(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_PALPABLE_MASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_PALPABLE_MASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_PALPABLE_MASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_PALPABLE_MASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_PALPABLE_MASS,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionPalpableMass", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionPharmacokineticConcentrationFinding(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Pharmacokinetic Concentration Finding</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionPharmacokineticConcentrationFinding(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::PharmacokineticConcentrationFinding) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionPharmacokineticConcentrationFinding(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Pharmacokinetic Concentration Finding</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionPharmacokineticConcentrationFinding(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionPharmacokineticConcentrationFinding(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_PHARMACOKINETIC_CONCENTRATION_FINDING,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionPharmacokineticConcentrationFinding", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionSubjectCharacteristic(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Subject Characteristic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionSubjectCharacteristic(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::SubjectCharacteristic) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionSubjectCharacteristic(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Subject Characteristic</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionSubjectCharacteristic(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionSubjectCharacteristic(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_SUBJECT_CHARACTERISTIC,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionSubjectCharacteristic", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionTumorFinding(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Tumor Finding</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionTumorFinding(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TUMOR_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::TumorFinding) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionTumorFinding(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Tumor Finding</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionTumorFinding(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TUMOR_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionTumorFinding(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TUMOR_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TUMOR_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TUMOR_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TUMOR_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_TUMOR_FINDING,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionTumorFinding", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionVitalSign(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Vital Sign</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionVitalSign(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::VitalSign) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionVitalSign(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Vital Sign</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionVitalSign(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionVitalSign(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_VITAL_SIGN,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionVitalSign", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionECGTestResult(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section ECG Test Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionECGTestResult(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::ECGTestResult) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionECGTestResult(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section ECG Test Result</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionECGTestResult(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionECGTestResult(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_ECG_TEST_RESULT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionECGTestResult", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionStudySubjectEvent(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Study Subject Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionStudySubjectEvent(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::StudySubjectEvent) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionStudySubjectEvent(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Study Subject Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionStudySubjectEvent(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionStudySubjectEvent(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_EVENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionStudySubjectEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionStudySubjectFinding(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Study Subject Finding</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionStudySubjectFinding(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::StudySubjectFinding) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionStudySubjectFinding(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Study Subject Finding</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionStudySubjectFinding(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionStudySubjectFinding(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_FINDING,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionStudySubjectFinding", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionStudySubjectIntervention(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Study Subject Intervention</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionStudySubjectIntervention(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_INTERVENTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(sdtm::StudySubjectIntervention) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionStudySubjectIntervention(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Study Subject Intervention</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionStudySubjectIntervention(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_INTERVENTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionStudySubjectIntervention(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_INTERVENTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_INTERVENTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_INTERVENTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_INTERVENTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_STUDY_SUBJECT_INTERVENTION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionStudySubjectIntervention", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionComment(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionComment(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::Comment) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionComment(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionComment(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionComment(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_COMMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionComment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDataDocumentSectionPharmacokineticParameterFinding(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Pharmacokinetic Parameter Finding</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionPharmacokineticParameterFinding(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(sdtm::PharmacokineticParameterFinding) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDataDocumentSectionPharmacokineticParameterFinding(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Section Pharmacokinetic Parameter Finding</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDataDocumentSectionPharmacokineticParameterFinding(NonhumanSubjectDataDocumentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDataDocumentSection The receiving '<em><b>Nonhuman Subject Data Document Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDataDocumentSectionPharmacokineticParameterFinding(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDataDocumentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION__NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION_PHARMACOKINETIC_PARAMETER_FINDING,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDataDocumentSectionPharmacokineticParameterFinding", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDataDocumentSection, context) }),
						 new Object [] { nonhumanSubjectDataDocumentSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonhumanSubjectDemographics(NonhumanSubjectDataDocumentSection) <em>Get Nonhuman Subject Demographics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonhumanSubjectDemographics(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NONHUMAN_SUBJECT_DEMOGRAPHICS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::NonhumanSubjectDemographics))->asSequence()->any(true).oclAsType(sdtm::NonhumanSubjectDemographics)";

	/**
	 * The cached OCL query for the '{@link #getNonhumanSubjectDemographics(NonhumanSubjectDataDocumentSection) <em>Get Nonhuman Subject Demographics</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonhumanSubjectDemographics(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NONHUMAN_SUBJECT_DEMOGRAPHICS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  NonhumanSubjectDemographics getNonhumanSubjectDemographics(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection) {
		if (GET_NONHUMAN_SUBJECT_DEMOGRAPHICS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(86));
			try {
				GET_NONHUMAN_SUBJECT_DEMOGRAPHICS__EOCL_QRY = helper.createQuery(GET_NONHUMAN_SUBJECT_DEMOGRAPHICS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NONHUMAN_SUBJECT_DEMOGRAPHICS__EOCL_QRY);
		return (NonhumanSubjectDemographics) query.evaluate(nonhumanSubjectDataDocumentSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonhumanDisposition(NonhumanSubjectDataDocumentSection) <em>Get Nonhuman Disposition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonhumanDisposition(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NONHUMAN_DISPOSITION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::NonhumanDisposition))->asSequence()->any(true).oclAsType(sdtm::NonhumanDisposition)";

	/**
	 * The cached OCL query for the '{@link #getNonhumanDisposition(NonhumanSubjectDataDocumentSection) <em>Get Nonhuman Disposition</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonhumanDisposition(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NONHUMAN_DISPOSITION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  NonhumanDisposition getNonhumanDisposition(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection) {
		if (GET_NONHUMAN_DISPOSITION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(87));
			try {
				GET_NONHUMAN_DISPOSITION__EOCL_QRY = helper.createQuery(GET_NONHUMAN_DISPOSITION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NONHUMAN_DISPOSITION__EOCL_QRY);
		return (NonhumanDisposition) query.evaluate(nonhumanSubjectDataDocumentSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubjectElements(NonhumanSubjectDataDocumentSection) <em>Get Subject Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectElements(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUBJECT_ELEMENTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::SubjectElement)).oclAsType(sdtm::SubjectElement)";

	/**
	 * The cached OCL query for the '{@link #getSubjectElements(NonhumanSubjectDataDocumentSection) <em>Get Subject Elements</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectElements(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUBJECT_ELEMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<SubjectElement> getSubjectElements(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection) {
		if (GET_SUBJECT_ELEMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(88));
			try {
				GET_SUBJECT_ELEMENTS__EOCL_QRY = helper.createQuery(GET_SUBJECT_ELEMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUBJECT_ELEMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SubjectElement> result = (Collection<SubjectElement>) query.evaluate(nonhumanSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<SubjectElement>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonhumanExposures(NonhumanSubjectDataDocumentSection) <em>Get Nonhuman Exposures</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonhumanExposures(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NONHUMAN_EXPOSURES__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(sdtm::NonhumanExposure)).oclAsType(sdtm::NonhumanExposure)";

	/**
	 * The cached OCL query for the '{@link #getNonhumanExposures(NonhumanSubjectDataDocumentSection) <em>Get Nonhuman Exposures</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonhumanExposures(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NONHUMAN_EXPOSURES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<NonhumanExposure> getNonhumanExposures(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection) {
		if (GET_NONHUMAN_EXPOSURES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(89));
			try {
				GET_NONHUMAN_EXPOSURES__EOCL_QRY = helper.createQuery(GET_NONHUMAN_EXPOSURES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NONHUMAN_EXPOSURES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NonhumanExposure> result = (Collection<NonhumanExposure>) query.evaluate(nonhumanSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<NonhumanExposure>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getBodyWeights(NonhumanSubjectDataDocumentSection) <em>Get Body Weights</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyWeights(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BODY_WEIGHTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::BodyWeight)).oclAsType(sdtm::BodyWeight)";

	/**
	 * The cached OCL query for the '{@link #getBodyWeights(NonhumanSubjectDataDocumentSection) <em>Get Body Weights</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyWeights(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BODY_WEIGHTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<BodyWeight> getBodyWeights(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection) {
		if (GET_BODY_WEIGHTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(90));
			try {
				GET_BODY_WEIGHTS__EOCL_QRY = helper.createQuery(GET_BODY_WEIGHTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_BODY_WEIGHTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<BodyWeight> result = (Collection<BodyWeight>) query.evaluate(nonhumanSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<BodyWeight>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getBodyWeightGains(NonhumanSubjectDataDocumentSection) <em>Get Body Weight Gains</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyWeightGains(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BODY_WEIGHT_GAINS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::BodyWeightGain)).oclAsType(sdtm::BodyWeightGain)";

	/**
	 * The cached OCL query for the '{@link #getBodyWeightGains(NonhumanSubjectDataDocumentSection) <em>Get Body Weight Gains</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyWeightGains(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BODY_WEIGHT_GAINS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<BodyWeightGain> getBodyWeightGains(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection) {
		if (GET_BODY_WEIGHT_GAINS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(91));
			try {
				GET_BODY_WEIGHT_GAINS__EOCL_QRY = helper.createQuery(GET_BODY_WEIGHT_GAINS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_BODY_WEIGHT_GAINS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<BodyWeightGain> result = (Collection<BodyWeightGain>) query.evaluate(nonhumanSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<BodyWeightGain>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getClinicalObservations(NonhumanSubjectDataDocumentSection) <em>Get Clinical Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalObservations(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CLINICAL_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::ClinicalObservation)).oclAsType(sdtm::ClinicalObservation)";

	/**
	 * The cached OCL query for the '{@link #getClinicalObservations(NonhumanSubjectDataDocumentSection) <em>Get Clinical Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalObservations(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CLINICAL_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<ClinicalObservation> getClinicalObservations(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection) {
		if (GET_CLINICAL_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(92));
			try {
				GET_CLINICAL_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_CLINICAL_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CLINICAL_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ClinicalObservation> result = (Collection<ClinicalObservation>) query.evaluate(nonhumanSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<ClinicalObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDeathDiagnosis(NonhumanSubjectDataDocumentSection) <em>Get Death Diagnosis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathDiagnosis(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DEATH_DIAGNOSIS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DeathDiagnosis))->asSequence()->any(true).oclAsType(sdtm::DeathDiagnosis)";

	/**
	 * The cached OCL query for the '{@link #getDeathDiagnosis(NonhumanSubjectDataDocumentSection) <em>Get Death Diagnosis</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathDiagnosis(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DEATH_DIAGNOSIS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DeathDiagnosis getDeathDiagnosis(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection) {
		if (GET_DEATH_DIAGNOSIS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(93));
			try {
				GET_DEATH_DIAGNOSIS__EOCL_QRY = helper.createQuery(GET_DEATH_DIAGNOSIS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DEATH_DIAGNOSIS__EOCL_QRY);
		return (DeathDiagnosis) query.evaluate(nonhumanSubjectDataDocumentSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFoodandWaterConsumptions(NonhumanSubjectDataDocumentSection) <em>Get Foodand Water Consumptions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoodandWaterConsumptions(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FOODAND_WATER_CONSUMPTIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::FoodandWaterConsumption)).oclAsType(sdtm::FoodandWaterConsumption)";

	/**
	 * The cached OCL query for the '{@link #getFoodandWaterConsumptions(NonhumanSubjectDataDocumentSection) <em>Get Foodand Water Consumptions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoodandWaterConsumptions(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FOODAND_WATER_CONSUMPTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<FoodandWaterConsumption> getFoodandWaterConsumptions(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection) {
		if (GET_FOODAND_WATER_CONSUMPTIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(94));
			try {
				GET_FOODAND_WATER_CONSUMPTIONS__EOCL_QRY = helper.createQuery(GET_FOODAND_WATER_CONSUMPTIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FOODAND_WATER_CONSUMPTIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FoodandWaterConsumption> result = (Collection<FoodandWaterConsumption>) query.evaluate(nonhumanSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<FoodandWaterConsumption>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonhumanLaboratoryTestResults(NonhumanSubjectDataDocumentSection) <em>Get Nonhuman Laboratory Test Results</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonhumanLaboratoryTestResults(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NONHUMAN_LABORATORY_TEST_RESULTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::NonhumanLaboratoryTestResult)).oclAsType(sdtm::NonhumanLaboratoryTestResult)";

	/**
	 * The cached OCL query for the '{@link #getNonhumanLaboratoryTestResults(NonhumanSubjectDataDocumentSection) <em>Get Nonhuman Laboratory Test Results</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonhumanLaboratoryTestResults(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NONHUMAN_LABORATORY_TEST_RESULTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<NonhumanLaboratoryTestResult> getNonhumanLaboratoryTestResults(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection) {
		if (GET_NONHUMAN_LABORATORY_TEST_RESULTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(95));
			try {
				GET_NONHUMAN_LABORATORY_TEST_RESULTS__EOCL_QRY = helper.createQuery(GET_NONHUMAN_LABORATORY_TEST_RESULTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NONHUMAN_LABORATORY_TEST_RESULTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NonhumanLaboratoryTestResult> result = (Collection<NonhumanLaboratoryTestResult>) query.evaluate(nonhumanSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<NonhumanLaboratoryTestResult>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMacroscopicFindings(NonhumanSubjectDataDocumentSection) <em>Get Macroscopic Findings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacroscopicFindings(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MACROSCOPIC_FINDINGS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::MacroscopicFinding)).oclAsType(sdtm::MacroscopicFinding)";

	/**
	 * The cached OCL query for the '{@link #getMacroscopicFindings(NonhumanSubjectDataDocumentSection) <em>Get Macroscopic Findings</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacroscopicFindings(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MACROSCOPIC_FINDINGS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<MacroscopicFinding> getMacroscopicFindings(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection) {
		if (GET_MACROSCOPIC_FINDINGS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(96));
			try {
				GET_MACROSCOPIC_FINDINGS__EOCL_QRY = helper.createQuery(GET_MACROSCOPIC_FINDINGS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MACROSCOPIC_FINDINGS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MacroscopicFinding> result = (Collection<MacroscopicFinding>) query.evaluate(nonhumanSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<MacroscopicFinding>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMicroscopicFindingss(NonhumanSubjectDataDocumentSection) <em>Get Microscopic Findingss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroscopicFindingss(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MICROSCOPIC_FINDINGSS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::MicroscopicFinding)).oclAsType(sdtm::MicroscopicFinding)";

	/**
	 * The cached OCL query for the '{@link #getMicroscopicFindingss(NonhumanSubjectDataDocumentSection) <em>Get Microscopic Findingss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroscopicFindingss(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MICROSCOPIC_FINDINGSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<MicroscopicFinding> getMicroscopicFindingss(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection) {
		if (GET_MICROSCOPIC_FINDINGSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(97));
			try {
				GET_MICROSCOPIC_FINDINGSS__EOCL_QRY = helper.createQuery(GET_MICROSCOPIC_FINDINGSS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MICROSCOPIC_FINDINGSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MicroscopicFinding> result = (Collection<MicroscopicFinding>) query.evaluate(nonhumanSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<MicroscopicFinding>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getOrganMeasurements(NonhumanSubjectDataDocumentSection) <em>Get Organ Measurements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganMeasurements(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ORGAN_MEASUREMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::OrganMeasurement)).oclAsType(sdtm::OrganMeasurement)";

	/**
	 * The cached OCL query for the '{@link #getOrganMeasurements(NonhumanSubjectDataDocumentSection) <em>Get Organ Measurements</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganMeasurements(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ORGAN_MEASUREMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<OrganMeasurement> getOrganMeasurements(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection) {
		if (GET_ORGAN_MEASUREMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(98));
			try {
				GET_ORGAN_MEASUREMENTS__EOCL_QRY = helper.createQuery(GET_ORGAN_MEASUREMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ORGAN_MEASUREMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<OrganMeasurement> result = (Collection<OrganMeasurement>) query.evaluate(nonhumanSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<OrganMeasurement>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPalpableMasss(NonhumanSubjectDataDocumentSection) <em>Get Palpable Masss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPalpableMasss(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PALPABLE_MASSS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::PalpableMass)).oclAsType(sdtm::PalpableMass)";

	/**
	 * The cached OCL query for the '{@link #getPalpableMasss(NonhumanSubjectDataDocumentSection) <em>Get Palpable Masss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPalpableMasss(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PALPABLE_MASSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<PalpableMass> getPalpableMasss(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection) {
		if (GET_PALPABLE_MASSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(99));
			try {
				GET_PALPABLE_MASSS__EOCL_QRY = helper.createQuery(GET_PALPABLE_MASSS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PALPABLE_MASSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PalpableMass> result = (Collection<PalpableMass>) query.evaluate(nonhumanSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<PalpableMass>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPharmacokineticConcentrationFindings(NonhumanSubjectDataDocumentSection) <em>Get Pharmacokinetic Concentration Findings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPharmacokineticConcentrationFindings(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PHARMACOKINETIC_CONCENTRATION_FINDINGS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::PharmacokineticConcentrationFinding)).oclAsType(sdtm::PharmacokineticConcentrationFinding)";

	/**
	 * The cached OCL query for the '{@link #getPharmacokineticConcentrationFindings(NonhumanSubjectDataDocumentSection) <em>Get Pharmacokinetic Concentration Findings</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPharmacokineticConcentrationFindings(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PHARMACOKINETIC_CONCENTRATION_FINDINGS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<PharmacokineticConcentrationFinding> getPharmacokineticConcentrationFindings(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection) {
		if (GET_PHARMACOKINETIC_CONCENTRATION_FINDINGS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(100));
			try {
				GET_PHARMACOKINETIC_CONCENTRATION_FINDINGS__EOCL_QRY = helper.createQuery(GET_PHARMACOKINETIC_CONCENTRATION_FINDINGS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PHARMACOKINETIC_CONCENTRATION_FINDINGS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PharmacokineticConcentrationFinding> result = (Collection<PharmacokineticConcentrationFinding>) query.evaluate(nonhumanSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<PharmacokineticConcentrationFinding>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubjectCharacteristics(NonhumanSubjectDataDocumentSection) <em>Get Subject Characteristics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectCharacteristics(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUBJECT_CHARACTERISTICS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SubjectCharacteristic)).oclAsType(sdtm::SubjectCharacteristic)";

	/**
	 * The cached OCL query for the '{@link #getSubjectCharacteristics(NonhumanSubjectDataDocumentSection) <em>Get Subject Characteristics</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectCharacteristics(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUBJECT_CHARACTERISTICS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<SubjectCharacteristic> getSubjectCharacteristics(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection) {
		if (GET_SUBJECT_CHARACTERISTICS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(101));
			try {
				GET_SUBJECT_CHARACTERISTICS__EOCL_QRY = helper.createQuery(GET_SUBJECT_CHARACTERISTICS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUBJECT_CHARACTERISTICS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SubjectCharacteristic> result = (Collection<SubjectCharacteristic>) query.evaluate(nonhumanSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<SubjectCharacteristic>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getTumorFindings(NonhumanSubjectDataDocumentSection) <em>Get Tumor Findings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTumorFindings(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TUMOR_FINDINGS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::TumorFinding)).oclAsType(sdtm::TumorFinding)";

	/**
	 * The cached OCL query for the '{@link #getTumorFindings(NonhumanSubjectDataDocumentSection) <em>Get Tumor Findings</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTumorFindings(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TUMOR_FINDINGS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<TumorFinding> getTumorFindings(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection) {
		if (GET_TUMOR_FINDINGS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(102));
			try {
				GET_TUMOR_FINDINGS__EOCL_QRY = helper.createQuery(GET_TUMOR_FINDINGS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TUMOR_FINDINGS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TumorFinding> result = (Collection<TumorFinding>) query.evaluate(nonhumanSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<TumorFinding>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSigns(NonhumanSubjectDataDocumentSection) <em>Get Vital Signs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSigns(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::VitalSign)).oclAsType(sdtm::VitalSign)";

	/**
	 * The cached OCL query for the '{@link #getVitalSigns(NonhumanSubjectDataDocumentSection) <em>Get Vital Signs</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSigns(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<VitalSign> getVitalSigns(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection) {
		if (GET_VITAL_SIGNS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(103));
			try {
				GET_VITAL_SIGNS__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<VitalSign> result = (Collection<VitalSign>) query.evaluate(nonhumanSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<VitalSign>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getECGTestResults(NonhumanSubjectDataDocumentSection) <em>Get ECG Test Results</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECGTestResults(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ECG_TEST_RESULTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::ECGTestResult)).oclAsType(sdtm::ECGTestResult)";

	/**
	 * The cached OCL query for the '{@link #getECGTestResults(NonhumanSubjectDataDocumentSection) <em>Get ECG Test Results</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECGTestResults(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ECG_TEST_RESULTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<ECGTestResult> getECGTestResults(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection) {
		if (GET_ECG_TEST_RESULTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(104));
			try {
				GET_ECG_TEST_RESULTS__EOCL_QRY = helper.createQuery(GET_ECG_TEST_RESULTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ECG_TEST_RESULTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ECGTestResult> result = (Collection<ECGTestResult>) query.evaluate(nonhumanSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<ECGTestResult>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getStudySubjectEvents(NonhumanSubjectDataDocumentSection) <em>Get Study Subject Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudySubjectEvents(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STUDY_SUBJECT_EVENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::StudySubjectEvent)).oclAsType(sdtm::StudySubjectEvent)";

	/**
	 * The cached OCL query for the '{@link #getStudySubjectEvents(NonhumanSubjectDataDocumentSection) <em>Get Study Subject Events</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudySubjectEvents(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STUDY_SUBJECT_EVENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<StudySubjectEvent> getStudySubjectEvents(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection) {
		if (GET_STUDY_SUBJECT_EVENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(105));
			try {
				GET_STUDY_SUBJECT_EVENTS__EOCL_QRY = helper.createQuery(GET_STUDY_SUBJECT_EVENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_SUBJECT_EVENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<StudySubjectEvent> result = (Collection<StudySubjectEvent>) query.evaluate(nonhumanSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<StudySubjectEvent>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getStudySubjectFindings(NonhumanSubjectDataDocumentSection) <em>Get Study Subject Findings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudySubjectFindings(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STUDY_SUBJECT_FINDINGS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::StudySubjectFinding)).oclAsType(sdtm::StudySubjectFinding)";

	/**
	 * The cached OCL query for the '{@link #getStudySubjectFindings(NonhumanSubjectDataDocumentSection) <em>Get Study Subject Findings</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudySubjectFindings(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STUDY_SUBJECT_FINDINGS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<StudySubjectFinding> getStudySubjectFindings(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection) {
		if (GET_STUDY_SUBJECT_FINDINGS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(106));
			try {
				GET_STUDY_SUBJECT_FINDINGS__EOCL_QRY = helper.createQuery(GET_STUDY_SUBJECT_FINDINGS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_SUBJECT_FINDINGS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<StudySubjectFinding> result = (Collection<StudySubjectFinding>) query.evaluate(nonhumanSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<StudySubjectFinding>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getStudySubjectInterventions(NonhumanSubjectDataDocumentSection) <em>Get Study Subject Interventions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudySubjectInterventions(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STUDY_SUBJECT_INTERVENTIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(sdtm::StudySubjectIntervention)).oclAsType(sdtm::StudySubjectIntervention)";

	/**
	 * The cached OCL query for the '{@link #getStudySubjectInterventions(NonhumanSubjectDataDocumentSection) <em>Get Study Subject Interventions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudySubjectInterventions(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STUDY_SUBJECT_INTERVENTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<StudySubjectIntervention> getStudySubjectInterventions(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection) {
		if (GET_STUDY_SUBJECT_INTERVENTIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(107));
			try {
				GET_STUDY_SUBJECT_INTERVENTIONS__EOCL_QRY = helper.createQuery(GET_STUDY_SUBJECT_INTERVENTIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_SUBJECT_INTERVENTIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<StudySubjectIntervention> result = (Collection<StudySubjectIntervention>) query.evaluate(nonhumanSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<StudySubjectIntervention>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(NonhumanSubjectDataDocumentSection) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment)).oclAsType(sdtm::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComments(NonhumanSubjectDataDocumentSection) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<Comment> getComments(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection) {
		if (GET_COMMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(108));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(nonhumanSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPharmacokineticParameterFindings(NonhumanSubjectDataDocumentSection) <em>Get Pharmacokinetic Parameter Findings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPharmacokineticParameterFindings(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PHARMACOKINETIC_PARAMETER_FINDINGS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::PharmacokineticParameterFinding)).oclAsType(sdtm::PharmacokineticParameterFinding)";

	/**
	 * The cached OCL query for the '{@link #getPharmacokineticParameterFindings(NonhumanSubjectDataDocumentSection) <em>Get Pharmacokinetic Parameter Findings</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPharmacokineticParameterFindings(NonhumanSubjectDataDocumentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PHARMACOKINETIC_PARAMETER_FINDINGS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<PharmacokineticParameterFinding> getPharmacokineticParameterFindings(NonhumanSubjectDataDocumentSection nonhumanSubjectDataDocumentSection) {
		if (GET_PHARMACOKINETIC_PARAMETER_FINDINGS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION, SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION.getEAllOperations().get(109));
			try {
				GET_PHARMACOKINETIC_PARAMETER_FINDINGS__EOCL_QRY = helper.createQuery(GET_PHARMACOKINETIC_PARAMETER_FINDINGS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PHARMACOKINETIC_PARAMETER_FINDINGS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PharmacokineticParameterFinding> result = (Collection<PharmacokineticParameterFinding>) query.evaluate(nonhumanSubjectDataDocumentSection);
		return new BasicEList.UnmodifiableEList<PharmacokineticParameterFinding>(result.size(), result.toArray());
	}

} // NonhumanSubjectDataDocumentSectionOperations