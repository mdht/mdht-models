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
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugAllergyObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ExistenceOfDrugAllergyObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Existence Of Drug Allergy Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExistenceOfDrugAllergyObservationImpl extends ObservationImpl implements ExistenceOfDrugAllergyObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExistenceOfDrugAllergyObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfDrugAllergyObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExistenceOfDrugAllergyObservationOperations.validateExistenceOfDrugAllergyObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfDrugAllergyObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExistenceOfDrugAllergyObservationOperations.validateExistenceOfDrugAllergyObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfDrugAllergyObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExistenceOfDrugAllergyObservationOperations.validateExistenceOfDrugAllergyObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfDrugAllergyObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExistenceOfDrugAllergyObservationOperations.validateExistenceOfDrugAllergyObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceOfDrugAllergyObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceOfDrugAllergyObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ExistenceOfDrugAllergyObservationImpl
