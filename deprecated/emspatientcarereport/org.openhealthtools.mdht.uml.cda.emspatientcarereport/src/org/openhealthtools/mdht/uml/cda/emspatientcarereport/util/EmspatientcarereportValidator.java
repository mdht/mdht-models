/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspatientcarereport.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;

import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;

import org.openhealthtools.mdht.uml.cda.emspatientcarereport.*;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmspatientcarereportPackage
 * @generated
 */
public class EmspatientcarereportValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EmspatientcarereportValidator INSTANCE = new EmspatientcarereportValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.emspatientcarereport";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Emergency Run Report Id' of 'Emergency Run Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EMERGENCY_RUN_REPORT__EMERGENCY_RUN_REPORT_ID = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Emergency Run Report Title' of 'Emergency Run Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EMERGENCY_RUN_REPORT__EMERGENCY_RUN_REPORT_TITLE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Emergency Run Report Type Id' of 'Emergency Run Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EMERGENCY_RUN_REPORT__EMERGENCY_RUN_REPORT_TYPE_ID = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Emergency Run Report Set Id' of 'Emergency Run Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EMERGENCY_RUN_REPORT__EMERGENCY_RUN_REPORT_SET_ID = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Emergency Run Report Version Number' of 'Emergency Run Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EMERGENCY_RUN_REPORT__EMERGENCY_RUN_REPORT_VERSION_NUMBER = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Emergency Run Report Vital Signs Section' of 'Emergency Run Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EMERGENCY_RUN_REPORT__EMERGENCY_RUN_REPORT_VITAL_SIGNS_SECTION = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Emergency Run Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EMERGENCY_RUN_REPORT__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Code' of 'Emergency Run Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EMERGENCY_RUN_REPORT__GENERAL_HEADER_CONSTRAINTS_CODE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Patient Administrative Gender Code' of 'EMS Patient'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EMS_PATIENT__EMS_PATIENT_ADMINISTRATIVE_GENDER_CODE = 9;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 9;

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmspatientcarereportValidator() {
		super();
		cdaValidator = CDAValidator.INSTANCE;
		cdtValidator = CDTValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return EmspatientcarereportPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case EmspatientcarereportPackage.EMS_PATIENT_BODY_TEMPERATURE:
				return validateEMSPatientBodyTemperature((EMSPatientBodyTemperature)value, diagnostics, context);
			case EmspatientcarereportPackage.EMS_PATIENT_HEART_RATE:
				return validateEMSPatientHeartRate((EMSPatientHeartRate)value, diagnostics, context);
			case EmspatientcarereportPackage.EMS_PATIENT_SYSTOLIC_BLOOD_PRESSURE:
				return validateEMSPatientSystolicBloodPressure((EMSPatientSystolicBloodPressure)value, diagnostics, context);
			case EmspatientcarereportPackage.EMS_PATIENT_DIASTOLIC_BLOOD_PRESSURE:
				return validateEMSPatientDiastolicBloodPressure((EMSPatientDiastolicBloodPressure)value, diagnostics, context);
			case EmspatientcarereportPackage.EMS_PATIENT_BLOOD_PRESSURE_ORGANIZER:
				return validateEMSPatientBloodPressureOrganizer((EMSPatientBloodPressureOrganizer)value, diagnostics, context);
			case EmspatientcarereportPackage.EMS_VITAL_SIGNS_ORGANIZER:
				return validateEMSVitalSignsOrganizer((EMSVitalSignsOrganizer)value, diagnostics, context);
			case EmspatientcarereportPackage.EMS_PATIENT_RESPIRATORY_RATE:
				return validateEMSPatientRespiratoryRate((EMSPatientRespiratoryRate)value, diagnostics, context);
			case EmspatientcarereportPackage.EMERGENCY_RUN_REPORT:
				return validateEmergencyRunReport((EmergencyRunReport)value, diagnostics, context);
			case EmspatientcarereportPackage.EMS_PATIENT:
				return validateEMSPatient((EMSPatient)value, diagnostics, context);
			case EmspatientcarereportPackage.EMS_PATIENT_ROLE:
				return validateEMSPatientRole((EMSPatientRole)value, diagnostics, context);
			case EmspatientcarereportPackage.EMS_RECORD_TARGET:
				return validateEMSRecordTarget((EMSRecordTarget)value, diagnostics, context);
			case EmspatientcarereportPackage.EMS_BILLING:
				return validateEMSBilling((EMSBilling)value, diagnostics, context);
			case EmspatientcarereportPackage.EMS_TRANSPORT:
				return validateEMSTransport((EMSTransport)value, diagnostics, context);
			case EmspatientcarereportPackage.EMS_BILLING_ENTRY:
				return validateEMSBillingEntry((EMSBillingEntry)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPatientBodyTemperature(EMSPatientBodyTemperature emsPatientBodyTemperature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emsPatientBodyTemperature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPatientHeartRate(EMSPatientHeartRate emsPatientHeartRate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emsPatientHeartRate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPatientSystolicBloodPressure(EMSPatientSystolicBloodPressure emsPatientSystolicBloodPressure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emsPatientSystolicBloodPressure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPatientDiastolicBloodPressure(EMSPatientDiastolicBloodPressure emsPatientDiastolicBloodPressure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emsPatientDiastolicBloodPressure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPatientBloodPressureOrganizer(EMSPatientBloodPressureOrganizer emsPatientBloodPressureOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emsPatientBloodPressureOrganizer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSVitalSignsOrganizer(EMSVitalSignsOrganizer emsVitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emsVitalSignsOrganizer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPatientRespiratoryRate(EMSPatientRespiratoryRate emsPatientRespiratoryRate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emsPatientRespiratoryRate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmergencyRunReport(EmergencyRunReport emergencyRunReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(emergencyRunReport, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmergencyRunReport_validateGeneralHeaderConstraintsTemplateId(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmergencyRunReport_validateGeneralHeaderConstraintsCode(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmergencyRunReport_validateEmergencyRunReportId(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmergencyRunReport_validateEmergencyRunReportTitle(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmergencyRunReport_validateEmergencyRunReportTypeId(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmergencyRunReport_validateEmergencyRunReportSetId(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmergencyRunReport_validateEmergencyRunReportVersionNumber(emergencyRunReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmergencyRunReport_validateEmergencyRunReportVitalSignsSection(emergencyRunReport, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateEmergencyRunReportId constraint of '<em>Emergency Run Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmergencyRunReport_validateEmergencyRunReportId(EmergencyRunReport emergencyRunReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return emergencyRunReport.validateEmergencyRunReportId(diagnostics, context);
	}

	/**
	 * Validates the validateEmergencyRunReportTitle constraint of '<em>Emergency Run Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmergencyRunReport_validateEmergencyRunReportTitle(EmergencyRunReport emergencyRunReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return emergencyRunReport.validateEmergencyRunReportTitle(diagnostics, context);
	}

	/**
	 * Validates the validateEmergencyRunReportTypeId constraint of '<em>Emergency Run Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmergencyRunReport_validateEmergencyRunReportTypeId(EmergencyRunReport emergencyRunReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return emergencyRunReport.validateEmergencyRunReportTypeId(diagnostics, context);
	}

	/**
	 * Validates the validateEmergencyRunReportSetId constraint of '<em>Emergency Run Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmergencyRunReport_validateEmergencyRunReportSetId(EmergencyRunReport emergencyRunReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return emergencyRunReport.validateEmergencyRunReportSetId(diagnostics, context);
	}

	/**
	 * Validates the validateEmergencyRunReportVersionNumber constraint of '<em>Emergency Run Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmergencyRunReport_validateEmergencyRunReportVersionNumber(EmergencyRunReport emergencyRunReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return emergencyRunReport.validateEmergencyRunReportVersionNumber(diagnostics, context);
	}

	/**
	 * Validates the validateEmergencyRunReportVitalSignsSection constraint of '<em>Emergency Run Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmergencyRunReport_validateEmergencyRunReportVitalSignsSection(EmergencyRunReport emergencyRunReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return emergencyRunReport.validateEmergencyRunReportVitalSignsSection(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Emergency Run Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmergencyRunReport_validateGeneralHeaderConstraintsTemplateId(EmergencyRunReport emergencyRunReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return emergencyRunReport.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsCode constraint of '<em>Emergency Run Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmergencyRunReport_validateGeneralHeaderConstraintsCode(EmergencyRunReport emergencyRunReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return emergencyRunReport.validateGeneralHeaderConstraintsCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPatient(EMSPatient emsPatient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(emsPatient, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(emsPatient, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsPatient, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsPatient, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(emsPatient, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsPatient, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(emsPatient, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsPatient, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsPatient, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validatePatient_validateClassCode(emsPatient, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validatePatient_validateDeterminerCode(emsPatient, diagnostics, context);
		if (result || diagnostics != null) result &= validateEMSPatient_validateEMSPatientAdministrativeGenderCode(emsPatient, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateEMSPatientAdministrativeGenderCode constraint of '<em>EMS Patient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPatient_validateEMSPatientAdministrativeGenderCode(EMSPatient emsPatient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return emsPatient.validateEMSPatientAdministrativeGenderCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPatientRole(EMSPatientRole emsPatientRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emsPatientRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSRecordTarget(EMSRecordTarget emsRecordTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(emsRecordTarget, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(emsRecordTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsRecordTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsRecordTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(emsRecordTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsRecordTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(emsRecordTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsRecordTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsRecordTarget, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateRecordTarget_validateTypeCode(emsRecordTarget, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateRecordTarget_validateContextControlCode(emsRecordTarget, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSBilling(EMSBilling emsBilling, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(emsBilling, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(emsBilling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsBilling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsBilling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(emsBilling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsBilling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(emsBilling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsBilling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsBilling, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsBilling, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsBilling, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSTransport(EMSTransport emsTransport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(emsTransport, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(emsTransport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsTransport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsTransport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(emsTransport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsTransport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(emsTransport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsTransport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsTransport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsTransport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsTransport, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSBillingEntry(EMSBillingEntry emsBillingEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(emsBillingEntry, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(emsBillingEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsBillingEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsBillingEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(emsBillingEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsBillingEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(emsBillingEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsBillingEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsBillingEntry, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateEntry_validateClinicalStatement(emsBillingEntry, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateEntry_validateContextConductionInd(emsBillingEntry, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //EmspatientcarereportValidator
