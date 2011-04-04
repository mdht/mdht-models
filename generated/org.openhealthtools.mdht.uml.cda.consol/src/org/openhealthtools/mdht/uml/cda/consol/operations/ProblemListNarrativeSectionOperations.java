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
import org.openhealthtools.mdht.uml.cda.consol.ProblemListNarrativeSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem List Narrative Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemListNarrativeSection#validateProblemListNarrativeSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Narrative Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemListNarrativeSection#validateProblemListNarrativeSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Narrative Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemListNarrativeSection#validateProblemListNarrativeSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Narrative Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemListNarrativeSection#validateProblemListNarrativeSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Narrative Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProblemListNarrativeSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemListNarrativeSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemListNarrativeSectionTemplateId(ProblemListNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Narrative Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemListNarrativeSectionTemplateId(ProblemListNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_LIST_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.2.5')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemListNarrativeSectionTemplateId(ProblemListNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Narrative Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemListNarrativeSectionTemplateId(ProblemListNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_LIST_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.2.5')
	 * @param problemListNarrativeSection The receiving '<em><b>Problem List Narrative Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemListNarrativeSectionTemplateId(ProblemListNarrativeSection problemListNarrativeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_LIST_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_LIST_NARRATIVE_SECTION);
			try {
				VALIDATE_PROBLEM_LIST_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_LIST_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_LIST_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemListNarrativeSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROBLEM_LIST_NARRATIVE_SECTION__PROBLEM_LIST_NARRATIVE_SECTION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("ProblemListNarrativeSectionTemplateId"),
						 new Object [] { problemListNarrativeSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemListNarrativeSectionCode(ProblemListNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Narrative Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemListNarrativeSectionCode(ProblemListNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_LIST_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '11450-4' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemListNarrativeSectionCode(ProblemListNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Narrative Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemListNarrativeSectionCode(ProblemListNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_LIST_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '11450-4' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param problemListNarrativeSection The receiving '<em><b>Problem List Narrative Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemListNarrativeSectionCode(ProblemListNarrativeSection problemListNarrativeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_LIST_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_LIST_NARRATIVE_SECTION);
			try {
				VALIDATE_PROBLEM_LIST_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_LIST_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_LIST_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemListNarrativeSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROBLEM_LIST_NARRATIVE_SECTION__PROBLEM_LIST_NARRATIVE_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("ProblemListNarrativeSectionCode"),
						 new Object [] { problemListNarrativeSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemListNarrativeSectionTitle(ProblemListNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Narrative Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemListNarrativeSectionTitle(ProblemListNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_LIST_NARRATIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemListNarrativeSectionTitle(ProblemListNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Narrative Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemListNarrativeSectionTitle(ProblemListNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_LIST_NARRATIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param problemListNarrativeSection The receiving '<em><b>Problem List Narrative Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemListNarrativeSectionTitle(ProblemListNarrativeSection problemListNarrativeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_LIST_NARRATIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_LIST_NARRATIVE_SECTION);
			try {
				VALIDATE_PROBLEM_LIST_NARRATIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_LIST_NARRATIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_LIST_NARRATIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemListNarrativeSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROBLEM_LIST_NARRATIVE_SECTION__PROBLEM_LIST_NARRATIVE_SECTION_TITLE,
						 ConsolPlugin.INSTANCE.getString("ProblemListNarrativeSectionTitle"),
						 new Object [] { problemListNarrativeSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemListNarrativeSectionText(ProblemListNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Narrative Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemListNarrativeSectionText(ProblemListNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_LIST_NARRATIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemListNarrativeSectionText(ProblemListNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Narrative Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemListNarrativeSectionText(ProblemListNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_LIST_NARRATIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param problemListNarrativeSection The receiving '<em><b>Problem List Narrative Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemListNarrativeSectionText(ProblemListNarrativeSection problemListNarrativeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_LIST_NARRATIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_LIST_NARRATIVE_SECTION);
			try {
				VALIDATE_PROBLEM_LIST_NARRATIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_LIST_NARRATIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_LIST_NARRATIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemListNarrativeSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROBLEM_LIST_NARRATIVE_SECTION__PROBLEM_LIST_NARRATIVE_SECTION_TEXT,
						 ConsolPlugin.INSTANCE.getString("ProblemListNarrativeSectionText"),
						 new Object [] { problemListNarrativeSection }));
			}
			return false;
		}
		return true;
	}

} // ProblemListNarrativeSectionOperations