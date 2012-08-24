/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations;

import org.openhealthtools.mdht.uml.cda.emspcr.AAAAA;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>AAAAA</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AAAAA#validateAAAAARecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AAAAA Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AAAAA#validateAAAAAComponent2StructuredBodyComponent3SectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AAAAA Component2 Structured Body Component3 Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AAAAA#validateAAAAAComponent2StructuredBodyComponent3Section(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AAAAA Component2 Structured Body Component3 Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AAAAAOperations extends GeneralHeaderConstraintsOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AAAAAOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateAAAAARecordTarget(AAAAA, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AAAAA Record Target</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAAAAARecordTarget(AAAAA, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_AAAAA_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->exists(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))";

  /**
   * The cached OCL invariant for the '{@link #validateAAAAARecordTarget(AAAAA, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AAAAA Record Target</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAAAAARecordTarget(AAAAA, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_AAAAA_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param aaaaa The receiving '<em><b>AAAAA</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAAAAARecordTarget(AAAAA aaaaa, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_AAAAA_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.AAAAA);
      try
      {
        VALIDATE_AAAAA_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AAAAA_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_AAAAA_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(aaaaa))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.AAAAA__AAAAA_RECORD_TARGET,
             EmspcrPlugin.INSTANCE.getString("AAAAARecordTarget"),
             new Object [] { aaaaa }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAAAAAComponent2StructuredBodyComponent3SectionCode(AAAAA, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AAAAA Component2 Structured Body Component3 Section Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAAAAAComponent2StructuredBodyComponent3SectionCode(AAAAA, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_AAAAA_COMPONENT2_STRUCTURED_BODY_COMPONENT3_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->select(typeCode=vocab::ParticipationType::CST).structuredBody->excluding(null).component->excluding(null).section->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateAAAAAComponent2StructuredBodyComponent3SectionCode(AAAAA, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AAAAA Component2 Structured Body Component3 Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAAAAAComponent2StructuredBodyComponent3SectionCode(AAAAA, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Query<?, ?, ?> VALIDATE_AAAAA_COMPONENT2_STRUCTURED_BODY_COMPONENT3_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param aaaaa The receiving '<em><b>AAAAA</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public static  boolean validateAAAAAComponent2StructuredBodyComponent3SectionCode(AAAAA aaaaa, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.AAAAA);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_AAAAA_COMPONENT2_STRUCTURED_BODY_COMPONENT3_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_AAAAA_COMPONENT2_STRUCTURED_BODY_COMPONENT3_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_AAAAA_COMPONENT2_STRUCTURED_BODY_COMPONENT3_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(aaaaa);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.AAAAA__AAAAA_COMPONENT2_STRUCTURED_BODY_COMPONENT3_SECTION_CODE,
             EmspcrPlugin.INSTANCE.getString("AAAAAComponent2StructuredBodyComponent3SectionCode"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAAAAAComponent2StructuredBodyComponent3Section(AAAAA, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AAAAA Component2 Structured Body Component3 Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAAAAAComponent2StructuredBodyComponent3Section(AAAAA, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_AAAAA_COMPONENT2_STRUCTURED_BODY_COMPONENT3_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->select(typeCode=vocab::ParticipationType::CST).structuredBody->excluding(null).component->excluding(null)->reject(section->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))->select(typeCode=vocab::ParticipationType::CST)->size() = 1)";

  /**
   * The cached OCL invariant for the '{@link #validateAAAAAComponent2StructuredBodyComponent3Section(AAAAA, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AAAAA Component2 Structured Body Component3 Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAAAAAComponent2StructuredBodyComponent3Section(AAAAA, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Query<?, ?, ?> VALIDATE_AAAAA_COMPONENT2_STRUCTURED_BODY_COMPONENT3_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param aaaaa The receiving '<em><b>AAAAA</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public static  boolean validateAAAAAComponent2StructuredBodyComponent3Section(AAAAA aaaaa, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.AAAAA);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_AAAAA_COMPONENT2_STRUCTURED_BODY_COMPONENT3_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_AAAAA_COMPONENT2_STRUCTURED_BODY_COMPONENT3_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_AAAAA_COMPONENT2_STRUCTURED_BODY_COMPONENT3_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(aaaaa);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.AAAAA__AAAAA_COMPONENT2_STRUCTURED_BODY_COMPONENT3_SECTION,
             EmspcrPlugin.INSTANCE.getString("AAAAAComponent2StructuredBodyComponent3Section"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

} // AAAAAOperations