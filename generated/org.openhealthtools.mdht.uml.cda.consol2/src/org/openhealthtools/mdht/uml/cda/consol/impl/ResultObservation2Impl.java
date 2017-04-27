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
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ResultObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ResultObservation2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResultObservation2Impl extends ResultObservationImpl implements ResultObservation2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultObservation2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.RESULT_OBSERVATION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultObservation2Operations.validateResultObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservationInterpretationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResultObservation2Operations.validateResultObservationInterpretationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservation2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResultObservation2Operations.validateResultObservation2AuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation2ReferenceRange(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultObservation2Operations.validateResultObservation2ReferenceRange(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation2ReferenceRangeObservationRangeValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResultObservation2Operations.validateResultObservation2ReferenceRangeObservationRangeValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation2ReferenceRangeObservationRangeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResultObservation2Operations.validateResultObservation2ReferenceRangeObservationRangeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation2ReferenceRangeObservationRange(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResultObservation2Operations.validateResultObservation2ReferenceRangeObservationRange(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationAuthorMultiplicity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResultObservation2Operations.validateResultObservationAuthorMultiplicity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationCodeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultObservation2Operations.validateResultObservationCodeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultObservation2Operations.validateResultObservationTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultObservation2Operations.validateResultObservationReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResultObservation2Operations.validateResultObservationTextReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationNoObservationRangeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResultObservation2Operations.validateResultObservationNoObservationRangeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultObservation2Operations.validateResultObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultObservation2Operations.validateResultObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultObservation2Operations.validateResultObservationText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultObservation2Operations.validateResultObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultObservation2Operations.validateResultObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationInterpretationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResultObservation2Operations.validateResultObservationInterpretationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultObservation2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ResultObservation2Impl
