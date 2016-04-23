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
import org.eclipse.mdht.uml.cda.impl.CriterionImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.consol.operations.PreconditionForSubstanceAdministrationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Precondition For Substance Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PreconditionForSubstanceAdministrationImpl extends CriterionImpl
		implements PreconditionForSubstanceAdministration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreconditionForSubstanceAdministrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePreconditionForSubstanceAdministrationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PreconditionForSubstanceAdministrationOperations.validatePreconditionForSubstanceAdministrationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreconditionForSubstanceAdministrationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PreconditionForSubstanceAdministrationOperations.validatePreconditionForSubstanceAdministrationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreconditionForSubstanceAdministrationText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PreconditionForSubstanceAdministrationOperations.validatePreconditionForSubstanceAdministrationText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreconditionForSubstanceAdministrationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PreconditionForSubstanceAdministrationOperations.validatePreconditionForSubstanceAdministrationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreconditionForSubstanceAdministration init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreconditionForSubstanceAdministration init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PreconditionForSubstanceAdministrationImpl
