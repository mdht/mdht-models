/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCare;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.BarriersToPatientCareOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Barriers To Patient Care</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BarriersToPatientCareImpl extends ObservationImpl implements BarriersToPatientCare {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected BarriersToPatientCareImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.BARRIERS_TO_PATIENT_CARE;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateBarriersToPatientCareTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BarriersToPatientCareOperations.validateBarriersToPatientCareTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateBarriersToPatientCareCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BarriersToPatientCareOperations.validateBarriersToPatientCareCodeP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateBarriersToPatientCareCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BarriersToPatientCareOperations.validateBarriersToPatientCareCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateBarriersToPatientCareValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BarriersToPatientCareOperations.validateBarriersToPatientCareValue(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateBarriersToPatientCareValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BarriersToPatientCareOperations.validateBarriersToPatientCareValueP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateBarriersToPatientCareMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BarriersToPatientCareOperations.validateBarriersToPatientCareMoodCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public BarriersToPatientCare init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarriersToPatientCare init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // BarriersToPatientCareImpl
