/**
 * Copyright (C) 2009, OFFIS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * This software and supporting documentation were developed by
 * 
 *   OFFIS e.V.
 *   Escherweg 2, 26121 Oldenburg
 *  
 * THIS SOFTWARE IS MADE AVAILABLE,  AS IS,  AND OFFIS 
 * MAKES NO  WARRANTY REGARDING  THE  SOFTWARE,  ITS  PERFORMANCE,  ITS  
 * MERCHANTABILITY  OR FITNESS FOR ANY PARTICULAR USE, FREEDOM FROM ANY 
 * COMPUTER DISEASES  OR ITS CONFORMITY TO ANY SPECIFICATION. THE ENTIRE RISK 
 * AS TO QUALITY AND PERFORMANCE OF THE SOFTWARE IS WITH THE USER.
 *  
 * Author:  "Myriam Lipprandt <myriam.lipprandt@offis.de>", OFFIS e.V.
 * Date: 2011-12-14
 * 
 */
package org.openhealthtools.mdht.uml.cda.phmr.util;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Device;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.ObservationMedia;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.Section;

import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProductInstance;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeSection;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection;

import org.openhealthtools.mdht.uml.cda.phmr.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.Entity;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.hl7.rim.Participation;
import org.openhealthtools.mdht.uml.hl7.rim.Role;

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
 * @see org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage
 * @generated
 */
public class PhmrSwitch<T> extends Switch<T> {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static PhmrPackage modelPackage;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PhmrSwitch() {
    if (modelPackage == null)
    {
      modelPackage = PhmrPackage.eINSTANCE;
    }
  }

