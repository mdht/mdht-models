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
import org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitOnScene;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.FirstUnitOnSceneOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>First Unit On Scene</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FirstUnitOnSceneImpl extends ObservationImpl implements FirstUnitOnScene {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected FirstUnitOnSceneImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.FIRST_UNIT_ON_SCENE;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFirstUnitOnSceneTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FirstUnitOnSceneOperations.validateFirstUnitOnSceneTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFirstUnitOnSceneCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FirstUnitOnSceneOperations.validateFirstUnitOnSceneCodeP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFirstUnitOnSceneCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FirstUnitOnSceneOperations.validateFirstUnitOnSceneCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFirstUnitOnSceneValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FirstUnitOnSceneOperations.validateFirstUnitOnSceneValue(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFirstUnitOnSceneMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FirstUnitOnSceneOperations.validateFirstUnitOnSceneMoodCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public FirstUnitOnScene init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstUnitOnScene init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // FirstUnitOnSceneImpl
