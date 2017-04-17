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
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivity;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyProtocolReference;
import org.openhealthtools.mdht.uml.cda.clondata.ClinicalDrugTrial;
import org.openhealthtools.mdht.uml.cda.clondata.operations.ChemotherapyMedicationActivityOperations;
import org.openhealthtools.mdht.uml.cda.consol.impl.MedicationActivityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chemotherapy Medication Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ChemotherapyMedicationActivityImpl extends MedicationActivityImpl
		implements ChemotherapyMedicationActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChemotherapyMedicationActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityDoseQuantity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyMedicationActivityOperations.validateChemotherapyMedicationActivityDoseQuantity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyMedicationActivityOperations.validateChemotherapyMedicationActivityEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityRepeatNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyMedicationActivityOperations.validateChemotherapyMedicationActivityRepeatNumber(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityRouteCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyMedicationActivityOperations.validateChemotherapyMedicationActivityRouteCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityRouteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyMedicationActivityOperations.validateChemotherapyMedicationActivityRouteCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityClinicalDrugTrial(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyMedicationActivityOperations.validateChemotherapyMedicationActivityClinicalDrugTrial(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityChemotherapyProtocolReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ChemotherapyMedicationActivityOperations.validateChemotherapyMedicationActivityChemotherapyProtocolReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClinicalDrugTrial> getClinicalDrugTrials() {
		return ChemotherapyMedicationActivityOperations.getClinicalDrugTrials(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChemotherapyProtocolReference> getChemotherapyProtocolReferences() {
		return ChemotherapyMedicationActivityOperations.getChemotherapyProtocolReferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChemotherapyMedicationActivityOperations.validateMedicationActivityTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChemotherapyMedicationActivity init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChemotherapyMedicationActivity init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ChemotherapyMedicationActivityImpl
