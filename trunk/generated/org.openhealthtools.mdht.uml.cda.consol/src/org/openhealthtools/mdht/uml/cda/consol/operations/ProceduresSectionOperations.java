/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ExternalReference;
import org.openhealthtools.mdht.uml.cda.consol.Procedure;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedures Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionHasProcedureActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Has Procedure Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionProcedureActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Procedure Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionExternalReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section External Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionProcedureEntryProcedureActivityProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Procedure Entry Procedure Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#getnullProcedureActivities() <em>Getnull Procedure Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#getnullExternalReference() <em>Getnull External Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#getnullProcedureEntryProcedureActivityProcedures() <em>Getnull Procedure Entry Procedure Activity Procedures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProceduresSectionOperations extends ProceduresSectionEntriesOptionalOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProceduresSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresSectionHasProcedureActivity(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Has Procedure Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionHasProcedureActivity(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entry->select(e | e.act.oclIsKindOf(ccd::ProcedureActivity))->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresSectionHasProcedureActivity(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Has Procedure Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionHasProcedureActivity(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURES_SECTION_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entry->select(e | e.act.oclIsKindOf(ccd::ProcedureActivity))->isEmpty()
	 * @param proceduresSection The receiving '<em><b>Procedures Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProceduresSectionHasProcedureActivity(ProceduresSection proceduresSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURES_SECTION_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURES_SECTION);
			try {
				VALIDATE_PROCEDURES_SECTION_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURES_SECTION_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURES_SECTION_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(proceduresSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURES_SECTION__PROCEDURES_SECTION_HAS_PROCEDURE_ACTIVITY,
						 ConsolPlugin.INSTANCE.getString("ProceduresSectionHasProcedureActivity"),
						 new Object [] { proceduresSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresSectionEntriesOptionalCode(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionEntriesOptionalCode(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '47519-4' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresSectionEntriesOptionalCode(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionEntriesOptionalCode(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '47519-4' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param proceduresSection The receiving '<em><b>Procedures Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProceduresSectionEntriesOptionalCode(ProceduresSection proceduresSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURES_SECTION);
			try {
				VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(proceduresSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURES_SECTION__PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE,
						 ConsolPlugin.INSTANCE.getString("ProceduresSectionEntriesOptionalCode"),
						 new Object [] { proceduresSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresSectionTitle(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionTitle(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresSectionTitle(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionTitle(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param proceduresSection The receiving '<em><b>Procedures Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProceduresSectionTitle(ProceduresSection proceduresSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURES_SECTION);
			try {
				VALIDATE_PROCEDURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(proceduresSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURES_SECTION__PROCEDURES_SECTION_TITLE,
						 ConsolPlugin.INSTANCE.getString("ProceduresSectionTitle"),
						 new Object [] { proceduresSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresSectionText(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionText(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresSectionText(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionText(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param proceduresSection The receiving '<em><b>Procedures Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProceduresSectionText(ProceduresSection proceduresSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURES_SECTION);
			try {
				VALIDATE_PROCEDURES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(proceduresSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURES_SECTION__PROCEDURES_SECTION_TEXT,
						 ConsolPlugin.INSTANCE.getString("ProceduresSectionText"),
						 new Object [] { proceduresSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresSectionProcedureActivity(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Procedure Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionProcedureActivity(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(consol::Procedure))";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresSectionProcedureActivity(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Procedure Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionProcedureActivity(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURES_SECTION_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(consol::Procedure))
	 * @param proceduresSection The receiving '<em><b>Procedures Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProceduresSectionProcedureActivity(ProceduresSection proceduresSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURES_SECTION_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURES_SECTION);
			try {
				VALIDATE_PROCEDURES_SECTION_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURES_SECTION_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURES_SECTION_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(proceduresSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURES_SECTION__PROCEDURES_SECTION_PROCEDURE_ACTIVITY,
						 ConsolPlugin.INSTANCE.getString("ProceduresSectionProcedureActivity"),
						 new Object [] { proceduresSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresSectionExternalReference(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section External Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionExternalReference(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::ExternalReference))";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresSectionExternalReference(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section External Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionExternalReference(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::ExternalReference))
	 * @param proceduresSection The receiving '<em><b>Procedures Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProceduresSectionExternalReference(ProceduresSection proceduresSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURES_SECTION);
			try {
				VALIDATE_PROCEDURES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(proceduresSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURES_SECTION__PROCEDURES_SECTION_EXTERNAL_REFERENCE,
						 ConsolPlugin.INSTANCE.getString("ProceduresSectionExternalReference"),
						 new Object [] { proceduresSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresSectionProcedureEntryProcedureActivityProcedure(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Procedure Entry Procedure Activity Procedure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionProcedureEntryProcedureActivityProcedure(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(consol::ProcedureEntryProcedureActivityProcedure))";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresSectionProcedureEntryProcedureActivityProcedure(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Procedure Entry Procedure Activity Procedure</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionProcedureEntryProcedureActivityProcedure(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURES_SECTION_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(consol::ProcedureEntryProcedureActivityProcedure))
	 * @param proceduresSection The receiving '<em><b>Procedures Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProceduresSectionProcedureEntryProcedureActivityProcedure(ProceduresSection proceduresSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURES_SECTION_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURES_SECTION);
			try {
				VALIDATE_PROCEDURES_SECTION_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURES_SECTION_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURES_SECTION_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(proceduresSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURES_SECTION__PROCEDURES_SECTION_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE,
						 ConsolPlugin.INSTANCE.getString("ProceduresSectionProcedureEntryProcedureActivityProcedure"),
						 new Object [] { proceduresSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getnullProcedureActivities(ProceduresSection) <em>Getnull Procedure Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullProcedureActivities(ProceduresSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GETNULL_PROCEDURE_ACTIVITIES__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::Procedure)).oclAsType(consol::Procedure)";

	/**
	 * The cached OCL query for the '{@link #getnullProcedureActivities(ProceduresSection) <em>Getnull Procedure Activities</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullProcedureActivities(ProceduresSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETNULL_PROCEDURE_ACTIVITIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::Procedure)).oclAsType(consol::Procedure)
	 * @param proceduresSection The receiving '<em><b>Procedures Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Procedure> getnullProcedureActivities(ProceduresSection proceduresSection) {
		if (GETNULL_PROCEDURE_ACTIVITIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROCEDURES_SECTION, ConsolPackage.Literals.PROCEDURES_SECTION.getEAllOperations().get(64));
			try {
				GETNULL_PROCEDURE_ACTIVITIES__EOCL_QRY = helper.createQuery(GETNULL_PROCEDURE_ACTIVITIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETNULL_PROCEDURE_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Procedure> result = (Collection<Procedure>) query.evaluate(proceduresSection);
		return new BasicEList.UnmodifiableEList<Procedure>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getnullExternalReference(ProceduresSection) <em>Getnull External Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullExternalReference(ProceduresSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GETNULL_EXTERNAL_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ExternalReference))->asSequence()->first().oclAsType(consol::ExternalReference)";

	/**
	 * The cached OCL query for the '{@link #getnullExternalReference(ProceduresSection) <em>Getnull External Reference</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullExternalReference(ProceduresSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETNULL_EXTERNAL_REFERENCE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ExternalReference))->asSequence()->first().oclAsType(consol::ExternalReference)
	 * @param proceduresSection The receiving '<em><b>Procedures Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ExternalReference getnullExternalReference(ProceduresSection proceduresSection) {
		if (GETNULL_EXTERNAL_REFERENCE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROCEDURES_SECTION, ConsolPackage.Literals.PROCEDURES_SECTION.getEAllOperations().get(65));
			try {
				GETNULL_EXTERNAL_REFERENCE__EOCL_QRY = helper.createQuery(GETNULL_EXTERNAL_REFERENCE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETNULL_EXTERNAL_REFERENCE__EOCL_QRY);
		return (ExternalReference) query.evaluate(proceduresSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getnullProcedureEntryProcedureActivityProcedures(ProceduresSection) <em>Getnull Procedure Entry Procedure Activity Procedures</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullProcedureEntryProcedureActivityProcedures(ProceduresSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GETNULL_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureEntryProcedureActivityProcedure)).oclAsType(consol::ProcedureEntryProcedureActivityProcedure)";

	/**
	 * The cached OCL query for the '{@link #getnullProcedureEntryProcedureActivityProcedures(ProceduresSection) <em>Getnull Procedure Entry Procedure Activity Procedures</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullProcedureEntryProcedureActivityProcedures(ProceduresSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETNULL_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureEntryProcedureActivityProcedure)).oclAsType(consol::ProcedureEntryProcedureActivityProcedure)
	 * @param proceduresSection The receiving '<em><b>Procedures Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<ProcedureEntryProcedureActivityProcedure> getnullProcedureEntryProcedureActivityProcedures(ProceduresSection proceduresSection) {
		if (GETNULL_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROCEDURES_SECTION, ConsolPackage.Literals.PROCEDURES_SECTION.getEAllOperations().get(66));
			try {
				GETNULL_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_QRY = helper.createQuery(GETNULL_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETNULL_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProcedureEntryProcedureActivityProcedure> result = (Collection<ProcedureEntryProcedureActivityProcedure>) query.evaluate(proceduresSection);
		return new BasicEList.UnmodifiableEList<ProcedureEntryProcedureActivityProcedure>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresSectionEntriesOptionalTemplateId(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionEntriesOptionalTemplateId(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.7.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresSectionEntriesOptionalTemplateId(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionEntriesOptionalTemplateId(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.7.1')
	 * @param proceduresSection The receiving '<em><b>Procedures Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProceduresSectionEntriesOptionalTemplateId(ProceduresSection proceduresSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURES_SECTION);
			try {
				VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(proceduresSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURES_SECTION__PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProceduresSectionEntriesOptionalTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(proceduresSection, context) }),
						 new Object [] { proceduresSection }));
			}
			return false;
		}
		return true;
	}

} // ProceduresSectionOperations