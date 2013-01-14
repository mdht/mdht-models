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

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ImmunizationsSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunizations Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ImmunizationsSectionImpl extends SectionImpl implements ImmunizationsSection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ImmunizationsSectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.IMMUNIZATIONS_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateImmunizationsSectionHasMedicationOrSupplyActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationsSectionOperations.validateImmunizationsSectionHasMedicationOrSupplyActivity(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateImmunizationsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationsSectionOperations.validateImmunizationsSectionTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateImmunizationsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationsSectionOperations.validateImmunizationsSectionCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateImmunizationsSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationsSectionOperations.validateImmunizationsSectionTitle(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateImmunizationsSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationsSectionOperations.validateImmunizationsSectionText(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateImmunizationsSectionMedicationActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationsSectionOperations.validateImmunizationsSectionMedicationActivity(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateImmunizationsSectionSupplyActivity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationsSectionOperations.validateImmunizationsSectionSupplyActivity(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<MedicationActivity> getMedicationActivities() {
		return ImmunizationsSectionOperations.getMedicationActivities(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<SupplyActivity> getSupplyActivities() {
		return ImmunizationsSectionOperations.getSupplyActivities(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ImmunizationsSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ImmunizationsSectionImpl
