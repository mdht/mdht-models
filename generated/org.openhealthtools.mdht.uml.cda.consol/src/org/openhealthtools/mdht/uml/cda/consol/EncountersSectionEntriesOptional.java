/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounters Section Entries Optional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     This section is used to list and describe any healthcare encounters pertinent to the patient's current
 *     health status or historical health history. An Encounter is an interaction, regardless of the setting, between a
 *     patient and a practitioner who is vested with primary responsibility for diagnosing, evaluating, or treating the
 *     patient's condition. It may include visits, appointments, as well as non face-to-face interactions. It is also a
 *     contact between a patient and a practitioner who has primary responsibility for assessing and treating the patient at a
 *     given contact, exercising independent judgment. This section may contain all encounters for the time period being
 *     summarized, but should include notable encounters.
 * </p>
 * <p>
 *     The encounter history section contains coded entries describing the patient history of encounters.
 * </p>
 * <p>
 *     The Encounter Section contains information describing the patient history of encounters. At a minimum,
 *     current and pertinent historical encounters should be included; a full encounter history may be included. 
 * </p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getEncountersSectionEntriesOptional()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.10.20.22.2.22' constraints.validation.error='EncountersSectionEntriesOptionalTemplateId'"
 * @generated
 */
public interface EncountersSectionEntriesOptional extends Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.22')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.22\')'"
	 * @generated
	 */
	boolean validateEncountersSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSectionEntriesOptional init();
} // EncountersSectionEntriesOptional
