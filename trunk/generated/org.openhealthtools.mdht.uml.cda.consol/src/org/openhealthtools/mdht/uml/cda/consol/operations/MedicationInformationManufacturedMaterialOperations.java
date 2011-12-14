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
import org.openhealthtools.mdht.uml.cda.consol.MedicationInformationManufacturedMaterial;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.MaterialOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Information Manufactured Material</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformationManufacturedMaterial#validateMedicationInformationManufacturedMaterialCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Manufactured Material Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationInformationManufacturedMaterialOperations extends MaterialOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationInformationManufacturedMaterialOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationInformationManufacturedMaterialCode(MedicationInformationManufacturedMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Manufactured Material Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationManufacturedMaterialCode(MedicationInformationManufacturedMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("
			+ "value.codeSystem = '2.16.840.1.113883.6.88' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationInformationManufacturedMaterialCode(MedicationInformationManufacturedMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Manufactured Material Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationInformationManufacturedMaterialCode(MedicationInformationManufacturedMaterial, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.6.88' and not value.code.oclIsUndefined()))
	 * @param medicationInformationManufacturedMaterial The receiving '<em><b>Medication Information Manufactured Material</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicationInformationManufacturedMaterialCode(
			MedicationInformationManufacturedMaterial medicationInformationManufacturedMaterial,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_INFORMATION_MANUFACTURED_MATERIAL);
			try {
				VALIDATE_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			medicationInformationManufacturedMaterial)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.MEDICATION_INFORMATION_MANUFACTURED_MATERIAL__MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE,
					ConsolPlugin.INSTANCE.getString("MedicationInformationManufacturedMaterialCode"),
					new Object[] { medicationInformationManufacturedMaterial }));
			}
			return false;
		}
		return true;
	}

} // MedicationInformationManufacturedMaterialOperations
