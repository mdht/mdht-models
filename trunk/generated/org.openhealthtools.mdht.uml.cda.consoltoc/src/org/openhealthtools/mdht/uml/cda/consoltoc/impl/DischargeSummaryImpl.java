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

import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.DischargeDietSection;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargePhysicalSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.impl.GeneralHeaderConstraintsImpl;

import org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocPackage;
import org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary;

import org.openhealthtools.mdht.uml.cda.consoltoc.operations.DischargeSummaryOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discharge Summary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DischargeSummaryImpl extends GeneralHeaderConstraintsImpl implements DischargeSummary
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DischargeSummaryImpl()
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
		return ConsoltocPackage.Literals.DISCHARGE_SUMMARY;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummaryAllergiesSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeSummaryOperations.validateDischargeSummaryAllergiesSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummaryHospitalCourseSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeSummaryOperations.validateDischargeSummaryHospitalCourseSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummaryHospitalDischargeDiagnosisSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeSummaryOperations.validateDischargeSummaryHospitalDischargeDiagnosisSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeSummaryOperations.validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummaryPlanOfCareSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeSummaryOperations.validateDischargeSummaryPlanOfCareSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummaryProblemSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeSummaryOperations.validateDischargeSummaryProblemSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummaryChiefComplaintSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeSummaryOperations.validateDischargeSummaryChiefComplaintSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummaryChiefComplaintAndReasonForVisitSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeSummaryOperations.validateDischargeSummaryChiefComplaintAndReasonForVisitSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummaryDischargeDietSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeSummaryOperations.validateDischargeSummaryDischargeDietSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummaryFamilyHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeSummaryOperations.validateDischargeSummaryFamilyHistorySection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummaryFunctionalStatusSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeSummaryOperations.validateDischargeSummaryFunctionalStatusSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummaryHistoryOfPresentIllnessSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeSummaryOperations.validateDischargeSummaryHistoryOfPresentIllnessSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummaryHospitalDischargePhysicalSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeSummaryOperations.validateDischargeSummaryHospitalDischargePhysicalSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummaryHospitalDischargeStudiesSummarySection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeSummaryOperations.validateDischargeSummaryHospitalDischargeStudiesSummarySection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummaryProceduresSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeSummaryOperations.validateDischargeSummaryProceduresSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummaryReasonForVisitSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeSummaryOperations.validateDischargeSummaryReasonForVisitSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummaryReviewOfSystemsSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeSummaryOperations.validateDischargeSummaryReviewOfSystemsSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummarySocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeSummaryOperations.validateDischargeSummarySocialHistorySection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummaryVitalSignsSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeSummaryOperations.validateDischargeSummaryVitalSignsSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummaryImmunizationsSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeSummaryOperations.validateDischargeSummaryImmunizationsSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional()
  {
		return DischargeSummaryOperations.getAllergiesSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HospitalCourseSection getHospitalCourseSection()
  {
		return DischargeSummaryOperations.getHospitalCourseSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HospitalDischargeDiagnosisSection getHospitalDischargeDiagnosisSection()
  {
		return DischargeSummaryOperations.getHospitalDischargeDiagnosisSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HospitalDischargeMedicationsSectionEntriesOptional getHospitalDischargeMedicationsSectionEntriesOptional()
  {
		return DischargeSummaryOperations.getHospitalDischargeMedicationsSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PlanOfCareSection getPlanOfCareSection()
  {
		return DischargeSummaryOperations.getPlanOfCareSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ProblemSectionEntriesOptional getProblemSectionEntriesOptional()
  {
		return DischargeSummaryOperations.getProblemSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ChiefComplaintSection getChiefComplaintSection()
  {
		return DischargeSummaryOperations.getChiefComplaintSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection()
  {
		return DischargeSummaryOperations.getChiefComplaintAndReasonForVisitSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DischargeDietSection getDischargeDietSection()
  {
		return DischargeSummaryOperations.getDischargeDietSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FamilyHistorySection getFamilyHistorySection()
  {
		return DischargeSummaryOperations.getFamilyHistorySection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FunctionalStatusSection getFunctionalStatusSection()
  {
		return DischargeSummaryOperations.getFunctionalStatusSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HistoryOfPresentIllnessSection getHistoryOfPresentIllnessSection()
  {
		return DischargeSummaryOperations.getHistoryOfPresentIllnessSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HospitalDischargePhysicalSection getHospitalDischargePhysicalSection()
  {
		return DischargeSummaryOperations.getHospitalDischargePhysicalSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HospitalDischargeStudiesSummarySection getHospitalDischargeStudiesSummarySection()
  {
		return DischargeSummaryOperations.getHospitalDischargeStudiesSummarySection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ProceduresSectionEntriesOptional getProceduresSectionEntriesOptional()
  {
		return DischargeSummaryOperations.getProceduresSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ReasonForVisitSection getReasonForVisitSection()
  {
		return DischargeSummaryOperations.getReasonForVisitSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ReviewOfSystemsSection getReviewOfSystemsSection()
  {
		return DischargeSummaryOperations.getReviewOfSystemsSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SocialHistorySection getSocialHistorySection()
  {
		return DischargeSummaryOperations.getSocialHistorySection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional()
  {
		return DischargeSummaryOperations.getVitalSignsSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ImmunizationsSectionEntriesOptional getImmunizationsSectionEntriesOptional()
  {
		return DischargeSummaryOperations.getImmunizationsSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeSummaryOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
public DischargeSummary init() {
    	CDAUtil.init(this);
    	return this;
	}
} //DischargeSummaryImpl
