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
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemStatus;
import org.openhealthtools.mdht.uml.cda.consol.PrognosisObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemObservation2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem Observation2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProblemObservation2Impl extends ProblemObservationImpl implements ProblemObservation2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemObservation2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROBLEM_OBSERVATION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation2HasTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservation2Operations.validateProblemObservation2HasTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation2TextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemObservation2Operations.validateProblemObservation2TextReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation2HasTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemObservation2Operations.validateProblemObservation2HasTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservation2HasOnsetDate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservation2Operations.validateProblemObservation2HasOnsetDate(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservation2HasResolutionDate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservation2Operations.validateProblemObservation2HasResolutionDate(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservation2ValueNullFlavor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservation2Operations.validateProblemObservation2ValueNullFlavor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservation2ValueNullFlavorUnknown(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemObservation2Operations.validateProblemObservation2ValueNullFlavorUnknown(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservation2Operations.validateProblemObservationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservation2PrognosisObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemObservation2Operations.validateProblemObservation2PrognosisObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation2PriorityPreference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemObservation2Operations.validateProblemObservation2PriorityPreference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservation2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemObservation2Operations.validateProblemObservation2AuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservation2CDQualifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservation2Operations.validateProblemObservation2CDQualifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservation2CDCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservation2Operations.validateProblemObservation2CDCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrognosisObservation getPrognosisObservation() {
		return ProblemObservation2Operations.getPrognosisObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProviderPriorityPreference> getPriorityPreferences() {
		return ProblemObservation2Operations.getPriorityPreferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemStatus getConsolProblemStatus() {
		return ProblemObservation2Operations.getConsolProblemStatus(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthStatusObservation getConsolHealthStatusObservation() {
		return ProblemObservation2Operations.getConsolHealthStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservation2Operations.validateProblemObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservation2Operations.validateProblemObservationNegationInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservation2Operations.validateProblemObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservation2Operations.validateProblemObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservation2Operations.validateProblemObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservation2Operations.validateProblemObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservation2Operations.validateProblemObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservation2Operations.validateProblemObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationProblemStatus(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservation2Operations.validateProblemObservationProblemStatus(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemObservation2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProblemObservation2Impl
