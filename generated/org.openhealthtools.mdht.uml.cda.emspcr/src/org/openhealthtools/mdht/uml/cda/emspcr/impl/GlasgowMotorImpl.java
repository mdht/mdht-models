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
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowMotor;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.GlasgowMotorOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glasgow Motor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GlasgowMotorImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements GlasgowMotor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlasgowMotorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.GLASGOW_MOTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowMotorTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GlasgowMotorOperations.validateGlasgowMotorTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowMotorMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GlasgowMotorOperations.validateGlasgowMotorMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowMotorCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GlasgowMotorOperations.validateGlasgowMotorCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowMotorCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GlasgowMotorOperations.validateGlasgowMotorCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowMotorValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GlasgowMotorOperations.validateGlasgowMotorValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlasgowMotor init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public GlasgowMotor init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // GlasgowMotorImpl
