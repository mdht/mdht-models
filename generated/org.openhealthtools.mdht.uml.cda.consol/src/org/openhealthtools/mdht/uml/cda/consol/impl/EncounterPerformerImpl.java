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
import org.openhealthtools.mdht.uml.cda.consol.EncounterPerformer;
import org.openhealthtools.mdht.uml.cda.consol.operations.EncounterPerformerOperations;
import org.openhealthtools.mdht.uml.cda.impl.Performer2Impl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounter Performer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EncounterPerformerImpl extends Performer2Impl implements EncounterPerformer {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EncounterPerformerImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ConsolPackage.Literals.ENCOUNTER_PERFORMER;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEncounterPerformerEncounterPerformerAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return EncounterPerformerOperations.validateEncounterPerformerEncounterPerformerAssignedEntity(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEncounterPerformerEncounterPerformerAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return EncounterPerformerOperations.validateEncounterPerformerEncounterPerformerAssignedEntityCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EncounterPerformer init() {
    	CDAUtil.init(this);
    	return this;
  }
} // EncounterPerformerImpl
