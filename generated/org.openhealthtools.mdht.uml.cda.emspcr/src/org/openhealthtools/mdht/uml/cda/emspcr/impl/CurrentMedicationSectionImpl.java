/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.impl.MedicationsSectionImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedication;
import org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.CurrentlyOnMedication;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientOnAnticoagulants;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.CurrentMedicationSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Current Medication Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CurrentMedicationSectionImpl extends MedicationsSectionImpl implements CurrentMedicationSection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected CurrentMedicationSectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.CURRENT_MEDICATION_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCurrentMedicationSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CurrentMedicationSectionOperations.validateCurrentMedicationSectionTitle(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCurrentMedicationSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CurrentMedicationSectionOperations.validateCurrentMedicationSectionText(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCurrentMedicationSectionCurrentlyOnMedication(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CurrentMedicationSectionOperations.validateCurrentMedicationSectionCurrentlyOnMedication(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCurrentMedicationSectionPatientOnAnticoagulants(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CurrentMedicationSectionOperations.validateCurrentMedicationSectionPatientOnAnticoagulants(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateCurrentMedicationSectionCurrentMedication(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CurrentMedicationSectionOperations.validateCurrentMedicationSectionCurrentMedication(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public CurrentlyOnMedication getCurrentlyOnMedication() {
		return CurrentMedicationSectionOperations.getCurrentlyOnMedication(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PatientOnAnticoagulants getPatientOnAnticoagulants() {
		return CurrentMedicationSectionOperations.getPatientOnAnticoagulants(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public CurrentMedication getCurrentMedication() {
		return CurrentMedicationSectionOperations.getCurrentMedication(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public boolean validateMedicationsSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CurrentMedicationSectionOperations.validateMedicationsSectionEntriesOptionalTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public CurrentMedicationSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurrentMedicationSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CurrentMedicationSectionImpl
