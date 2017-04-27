/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivityPlan;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyProtocolReference;
import org.openhealthtools.mdht.uml.cda.clondata.ClinicalDrugTrial;
import org.openhealthtools.mdht.uml.cda.clondata.operations.ChemotherapyMedicationActivityPlanOperations;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivitySubstanceAdministrationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chemotherapy Medication Activity Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ChemotherapyMedicationActivityPlanImpl extends PlanOfCareActivitySubstanceAdministrationImpl
		implements ChemotherapyMedicationActivityPlan {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChemotherapyMedicationActivityPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivityPlan();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityPlanEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyMedicationActivityPlanOperations.validateChemotherapyMedicationActivityPlanEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityPlanRepeatNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyMedicationActivityPlanOperations.validateChemotherapyMedicationActivityPlanRepeatNumber(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityPlanRouteCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyMedicationActivityPlanOperations.validateChemotherapyMedicationActivityPlanRouteCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityPlanRouteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyMedicationActivityPlanOperations.validateChemotherapyMedicationActivityPlanRouteCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityPlanStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyMedicationActivityPlanOperations.validateChemotherapyMedicationActivityPlanStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityPlanClinicalDrugTrial(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyMedicationActivityPlanOperations.validateChemotherapyMedicationActivityPlanClinicalDrugTrial(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityPlanReactionObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyMedicationActivityPlanOperations.validateChemotherapyMedicationActivityPlanReactionObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityPlanChemotherapyProtocolReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyMedicationActivityPlanOperations.validateChemotherapyMedicationActivityPlanChemotherapyProtocolReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityPlanMedicationActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyMedicationActivityPlanOperations.validateChemotherapyMedicationActivityPlanMedicationActivity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalDrugTrial getClinicalDrugTrial() {
		return ChemotherapyMedicationActivityPlanOperations.getClinicalDrugTrial(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionObservation getReactionObservation() {
		return ChemotherapyMedicationActivityPlanOperations.getReactionObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChemotherapyProtocolReference getChemotherapyProtocolReference() {
		return ChemotherapyMedicationActivityPlanOperations.getChemotherapyProtocolReference(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationActivity getMedicationActivity() {
		return ChemotherapyMedicationActivityPlanOperations.getMedicationActivity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareActivitySubstanceAdministrationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyMedicationActivityPlanOperations.validatePlanOfCareActivitySubstanceAdministrationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChemotherapyMedicationActivityPlan init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChemotherapyMedicationActivityPlan init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ChemotherapyMedicationActivityPlanImpl
