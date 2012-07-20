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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimen;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureSpecimenOperations;
import org.openhealthtools.mdht.uml.cda.impl.SpecimenImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Specimen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProcedureSpecimenImpl extends SpecimenImpl implements ProcedureSpecimen {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ProcedureSpecimenImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ConsolPackage.Literals.PROCEDURE_SPECIMEN;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProcedureSpecimenSpecimenRole(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ProcedureSpecimenOperations.validateProcedureSpecimenSpecimenRole(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProcedureSpecimenSpecimentRoleId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ProcedureSpecimenOperations.validateProcedureSpecimenSpecimentRoleId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateProcedureSpecimenTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ProcedureSpecimenOperations.validateProcedureSpecimenTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ProcedureSpecimen init() {
    	CDAUtil.init(this);
    	return this;
  }
} // ProcedureSpecimenImpl
