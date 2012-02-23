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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance_PlayingDevice;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProductInstance_PlayingDeviceOperations;

import org.openhealthtools.mdht.uml.cda.impl.DeviceImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Instance Playing Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProductInstance_PlayingDeviceImpl extends DeviceImpl implements ProductInstance_PlayingDevice {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductInstance_PlayingDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PRODUCT_INSTANCE_PLAYING_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayingDeviceCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProductInstance_PlayingDeviceOperations.validatePlayingDeviceCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstance_PlayingDevice init() {
		CDAUtil.init(this);
		return this;
	}
} // ProductInstance_PlayingDeviceImpl
