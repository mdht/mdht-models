/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.consol.BirthSexObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.operations.BirthSexObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Birth Sex Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BirthSexObservationImpl extends ObservationImpl implements BirthSexObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BirthSexObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.BIRTH_SEX_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthSexObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BirthSexObservationOperations.validateBirthSexObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthSexObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BirthSexObservationOperations.validateBirthSexObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthSexObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BirthSexObservationOperations.validateBirthSexObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthSexObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BirthSexObservationOperations.validateBirthSexObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthSexObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BirthSexObservationOperations.validateBirthSexObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthSexObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BirthSexObservationOperations.validateBirthSexObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthSexObservationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BirthSexObservationOperations.validateBirthSexObservationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthSexObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BirthSexObservationOperations.validateBirthSexObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthSexObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BirthSexObservationOperations.validateBirthSexObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BirthSexObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BirthSexObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // BirthSexObservationImpl
