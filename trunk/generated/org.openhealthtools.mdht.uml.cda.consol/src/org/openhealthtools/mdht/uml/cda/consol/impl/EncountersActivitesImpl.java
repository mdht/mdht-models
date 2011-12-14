/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EncountersActivites;
import org.openhealthtools.mdht.uml.cda.consol.Indication;

import org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation;
import org.openhealthtools.mdht.uml.cda.consol.operations.EncountersActivitesOperations;

import org.openhealthtools.mdht.uml.cda.impl.EncounterImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounters Activites</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EncountersActivitesImpl extends EncounterImpl implements EncountersActivites {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncountersActivitesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ENCOUNTERS_ACTIVITES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivitesHasIndications(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivitesOperations.validateEncountersActivitesHasIndications(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivitesHasPractitioners(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivitesOperations.validateEncountersActivitesHasPractitioners(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivitesPractitionerRole(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivitesOperations.validateEncountersActivitesPractitionerRole(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivitesTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivitesOperations.validateEncountersActivitesTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivitesClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivitesOperations.validateEncountersActivitesClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivitesMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivitesOperations.validateEncountersActivitesMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivitesId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivitesOperations.validateEncountersActivitesId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivitesEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivitesOperations.validateEncountersActivitesEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivitesServiceDeliveryLocation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncountersActivitesOperations.validateEncountersActivitesServiceDeliveryLocation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivitesIndication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersActivitesOperations.validateEncountersActivitesIndication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDeliveryLocation> getServiceDeliveryLocations() {
		return EncountersActivitesOperations.getServiceDeliveryLocations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Indication getIndication() {
		return EncountersActivitesOperations.getIndication(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersActivites init() {
		CDAUtil.init(this);
		return this;
	}
} // EncountersActivitesImpl
