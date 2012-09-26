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
package org.openhealthtools.mdht.uml.cda.phcr.cocci.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPackage;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPossibleExposureLocationAct;

import org.openhealthtools.mdht.uml.cda.phcr.cocci.util.CocciValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coccidioides Possible Exposure Location Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPossibleExposureLocationAct#validateCoccidioidesPossibleExposureLocationActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Possible Exposure Location Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPossibleExposureLocationAct#validateCoccidioidesPossibleExposureLocationActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Possible Exposure Location Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPossibleExposureLocationAct#validateCoccidioidesPossibleExposureLocationActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Possible Exposure Location Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPossibleExposureLocationAct#validateCoccidioidesPossibleExposureLocationActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Possible Exposure Location Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPossibleExposureLocationAct#validateCoccidioidesPossibleExposureLocationActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Possible Exposure Location Act Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoccidioidesPossibleExposureLocationActOperations extends ClinicalStatementOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CoccidioidesPossibleExposureLocationActOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateCoccidioidesPossibleExposureLocationActTemplateId(CoccidioidesPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Possible Exposure Location Act Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesPossibleExposureLocationActTemplateId(CoccidioidesPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.86')";

	/**
   * The cached OCL invariant for the '{@link #validateCoccidioidesPossibleExposureLocationActTemplateId(CoccidioidesPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Possible Exposure Location Act Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesPossibleExposureLocationActTemplateId(CoccidioidesPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.86')
   * @param coccidioidesPossibleExposureLocationAct The receiving '<em><b>Coccidioides Possible Exposure Location Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateCoccidioidesPossibleExposureLocationActTemplateId(CoccidioidesPossibleExposureLocationAct coccidioidesPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT);
      try
      {
        VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesPossibleExposureLocationAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT__COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCoccidioidesPossibleExposureLocationActTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coccidioidesPossibleExposureLocationAct, context) }),
             new Object [] { coccidioidesPossibleExposureLocationAct }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateCoccidioidesPossibleExposureLocationActClassCode(CoccidioidesPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Possible Exposure Location Act Class Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesPossibleExposureLocationActClassCode(CoccidioidesPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
   * The cached OCL invariant for the '{@link #validateCoccidioidesPossibleExposureLocationActClassCode(CoccidioidesPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Possible Exposure Location Act Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesPossibleExposureLocationActClassCode(CoccidioidesPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
   * @param coccidioidesPossibleExposureLocationAct The receiving '<em><b>Coccidioides Possible Exposure Location Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateCoccidioidesPossibleExposureLocationActClassCode(CoccidioidesPossibleExposureLocationAct coccidioidesPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT);
      try
      {
        VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesPossibleExposureLocationAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT__COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCoccidioidesPossibleExposureLocationActClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coccidioidesPossibleExposureLocationAct, context) }),
             new Object [] { coccidioidesPossibleExposureLocationAct }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateCoccidioidesPossibleExposureLocationActCode(CoccidioidesPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Possible Exposure Location Act Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesPossibleExposureLocationActCode(CoccidioidesPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '413350009' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
   * The cached OCL invariant for the '{@link #validateCoccidioidesPossibleExposureLocationActCode(CoccidioidesPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Possible Exposure Location Act Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesPossibleExposureLocationActCode(CoccidioidesPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.code = '413350009' and value.codeSystem = '2.16.840.1.113883.6.96')
   * @param coccidioidesPossibleExposureLocationAct The receiving '<em><b>Coccidioides Possible Exposure Location Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateCoccidioidesPossibleExposureLocationActCode(CoccidioidesPossibleExposureLocationAct coccidioidesPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT);
      try
      {
        VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesPossibleExposureLocationAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT__COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCoccidioidesPossibleExposureLocationActCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coccidioidesPossibleExposureLocationAct, context) }),
             new Object [] { coccidioidesPossibleExposureLocationAct }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateCoccidioidesPossibleExposureLocationActMoodCode(CoccidioidesPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Possible Exposure Location Act Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesPossibleExposureLocationActMoodCode(CoccidioidesPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
   * The cached OCL invariant for the '{@link #validateCoccidioidesPossibleExposureLocationActMoodCode(CoccidioidesPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Possible Exposure Location Act Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesPossibleExposureLocationActMoodCode(CoccidioidesPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_DocumentActMood::EVN
   * @param coccidioidesPossibleExposureLocationAct The receiving '<em><b>Coccidioides Possible Exposure Location Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateCoccidioidesPossibleExposureLocationActMoodCode(CoccidioidesPossibleExposureLocationAct coccidioidesPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT);
      try
      {
        VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesPossibleExposureLocationAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT__COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCoccidioidesPossibleExposureLocationActMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coccidioidesPossibleExposureLocationAct, context) }),
             new Object [] { coccidioidesPossibleExposureLocationAct }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateCoccidioidesPossibleExposureLocationActStatusCodeP(CoccidioidesPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Possible Exposure Location Act Status Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoccidioidesPossibleExposureLocationActStatusCodeP(CoccidioidesPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateCoccidioidesPossibleExposureLocationActStatusCodeP(CoccidioidesPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Possible Exposure Location Act Status Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoccidioidesPossibleExposureLocationActStatusCodeP(CoccidioidesPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
   * @param coccidioidesPossibleExposureLocationAct The receiving '<em><b>Coccidioides Possible Exposure Location Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCoccidioidesPossibleExposureLocationActStatusCodeP(CoccidioidesPossibleExposureLocationAct coccidioidesPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT);
      try
      {
        VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesPossibleExposureLocationAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT__COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCoccidioidesPossibleExposureLocationActStatusCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coccidioidesPossibleExposureLocationAct, context) }),
             new Object [] { coccidioidesPossibleExposureLocationAct }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCoccidioidesPossibleExposureLocationActStatusCode(CoccidioidesPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Possible Exposure Location Act Status Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesPossibleExposureLocationActStatusCode(CoccidioidesPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

	/**
   * The cached OCL invariant for the '{@link #validateCoccidioidesPossibleExposureLocationActStatusCode(CoccidioidesPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Possible Exposure Location Act Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesPossibleExposureLocationActStatusCode(CoccidioidesPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
   * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
   * value.code = 'completed')
   * @param coccidioidesPossibleExposureLocationAct The receiving '<em><b>Coccidioides Possible Exposure Location Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateCoccidioidesPossibleExposureLocationActStatusCode(CoccidioidesPossibleExposureLocationAct coccidioidesPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT);
      try
      {
        VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesPossibleExposureLocationAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT__COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCoccidioidesPossibleExposureLocationActStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coccidioidesPossibleExposureLocationAct, context) }),
             new Object [] { coccidioidesPossibleExposureLocationAct }));
      }
      return false;
    }
    return true;
  }

} // CoccidioidesPossibleExposureLocationActOperations