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
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability;
import org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPlugin;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.Visit;
import org.openhealthtools.mdht.uml.cda.sdtm.VitalSign;
import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Visit</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitHumanClinicalVitalSign(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Human Clinical Vital Sign</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitPlannedStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitECGTestResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit ECG Test Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitPhysicalExamination(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Physical Examination</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitMicrobiologySpecimen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Microbiology Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitMicrobiologySusceptibility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Microbiology Susceptibility</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitPharmacokineticConcentrationFinding(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Pharmacokinetic Concentration Finding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitFindingAbout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Finding About</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitDrugAccountability(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Drug Accountability</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitDomainAssignment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitRelatedRecord(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Related Record</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitSupplementalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Supplemental Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitHumanClinicalLaboratoryTestResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Human Clinical Laboratory Test Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitQuestionnaireFinding(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Questionnaire Finding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitPharmacokineticParameterFinding(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Pharmacokinetic Parameter Finding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getHumanClinicalVitalSigns() <em>Get Human Clinical Vital Signs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getPlannedStudyDay() <em>Get Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getECGTestResults() <em>Get ECG Test Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getPhysicalExaminations() <em>Get Physical Examinations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getMicrobiologySpecimen() <em>Get Microbiology Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getMicrobiologySusceptibility() <em>Get Microbiology Susceptibility</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getPharmacokineticConcentrationFinding() <em>Get Pharmacokinetic Concentration Finding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getFindingAbouts() <em>Get Finding Abouts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getDrugAccountability() <em>Get Drug Accountability</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getComments() <em>Get Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getDomainAssignment() <em>Get Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getRelatedRecords() <em>Get Related Records</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getSupplementalValues() <em>Get Supplemental Values</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getHumanClinicalLaboratoryTestResults() <em>Get Human Clinical Laboratory Test Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getQuestionnaireFindings() <em>Get Questionnaire Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getPharmacokineticParameterFindings() <em>Get Pharmacokinetic Parameter Findings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisitOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisitOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitTemplateId(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitTemplateId(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.100')";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitTemplateId(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitTemplateId(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitTemplateId(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_TEMPLATE_ID,
						 SdtmPlugin.INSTANCE.getString("VisitVisitTemplateId"),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitClassCode(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitClassCode(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::ENC";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitClassCode(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitClassCode(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitClassCode(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_CLASS_CODE,
						 SdtmPlugin.INSTANCE.getString("VisitVisitClassCode"),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitMoodCode(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitMoodCode(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentEncounterMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitMoodCode(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitMoodCode(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitMoodCode(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_MOOD_CODE,
						 SdtmPlugin.INSTANCE.getString("VisitVisitMoodCode"),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitCode(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitCode(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and (value.code = 'C78802' or value.code = 'C78800' or value.code = '78801' or value.code = '78727' or value.code = 'CXXXXX' or value.code = 'CXXXXX' or value.code = 'CXXXXX'))";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitCode(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitCode(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitCode(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_CODE,
						 SdtmPlugin.INSTANCE.getString("VisitVisitCode"),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitCodeP(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitCodeP(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitCodeP(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitCodeP(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitCodeP(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_CODE_P,
						 SdtmPlugin.INSTANCE.getString("VisitVisitCodeP"),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitId(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitId(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitId(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitId(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitId(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_ID,
						 SdtmPlugin.INSTANCE.getString("VisitVisitId"),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitText(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitText(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitText(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitText(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitText(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_TEXT,
						 SdtmPlugin.INSTANCE.getString("VisitVisitText"),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitEffectiveTime(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitEffectiveTime(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitEffectiveTime(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitEffectiveTime(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitEffectiveTime(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_EFFECTIVE_TIME,
						 SdtmPlugin.INSTANCE.getString("VisitVisitEffectiveTime"),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitHumanClinicalVitalSign(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Human Clinical Vital Sign</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitHumanClinicalVitalSign(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_HUMAN_CLINICAL_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::VitalSign) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitHumanClinicalVitalSign(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Human Clinical Vital Sign</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitHumanClinicalVitalSign(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_HUMAN_CLINICAL_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitHumanClinicalVitalSign(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_HUMAN_CLINICAL_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_HUMAN_CLINICAL_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_HUMAN_CLINICAL_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_HUMAN_CLINICAL_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_HUMAN_CLINICAL_VITAL_SIGN,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitVisitHumanClinicalVitalSign", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitPlannedStudyDay(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Planned Study Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitPlannedStudyDay(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::PlannedStudyDay) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitPlannedStudyDay(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Planned Study Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitPlannedStudyDay(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitPlannedStudyDay(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_PLANNED_STUDY_DAY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitVisitPlannedStudyDay", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitECGTestResult(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit ECG Test Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitECGTestResult(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::ECGTestResult) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitECGTestResult(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit ECG Test Result</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitECGTestResult(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitECGTestResult(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_ECG_TEST_RESULT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitVisitECGTestResult", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitPhysicalExamination(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Physical Examination</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitPhysicalExamination(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::PhysicalExaminationFinding) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitPhysicalExamination(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Physical Examination</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitPhysicalExamination(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitPhysicalExamination(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_PHYSICAL_EXAMINATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitVisitPhysicalExamination", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitMicrobiologySpecimen(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Microbiology Specimen</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitMicrobiologySpecimen(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_MICROBIOLOGY_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::MicrobiologySpecimenFinding) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitMicrobiologySpecimen(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Microbiology Specimen</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitMicrobiologySpecimen(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_MICROBIOLOGY_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitMicrobiologySpecimen(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_MICROBIOLOGY_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_MICROBIOLOGY_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_MICROBIOLOGY_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_MICROBIOLOGY_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_MICROBIOLOGY_SPECIMEN,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitVisitMicrobiologySpecimen", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitMicrobiologySusceptibility(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Microbiology Susceptibility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitMicrobiologySusceptibility(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_MICROBIOLOGY_SUSCEPTIBILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::MicrobiologySusceptibility) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitMicrobiologySusceptibility(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Microbiology Susceptibility</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitMicrobiologySusceptibility(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_MICROBIOLOGY_SUSCEPTIBILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitMicrobiologySusceptibility(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_MICROBIOLOGY_SUSCEPTIBILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_MICROBIOLOGY_SUSCEPTIBILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_MICROBIOLOGY_SUSCEPTIBILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_MICROBIOLOGY_SUSCEPTIBILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_MICROBIOLOGY_SUSCEPTIBILITY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitVisitMicrobiologySusceptibility", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitPharmacokineticConcentrationFinding(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Pharmacokinetic Concentration Finding</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitPharmacokineticConcentrationFinding(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::PharmacokineticConcentrationFinding) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitPharmacokineticConcentrationFinding(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Pharmacokinetic Concentration Finding</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitPharmacokineticConcentrationFinding(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitPharmacokineticConcentrationFinding(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_PHARMACOKINETIC_CONCENTRATION_FINDING,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitVisitPharmacokineticConcentrationFinding", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitFindingAbout(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Finding About</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitFindingAbout(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::FindingAbout) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitFindingAbout(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Finding About</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitFindingAbout(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitFindingAbout(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_FINDING_ABOUT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitVisitFindingAbout", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitDrugAccountability(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Drug Accountability</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitDrugAccountability(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_DRUG_ACCOUNTABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DrugAccountability) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitDrugAccountability(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Drug Accountability</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitDrugAccountability(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_DRUG_ACCOUNTABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitDrugAccountability(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_DRUG_ACCOUNTABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_DRUG_ACCOUNTABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_DRUG_ACCOUNTABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_DRUG_ACCOUNTABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_DRUG_ACCOUNTABILITY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitVisitDrugAccountability", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitStudyDayPeriod(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Study Day Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitStudyDayPeriod(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::StudyDayPeriod) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitStudyDayPeriod(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Study Day Period</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitStudyDayPeriod(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitStudyDayPeriod(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_STUDY_DAY_PERIOD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitVisitStudyDayPeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitComment(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitComment(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitComment(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitComment(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitComment(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_COMMENT,
						 SdtmPlugin.INSTANCE.getString("VisitVisitComment"),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitDomainAssignment(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitDomainAssignment(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DomainAssignment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitDomainAssignment(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Domain Assignment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitDomainAssignment(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitDomainAssignment(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_DOMAIN_ASSIGNMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitVisitDomainAssignment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitRelatedRecord(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Related Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitRelatedRecord(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::RelatedRecord) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitRelatedRecord(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Related Record</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitRelatedRecord(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitRelatedRecord(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_RELATED_RECORD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitVisitRelatedRecord", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitSupplementalValue(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Supplemental Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitSupplementalValue(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SupplementalValue) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitSupplementalValue(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Supplemental Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitSupplementalValue(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitSupplementalValue(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_SUPPLEMENTAL_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitVisitSupplementalValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitHumanClinicalLaboratoryTestResult(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Human Clinical Laboratory Test Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitHumanClinicalLaboratoryTestResult(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_HUMAN_CLINICAL_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::HumanClinicalLaboratoryTestResult) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitHumanClinicalLaboratoryTestResult(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Human Clinical Laboratory Test Result</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitHumanClinicalLaboratoryTestResult(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_HUMAN_CLINICAL_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitHumanClinicalLaboratoryTestResult(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_HUMAN_CLINICAL_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_HUMAN_CLINICAL_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_HUMAN_CLINICAL_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_HUMAN_CLINICAL_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_HUMAN_CLINICAL_LABORATORY_TEST_RESULT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitVisitHumanClinicalLaboratoryTestResult", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitQuestionnaireFinding(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Questionnaire Finding</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitQuestionnaireFinding(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_QUESTIONNAIRE_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::QuestionnaireFinding) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitQuestionnaireFinding(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Questionnaire Finding</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitQuestionnaireFinding(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_QUESTIONNAIRE_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitQuestionnaireFinding(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_QUESTIONNAIRE_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_QUESTIONNAIRE_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_QUESTIONNAIRE_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_QUESTIONNAIRE_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_QUESTIONNAIRE_FINDING,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitVisitQuestionnaireFinding", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVisitPharmacokineticParameterFinding(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Pharmacokinetic Parameter Finding</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitPharmacokineticParameterFinding(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VISIT_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::PharmacokineticParameterFinding) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateVisitPharmacokineticParameterFinding(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Pharmacokinetic Parameter Finding</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVisitPharmacokineticParameterFinding(Visit, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VISIT_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param visit The receiving '<em><b>Visit</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVisitPharmacokineticParameterFinding(Visit visit, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_VISIT_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.VISIT);
			try {
				VALIDATE_VISIT_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VISIT_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VISIT_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(visit)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.VISIT__VISIT_PHARMACOKINETIC_PARAMETER_FINDING,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VisitVisitPharmacokineticParameterFinding", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(visit, context) }),
						 new Object [] { visit }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getHumanClinicalVitalSigns(Visit) <em>Get Human Clinical Vital Signs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanClinicalVitalSigns(Visit)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HUMAN_CLINICAL_VITAL_SIGNS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::VitalSign)).oclAsType(sdtm::VitalSign)";

	/**
	 * The cached OCL query for the '{@link #getHumanClinicalVitalSigns(Visit) <em>Get Human Clinical Vital Signs</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanClinicalVitalSigns(Visit)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HUMAN_CLINICAL_VITAL_SIGNS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<VitalSign> getHumanClinicalVitalSigns(Visit visit) {
	
	
	
		if (GET_HUMAN_CLINICAL_VITAL_SIGNS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(76));
			try {
				GET_HUMAN_CLINICAL_VITAL_SIGNS__EOCL_QRY = helper.createQuery(GET_HUMAN_CLINICAL_VITAL_SIGNS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_HUMAN_CLINICAL_VITAL_SIGNS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<VitalSign> result = (Collection<VitalSign>) query.evaluate(visit);
		return new BasicEList.UnmodifiableEList<VitalSign>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlannedStudyDay(Visit) <em>Get Planned Study Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedStudyDay(Visit)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLANNED_STUDY_DAY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::PlannedStudyDay))->asSequence()->any(true).oclAsType(sdtm::PlannedStudyDay)";

	/**
	 * The cached OCL query for the '{@link #getPlannedStudyDay(Visit) <em>Get Planned Study Day</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedStudyDay(Visit)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLANNED_STUDY_DAY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  PlannedStudyDay getPlannedStudyDay(Visit visit) {
	
	
	
		if (GET_PLANNED_STUDY_DAY__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(77));
			try {
				GET_PLANNED_STUDY_DAY__EOCL_QRY = helper.createQuery(GET_PLANNED_STUDY_DAY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_PLANNED_STUDY_DAY__EOCL_QRY);
		return (PlannedStudyDay) query.evaluate(visit);
	}

	/**
	 * The cached OCL expression body for the '{@link #getECGTestResults(Visit) <em>Get ECG Test Results</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECGTestResults(Visit)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ECG_TEST_RESULTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::ECGTestResult)).oclAsType(sdtm::ECGTestResult)";

	/**
	 * The cached OCL query for the '{@link #getECGTestResults(Visit) <em>Get ECG Test Results</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECGTestResults(Visit)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ECG_TEST_RESULTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<ECGTestResult> getECGTestResults(Visit visit) {
	
	
	
		if (GET_ECG_TEST_RESULTS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(78));
			try {
				GET_ECG_TEST_RESULTS__EOCL_QRY = helper.createQuery(GET_ECG_TEST_RESULTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_ECG_TEST_RESULTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ECGTestResult> result = (Collection<ECGTestResult>) query.evaluate(visit);
		return new BasicEList.UnmodifiableEList<ECGTestResult>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPhysicalExaminations(Visit) <em>Get Physical Examinations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExaminations(Visit)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PHYSICAL_EXAMINATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::PhysicalExaminationFinding)).oclAsType(sdtm::PhysicalExaminationFinding)";

	/**
	 * The cached OCL query for the '{@link #getPhysicalExaminations(Visit) <em>Get Physical Examinations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExaminations(Visit)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PHYSICAL_EXAMINATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<PhysicalExaminationFinding> getPhysicalExaminations(Visit visit) {
	
	
	
		if (GET_PHYSICAL_EXAMINATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(79));
			try {
				GET_PHYSICAL_EXAMINATIONS__EOCL_QRY = helper.createQuery(GET_PHYSICAL_EXAMINATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_PHYSICAL_EXAMINATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PhysicalExaminationFinding> result = (Collection<PhysicalExaminationFinding>) query.evaluate(visit);
		return new BasicEList.UnmodifiableEList<PhysicalExaminationFinding>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMicrobiologySpecimen(Visit) <em>Get Microbiology Specimen</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicrobiologySpecimen(Visit)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MICROBIOLOGY_SPECIMEN__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::MicrobiologySpecimenFinding))->asSequence()->any(true).oclAsType(sdtm::MicrobiologySpecimenFinding)";

	/**
	 * The cached OCL query for the '{@link #getMicrobiologySpecimen(Visit) <em>Get Microbiology Specimen</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicrobiologySpecimen(Visit)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MICROBIOLOGY_SPECIMEN__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  MicrobiologySpecimenFinding getMicrobiologySpecimen(Visit visit) {
	
	
	
		if (GET_MICROBIOLOGY_SPECIMEN__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(80));
			try {
				GET_MICROBIOLOGY_SPECIMEN__EOCL_QRY = helper.createQuery(GET_MICROBIOLOGY_SPECIMEN__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_MICROBIOLOGY_SPECIMEN__EOCL_QRY);
		return (MicrobiologySpecimenFinding) query.evaluate(visit);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMicrobiologySusceptibility(Visit) <em>Get Microbiology Susceptibility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicrobiologySusceptibility(Visit)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MICROBIOLOGY_SUSCEPTIBILITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::MicrobiologySusceptibility))->asSequence()->any(true).oclAsType(sdtm::MicrobiologySusceptibility)";

	/**
	 * The cached OCL query for the '{@link #getMicrobiologySusceptibility(Visit) <em>Get Microbiology Susceptibility</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicrobiologySusceptibility(Visit)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MICROBIOLOGY_SUSCEPTIBILITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  MicrobiologySusceptibility getMicrobiologySusceptibility(Visit visit) {
	
	
	
		if (GET_MICROBIOLOGY_SUSCEPTIBILITY__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(81));
			try {
				GET_MICROBIOLOGY_SUSCEPTIBILITY__EOCL_QRY = helper.createQuery(GET_MICROBIOLOGY_SUSCEPTIBILITY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_MICROBIOLOGY_SUSCEPTIBILITY__EOCL_QRY);
		return (MicrobiologySusceptibility) query.evaluate(visit);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPharmacokineticConcentrationFinding(Visit) <em>Get Pharmacokinetic Concentration Finding</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPharmacokineticConcentrationFinding(Visit)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PHARMACOKINETIC_CONCENTRATION_FINDING__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::PharmacokineticConcentrationFinding))->asSequence()->any(true).oclAsType(sdtm::PharmacokineticConcentrationFinding)";

	/**
	 * The cached OCL query for the '{@link #getPharmacokineticConcentrationFinding(Visit) <em>Get Pharmacokinetic Concentration Finding</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPharmacokineticConcentrationFinding(Visit)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PHARMACOKINETIC_CONCENTRATION_FINDING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  PharmacokineticConcentrationFinding getPharmacokineticConcentrationFinding(Visit visit) {
	
	
	
		if (GET_PHARMACOKINETIC_CONCENTRATION_FINDING__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(82));
			try {
				GET_PHARMACOKINETIC_CONCENTRATION_FINDING__EOCL_QRY = helper.createQuery(GET_PHARMACOKINETIC_CONCENTRATION_FINDING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_PHARMACOKINETIC_CONCENTRATION_FINDING__EOCL_QRY);
		return (PharmacokineticConcentrationFinding) query.evaluate(visit);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFindingAbouts(Visit) <em>Get Finding Abouts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(Visit)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FINDING_ABOUTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::FindingAbout)).oclAsType(sdtm::FindingAbout)";

	/**
	 * The cached OCL query for the '{@link #getFindingAbouts(Visit) <em>Get Finding Abouts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(Visit)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FINDING_ABOUTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<FindingAbout> getFindingAbouts(Visit visit) {
	
	
	
		if (GET_FINDING_ABOUTS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(83));
			try {
				GET_FINDING_ABOUTS__EOCL_QRY = helper.createQuery(GET_FINDING_ABOUTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_FINDING_ABOUTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FindingAbout> result = (Collection<FindingAbout>) query.evaluate(visit);
		return new BasicEList.UnmodifiableEList<FindingAbout>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDrugAccountability(Visit) <em>Get Drug Accountability</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrugAccountability(Visit)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DRUG_ACCOUNTABILITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DrugAccountability))->asSequence()->any(true).oclAsType(sdtm::DrugAccountability)";

	/**
	 * The cached OCL query for the '{@link #getDrugAccountability(Visit) <em>Get Drug Accountability</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrugAccountability(Visit)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DRUG_ACCOUNTABILITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DrugAccountability getDrugAccountability(Visit visit) {
	
	
	
		if (GET_DRUG_ACCOUNTABILITY__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(84));
			try {
				GET_DRUG_ACCOUNTABILITY__EOCL_QRY = helper.createQuery(GET_DRUG_ACCOUNTABILITY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_DRUG_ACCOUNTABILITY__EOCL_QRY);
		return (DrugAccountability) query.evaluate(visit);
	}

	/**
	 * The cached OCL expression body for the '{@link #getStudyDayPeriod(Visit) <em>Get Study Day Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyDayPeriod(Visit)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STUDY_DAY_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::StudyDayPeriod))->asSequence()->any(true).oclAsType(sdtm::StudyDayPeriod)";

	/**
	 * The cached OCL query for the '{@link #getStudyDayPeriod(Visit) <em>Get Study Day Period</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyDayPeriod(Visit)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STUDY_DAY_PERIOD__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  StudyDayPeriod getStudyDayPeriod(Visit visit) {
	
	
	
		if (GET_STUDY_DAY_PERIOD__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(85));
			try {
				GET_STUDY_DAY_PERIOD__EOCL_QRY = helper.createQuery(GET_STUDY_DAY_PERIOD__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_STUDY_DAY_PERIOD__EOCL_QRY);
		return (StudyDayPeriod) query.evaluate(visit);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(Visit) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(Visit)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment)).oclAsType(sdtm::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComments(Visit) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(Visit)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<Comment> getComments(Visit visit) {
	
	
	
		if (GET_COMMENTS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(86));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(visit);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDomainAssignment(Visit) <em>Get Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(Visit)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DOMAIN_ASSIGNMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DomainAssignment))->asSequence()->any(true).oclAsType(sdtm::DomainAssignment)";

	/**
	 * The cached OCL query for the '{@link #getDomainAssignment(Visit) <em>Get Domain Assignment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(Visit)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DOMAIN_ASSIGNMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DomainAssignment getDomainAssignment(Visit visit) {
	
	
	
		if (GET_DOMAIN_ASSIGNMENT__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(87));
			try {
				GET_DOMAIN_ASSIGNMENT__EOCL_QRY = helper.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_QRY);
		return (DomainAssignment) query.evaluate(visit);
	}

	/**
	 * The cached OCL expression body for the '{@link #getRelatedRecords(Visit) <em>Get Related Records</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(Visit)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RELATED_RECORDS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::RelatedRecord)).oclAsType(sdtm::RelatedRecord)";

	/**
	 * The cached OCL query for the '{@link #getRelatedRecords(Visit) <em>Get Related Records</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(Visit)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RELATED_RECORDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<RelatedRecord> getRelatedRecords(Visit visit) {
	
	
	
		if (GET_RELATED_RECORDS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(88));
			try {
				GET_RELATED_RECORDS__EOCL_QRY = helper.createQuery(GET_RELATED_RECORDS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_RELATED_RECORDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RelatedRecord> result = (Collection<RelatedRecord>) query.evaluate(visit);
		return new BasicEList.UnmodifiableEList<RelatedRecord>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplementalValues(Visit) <em>Get Supplemental Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(Visit)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLEMENTAL_VALUES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SupplementalValue)).oclAsType(sdtm::SupplementalValue)";

	/**
	 * The cached OCL query for the '{@link #getSupplementalValues(Visit) <em>Get Supplemental Values</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(Visit)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLEMENTAL_VALUES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<SupplementalValue> getSupplementalValues(Visit visit) {
	
	
	
		if (GET_SUPPLEMENTAL_VALUES__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(89));
			try {
				GET_SUPPLEMENTAL_VALUES__EOCL_QRY = helper.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SupplementalValue> result = (Collection<SupplementalValue>) query.evaluate(visit);
		return new BasicEList.UnmodifiableEList<SupplementalValue>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getHumanClinicalLaboratoryTestResults(Visit) <em>Get Human Clinical Laboratory Test Results</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanClinicalLaboratoryTestResults(Visit)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HUMAN_CLINICAL_LABORATORY_TEST_RESULTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::HumanClinicalLaboratoryTestResult)).oclAsType(sdtm::HumanClinicalLaboratoryTestResult)";

	/**
	 * The cached OCL query for the '{@link #getHumanClinicalLaboratoryTestResults(Visit) <em>Get Human Clinical Laboratory Test Results</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanClinicalLaboratoryTestResults(Visit)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HUMAN_CLINICAL_LABORATORY_TEST_RESULTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<HumanClinicalLaboratoryTestResult> getHumanClinicalLaboratoryTestResults(Visit visit) {
	
	
	
		if (GET_HUMAN_CLINICAL_LABORATORY_TEST_RESULTS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(90));
			try {
				GET_HUMAN_CLINICAL_LABORATORY_TEST_RESULTS__EOCL_QRY = helper.createQuery(GET_HUMAN_CLINICAL_LABORATORY_TEST_RESULTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_HUMAN_CLINICAL_LABORATORY_TEST_RESULTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<HumanClinicalLaboratoryTestResult> result = (Collection<HumanClinicalLaboratoryTestResult>) query.evaluate(visit);
		return new BasicEList.UnmodifiableEList<HumanClinicalLaboratoryTestResult>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getQuestionnaireFindings(Visit) <em>Get Questionnaire Findings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionnaireFindings(Visit)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_QUESTIONNAIRE_FINDINGS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::QuestionnaireFinding)).oclAsType(sdtm::QuestionnaireFinding)";

	/**
	 * The cached OCL query for the '{@link #getQuestionnaireFindings(Visit) <em>Get Questionnaire Findings</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionnaireFindings(Visit)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_QUESTIONNAIRE_FINDINGS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<QuestionnaireFinding> getQuestionnaireFindings(Visit visit) {
	
	
	
		if (GET_QUESTIONNAIRE_FINDINGS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(91));
			try {
				GET_QUESTIONNAIRE_FINDINGS__EOCL_QRY = helper.createQuery(GET_QUESTIONNAIRE_FINDINGS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_QUESTIONNAIRE_FINDINGS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<QuestionnaireFinding> result = (Collection<QuestionnaireFinding>) query.evaluate(visit);
		return new BasicEList.UnmodifiableEList<QuestionnaireFinding>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPharmacokineticParameterFindings(Visit) <em>Get Pharmacokinetic Parameter Findings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPharmacokineticParameterFindings(Visit)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PHARMACOKINETIC_PARAMETER_FINDINGS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::PharmacokineticParameterFinding)).oclAsType(sdtm::PharmacokineticParameterFinding)";

	/**
	 * The cached OCL query for the '{@link #getPharmacokineticParameterFindings(Visit) <em>Get Pharmacokinetic Parameter Findings</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPharmacokineticParameterFindings(Visit)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PHARMACOKINETIC_PARAMETER_FINDINGS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<PharmacokineticParameterFinding> getPharmacokineticParameterFindings(Visit visit) {
	
	
	
		if (GET_PHARMACOKINETIC_PARAMETER_FINDINGS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.VISIT, SdtmPackage.Literals.VISIT.getEAllOperations().get(92));
			try {
				GET_PHARMACOKINETIC_PARAMETER_FINDINGS__EOCL_QRY = helper.createQuery(GET_PHARMACOKINETIC_PARAMETER_FINDINGS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_PHARMACOKINETIC_PARAMETER_FINDINGS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PharmacokineticParameterFinding> result = (Collection<PharmacokineticParameterFinding>) query.evaluate(visit);
		return new BasicEList.UnmodifiableEList<PharmacokineticParameterFinding>(result.size(), result.toArray());
	}

} // VisitOperations