/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.impl.GeneralHeaderConstraintsImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistory;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrative;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistory;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientCareReportOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Care Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PatientCareReportImpl extends GeneralHeaderConstraintsImpl implements PatientCareReport
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PatientCareReportImpl()
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
    return EmspcrPackage.Literals.PATIENT_CARE_REPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportVersionNumber(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportVersionNumber(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportTitle(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportRecordTarget(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportHumanAuthor(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportHumanAuthor(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportComponentOf(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportBilling(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportBilling(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportSection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportEMSCurrentMedication(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportEMSCurrentMedication(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportEMSCardiacArrestEvent(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportEMSCardiacArrestEvent(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportEMSAdvanceDirectives(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportEMSAdvanceDirectives(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportEMSAllergiesAndAdverseReactionsSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportEMSAllergiesAndAdverseReactionsSection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportEMSPastMedicalHistory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportEMSPastMedicalHistory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportEMSSocialHistory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportEMSSocialHistory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportEMSPhysicalAssessmentSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportEMSPhysicalAssessmentSection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportEMSMedicationsAdministeredSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportEMSMedicationsAdministeredSection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportEMSProceduresPerformedSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportEMSProceduresPerformedSection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportEMSPatientCareNarrative(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportEMSPatientCareNarrative(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReportEMSSceneSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validatePatientCareReportEMSSceneSection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSBillingSection getBilling()
  {
    return PatientCareReportOperations.getBilling(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSInjuryIncidentDescriptionSection getSection()
  {
    return PatientCareReportOperations.getSection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSCurrentMedicationSection getEMSCurrentMedication()
  {
    return PatientCareReportOperations.getEMSCurrentMedication(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSCardiacArrestEventSection getEMSCardiacArrestEvent()
  {
    return PatientCareReportOperations.getEMSCardiacArrestEvent(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSAdvanceDirectivesSection getEMSAdvanceDirectives()
  {
    return PatientCareReportOperations.getEMSAdvanceDirectives(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSAllergiesAndAdverseReactionsSection getEMSAllergiesAndAdverseReactionsSection()
  {
    return PatientCareReportOperations.getEMSAllergiesAndAdverseReactionsSection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSPastMedicalHistory getEMSPastMedicalHistory()
  {
    return PatientCareReportOperations.getEMSPastMedicalHistory(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSSocialHistory getEMSSocialHistory()
  {
    return PatientCareReportOperations.getEMSSocialHistory(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSPhysicalAssessmentSection getEMSPhysicalAssessmentSection()
  {
    return PatientCareReportOperations.getEMSPhysicalAssessmentSection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSMedicationsAdministeredSection getEMSMedicationsAdministeredSection()
  {
    return PatientCareReportOperations.getEMSMedicationsAdministeredSection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSProceduresPerformedSection getEMSProceduresPerformedSection()
  {
    return PatientCareReportOperations.getEMSProceduresPerformedSection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSPatientCareNarrative getEMSPatientCareNarrative()
  {
    return PatientCareReportOperations.getEMSPatientCareNarrative(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSSceneSection getEMSSceneSection()
  {
    return PatientCareReportOperations.getEMSSceneSection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validateGeneralHeaderConstraintsCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PatientCareReportOperations.validateGeneralHeaderConstraintsCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatientCareReport init() {
    	CDAUtil.init(this);
    	return this;
  }
} //PatientCareReportImpl
