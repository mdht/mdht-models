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

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Indication;
import org.openhealthtools.mdht.uml.cda.consol.operations.IndicationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indication</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IndicationImpl extends ObservationImpl implements Indication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.INDICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIndicationCodeNullFlavor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IndicationOperations.validateIndicationCodeNullFlavor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIndicationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IndicationOperations.validateIndicationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIndicationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IndicationOperations.validateIndicationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIndicationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IndicationOperations.validateIndicationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIndicationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IndicationOperations.validateIndicationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIndicationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IndicationOperations.validateIndicationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIndicationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IndicationOperations.validateIndicationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIndicationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IndicationOperations.validateIndicationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIndicationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IndicationOperations.validateIndicationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIndicationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IndicationOperations.validateIndicationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIndicationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IndicationOperations.validateIndicationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Indication init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Indication init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // IndicationImpl
