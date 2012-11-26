/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.eye.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection;

import org.openhealthtools.mdht.uml.cda.cdt.HistoryOfPresentIllness;

import org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.ihe.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.ihe.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedFamilyMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection;
import org.openhealthtools.mdht.uml.cda.ihe.FamilyMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.SurgeriesSection;

import org.openhealthtools.mdht.uml.cda.ihe.eye.EyePackage;
import org.openhealthtools.mdht.uml.cda.ihe.eye.EyePlugin;
import org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation;
import org.openhealthtools.mdht.uml.cda.ihe.eye.OcularHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.eye.OcularPhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.ihe.eye.OphthalmicMedicationsSection;

import org.openhealthtools.mdht.uml.cda.ihe.eye.util.EyeValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>General Eye Evaluation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#validateGeneralEyeEvaluationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#validateGeneralEyeEvaluationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#validateGeneralEyeEvaluationChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#validateGeneralEyeEvaluationOcularHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Ocular History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#validateGeneralEyeEvaluationHistoryOfPastIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#validateGeneralEyeEvaluationSurgeriesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Surgeries Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#validateGeneralEyeEvaluationCodedSurgeriesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Coded Surgeries Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#validateGeneralEyeEvaluationMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#validateGeneralEyeEvaluationOphthalmicMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Ophthalmic Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#validateGeneralEyeEvaluationAllergiesReactionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#validateGeneralEyeEvaluationActiveProblemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Active Problems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#validateGeneralEyeEvaluationFamilyMedicalHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Family Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#validateGeneralEyeEvaluationSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#validateGeneralEyeEvaluationOcularPhysicalExamSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Ocular Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#validateGeneralEyeEvaluationAssessmentAndPlanSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#validateGeneralEyeEvaluationHistoryOfPresentIllness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#validateGeneralEyeEvaluationReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#validateGeneralEyeEvaluationCodedSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Coded Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#validateGeneralEyeEvaluationFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#validateGeneralEyeEvaluationCodedFamilyMedicalHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Coded Family Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#getOcularHistorySection() <em>Get Ocular History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#getHistoryOfPastIllnessSection() <em>Get History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#getSurgeriesSection() <em>Get Surgeries Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#getCodedSurgeriesSection() <em>Get Coded Surgeries Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#getOphthalmicMedicationsSection() <em>Get Ophthalmic Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#getAllergiesReactionsSection() <em>Get Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#getActiveProblemsSection() <em>Get Active Problems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#getFamilyMedicalHistorySection() <em>Get Family Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#getOcularPhysicalExamSection() <em>Get Ocular Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#getAssessmentAndPlanSection() <em>Get Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#getHistoryOfPresentIllness() <em>Get History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#getCodedSocialHistorySection() <em>Get Coded Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#getFunctionalStatusSection() <em>Get Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation#getCodedFamilyMedicalHistorySection() <em>Get Coded Family Medical History Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralEyeEvaluationOperations extends ClinicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralEyeEvaluationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralEyeEvaluationTemplateId(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationTemplateId(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_EYE_EVALUATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.12.1.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralEyeEvaluationTemplateId(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationTemplateId(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GENERAL_EYE_EVALUATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.12.1.1.1')
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGeneralEyeEvaluationTemplateId(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_EYE_EVALUATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.GENERAL_EYE_EVALUATION);
			try {
				VALIDATE_GENERAL_EYE_EVALUATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_EYE_EVALUATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_EYE_EVALUATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalEyeEvaluation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_TEMPLATE_ID,
						 EyePlugin.INSTANCE.getString("GeneralEyeEvaluationTemplateId"),
						 new Object [] { generalEyeEvaluation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralEyeEvaluationCode(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationCode(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_EYE_EVALUATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '70947-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralEyeEvaluationCode(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationCode(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GENERAL_EYE_EVALUATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	 * value.code = '70947-7' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGeneralEyeEvaluationCode(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_EYE_EVALUATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.GENERAL_EYE_EVALUATION);
			try {
				VALIDATE_GENERAL_EYE_EVALUATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_EYE_EVALUATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_EYE_EVALUATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalEyeEvaluation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_CODE,
						 EyePlugin.INSTANCE.getString("GeneralEyeEvaluationCode"),
						 new Object [] { generalEyeEvaluation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralEyeEvaluationChiefComplaintSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Chief Complaint Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationChiefComplaintSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_EYE_EVALUATION_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ChiefComplaintSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralEyeEvaluationChiefComplaintSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Chief Complaint Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationChiefComplaintSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GENERAL_EYE_EVALUATION_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ChiefComplaintSection))
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGeneralEyeEvaluationChiefComplaintSection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_EYE_EVALUATION_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.GENERAL_EYE_EVALUATION);
			try {
				VALIDATE_GENERAL_EYE_EVALUATION_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_EYE_EVALUATION_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_EYE_EVALUATION_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalEyeEvaluation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_CHIEF_COMPLAINT_SECTION,
						 EyePlugin.INSTANCE.getString("GeneralEyeEvaluationChiefComplaintSection"),
						 new Object [] { generalEyeEvaluation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralEyeEvaluationOcularHistorySection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Ocular History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationOcularHistorySection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_EYE_EVALUATION_OCULAR_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(eye::OcularHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralEyeEvaluationOcularHistorySection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Ocular History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationOcularHistorySection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GENERAL_EYE_EVALUATION_OCULAR_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(eye::OcularHistorySection))
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGeneralEyeEvaluationOcularHistorySection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_EYE_EVALUATION_OCULAR_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.GENERAL_EYE_EVALUATION);
			try {
				VALIDATE_GENERAL_EYE_EVALUATION_OCULAR_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_EYE_EVALUATION_OCULAR_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_EYE_EVALUATION_OCULAR_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalEyeEvaluation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_OCULAR_HISTORY_SECTION,
						 EyePlugin.INSTANCE.getString("GeneralEyeEvaluationOcularHistorySection"),
						 new Object [] { generalEyeEvaluation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralEyeEvaluationHistoryOfPastIllnessSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation History Of Past Illness Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationHistoryOfPastIllnessSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_EYE_EVALUATION_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::HistoryOfPastIllnessSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralEyeEvaluationHistoryOfPastIllnessSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation History Of Past Illness Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationHistoryOfPastIllnessSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GENERAL_EYE_EVALUATION_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::HistoryOfPastIllnessSection))
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGeneralEyeEvaluationHistoryOfPastIllnessSection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_EYE_EVALUATION_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.GENERAL_EYE_EVALUATION);
			try {
				VALIDATE_GENERAL_EYE_EVALUATION_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_EYE_EVALUATION_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_EYE_EVALUATION_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalEyeEvaluation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_HISTORY_OF_PAST_ILLNESS_SECTION,
						 EyePlugin.INSTANCE.getString("GeneralEyeEvaluationHistoryOfPastIllnessSection"),
						 new Object [] { generalEyeEvaluation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralEyeEvaluationSurgeriesSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Surgeries Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationSurgeriesSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_EYE_EVALUATION_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::SurgeriesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralEyeEvaluationSurgeriesSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Surgeries Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationSurgeriesSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GENERAL_EYE_EVALUATION_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::SurgeriesSection))
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGeneralEyeEvaluationSurgeriesSection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_EYE_EVALUATION_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.GENERAL_EYE_EVALUATION);
			try {
				VALIDATE_GENERAL_EYE_EVALUATION_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_EYE_EVALUATION_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_EYE_EVALUATION_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalEyeEvaluation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_SURGERIES_SECTION,
						 EyePlugin.INSTANCE.getString("GeneralEyeEvaluationSurgeriesSection"),
						 new Object [] { generalEyeEvaluation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralEyeEvaluationCodedSurgeriesSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Coded Surgeries Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationCodedSurgeriesSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_EYE_EVALUATION_CODED_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::CodedSurgeriesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralEyeEvaluationCodedSurgeriesSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Coded Surgeries Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationCodedSurgeriesSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GENERAL_EYE_EVALUATION_CODED_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::CodedSurgeriesSection))
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGeneralEyeEvaluationCodedSurgeriesSection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_EYE_EVALUATION_CODED_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.GENERAL_EYE_EVALUATION);
			try {
				VALIDATE_GENERAL_EYE_EVALUATION_CODED_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_EYE_EVALUATION_CODED_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_EYE_EVALUATION_CODED_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalEyeEvaluation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_CODED_SURGERIES_SECTION,
						 EyePlugin.INSTANCE.getString("GeneralEyeEvaluationCodedSurgeriesSection"),
						 new Object [] { generalEyeEvaluation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralEyeEvaluationMedicationsSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationMedicationsSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_EYE_EVALUATION_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::MedicationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralEyeEvaluationMedicationsSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Medications Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationMedicationsSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GENERAL_EYE_EVALUATION_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::MedicationsSection))
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGeneralEyeEvaluationMedicationsSection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_EYE_EVALUATION_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.GENERAL_EYE_EVALUATION);
			try {
				VALIDATE_GENERAL_EYE_EVALUATION_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_EYE_EVALUATION_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_EYE_EVALUATION_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalEyeEvaluation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_MEDICATIONS_SECTION,
						 EyePlugin.INSTANCE.getString("GeneralEyeEvaluationMedicationsSection"),
						 new Object [] { generalEyeEvaluation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralEyeEvaluationOphthalmicMedicationsSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Ophthalmic Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationOphthalmicMedicationsSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_EYE_EVALUATION_OPHTHALMIC_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(eye::OphthalmicMedicationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralEyeEvaluationOphthalmicMedicationsSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Ophthalmic Medications Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationOphthalmicMedicationsSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GENERAL_EYE_EVALUATION_OPHTHALMIC_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(eye::OphthalmicMedicationsSection))
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGeneralEyeEvaluationOphthalmicMedicationsSection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_EYE_EVALUATION_OPHTHALMIC_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.GENERAL_EYE_EVALUATION);
			try {
				VALIDATE_GENERAL_EYE_EVALUATION_OPHTHALMIC_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_EYE_EVALUATION_OPHTHALMIC_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_EYE_EVALUATION_OPHTHALMIC_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalEyeEvaluation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_OPHTHALMIC_MEDICATIONS_SECTION,
						 EyePlugin.INSTANCE.getString("GeneralEyeEvaluationOphthalmicMedicationsSection"),
						 new Object [] { generalEyeEvaluation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralEyeEvaluationAllergiesReactionsSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Allergies Reactions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationAllergiesReactionsSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_EYE_EVALUATION_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::AllergiesReactionsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralEyeEvaluationAllergiesReactionsSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Allergies Reactions Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationAllergiesReactionsSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GENERAL_EYE_EVALUATION_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::AllergiesReactionsSection))
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGeneralEyeEvaluationAllergiesReactionsSection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_EYE_EVALUATION_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.GENERAL_EYE_EVALUATION);
			try {
				VALIDATE_GENERAL_EYE_EVALUATION_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_EYE_EVALUATION_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_EYE_EVALUATION_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalEyeEvaluation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_ALLERGIES_REACTIONS_SECTION,
						 EyePlugin.INSTANCE.getString("GeneralEyeEvaluationAllergiesReactionsSection"),
						 new Object [] { generalEyeEvaluation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralEyeEvaluationActiveProblemsSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Active Problems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationActiveProblemsSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_EYE_EVALUATION_ACTIVE_PROBLEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ActiveProblemsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralEyeEvaluationActiveProblemsSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Active Problems Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationActiveProblemsSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GENERAL_EYE_EVALUATION_ACTIVE_PROBLEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ActiveProblemsSection))
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGeneralEyeEvaluationActiveProblemsSection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_EYE_EVALUATION_ACTIVE_PROBLEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.GENERAL_EYE_EVALUATION);
			try {
				VALIDATE_GENERAL_EYE_EVALUATION_ACTIVE_PROBLEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_EYE_EVALUATION_ACTIVE_PROBLEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_EYE_EVALUATION_ACTIVE_PROBLEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalEyeEvaluation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_ACTIVE_PROBLEMS_SECTION,
						 EyePlugin.INSTANCE.getString("GeneralEyeEvaluationActiveProblemsSection"),
						 new Object [] { generalEyeEvaluation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralEyeEvaluationFamilyMedicalHistorySection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Family Medical History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationFamilyMedicalHistorySection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_EYE_EVALUATION_FAMILY_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::FamilyMedicalHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralEyeEvaluationFamilyMedicalHistorySection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Family Medical History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationFamilyMedicalHistorySection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GENERAL_EYE_EVALUATION_FAMILY_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::FamilyMedicalHistorySection))
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGeneralEyeEvaluationFamilyMedicalHistorySection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_EYE_EVALUATION_FAMILY_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.GENERAL_EYE_EVALUATION);
			try {
				VALIDATE_GENERAL_EYE_EVALUATION_FAMILY_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_EYE_EVALUATION_FAMILY_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_EYE_EVALUATION_FAMILY_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalEyeEvaluation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_FAMILY_MEDICAL_HISTORY_SECTION,
						 EyePlugin.INSTANCE.getString("GeneralEyeEvaluationFamilyMedicalHistorySection"),
						 new Object [] { generalEyeEvaluation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralEyeEvaluationSocialHistorySection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationSocialHistorySection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_EYE_EVALUATION_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::SocialHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralEyeEvaluationSocialHistorySection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Social History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationSocialHistorySection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GENERAL_EYE_EVALUATION_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::SocialHistorySection))
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGeneralEyeEvaluationSocialHistorySection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_EYE_EVALUATION_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.GENERAL_EYE_EVALUATION);
			try {
				VALIDATE_GENERAL_EYE_EVALUATION_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_EYE_EVALUATION_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_EYE_EVALUATION_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalEyeEvaluation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_SOCIAL_HISTORY_SECTION,
						 EyePlugin.INSTANCE.getString("GeneralEyeEvaluationSocialHistorySection"),
						 new Object [] { generalEyeEvaluation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralEyeEvaluationOcularPhysicalExamSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Ocular Physical Exam Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationOcularPhysicalExamSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_EYE_EVALUATION_OCULAR_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(eye::OcularPhysicalExamSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralEyeEvaluationOcularPhysicalExamSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Ocular Physical Exam Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationOcularPhysicalExamSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GENERAL_EYE_EVALUATION_OCULAR_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(eye::OcularPhysicalExamSection))
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGeneralEyeEvaluationOcularPhysicalExamSection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_EYE_EVALUATION_OCULAR_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.GENERAL_EYE_EVALUATION);
			try {
				VALIDATE_GENERAL_EYE_EVALUATION_OCULAR_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_EYE_EVALUATION_OCULAR_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_EYE_EVALUATION_OCULAR_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalEyeEvaluation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_OCULAR_PHYSICAL_EXAM_SECTION,
						 EyePlugin.INSTANCE.getString("GeneralEyeEvaluationOcularPhysicalExamSection"),
						 new Object [] { generalEyeEvaluation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralEyeEvaluationAssessmentAndPlanSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Assessment And Plan Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationAssessmentAndPlanSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_EYE_EVALUATION_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::AssessmentAndPlanSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralEyeEvaluationAssessmentAndPlanSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Assessment And Plan Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationAssessmentAndPlanSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GENERAL_EYE_EVALUATION_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::AssessmentAndPlanSection))
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGeneralEyeEvaluationAssessmentAndPlanSection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_EYE_EVALUATION_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.GENERAL_EYE_EVALUATION);
			try {
				VALIDATE_GENERAL_EYE_EVALUATION_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_EYE_EVALUATION_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_EYE_EVALUATION_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalEyeEvaluation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_ASSESSMENT_AND_PLAN_SECTION,
						 EyePlugin.INSTANCE.getString("GeneralEyeEvaluationAssessmentAndPlanSection"),
						 new Object [] { generalEyeEvaluation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralEyeEvaluationHistoryOfPresentIllness(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation History Of Present Illness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationHistoryOfPresentIllness(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_EYE_EVALUATION_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::HistoryOfPresentIllness))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralEyeEvaluationHistoryOfPresentIllness(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation History Of Present Illness</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationHistoryOfPresentIllness(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GENERAL_EYE_EVALUATION_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::HistoryOfPresentIllness))
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGeneralEyeEvaluationHistoryOfPresentIllness(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_EYE_EVALUATION_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.GENERAL_EYE_EVALUATION);
			try {
				VALIDATE_GENERAL_EYE_EVALUATION_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_EYE_EVALUATION_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_EYE_EVALUATION_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalEyeEvaluation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_HISTORY_OF_PRESENT_ILLNESS,
						 EyePlugin.INSTANCE.getString("GeneralEyeEvaluationHistoryOfPresentIllness"),
						 new Object [] { generalEyeEvaluation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralEyeEvaluationReviewOfSystemsSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationReviewOfSystemsSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_EYE_EVALUATION_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ReviewOfSystemsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralEyeEvaluationReviewOfSystemsSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Review Of Systems Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationReviewOfSystemsSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GENERAL_EYE_EVALUATION_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ReviewOfSystemsSection))
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGeneralEyeEvaluationReviewOfSystemsSection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_EYE_EVALUATION_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.GENERAL_EYE_EVALUATION);
			try {
				VALIDATE_GENERAL_EYE_EVALUATION_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_EYE_EVALUATION_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_EYE_EVALUATION_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalEyeEvaluation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_REVIEW_OF_SYSTEMS_SECTION,
						 EyePlugin.INSTANCE.getString("GeneralEyeEvaluationReviewOfSystemsSection"),
						 new Object [] { generalEyeEvaluation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralEyeEvaluationCodedSocialHistorySection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Coded Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationCodedSocialHistorySection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_EYE_EVALUATION_CODED_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::CodedSocialHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralEyeEvaluationCodedSocialHistorySection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Coded Social History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationCodedSocialHistorySection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GENERAL_EYE_EVALUATION_CODED_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::CodedSocialHistorySection))
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGeneralEyeEvaluationCodedSocialHistorySection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_EYE_EVALUATION_CODED_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.GENERAL_EYE_EVALUATION);
			try {
				VALIDATE_GENERAL_EYE_EVALUATION_CODED_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_EYE_EVALUATION_CODED_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_EYE_EVALUATION_CODED_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalEyeEvaluation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_CODED_SOCIAL_HISTORY_SECTION,
						 EyePlugin.INSTANCE.getString("GeneralEyeEvaluationCodedSocialHistorySection"),
						 new Object [] { generalEyeEvaluation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralEyeEvaluationFunctionalStatusSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Functional Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationFunctionalStatusSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_EYE_EVALUATION_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::FunctionalStatusSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralEyeEvaluationFunctionalStatusSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Functional Status Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationFunctionalStatusSection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GENERAL_EYE_EVALUATION_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::FunctionalStatusSection))
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGeneralEyeEvaluationFunctionalStatusSection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_EYE_EVALUATION_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.GENERAL_EYE_EVALUATION);
			try {
				VALIDATE_GENERAL_EYE_EVALUATION_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_EYE_EVALUATION_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_EYE_EVALUATION_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalEyeEvaluation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_FUNCTIONAL_STATUS_SECTION,
						 EyePlugin.INSTANCE.getString("GeneralEyeEvaluationFunctionalStatusSection"),
						 new Object [] { generalEyeEvaluation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralEyeEvaluationCodedFamilyMedicalHistorySection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Coded Family Medical History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationCodedFamilyMedicalHistorySection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_EYE_EVALUATION_CODED_FAMILY_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::CodedFamilyMedicalHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralEyeEvaluationCodedFamilyMedicalHistorySection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Eye Evaluation Coded Family Medical History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralEyeEvaluationCodedFamilyMedicalHistorySection(GeneralEyeEvaluation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GENERAL_EYE_EVALUATION_CODED_FAMILY_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::CodedFamilyMedicalHistorySection))
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGeneralEyeEvaluationCodedFamilyMedicalHistorySection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_EYE_EVALUATION_CODED_FAMILY_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.GENERAL_EYE_EVALUATION);
			try {
				VALIDATE_GENERAL_EYE_EVALUATION_CODED_FAMILY_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_EYE_EVALUATION_CODED_FAMILY_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_EYE_EVALUATION_CODED_FAMILY_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalEyeEvaluation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_CODED_FAMILY_MEDICAL_HISTORY_SECTION,
						 EyePlugin.INSTANCE.getString("GeneralEyeEvaluationCodedFamilyMedicalHistorySection"),
						 new Object [] { generalEyeEvaluation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getChiefComplaintSection(GeneralEyeEvaluation) <em>Get Chief Complaint Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintSection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ChiefComplaintSection))->asSequence()->any(true).oclAsType(ihe::ChiefComplaintSection)";

	/**
	 * The cached OCL query for the '{@link #getChiefComplaintSection(GeneralEyeEvaluation) <em>Get Chief Complaint Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintSection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ChiefComplaintSection))->asSequence()->any(true).oclAsType(ihe::ChiefComplaintSection)
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  ChiefComplaintSection getChiefComplaintSection(GeneralEyeEvaluation generalEyeEvaluation) {
		if (GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EyePackage.Literals.GENERAL_EYE_EVALUATION, EyePackage.Literals.GENERAL_EYE_EVALUATION.getEAllOperations().get(49));
			try {
				GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY);
		return (ChiefComplaintSection) query.evaluate(generalEyeEvaluation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getOcularHistorySection(GeneralEyeEvaluation) <em>Get Ocular History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcularHistorySection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OCULAR_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(eye::OcularHistorySection))->asSequence()->any(true).oclAsType(eye::OcularHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getOcularHistorySection(GeneralEyeEvaluation) <em>Get Ocular History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcularHistorySection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OCULAR_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(eye::OcularHistorySection))->asSequence()->any(true).oclAsType(eye::OcularHistorySection)
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  OcularHistorySection getOcularHistorySection(GeneralEyeEvaluation generalEyeEvaluation) {
		if (GET_OCULAR_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EyePackage.Literals.GENERAL_EYE_EVALUATION, EyePackage.Literals.GENERAL_EYE_EVALUATION.getEAllOperations().get(50));
			try {
				GET_OCULAR_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_OCULAR_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OCULAR_HISTORY_SECTION__EOCL_QRY);
		return (OcularHistorySection) query.evaluate(generalEyeEvaluation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHistoryOfPastIllnessSection(GeneralEyeEvaluation) <em>Get History Of Past Illness Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPastIllnessSection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::HistoryOfPastIllnessSection))->asSequence()->any(true).oclAsType(ihe::HistoryOfPastIllnessSection)";

	/**
	 * The cached OCL query for the '{@link #getHistoryOfPastIllnessSection(GeneralEyeEvaluation) <em>Get History Of Past Illness Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPastIllnessSection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::HistoryOfPastIllnessSection))->asSequence()->any(true).oclAsType(ihe::HistoryOfPastIllnessSection)
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  HistoryOfPastIllnessSection getHistoryOfPastIllnessSection(GeneralEyeEvaluation generalEyeEvaluation) {
		if (GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EyePackage.Literals.GENERAL_EYE_EVALUATION, EyePackage.Literals.GENERAL_EYE_EVALUATION.getEAllOperations().get(51));
			try {
				GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY);
		return (HistoryOfPastIllnessSection) query.evaluate(generalEyeEvaluation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSurgeriesSection(GeneralEyeEvaluation) <em>Get Surgeries Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgeriesSection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SURGERIES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::SurgeriesSection))->asSequence()->any(true).oclAsType(ihe::SurgeriesSection)";

	/**
	 * The cached OCL query for the '{@link #getSurgeriesSection(GeneralEyeEvaluation) <em>Get Surgeries Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgeriesSection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SURGERIES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::SurgeriesSection))->asSequence()->any(true).oclAsType(ihe::SurgeriesSection)
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  SurgeriesSection getSurgeriesSection(GeneralEyeEvaluation generalEyeEvaluation) {
		if (GET_SURGERIES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EyePackage.Literals.GENERAL_EYE_EVALUATION, EyePackage.Literals.GENERAL_EYE_EVALUATION.getEAllOperations().get(52));
			try {
				GET_SURGERIES_SECTION__EOCL_QRY = helper.createQuery(GET_SURGERIES_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SURGERIES_SECTION__EOCL_QRY);
		return (SurgeriesSection) query.evaluate(generalEyeEvaluation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCodedSurgeriesSection(GeneralEyeEvaluation) <em>Get Coded Surgeries Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodedSurgeriesSection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CODED_SURGERIES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::CodedSurgeriesSection))->asSequence()->any(true).oclAsType(ihe::CodedSurgeriesSection)";

	/**
	 * The cached OCL query for the '{@link #getCodedSurgeriesSection(GeneralEyeEvaluation) <em>Get Coded Surgeries Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodedSurgeriesSection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CODED_SURGERIES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::CodedSurgeriesSection))->asSequence()->any(true).oclAsType(ihe::CodedSurgeriesSection)
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  CodedSurgeriesSection getCodedSurgeriesSection(GeneralEyeEvaluation generalEyeEvaluation) {
		if (GET_CODED_SURGERIES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EyePackage.Literals.GENERAL_EYE_EVALUATION, EyePackage.Literals.GENERAL_EYE_EVALUATION.getEAllOperations().get(53));
			try {
				GET_CODED_SURGERIES_SECTION__EOCL_QRY = helper.createQuery(GET_CODED_SURGERIES_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CODED_SURGERIES_SECTION__EOCL_QRY);
		return (CodedSurgeriesSection) query.evaluate(generalEyeEvaluation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsSection(GeneralEyeEvaluation) <em>Get Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::MedicationsSection))->asSequence()->any(true).oclAsType(ihe::MedicationsSection)";

	/**
	 * The cached OCL query for the '{@link #getMedicationsSection(GeneralEyeEvaluation) <em>Get Medications Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::MedicationsSection))->asSequence()->any(true).oclAsType(ihe::MedicationsSection)
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  MedicationsSection getMedicationsSection(GeneralEyeEvaluation generalEyeEvaluation) {
		if (GET_MEDICATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EyePackage.Literals.GENERAL_EYE_EVALUATION, EyePackage.Literals.GENERAL_EYE_EVALUATION.getEAllOperations().get(54));
			try {
				GET_MEDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_SECTION__EOCL_QRY);
		return (MedicationsSection) query.evaluate(generalEyeEvaluation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getOphthalmicMedicationsSection(GeneralEyeEvaluation) <em>Get Ophthalmic Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOphthalmicMedicationsSection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OPHTHALMIC_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(eye::OphthalmicMedicationsSection))->asSequence()->any(true).oclAsType(eye::OphthalmicMedicationsSection)";

	/**
	 * The cached OCL query for the '{@link #getOphthalmicMedicationsSection(GeneralEyeEvaluation) <em>Get Ophthalmic Medications Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOphthalmicMedicationsSection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OPHTHALMIC_MEDICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(eye::OphthalmicMedicationsSection))->asSequence()->any(true).oclAsType(eye::OphthalmicMedicationsSection)
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  OphthalmicMedicationsSection getOphthalmicMedicationsSection(GeneralEyeEvaluation generalEyeEvaluation) {
		if (GET_OPHTHALMIC_MEDICATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EyePackage.Literals.GENERAL_EYE_EVALUATION, EyePackage.Literals.GENERAL_EYE_EVALUATION.getEAllOperations().get(55));
			try {
				GET_OPHTHALMIC_MEDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_OPHTHALMIC_MEDICATIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OPHTHALMIC_MEDICATIONS_SECTION__EOCL_QRY);
		return (OphthalmicMedicationsSection) query.evaluate(generalEyeEvaluation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergiesReactionsSection(GeneralEyeEvaluation) <em>Get Allergies Reactions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesReactionsSection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_REACTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::AllergiesReactionsSection))->asSequence()->any(true).oclAsType(ihe::AllergiesReactionsSection)";

	/**
	 * The cached OCL query for the '{@link #getAllergiesReactionsSection(GeneralEyeEvaluation) <em>Get Allergies Reactions Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesReactionsSection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::AllergiesReactionsSection))->asSequence()->any(true).oclAsType(ihe::AllergiesReactionsSection)
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  AllergiesReactionsSection getAllergiesReactionsSection(GeneralEyeEvaluation generalEyeEvaluation) {
		if (GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EyePackage.Literals.GENERAL_EYE_EVALUATION, EyePackage.Literals.GENERAL_EYE_EVALUATION.getEAllOperations().get(56));
			try {
				GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_ALLERGIES_REACTIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY);
		return (AllergiesReactionsSection) query.evaluate(generalEyeEvaluation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getActiveProblemsSection(GeneralEyeEvaluation) <em>Get Active Problems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveProblemsSection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACTIVE_PROBLEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ActiveProblemsSection))->asSequence()->any(true).oclAsType(ihe::ActiveProblemsSection)";

	/**
	 * The cached OCL query for the '{@link #getActiveProblemsSection(GeneralEyeEvaluation) <em>Get Active Problems Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveProblemsSection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACTIVE_PROBLEMS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ActiveProblemsSection))->asSequence()->any(true).oclAsType(ihe::ActiveProblemsSection)
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  ActiveProblemsSection getActiveProblemsSection(GeneralEyeEvaluation generalEyeEvaluation) {
		if (GET_ACTIVE_PROBLEMS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EyePackage.Literals.GENERAL_EYE_EVALUATION, EyePackage.Literals.GENERAL_EYE_EVALUATION.getEAllOperations().get(57));
			try {
				GET_ACTIVE_PROBLEMS_SECTION__EOCL_QRY = helper.createQuery(GET_ACTIVE_PROBLEMS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACTIVE_PROBLEMS_SECTION__EOCL_QRY);
		return (ActiveProblemsSection) query.evaluate(generalEyeEvaluation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyMedicalHistorySection(GeneralEyeEvaluation) <em>Get Family Medical History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyMedicalHistorySection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_MEDICAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::FamilyMedicalHistorySection))->asSequence()->any(true).oclAsType(ihe::FamilyMedicalHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getFamilyMedicalHistorySection(GeneralEyeEvaluation) <em>Get Family Medical History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyMedicalHistorySection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_MEDICAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::FamilyMedicalHistorySection))->asSequence()->any(true).oclAsType(ihe::FamilyMedicalHistorySection)
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  FamilyMedicalHistorySection getFamilyMedicalHistorySection(GeneralEyeEvaluation generalEyeEvaluation) {
		if (GET_FAMILY_MEDICAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EyePackage.Literals.GENERAL_EYE_EVALUATION, EyePackage.Literals.GENERAL_EYE_EVALUATION.getEAllOperations().get(58));
			try {
				GET_FAMILY_MEDICAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_FAMILY_MEDICAL_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_MEDICAL_HISTORY_SECTION__EOCL_QRY);
		return (FamilyMedicalHistorySection) query.evaluate(generalEyeEvaluation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistorySection(GeneralEyeEvaluation) <em>Get Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::SocialHistorySection))->asSequence()->any(true).oclAsType(ihe::SocialHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getSocialHistorySection(GeneralEyeEvaluation) <em>Get Social History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::SocialHistorySection))->asSequence()->any(true).oclAsType(ihe::SocialHistorySection)
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  SocialHistorySection getSocialHistorySection(GeneralEyeEvaluation generalEyeEvaluation) {
		if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EyePackage.Literals.GENERAL_EYE_EVALUATION, EyePackage.Literals.GENERAL_EYE_EVALUATION.getEAllOperations().get(59));
			try {
				GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (SocialHistorySection) query.evaluate(generalEyeEvaluation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getOcularPhysicalExamSection(GeneralEyeEvaluation) <em>Get Ocular Physical Exam Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcularPhysicalExamSection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OCULAR_PHYSICAL_EXAM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(eye::OcularPhysicalExamSection))->asSequence()->any(true).oclAsType(eye::OcularPhysicalExamSection)";

	/**
	 * The cached OCL query for the '{@link #getOcularPhysicalExamSection(GeneralEyeEvaluation) <em>Get Ocular Physical Exam Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcularPhysicalExamSection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OCULAR_PHYSICAL_EXAM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(eye::OcularPhysicalExamSection))->asSequence()->any(true).oclAsType(eye::OcularPhysicalExamSection)
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  OcularPhysicalExamSection getOcularPhysicalExamSection(GeneralEyeEvaluation generalEyeEvaluation) {
		if (GET_OCULAR_PHYSICAL_EXAM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EyePackage.Literals.GENERAL_EYE_EVALUATION, EyePackage.Literals.GENERAL_EYE_EVALUATION.getEAllOperations().get(60));
			try {
				GET_OCULAR_PHYSICAL_EXAM_SECTION__EOCL_QRY = helper.createQuery(GET_OCULAR_PHYSICAL_EXAM_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OCULAR_PHYSICAL_EXAM_SECTION__EOCL_QRY);
		return (OcularPhysicalExamSection) query.evaluate(generalEyeEvaluation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentAndPlanSection(GeneralEyeEvaluation) <em>Get Assessment And Plan Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAndPlanSection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::AssessmentAndPlanSection))->asSequence()->any(true).oclAsType(ihe::AssessmentAndPlanSection)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentAndPlanSection(GeneralEyeEvaluation) <em>Get Assessment And Plan Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAndPlanSection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::AssessmentAndPlanSection))->asSequence()->any(true).oclAsType(ihe::AssessmentAndPlanSection)
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  AssessmentAndPlanSection getAssessmentAndPlanSection(GeneralEyeEvaluation generalEyeEvaluation) {
		if (GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EyePackage.Literals.GENERAL_EYE_EVALUATION, EyePackage.Literals.GENERAL_EYE_EVALUATION.getEAllOperations().get(61));
			try {
				GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY);
		return (AssessmentAndPlanSection) query.evaluate(generalEyeEvaluation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHistoryOfPresentIllness(GeneralEyeEvaluation) <em>Get History Of Present Illness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllness(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::HistoryOfPresentIllness))->asSequence()->any(true).oclAsType(cdt::HistoryOfPresentIllness)";

	/**
	 * The cached OCL query for the '{@link #getHistoryOfPresentIllness(GeneralEyeEvaluation) <em>Get History Of Present Illness</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllness(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::HistoryOfPresentIllness))->asSequence()->any(true).oclAsType(cdt::HistoryOfPresentIllness)
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  HistoryOfPresentIllness getHistoryOfPresentIllness(GeneralEyeEvaluation generalEyeEvaluation) {
		if (GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EyePackage.Literals.GENERAL_EYE_EVALUATION, EyePackage.Literals.GENERAL_EYE_EVALUATION.getEAllOperations().get(62));
			try {
				GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY);
		return (HistoryOfPresentIllness) query.evaluate(generalEyeEvaluation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReviewOfSystemsSection(GeneralEyeEvaluation) <em>Get Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ReviewOfSystemsSection))->asSequence()->any(true).oclAsType(ihe::ReviewOfSystemsSection)";

	/**
	 * The cached OCL query for the '{@link #getReviewOfSystemsSection(GeneralEyeEvaluation) <em>Get Review Of Systems Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ReviewOfSystemsSection))->asSequence()->any(true).oclAsType(ihe::ReviewOfSystemsSection)
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  ReviewOfSystemsSection getReviewOfSystemsSection(GeneralEyeEvaluation generalEyeEvaluation) {
		if (GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EyePackage.Literals.GENERAL_EYE_EVALUATION, EyePackage.Literals.GENERAL_EYE_EVALUATION.getEAllOperations().get(63));
			try {
				GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY = helper.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY);
		return (ReviewOfSystemsSection) query.evaluate(generalEyeEvaluation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCodedSocialHistorySection(GeneralEyeEvaluation) <em>Get Coded Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodedSocialHistorySection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CODED_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::CodedSocialHistorySection))->asSequence()->any(true).oclAsType(ihe::CodedSocialHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getCodedSocialHistorySection(GeneralEyeEvaluation) <em>Get Coded Social History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodedSocialHistorySection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CODED_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::CodedSocialHistorySection))->asSequence()->any(true).oclAsType(ihe::CodedSocialHistorySection)
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  CodedSocialHistorySection getCodedSocialHistorySection(GeneralEyeEvaluation generalEyeEvaluation) {
		if (GET_CODED_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EyePackage.Literals.GENERAL_EYE_EVALUATION, EyePackage.Literals.GENERAL_EYE_EVALUATION.getEAllOperations().get(64));
			try {
				GET_CODED_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_CODED_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CODED_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (CodedSocialHistorySection) query.evaluate(generalEyeEvaluation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFunctionalStatusSection(GeneralEyeEvaluation) <em>Get Functional Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::FunctionalStatusSection))->asSequence()->any(true).oclAsType(ccd::FunctionalStatusSection)";

	/**
	 * The cached OCL query for the '{@link #getFunctionalStatusSection(GeneralEyeEvaluation) <em>Get Functional Status Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::FunctionalStatusSection))->asSequence()->any(true).oclAsType(ccd::FunctionalStatusSection)
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  FunctionalStatusSection getFunctionalStatusSection(GeneralEyeEvaluation generalEyeEvaluation) {
		if (GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EyePackage.Literals.GENERAL_EYE_EVALUATION, EyePackage.Literals.GENERAL_EYE_EVALUATION.getEAllOperations().get(65));
			try {
				GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY);
		return (FunctionalStatusSection) query.evaluate(generalEyeEvaluation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCodedFamilyMedicalHistorySection(GeneralEyeEvaluation) <em>Get Coded Family Medical History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodedFamilyMedicalHistorySection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CODED_FAMILY_MEDICAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::CodedFamilyMedicalHistorySection))->asSequence()->any(true).oclAsType(ihe::CodedFamilyMedicalHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getCodedFamilyMedicalHistorySection(GeneralEyeEvaluation) <em>Get Coded Family Medical History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodedFamilyMedicalHistorySection(GeneralEyeEvaluation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CODED_FAMILY_MEDICAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::CodedFamilyMedicalHistorySection))->asSequence()->any(true).oclAsType(ihe::CodedFamilyMedicalHistorySection)
	 * @param generalEyeEvaluation The receiving '<em><b>General Eye Evaluation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  CodedFamilyMedicalHistorySection getCodedFamilyMedicalHistorySection(GeneralEyeEvaluation generalEyeEvaluation) {
		if (GET_CODED_FAMILY_MEDICAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EyePackage.Literals.GENERAL_EYE_EVALUATION, EyePackage.Literals.GENERAL_EYE_EVALUATION.getEAllOperations().get(66));
			try {
				GET_CODED_FAMILY_MEDICAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_CODED_FAMILY_MEDICAL_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CODED_FAMILY_MEDICAL_HISTORY_SECTION__EOCL_QRY);
		return (CodedFamilyMedicalHistorySection) query.evaluate(generalEyeEvaluation);
	}

} // GeneralEyeEvaluationOperations