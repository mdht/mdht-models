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

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics;

import org.openhealthtools.mdht.uml.cda.consol.operations.WoundCharacteristicsOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wound Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class WoundCharacteristicsImpl extends ObservationImpl implements WoundCharacteristics {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WoundCharacteristicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.WOUND_CHARACTERISTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundCharacteristicsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundCharacteristicsOperations.validateWoundCharacteristicsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundCharacteristicsClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundCharacteristicsOperations.validateWoundCharacteristicsClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundCharacteristicsMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundCharacteristicsOperations.validateWoundCharacteristicsMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundCharacteristicsId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundCharacteristicsOperations.validateWoundCharacteristicsId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundCharacteristicsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundCharacteristicsOperations.validateWoundCharacteristicsCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundCharacteristicsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundCharacteristicsOperations.validateWoundCharacteristicsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundCharacteristicsStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundCharacteristicsOperations.validateWoundCharacteristicsStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundCharacteristicsStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundCharacteristicsOperations.validateWoundCharacteristicsStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundCharacteristicsEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundCharacteristicsOperations.validateWoundCharacteristicsEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundCharacteristicsValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundCharacteristicsOperations.validateWoundCharacteristicsValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundCharacteristicsValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundCharacteristicsOperations.validateWoundCharacteristicsValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateWoundCharacteristicsCDCodeSystem(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundCharacteristicsOperations.validateWoundCharacteristicsCDCodeSystem(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WoundCharacteristics init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WoundCharacteristics init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // WoundCharacteristicsImpl
