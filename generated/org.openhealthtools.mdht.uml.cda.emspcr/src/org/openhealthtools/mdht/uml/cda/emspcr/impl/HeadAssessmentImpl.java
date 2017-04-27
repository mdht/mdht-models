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
import org.openhealthtools.mdht.uml.cda.emspcr.HeadAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.HeadAssessmentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Head Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HeadAssessmentImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements HeadAssessment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeadAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.HEAD_ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeadAssessmentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HeadAssessmentOperations.validateHeadAssessmentTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeadAssessmentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HeadAssessmentOperations.validateHeadAssessmentMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeadAssessmentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HeadAssessmentOperations.validateHeadAssessmentCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeadAssessmentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HeadAssessmentOperations.validateHeadAssessmentCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeadAssessmentEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HeadAssessmentOperations.validateHeadAssessmentEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeadAssessmentValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HeadAssessmentOperations.validateHeadAssessmentValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeadAssessment init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public HeadAssessment init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // HeadAssessmentImpl
