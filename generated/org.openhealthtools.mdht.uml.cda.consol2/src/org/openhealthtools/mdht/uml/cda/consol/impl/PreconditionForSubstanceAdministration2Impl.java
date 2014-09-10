/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration2;

import org.openhealthtools.mdht.uml.cda.consol.operations.PreconditionForSubstanceAdministration2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Precondition For Substance Administration2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PreconditionForSubstanceAdministration2Impl extends PreconditionForSubstanceAdministrationImpl implements
		PreconditionForSubstanceAdministration2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreconditionForSubstanceAdministration2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreconditionForSubstanceAdministrationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PreconditionForSubstanceAdministration2Operations.validatePreconditionForSubstanceAdministrationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreconditionForSubstanceAdministrationValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PreconditionForSubstanceAdministration2Operations.validatePreconditionForSubstanceAdministrationValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePreconditionForSubstanceAdministrationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PreconditionForSubstanceAdministration2Operations.validatePreconditionForSubstanceAdministrationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePreconditionForSubstanceAdministrationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PreconditionForSubstanceAdministration2Operations.validatePreconditionForSubstanceAdministrationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePreconditionForSubstanceAdministrationText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PreconditionForSubstanceAdministration2Operations.validatePreconditionForSubstanceAdministrationText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePreconditionForSubstanceAdministrationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PreconditionForSubstanceAdministration2Operations.validatePreconditionForSubstanceAdministrationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreconditionForSubstanceAdministration2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreconditionForSubstanceAdministration2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PreconditionForSubstanceAdministration2Impl
