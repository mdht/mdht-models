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
import org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedure;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.LaborandDeliveryProcedureSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Laborand Delivery Procedure Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LaborandDeliveryProcedureSectionImpl extends org.eclipse.mdht.uml.cda.impl.SectionImpl
		implements LaborandDeliveryProcedureSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaborandDeliveryProcedureSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.LABORAND_DELIVERY_PROCEDURE_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcedureSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LaborandDeliveryProcedureSectionOperations.validateLaborandDeliveryProcedureSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcedureSectionClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LaborandDeliveryProcedureSectionOperations.validateLaborandDeliveryProcedureSectionClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcedureSectionMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LaborandDeliveryProcedureSectionOperations.validateLaborandDeliveryProcedureSectionMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcedureSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LaborandDeliveryProcedureSectionOperations.validateLaborandDeliveryProcedureSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcedureSectionCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LaborandDeliveryProcedureSectionOperations.validateLaborandDeliveryProcedureSectionCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcedureSectionText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LaborandDeliveryProcedureSectionOperations.validateLaborandDeliveryProcedureSectionText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcedureSectionObstetricProcedure(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LaborandDeliveryProcedureSectionOperations.validateLaborandDeliveryProcedureSectionObstetricProcedure(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcedureSectionMethodOfDelivery(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LaborandDeliveryProcedureSectionOperations.validateLaborandDeliveryProcedureSectionMethodOfDelivery(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObstetricProcedure> getObstetricProcedures() {
		return LaborandDeliveryProcedureSectionOperations.getObstetricProcedures(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodofDelivery getMethodOfDelivery() {
		return LaborandDeliveryProcedureSectionOperations.getMethodOfDelivery(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaborandDeliveryProcedureSection init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaborandDeliveryProcedureSection init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}
} // LaborandDeliveryProcedureSectionImpl
