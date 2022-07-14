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
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PrognosisObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.PrognosisObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prognosis Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PrognosisObservationImpl extends ObservationImpl implements PrognosisObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrognosisObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROGNOSIS_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrognosisObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrognosisObservationOperations.validatePrognosisObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrognosisObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrognosisObservationOperations.validatePrognosisObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrognosisObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrognosisObservationOperations.validatePrognosisObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrognosisObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrognosisObservationOperations.validatePrognosisObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrognosisObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrognosisObservationOperations.validatePrognosisObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrognosisObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrognosisObservationOperations.validatePrognosisObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrognosisObservationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrognosisObservationOperations.validatePrognosisObservationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrognosisObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrognosisObservationOperations.validatePrognosisObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrognosisObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrognosisObservationOperations.validatePrognosisObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrognosisObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrognosisObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PrognosisObservationImpl
