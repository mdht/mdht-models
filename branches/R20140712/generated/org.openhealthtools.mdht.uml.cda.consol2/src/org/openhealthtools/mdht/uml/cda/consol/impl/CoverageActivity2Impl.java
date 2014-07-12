/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2;

import org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2;
import org.openhealthtools.mdht.uml.cda.consol.operations.CoverageActivity2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Activity2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CoverageActivity2Impl extends CoverageActivityImpl implements CoverageActivity2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageActivity2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.COVERAGE_ACTIVITY2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity2CoverageActivityRelationshipSequenceNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CoverageActivity2Operations.validateCoverageActivity2CoverageActivityRelationshipSequenceNumber(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivity2Operations.validateCoverageActivityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivityPolicyActivity2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivity2Operations.validateCoverageActivityPolicyActivity2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolicyActivity2> getConsolPolicyActivity2s() {
		return CoverageActivity2Operations.getConsolPolicyActivity2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCoverageActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivity2Operations.validateCoverageActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCoverageActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivity2Operations.validateCoverageActivityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageActivity2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageActivity2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CoverageActivity2Impl
