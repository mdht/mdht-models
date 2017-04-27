/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDrugAllergy;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugAllergyObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizerActuallyDreg;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.NonDrugAllergyOrganizerActuallyDregOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Drug Allergy Organizer Actually Dreg</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NonDrugAllergyOrganizerActuallyDregImpl extends org.eclipse.mdht.uml.cda.impl.OrganizerImpl implements
		NonDrugAllergyOrganizerActuallyDreg {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonDrugAllergyOrganizerActuallyDregImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonDrugAllergyOrganizerActuallyDregEMSDrugAllergy(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NonDrugAllergyOrganizerActuallyDregOperations.validateNonDrugAllergyOrganizerActuallyDregEMSDrugAllergy(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonDrugAllergyOrganizerActuallyDregExistenceOfDrugAllergyObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonDrugAllergyOrganizerActuallyDregOperations.validateNonDrugAllergyOrganizerActuallyDregExistenceOfDrugAllergyObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EMSDrugAllergy> getEMSDrugAllergies() {
		return NonDrugAllergyOrganizerActuallyDregOperations.getEMSDrugAllergies(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceOfDrugAllergyObservation getExistenceOfDrugAllergyObservation() {
		return NonDrugAllergyOrganizerActuallyDregOperations.getExistenceOfDrugAllergyObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonDrugAllergyOrganizerActuallyDreg init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NonDrugAllergyOrganizerActuallyDreg init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // NonDrugAllergyOrganizerActuallyDregImpl
