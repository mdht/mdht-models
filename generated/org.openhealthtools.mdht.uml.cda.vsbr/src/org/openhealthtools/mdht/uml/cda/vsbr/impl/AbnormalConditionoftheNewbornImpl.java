/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionoftheNewborn;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.AbnormalConditionoftheNewbornOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abnormal Conditionofthe Newborn</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AbnormalConditionoftheNewbornImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl
		implements AbnormalConditionoftheNewborn {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbnormalConditionoftheNewbornImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.ABNORMAL_CONDITIONOFTHE_NEWBORN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbnormalConditionoftheNewbornTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AbnormalConditionoftheNewbornOperations.validateAbnormalConditionoftheNewbornTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbnormalConditionoftheNewbornClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AbnormalConditionoftheNewbornOperations.validateAbnormalConditionoftheNewbornClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbnormalConditionoftheNewbornMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AbnormalConditionoftheNewbornOperations.validateAbnormalConditionoftheNewbornMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbnormalConditionoftheNewbornCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AbnormalConditionoftheNewbornOperations.validateAbnormalConditionoftheNewbornCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbnormalConditionoftheNewbornCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AbnormalConditionoftheNewbornOperations.validateAbnormalConditionoftheNewbornCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbnormalConditionoftheNewbornCodeVS(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AbnormalConditionoftheNewbornOperations.validateAbnormalConditionoftheNewbornCodeVS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbnormalConditionoftheNewbornValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AbnormalConditionoftheNewbornOperations.validateAbnormalConditionoftheNewbornValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbnormalConditionoftheNewbornValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AbnormalConditionoftheNewbornOperations.validateAbnormalConditionoftheNewbornValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbnormalConditionoftheNewborn init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbnormalConditionoftheNewborn init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}
} // AbnormalConditionoftheNewbornImpl
