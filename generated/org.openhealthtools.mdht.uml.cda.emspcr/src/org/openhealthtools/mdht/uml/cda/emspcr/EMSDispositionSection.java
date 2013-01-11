/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Observation;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMS Disposition Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSDispositionSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation title.mixed='EMS Disposition' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS Disposition Section' templateId.root='2.16.840.1.113883.17.3.10.1.4' constraints.validation.error='EMSDispositionSectionTemplateId EMSDispositionSectionCode EMSDispositionSectionCodeP EMSDispositionSectionTitle EMSDispositionSectionText' code.codeSystemName='LOINC' code.code='67796-3' constraints.validation.info='EMSDispositionSectionEntry1 EMSDispositionSectionEntry2 EMSDispositionSectionEntry3 EMSDispositionSectionEntry5 EMSDispositionSectionEntry7 EMSDispositionSectionEntry6 EMSDispositionSectionEntry4'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionNumberOfPatientsEntry constraints.validation.error='NumberOfPatientsEntryEMSNumberOfPatientsObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionNumberOfPatientsEntryEMSNumberOfPatientsObservation code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS Number of patients' constraints.validation.error='EMSNumberOfPatientsObservationCode EMSNumberOfPatientsObservationCodeP EMSNumberOfPatientsObservationValue' code.codeSystemName='LOINC' constraints.validation.dependOn.EMSNumberOfPatientsObservationCode='EMSNumberOfPatientsObservationCodeP' code.code='67547-0'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionIncidentDispositionEntry constraints.validation.error='IncidentDispositionEntryEMSIncidentDispositionObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionIncidentDispositionEntryEMSIncidentDispositionObservation value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS incident disposition' constraints.validation.error='EMSIncidentDispositionObservationCode EMSIncidentDispositionObservationCodeP EMSIncidentDispositionObservationValue EMSIncidentDispositionObservationValueP' code.codeSystemName='LOINC' code.code='67548-8' value.codeSystem='2.16.840.1.113883.6.1' constraints.validation.dependOn.EMSIncidentDispositionObservationCode='EMSIncidentDispositionObservationCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionTransportModeEntry constraints.validation.error='TransportModeEntryEMSTransportModeObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionTransportModeEntryEMSTransportModeObservation code.codeSystem='2.16.840.1.113883.6.1' constraints.validation.dependOn.EMSTransportModeObservationCode='EMSTransportModeObservationCodeP' code.displayName='EMS transport mode' constraints.validation.error='EMSTransportModeObservationCode EMSTransportModeObservationCodeP EMSTransportModeObservationValue' code.codeSystemName='LOINC' code.code='67550-4'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionTransportMethodEntry constraints.validation.error='TransportMethodEntryEMSTransportModeObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionTransportMethodEntryEMSTransportMethodObservation value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS transport method' constraints.validation.error='EMSTransportMethodObservationCode EMSTransportMethodObservationCodeP EMSTransportMethodObservationValue EMSTransportMethodObservationValueP' code.codeSystemName='LOINC' code.code='67549-6' constraints.validation.dependOn.EMSTransportMethodObservationCode='EMSTransportMethodObservationCodeP' value.codeSystem='2.16.840.1.113883.6.1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDestinationChoiceReasonEntry constraints.validation.error='DestinationChoiceReasonEntryEMSReasonForChoosingDestinationObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionDestinationChoiceReasonEntryEMSReasonForChoosingDestinationObservation value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS reason for choosing destination' constraints.validation.error='EMSReasonForChoosingDestinationObservationCode EMSReasonForChoosingDestinationObservationCodeP EMSReasonForChoosingDestinationObservationValue EMSReasonForChoosingDestinationObservationValueP' code.codeSystemName='LOINC' code.code='67552-0' value.codeSystem='2.16.840.1.113883.6.1' constraints.validation.dependOn.EMSReasonForChoosingDestinationObservationCode='EMSReasonForChoosingDestinationObservationCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionPrearrivalActivationEntry constraints.validation.error='PrearrivalActivationEntryEMSPrearrivalActivationObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionPrearrivalActivationEntryEMSPrearrivalActivationObservation code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS prearrival activation performed' constraints.validation.error='EMSPrearrivalActivationObservationCode EMSPrearrivalActivationObservationCodeP EMSPrearrivalActivationObservationValue EMSPrearrivalActivationObservationEffectiveTime' code.codeSystemName='LOINC' code.code='69462-0' constraints.validation.dependOn.EMSPrearrivalActivationObservationCode='EMSPrearrivalActivationObservationCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionPatientConditionChangeEntry constraints.validation.error='PatientConditionChangeEntryEMSPatientConditionChangeAtDestinationObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSDispositionSectionPatientConditionChangeEntryEMSPatientConditionChangeAtDestinationObservation value.codeSystemName='LOINC' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='EMS patient condition change at destination' constraints.validation.error='EMSPatientConditionChangeAtDestinationObservationCode EMSPatientConditionChangeAtDestinationObservationCodeP EMSPatientConditionChangeAtDestinationObservationValue EMSPatientConditionChangeAtDestinationObservationValueP' constraints.validation.dependOn.EMSPatientConditionChangeAtDestinationObservationCode='EMSPatientConditionChangeAtDestinationObservationCodeP' code.codeSystemName='LOINC' code.code='67551-2' value.codeSystem='2.16.840.1.113883.6.1'"
 * @generated
 */
