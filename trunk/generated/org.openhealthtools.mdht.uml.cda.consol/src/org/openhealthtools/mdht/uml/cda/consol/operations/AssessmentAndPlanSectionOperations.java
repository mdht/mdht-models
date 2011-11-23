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

import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.Encounter;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.Procedure;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assessment And Plan Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#validateAssessmentAndPlanSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#validateAssessmentAndPlanSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#validateAssessmentAndPlanSectionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#validateAssessmentAndPlanSectionImmunization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Immunization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#validateAssessmentAndPlanSectionEncounterEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Encounter Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#validateAssessmentAndPlanSectionProcedureEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Procedure Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#getMedications() <em>Get Medications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#getImmunizations() <em>Get Immunizations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#getEncounterEntries() <em>Get Encounter Entries</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#getProcedureEntries() <em>Get Procedure Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssessmentAndPlanSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentAndPlanSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentAndPlanSectionTemplateId(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionTemplateId(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.123')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentAndPlanSectionTemplateId(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionTemplateId(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.123')
	 * @param assessmentAndPlanSection The receiving '<em><b>Assessment And Plan Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAssessmentAndPlanSectionTemplateId(AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION);
			try {
				VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(assessmentAndPlanSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ASSESSMENT_AND_PLAN_SECTION__ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("AssessmentAndPlanSectionTemplateId"),
						 new Object [] { assessmentAndPlanSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentAndPlanSectionCode(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionCode(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '51847-2' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentAndPlanSectionCode(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionCode(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '51847-2' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param assessmentAndPlanSection The receiving '<em><b>Assessment And Plan Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAssessmentAndPlanSectionCode(AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION);
			try {
				VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(assessmentAndPlanSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ASSESSMENT_AND_PLAN_SECTION__ASSESSMENT_AND_PLAN_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("AssessmentAndPlanSectionCode"),
						 new Object [] { assessmentAndPlanSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentAndPlanSectionMedication(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Medication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionMedication(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_AND_PLAN_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(consol::MedicationActivity))";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentAndPlanSectionMedication(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Medication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionMedication(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSESSMENT_AND_PLAN_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(consol::MedicationActivity))
	 * @param assessmentAndPlanSection The receiving '<em><b>Assessment And Plan Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAssessmentAndPlanSectionMedication(AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ASSESSMENT_AND_PLAN_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION);
			try {
				VALIDATE_ASSESSMENT_AND_PLAN_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSESSMENT_AND_PLAN_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSESSMENT_AND_PLAN_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(assessmentAndPlanSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ASSESSMENT_AND_PLAN_SECTION__ASSESSMENT_AND_PLAN_SECTION_MEDICATION,
						 ConsolPlugin.INSTANCE.getString("AssessmentAndPlanSectionMedication"),
						 new Object [] { assessmentAndPlanSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentAndPlanSectionImmunization(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Immunization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionImmunization(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_AND_PLAN_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(consol::ImmunizationActivity))";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentAndPlanSectionImmunization(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Immunization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionImmunization(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSESSMENT_AND_PLAN_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(consol::ImmunizationActivity))
	 * @param assessmentAndPlanSection The receiving '<em><b>Assessment And Plan Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAssessmentAndPlanSectionImmunization(AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ASSESSMENT_AND_PLAN_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION);
			try {
				VALIDATE_ASSESSMENT_AND_PLAN_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSESSMENT_AND_PLAN_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSESSMENT_AND_PLAN_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(assessmentAndPlanSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ASSESSMENT_AND_PLAN_SECTION__ASSESSMENT_AND_PLAN_SECTION_IMMUNIZATION,
						 ConsolPlugin.INSTANCE.getString("AssessmentAndPlanSectionImmunization"),
						 new Object [] { assessmentAndPlanSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentAndPlanSectionEncounterEntry(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Encounter Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionEncounterEntry(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_AND_PLAN_SECTION_ENCOUNTER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(consol::Encounter))";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentAndPlanSectionEncounterEntry(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Encounter Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionEncounterEntry(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSESSMENT_AND_PLAN_SECTION_ENCOUNTER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(consol::Encounter))
	 * @param assessmentAndPlanSection The receiving '<em><b>Assessment And Plan Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAssessmentAndPlanSectionEncounterEntry(AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ASSESSMENT_AND_PLAN_SECTION_ENCOUNTER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION);
			try {
				VALIDATE_ASSESSMENT_AND_PLAN_SECTION_ENCOUNTER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSESSMENT_AND_PLAN_SECTION_ENCOUNTER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSESSMENT_AND_PLAN_SECTION_ENCOUNTER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(assessmentAndPlanSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ASSESSMENT_AND_PLAN_SECTION__ASSESSMENT_AND_PLAN_SECTION_ENCOUNTER_ENTRY,
						 ConsolPlugin.INSTANCE.getString("AssessmentAndPlanSectionEncounterEntry"),
						 new Object [] { assessmentAndPlanSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentAndPlanSectionProcedureEntry(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Procedure Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionProcedureEntry(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_AND_PLAN_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(consol::Procedure))";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentAndPlanSectionProcedureEntry(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Procedure Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionProcedureEntry(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSESSMENT_AND_PLAN_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(consol::Procedure))
	 * @param assessmentAndPlanSection The receiving '<em><b>Assessment And Plan Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAssessmentAndPlanSectionProcedureEntry(AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ASSESSMENT_AND_PLAN_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION);
			try {
				VALIDATE_ASSESSMENT_AND_PLAN_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSESSMENT_AND_PLAN_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSESSMENT_AND_PLAN_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(assessmentAndPlanSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ASSESSMENT_AND_PLAN_SECTION__ASSESSMENT_AND_PLAN_SECTION_PROCEDURE_ENTRY,
						 ConsolPlugin.INSTANCE.getString("AssessmentAndPlanSectionProcedureEntry"),
						 new Object [] { assessmentAndPlanSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedications(AssessmentAndPlanSection) <em>Get Medications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedications(AssessmentAndPlanSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity)).oclAsType(consol::MedicationActivity)";

	/**
	 * The cached OCL query for the '{@link #getMedications(AssessmentAndPlanSection) <em>Get Medications</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedications(AssessmentAndPlanSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity)).oclAsType(consol::MedicationActivity)
	 * @param assessmentAndPlanSection The receiving '<em><b>Assessment And Plan Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<MedicationActivity> getMedications(AssessmentAndPlanSection assessmentAndPlanSection) {
		if (GET_MEDICATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION, ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION.getEAllOperations().get(61));
			try {
				GET_MEDICATIONS__EOCL_QRY = helper.createQuery(GET_MEDICATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MedicationActivity> result = (Collection<MedicationActivity>) query.evaluate(assessmentAndPlanSection);
		return new BasicEList.UnmodifiableEList<MedicationActivity>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getImmunizations(AssessmentAndPlanSection) <em>Get Immunizations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizations(AssessmentAndPlanSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::ImmunizationActivity)).oclAsType(consol::ImmunizationActivity)";

	/**
	 * The cached OCL query for the '{@link #getImmunizations(AssessmentAndPlanSection) <em>Get Immunizations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizations(AssessmentAndPlanSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::ImmunizationActivity)).oclAsType(consol::ImmunizationActivity)
	 * @param assessmentAndPlanSection The receiving '<em><b>Assessment And Plan Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<ImmunizationActivity> getImmunizations(AssessmentAndPlanSection assessmentAndPlanSection) {
		if (GET_IMMUNIZATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION, ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION.getEAllOperations().get(62));
			try {
				GET_IMMUNIZATIONS__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ImmunizationActivity> result = (Collection<ImmunizationActivity>) query.evaluate(assessmentAndPlanSection);
		return new BasicEList.UnmodifiableEList<ImmunizationActivity>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getEncounterEntries(AssessmentAndPlanSection) <em>Get Encounter Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounterEntries(AssessmentAndPlanSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENCOUNTER_ENTRIES__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::Encounter)).oclAsType(consol::Encounter)";

	/**
	 * The cached OCL query for the '{@link #getEncounterEntries(AssessmentAndPlanSection) <em>Get Encounter Entries</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounterEntries(AssessmentAndPlanSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENCOUNTER_ENTRIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::Encounter)).oclAsType(consol::Encounter)
	 * @param assessmentAndPlanSection The receiving '<em><b>Assessment And Plan Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Encounter> getEncounterEntries(AssessmentAndPlanSection assessmentAndPlanSection) {
		if (GET_ENCOUNTER_ENTRIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION, ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION.getEAllOperations().get(63));
			try {
				GET_ENCOUNTER_ENTRIES__EOCL_QRY = helper.createQuery(GET_ENCOUNTER_ENTRIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENCOUNTER_ENTRIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Encounter> result = (Collection<Encounter>) query.evaluate(assessmentAndPlanSection);
		return new BasicEList.UnmodifiableEList<Encounter>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureEntries(AssessmentAndPlanSection) <em>Get Procedure Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureEntries(AssessmentAndPlanSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_ENTRIES__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::Procedure)).oclAsType(consol::Procedure)";

	/**
	 * The cached OCL query for the '{@link #getProcedureEntries(AssessmentAndPlanSection) <em>Get Procedure Entries</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureEntries(AssessmentAndPlanSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_ENTRIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::Procedure)).oclAsType(consol::Procedure)
	 * @param assessmentAndPlanSection The receiving '<em><b>Assessment And Plan Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Procedure> getProcedureEntries(AssessmentAndPlanSection assessmentAndPlanSection) {
		if (GET_PROCEDURE_ENTRIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION, ConsolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION.getEAllOperations().get(64));
			try {
				GET_PROCEDURE_ENTRIES__EOCL_QRY = helper.createQuery(GET_PROCEDURE_ENTRIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_ENTRIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Procedure> result = (Collection<Procedure>) query.evaluate(assessmentAndPlanSection);
		return new BasicEList.UnmodifiableEList<Procedure>(result.size(), result.toArray());
	}

} // AssessmentAndPlanSectionOperations