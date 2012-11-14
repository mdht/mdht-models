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
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.operations.SocialHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Social History Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SocialHistorySectionImpl extends SectionImpl implements SocialHistorySection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected SocialHistorySectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.SOCIAL_HISTORY_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSocialHistorySectionMaritalStatus(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionMaritalStatus(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSocialHistorySectionReligiousAffiliation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionReligiousAffiliation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSocialHistorySectionPatientRace(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionPatientRace(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSocialHistorySectionPatientRaceCodeSystem(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionPatientRaceCodeSystem(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSocialHistorySectionPatientEthnicity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionPatientEthnicity(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSocialHistorySectionPatientEthnicityCodeSystem(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionPatientEthnicityCodeSystem(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSocialHistorySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSocialHistorySectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSocialHistorySectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionTitle(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSocialHistorySectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionText(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSocialHistorySectionSocialHistoryObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistorySectionOperations.validateSocialHistorySectionSocialHistoryObservation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<SocialHistoryObservation> getSocialHistoryObservations() {
		return SocialHistorySectionOperations.getSocialHistoryObservations(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public SocialHistorySection init() {
		return Initializer.Util.init(this);
	}

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	public SocialHistorySection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // SocialHistorySectionImpl
