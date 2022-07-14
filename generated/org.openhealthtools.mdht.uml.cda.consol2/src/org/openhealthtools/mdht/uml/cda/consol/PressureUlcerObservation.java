/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pressure Ulcer Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPressureUlcerObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PressureUlcerObservationTemplateId PressureUlcerObservationTextReferenceValue PressureUlcerObservationHasTextReferenceValue PressureUlcerObservationTargetSiteQualifierName PressureUlcerObservationTargetSiteQualifierValue PressureUlcerObservationClassCode PressureUlcerObservationMoodCode PressureUlcerObservationId PressureUlcerObservationCodeP PressureUlcerObservationStatusCode PressureUlcerObservationEffectiveTime PressureUlcerObservationValueP PressureUlcerObservationEntryRelationship1Observation1ClassCode PressureUlcerObservationEntryRelationship1Observation1MoodCode PressureUlcerObservationEntryRelationship1Observation1CodeP PressureUlcerObservationEntryRelationship1Observation1Code PressureUlcerObservationEntryRelationship1Observation1Value PressureUlcerObservationEntryRelationship1TypeCode PressureUlcerObservationEntryRelationship1Observation1 PressureUlcerObservationEntryRelationship2Observation2ClassCode PressureUlcerObservationEntryRelationship2Observation2MoodCode PressureUlcerObservationEntryRelationship2Observation2CodeP PressureUlcerObservationEntryRelationship2Observation2Code PressureUlcerObservationEntryRelationship2Observation2Value PressureUlcerObservationEntryRelationship2TypeCode PressureUlcerObservationEntryRelationship2Observation2 PressureUlcerObservationEntryRelationship3Observation3ClassCode PressureUlcerObservationEntryRelationship3Observation3MoodCode PressureUlcerObservationEntryRelationship3Observation3CodeP PressureUlcerObservationEntryRelationship3Observation3Code PressureUlcerObservationEntryRelationship3Observation3Value PressureUlcerObservationEntryRelationship3TypeCode PressureUlcerObservationEntryRelationship3Observation3' templateId.root='2.16.840.1.113883.10.20.22.4.70' constraints.validation.warning='PressureUlcerObservationHasTextReference PressureUlcerObservationTargetSiteQualifier PressureUlcerObservationTargetSiteQualifierNameCode PressureUlcerObservationTargetSiteQualifierValueCode PressureUlcerObservationCode PressureUlcerObservationText PressureUlcerObservationValue PressureUlcerObservationTargetSiteCode PressureUlcerObservationTargetSiteCodeP PressureUlcerObservationEntryRelationship PressureUlcerObservationEntryRelationship2 PressureUlcerObservationEntryRelationship3' constraints.validation.info='PressureUlcerObservationValueNullFlavor PressureUlcerObservationNegationInd' classCode='OBS' moodCode='EVN' code.code='ASSERTION' code.codeSystem='2.16.840.1.113883.5.4' code.codeSystemName='HL7ActCode' code.displayName='Assertion' constraints.validation.dependOn.PressureUlcerObservationCode='PressureUlcerObservationCodeP' statusCode.code='completed' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' targetSiteCode.codeSystem='2.16.840.1.113883.6.96' targetSiteCode.codeSystemName='SNOMEDCT' constraints.validation.dependOn.PressureUlcerObservationTargetSiteCode='PressureUlcerObservationTargetSiteCodeP' constraints.validation.query='PressureUlcerObservationEntryRelationship1Observation1ClassCode PressureUlcerObservationEntryRelationship1Observation1MoodCode PressureUlcerObservationEntryRelationship1Observation1CodeP PressureUlcerObservationEntryRelationship1Observation1Code PressureUlcerObservationEntryRelationship1Observation1Value PressureUlcerObservationEntryRelationship1TypeCode PressureUlcerObservationEntryRelationship1Observation1 PressureUlcerObservationEntryRelationship2Observation2ClassCode PressureUlcerObservationEntryRelationship2Observation2MoodCode PressureUlcerObservationEntryRelationship2Observation2CodeP PressureUlcerObservationEntryRelationship2Observation2Code PressureUlcerObservationEntryRelationship2Observation2Value PressureUlcerObservationEntryRelationship2TypeCode PressureUlcerObservationEntryRelationship2Observation2 PressureUlcerObservationEntryRelationship3Observation3ClassCode PressureUlcerObservationEntryRelationship3Observation3MoodCode PressureUlcerObservationEntryRelationship3Observation3CodeP PressureUlcerObservationEntryRelationship3Observation3Code PressureUlcerObservationEntryRelationship3Observation3Value PressureUlcerObservationEntryRelationship3TypeCode PressureUlcerObservationEntryRelationship3Observation3' constraints.validation.dependOn.PressureUlcerObservationEntryRelationship1Observation1Code='PressureUlcerObservationEntryRelationship1Observation1CodeP' constraints.validation.dependOn.PressureUlcerObservationEntryRelationship2Observation2Code='PressureUlcerObservationEntryRelationship2Observation2CodeP' constraints.validation.dependOn.PressureUlcerObservationEntryRelationship3Observation3Code='PressureUlcerObservationEntryRelationship3Observation3CodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPressureUlcerObservationEntryRelationship1 typeCode='COMP' constraints.validation.error='PressureUlcerObservationEntryRelationship1TypeCode PressureUlcerObservationEntryRelationship1Observation1'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPressureUlcerObservationEntryRelationship1Observation1 classCode='OBS' constraints.validation.error='PressureUlcerObservationEntryRelationship1Observation1ClassCode PressureUlcerObservationEntryRelationship1Observation1MoodCode PressureUlcerObservationEntryRelationship1Observation1Code PressureUlcerObservationEntryRelationship1Observation1CodeP PressureUlcerObservationEntryRelationship1Observation1Value' moodCode='EVN' code.code='401238003' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' code.displayName='Length of Wound' constraints.validation.dependOn.PressureUlcerObservationEntryRelationship1Observation1Code='PressureUlcerObservationEntryRelationship1Observation1CodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPressureUlcerObservationEntryRelationship2 typeCode='COMP' constraints.validation.error='PressureUlcerObservationEntryRelationship2TypeCode PressureUlcerObservationEntryRelationship2Observation2'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPressureUlcerObservationEntryRelationship2Observation2 classCode='OBS' constraints.validation.error='PressureUlcerObservationEntryRelationship2Observation2ClassCode PressureUlcerObservationEntryRelationship2Observation2MoodCode PressureUlcerObservationEntryRelationship2Observation2Code PressureUlcerObservationEntryRelationship2Observation2CodeP PressureUlcerObservationEntryRelationship2Observation2Value' moodCode='EVN' code.code='401239006' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' code.displayName='Width of Wound' constraints.validation.dependOn.PressureUlcerObservationEntryRelationship2Observation2Code='PressureUlcerObservationEntryRelationship2Observation2CodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPressureUlcerObservationEntryRelationship3 typeCode='COMP' constraints.validation.error='PressureUlcerObservationEntryRelationship3TypeCode PressureUlcerObservationEntryRelationship3Observation3'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPressureUlcerObservationEntryRelationship3Observation3 classCode='OBS' constraints.validation.error='PressureUlcerObservationEntryRelationship3Observation3ClassCode PressureUlcerObservationEntryRelationship3Observation3MoodCode PressureUlcerObservationEntryRelationship3Observation3Code PressureUlcerObservationEntryRelationship3Observation3CodeP PressureUlcerObservationEntryRelationship3Observation3Value' moodCode='EVN' code.code='425094009' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' code.displayName='Depth of Wound' constraints.validation.dependOn.PressureUlcerObservationEntryRelationship3Observation3Code='PressureUlcerObservationEntryRelationship3Observation3CodeP'"
 * @generated
 */
