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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection;
import org.openhealthtools.mdht.uml.cda.ihe.ExternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry;
import org.openhealthtools.mdht.uml.cda.ihe.SimpleObservation;
import org.openhealthtools.mdht.uml.cda.ihe.operations.CodedResultsSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coded Results Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CodedResultsSectionImpl extends SectionImpl implements CodedResultsSection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected CodedResultsSectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.CODED_RESULTS_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCodedResultsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CodedResultsSectionOperations.validateCodedResultsSectionTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCodedResultsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CodedResultsSectionOperations.validateCodedResultsSectionCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCodedResultsSectionProcedureEntry(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CodedResultsSectionOperations.validateCodedResultsSectionProcedureEntry(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCodedResultsSectionExternalReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CodedResultsSectionOperations.validateCodedResultsSectionExternalReference(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCodedResultsSectionSimpleObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CodedResultsSectionOperations.validateCodedResultsSectionSimpleObservation(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<ProcedureEntry> getProcedureEntries() {
		return CodedResultsSectionOperations.getProcedureEntries(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<ExternalReference> getExternalReferences() {
		return CodedResultsSectionOperations.getExternalReferences(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<SimpleObservation> getSimpleObservations() {
		return CodedResultsSectionOperations.getSimpleObservations(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public CodedResultsSection init() {
		return Initializer.Util.init(this);
	}

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	public CodedResultsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CodedResultsSectionImpl
