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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;

import org.openhealthtools.mdht.uml.cda.phmr.*;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage
 * @generated
 */
public class PhmrValidator extends EObjectValidator {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final PhmrValidator INSTANCE = new PhmrValidator();

	/**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.phmr";

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Accuracy Observation Template Id' of 'Device Accuracy Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int DEVICE_ACCURACY_OBSERVATION__DEVICE_ACCURACY_OBSERVATION_TEMPLATE_ID = 1;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Accuracy Observation Class Code' of 'Device Accuracy Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int DEVICE_ACCURACY_OBSERVATION__DEVICE_ACCURACY_OBSERVATION_CLASS_CODE = 2;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Accuracy Observation Code P' of 'Device Accuracy Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEVICE_ACCURACY_OBSERVATION__DEVICE_ACCURACY_OBSERVATION_CODE_P = 3;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Accuracy Observation Code' of 'Device Accuracy Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int DEVICE_ACCURACY_OBSERVATION__DEVICE_ACCURACY_OBSERVATION_CODE = 4;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Accuracy Observation Mood Code' of 'Device Accuracy Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int DEVICE_ACCURACY_OBSERVATION__DEVICE_ACCURACY_OBSERVATION_MOOD_CODE = 5;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Accuracy Observation Value' of 'Device Accuracy Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int DEVICE_ACCURACY_OBSERVATION__DEVICE_ACCURACY_OBSERVATION_VALUE = 6;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Definition Organizer Template Id' of 'Device Definition Organizer'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int DEVICE_DEFINITION_ORGANIZER__DEVICE_DEFINITION_ORGANIZER_TEMPLATE_ID = 7;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Definition Organizer Class Code' of 'Device Definition Organizer'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int DEVICE_DEFINITION_ORGANIZER__DEVICE_DEFINITION_ORGANIZER_CLASS_CODE = 8;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Definition Organizer Effective Time' of 'Device Definition Organizer'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int DEVICE_DEFINITION_ORGANIZER__DEVICE_DEFINITION_ORGANIZER_EFFECTIVE_TIME = 9;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Definition Organizer Mood Code' of 'Device Definition Organizer'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int DEVICE_DEFINITION_ORGANIZER__DEVICE_DEFINITION_ORGANIZER_MOOD_CODE = 10;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Definition Organizer Sampling Frequency Observation' of 'Device Definition Organizer'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int DEVICE_DEFINITION_ORGANIZER__DEVICE_DEFINITION_ORGANIZER_SAMPLING_FREQUENCY_OBSERVATION = 11;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Definition Organizer Device Measurement Range Observation' of 'Device Definition Organizer'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int DEVICE_DEFINITION_ORGANIZER__DEVICE_DEFINITION_ORGANIZER_DEVICE_MEASUREMENT_RANGE_OBSERVATION = 12;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Definition Organizer Device Resolution Observation' of 'Device Definition Organizer'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int DEVICE_DEFINITION_ORGANIZER__DEVICE_DEFINITION_ORGANIZER_DEVICE_RESOLUTION_OBSERVATION = 13;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Definition Organizer Device Accuracy Observation' of 'Device Definition Organizer'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int DEVICE_DEFINITION_ORGANIZER__DEVICE_DEFINITION_ORGANIZER_DEVICE_ACCURACY_OBSERVATION = 14;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Definition Organizer Participant' of 'Device Definition Organizer'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEVICE_DEFINITION_ORGANIZER__DEVICE_DEFINITION_ORGANIZER_PARTICIPANT = 15;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sampling Frequency Observation Template Id' of 'Sampling Frequency Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SAMPLING_FREQUENCY_OBSERVATION__SAMPLING_FREQUENCY_OBSERVATION_TEMPLATE_ID = 16;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sampling Frequency Observation Code P' of 'Sampling Frequency Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SAMPLING_FREQUENCY_OBSERVATION__SAMPLING_FREQUENCY_OBSERVATION_CODE_P = 17;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sampling Frequency Observation Code' of 'Sampling Frequency Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SAMPLING_FREQUENCY_OBSERVATION__SAMPLING_FREQUENCY_OBSERVATION_CODE = 18;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sampling Frequency Observation Mood Code' of 'Sampling Frequency Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SAMPLING_FREQUENCY_OBSERVATION__SAMPLING_FREQUENCY_OBSERVATION_MOOD_CODE = 19;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sampling Frequency Observation Value' of 'Sampling Frequency Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SAMPLING_FREQUENCY_OBSERVATION__SAMPLING_FREQUENCY_OBSERVATION_VALUE = 20;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Measurement Range Observation Template Id' of 'Device Measurement Range Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int DEVICE_MEASUREMENT_RANGE_OBSERVATION__DEVICE_MEASUREMENT_RANGE_OBSERVATION_TEMPLATE_ID = 21;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Measurement Range Observation Class Code' of 'Device Measurement Range Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int DEVICE_MEASUREMENT_RANGE_OBSERVATION__DEVICE_MEASUREMENT_RANGE_OBSERVATION_CLASS_CODE = 22;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Measurement Range Observation Code P' of 'Device Measurement Range Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEVICE_MEASUREMENT_RANGE_OBSERVATION__DEVICE_MEASUREMENT_RANGE_OBSERVATION_CODE_P = 23;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Measurement Range Observation Code' of 'Device Measurement Range Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int DEVICE_MEASUREMENT_RANGE_OBSERVATION__DEVICE_MEASUREMENT_RANGE_OBSERVATION_CODE = 24;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Measurement Range Observation Mood Code' of 'Device Measurement Range Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int DEVICE_MEASUREMENT_RANGE_OBSERVATION__DEVICE_MEASUREMENT_RANGE_OBSERVATION_MOOD_CODE = 25;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Resolution Observation Template Id' of 'Device Resolution Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int DEVICE_RESOLUTION_OBSERVATION__DEVICE_RESOLUTION_OBSERVATION_TEMPLATE_ID = 26;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Resolution Observation Class Code' of 'Device Resolution Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int DEVICE_RESOLUTION_OBSERVATION__DEVICE_RESOLUTION_OBSERVATION_CLASS_CODE = 27;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Resolution Observation Code' of 'Device Resolution Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int DEVICE_RESOLUTION_OBSERVATION__DEVICE_RESOLUTION_OBSERVATION_CODE = 28;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Resolution Observation Mood Code' of 'Device Resolution Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int DEVICE_RESOLUTION_OBSERVATION__DEVICE_RESOLUTION_OBSERVATION_MOOD_CODE = 29;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Device Resolution Observation Value' of 'Device Resolution Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int DEVICE_RESOLUTION_OBSERVATION__DEVICE_RESOLUTION_OBSERVATION_VALUE = 30;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Event Observation Template Id' of 'Event Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int EVENT_OBSERVATION__EVENT_OBSERVATION_TEMPLATE_ID = 31;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Event Observation Class Code' of 'Event Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int EVENT_OBSERVATION__EVENT_OBSERVATION_CLASS_CODE = 32;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Event Observation Code' of 'Event Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int EVENT_OBSERVATION__EVENT_OBSERVATION_CODE = 33;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Event Observation Mood Code' of 'Event Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int EVENT_OBSERVATION__EVENT_OBSERVATION_MOOD_CODE = 34;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Event Observation Value' of 'Event Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int EVENT_OBSERVATION__EVENT_OBSERVATION_VALUE = 35;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Event Observation PHMR Product Instance Reference' of 'Event Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EVENT_OBSERVATION__EVENT_OBSERVATION_PHMR_PRODUCT_INSTANCE_REFERENCE = 36;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Equipment Text' of 'Medical Equipment'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICAL_EQUIPMENT__MEDICAL_EQUIPMENT_TEXT = 37;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Equipment Device Definition Organizer' of 'Medical Equipment'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICAL_EQUIPMENT__MEDICAL_EQUIPMENT_DEVICE_DEFINITION_ORGANIZER = 38;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Equipment Section Template Id' of 'Medical Equipment'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICAL_EQUIPMENT__MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID = 39;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Observation Class Code' of 'Numeric Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int NUMERIC_OBSERVATION__NUMERIC_OBSERVATION_CLASS_CODE = 40;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Observation Code' of 'Numeric Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int NUMERIC_OBSERVATION__NUMERIC_OBSERVATION_CODE = 41;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Observation Mood Code' of 'Numeric Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int NUMERIC_OBSERVATION__NUMERIC_OBSERVATION_MOOD_CODE = 42;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Observation Value' of 'Numeric Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int NUMERIC_OBSERVATION__NUMERIC_OBSERVATION_VALUE = 43;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numeric Observation PHMR Product Instance Reference' of 'Numeric Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int NUMERIC_OBSERVATION__NUMERIC_OBSERVATION_PHMR_PRODUCT_INSTANCE_REFERENCE = 44;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Numeric Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int NUMERIC_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 45;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Observation Media JPG Template Id' of 'Observation Media JPG'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OBSERVATION_MEDIA_JPG__OBSERVATION_MEDIA_JPG_TEMPLATE_ID = 46;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Observation Media JPG Class Code' of 'Observation Media JPG'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OBSERVATION_MEDIA_JPG__OBSERVATION_MEDIA_JPG_CLASS_CODE = 47;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Observation Media JPG Mood Code' of 'Observation Media JPG'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OBSERVATION_MEDIA_JPG__OBSERVATION_MEDIA_JPG_MOOD_CODE = 48;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Observation Media JPG Value' of 'Observation Media JPG'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OBSERVATION_MEDIA_JPG__OBSERVATION_MEDIA_JPG_VALUE = 49;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Observation Null Flavor Template Id' of 'Observation Null Flavor'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OBSERVATION_NULL_FLAVOR__OBSERVATION_NULL_FLAVOR_TEMPLATE_ID = 50;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Observation Null Flavor Class Code' of 'Observation Null Flavor'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OBSERVATION_NULL_FLAVOR__OBSERVATION_NULL_FLAVOR_CLASS_CODE = 51;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Observation Null Flavor Mood Code' of 'Observation Null Flavor'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OBSERVATION_NULL_FLAVOR__OBSERVATION_NULL_FLAVOR_MOOD_CODE = 52;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Observation Null Flavor Waveform Observation' of 'Observation Null Flavor'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OBSERVATION_NULL_FLAVOR__OBSERVATION_NULL_FLAVOR_WAVEFORM_OBSERVATION = 53;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Observation Null Flavor Waveform Sample Period Observation' of 'Observation Null Flavor'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OBSERVATION_NULL_FLAVOR__OBSERVATION_NULL_FLAVOR_WAVEFORM_SAMPLE_PERIOD_OBSERVATION = 54;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Waveform Observation Template Id' of 'Waveform Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int WAVEFORM_OBSERVATION__WAVEFORM_OBSERVATION_TEMPLATE_ID = 55;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Waveform Observation Class Code' of 'Waveform Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int WAVEFORM_OBSERVATION__WAVEFORM_OBSERVATION_CLASS_CODE = 56;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Waveform Observation Code' of 'Waveform Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int WAVEFORM_OBSERVATION__WAVEFORM_OBSERVATION_CODE = 57;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Waveform Observation Mood Code' of 'Waveform Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int WAVEFORM_OBSERVATION__WAVEFORM_OBSERVATION_MOOD_CODE = 58;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Waveform Observation Value' of 'Waveform Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int WAVEFORM_OBSERVATION__WAVEFORM_OBSERVATION_VALUE = 59;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Waveform Sample Period Observation Template Id' of 'Waveform Sample Period Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int WAVEFORM_SAMPLE_PERIOD_OBSERVATION__WAVEFORM_SAMPLE_PERIOD_OBSERVATION_TEMPLATE_ID = 60;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Waveform Sample Period Observation Class Code' of 'Waveform Sample Period Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int WAVEFORM_SAMPLE_PERIOD_OBSERVATION__WAVEFORM_SAMPLE_PERIOD_OBSERVATION_CLASS_CODE = 61;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Waveform Sample Period Observation Code' of 'Waveform Sample Period Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int WAVEFORM_SAMPLE_PERIOD_OBSERVATION__WAVEFORM_SAMPLE_PERIOD_OBSERVATION_CODE = 62;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Waveform Sample Period Observation Mood Code' of 'Waveform Sample Period Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int WAVEFORM_SAMPLE_PERIOD_OBSERVATION__WAVEFORM_SAMPLE_PERIOD_OBSERVATION_MOOD_CODE = 63;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Waveform Sample Period Observation Value' of 'Waveform Sample Period Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int WAVEFORM_SAMPLE_PERIOD_OBSERVATION__WAVEFORM_SAMPLE_PERIOD_OBSERVATION_VALUE = 64;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Participant Template Id' of 'Participant'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PARTICIPANT__PARTICIPANT_TEMPLATE_ID = 65;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Participant PHMR Product Instance' of 'Participant'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PARTICIPANT__PARTICIPANT_PHMR_PRODUCT_INSTANCE = 66;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Personal Healthcare Monitoring Report Template Id' of 'Personal Healthcare Monitoring Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PERSONAL_HEALTHCARE_MONITORING_REPORT__PERSONAL_HEALTHCARE_MONITORING_REPORT_TEMPLATE_ID = 67;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Personal Healthcare Monitoring Report Vital Signs' of 'Personal Healthcare Monitoring Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PERSONAL_HEALTHCARE_MONITORING_REPORT__PERSONAL_HEALTHCARE_MONITORING_REPORT_VITAL_SIGNS = 68;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Personal Healthcare Monitoring Report Results' of 'Personal Healthcare Monitoring Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PERSONAL_HEALTHCARE_MONITORING_REPORT__PERSONAL_HEALTHCARE_MONITORING_REPORT_RESULTS = 69;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Personal Healthcare Monitoring Report Medical Equipment' of 'Personal Healthcare Monitoring Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PERSONAL_HEALTHCARE_MONITORING_REPORT__PERSONAL_HEALTHCARE_MONITORING_REPORT_MEDICAL_EQUIPMENT = 70;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Personal Healthcare Monitoring Report Functional Status' of 'Personal Healthcare Monitoring Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PERSONAL_HEALTHCARE_MONITORING_REPORT__PERSONAL_HEALTHCARE_MONITORING_REPORT_FUNCTIONAL_STATUS = 71;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Personal Healthcare Monitoring Report Medication' of 'Personal Healthcare Monitoring Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PERSONAL_HEALTHCARE_MONITORING_REPORT__PERSONAL_HEALTHCARE_MONITORING_REPORT_MEDICATION = 72;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Personal Healthcare Monitoring Report Purpose' of 'Personal Healthcare Monitoring Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PERSONAL_HEALTHCARE_MONITORING_REPORT__PERSONAL_HEALTHCARE_MONITORING_REPORT_PURPOSE = 73;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Type Id Extension' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION = 74;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Set Id And Version Number' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_VERSION_NUMBER = 75;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Set Id And Id Are Unique' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_ID_ARE_UNIQUE = 76;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Copy Time Not Present' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_COPY_TIME_NOT_PRESENT = 77;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Record Target Patient Role' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_RECORD_TARGET_PATIENT_ROLE = 78;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Patient Birth Time' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_PATIENT_BIRTH_TIME = 79;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Administrative Gender Code' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_ADMINISTRATIVE_GENDER_CODE = 80;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Provider Organization' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_PROVIDER_ORGANIZATION = 81;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Author Time' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_AUTHOR_TIME = 82;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Assigned Author Id' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_ID = 83;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Assigned Author Person Or Device' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE = 84;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Data Enterer Assigned Person' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_ASSIGNED_PERSON = 85;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Data Enterer Time' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_TIME = 86;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Informant' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT = 87;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Has Informant Assigned Person Or Related Person' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON = 88;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Legal Authenticator Has Assigned Person' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON = 89;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Authenticator Has Assigned Person' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_HAS_ASSIGNED_PERSON = 90;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 91;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Code P' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CODE_P = 92;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Code' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CODE = 93;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Confidentiality Code' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE = 94;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Effective Time' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME = 95;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Id' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_ID = 96;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Language Code' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE = 97;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Title' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TITLE = 98;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Type Id' of 'General Header Constraints'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TYPE_ID = 99;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Vital Signs Organizer' of 'Vital Signs'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int VITAL_SIGNS__VITAL_SIGNS_VITAL_SIGNS_ORGANIZER = 100;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Template Id' of 'Vital Signs'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int VITAL_SIGNS__VITAL_SIGNS_SECTION_TEMPLATE_ID = 101;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phmr Result Organizer Numeric Observation' of 'Result Organizer'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RESULT_ORGANIZER__PHMR_RESULT_ORGANIZER_NUMERIC_OBSERVATION = 102;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phmr Result Organizer Waveform Series Observation' of 'Result Organizer'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RESULT_ORGANIZER__PHMR_RESULT_ORGANIZER_WAVEFORM_SERIES_OBSERVATION = 103;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Result Organizer'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 104;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Waveform Series Observation Template Id' of 'Waveform Series Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int WAVEFORM_SERIES_OBSERVATION__WAVEFORM_SERIES_OBSERVATION_TEMPLATE_ID = 105;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Waveform Series Observation Class Code' of 'Waveform Series Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int WAVEFORM_SERIES_OBSERVATION__WAVEFORM_SERIES_OBSERVATION_CLASS_CODE = 106;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Waveform Series Observation Code P' of 'Waveform Series Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int WAVEFORM_SERIES_OBSERVATION__WAVEFORM_SERIES_OBSERVATION_CODE_P = 107;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Waveform Series Observation Code' of 'Waveform Series Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int WAVEFORM_SERIES_OBSERVATION__WAVEFORM_SERIES_OBSERVATION_CODE = 108;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Waveform Series Observation Effective Time' of 'Waveform Series Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int WAVEFORM_SERIES_OBSERVATION__WAVEFORM_SERIES_OBSERVATION_EFFECTIVE_TIME = 109;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Waveform Series Observation Mood Code' of 'Waveform Series Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int WAVEFORM_SERIES_OBSERVATION__WAVEFORM_SERIES_OBSERVATION_MOOD_CODE = 110;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Waveform Series Observation PHMR Product Instance Reference' of 'Waveform Series Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int WAVEFORM_SERIES_OBSERVATION__WAVEFORM_SERIES_OBSERVATION_PHMR_PRODUCT_INSTANCE_REFERENCE = 111;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Waveform Series Observation Observation Media JPG' of 'Waveform Series Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int WAVEFORM_SERIES_OBSERVATION__WAVEFORM_SERIES_OBSERVATION_OBSERVATION_MEDIA_JPG = 112;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Waveform Series Observation Observation Null Flavor' of 'Waveform Series Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int WAVEFORM_SERIES_OBSERVATION__WAVEFORM_SERIES_OBSERVATION_OBSERVATION_NULL_FLAVOR = 113;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Result Organizer' of 'Results'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RESULTS__RESULTS_RESULT_ORGANIZER = 114;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Template Id' of 'Results'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RESULTS__RESULTS_SECTION_TEMPLATE_ID = 115;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phmr Participant Role Template Id' of 'Participant Role'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PARTICIPANT_ROLE__PHMR_PARTICIPANT_ROLE_TEMPLATE_ID = 116;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phmr Participant Role Id' of 'Participant Role'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PARTICIPANT_ROLE__PHMR_PARTICIPANT_ROLE_ID = 117;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PHMR Product Instance Code' of 'PHMR Product Instance'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHMR_PRODUCT_INSTANCE__PHMR_PRODUCT_INSTANCE_CODE = 118;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PHMR Product Instance Id' of 'PHMR Product Instance'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHMR_PRODUCT_INSTANCE__PHMR_PRODUCT_INSTANCE_ID = 119;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PHMR Product Instance Scoping Entity' of 'PHMR Product Instance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PHMR_PRODUCT_INSTANCE__PHMR_PRODUCT_INSTANCE_SCOPING_ENTITY = 120;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PHMR Product Instance Playing Device' of 'PHMR Product Instance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PHMR_PRODUCT_INSTANCE__PHMR_PRODUCT_INSTANCE_PLAYING_DEVICE = 121;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Instance Template Id' of 'PHMR Product Instance'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHMR_PRODUCT_INSTANCE__PRODUCT_INSTANCE_TEMPLATE_ID = 122;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PHMR Product Instance Reference Template Id' of 'PHMR Product Instance Reference'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHMR_PRODUCT_INSTANCE_REFERENCE__PHMR_PRODUCT_INSTANCE_REFERENCE_TEMPLATE_ID = 123;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PHMR Product Instance Reference Type Code' of 'PHMR Product Instance Reference'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHMR_PRODUCT_INSTANCE_REFERENCE__PHMR_PRODUCT_INSTANCE_REFERENCE_TYPE_CODE = 124;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PHMR Product Instance Reference Participant Role' of 'PHMR Product Instance Reference'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PHMR_PRODUCT_INSTANCE_REFERENCE__PHMR_PRODUCT_INSTANCE_REFERENCE_PARTICIPANT_ROLE = 125;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Playing Device Template Id' of 'Playing Device'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PLAYING_DEVICE__PLAYING_DEVICE_TEMPLATE_ID = 126;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Playing Device Code' of 'Playing Device'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PLAYING_DEVICE__PLAYING_DEVICE_CODE = 127;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Playing Device Manufacturer Model Name' of 'Playing Device'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PLAYING_DEVICE__PLAYING_DEVICE_MANUFACTURER_MODEL_NAME = 128;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scoping Entity Template Id' of 'Scoping Entity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SCOPING_ENTITY__SCOPING_ENTITY_TEMPLATE_ID = 129;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scoping Entity Desc' of 'Scoping Entity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SCOPING_ENTITY__SCOPING_ENTITY_DESC = 130;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Organizer Template Id' of 'Vital Signs Organizer'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_TEMPLATE_ID = 131;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Section Template Id' of 'Purpose'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PURPOSE__PURPOSE_SECTION_TEMPLATE_ID = 132;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Section Template Id' of 'Medication'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION__MEDICATIONS_SECTION_TEMPLATE_ID = 133;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Functional Status Section Template Id' of 'Functional Status'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int FUNCTIONAL_STATUS__FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID = 134;

	/**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 134;

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
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PhmrValidator() {
    super();
    cdaValidator = CDAValidator.INSTANCE;
    ccdValidator = CCDValidator.INSTANCE;
  }

	/**
   * Returns the package of this validator switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EPackage getEPackage() {
    return PhmrPackage.eINSTANCE;
  }

	/**
   * Calls <code>validateXXX</code> for the corresponding classifier of the model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
    switch (classifierID)
    {
      case PhmrPackage.DEVICE_ACCURACY_OBSERVATION:
        return validateDeviceAccuracyObservation((DeviceAccuracyObservation)value, diagnostics, context);
      case PhmrPackage.DEVICE_DEFINITION_ORGANIZER:
        return validateDeviceDefinitionOrganizer((DeviceDefinitionOrganizer)value, diagnostics, context);
      case PhmrPackage.SAMPLING_FREQUENCY_OBSERVATION:
        return validateSamplingFrequencyObservation((SamplingFrequencyObservation)value, diagnostics, context);
      case PhmrPackage.DEVICE_MEASUREMENT_RANGE_OBSERVATION:
        return validateDeviceMeasurementRangeObservation((DeviceMeasurementRangeObservation)value, diagnostics, context);
      case PhmrPackage.DEVICE_RESOLUTION_OBSERVATION:
        return validateDeviceResolutionObservation((DeviceResolutionObservation)value, diagnostics, context);
      case PhmrPackage.EVENT_OBSERVATION:
        return validateEventObservation((EventObservation)value, diagnostics, context);
      case PhmrPackage.MEDICAL_EQUIPMENT:
        return validateMedicalEquipment((MedicalEquipment)value, diagnostics, context);
      case PhmrPackage.NUMERIC_OBSERVATION:
        return validateNumericObservation((NumericObservation)value, diagnostics, context);
      case PhmrPackage.OBSERVATION_MEDIA_JPG:
        return validateObservationMediaJPG((ObservationMediaJPG)value, diagnostics, context);
      case PhmrPackage.OBSERVATION_NULL_FLAVOR:
        return validateObservationNullFlavor((ObservationNullFlavor)value, diagnostics, context);
      case PhmrPackage.WAVEFORM_OBSERVATION:
        return validateWaveformObservation((WaveformObservation)value, diagnostics, context);
      case PhmrPackage.WAVEFORM_SAMPLE_PERIOD_OBSERVATION:
        return validateWaveformSamplePeriodObservation((WaveformSamplePeriodObservation)value, diagnostics, context);
      case PhmrPackage.PARTICIPANT:
        return validateParticipant((Participant)value, diagnostics, context);
      case PhmrPackage.PERSONAL_HEALTHCARE_MONITORING_REPORT:
        return validatePersonalHealthcareMonitoringReport((PersonalHealthcareMonitoringReport)value, diagnostics, context);
      case PhmrPackage.GENERAL_HEADER_CONSTRAINTS:
        return validateGeneralHeaderConstraints((GeneralHeaderConstraints)value, diagnostics, context);
      case PhmrPackage.VITAL_SIGNS:
        return validateVitalSigns((VitalSigns)value, diagnostics, context);
      case PhmrPackage.RESULT_ORGANIZER:
        return validateResultOrganizer((ResultOrganizer)value, diagnostics, context);
      case PhmrPackage.WAVEFORM_SERIES_OBSERVATION:
        return validateWaveformSeriesObservation((WaveformSeriesObservation)value, diagnostics, context);
      case PhmrPackage.RESULTS:
        return validateResults((Results)value, diagnostics, context);
      case PhmrPackage.PARTICIPANT_ROLE:
        return validateParticipantRole((ParticipantRole)value, diagnostics, context);
      case PhmrPackage.PHMR_PRODUCT_INSTANCE:
        return validatePHMRProductInstance((PHMRProductInstance)value, diagnostics, context);
      case PhmrPackage.PHMR_PRODUCT_INSTANCE_REFERENCE:
        return validatePHMRProductInstanceReference((PHMRProductInstanceReference)value, diagnostics, context);
      case PhmrPackage.PLAYING_DEVICE:
        return validatePlayingDevice((PlayingDevice)value, diagnostics, context);
      case PhmrPackage.SCOPING_ENTITY:
        return validateScopingEntity((ScopingEntity)value, diagnostics, context);
      case PhmrPackage.VITAL_SIGNS_ORGANIZER:
        return validateVitalSignsOrganizer((VitalSignsOrganizer)value, diagnostics, context);
      case PhmrPackage.PURPOSE:
        return validatePurpose((Purpose)value, diagnostics, context);
      case PhmrPackage.MEDICATION:
        return validateMedication((Medication)value, diagnostics, context);
      case PhmrPackage.FUNCTIONAL_STATUS:
        return validateFunctionalStatus((FunctionalStatus)value, diagnostics, context);
      default:
        return true;
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceAccuracyObservation(DeviceAccuracyObservation deviceAccuracyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(deviceAccuracyObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(deviceAccuracyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deviceAccuracyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deviceAccuracyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(deviceAccuracyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(deviceAccuracyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(deviceAccuracyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deviceAccuracyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceAccuracyObservation_validateDeviceAccuracyObservationTemplateId(deviceAccuracyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceAccuracyObservation_validateDeviceAccuracyObservationClassCode(deviceAccuracyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceAccuracyObservation_validateDeviceAccuracyObservationCodeP(deviceAccuracyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceAccuracyObservation_validateDeviceAccuracyObservationCode(deviceAccuracyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceAccuracyObservation_validateDeviceAccuracyObservationMoodCode(deviceAccuracyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceAccuracyObservation_validateDeviceAccuracyObservationValue(deviceAccuracyObservation, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateDeviceAccuracyObservationTemplateId constraint of '<em>Device Accuracy Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceAccuracyObservation_validateDeviceAccuracyObservationTemplateId(DeviceAccuracyObservation deviceAccuracyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return deviceAccuracyObservation.validateDeviceAccuracyObservationTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateDeviceAccuracyObservationClassCode constraint of '<em>Device Accuracy Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceAccuracyObservation_validateDeviceAccuracyObservationClassCode(DeviceAccuracyObservation deviceAccuracyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return deviceAccuracyObservation.validateDeviceAccuracyObservationClassCode(diagnostics, context);
  }

	/**
   * Validates the validateDeviceAccuracyObservationCodeP constraint of '<em>Device Accuracy Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeviceAccuracyObservation_validateDeviceAccuracyObservationCodeP(DeviceAccuracyObservation deviceAccuracyObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deviceAccuracyObservation.validateDeviceAccuracyObservationCodeP(diagnostics, context);
  }

  /**
   * Validates the validateDeviceAccuracyObservationCode constraint of '<em>Device Accuracy Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceAccuracyObservation_validateDeviceAccuracyObservationCode(DeviceAccuracyObservation deviceAccuracyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return deviceAccuracyObservation.validateDeviceAccuracyObservationCode(diagnostics, context);
  }

	/**
   * Validates the validateDeviceAccuracyObservationMoodCode constraint of '<em>Device Accuracy Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceAccuracyObservation_validateDeviceAccuracyObservationMoodCode(DeviceAccuracyObservation deviceAccuracyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return deviceAccuracyObservation.validateDeviceAccuracyObservationMoodCode(diagnostics, context);
  }

	/**
   * Validates the validateDeviceAccuracyObservationValue constraint of '<em>Device Accuracy Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceAccuracyObservation_validateDeviceAccuracyObservationValue(DeviceAccuracyObservation deviceAccuracyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return deviceAccuracyObservation.validateDeviceAccuracyObservationValue(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceDefinitionOrganizer(DeviceDefinitionOrganizer deviceDefinitionOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(deviceDefinitionOrganizer, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(deviceDefinitionOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deviceDefinitionOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deviceDefinitionOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(deviceDefinitionOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(deviceDefinitionOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(deviceDefinitionOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deviceDefinitionOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceDefinitionOrganizer_validateDeviceDefinitionOrganizerTemplateId(deviceDefinitionOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceDefinitionOrganizer_validateDeviceDefinitionOrganizerClassCode(deviceDefinitionOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceDefinitionOrganizer_validateDeviceDefinitionOrganizerEffectiveTime(deviceDefinitionOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceDefinitionOrganizer_validateDeviceDefinitionOrganizerMoodCode(deviceDefinitionOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceDefinitionOrganizer_validateDeviceDefinitionOrganizerSamplingFrequencyObservation(deviceDefinitionOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceDefinitionOrganizer_validateDeviceDefinitionOrganizerDeviceMeasurementRangeObservation(deviceDefinitionOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceDefinitionOrganizer_validateDeviceDefinitionOrganizerDeviceResolutionObservation(deviceDefinitionOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceDefinitionOrganizer_validateDeviceDefinitionOrganizerDeviceAccuracyObservation(deviceDefinitionOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceDefinitionOrganizer_validateDeviceDefinitionOrganizerParticipant(deviceDefinitionOrganizer, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateDeviceDefinitionOrganizerTemplateId constraint of '<em>Device Definition Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceDefinitionOrganizer_validateDeviceDefinitionOrganizerTemplateId(DeviceDefinitionOrganizer deviceDefinitionOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return deviceDefinitionOrganizer.validateDeviceDefinitionOrganizerTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateDeviceDefinitionOrganizerClassCode constraint of '<em>Device Definition Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceDefinitionOrganizer_validateDeviceDefinitionOrganizerClassCode(DeviceDefinitionOrganizer deviceDefinitionOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return deviceDefinitionOrganizer.validateDeviceDefinitionOrganizerClassCode(diagnostics, context);
  }

	/**
   * Validates the validateDeviceDefinitionOrganizerEffectiveTime constraint of '<em>Device Definition Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceDefinitionOrganizer_validateDeviceDefinitionOrganizerEffectiveTime(DeviceDefinitionOrganizer deviceDefinitionOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return deviceDefinitionOrganizer.validateDeviceDefinitionOrganizerEffectiveTime(diagnostics, context);
  }

	/**
   * Validates the validateDeviceDefinitionOrganizerMoodCode constraint of '<em>Device Definition Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceDefinitionOrganizer_validateDeviceDefinitionOrganizerMoodCode(DeviceDefinitionOrganizer deviceDefinitionOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return deviceDefinitionOrganizer.validateDeviceDefinitionOrganizerMoodCode(diagnostics, context);
  }

	/**
   * Validates the validateDeviceDefinitionOrganizerSamplingFrequencyObservation constraint of '<em>Device Definition Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceDefinitionOrganizer_validateDeviceDefinitionOrganizerSamplingFrequencyObservation(DeviceDefinitionOrganizer deviceDefinitionOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return deviceDefinitionOrganizer.validateDeviceDefinitionOrganizerSamplingFrequencyObservation(diagnostics, context);
  }

	/**
   * Validates the validateDeviceDefinitionOrganizerDeviceMeasurementRangeObservation constraint of '<em>Device Definition Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceDefinitionOrganizer_validateDeviceDefinitionOrganizerDeviceMeasurementRangeObservation(DeviceDefinitionOrganizer deviceDefinitionOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return deviceDefinitionOrganizer.validateDeviceDefinitionOrganizerDeviceMeasurementRangeObservation(diagnostics, context);
  }

	/**
   * Validates the validateDeviceDefinitionOrganizerDeviceResolutionObservation constraint of '<em>Device Definition Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceDefinitionOrganizer_validateDeviceDefinitionOrganizerDeviceResolutionObservation(DeviceDefinitionOrganizer deviceDefinitionOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return deviceDefinitionOrganizer.validateDeviceDefinitionOrganizerDeviceResolutionObservation(diagnostics, context);
  }

	/**
   * Validates the validateDeviceDefinitionOrganizerDeviceAccuracyObservation constraint of '<em>Device Definition Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceDefinitionOrganizer_validateDeviceDefinitionOrganizerDeviceAccuracyObservation(DeviceDefinitionOrganizer deviceDefinitionOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return deviceDefinitionOrganizer.validateDeviceDefinitionOrganizerDeviceAccuracyObservation(diagnostics, context);
  }

	/**
   * Validates the validateDeviceDefinitionOrganizerParticipant constraint of '<em>Device Definition Organizer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeviceDefinitionOrganizer_validateDeviceDefinitionOrganizerParticipant(DeviceDefinitionOrganizer deviceDefinitionOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deviceDefinitionOrganizer.validateDeviceDefinitionOrganizerParticipant(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSamplingFrequencyObservation(SamplingFrequencyObservation samplingFrequencyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(samplingFrequencyObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(samplingFrequencyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(samplingFrequencyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(samplingFrequencyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(samplingFrequencyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(samplingFrequencyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(samplingFrequencyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(samplingFrequencyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSamplingFrequencyObservation_validateSamplingFrequencyObservationTemplateId(samplingFrequencyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSamplingFrequencyObservation_validateSamplingFrequencyObservationCodeP(samplingFrequencyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSamplingFrequencyObservation_validateSamplingFrequencyObservationCode(samplingFrequencyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSamplingFrequencyObservation_validateSamplingFrequencyObservationMoodCode(samplingFrequencyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSamplingFrequencyObservation_validateSamplingFrequencyObservationValue(samplingFrequencyObservation, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateSamplingFrequencyObservationTemplateId constraint of '<em>Sampling Frequency Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSamplingFrequencyObservation_validateSamplingFrequencyObservationTemplateId(SamplingFrequencyObservation samplingFrequencyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return samplingFrequencyObservation.validateSamplingFrequencyObservationTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateSamplingFrequencyObservationCodeP constraint of '<em>Sampling Frequency Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSamplingFrequencyObservation_validateSamplingFrequencyObservationCodeP(SamplingFrequencyObservation samplingFrequencyObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return samplingFrequencyObservation.validateSamplingFrequencyObservationCodeP(diagnostics, context);
  }

  /**
   * Validates the validateSamplingFrequencyObservationCode constraint of '<em>Sampling Frequency Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSamplingFrequencyObservation_validateSamplingFrequencyObservationCode(SamplingFrequencyObservation samplingFrequencyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return samplingFrequencyObservation.validateSamplingFrequencyObservationCode(diagnostics, context);
  }

	/**
   * Validates the validateSamplingFrequencyObservationMoodCode constraint of '<em>Sampling Frequency Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSamplingFrequencyObservation_validateSamplingFrequencyObservationMoodCode(SamplingFrequencyObservation samplingFrequencyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return samplingFrequencyObservation.validateSamplingFrequencyObservationMoodCode(diagnostics, context);
  }

	/**
   * Validates the validateSamplingFrequencyObservationValue constraint of '<em>Sampling Frequency Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSamplingFrequencyObservation_validateSamplingFrequencyObservationValue(SamplingFrequencyObservation samplingFrequencyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return samplingFrequencyObservation.validateSamplingFrequencyObservationValue(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceMeasurementRangeObservation(DeviceMeasurementRangeObservation deviceMeasurementRangeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(deviceMeasurementRangeObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(deviceMeasurementRangeObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deviceMeasurementRangeObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deviceMeasurementRangeObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(deviceMeasurementRangeObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(deviceMeasurementRangeObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(deviceMeasurementRangeObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deviceMeasurementRangeObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceMeasurementRangeObservation_validateDeviceMeasurementRangeObservationTemplateId(deviceMeasurementRangeObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceMeasurementRangeObservation_validateDeviceMeasurementRangeObservationClassCode(deviceMeasurementRangeObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceMeasurementRangeObservation_validateDeviceMeasurementRangeObservationCodeP(deviceMeasurementRangeObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceMeasurementRangeObservation_validateDeviceMeasurementRangeObservationCode(deviceMeasurementRangeObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceMeasurementRangeObservation_validateDeviceMeasurementRangeObservationMoodCode(deviceMeasurementRangeObservation, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateDeviceMeasurementRangeObservationTemplateId constraint of '<em>Device Measurement Range Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceMeasurementRangeObservation_validateDeviceMeasurementRangeObservationTemplateId(DeviceMeasurementRangeObservation deviceMeasurementRangeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return deviceMeasurementRangeObservation.validateDeviceMeasurementRangeObservationTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateDeviceMeasurementRangeObservationClassCode constraint of '<em>Device Measurement Range Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceMeasurementRangeObservation_validateDeviceMeasurementRangeObservationClassCode(DeviceMeasurementRangeObservation deviceMeasurementRangeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return deviceMeasurementRangeObservation.validateDeviceMeasurementRangeObservationClassCode(diagnostics, context);
  }

	/**
   * Validates the validateDeviceMeasurementRangeObservationCodeP constraint of '<em>Device Measurement Range Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeviceMeasurementRangeObservation_validateDeviceMeasurementRangeObservationCodeP(DeviceMeasurementRangeObservation deviceMeasurementRangeObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deviceMeasurementRangeObservation.validateDeviceMeasurementRangeObservationCodeP(diagnostics, context);
  }

  /**
   * Validates the validateDeviceMeasurementRangeObservationCode constraint of '<em>Device Measurement Range Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceMeasurementRangeObservation_validateDeviceMeasurementRangeObservationCode(DeviceMeasurementRangeObservation deviceMeasurementRangeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return deviceMeasurementRangeObservation.validateDeviceMeasurementRangeObservationCode(diagnostics, context);
  }

	/**
   * Validates the validateDeviceMeasurementRangeObservationMoodCode constraint of '<em>Device Measurement Range Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceMeasurementRangeObservation_validateDeviceMeasurementRangeObservationMoodCode(DeviceMeasurementRangeObservation deviceMeasurementRangeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return deviceMeasurementRangeObservation.validateDeviceMeasurementRangeObservationMoodCode(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceResolutionObservation(DeviceResolutionObservation deviceResolutionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(deviceResolutionObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(deviceResolutionObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deviceResolutionObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deviceResolutionObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(deviceResolutionObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(deviceResolutionObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(deviceResolutionObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deviceResolutionObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceResolutionObservation_validateDeviceResolutionObservationTemplateId(deviceResolutionObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceResolutionObservation_validateDeviceResolutionObservationClassCode(deviceResolutionObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceResolutionObservation_validateDeviceResolutionObservationCode(deviceResolutionObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceResolutionObservation_validateDeviceResolutionObservationMoodCode(deviceResolutionObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeviceResolutionObservation_validateDeviceResolutionObservationValue(deviceResolutionObservation, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateDeviceResolutionObservationTemplateId constraint of '<em>Device Resolution Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceResolutionObservation_validateDeviceResolutionObservationTemplateId(DeviceResolutionObservation deviceResolutionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return deviceResolutionObservation.validateDeviceResolutionObservationTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateDeviceResolutionObservationClassCode constraint of '<em>Device Resolution Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceResolutionObservation_validateDeviceResolutionObservationClassCode(DeviceResolutionObservation deviceResolutionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return deviceResolutionObservation.validateDeviceResolutionObservationClassCode(diagnostics, context);
  }

	/**
   * Validates the validateDeviceResolutionObservationCode constraint of '<em>Device Resolution Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceResolutionObservation_validateDeviceResolutionObservationCode(DeviceResolutionObservation deviceResolutionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return deviceResolutionObservation.validateDeviceResolutionObservationCode(diagnostics, context);
  }

	/**
   * Validates the validateDeviceResolutionObservationMoodCode constraint of '<em>Device Resolution Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceResolutionObservation_validateDeviceResolutionObservationMoodCode(DeviceResolutionObservation deviceResolutionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return deviceResolutionObservation.validateDeviceResolutionObservationMoodCode(diagnostics, context);
  }

	/**
   * Validates the validateDeviceResolutionObservationValue constraint of '<em>Device Resolution Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateDeviceResolutionObservation_validateDeviceResolutionObservationValue(DeviceResolutionObservation deviceResolutionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return deviceResolutionObservation.validateDeviceResolutionObservationValue(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEventObservation(EventObservation eventObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(eventObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(eventObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eventObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eventObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(eventObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(eventObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(eventObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eventObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateEventObservation_validateEventObservationTemplateId(eventObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateEventObservation_validateEventObservationClassCode(eventObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateEventObservation_validateEventObservationCode(eventObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateEventObservation_validateEventObservationMoodCode(eventObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateEventObservation_validateEventObservationValue(eventObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateEventObservation_validateEventObservationPHMRProductInstanceReference(eventObservation, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateEventObservationTemplateId constraint of '<em>Event Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEventObservation_validateEventObservationTemplateId(EventObservation eventObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return eventObservation.validateEventObservationTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateEventObservationClassCode constraint of '<em>Event Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEventObservation_validateEventObservationClassCode(EventObservation eventObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return eventObservation.validateEventObservationClassCode(diagnostics, context);
  }

	/**
   * Validates the validateEventObservationCode constraint of '<em>Event Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEventObservation_validateEventObservationCode(EventObservation eventObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return eventObservation.validateEventObservationCode(diagnostics, context);
  }

	/**
   * Validates the validateEventObservationMoodCode constraint of '<em>Event Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEventObservation_validateEventObservationMoodCode(EventObservation eventObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return eventObservation.validateEventObservationMoodCode(diagnostics, context);
  }

	/**
   * Validates the validateEventObservationValue constraint of '<em>Event Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEventObservation_validateEventObservationValue(EventObservation eventObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return eventObservation.validateEventObservationValue(diagnostics, context);
  }

	/**
   * Validates the validateEventObservationPHMRProductInstanceReference constraint of '<em>Event Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEventObservation_validateEventObservationPHMRProductInstanceReference(EventObservation eventObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return eventObservation.validateEventObservationPHMRProductInstanceReference(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicalEquipment(MedicalEquipment medicalEquipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(medicalEquipment, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(medicalEquipment, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicalEquipment, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicalEquipment, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicalEquipment, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(medicalEquipment, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicalEquipment, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicalEquipment, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(medicalEquipment, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(medicalEquipment, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicalEquipment_validateMedicalEquipmentSectionTemplateId(medicalEquipment, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateMedicalEquipmentSection_validateMedicalEquipmentSectionCode(medicalEquipment, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateMedicalEquipmentSection_validateMedicalEquipmentSectionTitle(medicalEquipment, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateMedicalEquipmentSection_validateMedicalEquipmentSectionText(medicalEquipment, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateMedicalEquipmentSection_validateMedicalEquipmentSectionSupplyActivity(medicalEquipment, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateMedicalEquipmentSection_validateMedicalEquipmentSectionMedicationActivity(medicalEquipment, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicalEquipment_validateMedicalEquipmentText(medicalEquipment, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicalEquipment_validateMedicalEquipmentDeviceDefinitionOrganizer(medicalEquipment, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateMedicalEquipmentText constraint of '<em>Medical Equipment</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicalEquipment_validateMedicalEquipmentText(MedicalEquipment medicalEquipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicalEquipment.validateMedicalEquipmentText(diagnostics, context);
  }

	/**
   * Validates the validateMedicalEquipmentDeviceDefinitionOrganizer constraint of '<em>Medical Equipment</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicalEquipment_validateMedicalEquipmentDeviceDefinitionOrganizer(MedicalEquipment medicalEquipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicalEquipment.validateMedicalEquipmentDeviceDefinitionOrganizer(diagnostics, context);
  }

	/**
   * Validates the validateMedicalEquipmentSectionTemplateId constraint of '<em>Medical Equipment</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicalEquipment_validateMedicalEquipmentSectionTemplateId(MedicalEquipment medicalEquipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicalEquipment.validateMedicalEquipmentSectionTemplateId(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumericObservation(NumericObservation numericObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(numericObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(numericObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(numericObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(numericObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(numericObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(numericObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(numericObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(numericObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCodeValue(numericObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationReferenceRangeRequired(numericObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(numericObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInformationSource(numericObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateNumericObservation_validateResultObservationTemplateId(numericObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMoodCode(numericObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationId(numericObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationEffectiveTime(numericObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationStatusCode(numericObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCode(numericObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMethodCode(numericObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInterpretationCode(numericObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationValue(numericObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateNumericObservation_validateNumericObservationClassCode(numericObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateNumericObservation_validateNumericObservationCode(numericObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateNumericObservation_validateNumericObservationMoodCode(numericObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateNumericObservation_validateNumericObservationValue(numericObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateNumericObservation_validateNumericObservationPHMRProductInstanceReference(numericObservation, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateNumericObservationClassCode constraint of '<em>Numeric Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumericObservation_validateNumericObservationClassCode(NumericObservation numericObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return numericObservation.validateNumericObservationClassCode(diagnostics, context);
  }

	/**
   * Validates the validateNumericObservationCode constraint of '<em>Numeric Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumericObservation_validateNumericObservationCode(NumericObservation numericObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return numericObservation.validateNumericObservationCode(diagnostics, context);
  }

	/**
   * Validates the validateNumericObservationMoodCode constraint of '<em>Numeric Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumericObservation_validateNumericObservationMoodCode(NumericObservation numericObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return numericObservation.validateNumericObservationMoodCode(diagnostics, context);
  }

	/**
   * Validates the validateNumericObservationValue constraint of '<em>Numeric Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumericObservation_validateNumericObservationValue(NumericObservation numericObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return numericObservation.validateNumericObservationValue(diagnostics, context);
  }

	/**
   * Validates the validateNumericObservationPHMRProductInstanceReference constraint of '<em>Numeric Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNumericObservation_validateNumericObservationPHMRProductInstanceReference(NumericObservation numericObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return numericObservation.validateNumericObservationPHMRProductInstanceReference(diagnostics, context);
  }

  /**
   * Validates the validateResultObservationTemplateId constraint of '<em>Numeric Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateNumericObservation_validateResultObservationTemplateId(NumericObservation numericObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return numericObservation.validateResultObservationTemplateId(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateObservationMediaJPG(ObservationMediaJPG observationMediaJPG, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(observationMediaJPG, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(observationMediaJPG, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(observationMediaJPG, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(observationMediaJPG, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(observationMediaJPG, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(observationMediaJPG, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(observationMediaJPG, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(observationMediaJPG, diagnostics, context);
    if (result || diagnostics != null) result &= validateObservationMediaJPG_validateObservationMediaJPGTemplateId(observationMediaJPG, diagnostics, context);
    if (result || diagnostics != null) result &= validateObservationMediaJPG_validateObservationMediaJPGClassCode(observationMediaJPG, diagnostics, context);
    if (result || diagnostics != null) result &= validateObservationMediaJPG_validateObservationMediaJPGMoodCode(observationMediaJPG, diagnostics, context);
    if (result || diagnostics != null) result &= validateObservationMediaJPG_validateObservationMediaJPGValue(observationMediaJPG, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateObservationMediaJPGTemplateId constraint of '<em>Observation Media JPG</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateObservationMediaJPG_validateObservationMediaJPGTemplateId(ObservationMediaJPG observationMediaJPG, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return observationMediaJPG.validateObservationMediaJPGTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateObservationMediaJPGClassCode constraint of '<em>Observation Media JPG</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateObservationMediaJPG_validateObservationMediaJPGClassCode(ObservationMediaJPG observationMediaJPG, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return observationMediaJPG.validateObservationMediaJPGClassCode(diagnostics, context);
  }

	/**
   * Validates the validateObservationMediaJPGMoodCode constraint of '<em>Observation Media JPG</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateObservationMediaJPG_validateObservationMediaJPGMoodCode(ObservationMediaJPG observationMediaJPG, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return observationMediaJPG.validateObservationMediaJPGMoodCode(diagnostics, context);
  }

	/**
   * Validates the validateObservationMediaJPGValue constraint of '<em>Observation Media JPG</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateObservationMediaJPG_validateObservationMediaJPGValue(ObservationMediaJPG observationMediaJPG, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return observationMediaJPG.validateObservationMediaJPGValue(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateObservationNullFlavor(ObservationNullFlavor observationNullFlavor, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(observationNullFlavor, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(observationNullFlavor, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(observationNullFlavor, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(observationNullFlavor, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(observationNullFlavor, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(observationNullFlavor, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(observationNullFlavor, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(observationNullFlavor, diagnostics, context);
    if (result || diagnostics != null) result &= validateObservationNullFlavor_validateObservationNullFlavorTemplateId(observationNullFlavor, diagnostics, context);
    if (result || diagnostics != null) result &= validateObservationNullFlavor_validateObservationNullFlavorClassCode(observationNullFlavor, diagnostics, context);
    if (result || diagnostics != null) result &= validateObservationNullFlavor_validateObservationNullFlavorMoodCode(observationNullFlavor, diagnostics, context);
    if (result || diagnostics != null) result &= validateObservationNullFlavor_validateObservationNullFlavorWaveformObservation(observationNullFlavor, diagnostics, context);
    if (result || diagnostics != null) result &= validateObservationNullFlavor_validateObservationNullFlavorWaveformSamplePeriodObservation(observationNullFlavor, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateObservationNullFlavorTemplateId constraint of '<em>Observation Null Flavor</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateObservationNullFlavor_validateObservationNullFlavorTemplateId(ObservationNullFlavor observationNullFlavor, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return observationNullFlavor.validateObservationNullFlavorTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateObservationNullFlavorClassCode constraint of '<em>Observation Null Flavor</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateObservationNullFlavor_validateObservationNullFlavorClassCode(ObservationNullFlavor observationNullFlavor, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return observationNullFlavor.validateObservationNullFlavorClassCode(diagnostics, context);
  }

	/**
   * Validates the validateObservationNullFlavorMoodCode constraint of '<em>Observation Null Flavor</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateObservationNullFlavor_validateObservationNullFlavorMoodCode(ObservationNullFlavor observationNullFlavor, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return observationNullFlavor.validateObservationNullFlavorMoodCode(diagnostics, context);
  }

	/**
   * Validates the validateObservationNullFlavorWaveformObservation constraint of '<em>Observation Null Flavor</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateObservationNullFlavor_validateObservationNullFlavorWaveformObservation(ObservationNullFlavor observationNullFlavor, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return observationNullFlavor.validateObservationNullFlavorWaveformObservation(diagnostics, context);
  }

	/**
   * Validates the validateObservationNullFlavorWaveformSamplePeriodObservation constraint of '<em>Observation Null Flavor</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateObservationNullFlavor_validateObservationNullFlavorWaveformSamplePeriodObservation(ObservationNullFlavor observationNullFlavor, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return observationNullFlavor.validateObservationNullFlavorWaveformSamplePeriodObservation(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateWaveformObservation(WaveformObservation waveformObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(waveformObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(waveformObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(waveformObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(waveformObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(waveformObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(waveformObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(waveformObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(waveformObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateWaveformObservation_validateWaveformObservationTemplateId(waveformObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateWaveformObservation_validateWaveformObservationClassCode(waveformObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateWaveformObservation_validateWaveformObservationCode(waveformObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateWaveformObservation_validateWaveformObservationMoodCode(waveformObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateWaveformObservation_validateWaveformObservationValue(waveformObservation, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateWaveformObservationTemplateId constraint of '<em>Waveform Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateWaveformObservation_validateWaveformObservationTemplateId(WaveformObservation waveformObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return waveformObservation.validateWaveformObservationTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateWaveformObservationClassCode constraint of '<em>Waveform Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateWaveformObservation_validateWaveformObservationClassCode(WaveformObservation waveformObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return waveformObservation.validateWaveformObservationClassCode(diagnostics, context);
  }

	/**
   * Validates the validateWaveformObservationCode constraint of '<em>Waveform Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateWaveformObservation_validateWaveformObservationCode(WaveformObservation waveformObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return waveformObservation.validateWaveformObservationCode(diagnostics, context);
  }

	/**
   * Validates the validateWaveformObservationMoodCode constraint of '<em>Waveform Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateWaveformObservation_validateWaveformObservationMoodCode(WaveformObservation waveformObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return waveformObservation.validateWaveformObservationMoodCode(diagnostics, context);
  }

	/**
   * Validates the validateWaveformObservationValue constraint of '<em>Waveform Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateWaveformObservation_validateWaveformObservationValue(WaveformObservation waveformObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return waveformObservation.validateWaveformObservationValue(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateWaveformSamplePeriodObservation(WaveformSamplePeriodObservation waveformSamplePeriodObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(waveformSamplePeriodObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(waveformSamplePeriodObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(waveformSamplePeriodObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(waveformSamplePeriodObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(waveformSamplePeriodObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(waveformSamplePeriodObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(waveformSamplePeriodObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(waveformSamplePeriodObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateWaveformSamplePeriodObservation_validateWaveformSamplePeriodObservationTemplateId(waveformSamplePeriodObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateWaveformSamplePeriodObservation_validateWaveformSamplePeriodObservationClassCode(waveformSamplePeriodObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateWaveformSamplePeriodObservation_validateWaveformSamplePeriodObservationCode(waveformSamplePeriodObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateWaveformSamplePeriodObservation_validateWaveformSamplePeriodObservationMoodCode(waveformSamplePeriodObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateWaveformSamplePeriodObservation_validateWaveformSamplePeriodObservationValue(waveformSamplePeriodObservation, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateWaveformSamplePeriodObservationTemplateId constraint of '<em>Waveform Sample Period Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateWaveformSamplePeriodObservation_validateWaveformSamplePeriodObservationTemplateId(WaveformSamplePeriodObservation waveformSamplePeriodObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return waveformSamplePeriodObservation.validateWaveformSamplePeriodObservationTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateWaveformSamplePeriodObservationClassCode constraint of '<em>Waveform Sample Period Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateWaveformSamplePeriodObservation_validateWaveformSamplePeriodObservationClassCode(WaveformSamplePeriodObservation waveformSamplePeriodObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return waveformSamplePeriodObservation.validateWaveformSamplePeriodObservationClassCode(diagnostics, context);
  }

	/**
   * Validates the validateWaveformSamplePeriodObservationCode constraint of '<em>Waveform Sample Period Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateWaveformSamplePeriodObservation_validateWaveformSamplePeriodObservationCode(WaveformSamplePeriodObservation waveformSamplePeriodObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return waveformSamplePeriodObservation.validateWaveformSamplePeriodObservationCode(diagnostics, context);
  }

	/**
   * Validates the validateWaveformSamplePeriodObservationMoodCode constraint of '<em>Waveform Sample Period Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateWaveformSamplePeriodObservation_validateWaveformSamplePeriodObservationMoodCode(WaveformSamplePeriodObservation waveformSamplePeriodObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return waveformSamplePeriodObservation.validateWaveformSamplePeriodObservationMoodCode(diagnostics, context);
  }

	/**
   * Validates the validateWaveformSamplePeriodObservationValue constraint of '<em>Waveform Sample Period Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateWaveformSamplePeriodObservation_validateWaveformSamplePeriodObservationValue(WaveformSamplePeriodObservation waveformSamplePeriodObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return waveformSamplePeriodObservation.validateWaveformSamplePeriodObservationValue(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateParticipant(Participant participant, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(participant, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(participant, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(participant, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(participant, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(participant, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(participant, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(participant, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(participant, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateParticipant2_validateContextControlCode(participant, diagnostics, context);
    if (result || diagnostics != null) result &= validateParticipant_validateParticipantTemplateId(participant, diagnostics, context);
    if (result || diagnostics != null) result &= validateParticipant_validateParticipantPHMRProductInstance(participant, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateParticipantTemplateId constraint of '<em>Participant</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateParticipant_validateParticipantTemplateId(Participant participant, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return participant.validateParticipantTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateParticipantPHMRProductInstance constraint of '<em>Participant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateParticipant_validateParticipantPHMRProductInstance(Participant participant, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return participant.validateParticipantPHMRProductInstance(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePersonalHealthcareMonitoringReport(PersonalHealthcareMonitoringReport personalHealthcareMonitoringReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(personalHealthcareMonitoringReport, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCodeP(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePersonalHealthcareMonitoringReport_validatePersonalHealthcareMonitoringReportTemplateId(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePersonalHealthcareMonitoringReport_validatePersonalHealthcareMonitoringReportVitalSigns(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePersonalHealthcareMonitoringReport_validatePersonalHealthcareMonitoringReportResults(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePersonalHealthcareMonitoringReport_validatePersonalHealthcareMonitoringReportMedicalEquipment(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePersonalHealthcareMonitoringReport_validatePersonalHealthcareMonitoringReportFunctionalStatus(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePersonalHealthcareMonitoringReport_validatePersonalHealthcareMonitoringReportMedication(personalHealthcareMonitoringReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePersonalHealthcareMonitoringReport_validatePersonalHealthcareMonitoringReportPurpose(personalHealthcareMonitoringReport, diagnostics, context);
    return result;
  }

	/**
   * Validates the validatePersonalHealthcareMonitoringReportTemplateId constraint of '<em>Personal Healthcare Monitoring Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePersonalHealthcareMonitoringReport_validatePersonalHealthcareMonitoringReportTemplateId(PersonalHealthcareMonitoringReport personalHealthcareMonitoringReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return personalHealthcareMonitoringReport.validatePersonalHealthcareMonitoringReportTemplateId(diagnostics, context);
  }

	/**
   * Validates the validatePersonalHealthcareMonitoringReportVitalSigns constraint of '<em>Personal Healthcare Monitoring Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePersonalHealthcareMonitoringReport_validatePersonalHealthcareMonitoringReportVitalSigns(PersonalHealthcareMonitoringReport personalHealthcareMonitoringReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return personalHealthcareMonitoringReport.validatePersonalHealthcareMonitoringReportVitalSigns(diagnostics, context);
  }

	/**
   * Validates the validatePersonalHealthcareMonitoringReportResults constraint of '<em>Personal Healthcare Monitoring Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePersonalHealthcareMonitoringReport_validatePersonalHealthcareMonitoringReportResults(PersonalHealthcareMonitoringReport personalHealthcareMonitoringReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return personalHealthcareMonitoringReport.validatePersonalHealthcareMonitoringReportResults(diagnostics, context);
  }

	/**
   * Validates the validatePersonalHealthcareMonitoringReportMedicalEquipment constraint of '<em>Personal Healthcare Monitoring Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePersonalHealthcareMonitoringReport_validatePersonalHealthcareMonitoringReportMedicalEquipment(PersonalHealthcareMonitoringReport personalHealthcareMonitoringReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return personalHealthcareMonitoringReport.validatePersonalHealthcareMonitoringReportMedicalEquipment(diagnostics, context);
  }

	/**
   * Validates the validatePersonalHealthcareMonitoringReportFunctionalStatus constraint of '<em>Personal Healthcare Monitoring Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePersonalHealthcareMonitoringReport_validatePersonalHealthcareMonitoringReportFunctionalStatus(PersonalHealthcareMonitoringReport personalHealthcareMonitoringReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return personalHealthcareMonitoringReport.validatePersonalHealthcareMonitoringReportFunctionalStatus(diagnostics, context);
  }

	/**
   * Validates the validatePersonalHealthcareMonitoringReportMedication constraint of '<em>Personal Healthcare Monitoring Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePersonalHealthcareMonitoringReport_validatePersonalHealthcareMonitoringReportMedication(PersonalHealthcareMonitoringReport personalHealthcareMonitoringReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return personalHealthcareMonitoringReport.validatePersonalHealthcareMonitoringReportMedication(diagnostics, context);
  }

	/**
   * Validates the validatePersonalHealthcareMonitoringReportPurpose constraint of '<em>Personal Healthcare Monitoring Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePersonalHealthcareMonitoringReport_validatePersonalHealthcareMonitoringReportPurpose(PersonalHealthcareMonitoringReport personalHealthcareMonitoringReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return personalHealthcareMonitoringReport.validatePersonalHealthcareMonitoringReportPurpose(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(generalHeaderConstraints, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCodeP(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(generalHeaderConstraints, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(generalHeaderConstraints, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateGeneralHeaderConstraintsTypeIdExtension constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsTypeIdExtension(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsSetIdAndVersionNumber constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsSetIdAndVersionNumber(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsSetIdAndIdAreUnique constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsSetIdAndIdAreUnique(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsCopyTimeNotPresent constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsCopyTimeNotPresent(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsHasRecordTargetPatientRole constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsHasRecordTargetPatientRole(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsHasPatientBirthTime constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsHasPatientBirthTime(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsHasAdministrativeGenderCode constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsHasAdministrativeGenderCode(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsHasProviderOrganization constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsHasProviderOrganization(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsHasAuthorTime constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsHasAuthorTime(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsHasAssignedAuthorId constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsHasAssignedAuthorId(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsHasDataEntererAssignedPerson constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsHasDataEntererTime constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsHasDataEntererTime(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsHasInformant constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsHasInformant(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsCodeP constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCodeP(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsCodeP(diagnostics, context);
  }

  /**
   * Validates the validateGeneralHeaderConstraintsCode constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsCode(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsConfidentialityCode constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsConfidentialityCode(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsEffectiveTime constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsEffectiveTime(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsId constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsId(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsLanguageCode constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsLanguageCode(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsTitle constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsTitle(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsTypeId constraint of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return generalHeaderConstraints.validateGeneralHeaderConstraintsTypeId(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVitalSigns(VitalSigns vitalSigns, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(vitalSigns, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(vitalSigns, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vitalSigns, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vitalSigns, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(vitalSigns, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(vitalSigns, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(vitalSigns, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vitalSigns, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(vitalSigns, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(vitalSigns, diagnostics, context);
    if (result || diagnostics != null) result &= validateVitalSigns_validateVitalSignsSectionTemplateId(vitalSigns, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionCode(vitalSigns, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionTitle(vitalSigns, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionText(vitalSigns, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionVitalSignsOrganizer(vitalSigns, diagnostics, context);
    if (result || diagnostics != null) result &= validateVitalSigns_validateVitalSignsVitalSignsOrganizer(vitalSigns, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateVitalSignsVitalSignsOrganizer constraint of '<em>Vital Signs</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVitalSigns_validateVitalSignsVitalSignsOrganizer(VitalSigns vitalSigns, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return vitalSigns.validateVitalSignsVitalSignsOrganizer(diagnostics, context);
  }

	/**
   * Validates the validateVitalSignsSectionTemplateId constraint of '<em>Vital Signs</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVitalSigns_validateVitalSignsSectionTemplateId(VitalSigns vitalSigns, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return vitalSigns.validateVitalSignsSectionTemplateId(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateResultOrganizer(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(resultOrganizer, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCodeValue(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerComponentElement(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerInformationSource(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerTemplateId(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerMoodCode(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerId(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCode(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerStatusCode(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerResultObservation(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerSpecimen(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateResultOrganizer_validatePhmrResultOrganizerNumericObservation(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateResultOrganizer_validatePhmrResultOrganizerWaveformSeriesObservation(resultOrganizer, diagnostics, context);
    return result;
  }

	/**
   * Validates the validatePhmrResultOrganizerNumericObservation constraint of '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateResultOrganizer_validatePhmrResultOrganizerNumericObservation(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return resultOrganizer.validatePhmrResultOrganizerNumericObservation(diagnostics, context);
  }

	/**
   * Validates the validatePhmrResultOrganizerWaveformSeriesObservation constraint of '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateResultOrganizer_validatePhmrResultOrganizerWaveformSeriesObservation(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return resultOrganizer.validatePhmrResultOrganizerWaveformSeriesObservation(diagnostics, context);
  }

	/**
   * Validates the validateResultOrganizerTemplateId constraint of '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateResultOrganizer_validateResultOrganizerTemplateId(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return resultOrganizer.validateResultOrganizerTemplateId(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateWaveformSeriesObservation(WaveformSeriesObservation waveformSeriesObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(waveformSeriesObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(waveformSeriesObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(waveformSeriesObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(waveformSeriesObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(waveformSeriesObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(waveformSeriesObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(waveformSeriesObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(waveformSeriesObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateWaveformSeriesObservation_validateWaveformSeriesObservationTemplateId(waveformSeriesObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateWaveformSeriesObservation_validateWaveformSeriesObservationClassCode(waveformSeriesObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateWaveformSeriesObservation_validateWaveformSeriesObservationCodeP(waveformSeriesObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateWaveformSeriesObservation_validateWaveformSeriesObservationCode(waveformSeriesObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateWaveformSeriesObservation_validateWaveformSeriesObservationEffectiveTime(waveformSeriesObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateWaveformSeriesObservation_validateWaveformSeriesObservationMoodCode(waveformSeriesObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateWaveformSeriesObservation_validateWaveformSeriesObservationPHMRProductInstanceReference(waveformSeriesObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateWaveformSeriesObservation_validateWaveformSeriesObservationObservationMediaJPG(waveformSeriesObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateWaveformSeriesObservation_validateWaveformSeriesObservationObservationNullFlavor(waveformSeriesObservation, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateWaveformSeriesObservationTemplateId constraint of '<em>Waveform Series Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateWaveformSeriesObservation_validateWaveformSeriesObservationTemplateId(WaveformSeriesObservation waveformSeriesObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return waveformSeriesObservation.validateWaveformSeriesObservationTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateWaveformSeriesObservationClassCode constraint of '<em>Waveform Series Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateWaveformSeriesObservation_validateWaveformSeriesObservationClassCode(WaveformSeriesObservation waveformSeriesObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return waveformSeriesObservation.validateWaveformSeriesObservationClassCode(diagnostics, context);
  }

	/**
   * Validates the validateWaveformSeriesObservationCodeP constraint of '<em>Waveform Series Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWaveformSeriesObservation_validateWaveformSeriesObservationCodeP(WaveformSeriesObservation waveformSeriesObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return waveformSeriesObservation.validateWaveformSeriesObservationCodeP(diagnostics, context);
  }

  /**
   * Validates the validateWaveformSeriesObservationCode constraint of '<em>Waveform Series Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateWaveformSeriesObservation_validateWaveformSeriesObservationCode(WaveformSeriesObservation waveformSeriesObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return waveformSeriesObservation.validateWaveformSeriesObservationCode(diagnostics, context);
  }

	/**
   * Validates the validateWaveformSeriesObservationEffectiveTime constraint of '<em>Waveform Series Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateWaveformSeriesObservation_validateWaveformSeriesObservationEffectiveTime(WaveformSeriesObservation waveformSeriesObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return waveformSeriesObservation.validateWaveformSeriesObservationEffectiveTime(diagnostics, context);
  }

	/**
   * Validates the validateWaveformSeriesObservationMoodCode constraint of '<em>Waveform Series Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateWaveformSeriesObservation_validateWaveformSeriesObservationMoodCode(WaveformSeriesObservation waveformSeriesObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return waveformSeriesObservation.validateWaveformSeriesObservationMoodCode(diagnostics, context);
  }

	/**
   * Validates the validateWaveformSeriesObservationPHMRProductInstanceReference constraint of '<em>Waveform Series Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWaveformSeriesObservation_validateWaveformSeriesObservationPHMRProductInstanceReference(WaveformSeriesObservation waveformSeriesObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return waveformSeriesObservation.validateWaveformSeriesObservationPHMRProductInstanceReference(diagnostics, context);
  }

  /**
   * Validates the validateWaveformSeriesObservationObservationMediaJPG constraint of '<em>Waveform Series Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateWaveformSeriesObservation_validateWaveformSeriesObservationObservationMediaJPG(WaveformSeriesObservation waveformSeriesObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return waveformSeriesObservation.validateWaveformSeriesObservationObservationMediaJPG(diagnostics, context);
  }

	/**
   * Validates the validateWaveformSeriesObservationObservationNullFlavor constraint of '<em>Waveform Series Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateWaveformSeriesObservation_validateWaveformSeriesObservationObservationNullFlavor(WaveformSeriesObservation waveformSeriesObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return waveformSeriesObservation.validateWaveformSeriesObservationObservationNullFlavor(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateResults(Results results, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(results, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(results, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(results, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(results, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(results, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(results, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(results, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(results, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(results, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(results, diagnostics, context);
    if (result || diagnostics != null) result &= validateResults_validateResultsSectionTemplateId(results, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionCode(results, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionTitle(results, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionText(results, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionResultOrganizer(results, diagnostics, context);
    if (result || diagnostics != null) result &= validateResults_validateResultsResultOrganizer(results, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateResultsResultOrganizer constraint of '<em>Results</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateResults_validateResultsResultOrganizer(Results results, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return results.validateResultsResultOrganizer(diagnostics, context);
  }

	/**
   * Validates the validateResultsSectionTemplateId constraint of '<em>Results</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateResults_validateResultsSectionTemplateId(Results results, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return results.validateResultsSectionTemplateId(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateParticipantRole(ParticipantRole participantRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(participantRole, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(participantRole, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(participantRole, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(participantRole, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(participantRole, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(participantRole, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(participantRole, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(participantRole, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateParticipantRole_validatePlayingEntityChoice(participantRole, diagnostics, context);
    if (result || diagnostics != null) result &= validateParticipantRole_validatePhmrParticipantRoleTemplateId(participantRole, diagnostics, context);
    if (result || diagnostics != null) result &= validateParticipantRole_validatePhmrParticipantRoleId(participantRole, diagnostics, context);
    return result;
  }

	/**
   * Validates the validatePhmrParticipantRoleTemplateId constraint of '<em>Participant Role</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateParticipantRole_validatePhmrParticipantRoleTemplateId(ParticipantRole participantRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return participantRole.validatePhmrParticipantRoleTemplateId(diagnostics, context);
  }

	/**
   * Validates the validatePhmrParticipantRoleId constraint of '<em>Participant Role</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateParticipantRole_validatePhmrParticipantRoleId(ParticipantRole participantRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return participantRole.validatePhmrParticipantRoleId(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePHMRProductInstance(PHMRProductInstance phmrProductInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(phmrProductInstance, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(phmrProductInstance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(phmrProductInstance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(phmrProductInstance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(phmrProductInstance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(phmrProductInstance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(phmrProductInstance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(phmrProductInstance, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateParticipantRole_validatePlayingEntityChoice(phmrProductInstance, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProductInstance_validateProductInstanceHasScopingEntity(phmrProductInstance, diagnostics, context);
    if (result || diagnostics != null) result &= validatePHMRProductInstance_validateProductInstanceTemplateId(phmrProductInstance, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProductInstance_validateProductInstanceClassCode(phmrProductInstance, diagnostics, context);
    if (result || diagnostics != null) result &= validatePHMRProductInstance_validatePHMRProductInstanceCode(phmrProductInstance, diagnostics, context);
    if (result || diagnostics != null) result &= validatePHMRProductInstance_validatePHMRProductInstanceId(phmrProductInstance, diagnostics, context);
    if (result || diagnostics != null) result &= validatePHMRProductInstance_validatePHMRProductInstanceScopingEntity(phmrProductInstance, diagnostics, context);
    if (result || diagnostics != null) result &= validatePHMRProductInstance_validatePHMRProductInstancePlayingDevice(phmrProductInstance, diagnostics, context);
    return result;
  }

	/**
   * Validates the validatePHMRProductInstanceCode constraint of '<em>PHMR Product Instance</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePHMRProductInstance_validatePHMRProductInstanceCode(PHMRProductInstance phmrProductInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phmrProductInstance.validatePHMRProductInstanceCode(diagnostics, context);
  }

	/**
   * Validates the validatePHMRProductInstanceId constraint of '<em>PHMR Product Instance</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePHMRProductInstance_validatePHMRProductInstanceId(PHMRProductInstance phmrProductInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phmrProductInstance.validatePHMRProductInstanceId(diagnostics, context);
  }

	/**
   * Validates the validatePHMRProductInstanceScopingEntity constraint of '<em>PHMR Product Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePHMRProductInstance_validatePHMRProductInstanceScopingEntity(PHMRProductInstance phmrProductInstance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return phmrProductInstance.validatePHMRProductInstanceScopingEntity(diagnostics, context);
  }

  /**
   * Validates the validatePHMRProductInstancePlayingDevice constraint of '<em>PHMR Product Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePHMRProductInstance_validatePHMRProductInstancePlayingDevice(PHMRProductInstance phmrProductInstance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return phmrProductInstance.validatePHMRProductInstancePlayingDevice(diagnostics, context);
  }

  /**
   * Validates the validateProductInstanceTemplateId constraint of '<em>PHMR Product Instance</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePHMRProductInstance_validateProductInstanceTemplateId(PHMRProductInstance phmrProductInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phmrProductInstance.validateProductInstanceTemplateId(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePHMRProductInstanceReference(PHMRProductInstanceReference phmrProductInstanceReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(phmrProductInstanceReference, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(phmrProductInstanceReference, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(phmrProductInstanceReference, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(phmrProductInstanceReference, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(phmrProductInstanceReference, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(phmrProductInstanceReference, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(phmrProductInstanceReference, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(phmrProductInstanceReference, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateParticipant2_validateContextControlCode(phmrProductInstanceReference, diagnostics, context);
    if (result || diagnostics != null) result &= validatePHMRProductInstanceReference_validatePHMRProductInstanceReferenceTemplateId(phmrProductInstanceReference, diagnostics, context);
    if (result || diagnostics != null) result &= validatePHMRProductInstanceReference_validatePHMRProductInstanceReferenceTypeCode(phmrProductInstanceReference, diagnostics, context);
    if (result || diagnostics != null) result &= validatePHMRProductInstanceReference_validatePHMRProductInstanceReferenceParticipantRole(phmrProductInstanceReference, diagnostics, context);
    return result;
  }

	/**
   * Validates the validatePHMRProductInstanceReferenceTemplateId constraint of '<em>PHMR Product Instance Reference</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePHMRProductInstanceReference_validatePHMRProductInstanceReferenceTemplateId(PHMRProductInstanceReference phmrProductInstanceReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phmrProductInstanceReference.validatePHMRProductInstanceReferenceTemplateId(diagnostics, context);
  }

	/**
   * Validates the validatePHMRProductInstanceReferenceTypeCode constraint of '<em>PHMR Product Instance Reference</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePHMRProductInstanceReference_validatePHMRProductInstanceReferenceTypeCode(PHMRProductInstanceReference phmrProductInstanceReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phmrProductInstanceReference.validatePHMRProductInstanceReferenceTypeCode(diagnostics, context);
  }

	/**
   * Validates the validatePHMRProductInstanceReferenceParticipantRole constraint of '<em>PHMR Product Instance Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePHMRProductInstanceReference_validatePHMRProductInstanceReferenceParticipantRole(PHMRProductInstanceReference phmrProductInstanceReference, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return phmrProductInstanceReference.validatePHMRProductInstanceReferenceParticipantRole(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePlayingDevice(PlayingDevice playingDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(playingDevice, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(playingDevice, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(playingDevice, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(playingDevice, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(playingDevice, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(playingDevice, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(playingDevice, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(playingDevice, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateDevice_validateDeterminerCode(playingDevice, diagnostics, context);
    if (result || diagnostics != null) result &= validatePlayingDevice_validatePlayingDeviceTemplateId(playingDevice, diagnostics, context);
    if (result || diagnostics != null) result &= validatePlayingDevice_validatePlayingDeviceCode(playingDevice, diagnostics, context);
    if (result || diagnostics != null) result &= validatePlayingDevice_validatePlayingDeviceManufacturerModelName(playingDevice, diagnostics, context);
    return result;
  }

	/**
   * Validates the validatePlayingDeviceTemplateId constraint of '<em>Playing Device</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePlayingDevice_validatePlayingDeviceTemplateId(PlayingDevice playingDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return playingDevice.validatePlayingDeviceTemplateId(diagnostics, context);
  }

	/**
   * Validates the validatePlayingDeviceCode constraint of '<em>Playing Device</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePlayingDevice_validatePlayingDeviceCode(PlayingDevice playingDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return playingDevice.validatePlayingDeviceCode(diagnostics, context);
  }

	/**
   * Validates the validatePlayingDeviceManufacturerModelName constraint of '<em>Playing Device</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePlayingDevice_validatePlayingDeviceManufacturerModelName(PlayingDevice playingDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return playingDevice.validatePlayingDeviceManufacturerModelName(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateScopingEntity(ScopingEntity scopingEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(scopingEntity, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(scopingEntity, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(scopingEntity, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(scopingEntity, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(scopingEntity, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(scopingEntity, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(scopingEntity, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(scopingEntity, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateEntity_validateDeterminerCode(scopingEntity, diagnostics, context);
    if (result || diagnostics != null) result &= validateScopingEntity_validateScopingEntityTemplateId(scopingEntity, diagnostics, context);
    if (result || diagnostics != null) result &= validateScopingEntity_validateScopingEntityDesc(scopingEntity, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateScopingEntityTemplateId constraint of '<em>Scoping Entity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateScopingEntity_validateScopingEntityTemplateId(ScopingEntity scopingEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return scopingEntity.validateScopingEntityTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateScopingEntityDesc constraint of '<em>Scoping Entity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateScopingEntity_validateScopingEntityDesc(ScopingEntity scopingEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return scopingEntity.validateScopingEntityDesc(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVitalSignsOrganizer(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(vitalSignsOrganizer, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(vitalSignsOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vitalSignsOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vitalSignsOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(vitalSignsOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(vitalSignsOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(vitalSignsOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vitalSignsOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCodeValue(vitalSignsOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerComponentElement(vitalSignsOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerInformationSource(vitalSignsOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerTemplateId(vitalSignsOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerMoodCode(vitalSignsOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerId(vitalSignsOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCode(vitalSignsOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerStatusCode(vitalSignsOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerResultObservation(vitalSignsOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerSpecimen(vitalSignsOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateResultOrganizer_validatePhmrResultOrganizerNumericObservation(vitalSignsOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateResultOrganizer_validatePhmrResultOrganizerWaveformSeriesObservation(vitalSignsOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateVitalSignsOrganizer_validateVitalSignsOrganizerTemplateId(vitalSignsOrganizer, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateVitalSignsOrganizerTemplateId constraint of '<em>Vital Signs Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateVitalSignsOrganizer_validateVitalSignsOrganizerTemplateId(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return vitalSignsOrganizer.validateVitalSignsOrganizerTemplateId(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePurpose(Purpose purpose, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(purpose, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(purpose, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(purpose, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(purpose, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(purpose, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(purpose, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(purpose, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(purpose, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(purpose, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(purpose, diagnostics, context);
    if (result || diagnostics != null) result &= validatePurpose_validatePurposeSectionTemplateId(purpose, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validatePurposeSection_validatePurposeSectionCode(purpose, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validatePurposeSection_validatePurposeSectionTitle(purpose, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validatePurposeSection_validatePurposeSectionText(purpose, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validatePurposeSection_validatePurposeSectionPurposeActivity(purpose, diagnostics, context);
    return result;
  }

	/**
   * Validates the validatePurposeSectionTemplateId constraint of '<em>Purpose</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePurpose_validatePurposeSectionTemplateId(Purpose purpose, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return purpose.validatePurposeSectionTemplateId(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedication(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(medication, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(medication, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medication, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medication, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(medication, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(medication, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(medication, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medication, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(medication, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(medication, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionHasMedicationOrSupplyActivity(medication, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedication_validateMedicationsSectionTemplateId(medication, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionCode(medication, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionTitle(medication, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionText(medication, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionMedicationActivity(medication, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionSupplyActivity(medication, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateMedicationsSectionTemplateId constraint of '<em>Medication</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedication_validateMedicationsSectionTemplateId(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medication.validateMedicationsSectionTemplateId(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFunctionalStatus(FunctionalStatus functionalStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(functionalStatus, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(functionalStatus, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(functionalStatus, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(functionalStatus, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(functionalStatus, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(functionalStatus, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(functionalStatus, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(functionalStatus, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(functionalStatus, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(functionalStatus, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionClinicalStatements(functionalStatus, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionObservationCode(functionalStatus, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionObservationCodeValueSet(functionalStatus, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionValueDatatype(functionalStatus, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionIcfCodeSystem(functionalStatus, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionProblemStatusObservation(functionalStatus, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionResultStatusObservation(functionalStatus, diagnostics, context);
    if (result || diagnostics != null) result &= validateFunctionalStatus_validateFunctionalStatusSectionTemplateId(functionalStatus, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionCode(functionalStatus, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionTitle(functionalStatus, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionText(functionalStatus, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateFunctionalStatusSectionTemplateId constraint of '<em>Functional Status</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFunctionalStatus_validateFunctionalStatusSectionTemplateId(FunctionalStatus functionalStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return functionalStatus.validateFunctionalStatusSectionTemplateId(diagnostics, context);
  }

	/**
   * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public ResourceLocator getResourceLocator() {
    return PhmrPlugin.INSTANCE;
  }

} //PhmrValidator
