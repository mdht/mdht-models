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

import org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcomes;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Other Pregnancy Outcomes</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcomes#validateOtherPregnancyOutcomesTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcomes Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcomes#validateOtherPregnancyOutcomesClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcomes Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcomes#validateOtherPregnancyOutcomesCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcomes Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcomes#validateOtherPregnancyOutcomesMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcomes Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcomes#validateOtherPregnancyOutcomesValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcomes Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcomes#validateOtherPregnancyOutcomesEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcomes Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OtherPregnancyOutcomesOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OtherPregnancyOutcomesOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateOtherPregnancyOutcomesTemplateId(OtherPregnancyOutcomes, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcomes Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomesTemplateId(OtherPregnancyOutcomes, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_OTHER_PREGNANCY_OUTCOMES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.30')";

  /**
   * The cached OCL invariant for the '{@link #validateOtherPregnancyOutcomesTemplateId(OtherPregnancyOutcomes, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcomes Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomesTemplateId(OtherPregnancyOutcomes, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_OTHER_PREGNANCY_OUTCOMES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.30')
   * @param otherPregnancyOutcomes The receiving '<em><b>Other Pregnancy Outcomes</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateOtherPregnancyOutcomesTemplateId(OtherPregnancyOutcomes otherPregnancyOutcomes, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_OTHER_PREGNANCY_OUTCOMES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.OTHER_PREGNANCY_OUTCOMES);
      try
      {
        VALIDATE_OTHER_PREGNANCY_OUTCOMES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OTHER_PREGNANCY_OUTCOMES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_OTHER_PREGNANCY_OUTCOMES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(otherPregnancyOutcomes))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.OTHER_PREGNANCY_OUTCOMES__OTHER_PREGNANCY_OUTCOMES_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OtherPregnancyOutcomesTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(otherPregnancyOutcomes, context) }),
             new Object [] { otherPregnancyOutcomes }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateOtherPregnancyOutcomesClassCode(OtherPregnancyOutcomes, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcomes Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomesClassCode(OtherPregnancyOutcomes, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_OTHER_PREGNANCY_OUTCOMES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateOtherPregnancyOutcomesClassCode(OtherPregnancyOutcomes, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcomes Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomesClassCode(OtherPregnancyOutcomes, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_OTHER_PREGNANCY_OUTCOMES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param otherPregnancyOutcomes The receiving '<em><b>Other Pregnancy Outcomes</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateOtherPregnancyOutcomesClassCode(OtherPregnancyOutcomes otherPregnancyOutcomes, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_OTHER_PREGNANCY_OUTCOMES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.OTHER_PREGNANCY_OUTCOMES);
      try
      {
        VALIDATE_OTHER_PREGNANCY_OUTCOMES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OTHER_PREGNANCY_OUTCOMES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_OTHER_PREGNANCY_OUTCOMES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(otherPregnancyOutcomes))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.OTHER_PREGNANCY_OUTCOMES__OTHER_PREGNANCY_OUTCOMES_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OtherPregnancyOutcomesClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(otherPregnancyOutcomes, context) }),
             new Object [] { otherPregnancyOutcomes }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateOtherPregnancyOutcomesCode(OtherPregnancyOutcomes, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcomes Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomesCode(OtherPregnancyOutcomes, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_OTHER_PREGNANCY_OUTCOMES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateOtherPregnancyOutcomesCode(OtherPregnancyOutcomes, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcomes Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomesCode(OtherPregnancyOutcomes, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_OTHER_PREGNANCY_OUTCOMES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param otherPregnancyOutcomes The receiving '<em><b>Other Pregnancy Outcomes</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateOtherPregnancyOutcomesCode(OtherPregnancyOutcomes otherPregnancyOutcomes, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_OTHER_PREGNANCY_OUTCOMES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.OTHER_PREGNANCY_OUTCOMES);
      try
      {
        VALIDATE_OTHER_PREGNANCY_OUTCOMES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OTHER_PREGNANCY_OUTCOMES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_OTHER_PREGNANCY_OUTCOMES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(otherPregnancyOutcomes))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.OTHER_PREGNANCY_OUTCOMES__OTHER_PREGNANCY_OUTCOMES_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OtherPregnancyOutcomesCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(otherPregnancyOutcomes, context) }),
             new Object [] { otherPregnancyOutcomes }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateOtherPregnancyOutcomesMoodCode(OtherPregnancyOutcomes, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcomes Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomesMoodCode(OtherPregnancyOutcomes, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_OTHER_PREGNANCY_OUTCOMES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateOtherPregnancyOutcomesMoodCode(OtherPregnancyOutcomes, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcomes Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomesMoodCode(OtherPregnancyOutcomes, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_OTHER_PREGNANCY_OUTCOMES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param otherPregnancyOutcomes The receiving '<em><b>Other Pregnancy Outcomes</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateOtherPregnancyOutcomesMoodCode(OtherPregnancyOutcomes otherPregnancyOutcomes, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_OTHER_PREGNANCY_OUTCOMES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.OTHER_PREGNANCY_OUTCOMES);
      try
      {
        VALIDATE_OTHER_PREGNANCY_OUTCOMES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OTHER_PREGNANCY_OUTCOMES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_OTHER_PREGNANCY_OUTCOMES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(otherPregnancyOutcomes))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.OTHER_PREGNANCY_OUTCOMES__OTHER_PREGNANCY_OUTCOMES_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OtherPregnancyOutcomesMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(otherPregnancyOutcomes, context) }),
             new Object [] { otherPregnancyOutcomes }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateOtherPregnancyOutcomesValue(OtherPregnancyOutcomes, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcomes Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomesValue(OtherPregnancyOutcomes, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_OTHER_PREGNANCY_OUTCOMES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

  /**
   * The cached OCL invariant for the '{@link #validateOtherPregnancyOutcomesValue(OtherPregnancyOutcomes, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcomes Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomesValue(OtherPregnancyOutcomes, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_OTHER_PREGNANCY_OUTCOMES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))
   * @param otherPregnancyOutcomes The receiving '<em><b>Other Pregnancy Outcomes</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateOtherPregnancyOutcomesValue(OtherPregnancyOutcomes otherPregnancyOutcomes, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_OTHER_PREGNANCY_OUTCOMES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.OTHER_PREGNANCY_OUTCOMES);
      try
      {
        VALIDATE_OTHER_PREGNANCY_OUTCOMES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OTHER_PREGNANCY_OUTCOMES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_OTHER_PREGNANCY_OUTCOMES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(otherPregnancyOutcomes))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.OTHER_PREGNANCY_OUTCOMES__OTHER_PREGNANCY_OUTCOMES_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OtherPregnancyOutcomesValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(otherPregnancyOutcomes, context) }),
             new Object [] { otherPregnancyOutcomes }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateOtherPregnancyOutcomesEffectiveTime(OtherPregnancyOutcomes, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcomes Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomesEffectiveTime(OtherPregnancyOutcomes, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_OTHER_PREGNANCY_OUTCOMES_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateOtherPregnancyOutcomesEffectiveTime(OtherPregnancyOutcomes, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcomes Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOtherPregnancyOutcomesEffectiveTime(OtherPregnancyOutcomes, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_OTHER_PREGNANCY_OUTCOMES_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
   * @param otherPregnancyOutcomes The receiving '<em><b>Other Pregnancy Outcomes</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateOtherPregnancyOutcomesEffectiveTime(OtherPregnancyOutcomes otherPregnancyOutcomes, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_OTHER_PREGNANCY_OUTCOMES_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.OTHER_PREGNANCY_OUTCOMES);
      try
      {
        VALIDATE_OTHER_PREGNANCY_OUTCOMES_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OTHER_PREGNANCY_OUTCOMES_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_OTHER_PREGNANCY_OUTCOMES_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(otherPregnancyOutcomes))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.OTHER_PREGNANCY_OUTCOMES__OTHER_PREGNANCY_OUTCOMES_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OtherPregnancyOutcomesEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(otherPregnancyOutcomes, context) }),
             new Object [] { otherPregnancyOutcomes }));
      }
       
      return false;
    }
    return true;
  }

} // OtherPregnancyOutcomesOperations