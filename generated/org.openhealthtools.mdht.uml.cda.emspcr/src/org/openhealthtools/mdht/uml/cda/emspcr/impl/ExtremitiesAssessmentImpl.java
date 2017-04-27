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
import org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ExtremitiesAssessmentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extremities Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExtremitiesAssessmentImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements ExtremitiesAssessment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtremitiesAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EXTREMITIES_ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtremitiesAssessmentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExtremitiesAssessmentOperations.validateExtremitiesAssessmentTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtremitiesAssessmentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExtremitiesAssessmentOperations.validateExtremitiesAssessmentMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtremitiesAssessmentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExtremitiesAssessmentOperations.validateExtremitiesAssessmentCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtremitiesAssessmentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExtremitiesAssessmentOperations.validateExtremitiesAssessmentCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtremitiesAssessmentEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExtremitiesAssessmentOperations.validateExtremitiesAssessmentEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtremitiesAssessmentValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExtremitiesAssessmentOperations.validateExtremitiesAssessmentValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtremitiesAssessmentTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExtremitiesAssessmentOperations.validateExtremitiesAssessmentTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtremitiesAssessmentTargetSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExtremitiesAssessmentOperations.validateExtremitiesAssessmentTargetSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtremitiesAssessment init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ExtremitiesAssessment init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // ExtremitiesAssessmentImpl
