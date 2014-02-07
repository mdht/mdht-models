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

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extremities Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getExtremitiesAssessment()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ExtremitiesAssessmentTemplateId ExtremitiesAssessmentMoodCode ExtremitiesAssessmentCode ExtremitiesAssessmentCodeP ExtremitiesAssessmentEffectiveTime ExtremitiesAssessmentValue ExtremitiesAssessmentTargetSiteCode' templateId.root='2.16.840.1.1133883.17.3.10.1.120' moodCode='EVN' code.code='67533-0' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Physical findings of Extremity NEMSIS' constraints.validation.dependOn.ExtremitiesAssessmentCode='ExtremitiesAssessmentCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC' targetSiteCode.codeSystem='2.16.840.1.113883.6.1' targetSiteCode.codeSystemName='LOINC' constraints.validation.info='ExtremitiesAssessmentTargetSiteCodeP'"
 * @generated
 */
public interface ExtremitiesAssessment extends Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.120\')'"
	 * @generated
	 */
	boolean validateExtremitiesAssessmentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateExtremitiesAssessmentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateExtremitiesAssessmentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.code = \'67533-0\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateExtremitiesAssessmentCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateExtremitiesAssessmentEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'LA17208-2\' or value.code = \'LA17209-0\' or value.code = \'LA17214-0\' or value.code = \'LA17215-7\' or value.code = \'LA17220-7\' or value.code = \'LA17229-8\' or value.code = \'LA17244-7\' or value.code = \'LA17245-4\' or value.code = \'LA17260-3\' or value.code = \'LA17261-1\' or value.code = \'LA17262-9\' or value.code = \'LA17263-7\' or value.code = \'LA17264-5\' or value.code = \'LA17265-2\' or value.code = \'LA17266-0\' or value.code = \'LA17267-8\' or value.code = \'LA17268-6\' or value.code = \'LA17269-4\' or value.code = \'LA17270-2\' or value.code = \'LA17271-0\' or value.code = \'LA17272-8\' or value.code = \'LA17273-6\' or value.code = \'LA17274-4\' or value.code = \'LA17344-5\' or value.code = \'LA17709-9\' or value.code = \'LA18220-6\' or value.code = \'LA18222-2\' or value.code = \'LA18223-0\' or value.code = \'LA18224-8\' or value.code = \'LA18225-5\' or value.code = \'LA18226-3\' or value.code = \'LA18249-5\' or value.code = \'LA6626-1\' or value.code = \'LA6630-3\' or value.code = \'LA7410-9\' or value.code = \'LA7452-1\' or value.code = \'LA7460-4\')))'"
	 * @generated
	 */
	boolean validateExtremitiesAssessmentValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->size() = 1 and self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'LA18739-5\' or value.code = \'LA18740-3\' or value.code = \'LA18741-1\' or value.code = \'LA18742-9\' or value.code = \'LA18743-7\' or value.code = \'LA18744-5\' or value.code = \'LA18745-2\' or value.code = \'LA18746-0\' or value.code = \'LA18747-8\' or value.code = \'LA18748-6\' or value.code = \'LA18749-4\' or value.code = \'LA18750-2\' or value.code = \'LA18751-0\' or value.code = \'LA18752-8\' or value.code = \'LA18753-6\' or value.code = \'LA18754-4\' or value.code = \'LA18755-1\' or value.code = \'LA18756-9\' or value.code = \'LA18757-7\' or value.code = \'LA18758-5\' or value.code = \'LA18759-3\' or value.code = \'LA18760-1\' or value.code = \'LA18761-9\' or value.code = \'LA18762-7\' or value.code = \'LA18763-5\' or value.code = \'LA18764-3\' or value.code = \'LA18765-0\' or value.code = \'LA18766-8\' or value.code = \'LA18767-6\' or value.code = \'LA18768-4\' or value.code = \'LA18769-2\' or value.code = \'LA18770-0\' or value.code = \'LA18771-8\' or value.code = \'LA18772-6\' or value.code = \'LA18773-4\' or value.code = \'LA18774-2\' or value.code = \'LA18775-9\' or value.code = \'LA18776-7\' or value.code = \'LA18777-5\' or value.code = \'LA18778-3\' or value.code = \'LA18779-1\' or value.code = \'LA18780-9\' or value.code = \'LA18781-7\' or value.code = \'LA18782-5\' or value.code = \'LA18783-3\' or value.code = \'LA18784-1\' or value.code = \'LA18785-8\' or value.code = \'LA18786-6\')))'"
	 * @generated
	 */
	boolean validateExtremitiesAssessmentTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->size() = 1)'"
	 * @generated
	 */
	boolean validateExtremitiesAssessmentTargetSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtremitiesAssessment init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtremitiesAssessment init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ExtremitiesAssessment
