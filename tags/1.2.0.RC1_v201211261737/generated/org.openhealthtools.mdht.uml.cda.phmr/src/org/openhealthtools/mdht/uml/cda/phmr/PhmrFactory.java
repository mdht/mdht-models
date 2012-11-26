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
package org.openhealthtools.mdht.uml.cda.phmr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage
 * @generated
 */
public interface PhmrFactory extends EFactory {
	/**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	PhmrFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.phmr.impl.PhmrFactoryImpl.init();

	/**
   * Returns a new object of class '<em>Device Accuracy Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Device Accuracy Observation</em>'.
   * @generated
   */
	DeviceAccuracyObservation createDeviceAccuracyObservation();

	/**
   * Returns a new object of class '<em>Device Definition Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Device Definition Organizer</em>'.
   * @generated
   */
	DeviceDefinitionOrganizer createDeviceDefinitionOrganizer();

	/**
   * Returns a new object of class '<em>Sampling Frequency Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Sampling Frequency Observation</em>'.
   * @generated
   */
	SamplingFrequencyObservation createSamplingFrequencyObservation();

	/**
   * Returns a new object of class '<em>Device Measurement Range Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Device Measurement Range Observation</em>'.
   * @generated
   */
	DeviceMeasurementRangeObservation createDeviceMeasurementRangeObservation();

	/**
   * Returns a new object of class '<em>Device Resolution Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Device Resolution Observation</em>'.
   * @generated
   */
	DeviceResolutionObservation createDeviceResolutionObservation();

	/**
   * Returns a new object of class '<em>Event Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Observation</em>'.
   * @generated
   */
	EventObservation createEventObservation();

	/**
   * Returns a new object of class '<em>Medical Equipment</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Medical Equipment</em>'.
   * @generated
   */
	MedicalEquipment createMedicalEquipment();

	/**
   * Returns a new object of class '<em>Numeric Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Numeric Observation</em>'.
   * @generated
   */
	NumericObservation createNumericObservation();

	/**
   * Returns a new object of class '<em>Observation Media JPG</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Observation Media JPG</em>'.
   * @generated
   */
	ObservationMediaJPG createObservationMediaJPG();

	/**
   * Returns a new object of class '<em>Observation Null Flavor</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Observation Null Flavor</em>'.
   * @generated
   */
	ObservationNullFlavor createObservationNullFlavor();

	/**
   * Returns a new object of class '<em>Waveform Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Waveform Observation</em>'.
   * @generated
   */
	WaveformObservation createWaveformObservation();

	/**
   * Returns a new object of class '<em>Waveform Sample Period Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Waveform Sample Period Observation</em>'.
   * @generated
   */
	WaveformSamplePeriodObservation createWaveformSamplePeriodObservation();

	/**
   * Returns a new object of class '<em>Participant</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Participant</em>'.
   * @generated
   */
	Participant createParticipant();

	/**
   * Returns a new object of class '<em>Personal Healthcare Monitoring Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Personal Healthcare Monitoring Report</em>'.
   * @generated
   */
	PersonalHealthcareMonitoringReport createPersonalHealthcareMonitoringReport();

	/**
   * Returns a new object of class '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>General Header Constraints</em>'.
   * @generated
   */
	GeneralHeaderConstraints createGeneralHeaderConstraints();

	/**
   * Returns a new object of class '<em>Vital Signs</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Vital Signs</em>'.
   * @generated
   */
	VitalSigns createVitalSigns();

	/**
   * Returns a new object of class '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Result Organizer</em>'.
   * @generated
   */
	ResultOrganizer createResultOrganizer();

	/**
   * Returns a new object of class '<em>Waveform Series Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Waveform Series Observation</em>'.
   * @generated
   */
	WaveformSeriesObservation createWaveformSeriesObservation();

	/**
   * Returns a new object of class '<em>Results</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Results</em>'.
   * @generated
   */
	Results createResults();

	/**
   * Returns a new object of class '<em>Participant Role</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Participant Role</em>'.
   * @generated
   */
	ParticipantRole createParticipantRole();

	/**
   * Returns a new object of class '<em>PHMR Product Instance</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>PHMR Product Instance</em>'.
   * @generated
   */
	PHMRProductInstance createPHMRProductInstance();

	/**
   * Returns a new object of class '<em>PHMR Product Instance Reference</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>PHMR Product Instance Reference</em>'.
   * @generated
   */
	PHMRProductInstanceReference createPHMRProductInstanceReference();

	/**
   * Returns a new object of class '<em>Playing Device</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Playing Device</em>'.
   * @generated
   */
	PlayingDevice createPlayingDevice();

	/**
   * Returns a new object of class '<em>Scoping Entity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Scoping Entity</em>'.
   * @generated
   */
	ScopingEntity createScopingEntity();

	/**
   * Returns a new object of class '<em>Vital Signs Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Vital Signs Organizer</em>'.
   * @generated
   */
	VitalSignsOrganizer createVitalSignsOrganizer();

	/**
   * Returns a new object of class '<em>Purpose</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Purpose</em>'.
   * @generated
   */
	Purpose createPurpose();

	/**
   * Returns a new object of class '<em>Medication</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Medication</em>'.
   * @generated
   */
	Medication createMedication();

	/**
   * Returns a new object of class '<em>Functional Status</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Functional Status</em>'.
   * @generated
   */
	FunctionalStatus createFunctionalStatus();

	/**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	PhmrPackage getPhmrPackage();

} //PhmrFactory
