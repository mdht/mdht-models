/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.MedicationsAdministeredSectionOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Medications Administered Section</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class MedicationsAdministeredSectionImpl
		extends org.openhealthtools.mdht.uml.cda.consol.impl.MedicationsAdministeredSectionImpl
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
	@Override
	public EList<MedicationActivity> getMu2consolMedicationActivities() {
		return MedicationsAdministeredSectionOperations.getMu2consolMedicationActivities(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean validateMedicationsAdministeredSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationsAdministeredSectionOperations.validateMedicationsAdministeredSectionTemplateId(this,
				diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean validateMedicationsAdministeredSectionMedicationActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationsAdministeredSectionOperations.validateMedicationsAdministeredSectionMedicationActivity(this,
				diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public MedicationsAdministeredSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public MedicationsAdministeredSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MedicationsAdministeredSectionImpl
