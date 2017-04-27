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
import org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary;
import org.openhealthtools.mdht.uml.cda.clondata.EncountersSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.FamilyHistorySectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.FunctionalStatusSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.MedicationsSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.PlanofCareSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.ProblemSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.ProceduresSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.ResultsSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.VitalSignsSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.operations.ClinicalOncologyTreatmentPlanandSummaryOperations;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.impl.GeneralHeaderConstraintsImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clinical Oncology Treatment Planand Summary</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ClinicalOncologyTreatmentPlanandSummaryImpl extends GeneralHeaderConstraintsImpl
		implements ClinicalOncologyTreatmentPlanandSummary {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClinicalOncologyTreatmentPlanandSummaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getClinicalOncologyTreatmentPlanandSummary();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOncologyTreatmentPlanandSummaryAllergiesSectionEntriesOptional(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOncologyTreatmentPlanandSummaryOperations.validateClinicalOncologyTreatmentPlanandSummaryAllergiesSectionEntriesOptional(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOncologyTreatmentPlanandSummaryMedicationsSectionBCTPS(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClinicalOncologyTreatmentPlanandSummaryOperations.validateClinicalOncologyTreatmentPlanandSummaryMedicationsSectionBCTPS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClinicalOncologyTreatmentPlanandSummaryOperations.validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS2(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOncologyTreatmentPlanandSummaryOperations.validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOncologyTreatmentPlanandSummaryProblemSectionBCTPS(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClinicalOncologyTreatmentPlanandSummaryOperations.validateClinicalOncologyTreatmentPlanandSummaryProblemSectionBCTPS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOncologyTreatmentPlanandSummaryProceduresSectionBCTPS(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClinicalOncologyTreatmentPlanandSummaryOperations.validateClinicalOncologyTreatmentPlanandSummaryProceduresSectionBCTPS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOncologyTreatmentPlanandSummaryResultsSectionBCTPS(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClinicalOncologyTreatmentPlanandSummaryOperations.validateClinicalOncologyTreatmentPlanandSummaryResultsSectionBCTPS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOncologyTreatmentPlanandSummaryVitalSignsSectionBCTPS(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClinicalOncologyTreatmentPlanandSummaryOperations.validateClinicalOncologyTreatmentPlanandSummaryVitalSignsSectionBCTPS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOncologyTreatmentPlanandSummaryPlanofCareSectionBCTPS(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClinicalOncologyTreatmentPlanandSummaryOperations.validateClinicalOncologyTreatmentPlanandSummaryPlanofCareSectionBCTPS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOncologyTreatmentPlanandSummaryFunctionalStatusSectionBCTPS(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalOncologyTreatmentPlanandSummaryOperations.validateClinicalOncologyTreatmentPlanandSummaryFunctionalStatusSectionBCTPS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOncologyTreatmentPlanandSummaryEncountersSectionBCTPS(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClinicalOncologyTreatmentPlanandSummaryOperations.validateClinicalOncologyTreatmentPlanandSummaryEncountersSectionBCTPS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional() {
		return ClinicalOncologyTreatmentPlanandSummaryOperations.getAllergiesSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSectionBCTPS getMedicationsSectionBCTPS() {
		return ClinicalOncologyTreatmentPlanandSummaryOperations.getMedicationsSectionBCTPS(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySectionBCTPS getFamilyHistorySectionBCTPS() {
		return ClinicalOncologyTreatmentPlanandSummaryOperations.getFamilyHistorySectionBCTPS(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySectionBCTPS getFamilyHistorySectionBCTPS2() {
		return ClinicalOncologyTreatmentPlanandSummaryOperations.getFamilyHistorySectionBCTPS2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSectionBCTPS getProblemSectionBCTPS() {
		return ClinicalOncologyTreatmentPlanandSummaryOperations.getProblemSectionBCTPS(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSectionBCTPS getProceduresSectionBCTPS() {
		return ClinicalOncologyTreatmentPlanandSummaryOperations.getProceduresSectionBCTPS(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSectionBCTPS getResultsSectionBCTPS() {
		return ClinicalOncologyTreatmentPlanandSummaryOperations.getResultsSectionBCTPS(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSectionBCTPS getVitalSignsSectionBCTPS() {
		return ClinicalOncologyTreatmentPlanandSummaryOperations.getVitalSignsSectionBCTPS(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanofCareSectionBCTPS getPlanofCareSectionBCTPS() {
		return ClinicalOncologyTreatmentPlanandSummaryOperations.getPlanofCareSectionBCTPS(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSectionBCTPS getFunctionalStatusSectionBCTPS() {
		return ClinicalOncologyTreatmentPlanandSummaryOperations.getFunctionalStatusSectionBCTPS(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSectionBCTPS getEncountersSectionBCTPS() {
		return ClinicalOncologyTreatmentPlanandSummaryOperations.getEncountersSectionBCTPS(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ClinicalOncologyTreatmentPlanandSummaryOperations.validateGeneralHeaderConstraintsTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClinicalOncologyTreatmentPlanandSummary init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClinicalOncologyTreatmentPlanandSummary init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ClinicalOncologyTreatmentPlanandSummaryImpl
