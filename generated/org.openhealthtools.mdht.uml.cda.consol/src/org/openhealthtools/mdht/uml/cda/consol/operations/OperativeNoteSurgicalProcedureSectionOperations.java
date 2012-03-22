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
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Operative Note Surgical Procedure Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection#validateOperativeNoteSurgicalProcedureSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Surgical Procedure Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection#validateOperativeNoteSurgicalProcedureSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Surgical Procedure Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection#validateOperativeNoteSurgicalProcedureSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Surgical Procedure Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection#validateOperativeNoteSurgicalProcedureSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Surgical Procedure Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperativeNoteSurgicalProcedureSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperativeNoteSurgicalProcedureSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteSurgicalProcedureSectionTemplateId(OperativeNoteSurgicalProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Surgical Procedure Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteSurgicalProcedureSectionTemplateId(OperativeNoteSurgicalProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.7.14')";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteSurgicalProcedureSectionTemplateId(OperativeNoteSurgicalProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Surgical Procedure Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteSurgicalProcedureSectionTemplateId(OperativeNoteSurgicalProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.7.14')
	 * @param operativeNoteSurgicalProcedureSection The receiving '<em><b>Operative Note Surgical Procedure Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteSurgicalProcedureSectionTemplateId(
			OperativeNoteSurgicalProcedureSection operativeNoteSurgicalProcedureSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION);
			try {
				VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			operativeNoteSurgicalProcedureSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("OperativeNoteSurgicalProcedureSectionTemplateId"),
					new Object[] { operativeNoteSurgicalProcedureSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteSurgicalProcedureSectionCode(OperativeNoteSurgicalProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Surgical Procedure Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteSurgicalProcedureSectionCode(OperativeNoteSurgicalProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '10223-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteSurgicalProcedureSectionCode(OperativeNoteSurgicalProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Surgical Procedure Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteSurgicalProcedureSectionCode(OperativeNoteSurgicalProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	 * value.code = '10223-6' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param operativeNoteSurgicalProcedureSection The receiving '<em><b>Operative Note Surgical Procedure Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteSurgicalProcedureSectionCode(
			OperativeNoteSurgicalProcedureSection operativeNoteSurgicalProcedureSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION);
			try {
				VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			operativeNoteSurgicalProcedureSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_CODE,
					ConsolPlugin.INSTANCE.getString("OperativeNoteSurgicalProcedureSectionCode"),
					new Object[] { operativeNoteSurgicalProcedureSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteSurgicalProcedureSectionText(OperativeNoteSurgicalProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Surgical Procedure Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteSurgicalProcedureSectionText(OperativeNoteSurgicalProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteSurgicalProcedureSectionText(OperativeNoteSurgicalProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Surgical Procedure Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteSurgicalProcedureSectionText(OperativeNoteSurgicalProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param operativeNoteSurgicalProcedureSection The receiving '<em><b>Operative Note Surgical Procedure Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteSurgicalProcedureSectionText(
			OperativeNoteSurgicalProcedureSection operativeNoteSurgicalProcedureSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION);
			try {
				VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			operativeNoteSurgicalProcedureSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_TEXT,
					ConsolPlugin.INSTANCE.getString("OperativeNoteSurgicalProcedureSectionText"),
					new Object[] { operativeNoteSurgicalProcedureSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteSurgicalProcedureSectionTitle(OperativeNoteSurgicalProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Surgical Procedure Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteSurgicalProcedureSectionTitle(OperativeNoteSurgicalProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteSurgicalProcedureSectionTitle(OperativeNoteSurgicalProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Surgical Procedure Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteSurgicalProcedureSectionTitle(OperativeNoteSurgicalProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param operativeNoteSurgicalProcedureSection The receiving '<em><b>Operative Note Surgical Procedure Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteSurgicalProcedureSectionTitle(
			OperativeNoteSurgicalProcedureSection operativeNoteSurgicalProcedureSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION);
			try {
				VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			operativeNoteSurgicalProcedureSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_TITLE,
					ConsolPlugin.INSTANCE.getString("OperativeNoteSurgicalProcedureSectionTitle"),
					new Object[] { operativeNoteSurgicalProcedureSection }));
			}
			return false;
		}
		return true;
	}

} // OperativeNoteSurgicalProcedureSectionOperations
