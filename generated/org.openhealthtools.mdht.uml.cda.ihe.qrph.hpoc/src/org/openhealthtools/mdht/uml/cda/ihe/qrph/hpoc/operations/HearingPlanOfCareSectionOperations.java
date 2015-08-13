/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;


import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareSection;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.util.HPOCValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;
import org.openhealthtools.mdht.uml.hl7.rim.ActRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hearing Plan Of Care Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareSection#validateHearingPlanOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareSection#validateHearingPlanOfCareSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareSection#validateHearingPlanOfCareSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareSection#validateHearingPlanOfCareSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareSection#validateHearingPlanOfCareSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareSection#validateHearingPlanOfCareSectionEntryAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Entry Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareSection#validateHearingPlanOfCareSectionEntryEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Entry Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareSection#validateHearingPlanOfCareSectionEntryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Entry Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareSection#validateHearingPlanOfCareSectionEntryProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Entry Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareSection#validateHearingPlanOfCareSectionEntrySubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Entry Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareSection#validateHearingPlanOfCareSectionEntrySupply(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Entry Supply</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareSection#validateHearingPlanOfCareSectionEntryInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Entry Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HearingPlanOfCareSectionOperations extends SectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected HearingPlanOfCareSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareSectionTemplateId(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareSectionTemplateId(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.26.2.3.1')";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareSectionTemplateId(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareSectionTemplateId(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareSection The receiving '<em><b>Hearing Plan Of Care Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareSectionTemplateId(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_SECTION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_SECTION__HEARING_PLAN_OF_CARE_SECTION_TEMPLATE_ID,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareSectionTemplateId"),
             new Object [] { hearingPlanOfCareSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareSectionCode(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareSectionCode(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '18776-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareSectionCode(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareSectionCode(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareSection The receiving '<em><b>Hearing Plan Of Care Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareSectionCode(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_SECTION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_SECTION__HEARING_PLAN_OF_CARE_SECTION_CODE,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareSectionCode"),
             new Object [] { hearingPlanOfCareSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareSectionCodeP(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareSectionCodeP(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareSectionCodeP(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareSectionCodeP(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareSection The receiving '<em><b>Hearing Plan Of Care Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareSectionCodeP(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_SECTION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_SECTION__HEARING_PLAN_OF_CARE_SECTION_CODE_P,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareSectionCodeP"),
             new Object [] { hearingPlanOfCareSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareSectionTitle(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Title</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareSectionTitle(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareSectionTitle(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareSectionTitle(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareSection The receiving '<em><b>Hearing Plan Of Care Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareSectionTitle(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_SECTION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_SECTION__HEARING_PLAN_OF_CARE_SECTION_TITLE,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareSectionTitle"),
             new Object [] { hearingPlanOfCareSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareSectionText(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareSectionText(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareSectionText(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareSectionText(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareSection The receiving '<em><b>Hearing Plan Of Care Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareSectionText(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_SECTION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_SECTION__HEARING_PLAN_OF_CARE_SECTION_TEXT,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareSectionText"),
             new Object [] { hearingPlanOfCareSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareSectionEntryAct(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Entry Act</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareSectionEntryAct(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareSectionEntryAct(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Entry Act</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareSectionEntryAct(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareSection The receiving '<em><b>Hearing Plan Of Care Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareSectionEntryAct(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_SECTION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_SECTION__HEARING_PLAN_OF_CARE_SECTION_ENTRY_ACT,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareSectionEntryAct"),
             new Object [] { hearingPlanOfCareSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareSectionEntryEncounter(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Entry Encounter</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareSectionEntryEncounter(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareSectionEntryEncounter(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Entry Encounter</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareSectionEntryEncounter(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareSection The receiving '<em><b>Hearing Plan Of Care Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareSectionEntryEncounter(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_SECTION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_SECTION__HEARING_PLAN_OF_CARE_SECTION_ENTRY_ENCOUNTER,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareSectionEntryEncounter"),
             new Object [] { hearingPlanOfCareSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareSectionEntryObservation(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Entry Observation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareSectionEntryObservation(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareSectionEntryObservation(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Entry Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareSectionEntryObservation(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareSection The receiving '<em><b>Hearing Plan Of Care Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareSectionEntryObservation(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_SECTION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_SECTION__HEARING_PLAN_OF_CARE_SECTION_ENTRY_OBSERVATION,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareSectionEntryObservation"),
             new Object [] { hearingPlanOfCareSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareSectionEntryProcedure(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Entry Procedure</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareSectionEntryProcedure(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareSectionEntryProcedure(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Entry Procedure</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareSectionEntryProcedure(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareSection The receiving '<em><b>Hearing Plan Of Care Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareSectionEntryProcedure(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_SECTION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_SECTION__HEARING_PLAN_OF_CARE_SECTION_ENTRY_PROCEDURE,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareSectionEntryProcedure"),
             new Object [] { hearingPlanOfCareSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareSectionEntrySubstanceAdministration(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Entry Substance Administration</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareSectionEntrySubstanceAdministration(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareSectionEntrySubstanceAdministration(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Entry Substance Administration</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareSectionEntrySubstanceAdministration(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareSection The receiving '<em><b>Hearing Plan Of Care Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareSectionEntrySubstanceAdministration(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_SECTION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_SECTION__HEARING_PLAN_OF_CARE_SECTION_ENTRY_SUBSTANCE_ADMINISTRATION,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareSectionEntrySubstanceAdministration"),
             new Object [] { hearingPlanOfCareSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareSectionEntrySupply(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Entry Supply</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareSectionEntrySupply(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareSectionEntrySupply(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Entry Supply</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareSectionEntrySupply(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareSection The receiving '<em><b>Hearing Plan Of Care Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareSectionEntrySupply(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_SECTION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_SECTION__HEARING_PLAN_OF_CARE_SECTION_ENTRY_SUPPLY,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareSectionEntrySupply"),
             new Object [] { hearingPlanOfCareSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareSectionEntryInstructions(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Entry Instructions</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareSectionEntryInstructions(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareSectionEntryInstructions(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Section Entry Instructions</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareSectionEntryInstructions(HearingPlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareSection The receiving '<em><b>Hearing Plan Of Care Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareSectionEntryInstructions(HearingPlanOfCareSection hearingPlanOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_SECTION);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_SECTION_ENTRY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_SECTION__HEARING_PLAN_OF_CARE_SECTION_ENTRY_INSTRUCTIONS,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareSectionEntryInstructions"),
             new Object [] { hearingPlanOfCareSection }));
      }
       
      return false;
    }
    return true;
  }

} // HearingPlanOfCareSectionOperations