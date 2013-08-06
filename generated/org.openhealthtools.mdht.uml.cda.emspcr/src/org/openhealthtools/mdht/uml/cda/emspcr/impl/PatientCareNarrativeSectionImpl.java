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
import org.openhealthtools.mdht.uml.cda.emspcr.PatientCareNarrativeSection;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientCareNarrativeSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Care Narrative Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PatientCareNarrativeSectionImpl extends SectionImpl implements PatientCareNarrativeSection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected PatientCareNarrativeSectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PATIENT_CARE_NARRATIVE_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePatientCareNarrativeSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientCareNarrativeSectionOperations.validatePatientCareNarrativeSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePatientCareNarrativeSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareNarrativeSectionOperations.validatePatientCareNarrativeSectionCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePatientCareNarrativeSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareNarrativeSectionOperations.validatePatientCareNarrativeSectionCodeP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePatientCareNarrativeSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareNarrativeSectionOperations.validatePatientCareNarrativeSectionTitle(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePatientCareNarrativeSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientCareNarrativeSectionOperations.validatePatientCareNarrativeSectionText(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PatientCareNarrativeSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientCareNarrativeSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PatientCareNarrativeSectionImpl
