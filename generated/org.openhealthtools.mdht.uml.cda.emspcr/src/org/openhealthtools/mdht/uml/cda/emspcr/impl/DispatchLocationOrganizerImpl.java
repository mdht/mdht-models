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
import org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.DispatchLocationOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dispatch Location Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DispatchLocationOrganizerImpl extends org.eclipse.mdht.uml.cda.impl.OrganizerImpl implements DispatchLocationOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DispatchLocationOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.DISPATCH_LOCATION_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispatchLocationOrganizerDispatchLocationNameRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DispatchLocationOrganizerOperations.validateDispatchLocationOrganizerDispatchLocationNameRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispatchLocationOrganizerDispatchLocationLatitudeRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DispatchLocationOrganizerOperations.validateDispatchLocationOrganizerDispatchLocationLatitudeRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispatchLocationOrganizerDispatchLocationLongtudeRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DispatchLocationOrganizerOperations.validateDispatchLocationOrganizerDispatchLocationLongtudeRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispatchLocationOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DispatchLocationOrganizerOperations.validateDispatchLocationOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchLocationOrganizer init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DispatchLocationOrganizer init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // DispatchLocationOrganizerImpl
