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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusObservation2;

import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2;
import org.openhealthtools.mdht.uml.cda.consol.operations.FunctionalStatusObservation2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Status Observation2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FunctionalStatusObservation2Impl extends FunctionalStatusResultObservationImpl implements
		FunctionalStatusObservation2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalStatusObservation2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.FUNCTIONAL_STATUS_OBSERVATION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFunctionalStatusObservation2TextReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusObservation2Operations.validateFunctionalStatusObservation2TextReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFunctionalStatusObservation2TextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusObservation2Operations.validateFunctionalStatusObservation2TextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFunctionalStatusObservation2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusObservation2Operations.validateFunctionalStatusObservation2AuthorParticipation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFunctionalStatusResultObservationNonMedicinalSupplyActivity2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusObservation2Operations.validateFunctionalStatusResultObservationNonMedicinalSupplyActivity2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFunctionalStatusObservation2ReferenceRangeObservationRangeNoCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusObservation2Operations.validateFunctionalStatusObservation2ReferenceRangeObservationRangeNoCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonMedicinalSupplyActivity2 getConsolNonMedicinalSupplyActivity2() {
		return FunctionalStatusObservation2Operations.getConsolNonMedicinalSupplyActivity2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusObservation2Operations.validateResultObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusObservation2Operations.validateResultObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusObservation2Operations.validateResultObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFunctionalStatusResultObservationReferenceRange(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusObservation2Operations.validateFunctionalStatusResultObservationReferenceRange(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusObservation2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // FunctionalStatusObservation2Impl
