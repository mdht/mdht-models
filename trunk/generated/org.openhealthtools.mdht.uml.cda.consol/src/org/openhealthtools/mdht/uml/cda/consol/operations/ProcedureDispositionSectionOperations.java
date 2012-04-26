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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Disposition Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection#validateProcedureDispositionSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Disposition Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection#validateProcedureDispositionSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Disposition Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection#validateProcedureDispositionSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Disposition Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection#validateProcedureDispositionSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Disposition Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureDispositionSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureDispositionSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureDispositionSectionTemplateId(ProcedureDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Disposition Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureDispositionSectionTemplateId(ProcedureDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.18.2.12')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureDispositionSectionTemplateId(ProcedureDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Disposition Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureDispositionSectionTemplateId(ProcedureDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.18.2.12')
	 * @param procedureDispositionSection The receiving '<em><b>Procedure Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureDispositionSectionTemplateId(
			ProcedureDispositionSection procedureDispositionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_DISPOSITION_SECTION);
			try {
				VALIDATE_PROCEDURE_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_DISPOSITION_SECTION__PROCEDURE_DISPOSITION_SECTION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("ProcedureDispositionSectionTemplateId"),
						 new Object [] { procedureDispositionSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureDispositionSectionCode(ProcedureDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Disposition Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureDispositionSectionCode(ProcedureDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '59775-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureDispositionSectionCode(ProcedureDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Disposition Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureDispositionSectionCode(ProcedureDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	 * value.code = '59775-7' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param procedureDispositionSection The receiving '<em><b>Procedure Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureDispositionSectionCode(
			ProcedureDispositionSection procedureDispositionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_DISPOSITION_SECTION);
			try {
				VALIDATE_PROCEDURE_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_DISPOSITION_SECTION__PROCEDURE_DISPOSITION_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("ProcedureDispositionSectionCode"),
						 new Object [] { procedureDispositionSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureDispositionSectionText(ProcedureDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Disposition Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureDispositionSectionText(ProcedureDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureDispositionSectionText(ProcedureDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Disposition Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureDispositionSectionText(ProcedureDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param procedureDispositionSection The receiving '<em><b>Procedure Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureDispositionSectionText(
			ProcedureDispositionSection procedureDispositionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_DISPOSITION_SECTION);
			try {
				VALIDATE_PROCEDURE_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_DISPOSITION_SECTION__PROCEDURE_DISPOSITION_SECTION_TEXT,
						 ConsolPlugin.INSTANCE.getString("ProcedureDispositionSectionText"),
						 new Object [] { procedureDispositionSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureDispositionSectionTitle(ProcedureDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Disposition Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureDispositionSectionTitle(ProcedureDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureDispositionSectionTitle(ProcedureDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Disposition Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureDispositionSectionTitle(ProcedureDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param procedureDispositionSection The receiving '<em><b>Procedure Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureDispositionSectionTitle(
			ProcedureDispositionSection procedureDispositionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_DISPOSITION_SECTION);
			try {
				VALIDATE_PROCEDURE_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_DISPOSITION_SECTION__PROCEDURE_DISPOSITION_SECTION_TITLE,
						 ConsolPlugin.INSTANCE.getString("ProcedureDispositionSectionTitle"),
						 new Object [] { procedureDispositionSection }));
			}
			return false;
		}
		return true;
	}

} // ProcedureDispositionSectionOperations
