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
import org.openhealthtools.mdht.uml.cda.ihe.ScanningDevice;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ScanningDeviceOperations;
import org.openhealthtools.mdht.uml.cda.impl.AuthorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scanning Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ScanningDeviceImpl extends AuthorImpl implements ScanningDevice {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ScanningDeviceImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.SCANNING_DEVICE;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateScanningDeviceTimeEqualsDocumentEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ScanningDeviceOperations.validateScanningDeviceTimeEqualsDocumentEffectiveTime(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateScanningDeviceHasAssignedAuthorId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScanningDeviceOperations.validateScanningDeviceHasAssignedAuthorId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateScanningDeviceHasAssignedAuthoringDeviceCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ScanningDeviceOperations.validateScanningDeviceHasAssignedAuthoringDeviceCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateScanningDeviceHasDeviceManufacturerModelName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ScanningDeviceOperations.validateScanningDeviceHasDeviceManufacturerModelName(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateScanningDeviceHasDeviceSoftwareName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScanningDeviceOperations.validateScanningDeviceHasDeviceSoftwareName(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateScanningDeviceHasAssignedAuthorRepresentedOrganizationId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ScanningDeviceOperations.validateScanningDeviceHasAssignedAuthorRepresentedOrganizationId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateScanningDeviceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScanningDeviceOperations.validateScanningDeviceTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ScanningDevice init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public ScanningDevice init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ScanningDeviceImpl
