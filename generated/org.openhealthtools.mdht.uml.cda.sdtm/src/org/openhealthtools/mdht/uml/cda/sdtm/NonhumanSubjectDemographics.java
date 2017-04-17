/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nonhuman Subject Demographics</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getNonhumanSubjectDemographics()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject Demographics'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Non-human Subject DemographicsTemplateId Non-human Subject DemographicsClassCode Non-human Subject DemographicsMoodCode Non-human Subject DemographicsCode Non-human Subject DemographicsCodeP Non-human Subject DemographicsStudy Arm Non-human Subject DemographicsDomain Assignment Non-human Subject DemographicsReference Period Non-human Subject DemographicsstrainAssociationsubjectStrainClassCode Non-human Subject DemographicsstrainAssociationsubjectStrainCodeP Non-human Subject DemographicsstrainAssociationsubjectStrainCode Non-human Subject DemographicsstrainAssociationsubjectStrainMoodCode Non-human Subject DemographicsstrainAssociationsubjectStrainValue Non-human Subject DemographicsstrainAssociationsubjectStrainValueP Non-human Subject DemographicsstrainAssociationsubjectStrainText Non-human Subject DemographicsstrainAssociationTypeCode Non-human Subject DemographicsstrainAssociationSubjectStrain Non-human Subject DemographicsageAssociationSubjectAgeClassCode Non-human Subject DemographicsageAssociationSubjectAgeCodeP Non-human Subject DemographicsageAssociationSubjectAgeCode Non-human Subject DemographicsageAssociationSubjectAgeMoodCode Non-human Subject DemographicsageAssociationSubjectAgeValue Non-human Subject DemographicsageAssociationTypeCode Non-human Subject DemographicsageAssociationSubjectAge Non-human Subject DemographicsspeciesAssociationsubjectSpeciesClassCode Non-human Subject DemographicsspeciesAssociationsubjectSpeciesMoodCode Non-human Subject DemographicsspeciesAssociationsubjectSpeciesCodeP Non-human Subject DemographicsspeciesAssociationsubjectSpeciesCode Non-human Subject DemographicsspeciesAssociationsubjectSpeciesValue Non-human Subject DemographicsspeciesAssociationsubjectSpeciesValueP Non-human Subject DemographicsspeciesAssociationTypeCode Non-human Subject DemographicsspeciesAssociationSubjectSpecies Non-human Subject DemographicssetMembershipAssociationsetMembershipClassCode Non-human Subject DemographicssetMembershipAssociationsetMembershipCodeP Non-human Subject DemographicssetMembershipAssociationsetMembershipCode Non-human Subject DemographicssetMembershipAssociationsetMembershipMoodCode Non-human Subject DemographicssetMembershipAssociationsetMembershipValue Non-human Subject DemographicssetMembershipAssociationTypeCode Non-human Subject DemographicssetMembershipAssociationSetMembership' templateId.root='2.16.840.1.113883.10.20.23.60' classCode='ACT' moodCode='EVN' code.code='DMGtbd' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonhumanSubjectDemographicsageAssociation typeCode='COMP' constraints.validation.error='Non-human Subject DemographicsageAssociationTypeCode Non-human Subject DemographicsageAssociationSubjectAge Non-human Subject DemographicsageAssociationSubjectAgeClassCode Non-human Subject DemographicsageAssociationSubjectAgeCodeP Non-human Subject DemographicsageAssociationSubjectAgeCode Non-human Subject DemographicsageAssociationSubjectAgeMoodCode Non-human Subject DemographicsageAssociationSubjectAgeValue' constraints.validation.query='Non-human Subject DemographicsageAssociationSubjectAgeClassCode Non-human Subject DemographicsageAssociationSubjectAgeCodeP Non-human Subject DemographicsageAssociationSubjectAgeCode Non-human Subject DemographicsageAssociationSubjectAgeMoodCode Non-human Subject DemographicsageAssociationSubjectAgeValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonhumanSubjectDemographicsageAssociationSubjectAge classCode='OBS' constraints.validation.error='Non-human Subject DemographicsageAssociationSubjectAgeClassCode Non-human Subject DemographicsageAssociationSubjectAgeCode Non-human Subject DemographicsageAssociationSubjectAgeCodeP Non-human Subject DemographicsageAssociationSubjectAgeMoodCode Non-human Subject DemographicsageAssociationSubjectAgeValue' code.code='C25150' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Reported Age'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonhumanSubjectDemographicsspeciesAssociation typeCode='COMP' constraints.validation.error='Non-human Subject DemographicsspeciesAssociationTypeCode Non-human Subject DemographicsspeciesAssociationSubjectSpecies Non-human Subject DemographicsspeciesAssociationsubjectSpeciesClassCode Non-human Subject DemographicsspeciesAssociationsubjectSpeciesMoodCode Non-human Subject DemographicsspeciesAssociationsubjectSpeciesCodeP Non-human Subject DemographicsspeciesAssociationsubjectSpeciesCode Non-human Subject DemographicsspeciesAssociationsubjectSpeciesValue Non-human Subject DemographicsspeciesAssociationsubjectSpeciesValueP' constraints.validation.query='Non-human Subject DemographicsspeciesAssociationsubjectSpeciesClassCode Non-human Subject DemographicsspeciesAssociationsubjectSpeciesMoodCode Non-human Subject DemographicsspeciesAssociationsubjectSpeciesCodeP Non-human Subject DemographicsspeciesAssociationsubjectSpeciesCode Non-human Subject DemographicsspeciesAssociationsubjectSpeciesValue Non-human Subject DemographicsspeciesAssociationsubjectSpeciesValueP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonhumanSubjectDemographicsspeciesAssociationsubjectSpecies classCode='OBS' constraints.validation.error='Non-human Subject DemographicsspeciesAssociationsubjectSpeciesClassCode Non-human Subject DemographicsspeciesAssociationsubjectSpeciesMoodCode Non-human Subject DemographicsspeciesAssociationsubjectSpeciesCode Non-human Subject DemographicsspeciesAssociationsubjectSpeciesCodeP Non-human Subject DemographicsspeciesAssociationsubjectSpeciesValue Non-human Subject DemographicsspeciesAssociationsubjectSpeciesValueP' moodCode='EVN' code.code='SPCtbd' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Reported Age'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonhumanSubjectDemographicsstrainAssociation typeCode='COMP' constraints.validation.error='Non-human Subject DemographicsstrainAssociationTypeCode Non-human Subject DemographicsstrainAssociationSubjectStrain Non-human Subject DemographicsstrainAssociationsubjectStrainClassCode Non-human Subject DemographicsstrainAssociationsubjectStrainCodeP Non-human Subject DemographicsstrainAssociationsubjectStrainCode Non-human Subject DemographicsstrainAssociationsubjectStrainMoodCode Non-human Subject DemographicsstrainAssociationsubjectStrainValue Non-human Subject DemographicsstrainAssociationsubjectStrainValueP Non-human Subject DemographicsstrainAssociationsubjectStrainText' constraints.validation.query='Non-human Subject DemographicsstrainAssociationsubjectStrainClassCode Non-human Subject DemographicsstrainAssociationsubjectStrainCodeP Non-human Subject DemographicsstrainAssociationsubjectStrainCode Non-human Subject DemographicsstrainAssociationsubjectStrainMoodCode Non-human Subject DemographicsstrainAssociationsubjectStrainValue Non-human Subject DemographicsstrainAssociationsubjectStrainValueP Non-human Subject DemographicsstrainAssociationsubjectStrainText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonhumanSubjectDemographicsstrainAssociationsubjectStrain classCode='OBS' constraints.validation.error='Non-human Subject DemographicsstrainAssociationsubjectStrainClassCode Non-human Subject DemographicsstrainAssociationsubjectStrainCode Non-human Subject DemographicsstrainAssociationsubjectStrainCodeP Non-human Subject DemographicsstrainAssociationsubjectStrainMoodCode Non-human Subject DemographicsstrainAssociationsubjectStrainValue Non-human Subject DemographicsstrainAssociationsubjectStrainValueP' code.code='SStbd' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Reported Age'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonhumanSubjectDemographicssetMembershipAssociation typeCode='COMP' constraints.validation.error='Non-human Subject DemographicssetMembershipAssociationTypeCode Non-human Subject DemographicssetMembershipAssociationSetMembership Non-human Subject DemographicssetMembershipAssociationsetMembershipClassCode Non-human Subject DemographicssetMembershipAssociationsetMembershipCodeP Non-human Subject DemographicssetMembershipAssociationsetMembershipCode Non-human Subject DemographicssetMembershipAssociationsetMembershipMoodCode Non-human Subject DemographicssetMembershipAssociationsetMembershipValue' constraints.validation.query='Non-human Subject DemographicssetMembershipAssociationsetMembershipClassCode Non-human Subject DemographicssetMembershipAssociationsetMembershipCodeP Non-human Subject DemographicssetMembershipAssociationsetMembershipCode Non-human Subject DemographicssetMembershipAssociationsetMembershipMoodCode Non-human Subject DemographicssetMembershipAssociationsetMembershipValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonhumanSubjectDemographicssetMembershipAssociationsetMembership classCode='OBS' constraints.validation.error='Non-human Subject DemographicssetMembershipAssociationsetMembershipClassCode Non-human Subject DemographicssetMembershipAssociationsetMembershipCode Non-human Subject DemographicssetMembershipAssociationsetMembershipCodeP Non-human Subject DemographicssetMembershipAssociationsetMembershipMoodCode Non-human Subject DemographicssetMembershipAssociationsetMembershipValue' code.code='TBD' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Reported Age'"
 * @generated
 */
