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

import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.MedicationsAdministeredSectionOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Medications Administered Section</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class MedicationsAdministeredSectionImpl
		extends
		org.openhealthtools.mdht.uml.cda.consol.impl.MedicationsAdministeredSectionImpl
		implements MedicationsAdministeredSection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MedicationsAdministeredSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.MEDICATIONS_ADMINISTERED_SECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMu2consolMedicationsAdministeredSectionMedicationActivity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationsAdministeredSectionOperations
				.validateMu2consolMedicationsAdministeredSectionMedicationActivity(
						this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<MedicationActivity> getmu2consolMedicationActivities() {
		return MedicationsAdministeredSectionOperations
				.getmu2consolMedicationActivities(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public MedicationsAdministeredSection init() {
		CDAUtil.init(this);
		return this;
	}
} // MedicationsAdministeredSectionImpl
