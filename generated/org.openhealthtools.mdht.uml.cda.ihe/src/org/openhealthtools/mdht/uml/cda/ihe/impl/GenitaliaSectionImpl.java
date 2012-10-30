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
import org.openhealthtools.mdht.uml.cda.ihe.GenitaliaSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.operations.GenitaliaSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Genitalia Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GenitaliaSectionImpl extends SectionImpl implements GenitaliaSection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected GenitaliaSectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.GENITALIA_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateGenitaliaSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GenitaliaSectionOperations.validateGenitaliaSectionTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateGenitaliaSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GenitaliaSectionOperations.validateGenitaliaSectionCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateGenitaliaSectionProblemEntry(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GenitaliaSectionOperations.validateGenitaliaSectionProblemEntry(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ProblemEntry getProblemEntry() {
		return GenitaliaSectionOperations.getProblemEntry(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public GenitaliaSection init() {
		return Initializer.Util.init(this);
	}

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	public GenitaliaSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // GenitaliaSectionImpl
