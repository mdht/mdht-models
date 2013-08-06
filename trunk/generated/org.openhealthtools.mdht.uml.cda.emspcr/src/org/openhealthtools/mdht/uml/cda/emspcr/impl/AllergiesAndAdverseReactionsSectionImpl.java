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

import org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergies;
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugAllergyObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.AllergiesAndAdverseReactionsSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allergies And Adverse Reactions Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AllergiesAndAdverseReactionsSectionImpl extends SectionImpl implements AllergiesAndAdverseReactionsSection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected AllergiesAndAdverseReactionsSectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.ALLERGIES_AND_ADVERSE_REACTIONS_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergiesAndAdverseReactionsSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergiesAndAdverseReactionsSectionOperations.validateAllergiesAndAdverseReactionsSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergiesAndAdverseReactionsSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergiesAndAdverseReactionsSectionOperations.validateAllergiesAndAdverseReactionsSectionCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergiesAndAdverseReactionsSectionTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergiesAndAdverseReactionsSectionOperations.validateAllergiesAndAdverseReactionsSectionTitle(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergiesAndAdverseReactionsSectionText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergiesAndAdverseReactionsSectionOperations.validateAllergiesAndAdverseReactionsSectionText(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergiesAndAdverseReactionsSectionObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergiesAndAdverseReactionsSectionOperations.validateAllergiesAndAdverseReactionsSectionObservation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergiesAndAdverseReactionsSectionDrugAllergyProblemAct(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergiesAndAdverseReactionsSectionOperations.validateAllergiesAndAdverseReactionsSectionDrugAllergyProblemAct(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergiesAndAdverseReactionsSectionEnvironmentalAllergies(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergiesAndAdverseReactionsSectionOperations.validateAllergiesAndAdverseReactionsSectionEnvironmentalAllergies(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ExistenceOfDrugAllergyObservation getObservation() {
		return AllergiesAndAdverseReactionsSectionOperations.getObservation(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public DrugAllergyProblemAct getDrugAllergyProblemAct() {
		return AllergiesAndAdverseReactionsSectionOperations.getDrugAllergyProblemAct(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EnvironmentalAllergies getEnvironmentalAllergies() {
		return AllergiesAndAdverseReactionsSectionOperations.getEnvironmentalAllergies(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public AllergiesAndAdverseReactionsSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesAndAdverseReactionsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AllergiesAndAdverseReactionsSectionImpl
