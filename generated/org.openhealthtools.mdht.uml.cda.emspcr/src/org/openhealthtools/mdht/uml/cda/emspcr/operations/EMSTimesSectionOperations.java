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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Times Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionEntry2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionEntry3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionEntry4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry4</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionEntry5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry5</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionEntry6(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry6</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionEntry7(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry7</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionEntry8(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry8</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionEntry9(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry9</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSTimesSectionOperations extends SectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMSTimesSectionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSTimesSectionTemplateId(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionTemplateId(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_TIMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.10')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSTimesSectionTemplateId(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionTemplateId(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_TIMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.10')
   * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSTimesSectionTemplateId(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_TIMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
      try
      {
        VALIDATE_EMS_TIMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_TIMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsTimesSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_TEMPLATE_ID,
             EmspcrPlugin.INSTANCE.getString("EMSTimesSectionTemplateId"),
             new Object [] { emsTimesSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSTimesSectionCode(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionCode(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_TIMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67667-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSTimesSectionCode(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionCode(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_TIMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67667-6' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSTimesSectionCode(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_TIMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
      try
      {
        VALIDATE_EMS_TIMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_TIMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsTimesSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_CODE,
             EmspcrPlugin.INSTANCE.getString("EMSTimesSectionCode"),
             new Object [] { emsTimesSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSTimesSectionText(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionText(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_TIMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateEMSTimesSectionText(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionText(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_TIMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.text.oclIsUndefined()
   * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSTimesSectionText(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_TIMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
      try
      {
        VALIDATE_EMS_TIMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_TIMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsTimesSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_TEXT,
             EmspcrPlugin.INSTANCE.getString("EMSTimesSectionText"),
             new Object [] { emsTimesSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSTimesSectionTitle(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Title</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionTitle(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_TIMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Times')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSTimesSectionTitle(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionTitle(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_TIMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Times')
   * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSTimesSectionTitle(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_TIMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
      try
      {
        VALIDATE_EMS_TIMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_TIMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsTimesSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_TITLE,
             EmspcrPlugin.INSTANCE.getString("EMSTimesSectionTitle"),
             new Object [] { emsTimesSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSTimesSectionEntry1(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionEntry1(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_TIMES_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSTimesSection::DerivedEntry))";

  /**
   * The cached OCL invariant for the '{@link #validateEMSTimesSectionEntry1(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionEntry1(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_TIMES_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSTimesSection::DerivedEntry))
   * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSTimesSectionEntry1(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_TIMES_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
      try
      {
        VALIDATE_EMS_TIMES_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_TIMES_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsTimesSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_ENTRY1,
             EmspcrPlugin.INSTANCE.getString("EMSTimesSectionEntry1"),
             new Object [] { emsTimesSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSTimesSectionEntry2(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry2</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionEntry2(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_TIMES_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSTimesSection::DerivedEntry))";

  /**
   * The cached OCL invariant for the '{@link #validateEMSTimesSectionEntry2(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry2</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionEntry2(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_TIMES_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSTimesSection::DerivedEntry))
   * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSTimesSectionEntry2(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_TIMES_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
      try
      {
        VALIDATE_EMS_TIMES_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_TIMES_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsTimesSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_ENTRY2,
             EmspcrPlugin.INSTANCE.getString("EMSTimesSectionEntry2"),
             new Object [] { emsTimesSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSTimesSectionEntry3(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry3</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionEntry3(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_TIMES_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSTimesSection::DerivedEntry))";

  /**
   * The cached OCL invariant for the '{@link #validateEMSTimesSectionEntry3(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry3</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionEntry3(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_TIMES_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSTimesSection::DerivedEntry))
   * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSTimesSectionEntry3(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_TIMES_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
      try
      {
        VALIDATE_EMS_TIMES_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_TIMES_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsTimesSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_ENTRY3,
             EmspcrPlugin.INSTANCE.getString("EMSTimesSectionEntry3"),
             new Object [] { emsTimesSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSTimesSectionEntry4(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry4</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionEntry4(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_TIMES_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSTimesSection::DerivedEntry))";

  /**
   * The cached OCL invariant for the '{@link #validateEMSTimesSectionEntry4(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry4</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionEntry4(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_TIMES_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSTimesSection::DerivedEntry))
   * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSTimesSectionEntry4(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_TIMES_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
      try
      {
        VALIDATE_EMS_TIMES_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_TIMES_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsTimesSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_ENTRY4,
             EmspcrPlugin.INSTANCE.getString("EMSTimesSectionEntry4"),
             new Object [] { emsTimesSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSTimesSectionEntry5(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry5</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionEntry5(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_TIMES_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSTimesSection::DerivedEntry))";

  /**
   * The cached OCL invariant for the '{@link #validateEMSTimesSectionEntry5(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry5</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionEntry5(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_TIMES_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSTimesSection::DerivedEntry))
   * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSTimesSectionEntry5(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_TIMES_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
      try
      {
        VALIDATE_EMS_TIMES_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_TIMES_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsTimesSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_ENTRY5,
             EmspcrPlugin.INSTANCE.getString("EMSTimesSectionEntry5"),
             new Object [] { emsTimesSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSTimesSectionEntry6(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry6</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionEntry6(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_TIMES_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSTimesSection::DerivedEntry))";

  /**
   * The cached OCL invariant for the '{@link #validateEMSTimesSectionEntry6(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry6</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionEntry6(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_TIMES_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSTimesSection::DerivedEntry))
   * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSTimesSectionEntry6(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_TIMES_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
      try
      {
        VALIDATE_EMS_TIMES_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_TIMES_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsTimesSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_ENTRY6,
             EmspcrPlugin.INSTANCE.getString("EMSTimesSectionEntry6"),
             new Object [] { emsTimesSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSTimesSectionEntry7(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry7</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionEntry7(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_TIMES_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSTimesSection::DerivedEntry))";

  /**
   * The cached OCL invariant for the '{@link #validateEMSTimesSectionEntry7(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry7</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionEntry7(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_TIMES_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSTimesSection::DerivedEntry))
   * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSTimesSectionEntry7(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_TIMES_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
      try
      {
        VALIDATE_EMS_TIMES_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_TIMES_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsTimesSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_ENTRY7,
             EmspcrPlugin.INSTANCE.getString("EMSTimesSectionEntry7"),
             new Object [] { emsTimesSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSTimesSectionEntry8(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry8</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionEntry8(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_TIMES_SECTION_ENTRY8__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSTimesSection::DerivedEntry))";

  /**
   * The cached OCL invariant for the '{@link #validateEMSTimesSectionEntry8(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry8</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionEntry8(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_TIMES_SECTION_ENTRY8__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSTimesSection::DerivedEntry))
   * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSTimesSectionEntry8(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_TIMES_SECTION_ENTRY8__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
      try
      {
        VALIDATE_EMS_TIMES_SECTION_ENTRY8__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_ENTRY8__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_TIMES_SECTION_ENTRY8__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsTimesSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_ENTRY8,
             EmspcrPlugin.INSTANCE.getString("EMSTimesSectionEntry8"),
             new Object [] { emsTimesSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSTimesSectionEntry9(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry9</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionEntry9(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_TIMES_SECTION_ENTRY9__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSTimesSection::DerivedEntry))";

  /**
   * The cached OCL invariant for the '{@link #validateEMSTimesSectionEntry9(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry9</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSTimesSectionEntry9(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_TIMES_SECTION_ENTRY9__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSTimesSection::DerivedEntry))
   * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSTimesSectionEntry9(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_TIMES_SECTION_ENTRY9__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
      try
      {
        VALIDATE_EMS_TIMES_SECTION_ENTRY9__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_ENTRY9__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_TIMES_SECTION_ENTRY9__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsTimesSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_ENTRY9,
             EmspcrPlugin.INSTANCE.getString("EMSTimesSectionEntry9"),
             new Object [] { emsTimesSection }));
      }
       
      return false;
    }
    return true;
  }

} // EMSTimesSectionOperations