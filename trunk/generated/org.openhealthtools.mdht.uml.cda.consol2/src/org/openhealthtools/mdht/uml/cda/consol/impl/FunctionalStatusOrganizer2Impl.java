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
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities;

import org.openhealthtools.mdht.uml.cda.consol.operations.FunctionalStatusOrganizer2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Status Organizer2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FunctionalStatusOrganizer2Impl extends FunctionalStatusResultOrganizerImpl implements
		FunctionalStatusOrganizer2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalStatusOrganizer2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.FUNCTIONAL_STATUS_ORGANIZER2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFunctionalStatusOrganizer2CodeCodeSystem(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusOrganizer2Operations.validateFunctionalStatusOrganizer2CodeCodeSystem(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFunctionalStatusResultOrganizerFunctionalStatusObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusOrganizer2Operations.validateFunctionalStatusResultOrganizerFunctionalStatusObservation2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFunctionalStatusOrganizer2SelfCareActivities(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusOrganizer2Operations.validateFunctionalStatusOrganizer2SelfCareActivities(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFunctionalStatusOrganizer2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusOrganizer2Operations.validateFunctionalStatusOrganizer2AuthorParticipation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionalStatusObservation2> getConsolFunctionalStatusObservation2s() {
		return FunctionalStatusOrganizer2Operations.getConsolFunctionalStatusObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SelfCareActivities> getSelfCareActivitiess() {
		return FunctionalStatusOrganizer2Operations.getSelfCareActivitiess(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusOrganizer2Operations.validateResultOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusOrganizer2Operations.validateResultOrganizerCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultOrganizerStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusOrganizer2Operations.validateResultOrganizerStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultOrganizerStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusOrganizer2Operations.validateResultOrganizerStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusOrganizer2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusOrganizer2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // FunctionalStatusOrganizer2Impl
