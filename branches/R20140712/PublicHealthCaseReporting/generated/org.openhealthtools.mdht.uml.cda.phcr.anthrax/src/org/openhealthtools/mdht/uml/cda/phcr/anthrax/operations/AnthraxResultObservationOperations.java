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
package org.openhealthtools.mdht.uml.cda.phcr.anthrax.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPackage;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxResultObservation;

import org.openhealthtools.mdht.uml.cda.phcr.anthrax.util.AnthraxValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.ResultObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxResultObservation#validateAnthraxResultObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Result Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxResultObservation#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnthraxResultObservationOperations extends ResultObservationOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AnthraxResultObservationOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateAnthraxResultObservationCodeP(AnthraxResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Result Observation Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAnthraxResultObservationCodeP(AnthraxResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ANTHRAX_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateAnthraxResultObservationCodeP(AnthraxResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Result Observation Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAnthraxResultObservationCodeP(AnthraxResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ANTHRAX_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param anthraxResultObservation The receiving '<em><b>Result Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAnthraxResultObservationCodeP(AnthraxResultObservation anthraxResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ANTHRAX_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(AnthraxPackage.Literals.ANTHRAX_RESULT_OBSERVATION);
      try
      {
        VALIDATE_ANTHRAX_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANTHRAX_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ANTHRAX_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anthraxResultObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             AnthraxValidator.DIAGNOSTIC_SOURCE,
             AnthraxValidator.ANTHRAX_RESULT_OBSERVATION__ANTHRAX_RESULT_OBSERVATION_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAnthraxResultObservationCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(anthraxResultObservation, context) }),
             new Object [] { anthraxResultObservation }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAnthraxResultObservationCode(AnthraxResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Result Observation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAnthraxResultObservationCode(AnthraxResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ANTHRAX_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '11468-6' or value.code = '33697-4' or value.code = '22866-8' or value.code = '22867-6' or value.code = '51976-9' or value.code = '44269-9' or value.code = '33698-2' or value.code = '44270-7' or value.code = '11469-4' or value.code = '17928-3' or value.code = '17915-0' or value.code = '622-1' or value.code = '21020-3' or value.code = '41622-2'))";

  /**
   * The cached OCL invariant for the '{@link #validateAnthraxResultObservationCode(AnthraxResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Result Observation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAnthraxResultObservationCode(AnthraxResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ANTHRAX_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '11468-6' or value.code = '33697-4' or value.code = '22866-8' or value.code = '22867-6' or value.code = '51976-9' or value.code = '44269-9' or value.code = '33698-2' or value.code = '44270-7' or value.code = '11469-4' or value.code = '17928-3' or value.code = '17915-0' or value.code = '622-1' or value.code = '21020-3' or value.code = '41622-2'))
   * @param anthraxResultObservation The receiving '<em><b>Result Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAnthraxResultObservationCode(AnthraxResultObservation anthraxResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ANTHRAX_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(AnthraxPackage.Literals.ANTHRAX_RESULT_OBSERVATION);
      try
      {
        VALIDATE_ANTHRAX_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANTHRAX_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ANTHRAX_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anthraxResultObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             AnthraxValidator.DIAGNOSTIC_SOURCE,
             AnthraxValidator.ANTHRAX_RESULT_OBSERVATION__ANTHRAX_RESULT_OBSERVATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAnthraxResultObservationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(anthraxResultObservation, context) }),
             new Object [] { anthraxResultObservation }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateResultObservationTemplateId(AnthraxResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateResultObservationTemplateId(AnthraxResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.39')";

	/**
   * The cached OCL invariant for the '{@link #validateResultObservationTemplateId(AnthraxResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateResultObservationTemplateId(AnthraxResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.39')
   * @param anthraxResultObservation The receiving '<em><b>Result Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateResultObservationTemplateId(AnthraxResultObservation anthraxResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(AnthraxPackage.Literals.ANTHRAX_RESULT_OBSERVATION);
      try
      {
        VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anthraxResultObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             AnthraxValidator.DIAGNOSTIC_SOURCE,
             AnthraxValidator.ANTHRAX_RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateResultObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(anthraxResultObservation, context) }),
             new Object [] { anthraxResultObservation }));
      }
      return false;
    }
    return true;
  }

} // AnthraxResultObservationOperations