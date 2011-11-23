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
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Signs Section Entries Optional</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional#validateVitalSignsSectionEntriesOptionalVitalSignEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Entries Optional Vital Sign Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional#validateVitalSignsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VitalSignsSectionEntriesOptionalOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VitalSignsSectionEntriesOptionalOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsSectionEntriesOptionalVitalSignEntry(VitalSignsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Entries Optional Vital Sign Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionEntriesOptionalVitalSignEntry(VitalSignsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_VITAL_SIGN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | entry.organizer.oclIsKindOf(consol::VitalSignsOrganizer) and entry.organizer.component.observation->exists(obs : cda::Observation | obs.oclIsKindOf(consol::VitalSign)))";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsSectionEntriesOptionalVitalSignEntry(VitalSignsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Entries Optional Vital Sign Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionEntriesOptionalVitalSignEntry(VitalSignsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_VITAL_SIGN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | entry.organizer.oclIsKindOf(consol::VitalSignsOrganizer) and entry.organizer.component.observation->exists(obs : cda::Observation | obs.oclIsKindOf(consol::VitalSign)))
	 * @param vitalSignsSectionEntriesOptional The receiving '<em><b>Vital Signs Section Entries Optional</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignsSectionEntriesOptionalVitalSignEntry(VitalSignsSectionEntriesOptional vitalSignsSectionEntriesOptional, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_VITAL_SIGN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL);
			try {
				VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_VITAL_SIGN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_VITAL_SIGN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_VITAL_SIGN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsSectionEntriesOptional)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_VITAL_SIGN_ENTRY,
						 ConsolPlugin.INSTANCE.getString("VitalSignsSectionEntriesOptionalVitalSignEntry"),
						 new Object [] { vitalSignsSectionEntriesOptional }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsSectionEntriesOptionalTemplateId(VitalSignsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionEntriesOptionalTemplateId(VitalSignsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsSectionEntriesOptionalTemplateId(VitalSignsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionEntriesOptionalTemplateId(VitalSignsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.4')
	 * @param vitalSignsSectionEntriesOptional The receiving '<em><b>Vital Signs Section Entries Optional</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignsSectionEntriesOptionalTemplateId(VitalSignsSectionEntriesOptional vitalSignsSectionEntriesOptional, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL);
			try {
				VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsSectionEntriesOptional)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("VitalSignsSectionEntriesOptionalTemplateId"),
						 new Object [] { vitalSignsSectionEntriesOptional }));
			}
			return false;
		}
		return true;
	}

} // VitalSignsSectionEntriesOptionalOperations