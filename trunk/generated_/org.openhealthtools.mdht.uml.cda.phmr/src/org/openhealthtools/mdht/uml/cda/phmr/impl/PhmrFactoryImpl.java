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
package org.openhealthtools.mdht.uml.cda.phmr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.phmr.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhmrFactoryImpl extends EFactoryImpl implements PhmrFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhmrFactory init() {
		try {
			PhmrFactory thePhmrFactory = (PhmrFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/phmr"); 
			if (thePhmrFactory != null) {
				return thePhmrFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PhmrFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhmrFactoryImpl() {
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
			case PhmrPackage.DEVICE_ACCURACY_OBSERVATION: return createDeviceAccuracyObservation();
			case PhmrPackage.DEVICE_DEFINITION_ORGANIZER: return createDeviceDefinitionOrganizer();
			case PhmrPackage.SAMPLING_FREQUENCY_OBSERVATION: return createSamplingFrequencyObservation();
			case PhmrPackage.DEVICE_MEASUREMENT_RANGE_OBSERVATION: return createDeviceMeasurementRangeObservation();
			case PhmrPackage.DEVICE_RESOLUTION_OBSERVATION: return createDeviceResolutionObservation();
			case PhmrPackage.EVENT_OBSERVATION: return createEventObservation();
			case PhmrPackage.MEDICAL_EQUIPMENT: return createMedicalEquipment();
			case PhmrPackage.NUMERIC_OBSERVATION: return createNumericObservation();
			case PhmrPackage.OBSERVATION_MEDIA_JPG: return createObservationMediaJPG();
			case PhmrPackage.OBSERVATION_NULL_FLAVOR: return createObservationNullFlavor();
			case PhmrPackage.WAVEFORM_OBSERVATION: return createWaveformObservation();
			case PhmrPackage.WAVEFORM_SAMPLE_PERIOD_OBSERVATION: return createWaveformSamplePeriodObservation();
			case PhmrPackage.PARTICIPANT: return createParticipant();
			case PhmrPackage.PERSONAL_HEALTHCARE_MONITORING_REPORT: return createPersonalHealthcareMonitoringReport();
			case PhmrPackage.GENERAL_HEADER_CONSTRAINTS: return createGeneralHeaderConstraints();
			case PhmrPackage.VITAL_SIGNS: return createVitalSigns();
			case PhmrPackage.RESULT_ORGANIZER: return createResultOrganizer();
			case PhmrPackage.WAVEFORM_SERIES_OBSERVATION: return createWaveformSeriesObservation();
			case PhmrPackage.RESULTS: return createResults();
			case PhmrPackage.PARTICIPANT_ROLE: return createParticipantRole();
			case PhmrPackage.PHMR_PRODUCT_INSTANCE: return createPHMRProductInstance();
			case PhmrPackage.PHMR_PRODUCT_INSTANCE_REFERENCE: return createPHMRProductInstanceReference();
			case PhmrPackage.PLAYING_DEVICE: return createPlayingDevice();
			case PhmrPackage.SCOPING_ENTITY: return createScopingEntity();
			case PhmrPackage.VITAL_SIGNS_ORGANIZER: return createVitalSignsOrganizer();
			case PhmrPackage.PURPOSE: return createPurpose();
			case PhmrPackage.MEDICATION: return createMedication();
			case PhmrPackage.FUNCTIONAL_STATUS: return createFunctionalStatus();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceAccuracyObservation createDeviceAccuracyObservation() {
		DeviceAccuracyObservationImpl deviceAccuracyObservation = new DeviceAccuracyObservationImpl();
		return deviceAccuracyObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDefinitionOrganizer createDeviceDefinitionOrganizer() {
		DeviceDefinitionOrganizerImpl deviceDefinitionOrganizer = new DeviceDefinitionOrganizerImpl();
		return deviceDefinitionOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SamplingFrequencyObservation createSamplingFrequencyObservation() {
		SamplingFrequencyObservationImpl samplingFrequencyObservation = new SamplingFrequencyObservationImpl();
		return samplingFrequencyObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMeasurementRangeObservation createDeviceMeasurementRangeObservation() {
		DeviceMeasurementRangeObservationImpl deviceMeasurementRangeObservation = new DeviceMeasurementRangeObservationImpl();
		return deviceMeasurementRangeObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceResolutionObservation createDeviceResolutionObservation() {
		DeviceResolutionObservationImpl deviceResolutionObservation = new DeviceResolutionObservationImpl();
		return deviceResolutionObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventObservation createEventObservation() {
		EventObservationImpl eventObservation = new EventObservationImpl();
		return eventObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalEquipment createMedicalEquipment() {
		MedicalEquipmentImpl medicalEquipment = new MedicalEquipmentImpl();
		return medicalEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericObservation createNumericObservation() {
		NumericObservationImpl numericObservation = new NumericObservationImpl();
		return numericObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationMediaJPG createObservationMediaJPG() {
		ObservationMediaJPGImpl observationMediaJPG = new ObservationMediaJPGImpl();
		return observationMediaJPG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationNullFlavor createObservationNullFlavor() {
		ObservationNullFlavorImpl observationNullFlavor = new ObservationNullFlavorImpl();
		return observationNullFlavor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaveformObservation createWaveformObservation() {
		WaveformObservationImpl waveformObservation = new WaveformObservationImpl();
		return waveformObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaveformSamplePeriodObservation createWaveformSamplePeriodObservation() {
		WaveformSamplePeriodObservationImpl waveformSamplePeriodObservation = new WaveformSamplePeriodObservationImpl();
		return waveformSamplePeriodObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalHealthcareMonitoringReport createPersonalHealthcareMonitoringReport() {
		PersonalHealthcareMonitoringReportImpl personalHealthcareMonitoringReport = new PersonalHealthcareMonitoringReportImpl();
		return personalHealthcareMonitoringReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints createGeneralHeaderConstraints() {
		GeneralHeaderConstraintsImpl generalHeaderConstraints = new GeneralHeaderConstraintsImpl();
		return generalHeaderConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSigns createVitalSigns() {
		VitalSignsImpl vitalSigns = new VitalSignsImpl();
		return vitalSigns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultOrganizer createResultOrganizer() {
		ResultOrganizerImpl resultOrganizer = new ResultOrganizerImpl();
		return resultOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaveformSeriesObservation createWaveformSeriesObservation() {
		WaveformSeriesObservationImpl waveformSeriesObservation = new WaveformSeriesObservationImpl();
		return waveformSeriesObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Results createResults() {
		ResultsImpl results = new ResultsImpl();
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRole createParticipantRole() {
		ParticipantRoleImpl participantRole = new ParticipantRoleImpl();
		return participantRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PHMRProductInstance createPHMRProductInstance() {
		PHMRProductInstanceImpl phmrProductInstance = new PHMRProductInstanceImpl();
		return phmrProductInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PHMRProductInstanceReference createPHMRProductInstanceReference() {
		PHMRProductInstanceReferenceImpl phmrProductInstanceReference = new PHMRProductInstanceReferenceImpl();
		return phmrProductInstanceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayingDevice createPlayingDevice() {
		PlayingDeviceImpl playingDevice = new PlayingDeviceImpl();
		return playingDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopingEntity createScopingEntity() {
		ScopingEntityImpl scopingEntity = new ScopingEntityImpl();
		return scopingEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsOrganizer createVitalSignsOrganizer() {
		VitalSignsOrganizerImpl vitalSignsOrganizer = new VitalSignsOrganizerImpl();
		return vitalSignsOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Purpose createPurpose() {
		PurposeImpl purpose = new PurposeImpl();
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medication createMedication() {
		MedicationImpl medication = new MedicationImpl();
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatus createFunctionalStatus() {
		FunctionalStatusImpl functionalStatus = new FunctionalStatusImpl();
		return functionalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhmrPackage getPhmrPackage() {
		return (PhmrPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PhmrPackage getPackage() {
		return PhmrPackage.eINSTANCE;
	}

} //PhmrFactoryImpl
