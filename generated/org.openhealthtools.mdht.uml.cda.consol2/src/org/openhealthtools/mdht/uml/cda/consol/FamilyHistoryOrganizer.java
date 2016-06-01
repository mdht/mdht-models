/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.Organizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family History Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getFamilyHistoryOrganizer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='FamilyHistoryOrganizerTemplateId FamilyHistoryOrganizerClassCode FamilyHistoryOrganizerMoodCode FamilyHistoryOrganizerStatusCode FamilyHistoryOrganizerStatusCodeP FamilyHistoryOrganizerFamilyHistoryObservation FamilyHistoryOrganizerSubject FamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCode FamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCodeP FamilyHistoryOrganizerSubjectRelatedSubjectClassCode FamilyHistoryOrganizerSubjectRelatedSubjectCodeP FamilyHistoryOrganizerSubjectRelatedSubject' templateId.root='2.16.840.1.113883.10.20.22.4.45' classCode='CLUSTER' moodCode='EVN' statusCode.code='completed' constraints.validation.dependOn.FamilyHistoryOrganizerStatusCode='FamilyHistoryOrganizerStatusCodeP' constraints.validation.query='FamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCode FamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCodeP FamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonBirthTime FamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedInd FamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedTime FamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCId FamilyHistoryOrganizerSubjectRelatedSubjectClassCode FamilyHistoryOrganizerSubjectRelatedSubjectCode FamilyHistoryOrganizerSubjectRelatedSubjectCodeP FamilyHistoryOrganizerSubjectRelatedSubjectSubject FamilyHistoryOrganizerSubjectRelatedSubject' constraints.validation.warning='FamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonBirthTime FamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCId FamilyHistoryOrganizerSubjectRelatedSubjectCode FamilyHistoryOrganizerSubjectRelatedSubjectSubject' constraints.validation.info='FamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedInd FamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedTime'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFamilyHistoryOrganizerSubject constraints.validation.error='FamilyHistoryOrganizerSubjectRelatedSubject'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFamilyHistoryOrganizerSubjectRelatedSubject classCode='PRS' constraints.validation.error='FamilyHistoryOrganizerSubjectRelatedSubjectClassCode FamilyHistoryOrganizerSubjectRelatedSubjectCodeP' code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode' constraints.validation.warning='FamilyHistoryOrganizerSubjectRelatedSubjectCode FamilyHistoryOrganizerSubjectRelatedSubjectSubject'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPerson administrativeGenderCode.codeSystem='2.16.840.1.113883.5.1' administrativeGenderCode.codeSystemName='AdministrativeGenderCode' constraints.validation.error='FamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCode FamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCodeP' constraints.validation.warning='FamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonBirthTime FamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCId' constraints.validation.info='FamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedInd FamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedTime'"
 * @generated
 */
public interface FamilyHistoryOrganizer extends Organizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.45\')'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::x_ActClassDocumentEntryOrganizer::CLUSTER'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::ActMood::EVN'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in \nvalue.code = \'completed\')'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::FamilyHistoryObservation))'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerFamilyHistoryObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->one(subject : cda::Subject | not subject.oclIsUndefined() and subject.oclIsKindOf(cda::Subject))'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerSubject(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined() and administrativeGenderCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = administrativeGenderCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.1\' and (value.code = \'F\' or value.code = \'M\' or value.code = \'UNK\')))'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((birthTime.oclIsUndefined() or birthTime.isNullFlavorUndefined()) implies (not birthTime.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonBirthTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((sDTCDeceasedInd.oclIsUndefined() or sDTCDeceasedInd.isNullFlavorUndefined()) implies (not sDTCDeceasedInd.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedInd(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((sDTCDeceasedTime.oclIsUndefined() or sDTCDeceasedTime.isNullFlavorUndefined()) implies (not sDTCDeceasedTime.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedTime(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((sDTCId->isEmpty() or sDTCId->exists(element | element.isNullFlavorUndefined())) implies (not sDTCId->isEmpty()))'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::x_DocumentSubject::PRS)'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.111\' and (value.code = \'ADOPT\' or value.code = \'AUNT\' or value.code = \'CHILD\' or value.code = \'CHLDINLAW\' or value.code = \'COUSN\' or value.code = \'DOMPART\' or value.code = \'FAMMEMB\' or value.code = \'CHLDFOST\' or value.code = \'GRNDCHILD\' or value.code = \'GPARNT\' or value.code = \'GRPRN\' or value.code = \'GGRPRN\' or value.code = \'HSIB\' or value.code = \'MAUNT\' or value.code = \'MCOUSN\' or value.code = \'MGRPRN\' or value.code = \'MGGRPRN\' or value.code = \'MUNCLE\' or value.code = \'NCHILD\' or value.code = \'NPRN\' or value.code = \'NSIB\' or value.code = \'NIENEPH\' or value.code = \'PRN\' or value.code = \'PRNINLAW\' or value.code = \'PAUNT\' or value.code = \'PCOUSN\' or value.code = \'PGRPRN\' or value.code = \'PGGRPRN\' or value.code = \'PUNCLE\' or value.code = \'SIB\' or value.code = \'SIBINLAW\' or value.code = \'SIGOTHR\' or value.code = \'SPS\' or value.code = \'STEP\' or value.code = \'STPPRN\' or value.code = \'STPSIB\' or value.code = \'UNCLE\')))'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null)->reject(subject->one(subject : cda::SubjectPerson | not subject.oclIsUndefined() and subject.oclIsKindOf(cda::SubjectPerson)))'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectSubject(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null)->reject(relatedSubject->one(relatedSubject : cda::RelatedSubject | not relatedSubject.oclIsUndefined() and relatedSubject.oclIsKindOf(cda::RelatedSubject)))'"
	 * @generated
	 */
	boolean validateFamilyHistoryOrganizerSubjectRelatedSubject(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FamilyHistoryObservation)).oclAsType(consol::FamilyHistoryObservation)'"
	 * @generated
	 */
	EList<FamilyHistoryObservation> getFamilyHistoryObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryOrganizer init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // FamilyHistoryOrganizer
