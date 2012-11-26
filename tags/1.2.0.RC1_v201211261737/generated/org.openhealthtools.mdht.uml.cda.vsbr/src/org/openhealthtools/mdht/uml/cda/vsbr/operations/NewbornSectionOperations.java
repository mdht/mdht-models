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
import org.openhealthtools.mdht.uml.cda.Entry;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.ApgarScore;
import org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder;
import org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaliesoftheNewborn;
import org.openhealthtools.mdht.uml.cda.vsbr.EstimateofGestation;
import org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection;
import org.openhealthtools.mdht.uml.cda.vsbr.NumberofInfantsBornAlive;
import org.openhealthtools.mdht.uml.cda.vsbr.Plurality;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.Weight;
import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Newborn Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionEstimateofGestation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Estimateof Gestation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionApgarScore(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Apgar Score</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionPlurality(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Plurality</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionBirthOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Birth Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionNumberofInfantsBornAlive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Numberof Infants Born Alive</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionCongenitalAnomaliesoftheNewborn(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Congenital Anomaliesofthe Newborn</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#validateNewbornSectionWeight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Weight</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#getEstimateofGestation() <em>Get Estimateof Gestation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#getApgarScores() <em>Get Apgar Scores</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#getPlurality() <em>Get Plurality</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#getBirthOrder() <em>Get Birth Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#getNumberofInfantsBornAlive() <em>Get Numberof Infants Born Alive</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#getCongenitalAnomaliesoftheNewborns() <em>Get Congenital Anomaliesofthe Newborns</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection#getWeight() <em>Get Weight</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NewbornSectionOperations extends SectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NewbornSectionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateNewbornSectionTemplateId(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionTemplateId(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NEWBORN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.6')";

  /**
   * The cached OCL invariant for the '{@link #validateNewbornSectionTemplateId(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionTemplateId(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NEWBORN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.6')
   * @param newbornSection The receiving '<em><b>Newborn Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNewbornSectionTemplateId(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NEWBORN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORN_SECTION);
      try
      {
        VALIDATE_NEWBORN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORN_SECTION__NEWBORN_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornSection, context) }),
             new Object [] { newbornSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNewbornSectionClassCode(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionClassCode(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NEWBORN_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::DOCSECT";

  /**
   * The cached OCL invariant for the '{@link #validateNewbornSectionClassCode(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionClassCode(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NEWBORN_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClass::DOCSECT
   * @param newbornSection The receiving '<em><b>Newborn Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNewbornSectionClassCode(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NEWBORN_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORN_SECTION);
      try
      {
        VALIDATE_NEWBORN_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORN_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORN_SECTION__NEWBORN_SECTION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornSectionClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornSection, context) }),
             new Object [] { newbornSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNewbornSectionCode(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionCode(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NEWBORN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateNewbornSectionCode(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionCode(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NEWBORN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.codeSystem = '2.16.840.1.113883.6.1')
   * @param newbornSection The receiving '<em><b>Newborn Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNewbornSectionCode(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NEWBORN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORN_SECTION);
      try
      {
        VALIDATE_NEWBORN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORN_SECTION__NEWBORN_SECTION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornSectionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornSection, context) }),
             new Object [] { newbornSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNewbornSectionMoodCode(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionMoodCode(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NEWBORN_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::ActMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateNewbornSectionMoodCode(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionMoodCode(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NEWBORN_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::ActMood::EVN
   * @param newbornSection The receiving '<em><b>Newborn Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNewbornSectionMoodCode(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NEWBORN_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORN_SECTION);
      try
      {
        VALIDATE_NEWBORN_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORN_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORN_SECTION__NEWBORN_SECTION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornSectionMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornSection, context) }),
             new Object [] { newbornSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNewbornSectionText(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionText(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NEWBORN_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateNewbornSectionText(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionText(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NEWBORN_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.text.oclIsUndefined()
   * @param newbornSection The receiving '<em><b>Newborn Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNewbornSectionText(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NEWBORN_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORN_SECTION);
      try
      {
        VALIDATE_NEWBORN_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORN_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORN_SECTION__NEWBORN_SECTION_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornSectionText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornSection, context) }),
             new Object [] { newbornSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNewbornSectionSubject(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Subject</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionSubject(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NEWBORN_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->one(subject : cda::Subject | not subject.oclIsUndefined() and subject.oclIsKindOf(cda::Subject))";

  /**
   * The cached OCL invariant for the '{@link #validateNewbornSectionSubject(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Subject</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionSubject(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NEWBORN_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.subject->one(subject : cda::Subject | not subject.oclIsUndefined() and subject.oclIsKindOf(cda::Subject))
   * @param newbornSection The receiving '<em><b>Newborn Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNewbornSectionSubject(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NEWBORN_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORN_SECTION);
      try
      {
        VALIDATE_NEWBORN_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORN_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORN_SECTION__NEWBORN_SECTION_SUBJECT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornSectionSubject", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornSection, context) }),
             new Object [] { newbornSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNewbornSectionEstimateofGestation(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Estimateof Gestation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionEstimateofGestation(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NEWBORN_SECTION_ESTIMATEOF_GESTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Estimate of Gestation) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNewbornSectionEstimateofGestation(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Estimateof Gestation</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionEstimateofGestation(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NEWBORN_SECTION_ESTIMATEOF_GESTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Estimate of Gestation) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param newbornSection The receiving '<em><b>Newborn Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNewbornSectionEstimateofGestation(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NEWBORN_SECTION_ESTIMATEOF_GESTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORN_SECTION);
      try
      {
        VALIDATE_NEWBORN_SECTION_ESTIMATEOF_GESTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_SECTION_ESTIMATEOF_GESTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORN_SECTION_ESTIMATEOF_GESTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORN_SECTION__NEWBORN_SECTION_ESTIMATEOF_GESTATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornSectionEstimateofGestation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornSection, context) }),
             new Object [] { newbornSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNewbornSectionApgarScore(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Apgar Score</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionApgarScore(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NEWBORN_SECTION_APGAR_SCORE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "1..2->includes(self.entry->select(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Apgar Score))->size())";

  /**
   * The cached OCL invariant for the '{@link #validateNewbornSectionApgarScore(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Apgar Score</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionApgarScore(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NEWBORN_SECTION_APGAR_SCORE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 1..2->includes(self.entry->select(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Apgar Score))->size())
   * @param newbornSection The receiving '<em><b>Newborn Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNewbornSectionApgarScore(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NEWBORN_SECTION_APGAR_SCORE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORN_SECTION);
      try
      {
        VALIDATE_NEWBORN_SECTION_APGAR_SCORE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_SECTION_APGAR_SCORE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORN_SECTION_APGAR_SCORE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORN_SECTION__NEWBORN_SECTION_APGAR_SCORE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornSectionApgarScore", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornSection, context) }),
             new Object [] { newbornSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNewbornSectionPlurality(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Plurality</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionPlurality(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NEWBORN_SECTION_PLURALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Plurality) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNewbornSectionPlurality(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Plurality</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionPlurality(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NEWBORN_SECTION_PLURALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Plurality) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param newbornSection The receiving '<em><b>Newborn Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNewbornSectionPlurality(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NEWBORN_SECTION_PLURALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORN_SECTION);
      try
      {
        VALIDATE_NEWBORN_SECTION_PLURALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_SECTION_PLURALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORN_SECTION_PLURALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORN_SECTION__NEWBORN_SECTION_PLURALITY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornSectionPlurality", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornSection, context) }),
             new Object [] { newbornSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNewbornSectionBirthOrder(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Birth Order</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionBirthOrder(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NEWBORN_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Birth Order) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNewbornSectionBirthOrder(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Birth Order</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionBirthOrder(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NEWBORN_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Birth Order) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param newbornSection The receiving '<em><b>Newborn Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNewbornSectionBirthOrder(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NEWBORN_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORN_SECTION);
      try
      {
        VALIDATE_NEWBORN_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORN_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORN_SECTION__NEWBORN_SECTION_BIRTH_ORDER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornSectionBirthOrder", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornSection, context) }),
             new Object [] { newbornSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNewbornSectionNumberofInfantsBornAlive(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Numberof Infants Born Alive</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionNumberofInfantsBornAlive(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NEWBORN_SECTION_NUMBEROF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Number of Infants Born Alive) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNewbornSectionNumberofInfantsBornAlive(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Numberof Infants Born Alive</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionNumberofInfantsBornAlive(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NEWBORN_SECTION_NUMBEROF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Number of Infants Born Alive) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param newbornSection The receiving '<em><b>Newborn Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNewbornSectionNumberofInfantsBornAlive(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NEWBORN_SECTION_NUMBEROF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORN_SECTION);
      try
      {
        VALIDATE_NEWBORN_SECTION_NUMBEROF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_SECTION_NUMBEROF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORN_SECTION_NUMBEROF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORN_SECTION__NEWBORN_SECTION_NUMBEROF_INFANTS_BORN_ALIVE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornSectionNumberofInfantsBornAlive", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornSection, context) }),
             new Object [] { newbornSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNewbornSectionCongenitalAnomaliesoftheNewborn(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Congenital Anomaliesofthe Newborn</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionCongenitalAnomaliesoftheNewborn(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NEWBORN_SECTION_CONGENITAL_ANOMALIESOFTHE_NEWBORN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Congenital Anomalies of the Newborn) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNewbornSectionCongenitalAnomaliesoftheNewborn(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Congenital Anomaliesofthe Newborn</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionCongenitalAnomaliesoftheNewborn(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NEWBORN_SECTION_CONGENITAL_ANOMALIESOFTHE_NEWBORN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Congenital Anomalies of the Newborn) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param newbornSection The receiving '<em><b>Newborn Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNewbornSectionCongenitalAnomaliesoftheNewborn(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NEWBORN_SECTION_CONGENITAL_ANOMALIESOFTHE_NEWBORN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORN_SECTION);
      try
      {
        VALIDATE_NEWBORN_SECTION_CONGENITAL_ANOMALIESOFTHE_NEWBORN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_SECTION_CONGENITAL_ANOMALIESOFTHE_NEWBORN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORN_SECTION_CONGENITAL_ANOMALIESOFTHE_NEWBORN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORN_SECTION__NEWBORN_SECTION_CONGENITAL_ANOMALIESOFTHE_NEWBORN,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornSectionCongenitalAnomaliesoftheNewborn", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornSection, context) }),
             new Object [] { newbornSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateNewbornSectionWeight(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Weight</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionWeight(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_NEWBORN_SECTION_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Weight) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateNewbornSectionWeight(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Section Weight</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateNewbornSectionWeight(NewbornSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_NEWBORN_SECTION_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Weight) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
   * @param newbornSection The receiving '<em><b>Newborn Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateNewbornSectionWeight(NewbornSection newbornSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_NEWBORN_SECTION_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.NEWBORN_SECTION);
      try
      {
        VALIDATE_NEWBORN_SECTION_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_SECTION_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_NEWBORN_SECTION_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(newbornSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.NEWBORN_SECTION__NEWBORN_SECTION_WEIGHT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NewbornSectionWeight", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(newbornSection, context) }),
             new Object [] { newbornSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getEstimateofGestation(NewbornSection) <em>Get Estimateof Gestation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstimateofGestation(NewbornSection)
   * @generated
   * @ordered
   */
  protected static final String GET_ESTIMATEOF_GESTATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Estimate of Gestation))->asSequence()->any(true).oclAsType(vsbr::Estimate of Gestation)";

  /**
   * The cached OCL query for the '{@link #getEstimateofGestation(NewbornSection) <em>Get Estimateof Gestation</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstimateofGestation(NewbornSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ESTIMATEOF_GESTATION__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Estimate of Gestation))->asSequence()->any(true).oclAsType(vsbr::Estimate of Gestation)
   * @param newbornSection The receiving '<em><b>Newborn Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EstimateofGestation getEstimateofGestation(NewbornSection newbornSection)
  {
    if (GET_ESTIMATEOF_GESTATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.NEWBORN_SECTION, VsbrPackage.Literals.NEWBORN_SECTION.getEAllOperations().get(68));
      try
      {
        GET_ESTIMATEOF_GESTATION__EOCL_QRY = helper.createQuery(GET_ESTIMATEOF_GESTATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ESTIMATEOF_GESTATION__EOCL_QRY);
    return (EstimateofGestation) query.evaluate(newbornSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getApgarScores(NewbornSection) <em>Get Apgar Scores</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApgarScores(NewbornSection)
   * @generated
   * @ordered
   */
  protected static final String GET_APGAR_SCORES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Apgar Score)).oclAsType(vsbr::Apgar Score)";

  /**
   * The cached OCL query for the '{@link #getApgarScores(NewbornSection) <em>Get Apgar Scores</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApgarScores(NewbornSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_APGAR_SCORES__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Apgar Score)).oclAsType(vsbr::Apgar Score)
   * @param newbornSection The receiving '<em><b>Newborn Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<ApgarScore> getApgarScores(NewbornSection newbornSection)
  {
    if (GET_APGAR_SCORES__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.NEWBORN_SECTION, VsbrPackage.Literals.NEWBORN_SECTION.getEAllOperations().get(69));
      try
      {
        GET_APGAR_SCORES__EOCL_QRY = helper.createQuery(GET_APGAR_SCORES__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_APGAR_SCORES__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<ApgarScore> result = (Collection<ApgarScore>) query.evaluate(newbornSection);
    return new BasicEList.UnmodifiableEList<ApgarScore>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getPlurality(NewbornSection) <em>Get Plurality</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlurality(NewbornSection)
   * @generated
   * @ordered
   */
  protected static final String GET_PLURALITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Plurality))->asSequence()->any(true).oclAsType(vsbr::Plurality)";

  /**
   * The cached OCL query for the '{@link #getPlurality(NewbornSection) <em>Get Plurality</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlurality(NewbornSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PLURALITY__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Plurality))->asSequence()->any(true).oclAsType(vsbr::Plurality)
   * @param newbornSection The receiving '<em><b>Newborn Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  Plurality getPlurality(NewbornSection newbornSection)
  {
    if (GET_PLURALITY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.NEWBORN_SECTION, VsbrPackage.Literals.NEWBORN_SECTION.getEAllOperations().get(70));
      try
      {
        GET_PLURALITY__EOCL_QRY = helper.createQuery(GET_PLURALITY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PLURALITY__EOCL_QRY);
    return (Plurality) query.evaluate(newbornSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getBirthOrder(NewbornSection) <em>Get Birth Order</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBirthOrder(NewbornSection)
   * @generated
   * @ordered
   */
  protected static final String GET_BIRTH_ORDER__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Birth Order))->asSequence()->any(true).oclAsType(vsbr::Birth Order)";

  /**
   * The cached OCL query for the '{@link #getBirthOrder(NewbornSection) <em>Get Birth Order</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBirthOrder(NewbornSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_BIRTH_ORDER__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Birth Order))->asSequence()->any(true).oclAsType(vsbr::Birth Order)
   * @param newbornSection The receiving '<em><b>Newborn Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  BirthOrder getBirthOrder(NewbornSection newbornSection)
  {
    if (GET_BIRTH_ORDER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.NEWBORN_SECTION, VsbrPackage.Literals.NEWBORN_SECTION.getEAllOperations().get(71));
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
    return (BirthOrder) query.evaluate(newbornSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getNumberofInfantsBornAlive(NewbornSection) <em>Get Numberof Infants Born Alive</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberofInfantsBornAlive(NewbornSection)
   * @generated
   * @ordered
   */
  protected static final String GET_NUMBEROF_INFANTS_BORN_ALIVE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Number of Infants Born Alive))->asSequence()->any(true).oclAsType(vsbr::Number of Infants Born Alive)";

  /**
   * The cached OCL query for the '{@link #getNumberofInfantsBornAlive(NewbornSection) <em>Get Numberof Infants Born Alive</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberofInfantsBornAlive(NewbornSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NUMBEROF_INFANTS_BORN_ALIVE__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Number of Infants Born Alive))->asSequence()->any(true).oclAsType(vsbr::Number of Infants Born Alive)
   * @param newbornSection The receiving '<em><b>Newborn Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  NumberofInfantsBornAlive getNumberofInfantsBornAlive(NewbornSection newbornSection)
  {
    if (GET_NUMBEROF_INFANTS_BORN_ALIVE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.NEWBORN_SECTION, VsbrPackage.Literals.NEWBORN_SECTION.getEAllOperations().get(72));
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
    return (NumberofInfantsBornAlive) query.evaluate(newbornSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getCongenitalAnomaliesoftheNewborns(NewbornSection) <em>Get Congenital Anomaliesofthe Newborns</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCongenitalAnomaliesoftheNewborns(NewbornSection)
   * @generated
   * @ordered
   */
  protected static final String GET_CONGENITAL_ANOMALIESOFTHE_NEWBORNS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Congenital Anomalies of the Newborn)).oclAsType(vsbr::Congenital Anomalies of the Newborn)";

  /**
   * The cached OCL query for the '{@link #getCongenitalAnomaliesoftheNewborns(NewbornSection) <em>Get Congenital Anomaliesofthe Newborns</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCongenitalAnomaliesoftheNewborns(NewbornSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_CONGENITAL_ANOMALIESOFTHE_NEWBORNS__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Congenital Anomalies of the Newborn)).oclAsType(vsbr::Congenital Anomalies of the Newborn)
   * @param newbornSection The receiving '<em><b>Newborn Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<CongenitalAnomaliesoftheNewborn> getCongenitalAnomaliesoftheNewborns(NewbornSection newbornSection)
  {
    if (GET_CONGENITAL_ANOMALIESOFTHE_NEWBORNS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.NEWBORN_SECTION, VsbrPackage.Literals.NEWBORN_SECTION.getEAllOperations().get(73));
      try
      {
        GET_CONGENITAL_ANOMALIESOFTHE_NEWBORNS__EOCL_QRY = helper.createQuery(GET_CONGENITAL_ANOMALIESOFTHE_NEWBORNS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_CONGENITAL_ANOMALIESOFTHE_NEWBORNS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<CongenitalAnomaliesoftheNewborn> result = (Collection<CongenitalAnomaliesoftheNewborn>) query.evaluate(newbornSection);
    return new BasicEList.UnmodifiableEList<CongenitalAnomaliesoftheNewborn>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getWeight(NewbornSection) <em>Get Weight</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight(NewbornSection)
   * @generated
   * @ordered
   */
  protected static final String GET_WEIGHT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Weight))->asSequence()->any(true).oclAsType(vsbr::Weight)";

  /**
   * The cached OCL query for the '{@link #getWeight(NewbornSection) <em>Get Weight</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight(NewbornSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_WEIGHT__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Weight))->asSequence()->any(true).oclAsType(vsbr::Weight)
   * @param newbornSection The receiving '<em><b>Newborn Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  Weight getWeight(NewbornSection newbornSection)
  {
    if (GET_WEIGHT__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.NEWBORN_SECTION, VsbrPackage.Literals.NEWBORN_SECTION.getEAllOperations().get(74));
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
    return (Weight) query.evaluate(newbornSection);
  }

} // NewbornSectionOperations