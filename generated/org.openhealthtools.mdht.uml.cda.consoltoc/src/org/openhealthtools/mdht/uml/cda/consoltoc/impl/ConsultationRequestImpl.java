/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consoltoc.impl;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;

import org.openhealthtools.mdht.uml.cda.consol.impl.GeneralHeaderConstraintsImpl;

import org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocPackage;
import org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest;

import org.openhealthtools.mdht.uml.cda.consoltoc.operations.ConsultationRequestOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consultation Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConsultationRequestImpl extends GeneralHeaderConstraintsImpl implements ConsultationRequest
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ConsultationRequestImpl()
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
		return ConsoltocPackage.Literals.CONSULTATION_REQUEST;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequestAllergiesSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationRequestOperations.validateConsultationRequestAllergiesSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequestAssessmentAndPlanSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationRequestOperations.validateConsultationRequestAssessmentAndPlanSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequestHistoryOfPresentIllnessSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationRequestOperations.validateConsultationRequestHistoryOfPresentIllnessSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequestPhysicalExamSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationRequestOperations.validateConsultationRequestPhysicalExamSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequestReasonForReferralSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationRequestOperations.validateConsultationRequestReasonForReferralSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequestMedicationsSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationRequestOperations.validateConsultationRequestMedicationsSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequestProblemSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationRequestOperations.validateConsultationRequestProblemSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequestProceduresSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationRequestOperations.validateConsultationRequestProceduresSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequestResultsSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationRequestOperations.validateConsultationRequestResultsSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequestAdvanceDirectivesSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationRequestOperations.validateConsultationRequestAdvanceDirectivesSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequestEncountersSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationRequestOperations.validateConsultationRequestEncountersSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequestFamilyHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationRequestOperations.validateConsultationRequestFamilyHistorySection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequestFunctionalStatusSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationRequestOperations.validateConsultationRequestFunctionalStatusSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequestImmunizationsSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationRequestOperations.validateConsultationRequestImmunizationsSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequestMedicalEquipmentSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationRequestOperations.validateConsultationRequestMedicalEquipmentSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequestPlanOfCareSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationRequestOperations.validateConsultationRequestPlanOfCareSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequestSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationRequestOperations.validateConsultationRequestSocialHistorySection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequestVitalSignsSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationRequestOperations.validateConsultationRequestVitalSignsSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequestChiefComplaintSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationRequestOperations.validateConsultationRequestChiefComplaintSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequestChiefComplaintAndReasonForVisitSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationRequestOperations.validateConsultationRequestChiefComplaintAndReasonForVisitSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequestGeneralStatusSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationRequestOperations.validateConsultationRequestGeneralStatusSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequestHistoryOfPastIllnessSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationRequestOperations.validateConsultationRequestHistoryOfPastIllnessSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequestPayersSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationRequestOperations.validateConsultationRequestPayersSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional()
  {
		return ConsultationRequestOperations.getAllergiesSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AssessmentAndPlanSection getAssessmentAndPlanSection()
  {
		return ConsultationRequestOperations.getAssessmentAndPlanSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HistoryOfPresentIllnessSection getHistoryOfPresentIllnessSection()
  {
		return ConsultationRequestOperations.getHistoryOfPresentIllnessSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PhysicalExamSection getPhysicalExamSection()
  {
		return ConsultationRequestOperations.getPhysicalExamSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ReasonForReferralSection getReasonForReferralSection()
  {
		return ConsultationRequestOperations.getReasonForReferralSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MedicationsSectionEntriesOptional getMedicationsSectionEntriesOptional()
  {
		return ConsultationRequestOperations.getMedicationsSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ProblemSectionEntriesOptional getProblemSectionEntriesOptional()
  {
		return ConsultationRequestOperations.getProblemSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ProceduresSectionEntriesOptional getProceduresSectionEntriesOptional()
  {
		return ConsultationRequestOperations.getProceduresSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ResultsSectionEntriesOptional getResultsSectionEntriesOptional()
  {
		return ConsultationRequestOperations.getResultsSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AdvanceDirectivesSectionEntriesOptional getAdvanceDirectivesSectionEntriesOptional()
  {
		return ConsultationRequestOperations.getAdvanceDirectivesSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EncountersSectionEntriesOptional getEncountersSectionEntriesOptional()
  {
		return ConsultationRequestOperations.getEncountersSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FamilyHistorySection getFamilyHistorySection()
  {
		return ConsultationRequestOperations.getFamilyHistorySection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FunctionalStatusSection getFunctionalStatusSection()
  {
		return ConsultationRequestOperations.getFunctionalStatusSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ImmunizationsSectionEntriesOptional getImmunizationsSectionEntriesOptional()
  {
		return ConsultationRequestOperations.getImmunizationsSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MedicalEquipmentSection getMedicalEquipmentSection()
  {
		return ConsultationRequestOperations.getMedicalEquipmentSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PlanOfCareSection getPlanOfCareSection()
  {
		return ConsultationRequestOperations.getPlanOfCareSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SocialHistorySection getSocialHistorySection()
  {
		return ConsultationRequestOperations.getSocialHistorySection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional()
  {
		return ConsultationRequestOperations.getVitalSignsSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ChiefComplaintSection getChiefComplaintSection()
  {
		return ConsultationRequestOperations.getChiefComplaintSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection()
  {
		return ConsultationRequestOperations.getChiefComplaintAndReasonForVisitSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public GeneralStatusSection getGeneralStatusSection()
  {
		return ConsultationRequestOperations.getGeneralStatusSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HistoryOfPastIllnessSection getHistoryOfPastIllnessSection()
  {
		return ConsultationRequestOperations.getHistoryOfPastIllnessSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PayersSection getPayersSection()
  {
		return ConsultationRequestOperations.getPayersSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationRequestOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
public ConsultationRequest init() {
    	CDAUtil.init(this);
    	return this;
	}
} //ConsultationRequestImpl
