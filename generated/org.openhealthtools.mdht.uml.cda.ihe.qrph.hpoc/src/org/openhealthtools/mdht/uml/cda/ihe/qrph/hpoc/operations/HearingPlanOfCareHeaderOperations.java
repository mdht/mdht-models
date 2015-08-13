/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;


import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareHeader;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.util.HPOCValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hearing Plan Of Care Header</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareHeader#validateHearingPlanOfCareHeaderTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Header Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareHeader#validateHearingPlanOfCareHeaderRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Header Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareHeader#validateHearingPlanOfCareHeaderCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Header Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareHeader#validateHearingPlanOfCareHeaderComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Header Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareHeader#validateHearingPlanOfCareHeaderDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Header Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareHeader#validateHearingPlanOfCareHeaderAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Header Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HearingPlanOfCareHeaderOperations extends ClinicalDocumentOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected HearingPlanOfCareHeaderOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareHeaderTemplateId(HearingPlanOfCareHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Header Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareHeaderTemplateId(HearingPlanOfCareHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.26.2.2.1')";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareHeaderTemplateId(HearingPlanOfCareHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Header Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareHeaderTemplateId(HearingPlanOfCareHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareHeader The receiving '<em><b>Hearing Plan Of Care Header</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareHeaderTemplateId(HearingPlanOfCareHeader hearingPlanOfCareHeader, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_HEADER);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareHeader))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_HEADER__HEARING_PLAN_OF_CARE_HEADER_TEMPLATE_ID,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareHeaderTemplateId"),
             new Object [] { hearingPlanOfCareHeader }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareHeaderRecordTarget(HearingPlanOfCareHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Header Record Target</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareHeaderRecordTarget(HearingPlanOfCareHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_HEADER_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareHeaderRecordTarget(HearingPlanOfCareHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Header Record Target</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareHeaderRecordTarget(HearingPlanOfCareHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_HEADER_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareHeader The receiving '<em><b>Hearing Plan Of Care Header</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareHeaderRecordTarget(HearingPlanOfCareHeader hearingPlanOfCareHeader, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_HEADER_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_HEADER);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_HEADER_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_HEADER_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_HEADER_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareHeader))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_HEADER__HEARING_PLAN_OF_CARE_HEADER_RECORD_TARGET,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareHeaderRecordTarget"),
             new Object [] { hearingPlanOfCareHeader }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareHeaderCustodian(HearingPlanOfCareHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Header Custodian</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareHeaderCustodian(HearingPlanOfCareHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_HEADER_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareHeaderCustodian(HearingPlanOfCareHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Header Custodian</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareHeaderCustodian(HearingPlanOfCareHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_HEADER_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareHeader The receiving '<em><b>Hearing Plan Of Care Header</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareHeaderCustodian(HearingPlanOfCareHeader hearingPlanOfCareHeader, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_HEADER_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_HEADER);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_HEADER_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_HEADER_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_HEADER_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareHeader))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_HEADER__HEARING_PLAN_OF_CARE_HEADER_CUSTODIAN,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareHeaderCustodian"),
             new Object [] { hearingPlanOfCareHeader }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareHeaderComponentOf(HearingPlanOfCareHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Header Component Of</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareHeaderComponentOf(HearingPlanOfCareHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_HEADER_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareHeaderComponentOf(HearingPlanOfCareHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Header Component Of</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareHeaderComponentOf(HearingPlanOfCareHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_HEADER_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareHeader The receiving '<em><b>Hearing Plan Of Care Header</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareHeaderComponentOf(HearingPlanOfCareHeader hearingPlanOfCareHeader, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_HEADER_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_HEADER);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_HEADER_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_HEADER_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_HEADER_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareHeader))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_HEADER__HEARING_PLAN_OF_CARE_HEADER_COMPONENT_OF,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareHeaderComponentOf"),
             new Object [] { hearingPlanOfCareHeader }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareHeaderDocumentationOf(HearingPlanOfCareHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Header Documentation Of</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareHeaderDocumentationOf(HearingPlanOfCareHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_HEADER_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareHeaderDocumentationOf(HearingPlanOfCareHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Header Documentation Of</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareHeaderDocumentationOf(HearingPlanOfCareHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_HEADER_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareHeader The receiving '<em><b>Hearing Plan Of Care Header</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareHeaderDocumentationOf(HearingPlanOfCareHeader hearingPlanOfCareHeader, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_HEADER_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_HEADER);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_HEADER_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_HEADER_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_HEADER_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareHeader))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_HEADER__HEARING_PLAN_OF_CARE_HEADER_DOCUMENTATION_OF,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareHeaderDocumentationOf"),
             new Object [] { hearingPlanOfCareHeader }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingPlanOfCareHeaderAuthor(HearingPlanOfCareHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Header Author</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareHeaderAuthor(HearingPlanOfCareHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_HEADER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingPlanOfCareHeaderAuthor(HearingPlanOfCareHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Header Author</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingPlanOfCareHeaderAuthor(HearingPlanOfCareHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_PLAN_OF_CARE_HEADER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingPlanOfCareHeader The receiving '<em><b>Hearing Plan Of Care Header</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingPlanOfCareHeaderAuthor(HearingPlanOfCareHeader hearingPlanOfCareHeader, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_PLAN_OF_CARE_HEADER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_HEADER);
      try
      {
        VALIDATE_HEARING_PLAN_OF_CARE_HEADER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_HEADER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_PLAN_OF_CARE_HEADER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingPlanOfCareHeader))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_PLAN_OF_CARE_HEADER__HEARING_PLAN_OF_CARE_HEADER_AUTHOR,
             HPOCPlugin.INSTANCE.getString("HearingPlanOfCareHeaderAuthor"),
             new Object [] { hearingPlanOfCareHeader }));
      }
       
      return false;
    }
    return true;
  }

} // HearingPlanOfCareHeaderOperations