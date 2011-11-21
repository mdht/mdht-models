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
import org.openhealthtools.mdht.uml.cda.consol.MedicationTaperedDose;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Tapered Dose</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationTaperedDose#validateMedicationTaperedDoseTaperedDosingSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Tapered Dose Tapered Dosing Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationTaperedDose#validateMedicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationTaperedDoseOperations extends MedicationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationTaperedDoseOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationTaperedDoseTaperedDosingSubstanceAdministration(MedicationTaperedDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Tapered Dose Tapered Dosing Substance Administration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationTaperedDoseTaperedDosingSubstanceAdministration(MedicationTaperedDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_TAPERED_DOSE_TAPERED_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship.substanceAdministration->exists( substanceAdministration  | substanceAdministration.oclIsKindOf( ihe::Medication) )";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationTaperedDoseTaperedDosingSubstanceAdministration(MedicationTaperedDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Tapered Dose Tapered Dosing Substance Administration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationTaperedDoseTaperedDosingSubstanceAdministration(MedicationTaperedDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_TAPERED_DOSE_TAPERED_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.substanceAdministration->exists( substanceAdministration  | substanceAdministration.oclIsKindOf( ihe::Medication) )
	 * @param medicationTaperedDose The receiving '<em><b>Medication Tapered Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationTaperedDoseTaperedDosingSubstanceAdministration(MedicationTaperedDose medicationTaperedDose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_TAPERED_DOSE_TAPERED_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_TAPERED_DOSE);
			try {
				VALIDATE_MEDICATION_TAPERED_DOSE_TAPERED_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_TAPERED_DOSE_TAPERED_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_TAPERED_DOSE_TAPERED_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationTaperedDose)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_TAPERED_DOSE__MEDICATION_TAPERED_DOSE_TAPERED_DOSING_SUBSTANCE_ADMINISTRATION,
						 ConsolPlugin.INSTANCE.getString("MedicationTaperedDoseTaperedDosingSubstanceAdministration"),
						 new Object [] { medicationTaperedDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationTemplateId(MedicationTaperedDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationTemplateId(MedicationTaperedDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = 'null')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationTemplateId(MedicationTaperedDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationTemplateId(MedicationTaperedDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = 'null')
	 * @param medicationTaperedDose The receiving '<em><b>Medication Tapered Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationTemplateId(MedicationTaperedDose medicationTaperedDose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_TAPERED_DOSE);
			try {
				VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationTaperedDose)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_TAPERED_DOSE__MEDICATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicationTaperedDose, context) }),
						 new Object [] { medicationTaperedDose }));
			}
			return false;
		}
		return true;
	}

} // MedicationTaperedDoseOperations