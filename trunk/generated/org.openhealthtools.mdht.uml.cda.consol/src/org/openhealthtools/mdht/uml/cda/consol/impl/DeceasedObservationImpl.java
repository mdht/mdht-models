/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.DeceasedObservationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deceased Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DeceasedObservationImpl extends ObservationImpl implements DeceasedObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeceasedObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DECEASED_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeceasedObservationEffectiveTimeLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeceasedObservationOperations.validateDeceasedObservationEffectiveTimeLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeceasedObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeceasedObservationOperations.validateDeceasedObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeceasedObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeceasedObservationOperations.validateDeceasedObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeceasedObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeceasedObservationOperations.validateDeceasedObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeceasedObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeceasedObservationOperations.validateDeceasedObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeceasedObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeceasedObservationOperations.validateDeceasedObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeceasedObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeceasedObservationOperations.validateDeceasedObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeceasedObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeceasedObservationOperations.validateDeceasedObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeceasedObservationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeceasedObservationOperations.validateDeceasedObservationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeceasedObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeceasedObservationOperations.validateDeceasedObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeceasedObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeceasedObservationOperations.validateDeceasedObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeceasedObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeceasedObservationOperations.validateDeceasedObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeceasedObservationProblemObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DeceasedObservationOperations.validateDeceasedObservationProblemObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemObservation getProblemObservation() {
		return DeceasedObservationOperations.getProblemObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeceasedObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeceasedObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // DeceasedObservationImpl
