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
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedures Section Entries Optional</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional#validateProceduresSectionEntriesOptionalHasProcedureActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Has Procedure Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional#validateProceduresSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProceduresSectionEntriesOptionalOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProceduresSectionEntriesOptionalOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresSectionEntriesOptionalHasProcedureActivity(ProceduresSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Has Procedure Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionEntriesOptionalHasProcedureActivity(ProceduresSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entry->select(e | e.act.oclIsKindOf(consol::ProcedureActivity))->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresSectionEntriesOptionalHasProcedureActivity(ProceduresSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Has Procedure Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionEntriesOptionalHasProcedureActivity(ProceduresSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entry->select(e | e.act.oclIsKindOf(consol::ProcedureActivity))->isEmpty()
	 * @param proceduresSectionEntriesOptional The receiving '<em><b>Procedures Section Entries Optional</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProceduresSectionEntriesOptionalHasProcedureActivity(
			ProceduresSectionEntriesOptional proceduresSectionEntriesOptional, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURES_SECTION_ENTRIES_OPTIONAL);
			try {
				VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			proceduresSectionEntriesOptional)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURES_SECTION_ENTRIES_OPTIONAL__PROCEDURES_SECTION_ENTRIES_OPTIONAL_HAS_PROCEDURE_ACTIVITY,
					ConsolPlugin.INSTANCE.getString("ProceduresSectionEntriesOptionalHasProcedureActivity"),
					new Object[] { proceduresSectionEntriesOptional }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresSectionEntriesOptionalTemplateId(ProceduresSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionEntriesOptionalTemplateId(ProceduresSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.7')";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresSectionEntriesOptionalTemplateId(ProceduresSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionEntriesOptionalTemplateId(ProceduresSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.7')
	 * @param proceduresSectionEntriesOptional The receiving '<em><b>Procedures Section Entries Optional</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProceduresSectionEntriesOptionalTemplateId(
			ProceduresSectionEntriesOptional proceduresSectionEntriesOptional, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURES_SECTION_ENTRIES_OPTIONAL);
			try {
				VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			proceduresSectionEntriesOptional)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURES_SECTION_ENTRIES_OPTIONAL__PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ProceduresSectionEntriesOptionalTemplateId"),
					new Object[] { proceduresSectionEntriesOptional }));
			}
			return false;
		}
		return true;
	}

} // ProceduresSectionEntriesOptionalOperations
