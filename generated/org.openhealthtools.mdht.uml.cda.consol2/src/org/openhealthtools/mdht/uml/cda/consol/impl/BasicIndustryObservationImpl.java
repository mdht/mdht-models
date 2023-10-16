/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.consol.BasicIndustryObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.BasicIndustryObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Industry Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BasicIndustryObservationImpl extends ObservationImpl implements BasicIndustryObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicIndustryObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.BASIC_INDUSTRY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicIndustryObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BasicIndustryObservationOperations.validateBasicIndustryObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicIndustryObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BasicIndustryObservationOperations.validateBasicIndustryObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicIndustryObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BasicIndustryObservationOperations.validateBasicIndustryObservationStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicIndustryObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BasicIndustryObservationOperations.validateBasicIndustryObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicIndustryObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BasicIndustryObservationOperations.validateBasicIndustryObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicIndustryObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BasicIndustryObservationOperations.validateBasicIndustryObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicIndustryObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BasicIndustryObservationOperations.validateBasicIndustryObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicIndustryObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicIndustryObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // BasicIndustryObservationImpl
