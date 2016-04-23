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
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DischargeMedication;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalDischargeMedicationsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hospital Discharge Medications Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HospitalDischargeMedicationsSectionImpl extends HospitalDischargeMedicationsSectionEntriesOptionalImpl
		implements HospitalDischargeMedicationsSection {
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
		return ConsolPackage.Literals.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DischargeMedication> getConsolDischargeMedications() {
		return HospitalDischargeMedicationsSectionOperations.getConsolDischargeMedications(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalDischargeMedicationsSectionOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHospitalDischargeMedicationsSectionEntriesOptionalCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalDischargeMedicationsSectionOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHospitalDischargeMedicationsSectionEntriesOptionalCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalDischargeMedicationsSectionOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHospitalDischargeMedicationsSectionEntriesOptionalText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalDischargeMedicationsSectionOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHospitalDischargeMedicationsSectionEntriesOptionalTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalDischargeMedicationsSectionOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HospitalDischargeMedicationsSectionOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeMedicationsSection init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HospitalDischargeMedicationsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // HospitalDischargeMedicationsSectionImpl
