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

import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Subject Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementStudyEpoch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Study Epoch</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementElementOrderAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Element Order Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementelementOrderAssociationelementOrderClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementelementOrderAssociationelementOrderCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementelementOrderAssociationelementOrderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementelementOrderAssociationelementOrderMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementelementOrderAssociationelementOrderValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementelementOrderAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementelementOrderAssociationElementOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Association Element Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementelementOrderAssociationelementOrderClassCodeSubjectElementelementOrderAssociationelementOrderClassCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Class Code Subject Elementelement Order Associationelement Order Class Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementelementOrderAssociationelementOrderCodePSubjectElementelementOrderAssociationelementOrderCodeP1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Code PSubject Elementelement Order Associationelement Order Code P1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementelementOrderAssociationelementOrderCodeSubjectElementelementOrderAssociationelementOrderCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Code Subject Elementelement Order Associationelement Order Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementelementOrderAssociationelementOrderMoodCodeSubjectElementelementOrderAssociationelementOrderMoodCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Mood Code Subject Elementelement Order Associationelement Order Mood Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementelementOrderAssociationelementOrderValueSubjectElementelementOrderAssociationelementOrderValue1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Value Subject Elementelement Order Associationelement Order Value1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#getStudyEpoch() <em>Get Study Epoch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubjectElementOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubjectElementOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectElementTemplateId(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementTemplateId(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_ELEMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.17')";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectElementTemplateId(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementTemplateId(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_ELEMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectElementTemplateId(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_ELEMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
      try
      {
        VALIDATE_SUBJECT_ELEMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_ELEMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectElement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
             new Object [] { subjectElement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectElementClassCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementClassCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_ELEMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectElementClassCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementClassCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_ELEMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectElementClassCode(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_ELEMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
      try
      {
        VALIDATE_SUBJECT_ELEMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_ELEMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectElement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
             new Object [] { subjectElement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectElementCodeP(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementCodeP(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_ELEMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectElementCodeP(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementCodeP(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_ELEMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectElementCodeP(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_ELEMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
      try
      {
        VALIDATE_SUBJECT_ELEMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_ELEMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectElement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
             new Object [] { subjectElement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectElementCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_ELEMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectElementCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_ELEMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectElementCode(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_ELEMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
      try
      {
        VALIDATE_SUBJECT_ELEMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_ELEMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectElement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
             new Object [] { subjectElement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectElementEffectiveTime(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementEffectiveTime(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_ELEMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectElementEffectiveTime(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementEffectiveTime(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_ELEMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectElementEffectiveTime(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_ELEMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
      try
      {
        VALIDATE_SUBJECT_ELEMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_ELEMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectElement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
             new Object [] { subjectElement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectElementId(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementId(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_ELEMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectElementId(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementId(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_ELEMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectElementId(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_ELEMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
      try
      {
        VALIDATE_SUBJECT_ELEMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_ELEMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectElement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
             new Object [] { subjectElement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectElementMoodCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementMoodCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_ELEMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectElementMoodCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementMoodCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_ELEMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectElementMoodCode(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_ELEMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
      try
      {
        VALIDATE_SUBJECT_ELEMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_ELEMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectElement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
             new Object [] { subjectElement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectElementStudyEpoch(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Study Epoch</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementStudyEpoch(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_ELEMENT_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Study Epoch) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectElementStudyEpoch(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Study Epoch</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementStudyEpoch(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_ELEMENT_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectElementStudyEpoch(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_ELEMENT_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
      try
      {
        VALIDATE_SUBJECT_ELEMENT_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_ELEMENT_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectElement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_STUDY_EPOCH,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementStudyEpoch", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
             new Object [] { subjectElement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectElementElementOrderAssociation(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Element Order Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementElementOrderAssociation(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_ELEMENT_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectElementElementOrderAssociation(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Element Order Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementElementOrderAssociation(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_ELEMENT_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectElementElementOrderAssociation(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_ELEMENT_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
      try
      {
        VALIDATE_SUBJECT_ELEMENT_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_ELEMENT_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_ELEMENT_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectElement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENT_ELEMENT_ORDER_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementElementOrderAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
             new Object [] { subjectElement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectElementelementOrderAssociationelementOrderClassCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementelementOrderAssociationelementOrderClassCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectElementelementOrderAssociationelementOrderClassCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementelementOrderAssociationelementOrderClassCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectElementelementOrderAssociationelementOrderClassCode(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
      try
      {
        VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectElement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementelementOrderAssociationelementOrderClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
             new Object [] { subjectElement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectElementelementOrderAssociationelementOrderCodeP(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementelementOrderAssociationelementOrderCodeP(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectElementelementOrderAssociationelementOrderCodeP(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementelementOrderAssociationelementOrderCodeP(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectElementelementOrderAssociationelementOrderCodeP(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
      try
      {
        VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectElement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementelementOrderAssociationelementOrderCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
             new Object [] { subjectElement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectElementelementOrderAssociationelementOrderCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementelementOrderAssociationelementOrderCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectElementelementOrderAssociationelementOrderCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementelementOrderAssociationelementOrderCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectElementelementOrderAssociationelementOrderCode(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
      try
      {
        VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectElement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementelementOrderAssociationelementOrderCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
             new Object [] { subjectElement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectElementelementOrderAssociationelementOrderMoodCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementelementOrderAssociationelementOrderMoodCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectElementelementOrderAssociationelementOrderMoodCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementelementOrderAssociationelementOrderMoodCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectElementelementOrderAssociationelementOrderMoodCode(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
      try
      {
        VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectElement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementelementOrderAssociationelementOrderMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
             new Object [] { subjectElement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectElementelementOrderAssociationelementOrderValue(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementelementOrderAssociationelementOrderValue(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | element.oclIsTypeOf(datatypes::INT))))";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectElementelementOrderAssociationelementOrderValue(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementelementOrderAssociationelementOrderValue(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectElementelementOrderAssociationelementOrderValue(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
      try
      {
        VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectElement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementelementOrderAssociationelementOrderValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
             new Object [] { subjectElement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectElementelementOrderAssociationTypeCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementelementOrderAssociationTypeCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectElementelementOrderAssociationTypeCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementelementOrderAssociationTypeCode(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectElementelementOrderAssociationTypeCode(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
      try
      {
        VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectElement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementelementOrderAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
             new Object [] { subjectElement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectElementelementOrderAssociationElementOrder(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Association Element Order</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementelementOrderAssociationElementOrder(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectElementelementOrderAssociationElementOrder(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Association Element Order</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementelementOrderAssociationElementOrder(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectElementelementOrderAssociationElementOrder(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
      try
      {
        VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectElement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementelementOrderAssociationElementOrder", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
             new Object [] { subjectElement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectElementelementOrderAssociationelementOrderClassCodeSubjectElementelementOrderAssociationelementOrderClassCode1(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Class Code Subject Elementelement Order Associationelement Order Class Code1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementelementOrderAssociationelementOrderClassCodeSubjectElementelementOrderAssociationelementOrderClassCode1(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(isDefined('classCode')))";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectElementelementOrderAssociationelementOrderClassCodeSubjectElementelementOrderAssociationelementOrderClassCode1(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Class Code Subject Elementelement Order Associationelement Order Class Code1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementelementOrderAssociationelementOrderClassCodeSubjectElementelementOrderAssociationelementOrderClassCode1(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectElementelementOrderAssociationelementOrderClassCodeSubjectElementelementOrderAssociationelementOrderClassCode1(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
      try
      {
        VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectElement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementelementOrderAssociationelementOrderClassCodeSubjectElementelementOrderAssociationelementOrderClassCode1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
             new Object [] { subjectElement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectElementelementOrderAssociationelementOrderCodePSubjectElementelementOrderAssociationelementOrderCodeP1(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Code PSubject Elementelement Order Associationelement Order Code P1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementelementOrderAssociationelementOrderCodePSubjectElementelementOrderAssociationelementOrderCodeP1(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_PSUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined())))";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectElementelementOrderAssociationelementOrderCodePSubjectElementelementOrderAssociationelementOrderCodeP1(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Code PSubject Elementelement Order Associationelement Order Code P1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementelementOrderAssociationelementOrderCodePSubjectElementelementOrderAssociationelementOrderCodeP1(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_PSUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectElementelementOrderAssociationelementOrderCodePSubjectElementelementOrderAssociationelementOrderCodeP1(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_PSUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
      try
      {
        VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_PSUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_PSUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_PSUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectElement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_PSUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementelementOrderAssociationelementOrderCodePSubjectElementelementOrderAssociationelementOrderCodeP1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
             new Object [] { subjectElement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectElementelementOrderAssociationelementOrderCodeSubjectElementelementOrderAssociationelementOrderCode1(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Code Subject Elementelement Order Associationelement Order Code1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementelementOrderAssociationelementOrderCodeSubjectElementelementOrderAssociationelementOrderCode1(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1')))";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectElementelementOrderAssociationelementOrderCodeSubjectElementelementOrderAssociationelementOrderCode1(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Code Subject Elementelement Order Associationelement Order Code1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementelementOrderAssociationelementOrderCodeSubjectElementelementOrderAssociationelementOrderCode1(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectElementelementOrderAssociationelementOrderCodeSubjectElementelementOrderAssociationelementOrderCode1(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
      try
      {
        VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectElement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementelementOrderAssociationelementOrderCodeSubjectElementelementOrderAssociationelementOrderCode1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
             new Object [] { subjectElement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectElementelementOrderAssociationelementOrderMoodCodeSubjectElementelementOrderAssociationelementOrderMoodCode1(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Mood Code Subject Elementelement Order Associationelement Order Mood Code1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementelementOrderAssociationelementOrderMoodCodeSubjectElementelementOrderAssociationelementOrderMoodCode1(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN))";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectElementelementOrderAssociationelementOrderMoodCodeSubjectElementelementOrderAssociationelementOrderMoodCode1(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Mood Code Subject Elementelement Order Associationelement Order Mood Code1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementelementOrderAssociationelementOrderMoodCodeSubjectElementelementOrderAssociationelementOrderMoodCode1(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectElementelementOrderAssociationelementOrderMoodCodeSubjectElementelementOrderAssociationelementOrderMoodCode1(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
      try
      {
        VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectElement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementelementOrderAssociationelementOrderMoodCodeSubjectElementelementOrderAssociationelementOrderMoodCode1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
             new Object [] { subjectElement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubjectElementelementOrderAssociationelementOrderValueSubjectElementelementOrderAssociationelementOrderValue1(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Value Subject Elementelement Order Associationelement Order Value1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementelementOrderAssociationelementOrderValueSubjectElementelementOrderAssociationelementOrderValue1(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | element.oclIsTypeOf(datatypes::INT)))))";

  /**
   * The cached OCL invariant for the '{@link #validateSubjectElementelementOrderAssociationelementOrderValueSubjectElementelementOrderAssociationelementOrderValue1(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Value Subject Elementelement Order Associationelement Order Value1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubjectElementelementOrderAssociationelementOrderValueSubjectElementelementOrderAssociationelementOrderValue1(SubjectElement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param subjectElement The receiving '<em><b>Subject Element</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubjectElementelementOrderAssociationelementOrderValueSubjectElementelementOrderAssociationelementOrderValue1(SubjectElement subjectElement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBJECT_ELEMENT);
      try
      {
        VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(subjectElement))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBJECT_ELEMENT__SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubjectElementelementOrderAssociationelementOrderValueSubjectElementelementOrderAssociationelementOrderValue1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(subjectElement, context) }),
             new Object [] { subjectElement }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getStudyEpoch(SubjectElement) <em>Get Study Epoch</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyEpoch(SubjectElement)
   * @generated
   * @ordered
   */
  protected static final String GET_STUDY_EPOCH__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Study Epoch))->asSequence()->any(true).oclAsType(sdtm::Study Epoch)";

  /**
   * The cached OCL query for the '{@link #getStudyEpoch(SubjectElement) <em>Get Study Epoch</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyEpoch(SubjectElement)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_STUDY_EPOCH__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  StudyEpoch getStudyEpoch(SubjectElement subjectElement)
  {
    if (GET_STUDY_EPOCH__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.SUBJECT_ELEMENT, SdtmPackage.Literals.SUBJECT_ELEMENT.getEAllOperations().get(72));
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
    return (StudyEpoch) query.evaluate(subjectElement);
  }

} // SubjectElementOperations