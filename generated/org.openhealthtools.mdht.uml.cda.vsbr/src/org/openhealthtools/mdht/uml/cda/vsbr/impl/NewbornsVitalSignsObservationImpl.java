/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsObservation;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.NewbornsVitalSignsObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Newborns Vital Signs Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NewbornsVitalSignsObservationImpl extends ObservationImpl implements NewbornsVitalSignsObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewbornsVitalSignsObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.NEWBORNS_VITAL_SIGNS_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NewbornsVitalSignsObservationOperations.validateNewbornsVitalSignsObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NewbornsVitalSignsObservationOperations.validateNewbornsVitalSignsObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NewbornsVitalSignsObservationOperations.validateNewbornsVitalSignsObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NewbornsVitalSignsObservationOperations.validateNewbornsVitalSignsObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NewbornsVitalSignsObservationOperations.validateNewbornsVitalSignsObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NewbornsVitalSignsObservationOperations.validateNewbornsVitalSignsObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewbornsVitalSignsObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewbornsVitalSignsObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // NewbornsVitalSignsObservationImpl
