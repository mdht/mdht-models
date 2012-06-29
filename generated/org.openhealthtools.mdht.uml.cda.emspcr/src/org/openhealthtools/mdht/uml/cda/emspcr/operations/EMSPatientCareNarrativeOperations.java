/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrative;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Patient Care Narrative</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrative#validateEMSPatientCareNarrativeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrative#validateEMSPatientCareNarrativeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrative#validateEMSPatientCareNarrativeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrative#validateEMSPatientCareNarrativeText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrative#validateEMSPatientCareNarrativeTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSPatientCareNarrativeOperations extends SectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMSPatientCareNarrativeOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPatientCareNarrativeTemplateId(EMSPatientCareNarrative, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPatientCareNarrativeTemplateId(EMSPatientCareNarrative, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PATIENT_CARE_NARRATIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.1')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPatientCareNarrativeTemplateId(EMSPatientCareNarrative, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPatientCareNarrativeTemplateId(EMSPatientCareNarrative, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PATIENT_CARE_NARRATIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.1')
   * @param emsPatientCareNarrative The receiving '<em><b>EMS Patient Care Narrative</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPatientCareNarrativeTemplateId(EMSPatientCareNarrative emsPatientCareNarrative, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PATIENT_CARE_NARRATIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PATIENT_CARE_NARRATIVE);
      try
      {
        VALIDATE_EMS_PATIENT_CARE_NARRATIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PATIENT_CARE_NARRATIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PATIENT_CARE_NARRATIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPatientCareNarrative))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PATIENT_CARE_NARRATIVE__EMS_PATIENT_CARE_NARRATIVE_TEMPLATE_ID,
             EmspcrPlugin.INSTANCE.getString("EMSPatientCareNarrativeTemplateId"),
             new Object [] { emsPatientCareNarrative }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPatientCareNarrativeCode(EMSPatientCareNarrative, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPatientCareNarrativeCode(EMSPatientCareNarrative, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PATIENT_CARE_NARRATIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67781?5' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPatientCareNarrativeCode(EMSPatientCareNarrative, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPatientCareNarrativeCode(EMSPatientCareNarrative, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PATIENT_CARE_NARRATIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67781?5' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param emsPatientCareNarrative The receiving '<em><b>EMS Patient Care Narrative</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPatientCareNarrativeCode(EMSPatientCareNarrative emsPatientCareNarrative, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PATIENT_CARE_NARRATIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PATIENT_CARE_NARRATIVE);
      try
      {
        VALIDATE_EMS_PATIENT_CARE_NARRATIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PATIENT_CARE_NARRATIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PATIENT_CARE_NARRATIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPatientCareNarrative))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PATIENT_CARE_NARRATIVE__EMS_PATIENT_CARE_NARRATIVE_CODE,
             EmspcrPlugin.INSTANCE.getString("EMSPatientCareNarrativeCode"),
             new Object [] { emsPatientCareNarrative }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPatientCareNarrativeCodeP(EMSPatientCareNarrative, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPatientCareNarrativeCodeP(EMSPatientCareNarrative, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PATIENT_CARE_NARRATIVE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPatientCareNarrativeCodeP(EMSPatientCareNarrative, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPatientCareNarrativeCodeP(EMSPatientCareNarrative, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PATIENT_CARE_NARRATIVE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param emsPatientCareNarrative The receiving '<em><b>EMS Patient Care Narrative</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPatientCareNarrativeCodeP(EMSPatientCareNarrative emsPatientCareNarrative, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PATIENT_CARE_NARRATIVE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PATIENT_CARE_NARRATIVE);
      try
      {
        VALIDATE_EMS_PATIENT_CARE_NARRATIVE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PATIENT_CARE_NARRATIVE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PATIENT_CARE_NARRATIVE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPatientCareNarrative))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PATIENT_CARE_NARRATIVE__EMS_PATIENT_CARE_NARRATIVE_CODE_P,
             EmspcrPlugin.INSTANCE.getString("EMSPatientCareNarrativeCodeP"),
             new Object [] { emsPatientCareNarrative }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPatientCareNarrativeText(EMSPatientCareNarrative, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPatientCareNarrativeText(EMSPatientCareNarrative, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PATIENT_CARE_NARRATIVE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPatientCareNarrativeText(EMSPatientCareNarrative, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPatientCareNarrativeText(EMSPatientCareNarrative, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PATIENT_CARE_NARRATIVE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.text.oclIsUndefined()
   * @param emsPatientCareNarrative The receiving '<em><b>EMS Patient Care Narrative</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPatientCareNarrativeText(EMSPatientCareNarrative emsPatientCareNarrative, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PATIENT_CARE_NARRATIVE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PATIENT_CARE_NARRATIVE);
      try
      {
        VALIDATE_EMS_PATIENT_CARE_NARRATIVE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PATIENT_CARE_NARRATIVE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PATIENT_CARE_NARRATIVE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPatientCareNarrative))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PATIENT_CARE_NARRATIVE__EMS_PATIENT_CARE_NARRATIVE_TEXT,
             EmspcrPlugin.INSTANCE.getString("EMSPatientCareNarrativeText"),
             new Object [] { emsPatientCareNarrative }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPatientCareNarrativeTitle(EMSPatientCareNarrative, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Title</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPatientCareNarrativeTitle(EMSPatientCareNarrative, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PATIENT_CARE_NARRATIVE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Patient Care Report Narrative')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPatientCareNarrativeTitle(EMSPatientCareNarrative, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPatientCareNarrativeTitle(EMSPatientCareNarrative, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PATIENT_CARE_NARRATIVE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Patient Care Report Narrative')
   * @param emsPatientCareNarrative The receiving '<em><b>EMS Patient Care Narrative</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPatientCareNarrativeTitle(EMSPatientCareNarrative emsPatientCareNarrative, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PATIENT_CARE_NARRATIVE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PATIENT_CARE_NARRATIVE);
      try
      {
        VALIDATE_EMS_PATIENT_CARE_NARRATIVE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PATIENT_CARE_NARRATIVE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PATIENT_CARE_NARRATIVE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPatientCareNarrative))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PATIENT_CARE_NARRATIVE__EMS_PATIENT_CARE_NARRATIVE_TITLE,
             EmspcrPlugin.INSTANCE.getString("EMSPatientCareNarrativeTitle"),
             new Object [] { emsPatientCareNarrative }));
      }
       
      return false;
    }
    return true;
  }

} // EMSPatientCareNarrativeOperations