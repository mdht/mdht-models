/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.eye.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.ihe.eye.*;

import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.ihe.eye.EyePackage
 * @generated
 */
public class EyeValidator extends EObjectValidator
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final EyeValidator INSTANCE = new EyeValidator();

  /**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
  public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.ihe.eye";

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ocular List Of Surgeries Section Code P' of 'Ocular List Of Surgeries Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OCULAR_LIST_OF_SURGERIES_SECTION__OCULAR_LIST_OF_SURGERIES_SECTION_CODE_P = 1;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ocular List Of Surgeries Section Code' of 'Ocular List Of Surgeries Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OCULAR_LIST_OF_SURGERIES_SECTION__OCULAR_LIST_OF_SURGERIES_SECTION_CODE = 2;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ocular List Of Surgeries Section Text' of 'Ocular List Of Surgeries Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OCULAR_LIST_OF_SURGERIES_SECTION__OCULAR_LIST_OF_SURGERIES_SECTION_TEXT = 3;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Surgeries Section Template Id' of 'Ocular List Of Surgeries Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OCULAR_LIST_OF_SURGERIES_SECTION__SURGERIES_SECTION_TEMPLATE_ID = 4;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ocular Coded List Of Surgeries Section Procedure Entry' of 'Ocular Coded List Of Surgeries Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OCULAR_CODED_LIST_OF_SURGERIES_SECTION__OCULAR_CODED_LIST_OF_SURGERIES_SECTION_PROCEDURE_ENTRY = 5;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ocular Coded List Of Surgeries Section External Reference' of 'Ocular Coded List Of Surgeries Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OCULAR_CODED_LIST_OF_SURGERIES_SECTION__OCULAR_CODED_LIST_OF_SURGERIES_SECTION_EXTERNAL_REFERENCE = 6;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coded Surgeries Section Template Id' of 'Ocular Coded List Of Surgeries Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OCULAR_CODED_LIST_OF_SURGERIES_SECTION__CODED_SURGERIES_SECTION_TEMPLATE_ID = 7;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ocular History Section Code' of 'Ocular History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OCULAR_HISTORY_SECTION__OCULAR_HISTORY_SECTION_CODE = 8;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ocular History Section Ocular List Of Surgeries Section' of 'Ocular History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OCULAR_HISTORY_SECTION__OCULAR_HISTORY_SECTION_OCULAR_LIST_OF_SURGERIES_SECTION = 9;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ocular History Section Ocular Coded List Of Surgeries Section' of 'Ocular History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OCULAR_HISTORY_SECTION__OCULAR_HISTORY_SECTION_OCULAR_CODED_LIST_OF_SURGERIES_SECTION = 10;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History Of Past Illness Section Template Id' of 'Ocular History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OCULAR_HISTORY_SECTION__HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID = 11;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ophthalmic Medications Section Code' of 'Ophthalmic Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPHTHALMIC_MEDICATIONS_SECTION__OPHTHALMIC_MEDICATIONS_SECTION_CODE = 12;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ophthalmic Medications Section Medication' of 'Ophthalmic Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPHTHALMIC_MEDICATIONS_SECTION__OPHTHALMIC_MEDICATIONS_SECTION_MEDICATION = 13;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Medications Section Template Id' of 'Ophthalmic Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPHTHALMIC_MEDICATIONS_SECTION__IHE_MEDICATIONS_SECTION_TEMPLATE_ID = 14;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Eyes Section Template Id' of 'Routine Eye Exam Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROUTINE_EYE_EXAM_SECTION__EYES_SECTION_TEMPLATE_ID = 15;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ocular Physical Exam Section Code' of 'Ocular Physical Exam Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OCULAR_PHYSICAL_EXAM_SECTION__OCULAR_PHYSICAL_EXAM_SECTION_CODE = 16;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ocular Physical Exam Section Routine Eye Exam Section' of 'Ocular Physical Exam Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OCULAR_PHYSICAL_EXAM_SECTION__OCULAR_PHYSICAL_EXAM_SECTION_ROUTINE_EYE_EXAM_SECTION = 17;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Physical Exam Section Template Id' of 'Ocular Physical Exam Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OCULAR_PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_TEMPLATE_ID = 18;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Eye Evaluation Template Id' of 'General Eye Evaluation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_TEMPLATE_ID = 19;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Eye Evaluation Code' of 'General Eye Evaluation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_CODE = 20;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Eye Evaluation Chief Complaint Section' of 'General Eye Evaluation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_CHIEF_COMPLAINT_SECTION = 21;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Eye Evaluation Ocular History Section' of 'General Eye Evaluation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_OCULAR_HISTORY_SECTION = 22;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Eye Evaluation History Of Past Illness Section' of 'General Eye Evaluation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_HISTORY_OF_PAST_ILLNESS_SECTION = 23;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Eye Evaluation Surgeries Section' of 'General Eye Evaluation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_SURGERIES_SECTION = 24;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Eye Evaluation Coded Surgeries Section' of 'General Eye Evaluation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_CODED_SURGERIES_SECTION = 25;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Eye Evaluation Medications Section' of 'General Eye Evaluation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_MEDICATIONS_SECTION = 26;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Eye Evaluation Ophthalmic Medications Section' of 'General Eye Evaluation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_OPHTHALMIC_MEDICATIONS_SECTION = 27;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Eye Evaluation Allergies Reactions Section' of 'General Eye Evaluation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_ALLERGIES_REACTIONS_SECTION = 28;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Eye Evaluation Active Problems Section' of 'General Eye Evaluation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_ACTIVE_PROBLEMS_SECTION = 29;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Eye Evaluation Family Medical History Section' of 'General Eye Evaluation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_FAMILY_MEDICAL_HISTORY_SECTION = 30;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Eye Evaluation Social History Section' of 'General Eye Evaluation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_SOCIAL_HISTORY_SECTION = 31;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Eye Evaluation Ocular Physical Exam Section' of 'General Eye Evaluation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_OCULAR_PHYSICAL_EXAM_SECTION = 32;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Eye Evaluation Assessment And Plan Section' of 'General Eye Evaluation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_ASSESSMENT_AND_PLAN_SECTION = 33;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Eye Evaluation History Of Present Illness' of 'General Eye Evaluation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_HISTORY_OF_PRESENT_ILLNESS = 34;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Eye Evaluation Review Of Systems Section' of 'General Eye Evaluation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_REVIEW_OF_SYSTEMS_SECTION = 35;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Eye Evaluation Coded Social History Section' of 'General Eye Evaluation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_CODED_SOCIAL_HISTORY_SECTION = 36;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Eye Evaluation Functional Status Section' of 'General Eye Evaluation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_FUNCTIONAL_STATUS_SECTION = 37;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Eye Evaluation Coded Family Medical History Section' of 'General Eye Evaluation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_EYE_EVALUATION__GENERAL_EYE_EVALUATION_CODED_FAMILY_MEDICAL_HISTORY_SECTION = 38;

		/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 38;

  /**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

  /**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CDAValidator cdaValidator;

  /**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CCDValidator ccdValidator;

		/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected IHEValidator iheValidator;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EyeValidator()
  {
		super();
		cdaValidator = CDAValidator.INSTANCE;
		ccdValidator = CCDValidator.INSTANCE;
		iheValidator = IHEValidator.INSTANCE;
	}

  /**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EPackage getEPackage()
  {
	  return EyePackage.eINSTANCE;
	}

  /**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		switch (classifierID) {
			case EyePackage.OCULAR_LIST_OF_SURGERIES_SECTION:
				return validateOcularListOfSurgeriesSection((OcularListOfSurgeriesSection)value, diagnostics, context);
			case EyePackage.OCULAR_CODED_LIST_OF_SURGERIES_SECTION:
				return validateOcularCodedListOfSurgeriesSection((OcularCodedListOfSurgeriesSection)value, diagnostics, context);
			case EyePackage.OCULAR_HISTORY_SECTION:
				return validateOcularHistorySection((OcularHistorySection)value, diagnostics, context);
			case EyePackage.OPHTHALMIC_MEDICATIONS_SECTION:
				return validateOphthalmicMedicationsSection((OphthalmicMedicationsSection)value, diagnostics, context);
			case EyePackage.ROUTINE_EYE_EXAM_SECTION:
				return validateRoutineEyeExamSection((RoutineEyeExamSection)value, diagnostics, context);
			case EyePackage.OCULAR_PHYSICAL_EXAM_SECTION:
				return validateOcularPhysicalExamSection((OcularPhysicalExamSection)value, diagnostics, context);
			case EyePackage.GENERAL_EYE_EVALUATION:
				return validateGeneralEyeEvaluation((GeneralEyeEvaluation)value, diagnostics, context);
			default:
				return true;
		}
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularListOfSurgeriesSection(OcularListOfSurgeriesSection ocularListOfSurgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ocularListOfSurgeriesSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ocularListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ocularListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ocularListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ocularListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ocularListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ocularListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ocularListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ocularListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(ocularListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(ocularListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProceduresSection_validateProceduresSectionHasProcedureActivity(ocularListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProceduresSection_validateProceduresSectionTemplateId(ocularListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProceduresSection_validateProceduresSectionCode(ocularListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProceduresSection_validateProceduresSectionTitle(ocularListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProceduresSection_validateProceduresSectionText(ocularListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateOcularListOfSurgeriesSection_validateSurgeriesSectionTemplateId(ocularListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateOcularListOfSurgeriesSection_validateOcularListOfSurgeriesSectionCodeP(ocularListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateOcularListOfSurgeriesSection_validateOcularListOfSurgeriesSectionCode(ocularListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateOcularListOfSurgeriesSection_validateOcularListOfSurgeriesSectionText(ocularListOfSurgeriesSection, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateOcularListOfSurgeriesSectionCodeP constraint of '<em>Ocular List Of Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularListOfSurgeriesSection_validateOcularListOfSurgeriesSectionCodeP(OcularListOfSurgeriesSection ocularListOfSurgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ocularListOfSurgeriesSection.validateOcularListOfSurgeriesSectionCodeP(diagnostics, context);
	}

		/**
	 * Validates the validateOcularListOfSurgeriesSectionCode constraint of '<em>Ocular List Of Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularListOfSurgeriesSection_validateOcularListOfSurgeriesSectionCode(OcularListOfSurgeriesSection ocularListOfSurgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ocularListOfSurgeriesSection.validateOcularListOfSurgeriesSectionCode(diagnostics, context);
	}

		/**
	 * Validates the validateOcularListOfSurgeriesSectionText constraint of '<em>Ocular List Of Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularListOfSurgeriesSection_validateOcularListOfSurgeriesSectionText(OcularListOfSurgeriesSection ocularListOfSurgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ocularListOfSurgeriesSection.validateOcularListOfSurgeriesSectionText(diagnostics, context);
	}

		/**
	 * Validates the validateSurgeriesSectionTemplateId constraint of '<em>Ocular List Of Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularListOfSurgeriesSection_validateSurgeriesSectionTemplateId(OcularListOfSurgeriesSection ocularListOfSurgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ocularListOfSurgeriesSection.validateSurgeriesSectionTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularCodedListOfSurgeriesSection(OcularCodedListOfSurgeriesSection ocularCodedListOfSurgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ocularCodedListOfSurgeriesSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ocularCodedListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ocularCodedListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ocularCodedListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ocularCodedListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ocularCodedListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ocularCodedListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ocularCodedListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ocularCodedListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(ocularCodedListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(ocularCodedListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProceduresSection_validateProceduresSectionHasProcedureActivity(ocularCodedListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProceduresSection_validateProceduresSectionTemplateId(ocularCodedListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProceduresSection_validateProceduresSectionCode(ocularCodedListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProceduresSection_validateProceduresSectionTitle(ocularCodedListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProceduresSection_validateProceduresSectionText(ocularCodedListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateSurgeriesSection_validateSurgeriesSectionTemplateId(ocularCodedListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateOcularCodedListOfSurgeriesSection_validateCodedSurgeriesSectionTemplateId(ocularCodedListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateCodedSurgeriesSection_validateCodedSurgeriesSectionExternalReference(ocularCodedListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateCodedSurgeriesSection_validateCodedSurgeriesSectionProcedureEntryProcedureActivityProcedure(ocularCodedListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateOcularCodedListOfSurgeriesSection_validateOcularCodedListOfSurgeriesSectionProcedureEntry(ocularCodedListOfSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateOcularCodedListOfSurgeriesSection_validateOcularCodedListOfSurgeriesSectionExternalReference(ocularCodedListOfSurgeriesSection, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateOcularCodedListOfSurgeriesSectionProcedureEntry constraint of '<em>Ocular Coded List Of Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularCodedListOfSurgeriesSection_validateOcularCodedListOfSurgeriesSectionProcedureEntry(OcularCodedListOfSurgeriesSection ocularCodedListOfSurgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ocularCodedListOfSurgeriesSection.validateOcularCodedListOfSurgeriesSectionProcedureEntry(diagnostics, context);
	}

		/**
	 * Validates the validateOcularCodedListOfSurgeriesSectionExternalReference constraint of '<em>Ocular Coded List Of Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularCodedListOfSurgeriesSection_validateOcularCodedListOfSurgeriesSectionExternalReference(OcularCodedListOfSurgeriesSection ocularCodedListOfSurgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ocularCodedListOfSurgeriesSection.validateOcularCodedListOfSurgeriesSectionExternalReference(diagnostics, context);
	}

		/**
	 * Validates the validateCodedSurgeriesSectionTemplateId constraint of '<em>Ocular Coded List Of Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularCodedListOfSurgeriesSection_validateCodedSurgeriesSectionTemplateId(OcularCodedListOfSurgeriesSection ocularCodedListOfSurgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ocularCodedListOfSurgeriesSection.validateCodedSurgeriesSectionTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularHistorySection(OcularHistorySection ocularHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ocularHistorySection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ocularHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ocularHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ocularHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ocularHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ocularHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ocularHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ocularHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ocularHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(ocularHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(ocularHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateOcularHistorySection_validateHistoryOfPastIllnessSectionTemplateId(ocularHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateHistoryOfPastIllnessSection_validateHistoryOfPastIllnessSectionCode(ocularHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateOcularHistorySection_validateOcularHistorySectionCode(ocularHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateOcularHistorySection_validateOcularHistorySectionOcularListOfSurgeriesSection(ocularHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateOcularHistorySection_validateOcularHistorySectionOcularCodedListOfSurgeriesSection(ocularHistorySection, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateOcularHistorySectionCode constraint of '<em>Ocular History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularHistorySection_validateOcularHistorySectionCode(OcularHistorySection ocularHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ocularHistorySection.validateOcularHistorySectionCode(diagnostics, context);
	}

		/**
	 * Validates the validateOcularHistorySectionOcularListOfSurgeriesSection constraint of '<em>Ocular History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularHistorySection_validateOcularHistorySectionOcularListOfSurgeriesSection(OcularHistorySection ocularHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ocularHistorySection.validateOcularHistorySectionOcularListOfSurgeriesSection(diagnostics, context);
	}

		/**
	 * Validates the validateOcularHistorySectionOcularCodedListOfSurgeriesSection constraint of '<em>Ocular History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularHistorySection_validateOcularHistorySectionOcularCodedListOfSurgeriesSection(OcularHistorySection ocularHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ocularHistorySection.validateOcularHistorySectionOcularCodedListOfSurgeriesSection(diagnostics, context);
	}

		/**
	 * Validates the validateHistoryOfPastIllnessSectionTemplateId constraint of '<em>Ocular History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularHistorySection_validateHistoryOfPastIllnessSectionTemplateId(OcularHistorySection ocularHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ocularHistorySection.validateHistoryOfPastIllnessSectionTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOphthalmicMedicationsSection(OphthalmicMedicationsSection ophthalmicMedicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ophthalmicMedicationsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ophthalmicMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ophthalmicMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ophthalmicMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ophthalmicMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ophthalmicMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ophthalmicMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ophthalmicMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ophthalmicMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(ophthalmicMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(ophthalmicMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionHasMedicationOrSupplyActivity(ophthalmicMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionTemplateId(ophthalmicMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionCode(ophthalmicMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionTitle(ophthalmicMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionText(ophthalmicMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionMedicationActivity(ophthalmicMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionSupplyActivity(ophthalmicMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateOphthalmicMedicationsSection_validateIHEMedicationsSectionTemplateId(ophthalmicMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedicationsSection_validateIHEMedicationsSectionMedication(ophthalmicMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateOphthalmicMedicationsSection_validateOphthalmicMedicationsSectionCode(ophthalmicMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateOphthalmicMedicationsSection_validateOphthalmicMedicationsSectionMedication(ophthalmicMedicationsSection, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateOphthalmicMedicationsSectionCode constraint of '<em>Ophthalmic Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOphthalmicMedicationsSection_validateOphthalmicMedicationsSectionCode(OphthalmicMedicationsSection ophthalmicMedicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ophthalmicMedicationsSection.validateOphthalmicMedicationsSectionCode(diagnostics, context);
	}

		/**
	 * Validates the validateOphthalmicMedicationsSectionMedication constraint of '<em>Ophthalmic Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOphthalmicMedicationsSection_validateOphthalmicMedicationsSectionMedication(OphthalmicMedicationsSection ophthalmicMedicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ophthalmicMedicationsSection.validateOphthalmicMedicationsSectionMedication(diagnostics, context);
	}

		/**
	 * Validates the validateIHEMedicationsSectionTemplateId constraint of '<em>Ophthalmic Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOphthalmicMedicationsSection_validateIHEMedicationsSectionTemplateId(OphthalmicMedicationsSection ophthalmicMedicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ophthalmicMedicationsSection.validateIHEMedicationsSectionTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoutineEyeExamSection(RoutineEyeExamSection routineEyeExamSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(routineEyeExamSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(routineEyeExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(routineEyeExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(routineEyeExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(routineEyeExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(routineEyeExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(routineEyeExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(routineEyeExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(routineEyeExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(routineEyeExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(routineEyeExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoutineEyeExamSection_validateEyesSectionTemplateId(routineEyeExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateEyesSection_validateEyesSectionCode(routineEyeExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateEyesSection_validateEyesSectionProblemEntry(routineEyeExamSection, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateEyesSectionTemplateId constraint of '<em>Routine Eye Exam Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoutineEyeExamSection_validateEyesSectionTemplateId(RoutineEyeExamSection routineEyeExamSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return routineEyeExamSection.validateEyesSectionTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularPhysicalExamSection(OcularPhysicalExamSection ocularPhysicalExamSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ocularPhysicalExamSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamNarrativeSection_validatePhysicalExamNarrativeSectionTemplateId(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamNarrativeSection_validatePhysicalExamNarrativeSectionCode(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateOcularPhysicalExamSection_validatePhysicalExamSectionTemplateId(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionVitalSignsSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionGeneralAppearanceSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionVisibleImplantedMedicalDevicesSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionIntegumentarySystemSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionHeadSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionEyesSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionEarsNoseMouthThroatSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionEarsSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionNoseSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionMouthThroatTeethSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionNeckSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionEndocrineSystemSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionThoraxLungsSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionChestWallSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionBreastSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionHeartSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionRespiratorySystemSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionAbdomenSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionLymphaticSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionVesselsSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionMusculoskeletalSystemSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionNeurologicSystemSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionGenitaliaSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionRectumSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionExtremitiesSection(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateOcularPhysicalExamSection_validateOcularPhysicalExamSectionCode(ocularPhysicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateOcularPhysicalExamSection_validateOcularPhysicalExamSectionRoutineEyeExamSection(ocularPhysicalExamSection, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateOcularPhysicalExamSectionCode constraint of '<em>Ocular Physical Exam Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularPhysicalExamSection_validateOcularPhysicalExamSectionCode(OcularPhysicalExamSection ocularPhysicalExamSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ocularPhysicalExamSection.validateOcularPhysicalExamSectionCode(diagnostics, context);
	}

		/**
	 * Validates the validateOcularPhysicalExamSectionRoutineEyeExamSection constraint of '<em>Ocular Physical Exam Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularPhysicalExamSection_validateOcularPhysicalExamSectionRoutineEyeExamSection(OcularPhysicalExamSection ocularPhysicalExamSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ocularPhysicalExamSection.validateOcularPhysicalExamSectionRoutineEyeExamSection(diagnostics, context);
	}

		/**
	 * Validates the validatePhysicalExamSectionTemplateId constraint of '<em>Ocular Physical Exam Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularPhysicalExamSection_validatePhysicalExamSectionTemplateId(OcularPhysicalExamSection ocularPhysicalExamSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ocularPhysicalExamSection.validatePhysicalExamSectionTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEyeEvaluation(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generalEyeEvaluation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEyeEvaluation_validateGeneralEyeEvaluationTemplateId(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEyeEvaluation_validateGeneralEyeEvaluationCode(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEyeEvaluation_validateGeneralEyeEvaluationChiefComplaintSection(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEyeEvaluation_validateGeneralEyeEvaluationOcularHistorySection(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEyeEvaluation_validateGeneralEyeEvaluationHistoryOfPastIllnessSection(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEyeEvaluation_validateGeneralEyeEvaluationSurgeriesSection(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEyeEvaluation_validateGeneralEyeEvaluationCodedSurgeriesSection(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEyeEvaluation_validateGeneralEyeEvaluationMedicationsSection(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEyeEvaluation_validateGeneralEyeEvaluationOphthalmicMedicationsSection(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEyeEvaluation_validateGeneralEyeEvaluationAllergiesReactionsSection(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEyeEvaluation_validateGeneralEyeEvaluationActiveProblemsSection(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEyeEvaluation_validateGeneralEyeEvaluationFamilyMedicalHistorySection(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEyeEvaluation_validateGeneralEyeEvaluationSocialHistorySection(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEyeEvaluation_validateGeneralEyeEvaluationOcularPhysicalExamSection(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEyeEvaluation_validateGeneralEyeEvaluationAssessmentAndPlanSection(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEyeEvaluation_validateGeneralEyeEvaluationHistoryOfPresentIllness(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEyeEvaluation_validateGeneralEyeEvaluationReviewOfSystemsSection(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEyeEvaluation_validateGeneralEyeEvaluationCodedSocialHistorySection(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEyeEvaluation_validateGeneralEyeEvaluationFunctionalStatusSection(generalEyeEvaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEyeEvaluation_validateGeneralEyeEvaluationCodedFamilyMedicalHistorySection(generalEyeEvaluation, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateGeneralEyeEvaluationTemplateId constraint of '<em>General Eye Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEyeEvaluation_validateGeneralEyeEvaluationTemplateId(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalEyeEvaluation.validateGeneralEyeEvaluationTemplateId(diagnostics, context);
	}

		/**
	 * Validates the validateGeneralEyeEvaluationCode constraint of '<em>General Eye Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEyeEvaluation_validateGeneralEyeEvaluationCode(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalEyeEvaluation.validateGeneralEyeEvaluationCode(diagnostics, context);
	}

		/**
	 * Validates the validateGeneralEyeEvaluationChiefComplaintSection constraint of '<em>General Eye Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEyeEvaluation_validateGeneralEyeEvaluationChiefComplaintSection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalEyeEvaluation.validateGeneralEyeEvaluationChiefComplaintSection(diagnostics, context);
	}

		/**
	 * Validates the validateGeneralEyeEvaluationOcularHistorySection constraint of '<em>General Eye Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEyeEvaluation_validateGeneralEyeEvaluationOcularHistorySection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalEyeEvaluation.validateGeneralEyeEvaluationOcularHistorySection(diagnostics, context);
	}

		/**
	 * Validates the validateGeneralEyeEvaluationHistoryOfPastIllnessSection constraint of '<em>General Eye Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEyeEvaluation_validateGeneralEyeEvaluationHistoryOfPastIllnessSection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalEyeEvaluation.validateGeneralEyeEvaluationHistoryOfPastIllnessSection(diagnostics, context);
	}

		/**
	 * Validates the validateGeneralEyeEvaluationSurgeriesSection constraint of '<em>General Eye Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEyeEvaluation_validateGeneralEyeEvaluationSurgeriesSection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalEyeEvaluation.validateGeneralEyeEvaluationSurgeriesSection(diagnostics, context);
	}

		/**
	 * Validates the validateGeneralEyeEvaluationCodedSurgeriesSection constraint of '<em>General Eye Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEyeEvaluation_validateGeneralEyeEvaluationCodedSurgeriesSection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalEyeEvaluation.validateGeneralEyeEvaluationCodedSurgeriesSection(diagnostics, context);
	}

		/**
	 * Validates the validateGeneralEyeEvaluationMedicationsSection constraint of '<em>General Eye Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEyeEvaluation_validateGeneralEyeEvaluationMedicationsSection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalEyeEvaluation.validateGeneralEyeEvaluationMedicationsSection(diagnostics, context);
	}

		/**
	 * Validates the validateGeneralEyeEvaluationOphthalmicMedicationsSection constraint of '<em>General Eye Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEyeEvaluation_validateGeneralEyeEvaluationOphthalmicMedicationsSection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalEyeEvaluation.validateGeneralEyeEvaluationOphthalmicMedicationsSection(diagnostics, context);
	}

		/**
	 * Validates the validateGeneralEyeEvaluationAllergiesReactionsSection constraint of '<em>General Eye Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEyeEvaluation_validateGeneralEyeEvaluationAllergiesReactionsSection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalEyeEvaluation.validateGeneralEyeEvaluationAllergiesReactionsSection(diagnostics, context);
	}

		/**
	 * Validates the validateGeneralEyeEvaluationActiveProblemsSection constraint of '<em>General Eye Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEyeEvaluation_validateGeneralEyeEvaluationActiveProblemsSection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalEyeEvaluation.validateGeneralEyeEvaluationActiveProblemsSection(diagnostics, context);
	}

		/**
	 * Validates the validateGeneralEyeEvaluationFamilyMedicalHistorySection constraint of '<em>General Eye Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEyeEvaluation_validateGeneralEyeEvaluationFamilyMedicalHistorySection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalEyeEvaluation.validateGeneralEyeEvaluationFamilyMedicalHistorySection(diagnostics, context);
	}

		/**
	 * Validates the validateGeneralEyeEvaluationSocialHistorySection constraint of '<em>General Eye Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEyeEvaluation_validateGeneralEyeEvaluationSocialHistorySection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalEyeEvaluation.validateGeneralEyeEvaluationSocialHistorySection(diagnostics, context);
	}

		/**
	 * Validates the validateGeneralEyeEvaluationOcularPhysicalExamSection constraint of '<em>General Eye Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEyeEvaluation_validateGeneralEyeEvaluationOcularPhysicalExamSection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalEyeEvaluation.validateGeneralEyeEvaluationOcularPhysicalExamSection(diagnostics, context);
	}

		/**
	 * Validates the validateGeneralEyeEvaluationAssessmentAndPlanSection constraint of '<em>General Eye Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEyeEvaluation_validateGeneralEyeEvaluationAssessmentAndPlanSection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalEyeEvaluation.validateGeneralEyeEvaluationAssessmentAndPlanSection(diagnostics, context);
	}

		/**
	 * Validates the validateGeneralEyeEvaluationHistoryOfPresentIllness constraint of '<em>General Eye Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEyeEvaluation_validateGeneralEyeEvaluationHistoryOfPresentIllness(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalEyeEvaluation.validateGeneralEyeEvaluationHistoryOfPresentIllness(diagnostics, context);
	}

		/**
	 * Validates the validateGeneralEyeEvaluationReviewOfSystemsSection constraint of '<em>General Eye Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEyeEvaluation_validateGeneralEyeEvaluationReviewOfSystemsSection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalEyeEvaluation.validateGeneralEyeEvaluationReviewOfSystemsSection(diagnostics, context);
	}

		/**
	 * Validates the validateGeneralEyeEvaluationCodedSocialHistorySection constraint of '<em>General Eye Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEyeEvaluation_validateGeneralEyeEvaluationCodedSocialHistorySection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalEyeEvaluation.validateGeneralEyeEvaluationCodedSocialHistorySection(diagnostics, context);
	}

		/**
	 * Validates the validateGeneralEyeEvaluationFunctionalStatusSection constraint of '<em>General Eye Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEyeEvaluation_validateGeneralEyeEvaluationFunctionalStatusSection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalEyeEvaluation.validateGeneralEyeEvaluationFunctionalStatusSection(diagnostics, context);
	}

		/**
	 * Validates the validateGeneralEyeEvaluationCodedFamilyMedicalHistorySection constraint of '<em>General Eye Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEyeEvaluation_validateGeneralEyeEvaluationCodedFamilyMedicalHistorySection(GeneralEyeEvaluation generalEyeEvaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalEyeEvaluation.validateGeneralEyeEvaluationCodedFamilyMedicalHistorySection(diagnostics, context);
	}

		/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ResourceLocator getResourceLocator()
  {
		return EyePlugin.INSTANCE;
	}

} //EyeValidator
