/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.AgeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.PatientInstruction;
import org.openhealthtools.mdht.uml.cda.ccd.operations.EncountersActivityOperations;
import org.openhealthtools.mdht.uml.cda.ihe.EncounterActivity;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.operations.EncounterActivityOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounter Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EncounterActivityImpl extends EncounterEntryImpl implements EncounterActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.ENCOUNTER_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivityHasIndications(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivityOperations.validateEncountersActivityHasIndications(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivityHasPractitioners(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivityOperations.validateEncountersActivityHasPractitioners(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivityPractitionerRole(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivityOperations.validateEncountersActivityPractitionerRole(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterActivityOperations.validateEncountersActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivityOperations.validateEncountersActivityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivityOperations.validateEncountersActivityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivityOperations.validateEncountersActivityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivityEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivityOperations.validateEncountersActivityEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivityPatientInstruction(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivityOperations.validateEncountersActivityPatientInstruction(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivityAgeObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivityOperations.validateEncountersActivityAgeObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivityEncounterLocation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivityOperations.validateEncountersActivityEncounterLocation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientInstruction> getPatientInstructions() {
		return EncountersActivityOperations.getPatientInstructions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgeObservation getAgeObservation() {
		return EncountersActivityOperations.getAgeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterActivity init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterActivity init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EncounterActivityImpl
