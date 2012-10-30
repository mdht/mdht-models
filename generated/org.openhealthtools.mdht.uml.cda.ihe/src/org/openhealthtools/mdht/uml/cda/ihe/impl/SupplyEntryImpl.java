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
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.impl.SupplyActivityImpl;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationFullfillmentInstructions;
import org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry;
import org.openhealthtools.mdht.uml.cda.ihe.operations.SupplyEntryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supply Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SupplyEntryImpl extends SupplyActivityImpl implements SupplyEntry {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected SupplyEntryImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.SUPPLY_ENTRY;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSupplyEntryHasIntentAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyEntryOperations.validateSupplyEntryHasIntentAuthor(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSupplyEntryHasAuthorTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyEntryOperations.validateSupplyEntryHasAuthorTime(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSupplyEntryHasAssignedAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyEntryOperations.validateSupplyEntryHasAssignedAuthor(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSupplyEntryHasAssignedAuthorID(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyEntryOperations.validateSupplyEntryHasAssignedAuthorID(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSupplyEntryHasAssignedAuthorPersonOrOrg(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SupplyEntryOperations.validateSupplyEntryHasAssignedAuthorPersonOrOrg(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSupplyEntryHasPerformerTimeEvent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyEntryOperations.validateSupplyEntryHasPerformerTimeEvent(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSupplyEntryHasPerformerTimeIntent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyEntryOperations.validateSupplyEntryHasPerformerTimeIntent(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSupplyEntryHasPerformerAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SupplyEntryOperations.validateSupplyEntryHasPerformerAssignedEntity(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSupplyEntryHasPerformerAssignedEntityID(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SupplyEntryOperations.validateSupplyEntryHasPerformerAssignedEntityID(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSupplyEntryHasPerformerEntityPersonOrOrg(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SupplyEntryOperations.validateSupplyEntryHasPerformerEntityPersonOrOrg(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSupplyEntryQuantityHasValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyEntryOperations.validateSupplyEntryQuantityHasValue(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSupplyEntryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyEntryOperations.validateSupplyEntryTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSupplyEntryQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyEntryOperations.validateSupplyEntryQuantity(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSupplyEntryRepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyEntryOperations.validateSupplyEntryRepeatNumber(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSupplyEntryMedicationFullfillmentInstructions(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SupplyEntryOperations.validateSupplyEntryMedicationFullfillmentInstructions(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public MedicationFullfillmentInstructions getMedicationFullfillmentInstructions() {
		return SupplyEntryOperations.getMedicationFullfillmentInstructions(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public SupplyEntry init() {
		return Initializer.Util.init(this);
	}

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	@Override
	public SupplyEntry init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // SupplyEntryImpl
