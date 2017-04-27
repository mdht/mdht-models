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
import org.openhealthtools.mdht.uml.cda.emspcr.ChestAndLungsAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ChestAndLungsAssessmentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chest And Lungs Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ChestAndLungsAssessmentImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements ChestAndLungsAssessment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChestAndLungsAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.CHEST_AND_LUNGS_ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChestAndLungsAssessmentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChestAndLungsAssessmentOperations.validateChestAndLungsAssessmentTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChestAndLungsAssessmentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChestAndLungsAssessmentOperations.validateChestAndLungsAssessmentMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChestAndLungsAssessmentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChestAndLungsAssessmentOperations.validateChestAndLungsAssessmentCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChestAndLungsAssessmentEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChestAndLungsAssessmentOperations.validateChestAndLungsAssessmentEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChestAndLungsAssessmentValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChestAndLungsAssessmentOperations.validateChestAndLungsAssessmentValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChestAndLungsAssessment init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ChestAndLungsAssessment init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // ChestAndLungsAssessmentImpl
