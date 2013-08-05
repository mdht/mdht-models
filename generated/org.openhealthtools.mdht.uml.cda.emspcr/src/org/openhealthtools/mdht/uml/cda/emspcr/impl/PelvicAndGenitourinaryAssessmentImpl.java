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
import org.openhealthtools.mdht.uml.cda.emspcr.PelvicAndGenitourinaryAssessment;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PelvicAndGenitourinaryAssessmentOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pelvic And Genitourinary Assessment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PelvicAndGenitourinaryAssessmentImpl extends ObservationImpl implements PelvicAndGenitourinaryAssessment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PelvicAndGenitourinaryAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PELVIC_AND_GENITOURINARY_ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePelvicAndGenitourinaryAssessmentTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PelvicAndGenitourinaryAssessmentOperations.validatePelvicAndGenitourinaryAssessmentTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePelvicAndGenitourinaryAssessmentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PelvicAndGenitourinaryAssessmentOperations.validatePelvicAndGenitourinaryAssessmentCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePelvicAndGenitourinaryAssessmentValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PelvicAndGenitourinaryAssessmentOperations.validatePelvicAndGenitourinaryAssessmentValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePelvicAndGenitourinaryAssessmentValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PelvicAndGenitourinaryAssessmentOperations.validatePelvicAndGenitourinaryAssessmentValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePelvicAndGenitourinaryAssessmentEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PelvicAndGenitourinaryAssessmentOperations.validatePelvicAndGenitourinaryAssessmentEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePelvicAndGenitourinaryAssessmentMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PelvicAndGenitourinaryAssessmentOperations.validatePelvicAndGenitourinaryAssessmentMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PelvicAndGenitourinaryAssessment init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PelvicAndGenitourinaryAssessment init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PelvicAndGenitourinaryAssessmentImpl
