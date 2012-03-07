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
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProductInstanceOperations;

import org.openhealthtools.mdht.uml.cda.impl.ParticipantRoleImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProductInstanceImpl extends ParticipantRoleImpl implements ProductInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PRODUCT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductInstanceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProductInstanceOperations.validateProductInstanceTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductInstanceClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProductInstanceOperations.validateProductInstanceClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductInstanceId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProductInstanceOperations.validateProductInstanceId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductInstanceScopingEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProductInstanceOperations.validateProductInstanceScopingEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductInstancePlayingDevice(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProductInstanceOperations.validateProductInstancePlayingDevice(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductInstanceScopingEntityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProductInstanceOperations.validateProductInstanceScopingEntityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductInstancePlayingDeviceCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProductInstanceOperations.validateProductInstancePlayingDeviceCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstance init() {
		CDAUtil.init(this);
		return this;
	}
} // ProductInstanceImpl
