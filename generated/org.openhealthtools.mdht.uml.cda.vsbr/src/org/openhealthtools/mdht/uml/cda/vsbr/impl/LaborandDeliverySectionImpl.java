/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection;
import org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.LaborandDeliverySectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Laborand Delivery Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LaborandDeliverySectionImpl extends org.eclipse.mdht.uml.cda.impl.SectionImpl
		implements LaborandDeliverySection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaborandDeliverySectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.LABORAND_DELIVERY_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliverySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LaborandDeliverySectionOperations.validateLaborandDeliverySectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliverySectionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LaborandDeliverySectionOperations.validateLaborandDeliverySectionClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliverySectionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LaborandDeliverySectionOperations.validateLaborandDeliverySectionMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliverySectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LaborandDeliverySectionOperations.validateLaborandDeliverySectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliverySectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LaborandDeliverySectionOperations.validateLaborandDeliverySectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliverySectionLaborAndDeliveryProcess(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LaborandDeliverySectionOperations.validateLaborandDeliverySectionLaborAndDeliveryProcess(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliverySectionLaborAndDeliveryProceduresSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LaborandDeliverySectionOperations.validateLaborandDeliverySectionLaborAndDeliveryProceduresSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliverySectionLaborOnsets(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LaborandDeliverySectionOperations.validateLaborandDeliverySectionLaborOnsets(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliverySectionMothersVitalSignsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LaborandDeliverySectionOperations.validateLaborandDeliverySectionMothersVitalSignsSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaborandDeliveryProcess getLaborAndDeliveryProcess() {
		return LaborandDeliverySectionOperations.getLaborAndDeliveryProcess(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaborandDeliveryProcedureSection getLaborAndDeliveryProceduresSection() {
		return LaborandDeliverySectionOperations.getLaborAndDeliveryProceduresSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnsetofLabor> getLaborOnsetss() {
		return LaborandDeliverySectionOperations.getLaborOnsetss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MothersVitalSignsSection getMothersVitalSignsSection() {
		return LaborandDeliverySectionOperations.getMothersVitalSignsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaborandDeliverySection init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaborandDeliverySection init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}
} // LaborandDeliverySectionImpl
