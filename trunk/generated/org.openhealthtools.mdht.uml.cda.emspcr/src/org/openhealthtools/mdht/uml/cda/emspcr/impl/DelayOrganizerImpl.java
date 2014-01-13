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

import org.openhealthtools.mdht.uml.cda.emspcr.DelayOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.DelayOrganizerOperations;

import org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delay Organizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DelayOrganizerImpl extends OrganizerImpl implements DelayOrganizer {
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
	public boolean validateDelayOrganizerDispatchDelayRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DelayOrganizerOperations.validateDelayOrganizerDispatchDelayRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelayOrganizerResponseDelayRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateDelayOrganizerTransportDelayRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DelayOrganizerOperations.validateDelayOrganizerTransportDelayRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelayOrganizerTurnaoundDelayRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DelayOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //DelayOrganizerImpl
