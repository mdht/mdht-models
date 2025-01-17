/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.TransitionOfCareInpatientSummaryOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Transition Of Care Inpatient Summary</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class TransitionOfCareInpatientSummaryImpl extends SummaryOfCareRecordImpl
		implements TransitionOfCareInpatientSummary {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TransitionOfCareInpatientSummaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.TRANSITION_OF_CARE_INPATIENT_SUMMARY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean validateTransitionOfCareInpatientSummaryMedications(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransitionOfCareInpatientSummaryOperations.validateTransitionOfCareInpatientSummaryMedications(this,
				diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean validateTransitionOfCareInpatientSummaryEncounterDiagnoses(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransitionOfCareInpatientSummaryOperations
				.validateTransitionOfCareInpatientSummaryEncounterDiagnoses(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransitionOfCareInpatientSummaryOperations
				.validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(this, diagnostics,
						context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HospitalDischargeInstructionsSection getHospitalDischargeInstructionsSection() {
		return TransitionOfCareInpatientSummaryOperations.getHospitalDischargeInstructionsSection(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TransitionOfCareInpatientSummary init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TransitionOfCareInpatientSummary init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // TransitionOfCareInpatientSummaryImpl
