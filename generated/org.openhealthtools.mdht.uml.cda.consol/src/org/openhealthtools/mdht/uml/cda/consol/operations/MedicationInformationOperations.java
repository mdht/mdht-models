/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.MedicationInformation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ManufacturedProductOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Information</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationHasMaterial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Has Material</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationHasMaterialCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Has Material Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationHasMaterialCodeVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Has Material Code Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationHasMaterialCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Has Material Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationHasMaterialName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Has Material Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationMayHaveMaterialManufacturer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information May Have Material Manufacturer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationShouldHaveMaterialManufacturer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Should Have Material Manufacturer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationCodedProductName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Product Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationCodedProductVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Product Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationCodedIngredientVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Ingredient Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationCodedBrandName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Brand Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationCodedBrandNameVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Brand Name Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationFreeTextProductName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Free Text Product Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationFreeTextBrandName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Free Text Brand Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationInformationOperations extends ManufacturedProductOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationInformationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationHasMaterial(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Has Material</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationHasMaterial(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.manufacturedMaterial.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationHasMaterial(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Has Material</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationHasMaterial(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.manufacturedMaterial.oclIsUndefined()
	 * @param medicationInformation The receiving '<em><b>Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationInformationHasMaterial(MedicationInformation medicationInformation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION);
			try {
				VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_HAS_MATERIAL,
					ConsolPlugin.INSTANCE.getString("MedicationInformationHasMaterial"),
					new Object[] { medicationInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationHasMaterialCode(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Has Material Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationHasMaterialCode(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.manufacturedMaterial.code.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationHasMaterialCode(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Has Material Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationHasMaterialCode(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.manufacturedMaterial.code.oclIsUndefined()
	 * @param medicationInformation The receiving '<em><b>Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationInformationHasMaterialCode(MedicationInformation medicationInformation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION);
			try {
				VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_HAS_MATERIAL_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationInformationHasMaterialCode"),
					new Object[] { medicationInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationHasMaterialCodeVocab(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Has Material Code Vocab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationHasMaterialCodeVocab(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial.code.codeSystem = '2.16.840.1.113883.6.88' or self.manufacturedMaterial.code.codeSystem='2.16.840.1.113883.6.59' or self.manufacturedMaterial.code.codeSystem='2.16.840.1.113883.6.96'";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationHasMaterialCodeVocab(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Has Material Code Vocab</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationHasMaterialCodeVocab(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.manufacturedMaterial.code.codeSystem = '2.16.840.1.113883.6.88' or self.manufacturedMaterial.code.codeSystem='2.16.840.1.113883.6.59' or self.manufacturedMaterial.code.codeSystem='2.16.840.1.113883.6.96'
	 * @param medicationInformation The receiving '<em><b>Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationInformationHasMaterialCodeVocab(
			MedicationInformation medicationInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION);
			try {
				VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_HAS_MATERIAL_CODE_VOCAB,
					ConsolPlugin.INSTANCE.getString("MedicationInformationHasMaterialCodeVocab"),
					new Object[] { medicationInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationHasMaterialCodeOriginalText(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Has Material Code Original Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationHasMaterialCodeOriginalText(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.manufacturedMaterial.code.originalText.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationHasMaterialCodeOriginalText(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Has Material Code Original Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationHasMaterialCodeOriginalText(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static boolean validateMedicationInformationHasMaterialCodeOriginalText(
			MedicationInformation medicationInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION);
			try {
				VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_HAS_MATERIAL_CODE_ORIGINAL_TEXT,
					ConsolPlugin.INSTANCE.getString("MedicationInformationHasMaterialCodeOriginalText"),
					new Object[] { medicationInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationHasMaterialName(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Has Material Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationHasMaterialName(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.manufacturedMaterial.name.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationHasMaterialName(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Has Material Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationHasMaterialName(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static boolean validateMedicationInformationHasMaterialName(MedicationInformation medicationInformation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION);
			try {
				VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_HAS_MATERIAL_NAME,
					ConsolPlugin.INSTANCE.getString("MedicationInformationHasMaterialName"),
					new Object[] { medicationInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationMayHaveMaterialManufacturer(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information May Have Material Manufacturer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationMayHaveMaterialManufacturer(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_MAY_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturerOrganization->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationMayHaveMaterialManufacturer(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information May Have Material Manufacturer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationMayHaveMaterialManufacturer(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_INFORMATION_MAY_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.manufacturerOrganization->size() = 1
	 * @param medicationInformation The receiving '<em><b>Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationInformationMayHaveMaterialManufacturer(
			MedicationInformation medicationInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_INFORMATION_MAY_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION);
			try {
				VALIDATE_MEDICATION_INFORMATION_MAY_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_INFORMATION_MAY_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_INFORMATION_MAY_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_MAY_HAVE_MATERIAL_MANUFACTURER,
					ConsolPlugin.INSTANCE.getString("MedicationInformationMayHaveMaterialManufacturer"),
					new Object[] { medicationInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationShouldHaveMaterialManufacturer(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Should Have Material Manufacturer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationShouldHaveMaterialManufacturer(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_SHOULD_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id->size() > 0 implies self.manufacturerOrganization->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationShouldHaveMaterialManufacturer(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Should Have Material Manufacturer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationShouldHaveMaterialManufacturer(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_INFORMATION_SHOULD_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id->size() > 0 implies self.manufacturerOrganization->size() > 0
	 * @param medicationInformation The receiving '<em><b>Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationInformationShouldHaveMaterialManufacturer(
			MedicationInformation medicationInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_INFORMATION_SHOULD_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION);
			try {
				VALIDATE_MEDICATION_INFORMATION_SHOULD_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_INFORMATION_SHOULD_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_INFORMATION_SHOULD_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_SHOULD_HAVE_MATERIAL_MANUFACTURER,
					ConsolPlugin.INSTANCE.getString("MedicationInformationShouldHaveMaterialManufacturer"),
					new Object[] { medicationInformation }));
			}
			return false;
		}
		return true;
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
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION);
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
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_CODED_PRODUCT_NAME,
					ConsolPlugin.INSTANCE.getString("MedicationInformationCodedProductName"),
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
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION);
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
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_CODED_PRODUCT_VOCAB,
					ConsolPlugin.INSTANCE.getString("MedicationInformationCodedProductVocab"),
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
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION);
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
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_CODED_INGREDIENT_VOCAB,
					ConsolPlugin.INSTANCE.getString("MedicationInformationCodedIngredientVocab"),
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
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION);
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
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_CODED_BRAND_NAME,
					ConsolPlugin.INSTANCE.getString("MedicationInformationCodedBrandName"),
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
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION);
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
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_CODED_BRAND_NAME_VOCAB,
					ConsolPlugin.INSTANCE.getString("MedicationInformationCodedBrandNameVocab"),
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
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION);
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
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_FREE_TEXT_PRODUCT_NAME,
					ConsolPlugin.INSTANCE.getString("MedicationInformationFreeTextProductName"),
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
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION);
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
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_FREE_TEXT_BRAND_NAME,
					ConsolPlugin.INSTANCE.getString("MedicationInformationFreeTextBrandName"),
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
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION);
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
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("MedicationInformationTemplateId"),
					new Object[] { medicationInformation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationId(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationId(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationId(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationId(MedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_INFORMATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param medicationInformation The receiving '<em><b>Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationInformationId(MedicationInformation medicationInformation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_INFORMATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION);
			try {
				VALIDATE_MEDICATION_INFORMATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_INFORMATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_INFORMATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_INFORMATION__MEDICATION_INFORMATION_ID,
					ConsolPlugin.INSTANCE.getString("MedicationInformationId"), new Object[] { medicationInformation }));
			}
			return false;
		}
		return true;
	}

} // MedicationInformationOperations
