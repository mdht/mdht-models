/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.AssessmentSectionOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Assessment Section</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AssessmentSectionImpl extends
		org.openhealthtools.mdht.uml.cda.consol.impl.AssessmentSectionImpl
		implements AssessmentSection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.ASSESSMENT_SECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMu2consolAssessmentSectionProblemObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentSectionOperations.validateMu2consolAssessmentSectionProblemObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemObservation getProblemObservation() {
		return AssessmentSectionOperations.getProblemObservation(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAssessmentSectionTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentSectionOperations.validateAssessmentSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentSection init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public AssessmentSection init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // AssessmentSectionImpl
