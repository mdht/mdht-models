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
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfNonDrugAllergy;
import org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergy;
import org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.NonDrugAllergyOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Drug Allergy Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NonDrugAllergyOrganizerImpl extends org.eclipse.mdht.uml.cda.impl.OrganizerImpl implements NonDrugAllergyOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonDrugAllergyOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.NON_DRUG_ALLERGY_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonDrugAllergyOrganizerExistenceOfNonDrugAllergy(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NonDrugAllergyOrganizerOperations.validateNonDrugAllergyOrganizerExistenceOfNonDrugAllergy(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonDrugAllergyOrganizerNonDrugAllergy(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NonDrugAllergyOrganizerOperations.validateNonDrugAllergyOrganizerNonDrugAllergy(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonDrugAllergyOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonDrugAllergyOrganizerOperations.validateNonDrugAllergyOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceOfNonDrugAllergy getExistenceOfNonDrugAllergy() {
		return NonDrugAllergyOrganizerOperations.getExistenceOfNonDrugAllergy(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonDrugAllergy> getNonDrugAllergies() {
		return NonDrugAllergyOrganizerOperations.getNonDrugAllergies(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonDrugAllergyOrganizer init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NonDrugAllergyOrganizer init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // NonDrugAllergyOrganizerImpl
