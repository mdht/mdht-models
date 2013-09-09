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
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection;
import org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.LaborandDeliverySectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Laborand Delivery Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LaborandDeliverySectionImpl extends SectionImpl implements LaborandDeliverySection {
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
	public boolean validateLaborandDeliverySectionLaborandDeliveryInformation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LaborandDeliverySectionOperations.validateLaborandDeliverySectionLaborandDeliveryInformation(
			this, diagnostics, context);
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
	public boolean validateLaborandDeliverySectionLaborandDeliveryProceduresSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LaborandDeliverySectionOperations.validateLaborandDeliverySectionLaborandDeliveryProceduresSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliverySectionLaborOnsets(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LaborandDeliverySectionOperations.validateLaborandDeliverySectionLaborOnsets(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaborandDeliveryInformation getLaborandDeliveryInformation() {
		return LaborandDeliverySectionOperations.getLaborandDeliveryInformation(this);
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
	public LaborandDeliveryProcedureSection getLaborandDeliveryProceduresSection() {
		return LaborandDeliverySectionOperations.getLaborandDeliveryProceduresSection(this);
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
	public LaborandDeliverySection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaborandDeliverySection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // LaborandDeliverySectionImpl
