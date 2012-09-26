/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.anthrax.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPackage;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPossibleExpossureLocationAndTypeAct;

import org.openhealthtools.mdht.uml.cda.phcr.anthrax.operations.AnthraxPossibleExpossureLocationAndTypeActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Possible Expossure Location And Type Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnthraxPossibleExpossureLocationAndTypeActImpl extends ActImpl implements AnthraxPossibleExpossureLocationAndTypeAct {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AnthraxPossibleExpossureLocationAndTypeActImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return AnthraxPackage.Literals.ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAnthraxPossibleExpossureLocationAndTypeActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AnthraxPossibleExpossureLocationAndTypeActOperations.validateAnthraxPossibleExpossureLocationAndTypeActTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAnthraxPossibleExpossureLocationAndTypeActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AnthraxPossibleExpossureLocationAndTypeActOperations.validateAnthraxPossibleExpossureLocationAndTypeActClassCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAnthraxPossibleExpossureLocationAndTypeActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AnthraxPossibleExpossureLocationAndTypeActOperations.validateAnthraxPossibleExpossureLocationAndTypeActMoodCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAnthraxPossibleExpossureLocationAndTypeActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AnthraxPossibleExpossureLocationAndTypeActOperations.validateAnthraxPossibleExpossureLocationAndTypeActCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAnthraxPossibleExpossureLocationAndTypeActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AnthraxPossibleExpossureLocationAndTypeActOperations.validateAnthraxPossibleExpossureLocationAndTypeActStatusCode(this, diagnostics, context);
  }
} //AnthraxPossibleExpossureLocationAndTypeActImpl
