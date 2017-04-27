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
import org.openhealthtools.mdht.uml.cda.emspcr.LastOralIntake;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.LastOralIntakeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Last Oral Intake</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LastOralIntakeImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements LastOralIntake {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LastOralIntakeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.LAST_ORAL_INTAKE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastOralIntakeTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LastOralIntakeOperations.validateLastOralIntakeTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastOralIntakeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LastOralIntakeOperations.validateLastOralIntakeMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastOralIntakeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LastOralIntakeOperations.validateLastOralIntakeCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastOralIntakeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LastOralIntakeOperations.validateLastOralIntakeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastOralIntakeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LastOralIntakeOperations.validateLastOralIntakeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastOralIntake init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public LastOralIntake init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // LastOralIntakeImpl
