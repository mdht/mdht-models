/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.operations.ResultOrganizerOperations;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOrganizer;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.util.HPOCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hearing Screening Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOrganizer#validateResultOrganizerCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOrganizer#validateHearingScreeningOrganizerComponentLeftEar(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Organizer Component Left Ear</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOrganizer#validateHearingScreeningOrganizerComponentRightEar(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Organizer Component Right Ear</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOrganizer#validateHearingScreeningOrganizerComponentResultsOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Organizer Component Results Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOrganizer#validateResultOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOrganizer#validateResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HearingScreeningOrganizerOperations extends ResultOrganizerOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HearingScreeningOrganizerOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateResultOrganizerCodeP(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateResultOrganizerCodeP(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_RESULT_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateResultOrganizerCodeP(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateResultOrganizerCodeP(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_RESULT_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingScreeningOrganizer The receiving '<em><b>Hearing Screening Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateResultOrganizerCodeP(HearingScreeningOrganizer hearingScreeningOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_RESULT_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_ORGANIZER);
      try
      {
        VALIDATE_RESULT_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingScreeningOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_SCREENING_ORGANIZER__RESULT_ORGANIZER_CODE_P,
             HPOCPlugin.INSTANCE.getString("ResultOrganizerCodeP"),
             new Object [] { hearingScreeningOrganizer }));
      }
      
      if (context != null) {
        // generate a pass token for my dependent constraints to short-circuit or filter results
        @SuppressWarnings("unchecked")
        Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ResultOrganizerCodeP");
        if (passToken == null) {
          // anticipate a reasonably healthy model
          passToken = new java.util.ArrayList<Object>(3);
          context.put("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ResultOrganizerCodeP", passToken);
        }
        passToken.add(hearingScreeningOrganizer);
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingScreeningOrganizerComponentLeftEar(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Organizer Component Left Ear</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingScreeningOrganizerComponentLeftEar(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_SCREENING_ORGANIZER_COMPONENT_LEFT_EAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingScreeningOrganizerComponentLeftEar(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Organizer Component Left Ear</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingScreeningOrganizerComponentLeftEar(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_SCREENING_ORGANIZER_COMPONENT_LEFT_EAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingScreeningOrganizer The receiving '<em><b>Hearing Screening Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingScreeningOrganizerComponentLeftEar(HearingScreeningOrganizer hearingScreeningOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_SCREENING_ORGANIZER_COMPONENT_LEFT_EAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_ORGANIZER);
      try
      {
        VALIDATE_HEARING_SCREENING_ORGANIZER_COMPONENT_LEFT_EAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_SCREENING_ORGANIZER_COMPONENT_LEFT_EAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_SCREENING_ORGANIZER_COMPONENT_LEFT_EAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingScreeningOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_SCREENING_ORGANIZER__HEARING_SCREENING_ORGANIZER_COMPONENT_LEFT_EAR,
             HPOCPlugin.INSTANCE.getString("HearingScreeningOrganizerComponentLeftEar"),
             new Object [] { hearingScreeningOrganizer }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingScreeningOrganizerComponentRightEar(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Organizer Component Right Ear</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingScreeningOrganizerComponentRightEar(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_SCREENING_ORGANIZER_COMPONENT_RIGHT_EAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingScreeningOrganizerComponentRightEar(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Organizer Component Right Ear</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingScreeningOrganizerComponentRightEar(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_SCREENING_ORGANIZER_COMPONENT_RIGHT_EAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingScreeningOrganizer The receiving '<em><b>Hearing Screening Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingScreeningOrganizerComponentRightEar(HearingScreeningOrganizer hearingScreeningOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_SCREENING_ORGANIZER_COMPONENT_RIGHT_EAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_ORGANIZER);
      try
      {
        VALIDATE_HEARING_SCREENING_ORGANIZER_COMPONENT_RIGHT_EAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_SCREENING_ORGANIZER_COMPONENT_RIGHT_EAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_SCREENING_ORGANIZER_COMPONENT_RIGHT_EAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingScreeningOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_SCREENING_ORGANIZER__HEARING_SCREENING_ORGANIZER_COMPONENT_RIGHT_EAR,
             HPOCPlugin.INSTANCE.getString("HearingScreeningOrganizerComponentRightEar"),
             new Object [] { hearingScreeningOrganizer }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHearingScreeningOrganizerComponentResultsOrganizer(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Organizer Component Results Organizer</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingScreeningOrganizerComponentResultsOrganizer(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HEARING_SCREENING_ORGANIZER_COMPONENT_RESULTS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

  /**
   * The cached OCL invariant for the '{@link #validateHearingScreeningOrganizerComponentResultsOrganizer(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Screening Organizer Component Results Organizer</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHearingScreeningOrganizerComponentResultsOrganizer(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HEARING_SCREENING_ORGANIZER_COMPONENT_RESULTS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingScreeningOrganizer The receiving '<em><b>Hearing Screening Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHearingScreeningOrganizerComponentResultsOrganizer(HearingScreeningOrganizer hearingScreeningOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HEARING_SCREENING_ORGANIZER_COMPONENT_RESULTS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_ORGANIZER);
      try
      {
        VALIDATE_HEARING_SCREENING_ORGANIZER_COMPONENT_RESULTS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEARING_SCREENING_ORGANIZER_COMPONENT_RESULTS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HEARING_SCREENING_ORGANIZER_COMPONENT_RESULTS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingScreeningOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_SCREENING_ORGANIZER__HEARING_SCREENING_ORGANIZER_COMPONENT_RESULTS_ORGANIZER,
             HPOCPlugin.INSTANCE.getString("HearingScreeningOrganizerComponentResultsOrganizer"),
             new Object [] { hearingScreeningOrganizer }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateResultOrganizerTemplateId(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateResultOrganizerTemplateId(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.8')";

  /**
   * The cached OCL invariant for the '{@link #validateResultOrganizerTemplateId(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateResultOrganizerTemplateId(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingScreeningOrganizer The receiving '<em><b>Hearing Screening Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateResultOrganizerTemplateId(HearingScreeningOrganizer hearingScreeningOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_ORGANIZER);
      try
      {
        VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingScreeningOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_SCREENING_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID,
             HPOCPlugin.INSTANCE.getString("ResultOrganizerTemplateId"),
             new Object [] { hearingScreeningOrganizer }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateResultOrganizerClassCode(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateResultOrganizerClassCode(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_RESULT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

  /**
   * The cached OCL invariant for the '{@link #validateResultOrganizerClassCode(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateResultOrganizerClassCode(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_RESULT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingScreeningOrganizer The receiving '<em><b>Hearing Screening Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateResultOrganizerClassCode(HearingScreeningOrganizer hearingScreeningOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_RESULT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_ORGANIZER);
      try
      {
        VALIDATE_RESULT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingScreeningOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_SCREENING_ORGANIZER__RESULT_ORGANIZER_CLASS_CODE,
             HPOCPlugin.INSTANCE.getString("ResultOrganizerClassCode"),
             new Object [] { hearingScreeningOrganizer }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateResultOrganizerCode(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateResultOrganizerCode(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '54111-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateResultOrganizerCode(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateResultOrganizerCode(HearingScreeningOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param hearingScreeningOrganizer The receiving '<em><b>Hearing Screening Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateResultOrganizerCode(HearingScreeningOrganizer hearingScreeningOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ResultOrganizerCodeP");
    if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(hearingScreeningOrganizer)) {
      // I have a free pass to short-circuit
      return true;
    }
  	  
    if (VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HPOCPackage.Literals.HEARING_SCREENING_ORGANIZER);
      try
      {
        VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hearingScreeningOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HPOCValidator.DIAGNOSTIC_SOURCE,
             HPOCValidator.HEARING_SCREENING_ORGANIZER__RESULT_ORGANIZER_CODE,
             HPOCPlugin.INSTANCE.getString("ResultOrganizerCode"),
             new Object [] { hearingScreeningOrganizer }));
      }
       
      return false;
    }
    return true;
  }

} // HearingScreeningOrganizerOperations