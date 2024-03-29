/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.operations.AlertsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alerts Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AlertsSectionImpl extends SectionImpl implements AlertsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlertsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.ALERTS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AlertsSectionOperations.validateAlertsSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AlertsSectionOperations.validateAlertsSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertsSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AlertsSectionOperations.validateAlertsSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertsSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AlertsSectionOperations.validateAlertsSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertsSectionProblemAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AlertsSectionOperations.validateAlertsSectionProblemAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProblemAct> getProblemActs() {
		return AlertsSectionOperations.getProblemActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertsSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AlertsSectionImpl
