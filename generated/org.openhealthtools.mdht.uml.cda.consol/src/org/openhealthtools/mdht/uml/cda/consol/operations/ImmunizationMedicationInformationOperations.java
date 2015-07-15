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
package org.openhealthtools.mdht.uml.cda.consol.operations;

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
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ManufacturedProductOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunization Medication Information</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationManufacturerOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Manufacturer Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationManufacturedMaterial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Manufactured Material</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Lot Number Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImmunizationMedicationInformationOperations extends ManufacturedProductOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationMedicationInformationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationInformationTemplateId(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationTemplateId(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.54')";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationInformationTemplateId(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationTemplateId(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationMedicationInformation The receiving '<em><b>Immunization Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationMedicationInformationTemplateId(
			ImmunizationMedicationInformation immunizationMedicationInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION);
			try {
				VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationMedicationInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_MEDICATION_INFORMATION__IMMUNIZATION_MEDICATION_INFORMATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ImmunizationMedicationInformationImmunizationMedicationInformationTemplateId"),
					new Object[] { immunizationMedicationInformation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationInformationClassCode(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationClassCode(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode') and self.classCode=vocab::RoleClassManufacturedProduct::MANU";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationInformationClassCode(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationClassCode(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationMedicationInformation The receiving '<em><b>Immunization Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationMedicationInformationClassCode(
			ImmunizationMedicationInformation immunizationMedicationInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION);
			try {
				VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationMedicationInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_MEDICATION_INFORMATION__IMMUNIZATION_MEDICATION_INFORMATION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("ImmunizationMedicationInformationImmunizationMedicationInformationClassCode"),
					new Object[] { immunizationMedicationInformation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationInformationId(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationId(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationInformationId(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationId(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationMedicationInformation The receiving '<em><b>Immunization Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationMedicationInformationId(
			ImmunizationMedicationInformation immunizationMedicationInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION);
			try {
				VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationMedicationInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_MEDICATION_INFORMATION__IMMUNIZATION_MEDICATION_INFORMATION_ID,
					ConsolPlugin.INSTANCE.getString("ImmunizationMedicationInformationImmunizationMedicationInformationId"),
					new Object[] { immunizationMedicationInformation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationInformationManufacturerOrganization(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Manufacturer Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationManufacturerOrganization(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturerOrganization->one(manufacturerOrganization : cda::Organization | not manufacturerOrganization.oclIsUndefined() and manufacturerOrganization.oclIsKindOf(rim::Entity))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationInformationManufacturerOrganization(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Manufacturer Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationManufacturerOrganization(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationMedicationInformation The receiving '<em><b>Immunization Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationMedicationInformationManufacturerOrganization(
			ImmunizationMedicationInformation immunizationMedicationInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION);
			try {
				VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationMedicationInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_MEDICATION_INFORMATION__IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURER_ORGANIZATION,
					ConsolPlugin.INSTANCE.getString("ImmunizationMedicationInformationImmunizationMedicationInformationManufacturerOrganization"),
					new Object[] { immunizationMedicationInformation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationInformationManufacturedMaterial(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Manufactured Material</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationManufacturedMaterial(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->one(manufacturedMaterial : cda::Material | not manufacturedMaterial.oclIsUndefined() and manufacturedMaterial.oclIsKindOf(cda::Material))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationInformationManufacturedMaterial(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Manufactured Material</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationManufacturedMaterial(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationMedicationInformation The receiving '<em><b>Immunization Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationMedicationInformationManufacturedMaterial(
			ImmunizationMedicationInformation immunizationMedicationInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION);
			try {
				VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationMedicationInformation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_MEDICATION_INFORMATION__IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL,
					ConsolPlugin.INSTANCE.getString("ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterial"),
					new Object[] { immunizationMedicationInformation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code Original Text</em>}' operation.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->excluding(null)->reject(code.originalText->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code Original Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationMedicationInformation The receiving '<em><b>Immunization Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(
			ImmunizationMedicationInformation immunizationMedicationInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(immunizationMedicationInformation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.IMMUNIZATION_MEDICATION_INFORMATION__IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT,
						ConsolPlugin.INSTANCE.getString("ImmunizationMedicationInformationImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Original Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->excluding(null)->reject(code.originalText->size() = 1 implies code.originalText->one(reference->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Original Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationMedicationInformation The receiving '<em><b>Immunization Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(
			ImmunizationMedicationInformation immunizationMedicationInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(immunizationMedicationInformation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.IMMUNIZATION_MEDICATION_INFORMATION__IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE,
						ConsolPlugin.INSTANCE.getString("ImmunizationMedicationInformationImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->excluding(null)->reject(code.originalText.reference->size() = 1 implies code.originalText.reference.value->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationMedicationInformation The receiving '<em><b>Immunization Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue(
			ImmunizationMedicationInformation immunizationMedicationInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(immunizationMedicationInformation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.IMMUNIZATION_MEDICATION_INFORMATION__IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_TEXT_REFERENCE_VALUE,
						ConsolPlugin.INSTANCE.getString("ImmunizationMedicationInformationImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->excluding(null)->reject(code->size() = 1 implies code.translation->size() > 0)";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code Translation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationMedicationInformation The receiving '<em><b>Immunization Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation(
			ImmunizationMedicationInformation immunizationMedicationInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(immunizationMedicationInformation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.IMMUNIZATION_MEDICATION_INFORMATION__IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION,
						ConsolPlugin.INSTANCE.getString("ImmunizationMedicationInformationImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.12.292' and (value.code = '143' or value.code = '54' or value.code = '55' or value.code = '82' or value.code = '24' or value.code = '19' or value.code = '27' or value.code = '26' or value.code = '29' or value.code = '56' or value.code = '12' or value.code = '28' or value.code = '20' or value.code = '106' or value.code = '107' or value.code = '146' or value.code = '110' or value.code = '50' or value.code = '120' or value.code = '130' or value.code = '132' or value.code = '01' or value.code = '22' or value.code = '102' or value.code = '57' or value.code = '30' or value.code = '52' or value.code = '83' or value.code = '84' or value.code = '31' or value.code = '85' or value.code = '104' or value.code = '08' or value.code = '42' or value.code = '43' or value.code = '44' or value.code = '45' or value.code = '58' or value.code = '59' or value.code = '60' or value.code = '47' or value.code = '46' or value.code = '49' or value.code = '48' or value.code = '17' or value.code = '51' or value.code = '61' or value.code = '118' or value.code = '62' or value.code = '137' or value.code = '86' or value.code = '14' or value.code = '87' or value.code = '123' or value.code = '135' or value.code = '111' or value.code = '149' or value.code = '141' or value.code = '140' or value.code = '144' or value.code = '15' or value.code = '88' or value.code = '16' or value.code = '10' or value.code = '134' or value.code = '39' or value.code = '129' or value.code = '63' or value.code = '64' or value.code = '65' or value.code = '66' or value.code = '04' or value.code = '67' or value.code = '05' or value.code = '68' or value.code = '103' or value.code = '148' or value.code = '147' or value.code = '136' or value.code = '114' or value.code = '32' or value.code = '108' or value.code = '03' or value.code = '94' or value.code = '07' or value.code = '998' or value.code = '127' or value.code = '128' or value.code = '125' or value.code = '126' or value.code = '02' or value.code = '69' or value.code = '11' or value.code = '23' or value.code = '133' or value.code = '100' or value.code = '33' or value.code = '109' or value.code = '89' or value.code = '70' or value.code = '40' or value.code = '18' or value.code = '90' or value.code = '99' or value.code = '72' or value.code = '73' or value.code = '34' or value.code = '119' or value.code = '116' or value.code = '74' or value.code = '122' or value.code = '71' or value.code = '93' or value.code = '145' or value.code = '06' or value.code = '38' or value.code = '76' or value.code = '138' or value.code = '113' or value.code = '09' or value.code = '139' or value.code = '115' or value.code = '35' or value.code = '142' or value.code = '112' or value.code = '77' or value.code = '13' or value.code = '98' or value.code = '95' or value.code = '96' or value.code = '97' or value.code = '78' or value.code = '25' or value.code = '41' or value.code = '53' or value.code = '91' or value.code = '101' or value.code = '131' or value.code = '999' or value.code = '75' or value.code = '105' or value.code = '79' or value.code = '21' or value.code = '81' or value.code = '80' or value.code = '92' or value.code = '36' or value.code = '117' or value.code = '37' or value.code = '121' or value.code = '155')))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationMedicationInformation The receiving '<em><b>Immunization Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode(
			ImmunizationMedicationInformation immunizationMedicationInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(immunizationMedicationInformation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.IMMUNIZATION_MEDICATION_INFORMATION__IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE,
						ConsolPlugin.INSTANCE.getString("ImmunizationMedicationInformationImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Lot Number Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.manufacturedMaterial->excluding(null)->reject((lotNumberText.oclIsUndefined() or lotNumberText.isNullFlavorUndefined()) implies (not lotNumberText.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Lot Number Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText(ImmunizationMedicationInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationMedicationInformation The receiving '<em><b>Immunization Medication Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText(
			ImmunizationMedicationInformation immunizationMedicationInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(immunizationMedicationInformation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.IMMUNIZATION_MEDICATION_INFORMATION__IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_LOT_NUMBER_TEXT,
						ConsolPlugin.INSTANCE.getString("ImmunizationMedicationInformationImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // ImmunizationMedicationInformationOperations
