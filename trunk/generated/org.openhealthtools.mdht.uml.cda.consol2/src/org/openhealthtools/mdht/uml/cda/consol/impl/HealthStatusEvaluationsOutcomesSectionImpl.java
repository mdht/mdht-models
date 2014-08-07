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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsOutcomesSection;
import org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.HealthStatusEvaluationsOutcomesSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Health Status Evaluations Outcomes Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HealthStatusEvaluationsOutcomesSectionImpl extends SectionImpl implements
		HealthStatusEvaluationsOutcomesSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthStatusEvaluationsOutcomesSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthStatusEvaluationsOutcomesSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthStatusEvaluationsOutcomesSectionOperations.validateHealthStatusEvaluationsOutcomesSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthStatusEvaluationsOutcomesSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthStatusEvaluationsOutcomesSectionOperations.validateHealthStatusEvaluationsOutcomesSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthStatusEvaluationsOutcomesSectionCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthStatusEvaluationsOutcomesSectionOperations.validateHealthStatusEvaluationsOutcomesSectionCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthStatusEvaluationsOutcomesSectionTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthStatusEvaluationsOutcomesSectionOperations.validateHealthStatusEvaluationsOutcomesSectionTitle(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthStatusEvaluationsOutcomesSectionText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthStatusEvaluationsOutcomesSectionOperations.validateHealthStatusEvaluationsOutcomesSectionText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHealthStatusEvaluationsOutcomesSectionOutcomeObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HealthStatusEvaluationsOutcomesSectionOperations.validateHealthStatusEvaluationsOutcomesSectionOutcomeObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutcomeObservation> getOutcomeObservations() {
		return HealthStatusEvaluationsOutcomesSectionOperations.getOutcomeObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthStatusEvaluationsOutcomesSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthStatusEvaluationsOutcomesSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // HealthStatusEvaluationsOutcomesSectionImpl
