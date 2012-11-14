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
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Functional Status Section</b></em>'. <!-- end-user-doc -->
 * 
 * 
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getFunctionalStatusSection()
 * @model annotation=
 *        "http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Mu2consolFunctionalStatusSectionTemplateId Mu2consolFunctionalStatusSectionCognitiveStatus Mu2consolFunctionalStatusSectionFunctionalStatus' templateId.root='2.16.840.1.113883.10.20.22.2.14'"
 * @generated
 */
public interface FunctionalStatusSection extends
		org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not
	 * entry.observation.oclIsUndefined() and
	 * entry.observation.oclIsKindOf(consol::CognitiveStatusProblemObservation))
	 * or self.entry->exists(entry : cda::Entry | not
	 * entry.observation.oclIsUndefined() and
	 * entry.observation.oclIsKindOf(consol::CognitiveStatusResultObservation))
	 * or self.entry->exists(entry : cda::Entry | not
	 * entry.organizer.oclIsUndefined() and
	 * entry.organizer.oclIsKindOf(consol::CognitiveStatusResultOrganizer))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::CognitiveStatusProblemObservation)) or self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::CognitiveStatusResultObservation)) or  self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::CognitiveStatusResultOrganizer))'"
	 * @generated
	 */
	boolean validateMu2consolFunctionalStatusSectionCognitiveStatus(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not
	 * entry.observation.oclIsUndefined() and
	 * entry.observation.oclIsKindOf(consol
	 * ::FunctionalStatusProblemObservation)) or self.entry->exists(entry :
	 * cda::Entry | not entry.observation.oclIsUndefined() and
	 * entry.observation.oclIsKindOf(consol::FunctionalStatusResultObservation))
	 * or self.entry->exists(entry : cda::Entry | not
	 * entry.organizer.oclIsUndefined() and
	 * entry.organizer.oclIsKindOf(consol::FunctionalStatusResultOrganizer))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::FunctionalStatusProblemObservation)) or self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::FunctionalStatusResultObservation)) or self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::FunctionalStatusResultOrganizer))'"
	 * @generated
	 */
	boolean validateMu2consolFunctionalStatusSectionFunctionalStatus(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not
	 * observation.oclIsUndefined() and
	 * observation.oclIsKindOf(consol::CognitiveStatusProblemObservation
	 * )).oclAsType(consol::CognitiveStatusProblemObservation) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CognitiveStatusProblemObservation)).oclAsType(consol::CognitiveStatusProblemObservation)'"
	 * @generated
	 */
	EList<CognitiveStatusProblemObservation> getMu2consolCognitiveStatusProblemObservations();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not
	 * observation.oclIsUndefined() and
	 * observation.oclIsKindOf(consol::CognitiveStatusResultObservation
	 * )).oclAsType(consol::CognitiveStatusResultObservation) <!-- end-model-doc
	 * -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CognitiveStatusResultObservation)).oclAsType(consol::CognitiveStatusResultObservation)'"
	 * @generated
	 */
	EList<CognitiveStatusResultObservation> getMu2consolCognitiveStatusResultObservations();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getOrganizers()->select(organizer : cda::Organizer | not
	 * organizer.oclIsUndefined() and
	 * organizer.oclIsKindOf(consol::CognitiveStatusResultOrganizer
	 * )).oclAsType(consol::CognitiveStatusResultOrganizer) <!-- end-model-doc
	 * -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::CognitiveStatusResultOrganizer)).oclAsType(consol::CognitiveStatusResultOrganizer)'"
	 * @generated
	 */
	EList<CognitiveStatusResultOrganizer> getMu2consolCognitiveStatusResultOrganizers();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not
	 * observation.oclIsUndefined() and
	 * observation.oclIsKindOf(consol::FunctionalStatusProblemObservation
	 * )).oclAsType(consol::FunctionalStatusProblemObservation) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FunctionalStatusProblemObservation)).oclAsType(consol::FunctionalStatusProblemObservation)'"
	 * @generated
	 */
	EList<FunctionalStatusProblemObservation> getMu2consolFunctionalStatusProblemObservations();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not
	 * observation.oclIsUndefined() and
	 * observation.oclIsKindOf(consol::FunctionalStatusResultObservation
	 * )).oclAsType(consol::FunctionalStatusResultObservation) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FunctionalStatusResultObservation)).oclAsType(consol::FunctionalStatusResultObservation)'"
	 * @generated
	 */
	EList<FunctionalStatusResultObservation> getMu2consolFunctionalStatusResultObservations();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getOrganizers()->select(organizer : cda::Organizer | not
	 * organizer.oclIsUndefined() and
	 * organizer.oclIsKindOf(consol::FunctionalStatusResultOrganizer
	 * )).oclAsType(consol::FunctionalStatusResultOrganizer) <!-- end-model-doc
	 * -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::FunctionalStatusResultOrganizer)).oclAsType(consol::FunctionalStatusResultOrganizer)'"
	 * @generated
	 */
	EList<FunctionalStatusResultOrganizer> getMu2consolFunctionalStatusResultOrganizers();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FunctionalStatusSection init();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FunctionalStatusSection init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // FunctionalStatusSection
