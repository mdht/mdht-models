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
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsNarrativeSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Diagnostic Results Narrative Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsNarrativeSection#validateDiagnosticResultsNarrativeSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Narrative Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsNarrativeSection#validateDiagnosticResultsNarrativeSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Narrative Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagnosticResultsNarrativeSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticResultsNarrativeSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticResultsNarrativeSectionTemplateId(DiagnosticResultsNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Narrative Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsNarrativeSectionTemplateId(DiagnosticResultsNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_RESULTS_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.2.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticResultsNarrativeSectionTemplateId(DiagnosticResultsNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Narrative Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsNarrativeSectionTemplateId(DiagnosticResultsNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIAGNOSTIC_RESULTS_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.2.3')
	 * @param diagnosticResultsNarrativeSection The receiving '<em><b>Diagnostic Results Narrative Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateDiagnosticResultsNarrativeSectionTemplateId(DiagnosticResultsNarrativeSection diagnosticResultsNarrativeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DIAGNOSTIC_RESULTS_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_RESULTS_NARRATIVE_SECTION);
			try {
				VALIDATE_DIAGNOSTIC_RESULTS_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_RESULTS_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_RESULTS_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(diagnosticResultsNarrativeSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DIAGNOSTIC_RESULTS_NARRATIVE_SECTION__DIAGNOSTIC_RESULTS_NARRATIVE_SECTION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("DiagnosticResultsNarrativeSectionTemplateId"),
						 new Object [] { diagnosticResultsNarrativeSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticResultsNarrativeSectionCode(DiagnosticResultsNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Narrative Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsNarrativeSectionCode(DiagnosticResultsNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_RESULTS_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '30954-2' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticResultsNarrativeSectionCode(DiagnosticResultsNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Narrative Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsNarrativeSectionCode(DiagnosticResultsNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIAGNOSTIC_RESULTS_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '30954-2' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param diagnosticResultsNarrativeSection The receiving '<em><b>Diagnostic Results Narrative Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateDiagnosticResultsNarrativeSectionCode(DiagnosticResultsNarrativeSection diagnosticResultsNarrativeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DIAGNOSTIC_RESULTS_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_RESULTS_NARRATIVE_SECTION);
			try {
				VALIDATE_DIAGNOSTIC_RESULTS_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_RESULTS_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_RESULTS_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(diagnosticResultsNarrativeSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DIAGNOSTIC_RESULTS_NARRATIVE_SECTION__DIAGNOSTIC_RESULTS_NARRATIVE_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("DiagnosticResultsNarrativeSectionCode"),
						 new Object [] { diagnosticResultsNarrativeSection }));
			}
			return false;
		}
		return true;
	}

} // DiagnosticResultsNarrativeSectionOperations