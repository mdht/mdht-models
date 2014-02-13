/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Medication Information</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getImmunizationMedicationInformation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ImmunizationMedicationInformationTemplateId ImmunizationMedicationInformationClassCode ImmunizationMedicationInformationManufacturedMaterial ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode' templateId.root='2.16.840.1.113883.10.20.22.4.54' classCode='MANU' constraints.validation.info='ImmunizationMedicationInformationId ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation' constraints.validation.warning='ImmunizationMedicationInformationManufacturerOrganization ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText' constraints.validation.query='ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterial constraints.validation.warning='ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText' constraints.validation.info='ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation' code.codeSystem='2.16.840.1.113883.12.292' code.codeSystemName='Vaccines administered (CVX)' constraints.validation.error='ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode'"
 * @generated
 */
public interface ImmunizationMedicationInformation extends ManufacturedProduct {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.54\')'"
	* @generated
	*/
	boolean validateImmunizationMedicationInformationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'classCode\') and self.classCode=vocab::RoleClassManufacturedProduct::MANU'"
	* @generated
	*/
	boolean validateImmunizationMedicationInformationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())'"
	* @generated
	*/
	boolean validateImmunizationMedicationInformationId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturerOrganization->one(manufacturerOrganization : cda::Organization | not manufacturerOrganization.oclIsUndefined() and manufacturerOrganization.oclIsKindOf(rim::Entity))'"
	* @generated
	*/
	boolean validateImmunizationMedicationInformationManufacturerOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial->one(manufacturedMaterial : cda::Material | not manufacturedMaterial.oclIsUndefined() and manufacturedMaterial.oclIsKindOf(cda::Material))'"
	* @generated
	*/
	boolean validateImmunizationMedicationInformationManufacturedMaterial(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial->excluding(null)->reject(code.originalText->size() = 1)'"
	* @generated
	*/
	boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial->excluding(null)->reject(code.originalText->size() = 1 implies code.originalText->one(reference->size() = 1))'"
	* @generated
	*/
	boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial->excluding(null)->reject(code.originalText.reference->size() = 1 implies code.originalText.reference.value->size() = 1)'"
	* @generated
	*/
	boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial->excluding(null)->reject(code->size() = 1 implies code.translation->size() > 0)'"
	* @generated
	*/
	boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.12.292\' and (value.code = \'143\' or value.code = \'54\' or value.code = \'55\' or value.code = \'82\' or value.code = \'24\' or value.code = \'19\' or value.code = \'27\' or value.code = \'26\' or value.code = \'29\' or value.code = \'56\' or value.code = \'12\' or value.code = \'28\' or value.code = \'20\' or value.code = \'106\' or value.code = \'107\' or value.code = \'146\' or value.code = \'110\' or value.code = \'50\' or value.code = \'120\' or value.code = \'130\' or value.code = \'132\' or value.code = \'01\' or value.code = \'22\' or value.code = \'102\' or value.code = \'57\' or value.code = \'30\' or value.code = \'52\' or value.code = \'83\' or value.code = \'84\' or value.code = \'31\' or value.code = \'85\' or value.code = \'104\' or value.code = \'08\' or value.code = \'42\' or value.code = \'43\' or value.code = \'44\' or value.code = \'45\' or value.code = \'58\' or value.code = \'59\' or value.code = \'60\' or value.code = \'47\' or value.code = \'46\' or value.code = \'49\' or value.code = \'48\' or value.code = \'17\' or value.code = \'51\' or value.code = \'61\' or value.code = \'118\' or value.code = \'62\' or value.code = \'137\' or value.code = \'86\' or value.code = \'14\' or value.code = \'87\' or value.code = \'123\' or value.code = \'135\' or value.code = \'111\' or value.code = \'149\' or value.code = \'141\' or value.code = \'140\' or value.code = \'144\' or value.code = \'15\' or value.code = \'88\' or value.code = \'16\' or value.code = \'10\' or value.code = \'134\' or value.code = \'39\' or value.code = \'129\' or value.code = \'63\' or value.code = \'64\' or value.code = \'65\' or value.code = \'66\' or value.code = \'04\' or value.code = \'67\' or value.code = \'05\' or value.code = \'68\' or value.code = \'103\' or value.code = \'148\' or value.code = \'147\' or value.code = \'136\' or value.code = \'114\' or value.code = \'32\' or value.code = \'108\' or value.code = \'03\' or value.code = \'94\' or value.code = \'07\' or value.code = \'998\' or value.code = \'127\' or value.code = \'128\' or value.code = \'125\' or value.code = \'126\' or value.code = \'02\' or value.code = \'69\' or value.code = \'11\' or value.code = \'23\' or value.code = \'133\' or value.code = \'100\' or value.code = \'33\' or value.code = \'109\' or value.code = \'89\' or value.code = \'70\' or value.code = \'40\' or value.code = \'18\' or value.code = \'90\' or value.code = \'99\' or value.code = \'72\' or value.code = \'73\' or value.code = \'34\' or value.code = \'119\' or value.code = \'116\' or value.code = \'74\' or value.code = \'122\' or value.code = \'71\' or value.code = \'93\' or value.code = \'145\' or value.code = \'06\' or value.code = \'38\' or value.code = \'76\' or value.code = \'138\' or value.code = \'113\' or value.code = \'09\' or value.code = \'139\' or value.code = \'115\' or value.code = \'35\' or value.code = \'142\' or value.code = \'112\' or value.code = \'77\' or value.code = \'13\' or value.code = \'98\' or value.code = \'95\' or value.code = \'96\' or value.code = \'97\' or value.code = \'78\' or value.code = \'25\' or value.code = \'41\' or value.code = \'53\' or value.code = \'91\' or value.code = \'101\' or value.code = \'131\' or value.code = \'999\' or value.code = \'75\' or value.code = \'105\' or value.code = \'79\' or value.code = \'21\' or value.code = \'81\' or value.code = \'80\' or value.code = \'92\' or value.code = \'36\' or value.code = \'117\' or value.code = \'37\' or value.code = \'121\')))'"
	* @generated
	*/
	boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial->excluding(null)->reject((lotNumberText.oclIsUndefined() or lotNumberText.isNullFlavorUndefined()) implies (not lotNumberText.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ImmunizationMedicationInformation init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationMedicationInformation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ImmunizationMedicationInformation
