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
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseOdometerReadingOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ResponseOdometerReadingOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Odometer Reading Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResponseOdometerReadingOrganizerImpl extends org.eclipse.mdht.uml.cda.impl.OrganizerImpl implements ResponseOdometerReadingOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseOdometerReadingOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.RESPONSE_ODOMETER_READING_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseOdometerReadingOrganizerResponseBeginningOdometerReadingRelationship(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseOdometerReadingOrganizerOperations.validateResponseOdometerReadingOrganizerResponseBeginningOdometerReadingRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseOdometerReadingOrganizerResponseOnSceneOdometerReadingRelationship(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseOdometerReadingOrganizerOperations.validateResponseOdometerReadingOrganizerResponseOnSceneOdometerReadingRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseOdometerReadingOrganizerResponseDestinationOdometerReadingRelationship(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseOdometerReadingOrganizerOperations.validateResponseOdometerReadingOrganizerResponseDestinationOdometerReadingRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseOdometerReadingOrganizerResponseEndingOdometerReadingRelationship(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseOdometerReadingOrganizerOperations.validateResponseOdometerReadingOrganizerResponseEndingOdometerReadingRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseOdometerReadingOrganizerTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponseOdometerReadingOrganizerOperations.validateResponseOdometerReadingOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseOdometerReadingOrganizer init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResponseOdometerReadingOrganizer init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // ResponseOdometerReadingOrganizerImpl
