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
import org.eclipse.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.CoverageActivity;
import org.openhealthtools.mdht.uml.cda.consol.PolicyActivity;
import org.openhealthtools.mdht.uml.cda.consol.operations.CoverageActivityOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CoverageActivityImpl extends ActImpl implements CoverageActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.COVERAGE_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivityCoverageActivityRelationshipSequenceNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CoverageActivityOperations.validateCoverageActivityCoverageActivityRelationshipSequenceNumber(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCoverageActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivityOperations.validateCoverageActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCoverageActivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivityOperations.validateCoverageActivityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCoverageActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivityOperations.validateCoverageActivityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCoverageActivityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivityOperations.validateCoverageActivityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCoverageActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivityOperations.validateCoverageActivityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCoverageActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivityOperations.validateCoverageActivityStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCoverageActivityPolicyActivity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivityOperations.validateCoverageActivityPolicyActivity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PolicyActivity> getPolicyActivities() {
		return CoverageActivityOperations.getPolicyActivities(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageActivity init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageActivity init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CoverageActivityImpl
