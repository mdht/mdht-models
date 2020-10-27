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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureEstimatedBloodLossSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Estimated Blood Loss Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProcedureEstimatedBloodLossSectionImpl extends SectionImpl implements ProcedureEstimatedBloodLossSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureEstimatedBloodLossSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEstimatedBloodLossSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureEstimatedBloodLossSectionOperations.validateProcedureEstimatedBloodLossSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEstimatedBloodLossSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureEstimatedBloodLossSectionOperations.validateProcedureEstimatedBloodLossSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEstimatedBloodLossSectionCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureEstimatedBloodLossSectionOperations.validateProcedureEstimatedBloodLossSectionCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEstimatedBloodLossSectionText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureEstimatedBloodLossSectionOperations.validateProcedureEstimatedBloodLossSectionText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEstimatedBloodLossSectionTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureEstimatedBloodLossSectionOperations.validateProcedureEstimatedBloodLossSectionTitle(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureEstimatedBloodLossSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureEstimatedBloodLossSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProcedureEstimatedBloodLossSectionImpl
