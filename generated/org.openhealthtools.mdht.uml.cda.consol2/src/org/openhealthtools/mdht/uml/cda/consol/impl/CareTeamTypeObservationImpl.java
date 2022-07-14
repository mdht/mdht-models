/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.consol.CareTeamTypeObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.CareTeamTypeObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Team Type Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CareTeamTypeObservationImpl extends ObservationImpl implements CareTeamTypeObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CareTeamTypeObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CARE_TEAM_TYPE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamTypeObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamTypeObservationOperations.validateCareTeamTypeObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamTypeObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamTypeObservationOperations.validateCareTeamTypeObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamTypeObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamTypeObservationOperations.validateCareTeamTypeObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamTypeObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CareTeamTypeObservationOperations.validateCareTeamTypeObservationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamTypeObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamTypeObservationOperations.validateCareTeamTypeObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamTypeObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamTypeObservationOperations.validateCareTeamTypeObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamTypeObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamTypeObservationOperations.validateCareTeamTypeObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamTypeObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamTypeObservationOperations.validateCareTeamTypeObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamTypeObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamTypeObservationOperations.validateCareTeamTypeObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamTypeObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamTypeObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CareTeamTypeObservationImpl