public interface PressureUlcerObservation extends Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.oclIsUndefined() implies self.text-&gt;forAll(reference-&gt;size() = 1)'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationHasTextReference(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.text-&gt;forAll(reference-&gt;size() = 1) implies self.text-&gt;forAll(reference-&gt;one(value-&gt;size() = 1))'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.reference.value.oclIsUndefined() implies not self.getSection().text.getText(self.text.reference.value.substring(2, self.text.reference.value.size())).oclIsUndefined()'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationHasTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.value-&gt;forAll(val | not val.isNullFlavorUndefined())'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationValueNullFlavor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.targetSiteCode-&gt;forAll(qualifier-&gt;size() = 1)'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationTargetSiteQualifier(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.targetSiteCode.qualifier-&gt;forAll(name-&gt;size() = 1)'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationTargetSiteQualifierName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.targetSiteCode.qualifier-&gt;forAll(name-&gt;size() = 1 and name.code=\'272741003\' and name.codeSystem = \'2.16.840.1.113883.6.96\')'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationTargetSiteQualifierNameCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.targetSiteCode.qualifier-&gt;forAll(value-&gt;size() = 1)'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationTargetSiteQualifierValue(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.targetSiteCode.qualifier-&gt;forAll((value.isNullFlavorDefined()) or (value-&gt;size() = 1 and not value.code.oclIsUndefined() and value.codeSystem = \'2.16.840.1.113883.6.96\'))'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationTargetSiteQualifierValueCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.70\')'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::ActClassObservation::OBS'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_ActMoodDocumentObservation::EVN'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.negationInd.oclIsUndefined()'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id-&gt;isEmpty() or self.id-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not self.id-&gt;isEmpty()) )'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'ASSERTION\' and value.codeSystem = \'2.16.840.1.113883.5.4\')'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationText(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePressureUlcerObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value-&gt;isEmpty() or self.value-&gt;exists(element | element.isNullFlavorUndefined())) implies (self.value-&gt;size() = 1 and self.value-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'421076008\' or value.code = \'420324007\' or value.code = \'421927004\' or value.code = \'420597008\' or value.code = \'421594008\')))'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value-&gt;isEmpty() or self.value-&gt;exists(element | element.isNullFlavorUndefined())) implies (self.value-&gt;size() =  1 and self.value-&gt;forAll(element | element.oclIsTypeOf(datatypes::CD)))'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.targetSiteCode-&gt;isEmpty() or self.targetSiteCode-&gt;exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode-&gt;isEmpty())'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationTargetSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.targetSiteCode-&gt;isEmpty() or self.targetSiteCode-&gt;exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'79951008\' or value.code = \'23747009\' or value.code = \'76552005\' or value.code = \'45980000\' or value.code = \'74757004\' or value.code = \'51027004\' or value.code = \'304037003\' or value.code = \'286591006\' or value.code = \'49812005\' or value.code = \'29850006\' or value.code = \'22180002\')))'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;select(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'401238003\')-&gt;size() = 1'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;select(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'401239006\')-&gt;size() = 1'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEntryRelationship2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;select(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'425094009\')-&gt;size() = 1'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEntryRelationship3(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'401238003\').observation-&gt;excluding(null)-&gt;reject(classCode=vocab::ActClassObservation::OBS)'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEntryRelationship1Observation1ClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'401238003\').observation-&gt;excluding(null)-&gt;reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEntryRelationship1Observation1MoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'401238003\').observation-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEntryRelationship1Observation1CodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'401238003\').observation-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'401238003\' and value.codeSystem = \'2.16.840.1.113883.6.96\'))'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEntryRelationship1Observation1Code(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'401238003\').observation-&gt;excluding(null)-&gt;reject((value-&gt;isEmpty() or value-&gt;exists(element | element.isNullFlavorUndefined())) implies (value-&gt;size() =  1 and value-&gt;forAll(element | element.oclIsTypeOf(datatypes::PQ))))'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEntryRelationship1Observation1Value(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'401238003\')-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'401238003\')-&gt;reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEntryRelationship1TypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'401238003\')-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'401238003\')-&gt;reject(observation-&gt;one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEntryRelationship1Observation1(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'401239006\').observation-&gt;excluding(null)-&gt;reject(classCode=vocab::ActClassObservation::OBS)'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEntryRelationship2Observation2ClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'401239006\').observation-&gt;excluding(null)-&gt;reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEntryRelationship2Observation2MoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'401239006\').observation-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEntryRelationship2Observation2CodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'401239006\').observation-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'401239006\' and value.codeSystem = \'2.16.840.1.113883.6.96\'))'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEntryRelationship2Observation2Code(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'401239006\').observation-&gt;excluding(null)-&gt;reject((value-&gt;isEmpty() or value-&gt;exists(element | element.isNullFlavorUndefined())) implies (value-&gt;size() =  1 and value-&gt;forAll(element | element.oclIsTypeOf(datatypes::PQ))))'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEntryRelationship2Observation2Value(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'401239006\')-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'401239006\')-&gt;reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEntryRelationship2TypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'401239006\')-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'401239006\')-&gt;reject(observation-&gt;one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEntryRelationship2Observation2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'425094009\').observation-&gt;excluding(null)-&gt;reject(classCode=vocab::ActClassObservation::OBS)'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEntryRelationship3Observation3ClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'425094009\').observation-&gt;excluding(null)-&gt;reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEntryRelationship3Observation3MoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'425094009\').observation-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEntryRelationship3Observation3CodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'425094009\').observation-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'425094009\' and value.codeSystem = \'2.16.840.1.113883.6.96\'))'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEntryRelationship3Observation3Code(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'425094009\').observation-&gt;excluding(null)-&gt;reject((value-&gt;isEmpty() or value-&gt;exists(element | element.isNullFlavorUndefined())) implies (value-&gt;size() =  1 and value-&gt;forAll(element | element.oclIsTypeOf(datatypes::PQ))))'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEntryRelationship3Observation3Value(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'425094009\')-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'425094009\')-&gt;reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEntryRelationship3TypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'425094009\')-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP and observation.code.code=\'425094009\')-&gt;reject(observation-&gt;one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
	 * @generated
	 */
	boolean validatePressureUlcerObservationEntryRelationship3Observation3(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressureUlcerObservation init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressureUlcerObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PressureUlcerObservation
