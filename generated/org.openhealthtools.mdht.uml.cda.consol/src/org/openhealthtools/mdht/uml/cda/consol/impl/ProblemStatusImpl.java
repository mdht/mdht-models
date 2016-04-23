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
import org.openhealthtools.mdht.uml.cda.consol.ProblemStatus;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemStatusOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProblemStatusImpl extends ObservationImpl implements ProblemStatus {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROBLEM_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemStatusOperations.validateProblemStatusTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemStatusOperations.validateProblemStatusReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusTextReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemStatusOperations.validateProblemStatusTextReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemStatusOperations.validateProblemStatusTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemStatusOperations.validateProblemStatusClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemStatusOperations.validateProblemStatusMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemStatusOperations.validateProblemStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemStatusOperations.validateProblemStatusStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemStatusOperations.validateProblemStatusText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemStatusOperations.validateProblemStatusValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemStatus init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProblemStatus init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ProblemStatusImpl
