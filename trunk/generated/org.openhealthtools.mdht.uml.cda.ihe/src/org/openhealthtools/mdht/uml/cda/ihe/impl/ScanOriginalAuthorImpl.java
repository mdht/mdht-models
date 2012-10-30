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
import org.openhealthtools.mdht.uml.cda.ihe.ScanOriginalAuthor;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ScanOriginalAuthorOperations;
import org.openhealthtools.mdht.uml.cda.impl.AuthorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scan Original Author</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ScanOriginalAuthorImpl extends AuthorImpl implements ScanOriginalAuthor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScanOriginalAuthorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.SCAN_ORIGINAL_AUTHOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanOriginalAuthorHasAssignedAuthorId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ScanOriginalAuthorOperations.validateScanOriginalAuthorHasAssignedAuthorId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ScanOriginalAuthorOperations.validateScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanOriginalAuthorTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScanOriginalAuthorOperations.validateScanOriginalAuthorTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScanOriginalAuthor init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public ScanOriginalAuthor init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ScanOriginalAuthorImpl
