/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorsForHearingLossSection;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.util.HPOCValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Risk Indicators For Hearing Loss Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorsForHearingLossSection#validateRiskIndicatorsForHearingLossSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicators For Hearing Loss Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorsForHearingLossSection#validateRiskIndicatorsForHearingLossSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicators For Hearing Loss Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorsForHearingLossSection#validateRiskIndicatorsForHearingLossSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicators For Hearing Loss Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorsForHearingLossSection#validateRiskIndicatorsForHearingLossSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicators For Hearing Loss Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorsForHearingLossSection#validateRiskIndicatorsForHearingLossSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicators For Hearing Loss Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorsForHearingLossSection#validateRiskIndicatorsForHearingLossSectionEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicators For Hearing Loss Section Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RiskIndicatorsForHearingLossSectionOperations extends SectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RiskIndicatorsForHearingLossSectionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateRiskIndicatorsForHearingLossSectionTemplateId(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicators For Hearing Loss Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRiskIndicatorsForHearingLossSectionTemplateId(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.26.2.3.3')";

  /**
   * The cached OCL invariant for the '{@link #validateRiskIndicatorsForHearingLossSectionTemplateId(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicators For Hearing Loss Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRiskIndicatorsForHearingLossSectionTemplateId(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param riskIndicatorsForHearingLossSection The receiving '<em><b>Risk Indicators For Hearing Loss Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateRiskIndicatorsForHearingLossSectionTemplateId(RiskIndicatorsForHearingLossSection riskIndicatorsForHearingLossSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.RISK_INDICATORS_FOR_HEARING_LOSS_SECTION);
      try
      {
        VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskIndicatorsForHearingLossSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TEMPLATE_ID,
             HPOCPlugin.INSTANCE.getString("RiskIndicatorsForHearingLossSectionTemplateId"),
             new Object [] { riskIndicatorsForHearingLossSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateRiskIndicatorsForHearingLossSectionCode(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicators For Hearing Loss Section Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRiskIndicatorsForHearingLossSectionCode(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '58232-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateRiskIndicatorsForHearingLossSectionCode(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicators For Hearing Loss Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRiskIndicatorsForHearingLossSectionCode(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param riskIndicatorsForHearingLossSection The receiving '<em><b>Risk Indicators For Hearing Loss Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateRiskIndicatorsForHearingLossSectionCode(RiskIndicatorsForHearingLossSection riskIndicatorsForHearingLossSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.RISK_INDICATORS_FOR_HEARING_LOSS_SECTION);
      try
      {
        VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskIndicatorsForHearingLossSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_CODE,
             HPOCPlugin.INSTANCE.getString("RiskIndicatorsForHearingLossSectionCode"),
             new Object [] { riskIndicatorsForHearingLossSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateRiskIndicatorsForHearingLossSectionCodeP(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicators For Hearing Loss Section Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRiskIndicatorsForHearingLossSectionCodeP(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateRiskIndicatorsForHearingLossSectionCodeP(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicators For Hearing Loss Section Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRiskIndicatorsForHearingLossSectionCodeP(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param riskIndicatorsForHearingLossSection The receiving '<em><b>Risk Indicators For Hearing Loss Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateRiskIndicatorsForHearingLossSectionCodeP(RiskIndicatorsForHearingLossSection riskIndicatorsForHearingLossSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.RISK_INDICATORS_FOR_HEARING_LOSS_SECTION);
      try
      {
        VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskIndicatorsForHearingLossSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_CODE_P,
             HPOCPlugin.INSTANCE.getString("RiskIndicatorsForHearingLossSectionCodeP"),
             new Object [] { riskIndicatorsForHearingLossSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateRiskIndicatorsForHearingLossSectionTitle(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicators For Hearing Loss Section Title</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRiskIndicatorsForHearingLossSectionTitle(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateRiskIndicatorsForHearingLossSectionTitle(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicators For Hearing Loss Section Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRiskIndicatorsForHearingLossSectionTitle(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param riskIndicatorsForHearingLossSection The receiving '<em><b>Risk Indicators For Hearing Loss Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateRiskIndicatorsForHearingLossSectionTitle(RiskIndicatorsForHearingLossSection riskIndicatorsForHearingLossSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.RISK_INDICATORS_FOR_HEARING_LOSS_SECTION);
      try
      {
        VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskIndicatorsForHearingLossSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TITLE,
             HPOCPlugin.INSTANCE.getString("RiskIndicatorsForHearingLossSectionTitle"),
             new Object [] { riskIndicatorsForHearingLossSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateRiskIndicatorsForHearingLossSectionText(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicators For Hearing Loss Section Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRiskIndicatorsForHearingLossSectionText(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateRiskIndicatorsForHearingLossSectionText(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicators For Hearing Loss Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRiskIndicatorsForHearingLossSectionText(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param riskIndicatorsForHearingLossSection The receiving '<em><b>Risk Indicators For Hearing Loss Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateRiskIndicatorsForHearingLossSectionText(RiskIndicatorsForHearingLossSection riskIndicatorsForHearingLossSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.RISK_INDICATORS_FOR_HEARING_LOSS_SECTION);
      try
      {
        VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskIndicatorsForHearingLossSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TEXT,
             HPOCPlugin.INSTANCE.getString("RiskIndicatorsForHearingLossSectionText"),
             new Object [] { riskIndicatorsForHearingLossSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateRiskIndicatorsForHearingLossSectionEntry(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicators For Hearing Loss Section Entry</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRiskIndicatorsForHearingLossSectionEntry(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

  /**
   * The cached OCL invariant for the '{@link #validateRiskIndicatorsForHearingLossSectionEntry(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicators For Hearing Loss Section Entry</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateRiskIndicatorsForHearingLossSectionEntry(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param riskIndicatorsForHearingLossSection The receiving '<em><b>Risk Indicators For Hearing Loss Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateRiskIndicatorsForHearingLossSectionEntry(RiskIndicatorsForHearingLossSection riskIndicatorsForHearingLossSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.RISK_INDICATORS_FOR_HEARING_LOSS_SECTION);
      try
      {
        VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskIndicatorsForHearingLossSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_ENTRY,
             HPOCPlugin.INSTANCE.getString("RiskIndicatorsForHearingLossSectionEntry"),
             new Object [] { riskIndicatorsForHearingLossSection }));
      }
       
      return false;
    }
    return true;
  }

} // RiskIndicatorsForHearingLossSectionOperations