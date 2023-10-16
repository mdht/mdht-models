/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention;

import org.openhealthtools.mdht.uml.cda.consol.operations.PregnancyIntentionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pregnancy Intention</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PregnancyIntentionImpl extends ObservationImpl implements PregnancyIntention {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PregnancyIntentionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PREGNANCY_INTENTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyIntentionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyIntentionOperations.validatePregnancyIntentionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyIntentionId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyIntentionOperations.validatePregnancyIntentionId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyIntentionStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyIntentionOperations.validatePregnancyIntentionStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyIntentionStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyIntentionOperations.validatePregnancyIntentionStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyIntentionEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyIntentionOperations.validatePregnancyIntentionEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyIntentionValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyIntentionOperations.validatePregnancyIntentionValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyIntentionValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyIntentionOperations.validatePregnancyIntentionValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyIntentionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyIntentionOperations.validatePregnancyIntentionClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyIntentionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyIntentionOperations.validatePregnancyIntentionMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyIntentionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyIntentionOperations.validatePregnancyIntentionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyIntentionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyIntentionOperations.validatePregnancyIntentionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyIntentionIVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyIntentionOperations.validatePregnancyIntentionIVLTSLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregnancyIntentionIVLTSHigh(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PregnancyIntentionOperations.validatePregnancyIntentionIVLTSHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PregnancyIntention init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PregnancyIntention init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PregnancyIntentionImpl
