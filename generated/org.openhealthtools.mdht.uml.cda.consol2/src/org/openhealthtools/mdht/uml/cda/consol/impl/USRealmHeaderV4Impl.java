/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderV4;

import org.openhealthtools.mdht.uml.cda.consol.operations.USRealmHeaderV4Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>US Realm Header V4</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class USRealmHeaderV4Impl extends USRealmHeader2Impl implements USRealmHeaderV4 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected USRealmHeaderV4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.US_REALM_HEADER_V4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSRealmHeaderV4Participant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return USRealmHeaderV4Operations.validateUSRealmHeaderV4Participant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public USRealmHeaderV4 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public USRealmHeaderV4 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // USRealmHeaderV4Impl
