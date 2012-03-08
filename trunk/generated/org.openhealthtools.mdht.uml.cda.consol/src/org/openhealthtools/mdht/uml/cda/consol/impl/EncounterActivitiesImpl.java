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
import org.openhealthtools.mdht.uml.cda.consol.EncounterActivities;
import org.openhealthtools.mdht.uml.cda.consol.Indication;
import org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation;

import org.openhealthtools.mdht.uml.cda.consol.operations.EncounterActivitiesOperations;

import org.openhealthtools.mdht.uml.cda.impl.EncounterImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounter Activities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EncounterActivitiesImpl extends EncounterImpl implements EncounterActivities {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterActivitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ENCOUNTER_ACTIVITIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterActivitiesCodeOriginalText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterActivitiesOperations.validateEncounterActivitiesCodeOriginalText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterActivitiesCodeOriginalTextReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncounterActivitiesOperations.validateEncounterActivitiesCodeOriginalTextReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterActivitiesCodeOriginalTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncounterActivitiesOperations.validateEncounterActivitiesCodeOriginalTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterActivitiesServiceDeliveryTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncounterActivitiesOperations.validateEncounterActivitiesServiceDeliveryTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterActivitiesTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterActivitiesOperations.validateEncounterActivitiesTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterActivitiesClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterActivitiesOperations.validateEncounterActivitiesClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterActivitiesMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterActivitiesOperations.validateEncounterActivitiesMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterActivitiesId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterActivitiesOperations.validateEncounterActivitiesId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterActivitiesCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterActivitiesOperations.validateEncounterActivitiesCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterActivitiesEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterActivitiesOperations.validateEncounterActivitiesEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterActivitiesServiceDeliveryLocation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncounterActivitiesOperations.validateEncounterActivitiesServiceDeliveryLocation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterActivitiesIndication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterActivitiesOperations.validateEncounterActivitiesIndication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDeliveryLocation> getServiceDeliveryLocations() {
		return EncounterActivitiesOperations.getServiceDeliveryLocations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Indication> getIndications() {
		return EncounterActivitiesOperations.getIndications(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterActivities init() {
		CDAUtil.init(this);
		return this;
	}
} // EncounterActivitiesImpl
