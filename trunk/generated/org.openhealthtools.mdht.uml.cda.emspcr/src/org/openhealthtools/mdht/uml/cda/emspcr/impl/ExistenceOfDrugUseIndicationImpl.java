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
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugUseIndication;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ExistenceOfDrugUseIndicationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Existence Of Drug Use Indication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExistenceOfDrugUseIndicationImpl extends ObservationImpl implements ExistenceOfDrugUseIndication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExistenceOfDrugUseIndicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EXISTENCE_OF_DRUG_USE_INDICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfDrugUseIndicationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExistenceOfDrugUseIndicationOperations.validateExistenceOfDrugUseIndicationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfDrugUseIndicationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExistenceOfDrugUseIndicationOperations.validateExistenceOfDrugUseIndicationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfDrugUseIndicationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExistenceOfDrugUseIndicationOperations.validateExistenceOfDrugUseIndicationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfDrugUseIndicationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExistenceOfDrugUseIndicationOperations.validateExistenceOfDrugUseIndicationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfDrugUseIndicationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExistenceOfDrugUseIndicationOperations.validateExistenceOfDrugUseIndicationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceOfDrugUseIndication init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceOfDrugUseIndication init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ExistenceOfDrugUseIndicationImpl
