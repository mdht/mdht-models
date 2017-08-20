/**
 */
package org.hl7.cbcc.privacy.consentdirective.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.CriteriumRelatedProtectedProblem;
import org.hl7.cbcc.privacy.consentdirective.operations.CriteriumRelatedProtectedProblemOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Criterium Related Protected Problem</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CriteriumRelatedProtectedProblemImpl extends ObservationImpl implements CriteriumRelatedProtectedProblem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CriteriumRelatedProtectedProblemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONSENTDIRECTIVEPackage.Literals.CRITERIUM_RELATED_PROTECTED_PROBLEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCriteriumRelatedProtectedProblemTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CriteriumRelatedProtectedProblemOperations.validateCriteriumRelatedProtectedProblemTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCriteriumRelatedProtectedProblemCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CriteriumRelatedProtectedProblemOperations.validateCriteriumRelatedProtectedProblemCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCriteriumRelatedProtectedProblemCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CriteriumRelatedProtectedProblemOperations.validateCriteriumRelatedProtectedProblemCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCriteriumRelatedProtectedProblemValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CriteriumRelatedProtectedProblemOperations.validateCriteriumRelatedProtectedProblemValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCriteriumRelatedProtectedProblemValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CriteriumRelatedProtectedProblemOperations.validateCriteriumRelatedProtectedProblemValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriteriumRelatedProtectedProblem init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriteriumRelatedProtectedProblem init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CriteriumRelatedProtectedProblemImpl
