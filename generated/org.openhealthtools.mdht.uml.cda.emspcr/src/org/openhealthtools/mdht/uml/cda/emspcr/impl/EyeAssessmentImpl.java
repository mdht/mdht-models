/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EyeAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EyeAssessmentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eye Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EyeAssessmentImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements EyeAssessment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EyeAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EYE_ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEyeAssessmentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EyeAssessmentOperations.validateEyeAssessmentTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEyeAssessmentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EyeAssessmentOperations.validateEyeAssessmentMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEyeAssessmentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EyeAssessmentOperations.validateEyeAssessmentCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEyeAssessmentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EyeAssessmentOperations.validateEyeAssessmentCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEyeAssessmentEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EyeAssessmentOperations.validateEyeAssessmentEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEyeAssessmentValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EyeAssessmentOperations.validateEyeAssessmentValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEyeAssessmentValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EyeAssessmentOperations.validateEyeAssessmentValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEyeAssessmentTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EyeAssessmentOperations.validateEyeAssessmentTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEyeAssessmentTargetSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EyeAssessmentOperations.validateEyeAssessmentTargetSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EyeAssessment init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EyeAssessment init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // EyeAssessmentImpl
