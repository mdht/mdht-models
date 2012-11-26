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
package org.openhealthtools.mdht.uml.cda.hitsp.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.cdt.operations.ReviewOfSystemsSectionOperations;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.ReviewOfSystemsSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Review Of Systems Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReviewOfSystemsSectionImpl extends org.openhealthtools.mdht.uml.cda.ihe.impl.ReviewOfSystemsSectionImpl
		implements ReviewOfSystemsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReviewOfSystemsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HITSPPackage.Literals.REVIEW_OF_SYSTEMS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReviewOfSystemsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReviewOfSystemsSectionOperations.validateReviewOfSystemsSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReviewOfSystemsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReviewOfSystemsSectionOperations.validateReviewOfSystemsSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPReviewOfSystemsSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return org.openhealthtools.mdht.uml.cda.hitsp.operations.ReviewOfSystemsSectionOperations.validateHITSPReviewOfSystemsSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReviewOfSystemsSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReviewOfSystemsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ReviewOfSystemsSectionImpl
