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

import org.openhealthtools.mdht.uml.cda.vsbr.RiskFactors;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Risk Factors</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.RiskFactors#validateRiskFactorsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Factors Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.RiskFactors#validateRiskFactorsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Factors Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.RiskFactors#validateRiskFactorsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Factors Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.RiskFactors#validateRiskFactorsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Factors Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.RiskFactors#validateRiskFactorsValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Factors Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.RiskFactors#validateRiskFactorsEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Factors Entry Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RiskFactorsOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RiskFactorsOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateRiskFactorsTemplateId(RiskFactors, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Factors Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRiskFactorsTemplateId(RiskFactors, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_RISK_FACTORS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.34')";

  /**
   * The cached OCL invariant for the '{@link #validateRiskFactorsTemplateId(RiskFactors, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Factors Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRiskFactorsTemplateId(RiskFactors, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_RISK_FACTORS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.34')
   * @param riskFactors The receiving '<em><b>Risk Factors</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateRiskFactorsTemplateId(RiskFactors riskFactors, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_RISK_FACTORS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.RISK_FACTORS);
      try
      {
        VALIDATE_RISK_FACTORS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_FACTORS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RISK_FACTORS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskFactors))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.RISK_FACTORS__RISK_FACTORS_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "RiskFactorsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(riskFactors, context) }),
             new Object [] { riskFactors }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateRiskFactorsClassCode(RiskFactors, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Factors Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRiskFactorsClassCode(RiskFactors, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_RISK_FACTORS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateRiskFactorsClassCode(RiskFactors, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Factors Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRiskFactorsClassCode(RiskFactors, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_RISK_FACTORS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param riskFactors The receiving '<em><b>Risk Factors</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateRiskFactorsClassCode(RiskFactors riskFactors, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_RISK_FACTORS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.RISK_FACTORS);
      try
      {
        VALIDATE_RISK_FACTORS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_FACTORS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RISK_FACTORS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskFactors))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.RISK_FACTORS__RISK_FACTORS_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "RiskFactorsClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(riskFactors, context) }),
             new Object [] { riskFactors }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateRiskFactorsCode(RiskFactors, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Factors Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRiskFactorsCode(RiskFactors, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_RISK_FACTORS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateRiskFactorsCode(RiskFactors, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Factors Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRiskFactorsCode(RiskFactors, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_RISK_FACTORS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param riskFactors The receiving '<em><b>Risk Factors</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateRiskFactorsCode(RiskFactors riskFactors, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_RISK_FACTORS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.RISK_FACTORS);
      try
      {
        VALIDATE_RISK_FACTORS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_FACTORS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RISK_FACTORS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskFactors))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.RISK_FACTORS__RISK_FACTORS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "RiskFactorsCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(riskFactors, context) }),
             new Object [] { riskFactors }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateRiskFactorsMoodCode(RiskFactors, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Factors Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRiskFactorsMoodCode(RiskFactors, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_RISK_FACTORS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateRiskFactorsMoodCode(RiskFactors, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Factors Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRiskFactorsMoodCode(RiskFactors, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_RISK_FACTORS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param riskFactors The receiving '<em><b>Risk Factors</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateRiskFactorsMoodCode(RiskFactors riskFactors, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_RISK_FACTORS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.RISK_FACTORS);
      try
      {
        VALIDATE_RISK_FACTORS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_FACTORS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RISK_FACTORS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskFactors))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.RISK_FACTORS__RISK_FACTORS_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "RiskFactorsMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(riskFactors, context) }),
             new Object [] { riskFactors }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateRiskFactorsValue(RiskFactors, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Factors Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRiskFactorsValue(RiskFactors, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_RISK_FACTORS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

  /**
   * The cached OCL invariant for the '{@link #validateRiskFactorsValue(RiskFactors, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Factors Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRiskFactorsValue(RiskFactors, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_RISK_FACTORS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))
   * @param riskFactors The receiving '<em><b>Risk Factors</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateRiskFactorsValue(RiskFactors riskFactors, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_RISK_FACTORS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.RISK_FACTORS);
      try
      {
        VALIDATE_RISK_FACTORS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_FACTORS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RISK_FACTORS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskFactors))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.RISK_FACTORS__RISK_FACTORS_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "RiskFactorsValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(riskFactors, context) }),
             new Object [] { riskFactors }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateRiskFactorsEntryRelationship(RiskFactors, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Factors Entry Relationship</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRiskFactorsEntryRelationship(RiskFactors, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_RISK_FACTORS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateRiskFactorsEntryRelationship(RiskFactors, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Factors Entry Relationship</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRiskFactorsEntryRelationship(RiskFactors, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_RISK_FACTORS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param riskFactors The receiving '<em><b>Risk Factors</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateRiskFactorsEntryRelationship(RiskFactors riskFactors, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_RISK_FACTORS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.RISK_FACTORS);
      try
      {
        VALIDATE_RISK_FACTORS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_FACTORS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RISK_FACTORS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskFactors))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.RISK_FACTORS__RISK_FACTORS_ENTRY_RELATIONSHIP,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "RiskFactorsEntryRelationship", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(riskFactors, context) }),
             new Object [] { riskFactors }));
      }
       
      return false;
    }
    return true;
  }

} // RiskFactorsOperations