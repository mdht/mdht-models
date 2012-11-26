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
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.VitalSignsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vital Signs Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VitalSignsSectionImpl extends VitalSignsSectionEntriesOptionalImpl implements VitalSignsSection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected VitalSignsSectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.VITAL_SIGNS_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateVitalSignsSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsSectionOperations.validateVitalSignsSectionCodeP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateVitalSignsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsSectionOperations.validateVitalSignsSectionCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateVitalSignsSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsSectionOperations.validateVitalSignsSectionTitle(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateVitalSignsSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsSectionOperations.validateVitalSignsSectionText(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateVitalSignsSectionVitalSignsOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsSectionOperations.validateVitalSignsSectionVitalSignsOrganizer(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<VitalSignsOrganizer> getConsolVitalSignsOrganizers() {
		return VitalSignsSectionOperations.getConsolVitalSignsOrganizers(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public boolean validateVitalSignsSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignsSectionOperations.validateVitalSignsSectionEntriesOptionalTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public VitalSignsSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSignsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // VitalSignsSectionImpl
