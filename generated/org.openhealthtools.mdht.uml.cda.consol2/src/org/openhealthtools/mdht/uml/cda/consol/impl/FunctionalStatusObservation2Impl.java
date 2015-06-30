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
	public NonMedicinalSupplyActivity2 getConsolNonMedicinalSupplyActivity2() {
		return FunctionalStatusObservation2Operations.getConsolNonMedicinalSupplyActivity2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusObservation2Operations.validateResultObservationTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationTextReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusObservation2Operations.validateResultObservationTextReferenceValue(
			this, diagnostics, context);
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
	public boolean validateResultObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusObservation2Operations.validateResultObservationText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusObservation2Operations.validateResultObservationInterpretationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusObservation2Operations.validateResultObservationMethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusObservation2Operations.validateResultObservationTargetSiteCode(
			this, diagnostics, context);
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
	public boolean validateFunctionalStatusResultObservationAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusObservation2Operations.validateFunctionalStatusResultObservationAuthor(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFunctionalStatusResultObservationNonMedicinalSupplyActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusObservation2Operations.validateFunctionalStatusResultObservationNonMedicinalSupplyActivity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFunctionalStatusResultObservationReferenceRangeObservationRangeNoCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusObservation2Operations.validateFunctionalStatusResultObservationReferenceRangeObservationRangeNoCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFunctionalStatusResultObservationReferenceRangeObservationRange(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusObservation2Operations.validateFunctionalStatusResultObservationReferenceRangeObservationRange(
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
