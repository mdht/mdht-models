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
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.PHRExtract;
import org.openhealthtools.mdht.uml.cda.ihe.operations.PHRExtractOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PHR Extract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PHRExtractImpl extends MedicalSummaryImpl implements PHRExtract {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected PHRExtractImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.PHR_EXTRACT;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePHRExtractTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PHRExtractOperations.validatePHRExtractTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public PHRExtract init() {
		return Initializer.Util.init(this);
	}

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	@Override
	public PHRExtract init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PHRExtractImpl
