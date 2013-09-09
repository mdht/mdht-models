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

import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection;
import org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedure;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.LaborandDeliveryProcedureSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Laborand Delivery Procedure Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LaborandDeliveryProcedureSectionImpl extends SectionImpl implements LaborandDeliveryProcedureSection {
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
	public boolean validateLaborandDeliveryProcedureSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LaborandDeliveryProcedureSectionOperations.validateLaborandDeliveryProcedureSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcedureSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LaborandDeliveryProcedureSectionOperations.validateLaborandDeliveryProcedureSectionText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcedureSectionObstetricProcedures(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LaborandDeliveryProcedureSectionOperations.validateLaborandDeliveryProcedureSectionObstetricProcedures(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaborandDeliveryProcedureSectionMethodofDelivery(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LaborandDeliveryProcedureSectionOperations.validateLaborandDeliveryProcedureSectionMethodofDelivery(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObstetricProcedure> getObstetricProceduress() {
		return LaborandDeliveryProcedureSectionOperations.getObstetricProceduress(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodofDelivery getMethodofDelivery() {
		return LaborandDeliveryProcedureSectionOperations.getMethodofDelivery(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaborandDeliveryProcedureSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaborandDeliveryProcedureSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // LaborandDeliveryProcedureSectionImpl
