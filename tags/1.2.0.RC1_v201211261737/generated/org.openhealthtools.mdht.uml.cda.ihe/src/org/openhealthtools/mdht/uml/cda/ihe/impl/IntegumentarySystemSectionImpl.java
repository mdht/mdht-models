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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IntegumentarySystemSection;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.operations.IntegumentarySystemSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integumentary System Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IntegumentarySystemSectionImpl extends SectionImpl implements IntegumentarySystemSection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected IntegumentarySystemSectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.INTEGUMENTARY_SYSTEM_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIntegumentarySystemSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IntegumentarySystemSectionOperations.validateIntegumentarySystemSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIntegumentarySystemSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IntegumentarySystemSectionOperations.validateIntegumentarySystemSectionCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIntegumentarySystemSectionProblemEntry(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return IntegumentarySystemSectionOperations.validateIntegumentarySystemSectionProblemEntry(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ProblemEntry getProblemEntry() {
		return IntegumentarySystemSectionOperations.getProblemEntry(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public IntegumentarySystemSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegumentarySystemSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // IntegumentarySystemSectionImpl
