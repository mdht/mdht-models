/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsdr.operations;

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

import org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance;
import org.openhealthtools.mdht.uml.cda.vsdr.AutopsyResults;
import org.openhealthtools.mdht.uml.cda.vsdr.CertifyingDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.CoronerCaseTransfer;
import org.openhealthtools.mdht.uml.cda.vsdr.CoronerReferral;
import org.openhealthtools.mdht.uml.cda.vsdr.DateandTimeofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathLocationType;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody;
import org.openhealthtools.mdht.uml.cda.vsdr.Injury;
import org.openhealthtools.mdht.uml.cda.vsdr.LocationofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.PregnancyStatus;
import org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.TimeofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.TobaccoUse;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.util.VsdrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Death Report Document Body</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyTimeofDeath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Timeof Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyLocationofDeath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Locationof Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyCertifyingDeath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Certifying Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyMannerofDeath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Mannerof Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyPregnancyStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Pregnancy Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyTobaccoUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Tobacco Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyInjury(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Injury</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyCauseofDeath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Causeof Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyAutopsyPerformance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Autopsy Performance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyAutopsyResults(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Autopsy Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyCoronerReferral(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Coroner Referral</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyCoronerCaseTransfer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Coroner Case Transfer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyDeathLocationType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Death Location Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyPronouncingDeath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Pronouncing Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getTimeofDeath() <em>Get Timeof Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getLocationofDeath() <em>Get Locationof Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getCertifyingDeath() <em>Get Certifying Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getMannerofDeath() <em>Get Mannerof Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getPregnancyStatus() <em>Get Pregnancy Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getTobaccoUse() <em>Get Tobacco Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getInjury() <em>Get Injury</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getCauseofDeath() <em>Get Causeof Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getAutopsyPerformance() <em>Get Autopsy Performance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getAutopsyResults() <em>Get Autopsy Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getCoronerReferral() <em>Get Coroner Referral</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getCoronerCaseTransfer() <em>Get Coroner Case Transfer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getDeathLocationType() <em>Get Death Location Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getPronouncingDeath() <em>Get Pronouncing Death</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeathReportDocumentBodyOperations extends SectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeathReportDocumentBodyOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyTemplateId(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyTemplateId(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.1')";

  /**
   * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyTemplateId(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyTemplateId(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathReportDocumentBodyTemplateId(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
      try
      {
        VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathReportDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
             new Object [] { deathReportDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathReportDocumentBodyCodeP(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
      try
      {
        VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathReportDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
             new Object [] { deathReportDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathReportDocumentBodyText(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
      try
      {
        VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathReportDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
             new Object [] { deathReportDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyCode(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyCode(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.1'";

  /**
   * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyCode(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyCode(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyCodeP(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyCodeP(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyCodeP(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyCodeP(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyText(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyText(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyText(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyText(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathReportDocumentBodyCode(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
      try
      {
        VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathReportDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
             new Object [] { deathReportDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyTimeofDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Timeof Death</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyTimeofDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TIMEOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsdr::Date and Time of Death) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyTimeofDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Timeof Death</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyTimeofDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TIMEOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathReportDocumentBodyTimeofDeath(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TIMEOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
      try
      {
        VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TIMEOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TIMEOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TIMEOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathReportDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_TIMEOF_DEATH,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyTimeofDeath", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
             new Object [] { deathReportDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyLocationofDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Locationof Death</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyLocationofDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_LOCATIONOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsdr::Location of Death) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyLocationofDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Locationof Death</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyLocationofDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_REPORT_DOCUMENT_BODY_LOCATIONOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathReportDocumentBodyLocationofDeath(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_LOCATIONOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
      try
      {
        VALIDATE_DEATH_REPORT_DOCUMENT_BODY_LOCATIONOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_LOCATIONOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_LOCATIONOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathReportDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_LOCATIONOF_DEATH,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyLocationofDeath", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
             new Object [] { deathReportDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyCertifyingDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Certifying Death</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyCertifyingDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CERTIFYING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsdr::Certifying Death) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyCertifyingDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Certifying Death</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyCertifyingDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CERTIFYING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathReportDocumentBodyCertifyingDeath(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CERTIFYING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
      try
      {
        VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CERTIFYING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CERTIFYING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CERTIFYING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathReportDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_CERTIFYING_DEATH,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyCertifyingDeath", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
             new Object [] { deathReportDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyMannerofDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Mannerof Death</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyMannerofDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_MANNEROF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsdr::Manner of Death) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyMannerofDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Mannerof Death</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyMannerofDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_REPORT_DOCUMENT_BODY_MANNEROF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathReportDocumentBodyMannerofDeath(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_MANNEROF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
      try
      {
        VALIDATE_DEATH_REPORT_DOCUMENT_BODY_MANNEROF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_MANNEROF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_MANNEROF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathReportDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_MANNEROF_DEATH,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyMannerofDeath", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
             new Object [] { deathReportDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyPregnancyStatus(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Pregnancy Status</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyPregnancyStatus(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PREGNANCY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsdr::Pregnancy Status) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyPregnancyStatus(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Pregnancy Status</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyPregnancyStatus(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PREGNANCY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathReportDocumentBodyPregnancyStatus(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PREGNANCY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
      try
      {
        VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PREGNANCY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PREGNANCY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PREGNANCY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathReportDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_PREGNANCY_STATUS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyPregnancyStatus", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
             new Object [] { deathReportDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyTobaccoUse(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Tobacco Use</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyTobaccoUse(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsdr::Tobacco Use) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyTobaccoUse(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Tobacco Use</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyTobaccoUse(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathReportDocumentBodyTobaccoUse(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
      try
      {
        VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathReportDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_TOBACCO_USE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyTobaccoUse", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
             new Object [] { deathReportDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyInjury(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Injury</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyInjury(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(vsdr::Injury) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyInjury(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Injury</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyInjury(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_REPORT_DOCUMENT_BODY_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathReportDocumentBodyInjury(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
      try
      {
        VALIDATE_DEATH_REPORT_DOCUMENT_BODY_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathReportDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_INJURY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyInjury", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
             new Object [] { deathReportDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyCauseofDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Causeof Death</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyCauseofDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CAUSEOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(vsdr::Death Causal Information) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyCauseofDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Causeof Death</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyCauseofDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CAUSEOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathReportDocumentBodyCauseofDeath(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CAUSEOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
      try
      {
        VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CAUSEOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CAUSEOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CAUSEOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathReportDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_CAUSEOF_DEATH,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyCauseofDeath", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
             new Object [] { deathReportDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyAutopsyPerformance(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Autopsy Performance</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyAutopsyPerformance(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_PERFORMANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsdr::Autopsy Performance) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyAutopsyPerformance(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Autopsy Performance</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyAutopsyPerformance(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_PERFORMANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathReportDocumentBodyAutopsyPerformance(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_PERFORMANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
      try
      {
        VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_PERFORMANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_PERFORMANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_PERFORMANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathReportDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_PERFORMANCE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyAutopsyPerformance", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
             new Object [] { deathReportDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyAutopsyResults(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Autopsy Results</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyAutopsyResults(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_RESULTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsdr::Autopsy Results) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyAutopsyResults(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Autopsy Results</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyAutopsyResults(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_RESULTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathReportDocumentBodyAutopsyResults(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_RESULTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
      try
      {
        VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_RESULTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_RESULTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_RESULTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathReportDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_RESULTS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyAutopsyResults", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
             new Object [] { deathReportDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyCoronerReferral(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Coroner Referral</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyCoronerReferral(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_REFERRAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsdr::Coroner Referral) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyCoronerReferral(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Coroner Referral</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyCoronerReferral(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_REFERRAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathReportDocumentBodyCoronerReferral(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_REFERRAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
      try
      {
        VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_REFERRAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_REFERRAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_REFERRAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathReportDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_CORONER_REFERRAL,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyCoronerReferral", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
             new Object [] { deathReportDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyCoronerCaseTransfer(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Coroner Case Transfer</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyCoronerCaseTransfer(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_CASE_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsdr::Coroner Case Transfer) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyCoronerCaseTransfer(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Coroner Case Transfer</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyCoronerCaseTransfer(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_CASE_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathReportDocumentBodyCoronerCaseTransfer(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_CASE_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
      try
      {
        VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_CASE_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_CASE_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_CASE_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathReportDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_CORONER_CASE_TRANSFER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyCoronerCaseTransfer", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
             new Object [] { deathReportDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyDeathLocationType(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Death Location Type</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyDeathLocationType(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_DEATH_LOCATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsdr::Death LocationType) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyDeathLocationType(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Death Location Type</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyDeathLocationType(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_REPORT_DOCUMENT_BODY_DEATH_LOCATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathReportDocumentBodyDeathLocationType(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_DEATH_LOCATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
      try
      {
        VALIDATE_DEATH_REPORT_DOCUMENT_BODY_DEATH_LOCATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_DEATH_LOCATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_DEATH_LOCATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathReportDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_DEATH_LOCATION_TYPE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyDeathLocationType", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
             new Object [] { deathReportDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathReportDocumentBodyPronouncingDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Pronouncing Death</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyPronouncingDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PRONOUNCING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsdr::Pronouncing Death) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathReportDocumentBodyPronouncingDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Pronouncing Death</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathReportDocumentBodyPronouncingDeath(DeathReportDocumentBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PRONOUNCING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathReportDocumentBody The receiving '<em><b>Death Report Document Body</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathReportDocumentBodyPronouncingDeath(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PRONOUNCING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY);
      try
      {
        VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PRONOUNCING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PRONOUNCING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PRONOUNCING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathReportDocumentBody))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_PRONOUNCING_DEATH,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathReportDocumentBodyPronouncingDeath", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathReportDocumentBody, context) }),
             new Object [] { deathReportDocumentBody }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getTimeofDeath(DeathReportDocumentBody) <em>Get Timeof Death</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeofDeath(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_TIMEOF_DEATH__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsdr::Date and Time of Death))->asSequence()->any(true).oclAsType(vsdr::Date and Time of Death)";

  /**
   * The cached OCL query for the '{@link #getTimeofDeath(DeathReportDocumentBody) <em>Get Timeof Death</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeofDeath(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_TIMEOF_DEATH__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  DateandTimeofDeath getTimeofDeath(DeathReportDocumentBody deathReportDocumentBody)
  {
    if (GET_TIMEOF_DEATH__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(73));
      try
      {
        GET_TIMEOF_DEATH__EOCL_QRY = helper.createQuery(GET_TIMEOF_DEATH__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TIMEOF_DEATH__EOCL_QRY);
    return (DateandTimeofDeath) query.evaluate(deathReportDocumentBody);
  }

  /**
   * The cached OCL expression body for the '{@link #getLocationofDeath(DeathReportDocumentBody) <em>Get Locationof Death</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocationofDeath(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_LOCATIONOF_DEATH__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsdr::Location of Death))->asSequence()->any(true).oclAsType(vsdr::Location of Death)";

  /**
   * The cached OCL query for the '{@link #getLocationofDeath(DeathReportDocumentBody) <em>Get Locationof Death</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocationofDeath(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_LOCATIONOF_DEATH__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  LocationofDeath getLocationofDeath(DeathReportDocumentBody deathReportDocumentBody)
  {
    if (GET_LOCATIONOF_DEATH__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(74));
      try
      {
        GET_LOCATIONOF_DEATH__EOCL_QRY = helper.createQuery(GET_LOCATIONOF_DEATH__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_LOCATIONOF_DEATH__EOCL_QRY);
    return (LocationofDeath) query.evaluate(deathReportDocumentBody);
  }

  /**
   * The cached OCL expression body for the '{@link #getCertifyingDeath(DeathReportDocumentBody) <em>Get Certifying Death</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCertifyingDeath(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_CERTIFYING_DEATH__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsdr::Certifying Death))->asSequence()->any(true).oclAsType(vsdr::Certifying Death)";

  /**
   * The cached OCL query for the '{@link #getCertifyingDeath(DeathReportDocumentBody) <em>Get Certifying Death</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCertifyingDeath(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_CERTIFYING_DEATH__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  CertifyingDeath getCertifyingDeath(DeathReportDocumentBody deathReportDocumentBody)
  {
    if (GET_CERTIFYING_DEATH__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(75));
      try
      {
        GET_CERTIFYING_DEATH__EOCL_QRY = helper.createQuery(GET_CERTIFYING_DEATH__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_CERTIFYING_DEATH__EOCL_QRY);
    return (CertifyingDeath) query.evaluate(deathReportDocumentBody);
  }

  /**
   * The cached OCL expression body for the '{@link #getMannerofDeath(DeathReportDocumentBody) <em>Get Mannerof Death</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMannerofDeath(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_MANNEROF_DEATH__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsdr::Manner of Death))->asSequence()->any(true).oclAsType(vsdr::Manner of Death)";

  /**
   * The cached OCL query for the '{@link #getMannerofDeath(DeathReportDocumentBody) <em>Get Mannerof Death</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMannerofDeath(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_MANNEROF_DEATH__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  MannerofDeath getMannerofDeath(DeathReportDocumentBody deathReportDocumentBody)
  {
    if (GET_MANNEROF_DEATH__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(76));
      try
      {
        GET_MANNEROF_DEATH__EOCL_QRY = helper.createQuery(GET_MANNEROF_DEATH__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MANNEROF_DEATH__EOCL_QRY);
    return (MannerofDeath) query.evaluate(deathReportDocumentBody);
  }

  /**
   * The cached OCL expression body for the '{@link #getPregnancyStatus(DeathReportDocumentBody) <em>Get Pregnancy Status</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPregnancyStatus(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_PREGNANCY_STATUS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsdr::Pregnancy Status))->asSequence()->any(true).oclAsType(vsdr::Pregnancy Status)";

  /**
   * The cached OCL query for the '{@link #getPregnancyStatus(DeathReportDocumentBody) <em>Get Pregnancy Status</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPregnancyStatus(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PREGNANCY_STATUS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  PregnancyStatus getPregnancyStatus(DeathReportDocumentBody deathReportDocumentBody)
  {
    if (GET_PREGNANCY_STATUS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(77));
      try
      {
        GET_PREGNANCY_STATUS__EOCL_QRY = helper.createQuery(GET_PREGNANCY_STATUS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PREGNANCY_STATUS__EOCL_QRY);
    return (PregnancyStatus) query.evaluate(deathReportDocumentBody);
  }

  /**
   * The cached OCL expression body for the '{@link #getTobaccoUse(DeathReportDocumentBody) <em>Get Tobacco Use</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTobaccoUse(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_TOBACCO_USE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsdr::Tobacco Use))->asSequence()->any(true).oclAsType(vsdr::Tobacco Use)";

  /**
   * The cached OCL query for the '{@link #getTobaccoUse(DeathReportDocumentBody) <em>Get Tobacco Use</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTobaccoUse(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_TOBACCO_USE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  TobaccoUse getTobaccoUse(DeathReportDocumentBody deathReportDocumentBody)
  {
    if (GET_TOBACCO_USE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(78));
      try
      {
        GET_TOBACCO_USE__EOCL_QRY = helper.createQuery(GET_TOBACCO_USE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TOBACCO_USE__EOCL_QRY);
    return (TobaccoUse) query.evaluate(deathReportDocumentBody);
  }

  /**
   * The cached OCL expression body for the '{@link #getInjury(DeathReportDocumentBody) <em>Get Injury</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInjury(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_INJURY__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(vsdr::Injury))->asSequence()->any(true).oclAsType(vsdr::Injury)";

  /**
   * The cached OCL query for the '{@link #getInjury(DeathReportDocumentBody) <em>Get Injury</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInjury(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_INJURY__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  Injury getInjury(DeathReportDocumentBody deathReportDocumentBody)
  {
    if (GET_INJURY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(79));
      try
      {
        GET_INJURY__EOCL_QRY = helper.createQuery(GET_INJURY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_INJURY__EOCL_QRY);
    return (Injury) query.evaluate(deathReportDocumentBody);
  }

  /**
   * The cached OCL expression body for the '{@link #getCauseofDeath(DeathReportDocumentBody) <em>Get Causeof Death</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCauseofDeath(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_CAUSEOF_DEATH__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(vsdr::Death Causal Information))->asSequence()->any(true).oclAsType(vsdr::Death Causal Information)";

  /**
   * The cached OCL query for the '{@link #getCauseofDeath(DeathReportDocumentBody) <em>Get Causeof Death</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCauseofDeath(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_CAUSEOF_DEATH__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  DeathCausalInformation getCauseofDeath(DeathReportDocumentBody deathReportDocumentBody)
  {
    if (GET_CAUSEOF_DEATH__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(80));
      try
      {
        GET_CAUSEOF_DEATH__EOCL_QRY = helper.createQuery(GET_CAUSEOF_DEATH__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_CAUSEOF_DEATH__EOCL_QRY);
    return (DeathCausalInformation) query.evaluate(deathReportDocumentBody);
  }

  /**
   * The cached OCL expression body for the '{@link #getAutopsyPerformance(DeathReportDocumentBody) <em>Get Autopsy Performance</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAutopsyPerformance(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_AUTOPSY_PERFORMANCE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsdr::Autopsy Performance))->asSequence()->any(true).oclAsType(vsdr::Autopsy Performance)";

  /**
   * The cached OCL query for the '{@link #getAutopsyPerformance(DeathReportDocumentBody) <em>Get Autopsy Performance</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAutopsyPerformance(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_AUTOPSY_PERFORMANCE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  AutopsyPerformance getAutopsyPerformance(DeathReportDocumentBody deathReportDocumentBody)
  {
    if (GET_AUTOPSY_PERFORMANCE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(81));
      try
      {
        GET_AUTOPSY_PERFORMANCE__EOCL_QRY = helper.createQuery(GET_AUTOPSY_PERFORMANCE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_AUTOPSY_PERFORMANCE__EOCL_QRY);
    return (AutopsyPerformance) query.evaluate(deathReportDocumentBody);
  }

  /**
   * The cached OCL expression body for the '{@link #getAutopsyResults(DeathReportDocumentBody) <em>Get Autopsy Results</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAutopsyResults(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_AUTOPSY_RESULTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsdr::Autopsy Results))->asSequence()->any(true).oclAsType(vsdr::Autopsy Results)";

  /**
   * The cached OCL query for the '{@link #getAutopsyResults(DeathReportDocumentBody) <em>Get Autopsy Results</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAutopsyResults(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_AUTOPSY_RESULTS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  AutopsyResults getAutopsyResults(DeathReportDocumentBody deathReportDocumentBody)
  {
    if (GET_AUTOPSY_RESULTS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(82));
      try
      {
        GET_AUTOPSY_RESULTS__EOCL_QRY = helper.createQuery(GET_AUTOPSY_RESULTS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_AUTOPSY_RESULTS__EOCL_QRY);
    return (AutopsyResults) query.evaluate(deathReportDocumentBody);
  }

  /**
   * The cached OCL expression body for the '{@link #getCoronerReferral(DeathReportDocumentBody) <em>Get Coroner Referral</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoronerReferral(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_CORONER_REFERRAL__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsdr::Coroner Referral))->asSequence()->any(true).oclAsType(vsdr::Coroner Referral)";

  /**
   * The cached OCL query for the '{@link #getCoronerReferral(DeathReportDocumentBody) <em>Get Coroner Referral</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoronerReferral(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_CORONER_REFERRAL__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  CoronerReferral getCoronerReferral(DeathReportDocumentBody deathReportDocumentBody)
  {
    if (GET_CORONER_REFERRAL__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(83));
      try
      {
        GET_CORONER_REFERRAL__EOCL_QRY = helper.createQuery(GET_CORONER_REFERRAL__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_CORONER_REFERRAL__EOCL_QRY);
    return (CoronerReferral) query.evaluate(deathReportDocumentBody);
  }

  /**
   * The cached OCL expression body for the '{@link #getCoronerCaseTransfer(DeathReportDocumentBody) <em>Get Coroner Case Transfer</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoronerCaseTransfer(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_CORONER_CASE_TRANSFER__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsdr::Coroner Case Transfer))->asSequence()->any(true).oclAsType(vsdr::Coroner Case Transfer)";

  /**
   * The cached OCL query for the '{@link #getCoronerCaseTransfer(DeathReportDocumentBody) <em>Get Coroner Case Transfer</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoronerCaseTransfer(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_CORONER_CASE_TRANSFER__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  CoronerCaseTransfer getCoronerCaseTransfer(DeathReportDocumentBody deathReportDocumentBody)
  {
    if (GET_CORONER_CASE_TRANSFER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(84));
      try
      {
        GET_CORONER_CASE_TRANSFER__EOCL_QRY = helper.createQuery(GET_CORONER_CASE_TRANSFER__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_CORONER_CASE_TRANSFER__EOCL_QRY);
    return (CoronerCaseTransfer) query.evaluate(deathReportDocumentBody);
  }

  /**
   * The cached OCL expression body for the '{@link #getDeathLocationType(DeathReportDocumentBody) <em>Get Death Location Type</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeathLocationType(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_DEATH_LOCATION_TYPE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsdr::Death LocationType))->asSequence()->any(true).oclAsType(vsdr::Death LocationType)";

  /**
   * The cached OCL query for the '{@link #getDeathLocationType(DeathReportDocumentBody) <em>Get Death Location Type</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeathLocationType(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DEATH_LOCATION_TYPE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  DeathLocationType getDeathLocationType(DeathReportDocumentBody deathReportDocumentBody)
  {
    if (GET_DEATH_LOCATION_TYPE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(85));
      try
      {
        GET_DEATH_LOCATION_TYPE__EOCL_QRY = helper.createQuery(GET_DEATH_LOCATION_TYPE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_DEATH_LOCATION_TYPE__EOCL_QRY);
    return (DeathLocationType) query.evaluate(deathReportDocumentBody);
  }

  /**
   * The cached OCL expression body for the '{@link #getPronouncingDeath(DeathReportDocumentBody) <em>Get Pronouncing Death</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPronouncingDeath(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static final String GET_PRONOUNCING_DEATH__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsdr::Pronouncing Death))->asSequence()->any(true).oclAsType(vsdr::Pronouncing Death)";

  /**
   * The cached OCL query for the '{@link #getPronouncingDeath(DeathReportDocumentBody) <em>Get Pronouncing Death</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPronouncingDeath(DeathReportDocumentBody)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PRONOUNCING_DEATH__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  PronouncingDeath getPronouncingDeath(DeathReportDocumentBody deathReportDocumentBody)
  {
    if (GET_PRONOUNCING_DEATH__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY, VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY.getEAllOperations().get(86));
      try
      {
        GET_PRONOUNCING_DEATH__EOCL_QRY = helper.createQuery(GET_PRONOUNCING_DEATH__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PRONOUNCING_DEATH__EOCL_QRY);
    return (PronouncingDeath) query.evaluate(deathReportDocumentBody);
  }

} // DeathReportDocumentBodyOperations