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

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.SeverityObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ReactionObservationOperations;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntryReactionObservationContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem Entry Reaction Observation Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProblemEntryReactionObservationContainerImpl extends ProblemEntryImpl
		implements ProblemEntryReactionObservationContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemEntryReactionObservationContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservationHasReactionIntervention(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationHasReactionIntervention(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservationReactionInterventionTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationReactionInterventionTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservationReactionInterventionType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationReactionInterventionType(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservationSeverityObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReactionObservationOperations.validateReactionObservationSeverityObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityObservation getSeverityObservation() {
		return ReactionObservationOperations.getSeverityObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemEntryReactionObservationContainer init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemEntryReactionObservationContainer init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProblemEntryReactionObservationContainerImpl
