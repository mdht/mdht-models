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

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.AttemptedForcepsDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.AttemptedVacuumExtraction;
import org.openhealthtools.mdht.uml.cda.vsbr.BodyWeightatDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicsofLaborandDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.FetalPresentation;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborOnsets;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation;
import org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidities;
import org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedures;
import org.openhealthtools.mdht.uml.cda.vsbr.RouteandMethodofDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Laborand Delivery Information</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationAttendantParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Attendant Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationHomeBirthPlanAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Home Birth Plan Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationTransferAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Transfer Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationMaternalMorbidities(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Maternal Morbidities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Characteristicsof Laborand Delivery</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationLaborOnsets(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Labor Onsets</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationObstetricProcedures(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Obstetric Procedures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationAttemptedForcepsDelivery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Attempted Forceps Delivery</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationAttemptedVacuumExtraction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Attempted Vacuum Extraction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationFetalPresentation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Fetal Presentation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationRouteandMethodofDelivery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Routeand Methodof Delivery</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationBodyWeightatDelivery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Body Weightat Delivery</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationHysterotomyHysterectomyAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Hysterotomy Hysterectomy Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getMaternalMorbiditiess() <em>Get Maternal Morbiditiess</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getCharacteristicsofLaborandDeliveries() <em>Get Characteristicsof Laborand Deliveries</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getLaborOnsetss() <em>Get Labor Onsetss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getObstetricProceduress() <em>Get Obstetric Proceduress</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getAttemptedForcepsDelivery() <em>Get Attempted Forceps Delivery</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getAttemptedVacuumExtraction() <em>Get Attempted Vacuum Extraction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getFetalPresentation() <em>Get Fetal Presentation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getRouteandMethodofDelivery() <em>Get Routeand Methodof Delivery</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getBodyWeightatDelivery() <em>Get Body Weightat Delivery</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LaborandDeliveryInformationOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LaborandDeliveryInformationOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationTemplateId(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationTemplateId(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.22')";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationTemplateId(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationTemplateId(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.22')
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliveryInformationTemplateId(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationClassCode(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationClassCode(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationClassCode(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationClassCode(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliveryInformationClassCode(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationCode(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationCode(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationCode(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationCode(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliveryInformationCode(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationMoodCode(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationMoodCode(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationMoodCode(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationMoodCode(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_DocumentActMood::EVN
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliveryInformationMoodCode(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationParticipant(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Participant</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationParticipant(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationParticipant(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Participant</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationParticipant(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliveryInformationParticipant(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_PARTICIPANT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationParticipant", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationPerformer(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Performer</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationPerformer(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(vsbr::Labor and Delivery Information::attendantParticipation))";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationPerformer(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Performer</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationPerformer(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(vsbr::Labor and Delivery Information::attendantParticipation))
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliveryInformationPerformer(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_PERFORMER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationPerformer", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationAttendantParticipation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Attendant Participation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationAttendantParticipation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTENDANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationAttendantParticipation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Attendant Participation</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationAttendantParticipation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTENDANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliveryInformationAttendantParticipation(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTENDANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTENDANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTENDANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTENDANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_ATTENDANT_PARTICIPATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationAttendantParticipation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationHomeBirthPlanAssociation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Home Birth Plan Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationHomeBirthPlanAssociation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_HOME_BIRTH_PLAN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationHomeBirthPlanAssociation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Home Birth Plan Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationHomeBirthPlanAssociation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_HOME_BIRTH_PLAN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliveryInformationHomeBirthPlanAssociation(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_HOME_BIRTH_PLAN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_HOME_BIRTH_PLAN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_HOME_BIRTH_PLAN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_HOME_BIRTH_PLAN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_HOME_BIRTH_PLAN_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationHomeBirthPlanAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationTransferAssociation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Transfer Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationTransferAssociation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_TRANSFER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationTransferAssociation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Transfer Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationTransferAssociation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_TRANSFER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliveryInformationTransferAssociation(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_TRANSFER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_TRANSFER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_TRANSFER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_TRANSFER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_TRANSFER_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationTransferAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationEntryRelationship(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Entry Relationship</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationEntryRelationship(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationEntryRelationship(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Entry Relationship</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationEntryRelationship(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliveryInformationEntryRelationship(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_ENTRY_RELATIONSHIP,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationEntryRelationship", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationMaternalMorbidities(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Maternal Morbidities</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationMaternalMorbidities(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_MATERNAL_MORBIDITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Maternal Morbidities) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationMaternalMorbidities(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Maternal Morbidities</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationMaternalMorbidities(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_MATERNAL_MORBIDITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Maternal Morbidities) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliveryInformationMaternalMorbidities(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_MATERNAL_MORBIDITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_MATERNAL_MORBIDITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_MATERNAL_MORBIDITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_MATERNAL_MORBIDITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_MATERNAL_MORBIDITIES,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationMaternalMorbidities", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Characteristicsof Laborand Delivery</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_CHARACTERISTICSOF_LABORAND_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Characteristics of Labor and Delivery) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Characteristicsof Laborand Delivery</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_CHARACTERISTICSOF_LABORAND_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Characteristics of Labor and Delivery) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_CHARACTERISTICSOF_LABORAND_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_CHARACTERISTICSOF_LABORAND_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_CHARACTERISTICSOF_LABORAND_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_CHARACTERISTICSOF_LABORAND_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_CHARACTERISTICSOF_LABORAND_DELIVERY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationCharacteristicsofLaborandDelivery", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationLaborOnsets(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Labor Onsets</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationLaborOnsets(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_LABOR_ONSETS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Labor Onsets) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationLaborOnsets(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Labor Onsets</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationLaborOnsets(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_LABOR_ONSETS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Labor Onsets) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliveryInformationLaborOnsets(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_LABOR_ONSETS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_LABOR_ONSETS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_LABOR_ONSETS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_LABOR_ONSETS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_LABOR_ONSETS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationLaborOnsets", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationObstetricProcedures(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Obstetric Procedures</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationObstetricProcedures(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_OBSTETRIC_PROCEDURES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Obstetric Procedures) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationObstetricProcedures(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Obstetric Procedures</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationObstetricProcedures(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_OBSTETRIC_PROCEDURES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Obstetric Procedures) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliveryInformationObstetricProcedures(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_OBSTETRIC_PROCEDURES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_OBSTETRIC_PROCEDURES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_OBSTETRIC_PROCEDURES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_OBSTETRIC_PROCEDURES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_OBSTETRIC_PROCEDURES,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationObstetricProcedures", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationAttemptedForcepsDelivery(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Attempted Forceps Delivery</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationAttemptedForcepsDelivery(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTEMPTED_FORCEPS_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Attempted Forceps Delivery) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationAttemptedForcepsDelivery(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Attempted Forceps Delivery</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationAttemptedForcepsDelivery(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTEMPTED_FORCEPS_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Attempted Forceps Delivery) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliveryInformationAttemptedForcepsDelivery(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTEMPTED_FORCEPS_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTEMPTED_FORCEPS_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTEMPTED_FORCEPS_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTEMPTED_FORCEPS_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_ATTEMPTED_FORCEPS_DELIVERY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationAttemptedForcepsDelivery", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationAttemptedVacuumExtraction(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Attempted Vacuum Extraction</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationAttemptedVacuumExtraction(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTEMPTED_VACUUM_EXTRACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Attempted Vacuum Extraction) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationAttemptedVacuumExtraction(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Attempted Vacuum Extraction</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationAttemptedVacuumExtraction(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTEMPTED_VACUUM_EXTRACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Attempted Vacuum Extraction) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliveryInformationAttemptedVacuumExtraction(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTEMPTED_VACUUM_EXTRACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTEMPTED_VACUUM_EXTRACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTEMPTED_VACUUM_EXTRACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTEMPTED_VACUUM_EXTRACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_ATTEMPTED_VACUUM_EXTRACTION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationAttemptedVacuumExtraction", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationFetalPresentation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Fetal Presentation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationFetalPresentation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_FETAL_PRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Fetal Presentation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationFetalPresentation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Fetal Presentation</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationFetalPresentation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_FETAL_PRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Fetal Presentation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliveryInformationFetalPresentation(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_FETAL_PRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_FETAL_PRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_FETAL_PRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_FETAL_PRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_FETAL_PRESENTATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationFetalPresentation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationRouteandMethodofDelivery(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Routeand Methodof Delivery</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationRouteandMethodofDelivery(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_ROUTEAND_METHODOF_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Route and Method of Delivery) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationRouteandMethodofDelivery(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Routeand Methodof Delivery</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationRouteandMethodofDelivery(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_ROUTEAND_METHODOF_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Route and Method of Delivery) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliveryInformationRouteandMethodofDelivery(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_ROUTEAND_METHODOF_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_ROUTEAND_METHODOF_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_ROUTEAND_METHODOF_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_ROUTEAND_METHODOF_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_ROUTEAND_METHODOF_DELIVERY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationRouteandMethodofDelivery", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationBodyWeightatDelivery(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Body Weightat Delivery</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationBodyWeightatDelivery(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_BODY_WEIGHTAT_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Body Weight at Delivery) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationBodyWeightatDelivery(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Body Weightat Delivery</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationBodyWeightatDelivery(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_BODY_WEIGHTAT_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Body Weight at Delivery) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliveryInformationBodyWeightatDelivery(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_BODY_WEIGHTAT_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_BODY_WEIGHTAT_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_BODY_WEIGHTAT_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_BODY_WEIGHTAT_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_BODY_WEIGHTAT_DELIVERY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationBodyWeightatDelivery", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationHysterotomyHysterectomyAssociation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Hysterotomy Hysterectomy Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationHysterotomyHysterectomyAssociation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_HYSTEROTOMY_HYSTERECTOMY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationHysterotomyHysterectomyAssociation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Hysterotomy Hysterectomy Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationHysterotomyHysterectomyAssociation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_HYSTEROTOMY_HYSTERECTOMY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborandDeliveryInformationHysterotomyHysterectomyAssociation(LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_HYSTEROTOMY_HYSTERECTOMY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_HYSTEROTOMY_HYSTERECTOMY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_HYSTEROTOMY_HYSTERECTOMY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_HYSTEROTOMY_HYSTERECTOMY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_HYSTEROTOMY_HYSTERECTOMY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationHysterotomyHysterectomyAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getMaternalMorbiditiess(LaborandDeliveryInformation) <em>Get Maternal Morbiditiess</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaternalMorbiditiess(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
  protected static final String GET_MATERNAL_MORBIDITIESS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Maternal Morbidities)).oclAsType(vsbr::Maternal Morbidities)";

  /**
   * The cached OCL query for the '{@link #getMaternalMorbiditiess(LaborandDeliveryInformation) <em>Get Maternal Morbiditiess</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaternalMorbiditiess(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_MATERNAL_MORBIDITIESS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Maternal Morbidities)).oclAsType(vsbr::Maternal Morbidities)
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<MaternalMorbidities> getMaternalMorbiditiess(LaborandDeliveryInformation laborandDeliveryInformation)
  {
    if (GET_MATERNAL_MORBIDITIESS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION, VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION.getEAllOperations().get(71));
      try
      {
        GET_MATERNAL_MORBIDITIESS__EOCL_QRY = helper.createQuery(GET_MATERNAL_MORBIDITIESS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MATERNAL_MORBIDITIESS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<MaternalMorbidities> result = (Collection<MaternalMorbidities>) query.evaluate(laborandDeliveryInformation);
    return new BasicEList.UnmodifiableEList<MaternalMorbidities>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getCharacteristicsofLaborandDeliveries(LaborandDeliveryInformation) <em>Get Characteristicsof Laborand Deliveries</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacteristicsofLaborandDeliveries(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
  protected static final String GET_CHARACTERISTICSOF_LABORAND_DELIVERIES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Characteristics of Labor and Delivery)).oclAsType(vsbr::Characteristics of Labor and Delivery)";

  /**
   * The cached OCL query for the '{@link #getCharacteristicsofLaborandDeliveries(LaborandDeliveryInformation) <em>Get Characteristicsof Laborand Deliveries</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacteristicsofLaborandDeliveries(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_CHARACTERISTICSOF_LABORAND_DELIVERIES__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Characteristics of Labor and Delivery)).oclAsType(vsbr::Characteristics of Labor and Delivery)
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<CharacteristicsofLaborandDelivery> getCharacteristicsofLaborandDeliveries(LaborandDeliveryInformation laborandDeliveryInformation)
  {
    if (GET_CHARACTERISTICSOF_LABORAND_DELIVERIES__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION, VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION.getEAllOperations().get(72));
      try
      {
        GET_CHARACTERISTICSOF_LABORAND_DELIVERIES__EOCL_QRY = helper.createQuery(GET_CHARACTERISTICSOF_LABORAND_DELIVERIES__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_CHARACTERISTICSOF_LABORAND_DELIVERIES__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<CharacteristicsofLaborandDelivery> result = (Collection<CharacteristicsofLaborandDelivery>) query.evaluate(laborandDeliveryInformation);
    return new BasicEList.UnmodifiableEList<CharacteristicsofLaborandDelivery>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getLaborOnsetss(LaborandDeliveryInformation) <em>Get Labor Onsetss</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLaborOnsetss(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
  protected static final String GET_LABOR_ONSETSS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Labor Onsets)).oclAsType(vsbr::Labor Onsets)";

  /**
   * The cached OCL query for the '{@link #getLaborOnsetss(LaborandDeliveryInformation) <em>Get Labor Onsetss</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLaborOnsetss(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_LABOR_ONSETSS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Labor Onsets)).oclAsType(vsbr::Labor Onsets)
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<LaborOnsets> getLaborOnsetss(LaborandDeliveryInformation laborandDeliveryInformation)
  {
    if (GET_LABOR_ONSETSS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION, VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION.getEAllOperations().get(73));
      try
      {
        GET_LABOR_ONSETSS__EOCL_QRY = helper.createQuery(GET_LABOR_ONSETSS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_LABOR_ONSETSS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<LaborOnsets> result = (Collection<LaborOnsets>) query.evaluate(laborandDeliveryInformation);
    return new BasicEList.UnmodifiableEList<LaborOnsets>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getObstetricProceduress(LaborandDeliveryInformation) <em>Get Obstetric Proceduress</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObstetricProceduress(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
  protected static final String GET_OBSTETRIC_PROCEDURESS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Obstetric Procedures)).oclAsType(vsbr::Obstetric Procedures)";

  /**
   * The cached OCL query for the '{@link #getObstetricProceduress(LaborandDeliveryInformation) <em>Get Obstetric Proceduress</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObstetricProceduress(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_OBSTETRIC_PROCEDURESS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Obstetric Procedures)).oclAsType(vsbr::Obstetric Procedures)
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<ObstetricProcedures> getObstetricProceduress(LaborandDeliveryInformation laborandDeliveryInformation)
  {
    if (GET_OBSTETRIC_PROCEDURESS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION, VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION.getEAllOperations().get(74));
      try
      {
        GET_OBSTETRIC_PROCEDURESS__EOCL_QRY = helper.createQuery(GET_OBSTETRIC_PROCEDURESS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_OBSTETRIC_PROCEDURESS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<ObstetricProcedures> result = (Collection<ObstetricProcedures>) query.evaluate(laborandDeliveryInformation);
    return new BasicEList.UnmodifiableEList<ObstetricProcedures>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getAttemptedForcepsDelivery(LaborandDeliveryInformation) <em>Get Attempted Forceps Delivery</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttemptedForcepsDelivery(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
  protected static final String GET_ATTEMPTED_FORCEPS_DELIVERY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Attempted Forceps Delivery))->asSequence()->any(true).oclAsType(vsbr::Attempted Forceps Delivery)";

  /**
   * The cached OCL query for the '{@link #getAttemptedForcepsDelivery(LaborandDeliveryInformation) <em>Get Attempted Forceps Delivery</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttemptedForcepsDelivery(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ATTEMPTED_FORCEPS_DELIVERY__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Attempted Forceps Delivery))->asSequence()->any(true).oclAsType(vsbr::Attempted Forceps Delivery)
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  AttemptedForcepsDelivery getAttemptedForcepsDelivery(LaborandDeliveryInformation laborandDeliveryInformation)
  {
    if (GET_ATTEMPTED_FORCEPS_DELIVERY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION, VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION.getEAllOperations().get(75));
      try
      {
        GET_ATTEMPTED_FORCEPS_DELIVERY__EOCL_QRY = helper.createQuery(GET_ATTEMPTED_FORCEPS_DELIVERY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ATTEMPTED_FORCEPS_DELIVERY__EOCL_QRY);
    return (AttemptedForcepsDelivery) query.evaluate(laborandDeliveryInformation);
  }

  /**
   * The cached OCL expression body for the '{@link #getAttemptedVacuumExtraction(LaborandDeliveryInformation) <em>Get Attempted Vacuum Extraction</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttemptedVacuumExtraction(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
  protected static final String GET_ATTEMPTED_VACUUM_EXTRACTION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Attempted Vacuum Extraction))->asSequence()->any(true).oclAsType(vsbr::Attempted Vacuum Extraction)";

  /**
   * The cached OCL query for the '{@link #getAttemptedVacuumExtraction(LaborandDeliveryInformation) <em>Get Attempted Vacuum Extraction</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttemptedVacuumExtraction(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ATTEMPTED_VACUUM_EXTRACTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Attempted Vacuum Extraction))->asSequence()->any(true).oclAsType(vsbr::Attempted Vacuum Extraction)
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  AttemptedVacuumExtraction getAttemptedVacuumExtraction(LaborandDeliveryInformation laborandDeliveryInformation)
  {
    if (GET_ATTEMPTED_VACUUM_EXTRACTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION, VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION.getEAllOperations().get(76));
      try
      {
        GET_ATTEMPTED_VACUUM_EXTRACTION__EOCL_QRY = helper.createQuery(GET_ATTEMPTED_VACUUM_EXTRACTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ATTEMPTED_VACUUM_EXTRACTION__EOCL_QRY);
    return (AttemptedVacuumExtraction) query.evaluate(laborandDeliveryInformation);
  }

  /**
   * The cached OCL expression body for the '{@link #getFetalPresentation(LaborandDeliveryInformation) <em>Get Fetal Presentation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFetalPresentation(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
  protected static final String GET_FETAL_PRESENTATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Fetal Presentation))->asSequence()->any(true).oclAsType(vsbr::Fetal Presentation)";

  /**
   * The cached OCL query for the '{@link #getFetalPresentation(LaborandDeliveryInformation) <em>Get Fetal Presentation</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFetalPresentation(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_FETAL_PRESENTATION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Fetal Presentation))->asSequence()->any(true).oclAsType(vsbr::Fetal Presentation)
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  FetalPresentation getFetalPresentation(LaborandDeliveryInformation laborandDeliveryInformation)
  {
    if (GET_FETAL_PRESENTATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION, VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION.getEAllOperations().get(77));
      try
      {
        GET_FETAL_PRESENTATION__EOCL_QRY = helper.createQuery(GET_FETAL_PRESENTATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_FETAL_PRESENTATION__EOCL_QRY);
    return (FetalPresentation) query.evaluate(laborandDeliveryInformation);
  }

  /**
   * The cached OCL expression body for the '{@link #getRouteandMethodofDelivery(LaborandDeliveryInformation) <em>Get Routeand Methodof Delivery</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRouteandMethodofDelivery(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
  protected static final String GET_ROUTEAND_METHODOF_DELIVERY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Route and Method of Delivery))->asSequence()->any(true).oclAsType(vsbr::Route and Method of Delivery)";

  /**
   * The cached OCL query for the '{@link #getRouteandMethodofDelivery(LaborandDeliveryInformation) <em>Get Routeand Methodof Delivery</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRouteandMethodofDelivery(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ROUTEAND_METHODOF_DELIVERY__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Route and Method of Delivery))->asSequence()->any(true).oclAsType(vsbr::Route and Method of Delivery)
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  RouteandMethodofDelivery getRouteandMethodofDelivery(LaborandDeliveryInformation laborandDeliveryInformation)
  {
    if (GET_ROUTEAND_METHODOF_DELIVERY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION, VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION.getEAllOperations().get(78));
      try
      {
        GET_ROUTEAND_METHODOF_DELIVERY__EOCL_QRY = helper.createQuery(GET_ROUTEAND_METHODOF_DELIVERY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ROUTEAND_METHODOF_DELIVERY__EOCL_QRY);
    return (RouteandMethodofDelivery) query.evaluate(laborandDeliveryInformation);
  }

  /**
   * The cached OCL expression body for the '{@link #getBodyWeightatDelivery(LaborandDeliveryInformation) <em>Get Body Weightat Delivery</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodyWeightatDelivery(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
  protected static final String GET_BODY_WEIGHTAT_DELIVERY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Body Weight at Delivery))->asSequence()->any(true).oclAsType(vsbr::Body Weight at Delivery)";

  /**
   * The cached OCL query for the '{@link #getBodyWeightatDelivery(LaborandDeliveryInformation) <em>Get Body Weightat Delivery</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodyWeightatDelivery(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_BODY_WEIGHTAT_DELIVERY__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Body Weight at Delivery))->asSequence()->any(true).oclAsType(vsbr::Body Weight at Delivery)
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  BodyWeightatDelivery getBodyWeightatDelivery(LaborandDeliveryInformation laborandDeliveryInformation)
  {
    if (GET_BODY_WEIGHTAT_DELIVERY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION, VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION.getEAllOperations().get(79));
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
    return (BodyWeightatDelivery) query.evaluate(laborandDeliveryInformation);
  }

} // LaborandDeliveryInformationOperations