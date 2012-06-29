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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEvent;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Personnel Adverse Event</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEvent#validateEMSPersonnelAdverseEventTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEvent#validateEMSPersonnelAdverseEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEvent#validateEMSPersonnelAdverseEventCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEvent#validateEMSPersonnelAdverseEventText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEvent#validateEMSPersonnelAdverseEventTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEvent#validateEMSPersonnelAdverseEventEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEvent#validateEMSPersonnelAdverseEventEntry2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Entry2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSPersonnelAdverseEventOperations extends DerivedCDASectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMSPersonnelAdverseEventOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPersonnelAdverseEventTemplateId(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventTemplateId(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.6')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPersonnelAdverseEventTemplateId(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventTemplateId(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.6')
   * @param emsPersonnelAdverseEvent The receiving '<em><b>EMS Personnel Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPersonnelAdverseEventTemplateId(EMSPersonnelAdverseEvent emsPersonnelAdverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT);
      try
      {
        VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPersonnelAdverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PERSONNEL_ADVERSE_EVENT__EMS_PERSONNEL_ADVERSE_EVENT_TEMPLATE_ID,
             EmspcrPlugin.INSTANCE.getString("EMSPersonnelAdverseEventTemplateId"),
             new Object [] { emsPersonnelAdverseEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPersonnelAdverseEventCode(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventCode(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67658?5' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPersonnelAdverseEventCode(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventCode(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67658?5' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param emsPersonnelAdverseEvent The receiving '<em><b>EMS Personnel Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPersonnelAdverseEventCode(EMSPersonnelAdverseEvent emsPersonnelAdverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT);
      try
      {
        VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPersonnelAdverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PERSONNEL_ADVERSE_EVENT__EMS_PERSONNEL_ADVERSE_EVENT_CODE,
             EmspcrPlugin.INSTANCE.getString("EMSPersonnelAdverseEventCode"),
             new Object [] { emsPersonnelAdverseEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPersonnelAdverseEventCodeP(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventCodeP(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPersonnelAdverseEventCodeP(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventCodeP(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param emsPersonnelAdverseEvent The receiving '<em><b>EMS Personnel Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPersonnelAdverseEventCodeP(EMSPersonnelAdverseEvent emsPersonnelAdverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT);
      try
      {
        VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPersonnelAdverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PERSONNEL_ADVERSE_EVENT__EMS_PERSONNEL_ADVERSE_EVENT_CODE_P,
             EmspcrPlugin.INSTANCE.getString("EMSPersonnelAdverseEventCodeP"),
             new Object [] { emsPersonnelAdverseEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPersonnelAdverseEventText(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventText(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPersonnelAdverseEventText(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventText(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.text.oclIsUndefined()
   * @param emsPersonnelAdverseEvent The receiving '<em><b>EMS Personnel Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPersonnelAdverseEventText(EMSPersonnelAdverseEvent emsPersonnelAdverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT);
      try
      {
        VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPersonnelAdverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PERSONNEL_ADVERSE_EVENT__EMS_PERSONNEL_ADVERSE_EVENT_TEXT,
             EmspcrPlugin.INSTANCE.getString("EMSPersonnelAdverseEventText"),
             new Object [] { emsPersonnelAdverseEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPersonnelAdverseEventTitle(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Title</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventTitle(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Exposures or Injuries of EMS Personnel')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPersonnelAdverseEventTitle(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventTitle(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Exposures or Injuries of EMS Personnel')
   * @param emsPersonnelAdverseEvent The receiving '<em><b>EMS Personnel Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPersonnelAdverseEventTitle(EMSPersonnelAdverseEvent emsPersonnelAdverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT);
      try
      {
        VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPersonnelAdverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PERSONNEL_ADVERSE_EVENT__EMS_PERSONNEL_ADVERSE_EVENT_TITLE,
             EmspcrPlugin.INSTANCE.getString("EMSPersonnelAdverseEventTitle"),
             new Object [] { emsPersonnelAdverseEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPersonnelAdverseEventEntry1(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Entry1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventEntry1(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPersonnelAdverseEvent::DerivedEntry))";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPersonnelAdverseEventEntry1(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Entry1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventEntry1(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPersonnelAdverseEvent::DerivedEntry))
   * @param emsPersonnelAdverseEvent The receiving '<em><b>EMS Personnel Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPersonnelAdverseEventEntry1(EMSPersonnelAdverseEvent emsPersonnelAdverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT);
      try
      {
        VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPersonnelAdverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PERSONNEL_ADVERSE_EVENT__EMS_PERSONNEL_ADVERSE_EVENT_ENTRY1,
             EmspcrPlugin.INSTANCE.getString("EMSPersonnelAdverseEventEntry1"),
             new Object [] { emsPersonnelAdverseEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPersonnelAdverseEventEntry2(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Entry2</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventEntry2(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPersonnelAdverseEvent::DerivedEntry))";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPersonnelAdverseEventEntry2(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Entry2</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPersonnelAdverseEventEntry2(EMSPersonnelAdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPersonnelAdverseEvent::DerivedEntry))
   * @param emsPersonnelAdverseEvent The receiving '<em><b>EMS Personnel Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPersonnelAdverseEventEntry2(EMSPersonnelAdverseEvent emsPersonnelAdverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT);
      try
      {
        VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPersonnelAdverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PERSONNEL_ADVERSE_EVENT__EMS_PERSONNEL_ADVERSE_EVENT_ENTRY2,
             EmspcrPlugin.INSTANCE.getString("EMSPersonnelAdverseEventEntry2"),
             new Object [] { emsPersonnelAdverseEvent }));
      }
       
      return false;
    }
    return true;
  }

} // EMSPersonnelAdverseEventOperations