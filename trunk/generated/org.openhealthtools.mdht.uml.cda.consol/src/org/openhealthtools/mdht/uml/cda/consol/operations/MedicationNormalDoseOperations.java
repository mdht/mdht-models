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
import org.openhealthtools.mdht.uml.cda.consol.MedicationNormalDose;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Normal Dose</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationNormalDose#validateMedicationNormalDoseNoSubordinateSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Normal Dose No Subordinate Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationNormalDose#validateMedicationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationNormalDoseOperations extends MedicationActivityOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationNormalDoseOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationNormalDoseNoSubordinateSubstanceAdministration(MedicationNormalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Normal Dose No Subordinate Substance Administration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationNormalDoseNoSubordinateSubstanceAdministration(MedicationNormalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_NORMAL_DOSE_NO_SUBORDINATE_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship.substanceAdministration->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationNormalDoseNoSubordinateSubstanceAdministration(MedicationNormalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Normal Dose No Subordinate Substance Administration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationNormalDoseNoSubordinateSubstanceAdministration(MedicationNormalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_NORMAL_DOSE_NO_SUBORDINATE_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.substanceAdministration->isEmpty()
	 * @param medicationNormalDose The receiving '<em><b>Medication Normal Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationNormalDoseNoSubordinateSubstanceAdministration(MedicationNormalDose medicationNormalDose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_NORMAL_DOSE_NO_SUBORDINATE_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_NORMAL_DOSE);
			try {
				VALIDATE_MEDICATION_NORMAL_DOSE_NO_SUBORDINATE_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_NORMAL_DOSE_NO_SUBORDINATE_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_NORMAL_DOSE_NO_SUBORDINATE_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationNormalDose)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_NORMAL_DOSE__MEDICATION_NORMAL_DOSE_NO_SUBORDINATE_SUBSTANCE_ADMINISTRATION,
						 ConsolPlugin.INSTANCE.getString("MedicationNormalDoseNoSubordinateSubstanceAdministration"),
						 new Object [] { medicationNormalDose }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityTemplateId(MedicationNormalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTemplateId(MedicationNormalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.8')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityTemplateId(MedicationNormalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTemplateId(MedicationNormalDose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.8')
	 * @param medicationNormalDose The receiving '<em><b>Medication Normal Dose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationActivityTemplateId(MedicationNormalDose medicationNormalDose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATION_NORMAL_DOSE);
			try {
				VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationNormalDose)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATION_NORMAL_DOSE__MEDICATION_ACTIVITY_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicationActivityTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicationNormalDose, context) }),
						 new Object [] { medicationNormalDose }));
			}
			return false;
		}
		return true;
	}

} // MedicationNormalDoseOperations