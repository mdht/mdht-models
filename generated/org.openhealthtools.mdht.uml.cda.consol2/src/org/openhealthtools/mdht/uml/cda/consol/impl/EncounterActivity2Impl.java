/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2;

import org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation;
import org.openhealthtools.mdht.uml.cda.consol.operations.EncounterActivity2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounter Activity2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EncounterActivity2Impl extends EncounterActivitiesImpl implements EncounterActivity2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterActivity2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ENCOUNTER_ACTIVITY2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterActivity2SdtcDDCFromNUBCOrDD(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncounterActivity2Operations.validateEncounterActivity2SdtcDDCFromNUBCOrDD(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterActivitiesCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterActivity2Operations.validateEncounterActivitiesCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEncounterActivitiesIndication2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterActivity2Operations.validateEncounterActivitiesIndication2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEncounterActivitiesEncounterDiagnosis2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncounterActivity2Operations.validateEncounterActivitiesEncounterDiagnosis2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterActivity2CDTranslation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterActivity2Operations.validateEncounterActivity2CDTranslation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterActivity2EncounterPerformerEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterActivity2Operations.validateEncounterActivity2EncounterPerformerEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterActivity2EncounterPerformerEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterActivity2Operations.validateEncounterActivity2EncounterPerformerEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterActivity2EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterActivity2Operations.validateEncounterActivity2EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Indication2> getConsolIndication2s() {
		return EncounterActivity2Operations.getConsolIndication2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EncounterDiagnosis2> getConsolEncounterDiagnosis2s() {
		return EncounterActivity2Operations.getConsolEncounterDiagnosis2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDeliveryLocation> getConsolServiceDeliveryLocations() {
		return EncounterActivity2Operations.getConsolServiceDeliveryLocations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEncounterActivitiesTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterActivity2Operations.validateEncounterActivitiesTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEncounterActivitiesCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterActivity2Operations.validateEncounterActivitiesCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEncounterActivitiesSDTCDischargeDispositionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncounterActivity2Operations.validateEncounterActivitiesSDTCDischargeDispositionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEncounterActivitiesServiceDeliveryLocation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncounterActivity2Operations.validateEncounterActivitiesServiceDeliveryLocation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEncounterActivitiesEncounterPerformer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncounterActivity2Operations.validateEncounterActivitiesEncounterPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterActivity2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterActivity2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EncounterActivity2Impl
