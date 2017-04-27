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
import org.openhealthtools.mdht.uml.cda.emspcr.DelayOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.DelayOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delay Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DelayOrganizerImpl extends org.eclipse.mdht.uml.cda.impl.OrganizerImpl implements DelayOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelayOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.DELAY_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelayOrganizerDispatchDelayRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DelayOrganizerOperations.validateDelayOrganizerDispatchDelayRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelayOrganizerResponseDelayRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DelayOrganizerOperations.validateDelayOrganizerResponseDelayRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelayOrganizerSceneDelayRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DelayOrganizerOperations.validateDelayOrganizerSceneDelayRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelayOrganizerTransportDelayRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DelayOrganizerOperations.validateDelayOrganizerTransportDelayRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelayOrganizerTurnaoundDelayRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DelayOrganizerOperations.validateDelayOrganizerTurnaoundDelayRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelayOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DelayOrganizerOperations.validateDelayOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayOrganizer init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DelayOrganizer init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // DelayOrganizerImpl
