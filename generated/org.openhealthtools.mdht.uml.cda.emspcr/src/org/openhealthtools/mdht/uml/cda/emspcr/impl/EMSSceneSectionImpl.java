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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitIndicator;
import org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitOnScene;
import org.openhealthtools.mdht.uml.cda.emspcr.LocationTypeObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicator;
import org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSSceneSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Scene Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSSceneSectionImpl extends SectionImpl implements EMSSceneSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSSceneSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_SCENE_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSceneSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSceneSectionOperations.validateEMSSceneSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSceneSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSceneSectionOperations.validateEMSSceneSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSceneSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSceneSectionOperations.validateEMSSceneSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSceneSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSceneSectionOperations.validateEMSSceneSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSceneSectionFirstUnitIndicator(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSceneSectionOperations.validateEMSSceneSectionFirstUnitIndicator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSceneSectionFirstUnitOnScene(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSceneSectionOperations.validateEMSSceneSectionFirstUnitOnScene(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSceneSectionScenePatientCount(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSceneSectionOperations.validateEMSSceneSectionScenePatientCount(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSceneSectionMassCasualtyIndicator(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSceneSectionOperations.validateEMSSceneSectionMassCasualtyIndicator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSSceneSectionLocationTypeObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSSceneSectionOperations.validateEMSSceneSectionLocationTypeObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstUnitIndicator getFirstUnitIndicator() {
		return EMSSceneSectionOperations.getFirstUnitIndicator(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstUnitOnScene getFirstUnitOnScene() {
		return EMSSceneSectionOperations.getFirstUnitOnScene(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenePatientCount getScenePatientCount() {
		return EMSSceneSectionOperations.getScenePatientCount(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MassCasualtyIndicator getMassCasualtyIndicator() {
		return EMSSceneSectionOperations.getMassCasualtyIndicator(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationTypeObservation getLocationTypeObservation() {
		return EMSSceneSectionOperations.getLocationTypeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSSceneSection init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMSSceneSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //EMSSceneSectionImpl
