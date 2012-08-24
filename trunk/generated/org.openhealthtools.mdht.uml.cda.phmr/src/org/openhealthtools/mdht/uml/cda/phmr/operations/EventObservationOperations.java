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

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.phmr.EventObservation;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPlugin;

import org.openhealthtools.mdht.uml.cda.phmr.util.PhmrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Event Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.EventObservation#validateEventObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.EventObservation#validateEventObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.EventObservation#validateEventObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.EventObservation#validateEventObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.EventObservation#validateEventObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.EventObservation#validateEventObservationPHMRProductInstanceReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Observation PHMR Product Instance Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventObservationOperations extends ClinicalStatementOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EventObservationOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateEventObservationTemplateId(EventObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Observation Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEventObservationTemplateId(EventObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EVENT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.9.7')";

	/**
   * The cached OCL invariant for the '{@link #validateEventObservationTemplateId(EventObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Observation Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEventObservationTemplateId(EventObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_EVENT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param eventObservation The receiving '<em><b>Event Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateEventObservationTemplateId(EventObservation eventObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_EVENT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.EVENT_OBSERVATION);
      try
      {
        VALIDATE_EVENT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EVENT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EVENT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(eventObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.EVENT_OBSERVATION__EVENT_OBSERVATION_TEMPLATE_ID,
             PhmrPlugin.INSTANCE.getString("EventObservationTemplateId"),
             new Object [] { eventObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEventObservationClassCode(EventObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Observation Class Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEventObservationClassCode(EventObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EVENT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
   * The cached OCL invariant for the '{@link #validateEventObservationClassCode(EventObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Observation Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEventObservationClassCode(EventObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_EVENT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param eventObservation The receiving '<em><b>Event Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateEventObservationClassCode(EventObservation eventObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_EVENT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.EVENT_OBSERVATION);
      try
      {
        VALIDATE_EVENT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EVENT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EVENT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(eventObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.EVENT_OBSERVATION__EVENT_OBSERVATION_CLASS_CODE,
             PhmrPlugin.INSTANCE.getString("EventObservationClassCode"),
             new Object [] { eventObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEventObservationCode(EventObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Observation Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEventObservationCode(EventObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EVENT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.24')";

	/**
   * The cached OCL invariant for the '{@link #validateEventObservationCode(EventObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Observation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEventObservationCode(EventObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_EVENT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param eventObservation The receiving '<em><b>Event Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateEventObservationCode(EventObservation eventObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_EVENT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.EVENT_OBSERVATION);
      try
      {
        VALIDATE_EVENT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EVENT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EVENT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(eventObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.EVENT_OBSERVATION__EVENT_OBSERVATION_CODE,
             PhmrPlugin.INSTANCE.getString("EventObservationCode"),
             new Object [] { eventObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEventObservationMoodCode(EventObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Observation Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEventObservationMoodCode(EventObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EVENT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
   * The cached OCL invariant for the '{@link #validateEventObservationMoodCode(EventObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Observation Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEventObservationMoodCode(EventObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_EVENT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param eventObservation The receiving '<em><b>Event Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateEventObservationMoodCode(EventObservation eventObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_EVENT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.EVENT_OBSERVATION);
      try
      {
        VALIDATE_EVENT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EVENT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EVENT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(eventObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.EVENT_OBSERVATION__EVENT_OBSERVATION_MOOD_CODE,
             PhmrPlugin.INSTANCE.getString("EventObservationMoodCode"),
             new Object [] { eventObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateEventObservationValue(EventObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Observation Value</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEventObservationValue(EventObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_EVENT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)";

	/**
   * The cached OCL invariant for the '{@link #validateEventObservationValue(EventObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Observation Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEventObservationValue(EventObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_EVENT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param eventObservation The receiving '<em><b>Event Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateEventObservationValue(EventObservation eventObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_EVENT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.EVENT_OBSERVATION);
      try
      {
        VALIDATE_EVENT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EVENT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EVENT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(eventObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.EVENT_OBSERVATION__EVENT_OBSERVATION_VALUE,
             PhmrPlugin.INSTANCE.getString("EventObservationValue"),
             new Object [] { eventObservation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEventObservationPHMRProductInstanceReference(EventObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Observation PHMR Product Instance Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEventObservationPHMRProductInstanceReference(EventObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EVENT_OBSERVATION_PHMR_PRODUCT_INSTANCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

  /**
   * The cached OCL invariant for the '{@link #validateEventObservationPHMRProductInstanceReference(EventObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Observation PHMR Product Instance Reference</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEventObservationPHMRProductInstanceReference(EventObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EVENT_OBSERVATION_PHMR_PRODUCT_INSTANCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param eventObservation The receiving '<em><b>Event Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEventObservationPHMRProductInstanceReference(EventObservation eventObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EVENT_OBSERVATION_PHMR_PRODUCT_INSTANCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.EVENT_OBSERVATION);
      try
      {
        VALIDATE_EVENT_OBSERVATION_PHMR_PRODUCT_INSTANCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EVENT_OBSERVATION_PHMR_PRODUCT_INSTANCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EVENT_OBSERVATION_PHMR_PRODUCT_INSTANCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(eventObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.EVENT_OBSERVATION__EVENT_OBSERVATION_PHMR_PRODUCT_INSTANCE_REFERENCE,
             PhmrPlugin.INSTANCE.getString("EventObservationPHMRProductInstanceReference"),
             new Object [] { eventObservation }));
      }
       
      return false;
    }
    return true;
  }

} // EventObservationOperations