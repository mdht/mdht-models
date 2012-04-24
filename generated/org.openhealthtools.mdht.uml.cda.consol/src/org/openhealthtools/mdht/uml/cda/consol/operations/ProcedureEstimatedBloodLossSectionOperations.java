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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Estimated Blood Loss Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection#validateProcedureEstimatedBloodLossSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Estimated Blood Loss Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection#validateProcedureEstimatedBloodLossSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Estimated Blood Loss Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection#validateProcedureEstimatedBloodLossSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Estimated Blood Loss Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection#validateProcedureEstimatedBloodLossSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Estimated Blood Loss Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureEstimatedBloodLossSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureEstimatedBloodLossSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEstimatedBloodLossSectionTemplateId(ProcedureEstimatedBloodLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Estimated Blood Loss Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEstimatedBloodLossSectionTemplateId(ProcedureEstimatedBloodLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.18.2.9')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEstimatedBloodLossSectionTemplateId(ProcedureEstimatedBloodLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Estimated Blood Loss Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEstimatedBloodLossSectionTemplateId(ProcedureEstimatedBloodLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.18.2.9')
	 * @param procedureEstimatedBloodLossSection The receiving '<em><b>Procedure Estimated Blood Loss Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureEstimatedBloodLossSectionTemplateId(
			ProcedureEstimatedBloodLossSection procedureEstimatedBloodLossSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION);
			try {
				VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureEstimatedBloodLossSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ProcedureEstimatedBloodLossSectionTemplateId"),
					new Object[] { procedureEstimatedBloodLossSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEstimatedBloodLossSectionCode(ProcedureEstimatedBloodLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Estimated Blood Loss Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEstimatedBloodLossSectionCode(ProcedureEstimatedBloodLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '59770-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEstimatedBloodLossSectionCode(ProcedureEstimatedBloodLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Estimated Blood Loss Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEstimatedBloodLossSectionCode(ProcedureEstimatedBloodLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	 * value.code = '59770-8' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param procedureEstimatedBloodLossSection The receiving '<em><b>Procedure Estimated Blood Loss Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureEstimatedBloodLossSectionCode(
			ProcedureEstimatedBloodLossSection procedureEstimatedBloodLossSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION);
			try {
				VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureEstimatedBloodLossSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_CODE,
					ConsolPlugin.INSTANCE.getString("ProcedureEstimatedBloodLossSectionCode"),
					new Object[] { procedureEstimatedBloodLossSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEstimatedBloodLossSectionText(ProcedureEstimatedBloodLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Estimated Blood Loss Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEstimatedBloodLossSectionText(ProcedureEstimatedBloodLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEstimatedBloodLossSectionText(ProcedureEstimatedBloodLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Estimated Blood Loss Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEstimatedBloodLossSectionText(ProcedureEstimatedBloodLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param procedureEstimatedBloodLossSection The receiving '<em><b>Procedure Estimated Blood Loss Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureEstimatedBloodLossSectionText(
			ProcedureEstimatedBloodLossSection procedureEstimatedBloodLossSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION);
			try {
				VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureEstimatedBloodLossSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_TEXT,
					ConsolPlugin.INSTANCE.getString("ProcedureEstimatedBloodLossSectionText"),
					new Object[] { procedureEstimatedBloodLossSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEstimatedBloodLossSectionTitle(ProcedureEstimatedBloodLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Estimated Blood Loss Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEstimatedBloodLossSectionTitle(ProcedureEstimatedBloodLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEstimatedBloodLossSectionTitle(ProcedureEstimatedBloodLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Estimated Blood Loss Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEstimatedBloodLossSectionTitle(ProcedureEstimatedBloodLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param procedureEstimatedBloodLossSection The receiving '<em><b>Procedure Estimated Blood Loss Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedureEstimatedBloodLossSectionTitle(
			ProcedureEstimatedBloodLossSection procedureEstimatedBloodLossSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION);
			try {
				VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureEstimatedBloodLossSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_TITLE,
					ConsolPlugin.INSTANCE.getString("ProcedureEstimatedBloodLossSectionTitle"),
					new Object[] { procedureEstimatedBloodLossSection }));
			}

			return false;
		}
		return true;
	}

} // ProcedureEstimatedBloodLossSectionOperations
