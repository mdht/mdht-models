/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PlannedAct2;
import org.openhealthtools.mdht.uml.cda.consol.operations.AssessmentAndPlanSection2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessment And Plan Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AssessmentAndPlanSection2Impl extends AssessmentAndPlanSectionImpl implements AssessmentAndPlanSection2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentAndPlanSection2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanSection2TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentAndPlanSection2Operations.validateAssessmentAndPlanSection2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedAct2> getConsolPlannedAct2s() {
		return AssessmentAndPlanSection2Operations.getConsolPlannedAct2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAssessmentAndPlanSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentAndPlanSection2Operations.validateAssessmentAndPlanSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAssessmentAndPlanSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentAndPlanSection2Operations.validateAssessmentAndPlanSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAssessmentAndPlanSectionPlanOfCareActivityAct(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentAndPlanSection2Operations.validateAssessmentAndPlanSectionPlanOfCareActivityAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentAndPlanSection2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public AssessmentAndPlanSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // AssessmentAndPlanSection2Impl
