/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitOnSceneTime;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.UnitOnSceneTimeOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit On Scene Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UnitOnSceneTimeImpl extends ObservationImpl implements UnitOnSceneTime {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitOnSceneTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.UNIT_ON_SCENE_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitOnSceneTimeTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitOnSceneTimeOperations.validateUnitOnSceneTimeTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitOnSceneTimeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitOnSceneTimeOperations.validateUnitOnSceneTimeMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitOnSceneTimeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitOnSceneTimeOperations.validateUnitOnSceneTimeCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitOnSceneTimeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitOnSceneTimeOperations.validateUnitOnSceneTimeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitOnSceneTimeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnitOnSceneTimeOperations.validateUnitOnSceneTimeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitOnSceneTime init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnitOnSceneTime init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //UnitOnSceneTimeImpl
