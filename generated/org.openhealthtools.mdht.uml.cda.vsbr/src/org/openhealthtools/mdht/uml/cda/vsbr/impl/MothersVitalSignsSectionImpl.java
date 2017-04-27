/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsObservation;
import org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.MothersVitalSignsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mothers Vital Signs Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MothersVitalSignsSectionImpl extends org.eclipse.mdht.uml.cda.impl.SectionImpl
		implements MothersVitalSignsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MothersVitalSignsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.MOTHERS_VITAL_SIGNS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MothersVitalSignsSectionOperations.validateMothersVitalSignsSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsSectionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MothersVitalSignsSectionOperations.validateMothersVitalSignsSectionClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsSectionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MothersVitalSignsSectionOperations.validateMothersVitalSignsSectionMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MothersVitalSignsSectionOperations.validateMothersVitalSignsSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MothersVitalSignsSectionOperations.validateMothersVitalSignsSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MothersVitalSignsSectionOperations.validateMothersVitalSignsSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMothersVitalSignsSectionMothersVitalSignsObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MothersVitalSignsSectionOperations.validateMothersVitalSignsSectionMothersVitalSignsObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MothersVitalSignsObservation> getMothersVitalSignsObservations() {
		return MothersVitalSignsSectionOperations.getMothersVitalSignsObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MothersVitalSignsSection init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MothersVitalSignsSection init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}
} // MothersVitalSignsSectionImpl
