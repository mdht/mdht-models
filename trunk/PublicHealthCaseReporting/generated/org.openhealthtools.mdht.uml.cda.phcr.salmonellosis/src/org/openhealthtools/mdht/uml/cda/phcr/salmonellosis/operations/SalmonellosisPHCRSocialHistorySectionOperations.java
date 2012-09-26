/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrSocialHistorySectionOperations;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.HIVStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPossibleExposureLocationAndTypeAct;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.util.SalmonellosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRSocialHistorySection#validateSalmonellosisPHCRSocialHistorySectionSalmonellosisPossibleExposureLocationAndTypeAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis PHCR Social History Section Salmonellosis Possible Exposure Location And Type Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRSocialHistorySection#validateSalmonellosisPHCRSocialHistorySectionHIVStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis PHCR Social History Section HIV Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRSocialHistorySection#getSalmonellosisPossibleExposureLocationAndTypeActs() <em>Get Salmonellosis Possible Exposure Location And Type Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRSocialHistorySection#getHIVStatusObservation() <em>Get HIV Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRSocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SalmonellosisPHCRSocialHistorySectionOperations extends PhcrSocialHistorySectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SalmonellosisPHCRSocialHistorySectionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateSalmonellosisPHCRSocialHistorySectionSalmonellosisPossibleExposureLocationAndTypeAct(SalmonellosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis PHCR Social History Section Salmonellosis Possible Exposure Location And Type Act</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisPHCRSocialHistorySectionSalmonellosisPossibleExposureLocationAndTypeAct(SalmonellosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(salmonellosis::SalmonellosisPossibleExposureLocationAndTypeAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

  /**
   * The cached OCL invariant for the '{@link #validateSalmonellosisPHCRSocialHistorySectionSalmonellosisPossibleExposureLocationAndTypeAct(SalmonellosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis PHCR Social History Section Salmonellosis Possible Exposure Location And Type Act</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisPHCRSocialHistorySectionSalmonellosisPossibleExposureLocationAndTypeAct(SalmonellosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(salmonellosis::SalmonellosisPossibleExposureLocationAndTypeAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param salmonellosisPHCRSocialHistorySection The receiving '<em><b>PHCR Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSalmonellosisPHCRSocialHistorySectionSalmonellosisPossibleExposureLocationAndTypeAct(SalmonellosisPHCRSocialHistorySection salmonellosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SalmonellosisPackage.Literals.SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(salmonellosisPHCRSocialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SalmonellosisValidator.DIAGNOSTIC_SOURCE,
             SalmonellosisValidator.SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION__SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSalmonellosisPHCRSocialHistorySectionSalmonellosisPossibleExposureLocationAndTypeAct", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(salmonellosisPHCRSocialHistorySection, context) }),
             new Object [] { salmonellosisPHCRSocialHistorySection }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSalmonellosisPHCRSocialHistorySectionHIVStatusObservation(SalmonellosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis PHCR Social History Section HIV Status Observation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisPHCRSocialHistorySectionHIVStatusObservation(SalmonellosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION_HIV_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(salmonellosis::HIVStatusObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

  /**
   * The cached OCL invariant for the '{@link #validateSalmonellosisPHCRSocialHistorySectionHIVStatusObservation(SalmonellosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis PHCR Social History Section HIV Status Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisPHCRSocialHistorySectionHIVStatusObservation(SalmonellosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION_HIV_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(salmonellosis::HIVStatusObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param salmonellosisPHCRSocialHistorySection The receiving '<em><b>PHCR Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSalmonellosisPHCRSocialHistorySectionHIVStatusObservation(SalmonellosisPHCRSocialHistorySection salmonellosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION_HIV_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SalmonellosisPackage.Literals.SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION_HIV_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION_HIV_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION_HIV_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(salmonellosisPHCRSocialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SalmonellosisValidator.DIAGNOSTIC_SOURCE,
             SalmonellosisValidator.SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION__SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION_HIV_STATUS_OBSERVATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSalmonellosisPHCRSocialHistorySectionHIVStatusObservation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(salmonellosisPHCRSocialHistorySection, context) }),
             new Object [] { salmonellosisPHCRSocialHistorySection }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getSalmonellosisPossibleExposureLocationAndTypeActs(SalmonellosisPHCRSocialHistorySection) <em>Get Salmonellosis Possible Exposure Location And Type Acts</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSalmonellosisPossibleExposureLocationAndTypeActs(SalmonellosisPHCRSocialHistorySection)
   * @generated
   * @ordered
   */
  protected static final String GET_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(salmonellosis::SalmonellosisPossibleExposureLocationAndTypeAct)).oclAsType(salmonellosis::SalmonellosisPossibleExposureLocationAndTypeAct)";

  /**
   * The cached OCL query for the '{@link #getSalmonellosisPossibleExposureLocationAndTypeActs(SalmonellosisPHCRSocialHistorySection) <em>Get Salmonellosis Possible Exposure Location And Type Acts</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSalmonellosisPossibleExposureLocationAndTypeActs(SalmonellosisPHCRSocialHistorySection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(salmonellosis::SalmonellosisPossibleExposureLocationAndTypeAct)).oclAsType(salmonellosis::SalmonellosisPossibleExposureLocationAndTypeAct)
   * @param salmonellosisPHCRSocialHistorySection The receiving '<em><b>PHCR Social History Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<SalmonellosisPossibleExposureLocationAndTypeAct> getSalmonellosisPossibleExposureLocationAndTypeActs(SalmonellosisPHCRSocialHistorySection salmonellosisPHCRSocialHistorySection)
  {
    if (GET_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SalmonellosisPackage.Literals.SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION, SalmonellosisPackage.Literals.SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION.getEAllOperations().get(77));
      try
      {
        GET_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_QRY = helper.createQuery(GET_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<SalmonellosisPossibleExposureLocationAndTypeAct> result = (Collection<SalmonellosisPossibleExposureLocationAndTypeAct>) query.evaluate(salmonellosisPHCRSocialHistorySection);
    return new BasicEList.UnmodifiableEList<SalmonellosisPossibleExposureLocationAndTypeAct>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getHIVStatusObservation(SalmonellosisPHCRSocialHistorySection) <em>Get HIV Status Observation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHIVStatusObservation(SalmonellosisPHCRSocialHistorySection)
   * @generated
   * @ordered
   */
  protected static final String GET_HIV_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(salmonellosis::HIVStatusObservation))->asSequence()->any(true).oclAsType(salmonellosis::HIVStatusObservation)";

  /**
   * The cached OCL query for the '{@link #getHIVStatusObservation(SalmonellosisPHCRSocialHistorySection) <em>Get HIV Status Observation</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHIVStatusObservation(SalmonellosisPHCRSocialHistorySection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_HIV_STATUS_OBSERVATION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(salmonellosis::HIVStatusObservation))->asSequence()->any(true).oclAsType(salmonellosis::HIVStatusObservation)
   * @param salmonellosisPHCRSocialHistorySection The receiving '<em><b>PHCR Social History Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  HIVStatusObservation getHIVStatusObservation(SalmonellosisPHCRSocialHistorySection salmonellosisPHCRSocialHistorySection)
  {
    if (GET_HIV_STATUS_OBSERVATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SalmonellosisPackage.Literals.SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION, SalmonellosisPackage.Literals.SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION.getEAllOperations().get(78));
      try
      {
        GET_HIV_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_HIV_STATUS_OBSERVATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_HIV_STATUS_OBSERVATION__EOCL_QRY);
    return (HIVStatusObservation) query.evaluate(salmonellosisPHCRSocialHistorySection);
  }

  /**
   * The cached OCL expression body for the '{@link #validateSocialHistorySectionTemplateId(SalmonellosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionTemplateId(SalmonellosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.36')";

  /**
   * The cached OCL invariant for the '{@link #validateSocialHistorySectionTemplateId(SalmonellosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionTemplateId(SalmonellosisPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.36')
   * @param salmonellosisPHCRSocialHistorySection The receiving '<em><b>PHCR Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSocialHistorySectionTemplateId(SalmonellosisPHCRSocialHistorySection salmonellosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SalmonellosisPackage.Literals.SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(salmonellosisPHCRSocialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SalmonellosisValidator.DIAGNOSTIC_SOURCE,
             SalmonellosisValidator.SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSocialHistorySectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(salmonellosisPHCRSocialHistorySection, context) }),
             new Object [] { salmonellosisPHCRSocialHistorySection }));
      }
      return false;
    }
    return true;
  }

} // SalmonellosisPHCRSocialHistorySectionOperations