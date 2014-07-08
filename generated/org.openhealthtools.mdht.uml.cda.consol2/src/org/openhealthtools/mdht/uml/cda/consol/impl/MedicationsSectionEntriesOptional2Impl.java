/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional2;

import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationsSectionEntriesOptional2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medications Section Entries Optional2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationsSectionEntriesOptional2Impl extends MedicationsSectionEntriesOptionalImpl implements
		MedicationsSectionEntriesOptional2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationsSectionEntriesOptional2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATIONS_SECTION_ENTRIES_OPTIONAL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSectionEntriesOptionalCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationsSectionEntriesOptional2Operations.validateMedicationsSectionEntriesOptionalCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSectionEntriesOptionalMedicationActivity2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationsSectionEntriesOptional2Operations.validateMedicationsSectionEntriesOptionalMedicationActivity2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationActivity2> getConsolMedicationActivity2s() {
		return MedicationsSectionEntriesOptional2Operations.getConsolMedicationActivity2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationsSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationsSectionEntriesOptional2Operations.validateMedicationsSectionEntriesOptionalTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationsSectionEntriesOptionalCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationsSectionEntriesOptional2Operations.validateMedicationsSectionEntriesOptionalCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationsSectionEntriesOptional2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationsSectionEntriesOptional2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MedicationsSectionEntriesOptional2Impl
