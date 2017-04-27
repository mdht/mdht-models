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
import org.openhealthtools.mdht.uml.cda.emspcr.AirbagDeploymentStatus;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.AirbagDeploymentStatusOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Airbag Deployment Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AirbagDeploymentStatusImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements AirbagDeploymentStatus {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AirbagDeploymentStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.AIRBAG_DEPLOYMENT_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAirbagDeploymentStatusTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AirbagDeploymentStatusOperations.validateAirbagDeploymentStatusTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAirbagDeploymentStatusMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AirbagDeploymentStatusOperations.validateAirbagDeploymentStatusMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAirbagDeploymentStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AirbagDeploymentStatusOperations.validateAirbagDeploymentStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAirbagDeploymentStatusValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AirbagDeploymentStatusOperations.validateAirbagDeploymentStatusValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAirbagDeploymentStatusValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AirbagDeploymentStatusOperations.validateAirbagDeploymentStatusValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirbagDeploymentStatus init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AirbagDeploymentStatus init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // AirbagDeploymentStatusImpl
