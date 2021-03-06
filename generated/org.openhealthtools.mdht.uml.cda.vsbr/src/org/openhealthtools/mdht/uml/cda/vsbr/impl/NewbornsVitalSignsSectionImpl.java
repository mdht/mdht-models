/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsObservation;
import org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.NewbornsVitalSignsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Newborns Vital Signs Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NewbornsVitalSignsSectionImpl extends org.eclipse.mdht.uml.cda.impl.SectionImpl
		implements NewbornsVitalSignsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewbornsVitalSignsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.NEWBORNS_VITAL_SIGNS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NewbornsVitalSignsSectionOperations.validateNewbornsVitalSignsSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsSectionClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NewbornsVitalSignsSectionOperations.validateNewbornsVitalSignsSectionClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsSectionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NewbornsVitalSignsSectionOperations.validateNewbornsVitalSignsSectionMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NewbornsVitalSignsSectionOperations.validateNewbornsVitalSignsSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NewbornsVitalSignsSectionOperations.validateNewbornsVitalSignsSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NewbornsVitalSignsSectionOperations.validateNewbornsVitalSignsSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornsVitalSignsSectionNewbornsVitalSignsObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NewbornsVitalSignsSectionOperations.validateNewbornsVitalSignsSectionNewbornsVitalSignsObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewbornsVitalSignsObservation getNewbornsVitalSignsObservation() {
		return NewbornsVitalSignsSectionOperations.getNewbornsVitalSignsObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewbornsVitalSignsSection init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewbornsVitalSignsSection init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}
} // NewbornsVitalSignsSectionImpl
