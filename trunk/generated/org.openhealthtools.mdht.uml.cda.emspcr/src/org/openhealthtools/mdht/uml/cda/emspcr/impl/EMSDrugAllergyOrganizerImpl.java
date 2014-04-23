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
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.emspcr.EMSDrugAllergy;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDrugAllergyOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugAllergyObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSDrugAllergyOrganizerOperations;

import org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Drug Allergy Organizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSDrugAllergyOrganizerImpl extends OrganizerImpl implements EMSDrugAllergyOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSDrugAllergyOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_DRUG_ALLERGY_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDrugAllergyOrganizerEMSDrugAllergy(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSDrugAllergyOrganizerOperations.validateEMSDrugAllergyOrganizerEMSDrugAllergy(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDrugAllergyOrganizerExistenceOfDrugAllergyObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSDrugAllergyOrganizerOperations.validateEMSDrugAllergyOrganizerExistenceOfDrugAllergyObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EMSDrugAllergy> getEMSDrugAllergies() {
		return EMSDrugAllergyOrganizerOperations.getEMSDrugAllergies(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceOfDrugAllergyObservation getExistenceOfDrugAllergyObservation() {
		return EMSDrugAllergyOrganizerOperations.getExistenceOfDrugAllergyObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSDrugAllergyOrganizer init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSDrugAllergyOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EMSDrugAllergyOrganizerImpl
