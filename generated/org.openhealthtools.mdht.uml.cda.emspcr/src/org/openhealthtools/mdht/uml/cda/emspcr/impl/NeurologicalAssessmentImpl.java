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
import org.openhealthtools.mdht.uml.cda.emspcr.NeurologicalAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.NeurologicalAssessmentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neurological Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NeurologicalAssessmentImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements NeurologicalAssessment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeurologicalAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.NEUROLOGICAL_ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeurologicalAssessmentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NeurologicalAssessmentOperations.validateNeurologicalAssessmentTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeurologicalAssessmentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NeurologicalAssessmentOperations.validateNeurologicalAssessmentMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeurologicalAssessmentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NeurologicalAssessmentOperations.validateNeurologicalAssessmentCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeurologicalAssessmentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NeurologicalAssessmentOperations.validateNeurologicalAssessmentCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeurologicalAssessmentValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NeurologicalAssessmentOperations.validateNeurologicalAssessmentValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeurologicalAssessmentValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NeurologicalAssessmentOperations.validateNeurologicalAssessmentValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeurologicalAssessment init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NeurologicalAssessment init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // NeurologicalAssessmentImpl
