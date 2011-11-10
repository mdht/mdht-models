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
import org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.PregnancyObservationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pregnancy Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PregnancyObservationImpl extends ObservationImpl implements PregnancyObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PregnancyObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PREGNANCY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyObservationOperations.validatePregnancyObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyObservationOperations.validatePregnancyObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyObservationOperations.validatePregnancyObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyObservationOperations.validatePregnancyObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyObservationRepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyObservationOperations.validatePregnancyObservationRepeatNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyObservationOperations.validatePregnancyObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyObservationInterpretationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PregnancyObservationOperations.validatePregnancyObservationInterpretationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyObservationMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyObservationOperations.validatePregnancyObservationMethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyObservationTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyObservationOperations.validatePregnancyObservationTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PregnancyObservation init() {
		CDAUtil.init(this);
		return this;
	}
} // PregnancyObservationImpl
