/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.ihe.ProceduresAndInterventionsSection;
import org.openhealthtools.mdht.uml.cda.ihe.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.operations.MedicalDocumentOperations;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.EarlyHearingCarePlanDocument;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.HearingScreeningCodedResultsSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.QrphPackage;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.QrphPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.RiskIndicatorsForHearingLossSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.util.QrphValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Early Hearing Care Plan Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.EarlyHearingCarePlanDocument#validateEarlyHearingCarePlanDocumentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Early Hearing Care Plan Document Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.EarlyHearingCarePlanDocument#validateEarlyHearingCarePlanDocumentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Early Hearing Care Plan Document Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.EarlyHearingCarePlanDocument#getRiskIndicatorsForHearingLossSection() <em>Get Risk Indicators For Hearing Loss Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.EarlyHearingCarePlanDocument#getActiveProblemsSection() <em>Get Active Problems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.EarlyHearingCarePlanDocument#getPhysicalExamSection() <em>Get Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.EarlyHearingCarePlanDocument#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.EarlyHearingCarePlanDocument#getProceduresAndInterventionsSection() <em>Get Procedures And Interventions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.EarlyHearingCarePlanDocument#getHearingScreeningCodedResultsSection() <em>Get Hearing Screening Coded Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.EarlyHearingCarePlanDocument#validateMedicalDocumentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Document Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EarlyHearingCarePlanDocumentOperations extends MedicalDocumentOperations
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EarlyHearingCarePlanDocumentOperations() {
		super();
	}

  /**
	 * The cached OCL expression body for the '{@link #validateEarlyHearingCarePlanDocumentCodeP(EarlyHearingCarePlanDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Early Hearing Care Plan Document Code P</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateEarlyHearingCarePlanDocumentCodeP(EarlyHearingCarePlanDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_EARLY_HEARING_CARE_PLAN_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateEarlyHearingCarePlanDocumentCodeP(EarlyHearingCarePlanDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Early Hearing Care Plan Document Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateEarlyHearingCarePlanDocumentCodeP(EarlyHearingCarePlanDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_EARLY_HEARING_CARE_PLAN_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param earlyHearingCarePlanDocument The receiving '<em><b>Early Hearing Care Plan Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateEarlyHearingCarePlanDocumentCodeP(EarlyHearingCarePlanDocument earlyHearingCarePlanDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_EARLY_HEARING_CARE_PLAN_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(QrphPackage.Literals.EARLY_HEARING_CARE_PLAN_DOCUMENT);
			try {
				VALIDATE_EARLY_HEARING_CARE_PLAN_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EARLY_HEARING_CARE_PLAN_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EARLY_HEARING_CARE_PLAN_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(earlyHearingCarePlanDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QrphValidator.DIAGNOSTIC_SOURCE,
						 QrphValidator.EARLY_HEARING_CARE_PLAN_DOCUMENT__EARLY_HEARING_CARE_PLAN_DOCUMENT_CODE_P,
						 QrphPlugin.INSTANCE.getString("EarlyHearingCarePlanDocumentCodeP"),
						 new Object [] { earlyHearingCarePlanDocument }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.EarlyHearingCarePlanDocumentCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.ihe.qrph.EarlyHearingCarePlanDocumentCodeP", passToken);
				}
				passToken.add(earlyHearingCarePlanDocument);
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateEarlyHearingCarePlanDocumentCode(EarlyHearingCarePlanDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Early Hearing Care Plan Document Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateEarlyHearingCarePlanDocumentCode(EarlyHearingCarePlanDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_EARLY_HEARING_CARE_PLAN_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '34817-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
	 * The cached OCL invariant for the '{@link #validateEarlyHearingCarePlanDocumentCode(EarlyHearingCarePlanDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Early Hearing Care Plan Document Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateEarlyHearingCarePlanDocumentCode(EarlyHearingCarePlanDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_EARLY_HEARING_CARE_PLAN_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	 * value.code = '34817-7' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param earlyHearingCarePlanDocument The receiving '<em><b>Early Hearing Care Plan Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateEarlyHearingCarePlanDocumentCode(EarlyHearingCarePlanDocument earlyHearingCarePlanDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.EarlyHearingCarePlanDocumentCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(earlyHearingCarePlanDocument)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_EARLY_HEARING_CARE_PLAN_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(QrphPackage.Literals.EARLY_HEARING_CARE_PLAN_DOCUMENT);
			try {
				VALIDATE_EARLY_HEARING_CARE_PLAN_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EARLY_HEARING_CARE_PLAN_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EARLY_HEARING_CARE_PLAN_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(earlyHearingCarePlanDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QrphValidator.DIAGNOSTIC_SOURCE,
						 QrphValidator.EARLY_HEARING_CARE_PLAN_DOCUMENT__EARLY_HEARING_CARE_PLAN_DOCUMENT_CODE,
						 QrphPlugin.INSTANCE.getString("EarlyHearingCarePlanDocumentCode"),
						 new Object [] { earlyHearingCarePlanDocument }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #getRiskIndicatorsForHearingLossSection(EarlyHearingCarePlanDocument) <em>Get Risk Indicators For Hearing Loss Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRiskIndicatorsForHearingLossSection(EarlyHearingCarePlanDocument)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(qrph::RiskIndicatorsForHearingLossSection))->asSequence()->any(true).oclAsType(qrph::RiskIndicatorsForHearingLossSection)";

  /**
	 * The cached OCL query for the '{@link #getRiskIndicatorsForHearingLossSection(EarlyHearingCarePlanDocument) <em>Get Risk Indicators For Hearing Loss Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRiskIndicatorsForHearingLossSection(EarlyHearingCarePlanDocument)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__EOCL_QRY;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(qrph::RiskIndicatorsForHearingLossSection))->asSequence()->any(true).oclAsType(qrph::RiskIndicatorsForHearingLossSection)
	 * @param earlyHearingCarePlanDocument The receiving '<em><b>Early Hearing Care Plan Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  RiskIndicatorsForHearingLossSection getRiskIndicatorsForHearingLossSection(EarlyHearingCarePlanDocument earlyHearingCarePlanDocument)
  {
		if (GET_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(QrphPackage.Literals.EARLY_HEARING_CARE_PLAN_DOCUMENT, QrphPackage.Literals.EARLY_HEARING_CARE_PLAN_DOCUMENT.getEAllOperations().get(71));
			try {
				GET_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__EOCL_QRY = helper.createQuery(GET_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__EOCL_QRY);
		return (RiskIndicatorsForHearingLossSection) query.evaluate(earlyHearingCarePlanDocument);
	}

  /**
	 * The cached OCL expression body for the '{@link #getActiveProblemsSection(EarlyHearingCarePlanDocument) <em>Get Active Problems Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getActiveProblemsSection(EarlyHearingCarePlanDocument)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_ACTIVE_PROBLEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ActiveProblemsSection))->asSequence()->any(true).oclAsType(ihe::ActiveProblemsSection)";

  /**
	 * The cached OCL query for the '{@link #getActiveProblemsSection(EarlyHearingCarePlanDocument) <em>Get Active Problems Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getActiveProblemsSection(EarlyHearingCarePlanDocument)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_ACTIVE_PROBLEMS_SECTION__EOCL_QRY;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ActiveProblemsSection))->asSequence()->any(true).oclAsType(ihe::ActiveProblemsSection)
	 * @param earlyHearingCarePlanDocument The receiving '<em><b>Early Hearing Care Plan Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  ActiveProblemsSection getActiveProblemsSection(EarlyHearingCarePlanDocument earlyHearingCarePlanDocument)
  {
		if (GET_ACTIVE_PROBLEMS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(QrphPackage.Literals.EARLY_HEARING_CARE_PLAN_DOCUMENT, QrphPackage.Literals.EARLY_HEARING_CARE_PLAN_DOCUMENT.getEAllOperations().get(72));
			try {
				GET_ACTIVE_PROBLEMS_SECTION__EOCL_QRY = helper.createQuery(GET_ACTIVE_PROBLEMS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACTIVE_PROBLEMS_SECTION__EOCL_QRY);
		return (ActiveProblemsSection) query.evaluate(earlyHearingCarePlanDocument);
	}

  /**
	 * The cached OCL expression body for the '{@link #getPhysicalExamSection(EarlyHearingCarePlanDocument) <em>Get Physical Exam Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPhysicalExamSection(EarlyHearingCarePlanDocument)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_PHYSICAL_EXAM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::PhysicalExamSection))->asSequence()->any(true).oclAsType(ihe::PhysicalExamSection)";

  /**
	 * The cached OCL query for the '{@link #getPhysicalExamSection(EarlyHearingCarePlanDocument) <em>Get Physical Exam Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPhysicalExamSection(EarlyHearingCarePlanDocument)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_PHYSICAL_EXAM_SECTION__EOCL_QRY;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::PhysicalExamSection))->asSequence()->any(true).oclAsType(ihe::PhysicalExamSection)
	 * @param earlyHearingCarePlanDocument The receiving '<em><b>Early Hearing Care Plan Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  PhysicalExamSection getPhysicalExamSection(EarlyHearingCarePlanDocument earlyHearingCarePlanDocument)
  {
		if (GET_PHYSICAL_EXAM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(QrphPackage.Literals.EARLY_HEARING_CARE_PLAN_DOCUMENT, QrphPackage.Literals.EARLY_HEARING_CARE_PLAN_DOCUMENT.getEAllOperations().get(73));
			try {
				GET_PHYSICAL_EXAM_SECTION__EOCL_QRY = helper.createQuery(GET_PHYSICAL_EXAM_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PHYSICAL_EXAM_SECTION__EOCL_QRY);
		return (PhysicalExamSection) query.evaluate(earlyHearingCarePlanDocument);
	}

  /**
	 * The cached OCL expression body for the '{@link #getReviewOfSystemsSection(EarlyHearingCarePlanDocument) <em>Get Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(EarlyHearingCarePlanDocument)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ReviewOfSystemsSection))->asSequence()->any(true).oclAsType(ihe::ReviewOfSystemsSection)";

  /**
	 * The cached OCL query for the '{@link #getReviewOfSystemsSection(EarlyHearingCarePlanDocument) <em>Get Review Of Systems Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(EarlyHearingCarePlanDocument)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ReviewOfSystemsSection))->asSequence()->any(true).oclAsType(ihe::ReviewOfSystemsSection)
	 * @param earlyHearingCarePlanDocument The receiving '<em><b>Early Hearing Care Plan Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  ReviewOfSystemsSection getReviewOfSystemsSection(EarlyHearingCarePlanDocument earlyHearingCarePlanDocument)
  {
		if (GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(QrphPackage.Literals.EARLY_HEARING_CARE_PLAN_DOCUMENT, QrphPackage.Literals.EARLY_HEARING_CARE_PLAN_DOCUMENT.getEAllOperations().get(74));
			try {
				GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY = helper.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY);
		return (ReviewOfSystemsSection) query.evaluate(earlyHearingCarePlanDocument);
	}

  /**
	 * The cached OCL expression body for the '{@link #getProceduresAndInterventionsSection(EarlyHearingCarePlanDocument) <em>Get Procedures And Interventions Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProceduresAndInterventionsSection(EarlyHearingCarePlanDocument)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_PROCEDURES_AND_INTERVENTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ProceduresAndInterventionsSection))->asSequence()->any(true).oclAsType(ihe::ProceduresAndInterventionsSection)";

  /**
	 * The cached OCL query for the '{@link #getProceduresAndInterventionsSection(EarlyHearingCarePlanDocument) <em>Get Procedures And Interventions Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProceduresAndInterventionsSection(EarlyHearingCarePlanDocument)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_PROCEDURES_AND_INTERVENTIONS_SECTION__EOCL_QRY;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ProceduresAndInterventionsSection))->asSequence()->any(true).oclAsType(ihe::ProceduresAndInterventionsSection)
	 * @param earlyHearingCarePlanDocument The receiving '<em><b>Early Hearing Care Plan Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  ProceduresAndInterventionsSection getProceduresAndInterventionsSection(EarlyHearingCarePlanDocument earlyHearingCarePlanDocument)
  {
		if (GET_PROCEDURES_AND_INTERVENTIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(QrphPackage.Literals.EARLY_HEARING_CARE_PLAN_DOCUMENT, QrphPackage.Literals.EARLY_HEARING_CARE_PLAN_DOCUMENT.getEAllOperations().get(75));
			try {
				GET_PROCEDURES_AND_INTERVENTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURES_AND_INTERVENTIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURES_AND_INTERVENTIONS_SECTION__EOCL_QRY);
		return (ProceduresAndInterventionsSection) query.evaluate(earlyHearingCarePlanDocument);
	}

  /**
	 * The cached OCL expression body for the '{@link #getHearingScreeningCodedResultsSection(EarlyHearingCarePlanDocument) <em>Get Hearing Screening Coded Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHearingScreeningCodedResultsSection(EarlyHearingCarePlanDocument)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_HEARING_SCREENING_CODED_RESULTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(qrph::HearingScreeningCodedResultsSection))->asSequence()->any(true).oclAsType(qrph::HearingScreeningCodedResultsSection)";

  /**
	 * The cached OCL query for the '{@link #getHearingScreeningCodedResultsSection(EarlyHearingCarePlanDocument) <em>Get Hearing Screening Coded Results Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHearingScreeningCodedResultsSection(EarlyHearingCarePlanDocument)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_HEARING_SCREENING_CODED_RESULTS_SECTION__EOCL_QRY;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(qrph::HearingScreeningCodedResultsSection))->asSequence()->any(true).oclAsType(qrph::HearingScreeningCodedResultsSection)
	 * @param earlyHearingCarePlanDocument The receiving '<em><b>Early Hearing Care Plan Document</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  HearingScreeningCodedResultsSection getHearingScreeningCodedResultsSection(EarlyHearingCarePlanDocument earlyHearingCarePlanDocument)
  {
		if (GET_HEARING_SCREENING_CODED_RESULTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(QrphPackage.Literals.EARLY_HEARING_CARE_PLAN_DOCUMENT, QrphPackage.Literals.EARLY_HEARING_CARE_PLAN_DOCUMENT.getEAllOperations().get(76));
			try {
				GET_HEARING_SCREENING_CODED_RESULTS_SECTION__EOCL_QRY = helper.createQuery(GET_HEARING_SCREENING_CODED_RESULTS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HEARING_SCREENING_CODED_RESULTS_SECTION__EOCL_QRY);
		return (HearingScreeningCodedResultsSection) query.evaluate(earlyHearingCarePlanDocument);
	}

  /**
	 * The cached OCL expression body for the '{@link #validateMedicalDocumentTemplateId(EarlyHearingCarePlanDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Document Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateMedicalDocumentTemplateId(EarlyHearingCarePlanDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_MEDICAL_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.15.4.1')";

  /**
	 * The cached OCL invariant for the '{@link #validateMedicalDocumentTemplateId(EarlyHearingCarePlanDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Document Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateMedicalDocumentTemplateId(EarlyHearingCarePlanDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_MEDICAL_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.15.4.1')
	 * @param earlyHearingCarePlanDocument The receiving '<em><b>Early Hearing Care Plan Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateMedicalDocumentTemplateId(EarlyHearingCarePlanDocument earlyHearingCarePlanDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_MEDICAL_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(QrphPackage.Literals.EARLY_HEARING_CARE_PLAN_DOCUMENT);
			try {
				VALIDATE_MEDICAL_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(earlyHearingCarePlanDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QrphValidator.DIAGNOSTIC_SOURCE,
						 QrphValidator.EARLY_HEARING_CARE_PLAN_DOCUMENT__MEDICAL_DOCUMENT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalDocumentTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(earlyHearingCarePlanDocument, context) }),
						 new Object [] { earlyHearingCarePlanDocument }));
			}
			 
			return false;
		}
		return true;
	}

} // EarlyHearingCarePlanDocumentOperations