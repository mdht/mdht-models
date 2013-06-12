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

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered;
import org.openhealthtools.mdht.uml.cda.emspcr.MedicationsAdministeredSection;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.MedicationsAdministeredSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medications Administered Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationsAdministeredSectionImpl extends
		org.openhealthtools.mdht.uml.cda.consol.impl.MedicationsAdministeredSectionImpl implements
		MedicationsAdministeredSection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected MedicationsAdministeredSectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.MEDICATIONS_ADMINISTERED_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEmspcrMedicationsAdministeredSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationsAdministeredSectionOperations.validateEmspcrMedicationsAdministeredSectionCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEmspcrMedicationsAdministeredSectionTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationsAdministeredSectionOperations.validateEmspcrMedicationsAdministeredSectionTitle(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEmspcrMedicationsAdministeredSectionText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationsAdministeredSectionOperations.validateEmspcrMedicationsAdministeredSectionText(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEmspcrMedicationsAdministeredSectionMedicationAdministered(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationsAdministeredSectionOperations.validateEmspcrMedicationsAdministeredSectionMedicationAdministered(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public MedicationAdministered getMedicationAdministered() {
		return MedicationsAdministeredSectionOperations.getMedicationAdministered(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public boolean validateMedicationsAdministeredSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationsAdministeredSectionOperations.validateMedicationsAdministeredSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public MedicationsAdministeredSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationsAdministeredSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MedicationsAdministeredSectionImpl
