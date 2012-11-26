/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.Observation;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionsoftheNewborn;
import org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder;
import org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaliesoftheNewborn;
import org.openhealthtools.mdht.uml.cda.vsbr.FetusSection;
import org.openhealthtools.mdht.uml.cda.vsbr.NumberofInfantsBornAlive;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.Weight;
import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Fetus Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#validateFetusSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#validateFetusSectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#validateFetusSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#validateFetusSectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#validateFetusSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#validateFetusSectionSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#validateFetusSectionAbnormalConditionsoftheNewborn(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Abnormal Conditionsofthe Newborn</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#validateFetusSectionBirthOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Birth Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#validateFetusSectionNumberofInfantsBornAlive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Numberof Infants Born Alive</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#validateFetusSectionCongenitalAnomaliesoftheNewborn2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Congenital Anomaliesofthe Newborn2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#validateFetusSectionWeight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Weight</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#getAbnormalConditionsoftheNewborns() <em>Get Abnormal Conditionsofthe Newborns</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#getBirthOrder() <em>Get Birth Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#getNumberofInfantsBornAlive() <em>Get Numberof Infants Born Alive</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#getCongenitalAnomaliesoftheNewborn2s() <em>Get Congenital Anomaliesofthe Newborn2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection#getWeight() <em>Get Weight</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FetusSectionOperations extends SectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FetusSectionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetusSectionTemplateId(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetusSectionTemplateId(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.7')";

  /**
   * The cached OCL invariant for the '{@link #validateFetusSectionTemplateId(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetusSectionTemplateId(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.7')
   * @param fetusSection The receiving '<em><b>Fetus Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetusSectionTemplateId(FetusSection fetusSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETUS_SECTION);
      try
      {
        VALIDATE_FETUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetusSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETUS_SECTION__FETUS_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetusSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetusSection, context) }),
             new Object [] { fetusSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetusSectionClassCode(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetusSectionClassCode(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETUS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode') and self.classCode=vocab::ActClass::DOCSECT";

  /**
   * The cached OCL invariant for the '{@link #validateFetusSectionClassCode(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetusSectionClassCode(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETUS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * isDefined('classCode') and self.classCode=vocab::ActClass::DOCSECT
   * @param fetusSection The receiving '<em><b>Fetus Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetusSectionClassCode(FetusSection fetusSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETUS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETUS_SECTION);
      try
      {
        VALIDATE_FETUS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETUS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETUS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetusSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETUS_SECTION__FETUS_SECTION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetusSectionClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetusSection, context) }),
             new Object [] { fetusSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetusSectionCode(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetusSectionCode(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateFetusSectionCode(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetusSectionCode(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.codeSystem = '2.16.840.1.113883.6.1')
   * @param fetusSection The receiving '<em><b>Fetus Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetusSectionCode(FetusSection fetusSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETUS_SECTION);
      try
      {
        VALIDATE_FETUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetusSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETUS_SECTION__FETUS_SECTION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetusSectionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetusSection, context) }),
             new Object [] { fetusSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetusSectionMoodCode(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetusSectionMoodCode(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETUS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode') and self.moodCode=vocab::ActMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateFetusSectionMoodCode(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetusSectionMoodCode(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETUS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * isDefined('moodCode') and self.moodCode=vocab::ActMood::EVN
   * @param fetusSection The receiving '<em><b>Fetus Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetusSectionMoodCode(FetusSection fetusSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETUS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETUS_SECTION);
      try
      {
        VALIDATE_FETUS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETUS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETUS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetusSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETUS_SECTION__FETUS_SECTION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetusSectionMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetusSection, context) }),
             new Object [] { fetusSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetusSectionText(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetusSectionText(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateFetusSectionText(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetusSectionText(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.text.oclIsUndefined()
   * @param fetusSection The receiving '<em><b>Fetus Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetusSectionText(FetusSection fetusSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETUS_SECTION);
      try
      {
        VALIDATE_FETUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetusSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETUS_SECTION__FETUS_SECTION_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetusSectionText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetusSection, context) }),
             new Object [] { fetusSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetusSectionSubject(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Subject</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetusSectionSubject(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETUS_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->one(subject : cda::Subject | not subject.oclIsUndefined() and subject.oclIsKindOf(rim::Participation))";

  /**
   * The cached OCL invariant for the '{@link #validateFetusSectionSubject(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Subject</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetusSectionSubject(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETUS_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.subject->one(subject : cda::Subject | not subject.oclIsUndefined() and subject.oclIsKindOf(rim::Participation))
   * @param fetusSection The receiving '<em><b>Fetus Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetusSectionSubject(FetusSection fetusSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETUS_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETUS_SECTION);
      try
      {
        VALIDATE_FETUS_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETUS_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETUS_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetusSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETUS_SECTION__FETUS_SECTION_SUBJECT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetusSectionSubject", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetusSection, context) }),
             new Object [] { fetusSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetusSectionAbnormalConditionsoftheNewborn(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Abnormal Conditionsofthe Newborn</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetusSectionAbnormalConditionsoftheNewborn(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETUS_SECTION_ABNORMAL_CONDITIONSOFTHE_NEWBORN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Abnormal Conditions of the Newborn) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateFetusSectionAbnormalConditionsoftheNewborn(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Abnormal Conditionsofthe Newborn</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetusSectionAbnormalConditionsoftheNewborn(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETUS_SECTION_ABNORMAL_CONDITIONSOFTHE_NEWBORN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Abnormal Conditions of the Newborn) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param fetusSection The receiving '<em><b>Fetus Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetusSectionAbnormalConditionsoftheNewborn(FetusSection fetusSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETUS_SECTION_ABNORMAL_CONDITIONSOFTHE_NEWBORN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETUS_SECTION);
      try
      {
        VALIDATE_FETUS_SECTION_ABNORMAL_CONDITIONSOFTHE_NEWBORN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETUS_SECTION_ABNORMAL_CONDITIONSOFTHE_NEWBORN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETUS_SECTION_ABNORMAL_CONDITIONSOFTHE_NEWBORN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetusSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETUS_SECTION__FETUS_SECTION_ABNORMAL_CONDITIONSOFTHE_NEWBORN,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetusSectionAbnormalConditionsoftheNewborn", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetusSection, context) }),
             new Object [] { fetusSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetusSectionBirthOrder(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Birth Order</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetusSectionBirthOrder(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETUS_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Birth Order) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateFetusSectionBirthOrder(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Birth Order</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetusSectionBirthOrder(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETUS_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Birth Order) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param fetusSection The receiving '<em><b>Fetus Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetusSectionBirthOrder(FetusSection fetusSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETUS_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETUS_SECTION);
      try
      {
        VALIDATE_FETUS_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETUS_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETUS_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetusSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETUS_SECTION__FETUS_SECTION_BIRTH_ORDER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetusSectionBirthOrder", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetusSection, context) }),
             new Object [] { fetusSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetusSectionNumberofInfantsBornAlive(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Numberof Infants Born Alive</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetusSectionNumberofInfantsBornAlive(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETUS_SECTION_NUMBEROF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Number of Infants Born Alive) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateFetusSectionNumberofInfantsBornAlive(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Numberof Infants Born Alive</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetusSectionNumberofInfantsBornAlive(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETUS_SECTION_NUMBEROF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Number of Infants Born Alive) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param fetusSection The receiving '<em><b>Fetus Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetusSectionNumberofInfantsBornAlive(FetusSection fetusSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETUS_SECTION_NUMBEROF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETUS_SECTION);
      try
      {
        VALIDATE_FETUS_SECTION_NUMBEROF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETUS_SECTION_NUMBEROF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETUS_SECTION_NUMBEROF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetusSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETUS_SECTION__FETUS_SECTION_NUMBEROF_INFANTS_BORN_ALIVE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetusSectionNumberofInfantsBornAlive", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetusSection, context) }),
             new Object [] { fetusSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetusSectionCongenitalAnomaliesoftheNewborn2(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Congenital Anomaliesofthe Newborn2</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetusSectionCongenitalAnomaliesoftheNewborn2(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETUS_SECTION_CONGENITAL_ANOMALIESOFTHE_NEWBORN2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Congenital Anomalies of the Newborn) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateFetusSectionCongenitalAnomaliesoftheNewborn2(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Congenital Anomaliesofthe Newborn2</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetusSectionCongenitalAnomaliesoftheNewborn2(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETUS_SECTION_CONGENITAL_ANOMALIESOFTHE_NEWBORN2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Congenital Anomalies of the Newborn) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param fetusSection The receiving '<em><b>Fetus Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetusSectionCongenitalAnomaliesoftheNewborn2(FetusSection fetusSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETUS_SECTION_CONGENITAL_ANOMALIESOFTHE_NEWBORN2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETUS_SECTION);
      try
      {
        VALIDATE_FETUS_SECTION_CONGENITAL_ANOMALIESOFTHE_NEWBORN2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETUS_SECTION_CONGENITAL_ANOMALIESOFTHE_NEWBORN2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETUS_SECTION_CONGENITAL_ANOMALIESOFTHE_NEWBORN2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetusSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETUS_SECTION__FETUS_SECTION_CONGENITAL_ANOMALIESOFTHE_NEWBORN2,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetusSectionCongenitalAnomaliesoftheNewborn2", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetusSection, context) }),
             new Object [] { fetusSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFetusSectionWeight(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Weight</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetusSectionWeight(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FETUS_SECTION_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Weight) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateFetusSectionWeight(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Section Weight</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFetusSectionWeight(FetusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FETUS_SECTION_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Weight) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param fetusSection The receiving '<em><b>Fetus Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFetusSectionWeight(FetusSection fetusSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FETUS_SECTION_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.FETUS_SECTION);
      try
      {
        VALIDATE_FETUS_SECTION_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETUS_SECTION_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FETUS_SECTION_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fetusSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.FETUS_SECTION__FETUS_SECTION_WEIGHT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FetusSectionWeight", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetusSection, context) }),
             new Object [] { fetusSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getAbnormalConditionsoftheNewborns(FetusSection) <em>Get Abnormal Conditionsofthe Newborns</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbnormalConditionsoftheNewborns(FetusSection)
   * @generated
   * @ordered
   */
  protected static final String GET_ABNORMAL_CONDITIONSOFTHE_NEWBORNS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Abnormal Conditions of the Newborn)).oclAsType(vsbr::Abnormal Conditions of the Newborn)";

  /**
   * The cached OCL query for the '{@link #getAbnormalConditionsoftheNewborns(FetusSection) <em>Get Abnormal Conditionsofthe Newborns</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbnormalConditionsoftheNewborns(FetusSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ABNORMAL_CONDITIONSOFTHE_NEWBORNS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Abnormal Conditions of the Newborn)).oclAsType(vsbr::Abnormal Conditions of the Newborn)
   * @param fetusSection The receiving '<em><b>Fetus Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<AbnormalConditionsoftheNewborn> getAbnormalConditionsoftheNewborns(FetusSection fetusSection)
  {
    if (GET_ABNORMAL_CONDITIONSOFTHE_NEWBORNS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.FETUS_SECTION, VsbrPackage.Literals.FETUS_SECTION.getEAllOperations().get(66));
      try
      {
        GET_ABNORMAL_CONDITIONSOFTHE_NEWBORNS__EOCL_QRY = helper.createQuery(GET_ABNORMAL_CONDITIONSOFTHE_NEWBORNS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ABNORMAL_CONDITIONSOFTHE_NEWBORNS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<AbnormalConditionsoftheNewborn> result = (Collection<AbnormalConditionsoftheNewborn>) query.evaluate(fetusSection);
    return new BasicEList.UnmodifiableEList<AbnormalConditionsoftheNewborn>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getBirthOrder(FetusSection) <em>Get Birth Order</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBirthOrder(FetusSection)
   * @generated
   * @ordered
   */
  protected static final String GET_BIRTH_ORDER__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Birth Order))->asSequence()->any(true).oclAsType(vsbr::Birth Order)";

  /**
   * The cached OCL query for the '{@link #getBirthOrder(FetusSection) <em>Get Birth Order</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBirthOrder(FetusSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_BIRTH_ORDER__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Birth Order))->asSequence()->any(true).oclAsType(vsbr::Birth Order)
   * @param fetusSection The receiving '<em><b>Fetus Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  BirthOrder getBirthOrder(FetusSection fetusSection)
  {
    if (GET_BIRTH_ORDER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.FETUS_SECTION, VsbrPackage.Literals.FETUS_SECTION.getEAllOperations().get(67));
      try
      {
        GET_BIRTH_ORDER__EOCL_QRY = helper.createQuery(GET_BIRTH_ORDER__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_BIRTH_ORDER__EOCL_QRY);
    return (BirthOrder) query.evaluate(fetusSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getNumberofInfantsBornAlive(FetusSection) <em>Get Numberof Infants Born Alive</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberofInfantsBornAlive(FetusSection)
   * @generated
   * @ordered
   */
  protected static final String GET_NUMBEROF_INFANTS_BORN_ALIVE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Number of Infants Born Alive))->asSequence()->any(true).oclAsType(vsbr::Number of Infants Born Alive)";

  /**
   * The cached OCL query for the '{@link #getNumberofInfantsBornAlive(FetusSection) <em>Get Numberof Infants Born Alive</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberofInfantsBornAlive(FetusSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NUMBEROF_INFANTS_BORN_ALIVE__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Number of Infants Born Alive))->asSequence()->any(true).oclAsType(vsbr::Number of Infants Born Alive)
   * @param fetusSection The receiving '<em><b>Fetus Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  NumberofInfantsBornAlive getNumberofInfantsBornAlive(FetusSection fetusSection)
  {
    if (GET_NUMBEROF_INFANTS_BORN_ALIVE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.FETUS_SECTION, VsbrPackage.Literals.FETUS_SECTION.getEAllOperations().get(68));
      try
      {
        GET_NUMBEROF_INFANTS_BORN_ALIVE__EOCL_QRY = helper.createQuery(GET_NUMBEROF_INFANTS_BORN_ALIVE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_NUMBEROF_INFANTS_BORN_ALIVE__EOCL_QRY);
    return (NumberofInfantsBornAlive) query.evaluate(fetusSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getCongenitalAnomaliesoftheNewborn2s(FetusSection) <em>Get Congenital Anomaliesofthe Newborn2s</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCongenitalAnomaliesoftheNewborn2s(FetusSection)
   * @generated
   * @ordered
   */
  protected static final String GET_CONGENITAL_ANOMALIESOFTHE_NEWBORN2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Congenital Anomalies of the Newborn)).oclAsType(vsbr::Congenital Anomalies of the Newborn)";

  /**
   * The cached OCL query for the '{@link #getCongenitalAnomaliesoftheNewborn2s(FetusSection) <em>Get Congenital Anomaliesofthe Newborn2s</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCongenitalAnomaliesoftheNewborn2s(FetusSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_CONGENITAL_ANOMALIESOFTHE_NEWBORN2S__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Congenital Anomalies of the Newborn)).oclAsType(vsbr::Congenital Anomalies of the Newborn)
   * @param fetusSection The receiving '<em><b>Fetus Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<CongenitalAnomaliesoftheNewborn> getCongenitalAnomaliesoftheNewborn2s(FetusSection fetusSection)
  {
    if (GET_CONGENITAL_ANOMALIESOFTHE_NEWBORN2S__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.FETUS_SECTION, VsbrPackage.Literals.FETUS_SECTION.getEAllOperations().get(69));
      try
      {
        GET_CONGENITAL_ANOMALIESOFTHE_NEWBORN2S__EOCL_QRY = helper.createQuery(GET_CONGENITAL_ANOMALIESOFTHE_NEWBORN2S__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_CONGENITAL_ANOMALIESOFTHE_NEWBORN2S__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<CongenitalAnomaliesoftheNewborn> result = (Collection<CongenitalAnomaliesoftheNewborn>) query.evaluate(fetusSection);
    return new BasicEList.UnmodifiableEList<CongenitalAnomaliesoftheNewborn>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getWeight(FetusSection) <em>Get Weight</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight(FetusSection)
   * @generated
   * @ordered
   */
  protected static final String GET_WEIGHT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Weight))->asSequence()->any(true).oclAsType(vsbr::Weight)";

  /**
   * The cached OCL query for the '{@link #getWeight(FetusSection) <em>Get Weight</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight(FetusSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_WEIGHT__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Weight))->asSequence()->any(true).oclAsType(vsbr::Weight)
   * @param fetusSection The receiving '<em><b>Fetus Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  Weight getWeight(FetusSection fetusSection)
  {
    if (GET_WEIGHT__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.FETUS_SECTION, VsbrPackage.Literals.FETUS_SECTION.getEAllOperations().get(70));
      try
      {
        GET_WEIGHT__EOCL_QRY = helper.createQuery(GET_WEIGHT__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_WEIGHT__EOCL_QRY);
    return (Weight) query.evaluate(fetusSection);
  }

} // FetusSectionOperations