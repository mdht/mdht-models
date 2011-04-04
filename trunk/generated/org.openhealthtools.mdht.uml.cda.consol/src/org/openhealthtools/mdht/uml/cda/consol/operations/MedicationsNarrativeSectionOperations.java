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
import org.openhealthtools.mdht.uml.cda.consol.MedicationsNarrativeSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medications Narrative Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsNarrativeSection#validateMedicationsNarrativeSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Narrative Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsNarrativeSection#validateMedicationsNarrativeSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Narrative Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsNarrativeSection#validateMedicationsNarrativeSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Narrative Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsNarrativeSection#validateMedicationsNarrativeSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Narrative Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationsNarrativeSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationsNarrativeSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationsNarrativeSectionTemplateId(MedicationsNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Narrative Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationsNarrativeSectionTemplateId(MedicationsNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATIONS_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.2.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationsNarrativeSectionTemplateId(MedicationsNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Narrative Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationsNarrativeSectionTemplateId(MedicationsNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATIONS_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.2.1')
	 * @param medicationsNarrativeSection The receiving '<em><b>Medications Narrative Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationsNarrativeSectionTemplateId(MedicationsNarrativeSection medicationsNarrativeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATIONS_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATIONS_NARRATIVE_SECTION);
			try {
				VALIDATE_MEDICATIONS_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATIONS_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATIONS_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationsNarrativeSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATIONS_NARRATIVE_SECTION__MEDICATIONS_NARRATIVE_SECTION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("MedicationsNarrativeSectionTemplateId"),
						 new Object [] { medicationsNarrativeSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationsNarrativeSectionCode(MedicationsNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Narrative Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationsNarrativeSectionCode(MedicationsNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATIONS_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '10160-0' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationsNarrativeSectionCode(MedicationsNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Narrative Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationsNarrativeSectionCode(MedicationsNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATIONS_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '10160-0' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param medicationsNarrativeSection The receiving '<em><b>Medications Narrative Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationsNarrativeSectionCode(MedicationsNarrativeSection medicationsNarrativeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATIONS_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATIONS_NARRATIVE_SECTION);
			try {
				VALIDATE_MEDICATIONS_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATIONS_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATIONS_NARRATIVE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationsNarrativeSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATIONS_NARRATIVE_SECTION__MEDICATIONS_NARRATIVE_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("MedicationsNarrativeSectionCode"),
						 new Object [] { medicationsNarrativeSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationsNarrativeSectionTitle(MedicationsNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Narrative Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationsNarrativeSectionTitle(MedicationsNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATIONS_NARRATIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationsNarrativeSectionTitle(MedicationsNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Narrative Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationsNarrativeSectionTitle(MedicationsNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATIONS_NARRATIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param medicationsNarrativeSection The receiving '<em><b>Medications Narrative Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationsNarrativeSectionTitle(MedicationsNarrativeSection medicationsNarrativeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATIONS_NARRATIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATIONS_NARRATIVE_SECTION);
			try {
				VALIDATE_MEDICATIONS_NARRATIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATIONS_NARRATIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATIONS_NARRATIVE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationsNarrativeSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATIONS_NARRATIVE_SECTION__MEDICATIONS_NARRATIVE_SECTION_TITLE,
						 ConsolPlugin.INSTANCE.getString("MedicationsNarrativeSectionTitle"),
						 new Object [] { medicationsNarrativeSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationsNarrativeSectionText(MedicationsNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Narrative Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationsNarrativeSectionText(MedicationsNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATIONS_NARRATIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationsNarrativeSectionText(MedicationsNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Narrative Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationsNarrativeSectionText(MedicationsNarrativeSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATIONS_NARRATIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param medicationsNarrativeSection The receiving '<em><b>Medications Narrative Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationsNarrativeSectionText(MedicationsNarrativeSection medicationsNarrativeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATIONS_NARRATIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATIONS_NARRATIVE_SECTION);
			try {
				VALIDATE_MEDICATIONS_NARRATIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATIONS_NARRATIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATIONS_NARRATIVE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationsNarrativeSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATIONS_NARRATIVE_SECTION__MEDICATIONS_NARRATIVE_SECTION_TEXT,
						 ConsolPlugin.INSTANCE.getString("MedicationsNarrativeSectionText"),
						 new Object [] { medicationsNarrativeSection }));
			}
			return false;
		}
		return true;
	}

} // MedicationsNarrativeSectionOperations