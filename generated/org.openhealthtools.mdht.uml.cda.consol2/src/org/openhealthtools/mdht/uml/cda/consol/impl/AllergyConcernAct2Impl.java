/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2;
import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyConcernAct2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allergy Concern Act2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AllergyConcernAct2Impl extends AllergyProblemActImpl implements AllergyConcernAct2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyConcernAct2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ALLERGY_CONCERN_ACT2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyConcernAct2EffectiveTimeLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyConcernAct2Operations.validateAllergyConcernAct2EffectiveTimeLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyConcernAct2EffectiveTimeHigh(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyConcernAct2Operations.validateAllergyConcernAct2EffectiveTimeHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyConcernAct2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyConcernAct2Operations.validateAllergyConcernAct2AuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyProblemActAllergyObservation2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyConcernAct2Operations.validateAllergyProblemActAllergyObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyConcernAct2IVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyConcernAct2Operations.validateAllergyConcernAct2IVLTSLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyConcernAct2IVLTSHigh(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyConcernAct2Operations.validateAllergyConcernAct2IVLTSHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyConcernAct2CDCodeAndCodeSystemValues(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyConcernAct2Operations.validateAllergyConcernAct2CDCodeAndCodeSystemValues(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyConcernAct2AllergyProblemActCDCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyConcernAct2Operations.validateAllergyConcernAct2AllergyProblemActCDCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyConcernAct2AllergyProblemActCDCodeSystem(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyConcernAct2Operations.validateAllergyConcernAct2AllergyProblemActCDCodeSystem(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AllergyObservation2> getConsolAllergyObservation2s() {
		return AllergyConcernAct2Operations.getConsolAllergyObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyProblemActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyConcernAct2Operations.validateAllergyProblemActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyProblemActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyConcernAct2Operations.validateAllergyProblemActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyProblemActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyConcernAct2Operations.validateAllergyProblemActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyConcernAct2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyConcernAct2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AllergyConcernAct2Impl
