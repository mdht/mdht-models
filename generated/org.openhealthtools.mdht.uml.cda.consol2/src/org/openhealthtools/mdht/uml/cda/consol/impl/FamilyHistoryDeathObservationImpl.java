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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.FamilyHistoryDeathObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family History Death Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FamilyHistoryDeathObservationImpl extends ObservationImpl implements FamilyHistoryDeathObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyHistoryDeathObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.FAMILY_HISTORY_DEATH_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFamilyHistoryDeathObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFamilyHistoryDeathObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFamilyHistoryDeathObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFamilyHistoryDeathObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFamilyHistoryDeathObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFamilyHistoryDeathObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFamilyHistoryDeathObservationValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilyHistoryDeathObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilyHistoryDeathObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // FamilyHistoryDeathObservationImpl
