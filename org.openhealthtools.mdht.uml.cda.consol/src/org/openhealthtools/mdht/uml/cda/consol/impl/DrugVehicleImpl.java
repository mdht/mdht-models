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
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DrugVehicle;
import org.openhealthtools.mdht.uml.cda.consol.operations.DrugVehicleOperations;
import org.openhealthtools.mdht.uml.cda.impl.ParticipantRoleImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drug Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DrugVehicleImpl extends ParticipantRoleImpl implements DrugVehicle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DrugVehicleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DRUG_VEHICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDrugVehiclePlayingEntityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugVehicleOperations.validateDrugVehiclePlayingEntityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDrugVehiclePlayingEntityName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugVehicleOperations.validateDrugVehiclePlayingEntityName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDrugVehicleTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugVehicleOperations.validateDrugVehicleTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDrugVehicleClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugVehicleOperations.validateDrugVehicleClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDrugVehicleCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugVehicleOperations.validateDrugVehicleCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDrugVehiclePlayingEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugVehicleOperations.validateDrugVehiclePlayingEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugVehicle init() {
    	CDAUtil.init(this);
    	return this;
	}
} // DrugVehicleImpl
