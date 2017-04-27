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
import org.openhealthtools.mdht.uml.cda.emspcr.MentalStatusAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.MentalStatusAssessmentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mental Status Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MentalStatusAssessmentImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements MentalStatusAssessment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MentalStatusAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.MENTAL_STATUS_ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusAssessmentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusAssessmentOperations.validateMentalStatusAssessmentTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusAssessmentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusAssessmentOperations.validateMentalStatusAssessmentMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusAssessmentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusAssessmentOperations.validateMentalStatusAssessmentCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusAssessmentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusAssessmentOperations.validateMentalStatusAssessmentCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusAssessmentValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusAssessmentOperations.validateMentalStatusAssessmentValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MentalStatusAssessment init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MentalStatusAssessment init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // MentalStatusAssessmentImpl
