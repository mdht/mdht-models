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

import org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.BackAndSpineAssessmentOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Back And Spine Assessment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BackAndSpineAssessmentImpl extends ObservationImpl implements BackAndSpineAssessment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BackAndSpineAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.BACK_AND_SPINE_ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackAndSpineAssessmentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BackAndSpineAssessmentOperations.validateBackAndSpineAssessmentTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackAndSpineAssessmentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BackAndSpineAssessmentOperations.validateBackAndSpineAssessmentMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackAndSpineAssessmentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BackAndSpineAssessmentOperations.validateBackAndSpineAssessmentCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackAndSpineAssessmentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BackAndSpineAssessmentOperations.validateBackAndSpineAssessmentCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackAndSpineAssessmentEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BackAndSpineAssessmentOperations.validateBackAndSpineAssessmentEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackAndSpineAssessmentValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BackAndSpineAssessmentOperations.validateBackAndSpineAssessmentValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackAndSpineAssessmentValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BackAndSpineAssessmentOperations.validateBackAndSpineAssessmentValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackAndSpineAssessmentTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BackAndSpineAssessmentOperations.validateBackAndSpineAssessmentTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackAndSpineAssessmentTargetSiteCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BackAndSpineAssessmentOperations.validateBackAndSpineAssessmentTargetSiteCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackAndSpineAssessment init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackAndSpineAssessment init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // BackAndSpineAssessmentImpl
