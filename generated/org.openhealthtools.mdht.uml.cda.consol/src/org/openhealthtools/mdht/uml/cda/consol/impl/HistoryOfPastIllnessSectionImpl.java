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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.HistoryOfPastIllnessSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History Of Past Illness Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HistoryOfPastIllnessSectionImpl extends SectionImpl implements HistoryOfPastIllnessSection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected HistoryOfPastIllnessSectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HISTORY_OF_PAST_ILLNESS_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateHistoryOfPastIllnessSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryOfPastIllnessSectionOperations.validateHistoryOfPastIllnessSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateHistoryOfPastIllnessSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryOfPastIllnessSectionOperations.validateHistoryOfPastIllnessSectionCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateHistoryOfPastIllnessSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryOfPastIllnessSectionOperations.validateHistoryOfPastIllnessSectionCodeP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateHistoryOfPastIllnessSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryOfPastIllnessSectionOperations.validateHistoryOfPastIllnessSectionTitle(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateHistoryOfPastIllnessSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryOfPastIllnessSectionOperations.validateHistoryOfPastIllnessSectionText(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateHistoryOfPastIllnessSectionProblemObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryOfPastIllnessSectionOperations.validateHistoryOfPastIllnessSectionProblemObservation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<ProblemObservation> getProblemObservations() {
		return HistoryOfPastIllnessSectionOperations.getProblemObservations(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public HistoryOfPastIllnessSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPastIllnessSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // HistoryOfPastIllnessSectionImpl
