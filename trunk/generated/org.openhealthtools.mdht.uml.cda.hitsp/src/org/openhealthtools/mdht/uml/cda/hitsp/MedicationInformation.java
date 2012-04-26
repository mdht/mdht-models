/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.ihe.ProductEntry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Information</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage#getMedicationInformation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.info='MedicationInformationCodedIngredientVocab' templateId.root='2.16.840.1.113883.3.88.11.83.8.2' constraints.validation.error='MedicationInformationTemplateId MedicationInformationCodedProductName MedicationInformationCodedProductVocab MedicationInformationCodedBrandName MedicationInformationCodedBrandNameVocab MedicationInformationFreeTextProductName MedicationInformationFreeTextBrandName'"
 * @generated
 */
public interface MedicationInformation extends ProductEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.manufacturedMaterial.code.code.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.manufacturedMaterial.code.code.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateMedicationInformationCodedProductName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.manufacturedMaterial.code.codeSystem = '2.16.840.1.113883.6.88'
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial.code.codeSystem = \'2.16.840.1.113883.6.88\''"
	 * @generated
	 */
	boolean validateMedicationInformationCodedProductVocab(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.manufacturedMaterial.code.codeSystem = '2.16.840.1.113883.4.9'
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial.code.codeSystem = \'2.16.840.1.113883.4.9\''"
	 * @generated
	 */
	boolean validateMedicationInformationCodedIngredientVocab(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.manufacturedMaterial.code.translation->size() > 0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial.code.translation->size() > 0'"
	 * @generated
	 */
	boolean validateMedicationInformationCodedBrandName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.manufacturedMaterial.code.codeSystem = '2.16.840.1.113883.6.88' or self.manufacturedMaterial.code.codeSystem = '2.16.840.1.113883.6.69'
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.manufacturedMaterial.code.codeSystem = \'2.16.840.1.113883.6.88\' or self.manufacturedMaterial.code.codeSystem = \'2.16.840.1.113883.6.69\''"
	 * @generated
	 */
	boolean validateMedicationInformationCodedBrandNameVocab(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.manufacturedMaterial.code.originalText.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.manufacturedMaterial.code.originalText.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateMedicationInformationFreeTextProductName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.manufacturedMaterial.name.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.manufacturedMaterial.name.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateMedicationInformationFreeTextBrandName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.8.2')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.88.11.83.8.2\')'"
	 * @generated
	 */
	boolean validateMedicationInformationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationInformation init();
} // MedicationInformation
