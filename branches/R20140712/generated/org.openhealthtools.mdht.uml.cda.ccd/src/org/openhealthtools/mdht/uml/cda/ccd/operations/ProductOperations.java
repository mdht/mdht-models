/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.Product;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.ManufacturedProductOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Product</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.Product#validateProductHasMaterial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Has Material</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.Product#validateProductHasMaterialCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Has Material Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.Product#validateProductHasMaterialCodeVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Has Material Code Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.Product#validateProductHasMaterialCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Has Material Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.Product#validateProductHasMaterialName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Has Material Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.Product#validateProductMayHaveMaterialManufacturer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product May Have Material Manufacturer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.Product#validateProductShouldHaveMaterialManufacturer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Should Have Material Manufacturer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.Product#validateProductTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.Product#validateProductId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductOperations extends ManufacturedProductOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProductHasMaterial(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Has Material</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductHasMaterial(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRODUCT_HAS_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.manufacturedMaterial.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProductHasMaterial(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Has Material</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductHasMaterial(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PRODUCT_HAS_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param product The receiving '<em><b>Product</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProductHasMaterial(Product product, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRODUCT_HAS_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PRODUCT);
			try {
				VALIDATE_PRODUCT_HAS_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRODUCT_HAS_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRODUCT_HAS_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(product)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE, CCDValidator.PRODUCT__PRODUCT_HAS_MATERIAL,
					CCDPlugin.INSTANCE.getString("ProductHasMaterial"), new Object[] { product }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProductHasMaterialCode(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Has Material Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductHasMaterialCode(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRODUCT_HAS_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.manufacturedMaterial.code.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProductHasMaterialCode(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Has Material Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductHasMaterialCode(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PRODUCT_HAS_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param product The receiving '<em><b>Product</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProductHasMaterialCode(Product product, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRODUCT_HAS_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PRODUCT);
			try {
				VALIDATE_PRODUCT_HAS_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRODUCT_HAS_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRODUCT_HAS_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(product)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE, CCDValidator.PRODUCT__PRODUCT_HAS_MATERIAL_CODE,
					CCDPlugin.INSTANCE.getString("ProductHasMaterialCode"), new Object[] { product }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProductHasMaterialCodeVocab(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Has Material Code Vocab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductHasMaterialCodeVocab(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRODUCT_HAS_MATERIAL_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial.code.codeSystem = '2.16.840.1.113883.6.88' or self.manufacturedMaterial.code.codeSystem='2.16.840.1.113883.6.59' or self.manufacturedMaterial.code.codeSystem='2.16.840.1.113883.6.96'";

	/**
	 * The cached OCL invariant for the '{@link #validateProductHasMaterialCodeVocab(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Has Material Code Vocab</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductHasMaterialCodeVocab(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PRODUCT_HAS_MATERIAL_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param product The receiving '<em><b>Product</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProductHasMaterialCodeVocab(Product product, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRODUCT_HAS_MATERIAL_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PRODUCT);
			try {
				VALIDATE_PRODUCT_HAS_MATERIAL_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRODUCT_HAS_MATERIAL_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRODUCT_HAS_MATERIAL_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			product)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.PRODUCT__PRODUCT_HAS_MATERIAL_CODE_VOCAB,
					CCDPlugin.INSTANCE.getString("ProductHasMaterialCodeVocab"), new Object[] { product }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProductHasMaterialCodeOriginalText(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Has Material Code Original Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductHasMaterialCodeOriginalText(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRODUCT_HAS_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.manufacturedMaterial.code.originalText.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProductHasMaterialCodeOriginalText(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Has Material Code Original Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductHasMaterialCodeOriginalText(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PRODUCT_HAS_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param product The receiving '<em><b>Product</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProductHasMaterialCodeOriginalText(Product product, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRODUCT_HAS_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PRODUCT);
			try {
				VALIDATE_PRODUCT_HAS_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRODUCT_HAS_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRODUCT_HAS_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			product)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.PRODUCT__PRODUCT_HAS_MATERIAL_CODE_ORIGINAL_TEXT,
					CCDPlugin.INSTANCE.getString("ProductHasMaterialCodeOriginalText"), new Object[] { product }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProductHasMaterialName(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Has Material Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductHasMaterialName(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRODUCT_HAS_MATERIAL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.manufacturedMaterial.name.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProductHasMaterialName(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Has Material Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductHasMaterialName(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PRODUCT_HAS_MATERIAL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param product The receiving '<em><b>Product</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProductHasMaterialName(Product product, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRODUCT_HAS_MATERIAL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PRODUCT);
			try {
				VALIDATE_PRODUCT_HAS_MATERIAL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRODUCT_HAS_MATERIAL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRODUCT_HAS_MATERIAL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(product)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, CCDValidator.DIAGNOSTIC_SOURCE, CCDValidator.PRODUCT__PRODUCT_HAS_MATERIAL_NAME,
					CCDPlugin.INSTANCE.getString("ProductHasMaterialName"), new Object[] { product }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProductMayHaveMaterialManufacturer(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product May Have Material Manufacturer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductMayHaveMaterialManufacturer(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRODUCT_MAY_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturerOrganization->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateProductMayHaveMaterialManufacturer(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product May Have Material Manufacturer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductMayHaveMaterialManufacturer(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PRODUCT_MAY_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param product The receiving '<em><b>Product</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProductMayHaveMaterialManufacturer(Product product, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRODUCT_MAY_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PRODUCT);
			try {
				VALIDATE_PRODUCT_MAY_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRODUCT_MAY_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRODUCT_MAY_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			product)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.PRODUCT__PRODUCT_MAY_HAVE_MATERIAL_MANUFACTURER,
					CCDPlugin.INSTANCE.getString("ProductMayHaveMaterialManufacturer"), new Object[] { product }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProductShouldHaveMaterialManufacturer(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Should Have Material Manufacturer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductShouldHaveMaterialManufacturer(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRODUCT_SHOULD_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id->size() > 0 implies self.manufacturerOrganization->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateProductShouldHaveMaterialManufacturer(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Should Have Material Manufacturer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductShouldHaveMaterialManufacturer(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PRODUCT_SHOULD_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param product The receiving '<em><b>Product</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProductShouldHaveMaterialManufacturer(Product product, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRODUCT_SHOULD_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PRODUCT);
			try {
				VALIDATE_PRODUCT_SHOULD_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRODUCT_SHOULD_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRODUCT_SHOULD_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			product)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.PRODUCT__PRODUCT_SHOULD_HAVE_MATERIAL_MANUFACTURER,
					CCDPlugin.INSTANCE.getString("ProductShouldHaveMaterialManufacturer"), new Object[] { product }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProductTemplateId(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductTemplateId(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRODUCT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.53')";

	/**
	 * The cached OCL invariant for the '{@link #validateProductTemplateId(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductTemplateId(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PRODUCT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param product The receiving '<em><b>Product</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProductTemplateId(Product product, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRODUCT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PRODUCT);
			try {
				VALIDATE_PRODUCT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRODUCT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRODUCT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(product)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE, CCDValidator.PRODUCT__PRODUCT_TEMPLATE_ID,
					CCDPlugin.INSTANCE.getString("ProductTemplateId"), new Object[] { product }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProductId(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductId(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRODUCT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateProductId(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductId(Product, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PRODUCT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param product The receiving '<em><b>Product</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProductId(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRODUCT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PRODUCT);
			try {
				VALIDATE_PRODUCT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRODUCT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRODUCT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(product)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, CCDValidator.DIAGNOSTIC_SOURCE, CCDValidator.PRODUCT__PRODUCT_ID,
					CCDPlugin.INSTANCE.getString("ProductId"), new Object[] { product }));
			}

			return false;
		}
		return true;
	}

} // ProductOperations
