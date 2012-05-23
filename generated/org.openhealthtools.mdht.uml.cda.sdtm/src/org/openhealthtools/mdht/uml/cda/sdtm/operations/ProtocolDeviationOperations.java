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

import org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Protocol Deviation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationProtocolDeviationCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Protocol Deviation Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationProtocolDeviationSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Protocol Deviation Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationStudyEpoch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Study Epoch</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationprotocolDeviationCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviationprotocol Deviation Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationprotocolDeviationSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviationprotocol Deviation Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#getStudyEpoch() <em>Get Study Epoch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolDeviationOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProtocolDeviationOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateProtocolDeviationTemplateId(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProtocolDeviationTemplateId(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROTOCOL_DEVIATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.27')";

  /**
   * The cached OCL invariant for the '{@link #validateProtocolDeviationTemplateId(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProtocolDeviationTemplateId(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROTOCOL_DEVIATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.27')
   * @param protocolDeviation The receiving '<em><b>Protocol Deviation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProtocolDeviationTemplateId(ProtocolDeviation protocolDeviation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PROTOCOL_DEVIATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PROTOCOL_DEVIATION);
      try
      {
        VALIDATE_PROTOCOL_DEVIATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROTOCOL_DEVIATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROTOCOL_DEVIATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(protocolDeviation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PROTOCOL_DEVIATION__PROTOCOL_DEVIATION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProtocolDeviationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(protocolDeviation, context) }),
             new Object [] { protocolDeviation }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateProtocolDeviationClassCode(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProtocolDeviationClassCode(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROTOCOL_DEVIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

  /**
   * The cached OCL invariant for the '{@link #validateProtocolDeviationClassCode(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProtocolDeviationClassCode(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROTOCOL_DEVIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * isDefined('classCode')
   * @param protocolDeviation The receiving '<em><b>Protocol Deviation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProtocolDeviationClassCode(ProtocolDeviation protocolDeviation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PROTOCOL_DEVIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PROTOCOL_DEVIATION);
      try
      {
        VALIDATE_PROTOCOL_DEVIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROTOCOL_DEVIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROTOCOL_DEVIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(protocolDeviation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PROTOCOL_DEVIATION__PROTOCOL_DEVIATION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProtocolDeviationClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(protocolDeviation, context) }),
             new Object [] { protocolDeviation }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateProtocolDeviationCode(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProtocolDeviationCode(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROTOCOL_DEVIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateProtocolDeviationCode(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProtocolDeviationCode(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROTOCOL_DEVIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param protocolDeviation The receiving '<em><b>Protocol Deviation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProtocolDeviationCode(ProtocolDeviation protocolDeviation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PROTOCOL_DEVIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PROTOCOL_DEVIATION);
      try
      {
        VALIDATE_PROTOCOL_DEVIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROTOCOL_DEVIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROTOCOL_DEVIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(protocolDeviation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PROTOCOL_DEVIATION__PROTOCOL_DEVIATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProtocolDeviationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(protocolDeviation, context) }),
             new Object [] { protocolDeviation }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateProtocolDeviationEffectiveTime(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProtocolDeviationEffectiveTime(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROTOCOL_DEVIATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateProtocolDeviationEffectiveTime(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProtocolDeviationEffectiveTime(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROTOCOL_DEVIATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
   * @param protocolDeviation The receiving '<em><b>Protocol Deviation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProtocolDeviationEffectiveTime(ProtocolDeviation protocolDeviation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PROTOCOL_DEVIATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PROTOCOL_DEVIATION);
      try
      {
        VALIDATE_PROTOCOL_DEVIATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROTOCOL_DEVIATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROTOCOL_DEVIATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(protocolDeviation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PROTOCOL_DEVIATION__PROTOCOL_DEVIATION_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProtocolDeviationEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(protocolDeviation, context) }),
             new Object [] { protocolDeviation }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateProtocolDeviationId(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProtocolDeviationId(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROTOCOL_DEVIATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateProtocolDeviationId(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProtocolDeviationId(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROTOCOL_DEVIATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
   * @param protocolDeviation The receiving '<em><b>Protocol Deviation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProtocolDeviationId(ProtocolDeviation protocolDeviation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PROTOCOL_DEVIATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PROTOCOL_DEVIATION);
      try
      {
        VALIDATE_PROTOCOL_DEVIATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROTOCOL_DEVIATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROTOCOL_DEVIATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(protocolDeviation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PROTOCOL_DEVIATION__PROTOCOL_DEVIATION_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProtocolDeviationId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(protocolDeviation, context) }),
             new Object [] { protocolDeviation }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateProtocolDeviationMoodCode(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProtocolDeviationMoodCode(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROTOCOL_DEVIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

  /**
   * The cached OCL invariant for the '{@link #validateProtocolDeviationMoodCode(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProtocolDeviationMoodCode(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROTOCOL_DEVIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * isDefined('moodCode')
   * @param protocolDeviation The receiving '<em><b>Protocol Deviation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProtocolDeviationMoodCode(ProtocolDeviation protocolDeviation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PROTOCOL_DEVIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PROTOCOL_DEVIATION);
      try
      {
        VALIDATE_PROTOCOL_DEVIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROTOCOL_DEVIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROTOCOL_DEVIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(protocolDeviation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PROTOCOL_DEVIATION__PROTOCOL_DEVIATION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProtocolDeviationMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(protocolDeviation, context) }),
             new Object [] { protocolDeviation }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateProtocolDeviationValue(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProtocolDeviationValue(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROTOCOL_DEVIATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CE)))";

  /**
   * The cached OCL invariant for the '{@link #validateProtocolDeviationValue(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProtocolDeviationValue(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROTOCOL_DEVIATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CE)))
   * @param protocolDeviation The receiving '<em><b>Protocol Deviation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProtocolDeviationValue(ProtocolDeviation protocolDeviation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PROTOCOL_DEVIATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PROTOCOL_DEVIATION);
      try
      {
        VALIDATE_PROTOCOL_DEVIATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROTOCOL_DEVIATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROTOCOL_DEVIATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(protocolDeviation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PROTOCOL_DEVIATION__PROTOCOL_DEVIATION_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProtocolDeviationValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(protocolDeviation, context) }),
             new Object [] { protocolDeviation }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateProtocolDeviationProtocolDeviationCategoryAssociation(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Protocol Deviation Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProtocolDeviationProtocolDeviationCategoryAssociation(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROTOCOL_DEVIATION_PROTOCOL_DEVIATION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateProtocolDeviationProtocolDeviationCategoryAssociation(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Protocol Deviation Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProtocolDeviationProtocolDeviationCategoryAssociation(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROTOCOL_DEVIATION_PROTOCOL_DEVIATION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param protocolDeviation The receiving '<em><b>Protocol Deviation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProtocolDeviationProtocolDeviationCategoryAssociation(ProtocolDeviation protocolDeviation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PROTOCOL_DEVIATION_PROTOCOL_DEVIATION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PROTOCOL_DEVIATION);
      try
      {
        VALIDATE_PROTOCOL_DEVIATION_PROTOCOL_DEVIATION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROTOCOL_DEVIATION_PROTOCOL_DEVIATION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROTOCOL_DEVIATION_PROTOCOL_DEVIATION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(protocolDeviation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PROTOCOL_DEVIATION__PROTOCOL_DEVIATION_PROTOCOL_DEVIATION_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProtocolDeviationProtocolDeviationCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(protocolDeviation, context) }),
             new Object [] { protocolDeviation }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateProtocolDeviationProtocolDeviationSubCategoryAssociation(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Protocol Deviation Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProtocolDeviationProtocolDeviationSubCategoryAssociation(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROTOCOL_DEVIATION_PROTOCOL_DEVIATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateProtocolDeviationProtocolDeviationSubCategoryAssociation(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Protocol Deviation Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProtocolDeviationProtocolDeviationSubCategoryAssociation(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROTOCOL_DEVIATION_PROTOCOL_DEVIATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param protocolDeviation The receiving '<em><b>Protocol Deviation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProtocolDeviationProtocolDeviationSubCategoryAssociation(ProtocolDeviation protocolDeviation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PROTOCOL_DEVIATION_PROTOCOL_DEVIATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PROTOCOL_DEVIATION);
      try
      {
        VALIDATE_PROTOCOL_DEVIATION_PROTOCOL_DEVIATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROTOCOL_DEVIATION_PROTOCOL_DEVIATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROTOCOL_DEVIATION_PROTOCOL_DEVIATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(protocolDeviation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PROTOCOL_DEVIATION__PROTOCOL_DEVIATION_PROTOCOL_DEVIATION_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProtocolDeviationProtocolDeviationSubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(protocolDeviation, context) }),
             new Object [] { protocolDeviation }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateProtocolDeviationStudyEpoch(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Study Epoch</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProtocolDeviationStudyEpoch(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROTOCOL_DEVIATION_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Study Epoch))";

  /**
   * The cached OCL invariant for the '{@link #validateProtocolDeviationStudyEpoch(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Study Epoch</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProtocolDeviationStudyEpoch(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROTOCOL_DEVIATION_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Study Epoch))
   * @param protocolDeviation The receiving '<em><b>Protocol Deviation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProtocolDeviationStudyEpoch(ProtocolDeviation protocolDeviation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PROTOCOL_DEVIATION_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PROTOCOL_DEVIATION);
      try
      {
        VALIDATE_PROTOCOL_DEVIATION_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROTOCOL_DEVIATION_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROTOCOL_DEVIATION_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(protocolDeviation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PROTOCOL_DEVIATION__PROTOCOL_DEVIATION_STUDY_EPOCH,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProtocolDeviationStudyEpoch", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(protocolDeviation, context) }),
             new Object [] { protocolDeviation }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateProtocolDeviationprotocolDeviationCategoryAssociationTypeCode(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviationprotocol Deviation Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProtocolDeviationprotocolDeviationCategoryAssociationTypeCode(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateProtocolDeviationprotocolDeviationCategoryAssociationTypeCode(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviationprotocol Deviation Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProtocolDeviationprotocolDeviationCategoryAssociationTypeCode(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param protocolDeviation The receiving '<em><b>Protocol Deviation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProtocolDeviationprotocolDeviationCategoryAssociationTypeCode(ProtocolDeviation protocolDeviation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PROTOCOL_DEVIATION);
      try
      {
        VALIDATE_PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(protocolDeviation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PROTOCOL_DEVIATION__PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProtocolDeviationprotocolDeviationCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(protocolDeviation, context) }),
             new Object [] { protocolDeviation }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateProtocolDeviationprotocolDeviationSubCategoryAssociationTypeCode(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviationprotocol Deviation Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProtocolDeviationprotocolDeviationSubCategoryAssociationTypeCode(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateProtocolDeviationprotocolDeviationSubCategoryAssociationTypeCode(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviationprotocol Deviation Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProtocolDeviationprotocolDeviationSubCategoryAssociationTypeCode(ProtocolDeviation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param protocolDeviation The receiving '<em><b>Protocol Deviation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProtocolDeviationprotocolDeviationSubCategoryAssociationTypeCode(ProtocolDeviation protocolDeviation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PROTOCOL_DEVIATION);
      try
      {
        VALIDATE_PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(protocolDeviation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PROTOCOL_DEVIATION__PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProtocolDeviationprotocolDeviationSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(protocolDeviation, context) }),
             new Object [] { protocolDeviation }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getStudyEpoch(ProtocolDeviation) <em>Get Study Epoch</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyEpoch(ProtocolDeviation)
   * @generated
   * @ordered
   */
  protected static final String GET_STUDY_EPOCH__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Study Epoch))->asSequence()->first().oclAsType(sdtm::Study Epoch)";

  /**
   * The cached OCL query for the '{@link #getStudyEpoch(ProtocolDeviation) <em>Get Study Epoch</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyEpoch(ProtocolDeviation)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_STUDY_EPOCH__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Study Epoch))->asSequence()->first().oclAsType(sdtm::Study Epoch)
   * @param protocolDeviation The receiving '<em><b>Protocol Deviation</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  StudyEpoch getStudyEpoch(ProtocolDeviation protocolDeviation)
  {
    if (GET_STUDY_EPOCH__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.PROTOCOL_DEVIATION, SdtmPackage.Literals.PROTOCOL_DEVIATION.getEAllOperations().get(61));
      try
      {
        GET_STUDY_EPOCH__EOCL_QRY = helper.createQuery(GET_STUDY_EPOCH__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_EPOCH__EOCL_QRY);
    return (StudyEpoch) query.evaluate(protocolDeviation);
  }

} // ProtocolDeviationOperations