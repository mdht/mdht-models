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
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowEye;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.GlasgowEyeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glasgow Eye</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GlasgowEyeImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements GlasgowEye {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlasgowEyeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.GLASGOW_EYE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowEyeTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GlasgowEyeOperations.validateGlasgowEyeTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowEyeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GlasgowEyeOperations.validateGlasgowEyeMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowEyeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GlasgowEyeOperations.validateGlasgowEyeCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowEyeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GlasgowEyeOperations.validateGlasgowEyeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowEyeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GlasgowEyeOperations.validateGlasgowEyeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlasgowEye init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public GlasgowEye init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // GlasgowEyeImpl
