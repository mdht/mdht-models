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
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityAct2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Activity Act2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProcedureActivityAct2Impl extends ProcedureActivityActImpl implements ProcedureActivityAct2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureActivityAct2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROCEDURE_ACTIVITY_ACT2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityAct2CodeSuggestedCodeSystems(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityAct2Operations.validateProcedureActivityAct2CodeSuggestedCodeSystems(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityAct2Operations.validateProcedureActivityActStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityAct2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityAct2Operations.validateProcedureActivityAct2AuthorParticipation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instruction2 getConsolInstruction2() {
		return ProcedureActivityAct2Operations.getConsolInstruction2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Indication2> getConsolIndication2s() {
		return ProcedureActivityAct2Operations.getConsolIndication2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationActivity2> getConsolMedicationActivity2s() {
		return ProcedureActivityAct2Operations.getConsolMedicationActivity2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityActInstructionsInversion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityAct2Operations.validateProcedureActivityActInstructionsInversion(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityAct2Operations.validateProcedureActivityActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityAct2Operations.validateProcedureActivityActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityAct2Operations.validateProcedureActivityActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityAct2Operations.validateProcedureActivityActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityActInstructions(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityAct2Operations.validateProcedureActivityActInstructions(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityActIndication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityAct2Operations.validateProcedureActivityActIndication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityActMedicationActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityAct2Operations.validateProcedureActivityActMedicationActivity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityActPerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityAct2Operations.validateProcedureActivityActPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityAct2Operations.validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationAddr(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityAct2Operations.validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityAct2Operations.validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityRepresentedOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityAct2Operations.validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityRepresentedOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityActProcedureActPerformerAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityAct2Operations.validateProcedureActivityActProcedureActPerformerAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureActivityAct2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureActivityAct2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProcedureActivityAct2Impl
