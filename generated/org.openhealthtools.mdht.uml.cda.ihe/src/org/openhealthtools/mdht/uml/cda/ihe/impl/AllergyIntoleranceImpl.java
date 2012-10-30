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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance;
import org.openhealthtools.mdht.uml.cda.ihe.Comment;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntryReactionObservationContainer;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ihe.Severity;
import org.openhealthtools.mdht.uml.cda.ihe.operations.AllergyIntoleranceOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allergy Intolerance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AllergyIntoleranceImpl extends ProblemEntryImpl implements AllergyIntolerance {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected AllergyIntoleranceImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.ALLERGY_INTOLERANCE;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyIntoleranceCodeCodeSystemRequired(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceCodeCodeSystemRequired(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyIntoleranceDisplayNameCodeName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceDisplayNameCodeName(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyIntoleranceAllergySubstance(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceAllergySubstance(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyIntoleranceAllergySubstanceTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceAllergySubstanceTypeCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyIntoleranceAllergySubstanceParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceAllergySubstanceParticipantRole(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyIntoleranceAllergySubstanceParticipantRoleClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceAllergySubstanceParticipantRoleClassCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyIntoleranceAllergySubstancePlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceAllergySubstancePlayingEntity(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyIntoleranceAllergySubstancePlayingEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceAllergySubstancePlayingEntityClassCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyIntoleranceAllergySubstancePlayingEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceAllergySubstancePlayingEntityCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyIntolerancePlayingEntityCodeReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntolerancePlayingEntityCodeReference(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyIntoleranceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyIntoleranceCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyIntoleranceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceValue(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyIntoleranceProblemEntryReactionObservationContainer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceProblemEntryReactionObservationContainer(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyIntoleranceSeverity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceSeverity(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyIntoleranceProblemStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceProblemStatusObservation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyIntoleranceComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyIntoleranceOperations.validateAllergyIntoleranceComment(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<ProblemEntryReactionObservationContainer> getProblemEntryReactionObservationContainers() {
		return AllergyIntoleranceOperations.getProblemEntryReactionObservationContainers(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public Severity getIHESeverity() {
		return AllergyIntoleranceOperations.getIHESeverity(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ProblemStatusObservation getIHEProblemStatusObservation() {
		return AllergyIntoleranceOperations.getIHEProblemStatusObservation(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<Comment> getIHEComments() {
		return AllergyIntoleranceOperations.getIHEComments(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public AllergyIntolerance init() {
		return Initializer.Util.init(this);
	}

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	@Override
	public AllergyIntolerance init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AllergyIntoleranceImpl
