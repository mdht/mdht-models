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
import org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsiveness;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.LevelOfResponsivenessOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Level Of Responsiveness</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LevelOfResponsivenessImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements LevelOfResponsiveness {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LevelOfResponsivenessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.LEVEL_OF_RESPONSIVENESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelOfResponsivenessTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LevelOfResponsivenessOperations.validateLevelOfResponsivenessTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelOfResponsivenessMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LevelOfResponsivenessOperations.validateLevelOfResponsivenessMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelOfResponsivenessCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LevelOfResponsivenessOperations.validateLevelOfResponsivenessCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelOfResponsivenessCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LevelOfResponsivenessOperations.validateLevelOfResponsivenessCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelOfResponsivenessEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LevelOfResponsivenessOperations.validateLevelOfResponsivenessEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelOfResponsivenessValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LevelOfResponsivenessOperations.validateLevelOfResponsivenessValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelOfResponsivenessValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LevelOfResponsivenessOperations.validateLevelOfResponsivenessValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelOfResponsiveness init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public LevelOfResponsiveness init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // LevelOfResponsivenessImpl
