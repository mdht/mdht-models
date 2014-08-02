/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.impl.ProblemActImpl;
import org.openhealthtools.mdht.uml.cda.ihe.ConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ConcernEntryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concern Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConcernEntryImpl extends ProblemActImpl implements ConcernEntry {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ConcernEntryImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.CONCERN_ENTRY;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConcernEntryEffectiveTimeLowHigh(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcernEntryOperations.validateConcernEntryEffectiveTimeLowHigh(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConcernEntryHasRelatedObservations(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcernEntryOperations.validateConcernEntryHasRelatedObservations(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConcernEntryRelatedObservationsTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConcernEntryOperations.validateConcernEntryRelatedObservationsTypeCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConcernEntryHasRelatedReferencesTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConcernEntryOperations.validateConcernEntryHasRelatedReferencesTypeCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConcernEntryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcernEntryOperations.validateConcernEntryTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConcernEntryEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcernEntryOperations.validateConcernEntryEffectiveTime(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public ConcernEntry init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcernEntry init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ConcernEntryImpl
