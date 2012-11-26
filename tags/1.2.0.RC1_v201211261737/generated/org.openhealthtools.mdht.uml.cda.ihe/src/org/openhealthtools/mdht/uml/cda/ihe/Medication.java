/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 * This content module describes the general structure for a medication. All medication administration acts will be derived
 * from this content module.
 * </p>
 * <p>
 * The &lt;substanceAdministration> element may contain subordinate
 * &lt;substanceAdministration> elements in a related component entry to deal with special cases (see
 * the section below on Special Cases). These cases include split, tapered, or conditional dosing, or
 * combination medications. The use of subordinate &lt;substanceAdministration> elements to deal with these cases is optional. The comment field should always be used in these cases to provide
 * the same information as free text in the top level &lt;substanceAdministration> element.
 * </p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#getMedication()
 * @model abstract="true"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='MedicationTemplateId MedicationHasProductEntry MedicationHasIntructionsInversion MedicationProductName MedicationHasSupplyEntryInversion MedicationCode MedicationStatusCode MedicationEffectiveTime' templateId.root='1.3.6.1.4.1.19376.1.5.3.1.4.7' constraints.validation.warning='MedicationProductStrength MedicationHasFillNumber MedicationDoseQuantity MedicationRateQuantity' constraints.validation.info='MedicationPreconditionReference MedicationApproachSiteCode' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT'"
 * @generated
 */
public interface Medication extends MedicationActivity {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.5.3.1.4.7.1\') xor self.templateId->exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.5.3.1.4.8\') xor self.templateId->exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.5.3.1.4.9\') xor self.templateId->exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.5.3.1.4.10\') xor self.templateId->exists(id : datatypes::II | id.root =  \'1.3.6.1.4.1.19376.1.5.3.1.4.11\')'"
	* @generated
	*/
	boolean validateMedicationHasDosing(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.5.3.1.4.8\') xor \nself.templateId->exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.5.3.1.4.9\') xor \nself.templateId->exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.5.3.1.4.10\') xor \nself.templateId->exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.5.3.1.4.11\') implies self.entryRelationship->exists(er | er.typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)'"
	* @generated
	*/
	boolean validateMedicationDosingRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.consumable.manufacturedProduct.templateId->exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.5.3.1.4.7.2\')'"
	* @generated
	*/
	boolean validateMedicationHasProductEntry(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->forAll( er : cda::EntryRelationship | (not er.act.oclIsKindOf(ihe::PatientMedicalInstructions)) or ( er.inversionInd = true and er.act.oclIsKindOf(ihe::PatientMedicalInstructions))  )'"
	* @generated
	*/
	boolean validateMedicationHasIntructionsInversion(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.consumable.manufacturedProduct.manufacturedMaterial.code.oclIsUndefined() implies not self.consumable.manufacturedProduct.manufacturedMaterial.code.originalText.oclIsUndefined()'"
	* @generated
	*/
	boolean validateMedicationProductStrength(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.consumable.manufacturedProduct.manufacturedMaterial.name.oclIsUndefined()'"
	* @generated
	*/
	boolean validateMedicationProductName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.precondition.criterion.text->exists (t | t.reference.oclIsUndefined())'"
	* @generated
	*/
	boolean validateMedicationPreconditionReference(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.entryRelationship->exists(er : cda::EntryRelationship | (not er.supply->isEmpty()) and er.inversionInd<>false )'"
	* @generated
	*/
	boolean validateMedicationHasSupplyEntryInversion(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.entryRelationship->exists(er| (not er.supply->isEmpty()) and er.sequenceNumber.value.oclIsUndefined() )'"
	* @generated
	*/
	boolean validateMedicationHasFillNumber(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.5.3.1.4.7\')'"
	* @generated
	*/
	boolean validateMedicationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.approachSiteCode->isEmpty())'"
	* @generated
	*/
	boolean validateMedicationApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())'"
	* @generated
	*/
	boolean validateMedicationDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.rateQuantity.oclIsUndefined() or self.rateQuantity.isNullFlavorUndefined()) implies (not self.rateQuantity.oclIsUndefined())'"
	* @generated
	*/
	boolean validateMedicationRateQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.96\')'"
	* @generated
	*/
	boolean validateMedicationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())'"
	* @generated
	*/
	boolean validateMedicationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())'"
	* @generated
	*/
	boolean validateMedicationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @model kind="operation" required="true" ordered="false"
	*        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::InternalReference)).oclAsType(ihe::InternalReference)'"
	* @generated
	*/
	EList<InternalReference> getInternalReferences();

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @model kind="operation" required="true" ordered="false"
	*        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::PatientMedicalInstructions)).oclAsType(ihe::PatientMedicalInstructions)'"
	* @generated
	*/
	EList<PatientMedicalInstructions> getPatientMedicalInstructionss();

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @model kind="operation" required="true" ordered="false"
	*        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(ihe::SupplyEntry))->asSequence()->any(true).oclAsType(ihe::SupplyEntry)'"
	* @generated
	*/
	SupplyEntry getSupplyEntry();

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public Medication init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public Medication init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // Medication
