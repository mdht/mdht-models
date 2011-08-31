/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Medication;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.HospitalDischargeMedicationsSectionOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hospital Discharge Medications Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HospitalDischargeMedicationsSectionImpl extends
		org.openhealthtools.mdht.uml.cda.ihe.impl.HospitalDischargeMedicationsSectionImpl implements
		HospitalDischargeMedicationsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalDischargeMedicationsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HITSPPackage.Literals.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPHospitalDischargeMedicationsSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalDischargeMedicationsSectionOperations.validateHITSPHospitalDischargeMedicationsSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPHospitalDischargeMedicationsSectionMedication(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalDischargeMedicationsSectionOperations.validateHITSPHospitalDischargeMedicationsSectionMedication(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medication getHITSPMedication() {
		return HospitalDischargeMedicationsSectionOperations.getHITSPMedication(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalDischargeMedicationsSection init() {
		CDAUtil.init(this);
		return this;
	}
} // HospitalDischargeMedicationsSectionImpl
