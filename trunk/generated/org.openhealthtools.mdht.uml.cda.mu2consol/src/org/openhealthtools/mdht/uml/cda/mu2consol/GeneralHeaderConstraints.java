/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol;

import java.lang.Iterable;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>General Header Constraints</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getGeneralHeaderConstraints()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='mu2consolGeneralHeaderConstraintsRecordTarget mu2consolGeneralHeaderConstraintsDocumentationOf GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientName GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRole GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity GeneralHeaderConstraintsDocumentationOfServiceEventPerformer GeneralHeaderConstraintsDocumentationOfServiceEvent' constraints.validation.query='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientName GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRole GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity GeneralHeaderConstraintsDocumentationOfServiceEventPerformer GeneralHeaderConstraintsDocumentationOfServiceEvent'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTarget constraints.validation.error='RecordTargetPatientRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRole constraints.validation.error='PatientRolePatient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatient constraints.validation.error='PatientName PatientAdministrativeGenderCode PatientEthnicGroupCode PatientRaceCode PatientBirthTime PatientLanguageCommunication'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication constraints.validation.error='LanguageCommunicationLanguageCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOf constraints.validation.error='DocumentationOfServiceEvent'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEvent constraints.validation.error='ServiceEventPerformer'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1 constraints.validation.error='Performer1AssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsComponent1EncompassingEncounter constraints.validation.error='EncompassingEncounterEffectiveTime EncompassingEncounterLocation EncompassingEncounterResponsibleParty'"
 * @generated
 */
public interface GeneralHeaderConstraints extends
		org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.recordTarget->exists(recordTarget : cda::RecordTarget | not
	 * recordTarget.oclIsUndefined() and
	 * recordTarget.oclIsKindOf(cda::RecordTarget))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->exists(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))'"
	 * @generated
	 */
	boolean validateMu2consolGeneralHeaderConstraintsRecordTarget(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.documentationOf->exists(documentationOf : cda::DocumentationOf | not
	 * documentationOf.oclIsUndefined() and
	 * documentationOf.oclIsKindOf(cda::DocumentationOf))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->exists(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))'"
	 * @generated
	 */
	boolean validateMu2consolGeneralHeaderConstraintsDocumentationOf(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.documentationOf->excluding(null).serviceEvent->excluding(null).
	 * performer->excluding(null)->reject(assignedEntity->one(assignedEntity :
	 * cda::AssignedEntity | not assignedEntity.oclIsUndefined() and
	 * assignedEntity.oclIsKindOf(rim::Role)))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(rim::Role)))'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self
	 * .documentationOf->excluding(null).serviceEvent->excluding(null)->reject
	 * (performer->exists(performer : cda::Performer1 | not
	 * performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1)))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1)))'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self
	 * .documentationOf->excluding(null)->reject(serviceEvent->one(serviceEvent
	 * : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and
	 * serviceEvent.oclIsKindOf(cda::ServiceEvent)))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null)->reject(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsDocumentationOfServiceEvent(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public GeneralHeaderConstraints init();

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public GeneralHeaderConstraints init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // GeneralHeaderConstraints
