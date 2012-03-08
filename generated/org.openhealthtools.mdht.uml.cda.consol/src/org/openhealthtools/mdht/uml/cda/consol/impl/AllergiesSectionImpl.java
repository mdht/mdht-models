/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.AllergiesSectionOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allergies Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.impl.AllergiesSectionImpl#getAllergyProblemAct <em>Allergy Problem Act</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergiesSectionImpl extends AllergiesSectionEntriesOptionalImpl implements AllergiesSection {
	/**
	 * The cached value of the '{@link #getAllergyProblemAct() <em>Allergy Problem Act</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergyProblemAct()
	 * @generated
	 * @ordered
	 */
	protected EList<AllergyProblemAct> allergyProblemAct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergiesSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ALLERGIES_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllergyProblemAct> getAllergyProblemAct() {
		if (allergyProblemAct == null) {
			allergyProblemAct = new EObjectResolvingEList<AllergyProblemAct>(AllergyProblemAct.class, this, ConsolPackage.ALLERGIES_SECTION__ALLERGY_PROBLEM_ACT);
		}
		return allergyProblemAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergiesSectionEntriesOptionalCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergiesSectionOperations.validateAllergiesSectionEntriesOptionalCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConsolPackage.ALLERGIES_SECTION__ALLERGY_PROBLEM_ACT:
				return getAllergyProblemAct();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConsolPackage.ALLERGIES_SECTION__ALLERGY_PROBLEM_ACT:
				getAllergyProblemAct().clear();
				getAllergyProblemAct().addAll((Collection<? extends AllergyProblemAct>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConsolPackage.ALLERGIES_SECTION__ALLERGY_PROBLEM_ACT:
				getAllergyProblemAct().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConsolPackage.ALLERGIES_SECTION__ALLERGY_PROBLEM_ACT:
				return allergyProblemAct != null && !allergyProblemAct.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergiesSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergiesSectionOperations.validateAllergiesSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergiesSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergiesSectionOperations.validateAllergiesSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergiesSectionAllergyDrugSensitivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergiesSectionOperations.validateAllergiesSectionAllergyDrugSensitivity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllergyProblemAct> getAllergyDrugSensitivities() {
		return AllergiesSectionOperations.getAllergyDrugSensitivities(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergiesSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergiesSectionOperations.validateAllergiesSectionEntriesOptionalTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergiesSection init() {
    	CDAUtil.init(this);
    	return this;
	}
} // AllergiesSectionImpl
