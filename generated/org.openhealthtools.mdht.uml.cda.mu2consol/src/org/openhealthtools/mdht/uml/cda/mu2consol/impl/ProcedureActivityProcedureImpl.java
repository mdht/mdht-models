/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.ProcedureActivityProcedureOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Procedure Activity Procedure</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProcedureActivityProcedureImpl
		extends
		org.openhealthtools.mdht.uml.cda.consol.impl.ProcedureActivityProcedureImpl
		implements ProcedureActivityProcedure {
	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	protected ProcedureActivityProcedureImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return Mu2consolPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMU2CONSOLProcedureActivityProcedureCodeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ProcedureActivityProcedureOperations.validateMU2CONSOLProcedureActivityProcedureCodeValue(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMU2CONSOLProcedureActivityProcedureCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ProcedureActivityProcedureOperations.validateMU2CONSOLProcedureActivityProcedureCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateProcedureActivityProcedureTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public ProcedureActivityProcedure init() {
      return Initializer.Util.init(this);
  }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ProcedureActivityProcedure init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ProcedureActivityProcedureImpl
