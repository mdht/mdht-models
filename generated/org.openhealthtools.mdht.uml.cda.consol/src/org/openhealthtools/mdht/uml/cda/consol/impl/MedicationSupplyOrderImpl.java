/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationSupplyOrderOperations;
import org.openhealthtools.mdht.uml.cda.impl.SupplyImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Supply Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationSupplyOrderImpl extends SupplyImpl implements MedicationSupplyOrder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationSupplyOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSupplyOrderInstructionInversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderInstructionInversionInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSupplyOrderTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSupplyOrderClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSupplyOrderEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSupplyOrderMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSupplyOrderQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSupplyOrderRepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderRepeatNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSupplyOrderStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSupplyOrderId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSupplyOrderProduct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderProduct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSupplyOrderAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSupplyOrderInstructions(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderInstructions(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructions getInstructions() {
		return MedicationSupplyOrderOperations.getInstructions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationSupplyOrder init() {
		CDAUtil.init(this);
		return this;
	}
} // MedicationSupplyOrderImpl
