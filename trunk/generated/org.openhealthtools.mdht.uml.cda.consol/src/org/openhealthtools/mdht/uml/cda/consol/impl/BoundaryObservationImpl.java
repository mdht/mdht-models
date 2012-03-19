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

import org.openhealthtools.mdht.uml.cda.consol.BoundaryObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.BoundaryObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boundary Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BoundaryObservationImpl extends ObservationImpl implements BoundaryObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundaryObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.BOUNDARY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundaryObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BoundaryObservationOperations.validateBoundaryObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundaryObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BoundaryObservationOperations.validateBoundaryObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundaryObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BoundaryObservationOperations.validateBoundaryObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundaryObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BoundaryObservationOperations.validateBoundaryObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundaryObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BoundaryObservationOperations.validateBoundaryObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryObservation init() {
    	CDAUtil.init(this);
    	return this;
	}
} // BoundaryObservationImpl
