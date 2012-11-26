/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.*;

import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.QrphPackage
 * @generated
 */
public class QrphValidator extends EObjectValidator
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final QrphValidator INSTANCE = new QrphValidator();

  /**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
  public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.ihe.qrph";

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Early Hearing Care Plan Document Code P' of 'Early Hearing Care Plan Document'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int EARLY_HEARING_CARE_PLAN_DOCUMENT__EARLY_HEARING_CARE_PLAN_DOCUMENT_CODE_P = 1;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Early Hearing Care Plan Document Code' of 'Early Hearing Care Plan Document'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int EARLY_HEARING_CARE_PLAN_DOCUMENT__EARLY_HEARING_CARE_PLAN_DOCUMENT_CODE = 2;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Document Template Id' of 'Early Hearing Care Plan Document'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int EARLY_HEARING_CARE_PLAN_DOCUMENT__MEDICAL_DOCUMENT_TEMPLATE_ID = 3;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Risk Indicators For Hearing Loss Section Template Id' of 'Risk Indicators For Hearing Loss Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TEMPLATE_ID = 4;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coded Results Section Template Id' of 'Hearing Screening Coded Results Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HEARING_SCREENING_CODED_RESULTS_SECTION__CODED_RESULTS_SECTION_TEMPLATE_ID = 5;

  /**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 5;

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
  protected CDTValidator cdtValidator;

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
  public QrphValidator()
  {
		super();
		cdaValidator = CDAValidator.INSTANCE;
		cdtValidator = CDTValidator.INSTANCE;
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
	  return QrphPackage.eINSTANCE;
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
			case QrphPackage.EARLY_HEARING_CARE_PLAN_DOCUMENT:
				return validateEarlyHearingCarePlanDocument((EarlyHearingCarePlanDocument)value, diagnostics, context);
			case QrphPackage.RISK_INDICATORS_FOR_HEARING_LOSS_SECTION:
				return validateRiskIndicatorsForHearingLossSection((RiskIndicatorsForHearingLossSection)value, diagnostics, context);
			case QrphPackage.HEARING_SCREENING_CODED_RESULTS_SECTION:
				return validateHearingScreeningCodedResultsSection((HearingScreeningCodedResultsSection)value, diagnostics, context);
			default:
				return true;
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateEarlyHearingCarePlanDocument(EarlyHearingCarePlanDocument earlyHearingCarePlanDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(earlyHearingCarePlanDocument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsIdRootFormat(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCodeForm(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateEarlyHearingCarePlanDocument_validateMedicalDocumentTemplateId(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateEarlyHearingCarePlanDocument_validateEarlyHearingCarePlanDocumentCodeP(earlyHearingCarePlanDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateEarlyHearingCarePlanDocument_validateEarlyHearingCarePlanDocumentCode(earlyHearingCarePlanDocument, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateEarlyHearingCarePlanDocumentCodeP constraint of '<em>Early Hearing Care Plan Document</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateEarlyHearingCarePlanDocument_validateEarlyHearingCarePlanDocumentCodeP(EarlyHearingCarePlanDocument earlyHearingCarePlanDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return earlyHearingCarePlanDocument.validateEarlyHearingCarePlanDocumentCodeP(diagnostics, context);
	}

  /**
	 * Validates the validateEarlyHearingCarePlanDocumentCode constraint of '<em>Early Hearing Care Plan Document</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateEarlyHearingCarePlanDocument_validateEarlyHearingCarePlanDocumentCode(EarlyHearingCarePlanDocument earlyHearingCarePlanDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return earlyHearingCarePlanDocument.validateEarlyHearingCarePlanDocumentCode(diagnostics, context);
	}

  /**
	 * Validates the validateMedicalDocumentTemplateId constraint of '<em>Early Hearing Care Plan Document</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateEarlyHearingCarePlanDocument_validateMedicalDocumentTemplateId(EarlyHearingCarePlanDocument earlyHearingCarePlanDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return earlyHearingCarePlanDocument.validateMedicalDocumentTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateRiskIndicatorsForHearingLossSection(RiskIndicatorsForHearingLossSection riskIndicatorsForHearingLossSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(riskIndicatorsForHearingLossSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(riskIndicatorsForHearingLossSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(riskIndicatorsForHearingLossSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(riskIndicatorsForHearingLossSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(riskIndicatorsForHearingLossSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(riskIndicatorsForHearingLossSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(riskIndicatorsForHearingLossSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(riskIndicatorsForHearingLossSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(riskIndicatorsForHearingLossSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(riskIndicatorsForHearingLossSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateRiskIndicatorsForHearingLossSection_validateRiskIndicatorsForHearingLossSectionTemplateId(riskIndicatorsForHearingLossSection, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateRiskIndicatorsForHearingLossSectionTemplateId constraint of '<em>Risk Indicators For Hearing Loss Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateRiskIndicatorsForHearingLossSection_validateRiskIndicatorsForHearingLossSectionTemplateId(RiskIndicatorsForHearingLossSection riskIndicatorsForHearingLossSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return riskIndicatorsForHearingLossSection.validateRiskIndicatorsForHearingLossSectionTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningCodedResultsSection(HearingScreeningCodedResultsSection hearingScreeningCodedResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(hearingScreeningCodedResultsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hearingScreeningCodedResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hearingScreeningCodedResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hearingScreeningCodedResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hearingScreeningCodedResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hearingScreeningCodedResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hearingScreeningCodedResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hearingScreeningCodedResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(hearingScreeningCodedResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(hearingScreeningCodedResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHearingScreeningCodedResultsSection_validateCodedResultsSectionTemplateId(hearingScreeningCodedResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateCodedResultsSection_validateCodedResultsSectionCode(hearingScreeningCodedResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateCodedResultsSection_validateCodedResultsSectionProcedureEntry(hearingScreeningCodedResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateCodedResultsSection_validateCodedResultsSectionExternalReference(hearingScreeningCodedResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateCodedResultsSection_validateCodedResultsSectionSimpleObservation(hearingScreeningCodedResultsSection, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateCodedResultsSectionTemplateId constraint of '<em>Hearing Screening Coded Results Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningCodedResultsSection_validateCodedResultsSectionTemplateId(HearingScreeningCodedResultsSection hearingScreeningCodedResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hearingScreeningCodedResultsSection.validateCodedResultsSectionTemplateId(diagnostics, context);
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
		return QrphPlugin.INSTANCE;
	}

} //QrphValidator
