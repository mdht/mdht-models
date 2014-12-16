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
import org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSectionEntriesOptional2;

import org.openhealthtools.mdht.uml.cda.consol.operations.DischargeMedicationsSectionEntriesOptional2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discharge Medications Section Entries Optional2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DischargeMedicationsSectionEntriesOptional2Impl extends
		HospitalDischargeMedicationsSectionEntriesOptionalImpl implements DischargeMedicationsSectionEntriesOptional2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DischargeMedicationsSectionEntriesOptional2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication2(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeMedicationsSectionEntriesOptional2Operations.validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DischargeMedication2> getConsolDischargeMedication2s() {
		return DischargeMedicationsSectionEntriesOptional2Operations.getConsolDischargeMedication2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeMedicationsSectionEntriesOptional2Operations.validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DischargeMedicationsSectionEntriesOptional2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DischargeMedicationsSectionEntriesOptional2 init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // DischargeMedicationsSectionEntriesOptional2Impl
