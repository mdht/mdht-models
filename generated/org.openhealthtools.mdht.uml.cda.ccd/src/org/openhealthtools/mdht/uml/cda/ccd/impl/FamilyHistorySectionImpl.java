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
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.operations.FamilyHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family History Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FamilyHistorySectionImpl extends SectionImpl implements FamilyHistorySection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected FamilyHistorySectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.FAMILY_HISTORY_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFamilyHistorySectionFamilyHistoryObsOrgs(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistorySectionOperations.validateFamilyHistorySectionFamilyHistoryObsOrgs(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFamilyHistorySectionNoSubject(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistorySectionOperations.validateFamilyHistorySectionNoSubject(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFamilyHistorySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistorySectionOperations.validateFamilyHistorySectionTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFamilyHistorySectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistorySectionOperations.validateFamilyHistorySectionCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFamilyHistorySectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistorySectionOperations.validateFamilyHistorySectionTitle(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFamilyHistorySectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistorySectionOperations.validateFamilyHistorySectionText(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFamilyHistorySectionFamilyHistoryOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistorySectionOperations.validateFamilyHistorySectionFamilyHistoryOrganizer(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<FamilyHistoryOrganizer> getFamilyHistoryOrganizers() {
		return FamilyHistorySectionOperations.getFamilyHistoryOrganizers(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public FamilyHistorySection init() {
		return Initializer.Util.init(this);
	}

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	public FamilyHistorySection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // FamilyHistorySectionImpl
