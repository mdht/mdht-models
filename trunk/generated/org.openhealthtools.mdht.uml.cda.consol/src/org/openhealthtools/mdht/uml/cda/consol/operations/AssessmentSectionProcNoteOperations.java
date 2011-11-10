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
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSectionProcNote;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assessment Section Proc Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentSectionProcNote#validateAssessmentSectionProcNoteTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Section Proc Note Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentSectionProcNote#validateAssessmentSectionProcNoteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Section Proc Note Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssessmentSectionProcNoteOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentSectionProcNoteOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentSectionProcNoteTemplateId(AssessmentSectionProcNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Section Proc Note Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentSectionProcNoteTemplateId(AssessmentSectionProcNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SECTION_PROC_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.18.2.13')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentSectionProcNoteTemplateId(AssessmentSectionProcNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Section Proc Note Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentSectionProcNoteTemplateId(AssessmentSectionProcNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSESSMENT_SECTION_PROC_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.18.2.13')
	 * @param assessmentSectionProcNote The receiving '<em><b>Assessment Section Proc Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssessmentSectionProcNoteTemplateId(
			AssessmentSectionProcNote assessmentSectionProcNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ASSESSMENT_SECTION_PROC_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SECTION_PROC_NOTE);
			try {
				VALIDATE_ASSESSMENT_SECTION_PROC_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSESSMENT_SECTION_PROC_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSESSMENT_SECTION_PROC_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			assessmentSectionProcNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ASSESSMENT_SECTION_PROC_NOTE__ASSESSMENT_SECTION_PROC_NOTE_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("AssessmentSectionProcNoteTemplateId"),
					new Object[] { assessmentSectionProcNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentSectionProcNoteCode(AssessmentSectionProcNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Section Proc Note Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentSectionProcNoteCode(AssessmentSectionProcNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_SECTION_PROC_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("
			+ "value.code = '51848-0' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentSectionProcNoteCode(AssessmentSectionProcNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Section Proc Note Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentSectionProcNoteCode(AssessmentSectionProcNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSESSMENT_SECTION_PROC_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '51848-0' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param assessmentSectionProcNote The receiving '<em><b>Assessment Section Proc Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssessmentSectionProcNoteCode(AssessmentSectionProcNote assessmentSectionProcNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ASSESSMENT_SECTION_PROC_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_SECTION_PROC_NOTE);
			try {
				VALIDATE_ASSESSMENT_SECTION_PROC_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSESSMENT_SECTION_PROC_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSESSMENT_SECTION_PROC_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			assessmentSectionProcNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ASSESSMENT_SECTION_PROC_NOTE__ASSESSMENT_SECTION_PROC_NOTE_CODE,
					ConsolPlugin.INSTANCE.getString("AssessmentSectionProcNoteCode"),
					new Object[] { assessmentSectionProcNote }));
			}
			return false;
		}
		return true;
	}

} // AssessmentSectionProcNoteOperations
