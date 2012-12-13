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
 * A representation of the model object '<em><b>EMS Social History Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getEMSSocialHistorySection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EMSSocialHistorySectionTemplateId EMSSocialHistorySectionCode EMSSocialHistorySectionCodeP EMSSocialHistorySectionTitle EMSSocialHistorySectionText EMSSocialHistorySectionEntry1' templateId.root='2.16.840.1.113883.17.3.10.1.22' code.code='67843-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='EMS Social History Section' title.mixed='EMS Social History'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSocialHistorySectionEMSDrugUseEntry constraints.validation.error='EMSDrugUseEntryEMSExistenceOfDrugUseIndicator'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSocialHistorySectionEMSDrugUseEntryEMSExistenceOfDrugUseIndication code.code='69757-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Indications of drug or alcohol use by the patient' constraints.validation.error='EMSExistenceOfDrugUseIndicationCode EMSExistenceOfDrugUseIndicationCodeP EMSExistenceOfDrugUseIndicationValue' constraints.validation.dependOn.EMSExistenceOfDrugUseIndicationCode='EMSExistenceOfDrugUseIndicationCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrEMSSocialHistorySectionEMSDrugUseEntryEMSDrugUseIndication code.code='67669-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Alcohol - drug use' constraints.validation.error='EMSDrugUseIndicationCode EMSDrugUseIndicationValue' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 * @generated
 */
public interface EMSSocialHistorySection extends Section {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.17.3.10.1.22\')'"
	* @generated
	*/
	boolean validateEMSSocialHistorySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'67843-3\' and value.codeSystem = \'2.16.840.1.113883.6.1\''"
	* @generated
	*/
	boolean validateEMSSocialHistorySectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSSocialHistorySectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'EMS Social History\')'"
	* @generated
	*/
	boolean validateEMSSocialHistorySectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSSocialHistorySectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEMSSocialHistorySectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EMSSocialHistorySection init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSSocialHistorySection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // EMSSocialHistorySection
