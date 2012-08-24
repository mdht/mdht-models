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

import org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight;
import org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain;
import org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation;
import org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis;
import org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption;
import org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics;
import org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement;
import org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement;
import org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.VitalSign;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.NonhumanSubjectDataDocumentBodyOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nonhuman Subject Data Document Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NonhumanSubjectDataDocumentBodyImpl extends SectionImpl implements NonhumanSubjectDataDocumentBody
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NonhumanSubjectDataDocumentBodyImpl()
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
    return SdtmPackage.Literals.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodyTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodyClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodyCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodyCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodyMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodyNonhumanSubjectDemographics(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyNonhumanSubjectDemographics(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodyNonhumanDisposition(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyNonhumanDisposition(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodySubjectElement(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodySubjectElement(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodyNonhumanExposure(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyNonhumanExposure(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodyBodyWeight(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyBodyWeight(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodyBodyWeightGain(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyBodyWeightGain(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodyClinicalObservation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyClinicalObservation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodyDeathDiagnosis(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyDeathDiagnosis(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodyFoodandWaterConsumption(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyFoodandWaterConsumption(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodyNonhumanLaboratoryTestResult(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyNonhumanLaboratoryTestResult(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodyMacroscopicFinding(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyMacroscopicFinding(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodyMicroscopicFindings(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyMicroscopicFindings(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodyOrganMeasurement(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyOrganMeasurement(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodyPalpableMass(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyPalpableMass(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodyPharmacokineticConcentrationFinding(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyPharmacokineticConcentrationFinding(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodyPharmacokineticParameterFinding(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyPharmacokineticParameterFinding(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodySubjectCharacteristic(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodySubjectCharacteristic(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodyTumorFinding(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyTumorFinding(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodyVitalSign(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyVitalSign(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanSubjectDataDocumentBodyECGTestResult(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyECGTestResult(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonhumanSubjectDemographics getNonhumanSubjectDemographics()
  {
    return NonhumanSubjectDataDocumentBodyOperations.getNonhumanSubjectDemographics(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonhumanDisposition getNonhumanDisposition()
  {
    return NonhumanSubjectDataDocumentBodyOperations.getNonhumanDisposition(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SubjectElement> getSubjectElements()
  {
    return NonhumanSubjectDataDocumentBodyOperations.getSubjectElements(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NonhumanExposure> getNonhumanExposures()
  {
    return NonhumanSubjectDataDocumentBodyOperations.getNonhumanExposures(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BodyWeight> getBodyWeights()
  {
    return NonhumanSubjectDataDocumentBodyOperations.getBodyWeights(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BodyWeightGain> getBodyWeightGains()
  {
    return NonhumanSubjectDataDocumentBodyOperations.getBodyWeightGains(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClinicalObservation> getClinicalObservations()
  {
    return NonhumanSubjectDataDocumentBodyOperations.getClinicalObservations(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeathDiagnosis getDeathDiagnosis()
  {
    return NonhumanSubjectDataDocumentBodyOperations.getDeathDiagnosis(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FoodandWaterConsumption> getFoodandWaterConsumptions()
  {
    return NonhumanSubjectDataDocumentBodyOperations.getFoodandWaterConsumptions(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NonhumanLaboratoryTestResult> getNonhumanLaboratoryTestResults()
  {
    return NonhumanSubjectDataDocumentBodyOperations.getNonhumanLaboratoryTestResults(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MacroscopicFinding> getMacroscopicFindings()
  {
    return NonhumanSubjectDataDocumentBodyOperations.getMacroscopicFindings(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MicroscopicFinding> getMicroscopicFindingss()
  {
    return NonhumanSubjectDataDocumentBodyOperations.getMicroscopicFindingss(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OrganMeasurement> getOrganMeasurements()
  {
    return NonhumanSubjectDataDocumentBodyOperations.getOrganMeasurements(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PalpableMass> getPalpableMasss()
  {
    return NonhumanSubjectDataDocumentBodyOperations.getPalpableMasss(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PharmacokineticConcentrationFinding> getPharmacokineticConcentrationFindings()
  {
    return NonhumanSubjectDataDocumentBodyOperations.getPharmacokineticConcentrationFindings(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PharmacokineticParameterFinding> getPharmacokineticParameterFindings()
  {
    return NonhumanSubjectDataDocumentBodyOperations.getPharmacokineticParameterFindings(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SubjectCharacteristic> getSubjectCharacteristics()
  {
    return NonhumanSubjectDataDocumentBodyOperations.getSubjectCharacteristics(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TumorFinding> getTumorFindings()
  {
    return NonhumanSubjectDataDocumentBodyOperations.getTumorFindings(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VitalSign> getVitalSigns()
  {
    return NonhumanSubjectDataDocumentBodyOperations.getVitalSigns(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ECGTestResult> getECGTestResults()
  {
    return NonhumanSubjectDataDocumentBodyOperations.getECGTestResults(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonhumanSubjectDataDocumentBody init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NonhumanSubjectDataDocumentBody init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //NonhumanSubjectDataDocumentBodyImpl
