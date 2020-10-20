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
import org.eclipse.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureSpecimensTakenSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Specimens Taken Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProcedureSpecimensTakenSectionImpl extends SectionImpl implements ProcedureSpecimensTakenSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureSpecimensTakenSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROCEDURE_SPECIMENS_TAKEN_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureSpecimensTakenSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureSpecimensTakenSectionOperations.validateProcedureSpecimensTakenSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureSpecimensTakenSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureSpecimensTakenSectionOperations.validateProcedureSpecimensTakenSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureSpecimensTakenSectionCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureSpecimensTakenSectionOperations.validateProcedureSpecimensTakenSectionCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureSpecimensTakenSectionText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureSpecimensTakenSectionOperations.validateProcedureSpecimensTakenSectionText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureSpecimensTakenSectionTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureSpecimensTakenSectionOperations.validateProcedureSpecimensTakenSectionTitle(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureSpecimensTakenSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureSpecimensTakenSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProcedureSpecimensTakenSectionImpl
