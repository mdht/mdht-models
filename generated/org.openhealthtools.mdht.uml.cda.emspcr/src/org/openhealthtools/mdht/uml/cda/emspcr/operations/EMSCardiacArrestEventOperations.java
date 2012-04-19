/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEvent;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Cardiac Arrest Event</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEvent#validateEMSCardiacArrestEventTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEvent#validateEMSCardiacArrestEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEvent#validateEMSCardiacArrestEventTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEvent#validateEMSCardiacArrestEventCardiacArrestExistence(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Cardiac Arrest Existence</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEvent#getCardiacArrestExistence() <em>Get Cardiac Arrest Existence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSCardiacArrestEventOperations extends SectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMSCardiacArrestEventOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSCardiacArrestEventTemplateId(EMSCardiacArrestEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSCardiacArrestEventTemplateId(EMSCardiacArrestEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_CARDIAC_ARREST_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.14')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSCardiacArrestEventTemplateId(EMSCardiacArrestEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSCardiacArrestEventTemplateId(EMSCardiacArrestEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_CARDIAC_ARREST_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.14')
   * @param emsCardiacArrestEvent The receiving '<em><b>EMS Cardiac Arrest Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSCardiacArrestEventTemplateId(EMSCardiacArrestEvent emsCardiacArrestEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_EMS_CARDIAC_ARREST_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_CARDIAC_ARREST_EVENT);
      try
      {
        VALIDATE_EMS_CARDIAC_ARREST_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_CARDIAC_ARREST_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_CARDIAC_ARREST_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsCardiacArrestEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_CARDIAC_ARREST_EVENT__EMS_CARDIAC_ARREST_EVENT_TEMPLATE_ID,
             EmspcrPlugin.INSTANCE.getString("EMSCardiacArrestEventTemplateId"),
             new Object [] { emsCardiacArrestEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSCardiacArrestEventCode(EMSCardiacArrestEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSCardiacArrestEventCode(EMSCardiacArrestEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_CARDIAC_ARREST_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67799-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSCardiacArrestEventCode(EMSCardiacArrestEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSCardiacArrestEventCode(EMSCardiacArrestEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_CARDIAC_ARREST_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67799-7' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param emsCardiacArrestEvent The receiving '<em><b>EMS Cardiac Arrest Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSCardiacArrestEventCode(EMSCardiacArrestEvent emsCardiacArrestEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_EMS_CARDIAC_ARREST_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_CARDIAC_ARREST_EVENT);
      try
      {
        VALIDATE_EMS_CARDIAC_ARREST_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_CARDIAC_ARREST_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_CARDIAC_ARREST_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsCardiacArrestEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_CARDIAC_ARREST_EVENT__EMS_CARDIAC_ARREST_EVENT_CODE,
             EmspcrPlugin.INSTANCE.getString("EMSCardiacArrestEventCode"),
             new Object [] { emsCardiacArrestEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSCardiacArrestEventTitle(EMSCardiacArrestEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Title</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSCardiacArrestEventTitle(EMSCardiacArrestEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_CARDIAC_ARREST_EVENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Cardiac Arrest Event')";

  /**
   * The cached OCL invariant for the '{@link #validateEMSCardiacArrestEventTitle(EMSCardiacArrestEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSCardiacArrestEventTitle(EMSCardiacArrestEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_CARDIAC_ARREST_EVENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Cardiac Arrest Event')
   * @param emsCardiacArrestEvent The receiving '<em><b>EMS Cardiac Arrest Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSCardiacArrestEventTitle(EMSCardiacArrestEvent emsCardiacArrestEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_EMS_CARDIAC_ARREST_EVENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_CARDIAC_ARREST_EVENT);
      try
      {
        VALIDATE_EMS_CARDIAC_ARREST_EVENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_CARDIAC_ARREST_EVENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_CARDIAC_ARREST_EVENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsCardiacArrestEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_CARDIAC_ARREST_EVENT__EMS_CARDIAC_ARREST_EVENT_TITLE,
             EmspcrPlugin.INSTANCE.getString("EMSCardiacArrestEventTitle"),
             new Object [] { emsCardiacArrestEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateEMSCardiacArrestEventCardiacArrestExistence(EMSCardiacArrestEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Cardiac Arrest Existence</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSCardiacArrestEventCardiacArrestExistence(EMSCardiacArrestEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_EMS_CARDIAC_ARREST_EVENT_CARDIAC_ARREST_EXISTENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(cda::Observation))";

  /**
   * The cached OCL invariant for the '{@link #validateEMSCardiacArrestEventCardiacArrestExistence(EMSCardiacArrestEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Cardiac Arrest Existence</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateEMSCardiacArrestEventCardiacArrestExistence(EMSCardiacArrestEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_EMS_CARDIAC_ARREST_EVENT_CARDIAC_ARREST_EXISTENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(cda::Observation))
   * @param emsCardiacArrestEvent The receiving '<em><b>EMS Cardiac Arrest Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateEMSCardiacArrestEventCardiacArrestExistence(EMSCardiacArrestEvent emsCardiacArrestEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_EMS_CARDIAC_ARREST_EVENT_CARDIAC_ARREST_EXISTENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(EmspcrPackage.Literals.EMS_CARDIAC_ARREST_EVENT);
      try
      {
        VALIDATE_EMS_CARDIAC_ARREST_EVENT_CARDIAC_ARREST_EXISTENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_CARDIAC_ARREST_EVENT_CARDIAC_ARREST_EXISTENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_EMS_CARDIAC_ARREST_EVENT_CARDIAC_ARREST_EXISTENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emsCardiacArrestEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             EmspcrValidator.DIAGNOSTIC_SOURCE,
             EmspcrValidator.EMS_CARDIAC_ARREST_EVENT__EMS_CARDIAC_ARREST_EVENT_CARDIAC_ARREST_EXISTENCE,
             EmspcrPlugin.INSTANCE.getString("EMSCardiacArrestEventCardiacArrestExistence"),
             new Object [] { emsCardiacArrestEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getCardiacArrestExistence(EMSCardiacArrestEvent) <em>Get Cardiac Arrest Existence</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardiacArrestExistence(EMSCardiacArrestEvent)
   * @generated
   * @ordered
   */
  protected static final String GET_CARDIAC_ARREST_EXISTENCE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)";

  /**
   * The cached OCL query for the '{@link #getCardiacArrestExistence(EMSCardiacArrestEvent) <em>Get Cardiac Arrest Existence</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardiacArrestExistence(EMSCardiacArrestEvent)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_CARDIAC_ARREST_EXISTENCE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)
   * @param emsCardiacArrestEvent The receiving '<em><b>EMS Cardiac Arrest Event</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  Observation getCardiacArrestExistence(EMSCardiacArrestEvent emsCardiacArrestEvent)
  {
    if (GET_CARDIAC_ARREST_EXISTENCE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.EMS_CARDIAC_ARREST_EVENT, EmspcrPackage.Literals.EMS_CARDIAC_ARREST_EVENT.getEAllOperations().get(59));
      try
      {
        GET_CARDIAC_ARREST_EXISTENCE__EOCL_QRY = helper.createQuery(GET_CARDIAC_ARREST_EXISTENCE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_CARDIAC_ARREST_EXISTENCE__EOCL_QRY);
    return (Observation) query.evaluate(emsCardiacArrestEvent);
  }

} // EMSCardiacArrestEventOperations