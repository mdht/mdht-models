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
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.OperativeNoteSurgicalProcedureSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operative Note Surgical Procedure Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OperativeNoteSurgicalProcedureSectionImpl extends SectionImpl implements
		OperativeNoteSurgicalProcedureSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperativeNoteSurgicalProcedureSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteSurgicalProcedureSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteSurgicalProcedureSectionOperations.validateOperativeNoteSurgicalProcedureSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteSurgicalProcedureSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteSurgicalProcedureSectionOperations.validateOperativeNoteSurgicalProcedureSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteSurgicalProcedureSectionCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteSurgicalProcedureSectionOperations.validateOperativeNoteSurgicalProcedureSectionCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteSurgicalProcedureSectionText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteSurgicalProcedureSectionOperations.validateOperativeNoteSurgicalProcedureSectionText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOperativeNoteSurgicalProcedureSectionTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteSurgicalProcedureSectionOperations.validateOperativeNoteSurgicalProcedureSectionTitle(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperativeNoteSurgicalProcedureSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperativeNoteSurgicalProcedureSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // OperativeNoteSurgicalProcedureSectionImpl
