/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics;
import org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyArm;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement;
import org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse;
import org.openhealthtools.mdht.uml.cda.sdtm.Visit;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.HumanClinicalSubjectDataDocumentBodyOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Human Clinical Subject Data Document Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HumanClinicalSubjectDataDocumentBodyImpl extends SectionImpl implements HumanClinicalSubjectDataDocumentBody
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HumanClinicalSubjectDataDocumentBodyImpl()
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
    return SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDataDocumentBodyTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDataDocumentBodyClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDataDocumentBodyCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDataDocumentBodyCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDataDocumentBodyMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDataDocumentBodyHumanClinicalSubjectDemographics(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyHumanClinicalSubjectDemographics(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDataDocumentBodyHumanClinicalVisit(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyHumanClinicalVisit(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDataDocumentBodyStudyArm(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyStudyArm(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDataDocumentBodySubjectElement(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodySubjectElement(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDataDocumentBodySubstanceUse(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodySubstanceUse(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDataDocumentBodyDisposition(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyDisposition(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDataDocumentBodyMedicalHistory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyMedicalHistory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDataDocumentBodyProtocolDeviation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyProtocolDeviation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDataDocumentBodyClinicalEvent(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyClinicalEvent(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDataDocumentBodyECGTestResult(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyECGTestResult(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDataDocumentBodySubjectCharacteristic(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodySubjectCharacteristic(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDataDocumentBodyPharmacokineticParameterFinding(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyPharmacokineticParameterFinding(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDataDocumentBodyexposureAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyexposureAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDataDocumentBodyexposureAssociationExposureSubstanceAdministration(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyexposureAssociationExposureSubstanceAdministration(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HumanClinicalSubjectDemographics getHumanClinicalSubjectDemographics()
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.getHumanClinicalSubjectDemographics(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Visit> getHumanClinicalVisits()
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.getHumanClinicalVisits(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyArm getStudyArm()
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.getStudyArm(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SubjectElement> getSubjectElements()
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.getSubjectElements(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SubstanceUse> getSubstanceUses()
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.getSubstanceUses(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HumanClinicalDisposition> getDispositions()
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.getDispositions(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MedicalHistoryItem> getMedicalHistories()
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.getMedicalHistories(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProtocolDeviation> getProtocolDeviations()
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.getProtocolDeviations(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClinicalEvent> getClinicalEvents()
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.getClinicalEvents(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ECGTestResult> getECGTestResults()
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.getECGTestResults(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubjectCharacteristic getSubjectCharacteristic()
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.getSubjectCharacteristic(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PharmacokineticParameterFinding getPharmacokineticParameterFinding()
  {
    return HumanClinicalSubjectDataDocumentBodyOperations.getPharmacokineticParameterFinding(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HumanClinicalSubjectDataDocumentBody init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HumanClinicalSubjectDataDocumentBody init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //HumanClinicalSubjectDataDocumentBodyImpl
