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

import org.openhealthtools.mdht.uml.cda.impl.ParticipantRoleImpl;
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
public class ServiceDeliveryLocationImpl extends ParticipantRoleImpl implements ServiceDeliveryLocation {
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
	public boolean validateServiceDeliveryLocationHasPlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationHasPlayingEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceDeliveryLocationHasPlayingEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationHasPlayingEntityClassCode(
			this, diagnostics, context);
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
	public boolean validateServiceDeliveryLocationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceDeliveryLocationAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceDeliveryLocationTelecom(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationTelecom(this, diagnostics, context);
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
} // ServiceDeliveryLocationImpl
