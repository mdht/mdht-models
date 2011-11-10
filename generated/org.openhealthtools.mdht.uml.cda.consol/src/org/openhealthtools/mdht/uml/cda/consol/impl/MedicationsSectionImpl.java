/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Medication;
import org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationsSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medications Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationsSectionImpl extends SectionImpl implements MedicationsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATIONS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSectionHasMedicationOrSupplyActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationsSectionOperations.validateMedicationsSectionHasMedicationOrSupplyActivity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationsSectionOperations.validateMedicationsSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationsSectionOperations.validateMedicationsSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationsSectionOperations.validateMedicationsSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationsSectionOperations.validateMedicationsSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSectionMedication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationsSectionOperations.validateMedicationsSectionMedication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSectionSupplyActivity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationsSectionOperations.validateMedicationsSectionSupplyActivity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Medication> getMedications() {
		return MedicationsSectionOperations.getMedications(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationOrderInformation> getSupplyActivities() {
		return MedicationsSectionOperations.getSupplyActivities(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSection init() {
		CDAUtil.init(this);
		return this;
	}
} // MedicationsSectionImpl
