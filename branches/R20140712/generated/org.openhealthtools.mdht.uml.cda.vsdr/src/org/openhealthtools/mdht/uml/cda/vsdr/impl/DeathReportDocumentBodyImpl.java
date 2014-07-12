/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsdr.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.Observation;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

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

import org.openhealthtools.mdht.uml.cda.vsdr.operations.DeathReportDocumentBodyOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Death Report Document Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DeathReportDocumentBodyImpl extends SectionImpl implements DeathReportDocumentBody
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeathReportDocumentBodyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBodyTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBodyCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBodyText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBodyCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBodyTimeofDeath(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyTimeofDeath(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBodyLocationofDeath(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyLocationofDeath(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBodyCertifyingDeath(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyCertifyingDeath(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBodyMannerofDeath(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyMannerofDeath(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBodyPregnancyStatus(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyPregnancyStatus(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBodyTobaccoUse(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyTobaccoUse(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBodyInjury(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyInjury(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBodyCauseofDeath(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyCauseofDeath(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBodyAutopsyPerformance(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyAutopsyPerformance(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBodyAutopsyResults(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyAutopsyResults(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBodyCoronerReferral(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyCoronerReferral(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBodyCoronerCaseTransfer(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyCoronerCaseTransfer(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBodyDeathLocationType(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyDeathLocationType(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBodyPronouncingDeath(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyPronouncingDeath(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateandTimeofDeath getTimeofDeath()
  {
    return DeathReportDocumentBodyOperations.getTimeofDeath(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocationofDeath getLocationofDeath()
  {
    return DeathReportDocumentBodyOperations.getLocationofDeath(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CertifyingDeath getCertifyingDeath()
  {
    return DeathReportDocumentBodyOperations.getCertifyingDeath(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MannerofDeath getMannerofDeath()
  {
    return DeathReportDocumentBodyOperations.getMannerofDeath(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PregnancyStatus getPregnancyStatus()
  {
    return DeathReportDocumentBodyOperations.getPregnancyStatus(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TobaccoUse getTobaccoUse()
  {
    return DeathReportDocumentBodyOperations.getTobaccoUse(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Injury getInjury()
  {
    return DeathReportDocumentBodyOperations.getInjury(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeathCausalInformation getCauseofDeath()
  {
    return DeathReportDocumentBodyOperations.getCauseofDeath(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AutopsyPerformance getAutopsyPerformance()
  {
    return DeathReportDocumentBodyOperations.getAutopsyPerformance(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AutopsyResults getAutopsyResults()
  {
    return DeathReportDocumentBodyOperations.getAutopsyResults(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoronerReferral getCoronerReferral()
  {
    return DeathReportDocumentBodyOperations.getCoronerReferral(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoronerCaseTransfer getCoronerCaseTransfer()
  {
    return DeathReportDocumentBodyOperations.getCoronerCaseTransfer(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeathLocationType getDeathLocationType()
  {
    return DeathReportDocumentBodyOperations.getDeathLocationType(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PronouncingDeath getPronouncingDeath()
  {
    return DeathReportDocumentBodyOperations.getPronouncingDeath(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeathReportDocumentBody init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeathReportDocumentBody init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //DeathReportDocumentBodyImpl
