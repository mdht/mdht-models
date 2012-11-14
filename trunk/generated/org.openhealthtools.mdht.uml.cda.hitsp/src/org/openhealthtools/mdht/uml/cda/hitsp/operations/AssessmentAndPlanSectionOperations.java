/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

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
import org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Encounter;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.Immunization;
import org.openhealthtools.mdht.uml.cda.hitsp.Medication;
import org.openhealthtools.mdht.uml.cda.hitsp.Procedure;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assessment And Plan Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection#validateHITSPAssessmentAndPlanSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Assessment And Plan Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection#validateHITSPAssessmentAndPlanSectionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Assessment And Plan Section Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection#validateHITSPAssessmentAndPlanSectionImmunization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Assessment And Plan Section Immunization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection#validateHITSPAssessmentAndPlanSectionEncounterEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Assessment And Plan Section Encounter Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection#validateHITSPAssessmentAndPlanSectionProcedureEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Assessment And Plan Section Procedure Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection#getMedications() <em>Get Medications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection#getImmunizations() <em>Get Immunizations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection#getEncounterEntries() <em>Get Encounter Entries</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection#getProcedureEntries() <em>Get Procedure Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssessmentAndPlanSectionOperations extends
		org.openhealthtools.mdht.uml.cda.ihe.operations.AssessmentAndPlanSectionOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected AssessmentAndPlanSectionOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateHITSPAssessmentAndPlanSectionTemplateId(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Assessment And Plan Section Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHITSPAssessmentAndPlanSectionTemplateId(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.123')";

	/**
	* The cached OCL invariant for the '{@link #validateHITSPAssessmentAndPlanSectionTemplateId(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Assessment And Plan Section Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHITSPAssessmentAndPlanSectionTemplateId(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param assessmentAndPlanSection The receiving '<em><b>Assessment And Plan Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHITSPAssessmentAndPlanSectionTemplateId(
			AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ASSESSMENT_AND_PLAN_SECTION);
			try {
				VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			assessmentAndPlanSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ASSESSMENT_AND_PLAN_SECTION__HITSP_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID,
					HITSPPlugin.INSTANCE.getString("HITSPAssessmentAndPlanSectionTemplateId"),
					new Object[] { assessmentAndPlanSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHITSPAssessmentAndPlanSectionMedication(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Assessment And Plan Section Medication</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHITSPAssessmentAndPlanSectionMedication(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(hitsp::Medication))";

	/**
	* The cached OCL invariant for the '{@link #validateHITSPAssessmentAndPlanSectionMedication(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Assessment And Plan Section Medication</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHITSPAssessmentAndPlanSectionMedication(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param assessmentAndPlanSection The receiving '<em><b>Assessment And Plan Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHITSPAssessmentAndPlanSectionMedication(
			AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ASSESSMENT_AND_PLAN_SECTION);
			try {
				VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			assessmentAndPlanSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ASSESSMENT_AND_PLAN_SECTION__HITSP_ASSESSMENT_AND_PLAN_SECTION_MEDICATION,
					HITSPPlugin.INSTANCE.getString("HITSPAssessmentAndPlanSectionMedication"),
					new Object[] { assessmentAndPlanSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHITSPAssessmentAndPlanSectionImmunization(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Assessment And Plan Section Immunization</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHITSPAssessmentAndPlanSectionImmunization(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(hitsp::Immunization))";

	/**
	* The cached OCL invariant for the '{@link #validateHITSPAssessmentAndPlanSectionImmunization(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Assessment And Plan Section Immunization</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHITSPAssessmentAndPlanSectionImmunization(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param assessmentAndPlanSection The receiving '<em><b>Assessment And Plan Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHITSPAssessmentAndPlanSectionImmunization(
			AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ASSESSMENT_AND_PLAN_SECTION);
			try {
				VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			assessmentAndPlanSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ASSESSMENT_AND_PLAN_SECTION__HITSP_ASSESSMENT_AND_PLAN_SECTION_IMMUNIZATION,
					HITSPPlugin.INSTANCE.getString("HITSPAssessmentAndPlanSectionImmunization"),
					new Object[] { assessmentAndPlanSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHITSPAssessmentAndPlanSectionEncounterEntry(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Assessment And Plan Section Encounter Entry</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHITSPAssessmentAndPlanSectionEncounterEntry(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_ENCOUNTER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(hitsp::Encounter))";

	/**
	* The cached OCL invariant for the '{@link #validateHITSPAssessmentAndPlanSectionEncounterEntry(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Assessment And Plan Section Encounter Entry</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHITSPAssessmentAndPlanSectionEncounterEntry(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_ENCOUNTER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param assessmentAndPlanSection The receiving '<em><b>Assessment And Plan Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHITSPAssessmentAndPlanSectionEncounterEntry(
			AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_ENCOUNTER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ASSESSMENT_AND_PLAN_SECTION);
			try {
				VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_ENCOUNTER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_ENCOUNTER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_ENCOUNTER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			assessmentAndPlanSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ASSESSMENT_AND_PLAN_SECTION__HITSP_ASSESSMENT_AND_PLAN_SECTION_ENCOUNTER_ENTRY,
					HITSPPlugin.INSTANCE.getString("HITSPAssessmentAndPlanSectionEncounterEntry"),
					new Object[] { assessmentAndPlanSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHITSPAssessmentAndPlanSectionProcedureEntry(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Assessment And Plan Section Procedure Entry</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHITSPAssessmentAndPlanSectionProcedureEntry(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(hitsp::Procedure))";

	/**
	* The cached OCL invariant for the '{@link #validateHITSPAssessmentAndPlanSectionProcedureEntry(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Assessment And Plan Section Procedure Entry</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHITSPAssessmentAndPlanSectionProcedureEntry(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param assessmentAndPlanSection The receiving '<em><b>Assessment And Plan Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHITSPAssessmentAndPlanSectionProcedureEntry(
			AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ASSESSMENT_AND_PLAN_SECTION);
			try {
				VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			assessmentAndPlanSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ASSESSMENT_AND_PLAN_SECTION__HITSP_ASSESSMENT_AND_PLAN_SECTION_PROCEDURE_ENTRY,
					HITSPPlugin.INSTANCE.getString("HITSPAssessmentAndPlanSectionProcedureEntry"),
					new Object[] { assessmentAndPlanSection }));
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
	protected static final String GET_MEDICATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(hitsp::Medication)).oclAsType(hitsp::Medication)";

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
	* @generated
	*/
	public static EList<Medication> getMedications(AssessmentAndPlanSection assessmentAndPlanSection) {
		if (GET_MEDICATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				HITSPPackage.Literals.ASSESSMENT_AND_PLAN_SECTION,
				HITSPPackage.Literals.ASSESSMENT_AND_PLAN_SECTION.getEAllOperations().get(64));
			try {
				GET_MEDICATIONS__EOCL_QRY = helper.createQuery(GET_MEDICATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Medication> result = (Collection<Medication>) query.evaluate(assessmentAndPlanSection);
		return new BasicEList.UnmodifiableEList<Medication>(result.size(), result.toArray());
	}

	/**
	* The cached OCL expression body for the '{@link #getImmunizations(AssessmentAndPlanSection) <em>Get Immunizations</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getImmunizations(AssessmentAndPlanSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_IMMUNIZATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(hitsp::Immunization)).oclAsType(hitsp::Immunization)";

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
	* @generated
	*/
	public static EList<Immunization> getImmunizations(AssessmentAndPlanSection assessmentAndPlanSection) {
		if (GET_IMMUNIZATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				HITSPPackage.Literals.ASSESSMENT_AND_PLAN_SECTION,
				HITSPPackage.Literals.ASSESSMENT_AND_PLAN_SECTION.getEAllOperations().get(65));
			try {
				GET_IMMUNIZATIONS__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Immunization> result = (Collection<Immunization>) query.evaluate(assessmentAndPlanSection);
		return new BasicEList.UnmodifiableEList<Immunization>(result.size(), result.toArray());
	}

	/**
	* The cached OCL expression body for the '{@link #getEncounterEntries(AssessmentAndPlanSection) <em>Get Encounter Entries</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getEncounterEntries(AssessmentAndPlanSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_ENCOUNTER_ENTRIES__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(hitsp::Encounter)).oclAsType(hitsp::Encounter)";

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
	* @generated
	*/
	public static EList<Encounter> getEncounterEntries(AssessmentAndPlanSection assessmentAndPlanSection) {
		if (GET_ENCOUNTER_ENTRIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				HITSPPackage.Literals.ASSESSMENT_AND_PLAN_SECTION,
				HITSPPackage.Literals.ASSESSMENT_AND_PLAN_SECTION.getEAllOperations().get(66));
			try {
				GET_ENCOUNTER_ENTRIES__EOCL_QRY = helper.createQuery(GET_ENCOUNTER_ENTRIES__EOCL_EXP);
			} catch (ParserException pe) {
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
	protected static final String GET_PROCEDURE_ENTRIES__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(hitsp::Procedure)).oclAsType(hitsp::Procedure)";

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
	* @generated
	*/
	public static EList<Procedure> getProcedureEntries(AssessmentAndPlanSection assessmentAndPlanSection) {
		if (GET_PROCEDURE_ENTRIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				HITSPPackage.Literals.ASSESSMENT_AND_PLAN_SECTION,
				HITSPPackage.Literals.ASSESSMENT_AND_PLAN_SECTION.getEAllOperations().get(67));
			try {
				GET_PROCEDURE_ENTRIES__EOCL_QRY = helper.createQuery(GET_PROCEDURE_ENTRIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_ENTRIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Procedure> result = (Collection<Procedure>) query.evaluate(assessmentAndPlanSection);
		return new BasicEList.UnmodifiableEList<Procedure>(result.size(), result.toArray());
	}

} // AssessmentAndPlanSectionOperations
