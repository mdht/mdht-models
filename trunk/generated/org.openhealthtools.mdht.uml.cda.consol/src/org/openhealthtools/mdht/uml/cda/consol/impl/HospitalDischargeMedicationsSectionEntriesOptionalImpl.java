/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DischargeMedication;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalDischargeMedicationsSectionEntriesOptionalOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hospital Discharge Medications Section Entries Optional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HospitalDischargeMedicationsSectionEntriesOptionalImpl extends SectionImpl implements
		HospitalDischargeMedicationsSectionEntriesOptional {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected HospitalDischargeMedicationsSectionEntriesOptionalImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalDischargeMedicationsSectionEntriesOptionalOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateHospitalDischargeMedicationsSectionEntriesOptionalCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalDischargeMedicationsSectionEntriesOptionalOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateHospitalDischargeMedicationsSectionEntriesOptionalCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalDischargeMedicationsSectionEntriesOptionalOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeMedicationsSectionEntriesOptionalTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalDischargeMedicationsSectionEntriesOptionalOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalTitle(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateHospitalDischargeMedicationsSectionEntriesOptionalText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalDischargeMedicationsSectionEntriesOptionalOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalText(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HospitalDischargeMedicationsSectionEntriesOptionalOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<DischargeMedication> getDischargeMedications() {
		return HospitalDischargeMedicationsSectionEntriesOptionalOperations.getDischargeMedications(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public HospitalDischargeMedicationsSectionEntriesOptional init() {
		return Initializer.Util.init(this);
	}

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	public HospitalDischargeMedicationsSectionEntriesOptional init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // HospitalDischargeMedicationsSectionEntriesOptionalImpl
