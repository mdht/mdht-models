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
package org.openhealthtools.mdht.uml.cda.phmr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.operations.OrganizerOperations;

import org.openhealthtools.mdht.uml.cda.phmr.DeviceAccuracyObservation;
import org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer;
import org.openhealthtools.mdht.uml.cda.phmr.DeviceMeasurementRangeObservation;
import org.openhealthtools.mdht.uml.cda.phmr.DeviceResolutionObservation;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPlugin;
import org.openhealthtools.mdht.uml.cda.phmr.SamplingFrequencyObservation;

import org.openhealthtools.mdht.uml.cda.phmr.util.PhmrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Device Definition Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#validateDeviceDefinitionOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#validateDeviceDefinitionOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#validateDeviceDefinitionOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#validateDeviceDefinitionOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#validateDeviceDefinitionOrganizerSamplingFrequencyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Sampling Frequency Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#validateDeviceDefinitionOrganizerDeviceMeasurementRangeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Device Measurement Range Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#validateDeviceDefinitionOrganizerDeviceResolutionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Device Resolution Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#validateDeviceDefinitionOrganizerDeviceAccuracyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Device Accuracy Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#validateDeviceDefinitionOrganizerParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#getSamplingFrequencyObservation() <em>Get Sampling Frequency Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#getDeviceMeasurementRangeObservation() <em>Get Device Measurement Range Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#getDeviceResolutionObservation() <em>Get Device Resolution Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#getDeviceAccuracyObservation() <em>Get Device Accuracy Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceDefinitionOrganizerOperations extends OrganizerOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected DeviceDefinitionOrganizerOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateDeviceDefinitionOrganizerTemplateId(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDeviceDefinitionOrganizerTemplateId(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_DEVICE_DEFINITION_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.9.4')";

	/**
   * The cached OCL invariant for the '{@link #validateDeviceDefinitionOrganizerTemplateId(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDeviceDefinitionOrganizerTemplateId(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_DEVICE_DEFINITION_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deviceDefinitionOrganizer The receiving '<em><b>Device Definition Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateDeviceDefinitionOrganizerTemplateId(DeviceDefinitionOrganizer deviceDefinitionOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_DEVICE_DEFINITION_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.DEVICE_DEFINITION_ORGANIZER);
      try
      {
        VALIDATE_DEVICE_DEFINITION_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEVICE_DEFINITION_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEVICE_DEFINITION_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deviceDefinitionOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.DEVICE_DEFINITION_ORGANIZER__DEVICE_DEFINITION_ORGANIZER_TEMPLATE_ID,
             PhmrPlugin.INSTANCE.getString("DeviceDefinitionOrganizerTemplateId"),
             new Object [] { deviceDefinitionOrganizer }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateDeviceDefinitionOrganizerClassCode(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Class Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDeviceDefinitionOrganizerClassCode(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_DEVICE_DEFINITION_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryOrganizer::CLUSTER";

	/**
   * The cached OCL invariant for the '{@link #validateDeviceDefinitionOrganizerClassCode(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDeviceDefinitionOrganizerClassCode(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_DEVICE_DEFINITION_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deviceDefinitionOrganizer The receiving '<em><b>Device Definition Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateDeviceDefinitionOrganizerClassCode(DeviceDefinitionOrganizer deviceDefinitionOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_DEVICE_DEFINITION_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.DEVICE_DEFINITION_ORGANIZER);
      try
      {
        VALIDATE_DEVICE_DEFINITION_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEVICE_DEFINITION_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEVICE_DEFINITION_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deviceDefinitionOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.DEVICE_DEFINITION_ORGANIZER__DEVICE_DEFINITION_ORGANIZER_CLASS_CODE,
             PhmrPlugin.INSTANCE.getString("DeviceDefinitionOrganizerClassCode"),
             new Object [] { deviceDefinitionOrganizer }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateDeviceDefinitionOrganizerEffectiveTime(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDeviceDefinitionOrganizerEffectiveTime(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_DEVICE_DEFINITION_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateDeviceDefinitionOrganizerEffectiveTime(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDeviceDefinitionOrganizerEffectiveTime(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_DEVICE_DEFINITION_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deviceDefinitionOrganizer The receiving '<em><b>Device Definition Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateDeviceDefinitionOrganizerEffectiveTime(DeviceDefinitionOrganizer deviceDefinitionOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_DEVICE_DEFINITION_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.DEVICE_DEFINITION_ORGANIZER);
      try
      {
        VALIDATE_DEVICE_DEFINITION_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEVICE_DEFINITION_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEVICE_DEFINITION_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deviceDefinitionOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.DEVICE_DEFINITION_ORGANIZER__DEVICE_DEFINITION_ORGANIZER_EFFECTIVE_TIME,
             PhmrPlugin.INSTANCE.getString("DeviceDefinitionOrganizerEffectiveTime"),
             new Object [] { deviceDefinitionOrganizer }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateDeviceDefinitionOrganizerMoodCode(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDeviceDefinitionOrganizerMoodCode(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_DEVICE_DEFINITION_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::ActMood::EVN";

	/**
   * The cached OCL invariant for the '{@link #validateDeviceDefinitionOrganizerMoodCode(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDeviceDefinitionOrganizerMoodCode(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_DEVICE_DEFINITION_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deviceDefinitionOrganizer The receiving '<em><b>Device Definition Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateDeviceDefinitionOrganizerMoodCode(DeviceDefinitionOrganizer deviceDefinitionOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_DEVICE_DEFINITION_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.DEVICE_DEFINITION_ORGANIZER);
      try
      {
        VALIDATE_DEVICE_DEFINITION_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEVICE_DEFINITION_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEVICE_DEFINITION_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deviceDefinitionOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.DEVICE_DEFINITION_ORGANIZER__DEVICE_DEFINITION_ORGANIZER_MOOD_CODE,
             PhmrPlugin.INSTANCE.getString("DeviceDefinitionOrganizerMoodCode"),
             new Object [] { deviceDefinitionOrganizer }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateDeviceDefinitionOrganizerSamplingFrequencyObservation(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Sampling Frequency Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDeviceDefinitionOrganizerSamplingFrequencyObservation(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_DEVICE_DEFINITION_ORGANIZER_SAMPLING_FREQUENCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(phmr::SamplingFrequencyObservation))";

	/**
   * The cached OCL invariant for the '{@link #validateDeviceDefinitionOrganizerSamplingFrequencyObservation(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Sampling Frequency Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDeviceDefinitionOrganizerSamplingFrequencyObservation(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_DEVICE_DEFINITION_ORGANIZER_SAMPLING_FREQUENCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deviceDefinitionOrganizer The receiving '<em><b>Device Definition Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateDeviceDefinitionOrganizerSamplingFrequencyObservation(DeviceDefinitionOrganizer deviceDefinitionOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_DEVICE_DEFINITION_ORGANIZER_SAMPLING_FREQUENCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.DEVICE_DEFINITION_ORGANIZER);
      try
      {
        VALIDATE_DEVICE_DEFINITION_ORGANIZER_SAMPLING_FREQUENCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEVICE_DEFINITION_ORGANIZER_SAMPLING_FREQUENCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEVICE_DEFINITION_ORGANIZER_SAMPLING_FREQUENCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deviceDefinitionOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.DEVICE_DEFINITION_ORGANIZER__DEVICE_DEFINITION_ORGANIZER_SAMPLING_FREQUENCY_OBSERVATION,
             PhmrPlugin.INSTANCE.getString("DeviceDefinitionOrganizerSamplingFrequencyObservation"),
             new Object [] { deviceDefinitionOrganizer }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateDeviceDefinitionOrganizerDeviceMeasurementRangeObservation(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Device Measurement Range Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDeviceDefinitionOrganizerDeviceMeasurementRangeObservation(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_DEVICE_DEFINITION_ORGANIZER_DEVICE_MEASUREMENT_RANGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(phmr::DeviceMeasurementRangeObservation))";

	/**
   * The cached OCL invariant for the '{@link #validateDeviceDefinitionOrganizerDeviceMeasurementRangeObservation(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Device Measurement Range Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDeviceDefinitionOrganizerDeviceMeasurementRangeObservation(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_DEVICE_DEFINITION_ORGANIZER_DEVICE_MEASUREMENT_RANGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deviceDefinitionOrganizer The receiving '<em><b>Device Definition Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateDeviceDefinitionOrganizerDeviceMeasurementRangeObservation(DeviceDefinitionOrganizer deviceDefinitionOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_DEVICE_DEFINITION_ORGANIZER_DEVICE_MEASUREMENT_RANGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.DEVICE_DEFINITION_ORGANIZER);
      try
      {
        VALIDATE_DEVICE_DEFINITION_ORGANIZER_DEVICE_MEASUREMENT_RANGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEVICE_DEFINITION_ORGANIZER_DEVICE_MEASUREMENT_RANGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEVICE_DEFINITION_ORGANIZER_DEVICE_MEASUREMENT_RANGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deviceDefinitionOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.DEVICE_DEFINITION_ORGANIZER__DEVICE_DEFINITION_ORGANIZER_DEVICE_MEASUREMENT_RANGE_OBSERVATION,
             PhmrPlugin.INSTANCE.getString("DeviceDefinitionOrganizerDeviceMeasurementRangeObservation"),
             new Object [] { deviceDefinitionOrganizer }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateDeviceDefinitionOrganizerDeviceResolutionObservation(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Device Resolution Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDeviceDefinitionOrganizerDeviceResolutionObservation(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_DEVICE_DEFINITION_ORGANIZER_DEVICE_RESOLUTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(phmr::DeviceResolutionObservation))";

	/**
   * The cached OCL invariant for the '{@link #validateDeviceDefinitionOrganizerDeviceResolutionObservation(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Device Resolution Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDeviceDefinitionOrganizerDeviceResolutionObservation(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_DEVICE_DEFINITION_ORGANIZER_DEVICE_RESOLUTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deviceDefinitionOrganizer The receiving '<em><b>Device Definition Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateDeviceDefinitionOrganizerDeviceResolutionObservation(DeviceDefinitionOrganizer deviceDefinitionOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_DEVICE_DEFINITION_ORGANIZER_DEVICE_RESOLUTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.DEVICE_DEFINITION_ORGANIZER);
      try
      {
        VALIDATE_DEVICE_DEFINITION_ORGANIZER_DEVICE_RESOLUTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEVICE_DEFINITION_ORGANIZER_DEVICE_RESOLUTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEVICE_DEFINITION_ORGANIZER_DEVICE_RESOLUTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deviceDefinitionOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.DEVICE_DEFINITION_ORGANIZER__DEVICE_DEFINITION_ORGANIZER_DEVICE_RESOLUTION_OBSERVATION,
             PhmrPlugin.INSTANCE.getString("DeviceDefinitionOrganizerDeviceResolutionObservation"),
             new Object [] { deviceDefinitionOrganizer }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateDeviceDefinitionOrganizerDeviceAccuracyObservation(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Device Accuracy Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDeviceDefinitionOrganizerDeviceAccuracyObservation(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_DEVICE_DEFINITION_ORGANIZER_DEVICE_ACCURACY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(phmr::DeviceAccuracyObservation))";

	/**
   * The cached OCL invariant for the '{@link #validateDeviceDefinitionOrganizerDeviceAccuracyObservation(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Device Accuracy Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateDeviceDefinitionOrganizerDeviceAccuracyObservation(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_DEVICE_DEFINITION_ORGANIZER_DEVICE_ACCURACY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deviceDefinitionOrganizer The receiving '<em><b>Device Definition Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateDeviceDefinitionOrganizerDeviceAccuracyObservation(DeviceDefinitionOrganizer deviceDefinitionOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_DEVICE_DEFINITION_ORGANIZER_DEVICE_ACCURACY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.DEVICE_DEFINITION_ORGANIZER);
      try
      {
        VALIDATE_DEVICE_DEFINITION_ORGANIZER_DEVICE_ACCURACY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEVICE_DEFINITION_ORGANIZER_DEVICE_ACCURACY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEVICE_DEFINITION_ORGANIZER_DEVICE_ACCURACY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deviceDefinitionOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.DEVICE_DEFINITION_ORGANIZER__DEVICE_DEFINITION_ORGANIZER_DEVICE_ACCURACY_OBSERVATION,
             PhmrPlugin.INSTANCE.getString("DeviceDefinitionOrganizerDeviceAccuracyObservation"),
             new Object [] { deviceDefinitionOrganizer }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateDeviceDefinitionOrganizerParticipant(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Participant</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeviceDefinitionOrganizerParticipant(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEVICE_DEFINITION_ORGANIZER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

  /**
   * The cached OCL invariant for the '{@link #validateDeviceDefinitionOrganizerParticipant(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Participant</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeviceDefinitionOrganizerParticipant(DeviceDefinitionOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEVICE_DEFINITION_ORGANIZER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deviceDefinitionOrganizer The receiving '<em><b>Device Definition Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeviceDefinitionOrganizerParticipant(DeviceDefinitionOrganizer deviceDefinitionOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEVICE_DEFINITION_ORGANIZER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.DEVICE_DEFINITION_ORGANIZER);
      try
      {
        VALIDATE_DEVICE_DEFINITION_ORGANIZER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEVICE_DEFINITION_ORGANIZER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEVICE_DEFINITION_ORGANIZER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deviceDefinitionOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.DEVICE_DEFINITION_ORGANIZER__DEVICE_DEFINITION_ORGANIZER_PARTICIPANT,
             PhmrPlugin.INSTANCE.getString("DeviceDefinitionOrganizerParticipant"),
             new Object [] { deviceDefinitionOrganizer }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getSamplingFrequencyObservation(DeviceDefinitionOrganizer) <em>Get Sampling Frequency Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSamplingFrequencyObservation(DeviceDefinitionOrganizer)
   * @generated
   * @ordered
   */
	protected static final String GET_SAMPLING_FREQUENCY_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phmr::SamplingFrequencyObservation))->asSequence()->any(true).oclAsType(phmr::SamplingFrequencyObservation)";

	/**
   * The cached OCL query for the '{@link #getSamplingFrequencyObservation(DeviceDefinitionOrganizer) <em>Get Sampling Frequency Observation</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSamplingFrequencyObservation(DeviceDefinitionOrganizer)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_SAMPLING_FREQUENCY_OBSERVATION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static  SamplingFrequencyObservation getSamplingFrequencyObservation(DeviceDefinitionOrganizer deviceDefinitionOrganizer) {
    if (GET_SAMPLING_FREQUENCY_OBSERVATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(PhmrPackage.Literals.DEVICE_DEFINITION_ORGANIZER, PhmrPackage.Literals.DEVICE_DEFINITION_ORGANIZER.getEAllOperations().get(61));
      try
      {
        GET_SAMPLING_FREQUENCY_OBSERVATION__EOCL_QRY = helper.createQuery(GET_SAMPLING_FREQUENCY_OBSERVATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SAMPLING_FREQUENCY_OBSERVATION__EOCL_QRY);
    return (SamplingFrequencyObservation) query.evaluate(deviceDefinitionOrganizer);
  }

	/**
   * The cached OCL expression body for the '{@link #getDeviceMeasurementRangeObservation(DeviceDefinitionOrganizer) <em>Get Device Measurement Range Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDeviceMeasurementRangeObservation(DeviceDefinitionOrganizer)
   * @generated
   * @ordered
   */
	protected static final String GET_DEVICE_MEASUREMENT_RANGE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phmr::DeviceMeasurementRangeObservation))->asSequence()->any(true).oclAsType(phmr::DeviceMeasurementRangeObservation)";

	/**
   * The cached OCL query for the '{@link #getDeviceMeasurementRangeObservation(DeviceDefinitionOrganizer) <em>Get Device Measurement Range Observation</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDeviceMeasurementRangeObservation(DeviceDefinitionOrganizer)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_DEVICE_MEASUREMENT_RANGE_OBSERVATION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static  DeviceMeasurementRangeObservation getDeviceMeasurementRangeObservation(DeviceDefinitionOrganizer deviceDefinitionOrganizer) {
    if (GET_DEVICE_MEASUREMENT_RANGE_OBSERVATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(PhmrPackage.Literals.DEVICE_DEFINITION_ORGANIZER, PhmrPackage.Literals.DEVICE_DEFINITION_ORGANIZER.getEAllOperations().get(62));
      try
      {
        GET_DEVICE_MEASUREMENT_RANGE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_DEVICE_MEASUREMENT_RANGE_OBSERVATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_DEVICE_MEASUREMENT_RANGE_OBSERVATION__EOCL_QRY);
    return (DeviceMeasurementRangeObservation) query.evaluate(deviceDefinitionOrganizer);
  }

	/**
   * The cached OCL expression body for the '{@link #getDeviceResolutionObservation(DeviceDefinitionOrganizer) <em>Get Device Resolution Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDeviceResolutionObservation(DeviceDefinitionOrganizer)
   * @generated
   * @ordered
   */
	protected static final String GET_DEVICE_RESOLUTION_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phmr::DeviceResolutionObservation))->asSequence()->any(true).oclAsType(phmr::DeviceResolutionObservation)";

	/**
   * The cached OCL query for the '{@link #getDeviceResolutionObservation(DeviceDefinitionOrganizer) <em>Get Device Resolution Observation</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDeviceResolutionObservation(DeviceDefinitionOrganizer)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_DEVICE_RESOLUTION_OBSERVATION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static  DeviceResolutionObservation getDeviceResolutionObservation(DeviceDefinitionOrganizer deviceDefinitionOrganizer) {
    if (GET_DEVICE_RESOLUTION_OBSERVATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(PhmrPackage.Literals.DEVICE_DEFINITION_ORGANIZER, PhmrPackage.Literals.DEVICE_DEFINITION_ORGANIZER.getEAllOperations().get(63));
      try
      {
        GET_DEVICE_RESOLUTION_OBSERVATION__EOCL_QRY = helper.createQuery(GET_DEVICE_RESOLUTION_OBSERVATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_DEVICE_RESOLUTION_OBSERVATION__EOCL_QRY);
    return (DeviceResolutionObservation) query.evaluate(deviceDefinitionOrganizer);
  }

	/**
   * The cached OCL expression body for the '{@link #getDeviceAccuracyObservation(DeviceDefinitionOrganizer) <em>Get Device Accuracy Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDeviceAccuracyObservation(DeviceDefinitionOrganizer)
   * @generated
   * @ordered
   */
	protected static final String GET_DEVICE_ACCURACY_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phmr::DeviceAccuracyObservation))->asSequence()->any(true).oclAsType(phmr::DeviceAccuracyObservation)";

	/**
   * The cached OCL query for the '{@link #getDeviceAccuracyObservation(DeviceDefinitionOrganizer) <em>Get Device Accuracy Observation</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDeviceAccuracyObservation(DeviceDefinitionOrganizer)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_DEVICE_ACCURACY_OBSERVATION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static  DeviceAccuracyObservation getDeviceAccuracyObservation(DeviceDefinitionOrganizer deviceDefinitionOrganizer) {
    if (GET_DEVICE_ACCURACY_OBSERVATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(PhmrPackage.Literals.DEVICE_DEFINITION_ORGANIZER, PhmrPackage.Literals.DEVICE_DEFINITION_ORGANIZER.getEAllOperations().get(64));
      try
      {
        GET_DEVICE_ACCURACY_OBSERVATION__EOCL_QRY = helper.createQuery(GET_DEVICE_ACCURACY_OBSERVATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_DEVICE_ACCURACY_OBSERVATION__EOCL_QRY);
    return (DeviceAccuracyObservation) query.evaluate(deviceDefinitionOrganizer);
  }

} // DeviceDefinitionOrganizerOperations