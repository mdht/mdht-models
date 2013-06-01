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
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.operations.FamilyHistoryOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family History Organizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FamilyHistoryOrganizerImpl extends OrganizerImpl implements FamilyHistoryOrganizer {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected FamilyHistoryOrganizerImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFamilyHistoryOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFamilyHistoryOrganizerClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerClassCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFamilyHistoryOrganizerMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerMoodCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFamilyHistoryOrganizerFamilyHistoryObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerFamilyHistoryObservation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFamilyHistoryOrganizerSubject(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubject(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonBirthTime(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonBirthTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedInd(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedTime(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubjectRelatedSubjectClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubjectRelatedSubjectCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubjectRelatedSubjectCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectSubject(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubjectRelatedSubjectSubject(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizerSubjectRelatedSubject(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubjectRelatedSubject(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FamilyHistoryObservation> getFamilyHistoryObservations() {
		return FamilyHistoryOrganizerOperations.getFamilyHistoryObservations(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public FamilyHistoryOrganizer init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // FamilyHistoryOrganizerImpl
