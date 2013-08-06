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
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfEnvironmentalAllergy;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ExistenceOfEnvironmentalAllergyOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Existence Of Environmental Allergy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExistenceOfEnvironmentalAllergyImpl extends ObservationImpl implements ExistenceOfEnvironmentalAllergy {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ExistenceOfEnvironmentalAllergyImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EXISTENCE_OF_ENVIRONMENTAL_ALLERGY;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateExistenceOfEnvironmentalAllergyTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExistenceOfEnvironmentalAllergyOperations.validateExistenceOfEnvironmentalAllergyTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateExistenceOfEnvironmentalAllergyCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExistenceOfEnvironmentalAllergyOperations.validateExistenceOfEnvironmentalAllergyCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateExistenceOfEnvironmentalAllergyValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExistenceOfEnvironmentalAllergyOperations.validateExistenceOfEnvironmentalAllergyValue(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateExistenceOfEnvironmentalAllergyMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExistenceOfEnvironmentalAllergyOperations.validateExistenceOfEnvironmentalAllergyMoodCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ExistenceOfEnvironmentalAllergy init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceOfEnvironmentalAllergy init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ExistenceOfEnvironmentalAllergyImpl
