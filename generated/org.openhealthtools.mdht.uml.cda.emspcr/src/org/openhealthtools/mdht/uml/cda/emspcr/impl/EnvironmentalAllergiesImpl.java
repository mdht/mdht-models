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

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergies;
import org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergy;
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfEnvironmentalAllergy;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EnvironmentalAllergiesOperations;

import org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environmental Allergies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EnvironmentalAllergiesImpl extends OrganizerImpl implements EnvironmentalAllergies {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentalAllergiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.ENVIRONMENTAL_ALLERGIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironmentalAllergiesExistenceOfEnvironmentalAllergy(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EnvironmentalAllergiesOperations.validateEnvironmentalAllergiesExistenceOfEnvironmentalAllergy(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironmentalAllergiesEnvironmentalAllergy(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EnvironmentalAllergiesOperations.validateEnvironmentalAllergiesEnvironmentalAllergy(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironmentalAllergiesTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EnvironmentalAllergiesOperations.validateEnvironmentalAllergiesTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceOfEnvironmentalAllergy getExistenceOfEnvironmentalAllergy() {
		return EnvironmentalAllergiesOperations.getExistenceOfEnvironmentalAllergy(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvironmentalAllergy> getEnvironmentalAllergies() {
		return EnvironmentalAllergiesOperations.getEnvironmentalAllergies(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentalAllergies init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentalAllergies init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EnvironmentalAllergiesImpl
