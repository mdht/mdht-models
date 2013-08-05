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

import org.openhealthtools.mdht.uml.cda.emspcr.Complaint;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuity;
import org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptoms;
import org.openhealthtools.mdht.uml.cda.emspcr.PossibleInjury;
import org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptom;
import org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpression;
import org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressions;
import org.openhealthtools.mdht.uml.cda.emspcr.SituationSection;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.SituationSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Situation Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SituationSectionImpl extends SectionImpl implements SituationSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SituationSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.SITUATION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSituationSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SituationSectionOperations.validateSituationSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSituationSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SituationSectionOperations.validateSituationSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSituationSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SituationSectionOperations.validateSituationSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSituationSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SituationSectionOperations.validateSituationSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSituationSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SituationSectionOperations.validateSituationSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSituationSectionComplaint(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SituationSectionOperations.validateSituationSectionComplaint(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSituationSectionPossibleInjury(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SituationSectionOperations.validateSituationSectionPossibleInjury(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSituationSectionProviderPrimaryImpression(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SituationSectionOperations.validateSituationSectionProviderPrimaryImpression(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSituationSectionPrimarySymptom(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SituationSectionOperations.validateSituationSectionPrimarySymptom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSituationSectionOtherSymptoms(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SituationSectionOperations.validateSituationSectionOtherSymptoms(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSituationSectionProviderSecondaryImpressions(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SituationSectionOperations.validateSituationSectionProviderSecondaryImpressions(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSituationSectionInitialPatientAcuity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SituationSectionOperations.validateSituationSectionInitialPatientAcuity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Complaint getComplaint() {
		return SituationSectionOperations.getComplaint(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossibleInjury getPossibleInjury() {
		return SituationSectionOperations.getPossibleInjury(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderPrimaryImpression getProviderPrimaryImpression() {
		return SituationSectionOperations.getProviderPrimaryImpression(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimarySymptom getPrimarySymptom() {
		return SituationSectionOperations.getPrimarySymptom(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherSymptoms getOtherSymptoms() {
		return SituationSectionOperations.getOtherSymptoms(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderSecondaryImpressions getProviderSecondaryImpressions() {
		return SituationSectionOperations.getProviderSecondaryImpressions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialPatientAcuity getInitialPatientAcuity() {
		return SituationSectionOperations.getInitialPatientAcuity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SituationSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SituationSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // SituationSectionImpl
