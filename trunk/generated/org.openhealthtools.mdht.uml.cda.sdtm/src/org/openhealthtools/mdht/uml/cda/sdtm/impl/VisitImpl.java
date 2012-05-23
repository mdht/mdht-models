/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.impl.EncounterImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability;
import org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet;
import org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility;
import org.openhealthtools.mdht.uml.cda.sdtm.NonHumanLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.Visit;
import org.openhealthtools.mdht.uml.cda.sdtm.VitalSign;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.VisitOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VisitImpl extends EncounterImpl implements Visit
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VisitImpl()
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
    return SdtmPackage.Literals.VISIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVisitTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VisitOperations.validateVisitTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVisitClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VisitOperations.validateVisitClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVisitCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VisitOperations.validateVisitCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVisitEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VisitOperations.validateVisitEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVisitMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VisitOperations.validateVisitMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVisitText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VisitOperations.validateVisitText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVisitId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VisitOperations.validateVisitId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVisitHumanClinicalAdverseEvent(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VisitOperations.validateVisitHumanClinicalAdverseEvent(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVisitHumanClinicalVitalSign(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VisitOperations.validateVisitHumanClinicalVitalSign(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVisitPlannedStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VisitOperations.validateVisitPlannedStudyDay(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVisitConcommitantMedicationAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VisitOperations.validateVisitConcommitantMedicationAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVisitECGTestResult(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VisitOperations.validateVisitECGTestResult(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVisitInclusionorExclusionCriteriaNotMet(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VisitOperations.validateVisitInclusionorExclusionCriteriaNotMet(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVisitLaboratoryTestResult(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VisitOperations.validateVisitLaboratoryTestResult(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVisitPhysicalExamination(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VisitOperations.validateVisitPhysicalExamination(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVisitSubstanceUseAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VisitOperations.validateVisitSubstanceUseAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVisitMicrobiologySpecimen(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VisitOperations.validateVisitMicrobiologySpecimen(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVisitMicrobiologySusceptibility(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VisitOperations.validateVisitMicrobiologySusceptibility(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVisitPharmacokineticConcentrationFinding(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VisitOperations.validateVisitPharmacokineticConcentrationFinding(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVisitFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VisitOperations.validateVisitFindingAbout(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVisitDrugAccountability(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VisitOperations.validateVisitDrugAccountability(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVisitStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VisitOperations.validateVisitStudyDayPeriod(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AdverseEvent> getHumanClinicalAdverseEvents()
  {
    return VisitOperations.getHumanClinicalAdverseEvents(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VitalSign> getHumanClinicalVitalSigns()
  {
    return VisitOperations.getHumanClinicalVitalSigns(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlannedStudyDay getPlannedStudyDay()
  {
    return VisitOperations.getPlannedStudyDay(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ECGTestResult> getECGTestResults()
  {
    return VisitOperations.getECGTestResults(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InclusionorExclusionCriteriaNotMet> getInclusionorExclusionCriteriaNotMets()
  {
    return VisitOperations.getInclusionorExclusionCriteriaNotMets(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NonHumanLaboratoryTestResult> getLaboratoryTestResults()
  {
    return VisitOperations.getLaboratoryTestResults(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PhysicalExaminationFinding> getPhysicalExaminations()
  {
    return VisitOperations.getPhysicalExaminations(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MicrobiologySpecimenFinding getMicrobiologySpecimen()
  {
    return VisitOperations.getMicrobiologySpecimen(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MicrobiologySusceptibility getMicrobiologySusceptibility()
  {
    return VisitOperations.getMicrobiologySusceptibility(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PharmacokineticConcentrationFinding getPharmacokineticConcentrationFinding()
  {
    return VisitOperations.getPharmacokineticConcentrationFinding(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FindingAbout getFindingAbout()
  {
    return VisitOperations.getFindingAbout(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DrugAccountability getDrugAccountability()
  {
    return VisitOperations.getDrugAccountability(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyDayPeriod getStudyDayPeriod()
  {
    return VisitOperations.getStudyDayPeriod(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visit init() {
    	CDAUtil.init(this);
    	return this;
  }
} //VisitImpl
