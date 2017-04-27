/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess;
import org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity;
import org.openhealthtools.mdht.uml.cda.vsbr.MaternalTransfer;
import org.openhealthtools.mdht.uml.cda.vsbr.PlannedHomeBirth;
import org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.LaborandDeliveryProcessOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Laborand Delivery Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LaborandDeliveryProcessImpl extends org.eclipse.mdht.uml.cda.impl.ActImpl
		implements LaborandDeliveryProcess {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaborandDeliveryProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.LABORAND_DELIVERY_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcessTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcessClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcessMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcessCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcessCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcessAttendantParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessAttendantParticipation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcessEntryRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessEntryRelationship(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcessCharacteristicsOfLaborAndDelivery(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessCharacteristicsOfLaborAndDelivery(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcessHomeBirthPlan(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessHomeBirthPlan(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcessMaternalTransfer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessMaternalTransfer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcessParticipatingLocation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessParticipatingLocation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcessMaternalMorbidities(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessMaternalMorbidities(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcessRiskFactors(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessRiskFactors(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CharacteristicofLaborandDelivery> getCharacteristicsOfLaborAndDeliveries() {
		return LaborandDeliveryProcessOperations.getCharacteristicsOfLaborAndDeliveries(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedHomeBirth getHomeBirthPlan() {
		return LaborandDeliveryProcessOperations.getHomeBirthPlan(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaternalTransfer getMaternalTransfer() {
		return LaborandDeliveryProcessOperations.getMaternalTransfer(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MaternalMorbidity> getMaternalMorbiditiess() {
		return LaborandDeliveryProcessOperations.getMaternalMorbiditiess(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PregnancyRiskFactor> getRiskFactorss() {
		return LaborandDeliveryProcessOperations.getRiskFactorss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaborandDeliveryProcess init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaborandDeliveryProcess init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}
} // LaborandDeliveryProcessImpl