public interface NonhumanSubjectDemographics extends org.eclipse.mdht.uml.cda.Act {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsTemplateId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.60\')'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::x_ActClassDocumentEntryAct::ACT'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsMoodCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_DocumentActMood::EVN'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'DMGtbd\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\')'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsStudy Arm'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->select(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::StudyArm) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)->size() = 2'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsStudyArm(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsComment'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsComment(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsDomain Assignment'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DomainAssignment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsRelated Record'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::RelatedRecord) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsSupplemental Value'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SupplementalValue) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsReference Period'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::ReferencePeriod) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsReferencePeriod(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsstrainAssociationsubjectStrainClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsstrainAssociationsubjectStrainCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsstrainAssociationsubjectStrainCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'SStbd\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsstrainAssociationsubjectStrainMoodCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsstrainAssociationsubjectStrainValue'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.3.26.1.1\' and not value.code.oclIsUndefined())))'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsstrainAssociationsubjectStrainValueP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsstrainAssociationsubjectStrainText'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject((text.oclIsUndefined() or text.isNullFlavorUndefined()) implies (not text.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsstrainAssociationTypeCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.->reject(isDefined(\'typeCode\'))'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsstrainAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsstrainAssociationSubjectStrain'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsstrainAssociationSubjectStrain(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsageAssociationSubjectAgeClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsageAssociationSubjectAgeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsageAssociationSubjectAgeCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsageAssociationSubjectAgeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsageAssociationSubjectAgeCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'C25150\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsageAssociationSubjectAgeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsageAssociationSubjectAgeMoodCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsageAssociationSubjectAgeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsageAssociationSubjectAgeValue'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::PQ))))'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsageAssociationSubjectAgeValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsageAssociationTypeCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.->reject(isDefined(\'typeCode\'))'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsageAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsageAssociationSubjectAge'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsageAssociationSubjectAge(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsspeciesAssociationsubjectSpeciesClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsspeciesAssociationsubjectSpeciesMoodCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsspeciesAssociationsubjectSpeciesCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsspeciesAssociationsubjectSpeciesCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'SPCtbd\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsspeciesAssociationsubjectSpeciesValue'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.3.26.1.1\' and not value.code.oclIsUndefined())))'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsspeciesAssociationsubjectSpeciesValueP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsspeciesAssociationTypeCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.->reject(isDefined(\'typeCode\'))'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsspeciesAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicsspeciesAssociationSubjectSpecies'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicsspeciesAssociationSubjectSpecies(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicssetMembershipAssociationsetMembershipClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicssetMembershipAssociationsetMembershipCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicssetMembershipAssociationsetMembershipCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'TBD\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicssetMembershipAssociationsetMembershipMoodCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicssetMembershipAssociationsetMembershipValue'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self..observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicssetMembershipAssociationTypeCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.->reject(isDefined(\'typeCode\'))'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicssetMembershipAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-human Subject DemographicssetMembershipAssociationSetMembership'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
	 * @generated
	 */
	boolean validateNonhumanSubjectDemographicssetMembershipAssociationSetMembership(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" upper="2" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getStudy Arms'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::StudyArm)).oclAsType(sdtm::StudyArm)'"
	 * @generated
	 */
	EList<StudyArm> getStudyArms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment)).oclAsType(sdtm::Comment)'"
	 * @generated
	 */
	EList<Comment> getComments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getDomain Assignment'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DomainAssignment))->asSequence()->any(true).oclAsType(sdtm::DomainAssignment)'"
	 * @generated
	 */
	DomainAssignment getDomainAssignment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getRelated Records'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::RelatedRecord)).oclAsType(sdtm::RelatedRecord)'"
	 * @generated
	 */
	EList<RelatedRecord> getRelatedRecords();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getSupplemental Values'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SupplementalValue)).oclAsType(sdtm::SupplementalValue)'"
	 * @generated
	 */
	EList<SupplementalValue> getSupplementalValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getReference Period'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::ReferencePeriod))->asSequence()->any(true).oclAsType(sdtm::ReferencePeriod)'"
	 * @generated
	 */
	ReferencePeriod getReferencePeriod();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonhumanSubjectDemographics init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NonhumanSubjectDemographics init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers);
} // NonhumanSubjectDemographics
