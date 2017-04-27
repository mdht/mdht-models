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
import org.openhealthtools.mdht.uml.cda.emspcr.SkinAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.SkinAssessmentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skin Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SkinAssessmentImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements SkinAssessment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkinAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.SKIN_ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSkinAssessmentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SkinAssessmentOperations.validateSkinAssessmentTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSkinAssessmentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SkinAssessmentOperations.validateSkinAssessmentMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSkinAssessmentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SkinAssessmentOperations.validateSkinAssessmentCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSkinAssessmentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SkinAssessmentOperations.validateSkinAssessmentCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSkinAssessmentValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SkinAssessmentOperations.validateSkinAssessmentValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSkinAssessmentValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SkinAssessmentOperations.validateSkinAssessmentValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkinAssessment init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SkinAssessment init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // SkinAssessmentImpl
