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
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2;
import org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2;
import org.openhealthtools.mdht.uml.cda.consol.operations.CoverageActivity2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Activity2</b></em>'.
 * <!-- end-user-doc -->
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
	public boolean validateCoverageActivity2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivity2Operations.validateCoverageActivity2TemplateId(this, diagnostics, context);
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
	public boolean validateCoverageActivity2EntryRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CoverageActivity2Operations.validateCoverageActivity2EntryRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity2EntryRelationshipINTValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CoverageActivity2Operations.validateCoverageActivity2EntryRelationshipINTValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity2EntryRelationshipTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CoverageActivity2Operations.validateCoverageActivity2EntryRelationshipTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity2EntryRelationshipSequenceNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CoverageActivity2Operations.validateCoverageActivity2EntryRelationshipSequenceNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity2EntryRelationshipPolicyActivity2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CoverageActivity2Operations.validateCoverageActivity2EntryRelationshipPolicyActivity2(this, diagnostics, context);
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
	public boolean validateCoverageActivityCoverageActivityRelationshipSequenceNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CoverageActivity2Operations.validateCoverageActivityCoverageActivityRelationshipSequenceNumber(this, diagnostics, context);
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
	public boolean validateCoverageActivityPolicyActivity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivity2Operations.validateCoverageActivityPolicyActivity(this, diagnostics, context);
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
