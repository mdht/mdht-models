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
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunizations Section Entries Optional</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional#validateImmunizationsSectionEntriesOptionalHasMedicationOrSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Has Medication Or Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional#validateImmunizationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImmunizationsSectionEntriesOptionalOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationsSectionEntriesOptionalOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationsSectionEntriesOptionalHasMedicationOrSupplyActivity(ImmunizationsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Has Medication Or Supply Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionEntriesOptionalHasMedicationOrSupplyActivity(ImmunizationsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_HAS_MEDICATION_OR_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSubstanceAdministrations()->exists(activity : cda::SubstanceAdministration | activity.oclIsKindOf(consol::MedicationActivity))"
			+ "   or self.getSupplies()->exists(activity : cda::Supply | activity.oclIsKindOf(consol::SupplyActivity))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationsSectionEntriesOptionalHasMedicationOrSupplyActivity(ImmunizationsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Has Medication Or Supply Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionEntriesOptionalHasMedicationOrSupplyActivity(ImmunizationsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_HAS_MEDICATION_OR_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->exists(activity : cda::SubstanceAdministration | activity.oclIsKindOf(consol::MedicationActivity))
	 *    or self.getSupplies()->exists(activity : cda::Supply | activity.oclIsKindOf(consol::SupplyActivity))
	 * @param immunizationsSectionEntriesOptional The receiving '<em><b>Immunizations Section Entries Optional</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationsSectionEntriesOptionalHasMedicationOrSupplyActivity(
			ImmunizationsSectionEntriesOptional immunizationsSectionEntriesOptional, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_HAS_MEDICATION_OR_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL);
			try {
				VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_HAS_MEDICATION_OR_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_HAS_MEDICATION_OR_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_HAS_MEDICATION_OR_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationsSectionEntriesOptional)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_HAS_MEDICATION_OR_SUPPLY_ACTIVITY,
					ConsolPlugin.INSTANCE.getString("ImmunizationsSectionEntriesOptionalHasMedicationOrSupplyActivity"),
					new Object[] { immunizationsSectionEntriesOptional }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationsSectionEntriesOptionalTemplateId(ImmunizationsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionEntriesOptionalTemplateId(ImmunizationsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationsSectionEntriesOptionalTemplateId(ImmunizationsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionEntriesOptionalTemplateId(ImmunizationsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.2')
	 * @param immunizationsSectionEntriesOptional The receiving '<em><b>Immunizations Section Entries Optional</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationsSectionEntriesOptionalTemplateId(
			ImmunizationsSectionEntriesOptional immunizationsSectionEntriesOptional, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL);
			try {
				VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationsSectionEntriesOptional)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ImmunizationsSectionEntriesOptionalTemplateId"),
					new Object[] { immunizationsSectionEntriesOptional }));
			}
			return false;
		}
		return true;
	}

} // ImmunizationsSectionEntriesOptionalOperations
