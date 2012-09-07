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
import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMS Times Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSTimesSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EMSTimesSectionTemplateId EMSTimesSectionCode EMSTimesSectionTitle EMSTimesSectionText EMSTimesSectionEntry1 EMSTimesSectionEntry2 EMSTimesSectionEntry3 EMSTimesSectionEntry4 EMSTimesSectionEntry5 EMSTimesSectionEntry6 EMSTimesSectionEntry7 EMSTimesSectionEntry8 EMSTimesSectionEntry9' templateId.root='2.16.840.1.113883.17.3.10.1.10' code.code='67667-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Times Section' title.mixed='EMS Times'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntry constraints.validation.error='DerivedEntryEMSDispatchNotifiedTime'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSCallTime code.code='69469-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Call time' constraints.validation.error='EMSCallTimeCode EMSCallTimeCodeP EMSCallTimeValue' constraints.validation.dependOn.EMSCallTimeCode='EMSCallTimeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSUnitNotifiedTime code.code='69471-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Unit notified time' constraints.validation.error='EMSUnitNotifiedTimeCode EMSUnitNotifiedTimeCodeP EMSUnitNotifiedTimeValue' constraints.validation.dependOn.EMSUnitNotifiedTimeCode='EMSUnitNotifiedTimeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSUnitEnRouteTime code.code='69472-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Unit en route time' constraints.validation.error='EMSUnitEnRouteTimeCode EMSUnitEnRouteTimeCodeP EMSUnitEnRouteTimeValue' constraints.validation.dependOn.EMSUnitEnRouteTimeCode='EMSUnitEnRouteTimeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSUnitOnSceneTime code.code='69473-7' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Unit on scene time' constraints.validation.error='EMSUnitOnSceneTimeCode EMSUnitOnSceneTimeCodeP EMSUnitOnSceneTimeValue' constraints.validation.dependOn.EMSUnitOnSceneTimeCode='EMSUnitOnSceneTimeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSUnitAtPatienttTime code.code='69474-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Unit at patient time' constraints.validation.error='EMSUnitAtPatienttTimeCode EMSUnitAtPatienttTimeCodeP EMSUnitAtPatienttTimeValue' constraints.validation.dependOn.EMSUnitAtPatienttTimeCode='EMSUnitAtPatienttTimeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSUnitLeftSceneTime code.code='69475-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Unit left scene time' constraints.validation.error='EMSUnitLeftSceneTimeCode EMSUnitLeftSceneTimeCodeP EMSUnitLeftSceneTimeValue' constraints.validation.dependOn.EMSUnitLeftSceneTimeCode='EMSUnitLeftSceneTimeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSPatientArrivedAtDestinationTime code.code='69476-0' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Patient arrived at destination time' constraints.validation.error='EMSPatientArrivedAtDestinationTimeCode EMSPatientArrivedAtDestinationTimeCodeP EMSPatientArrivedAtDestinationTimeValue' constraints.validation.dependOn.EMSPatientArrivedAtDestinationTimeCode='EMSPatientArrivedAtDestinationTimeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSUnitBackInServiceTime code.code='69477-8' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Unit back in service time' constraints.validation.error='EMSUnitBackInServiceTimeCode EMSUnitBackInServiceTimeCodeP EMSUnitBackInServiceTimeValue' constraints.validation.dependOn.EMSUnitBackInServiceTimeCode='EMSUnitBackInServiceTimeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSTimesSectionDerivedEntryEMSDispatchNotifiedTime code.code='69470-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Dispatch notified time' constraints.validation.error='EMSDispatchNotifiedTimeCode EMSDispatchNotifiedTimeCodeP EMSDispatchNotifiedTimeValue' constraints.validation.dependOn.EMSDispatchNotifiedTimeCode='EMSDispatchNotifiedTimeCodeP'"
 * @generated
 */
public interface EMSTimesSection extends Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.17.3.10.1.10\')'"
	 * @generated
	 */
	boolean validateEMSTimesSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.code = \'67667-6\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateEMSTimesSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateEMSTimesSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'EMS Times\')'"
	 * @generated
	 */
	boolean validateEMSTimesSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))'"
	 * @generated
	 */
	boolean validateEMSTimesSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))'"
	 * @generated
	 */
	boolean validateEMSTimesSectionEntry2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))'"
	 * @generated
	 */
	boolean validateEMSTimesSectionEntry3(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))'"
	 * @generated
	 */
	boolean validateEMSTimesSectionEntry4(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))'"
	 * @generated
	 */
	boolean validateEMSTimesSectionEntry5(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))'"
	 * @generated
	 */
	boolean validateEMSTimesSectionEntry6(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))'"
	 * @generated
	 */
	boolean validateEMSTimesSectionEntry7(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))'"
	 * @generated
	 */
	boolean validateEMSTimesSectionEntry8(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))'"
	 * @generated
	 */
	boolean validateEMSTimesSectionEntry9(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSTimesSection init();

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	public EMSTimesSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // EMSTimesSection
