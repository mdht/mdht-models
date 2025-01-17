/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounters Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This section lists and describes any healthcare encounters pertinent to the patient's current health status or historical health history. An Encounter is an interaction, regardless of the setting, between a patient and a practitioner who is vested with primary responsibility for diagnosing, evaluating, or treating the patient's condition. It may include visits, appointments, as well as non face-to-face interactions. It is also a contact between a patient and a practitioner who has primary responsibility for assessing and treating the patient at a given contact, exercising independent judgment. This section may contain all encounters for the time period being summarized, but should include notable encounters.
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getEncountersSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EncountersSectionEntriesOptionalTemplateId EncountersSectionEntriesOptionalCode EncountersSectionEntriesOptionalCodeP EncountersSectionEntriesOptionalText EncountersSectionEntriesOptionalTitle EncountersSectionEncounterActivities' templateId.root='2.16.840.1.113883.10.20.22.2.22.1' constraints.validation.dependOn.EncountersSectionEntriesOptionalCode='EncountersSectionEntriesOptionalCodeP'"
 *        annotation="duplicates"
 * @generated
 */
public interface EncountersSection extends EncountersSectionEntriesOptional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor &lt;&gt; vocab::NullFlavor::NI implies entry-&gt;exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(consol::EncounterActivities))'"
	 * @generated
	 */
	boolean validateEncountersSectionEncounterActivities(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEncounters()-&gt;select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::EncounterActivities)).oclAsType(consol::EncounterActivities)'"
	 * @generated
	 */
	EList<EncounterActivities> getConsolEncounterActivitiess();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSection init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // EncountersSection
