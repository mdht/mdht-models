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
package org.openhealthtools.mdht.uml.cda.phcr.tss.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.phcr.operations.ResultObservationOperations;

import org.openhealthtools.mdht.uml.cda.phcr.tss.TssPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tss.tssPackage;

import org.openhealthtools.mdht.uml.cda.phcr.tss.util.tssValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tss Result Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssResultObservation#validateTssResultObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tss Result Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssResultObservation#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TssResultObservationOperations extends ResultObservationOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TssResultObservationOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateTssResultObservationCodeP(TssResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tss Result Observation Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTssResultObservationCodeP(TssResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_TSS_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateTssResultObservationCodeP(TssResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tss Result Observation Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTssResultObservationCodeP(TssResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_TSS_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param tssResultObservation The receiving '<em><b>Tss Result Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateTssResultObservationCodeP(TssResultObservation tssResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_TSS_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(tssPackage.Literals.TSS_RESULT_OBSERVATION);
      try
      {
        VALIDATE_TSS_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TSS_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TSS_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tssResultObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             tssValidator.DIAGNOSTIC_SOURCE,
             tssValidator.TSS_RESULT_OBSERVATION__TSS_RESULT_OBSERVATION_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateTssResultObservationCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tssResultObservation, context) }),
             new Object [] { tssResultObservation }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateTssResultObservationCode(TssResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tss Result Observation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTssResultObservationCode(TssResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_TSS_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '23934-3' or value.code = '44880-3' or value.code = '25822-8' or value.code = '25823-6' or value.code = '23933-5' or value.code = '41855-8' or value.code = '25824-4' or value.code = '25825-1' or value.code = '51856-3' or value.code = '51863-9' or value.code = '23936-8' or value.code = '23935-0' or value.code = '50683-2' or value.code = '44881-1')";

  /**
   * The cached OCL invariant for the '{@link #validateTssResultObservationCode(TssResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tss Result Observation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTssResultObservationCode(TssResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_TSS_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.code = '23934-3' or value.code = '44880-3' or value.code = '25822-8' or value.code = '25823-6' or value.code = '23933-5' or value.code = '41855-8' or value.code = '25824-4' or value.code = '25825-1' or value.code = '51856-3' or value.code = '51863-9' or value.code = '23936-8' or value.code = '23935-0' or value.code = '50683-2' or value.code = '44881-1')
   * @param tssResultObservation The receiving '<em><b>Tss Result Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateTssResultObservationCode(TssResultObservation tssResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_TSS_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(tssPackage.Literals.TSS_RESULT_OBSERVATION);
      try
      {
        VALIDATE_TSS_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TSS_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TSS_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tssResultObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             tssValidator.DIAGNOSTIC_SOURCE,
             tssValidator.TSS_RESULT_OBSERVATION__TSS_RESULT_OBSERVATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateTssResultObservationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tssResultObservation, context) }),
             new Object [] { tssResultObservation }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateResultObservationTemplateId(TssResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateResultObservationTemplateId(TssResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.102')";

	/**
   * The cached OCL invariant for the '{@link #validateResultObservationTemplateId(TssResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateResultObservationTemplateId(TssResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.102')
   * @param tssResultObservation The receiving '<em><b>Tss Result Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateResultObservationTemplateId(TssResultObservation tssResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(tssPackage.Literals.TSS_RESULT_OBSERVATION);
      try
      {
        VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tssResultObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             tssValidator.DIAGNOSTIC_SOURCE,
             tssValidator.TSS_RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateResultObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tssResultObservation, context) }),
             new Object [] { tssResultObservation }));
      }
      return false;
    }
    return true;
  }

} // TssResultObservationOperations