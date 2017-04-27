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
import org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ScenePatientCountOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scene Patient Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ScenePatientCountImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements ScenePatientCount {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenePatientCountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.SCENE_PATIENT_COUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScenePatientCountTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScenePatientCountOperations.validateScenePatientCountTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScenePatientCountMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScenePatientCountOperations.validateScenePatientCountMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScenePatientCountCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScenePatientCountOperations.validateScenePatientCountCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScenePatientCountCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScenePatientCountOperations.validateScenePatientCountCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScenePatientCountValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScenePatientCountOperations.validateScenePatientCountValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenePatientCount init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ScenePatientCount init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // ScenePatientCountImpl
