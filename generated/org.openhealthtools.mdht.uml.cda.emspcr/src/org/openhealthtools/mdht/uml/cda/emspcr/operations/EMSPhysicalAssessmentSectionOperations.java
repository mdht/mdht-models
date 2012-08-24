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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Physical Assessment Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionEntry2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Entry2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionEntry3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Entry3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionEntry4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Entry4</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionEntry5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Entry5</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionEntry6(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Entry6</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSPhysicalAssessmentSectionOperations extends SectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMSPhysicalAssessmentSectionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPhysicalAssessmentSectionTemplateId(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPhysicalAssessmentSectionTemplateId(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.20')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPhysicalAssessmentSectionTemplateId(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPhysicalAssessmentSectionTemplateId(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param emsPhysicalAssessmentSection The receiving '<em><b>EMS Physical Assessment Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPhysicalAssessmentSectionTemplateId(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION);
      try
      {
        VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPhysicalAssessmentSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_TEMPLATE_ID,
             EmspcrPlugin.INSTANCE.getString("EMSPhysicalAssessmentSectionTemplateId"),
             new Object [] { emsPhysicalAssessmentSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPhysicalAssessmentSectionCode(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPhysicalAssessmentSectionCode(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67668-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPhysicalAssessmentSectionCode(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPhysicalAssessmentSectionCode(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param emsPhysicalAssessmentSection The receiving '<em><b>EMS Physical Assessment Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPhysicalAssessmentSectionCode(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION);
      try
      {
        VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPhysicalAssessmentSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_CODE,
             EmspcrPlugin.INSTANCE.getString("EMSPhysicalAssessmentSectionCode"),
             new Object [] { emsPhysicalAssessmentSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPhysicalAssessmentSectionCodeP(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPhysicalAssessmentSectionCodeP(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPhysicalAssessmentSectionCodeP(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPhysicalAssessmentSectionCodeP(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param emsPhysicalAssessmentSection The receiving '<em><b>EMS Physical Assessment Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPhysicalAssessmentSectionCodeP(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION);
      try
      {
        VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPhysicalAssessmentSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_CODE_P,
             EmspcrPlugin.INSTANCE.getString("EMSPhysicalAssessmentSectionCodeP"),
             new Object [] { emsPhysicalAssessmentSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param emsPhysicalAssessmentSection The receiving '<em><b>EMS Physical Assessment Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPhysicalAssessmentSectionText(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION);
      try
      {
        VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPhysicalAssessmentSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_TEXT,
             EmspcrPlugin.INSTANCE.getString("EMSPhysicalAssessmentSectionText"),
             new Object [] { emsPhysicalAssessmentSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPhysicalAssessmentSectionTitle(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Title</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPhysicalAssessmentSectionTitle(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Physical Assessment Section')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPhysicalAssessmentSectionTitle(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPhysicalAssessmentSectionTitle(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validateEMSPhysicalAssessmentSectionText(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPhysicalAssessmentSectionText(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPhysicalAssessmentSectionText(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPhysicalAssessmentSectionText(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param emsPhysicalAssessmentSection The receiving '<em><b>EMS Physical Assessment Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPhysicalAssessmentSectionTitle(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION);
      try
      {
        VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPhysicalAssessmentSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_TITLE,
             EmspcrPlugin.INSTANCE.getString("EMSPhysicalAssessmentSectionTitle"),
             new Object [] { emsPhysicalAssessmentSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPhysicalAssessmentSectionEntry1(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Entry1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPhysicalAssessmentSectionEntry1(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPhysicalAssessmentSectionEntry1(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Entry1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPhysicalAssessmentSectionEntry1(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param emsPhysicalAssessmentSection The receiving '<em><b>EMS Physical Assessment Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPhysicalAssessmentSectionEntry1(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION);
      try
      {
        VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPhysicalAssessmentSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY1,
             EmspcrPlugin.INSTANCE.getString("EMSPhysicalAssessmentSectionEntry1"),
             new Object [] { emsPhysicalAssessmentSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPhysicalAssessmentSectionEntry2(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Entry2</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPhysicalAssessmentSectionEntry2(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPhysicalAssessmentSectionEntry2(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Entry2</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPhysicalAssessmentSectionEntry2(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param emsPhysicalAssessmentSection The receiving '<em><b>EMS Physical Assessment Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPhysicalAssessmentSectionEntry2(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION);
      try
      {
        VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPhysicalAssessmentSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY2,
             EmspcrPlugin.INSTANCE.getString("EMSPhysicalAssessmentSectionEntry2"),
             new Object [] { emsPhysicalAssessmentSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPhysicalAssessmentSectionEntry3(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Entry3</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPhysicalAssessmentSectionEntry3(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPhysicalAssessmentSectionEntry3(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Entry3</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPhysicalAssessmentSectionEntry3(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param emsPhysicalAssessmentSection The receiving '<em><b>EMS Physical Assessment Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPhysicalAssessmentSectionEntry3(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION);
      try
      {
        VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPhysicalAssessmentSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY3,
             EmspcrPlugin.INSTANCE.getString("EMSPhysicalAssessmentSectionEntry3"),
             new Object [] { emsPhysicalAssessmentSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPhysicalAssessmentSectionEntry4(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Entry4</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPhysicalAssessmentSectionEntry4(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPhysicalAssessmentSectionEntry4(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Entry4</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPhysicalAssessmentSectionEntry4(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param emsPhysicalAssessmentSection The receiving '<em><b>EMS Physical Assessment Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPhysicalAssessmentSectionEntry4(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION);
      try
      {
        VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPhysicalAssessmentSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY4,
             EmspcrPlugin.INSTANCE.getString("EMSPhysicalAssessmentSectionEntry4"),
             new Object [] { emsPhysicalAssessmentSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPhysicalAssessmentSectionEntry5(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Entry5</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPhysicalAssessmentSectionEntry5(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPhysicalAssessmentSectionEntry5(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Entry5</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPhysicalAssessmentSectionEntry5(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param emsPhysicalAssessmentSection The receiving '<em><b>EMS Physical Assessment Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPhysicalAssessmentSectionEntry5(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION);
      try
      {
        VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPhysicalAssessmentSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY5,
             EmspcrPlugin.INSTANCE.getString("EMSPhysicalAssessmentSectionEntry5"),
             new Object [] { emsPhysicalAssessmentSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPhysicalAssessmentSectionEntry6(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Entry6</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPhysicalAssessmentSectionEntry6(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPhysicalAssessmentSectionEntry6(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Entry6</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPhysicalAssessmentSectionEntry6(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param emsPhysicalAssessmentSection The receiving '<em><b>EMS Physical Assessment Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPhysicalAssessmentSectionEntry6(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION);
      try
      {
        VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPhysicalAssessmentSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY6,
             EmspcrPlugin.INSTANCE.getString("EMSPhysicalAssessmentSectionEntry6"),
             new Object [] { emsPhysicalAssessmentSection }));
      }
       
      return false;
    }
    return true;
  }

} // EMSPhysicalAssessmentSectionOperations