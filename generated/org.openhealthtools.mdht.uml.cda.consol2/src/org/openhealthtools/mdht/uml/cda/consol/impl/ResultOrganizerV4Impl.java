/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizerV4;

import org.openhealthtools.mdht.uml.cda.consol.operations.ResultOrganizerV4Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Organizer V4</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResultOrganizerV4Impl extends ResultOrganizer2Impl implements ResultOrganizerV4 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultOrganizerV4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.RESULT_ORGANIZER_V4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizerV4Specimen(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerV4Operations.validateResultOrganizerV4Specimen(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResultOrganizerV4Operations.validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResultOrganizerV4Operations.validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizerV4SpecimenSpecimenRoleSpecimenPlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResultOrganizerV4Operations.validateResultOrganizerV4SpecimenSpecimenRoleSpecimenPlayingEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizerV4SpecimenSpecimenRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResultOrganizerV4Operations.validateResultOrganizerV4SpecimenSpecimenRole(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultOrganizer2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerV4Operations.validateResultOrganizer2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultOrganizerV4 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultOrganizerV4 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ResultOrganizerV4Impl
