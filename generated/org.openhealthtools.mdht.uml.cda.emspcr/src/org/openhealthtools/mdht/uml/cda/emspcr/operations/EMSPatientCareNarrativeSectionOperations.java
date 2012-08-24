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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrativeSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Patient Care Narrative Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrativeSection#validateEMSPatientCareNarrativeSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrativeSection#validateEMSPatientCareNarrativeSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrativeSection#validateEMSPatientCareNarrativeSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrativeSection#validateEMSPatientCareNarrativeSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrativeSection#validateEMSPatientCareNarrativeSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSPatientCareNarrativeSectionOperations extends SectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMSPatientCareNarrativeSectionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPatientCareNarrativeSectionTemplateId(EMSPatientCareNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPatientCareNarrativeSectionTemplateId(EMSPatientCareNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.1')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPatientCareNarrativeSectionTemplateId(EMSPatientCareNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPatientCareNarrativeSectionTemplateId(EMSPatientCareNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param emsPatientCareNarrativeSection The receiving '<em><b>EMS Patient Care Narrative Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPatientCareNarrativeSectionTemplateId(EMSPatientCareNarrativeSection emsPatientCareNarrativeSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PATIENT_CARE_NARRATIVE_SECTION);
      try
      {
        VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPatientCareNarrativeSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PATIENT_CARE_NARRATIVE_SECTION__EMS_PATIENT_CARE_NARRATIVE_SECTION_TEMPLATE_ID,
             EmspcrPlugin.INSTANCE.getString("EMSPatientCareNarrativeSectionTemplateId"),
             new Object [] { emsPatientCareNarrativeSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPatientCareNarrativeSectionCode(EMSPatientCareNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Section Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPatientCareNarrativeSectionCode(EMSPatientCareNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67781-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPatientCareNarrativeSectionCode(EMSPatientCareNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPatientCareNarrativeSectionCode(EMSPatientCareNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param emsPatientCareNarrativeSection The receiving '<em><b>EMS Patient Care Narrative Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPatientCareNarrativeSectionCode(EMSPatientCareNarrativeSection emsPatientCareNarrativeSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PATIENT_CARE_NARRATIVE_SECTION);
      try
      {
        VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPatientCareNarrativeSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PATIENT_CARE_NARRATIVE_SECTION__EMS_PATIENT_CARE_NARRATIVE_SECTION_CODE,
             EmspcrPlugin.INSTANCE.getString("EMSPatientCareNarrativeSectionCode"),
             new Object [] { emsPatientCareNarrativeSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPatientCareNarrativeSectionCodeP(EMSPatientCareNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Section Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPatientCareNarrativeSectionCodeP(EMSPatientCareNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPatientCareNarrativeSectionCodeP(EMSPatientCareNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Section Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPatientCareNarrativeSectionCodeP(EMSPatientCareNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param emsPatientCareNarrativeSection The receiving '<em><b>EMS Patient Care Narrative Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPatientCareNarrativeSectionCodeP(EMSPatientCareNarrativeSection emsPatientCareNarrativeSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PATIENT_CARE_NARRATIVE_SECTION);
      try
      {
        VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPatientCareNarrativeSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PATIENT_CARE_NARRATIVE_SECTION__EMS_PATIENT_CARE_NARRATIVE_SECTION_CODE_P,
             EmspcrPlugin.INSTANCE.getString("EMSPatientCareNarrativeSectionCodeP"),
             new Object [] { emsPatientCareNarrativeSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param emsPatientCareNarrativeSection The receiving '<em><b>EMS Patient Care Narrative Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPatientCareNarrativeSectionText(EMSPatientCareNarrativeSection emsPatientCareNarrativeSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PATIENT_CARE_NARRATIVE_SECTION);
      try
      {
        VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPatientCareNarrativeSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PATIENT_CARE_NARRATIVE_SECTION__EMS_PATIENT_CARE_NARRATIVE_SECTION_TEXT,
             EmspcrPlugin.INSTANCE.getString("EMSPatientCareNarrativeSectionText"),
             new Object [] { emsPatientCareNarrativeSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPatientCareNarrativeSectionTitle(EMSPatientCareNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Section Title</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPatientCareNarrativeSectionTitle(EMSPatientCareNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Patient Care Report Narrative')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPatientCareNarrativeSectionTitle(EMSPatientCareNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Section Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPatientCareNarrativeSectionTitle(EMSPatientCareNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validateEMSPatientCareNarrativeSectionText(EMSPatientCareNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Section Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPatientCareNarrativeSectionText(EMSPatientCareNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPatientCareNarrativeSectionText(EMSPatientCareNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Patient Care Narrative Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPatientCareNarrativeSectionText(EMSPatientCareNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param emsPatientCareNarrativeSection The receiving '<em><b>EMS Patient Care Narrative Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPatientCareNarrativeSectionTitle(EMSPatientCareNarrativeSection emsPatientCareNarrativeSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PATIENT_CARE_NARRATIVE_SECTION);
      try
      {
        VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PATIENT_CARE_NARRATIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPatientCareNarrativeSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PATIENT_CARE_NARRATIVE_SECTION__EMS_PATIENT_CARE_NARRATIVE_SECTION_TITLE,
             EmspcrPlugin.INSTANCE.getString("EMSPatientCareNarrativeSectionTitle"),
             new Object [] { emsPatientCareNarrativeSection }));
      }
       
      return false;
    }
    return true;
  }

} // EMSPatientCareNarrativeSectionOperations