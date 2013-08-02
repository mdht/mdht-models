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
	public boolean validateEMSPCRMedicationsAdministeredSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationsAdministeredSectionOperations.validateEMSPCRMedicationsAdministeredSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRMedicationsAdministeredSectionTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationsAdministeredSectionOperations.validateEMSPCRMedicationsAdministeredSectionTitle(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRMedicationsAdministeredSectionText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationsAdministeredSectionOperations.validateEMSPCRMedicationsAdministeredSectionText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRMedicationsAdministeredSectionMedicationAdministered(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationsAdministeredSectionOperations.validateEMSPCRMedicationsAdministeredSectionMedicationAdministered(
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
