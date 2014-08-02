/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.eye.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

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
import org.openhealthtools.mdht.uml.cda.ihe.eye.GeneralEyeEvaluation;
import org.openhealthtools.mdht.uml.cda.ihe.eye.OcularHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.eye.OcularPhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.ihe.eye.OphthalmicMedicationsSection;

import org.openhealthtools.mdht.uml.cda.ihe.eye.operations.GeneralEyeEvaluationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Eye Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GeneralEyeEvaluationImpl extends ClinicalDocumentImpl implements GeneralEyeEvaluation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralEyeEvaluationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EyePackage.Literals.GENERAL_EYE_EVALUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralEyeEvaluationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralEyeEvaluationOperations.validateGeneralEyeEvaluationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralEyeEvaluationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralEyeEvaluationOperations.validateGeneralEyeEvaluationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralEyeEvaluationChiefComplaintSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralEyeEvaluationOperations.validateGeneralEyeEvaluationChiefComplaintSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralEyeEvaluationOcularHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralEyeEvaluationOperations.validateGeneralEyeEvaluationOcularHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralEyeEvaluationHistoryOfPastIllnessSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralEyeEvaluationOperations.validateGeneralEyeEvaluationHistoryOfPastIllnessSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralEyeEvaluationSurgeriesSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralEyeEvaluationOperations.validateGeneralEyeEvaluationSurgeriesSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralEyeEvaluationCodedSurgeriesSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralEyeEvaluationOperations.validateGeneralEyeEvaluationCodedSurgeriesSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralEyeEvaluationMedicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralEyeEvaluationOperations.validateGeneralEyeEvaluationMedicationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralEyeEvaluationOphthalmicMedicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralEyeEvaluationOperations.validateGeneralEyeEvaluationOphthalmicMedicationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralEyeEvaluationAllergiesReactionsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralEyeEvaluationOperations.validateGeneralEyeEvaluationAllergiesReactionsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralEyeEvaluationActiveProblemsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralEyeEvaluationOperations.validateGeneralEyeEvaluationActiveProblemsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralEyeEvaluationFamilyMedicalHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralEyeEvaluationOperations.validateGeneralEyeEvaluationFamilyMedicalHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralEyeEvaluationSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralEyeEvaluationOperations.validateGeneralEyeEvaluationSocialHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralEyeEvaluationOcularPhysicalExamSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralEyeEvaluationOperations.validateGeneralEyeEvaluationOcularPhysicalExamSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralEyeEvaluationAssessmentAndPlanSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralEyeEvaluationOperations.validateGeneralEyeEvaluationAssessmentAndPlanSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralEyeEvaluationHistoryOfPresentIllness(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralEyeEvaluationOperations.validateGeneralEyeEvaluationHistoryOfPresentIllness(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralEyeEvaluationReviewOfSystemsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralEyeEvaluationOperations.validateGeneralEyeEvaluationReviewOfSystemsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralEyeEvaluationCodedSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralEyeEvaluationOperations.validateGeneralEyeEvaluationCodedSocialHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralEyeEvaluationFunctionalStatusSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralEyeEvaluationOperations.validateGeneralEyeEvaluationFunctionalStatusSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralEyeEvaluationCodedFamilyMedicalHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralEyeEvaluationOperations.validateGeneralEyeEvaluationCodedFamilyMedicalHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChiefComplaintSection getChiefComplaintSection() {
		return GeneralEyeEvaluationOperations.getChiefComplaintSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OcularHistorySection getOcularHistorySection() {
		return GeneralEyeEvaluationOperations.getOcularHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryOfPastIllnessSection getHistoryOfPastIllnessSection() {
		return GeneralEyeEvaluationOperations.getHistoryOfPastIllnessSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurgeriesSection getSurgeriesSection() {
		return GeneralEyeEvaluationOperations.getSurgeriesSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodedSurgeriesSection getCodedSurgeriesSection() {
		return GeneralEyeEvaluationOperations.getCodedSurgeriesSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationsSection getMedicationsSection() {
		return GeneralEyeEvaluationOperations.getMedicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OphthalmicMedicationsSection getOphthalmicMedicationsSection() {
		return GeneralEyeEvaluationOperations.getOphthalmicMedicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergiesReactionsSection getAllergiesReactionsSection() {
		return GeneralEyeEvaluationOperations.getAllergiesReactionsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActiveProblemsSection getActiveProblemsSection() {
		return GeneralEyeEvaluationOperations.getActiveProblemsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilyMedicalHistorySection getFamilyMedicalHistorySection() {
		return GeneralEyeEvaluationOperations.getFamilyMedicalHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocialHistorySection getSocialHistorySection() {
		return GeneralEyeEvaluationOperations.getSocialHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OcularPhysicalExamSection getOcularPhysicalExamSection() {
		return GeneralEyeEvaluationOperations.getOcularPhysicalExamSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentAndPlanSection getAssessmentAndPlanSection() {
		return GeneralEyeEvaluationOperations.getAssessmentAndPlanSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryOfPresentIllness getHistoryOfPresentIllness() {
		return GeneralEyeEvaluationOperations.getHistoryOfPresentIllness(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReviewOfSystemsSection getReviewOfSystemsSection() {
		return GeneralEyeEvaluationOperations.getReviewOfSystemsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodedSocialHistorySection getCodedSocialHistorySection() {
		return GeneralEyeEvaluationOperations.getCodedSocialHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusSection getFunctionalStatusSection() {
		return GeneralEyeEvaluationOperations.getFunctionalStatusSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodedFamilyMedicalHistorySection getCodedFamilyMedicalHistorySection() {
		return GeneralEyeEvaluationOperations.getCodedFamilyMedicalHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralEyeEvaluation init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public GeneralEyeEvaluation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //GeneralEyeEvaluationImpl