public interface EMSDispositionSection extends Section {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.4')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.17.3.10.1.4\')'"
   * @generated
   */
	boolean validateEMSDispositionSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '67796-3' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'67796-3\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
	boolean validateEMSDispositionSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
   * @generated
   */
	boolean validateEMSDispositionSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.text.oclIsUndefined()
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.oclIsUndefined()'"
   * @generated
   */
	boolean validateEMSDispositionSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Disposition')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'EMS Disposition\')'"
   * @generated
   */
	boolean validateEMSDispositionSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispositionSection::NumberOfPatientsEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispositionSection::NumberOfPatientsEntry))'"
   * @generated
   */
	boolean validateEMSDispositionSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispositionSection::IncidentDispositionEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispositionSection::IncidentDispositionEntry))'"
   * @generated
   */
	boolean validateEMSDispositionSectionEntry2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispositionSection::TransportModeEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispositionSection::TransportModeEntry))'"
   * @generated
   */
	boolean validateEMSDispositionSectionEntry3(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispositionSection::DestinationChoiceReasonEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispositionSection::DestinationChoiceReasonEntry))'"
   * @generated
   */
	boolean validateEMSDispositionSectionEntry5(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispositionSection::PrearrivalActivationEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispositionSection::PrearrivalActivationEntry))'"
   * @generated
   */
	boolean validateEMSDispositionSectionEntry7(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispositionSection::PatientConditionChangeEntry))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispositionSection::PatientConditionChangeEntry))'"
   * @generated
   */
	boolean validateEMSDispositionSectionEntry6(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(cda::Observation))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(cda::Observation))'"
   * @generated
   */
	boolean validateEMSDispositionSectionEntry4(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispositionSection::NumberOfPatientsEntry))->asSequence()->first().oclAsType(emspcr::EMSDispositionSection::NumberOfPatientsEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispositionSection::NumberOfPatientsEntry))->asSequence()->first().oclAsType(emspcr::EMSDispositionSection::NumberOfPatientsEntry)'"
   * @generated
   */
  void getEntry1();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispositionSection::IncidentDispositionEntry))->asSequence()->first().oclAsType(emspcr::EMSDispositionSection::IncidentDispositionEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispositionSection::IncidentDispositionEntry))->asSequence()->first().oclAsType(emspcr::EMSDispositionSection::IncidentDispositionEntry)'"
   * @generated
   */
  void getEntry2();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispositionSection::TransportModeEntry))->asSequence()->first().oclAsType(emspcr::EMSDispositionSection::TransportModeEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispositionSection::TransportModeEntry))->asSequence()->first().oclAsType(emspcr::EMSDispositionSection::TransportModeEntry)'"
   * @generated
   */
  void getEntry3();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispositionSection::DestinationChoiceReasonEntry))->asSequence()->first().oclAsType(emspcr::EMSDispositionSection::DestinationChoiceReasonEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispositionSection::DestinationChoiceReasonEntry))->asSequence()->first().oclAsType(emspcr::EMSDispositionSection::DestinationChoiceReasonEntry)'"
   * @generated
   */
  void getEntry5();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispositionSection::PrearrivalActivationEntry))->asSequence()->first().oclAsType(emspcr::EMSDispositionSection::PrearrivalActivationEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispositionSection::PrearrivalActivationEntry))->asSequence()->first().oclAsType(emspcr::EMSDispositionSection::PrearrivalActivationEntry)'"
   * @generated
   */
  void getEntry7();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispositionSection::PatientConditionChangeEntry))->asSequence()->first().oclAsType(emspcr::EMSDispositionSection::PatientConditionChangeEntry)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::EMSDispositionSection::PatientConditionChangeEntry))->asSequence()->first().oclAsType(emspcr::EMSDispositionSection::PatientConditionChangeEntry)'"
   * @generated
   */
  void getEntry6();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)
   * <!-- end-model-doc -->
   * @model required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->first().oclAsType(cda::Observation)'"
   * @generated
   */
  Observation getemspcrEntry4();

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSDispositionSection init();
} // EMSDispositionSection
