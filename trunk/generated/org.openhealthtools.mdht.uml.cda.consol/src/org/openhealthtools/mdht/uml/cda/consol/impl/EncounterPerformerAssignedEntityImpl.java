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
import org.openhealthtools.mdht.uml.cda.consol.EncounterPerformerAssignedEntity;
import org.openhealthtools.mdht.uml.cda.consol.operations.EncounterPerformerAssignedEntityOperations;
import org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounter Performer Assigned Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EncounterPerformerAssignedEntityImpl extends AssignedEntityImpl implements
		EncounterPerformerAssignedEntity {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EncounterPerformerAssignedEntityImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ConsolPackage.Literals.ENCOUNTER_PERFORMER_ASSIGNED_ENTITY;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEncounterPerformerAssignedEntityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EncounterPerformerAssignedEntityOperations.validateEncounterPerformerAssignedEntityCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EncounterPerformerAssignedEntity init() {
    	CDAUtil.init(this);
    	return this;
  }
} // EncounterPerformerAssignedEntityImpl
