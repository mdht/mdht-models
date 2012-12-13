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
 * A representation of the model object '<em><b>EMS Billing Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSBillingSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EMSBillingSectionTemplateId EMSBillingSectionCode EMSBillingSectionTitle EMSBillingSectionText EMSBillingSectionBillingConditionentry EMSBillingSectionLosentry' templateId.root='2.16.840.1.113883.17.3.10.1.5' code.code='67659-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Billing Section' title.mixed='EMS Billing Section'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionBillingConditionEntry constraints.validation.error='BillingConditionEntryObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionBillingConditionEntryBillingCondition code.code='67556-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Billing condition' constraints.validation.error='BillingConditionCode BillingConditionCodeP BillingConditionValue BillingConditionValueP' constraints.validation.dependOn.BillingConditionCode='BillingConditionCodeP' value.codeSystem='2.16.840.1.113883.6.90' value.codeSystemName='ICD-10 CM'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionLevelOfServiceEntry constraints.validation.error='LevelOfServiceEntryObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSBillingSectionLevelOfServiceEntryLevelOfServiceObservation code.code='69464-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS level of service' constraints.validation.error='LevelOfServiceObservationCode LevelOfServiceObservationCodeP LevelOfServiceObservationValue LevelOfServiceObservationValueP' constraints.validation.dependOn.LevelOfServiceObservationCode='LevelOfServiceObservationCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 * @generated
 */
public interface EMSBillingSection extends Section {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.17.3.10.1.5\')'"
	* @generated
	*/
	boolean validateEMSBillingSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'67659-3\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	* @generated
	*/
	boolean validateEMSBillingSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'EMS Billing Section\')'"
	* @generated
	*/
	boolean validateEMSBillingSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSBillingSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSBillingSectionBillingConditionentry(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSBillingSectionLosentry(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EMSBillingSection init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSBillingSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // EMSBillingSection
