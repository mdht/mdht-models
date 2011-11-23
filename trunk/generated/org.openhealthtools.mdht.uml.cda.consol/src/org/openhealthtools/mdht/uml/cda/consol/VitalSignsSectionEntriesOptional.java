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
 * A representation of the model object '<em><b>Vital Signs Section Entries Optional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     This section contains current and historically relevant vital signs, such as blood pressure, heart rate,
 *     respiratory rate, height, weight, body mass index, head circumference, crown-to-rump length, and pulse oximetry. The
 *     section may contain all vital signs for the period of time being summarized, but at a minimum should include notable
 *     vital signs such as the most recent, maximum and/or minimum, or both, baseline, or relevant trends.
 * </p>
 * <p>
 *     Vital signs are represented like other results (as defined in <b><i>Results
 *     Section</i></b>) with additional vocabulary constraints, but are aggregated into their own section in order to follow clinical
 *     conventions.
 * </p>
 * <p>
 *     The vital signs section shall contain a narrative description of the measurement results of a patient's vital signs.
 * </p>
 * The vital signs section contains coded measurement results of a patient's vital signs.
 * <p>
 *     The Vital Signs Section contains information documenting the patient vital signs. 
 * </p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getVitalSignsSectionEntriesOptional()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.10.20.22.2.4' constraints.validation.error='VitalSignsSectionEntriesOptionalTemplateId VitalSignsSectionEntriesOptionalVitalSignEntry'"
 * @generated
 */
public interface VitalSignsSectionEntriesOptional extends Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | entry.organizer.oclIsKindOf(consol::VitalSignsOrganizer) and entry.organizer.component.observation->exists(obs : cda::Observation | obs.oclIsKindOf(consol::VitalSign)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | entry.organizer.oclIsKindOf(consol::VitalSignsOrganizer) and entry.organizer.component.observation->exists(obs : cda::Observation | obs.oclIsKindOf(consol::VitalSign)))'"
	 * @generated
	 */
	boolean validateVitalSignsSectionEntriesOptionalVitalSignEntry(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.4')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.4\')'"
	 * @generated
	 */
	boolean validateVitalSignsSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSectionEntriesOptional init();
} // VitalSignsSectionEntriesOptional
