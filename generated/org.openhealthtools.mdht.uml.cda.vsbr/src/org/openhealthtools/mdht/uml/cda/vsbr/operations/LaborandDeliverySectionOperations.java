/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.Observation;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.BodyWeightatDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Laborand Delivery Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionLaborandDeliveryInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Laborand Delivery Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionBodyWeightatDelivery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Body Weightat Delivery</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#getLaborandDeliveryInformation() <em>Get Laborand Delivery Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#getBodyWeightatDelivery() <em>Get Body Weightat Delivery</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LaborandDeliverySectionOperations extends SectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LaborandDeliverySectionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliverySectionTemplateId(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliverySectionTemplateId(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.5')";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliverySectionTemplateId(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliverySectionTemplateId(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.5')
   * @param laborandDeliverySection The receiving '<em><b>Laborand Delivery Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliverySectionTemplateId(LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_SECTION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliverySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliverySectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliverySection, context) }),
             new Object [] { laborandDeliverySection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliverySectionClassCode(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliverySectionClassCode(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::DOCSECT";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliverySectionClassCode(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliverySectionClassCode(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClass::DOCSECT
   * @param laborandDeliverySection The receiving '<em><b>Laborand Delivery Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliverySectionClassCode(LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_SECTION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliverySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliverySectionClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliverySection, context) }),
             new Object [] { laborandDeliverySection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliverySectionCode(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliverySectionCode(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliverySectionCode(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliverySectionCode(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.codeSystem = '2.16.840.1.113883.6.1')
   * @param laborandDeliverySection The receiving '<em><b>Laborand Delivery Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliverySectionCode(LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_SECTION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliverySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliverySectionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliverySection, context) }),
             new Object [] { laborandDeliverySection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliverySectionMoodCode(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliverySectionMoodCode(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::ActMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliverySectionMoodCode(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliverySectionMoodCode(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::ActMood::EVN
   * @param laborandDeliverySection The receiving '<em><b>Laborand Delivery Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliverySectionMoodCode(LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_SECTION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliverySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliverySectionMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliverySection, context) }),
             new Object [] { laborandDeliverySection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliverySectionText(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliverySectionText(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliverySectionText(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliverySectionText(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.text.oclIsUndefined()
   * @param laborandDeliverySection The receiving '<em><b>Laborand Delivery Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliverySectionText(LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_SECTION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliverySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliverySectionText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliverySection, context) }),
             new Object [] { laborandDeliverySection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliverySectionLaborandDeliveryInformation(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Laborand Delivery Information</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliverySectionLaborandDeliveryInformation(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_SECTION_LABORAND_DELIVERY_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(vsbr::Labor and Delivery Information) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliverySectionLaborandDeliveryInformation(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Laborand Delivery Information</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliverySectionLaborandDeliveryInformation(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_SECTION_LABORAND_DELIVERY_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(vsbr::Labor and Delivery Information) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param laborandDeliverySection The receiving '<em><b>Laborand Delivery Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliverySectionLaborandDeliveryInformation(LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_SECTION_LABORAND_DELIVERY_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_SECTION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_SECTION_LABORAND_DELIVERY_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_SECTION_LABORAND_DELIVERY_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_SECTION_LABORAND_DELIVERY_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliverySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_LABORAND_DELIVERY_INFORMATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliverySectionLaborandDeliveryInformation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliverySection, context) }),
             new Object [] { laborandDeliverySection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliverySectionBodyWeightatDelivery(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Body Weightat Delivery</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliverySectionBodyWeightatDelivery(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_SECTION_BODY_WEIGHTAT_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Body Weight at Delivery))";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliverySectionBodyWeightatDelivery(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Body Weightat Delivery</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliverySectionBodyWeightatDelivery(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_SECTION_BODY_WEIGHTAT_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Body Weight at Delivery))
   * @param laborandDeliverySection The receiving '<em><b>Laborand Delivery Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliverySectionBodyWeightatDelivery(LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_SECTION_BODY_WEIGHTAT_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_SECTION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_SECTION_BODY_WEIGHTAT_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_SECTION_BODY_WEIGHTAT_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_SECTION_BODY_WEIGHTAT_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliverySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_BODY_WEIGHTAT_DELIVERY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliverySectionBodyWeightatDelivery", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliverySection, context) }),
             new Object [] { laborandDeliverySection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getLaborandDeliveryInformation(LaborandDeliverySection) <em>Get Laborand Delivery Information</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLaborandDeliveryInformation(LaborandDeliverySection)
   * @generated
   * @ordered
   */
  protected static final String GET_LABORAND_DELIVERY_INFORMATION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(vsbr::Labor and Delivery Information))->asSequence()->any(true).oclAsType(vsbr::Labor and Delivery Information)";

  /**
   * The cached OCL query for the '{@link #getLaborandDeliveryInformation(LaborandDeliverySection) <em>Get Laborand Delivery Information</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLaborandDeliveryInformation(LaborandDeliverySection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_LABORAND_DELIVERY_INFORMATION__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(vsbr::Labor and Delivery Information))->asSequence()->any(true).oclAsType(vsbr::Labor and Delivery Information)
   * @param laborandDeliverySection The receiving '<em><b>Laborand Delivery Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  LaborandDeliveryInformation getLaborandDeliveryInformation(LaborandDeliverySection laborandDeliverySection)
  {
    if (GET_LABORAND_DELIVERY_INFORMATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.LABORAND_DELIVERY_SECTION, VsbrPackage.Literals.LABORAND_DELIVERY_SECTION.getEAllOperations().get(62));
      try
      {
        GET_LABORAND_DELIVERY_INFORMATION__EOCL_QRY = helper.createQuery(GET_LABORAND_DELIVERY_INFORMATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_LABORAND_DELIVERY_INFORMATION__EOCL_QRY);
    return (LaborandDeliveryInformation) query.evaluate(laborandDeliverySection);
  }

  /**
   * The cached OCL expression body for the '{@link #getBodyWeightatDelivery(LaborandDeliverySection) <em>Get Body Weightat Delivery</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodyWeightatDelivery(LaborandDeliverySection)
   * @generated
   * @ordered
   */
  protected static final String GET_BODY_WEIGHTAT_DELIVERY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Body Weight at Delivery))->asSequence()->any(true).oclAsType(vsbr::Body Weight at Delivery)";

  /**
   * The cached OCL query for the '{@link #getBodyWeightatDelivery(LaborandDeliverySection) <em>Get Body Weightat Delivery</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodyWeightatDelivery(LaborandDeliverySection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_BODY_WEIGHTAT_DELIVERY__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Body Weight at Delivery))->asSequence()->any(true).oclAsType(vsbr::Body Weight at Delivery)
   * @param laborandDeliverySection The receiving '<em><b>Laborand Delivery Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  BodyWeightatDelivery getBodyWeightatDelivery(LaborandDeliverySection laborandDeliverySection)
  {
    if (GET_BODY_WEIGHTAT_DELIVERY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.LABORAND_DELIVERY_SECTION, VsbrPackage.Literals.LABORAND_DELIVERY_SECTION.getEAllOperations().get(63));
      try
      {
        GET_BODY_WEIGHTAT_DELIVERY__EOCL_QRY = helper.createQuery(GET_BODY_WEIGHTAT_DELIVERY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_BODY_WEIGHTAT_DELIVERY__EOCL_QRY);
    return (BodyWeightatDelivery) query.evaluate(laborandDeliverySection);
  }

} // LaborandDeliverySectionOperations