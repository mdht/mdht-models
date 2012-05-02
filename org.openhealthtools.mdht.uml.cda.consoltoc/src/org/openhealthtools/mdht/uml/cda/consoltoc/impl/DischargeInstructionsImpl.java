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
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;

import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.impl.GeneralHeaderConstraintsImpl;

import org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocPackage;
import org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions;

import org.openhealthtools.mdht.uml.cda.consoltoc.operations.DischargeInstructionsOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discharge Instructions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DischargeInstructionsImpl extends GeneralHeaderConstraintsImpl implements DischargeInstructions
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DischargeInstructionsImpl()
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
		return ConsoltocPackage.Literals.DISCHARGE_INSTRUCTIONS;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeInstructionsPlanOfCareSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeInstructionsOperations.validateDischargeInstructionsPlanOfCareSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeInstructionsAllergiesSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeInstructionsOperations.validateDischargeInstructionsAllergiesSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeInstructionsProblemSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeInstructionsOperations.validateDischargeInstructionsProblemSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeInstructionsHospitalDischargeMedicationsSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeInstructionsOperations.validateDischargeInstructionsHospitalDischargeMedicationsSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeInstructionsAdvanceDirectivesSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeInstructionsOperations.validateDischargeInstructionsAdvanceDirectivesSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeInstructionsImmunizationsSectionEntriesOptional(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeInstructionsOperations.validateDischargeInstructionsImmunizationsSectionEntriesOptional(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeInstructionsMedicalEquipmentSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeInstructionsOperations.validateDischargeInstructionsMedicalEquipmentSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PlanOfCareSection getPlanOfCareSection()
  {
		return DischargeInstructionsOperations.getPlanOfCareSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional()
  {
		return DischargeInstructionsOperations.getAllergiesSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ProblemSectionEntriesOptional getProblemSectionEntriesOptional()
  {
		return DischargeInstructionsOperations.getProblemSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HospitalDischargeMedicationsSectionEntriesOptional getHospitalDischargeMedicationsSectionEntriesOptional()
  {
		return DischargeInstructionsOperations.getHospitalDischargeMedicationsSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AdvanceDirectivesSectionEntriesOptional getAdvanceDirectivesSectionEntriesOptional()
  {
		return DischargeInstructionsOperations.getAdvanceDirectivesSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ImmunizationsSectionEntriesOptional getImmunizationsSectionEntriesOptional()
  {
		return DischargeInstructionsOperations.getImmunizationsSectionEntriesOptional(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MedicalEquipmentSection getMedicalEquipmentSection()
  {
		return DischargeInstructionsOperations.getMedicalEquipmentSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return DischargeInstructionsOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
public DischargeInstructions init() {
    	CDAUtil.init(this);
    	return this;
	}
} //DischargeInstructionsImpl
