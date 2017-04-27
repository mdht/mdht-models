/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathOccurrance;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.FetalDeathOccurranceOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fetal Death Occurrance</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FetalDeathOccurranceImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl
		implements FetalDeathOccurrance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FetalDeathOccurranceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.FETAL_DEATH_OCCURRANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeathOccurranceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FetalDeathOccurranceOperations.validateFetalDeathOccurranceTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeathOccurranceClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FetalDeathOccurranceOperations.validateFetalDeathOccurranceClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeathOccurranceMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FetalDeathOccurranceOperations.validateFetalDeathOccurranceMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeathOccurranceCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FetalDeathOccurranceOperations.validateFetalDeathOccurranceCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeathOccurranceCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FetalDeathOccurranceOperations.validateFetalDeathOccurranceCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeathOccurranceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FetalDeathOccurranceOperations.validateFetalDeathOccurranceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetalDeathOccurranceValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FetalDeathOccurranceOperations.validateFetalDeathOccurranceValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FetalDeathOccurrance init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FetalDeathOccurrance init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}
} // FetalDeathOccurranceImpl
