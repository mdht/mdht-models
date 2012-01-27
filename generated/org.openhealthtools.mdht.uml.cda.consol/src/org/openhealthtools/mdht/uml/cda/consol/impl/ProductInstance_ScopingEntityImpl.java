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
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance_ScopingEntity;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProductInstance_ScopingEntityOperations;

import org.openhealthtools.mdht.uml.cda.impl.EntityImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Instance Scoping Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProductInstance_ScopingEntityImpl extends EntityImpl implements ProductInstance_ScopingEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductInstance_ScopingEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PRODUCT_INSTANCE_SCOPING_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScopingEntityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProductInstance_ScopingEntityOperations.validateScopingEntityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstance_ScopingEntity init() {
		CDAUtil.init(this);
		return this;
	}
} // ProductInstance_ScopingEntityImpl
