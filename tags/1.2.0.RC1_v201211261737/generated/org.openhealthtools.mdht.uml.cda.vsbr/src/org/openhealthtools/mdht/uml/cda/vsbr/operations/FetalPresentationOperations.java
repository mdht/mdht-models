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

import org.openhealthtools.mdht.uml.cda.vsbr.FetalPresentation;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Fetal Presentation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalPresentation#validateFetalPresentationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Presentation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalPresentation#validateFetalPresentationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Presentation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalPresentation#validateFetalPresentationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Presentation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalPresentation#validateFetalPresentationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Presentation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalPresentation#validateFetalPresentationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Presentation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FetalPresentationOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FetalPresentationOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetalPresentationTemplateId(FetalPresentation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Presentation Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalPresentationTemplateId(FetalPresentation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETAL_PRESENTATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.20')";

  /**
   * The cached OCL invariant for the '{@link #validateFetalPresentationTemplateId(FetalPresentation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Presentation Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalPresentationTemplateId(FetalPresentation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETAL_PRESENTATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.20')
   * @param fetalPresentation The receiving '<em><b>Fetal Presentation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetalPresentationTemplateId(FetalPresentation fetalPresentation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETAL_PRESENTATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETAL_PRESENTATION);
      try
      {
        VALIDATE_FETAL_PRESENTATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_PRESENTATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETAL_PRESENTATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetalPresentation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETAL_PRESENTATION__FETAL_PRESENTATION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetalPresentationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalPresentation, context) }),
             new Object [] { fetalPresentation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetalPresentationClassCode(FetalPresentation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Presentation Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalPresentationClassCode(FetalPresentation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETAL_PRESENTATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateFetalPresentationClassCode(FetalPresentation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Presentation Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalPresentationClassCode(FetalPresentation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETAL_PRESENTATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param fetalPresentation The receiving '<em><b>Fetal Presentation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetalPresentationClassCode(FetalPresentation fetalPresentation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETAL_PRESENTATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETAL_PRESENTATION);
      try
      {
        VALIDATE_FETAL_PRESENTATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_PRESENTATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETAL_PRESENTATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetalPresentation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETAL_PRESENTATION__FETAL_PRESENTATION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetalPresentationClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalPresentation, context) }),
             new Object [] { fetalPresentation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetalPresentationCode(FetalPresentation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Presentation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalPresentationCode(FetalPresentation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETAL_PRESENTATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateFetalPresentationCode(FetalPresentation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Presentation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalPresentationCode(FetalPresentation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETAL_PRESENTATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param fetalPresentation The receiving '<em><b>Fetal Presentation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetalPresentationCode(FetalPresentation fetalPresentation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETAL_PRESENTATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETAL_PRESENTATION);
      try
      {
        VALIDATE_FETAL_PRESENTATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_PRESENTATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETAL_PRESENTATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetalPresentation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETAL_PRESENTATION__FETAL_PRESENTATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetalPresentationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalPresentation, context) }),
             new Object [] { fetalPresentation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetalPresentationMoodCode(FetalPresentation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Presentation Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalPresentationMoodCode(FetalPresentation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETAL_PRESENTATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateFetalPresentationMoodCode(FetalPresentation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Presentation Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalPresentationMoodCode(FetalPresentation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETAL_PRESENTATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param fetalPresentation The receiving '<em><b>Fetal Presentation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetalPresentationMoodCode(FetalPresentation fetalPresentation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETAL_PRESENTATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETAL_PRESENTATION);
      try
      {
        VALIDATE_FETAL_PRESENTATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_PRESENTATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETAL_PRESENTATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetalPresentation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETAL_PRESENTATION__FETAL_PRESENTATION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetalPresentationMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalPresentation, context) }),
             new Object [] { fetalPresentation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetalPresentationValue(FetalPresentation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Presentation Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalPresentationValue(FetalPresentation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETAL_PRESENTATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

  /**
   * The cached OCL invariant for the '{@link #validateFetalPresentationValue(FetalPresentation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Presentation Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetalPresentationValue(FetalPresentation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETAL_PRESENTATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))
   * @param fetalPresentation The receiving '<em><b>Fetal Presentation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetalPresentationValue(FetalPresentation fetalPresentation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETAL_PRESENTATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETAL_PRESENTATION);
      try
      {
        VALIDATE_FETAL_PRESENTATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_PRESENTATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETAL_PRESENTATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetalPresentation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETAL_PRESENTATION__FETAL_PRESENTATION_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetalPresentationValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalPresentation, context) }),
             new Object [] { fetalPresentation }));
      }
       
      return false;
    }
    return true;
  }

} // FetalPresentationOperations