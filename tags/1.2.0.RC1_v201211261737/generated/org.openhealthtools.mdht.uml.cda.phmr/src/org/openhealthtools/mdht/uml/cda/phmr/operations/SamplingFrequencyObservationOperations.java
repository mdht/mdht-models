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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPlugin;
import org.openhealthtools.mdht.uml.cda.phmr.SamplingFrequencyObservation;

import org.openhealthtools.mdht.uml.cda.phmr.util.PhmrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Sampling Frequency Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.SamplingFrequencyObservation#validateSamplingFrequencyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sampling Frequency Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.SamplingFrequencyObservation#validateSamplingFrequencyObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sampling Frequency Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.SamplingFrequencyObservation#validateSamplingFrequencyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sampling Frequency Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.SamplingFrequencyObservation#validateSamplingFrequencyObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sampling Frequency Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.SamplingFrequencyObservation#validateSamplingFrequencyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sampling Frequency Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SamplingFrequencyObservationOperations extends ClinicalStatementOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SamplingFrequencyObservationOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateSamplingFrequencyObservationTemplateId(SamplingFrequencyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sampling Frequency Observation Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSamplingFrequencyObservationTemplateId(SamplingFrequencyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.9.10')";

	/**
   * The cached OCL invariant for the '{@link #validateSamplingFrequencyObservationTemplateId(SamplingFrequencyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sampling Frequency Observation Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSamplingFrequencyObservationTemplateId(SamplingFrequencyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param samplingFrequencyObservation The receiving '<em><b>Sampling Frequency Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateSamplingFrequencyObservationTemplateId(SamplingFrequencyObservation samplingFrequencyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.SAMPLING_FREQUENCY_OBSERVATION);
      try
      {
        VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(samplingFrequencyObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.SAMPLING_FREQUENCY_OBSERVATION__SAMPLING_FREQUENCY_OBSERVATION_TEMPLATE_ID,
             PhmrPlugin.INSTANCE.getString("SamplingFrequencyObservationTemplateId"),
             new Object [] { samplingFrequencyObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSamplingFrequencyObservationCodeP(SamplingFrequencyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sampling Frequency Observation Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSamplingFrequencyObservationCodeP(SamplingFrequencyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateSamplingFrequencyObservationCodeP(SamplingFrequencyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sampling Frequency Observation Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSamplingFrequencyObservationCodeP(SamplingFrequencyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param samplingFrequencyObservation The receiving '<em><b>Sampling Frequency Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSamplingFrequencyObservationCodeP(SamplingFrequencyObservation samplingFrequencyObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.SAMPLING_FREQUENCY_OBSERVATION);
      try
      {
        VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(samplingFrequencyObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.SAMPLING_FREQUENCY_OBSERVATION__SAMPLING_FREQUENCY_OBSERVATION_CODE_P,
             PhmrPlugin.INSTANCE.getString("SamplingFrequencyObservationCodeP"),
             new Object [] { samplingFrequencyObservation }));
      }
      
      if (context != null) {
        // generate a pass token for my dependent constraints to short-circuit or filter results
        @SuppressWarnings("unchecked")
        Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.phmr.SamplingFrequencyObservationCodeP");
        if (passToken == null) {
          // anticipate a reasonably healthy model
          passToken = new java.util.ArrayList<Object>(3);
          context.put("org.openhealthtools.mdht.uml.cda.phmr.SamplingFrequencyObservationCodeP", passToken);
        }
        passToken.add(samplingFrequencyObservation);
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSamplingFrequencyObservationCode(SamplingFrequencyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sampling Frequency Observation Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSamplingFrequencyObservationCode(SamplingFrequencyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'MDC_ATTR_TIME_PD_SAMP' and value.codeSystem = '2.16.840.1.113883.6.24')";

	/**
   * The cached OCL invariant for the '{@link #validateSamplingFrequencyObservationCode(SamplingFrequencyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sampling Frequency Observation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSamplingFrequencyObservationCode(SamplingFrequencyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param samplingFrequencyObservation The receiving '<em><b>Sampling Frequency Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateSamplingFrequencyObservationCode(SamplingFrequencyObservation samplingFrequencyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.phmr.SamplingFrequencyObservationCodeP");
    if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(samplingFrequencyObservation)) {
      // I have a free pass to short-circuit
      return true;
    }
  	  
    if (VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.SAMPLING_FREQUENCY_OBSERVATION);
      try
      {
        VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(samplingFrequencyObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.SAMPLING_FREQUENCY_OBSERVATION__SAMPLING_FREQUENCY_OBSERVATION_CODE,
             PhmrPlugin.INSTANCE.getString("SamplingFrequencyObservationCode"),
             new Object [] { samplingFrequencyObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSamplingFrequencyObservationMoodCode(SamplingFrequencyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sampling Frequency Observation Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSamplingFrequencyObservationMoodCode(SamplingFrequencyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::DEF";

	/**
   * The cached OCL invariant for the '{@link #validateSamplingFrequencyObservationMoodCode(SamplingFrequencyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sampling Frequency Observation Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSamplingFrequencyObservationMoodCode(SamplingFrequencyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param samplingFrequencyObservation The receiving '<em><b>Sampling Frequency Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateSamplingFrequencyObservationMoodCode(SamplingFrequencyObservation samplingFrequencyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.SAMPLING_FREQUENCY_OBSERVATION);
      try
      {
        VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(samplingFrequencyObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.SAMPLING_FREQUENCY_OBSERVATION__SAMPLING_FREQUENCY_OBSERVATION_MOOD_CODE,
             PhmrPlugin.INSTANCE.getString("SamplingFrequencyObservationMoodCode"),
             new Object [] { samplingFrequencyObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSamplingFrequencyObservationValue(SamplingFrequencyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sampling Frequency Observation Value</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSamplingFrequencyObservationValue(SamplingFrequencyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

	/**
   * The cached OCL invariant for the '{@link #validateSamplingFrequencyObservationValue(SamplingFrequencyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sampling Frequency Observation Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSamplingFrequencyObservationValue(SamplingFrequencyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param samplingFrequencyObservation The receiving '<em><b>Sampling Frequency Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateSamplingFrequencyObservationValue(SamplingFrequencyObservation samplingFrequencyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.SAMPLING_FREQUENCY_OBSERVATION);
      try
      {
        VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(samplingFrequencyObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.SAMPLING_FREQUENCY_OBSERVATION__SAMPLING_FREQUENCY_OBSERVATION_VALUE,
             PhmrPlugin.INSTANCE.getString("SamplingFrequencyObservationValue"),
             new Object [] { samplingFrequencyObservation }));
      }
       
      return false;
    }
    return true;
  }

} // SamplingFrequencyObservationOperations