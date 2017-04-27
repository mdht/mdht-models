/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.MaternalMorbidityOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maternal Morbidity</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MaternalMorbidityImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements MaternalMorbidity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaternalMorbidityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.MATERNAL_MORBIDITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalMorbidityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MaternalMorbidityOperations.validateMaternalMorbidityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalMorbidityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MaternalMorbidityOperations.validateMaternalMorbidityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalMorbidityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MaternalMorbidityOperations.validateMaternalMorbidityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalMorbidityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MaternalMorbidityOperations.validateMaternalMorbidityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalMorbidityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MaternalMorbidityOperations.validateMaternalMorbidityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalMorbidityCodeVS(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MaternalMorbidityOperations.validateMaternalMorbidityCodeVS(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalMorbidityValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MaternalMorbidityOperations.validateMaternalMorbidityValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaternalMorbidityValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MaternalMorbidityOperations.validateMaternalMorbidityValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaternalMorbidity init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaternalMorbidity init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}
} // MaternalMorbidityImpl
