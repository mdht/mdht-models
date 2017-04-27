/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Congenital Anomaly</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage#getCongenitalAnomaly()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Congenital Anomaly'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Congenital AnomalyTemplateId Congenital AnomalyClassCode Congenital AnomalyMoodCode Congenital AnomalyCode Congenital AnomalyCodeVS Congenital AnomalyCodeP Congenital AnomalyValue Congenital AnomalyValueP' templateId.root='2.16.840.1.113883.10.20.26.19' classCode='OBS' moodCode='EVN' code.code='73780-9' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' code.displayName='Congenital anomalies of the newborn'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrCongenitalAnomalyDownConfirmationAssociation typeCode='COMP' constraints.validation.error='Congenital AnomalyDownConfirmationAssociationTypeCode Congenital AnomalyDownConfirmationAssociationDownConfirmation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrCongenitalAnomalyDownConfirmationAssociationDownConfirmation classCode='OBS' constraints.validation.error='Congenital AnomalyDownConfirmationAssociationDownConfirmationClassCode Congenital AnomalyDownConfirmationAssociationDownConfirmationCode Congenital AnomalyDownConfirmationAssociationDownConfirmationCodeP Congenital AnomalyDownConfirmationAssociationDownConfirmationMoodCode Congenital AnomalyDownConfirmationAssociationDownConfirmationValue Congenital AnomalyDownConfirmationAssociationDownConfirmationValueP' code.code='73779-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Down syndrome karyotype status'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrCongenitalAnomalyChromosomalDisorderConfirmationAssociation typeCode='COMP' constraints.validation.error='Congenital AnomalyChromosomalDisorderConfirmationAssociationTypeCode Congenital AnomalyChromosomalDisorderConfirmationAssociationChromosomalDisorderConfirmation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrCongenitalAnomalyChromosomalDisorderConfirmationAssociationChromosomalDisorderConfirmation classCode='OBS' constraints.validation.error='Congenital AnomalyChromosomalDisorderConfirmationAssociationChromosomalDisorderConfirmationClassCode Congenital AnomalyChromosomalDisorderConfirmationAssociationChromosomalDisorderConfirmationCode Congenital AnomalyChromosomalDisorderConfirmationAssociationChromosomalDisorderConfirmationCodeP Congenital AnomalyChromosomalDisorderConfirmationAssociationChromosomalDisorderConfirmationMoodCode Congenital AnomalyChromosomalDisorderConfirmationAssociationChromosomalDisorderConfirmationValue Congenital AnomalyChromosomalDisorderConfirmationAssociationChromosomalDisorderConfirmationValueP' code.code='73778-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Suspected chromosomal disorder karyotype status'"
 * @generated
 */
public interface CongenitalAnomaly extends org.eclipse.mdht.uml.cda.Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Congenital AnomalyTemplateId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.19\')'"
	 * @generated
	 */
	boolean validateCongenitalAnomalyTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Congenital AnomalyClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::ActClassObservation::OBS'"
	 * @generated
	 */
	boolean validateCongenitalAnomalyClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Congenital AnomalyMoodCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_ActMoodDocumentObservation::EVN'"
	 * @generated
	 */
	boolean validateCongenitalAnomalyMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Congenital AnomalyCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateCongenitalAnomalyCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Congenital AnomalyCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'73780-9\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateCongenitalAnomalyCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Congenital AnomalyCodeVS'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'89369001\' or value.code = \'67531005\' or value.code = \'12770006\' or value.code = \'17190001\' or value.code = \'18735004\' or value.code = \'72951007\' or value.code = \'67341007\' or value.code = \'80281008\' or value.code = \'87979003\' or value.code = \'70156005\' or value.code = \'409709004\' or value.code = \'416010008\' or value.code = \'260413007\'))'"
	 * @generated
	 */
	boolean validateCongenitalAnomalyCodeVS(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Congenital AnomalyValue'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'89369001\' or value.code = \'67531005\' or value.code = \'12770006\' or value.code = \'17190001\' or value.code = \'18735004\' or value.code = \'72951007\' or value.code = \'67341007\' or value.code = \'80281008\' or value.code = \'87979003\' or value.code = \'70156005\' or value.code = \'409709004\' or value.code = \'416010008\' or value.code = \'260413007\')))'"
	 * @generated
	 */
	boolean validateCongenitalAnomalyValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Congenital AnomalyValueP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))'"
	 * @generated
	 */
	boolean validateCongenitalAnomalyValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Congenital AnomalyDownConfirmationAssociation'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateCongenitalAnomalyDownConfirmationAssociation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Congenital AnomalyChromosomalDisorderConfirmationAssociation'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateCongenitalAnomalyChromosomalDisorderConfirmationAssociation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CongenitalAnomaly init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CongenitalAnomaly init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers);
} // CongenitalAnomaly
