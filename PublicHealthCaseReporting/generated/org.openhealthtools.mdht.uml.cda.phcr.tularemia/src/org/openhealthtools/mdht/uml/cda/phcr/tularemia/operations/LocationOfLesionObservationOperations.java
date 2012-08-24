/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.util.TularemiaValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Location Of Lesion Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation#validateLocationOfLesionObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation#validateLocationOfLesionObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation#validateLocationOfLesionObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation#validateLocationOfLesionObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation#validateLocationOfLesionObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation#validateLocationOfLesionObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation#validateLocationOfLesionObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation#validateLocationOfLesionObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation#validateLocationOfLesionObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation#validateLocationOfLesionObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Target Site Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationOfLesionObservationOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocationOfLesionObservationOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateLocationOfLesionObservationTemplateId(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationOfLesionObservationTemplateId(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LOCATION_OF_LESION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.44')";

  /**
   * The cached OCL invariant for the '{@link #validateLocationOfLesionObservationTemplateId(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationOfLesionObservationTemplateId(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static Constraint VALIDATE_LOCATION_OF_LESION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param locationOfLesionObservation The receiving '<em><b>Location Of Lesion Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  boolean validateLocationOfLesionObservationTemplateId(LocationOfLesionObservation locationOfLesionObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LOCATION_OF_LESION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TularemiaPackage.Literals.LOCATION_OF_LESION_OBSERVATION);
      try
      {
        VALIDATE_LOCATION_OF_LESION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LOCATION_OF_LESION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LOCATION_OF_LESION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(locationOfLesionObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             TularemiaValidator.DIAGNOSTIC_SOURCE,
             TularemiaValidator.LOCATION_OF_LESION_OBSERVATION__LOCATION_OF_LESION_OBSERVATION_TEMPLATE_ID,
             TularemiaPlugin.INSTANCE.getString("LocationOfLesionObservationTemplateId"),
             new Object [] { locationOfLesionObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLocationOfLesionObservationClassCode(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationOfLesionObservationClassCode(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LOCATION_OF_LESION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateLocationOfLesionObservationClassCode(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationOfLesionObservationClassCode(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static Constraint VALIDATE_LOCATION_OF_LESION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param locationOfLesionObservation The receiving '<em><b>Location Of Lesion Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  boolean validateLocationOfLesionObservationClassCode(LocationOfLesionObservation locationOfLesionObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LOCATION_OF_LESION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TularemiaPackage.Literals.LOCATION_OF_LESION_OBSERVATION);
      try
      {
        VALIDATE_LOCATION_OF_LESION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LOCATION_OF_LESION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LOCATION_OF_LESION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(locationOfLesionObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             TularemiaValidator.DIAGNOSTIC_SOURCE,
             TularemiaValidator.LOCATION_OF_LESION_OBSERVATION__LOCATION_OF_LESION_OBSERVATION_CLASS_CODE,
             TularemiaPlugin.INSTANCE.getString("LocationOfLesionObservationClassCode"),
             new Object [] { locationOfLesionObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLocationOfLesionObservationMoodCode(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationOfLesionObservationMoodCode(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LOCATION_OF_LESION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateLocationOfLesionObservationMoodCode(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationOfLesionObservationMoodCode(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static Constraint VALIDATE_LOCATION_OF_LESION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param locationOfLesionObservation The receiving '<em><b>Location Of Lesion Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  boolean validateLocationOfLesionObservationMoodCode(LocationOfLesionObservation locationOfLesionObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LOCATION_OF_LESION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TularemiaPackage.Literals.LOCATION_OF_LESION_OBSERVATION);
      try
      {
        VALIDATE_LOCATION_OF_LESION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LOCATION_OF_LESION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LOCATION_OF_LESION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(locationOfLesionObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             TularemiaValidator.DIAGNOSTIC_SOURCE,
             TularemiaValidator.LOCATION_OF_LESION_OBSERVATION__LOCATION_OF_LESION_OBSERVATION_MOOD_CODE,
             TularemiaPlugin.INSTANCE.getString("LocationOfLesionObservationMoodCode"),
             new Object [] { locationOfLesionObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLocationOfLesionObservationCodeP(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Code P</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLocationOfLesionObservationCodeP(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_LOCATION_OF_LESION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

		/**
   * The cached OCL invariant for the '{@link #validateLocationOfLesionObservationCodeP(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLocationOfLesionObservationCodeP(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_LOCATION_OF_LESION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param locationOfLesionObservation The receiving '<em><b>Location Of Lesion Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateLocationOfLesionObservationCodeP(LocationOfLesionObservation locationOfLesionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_LOCATION_OF_LESION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TularemiaPackage.Literals.LOCATION_OF_LESION_OBSERVATION);
      try
      {
        VALIDATE_LOCATION_OF_LESION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LOCATION_OF_LESION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LOCATION_OF_LESION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(locationOfLesionObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             TularemiaValidator.DIAGNOSTIC_SOURCE,
             TularemiaValidator.LOCATION_OF_LESION_OBSERVATION__LOCATION_OF_LESION_OBSERVATION_CODE_P,
             TularemiaPlugin.INSTANCE.getString("LocationOfLesionObservationCodeP"),
             new Object [] { locationOfLesionObservation }));
      }
      
      if (context != null) {
        // generate a pass token for my dependent constraints to short-circuit or filter results
        @SuppressWarnings("unchecked")
        Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservationCodeP");
        if (passToken == null) {
          // anticipate a reasonably healthy model
          passToken = new java.util.ArrayList<Object>(3);
          context.put("org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservationCodeP", passToken);
        }
        passToken.add(locationOfLesionObservation);
      }
       
      return false;
    }
    return true;
  }

		/**
   * The cached OCL expression body for the '{@link #validateLocationOfLesionObservationCode(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationOfLesionObservationCode(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LOCATION_OF_LESION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')";

  /**
   * The cached OCL invariant for the '{@link #validateLocationOfLesionObservationCode(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationOfLesionObservationCode(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static Constraint VALIDATE_LOCATION_OF_LESION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param locationOfLesionObservation The receiving '<em><b>Location Of Lesion Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  boolean validateLocationOfLesionObservationCode(LocationOfLesionObservation locationOfLesionObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservationCodeP");
    if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(locationOfLesionObservation)) {
      // I have a free pass to short-circuit
      return true;
    }
  	  
    if (VALIDATE_LOCATION_OF_LESION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TularemiaPackage.Literals.LOCATION_OF_LESION_OBSERVATION);
      try
      {
        VALIDATE_LOCATION_OF_LESION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LOCATION_OF_LESION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LOCATION_OF_LESION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(locationOfLesionObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             TularemiaValidator.DIAGNOSTIC_SOURCE,
             TularemiaValidator.LOCATION_OF_LESION_OBSERVATION__LOCATION_OF_LESION_OBSERVATION_CODE,
             TularemiaPlugin.INSTANCE.getString("LocationOfLesionObservationCode"),
             new Object [] { locationOfLesionObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLocationOfLesionObservationStatusCode(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationOfLesionObservationStatusCode(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LOCATION_OF_LESION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

  /**
   * The cached OCL invariant for the '{@link #validateLocationOfLesionObservationStatusCode(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationOfLesionObservationStatusCode(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static Constraint VALIDATE_LOCATION_OF_LESION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param locationOfLesionObservation The receiving '<em><b>Location Of Lesion Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  boolean validateLocationOfLesionObservationStatusCode(LocationOfLesionObservation locationOfLesionObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LOCATION_OF_LESION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TularemiaPackage.Literals.LOCATION_OF_LESION_OBSERVATION);
      try
      {
        VALIDATE_LOCATION_OF_LESION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LOCATION_OF_LESION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LOCATION_OF_LESION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(locationOfLesionObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             TularemiaValidator.DIAGNOSTIC_SOURCE,
             TularemiaValidator.LOCATION_OF_LESION_OBSERVATION__LOCATION_OF_LESION_OBSERVATION_STATUS_CODE,
             TularemiaPlugin.INSTANCE.getString("LocationOfLesionObservationStatusCode"),
             new Object [] { locationOfLesionObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLocationOfLesionObservationStatusCodeP(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Status Code P</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLocationOfLesionObservationStatusCodeP(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_LOCATION_OF_LESION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

		/**
   * The cached OCL invariant for the '{@link #validateLocationOfLesionObservationStatusCodeP(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Status Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLocationOfLesionObservationStatusCodeP(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_LOCATION_OF_LESION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param locationOfLesionObservation The receiving '<em><b>Location Of Lesion Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateLocationOfLesionObservationStatusCodeP(LocationOfLesionObservation locationOfLesionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_LOCATION_OF_LESION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TularemiaPackage.Literals.LOCATION_OF_LESION_OBSERVATION);
      try
      {
        VALIDATE_LOCATION_OF_LESION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LOCATION_OF_LESION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LOCATION_OF_LESION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(locationOfLesionObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             TularemiaValidator.DIAGNOSTIC_SOURCE,
             TularemiaValidator.LOCATION_OF_LESION_OBSERVATION__LOCATION_OF_LESION_OBSERVATION_STATUS_CODE_P,
             TularemiaPlugin.INSTANCE.getString("LocationOfLesionObservationStatusCodeP"),
             new Object [] { locationOfLesionObservation }));
      }
       
      return false;
    }
    return true;
  }

		/**
   * The cached OCL expression body for the '{@link #validateLocationOfLesionObservationEffectiveTime(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationOfLesionObservationEffectiveTime(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LOCATION_OF_LESION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateLocationOfLesionObservationEffectiveTime(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationOfLesionObservationEffectiveTime(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static Constraint VALIDATE_LOCATION_OF_LESION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param locationOfLesionObservation The receiving '<em><b>Location Of Lesion Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  boolean validateLocationOfLesionObservationEffectiveTime(LocationOfLesionObservation locationOfLesionObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LOCATION_OF_LESION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TularemiaPackage.Literals.LOCATION_OF_LESION_OBSERVATION);
      try
      {
        VALIDATE_LOCATION_OF_LESION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LOCATION_OF_LESION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LOCATION_OF_LESION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(locationOfLesionObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             TularemiaValidator.DIAGNOSTIC_SOURCE,
             TularemiaValidator.LOCATION_OF_LESION_OBSERVATION__LOCATION_OF_LESION_OBSERVATION_EFFECTIVE_TIME,
             TularemiaPlugin.INSTANCE.getString("LocationOfLesionObservationEffectiveTime"),
             new Object [] { locationOfLesionObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLocationOfLesionObservationValue(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationOfLesionObservationValue(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LOCATION_OF_LESION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

  /**
   * The cached OCL invariant for the '{@link #validateLocationOfLesionObservationValue(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLocationOfLesionObservationValue(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static Constraint VALIDATE_LOCATION_OF_LESION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param locationOfLesionObservation The receiving '<em><b>Location Of Lesion Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  boolean validateLocationOfLesionObservationValue(LocationOfLesionObservation locationOfLesionObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LOCATION_OF_LESION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TularemiaPackage.Literals.LOCATION_OF_LESION_OBSERVATION);
      try
      {
        VALIDATE_LOCATION_OF_LESION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LOCATION_OF_LESION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LOCATION_OF_LESION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(locationOfLesionObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             TularemiaValidator.DIAGNOSTIC_SOURCE,
             TularemiaValidator.LOCATION_OF_LESION_OBSERVATION__LOCATION_OF_LESION_OBSERVATION_VALUE,
             TularemiaPlugin.INSTANCE.getString("LocationOfLesionObservationValue"),
             new Object [] { locationOfLesionObservation }));
      }
       
      return false;
    }
    return true;
  }

		/**
   * The cached OCL expression body for the '{@link #validateLocationOfLesionObservationTargetSiteCode(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Target Site Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLocationOfLesionObservationTargetSiteCode(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_LOCATION_OF_LESION_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

		/**
   * The cached OCL invariant for the '{@link #validateLocationOfLesionObservationTargetSiteCode(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Target Site Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLocationOfLesionObservationTargetSiteCode(LocationOfLesionObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_LOCATION_OF_LESION_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param locationOfLesionObservation The receiving '<em><b>Location Of Lesion Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateLocationOfLesionObservationTargetSiteCode(LocationOfLesionObservation locationOfLesionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_LOCATION_OF_LESION_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TularemiaPackage.Literals.LOCATION_OF_LESION_OBSERVATION);
      try
      {
        VALIDATE_LOCATION_OF_LESION_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LOCATION_OF_LESION_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LOCATION_OF_LESION_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(locationOfLesionObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             TularemiaValidator.DIAGNOSTIC_SOURCE,
             TularemiaValidator.LOCATION_OF_LESION_OBSERVATION__LOCATION_OF_LESION_OBSERVATION_TARGET_SITE_CODE,
             TularemiaPlugin.INSTANCE.getString("LocationOfLesionObservationTargetSiteCode"),
             new Object [] { locationOfLesionObservation }));
      }
       
      return false;
    }
    return true;
  }

} // LocationOfLesionObservationOperations