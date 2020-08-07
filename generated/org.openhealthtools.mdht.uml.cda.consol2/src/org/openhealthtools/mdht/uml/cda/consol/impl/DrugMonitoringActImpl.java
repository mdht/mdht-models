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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.DrugMonitoringActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drug Monitoring Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DrugMonitoringActImpl extends ActImpl implements DrugMonitoringAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DrugMonitoringActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DRUG_MONITORING_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugMonitoringActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugMonitoringActOperations.validateDrugMonitoringActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugMonitoringActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugMonitoringActOperations.validateDrugMonitoringActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugMonitoringActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugMonitoringActOperations.validateDrugMonitoringActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugMonitoringActId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugMonitoringActOperations.validateDrugMonitoringActId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugMonitoringActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugMonitoringActOperations.validateDrugMonitoringActCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugMonitoringActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugMonitoringActOperations.validateDrugMonitoringActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugMonitoringActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugMonitoringActOperations.validateDrugMonitoringActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDrugMonitoringActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugMonitoringActOperations.validateDrugMonitoringActStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugMonitoringActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugMonitoringActOperations.validateDrugMonitoringActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugMonitoringActParticipant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugMonitoringActOperations.validateDrugMonitoringActParticipant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugMonitoringActParticipantParticipantRolePlayingEntityClassCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugMonitoringActOperations.validateDrugMonitoringActParticipantParticipantRolePlayingEntityClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugMonitoringActParticipantParticipantRolePlayingEntityName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DrugMonitoringActOperations.validateDrugMonitoringActParticipantParticipantRolePlayingEntityName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugMonitoringActParticipantParticipantRoleClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DrugMonitoringActOperations.validateDrugMonitoringActParticipantParticipantRoleClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugMonitoringActParticipantParticipantRoleId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DrugMonitoringActOperations.validateDrugMonitoringActParticipantParticipantRoleId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugMonitoringActParticipantParticipantRolePlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DrugMonitoringActOperations.validateDrugMonitoringActParticipantParticipantRolePlayingEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugMonitoringActParticipantTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DrugMonitoringActOperations.validateDrugMonitoringActParticipantTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDrugMonitoringActParticipantParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DrugMonitoringActOperations.validateDrugMonitoringActParticipantParticipantRole(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DrugMonitoringAct init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DrugMonitoringAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // DrugMonitoringActImpl
