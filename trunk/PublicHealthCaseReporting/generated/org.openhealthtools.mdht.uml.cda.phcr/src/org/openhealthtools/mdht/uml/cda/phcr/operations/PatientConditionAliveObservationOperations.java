/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Condition Alive Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation#validatePatientConditionAliveObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation#validatePatientConditionAliveObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation#validatePatientConditionAliveObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation#validatePatientConditionAliveObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation#validatePatientConditionAliveObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation#validatePatientConditionAliveObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation#validatePatientConditionAliveObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation#validatePatientConditionAliveObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation#validatePatientConditionAliveObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation#validatePatientConditionAliveObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientConditionAliveObservationOperations extends ClinicalStatementOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PatientConditionAliveObservationOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validatePatientConditionAliveObservationTemplateId(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePatientConditionAliveObservationTemplateId(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.42')";

	/**
   * The cached OCL invariant for the '{@link #validatePatientConditionAliveObservationTemplateId(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePatientConditionAliveObservationTemplateId(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientConditionAliveObservation The receiving '<em><b>Patient Condition Alive Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePatientConditionAliveObservationTemplateId(PatientConditionAliveObservation patientConditionAliveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.PATIENT_CONDITION_ALIVE_OBSERVATION);
      try
      {
        VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientConditionAliveObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.PATIENT_CONDITION_ALIVE_OBSERVATION__PATIENT_CONDITION_ALIVE_OBSERVATION_TEMPLATE_ID,
             PhcrPlugin.INSTANCE.getString("PatientConditionAliveObservationTemplateId"),
             new Object [] { patientConditionAliveObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePatientConditionAliveObservationClassCode(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Class Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePatientConditionAliveObservationClassCode(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
   * The cached OCL invariant for the '{@link #validatePatientConditionAliveObservationClassCode(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePatientConditionAliveObservationClassCode(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientConditionAliveObservation The receiving '<em><b>Patient Condition Alive Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePatientConditionAliveObservationClassCode(PatientConditionAliveObservation patientConditionAliveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.PATIENT_CONDITION_ALIVE_OBSERVATION);
      try
      {
        VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientConditionAliveObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.PATIENT_CONDITION_ALIVE_OBSERVATION__PATIENT_CONDITION_ALIVE_OBSERVATION_CLASS_CODE,
             PhcrPlugin.INSTANCE.getString("PatientConditionAliveObservationClassCode"),
             new Object [] { patientConditionAliveObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientConditionAliveObservation The receiving '<em><b>Patient Condition Alive Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePatientConditionAliveObservationCode(PatientConditionAliveObservation patientConditionAliveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservationCodeP");
    if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(patientConditionAliveObservation)) {
      // I have a free pass to short-circuit
      return true;
    }
  	  
    if (VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.PATIENT_CONDITION_ALIVE_OBSERVATION);
      try
      {
        VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientConditionAliveObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.PATIENT_CONDITION_ALIVE_OBSERVATION__PATIENT_CONDITION_ALIVE_OBSERVATION_CODE,
             PhcrPlugin.INSTANCE.getString("PatientConditionAliveObservationCode"),
             new Object [] { patientConditionAliveObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePatientConditionAliveObservationMoodCode(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePatientConditionAliveObservationMoodCode(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
   * The cached OCL invariant for the '{@link #validatePatientConditionAliveObservationMoodCode(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePatientConditionAliveObservationMoodCode(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientConditionAliveObservation The receiving '<em><b>Patient Condition Alive Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePatientConditionAliveObservationMoodCode(PatientConditionAliveObservation patientConditionAliveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.PATIENT_CONDITION_ALIVE_OBSERVATION);
      try
      {
        VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientConditionAliveObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.PATIENT_CONDITION_ALIVE_OBSERVATION__PATIENT_CONDITION_ALIVE_OBSERVATION_MOOD_CODE,
             PhcrPlugin.INSTANCE.getString("PatientConditionAliveObservationMoodCode"),
             new Object [] { patientConditionAliveObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePatientConditionAliveObservationCodeP(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Code P</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePatientConditionAliveObservationCodeP(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validatePatientConditionAliveObservationCodeP(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePatientConditionAliveObservationCodeP(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * The cached OCL expression body for the '{@link #validatePatientConditionAliveObservationCode(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePatientConditionAliveObservationCode(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')";

	/**
   * The cached OCL invariant for the '{@link #validatePatientConditionAliveObservationCode(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePatientConditionAliveObservationCode(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientConditionAliveObservation The receiving '<em><b>Patient Condition Alive Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePatientConditionAliveObservationCodeP(PatientConditionAliveObservation patientConditionAliveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.PATIENT_CONDITION_ALIVE_OBSERVATION);
      try
      {
        VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientConditionAliveObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.PATIENT_CONDITION_ALIVE_OBSERVATION__PATIENT_CONDITION_ALIVE_OBSERVATION_CODE_P,
             PhcrPlugin.INSTANCE.getString("PatientConditionAliveObservationCodeP"),
             new Object [] { patientConditionAliveObservation }));
      }
      
      if (context != null) {
        // generate a pass token for my dependent constraints to short-circuit or filter results
        @SuppressWarnings("unchecked")
        Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservationCodeP");
        if (passToken == null) {
          // anticipate a reasonably healthy model
          passToken = new java.util.ArrayList<Object>(3);
          context.put("org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservationCodeP", passToken);
        }
        passToken.add(patientConditionAliveObservation);
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePatientConditionAliveObservationStatusCode(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Status Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePatientConditionAliveObservationStatusCode(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

	/**
   * The cached OCL invariant for the '{@link #validatePatientConditionAliveObservationStatusCode(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePatientConditionAliveObservationStatusCode(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientConditionAliveObservation The receiving '<em><b>Patient Condition Alive Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePatientConditionAliveObservationStatusCode(PatientConditionAliveObservation patientConditionAliveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.PATIENT_CONDITION_ALIVE_OBSERVATION);
      try
      {
        VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientConditionAliveObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.PATIENT_CONDITION_ALIVE_OBSERVATION__PATIENT_CONDITION_ALIVE_OBSERVATION_STATUS_CODE,
             PhcrPlugin.INSTANCE.getString("PatientConditionAliveObservationStatusCode"),
             new Object [] { patientConditionAliveObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePatientConditionAliveObservationStatusCodeP(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Status Code P</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePatientConditionAliveObservationStatusCodeP(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validatePatientConditionAliveObservationStatusCodeP(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Status Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePatientConditionAliveObservationStatusCodeP(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientConditionAliveObservation The receiving '<em><b>Patient Condition Alive Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePatientConditionAliveObservationStatusCodeP(PatientConditionAliveObservation patientConditionAliveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.PATIENT_CONDITION_ALIVE_OBSERVATION);
      try
      {
        VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientConditionAliveObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.PATIENT_CONDITION_ALIVE_OBSERVATION__PATIENT_CONDITION_ALIVE_OBSERVATION_STATUS_CODE_P,
             PhcrPlugin.INSTANCE.getString("PatientConditionAliveObservationStatusCodeP"),
             new Object [] { patientConditionAliveObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientConditionAliveObservation The receiving '<em><b>Patient Condition Alive Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePatientConditionAliveObservationValue(PatientConditionAliveObservation patientConditionAliveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.PATIENT_CONDITION_ALIVE_OBSERVATION);
      try
      {
        VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientConditionAliveObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.PATIENT_CONDITION_ALIVE_OBSERVATION__PATIENT_CONDITION_ALIVE_OBSERVATION_VALUE,
             PhcrPlugin.INSTANCE.getString("PatientConditionAliveObservationValue"),
             new Object [] { patientConditionAliveObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientConditionAliveObservation The receiving '<em><b>Patient Condition Alive Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePatientConditionAliveObservationValueP(PatientConditionAliveObservation patientConditionAliveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.PATIENT_CONDITION_ALIVE_OBSERVATION);
      try
      {
        VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientConditionAliveObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.PATIENT_CONDITION_ALIVE_OBSERVATION__PATIENT_CONDITION_ALIVE_OBSERVATION_VALUE_P,
             PhcrPlugin.INSTANCE.getString("PatientConditionAliveObservationValueP"),
             new Object [] { patientConditionAliveObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePatientConditionAliveObservationEffectiveTime(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePatientConditionAliveObservationEffectiveTime(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validatePatientConditionAliveObservationEffectiveTime(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePatientConditionAliveObservationEffectiveTime(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * The cached OCL expression body for the '{@link #validatePatientConditionAliveObservationValue(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Value</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePatientConditionAliveObservationValue(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.code = '438949009' and value.codeSystem = '2.16.840.1.113883.6.96'))";

	/**
   * The cached OCL invariant for the '{@link #validatePatientConditionAliveObservationValue(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePatientConditionAliveObservationValue(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * The cached OCL expression body for the '{@link #validatePatientConditionAliveObservationValueP(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Value P</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePatientConditionAliveObservationValueP(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
   * The cached OCL invariant for the '{@link #validatePatientConditionAliveObservationValueP(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Value P</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePatientConditionAliveObservationValueP(PatientConditionAliveObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param patientConditionAliveObservation The receiving '<em><b>Patient Condition Alive Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePatientConditionAliveObservationEffectiveTime(PatientConditionAliveObservation patientConditionAliveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.PATIENT_CONDITION_ALIVE_OBSERVATION);
      try
      {
        VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientConditionAliveObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.PATIENT_CONDITION_ALIVE_OBSERVATION__PATIENT_CONDITION_ALIVE_OBSERVATION_EFFECTIVE_TIME,
             PhcrPlugin.INSTANCE.getString("PatientConditionAliveObservationEffectiveTime"),
             new Object [] { patientConditionAliveObservation }));
      }
       
      return false;
    }
    return true;
  }

} // PatientConditionAliveObservationOperations