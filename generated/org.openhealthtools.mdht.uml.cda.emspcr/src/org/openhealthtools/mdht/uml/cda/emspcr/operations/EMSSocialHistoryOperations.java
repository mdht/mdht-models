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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistory;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Social History</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistory#validateEMSSocialHistoryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistory#validateEMSSocialHistoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistory#validateEMSSocialHistoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistory#validateEMSSocialHistoryTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistory#validateEMSSocialHistoryEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistory#validateEMSSocialHistoryEntry2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Entry2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSSocialHistoryOperations extends DerivedCDASectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMSSocialHistoryOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSSocialHistoryTemplateId(EMSSocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSSocialHistoryTemplateId(EMSSocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_SOCIAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.22')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSSocialHistoryTemplateId(EMSSocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSSocialHistoryTemplateId(EMSSocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_SOCIAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.22')
   * @param emsSocialHistory The receiving '<em><b>EMS Social History</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSSocialHistoryTemplateId(EMSSocialHistory emsSocialHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_SOCIAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_SOCIAL_HISTORY);
      try
      {
        VALIDATE_EMS_SOCIAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SOCIAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_SOCIAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsSocialHistory))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_SOCIAL_HISTORY__EMS_SOCIAL_HISTORY_TEMPLATE_ID,
             EmspcrPlugin.INSTANCE.getString("EMSSocialHistoryTemplateId"),
             new Object [] { emsSocialHistory }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSSocialHistoryCode(EMSSocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSSocialHistoryCode(EMSSocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_SOCIAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67843?3' and value.codeSystem = '2.16.840.1.113883.6.1'";

  /**
   * The cached OCL invariant for the '{@link #validateEMSSocialHistoryCode(EMSSocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSSocialHistoryCode(EMSSocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_SOCIAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67843?3' and value.codeSystem = '2.16.840.1.113883.6.1'
   * @param emsSocialHistory The receiving '<em><b>EMS Social History</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSSocialHistoryCode(EMSSocialHistory emsSocialHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_SOCIAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_SOCIAL_HISTORY);
      try
      {
        VALIDATE_EMS_SOCIAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SOCIAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_SOCIAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsSocialHistory))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_SOCIAL_HISTORY__EMS_SOCIAL_HISTORY_CODE,
             EmspcrPlugin.INSTANCE.getString("EMSSocialHistoryCode"),
             new Object [] { emsSocialHistory }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSSocialHistoryCodeP(EMSSocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSSocialHistoryCodeP(EMSSocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_SOCIAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateEMSSocialHistoryCodeP(EMSSocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSSocialHistoryCodeP(EMSSocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_SOCIAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.code.oclIsUndefined()
   * @param emsSocialHistory The receiving '<em><b>EMS Social History</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSSocialHistoryCodeP(EMSSocialHistory emsSocialHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_SOCIAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_SOCIAL_HISTORY);
      try
      {
        VALIDATE_EMS_SOCIAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SOCIAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_SOCIAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsSocialHistory))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_SOCIAL_HISTORY__EMS_SOCIAL_HISTORY_CODE_P,
             EmspcrPlugin.INSTANCE.getString("EMSSocialHistoryCodeP"),
             new Object [] { emsSocialHistory }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSSocialHistoryTitle(EMSSocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Title</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSSocialHistoryTitle(EMSSocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_SOCIAL_HISTORY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'EMS Social History')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSSocialHistoryTitle(EMSSocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSSocialHistoryTitle(EMSSocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_SOCIAL_HISTORY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'EMS Social History')
   * @param emsSocialHistory The receiving '<em><b>EMS Social History</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSSocialHistoryTitle(EMSSocialHistory emsSocialHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_SOCIAL_HISTORY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_SOCIAL_HISTORY);
      try
      {
        VALIDATE_EMS_SOCIAL_HISTORY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SOCIAL_HISTORY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_SOCIAL_HISTORY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsSocialHistory))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_SOCIAL_HISTORY__EMS_SOCIAL_HISTORY_TITLE,
             EmspcrPlugin.INSTANCE.getString("EMSSocialHistoryTitle"),
             new Object [] { emsSocialHistory }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSSocialHistoryEntry1(EMSSocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Entry1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSSocialHistoryEntry1(EMSSocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_SOCIAL_HISTORY_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSocialHistory::DerivedEntry))";

  /**
   * The cached OCL invariant for the '{@link #validateEMSSocialHistoryEntry1(EMSSocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Entry1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSSocialHistoryEntry1(EMSSocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_SOCIAL_HISTORY_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSocialHistory::DerivedEntry))
   * @param emsSocialHistory The receiving '<em><b>EMS Social History</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSSocialHistoryEntry1(EMSSocialHistory emsSocialHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_SOCIAL_HISTORY_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_SOCIAL_HISTORY);
      try
      {
        VALIDATE_EMS_SOCIAL_HISTORY_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SOCIAL_HISTORY_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_SOCIAL_HISTORY_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsSocialHistory))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_SOCIAL_HISTORY__EMS_SOCIAL_HISTORY_ENTRY1,
             EmspcrPlugin.INSTANCE.getString("EMSSocialHistoryEntry1"),
             new Object [] { emsSocialHistory }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSSocialHistoryEntry2(EMSSocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Entry2</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSSocialHistoryEntry2(EMSSocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_SOCIAL_HISTORY_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSocialHistory::DerivedEntry))";

  /**
   * The cached OCL invariant for the '{@link #validateEMSSocialHistoryEntry2(EMSSocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Entry2</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSSocialHistoryEntry2(EMSSocialHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_SOCIAL_HISTORY_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSSocialHistory::DerivedEntry))
   * @param emsSocialHistory The receiving '<em><b>EMS Social History</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSSocialHistoryEntry2(EMSSocialHistory emsSocialHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_SOCIAL_HISTORY_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_SOCIAL_HISTORY);
      try
      {
        VALIDATE_EMS_SOCIAL_HISTORY_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SOCIAL_HISTORY_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_SOCIAL_HISTORY_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsSocialHistory))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_SOCIAL_HISTORY__EMS_SOCIAL_HISTORY_ENTRY2,
             EmspcrPlugin.INSTANCE.getString("EMSSocialHistoryEntry2"),
             new Object [] { emsSocialHistory }));
      }
       
      return false;
    }
    return true;
  }

} // EMSSocialHistoryOperations