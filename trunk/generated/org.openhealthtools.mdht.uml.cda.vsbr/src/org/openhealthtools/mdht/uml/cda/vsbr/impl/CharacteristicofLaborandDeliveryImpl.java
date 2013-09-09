/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.CharacteristicofLaborandDeliveryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characteristicof Laborand Delivery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CharacteristicofLaborandDeliveryImpl extends ObservationImpl implements CharacteristicofLaborandDelivery {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicofLaborandDeliveryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.CHARACTERISTICOF_LABORAND_DELIVERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicofLaborandDeliveryTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CharacteristicofLaborandDeliveryOperations.validateCharacteristicofLaborandDeliveryTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicofLaborandDeliveryClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CharacteristicofLaborandDeliveryOperations.validateCharacteristicofLaborandDeliveryClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicofLaborandDeliveryMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CharacteristicofLaborandDeliveryOperations.validateCharacteristicofLaborandDeliveryMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicofLaborandDeliveryCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CharacteristicofLaborandDeliveryOperations.validateCharacteristicofLaborandDeliveryCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicofLaborandDeliveryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CharacteristicofLaborandDeliveryOperations.validateCharacteristicofLaborandDeliveryCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicofLaborandDeliveryCodeVS(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CharacteristicofLaborandDeliveryOperations.validateCharacteristicofLaborandDeliveryCodeVS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicofLaborandDeliveryValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CharacteristicofLaborandDeliveryOperations.validateCharacteristicofLaborandDeliveryValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicofLaborandDeliveryValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CharacteristicofLaborandDeliveryOperations.validateCharacteristicofLaborandDeliveryValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicofLaborandDelivery init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicofLaborandDelivery init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CharacteristicofLaborandDeliveryImpl
