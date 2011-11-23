/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation;

import org.openhealthtools.mdht.uml.cda.consol.operations.ServiceDeliveryLocationOperations;

import org.openhealthtools.mdht.uml.cda.impl.Participant2Impl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Delivery Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ServiceDeliveryLocationImpl extends Participant2Impl implements ServiceDeliveryLocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDeliveryLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SERVICE_DELIVERY_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceDeliveryLocationHasParticipantRole(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationHasParticipantRole(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceDeliveryLocationHasParticipantRoleLocation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationHasParticipantRoleLocation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceDeliveryLocationHasParticipantRoleCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationHasParticipantRoleCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceDeliveryLocationHasParticipantRoleCodeVocab(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationHasParticipantRoleCodeVocab(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceDeliveryLocationHasPlayingEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationHasPlayingEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceDeliveryLocationHasPlayingEntityPlace(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationHasPlayingEntityPlace(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceDeliveryLocationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceDeliveryLocationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryLocation init() {
    	CDAUtil.init(this);
    	return this;
	}
} //ServiceDeliveryLocationImpl
