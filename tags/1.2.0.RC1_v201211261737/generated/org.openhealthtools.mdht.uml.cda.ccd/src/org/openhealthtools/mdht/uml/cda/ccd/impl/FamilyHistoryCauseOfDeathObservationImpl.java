/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryCauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.FamilyHistoryCauseOfDeathObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family History Cause Of Death Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FamilyHistoryCauseOfDeathObservationImpl extends FamilyHistoryObservationImpl implements
		FamilyHistoryCauseOfDeathObservation {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected FamilyHistoryCauseOfDeathObservationImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.FAMILY_HISTORY_CAUSE_OF_DEATH_OBSERVATION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFamilyHistoryCauseOfDeathObservationCauseOfDeathObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryCauseOfDeathObservationOperations.validateFamilyHistoryCauseOfDeathObservationCauseOfDeathObservation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<CauseOfDeathObservation> getCauseOfDeathObservations() {
		return FamilyHistoryCauseOfDeathObservationOperations.getCauseOfDeathObservations(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public boolean validateFamilyHistoryObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryCauseOfDeathObservationOperations.validateFamilyHistoryObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public FamilyHistoryCauseOfDeathObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilyHistoryCauseOfDeathObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // FamilyHistoryCauseOfDeathObservationImpl