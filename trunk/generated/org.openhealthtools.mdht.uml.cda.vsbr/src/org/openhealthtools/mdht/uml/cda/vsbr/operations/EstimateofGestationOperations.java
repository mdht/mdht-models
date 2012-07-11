/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.EstimateofGestation;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Estimateof Gestation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.EstimateofGestation#validateEstimateofGestationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimateof Gestation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.EstimateofGestation#validateEstimateofGestationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimateof Gestation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.EstimateofGestation#validateEstimateofGestationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimateof Gestation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.EstimateofGestation#validateEstimateofGestationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimateof Gestation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.EstimateofGestation#validateEstimateofGestationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimateof Gestation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EstimateofGestationOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EstimateofGestationOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateEstimateofGestationTemplateId(EstimateofGestation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimateof Gestation Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEstimateofGestationTemplateId(EstimateofGestation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ESTIMATEOF_GESTATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.18')";

  /**
   * The cached OCL invariant for the '{@link #validateEstimateofGestationTemplateId(EstimateofGestation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimateof Gestation Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEstimateofGestationTemplateId(EstimateofGestation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ESTIMATEOF_GESTATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.18')
   * @param estimateofGestation The receiving '<em><b>Estimateof Gestation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEstimateofGestationTemplateId(EstimateofGestation estimateofGestation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ESTIMATEOF_GESTATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ESTIMATEOF_GESTATION);
      try
      {
        VALIDATE_ESTIMATEOF_GESTATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ESTIMATEOF_GESTATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ESTIMATEOF_GESTATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(estimateofGestation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ESTIMATEOF_GESTATION__ESTIMATEOF_GESTATION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EstimateofGestationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(estimateofGestation, context) }),
             new Object [] { estimateofGestation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEstimateofGestationClassCode(EstimateofGestation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimateof Gestation Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEstimateofGestationClassCode(EstimateofGestation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ESTIMATEOF_GESTATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateEstimateofGestationClassCode(EstimateofGestation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimateof Gestation Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEstimateofGestationClassCode(EstimateofGestation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ESTIMATEOF_GESTATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param estimateofGestation The receiving '<em><b>Estimateof Gestation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEstimateofGestationClassCode(EstimateofGestation estimateofGestation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ESTIMATEOF_GESTATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ESTIMATEOF_GESTATION);
      try
      {
        VALIDATE_ESTIMATEOF_GESTATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ESTIMATEOF_GESTATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ESTIMATEOF_GESTATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(estimateofGestation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ESTIMATEOF_GESTATION__ESTIMATEOF_GESTATION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EstimateofGestationClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(estimateofGestation, context) }),
             new Object [] { estimateofGestation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEstimateofGestationCode(EstimateofGestation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimateof Gestation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEstimateofGestationCode(EstimateofGestation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ESTIMATEOF_GESTATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateEstimateofGestationCode(EstimateofGestation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimateof Gestation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEstimateofGestationCode(EstimateofGestation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ESTIMATEOF_GESTATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param estimateofGestation The receiving '<em><b>Estimateof Gestation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEstimateofGestationCode(EstimateofGestation estimateofGestation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ESTIMATEOF_GESTATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ESTIMATEOF_GESTATION);
      try
      {
        VALIDATE_ESTIMATEOF_GESTATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ESTIMATEOF_GESTATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ESTIMATEOF_GESTATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(estimateofGestation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ESTIMATEOF_GESTATION__ESTIMATEOF_GESTATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EstimateofGestationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(estimateofGestation, context) }),
             new Object [] { estimateofGestation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEstimateofGestationMoodCode(EstimateofGestation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimateof Gestation Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEstimateofGestationMoodCode(EstimateofGestation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ESTIMATEOF_GESTATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateEstimateofGestationMoodCode(EstimateofGestation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimateof Gestation Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEstimateofGestationMoodCode(EstimateofGestation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ESTIMATEOF_GESTATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param estimateofGestation The receiving '<em><b>Estimateof Gestation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEstimateofGestationMoodCode(EstimateofGestation estimateofGestation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ESTIMATEOF_GESTATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ESTIMATEOF_GESTATION);
      try
      {
        VALIDATE_ESTIMATEOF_GESTATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ESTIMATEOF_GESTATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ESTIMATEOF_GESTATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(estimateofGestation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ESTIMATEOF_GESTATION__ESTIMATEOF_GESTATION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EstimateofGestationMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(estimateofGestation, context) }),
             new Object [] { estimateofGestation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEstimateofGestationValue(EstimateofGestation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimateof Gestation Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEstimateofGestationValue(EstimateofGestation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ESTIMATEOF_GESTATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

  /**
   * The cached OCL invariant for the '{@link #validateEstimateofGestationValue(EstimateofGestation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimateof Gestation Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEstimateofGestationValue(EstimateofGestation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ESTIMATEOF_GESTATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))
   * @param estimateofGestation The receiving '<em><b>Estimateof Gestation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEstimateofGestationValue(EstimateofGestation estimateofGestation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ESTIMATEOF_GESTATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ESTIMATEOF_GESTATION);
      try
      {
        VALIDATE_ESTIMATEOF_GESTATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ESTIMATEOF_GESTATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ESTIMATEOF_GESTATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(estimateofGestation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ESTIMATEOF_GESTATION__ESTIMATEOF_GESTATION_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EstimateofGestationValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(estimateofGestation, context) }),
             new Object [] { estimateofGestation }));
      }
       
      return false;
    }
    return true;
  }

} // EstimateofGestationOperations