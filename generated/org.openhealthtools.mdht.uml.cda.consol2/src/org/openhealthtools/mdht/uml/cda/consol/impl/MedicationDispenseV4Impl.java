/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispenseV4;

import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationDispenseV4Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Dispense V4</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MedicationDispenseV4Impl extends MedicationDispense2Impl implements MedicationDispenseV4 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationDispenseV4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATION_DISPENSE_V4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseV4CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationDispenseV4Operations.validateMedicationDispenseV4CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseV4Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationDispenseV4Operations.validateMedicationDispenseV4Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationDispense2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationDispenseV4Operations.validateMedicationDispense2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationDispenseStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationDispenseV4Operations.validateMedicationDispenseStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationDispenseStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationDispenseV4Operations.validateMedicationDispenseStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationDispenseV4 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationDispenseV4 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MedicationDispenseV4Impl
