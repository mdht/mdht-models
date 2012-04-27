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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PurposeofReferenceObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.PurposeofReferenceObservationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Purposeof Reference Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PurposeofReferenceObservationImpl extends ObservationImpl implements PurposeofReferenceObservation {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected PurposeofReferenceObservationImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PURPOSEOF_REFERENCE_OBSERVATION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePurposeofReferenceObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PurposeofReferenceObservationOperations.validatePurposeofReferenceObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePurposeofReferenceObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PurposeofReferenceObservationOperations.validatePurposeofReferenceObservationClassCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePurposeofReferenceObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeofReferenceObservationOperations.validatePurposeofReferenceObservationCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePurposeofReferenceObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PurposeofReferenceObservationOperations.validatePurposeofReferenceObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePurposeofReferenceObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeofReferenceObservationOperations.validatePurposeofReferenceObservationValue(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PurposeofReferenceObservation init() {
		CDAUtil.init(this);
		return this;
	}
} // PurposeofReferenceObservationImpl
