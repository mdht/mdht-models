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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistory;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Past Medical History</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistory#validateEMSPastMedicalHistoryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistory#validateEMSPastMedicalHistoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistory#validateEMSPastMedicalHistoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistory#validateEMSPastMedicalHistoryTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistory#validateEMSPastMedicalHistoryEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistory#validateEMSPastMedicalHistoryEntry2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Entry2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSPastMedicalHistoryOperations extends DerivedCDASectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMSPastMedicalHistoryOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPastMedicalHistoryTemplateId(EMSPastMedicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPastMedicalHistoryTemplateId(EMSPastMedicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PAST_MEDICAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.19')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPastMedicalHistoryTemplateId(EMSPastMedicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPastMedicalHistoryTemplateId(EMSPastMedicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PAST_MEDICAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.19')
   * @param emsPastMedicalHistory The receiving '<em><b>EMS Past Medical History</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPastMedicalHistoryTemplateId(EMSPastMedicalHistory emsPastMedicalHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PAST_MEDICAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PAST_MEDICAL_HISTORY);
      try
      {
        VALIDATE_EMS_PAST_MEDICAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PAST_MEDICAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PAST_MEDICAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPastMedicalHistory))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PAST_MEDICAL_HISTORY__EMS_PAST_MEDICAL_HISTORY_TEMPLATE_ID,
             EmspcrPlugin.INSTANCE.getString("EMSPastMedicalHistoryTemplateId"),
             new Object [] { emsPastMedicalHistory }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPastMedicalHistoryCode(EMSPastMedicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPastMedicalHistoryCode(EMSPastMedicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PAST_MEDICAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67842?5' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPastMedicalHistoryCode(EMSPastMedicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPastMedicalHistoryCode(EMSPastMedicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PAST_MEDICAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67842?5' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param emsPastMedicalHistory The receiving '<em><b>EMS Past Medical History</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPastMedicalHistoryCode(EMSPastMedicalHistory emsPastMedicalHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PAST_MEDICAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PAST_MEDICAL_HISTORY);
      try
      {
        VALIDATE_EMS_PAST_MEDICAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PAST_MEDICAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PAST_MEDICAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPastMedicalHistory))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PAST_MEDICAL_HISTORY__EMS_PAST_MEDICAL_HISTORY_CODE,
             EmspcrPlugin.INSTANCE.getString("EMSPastMedicalHistoryCode"),
             new Object [] { emsPastMedicalHistory }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPastMedicalHistoryCodeP(EMSPastMedicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPastMedicalHistoryCodeP(EMSPastMedicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PAST_MEDICAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPastMedicalHistoryCodeP(EMSPastMedicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPastMedicalHistoryCodeP(EMSPastMedicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PAST_MEDICAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param emsPastMedicalHistory The receiving '<em><b>EMS Past Medical History</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPastMedicalHistoryCodeP(EMSPastMedicalHistory emsPastMedicalHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PAST_MEDICAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PAST_MEDICAL_HISTORY);
      try
      {
        VALIDATE_EMS_PAST_MEDICAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PAST_MEDICAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PAST_MEDICAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPastMedicalHistory))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PAST_MEDICAL_HISTORY__EMS_PAST_MEDICAL_HISTORY_CODE_P,
             EmspcrPlugin.INSTANCE.getString("EMSPastMedicalHistoryCodeP"),
             new Object [] { emsPastMedicalHistory }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPastMedicalHistoryTitle(EMSPastMedicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Title</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPastMedicalHistoryTitle(EMSPastMedicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PAST_MEDICAL_HISTORY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'EMS Past Medical History')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPastMedicalHistoryTitle(EMSPastMedicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPastMedicalHistoryTitle(EMSPastMedicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PAST_MEDICAL_HISTORY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'EMS Past Medical History')
   * @param emsPastMedicalHistory The receiving '<em><b>EMS Past Medical History</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPastMedicalHistoryTitle(EMSPastMedicalHistory emsPastMedicalHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PAST_MEDICAL_HISTORY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PAST_MEDICAL_HISTORY);
      try
      {
        VALIDATE_EMS_PAST_MEDICAL_HISTORY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PAST_MEDICAL_HISTORY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PAST_MEDICAL_HISTORY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPastMedicalHistory))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PAST_MEDICAL_HISTORY__EMS_PAST_MEDICAL_HISTORY_TITLE,
             EmspcrPlugin.INSTANCE.getString("EMSPastMedicalHistoryTitle"),
             new Object [] { emsPastMedicalHistory }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPastMedicalHistoryEntry1(EMSPastMedicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Entry1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPastMedicalHistoryEntry1(EMSPastMedicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PAST_MEDICAL_HISTORY_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPastMedicalHistory::DerivedEntry))";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPastMedicalHistoryEntry1(EMSPastMedicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Entry1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPastMedicalHistoryEntry1(EMSPastMedicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PAST_MEDICAL_HISTORY_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPastMedicalHistory::DerivedEntry))
   * @param emsPastMedicalHistory The receiving '<em><b>EMS Past Medical History</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPastMedicalHistoryEntry1(EMSPastMedicalHistory emsPastMedicalHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PAST_MEDICAL_HISTORY_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PAST_MEDICAL_HISTORY);
      try
      {
        VALIDATE_EMS_PAST_MEDICAL_HISTORY_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PAST_MEDICAL_HISTORY_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PAST_MEDICAL_HISTORY_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPastMedicalHistory))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PAST_MEDICAL_HISTORY__EMS_PAST_MEDICAL_HISTORY_ENTRY1,
             EmspcrPlugin.INSTANCE.getString("EMSPastMedicalHistoryEntry1"),
             new Object [] { emsPastMedicalHistory }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSPastMedicalHistoryEntry2(EMSPastMedicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Entry2</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPastMedicalHistoryEntry2(EMSPastMedicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_PAST_MEDICAL_HISTORY_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPastMedicalHistory::DerivedEntry))";

  /**
   * The cached OCL invariant for the '{@link #validateEMSPastMedicalHistoryEntry2(EMSPastMedicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Entry2</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSPastMedicalHistoryEntry2(EMSPastMedicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_PAST_MEDICAL_HISTORY_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSPastMedicalHistory::DerivedEntry))
   * @param emsPastMedicalHistory The receiving '<em><b>EMS Past Medical History</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSPastMedicalHistoryEntry2(EMSPastMedicalHistory emsPastMedicalHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_EMS_PAST_MEDICAL_HISTORY_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_PAST_MEDICAL_HISTORY);
      try
      {
        VALIDATE_EMS_PAST_MEDICAL_HISTORY_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PAST_MEDICAL_HISTORY_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_PAST_MEDICAL_HISTORY_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsPastMedicalHistory))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_PAST_MEDICAL_HISTORY__EMS_PAST_MEDICAL_HISTORY_ENTRY2,
             EmspcrPlugin.INSTANCE.getString("EMSPastMedicalHistoryEntry2"),
             new Object [] { emsPastMedicalHistory }));
      }
       
      return false;
    }
    return true;
  }

} // EMSPastMedicalHistoryOperations