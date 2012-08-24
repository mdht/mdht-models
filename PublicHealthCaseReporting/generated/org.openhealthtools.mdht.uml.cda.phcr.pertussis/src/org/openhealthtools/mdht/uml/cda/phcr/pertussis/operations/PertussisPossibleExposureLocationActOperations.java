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
package org.openhealthtools.mdht.uml.cda.phcr.pertussis.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.util.PertussisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Possible Exposure Location Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleExposureLocationAct#validatePertussisPossibleExposureLocationActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Possible Exposure Location Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleExposureLocationAct#validatePertussisPossibleExposureLocationActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Possible Exposure Location Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleExposureLocationAct#validatePertussisPossibleExposureLocationActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Possible Exposure Location Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleExposureLocationAct#validatePertussisPossibleExposureLocationActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Possible Exposure Location Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleExposureLocationAct#validatePertussisPossibleExposureLocationActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Possible Exposure Location Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleExposureLocationAct#validatePertussisPossibleExposureLocationActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Possible Exposure Location Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleExposureLocationAct#validatePertussisPossibleExposureLocationActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Possible Exposure Location Act Status Code P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PertussisPossibleExposureLocationActOperations extends ClinicalStatementOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PertussisPossibleExposureLocationActOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validatePertussisPossibleExposureLocationActTemplateId(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Possible Exposure Location Act Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePertussisPossibleExposureLocationActTemplateId(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.63')";

	/**
   * The cached OCL invariant for the '{@link #validatePertussisPossibleExposureLocationActTemplateId(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Possible Exposure Location Act Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePertussisPossibleExposureLocationActTemplateId(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pertussisPossibleExposureLocationAct The receiving '<em><b>Possible Exposure Location Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePertussisPossibleExposureLocationActTemplateId(PertussisPossibleExposureLocationAct pertussisPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PertussisPackage.Literals.PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT);
      try
      {
        VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisPossibleExposureLocationAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PertussisValidator.DIAGNOSTIC_SOURCE,
             PertussisValidator.PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID,
             PertussisPlugin.INSTANCE.getString("PertussisPossibleExposureLocationActTemplateId"),
             new Object [] { pertussisPossibleExposureLocationAct }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePertussisPossibleExposureLocationActClassCode(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Possible Exposure Location Act Class Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePertussisPossibleExposureLocationActClassCode(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
   * The cached OCL invariant for the '{@link #validatePertussisPossibleExposureLocationActClassCode(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Possible Exposure Location Act Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePertussisPossibleExposureLocationActClassCode(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pertussisPossibleExposureLocationAct The receiving '<em><b>Possible Exposure Location Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePertussisPossibleExposureLocationActClassCode(PertussisPossibleExposureLocationAct pertussisPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PertussisPackage.Literals.PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT);
      try
      {
        VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisPossibleExposureLocationAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PertussisValidator.DIAGNOSTIC_SOURCE,
             PertussisValidator.PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE,
             PertussisPlugin.INSTANCE.getString("PertussisPossibleExposureLocationActClassCode"),
             new Object [] { pertussisPossibleExposureLocationAct }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePertussisPossibleExposureLocationActCodeP(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Possible Exposure Location Act Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePertussisPossibleExposureLocationActCodeP(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validatePertussisPossibleExposureLocationActCodeP(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Possible Exposure Location Act Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePertussisPossibleExposureLocationActCodeP(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pertussisPossibleExposureLocationAct The receiving '<em><b>Possible Exposure Location Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePertussisPossibleExposureLocationActCodeP(PertussisPossibleExposureLocationAct pertussisPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PertussisPackage.Literals.PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT);
      try
      {
        VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisPossibleExposureLocationAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PertussisValidator.DIAGNOSTIC_SOURCE,
             PertussisValidator.PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE_P,
             PertussisPlugin.INSTANCE.getString("PertussisPossibleExposureLocationActCodeP"),
             new Object [] { pertussisPossibleExposureLocationAct }));
      }
      
      if (context != null) {
        // generate a pass token for my dependent constraints to short-circuit or filter results
        @SuppressWarnings("unchecked")
        Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleExposureLocationActCodeP");
        if (passToken == null) {
          // anticipate a reasonably healthy model
          passToken = new java.util.ArrayList<Object>(3);
          context.put("org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleExposureLocationActCodeP", passToken);
        }
        passToken.add(pertussisPossibleExposureLocationAct);
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePertussisPossibleExposureLocationActCode(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Possible Exposure Location Act Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePertussisPossibleExposureLocationActCode(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '413350009' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
   * The cached OCL invariant for the '{@link #validatePertussisPossibleExposureLocationActCode(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Possible Exposure Location Act Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePertussisPossibleExposureLocationActCode(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pertussisPossibleExposureLocationAct The receiving '<em><b>Possible Exposure Location Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePertussisPossibleExposureLocationActCode(PertussisPossibleExposureLocationAct pertussisPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleExposureLocationActCodeP");
    if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(pertussisPossibleExposureLocationAct)) {
      // I have a free pass to short-circuit
      return true;
    }
  	  
    if (VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PertussisPackage.Literals.PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT);
      try
      {
        VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisPossibleExposureLocationAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PertussisValidator.DIAGNOSTIC_SOURCE,
             PertussisValidator.PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE,
             PertussisPlugin.INSTANCE.getString("PertussisPossibleExposureLocationActCode"),
             new Object [] { pertussisPossibleExposureLocationAct }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePertussisPossibleExposureLocationActMoodCode(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Possible Exposure Location Act Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePertussisPossibleExposureLocationActMoodCode(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
   * The cached OCL invariant for the '{@link #validatePertussisPossibleExposureLocationActMoodCode(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Possible Exposure Location Act Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePertussisPossibleExposureLocationActMoodCode(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pertussisPossibleExposureLocationAct The receiving '<em><b>Possible Exposure Location Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePertussisPossibleExposureLocationActMoodCode(PertussisPossibleExposureLocationAct pertussisPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PertussisPackage.Literals.PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT);
      try
      {
        VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisPossibleExposureLocationAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PertussisValidator.DIAGNOSTIC_SOURCE,
             PertussisValidator.PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE,
             PertussisPlugin.INSTANCE.getString("PertussisPossibleExposureLocationActMoodCode"),
             new Object [] { pertussisPossibleExposureLocationAct }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePertussisPossibleExposureLocationActStatusCode(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Possible Exposure Location Act Status Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePertussisPossibleExposureLocationActStatusCode(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

	/**
   * The cached OCL invariant for the '{@link #validatePertussisPossibleExposureLocationActStatusCode(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Possible Exposure Location Act Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePertussisPossibleExposureLocationActStatusCode(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pertussisPossibleExposureLocationAct The receiving '<em><b>Possible Exposure Location Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePertussisPossibleExposureLocationActStatusCode(PertussisPossibleExposureLocationAct pertussisPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PertussisPackage.Literals.PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT);
      try
      {
        VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisPossibleExposureLocationAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PertussisValidator.DIAGNOSTIC_SOURCE,
             PertussisValidator.PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE,
             PertussisPlugin.INSTANCE.getString("PertussisPossibleExposureLocationActStatusCode"),
             new Object [] { pertussisPossibleExposureLocationAct }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePertussisPossibleExposureLocationActStatusCodeP(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Possible Exposure Location Act Status Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePertussisPossibleExposureLocationActStatusCodeP(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validatePertussisPossibleExposureLocationActStatusCodeP(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Possible Exposure Location Act Status Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePertussisPossibleExposureLocationActStatusCodeP(PertussisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pertussisPossibleExposureLocationAct The receiving '<em><b>Possible Exposure Location Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePertussisPossibleExposureLocationActStatusCodeP(PertussisPossibleExposureLocationAct pertussisPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PertussisPackage.Literals.PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT);
      try
      {
        VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisPossibleExposureLocationAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PertussisValidator.DIAGNOSTIC_SOURCE,
             PertussisValidator.PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE_P,
             PertussisPlugin.INSTANCE.getString("PertussisPossibleExposureLocationActStatusCodeP"),
             new Object [] { pertussisPossibleExposureLocationAct }));
      }
       
      return false;
    }
    return true;
  }

} // PertussisPossibleExposureLocationActOperations