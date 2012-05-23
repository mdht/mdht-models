/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.DerivedDataIndicator;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Derived Data Indicator</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DerivedDataIndicator#validateDerivedDataIndicatorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Data Indicator Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DerivedDataIndicator#validateDerivedDataIndicatorCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Data Indicator Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DerivedDataIndicator#validateDerivedDataIndicatorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Data Indicator Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DerivedDataIndicator#validateDerivedDataIndicatorValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Data Indicator Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DerivedDataIndicatorOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DerivedDataIndicatorOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateDerivedDataIndicatorTemplateId(DerivedDataIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Data Indicator Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDerivedDataIndicatorTemplateId(DerivedDataIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DERIVED_DATA_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.60')";

  /**
   * The cached OCL invariant for the '{@link #validateDerivedDataIndicatorTemplateId(DerivedDataIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Data Indicator Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDerivedDataIndicatorTemplateId(DerivedDataIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DERIVED_DATA_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.60')
   * @param derivedDataIndicator The receiving '<em><b>Derived Data Indicator</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDerivedDataIndicatorTemplateId(DerivedDataIndicator derivedDataIndicator, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_DERIVED_DATA_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DERIVED_DATA_INDICATOR);
      try
      {
        VALIDATE_DERIVED_DATA_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DERIVED_DATA_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DERIVED_DATA_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(derivedDataIndicator))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DERIVED_DATA_INDICATOR__DERIVED_DATA_INDICATOR_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DerivedDataIndicatorTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(derivedDataIndicator, context) }),
             new Object [] { derivedDataIndicator }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDerivedDataIndicatorCodeP(DerivedDataIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Data Indicator Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDerivedDataIndicatorCodeP(DerivedDataIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DERIVED_DATA_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateDerivedDataIndicatorCodeP(DerivedDataIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Data Indicator Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDerivedDataIndicatorCodeP(DerivedDataIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DERIVED_DATA_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param derivedDataIndicator The receiving '<em><b>Derived Data Indicator</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDerivedDataIndicatorCodeP(DerivedDataIndicator derivedDataIndicator, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_DERIVED_DATA_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DERIVED_DATA_INDICATOR);
      try
      {
        VALIDATE_DERIVED_DATA_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DERIVED_DATA_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DERIVED_DATA_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(derivedDataIndicator))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DERIVED_DATA_INDICATOR__DERIVED_DATA_INDICATOR_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DerivedDataIndicatorCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(derivedDataIndicator, context) }),
             new Object [] { derivedDataIndicator }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDerivedDataIndicatorCode(DerivedDataIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Data Indicator Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDerivedDataIndicatorCode(DerivedDataIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DERIVED_DATA_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

  /**
   * The cached OCL invariant for the '{@link #validateDerivedDataIndicatorCode(DerivedDataIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Data Indicator Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDerivedDataIndicatorCode(DerivedDataIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DERIVED_DATA_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.codeSystem = '2.16.840.1.113883.3.26.1.1')
   * @param derivedDataIndicator The receiving '<em><b>Derived Data Indicator</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDerivedDataIndicatorCode(DerivedDataIndicator derivedDataIndicator, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_DERIVED_DATA_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DERIVED_DATA_INDICATOR);
      try
      {
        VALIDATE_DERIVED_DATA_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DERIVED_DATA_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DERIVED_DATA_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(derivedDataIndicator))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DERIVED_DATA_INDICATOR__DERIVED_DATA_INDICATOR_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DerivedDataIndicatorCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(derivedDataIndicator, context) }),
             new Object [] { derivedDataIndicator }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDerivedDataIndicatorValue(DerivedDataIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Data Indicator Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDerivedDataIndicatorValue(DerivedDataIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DERIVED_DATA_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

  /**
   * The cached OCL invariant for the '{@link #validateDerivedDataIndicatorValue(DerivedDataIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Data Indicator Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDerivedDataIndicatorValue(DerivedDataIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DERIVED_DATA_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))
   * @param derivedDataIndicator The receiving '<em><b>Derived Data Indicator</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDerivedDataIndicatorValue(DerivedDataIndicator derivedDataIndicator, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_DERIVED_DATA_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DERIVED_DATA_INDICATOR);
      try
      {
        VALIDATE_DERIVED_DATA_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DERIVED_DATA_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DERIVED_DATA_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(derivedDataIndicator))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DERIVED_DATA_INDICATOR__DERIVED_DATA_INDICATOR_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DerivedDataIndicatorValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(derivedDataIndicator, context) }),
             new Object [] { derivedDataIndicator }));
      }
      return false;
    }
    return true;
  }

} // DerivedDataIndicatorOperations