	/**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	@Override
  protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID)
    {
      case PhmrPackage.DEVICE_ACCURACY_OBSERVATION:
      {
        DeviceAccuracyObservation deviceAccuracyObservation = (DeviceAccuracyObservation)theEObject;
        T result = caseDeviceAccuracyObservation(deviceAccuracyObservation);
        if (result == null) result = caseObservation(deviceAccuracyObservation);
        if (result == null) result = caseClinicalStatement(deviceAccuracyObservation);
        if (result == null) result = caseAct(deviceAccuracyObservation);
        if (result == null) result = caseInfrastructureRoot(deviceAccuracyObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.DEVICE_DEFINITION_ORGANIZER:
      {
        DeviceDefinitionOrganizer deviceDefinitionOrganizer = (DeviceDefinitionOrganizer)theEObject;
        T result = caseDeviceDefinitionOrganizer(deviceDefinitionOrganizer);
        if (result == null) result = caseOrganizer(deviceDefinitionOrganizer);
        if (result == null) result = caseClinicalStatement(deviceDefinitionOrganizer);
        if (result == null) result = caseAct(deviceDefinitionOrganizer);
        if (result == null) result = caseInfrastructureRoot(deviceDefinitionOrganizer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.SAMPLING_FREQUENCY_OBSERVATION:
      {
        SamplingFrequencyObservation samplingFrequencyObservation = (SamplingFrequencyObservation)theEObject;
        T result = caseSamplingFrequencyObservation(samplingFrequencyObservation);
        if (result == null) result = caseObservation(samplingFrequencyObservation);
        if (result == null) result = caseClinicalStatement(samplingFrequencyObservation);
        if (result == null) result = caseAct(samplingFrequencyObservation);
        if (result == null) result = caseInfrastructureRoot(samplingFrequencyObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.DEVICE_MEASUREMENT_RANGE_OBSERVATION:
      {
        DeviceMeasurementRangeObservation deviceMeasurementRangeObservation = (DeviceMeasurementRangeObservation)theEObject;
        T result = caseDeviceMeasurementRangeObservation(deviceMeasurementRangeObservation);
        if (result == null) result = caseObservation(deviceMeasurementRangeObservation);
        if (result == null) result = caseClinicalStatement(deviceMeasurementRangeObservation);
        if (result == null) result = caseAct(deviceMeasurementRangeObservation);
        if (result == null) result = caseInfrastructureRoot(deviceMeasurementRangeObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.DEVICE_RESOLUTION_OBSERVATION:
      {
        DeviceResolutionObservation deviceResolutionObservation = (DeviceResolutionObservation)theEObject;
        T result = caseDeviceResolutionObservation(deviceResolutionObservation);
        if (result == null) result = caseObservation(deviceResolutionObservation);
        if (result == null) result = caseClinicalStatement(deviceResolutionObservation);
        if (result == null) result = caseAct(deviceResolutionObservation);
        if (result == null) result = caseInfrastructureRoot(deviceResolutionObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.EVENT_OBSERVATION:
      {
        EventObservation eventObservation = (EventObservation)theEObject;
        T result = caseEventObservation(eventObservation);
        if (result == null) result = caseObservation(eventObservation);
        if (result == null) result = caseClinicalStatement(eventObservation);
        if (result == null) result = caseAct(eventObservation);
        if (result == null) result = caseInfrastructureRoot(eventObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.MEDICAL_EQUIPMENT:
      {
        MedicalEquipment medicalEquipment = (MedicalEquipment)theEObject;
        T result = caseMedicalEquipment(medicalEquipment);
        if (result == null) result = caseMedicalEquipmentSection(medicalEquipment);
        if (result == null) result = caseSection(medicalEquipment);
        if (result == null) result = caseAct(medicalEquipment);
        if (result == null) result = caseInfrastructureRoot(medicalEquipment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.NUMERIC_OBSERVATION:
      {
        NumericObservation numericObservation = (NumericObservation)theEObject;
        T result = caseNumericObservation(numericObservation);
        if (result == null) result = caseResultObservation(numericObservation);
        if (result == null) result = caseObservation(numericObservation);
        if (result == null) result = caseClinicalStatement(numericObservation);
        if (result == null) result = caseAct(numericObservation);
        if (result == null) result = caseInfrastructureRoot(numericObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.OBSERVATION_MEDIA_JPG:
      {
        ObservationMediaJPG observationMediaJPG = (ObservationMediaJPG)theEObject;
        T result = caseObservationMediaJPG(observationMediaJPG);
        if (result == null) result = caseObservationMedia(observationMediaJPG);
        if (result == null) result = caseClinicalStatement(observationMediaJPG);
        if (result == null) result = caseAct(observationMediaJPG);
        if (result == null) result = caseInfrastructureRoot(observationMediaJPG);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.OBSERVATION_NULL_FLAVOR:
      {
        ObservationNullFlavor observationNullFlavor = (ObservationNullFlavor)theEObject;
        T result = caseObservationNullFlavor(observationNullFlavor);
        if (result == null) result = caseObservation(observationNullFlavor);
        if (result == null) result = caseClinicalStatement(observationNullFlavor);
        if (result == null) result = caseAct(observationNullFlavor);
        if (result == null) result = caseInfrastructureRoot(observationNullFlavor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.WAVEFORM_OBSERVATION:
      {
        WaveformObservation waveformObservation = (WaveformObservation)theEObject;
        T result = caseWaveformObservation(waveformObservation);
        if (result == null) result = caseObservation(waveformObservation);
        if (result == null) result = caseClinicalStatement(waveformObservation);
        if (result == null) result = caseAct(waveformObservation);
        if (result == null) result = caseInfrastructureRoot(waveformObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.WAVEFORM_SAMPLE_PERIOD_OBSERVATION:
      {
        WaveformSamplePeriodObservation waveformSamplePeriodObservation = (WaveformSamplePeriodObservation)theEObject;
        T result = caseWaveformSamplePeriodObservation(waveformSamplePeriodObservation);
        if (result == null) result = caseObservation(waveformSamplePeriodObservation);
        if (result == null) result = caseClinicalStatement(waveformSamplePeriodObservation);
        if (result == null) result = caseAct(waveformSamplePeriodObservation);
        if (result == null) result = caseInfrastructureRoot(waveformSamplePeriodObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.PARTICIPANT:
      {
        Participant participant = (Participant)theEObject;
        T result = caseParticipant(participant);
        if (result == null) result = caseParticipant2(participant);
        if (result == null) result = caseParticipation(participant);
        if (result == null) result = caseInfrastructureRoot(participant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.PERSONAL_HEALTHCARE_MONITORING_REPORT:
      {
        PersonalHealthcareMonitoringReport personalHealthcareMonitoringReport = (PersonalHealthcareMonitoringReport)theEObject;
        T result = casePersonalHealthcareMonitoringReport(personalHealthcareMonitoringReport);
        if (result == null) result = caseGeneralHeaderConstraints(personalHealthcareMonitoringReport);
        if (result == null) result = caseClinicalDocument(personalHealthcareMonitoringReport);
        if (result == null) result = caseAct(personalHealthcareMonitoringReport);
        if (result == null) result = caseInfrastructureRoot(personalHealthcareMonitoringReport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.GENERAL_HEADER_CONSTRAINTS:
      {
        GeneralHeaderConstraints generalHeaderConstraints = (GeneralHeaderConstraints)theEObject;
        T result = caseGeneralHeaderConstraints(generalHeaderConstraints);
        if (result == null) result = caseClinicalDocument(generalHeaderConstraints);
        if (result == null) result = caseAct(generalHeaderConstraints);
        if (result == null) result = caseInfrastructureRoot(generalHeaderConstraints);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.VITAL_SIGNS:
      {
        VitalSigns vitalSigns = (VitalSigns)theEObject;
        T result = caseVitalSigns(vitalSigns);
        if (result == null) result = caseVitalSignsSection(vitalSigns);
        if (result == null) result = caseSection(vitalSigns);
        if (result == null) result = caseAct(vitalSigns);
        if (result == null) result = caseInfrastructureRoot(vitalSigns);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.RESULT_ORGANIZER:
      {
        ResultOrganizer resultOrganizer = (ResultOrganizer)theEObject;
        T result = caseResultOrganizer(resultOrganizer);
        if (result == null) result = caseCCD_ResultOrganizer(resultOrganizer);
        if (result == null) result = caseOrganizer(resultOrganizer);
        if (result == null) result = caseClinicalStatement(resultOrganizer);
        if (result == null) result = caseAct(resultOrganizer);
        if (result == null) result = caseInfrastructureRoot(resultOrganizer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.WAVEFORM_SERIES_OBSERVATION:
      {
        WaveformSeriesObservation waveformSeriesObservation = (WaveformSeriesObservation)theEObject;
        T result = caseWaveformSeriesObservation(waveformSeriesObservation);
        if (result == null) result = caseObservation(waveformSeriesObservation);
        if (result == null) result = caseClinicalStatement(waveformSeriesObservation);
        if (result == null) result = caseAct(waveformSeriesObservation);
        if (result == null) result = caseInfrastructureRoot(waveformSeriesObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.RESULTS:
      {
        Results results = (Results)theEObject;
        T result = caseResults(results);
        if (result == null) result = caseResultsSection(results);
        if (result == null) result = caseSection(results);
        if (result == null) result = caseAct(results);
        if (result == null) result = caseInfrastructureRoot(results);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.PARTICIPANT_ROLE:
      {
        ParticipantRole participantRole = (ParticipantRole)theEObject;
        T result = caseParticipantRole(participantRole);
        if (result == null) result = caseCDA_ParticipantRole(participantRole);
        if (result == null) result = caseRole(participantRole);
        if (result == null) result = caseInfrastructureRoot(participantRole);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.PHMR_PRODUCT_INSTANCE:
      {
        PHMRProductInstance phmrProductInstance = (PHMRProductInstance)theEObject;
        T result = casePHMRProductInstance(phmrProductInstance);
        if (result == null) result = caseProductInstance(phmrProductInstance);
        if (result == null) result = caseCDA_ParticipantRole(phmrProductInstance);
        if (result == null) result = caseRole(phmrProductInstance);
        if (result == null) result = caseInfrastructureRoot(phmrProductInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.PHMR_PRODUCT_INSTANCE_REFERENCE:
      {
        PHMRProductInstanceReference phmrProductInstanceReference = (PHMRProductInstanceReference)theEObject;
        T result = casePHMRProductInstanceReference(phmrProductInstanceReference);
        if (result == null) result = caseParticipant2(phmrProductInstanceReference);
        if (result == null) result = caseParticipation(phmrProductInstanceReference);
        if (result == null) result = caseInfrastructureRoot(phmrProductInstanceReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.PLAYING_DEVICE:
      {
        PlayingDevice playingDevice = (PlayingDevice)theEObject;
        T result = casePlayingDevice(playingDevice);
        if (result == null) result = caseDevice(playingDevice);
        if (result == null) result = caseEntity(playingDevice);
        if (result == null) result = caseInfrastructureRoot(playingDevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.SCOPING_ENTITY:
      {
        ScopingEntity scopingEntity = (ScopingEntity)theEObject;
        T result = caseScopingEntity(scopingEntity);
        if (result == null) result = caseCDA_Entity(scopingEntity);
        if (result == null) result = caseEntity(scopingEntity);
        if (result == null) result = caseInfrastructureRoot(scopingEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.VITAL_SIGNS_ORGANIZER:
      {
        VitalSignsOrganizer vitalSignsOrganizer = (VitalSignsOrganizer)theEObject;
        T result = caseVitalSignsOrganizer(vitalSignsOrganizer);
        if (result == null) result = caseResultOrganizer(vitalSignsOrganizer);
        if (result == null) result = caseCCD_ResultOrganizer(vitalSignsOrganizer);
        if (result == null) result = caseOrganizer(vitalSignsOrganizer);
        if (result == null) result = caseClinicalStatement(vitalSignsOrganizer);
        if (result == null) result = caseAct(vitalSignsOrganizer);
        if (result == null) result = caseInfrastructureRoot(vitalSignsOrganizer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.PURPOSE:
      {
        Purpose purpose = (Purpose)theEObject;
        T result = casePurpose(purpose);
        if (result == null) result = casePurposeSection(purpose);
        if (result == null) result = caseSection(purpose);
        if (result == null) result = caseAct(purpose);
        if (result == null) result = caseInfrastructureRoot(purpose);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.MEDICATION:
      {
        Medication medication = (Medication)theEObject;
        T result = caseMedication(medication);
        if (result == null) result = caseMedicationsSection(medication);
        if (result == null) result = caseSection(medication);
        if (result == null) result = caseAct(medication);
        if (result == null) result = caseInfrastructureRoot(medication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhmrPackage.FUNCTIONAL_STATUS:
      {
        FunctionalStatus functionalStatus = (FunctionalStatus)theEObject;
        T result = caseFunctionalStatus(functionalStatus);
        if (result == null) result = caseFunctionalStatusSection(functionalStatus);
        if (result == null) result = caseSection(functionalStatus);
        if (result == null) result = caseAct(functionalStatus);
        if (result == null) result = caseInfrastructureRoot(functionalStatus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Device Accuracy Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Device Accuracy Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDeviceAccuracyObservation(DeviceAccuracyObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Device Definition Organizer</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Device Definition Organizer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDeviceDefinitionOrganizer(DeviceDefinitionOrganizer object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Sampling Frequency Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sampling Frequency Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSamplingFrequencyObservation(SamplingFrequencyObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Device Measurement Range Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Device Measurement Range Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDeviceMeasurementRangeObservation(DeviceMeasurementRangeObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Device Resolution Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Device Resolution Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDeviceResolutionObservation(DeviceResolutionObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Event Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseEventObservation(EventObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Medical Equipment</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Medical Equipment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMedicalEquipment(MedicalEquipment object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Numeric Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNumericObservation(NumericObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Observation Media JPG</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Observation Media JPG</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseObservationMediaJPG(ObservationMediaJPG object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Observation Null Flavor</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Observation Null Flavor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseObservationNullFlavor(ObservationNullFlavor object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Waveform Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Waveform Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseWaveformObservation(WaveformObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Waveform Sample Period Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Waveform Sample Period Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseWaveformSamplePeriodObservation(WaveformSamplePeriodObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Participant</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Participant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseParticipant(Participant object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Personal Healthcare Monitoring Report</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Personal Healthcare Monitoring Report</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePersonalHealthcareMonitoringReport(PersonalHealthcareMonitoringReport object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Vital Signs</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vital Signs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseVitalSigns(VitalSigns object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Result Organizer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseResultOrganizer(ResultOrganizer object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Waveform Series Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Waveform Series Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseWaveformSeriesObservation(WaveformSeriesObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Results</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Results</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseResults(Results object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Participant Role</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Participant Role</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseParticipantRole(ParticipantRole object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>PHMR Product Instance</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PHMR Product Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePHMRProductInstance(PHMRProductInstance object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>PHMR Product Instance Reference</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PHMR Product Instance Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePHMRProductInstanceReference(PHMRProductInstanceReference object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Playing Device</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Playing Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePlayingDevice(PlayingDevice object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Scoping Entity</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scoping Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseScopingEntity(ScopingEntity object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Vital Signs Organizer</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vital Signs Organizer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseVitalSignsOrganizer(VitalSignsOrganizer object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Purpose</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Purpose</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePurpose(Purpose object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Medication</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Medication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMedication(Medication object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Functional Status</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Functional Status</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFunctionalStatus(FunctionalStatus object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseClinicalStatement(ClinicalStatement object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseObservation(Observation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Organizer</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Organizer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseOrganizer(Organizer object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Medical Equipment Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Medical Equipment Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMedicalEquipmentSection(MedicalEquipmentSection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Result Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Result Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseResultObservation(ResultObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Observation Media</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Observation Media</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseObservationMedia(ObservationMedia object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Participant2</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Participant2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseParticipant2(Participant2 object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Vital Signs Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vital Signs Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseVitalSignsSection(VitalSignsSection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Result Organizer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCCD_ResultOrganizer(org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Results Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Results Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseResultsSection(ResultsSection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRole(Role object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Participant Role</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Participant Role</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCDA_ParticipantRole(org.openhealthtools.mdht.uml.cda.ParticipantRole object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Product Instance</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Product Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseProductInstance(ProductInstance object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDevice(Device object) {
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
	public T caseCDA_Entity(org.openhealthtools.mdht.uml.cda.Entity object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Purpose Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Purpose Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePurposeSection(PurposeSection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Medications Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Medications Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMedicationsSection(MedicationsSection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Functional Status Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Functional Status Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFunctionalStatusSection(FunctionalStatusSection object) {
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
	@Override
  public T defaultCase(EObject object) {
    return null;
  }

} //PhmrSwitch
