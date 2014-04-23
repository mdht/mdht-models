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

import org.openhealthtools.mdht.uml.cda.emspcr.Complaint;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuity;
import org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptoms;
import org.openhealthtools.mdht.uml.cda.emspcr.PossibleInjury;
import org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptom;
import org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpression;
import org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressions;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSSituationSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Situation Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSSituationSectionImpl extends SectionImpl implements EMSSituationSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSSituationSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_SITUATION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSituationSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSituationSectionOperations.validateEMSSituationSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSituationSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSituationSectionOperations.validateEMSSituationSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSituationSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSituationSectionOperations.validateEMSSituationSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSituationSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSituationSectionOperations.validateEMSSituationSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSituationSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSituationSectionOperations.validateEMSSituationSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSituationSectionComplaint(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSituationSectionOperations.validateEMSSituationSectionComplaint(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSituationSectionPossibleInjury(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSituationSectionOperations.validateEMSSituationSectionPossibleInjury(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSituationSectionProviderPrimaryImpression(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSSituationSectionOperations.validateEMSSituationSectionProviderPrimaryImpression(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSituationSectionPrimarySymptom(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSituationSectionOperations.validateEMSSituationSectionPrimarySymptom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSituationSectionOtherSymptoms(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSituationSectionOperations.validateEMSSituationSectionOtherSymptoms(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSituationSectionProviderSecondaryImpressions(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSSituationSectionOperations.validateEMSSituationSectionProviderSecondaryImpressions(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSituationSectionInitialPatientAcuity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSSituationSectionOperations.validateEMSSituationSectionInitialPatientAcuity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Complaint> getComplaints() {
		return EMSSituationSectionOperations.getComplaints(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossibleInjury getPossibleInjury() {
		return EMSSituationSectionOperations.getPossibleInjury(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderPrimaryImpression getProviderPrimaryImpression() {
		return EMSSituationSectionOperations.getProviderPrimaryImpression(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimarySymptom getPrimarySymptom() {
		return EMSSituationSectionOperations.getPrimarySymptom(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherSymptoms getOtherSymptoms() {
		return EMSSituationSectionOperations.getOtherSymptoms(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderSecondaryImpressions getProviderSecondaryImpressions() {
		return EMSSituationSectionOperations.getProviderSecondaryImpressions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialPatientAcuity getInitialPatientAcuity() {
		return EMSSituationSectionOperations.getInitialPatientAcuity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSSituationSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSSituationSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EMSSituationSectionImpl
