/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DischargeMedication2;
import org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSection2;

import org.openhealthtools.mdht.uml.cda.consol.operations.DischargeMedicationsSection2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discharge Medications Section2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DischargeMedicationsSection2Impl extends DischargeMedicationsSectionEntriesOptional2Impl implements
		DischargeMedicationsSection2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DischargeMedicationsSection2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DISCHARGE_MEDICATIONS_SECTION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeMedicationsSection2NullFlavor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeMedicationsSection2Operations.validateDischargeMedicationsSection2NullFlavor(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeMedicationsSection2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeMedicationsSection2Operations.validateDischargeMedicationsSection2CodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeMedicationsSection2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeMedicationsSection2Operations.validateDischargeMedicationsSection2Code(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeMedicationsSection2Title(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeMedicationsSection2Operations.validateDischargeMedicationsSection2Title(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeMedicationsSection2Text(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeMedicationsSection2Operations.validateDischargeMedicationsSection2Text(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeMedicationsSection2Operations.validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication2(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeMedicationsSection2Operations.validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DischargeMedication2> getConsolDischargeMedication2s() {
		return DischargeMedicationsSection2Operations.getConsolDischargeMedication2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DischargeMedicationsSection2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DischargeMedicationsSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // DischargeMedicationsSection2Impl
