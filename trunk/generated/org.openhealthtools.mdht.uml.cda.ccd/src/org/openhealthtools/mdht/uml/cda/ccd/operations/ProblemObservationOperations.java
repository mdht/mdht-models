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
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ccd.AgeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemHealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation#validateProblemObservationInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation#validateProblemObservationContainsPatientAwareness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Contains Patient Awareness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation#validateProblemObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation#validateProblemObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation#validateProblemObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation#validateProblemObservationProblemStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Problem Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation#validateProblemObservationProblemHealthStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Problem Health Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation#validateProblemObservationAgeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation#getProblemStatus() <em>Get Problem Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation#getProblemHealthStatus() <em>Get Problem Health Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation#getAgeObservation() <em>Get Age Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProblemObservationOperations extends ClinicalStatementOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ProblemObservationOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateProblemObservationInformationSource(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Information Source</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProblemObservationInformationSource(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.informant->isEmpty() "+
"or not self.getSection().informant->isEmpty()"+
"or not self.getClinicalDocument().informant->isEmpty()"+
"or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)"+
"or (self.entryRelationship->exists(rel : cda::EntryRelationship | "+
"   rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR"+
"   and rel.observation.code.code = '48766-0'))";

	/**
   * The cached OCL invariant for the '{@link #validateProblemObservationInformationSource(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Information Source</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProblemObservationInformationSource(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param problemObservation The receiving '<em><b>Problem Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateProblemObservationInformationSource(ProblemObservation problemObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PROBLEM_OBSERVATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.PROBLEM_OBSERVATION);
      try
      {
        VALIDATE_PROBLEM_OBSERVATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_INFORMATION_SOURCE,
             CCDPlugin.INSTANCE.getString("ProblemObservationInformationSource"),
             new Object [] { problemObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateProblemObservationContainsPatientAwareness(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Contains Patient Awareness</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProblemObservationContainsPatientAwareness(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(partic : cda::Participant2 | partic.oclIsKindOf(ccd::PatientAwareness))";

	/**
   * The cached OCL invariant for the '{@link #validateProblemObservationContainsPatientAwareness(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Contains Patient Awareness</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProblemObservationContainsPatientAwareness(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param problemObservation The receiving '<em><b>Problem Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateProblemObservationContainsPatientAwareness(ProblemObservation problemObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PROBLEM_OBSERVATION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.PROBLEM_OBSERVATION);
      try
      {
        VALIDATE_PROBLEM_OBSERVATION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_CONTAINS_PATIENT_AWARENESS,
             CCDPlugin.INSTANCE.getString("ProblemObservationContainsPatientAwareness"),
             new Object [] { problemObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateProblemObservationTemplateId(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProblemObservationTemplateId(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.28')";

	/**
   * The cached OCL invariant for the '{@link #validateProblemObservationTemplateId(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProblemObservationTemplateId(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param problemObservation The receiving '<em><b>Problem Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateProblemObservationTemplateId(ProblemObservation problemObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.PROBLEM_OBSERVATION);
      try
      {
        VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID,
             CCDPlugin.INSTANCE.getString("ProblemObservationTemplateId"),
             new Object [] { problemObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateProblemObservationMoodCode(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProblemObservationMoodCode(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
   * The cached OCL invariant for the '{@link #validateProblemObservationMoodCode(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProblemObservationMoodCode(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param problemObservation The receiving '<em><b>Problem Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateProblemObservationMoodCode(ProblemObservation problemObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PROBLEM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.PROBLEM_OBSERVATION);
      try
      {
        VALIDATE_PROBLEM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_MOOD_CODE,
             CCDPlugin.INSTANCE.getString("ProblemObservationMoodCode"),
             new Object [] { problemObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateProblemObservationStatusCode(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Status Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProblemObservationStatusCode(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

	/**
   * The cached OCL invariant for the '{@link #validateProblemObservationStatusCode(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProblemObservationStatusCode(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param problemObservation The receiving '<em><b>Problem Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateProblemObservationStatusCode(ProblemObservation problemObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.PROBLEM_OBSERVATION);
      try
      {
        VALIDATE_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_STATUS_CODE,
             CCDPlugin.INSTANCE.getString("ProblemObservationStatusCode"),
             new Object [] { problemObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateProblemObservationEffectiveTime(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProblemObservationEffectiveTime(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateProblemObservationEffectiveTime(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProblemObservationEffectiveTime(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param problemObservation The receiving '<em><b>Problem Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateProblemObservationEffectiveTime(ProblemObservation problemObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.PROBLEM_OBSERVATION);
      try
      {
        VALIDATE_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_EFFECTIVE_TIME,
             CCDPlugin.INSTANCE.getString("ProblemObservationEffectiveTime"),
             new Object [] { problemObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateProblemObservationProblemStatus(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Problem Status</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProblemObservationProblemStatus(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_PROBLEM_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::ProblemStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
   * The cached OCL invariant for the '{@link #validateProblemObservationProblemStatus(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Problem Status</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProblemObservationProblemStatus(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_PROBLEM_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param problemObservation The receiving '<em><b>Problem Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateProblemObservationProblemStatus(ProblemObservation problemObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PROBLEM_OBSERVATION_PROBLEM_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.PROBLEM_OBSERVATION);
      try
      {
        VALIDATE_PROBLEM_OBSERVATION_PROBLEM_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_PROBLEM_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_PROBLEM_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_PROBLEM_STATUS,
             CCDPlugin.INSTANCE.getString("ProblemObservationProblemStatus"),
             new Object [] { problemObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateProblemObservationProblemHealthStatus(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Problem Health Status</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProblemObservationProblemHealthStatus(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_PROBLEM_HEALTH_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::ProblemHealthStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
   * The cached OCL invariant for the '{@link #validateProblemObservationProblemHealthStatus(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Problem Health Status</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProblemObservationProblemHealthStatus(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_PROBLEM_HEALTH_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param problemObservation The receiving '<em><b>Problem Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateProblemObservationProblemHealthStatus(ProblemObservation problemObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PROBLEM_OBSERVATION_PROBLEM_HEALTH_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.PROBLEM_OBSERVATION);
      try
      {
        VALIDATE_PROBLEM_OBSERVATION_PROBLEM_HEALTH_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_PROBLEM_HEALTH_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_PROBLEM_HEALTH_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_PROBLEM_HEALTH_STATUS,
             CCDPlugin.INSTANCE.getString("ProblemObservationProblemHealthStatus"),
             new Object [] { problemObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateProblemObservationAgeObservation(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Age Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProblemObservationAgeObservation(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::AgeObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
   * The cached OCL invariant for the '{@link #validateProblemObservationAgeObservation(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Age Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateProblemObservationAgeObservation(ProblemObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param problemObservation The receiving '<em><b>Problem Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateProblemObservationAgeObservation(ProblemObservation problemObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PROBLEM_OBSERVATION_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.PROBLEM_OBSERVATION);
      try
      {
        VALIDATE_PROBLEM_OBSERVATION_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_AGE_OBSERVATION,
             CCDPlugin.INSTANCE.getString("ProblemObservationAgeObservation"),
             new Object [] { problemObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getProblemStatus(ProblemObservation) <em>Get Problem Status</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getProblemStatus(ProblemObservation)
   * @generated
   * @ordered
   */
	protected static final String GET_PROBLEM_STATUS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::ProblemStatusObservation))->asSequence()->any(true).oclAsType(ccd::ProblemStatusObservation)";

	/**
   * The cached OCL query for the '{@link #getProblemStatus(ProblemObservation) <em>Get Problem Status</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getProblemStatus(ProblemObservation)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_PROBLEM_STATUS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static ProblemStatusObservation getProblemStatus(ProblemObservation problemObservation) {
    if (GET_PROBLEM_STATUS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(CCDPackage.Literals.PROBLEM_OBSERVATION, CCDPackage.Literals.PROBLEM_OBSERVATION.getEAllOperations().get(60));
      try
      {
        GET_PROBLEM_STATUS__EOCL_QRY = helper.createQuery(GET_PROBLEM_STATUS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_STATUS__EOCL_QRY);
    return (ProblemStatusObservation) query.evaluate(problemObservation);
  }

	/**
   * The cached OCL expression body for the '{@link #getProblemHealthStatus(ProblemObservation) <em>Get Problem Health Status</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getProblemHealthStatus(ProblemObservation)
   * @generated
   * @ordered
   */
	protected static final String GET_PROBLEM_HEALTH_STATUS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::ProblemHealthStatusObservation))->asSequence()->any(true).oclAsType(ccd::ProblemHealthStatusObservation)";

	/**
   * The cached OCL query for the '{@link #getProblemHealthStatus(ProblemObservation) <em>Get Problem Health Status</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getProblemHealthStatus(ProblemObservation)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_PROBLEM_HEALTH_STATUS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static ProblemHealthStatusObservation getProblemHealthStatus(ProblemObservation problemObservation) {
    if (GET_PROBLEM_HEALTH_STATUS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(CCDPackage.Literals.PROBLEM_OBSERVATION, CCDPackage.Literals.PROBLEM_OBSERVATION.getEAllOperations().get(61));
      try
      {
        GET_PROBLEM_HEALTH_STATUS__EOCL_QRY = helper.createQuery(GET_PROBLEM_HEALTH_STATUS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_HEALTH_STATUS__EOCL_QRY);
    return (ProblemHealthStatusObservation) query.evaluate(problemObservation);
  }

	/**
   * The cached OCL expression body for the '{@link #getAgeObservation(ProblemObservation) <em>Get Age Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAgeObservation(ProblemObservation)
   * @generated
   * @ordered
   */
	protected static final String GET_AGE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::AgeObservation))->asSequence()->any(true).oclAsType(ccd::AgeObservation)";

	/**
   * The cached OCL query for the '{@link #getAgeObservation(ProblemObservation) <em>Get Age Observation</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAgeObservation(ProblemObservation)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_AGE_OBSERVATION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static AgeObservation getAgeObservation(ProblemObservation problemObservation) {
    if (GET_AGE_OBSERVATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(CCDPackage.Literals.PROBLEM_OBSERVATION, CCDPackage.Literals.PROBLEM_OBSERVATION.getEAllOperations().get(62));
      try
      {
        GET_AGE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_AGE_OBSERVATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_AGE_OBSERVATION__EOCL_QRY);
    return (AgeObservation) query.evaluate(problemObservation);
  }

} // ProblemObservationOperations
