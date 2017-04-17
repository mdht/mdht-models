/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ProcedureImpl;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivity;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyRegimenPlans;
import org.openhealthtools.mdht.uml.cda.clondata.ClinicalDrugTrial;
import org.openhealthtools.mdht.uml.cda.clondata.operations.ChemotherapyRegimenPlansOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chemotherapy Regimen Plans</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ChemotherapyRegimenPlansImpl extends ProcedureImpl implements ChemotherapyRegimenPlans {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChemotherapyRegimenPlansImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getChemotherapyRegimenPlans();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyRegimenPlansTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyRegimenPlansOperations.validateChemotherapyRegimenPlansTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyRegimenPlansClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChemotherapyRegimenPlansOperations.validateChemotherapyRegimenPlansClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyRegimenPlansCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChemotherapyRegimenPlansOperations.validateChemotherapyRegimenPlansCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyRegimenPlansCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChemotherapyRegimenPlansOperations.validateChemotherapyRegimenPlansCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyRegimenPlansEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyRegimenPlansOperations.validateChemotherapyRegimenPlansEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyRegimenPlansStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyRegimenPlansOperations.validateChemotherapyRegimenPlansStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyRegimenPlansMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChemotherapyRegimenPlansOperations.validateChemotherapyRegimenPlansMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyRegimenPlansChemotherapyMedicationActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyRegimenPlansOperations.validateChemotherapyRegimenPlansChemotherapyMedicationActivity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyRegimenPlansClinicalDrugTrial(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyRegimenPlansOperations.validateChemotherapyRegimenPlansClinicalDrugTrial(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChemotherapyMedicationActivity> getChemotherapyMedicationActivities() {
		return ChemotherapyRegimenPlansOperations.getChemotherapyMedicationActivities(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClinicalDrugTrial> getClinicalDrugTrials() {
		return ChemotherapyRegimenPlansOperations.getClinicalDrugTrials(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChemotherapyRegimenPlans init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChemotherapyRegimenPlans init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ChemotherapyRegimenPlansImpl
