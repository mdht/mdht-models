/**
 */
package org.hl7.cbcc.privacy.consentdirective;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.Act;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consent Directive Structured Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage#getConsentDirectiveStructuredDefinition()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ConsentDirectiveStructuredDefinitionTemplateId ConsentDirectiveStructuredDefinitionCode ConsentDirectiveStructuredDefinitionCodeP ConsentDirectiveStructuredDefinitionMoodCode' templateId.root='2.16.840.1.113883.3.445.5' code.codeSystem='2.16.840.1.113883.5.1063' code.codeSystemName='SecurityObservationValueCodeSystem' constraints.validation.dependOn.ConsentDirectiveStructuredDefinitionCode='ConsentDirectiveStructuredDefinitionCodeP' moodCode='DEF' constraints.validation.warning='ConsentDirectiveStructuredDefinitionInformant ConsentDirectiveStructuredDefinitionParticipant ConsentDirectiveStructuredDefinitionConsentAction ConsentDirectiveStructuredDefinitionInformationCriteriaReferencesOrganizer' constraints.validation.info='ConsentDirectiveStructuredDefinitionSecurityLabelCriteria'"
 * @generated
 */
public interface ConsentDirectiveStructuredDefinition extends Act {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.445.5\')'"
	 * @generated
	 */
	boolean validateConsentDirectiveStructuredDefinitionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateConsentDirectiveStructuredDefinitionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.5.1063\' and (value.code = \'TREAT\' or value.code = \'ETREAT\' or value.code = \'HPAYMT\' or value.code = \'HRESCH\' or value.code = \'CLINTRCH\' or value.code = \' CLINTRL\')'"
	 * @generated
	 */
	boolean validateConsentDirectiveStructuredDefinitionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\')'"
	 * @generated
	 */
	boolean validateConsentDirectiveStructuredDefinitionMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->exists(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(rim::Participation))'"
	 * @generated
	 */
	boolean validateConsentDirectiveStructuredDefinitionInformant(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(consentdirective::IIHIReceivingProvider))'"
	 * @generated
	 */
	boolean validateConsentDirectiveStructuredDefinitionParticipant(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consentdirective::ConsentAction) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateConsentDirectiveStructuredDefinitionConsentAction(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.organizer.oclIsUndefined() and entryRelationship.organizer.oclIsKindOf(consentdirective::InformationCriteriaReferencesOrganizer) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateConsentDirectiveStructuredDefinitionInformationCriteriaReferencesOrganizer(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.organizer.oclIsUndefined() and entryRelationship.organizer.oclIsKindOf(consentdirective::SecurityLabel) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateConsentDirectiveStructuredDefinitionSecurityLabelCriteria(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consentdirective::ConsentAction)).oclAsType(consentdirective::ConsentAction)'"
	 * @generated
	 */
	EList<ConsentAction> getConsentActions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consentdirective::InformationCriteriaReferencesOrganizer)).oclAsType(consentdirective::InformationCriteriaReferencesOrganizer)'"
	 * @generated
	 */
	EList<InformationCriteriaReferencesOrganizer> getInformationCriteriaReferencesOrganizers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consentdirective::SecurityLabel)).oclAsType(consentdirective::SecurityLabel)'"
	 * @generated
	 */
	EList<SecurityLabel> getSecurityLabelCriteria();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentDirectiveStructuredDefinition init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentDirectiveStructuredDefinition init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ConsentDirectiveStructuredDefinition
