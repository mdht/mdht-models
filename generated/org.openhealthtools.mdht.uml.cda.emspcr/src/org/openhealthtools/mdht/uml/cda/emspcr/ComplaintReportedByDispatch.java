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
 * A representation of the model object '<em><b>Complaint Reported By Dispatch</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getComplaintReportedByDispatch()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ComplaintReportedByDispatchTemplateId ComplaintReportedByDispatchMoodCode ComplaintReportedByDispatchCode ComplaintReportedByDispatchCodeP ComplaintReportedByDispatchValue ComplaintReportedByDispatchValueP' templateId.root='2.16.840.1.1133883.17.3.10.1.74' moodCode='EVN' code.code='67570-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Chief complaint per dispatch Reported.dispatch' constraints.validation.dependOn.ComplaintReportedByDispatchCode='ComplaintReportedByDispatchCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 * @generated
 */
public interface ComplaintReportedByDispatch extends Observation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.74\')'"
   * @generated
   */
  boolean validateComplaintReportedByDispatchTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateComplaintReportedByDispatchMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateComplaintReportedByDispatchCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.code = \'67570-2\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
   * @generated
   */
  boolean validateComplaintReportedByDispatchCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'LA15468-4\' or value.code = \'LA15903-0\' or value.code = \'LA17117-5\' or value.code = \'LA17118-3\' or value.code = \'LA17119-1\' or value.code = \'LA17120-9\' or value.code = \'LA17121-7\' or value.code = \'LA17122-5\' or value.code = \'LA17123-3\' or value.code = \'LA17124-1\' or value.code = \'LA17125-8\' or value.code = \'LA17126-6\' or value.code = \'LA17127-4\' or value.code = \'LA17128-2\' or value.code = \'LA17129-0\' or value.code = \'LA17131-6\' or value.code = \'LA17132-4\' or value.code = \'LA17133-2\' or value.code = \'LA17134-0\' or value.code = \'LA17135-7\' or value.code = \'LA17136-5\' or value.code = \'LA17137-3\' or value.code = \'LA17138-1\' or value.code = \'LA17140-7\' or value.code = \'LA17141-5\' or value.code = \'LA17142-3\' or value.code = \'LA17143-1\' or value.code = \'LA17144-9\' or value.code = \'LA17145-6\' or value.code = \'LA17146-4\' or value.code = \'LA17147-2\' or value.code = \'LA17148-0\' or value.code = \'LA17149-8\' or value.code = \'LA17150-6\' or value.code = \'LA18093-7\' or value.code = \'LA18209-9\' or value.code = \'LA18210-7\' or value.code = \'LA18211-5\' or value.code = \'LA9553-4\' or value.code = \'LA9555-9\')))'"
   * @generated
   */
  boolean validateComplaintReportedByDispatchValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))'"
   * @generated
   */
  boolean validateComplaintReportedByDispatchValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplaintReportedByDispatch init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComplaintReportedByDispatch init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ComplaintReportedByDispatch
