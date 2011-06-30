/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspatientcarereport.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.Section;

import org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument;

import org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints;

import org.openhealthtools.mdht.uml.cda.emspatientcarereport.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.ActRelationship;
import org.openhealthtools.mdht.uml.hl7.rim.Entity;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.hl7.rim.Participation;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmspatientcarereportPackage
 * @generated
 */
public class EmspatientcarereportSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EmspatientcarereportPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmspatientcarereportSwitch() {
		if (modelPackage == null) {
			modelPackage = EmspatientcarereportPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EmspatientcarereportPackage.EMS_PATIENT_BODY_TEMPERATURE: {
				EMSPatientBodyTemperature emsPatientBodyTemperature = (EMSPatientBodyTemperature)theEObject;
				T result = caseEMSPatientBodyTemperature(emsPatientBodyTemperature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspatientcarereportPackage.EMS_PATIENT_HEART_RATE: {
				EMSPatientHeartRate emsPatientHeartRate = (EMSPatientHeartRate)theEObject;
				T result = caseEMSPatientHeartRate(emsPatientHeartRate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspatientcarereportPackage.EMS_PATIENT_SYSTOLIC_BLOOD_PRESSURE: {
				EMSPatientSystolicBloodPressure emsPatientSystolicBloodPressure = (EMSPatientSystolicBloodPressure)theEObject;
				T result = caseEMSPatientSystolicBloodPressure(emsPatientSystolicBloodPressure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspatientcarereportPackage.EMS_PATIENT_DIASTOLIC_BLOOD_PRESSURE: {
				EMSPatientDiastolicBloodPressure emsPatientDiastolicBloodPressure = (EMSPatientDiastolicBloodPressure)theEObject;
				T result = caseEMSPatientDiastolicBloodPressure(emsPatientDiastolicBloodPressure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspatientcarereportPackage.EMS_PATIENT_BLOOD_PRESSURE_ORGANIZER: {
				EMSPatientBloodPressureOrganizer emsPatientBloodPressureOrganizer = (EMSPatientBloodPressureOrganizer)theEObject;
				T result = caseEMSPatientBloodPressureOrganizer(emsPatientBloodPressureOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspatientcarereportPackage.EMS_VITAL_SIGNS_ORGANIZER: {
				EMSVitalSignsOrganizer emsVitalSignsOrganizer = (EMSVitalSignsOrganizer)theEObject;
				T result = caseEMSVitalSignsOrganizer(emsVitalSignsOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspatientcarereportPackage.EMS_PATIENT_RESPIRATORY_RATE: {
				EMSPatientRespiratoryRate emsPatientRespiratoryRate = (EMSPatientRespiratoryRate)theEObject;
				T result = caseEMSPatientRespiratoryRate(emsPatientRespiratoryRate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspatientcarereportPackage.EMERGENCY_RUN_REPORT: {
				EmergencyRunReport emergencyRunReport = (EmergencyRunReport)theEObject;
				T result = caseEmergencyRunReport(emergencyRunReport);
				if (result == null) result = caseGeneralHeaderConstraints(emergencyRunReport);
				if (result == null) result = caseClinicalDocument(emergencyRunReport);
				if (result == null) result = caseAct(emergencyRunReport);
				if (result == null) result = caseInfrastructureRoot(emergencyRunReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspatientcarereportPackage.EMS_PATIENT: {
				EMSPatient emsPatient = (EMSPatient)theEObject;
				T result = caseEMSPatient(emsPatient);
				if (result == null) result = casePatient(emsPatient);
				if (result == null) result = caseEntity(emsPatient);
				if (result == null) result = caseInfrastructureRoot(emsPatient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspatientcarereportPackage.EMS_PATIENT_ROLE: {
				EMSPatientRole emsPatientRole = (EMSPatientRole)theEObject;
				T result = caseEMSPatientRole(emsPatientRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspatientcarereportPackage.EMS_RECORD_TARGET: {
				EMSRecordTarget emsRecordTarget = (EMSRecordTarget)theEObject;
				T result = caseEMSRecordTarget(emsRecordTarget);
				if (result == null) result = caseRecordTarget(emsRecordTarget);
				if (result == null) result = caseParticipation(emsRecordTarget);
				if (result == null) result = caseInfrastructureRoot(emsRecordTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspatientcarereportPackage.EMS_BILLING: {
				EMSBilling emsBilling = (EMSBilling)theEObject;
				T result = caseEMSBilling(emsBilling);
				if (result == null) result = caseSection(emsBilling);
				if (result == null) result = caseAct(emsBilling);
				if (result == null) result = caseInfrastructureRoot(emsBilling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspatientcarereportPackage.EMS_TRANSPORT: {
				EMSTransport emsTransport = (EMSTransport)theEObject;
				T result = caseEMSTransport(emsTransport);
				if (result == null) result = caseSection(emsTransport);
				if (result == null) result = caseAct(emsTransport);
				if (result == null) result = caseInfrastructureRoot(emsTransport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspatientcarereportPackage.EMS_BILLING_ENTRY: {
				EMSBillingEntry emsBillingEntry = (EMSBillingEntry)theEObject;
				T result = caseEMSBillingEntry(emsBillingEntry);
				if (result == null) result = caseEntry(emsBillingEntry);
				if (result == null) result = caseActRelationship(emsBillingEntry);
				if (result == null) result = caseInfrastructureRoot(emsBillingEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Patient Body Temperature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Patient Body Temperature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMSPatientBodyTemperature(EMSPatientBodyTemperature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Patient Heart Rate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Patient Heart Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMSPatientHeartRate(EMSPatientHeartRate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Patient Systolic Blood Pressure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Patient Systolic Blood Pressure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMSPatientSystolicBloodPressure(EMSPatientSystolicBloodPressure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Patient Diastolic Blood Pressure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Patient Diastolic Blood Pressure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMSPatientDiastolicBloodPressure(EMSPatientDiastolicBloodPressure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Patient Blood Pressure Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Patient Blood Pressure Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMSPatientBloodPressureOrganizer(EMSPatientBloodPressureOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Vital Signs Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMSVitalSignsOrganizer(EMSVitalSignsOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Patient Respiratory Rate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Patient Respiratory Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMSPatientRespiratoryRate(EMSPatientRespiratoryRate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emergency Run Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emergency Run Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmergencyRunReport(EmergencyRunReport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Patient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Patient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMSPatient(EMSPatient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Patient Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Patient Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMSPatientRole(EMSPatientRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Record Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Record Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMSRecordTarget(EMSRecordTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Billing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Billing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMSBilling(EMSBilling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Transport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Transport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMSTransport(EMSTransport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Billing Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Billing Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMSBillingEntry(EMSBillingEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureRoot(InfrastructureRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAct(Act object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalDocument(ClinicalDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints(GeneralHeaderConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatient(Patient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipation(Participation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordTarget(RecordTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Act Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActRelationship(ActRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntry(Entry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //EmspatientcarereportSwitch
