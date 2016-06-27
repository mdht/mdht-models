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
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunization Medication Information2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information2 Immunization Medication Information Manufactured Material CE Translation P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information2 Immunization Medication Information Manufactured Material CE Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformationManufacturedMaterial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Manufactured Material</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Lot Number Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImmunizationMedicationInformation2Operations extends ImmunizationMedicationInformationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationMedicationInformation2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationP(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information2 Immunization Medication Information Manufactured Material CE Translation P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationP(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION2_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->excluding(null).code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (not translation->isEmpty()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationP(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information2 Immunization Medication Information Manufactured Material CE Translation P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationP(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION2_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationMedicationInformation2 The receiving '<em><b>Immunization Medication Information2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationP(
			ImmunizationMedicationInformation2 immunizationMedicationInformation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION2_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION2_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION2_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION2_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			immunizationMedicationInformation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.IMMUNIZATION_MEDICATION_INFORMATION2__IMMUNIZATION_MEDICATION_INFORMATION2_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION_P,
							ConsolPlugin.INSTANCE.getString(
								"ImmunizationMedicationInformation2ImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationP"),
							new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get(
						"org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationP",
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
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslation(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information2 Immunization Medication Information Manufactured Material CE Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslation(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION2_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->excluding(null).code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (translation->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined())) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslation(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information2 Immunization Medication Information Manufactured Material CE Translation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslation(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION2_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationMedicationInformation2 The receiving '<em><b>Immunization Medication Information2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslation(
			ImmunizationMedicationInformation2 immunizationMedicationInformation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION2_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION2_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION2_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION2_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			immunizationMedicationInformation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get(
						"org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.IMMUNIZATION_MEDICATION_INFORMATION2__IMMUNIZATION_MEDICATION_INFORMATION2_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION,
							ConsolPlugin.INSTANCE.getString(
								"ImmunizationMedicationInformation2ImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslation"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceValue(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Original Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceValue(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->excluding(null)->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceValue(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Original Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceValue(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationMedicationInformation2 The receiving '<em><b>Immunization Medication Information2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceValue(
			ImmunizationMedicationInformation2 immunizationMedicationInformation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			immunizationMedicationInformation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.IMMUNIZATION_MEDICATION_INFORMATION2__IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE_VALUE,
							ConsolPlugin.INSTANCE.getString(
								"ImmunizationMedicationInformation2ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceValue"),
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
	 * @param immunizationMedicationInformation2 The receiving '<em><b>Immunization Medication Information2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeP(
			ImmunizationMedicationInformation2 immunizationMedicationInformation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			immunizationMedicationInformation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.IMMUNIZATION_MEDICATION_INFORMATION2__IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_P,
							ConsolPlugin.INSTANCE.getString(
								"ImmunizationMedicationInformation2ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeP"),
							new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get(
						"org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeP",
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
	 * @param immunizationMedicationInformation2 The receiving '<em><b>Immunization Medication Information2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationMedicationInformationTemplateId(
			ImmunizationMedicationInformation2 immunizationMedicationInformation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION2);
			try {
				VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				immunizationMedicationInformation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.IMMUNIZATION_MEDICATION_INFORMATION2__IMMUNIZATION_MEDICATION_INFORMATION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"ImmunizationMedicationInformation2ImmunizationMedicationInformationTemplateId"),
						new Object[] { immunizationMedicationInformation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationMedicationInformation2 The receiving '<em><b>Immunization Medication Information2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationMedicationInformationManufacturedMaterial(
			ImmunizationMedicationInformation2 immunizationMedicationInformation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION2);
			try {
				VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				immunizationMedicationInformation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.IMMUNIZATION_MEDICATION_INFORMATION2__IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL,
						ConsolPlugin.INSTANCE.getString(
							"ImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterial"),
						new Object[] { immunizationMedicationInformation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationMedicationInformation2 The receiving '<em><b>Immunization Medication Information2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(
			ImmunizationMedicationInformation2 immunizationMedicationInformation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			immunizationMedicationInformation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.IMMUNIZATION_MEDICATION_INFORMATION2__IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT,
							ConsolPlugin.INSTANCE.getString(
								"ImmunizationMedicationInformation2ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText"),
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
	 * @param immunizationMedicationInformation2 The receiving '<em><b>Immunization Medication Information2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(
			ImmunizationMedicationInformation2 immunizationMedicationInformation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			immunizationMedicationInformation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.IMMUNIZATION_MEDICATION_INFORMATION2__IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE,
							ConsolPlugin.INSTANCE.getString(
								"ImmunizationMedicationInformation2ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference"),
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
	 * @param immunizationMedicationInformation2 The receiving '<em><b>Immunization Medication Information2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue(
			ImmunizationMedicationInformation2 immunizationMedicationInformation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			immunizationMedicationInformation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.IMMUNIZATION_MEDICATION_INFORMATION2__IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_TEXT_REFERENCE_VALUE,
							ConsolPlugin.INSTANCE.getString(
								"ImmunizationMedicationInformation2ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeP(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeP(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeP(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeP(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationInformationTemplateId(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationTemplateId(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.54' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationInformationTemplateId(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationTemplateId(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationInformationManufacturedMaterial(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Manufactured Material</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationManufacturedMaterial(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->one(manufacturedMaterial : cda::Material | not manufacturedMaterial.oclIsUndefined() and manufacturedMaterial.oclIsKindOf(cda::Material))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationInformationManufacturedMaterial(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Manufactured Material</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationManufacturedMaterial(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code Original Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->excluding(null)->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code Original Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Original Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->excluding(null)->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Original Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->excluding(null)->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->excluding(null)->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code Translation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationMedicationInformation2 The receiving '<em><b>Immunization Medication Information2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation(
			ImmunizationMedicationInformation2 immunizationMedicationInformation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			immunizationMedicationInformation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.IMMUNIZATION_MEDICATION_INFORMATION2__IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION,
							ConsolPlugin.INSTANCE.getString(
								"ImmunizationMedicationInformation2ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = code.oclAsType(datatypes::CE) in " + "not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationMedicationInformation2 The receiving '<em><b>Immunization Medication Information2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode(
			ImmunizationMedicationInformation2 immunizationMedicationInformation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			immunizationMedicationInformation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get(
						"org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.IMMUNIZATION_MEDICATION_INFORMATION2__IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE,
							ConsolPlugin.INSTANCE.getString(
								"ImmunizationMedicationInformation2ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Lot Number Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->excluding(null)->reject((lotNumberText.oclIsUndefined() or lotNumberText.isNullFlavorUndefined()) implies (not lotNumberText.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Lot Number Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText(ImmunizationMedicationInformation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationMedicationInformation2 The receiving '<em><b>Immunization Medication Information2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText(
			ImmunizationMedicationInformation2 immunizationMedicationInformation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			immunizationMedicationInformation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.IMMUNIZATION_MEDICATION_INFORMATION2__IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_LOT_NUMBER_TEXT,
							ConsolPlugin.INSTANCE.getString(
								"ImmunizationMedicationInformation2ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // ImmunizationMedicationInformation2Operations
