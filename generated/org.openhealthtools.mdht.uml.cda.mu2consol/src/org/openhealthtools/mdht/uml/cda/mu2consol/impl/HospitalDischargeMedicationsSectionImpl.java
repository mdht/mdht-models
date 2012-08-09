/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.DischargeMedication;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.HospitalDischargeMedicationsSectionOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Hospital Discharge Medications Section</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class HospitalDischargeMedicationsSectionImpl
		extends
		org.openhealthtools.mdht.uml.cda.consol.impl.HospitalDischargeMedicationsSectionImpl
		implements HospitalDischargeMedicationsSection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected HospitalDischargeMedicationsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMu2consolHospitalDischargeMedicationsSectionDischargeMedication(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HospitalDischargeMedicationsSectionOperations
				.validateMu2consolHospitalDischargeMedicationsSectionDischargeMedication(
						this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMu2consolHospitalDischargeMedicationsSectionMedicationActivity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HospitalDischargeMedicationsSectionOperations
				.validateMu2consolHospitalDischargeMedicationsSectionMedicationActivity(
						this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<DischargeMedication> getmu2consolDischargeMedications() {
		return HospitalDischargeMedicationsSectionOperations
				.getmu2consolDischargeMedications(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MedicationActivity getMedicationActivity() {
		return HospitalDischargeMedicationsSectionOperations
				.getMedicationActivity(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public HospitalDischargeMedicationsSection init() {
		CDAUtil.init(this);
		return this;
	}
} // HospitalDischargeMedicationsSectionImpl
