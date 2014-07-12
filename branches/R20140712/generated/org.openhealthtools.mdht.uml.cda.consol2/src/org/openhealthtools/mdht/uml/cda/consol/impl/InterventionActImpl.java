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

import org.openhealthtools.mdht.uml.cda.consol.ActReference;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference;
import org.openhealthtools.mdht.uml.cda.consol.GoalObservation;
import org.openhealthtools.mdht.uml.cda.consol.InterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations;

import org.openhealthtools.mdht.uml.cda.consol.operations.InterventionActOperations;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intervention Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InterventionActImpl extends ActImpl implements InterventionAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterventionActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.INTERVENTION_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActMoodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActMoodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActGoalObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActGoalObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActNutritionRecommendations(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActNutritionRecommendations(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActActReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActActReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActActReference2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActActReference2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActAuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActAuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActExternalDocumentReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActExternalDocumentReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GoalObservation> getGoalObservations() {
		return InterventionActOperations.getGoalObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterventionAct> getInterventionActs() {
		return InterventionActOperations.getInterventionActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutritionRecommendations> getNutritionRecommendationss() {
		return InterventionActOperations.getNutritionRecommendationss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActReference> getActReferences() {
		return InterventionActOperations.getActReferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActReference> getActReference2s() {
		return InterventionActOperations.getActReference2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalDocumentReference> getExternalDocumentReferences() {
		return InterventionActOperations.getExternalDocumentReferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterventionAct init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterventionAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // InterventionActImpl
