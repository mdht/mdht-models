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
import org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitIndicator;
import org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitOnScene;
import org.openhealthtools.mdht.uml.cda.emspcr.LocationTypeObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicator;
import org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount;
import org.openhealthtools.mdht.uml.cda.emspcr.SceneSection;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.SceneSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scene Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SceneSectionImpl extends SectionImpl implements SceneSection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected SceneSectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.SCENE_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSceneSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SceneSectionOperations.validateSceneSectionTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSceneSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SceneSectionOperations.validateSceneSectionCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSceneSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SceneSectionOperations.validateSceneSectionTitle(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSceneSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SceneSectionOperations.validateSceneSectionText(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSceneSectionFirstUnitIndicator(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SceneSectionOperations.validateSceneSectionFirstUnitIndicator(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSceneSectionFirstUnitOnScene(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SceneSectionOperations.validateSceneSectionFirstUnitOnScene(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSceneSectionScenePatientCount(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SceneSectionOperations.validateSceneSectionScenePatientCount(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSceneSectionMassCasualtyIndicator(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SceneSectionOperations.validateSceneSectionMassCasualtyIndicator(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateSceneSectionLocationTypeObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SceneSectionOperations.validateSceneSectionLocationTypeObservation(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public FirstUnitIndicator getFirstUnitIndicator() {
		return SceneSectionOperations.getFirstUnitIndicator(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public FirstUnitOnScene getFirstUnitOnScene() {
		return SceneSectionOperations.getFirstUnitOnScene(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ScenePatientCount getScenePatientCount() {
		return SceneSectionOperations.getScenePatientCount(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public MassCasualtyIndicator getMassCasualtyIndicator() {
		return SceneSectionOperations.getMassCasualtyIndicator(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public LocationTypeObservation getLocationTypeObservation() {
		return SceneSectionOperations.getLocationTypeObservation(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public SceneSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SceneSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // SceneSectionImpl
