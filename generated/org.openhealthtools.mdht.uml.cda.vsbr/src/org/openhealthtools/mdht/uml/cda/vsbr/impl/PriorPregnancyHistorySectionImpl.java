/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.vsbr.DateofLastLiveBirth;
import org.openhealthtools.mdht.uml.cda.vsbr.EstimateofGestation;
import org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate;
import org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsNowLiving;
import org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsNowDead;
import org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcome;
import org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.PriorPregnancyHistorySectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prior Pregnancy History Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PriorPregnancyHistorySectionImpl extends SectionImpl implements PriorPregnancyHistorySection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PriorPregnancyHistorySectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.PRIOR_PREGNANCY_HISTORY_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PriorPregnancyHistorySectionOperations.validatePriorPregnancyHistorySectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySectionClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PriorPregnancyHistorySectionOperations.validatePriorPregnancyHistorySectionClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySectionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PriorPregnancyHistorySectionOperations.validatePriorPregnancyHistorySectionMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PriorPregnancyHistorySectionOperations.validatePriorPregnancyHistorySectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PriorPregnancyHistorySectionOperations.validatePriorPregnancyHistorySectionCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PriorPregnancyHistorySectionOperations.validatePriorPregnancyHistorySectionText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySectionDateofLastLiveBirth(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PriorPregnancyHistorySectionOperations.validatePriorPregnancyHistorySectionDateofLastLiveBirth(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySectionLastMenstrualPeriodDate(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PriorPregnancyHistorySectionOperations.validatePriorPregnancyHistorySectionLastMenstrualPeriodDate(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySectionNumberofBirthsStillLiving(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PriorPregnancyHistorySectionOperations.validatePriorPregnancyHistorySectionNumberofBirthsStillLiving(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySectionNumberofLiveBirthsnowDead(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PriorPregnancyHistorySectionOperations.validatePriorPregnancyHistorySectionNumberofLiveBirthsnowDead(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySectionOtherPregnancyOutcomes(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PriorPregnancyHistorySectionOperations.validatePriorPregnancyHistorySectionOtherPregnancyOutcomes(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorPregnancyHistorySectionEstimateofGestation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PriorPregnancyHistorySectionOperations.validatePriorPregnancyHistorySectionEstimateofGestation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateofLastLiveBirth getDateofLastLiveBirth() {
		return PriorPregnancyHistorySectionOperations.getDateofLastLiveBirth(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastMenstrualPeriodDate getLastMenstrualPeriodDate() {
		return PriorPregnancyHistorySectionOperations.getLastMenstrualPeriodDate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberofBirthsNowLiving getNumberofBirthsStillLiving() {
		return PriorPregnancyHistorySectionOperations.getNumberofBirthsStillLiving(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberofLiveBirthsNowDead getNumberofLiveBirthsnowDead() {
		return PriorPregnancyHistorySectionOperations.getNumberofLiveBirthsnowDead(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherPregnancyOutcome getOtherPregnancyOutcomes() {
		return PriorPregnancyHistorySectionOperations.getOtherPregnancyOutcomes(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstimateofGestation getEstimateofGestation() {
		return PriorPregnancyHistorySectionOperations.getEstimateofGestation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorPregnancyHistorySection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorPregnancyHistorySection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PriorPregnancyHistorySectionImpl
