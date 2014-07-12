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

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.EventSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Macroscopic Finding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingMassIdentification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Mass Identification</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingBodySystemorOrganClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingEventSeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingDeathRelationshipAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Death Relationship Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#getBodySystemorOrganClass() <em>Get Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#getEventSeverity() <em>Get Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#getDataCollection() <em>Get Data Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MacroscopicFindingOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MacroscopicFindingOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateMacroscopicFindingTemplateId(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingTemplateId(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MACROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.48')";

  /**
   * The cached OCL invariant for the '{@link #validateMacroscopicFindingTemplateId(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingTemplateId(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MACROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param macroscopicFinding The receiving '<em><b>Macroscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMacroscopicFindingTemplateId(MacroscopicFinding macroscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MACROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MACROSCOPIC_FINDING);
      try
      {
        VALIDATE_MACROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MACROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MACROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(macroscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MACROSCOPIC_FINDING__MACROSCOPIC_FINDING_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MacroscopicFindingTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(macroscopicFinding, context) }),
             new Object [] { macroscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMacroscopicFindingClassCode(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingClassCode(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MACROSCOPIC_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateMacroscopicFindingClassCode(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingClassCode(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MACROSCOPIC_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param macroscopicFinding The receiving '<em><b>Macroscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMacroscopicFindingClassCode(MacroscopicFinding macroscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MACROSCOPIC_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MACROSCOPIC_FINDING);
      try
      {
        VALIDATE_MACROSCOPIC_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MACROSCOPIC_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MACROSCOPIC_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(macroscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MACROSCOPIC_FINDING__MACROSCOPIC_FINDING_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MacroscopicFindingClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(macroscopicFinding, context) }),
             new Object [] { macroscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMacroscopicFindingCode(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingCode(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MACROSCOPIC_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateMacroscopicFindingCode(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingCode(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MACROSCOPIC_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param macroscopicFinding The receiving '<em><b>Macroscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMacroscopicFindingCode(MacroscopicFinding macroscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MACROSCOPIC_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MACROSCOPIC_FINDING);
      try
      {
        VALIDATE_MACROSCOPIC_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MACROSCOPIC_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MACROSCOPIC_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(macroscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MACROSCOPIC_FINDING__MACROSCOPIC_FINDING_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MacroscopicFindingCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(macroscopicFinding, context) }),
             new Object [] { macroscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMacroscopicFindingId(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingId(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MACROSCOPIC_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

  /**
   * The cached OCL invariant for the '{@link #validateMacroscopicFindingId(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingId(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MACROSCOPIC_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param macroscopicFinding The receiving '<em><b>Macroscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMacroscopicFindingId(MacroscopicFinding macroscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MACROSCOPIC_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MACROSCOPIC_FINDING);
      try
      {
        VALIDATE_MACROSCOPIC_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MACROSCOPIC_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MACROSCOPIC_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(macroscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MACROSCOPIC_FINDING__MACROSCOPIC_FINDING_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MacroscopicFindingId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(macroscopicFinding, context) }),
             new Object [] { macroscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMacroscopicFindingMoodCode(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingMoodCode(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MACROSCOPIC_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateMacroscopicFindingMoodCode(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingMoodCode(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MACROSCOPIC_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param macroscopicFinding The receiving '<em><b>Macroscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMacroscopicFindingMoodCode(MacroscopicFinding macroscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MACROSCOPIC_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MACROSCOPIC_FINDING);
      try
      {
        VALIDATE_MACROSCOPIC_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MACROSCOPIC_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MACROSCOPIC_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(macroscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MACROSCOPIC_FINDING__MACROSCOPIC_FINDING_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MacroscopicFindingMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(macroscopicFinding, context) }),
             new Object [] { macroscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMacroscopicFindingValue(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingValue(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MACROSCOPIC_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

  /**
   * The cached OCL invariant for the '{@link #validateMacroscopicFindingValue(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingValue(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MACROSCOPIC_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param macroscopicFinding The receiving '<em><b>Macroscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMacroscopicFindingValue(MacroscopicFinding macroscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MACROSCOPIC_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MACROSCOPIC_FINDING);
      try
      {
        VALIDATE_MACROSCOPIC_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MACROSCOPIC_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MACROSCOPIC_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(macroscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MACROSCOPIC_FINDING__MACROSCOPIC_FINDING_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MacroscopicFindingValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(macroscopicFinding, context) }),
             new Object [] { macroscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMacroscopicFindingStatusCode(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingStatusCode(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MACROSCOPIC_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateMacroscopicFindingStatusCode(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingStatusCode(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MACROSCOPIC_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param macroscopicFinding The receiving '<em><b>Macroscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMacroscopicFindingStatusCode(MacroscopicFinding macroscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MACROSCOPIC_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MACROSCOPIC_FINDING);
      try
      {
        VALIDATE_MACROSCOPIC_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MACROSCOPIC_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MACROSCOPIC_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(macroscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MACROSCOPIC_FINDING__MACROSCOPIC_FINDING_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MacroscopicFindingStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(macroscopicFinding, context) }),
             new Object [] { macroscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMacroscopicFindingMassIdentification(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Mass Identification</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingMassIdentification(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MACROSCOPIC_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(sdtm::Mass Identification))";

  /**
   * The cached OCL invariant for the '{@link #validateMacroscopicFindingMassIdentification(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Mass Identification</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingMassIdentification(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MACROSCOPIC_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param macroscopicFinding The receiving '<em><b>Macroscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMacroscopicFindingMassIdentification(MacroscopicFinding macroscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MACROSCOPIC_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MACROSCOPIC_FINDING);
      try
      {
        VALIDATE_MACROSCOPIC_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MACROSCOPIC_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MACROSCOPIC_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(macroscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MACROSCOPIC_FINDING__MACROSCOPIC_FINDING_MASS_IDENTIFICATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MacroscopicFindingMassIdentification", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(macroscopicFinding, context) }),
             new Object [] { macroscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMacroscopicFindingGroupIdentifier(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingGroupIdentifier(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MACROSCOPIC_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMacroscopicFindingGroupIdentifier(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingGroupIdentifier(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MACROSCOPIC_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param macroscopicFinding The receiving '<em><b>Macroscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMacroscopicFindingGroupIdentifier(MacroscopicFinding macroscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MACROSCOPIC_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MACROSCOPIC_FINDING);
      try
      {
        VALIDATE_MACROSCOPIC_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MACROSCOPIC_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MACROSCOPIC_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(macroscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MACROSCOPIC_FINDING__MACROSCOPIC_FINDING_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MacroscopicFindingGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(macroscopicFinding, context) }),
             new Object [] { macroscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMacroscopicFindingSpecimenInformation(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Specimen Information</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingSpecimenInformation(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MACROSCOPIC_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(sdtm::Specimen Information) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMacroscopicFindingSpecimenInformation(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Specimen Information</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingSpecimenInformation(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MACROSCOPIC_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param macroscopicFinding The receiving '<em><b>Macroscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMacroscopicFindingSpecimenInformation(MacroscopicFinding macroscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MACROSCOPIC_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MACROSCOPIC_FINDING);
      try
      {
        VALIDATE_MACROSCOPIC_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MACROSCOPIC_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MACROSCOPIC_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(macroscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MACROSCOPIC_FINDING__MACROSCOPIC_FINDING_SPECIMEN_INFORMATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MacroscopicFindingSpecimenInformation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(macroscopicFinding, context) }),
             new Object [] { macroscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMacroscopicFindingBodySystemorOrganClass(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Body Systemor Organ Class</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingBodySystemorOrganClass(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MACROSCOPIC_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Body System or Organ Class))";

  /**
   * The cached OCL invariant for the '{@link #validateMacroscopicFindingBodySystemorOrganClass(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Body Systemor Organ Class</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingBodySystemorOrganClass(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MACROSCOPIC_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param macroscopicFinding The receiving '<em><b>Macroscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMacroscopicFindingBodySystemorOrganClass(MacroscopicFinding macroscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MACROSCOPIC_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MACROSCOPIC_FINDING);
      try
      {
        VALIDATE_MACROSCOPIC_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MACROSCOPIC_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MACROSCOPIC_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(macroscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MACROSCOPIC_FINDING__MACROSCOPIC_FINDING_BODY_SYSTEMOR_ORGAN_CLASS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MacroscopicFindingBodySystemorOrganClass", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(macroscopicFinding, context) }),
             new Object [] { macroscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMacroscopicFindingNonPerformanceReason(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingNonPerformanceReason(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MACROSCOPIC_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason))";

  /**
   * The cached OCL invariant for the '{@link #validateMacroscopicFindingNonPerformanceReason(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingNonPerformanceReason(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MACROSCOPIC_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param macroscopicFinding The receiving '<em><b>Macroscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMacroscopicFindingNonPerformanceReason(MacroscopicFinding macroscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MACROSCOPIC_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MACROSCOPIC_FINDING);
      try
      {
        VALIDATE_MACROSCOPIC_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MACROSCOPIC_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MACROSCOPIC_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(macroscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MACROSCOPIC_FINDING__MACROSCOPIC_FINDING_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MacroscopicFindingNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(macroscopicFinding, context) }),
             new Object [] { macroscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMacroscopicFindingEventSeverity(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Event Severity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingEventSeverity(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MACROSCOPIC_FINDING_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Event Severity))";

  /**
   * The cached OCL invariant for the '{@link #validateMacroscopicFindingEventSeverity(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Event Severity</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingEventSeverity(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MACROSCOPIC_FINDING_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param macroscopicFinding The receiving '<em><b>Macroscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMacroscopicFindingEventSeverity(MacroscopicFinding macroscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MACROSCOPIC_FINDING_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MACROSCOPIC_FINDING);
      try
      {
        VALIDATE_MACROSCOPIC_FINDING_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MACROSCOPIC_FINDING_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MACROSCOPIC_FINDING_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(macroscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MACROSCOPIC_FINDING__MACROSCOPIC_FINDING_EVENT_SEVERITY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MacroscopicFindingEventSeverity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(macroscopicFinding, context) }),
             new Object [] { macroscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMacroscopicFindingEntryRelationship(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Entry Relationship</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingEntryRelationship(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MACROSCOPIC_FINDING_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateMacroscopicFindingEntryRelationship(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Entry Relationship</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingEntryRelationship(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MACROSCOPIC_FINDING_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param macroscopicFinding The receiving '<em><b>Macroscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMacroscopicFindingEntryRelationship(MacroscopicFinding macroscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MACROSCOPIC_FINDING_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MACROSCOPIC_FINDING);
      try
      {
        VALIDATE_MACROSCOPIC_FINDING_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MACROSCOPIC_FINDING_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MACROSCOPIC_FINDING_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(macroscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MACROSCOPIC_FINDING__MACROSCOPIC_FINDING_ENTRY_RELATIONSHIP,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MacroscopicFindingEntryRelationship", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(macroscopicFinding, context) }),
             new Object [] { macroscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMacroscopicFindingDataCollection(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingDataCollection(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MACROSCOPIC_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Data Collection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMacroscopicFindingDataCollection(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Data Collection</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingDataCollection(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MACROSCOPIC_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param macroscopicFinding The receiving '<em><b>Macroscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMacroscopicFindingDataCollection(MacroscopicFinding macroscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MACROSCOPIC_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MACROSCOPIC_FINDING);
      try
      {
        VALIDATE_MACROSCOPIC_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MACROSCOPIC_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MACROSCOPIC_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(macroscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MACROSCOPIC_FINDING__MACROSCOPIC_FINDING_DATA_COLLECTION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MacroscopicFindingDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(macroscopicFinding, context) }),
             new Object [] { macroscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMacroscopicFindingDeathRelationshipAssociation(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Death Relationship Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingDeathRelationshipAssociation(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MACROSCOPIC_FINDING_DEATH_RELATIONSHIP_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateMacroscopicFindingDeathRelationshipAssociation(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Death Relationship Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMacroscopicFindingDeathRelationshipAssociation(MacroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MACROSCOPIC_FINDING_DEATH_RELATIONSHIP_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param macroscopicFinding The receiving '<em><b>Macroscopic Finding</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMacroscopicFindingDeathRelationshipAssociation(MacroscopicFinding macroscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MACROSCOPIC_FINDING_DEATH_RELATIONSHIP_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MACROSCOPIC_FINDING);
      try
      {
        VALIDATE_MACROSCOPIC_FINDING_DEATH_RELATIONSHIP_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MACROSCOPIC_FINDING_DEATH_RELATIONSHIP_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MACROSCOPIC_FINDING_DEATH_RELATIONSHIP_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(macroscopicFinding))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MACROSCOPIC_FINDING__MACROSCOPIC_FINDING_DEATH_RELATIONSHIP_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MacroscopicFindingDeathRelationshipAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(macroscopicFinding, context) }),
             new Object [] { macroscopicFinding }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(MacroscopicFinding) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(MacroscopicFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->any(true).oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(MacroscopicFinding) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(MacroscopicFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(MacroscopicFinding macroscopicFinding)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MACROSCOPIC_FINDING, SdtmPackage.Literals.MACROSCOPIC_FINDING.getEAllOperations().get(67));
      try
      {
        GET_GROUP_IDENTIFIER__EOCL_QRY = helper.createQuery(GET_GROUP_IDENTIFIER__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_GROUP_IDENTIFIER__EOCL_QRY);
    return (GroupIdentifier) query.evaluate(macroscopicFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getSpecimenInformation(MacroscopicFinding) <em>Get Specimen Information</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecimenInformation(MacroscopicFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_SPECIMEN_INFORMATION__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(sdtm::Specimen Information))->asSequence()->any(true).oclAsType(sdtm::Specimen Information)";

  /**
   * The cached OCL query for the '{@link #getSpecimenInformation(MacroscopicFinding) <em>Get Specimen Information</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecimenInformation(MacroscopicFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SPECIMEN_INFORMATION__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  SpecimenInformation getSpecimenInformation(MacroscopicFinding macroscopicFinding)
  {
    if (GET_SPECIMEN_INFORMATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MACROSCOPIC_FINDING, SdtmPackage.Literals.MACROSCOPIC_FINDING.getEAllOperations().get(68));
      try
      {
        GET_SPECIMEN_INFORMATION__EOCL_QRY = helper.createQuery(GET_SPECIMEN_INFORMATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SPECIMEN_INFORMATION__EOCL_QRY);
    return (SpecimenInformation) query.evaluate(macroscopicFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getBodySystemorOrganClass(MacroscopicFinding) <em>Get Body Systemor Organ Class</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodySystemorOrganClass(MacroscopicFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Body System or Organ Class))->asSequence()->any(true).oclAsType(sdtm::Body System or Organ Class)";

  /**
   * The cached OCL query for the '{@link #getBodySystemorOrganClass(MacroscopicFinding) <em>Get Body Systemor Organ Class</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodySystemorOrganClass(MacroscopicFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  BodySystemorOrganClass getBodySystemorOrganClass(MacroscopicFinding macroscopicFinding)
  {
    if (GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MACROSCOPIC_FINDING, SdtmPackage.Literals.MACROSCOPIC_FINDING.getEAllOperations().get(69));
      try
      {
        GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY = helper.createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY);
    return (BodySystemorOrganClass) query.evaluate(macroscopicFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(MacroscopicFinding) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(MacroscopicFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->any(true).oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(MacroscopicFinding) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(MacroscopicFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(MacroscopicFinding macroscopicFinding)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MACROSCOPIC_FINDING, SdtmPackage.Literals.MACROSCOPIC_FINDING.getEAllOperations().get(70));
      try
      {
        GET_NON_PERFORMANCE_REASON__EOCL_QRY = helper.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_QRY);
    return (NonPerformanceReason) query.evaluate(macroscopicFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getEventSeverity(MacroscopicFinding) <em>Get Event Severity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventSeverity(MacroscopicFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_EVENT_SEVERITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Event Severity))->asSequence()->any(true).oclAsType(sdtm::Event Severity)";

  /**
   * The cached OCL query for the '{@link #getEventSeverity(MacroscopicFinding) <em>Get Event Severity</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventSeverity(MacroscopicFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EVENT_SEVERITY__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EventSeverity getEventSeverity(MacroscopicFinding macroscopicFinding)
  {
    if (GET_EVENT_SEVERITY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MACROSCOPIC_FINDING, SdtmPackage.Literals.MACROSCOPIC_FINDING.getEAllOperations().get(71));
      try
      {
        GET_EVENT_SEVERITY__EOCL_QRY = helper.createQuery(GET_EVENT_SEVERITY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EVENT_SEVERITY__EOCL_QRY);
    return (EventSeverity) query.evaluate(macroscopicFinding);
  }

  /**
   * The cached OCL expression body for the '{@link #getDataCollection(MacroscopicFinding) <em>Get Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(MacroscopicFinding)
   * @generated
   * @ordered
   */
  protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->any(true).oclAsType(sdtm::Data Collection)";

  /**
   * The cached OCL query for the '{@link #getDataCollection(MacroscopicFinding) <em>Get Data Collection</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(MacroscopicFinding)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  DataCollection getDataCollection(MacroscopicFinding macroscopicFinding)
  {
    if (GET_DATA_COLLECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MACROSCOPIC_FINDING, SdtmPackage.Literals.MACROSCOPIC_FINDING.getEAllOperations().get(72));
      try
      {
        GET_DATA_COLLECTION__EOCL_QRY = helper.createQuery(GET_DATA_COLLECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_DATA_COLLECTION__EOCL_QRY);
    return (DataCollection) query.evaluate(macroscopicFinding);
  }

} // MacroscopicFindingOperations