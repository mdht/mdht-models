/**
 */
package org.openhealthtools.mdht.uml.cda.clondata;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medications Section BCTPS</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage#getMedicationsSectionBCTPS()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Medications Section BCTPS'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Medications Section BCTPSTemplateId Medications Section BCTPSAnthracyclines Lifetime Dose Medications Section BCTPSChemotherapy Medication Activity' templateId.root='2.16.840.1.113883.10.20.30.2.7' constraints.validation.info='Medications Section BCTPSChemotherapeutic Drug Therapy Discontinued'"
 * @generated
 */
public interface MedicationsSectionBCTPS extends MedicationsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Medications Section BCTPSAnthracyclines Lifetime Dose'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(clondata::AnthracyclinesLifetimeDose))'"
	 * @generated
	 */
	boolean validateMedicationsSectionBCTPSAnthracyclinesLifetimeDose(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Medications Section BCTPSChemotherapeutic Drug Therapy Discontinued'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(clondata::ChemotherapeuticDrugTherapyDiscontinued))'"
	 * @generated
	 */
	boolean validateMedicationsSectionBCTPSChemotherapeuticDrugTherapyDiscontinued(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Medications Section BCTPSChemotherapy Medication Activity'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(clondata::ChemotherapyMedicationActivity))'"
	 * @generated
	 */
	boolean validateMedicationsSectionBCTPSChemotherapyMedicationActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getAnthracyclines Lifetime Doses'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(clondata::AnthracyclinesLifetimeDose)).oclAsType(clondata::AnthracyclinesLifetimeDose)'"
	 * @generated
	 */
	EList<AnthracyclinesLifetimeDose> getAnthracyclinesLifetimeDoses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getChemotherapeutic Drug Therapy Discontinueds'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(clondata::ChemotherapeuticDrugTherapyDiscontinued)).oclAsType(clondata::ChemotherapeuticDrugTherapyDiscontinued)'"
	 * @generated
	 */
	EList<ChemotherapeuticDrugTherapyDiscontinued> getChemotherapeuticDrugTherapyDiscontinueds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getChemotherapy Medication Activities'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(clondata::ChemotherapyMedicationActivity)).oclAsType(clondata::ChemotherapyMedicationActivity)'"
	 * @generated
	 */
	EList<ChemotherapyMedicationActivity> getChemotherapyMedicationActivities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSectionBCTPS init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSectionBCTPS init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // MedicationsSectionBCTPS
