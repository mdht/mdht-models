/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.uml.cda.consol.EncounterActivities;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Encounters Section</b></em>'. <!-- end-user-doc -->
 * 
 * 
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getEncountersSection()
 * @model annotation=
 *        "http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='mu2consolEncountersSectionEncounterActivities'"
 * @generated
 */
public interface EncountersSection extends
		org.openhealthtools.mdht.uml.cda.consol.EncountersSection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not
	 * entry.encounter.oclIsUndefined() and
	 * entry.encounter.oclIsKindOf(consol::EncounterActivities))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(consol::EncounterActivities))'"
	 * @generated
	 */
	boolean validateMu2consolEncountersSectionEncounterActivities(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getEncounters()->select(encounter : cda::Encounter | not
	 * encounter.oclIsUndefined() and
	 * encounter.oclIsKindOf(consol::EncounterActivities
	 * )).oclAsType(consol::EncounterActivities) <!-- end-model-doc -->
	 * 
	 * @model required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::EncounterActivities)).oclAsType(consol::EncounterActivities)'"
	 * @generated
	 */
	EList<EncounterActivities> getmu2consolEncounterActivitiess();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EncountersSection init();
} // EncountersSection
