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
import org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.NumberOfPressureUlcersObservationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Of Pressure Ulcers Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NumberOfPressureUlcersObservationImpl extends ObservationImpl implements NumberOfPressureUlcersObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberOfPressureUlcersObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNumberOfPressureUlcersObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNumberOfPressureUlcersObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNumberOfPressureUlcersObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNumberOfPressureUlcersObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNumberOfPressureUlcersObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNumberOfPressureUlcersObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNumberOfPressureUlcersObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNumberOfPressureUlcersObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNumberOfPressureUlcersObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNumberOfPressureUlcersObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNumberOfPressureUlcersObservationAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationAuthor(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNumberOfPressureUlcersObservationEntryRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationEntryRelationship(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNumberOfPressureUlcersObservationEntryRelationshipObservationValue(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationEntryRelationshipObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNumberOfPressureUlcersObservationEntryRelationshipObservationValueP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationEntryRelationshipObservationValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNumberOfPressureUlcersObservationEntryRelationshipTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationEntryRelationshipTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNumberOfPressureUlcersObservationEntryRelationshipObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationEntryRelationshipObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberOfPressureUlcersObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberOfPressureUlcersObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // NumberOfPressureUlcersObservationImpl
