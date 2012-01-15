/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
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
  public ConsultationRequest init() {
    	CDAUtil.init(this);
    	return this;
	}
} //ConsultationRequestImpl
