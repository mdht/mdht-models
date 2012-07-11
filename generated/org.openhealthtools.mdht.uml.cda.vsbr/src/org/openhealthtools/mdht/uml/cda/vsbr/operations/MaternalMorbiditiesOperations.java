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

import org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidities;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Maternal Morbidities</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidities#validateMaternalMorbiditiesTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidities Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidities#validateMaternalMorbiditiesClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidities Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidities#validateMaternalMorbiditiesCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidities Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidities#validateMaternalMorbiditiesMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidities Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidities#validateMaternalMorbiditiesValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidities Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MaternalMorbiditiesOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MaternalMorbiditiesOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateMaternalMorbiditiesTemplateId(MaternalMorbidities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidities Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMaternalMorbiditiesTemplateId(MaternalMorbidities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MATERNAL_MORBIDITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.25')";

  /**
   * The cached OCL invariant for the '{@link #validateMaternalMorbiditiesTemplateId(MaternalMorbidities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidities Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMaternalMorbiditiesTemplateId(MaternalMorbidities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MATERNAL_MORBIDITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.25')
   * @param maternalMorbidities The receiving '<em><b>Maternal Morbidities</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMaternalMorbiditiesTemplateId(MaternalMorbidities maternalMorbidities, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MATERNAL_MORBIDITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.MATERNAL_MORBIDITIES);
      try
      {
        VALIDATE_MATERNAL_MORBIDITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MATERNAL_MORBIDITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MATERNAL_MORBIDITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(maternalMorbidities))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.MATERNAL_MORBIDITIES__MATERNAL_MORBIDITIES_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MaternalMorbiditiesTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(maternalMorbidities, context) }),
             new Object [] { maternalMorbidities }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMaternalMorbiditiesClassCode(MaternalMorbidities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidities Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMaternalMorbiditiesClassCode(MaternalMorbidities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MATERNAL_MORBIDITIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateMaternalMorbiditiesClassCode(MaternalMorbidities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidities Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMaternalMorbiditiesClassCode(MaternalMorbidities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MATERNAL_MORBIDITIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param maternalMorbidities The receiving '<em><b>Maternal Morbidities</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMaternalMorbiditiesClassCode(MaternalMorbidities maternalMorbidities, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MATERNAL_MORBIDITIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.MATERNAL_MORBIDITIES);
      try
      {
        VALIDATE_MATERNAL_MORBIDITIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MATERNAL_MORBIDITIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MATERNAL_MORBIDITIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(maternalMorbidities))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.MATERNAL_MORBIDITIES__MATERNAL_MORBIDITIES_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MaternalMorbiditiesClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(maternalMorbidities, context) }),
             new Object [] { maternalMorbidities }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMaternalMorbiditiesCode(MaternalMorbidities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidities Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMaternalMorbiditiesCode(MaternalMorbidities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MATERNAL_MORBIDITIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateMaternalMorbiditiesCode(MaternalMorbidities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidities Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMaternalMorbiditiesCode(MaternalMorbidities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MATERNAL_MORBIDITIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param maternalMorbidities The receiving '<em><b>Maternal Morbidities</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMaternalMorbiditiesCode(MaternalMorbidities maternalMorbidities, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MATERNAL_MORBIDITIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.MATERNAL_MORBIDITIES);
      try
      {
        VALIDATE_MATERNAL_MORBIDITIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MATERNAL_MORBIDITIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MATERNAL_MORBIDITIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(maternalMorbidities))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.MATERNAL_MORBIDITIES__MATERNAL_MORBIDITIES_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MaternalMorbiditiesCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(maternalMorbidities, context) }),
             new Object [] { maternalMorbidities }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMaternalMorbiditiesMoodCode(MaternalMorbidities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidities Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMaternalMorbiditiesMoodCode(MaternalMorbidities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MATERNAL_MORBIDITIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateMaternalMorbiditiesMoodCode(MaternalMorbidities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidities Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMaternalMorbiditiesMoodCode(MaternalMorbidities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MATERNAL_MORBIDITIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param maternalMorbidities The receiving '<em><b>Maternal Morbidities</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMaternalMorbiditiesMoodCode(MaternalMorbidities maternalMorbidities, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MATERNAL_MORBIDITIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.MATERNAL_MORBIDITIES);
      try
      {
        VALIDATE_MATERNAL_MORBIDITIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MATERNAL_MORBIDITIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MATERNAL_MORBIDITIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(maternalMorbidities))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.MATERNAL_MORBIDITIES__MATERNAL_MORBIDITIES_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MaternalMorbiditiesMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(maternalMorbidities, context) }),
             new Object [] { maternalMorbidities }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMaternalMorbiditiesValue(MaternalMorbidities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidities Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMaternalMorbiditiesValue(MaternalMorbidities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MATERNAL_MORBIDITIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

  /**
   * The cached OCL invariant for the '{@link #validateMaternalMorbiditiesValue(MaternalMorbidities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidities Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMaternalMorbiditiesValue(MaternalMorbidities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MATERNAL_MORBIDITIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))
   * @param maternalMorbidities The receiving '<em><b>Maternal Morbidities</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMaternalMorbiditiesValue(MaternalMorbidities maternalMorbidities, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MATERNAL_MORBIDITIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.MATERNAL_MORBIDITIES);
      try
      {
        VALIDATE_MATERNAL_MORBIDITIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MATERNAL_MORBIDITIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MATERNAL_MORBIDITIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(maternalMorbidities))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.MATERNAL_MORBIDITIES__MATERNAL_MORBIDITIES_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MaternalMorbiditiesValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(maternalMorbidities, context) }),
             new Object [] { maternalMorbidities }));
      }
       
      return false;
    }
    return true;
  }

} // MaternalMorbiditiesOperations