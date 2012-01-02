/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.AssignedAuthor_AuthoringDevice;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.AssignedAuthor_AuthoringDeviceOperations;

import org.openhealthtools.mdht.uml.cda.impl.AuthoringDeviceImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assigned Author Authoring Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AssignedAuthor_AuthoringDeviceImpl extends AuthoringDeviceImpl implements AssignedAuthor_AuthoringDevice {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignedAuthor_AuthoringDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ASSIGNED_AUTHOR_AUTHORING_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthoringDeviceManufacturerModelName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssignedAuthor_AuthoringDeviceOperations.validateAuthoringDeviceManufacturerModelName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthoringDeviceSoftwareName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssignedAuthor_AuthoringDeviceOperations.validateAuthoringDeviceSoftwareName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignedAuthor_AuthoringDevice init() {
		CDAUtil.init(this);
		return this;
	}
} // AssignedAuthor_AuthoringDeviceImpl
