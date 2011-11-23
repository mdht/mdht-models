/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Split Dose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 * This template identifier is used to identify medication administration events that require special
 * processing to handle split dosing. The parent template is 1.3.6.1.4.1.19376.1.5.3.1.4.7. A split
 * dose is often used when different dosages are given at different times (e.g., at different times of day, or on different days). This may be to account for different metabolism rates at different
 * times of day, or to simply address drug packaging deficiencies (e.g., and order for Coumadin
 * 2mg on even days, 2.5mg on odd days is used because Coumadin does not come in a 2.25mg
 * dose form).
 * </p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getMedicationSplitDose()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.3.88.11.83.8' constraints.validation.error='MedicationSplitDoseTemplateId MedicationSplitDoseSplitDosingSubstanceAdministration'"
 * @generated
 */
public interface MedicationSplitDose extends MedicationActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entryRelationship.substanceAdministration->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.entryRelationship.substanceAdministration->isEmpty()'"
	 * @generated
	 */
	boolean validateMedicationSplitDoseSplitDosingSubstanceAdministration(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationSplitDose init();
} // MedicationSplitDose
