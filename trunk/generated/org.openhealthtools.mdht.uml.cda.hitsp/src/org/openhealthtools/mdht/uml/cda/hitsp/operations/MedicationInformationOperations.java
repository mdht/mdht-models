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
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ProductEntryOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Information</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation#validateMedicationInformationCodedProductName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Product Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation#validateMedicationInformationCodedProductVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Product Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation#validateMedicationInformationCodedDrugClassVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Drug Class Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation#validateMedicationInformationCodedIngredientVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Ingredient Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation#validateMedicationInformationCodedBrandName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Brand Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation#validateMedicationInformationCodedBrandNameVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Brand Name Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation#validateMedicationInformationFreeTextProductName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Free Text Product Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation#validateMedicationInformationFreeTextBrandName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Free Text Brand Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation#validateMedicationInformationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationInformationOperations extends ProductEntryOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationInformationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationCodedProductName(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Product Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationCodedProductName(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_CODED_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.manufacturedMaterial.code.code.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationCodedProductName(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Product Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationCodedProductName(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_INFORMATION_CODED_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.manufacturedMaterial.code.code.oclIsUndefined()
	 * @param medicationInformation The receiving '<em><b>Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationInformationCodedProductName(MedicationInformation medicationInformation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_INFORMATION_CODED_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.MEDICATION_INFORMATION);
			try {
				VALIDATE_MEDICATION_INFORMATION_CODED_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_INFORMATION_CODED_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_INFORMATION_CODED_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_CODED_PRODUCT_NAME,
					HITSPPlugin.INSTANCE.getString("MedicationInformationCodedProductName"),
					new Object[] { medicationInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationCodedProductVocab(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Product Vocab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationCodedProductVocab(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_CODED_PRODUCT_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial.code.codeSystem = '2.16.840.1.113883.6.88'";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationCodedProductVocab(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Product Vocab</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationCodedProductVocab(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_INFORMATION_CODED_PRODUCT_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.manufacturedMaterial.code.codeSystem = '2.16.840.1.113883.6.88'
	 * @param medicationInformation The receiving '<em><b>Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationInformationCodedProductVocab(MedicationInformation medicationInformation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_INFORMATION_CODED_PRODUCT_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.MEDICATION_INFORMATION);
			try {
				VALIDATE_MEDICATION_INFORMATION_CODED_PRODUCT_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_INFORMATION_CODED_PRODUCT_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_INFORMATION_CODED_PRODUCT_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_CODED_PRODUCT_VOCAB,
					HITSPPlugin.INSTANCE.getString("MedicationInformationCodedProductVocab"),
					new Object[] { medicationInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationCodedDrugClassVocab(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Drug Class Vocab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationCodedDrugClassVocab(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_CODED_DRUG_CLASS_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial.code.codeSystem = '2.16.840.1.113883.3.26.1.5' and (self.manufacturedMaterial.code.code = 'N0000000223' or self.manufacturedMaterial.code.code = 'N0000009802' or self.manufacturedMaterial.code.code = 'N0000000002')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationCodedDrugClassVocab(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Drug Class Vocab</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationCodedDrugClassVocab(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_INFORMATION_CODED_DRUG_CLASS_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.manufacturedMaterial.code.codeSystem = '2.16.840.1.113883.3.26.1.5' and (self.manufacturedMaterial.code.code = 'N0000000223' or self.manufacturedMaterial.code.code = 'N0000009802' or self.manufacturedMaterial.code.code = 'N0000000002')
	 * @param medicationInformation The receiving '<em><b>Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationInformationCodedDrugClassVocab(MedicationInformation medicationInformation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_INFORMATION_CODED_DRUG_CLASS_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.MEDICATION_INFORMATION);
			try {
				VALIDATE_MEDICATION_INFORMATION_CODED_DRUG_CLASS_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_INFORMATION_CODED_DRUG_CLASS_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_INFORMATION_CODED_DRUG_CLASS_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_CODED_DRUG_CLASS_VOCAB,
					HITSPPlugin.INSTANCE.getString("MedicationInformationCodedDrugClassVocab"),
					new Object[] { medicationInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationCodedIngredientVocab(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Ingredient Vocab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationCodedIngredientVocab(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_CODED_INGREDIENT_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial.code.codeSystem = '2.16.840.1.113883.4.9'";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationCodedIngredientVocab(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Ingredient Vocab</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationCodedIngredientVocab(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_INFORMATION_CODED_INGREDIENT_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.manufacturedMaterial.code.codeSystem = '2.16.840.1.113883.4.9'
	 * @param medicationInformation The receiving '<em><b>Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationInformationCodedIngredientVocab(
			MedicationInformation medicationInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_INFORMATION_CODED_INGREDIENT_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.MEDICATION_INFORMATION);
			try {
				VALIDATE_MEDICATION_INFORMATION_CODED_INGREDIENT_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_INFORMATION_CODED_INGREDIENT_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_INFORMATION_CODED_INGREDIENT_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_CODED_INGREDIENT_VOCAB,
					HITSPPlugin.INSTANCE.getString("MedicationInformationCodedIngredientVocab"),
					new Object[] { medicationInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationCodedBrandName(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Brand Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationCodedBrandName(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_CODED_BRAND_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial.code.translation->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationCodedBrandName(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Brand Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationCodedBrandName(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_INFORMATION_CODED_BRAND_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.manufacturedMaterial.code.translation->size() > 0
	 * @param medicationInformation The receiving '<em><b>Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationInformationCodedBrandName(MedicationInformation medicationInformation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_INFORMATION_CODED_BRAND_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.MEDICATION_INFORMATION);
			try {
				VALIDATE_MEDICATION_INFORMATION_CODED_BRAND_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_INFORMATION_CODED_BRAND_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_INFORMATION_CODED_BRAND_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_CODED_BRAND_NAME,
					HITSPPlugin.INSTANCE.getString("MedicationInformationCodedBrandName"),
					new Object[] { medicationInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationCodedBrandNameVocab(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Brand Name Vocab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationCodedBrandNameVocab(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_CODED_BRAND_NAME_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial.code.codeSystem = '2.16.840.1.113883.6.88' or self.manufacturedMaterial.code.codeSystem = '2.16.840.1.113883.6.69'";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationCodedBrandNameVocab(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Brand Name Vocab</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationCodedBrandNameVocab(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_INFORMATION_CODED_BRAND_NAME_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.manufacturedMaterial.code.codeSystem = '2.16.840.1.113883.6.88' or self.manufacturedMaterial.code.codeSystem = '2.16.840.1.113883.6.69'
	 * @param medicationInformation The receiving '<em><b>Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationInformationCodedBrandNameVocab(MedicationInformation medicationInformation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_INFORMATION_CODED_BRAND_NAME_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.MEDICATION_INFORMATION);
			try {
				VALIDATE_MEDICATION_INFORMATION_CODED_BRAND_NAME_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_INFORMATION_CODED_BRAND_NAME_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_INFORMATION_CODED_BRAND_NAME_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_CODED_BRAND_NAME_VOCAB,
					HITSPPlugin.INSTANCE.getString("MedicationInformationCodedBrandNameVocab"),
					new Object[] { medicationInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationFreeTextProductName(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Free Text Product Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationFreeTextProductName(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_FREE_TEXT_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.manufacturedMaterial.code.originalText.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationFreeTextProductName(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Free Text Product Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationFreeTextProductName(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_INFORMATION_FREE_TEXT_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.manufacturedMaterial.code.originalText.oclIsUndefined()
	 * @param medicationInformation The receiving '<em><b>Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationInformationFreeTextProductName(MedicationInformation medicationInformation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_INFORMATION_FREE_TEXT_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.MEDICATION_INFORMATION);
			try {
				VALIDATE_MEDICATION_INFORMATION_FREE_TEXT_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_INFORMATION_FREE_TEXT_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_INFORMATION_FREE_TEXT_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_FREE_TEXT_PRODUCT_NAME,
					HITSPPlugin.INSTANCE.getString("MedicationInformationFreeTextProductName"),
					new Object[] { medicationInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationFreeTextBrandName(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Free Text Brand Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationFreeTextBrandName(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_FREE_TEXT_BRAND_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.manufacturedMaterial.name.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationFreeTextBrandName(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Free Text Brand Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationFreeTextBrandName(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_INFORMATION_FREE_TEXT_BRAND_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.manufacturedMaterial.name.oclIsUndefined()
	 * @param medicationInformation The receiving '<em><b>Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationInformationFreeTextBrandName(MedicationInformation medicationInformation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_INFORMATION_FREE_TEXT_BRAND_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.MEDICATION_INFORMATION);
			try {
				VALIDATE_MEDICATION_INFORMATION_FREE_TEXT_BRAND_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_INFORMATION_FREE_TEXT_BRAND_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_INFORMATION_FREE_TEXT_BRAND_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_FREE_TEXT_BRAND_NAME,
					HITSPPlugin.INSTANCE.getString("MedicationInformationFreeTextBrandName"),
					new Object[] { medicationInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationTemplateId(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationTemplateId(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.8.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationTemplateId(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationTemplateId(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.8.2')
	 * @param medicationInformation The receiving '<em><b>Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationInformationTemplateId(MedicationInformation medicationInformation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.MEDICATION_INFORMATION);
			try {
				VALIDATE_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_TEMPLATE_ID,
					HITSPPlugin.INSTANCE.getString("MedicationInformationTemplateId"),
					new Object[] { medicationInformation }));
			}
			return false;
		}
		return true;
	}

} // MedicationInformationOperations
