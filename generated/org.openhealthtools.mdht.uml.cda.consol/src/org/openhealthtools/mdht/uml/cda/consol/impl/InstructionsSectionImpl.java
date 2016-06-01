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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.InstructionsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instructions Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InstructionsSectionImpl extends SectionImpl implements InstructionsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.INSTRUCTIONS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstructionsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InstructionsSectionOperations.validateInstructionsSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstructionsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InstructionsSectionOperations.validateInstructionsSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstructionsSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InstructionsSectionOperations.validateInstructionsSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstructionsSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InstructionsSectionOperations.validateInstructionsSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstructionsSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InstructionsSectionOperations.validateInstructionsSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstructionsSectionInstructions(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InstructionsSectionOperations.validateInstructionsSectionInstructions(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instructions> getInstructionss() {
		return InstructionsSectionOperations.getInstructionss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionsSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // InstructionsSectionImpl
