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
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.impl.GeneralHeaderConstraintsImpl;

import org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocPackage;
import org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary;

import org.openhealthtools.mdht.uml.cda.consoltoc.operations.ConsultationSummaryOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consultation Summary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConsultationSummaryImpl extends GeneralHeaderConstraintsImpl implements ConsultationSummary
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ConsultationSummaryImpl()
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
		return ConsoltocPackage.Literals.CONSULTATION_SUMMARY;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummaryAllergiesSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationSummaryOperations.validateConsultationSummaryAllergiesSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummaryMedicationsSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationSummaryOperations.validateConsultationSummaryMedicationsSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummaryProblemSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationSummaryOperations.validateConsultationSummaryProblemSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummaryResultsSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationSummaryOperations.validateConsultationSummaryResultsSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummaryAdvanceDirectivesSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationSummaryOperations.validateConsultationSummaryAdvanceDirectivesSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummaryEncountersSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationSummaryOperations.validateConsultationSummaryEncountersSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummaryFamilyHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationSummaryOperations.validateConsultationSummaryFamilyHistorySection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummaryFunctionalStatusSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationSummaryOperations.validateConsultationSummaryFunctionalStatusSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummaryImmunizationsSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationSummaryOperations.validateConsultationSummaryImmunizationsSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummaryProceduresSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationSummaryOperations.validateConsultationSummaryProceduresSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummaryMedicalEquipmentSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationSummaryOperations.validateConsultationSummaryMedicalEquipmentSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummaryPayersSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationSummaryOperations.validateConsultationSummaryPayersSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummaryPlanOfCareSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationSummaryOperations.validateConsultationSummaryPlanOfCareSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummarySocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationSummaryOperations.validateConsultationSummarySocialHistorySection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummaryVitalSignsSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationSummaryOperations.validateConsultationSummaryVitalSignsSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional()
  {
		return ConsultationSummaryOperations.getAllergiesSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MedicationsSectionEntriesOptional getMedicationsSectionEntriesOptional()
  {
		return ConsultationSummaryOperations.getMedicationsSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ProblemSectionEntriesOptional getProblemSectionEntriesOptional()
  {
		return ConsultationSummaryOperations.getProblemSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ResultsSectionEntriesOptional getResultsSectionEntriesOptional()
  {
		return ConsultationSummaryOperations.getResultsSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AdvanceDirectivesSectionEntriesOptional getAdvanceDirectivesSectionEntriesOptional()
  {
		return ConsultationSummaryOperations.getAdvanceDirectivesSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EncountersSectionEntriesOptional getEncountersSectionEntriesOptional()
  {
		return ConsultationSummaryOperations.getEncountersSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FamilyHistorySection getFamilyHistorySection()
  {
		return ConsultationSummaryOperations.getFamilyHistorySection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FunctionalStatusSection getFunctionalStatusSection()
  {
		return ConsultationSummaryOperations.getFunctionalStatusSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ImmunizationsSectionEntriesOptional getImmunizationsSectionEntriesOptional()
  {
		return ConsultationSummaryOperations.getImmunizationsSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ProceduresSectionEntriesOptional getProceduresSectionEntriesOptional()
  {
		return ConsultationSummaryOperations.getProceduresSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MedicalEquipmentSection getMedicalEquipmentSection()
  {
		return ConsultationSummaryOperations.getMedicalEquipmentSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PayersSection getPayersSection()
  {
		return ConsultationSummaryOperations.getPayersSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PlanOfCareSection getPlanOfCareSection()
  {
		return ConsultationSummaryOperations.getPlanOfCareSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SocialHistorySection getSocialHistorySection()
  {
		return ConsultationSummaryOperations.getSocialHistorySection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional()
  {
		return ConsultationSummaryOperations.getVitalSignsSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return ConsultationSummaryOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
public ConsultationSummary init() {
    	CDAUtil.init(this);
    	return this;
	}
} //ConsultationSummaryImpl
