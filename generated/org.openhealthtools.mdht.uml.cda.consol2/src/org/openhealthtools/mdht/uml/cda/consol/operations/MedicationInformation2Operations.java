/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Information2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2#validateMedicationInformation2MedicationInformationManufacturedMaterialCETranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information2 Medication Information Manufactured Material CE Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2#validateMedicationInformationMedicationInformationManufacturedMaterialReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2#validateMedicationInformationMedicationInformationManufacturedMaterialCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2#validateMedicationInformationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2#validateMedicationInformationManufacturedMaterial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Manufactured Material</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2#validateMedicationInformationMedicationInformationManufacturedMaterialCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2#validateMedicationInformationMedicationInformationManufacturedMaterialCodeTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Code Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2#validateMedicationInformationMedicationInformationManufacturedMaterialReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2#validateMedicationInformationMedicationInformationManufacturedMaterialOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2#validateMedicationInformationMedicationInformationManufacturedMaterialCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationInformation2Operations extends MedicationInformationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationInformation2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformation2MedicationInformationManufacturedMaterialCETranslation(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information2 Medication Information Manufactured Material CE Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformation2MedicationInformationManufacturedMaterialCETranslation(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION2_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->excluding(null).code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (not translation->isEmpty()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformation2MedicationInformationManufacturedMaterialCETranslation(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information2 Medication Information Manufactured Material CE Translation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformation2MedicationInformationManufacturedMaterialCETranslation(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MEDICATION_INFORMATION2_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationInformation2 The receiving '<em><b>Medication Information2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationInformation2MedicationInformationManufacturedMaterialCETranslation(
			MedicationInformation2 medicationInformation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_INFORMATION2_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_INFORMATION2_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_INFORMATION2_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_INFORMATION2_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationInformation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_INFORMATION2__MEDICATION_INFORMATION2_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION,
						ConsolPlugin.INSTANCE.getString("MedicationInformation2MedicationInformation2MedicationInformationManufacturedMaterialCETranslation"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationMedicationInformationManufacturedMaterialReferenceValue(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationMedicationInformationManufacturedMaterialReferenceValue(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->excluding(null)->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationMedicationInformationManufacturedMaterialReferenceValue(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationMedicationInformationManufacturedMaterialReferenceValue(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationInformation2 The receiving '<em><b>Medication Information2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationInformationMedicationInformationManufacturedMaterialReferenceValue(
			MedicationInformation2 medicationInformation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationInformation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_INFORMATION2__MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString("MedicationInformation2MedicationInformationMedicationInformationManufacturedMaterialReferenceValue"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationInformation2 The receiving '<em><b>Medication Information2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationInformationMedicationInformationManufacturedMaterialCodeP(
			MedicationInformation2 medicationInformation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationInformation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_INFORMATION2__MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_P,
						ConsolPlugin.INSTANCE.getString("MedicationInformation2MedicationInformationMedicationInformationManufacturedMaterialCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.MedicationInformationMedicationInformationManufacturedMaterialCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.MedicationInformationMedicationInformationManufacturedMaterialCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationInformation2 The receiving '<em><b>Medication Information2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationInformationTemplateId(MedicationInformation2 medicationInformation2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION2);
			try {
				VALIDATE_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationInformation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_INFORMATION2__MEDICATION_INFORMATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("MedicationInformation2MedicationInformationTemplateId"),
					new Object[] { medicationInformation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationInformation2 The receiving '<em><b>Medication Information2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationInformationManufacturedMaterial(
			MedicationInformation2 medicationInformation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION2);
			try {
				VALIDATE_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationInformation2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_INFORMATION2__MEDICATION_INFORMATION_MANUFACTURED_MATERIAL,
					ConsolPlugin.INSTANCE.getString("MedicationInformation2MedicationInformationManufacturedMaterial"),
					new Object[] { medicationInformation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationInformation2 The receiving '<em><b>Medication Information2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationInformationMedicationInformationManufacturedMaterialCodeOriginalText(
			MedicationInformation2 medicationInformation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationInformation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_INFORMATION2__MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT,
						ConsolPlugin.INSTANCE.getString("MedicationInformation2MedicationInformationMedicationInformationManufacturedMaterialCodeOriginalText"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationInformation2 The receiving '<em><b>Medication Information2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationInformationMedicationInformationManufacturedMaterialCodeTranslation(
			MedicationInformation2 medicationInformation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationInformation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_INFORMATION2__MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION,
						ConsolPlugin.INSTANCE.getString("MedicationInformation2MedicationInformationMedicationInformationManufacturedMaterialCodeTranslation"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationInformation2 The receiving '<em><b>Medication Information2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationInformationMedicationInformationManufacturedMaterialReference(
			MedicationInformation2 medicationInformation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationInformation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_INFORMATION2__MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_REFERENCE,
						ConsolPlugin.INSTANCE.getString("MedicationInformation2MedicationInformationMedicationInformationManufacturedMaterialReference"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationMedicationInformationManufacturedMaterialCodeP(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationMedicationInformationManufacturedMaterialCodeP(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationMedicationInformationManufacturedMaterialCodeP(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationMedicationInformationManufacturedMaterialCodeP(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationTemplateId(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationTemplateId(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.23' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationTemplateId(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationTemplateId(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationManufacturedMaterial(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Manufactured Material</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationManufacturedMaterial(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->one(manufacturedMaterial : cda::Material | not manufacturedMaterial.oclIsUndefined() and manufacturedMaterial.oclIsKindOf(cda::Material))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationManufacturedMaterial(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Manufactured Material</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationManufacturedMaterial(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationMedicationInformationManufacturedMaterialCodeOriginalText(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Code Original Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationMedicationInformationManufacturedMaterialCodeOriginalText(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->excluding(null)->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationMedicationInformationManufacturedMaterialCodeOriginalText(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Code Original Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationMedicationInformationManufacturedMaterialCodeOriginalText(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationMedicationInformationManufacturedMaterialCodeTranslation(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Code Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationMedicationInformationManufacturedMaterialCodeTranslation(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->excluding(null)->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationMedicationInformationManufacturedMaterialCodeTranslation(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Code Translation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationMedicationInformationManufacturedMaterialCodeTranslation(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationMedicationInformationManufacturedMaterialReference(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationMedicationInformationManufacturedMaterialReference(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->excluding(null)->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationMedicationInformationManufacturedMaterialReference(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationMedicationInformationManufacturedMaterialReference(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationMedicationInformationManufacturedMaterialOriginalTextReferenceValue(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Original Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationMedicationInformationManufacturedMaterialOriginalTextReferenceValue(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->excluding(null)->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationMedicationInformationManufacturedMaterialOriginalTextReferenceValue(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Original Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationMedicationInformationManufacturedMaterialOriginalTextReferenceValue(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationInformation2 The receiving '<em><b>Medication Information2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationInformationMedicationInformationManufacturedMaterialOriginalTextReferenceValue(
			MedicationInformation2 medicationInformation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationInformation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_INFORMATION2__MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString("MedicationInformation2MedicationInformationMedicationInformationManufacturedMaterialOriginalTextReferenceValue"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationMedicationInformationManufacturedMaterialCode(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationMedicationInformationManufacturedMaterialCode(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.88' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationMedicationInformationManufacturedMaterialCode(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationMedicationInformationManufacturedMaterialCode(MedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicationInformation2 The receiving '<em><b>Medication Information2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMedicationInformationMedicationInformationManufacturedMaterialCode(
			MedicationInformation2 medicationInformation2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationInformation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.MedicationInformationMedicationInformationManufacturedMaterialCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICATION_INFORMATION2__MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE,
						ConsolPlugin.INSTANCE.getString("MedicationInformation2MedicationInformationMedicationInformationManufacturedMaterialCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // MedicationInformation2Operations
