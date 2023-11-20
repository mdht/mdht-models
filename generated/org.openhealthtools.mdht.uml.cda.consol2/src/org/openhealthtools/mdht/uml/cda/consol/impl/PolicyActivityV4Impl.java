/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PolicyActivityV4;
import org.openhealthtools.mdht.uml.cda.consol.operations.PolicyActivityV4Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Activity V4</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PolicyActivityV4Impl extends PolicyActivity2Impl implements PolicyActivityV4 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyActivityV4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.POLICY_ACTIVITY_V4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePolicyActivity2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityV4Operations.validatePolicyActivity2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyActivityV4 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyActivityV4 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PolicyActivityV4Impl
