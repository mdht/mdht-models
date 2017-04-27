/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.PrenatalCareOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prenatal Care</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PrenatalCareImpl extends org.eclipse.mdht.uml.cda.impl.ActImpl implements PrenatalCare {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrenatalCareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.PRENATAL_CARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalCareTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrenatalCareOperations.validatePrenatalCareTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalCareClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrenatalCareOperations.validatePrenatalCareClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalCareMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrenatalCareOperations.validatePrenatalCareMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalCareNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrenatalCareOperations.validatePrenatalCareNegationInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalCareCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrenatalCareOperations.validatePrenatalCareCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalCareCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrenatalCareOperations.validatePrenatalCareCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalCareEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrenatalCareOperations.validatePrenatalCareEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalCareEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrenatalCareOperations.validatePrenatalCareEntryRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrenatalCare init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrenatalCare init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}
} // PrenatalCareImpl
