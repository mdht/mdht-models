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
package org.openhealthtools.mdht.uml.cda.phcr.streppneumo.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPackage;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPossibleExposureLocationAct;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.util.StrepPneumoValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Possible Exposure Location Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPossibleExposureLocationAct#validateStrepPneumoPossibleExposureLocationActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Possible Exposure Location Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPossibleExposureLocationAct#validateStrepPneumoPossibleExposureLocationActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Possible Exposure Location Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPossibleExposureLocationAct#validateStrepPneumoPossibleExposureLocationActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Possible Exposure Location Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPossibleExposureLocationAct#validateStrepPneumoPossibleExposureLocationActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Possible Exposure Location Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPossibleExposureLocationAct#validateStrepPneumoPossibleExposureLocationActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Possible Exposure Location Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPossibleExposureLocationAct#validateStrepPneumoPossibleExposureLocationActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Possible Exposure Location Act Status Code P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StrepPneumoPossibleExposureLocationActOperations extends ClinicalStatementOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected StrepPneumoPossibleExposureLocationActOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateStrepPneumoPossibleExposureLocationActTemplateId(StrepPneumoPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Possible Exposure Location Act Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateStrepPneumoPossibleExposureLocationActTemplateId(StrepPneumoPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.129')";

	/**
   * The cached OCL invariant for the '{@link #validateStrepPneumoPossibleExposureLocationActTemplateId(StrepPneumoPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Possible Exposure Location Act Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateStrepPneumoPossibleExposureLocationActTemplateId(StrepPneumoPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param strepPneumoPossibleExposureLocationAct The receiving '<em><b>Possible Exposure Location Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateStrepPneumoPossibleExposureLocationActTemplateId(StrepPneumoPossibleExposureLocationAct strepPneumoPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT);
      try
      {
        VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoPossibleExposureLocationAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             StrepPneumoValidator.DIAGNOSTIC_SOURCE,
             StrepPneumoValidator.STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT__STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID,
             StrepPneumoPlugin.INSTANCE.getString("StrepPneumoPossibleExposureLocationActTemplateId"),
             new Object [] { strepPneumoPossibleExposureLocationAct }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateStrepPneumoPossibleExposureLocationActClassCode(StrepPneumoPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Possible Exposure Location Act Class Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateStrepPneumoPossibleExposureLocationActClassCode(StrepPneumoPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
   * The cached OCL invariant for the '{@link #validateStrepPneumoPossibleExposureLocationActClassCode(StrepPneumoPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Possible Exposure Location Act Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateStrepPneumoPossibleExposureLocationActClassCode(StrepPneumoPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param strepPneumoPossibleExposureLocationAct The receiving '<em><b>Possible Exposure Location Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateStrepPneumoPossibleExposureLocationActClassCode(StrepPneumoPossibleExposureLocationAct strepPneumoPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT);
      try
      {
        VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoPossibleExposureLocationAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             StrepPneumoValidator.DIAGNOSTIC_SOURCE,
             StrepPneumoValidator.STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT__STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE,
             StrepPneumoPlugin.INSTANCE.getString("StrepPneumoPossibleExposureLocationActClassCode"),
             new Object [] { strepPneumoPossibleExposureLocationAct }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateStrepPneumoPossibleExposureLocationActCode(StrepPneumoPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Possible Exposure Location Act Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateStrepPneumoPossibleExposureLocationActCode(StrepPneumoPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '413350009' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
   * The cached OCL invariant for the '{@link #validateStrepPneumoPossibleExposureLocationActCode(StrepPneumoPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Possible Exposure Location Act Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateStrepPneumoPossibleExposureLocationActCode(StrepPneumoPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param strepPneumoPossibleExposureLocationAct The receiving '<em><b>Possible Exposure Location Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateStrepPneumoPossibleExposureLocationActCode(StrepPneumoPossibleExposureLocationAct strepPneumoPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT);
      try
      {
        VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoPossibleExposureLocationAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             StrepPneumoValidator.DIAGNOSTIC_SOURCE,
             StrepPneumoValidator.STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT__STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE,
             StrepPneumoPlugin.INSTANCE.getString("StrepPneumoPossibleExposureLocationActCode"),
             new Object [] { strepPneumoPossibleExposureLocationAct }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateStrepPneumoPossibleExposureLocationActMoodCode(StrepPneumoPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Possible Exposure Location Act Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateStrepPneumoPossibleExposureLocationActMoodCode(StrepPneumoPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
   * The cached OCL invariant for the '{@link #validateStrepPneumoPossibleExposureLocationActMoodCode(StrepPneumoPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Possible Exposure Location Act Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateStrepPneumoPossibleExposureLocationActMoodCode(StrepPneumoPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param strepPneumoPossibleExposureLocationAct The receiving '<em><b>Possible Exposure Location Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateStrepPneumoPossibleExposureLocationActMoodCode(StrepPneumoPossibleExposureLocationAct strepPneumoPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT);
      try
      {
        VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoPossibleExposureLocationAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             StrepPneumoValidator.DIAGNOSTIC_SOURCE,
             StrepPneumoValidator.STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT__STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE,
             StrepPneumoPlugin.INSTANCE.getString("StrepPneumoPossibleExposureLocationActMoodCode"),
             new Object [] { strepPneumoPossibleExposureLocationAct }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateStrepPneumoPossibleExposureLocationActStatusCode(StrepPneumoPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Possible Exposure Location Act Status Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateStrepPneumoPossibleExposureLocationActStatusCode(StrepPneumoPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

	/**
   * The cached OCL invariant for the '{@link #validateStrepPneumoPossibleExposureLocationActStatusCode(StrepPneumoPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Possible Exposure Location Act Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateStrepPneumoPossibleExposureLocationActStatusCode(StrepPneumoPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param strepPneumoPossibleExposureLocationAct The receiving '<em><b>Possible Exposure Location Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateStrepPneumoPossibleExposureLocationActStatusCode(StrepPneumoPossibleExposureLocationAct strepPneumoPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT);
      try
      {
        VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoPossibleExposureLocationAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             StrepPneumoValidator.DIAGNOSTIC_SOURCE,
             StrepPneumoValidator.STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT__STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE,
             StrepPneumoPlugin.INSTANCE.getString("StrepPneumoPossibleExposureLocationActStatusCode"),
             new Object [] { strepPneumoPossibleExposureLocationAct }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStrepPneumoPossibleExposureLocationActStatusCodeP(StrepPneumoPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Possible Exposure Location Act Status Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStrepPneumoPossibleExposureLocationActStatusCodeP(StrepPneumoPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateStrepPneumoPossibleExposureLocationActStatusCodeP(StrepPneumoPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Possible Exposure Location Act Status Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStrepPneumoPossibleExposureLocationActStatusCodeP(StrepPneumoPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param strepPneumoPossibleExposureLocationAct The receiving '<em><b>Possible Exposure Location Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStrepPneumoPossibleExposureLocationActStatusCodeP(StrepPneumoPossibleExposureLocationAct strepPneumoPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT);
      try
      {
        VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoPossibleExposureLocationAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             StrepPneumoValidator.DIAGNOSTIC_SOURCE,
             StrepPneumoValidator.STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT__STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE_P,
             StrepPneumoPlugin.INSTANCE.getString("StrepPneumoPossibleExposureLocationActStatusCodeP"),
             new Object [] { strepPneumoPossibleExposureLocationAct }));
      }
       
      return false;
    }
    return true;
  }

} // StrepPneumoPossibleExposureLocationActOperations