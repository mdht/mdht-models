/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Clinical Office Visit Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryReasonforVisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Reasonfor Visit</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryCarePlanning(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Care Planning</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryDateOfvisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Date Ofvisit</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryVisitLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Visit Location</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryProviderNameAndContactInfo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Provider Name And Contact
 * Info</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryVitalSigns(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Vital Signs</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionOrMedicationsSectionER(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Medications Administered Section
 * Or Medications Section ER</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Problem Section</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryAllergiesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Allergies Section</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Results Section</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Procedures Section</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Immunizations Section</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Instructions Section</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummarySocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Social History Section</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#retrieveInstructionsSection()
 * <em>Retrieve Instructions Section</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#retrieveMedicationsAdministeredSection()
 * <em>Retrieve Medications Administered Section</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getProblemSection()
 * <em>Get Problem Section</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getMedicationsSection()
 * <em>Get Medications Section</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getAllergiesSection()
 * <em>Get Allergies Section</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getResultsSection()
 * <em>Get Results Section</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getProceduresSection()
 * <em>Get Procedures Section</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getImmunizationsSection()
 * <em>Get Immunizations Section</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getInstructionsSection()
 * <em>Get Instructions Section</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getSocialHistorySection()
 * <em>Get Social History Section</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getMedicationsAdministeredSection()
 * <em>Get Medications Administered Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClinicalOfficeVisitSummaryOperations extends GeneralHeaderConstraintsOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ClinicalOfficeVisitSummaryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the
	 * '{@link #validateClinicalOfficeVisitSummaryReasonforVisit(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Reasonfor Visit</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryReasonforVisit(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASONFOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "((self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or "
			+ " self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor "
			+ " self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))) or self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSection)) or "
			+ "self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSectionEntriesOptional))";

	/**
	 * The cached OCL invariant for the
	 * '{@link #validateClinicalOfficeVisitSummaryReasonforVisit(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Reasonfor Visit</em>}'
	 * invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryReasonforVisit(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASONFOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryReasonforVisit(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASONFOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
			try {
				VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASONFOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV
						.set(helper.createInvariant(
								VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASONFOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get()
				.createQuery(
						VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASONFOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get())
				.check(clinicalOfficeVisitSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Mu2consolValidator.DIAGNOSTIC_SOURCE,
						Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_REASONFOR_VISIT,
						Mu2consolPlugin.INSTANCE
								.getString("ClinicalOfficeVisitSummaryClinicalOfficeVisitSummaryReasonforVisit"),
						new Object[] { clinicalOfficeVisitSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the
	 * '{@link #validateClinicalOfficeVisitSummaryCarePlanning(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Care Planning</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryCarePlanning(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::PlanOfCareSection)) or "
			+ "self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::AssessmentAndPlanSection)))";

	/**
	 * The cached OCL invariant for the
	 * '{@link #validateClinicalOfficeVisitSummaryCarePlanning(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Care Planning</em>}' invariant
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryCarePlanning(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(mu2consol::PlanOfCareSection)) or
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(mu2consol::AssessmentAndPlanSection)) or
	 * self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and
	 * s.oclIsTypeOf(consol::InterventionsSection)))
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryCarePlanning(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
			try {
				VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV
						.set(helper.createInvariant(
								VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get()
				.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get())
				.check(clinicalOfficeVisitSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Mu2consolValidator.DIAGNOSTIC_SOURCE,
						Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING,
						Mu2consolPlugin.INSTANCE
								.getString("ClinicalOfficeVisitSummaryClinicalOfficeVisitSummaryCarePlanning"),
						new Object[] { clinicalOfficeVisitSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the
	 * '{@link #validateClinicalOfficeVisitSummaryDateOfvisit(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Date Ofvisit</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryDateOfvisit(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_DATE_OFVISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.documentationOf.oclAsType(cda::DocumentationOf).serviceEvent->notEmpty() and self.documentationOf.serviceEvent->forAll((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies not effectiveTime.oclIsUndefined())) or (self.componentOf.oclAsType(cda::Component1).encompassingEncounter->notEmpty() and self.componentOf.encompassingEncounter->forAll((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies not effectiveTime.oclIsUndefined())) or (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSection)) or "
			+ "self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the
	 * '{@link #validateClinicalOfficeVisitSummaryDateOfvisit(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Date Ofvisit</em>}' invariant
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryDateOfvisit(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_DATE_OFVISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryDateOfvisit(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_DATE_OFVISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
			try {
				VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_DATE_OFVISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV
						.set(helper.createInvariant(
								VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_DATE_OFVISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get()
				.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_DATE_OFVISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get())
				.check(clinicalOfficeVisitSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Mu2consolValidator.DIAGNOSTIC_SOURCE,
						Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_DATE_OFVISIT,
						Mu2consolPlugin.INSTANCE
								.getString("ClinicalOfficeVisitSummaryClinicalOfficeVisitSummaryDateOfvisit"),
						new Object[] { clinicalOfficeVisitSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the
	 * '{@link #validateClinicalOfficeVisitSummaryVisitLocation(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Visit Location</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryVisitLocation(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VISIT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.componentOf.oclAsType(cda::Component1).encompassingEncounter->notEmpty() and self.componentOf.encompassingEncounter->forAll(location->notEmpty() and location.oclIsTypeOf(cda::Location))) or (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSection)) or "
			+ "self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the
	 * '{@link #validateClinicalOfficeVisitSummaryVisitLocation(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Visit Location</em>}'
	 * invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryVisitLocation(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VISIT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryVisitLocation(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VISIT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
			try {
				VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VISIT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV
						.set(helper.createInvariant(
								VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VISIT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get()
				.createQuery(
						VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VISIT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get())
				.check(clinicalOfficeVisitSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Mu2consolValidator.DIAGNOSTIC_SOURCE,
						Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_VISIT_LOCATION,
						Mu2consolPlugin.INSTANCE
								.getString("ClinicalOfficeVisitSummaryClinicalOfficeVisitSummaryVisitLocation"),
						new Object[] { clinicalOfficeVisitSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the
	 * '{@link #validateClinicalOfficeVisitSummaryProviderNameAndContactInfo(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Provider Name And Contact
	 * Info</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryProviderNameAndContactInfo(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->notEmpty() and self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->exists(assignedEntity->excluding(null).assignedPerson->excluding(null).name->notEmpty() and assignedEntity->excluding(null).addr->notEmpty() and assignedEntity->excluding(null).telecom->notEmpty())) or (self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->notEmpty() and self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->exists(assignedEntity->excluding(null).assignedPerson->excluding(null).name->notEmpty() and assignedEntity->excluding(null).addr->notEmpty() and assignedEntity->excluding(null).telecom->notEmpty())) or (self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->notEmpty() and self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->exists(assignedEntity->excluding(null).assignedPerson->excluding(null).name->notEmpty() and assignedEntity->excluding(null).addr->notEmpty() and assignedEntity->excluding(null).telecom->notEmpty()))";

	/**
	 * The cached OCL invariant for the
	 * '{@link #validateClinicalOfficeVisitSummaryProviderNameAndContactInfo(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Provider Name And Contact
	 * Info</em>}' invariant operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryProviderNameAndContactInfo(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryProviderNameAndContactInfo(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV
				.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
			try {
				VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV
						.set(helper.createInvariant(
								VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get()
				.createQuery(
						VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV
								.get())
				.check(clinicalOfficeVisitSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Mu2consolValidator.DIAGNOSTIC_SOURCE,
						Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO,
						Mu2consolPlugin.INSTANCE.getString(
								"ClinicalOfficeVisitSummaryClinicalOfficeVisitSummaryProviderNameAndContactInfo"),
						new Object[] { clinicalOfficeVisitSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the
	 * '{@link #validateClinicalOfficeVisitSummaryVitalSigns(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Vital Signs</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryVitalSigns(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::VitalSignsSection)) or "
			+ "self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::VitalSignsSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the
	 * '{@link #validateClinicalOfficeVisitSummaryVitalSigns(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Vital Signs</em>}' invariant
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryVitalSigns(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryVitalSigns(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
			try {
				VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV
						.set(helper.createInvariant(
								VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get()
				.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get())
				.check(clinicalOfficeVisitSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Mu2consolValidator.DIAGNOSTIC_SOURCE,
						Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS,
						Mu2consolPlugin.INSTANCE
								.getString("ClinicalOfficeVisitSummaryClinicalOfficeVisitSummaryVitalSigns"),
						new Object[] { clinicalOfficeVisitSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the
	 * '{@link #validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionOrMedicationsSectionER(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Medications Administered
	 * Section Or Medications Section ER</em>}' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionOrMedicationsSectionER(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION_OR_MEDICATIONS_SECTION_ER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::MedicationsAdministeredSection)) or self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))";

	/**
	 * The cached OCL invariant for the
	 * '{@link #validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionOrMedicationsSectionER(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Medications Administered
	 * Section Or Medications Section ER</em>}' invariant operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionOrMedicationsSectionER(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION_OR_MEDICATIONS_SECTION_ER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionOrMedicationsSectionER(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION_OR_MEDICATIONS_SECTION_ER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV
				.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
			try {
				VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION_OR_MEDICATIONS_SECTION_ER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV
						.set(helper.createInvariant(
								VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION_OR_MEDICATIONS_SECTION_ER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get()
				.createQuery(
						VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION_OR_MEDICATIONS_SECTION_ER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV
								.get())
				.check(clinicalOfficeVisitSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Mu2consolValidator.DIAGNOSTIC_SOURCE,
						Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION_OR_MEDICATIONS_SECTION_ER,
						Mu2consolPlugin.INSTANCE.getString(
								"ClinicalOfficeVisitSummaryClinicalOfficeVisitSummaryMedicationsAdministeredSectionOrMedicationsSectionER"),
						new Object[] { clinicalOfficeVisitSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::SocialHistorySection))
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummarySocialHistorySection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV
				.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
			try {
				VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV
						.set(helper.createInvariant(
								VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
				VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get())
				.check(clinicalOfficeVisitSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Mu2consolValidator.DIAGNOSTIC_SOURCE,
						Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION,
						Mu2consolPlugin.INSTANCE
								.getString("ClinicalOfficeVisitSummaryClinicalOfficeVisitSummarySocialHistorySection"),
						new Object[] { clinicalOfficeVisitSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the
	 * '{@link #validateClinicalOfficeVisitSummaryProblemSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Problem Section</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryProblemSection(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))";

	/**
	 * The cached OCL invariant for the
	 * '{@link #validateClinicalOfficeVisitSummaryProblemSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Problem Section</em>}'
	 * invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryProblemSection(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryProblemSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
			try {
				VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV
						.set(helper.createInvariant(
								VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get()
				.createQuery(
						VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get())
				.check(clinicalOfficeVisitSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Mu2consolValidator.DIAGNOSTIC_SOURCE,
						Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION,
						Mu2consolPlugin.INSTANCE
								.getString("ClinicalOfficeVisitSummaryClinicalOfficeVisitSummaryProblemSection"),
						new Object[] { clinicalOfficeVisitSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the
	 * '{@link #validateClinicalOfficeVisitSummaryAllergiesSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Allergies Section</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryAllergiesSection(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))";

	/**
	 * The cached OCL invariant for the
	 * '{@link #validateClinicalOfficeVisitSummaryAllergiesSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Allergies Section</em>}'
	 * invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryAllergiesSection(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::AllergiesSection))
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryAllergiesSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
			try {
				VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV
						.set(helper.createInvariant(
								VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get()
				.createQuery(
						VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get())
				.check(clinicalOfficeVisitSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Mu2consolValidator.DIAGNOSTIC_SOURCE,
						Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_ALLERGIES_SECTION,
						Mu2consolPlugin.INSTANCE
								.getString("ClinicalOfficeVisitSummaryClinicalOfficeVisitSummaryAllergiesSection"),
						new Object[] { clinicalOfficeVisitSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the
	 * '{@link #validateClinicalOfficeVisitSummaryResultsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Results Section</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryResultsSection(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::ResultsSection))";

	/**
	 * The cached OCL invariant for the
	 * '{@link #validateClinicalOfficeVisitSummaryResultsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Results Section</em>}'
	 * invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryResultsSection(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryResultsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
			try {
				VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV
						.set(helper.createInvariant(
								VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get()
				.createQuery(
						VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get())
				.check(clinicalOfficeVisitSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Mu2consolValidator.DIAGNOSTIC_SOURCE,
						Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION,
						Mu2consolPlugin.INSTANCE
								.getString("ClinicalOfficeVisitSummaryClinicalOfficeVisitSummaryResultsSection"),
						new Object[] { clinicalOfficeVisitSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the
	 * '{@link #validateClinicalOfficeVisitSummaryProceduresSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Procedures Section</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryProceduresSection(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::ProceduresSection))";

	/**
	 * The cached OCL invariant for the
	 * '{@link #validateClinicalOfficeVisitSummaryProceduresSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Procedures Section</em>}'
	 * invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryProceduresSection(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ProceduresSection))
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryProceduresSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
			try {
				VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV
						.set(helper.createInvariant(
								VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get()
				.createQuery(
						VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get())
				.check(clinicalOfficeVisitSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Mu2consolValidator.DIAGNOSTIC_SOURCE,
						Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION,
						Mu2consolPlugin.INSTANCE
								.getString("ClinicalOfficeVisitSummaryClinicalOfficeVisitSummaryProceduresSection"),
						new Object[] { clinicalOfficeVisitSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the
	 * '{@link #validateClinicalOfficeVisitSummaryImmunizationsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Immunizations Section</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryImmunizationsSection(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))";

	/**
	 * The cached OCL invariant for the
	 * '{@link #validateClinicalOfficeVisitSummaryImmunizationsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Immunizations Section</em>}'
	 * invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryImmunizationsSection(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ImmunizationsSection))
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryImmunizationsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV
				.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
			try {
				VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV
						.set(helper.createInvariant(
								VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
				VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get())
				.check(clinicalOfficeVisitSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Mu2consolValidator.DIAGNOSTIC_SOURCE,
						Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_IMMUNIZATIONS_SECTION,
						Mu2consolPlugin.INSTANCE
								.getString("ClinicalOfficeVisitSummaryClinicalOfficeVisitSummaryImmunizationsSection"),
						new Object[] { clinicalOfficeVisitSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the
	 * '{@link #validateClinicalOfficeVisitSummaryInstructionsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Instructions Section</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryInstructionsSection(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InstructionsSection))";

	/**
	 * The cached OCL invariant for the
	 * '{@link #validateClinicalOfficeVisitSummaryInstructionsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Instructions Section</em>}'
	 * invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummaryInstructionsSection(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the
	 * '{@link #validateClinicalOfficeVisitSummarySocialHistorySection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Social History Section</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummarySocialHistorySection(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::SocialHistorySection))";

	/**
	 * The cached OCL invariant for the
	 * '{@link #validateClinicalOfficeVisitSummarySocialHistorySection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Clinical Office Visit Summary Social History Section</em>}'
	 * invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateClinicalOfficeVisitSummarySocialHistorySection(ClinicalOfficeVisitSummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::InstructionsSection))
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateClinicalOfficeVisitSummaryInstructionsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
			try {
				VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV
						.set(helper.createInvariant(
								VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
				VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get())
				.check(clinicalOfficeVisitSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Mu2consolValidator.DIAGNOSTIC_SOURCE,
						Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION,
						Mu2consolPlugin.INSTANCE
								.getString("ClinicalOfficeVisitSummaryClinicalOfficeVisitSummaryInstructionsSection"),
						new Object[] { clinicalOfficeVisitSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::InstructionsSection
	 * ))->asSequence()->any(true).oclAsType(consol::InstructionsSection)
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static InstructionsSection retrieveInstructionsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {

		if (RETRIEVE_INSTRUCTIONS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY,
					Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(317));
			try {
				RETRIEVE_INSTRUCTIONS_SECTION__EOCL_QRY = helper.createQuery(RETRIEVE_INSTRUCTIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(RETRIEVE_INSTRUCTIONS_SECTION__EOCL_QRY);
		return (InstructionsSection) query.evaluate(clinicalOfficeVisitSummary);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::MedicationsAdministeredSection
	 * ))->asSequence()
	 * ->any(true).oclAsType(consol::MedicationsAdministeredSection)
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static MedicationsAdministeredSection retrieveMedicationsAdministeredSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {

		if (RETRIEVE_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY,
					Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(318));
			try {
				RETRIEVE_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY = helper
						.createQuery(RETRIEVE_MEDICATIONS_ADMINISTERED_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(RETRIEVE_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY);
		return (MedicationsAdministeredSection) query.evaluate(clinicalOfficeVisitSummary);
	}

	/**
	 * The cached OCL expression body for the
	 * '{@link #retrieveInstructionsSection(ClinicalOfficeVisitSummary)
	 * <em>Retrieve Instructions Section</em>}' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #retrieveInstructionsSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String RETRIEVE_INSTRUCTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InstructionsSection))->asSequence()->any(true).oclAsType(consol::InstructionsSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #retrieveInstructionsSection(ClinicalOfficeVisitSummary)
	 * <em>Retrieve Instructions Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #retrieveInstructionsSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> RETRIEVE_INSTRUCTIONS_SECTION__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '
	 * {@link #retrieveMedicationsAdministeredSection(ClinicalOfficeVisitSummary)
	 * <em>Retrieve Medications Administered Section</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #retrieveMedicationsAdministeredSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String RETRIEVE_MEDICATIONS_ADMINISTERED_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsAdministeredSection))->asSequence()->any(true).oclAsType(consol::MedicationsAdministeredSection)";

	/**
	 * The cached OCL query for the
	 * '{@link #retrieveMedicationsAdministeredSection(ClinicalOfficeVisitSummary)
	 * <em>Retrieve Medications Administered Section</em>}' query operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #retrieveMedicationsAdministeredSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> RETRIEVE_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::SocialHistorySection
	 * ))->asSequence()->any(true).oclAsType(mu2consol::SocialHistorySection)
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static SocialHistorySection getSocialHistorySection(ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {

		if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY,
					Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(326));
			try {
				GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (SocialHistorySection) query.evaluate(clinicalOfficeVisitSummary);
	}

	/**
	 * The cached OCL expression body for the
	 * '{@link #getProblemSection(ClinicalOfficeVisitSummary) <em>Get Problem
	 * Section</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getProblemSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))->asSequence()->any(true).oclAsType(consol::ProblemSection)";

	/**
	 * The cached OCL query for the
	 * '{@link #getProblemSection(ClinicalOfficeVisitSummary) <em>Get Problem
	 * Section</em>}' query operation. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see #getProblemSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ProblemSection))-
	 * >asSequence()->any(true).oclAsType(consol::ProblemSection)
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ProblemSection getProblemSection(ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {

		if (GET_PROBLEM_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY,
					Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(319));
			try {
				GET_PROBLEM_SECTION__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROBLEM_SECTION__EOCL_QRY);
		return (ProblemSection) query.evaluate(clinicalOfficeVisitSummary);
	}

	/**
	 * The cached OCL expression body for the
	 * '{@link #getMedicationsSection(ClinicalOfficeVisitSummary) <em>Get
	 * Medications Section</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getMedicationsSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->any(true).oclAsType(consol::MedicationsSection)";

	/**
	 * The cached OCL query for the
	 * '{@link #getMedicationsSection(ClinicalOfficeVisitSummary) <em>Get
	 * Medications Section</em>}' query operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getMedicationsSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::MedicationsSection
	 * ))->asSequence()->any(true).oclAsType(consol::MedicationsSection)
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static MedicationsSection getMedicationsSection(ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {

		if (GET_MEDICATIONS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY,
					Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(320));
			try {
				GET_MEDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MEDICATIONS_SECTION__EOCL_QRY);
		return (MedicationsSection) query.evaluate(clinicalOfficeVisitSummary);
	}

	/**
	 * The cached OCL expression body for the
	 * '{@link #getAllergiesSection(ClinicalOfficeVisitSummary) <em>Get
	 * Allergies Section</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getAllergiesSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))->asSequence()->any(true).oclAsType(consol::AllergiesSection)";

	/**
	 * The cached OCL query for the
	 * '{@link #getAllergiesSection(ClinicalOfficeVisitSummary) <em>Get
	 * Allergies Section</em>}' query operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getAllergiesSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::AllergiesSection)
	 * )->asSequence()->any(true).oclAsType(consol::AllergiesSection)
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static AllergiesSection getAllergiesSection(ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {

		if (GET_ALLERGIES_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY,
					Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(321));
			try {
				GET_ALLERGIES_SECTION__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ALLERGIES_SECTION__EOCL_QRY);
		return (AllergiesSection) query.evaluate(clinicalOfficeVisitSummary);
	}

	/**
	 * The cached OCL expression body for the
	 * '{@link #getResultsSection(ClinicalOfficeVisitSummary) <em>Get Results
	 * Section</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getResultsSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::ResultsSection))->asSequence()->any(true).oclAsType(mu2consol::ResultsSection)";

	/**
	 * The cached OCL query for the
	 * '{@link #getResultsSection(ClinicalOfficeVisitSummary) <em>Get Results
	 * Section</em>}' query operation. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see #getResultsSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ResultsSection))-
	 * >asSequence()->any(true).oclAsType(consol::ResultsSection)
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ResultsSection getResultsSection(ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {

		if (GET_RESULTS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY,
					Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(322));
			try {
				GET_RESULTS_SECTION__EOCL_QRY = helper.createQuery(GET_RESULTS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_RESULTS_SECTION__EOCL_QRY);
		return (ResultsSection) query.evaluate(clinicalOfficeVisitSummary);
	}

	/**
	 * The cached OCL expression body for the
	 * '{@link #getProceduresSection(ClinicalOfficeVisitSummary) <em>Get
	 * Procedures Section</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getProceduresSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::ProceduresSection))->asSequence()->any(true).oclAsType(mu2consol::ProceduresSection)";

	/**
	 * The cached OCL query for the
	 * '{@link #getProceduresSection(ClinicalOfficeVisitSummary) <em>Get
	 * Procedures Section</em>}' query operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getProceduresSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ProceduresSection
	 * ))->asSequence()->any(true).oclAsType(consol::ProceduresSection)
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ProceduresSection getProceduresSection(ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {

		if (GET_PROCEDURES_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY,
					Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(323));
			try {
				GET_PROCEDURES_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROCEDURES_SECTION__EOCL_QRY);
		return (ProceduresSection) query.evaluate(clinicalOfficeVisitSummary);
	}

	/**
	 * The cached OCL expression body for the
	 * '{@link #getImmunizationsSection(ClinicalOfficeVisitSummary) <em>Get
	 * Immunizations Section</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getImmunizationsSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))->asSequence()->any(true).oclAsType(consol::ImmunizationsSection)";

	/**
	 * The cached OCL query for the
	 * '{@link #getImmunizationsSection(ClinicalOfficeVisitSummary) <em>Get
	 * Immunizations Section</em>}' query operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getImmunizationsSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ImmunizationsSection
	 * ))->asSequence()->any(true).oclAsType(consol::ImmunizationsSection)
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ImmunizationsSection getImmunizationsSection(ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {

		if (GET_IMMUNIZATIONS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY,
					Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(324));
			try {
				GET_IMMUNIZATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_QRY);
		return (ImmunizationsSection) query.evaluate(clinicalOfficeVisitSummary);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::MedicationsAdministeredSection
	 * ))->asSequence
	 * ()->any(true).oclAsType(mu2consol::MedicationsAdministeredSection)
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection getMedicationsAdministeredSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {

		if (GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY,
					Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(327));
			try {
				GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY = helper
						.createQuery(GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY);
		return (org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection) query
				.evaluate(clinicalOfficeVisitSummary);
	}

	/**
	 * The cached OCL expression body for the
	 * '{@link #getInstructionsSection(ClinicalOfficeVisitSummary) <em>Get
	 * Instructions Section</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getInstructionsSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INSTRUCTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InstructionsSection))->asSequence()->any(true).oclAsType(consol::InstructionsSection)";

	/**
	 * The cached OCL query for the
	 * '{@link #getInstructionsSection(ClinicalOfficeVisitSummary) <em>Get
	 * Instructions Section</em>}' query operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getInstructionsSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INSTRUCTIONS_SECTION__EOCL_QRY;

	/**
	 * The cached OCL expression body for the
	 * '{@link #getSocialHistorySection(ClinicalOfficeVisitSummary) <em>Get
	 * Social History Section</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getSocialHistorySection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::SocialHistorySection))->asSequence()->any(true).oclAsType(mu2consol::SocialHistorySection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getSocialHistorySection(ClinicalOfficeVisitSummary) <em>Get
	 * Social History Section</em>}' query operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getSocialHistorySection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '
	 * {@link #getMedicationsAdministeredSection(ClinicalOfficeVisitSummary)
	 * <em>Get Medications Administered Section</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getMedicationsAdministeredSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::MedicationsAdministeredSection))->asSequence()->any(true).oclAsType(mu2consol::MedicationsAdministeredSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getMedicationsAdministeredSection(ClinicalOfficeVisitSummary)
	 * <em>Get Medications Administered Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getMedicationsAdministeredSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::InstructionsSection
	 * ))->asSequence()->any(true).oclAsType(consol::InstructionsSection)
	 *
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static InstructionsSection getInstructionsSection(ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {

		if (GET_INSTRUCTIONS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY,
					Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(325));
			try {
				GET_INSTRUCTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_INSTRUCTIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_INSTRUCTIONS_SECTION__EOCL_QRY);
		return (InstructionsSection) query.evaluate(clinicalOfficeVisitSummary);
	}

} // ClinicalOfficeVisitSummaryOperations