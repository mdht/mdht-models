/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspatientcarereport.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.emspatientcarereport.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmspatientcarereportFactoryImpl extends EFactoryImpl implements EmspatientcarereportFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EmspatientcarereportFactory init() {
		try {
			EmspatientcarereportFactory theEmspatientcarereportFactory = (EmspatientcarereportFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/emspatientcarereport"); 
			if (theEmspatientcarereportFactory != null) {
				return theEmspatientcarereportFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EmspatientcarereportFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmspatientcarereportFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EmspatientcarereportPackage.EMS_PATIENT_BODY_TEMPERATURE: return createEMSPatientBodyTemperature();
			case EmspatientcarereportPackage.EMS_PATIENT_HEART_RATE: return createEMSPatientHeartRate();
			case EmspatientcarereportPackage.EMS_PATIENT_SYSTOLIC_BLOOD_PRESSURE: return createEMSPatientSystolicBloodPressure();
			case EmspatientcarereportPackage.EMS_PATIENT_DIASTOLIC_BLOOD_PRESSURE: return createEMSPatientDiastolicBloodPressure();
			case EmspatientcarereportPackage.EMS_PATIENT_BLOOD_PRESSURE_ORGANIZER: return createEMSPatientBloodPressureOrganizer();
			case EmspatientcarereportPackage.EMS_VITAL_SIGNS_ORGANIZER: return createEMSVitalSignsOrganizer();
			case EmspatientcarereportPackage.EMS_PATIENT_RESPIRATORY_RATE: return createEMSPatientRespiratoryRate();
			case EmspatientcarereportPackage.EMERGENCY_RUN_REPORT: return createEmergencyRunReport();
			case EmspatientcarereportPackage.EMS_PATIENT: return createEMSPatient();
			case EmspatientcarereportPackage.EMS_PATIENT_ROLE: return createEMSPatientRole();
			case EmspatientcarereportPackage.EMS_RECORD_TARGET: return createEMSRecordTarget();
			case EmspatientcarereportPackage.EMS_BILLING: return createEMSBilling();
			case EmspatientcarereportPackage.EMS_TRANSPORT: return createEMSTransport();
			case EmspatientcarereportPackage.EMS_BILLING_ENTRY: return createEMSBillingEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPatientBodyTemperature createEMSPatientBodyTemperature() {
		EMSPatientBodyTemperatureImpl emsPatientBodyTemperature = new EMSPatientBodyTemperatureImpl();
		return emsPatientBodyTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPatientHeartRate createEMSPatientHeartRate() {
		EMSPatientHeartRateImpl emsPatientHeartRate = new EMSPatientHeartRateImpl();
		return emsPatientHeartRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPatientSystolicBloodPressure createEMSPatientSystolicBloodPressure() {
		EMSPatientSystolicBloodPressureImpl emsPatientSystolicBloodPressure = new EMSPatientSystolicBloodPressureImpl();
		return emsPatientSystolicBloodPressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPatientDiastolicBloodPressure createEMSPatientDiastolicBloodPressure() {
		EMSPatientDiastolicBloodPressureImpl emsPatientDiastolicBloodPressure = new EMSPatientDiastolicBloodPressureImpl();
		return emsPatientDiastolicBloodPressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPatientBloodPressureOrganizer createEMSPatientBloodPressureOrganizer() {
		EMSPatientBloodPressureOrganizerImpl emsPatientBloodPressureOrganizer = new EMSPatientBloodPressureOrganizerImpl();
		return emsPatientBloodPressureOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSVitalSignsOrganizer createEMSVitalSignsOrganizer() {
		EMSVitalSignsOrganizerImpl emsVitalSignsOrganizer = new EMSVitalSignsOrganizerImpl();
		return emsVitalSignsOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPatientRespiratoryRate createEMSPatientRespiratoryRate() {
		EMSPatientRespiratoryRateImpl emsPatientRespiratoryRate = new EMSPatientRespiratoryRateImpl();
		return emsPatientRespiratoryRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmergencyRunReport createEmergencyRunReport() {
		EmergencyRunReportImpl emergencyRunReport = new EmergencyRunReportImpl();
		return emergencyRunReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPatient createEMSPatient() {
		EMSPatientImpl emsPatient = new EMSPatientImpl();
		return emsPatient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPatientRole createEMSPatientRole() {
		EMSPatientRoleImpl emsPatientRole = new EMSPatientRoleImpl();
		return emsPatientRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSRecordTarget createEMSRecordTarget() {
		EMSRecordTargetImpl emsRecordTarget = new EMSRecordTargetImpl();
		return emsRecordTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSBilling createEMSBilling() {
		EMSBillingImpl emsBilling = new EMSBillingImpl();
		return emsBilling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSTransport createEMSTransport() {
		EMSTransportImpl emsTransport = new EMSTransportImpl();
		return emsTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSBillingEntry createEMSBillingEntry() {
		EMSBillingEntryImpl emsBillingEntry = new EMSBillingEntryImpl();
		return emsBillingEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmspatientcarereportPackage getEmspatientcarereportPackage() {
		return (EmspatientcarereportPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EmspatientcarereportPackage getPackage() {
		return EmspatientcarereportPackage.eINSTANCE;
	}

} //EmspatientcarereportFactoryImpl
