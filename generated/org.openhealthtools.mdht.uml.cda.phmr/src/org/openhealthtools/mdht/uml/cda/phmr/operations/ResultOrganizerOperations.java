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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.phmr.NumericObservation;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPlugin;
import org.openhealthtools.mdht.uml.cda.phmr.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation;

import org.openhealthtools.mdht.uml.cda.phmr.util.PhmrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ResultOrganizer#validatePHMRResultOrganizerNumericObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Result Organizer Numeric Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ResultOrganizer#validatePHMRResultOrganizerWaveformSeriesObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Result Organizer Waveform Series Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ResultOrganizer#getNumericObservations() <em>Get Numeric Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ResultOrganizer#getWaveformSeriesObservations() <em>Get Waveform Series Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultOrganizerOperations extends org.openhealthtools.mdht.uml.cda.ccd.operations.ResultOrganizerOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ResultOrganizerOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validatePHMRResultOrganizerNumericObservation(ResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Result Organizer Numeric Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePHMRResultOrganizerNumericObservation(ResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PHMR_RESULT_ORGANIZER_NUMERIC_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(phmr::NumericObservation))";

	/**
   * The cached OCL invariant for the '{@link #validatePHMRResultOrganizerNumericObservation(ResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Result Organizer Numeric Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePHMRResultOrganizerNumericObservation(ResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PHMR_RESULT_ORGANIZER_NUMERIC_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param resultOrganizer The receiving '<em><b>Result Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePHMRResultOrganizerNumericObservation(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHMR_RESULT_ORGANIZER_NUMERIC_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.RESULT_ORGANIZER);
      try
      {
        VALIDATE_PHMR_RESULT_ORGANIZER_NUMERIC_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHMR_RESULT_ORGANIZER_NUMERIC_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHMR_RESULT_ORGANIZER_NUMERIC_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(resultOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.RESULT_ORGANIZER__PHMR_RESULT_ORGANIZER_NUMERIC_OBSERVATION,
             PhmrPlugin.INSTANCE.getString("PHMRResultOrganizerNumericObservation"),
             new Object [] { resultOrganizer }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePHMRResultOrganizerWaveformSeriesObservation(ResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Result Organizer Waveform Series Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePHMRResultOrganizerWaveformSeriesObservation(ResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PHMR_RESULT_ORGANIZER_WAVEFORM_SERIES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(phmr::WaveformSeriesObservation))";

	/**
   * The cached OCL invariant for the '{@link #validatePHMRResultOrganizerWaveformSeriesObservation(ResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Result Organizer Waveform Series Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePHMRResultOrganizerWaveformSeriesObservation(ResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PHMR_RESULT_ORGANIZER_WAVEFORM_SERIES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param resultOrganizer The receiving '<em><b>Result Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePHMRResultOrganizerWaveformSeriesObservation(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHMR_RESULT_ORGANIZER_WAVEFORM_SERIES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.RESULT_ORGANIZER);
      try
      {
        VALIDATE_PHMR_RESULT_ORGANIZER_WAVEFORM_SERIES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHMR_RESULT_ORGANIZER_WAVEFORM_SERIES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHMR_RESULT_ORGANIZER_WAVEFORM_SERIES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(resultOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.RESULT_ORGANIZER__PHMR_RESULT_ORGANIZER_WAVEFORM_SERIES_OBSERVATION,
             PhmrPlugin.INSTANCE.getString("PHMRResultOrganizerWaveformSeriesObservation"),
             new Object [] { resultOrganizer }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getNumericObservations(ResultOrganizer) <em>Get Numeric Observations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNumericObservations(ResultOrganizer)
   * @generated
   * @ordered
   */
	protected static final String GET_NUMERIC_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phmr::NumericObservation)).oclAsType(phmr::NumericObservation)";

	/**
   * The cached OCL query for the '{@link #getNumericObservations(ResultOrganizer) <em>Get Numeric Observations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNumericObservations(ResultOrganizer)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_NUMERIC_OBSERVATIONS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static  EList<NumericObservation> getNumericObservations(ResultOrganizer resultOrganizer) {
    if (GET_NUMERIC_OBSERVATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(PhmrPackage.Literals.RESULT_ORGANIZER, PhmrPackage.Literals.RESULT_ORGANIZER.getEAllOperations().get(65));
      try
      {
        GET_NUMERIC_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_NUMERIC_OBSERVATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_NUMERIC_OBSERVATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<NumericObservation> result = (Collection<NumericObservation>) query.evaluate(resultOrganizer);
    return new BasicEList.UnmodifiableEList<NumericObservation>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #getWaveformSeriesObservations(ResultOrganizer) <em>Get Waveform Series Observations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getWaveformSeriesObservations(ResultOrganizer)
   * @generated
   * @ordered
   */
	protected static final String GET_WAVEFORM_SERIES_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phmr::WaveformSeriesObservation)).oclAsType(phmr::WaveformSeriesObservation)";

	/**
   * The cached OCL query for the '{@link #getWaveformSeriesObservations(ResultOrganizer) <em>Get Waveform Series Observations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getWaveformSeriesObservations(ResultOrganizer)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_WAVEFORM_SERIES_OBSERVATIONS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static  EList<WaveformSeriesObservation> getWaveformSeriesObservations(ResultOrganizer resultOrganizer) {
    if (GET_WAVEFORM_SERIES_OBSERVATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(PhmrPackage.Literals.RESULT_ORGANIZER, PhmrPackage.Literals.RESULT_ORGANIZER.getEAllOperations().get(66));
      try
      {
        GET_WAVEFORM_SERIES_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_WAVEFORM_SERIES_OBSERVATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_WAVEFORM_SERIES_OBSERVATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<WaveformSeriesObservation> result = (Collection<WaveformSeriesObservation>) query.evaluate(resultOrganizer);
    return new BasicEList.UnmodifiableEList<WaveformSeriesObservation>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #validateResultOrganizerTemplateId(ResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateResultOrganizerTemplateId(ResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = 'null')";

	/**
   * The cached OCL invariant for the '{@link #validateResultOrganizerTemplateId(ResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateResultOrganizerTemplateId(ResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param resultOrganizer The receiving '<em><b>Result Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateResultOrganizerTemplateId(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.RESULT_ORGANIZER);
      try
      {
        VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(resultOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID,
             PhmrPlugin.INSTANCE.getString("ResultOrganizerTemplateId"),
             new Object [] { resultOrganizer }));
      }
       
      return false;
    }
    return true;
  }

} // ResultOrganizerOperations