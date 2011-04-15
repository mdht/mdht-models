/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.impl.FulfillmentInstructionImpl;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationFullfillmentInstructions;
import org.openhealthtools.mdht.uml.cda.ihe.operations.MedicationFullfillmentInstructionsOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Fullfillment Instructions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationFullfillmentInstructionsImpl extends FulfillmentInstructionImpl implements MedicationFullfillmentInstructions {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationFullfillmentInstructionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.MEDICATION_FULLFILLMENT_INSTRUCTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFullfillmentInstructionsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationFullfillmentInstructionsOperations.validateMedicationFullfillmentInstructionsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFullfillmentInstructionsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationFullfillmentInstructionsOperations.validateMedicationFullfillmentInstructionsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFullfillmentInstructionsStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationFullfillmentInstructionsOperations.validateMedicationFullfillmentInstructionsStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFullfillmentInstructionsText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationFullfillmentInstructionsOperations.validateMedicationFullfillmentInstructionsText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationFullfillmentInstructions init() {
    		CDAUtil.init(this);
    		return this;
	}
} //MedicationFullfillmentInstructionsImpl
