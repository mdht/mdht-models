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

import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Subject Characteristic</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicSubjectCharateristicCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Subject Charateristic Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristicsubject Charateristic Category Association Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristicsubject Charateristic Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristicsubject Charateristic Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubjectCharacteristicOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubjectCharacteristicOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectCharacteristicTemplateId(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicTemplateId(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_CHARACTERISTIC_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.35')";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectCharacteristicTemplateId(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicTemplateId(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_CHARACTERISTIC_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.35')
   * @param subjectCharacteristic The receiving '<em><b>Subject Characteristic</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectCharacteristicTemplateId(SubjectCharacteristic subjectCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SUBJECT_CHARACTERISTIC_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_CHARACTERISTIC);
      try
      {
        VALIDATE_SUBJECT_CHARACTERISTIC_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_CHARACTERISTIC_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_CHARACTERISTIC_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectCharacteristic))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_CHARACTERISTIC__SUBJECT_CHARACTERISTIC_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectCharacteristicTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectCharacteristic, context) }),
             new Object [] { subjectCharacteristic }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectCharacteristicClassCode(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicClassCode(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_CHARACTERISTIC_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectCharacteristicClassCode(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicClassCode(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_CHARACTERISTIC_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param subjectCharacteristic The receiving '<em><b>Subject Characteristic</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectCharacteristicClassCode(SubjectCharacteristic subjectCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SUBJECT_CHARACTERISTIC_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_CHARACTERISTIC);
      try
      {
        VALIDATE_SUBJECT_CHARACTERISTIC_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_CHARACTERISTIC_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_CHARACTERISTIC_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectCharacteristic))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_CHARACTERISTIC__SUBJECT_CHARACTERISTIC_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectCharacteristicClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectCharacteristic, context) }),
             new Object [] { subjectCharacteristic }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectCharacteristicCode(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicCode(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_CHARACTERISTIC_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectCharacteristicCode(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicCode(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_CHARACTERISTIC_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param subjectCharacteristic The receiving '<em><b>Subject Characteristic</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectCharacteristicCode(SubjectCharacteristic subjectCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SUBJECT_CHARACTERISTIC_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_CHARACTERISTIC);
      try
      {
        VALIDATE_SUBJECT_CHARACTERISTIC_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_CHARACTERISTIC_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_CHARACTERISTIC_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectCharacteristic))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_CHARACTERISTIC__SUBJECT_CHARACTERISTIC_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectCharacteristicCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectCharacteristic, context) }),
             new Object [] { subjectCharacteristic }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectCharacteristicId(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicId(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_CHARACTERISTIC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectCharacteristicId(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicId(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_CHARACTERISTIC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
   * @param subjectCharacteristic The receiving '<em><b>Subject Characteristic</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectCharacteristicId(SubjectCharacteristic subjectCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SUBJECT_CHARACTERISTIC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_CHARACTERISTIC);
      try
      {
        VALIDATE_SUBJECT_CHARACTERISTIC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_CHARACTERISTIC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_CHARACTERISTIC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectCharacteristic))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_CHARACTERISTIC__SUBJECT_CHARACTERISTIC_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectCharacteristicId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectCharacteristic, context) }),
             new Object [] { subjectCharacteristic }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectCharacteristicMoodCode(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicMoodCode(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_CHARACTERISTIC_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectCharacteristicMoodCode(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicMoodCode(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_CHARACTERISTIC_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param subjectCharacteristic The receiving '<em><b>Subject Characteristic</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectCharacteristicMoodCode(SubjectCharacteristic subjectCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SUBJECT_CHARACTERISTIC_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_CHARACTERISTIC);
      try
      {
        VALIDATE_SUBJECT_CHARACTERISTIC_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_CHARACTERISTIC_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_CHARACTERISTIC_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectCharacteristic))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_CHARACTERISTIC__SUBJECT_CHARACTERISTIC_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectCharacteristicMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectCharacteristic, context) }),
             new Object [] { subjectCharacteristic }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectCharacteristicValue(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicValue(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_CHARACTERISTIC_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectCharacteristicValue(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicValue(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_CHARACTERISTIC_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())
   * @param subjectCharacteristic The receiving '<em><b>Subject Characteristic</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectCharacteristicValue(SubjectCharacteristic subjectCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SUBJECT_CHARACTERISTIC_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_CHARACTERISTIC);
      try
      {
        VALIDATE_SUBJECT_CHARACTERISTIC_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_CHARACTERISTIC_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_CHARACTERISTIC_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectCharacteristic))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_CHARACTERISTIC__SUBJECT_CHARACTERISTIC_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectCharacteristicValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectCharacteristic, context) }),
             new Object [] { subjectCharacteristic }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectCharacteristicStatusCode(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicStatusCode(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_CHARACTERISTIC_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectCharacteristicStatusCode(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicStatusCode(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_CHARACTERISTIC_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
   * @param subjectCharacteristic The receiving '<em><b>Subject Characteristic</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectCharacteristicStatusCode(SubjectCharacteristic subjectCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SUBJECT_CHARACTERISTIC_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_CHARACTERISTIC);
      try
      {
        VALIDATE_SUBJECT_CHARACTERISTIC_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_CHARACTERISTIC_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_CHARACTERISTIC_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectCharacteristic))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_CHARACTERISTIC__SUBJECT_CHARACTERISTIC_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectCharacteristicStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectCharacteristic, context) }),
             new Object [] { subjectCharacteristic }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectCharacteristicDataCollection(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicDataCollection(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_CHARACTERISTIC_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Data Collection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectCharacteristicDataCollection(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Data Collection</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicDataCollection(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_CHARACTERISTIC_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Data Collection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
   * @param subjectCharacteristic The receiving '<em><b>Subject Characteristic</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectCharacteristicDataCollection(SubjectCharacteristic subjectCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SUBJECT_CHARACTERISTIC_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_CHARACTERISTIC);
      try
      {
        VALIDATE_SUBJECT_CHARACTERISTIC_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_CHARACTERISTIC_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_CHARACTERISTIC_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectCharacteristic))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_CHARACTERISTIC__SUBJECT_CHARACTERISTIC_DATA_COLLECTION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectCharacteristicDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectCharacteristic, context) }),
             new Object [] { subjectCharacteristic }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectCharacteristicNonPerformanceReason(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicNonPerformanceReason(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_CHARACTERISTIC_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectCharacteristicNonPerformanceReason(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicNonPerformanceReason(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_CHARACTERISTIC_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param subjectCharacteristic The receiving '<em><b>Subject Characteristic</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectCharacteristicNonPerformanceReason(SubjectCharacteristic subjectCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SUBJECT_CHARACTERISTIC_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_CHARACTERISTIC);
      try
      {
        VALIDATE_SUBJECT_CHARACTERISTIC_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_CHARACTERISTIC_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_CHARACTERISTIC_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectCharacteristic))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_CHARACTERISTIC__SUBJECT_CHARACTERISTIC_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectCharacteristicNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectCharacteristic, context) }),
             new Object [] { subjectCharacteristic }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectCharacteristicGroupIdentifier(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicGroupIdentifier(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_CHARACTERISTIC_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectCharacteristicGroupIdentifier(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicGroupIdentifier(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_CHARACTERISTIC_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param subjectCharacteristic The receiving '<em><b>Subject Characteristic</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectCharacteristicGroupIdentifier(SubjectCharacteristic subjectCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SUBJECT_CHARACTERISTIC_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_CHARACTERISTIC);
      try
      {
        VALIDATE_SUBJECT_CHARACTERISTIC_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_CHARACTERISTIC_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_CHARACTERISTIC_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectCharacteristic))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_CHARACTERISTIC__SUBJECT_CHARACTERISTIC_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectCharacteristicGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectCharacteristic, context) }),
             new Object [] { subjectCharacteristic }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectCharacteristicSubjectCharateristicCategoryAssociation(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Subject Charateristic Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicSubjectCharateristicCategoryAssociation(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_CHARACTERISTIC_SUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectCharacteristicSubjectCharateristicCategoryAssociation(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Subject Charateristic Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicSubjectCharateristicCategoryAssociation(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_CHARACTERISTIC_SUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param subjectCharacteristic The receiving '<em><b>Subject Characteristic</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectCharacteristicSubjectCharateristicCategoryAssociation(SubjectCharacteristic subjectCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SUBJECT_CHARACTERISTIC_SUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_CHARACTERISTIC);
      try
      {
        VALIDATE_SUBJECT_CHARACTERISTIC_SUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_CHARACTERISTIC_SUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_CHARACTERISTIC_SUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectCharacteristic))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_CHARACTERISTIC__SUBJECT_CHARACTERISTIC_SUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectCharacteristicSubjectCharateristicCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectCharacteristic, context) }),
             new Object [] { subjectCharacteristic }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTemplateId(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristicsubject Charateristic Category Association Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTemplateId(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(templateId->exists(id : datatypes::II | id.root = 'null'))";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTemplateId(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristicsubject Charateristic Category Association Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTemplateId(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(templateId->exists(id : datatypes::II | id.root = 'null'))
   * @param subjectCharacteristic The receiving '<em><b>Subject Characteristic</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTemplateId(SubjectCharacteristic subjectCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_CHARACTERISTIC);
      try
      {
        VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectCharacteristic))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_CHARACTERISTIC__SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectCharacteristicsubjectCharateristicCategoryAssociationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectCharacteristic, context) }),
             new Object [] { subjectCharacteristic }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTypeCode(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristicsubject Charateristic Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTypeCode(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTypeCode(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristicsubject Charateristic Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTypeCode(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param subjectCharacteristic The receiving '<em><b>Subject Characteristic</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTypeCode(SubjectCharacteristic subjectCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_CHARACTERISTIC);
      try
      {
        VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectCharacteristic))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_CHARACTERISTIC__SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectCharacteristicsubjectCharateristicCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectCharacteristic, context) }),
             new Object [] { subjectCharacteristic }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationTypeCode(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristicsubject Charateristic Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationTypeCode(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationTypeCode(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristicsubject Charateristic Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationTypeCode(SubjectCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param subjectCharacteristic The receiving '<em><b>Subject Characteristic</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationTypeCode(SubjectCharacteristic subjectCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_CHARACTERISTIC);
      try
      {
        VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectCharacteristic))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_CHARACTERISTIC__SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectCharacteristicsubjectCharateristicSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectCharacteristic, context) }),
             new Object [] { subjectCharacteristic }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getDataCollection(SubjectCharacteristic) <em>Get Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(SubjectCharacteristic)
   * @generated
   * @ordered
   */
  protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->first().oclAsType(sdtm::Data Collection)";

  /**
   * The cached OCL query for the '{@link #getDataCollection(SubjectCharacteristic) <em>Get Data Collection</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(SubjectCharacteristic)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->first().oclAsType(sdtm::Data Collection)
   * @param subjectCharacteristic The receiving '<em><b>Subject Characteristic</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  DataCollection getDataCollection(SubjectCharacteristic subjectCharacteristic)
  {
    if (GET_DATA_COLLECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.SUBJECT_CHARACTERISTIC, SdtmPackage.Literals.SUBJECT_CHARACTERISTIC.getEAllOperations().get(63));
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
    return (DataCollection) query.evaluate(subjectCharacteristic);
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(SubjectCharacteristic) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(SubjectCharacteristic)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->first().oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(SubjectCharacteristic) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(SubjectCharacteristic)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->first().oclAsType(sdtm::Non Performance Reason)
   * @param subjectCharacteristic The receiving '<em><b>Subject Characteristic</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(SubjectCharacteristic subjectCharacteristic)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.SUBJECT_CHARACTERISTIC, SdtmPackage.Literals.SUBJECT_CHARACTERISTIC.getEAllOperations().get(64));
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
    return (NonPerformanceReason) query.evaluate(subjectCharacteristic);
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(SubjectCharacteristic) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(SubjectCharacteristic)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->first().oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(SubjectCharacteristic) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(SubjectCharacteristic)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->first().oclAsType(sdtm::Group Identifier)
   * @param subjectCharacteristic The receiving '<em><b>Subject Characteristic</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(SubjectCharacteristic subjectCharacteristic)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.SUBJECT_CHARACTERISTIC, SdtmPackage.Literals.SUBJECT_CHARACTERISTIC.getEAllOperations().get(65));
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
    return (GroupIdentifier) query.evaluate(subjectCharacteristic);
  }

} // SubjectCharacteristicOperations