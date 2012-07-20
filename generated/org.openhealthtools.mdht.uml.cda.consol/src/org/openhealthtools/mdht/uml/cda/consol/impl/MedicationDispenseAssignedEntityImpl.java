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
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispenseAssignedEntity;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationDispenseAssignedEntityOperations;
import org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Dispense Assigned Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationDispenseAssignedEntityImpl extends AssignedEntityImpl implements
		MedicationDispenseAssignedEntity {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected MedicationDispenseAssignedEntityImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ConsolPackage.Literals.MEDICATION_DISPENSE_ASSIGNED_ENTITY;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationDispenseAssignedEntityAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationDispenseAssignedEntityOperations.validateMedicationDispenseAssignedEntityAddr(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MedicationDispenseAssignedEntity init() {
    	CDAUtil.init(this);
    	return this;
  }
} // MedicationDispenseAssignedEntityImpl
