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
import org.openhealthtools.mdht.uml.cda.clondata.AnthracyclinesLifetimeDose;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapeuticDrugTherapyDiscontinued;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivity;
import org.openhealthtools.mdht.uml.cda.clondata.MedicationsSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.operations.MedicationsSectionBCTPSOperations;
import org.openhealthtools.mdht.uml.cda.consol.impl.MedicationsSectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medications Section BCTPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MedicationsSectionBCTPSImpl extends MedicationsSectionImpl implements MedicationsSectionBCTPS {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationsSectionBCTPSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getMedicationsSectionBCTPS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSectionBCTPSAnthracyclinesLifetimeDose(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationsSectionBCTPSOperations.validateMedicationsSectionBCTPSAnthracyclinesLifetimeDose(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSectionBCTPSChemotherapeuticDrugTherapyDiscontinued(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationsSectionBCTPSOperations.validateMedicationsSectionBCTPSChemotherapeuticDrugTherapyDiscontinued(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSectionBCTPSChemotherapyMedicationActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationsSectionBCTPSOperations.validateMedicationsSectionBCTPSChemotherapyMedicationActivity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnthracyclinesLifetimeDose> getAnthracyclinesLifetimeDoses() {
		return MedicationsSectionBCTPSOperations.getAnthracyclinesLifetimeDoses(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChemotherapeuticDrugTherapyDiscontinued> getChemotherapeuticDrugTherapyDiscontinueds() {
		return MedicationsSectionBCTPSOperations.getChemotherapeuticDrugTherapyDiscontinueds(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChemotherapyMedicationActivity> getChemotherapyMedicationActivities() {
		return MedicationsSectionBCTPSOperations.getChemotherapyMedicationActivities(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationsSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationsSectionBCTPSOperations.validateMedicationsSectionEntriesOptionalTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationsSectionBCTPS init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationsSectionBCTPS init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MedicationsSectionBCTPSImpl
