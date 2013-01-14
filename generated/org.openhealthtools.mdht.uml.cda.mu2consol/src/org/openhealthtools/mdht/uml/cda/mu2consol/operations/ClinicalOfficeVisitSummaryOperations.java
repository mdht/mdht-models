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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryReasonForOfficeVisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Reason For Office Visit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryCarePlanning(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Care Planning</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryInstructionsEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Instructions Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryMedicationsAdministeredEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Medications Administered Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryAllergiesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryMedicationsAdministeredSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryChiefComplaintAndReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryAssessmentAndPlanSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummarySocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#retrievePlanOfCareSection() <em>Retrieve Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#retrieveInstructionsSection() <em>Retrieve Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#retrieveMedicationsAdministeredSection() <em>Retrieve Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getAllergiesSection() <em>Get Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getResultsSection() <em>Get Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getProceduresSection() <em>Get Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getMedicationsAdministeredSection() <em>Get Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getReasonForVisitSection() <em>Get Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getChiefComplaintAndReasonForVisitSection() <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getAssessmentAndPlanSection() <em>Get Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getInstructionsSection() <em>Get Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClinicalOfficeVisitSummaryOperations extends
		GeneralHeaderConstraintsOperations {
	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	protected ClinicalOfficeVisitSummaryOperations() {
    super();
  }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self
	 * .componentOf->excluding(null).encompassingEncounter->excluding(null)->
	 * reject(responsibleParty->one(responsibleParty :
	 * 
	 * cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and
	 * responsibleParty.oclIsKindOf(rim::Participation)))
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

	@SuppressWarnings("unchecked")
	public static boolean validateClinicalOfficeVisitSummaryResponsibleParty(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    Object oclResult = VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(clinicalOfficeVisitSummary);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_RESPONSIBLE_PARTY,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryResponsibleParty"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryResponsibleParty(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Responsible Party</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryResponsibleParty(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(responsibleParty->one(responsibleParty : "+
"cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(rim::Participation)))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryResponsibleParty(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Responsible Party</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryResponsibleParty(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Query<?, ?, ?> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self
	 * .componentOf->excluding(null).encompassingEncounter->excluding(null)->
	 * reject(location->one(location : cda::Location | not
	 * 
	 * location.oclIsUndefined() and location.oclIsKindOf(rim::Participation)))
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

	@SuppressWarnings("unchecked")
	public static boolean validateClinicalOfficeVisitSummaryLocation(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    Object oclResult = VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(clinicalOfficeVisitSummary);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_LOCATION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryLocation"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryReasonForOfficeVisit(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Reason For Office Visit</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryReasonForOfficeVisit(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_OFFICE_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or "+
" self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor "+
" self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryReasonForOfficeVisit(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Reason For Office Visit</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryReasonForOfficeVisit(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_OFFICE_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ChiefComplaintSection)) or
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ReasonForVisitSection))) xor
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))
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

	public static boolean validateClinicalOfficeVisitSummaryReasonForOfficeVisit(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_OFFICE_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_OFFICE_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_OFFICE_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_OFFICE_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_OFFICE_VISIT,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryReasonForOfficeVisit"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryCarePlanning(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Care Planning</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryCarePlanning(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::PlanOfCareSection)) or "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(mu2consol::AssessmentAndPlanSection)))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryCarePlanning(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Care Planning</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryCarePlanning(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryCarePlanning"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryEffectiveTime(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Effective Time</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryEffectiveTime(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or "+
"effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryEffectiveTime(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryEffectiveTime(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Query<?, ?, ?> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryLocation(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Location</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryLocation(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(location->one(location : cda::Location | "+
"not location.oclIsUndefined() and location.oclIsKindOf(rim::Participation)))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryLocation(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Location</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryLocation(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Query<?, ?, ?> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self
	 * .componentOf->excluding(null).encompassingEncounter->excluding(null)->
	 * reject((effectiveTime.oclIsUndefined() or
	 * 
	 * effectiveTime.isNullFlavorUndefined()) implies (not
	 * effectiveTime.oclIsUndefined()))
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
	@SuppressWarnings("unchecked")
	public static boolean validateClinicalOfficeVisitSummaryEffectiveTime(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    Object oclResult = VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(clinicalOfficeVisitSummary);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_EFFECTIVE_TIME,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryEffectiveTime"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryInstructionsEntry(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Instructions Entry</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryInstructionsEntry(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.retrieveInstructionsSection()->excluding(null)->reject(retrieveInstructionsSection().getActs()->exists(a : cda::Act | a.oclIsKindOf(consol::Instructions)))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryInstructionsEntry(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Instructions Entry</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryInstructionsEntry(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Query<?, ?, ?> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.retrieveInstructionsSection()->excluding(null)->reject(
	 * retrieveInstructionsSection().getActs()->exists(a : cda::Act |
	 * a.oclIsKindOf(consol::Instructions)))
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
	@SuppressWarnings("unchecked")
	public static boolean validateClinicalOfficeVisitSummaryInstructionsEntry(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    Object oclResult = VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(clinicalOfficeVisitSummary);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_ENTRY,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryInstructionsEntry"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryMedicationsAdministeredEntry(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Medications Administered Entry</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryMedicationsAdministeredEntry(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.retrieveMedicationsAdministeredSection()->excluding(null)->reject(retrieveMedicationsAdministeredSection().getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.oclIsKindOf(consol::MedicationActivity)))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryMedicationsAdministeredEntry(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Medications Administered Entry</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryMedicationsAdministeredEntry(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Query<?, ?, ?> VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.retrieveMedicationsAdministeredSection()->excluding(null)->reject(
	 * retrieveMedicationsAdministeredSection
	 * ().getSubstanceAdministrations()->exists(sa :
	 * cda::SubstanceAdministration |
	 * sa.oclIsKindOf(consol::MedicationActivity)))
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
	@SuppressWarnings("unchecked")
	public static boolean validateClinicalOfficeVisitSummaryMedicationsAdministeredEntry(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    Object oclResult = VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(clinicalOfficeVisitSummary);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_ENTRY,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryMedicationsAdministeredEntry"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
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
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummarySocialHistorySection"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryProblemSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Problem Section</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryProblemSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryProblemSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Problem Section</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryProblemSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryProblemSection"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryMedicationsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Medications Section</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryMedicationsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryMedicationsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Medications Section</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryMedicationsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::MedicationsSection))
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

	public static boolean validateClinicalOfficeVisitSummaryMedicationsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_SECTION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryMedicationsSection"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryAllergiesSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Allergies Section</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryAllergiesSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryAllergiesSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Allergies Section</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryAllergiesSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_ALLERGIES_SECTION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryAllergiesSection"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryResultsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Results Section</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryResultsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::ResultsSection))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryResultsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Results Section</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryResultsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryResultsSection"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryVitalSignsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Vital Signs Section</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryVitalSignsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryVitalSignsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Vital Signs Section</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryVitalSignsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::VitalSignsSection))
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

	public static boolean validateClinicalOfficeVisitSummaryVitalSignsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS_SECTION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryVitalSignsSection"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryPlanOfCareSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Plan Of Care Section</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryPlanOfCareSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PlanOfCareSection))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryPlanOfCareSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Plan Of Care Section</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryPlanOfCareSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::PlanOfCareSection))
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

	public static boolean validateClinicalOfficeVisitSummaryPlanOfCareSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_SECTION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryPlanOfCareSection"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryProceduresSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Procedures Section</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryProceduresSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::ProceduresSection))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryProceduresSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Procedures Section</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryProceduresSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryProceduresSection"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryImmunizationsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Immunizations Section</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryImmunizationsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryImmunizationsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Immunizations Section</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryImmunizationsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_IMMUNIZATIONS_SECTION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryImmunizationsSection"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryMedicationsAdministeredSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Medications Administered Section</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryMedicationsAdministeredSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsAdministeredSection))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryMedicationsAdministeredSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Medications Administered Section</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryMedicationsAdministeredSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::MedicationsAdministeredSection))
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

	public static boolean validateClinicalOfficeVisitSummaryMedicationsAdministeredSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryMedicationsAdministeredSection"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryReasonForVisitSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Reason For Visit Section</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryReasonForVisitSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryReasonForVisitSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Reason For Visit Section</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryReasonForVisitSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ReasonForVisitSection))
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

	public static boolean validateClinicalOfficeVisitSummaryReasonForVisitSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_VISIT_SECTION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryReasonForVisitSection"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryChiefComplaintSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Chief Complaint Section</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryChiefComplaintSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryChiefComplaintSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Chief Complaint Section</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryChiefComplaintSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ChiefComplaintSection))
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

	public static boolean validateClinicalOfficeVisitSummaryChiefComplaintSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_CHIEF_COMPLAINT_SECTION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryChiefComplaintSection"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryChiefComplaintAndReasonForVisitSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Chief Complaint And Reason For Visit Section</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryChiefComplaintAndReasonForVisitSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryChiefComplaintAndReasonForVisitSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Chief Complaint And Reason For Visit Section</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryChiefComplaintAndReasonForVisitSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))
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

	public static boolean validateClinicalOfficeVisitSummaryChiefComplaintAndReasonForVisitSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryChiefComplaintAndReasonForVisitSection"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryAssessmentAndPlanSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Assessment And Plan Section</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryAssessmentAndPlanSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::AssessmentAndPlanSection))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryAssessmentAndPlanSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Assessment And Plan Section</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryAssessmentAndPlanSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::AssessmentAndPlanSection))
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

	public static boolean validateClinicalOfficeVisitSummaryAssessmentAndPlanSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryAssessmentAndPlanSection"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummaryInstructionsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Instructions Section</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryInstructionsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InstructionsSection))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummaryInstructionsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Instructions Section</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummaryInstructionsSection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * The cached OCL expression body for the '{@link #validateClinicalOfficeVisitSummarySocialHistorySection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Social History Section</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummarySocialHistorySection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::SocialHistorySection))";

	/**
   * The cached OCL invariant for the '{@link #validateClinicalOfficeVisitSummarySocialHistorySection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Social History Section</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateClinicalOfficeVisitSummarySocialHistorySection(ClinicalOfficeVisitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY);
      try
      {
        VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(clinicalOfficeVisitSummary))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.CLINICAL_OFFICE_VISIT_SUMMARY__CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION,
             Mu2consolPlugin.INSTANCE.getString("ClinicalOfficeVisitSummaryInstructionsSection"),
             new Object [] { clinicalOfficeVisitSummary }));
      }
       
      return false;
    }
    return true;
  }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::PlanOfCareSection
	 * ))->asSequence()->any(true).oclAsType(mu2consol::PlanOfCareSection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static PlanOfCareSection retrievePlanOfCareSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (RETRIEVE_PLAN_OF_CARE_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(318));
      try
      {
        RETRIEVE_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(RETRIEVE_PLAN_OF_CARE_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(RETRIEVE_PLAN_OF_CARE_SECTION__EOCL_QRY);
    return (PlanOfCareSection) query.evaluate(clinicalOfficeVisitSummary);
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
    if (RETRIEVE_INSTRUCTIONS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(319));
      try
      {
        RETRIEVE_INSTRUCTIONS_SECTION__EOCL_QRY = helper.createQuery(RETRIEVE_INSTRUCTIONS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(RETRIEVE_INSTRUCTIONS_SECTION__EOCL_QRY);
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
    if (RETRIEVE_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(320));
      try
      {
        RETRIEVE_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY = helper.createQuery(RETRIEVE_MEDICATIONS_ADMINISTERED_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(RETRIEVE_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY);
    return (MedicationsAdministeredSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #retrievePlanOfCareSection(ClinicalOfficeVisitSummary) <em>Retrieve Plan Of Care Section</em>}' operation.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
   * @see #retrievePlanOfCareSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String RETRIEVE_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PlanOfCareSection))->asSequence()->any(true).oclAsType(mu2consol::PlanOfCareSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #retrievePlanOfCareSection(ClinicalOfficeVisitSummary)
	 * <em>Retrieve Plan Of Care Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #retrievePlanOfCareSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> RETRIEVE_PLAN_OF_CARE_SECTION__EOCL_QRY;

	/**
   * The cached OCL expression body for the '{@link #retrieveInstructionsSection(ClinicalOfficeVisitSummary) <em>Retrieve Instructions Section</em>}' operation.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
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
   * The cached OCL query for the '{@link #retrieveMedicationsAdministeredSection(ClinicalOfficeVisitSummary) <em>Retrieve Medications Administered Section</em>}' query operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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

	public static SocialHistorySection getSocialHistorySection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(335));
      try
      {
        GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
    return (SocialHistorySection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getProblemSection(ClinicalOfficeVisitSummary) <em>Get Problem Section</em>}' operation.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @see #getProblemSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_PROBLEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))->asSequence()->any(true).oclAsType(consol::ProblemSection)";

	/**
   * The cached OCL query for the '{@link #getProblemSection(ClinicalOfficeVisitSummary) <em>Get Problem Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

	public static ProblemSection getProblemSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_PROBLEM_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(321));
      try
      {
        GET_PROBLEM_SECTION__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_SECTION__EOCL_QRY);
    return (ProblemSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getMedicationsSection(ClinicalOfficeVisitSummary) <em>Get Medications Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMedicationsSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->any(true).oclAsType(consol::MedicationsSection)";

	/**
   * The cached OCL query for the '{@link #getMedicationsSection(ClinicalOfficeVisitSummary) <em>Get Medications Section</em>}' query operation.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
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

	public static MedicationsSection getMedicationsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_MEDICATIONS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(322));
      try
      {
        GET_MEDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_SECTION__EOCL_QRY);
    return (MedicationsSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getAllergiesSection(ClinicalOfficeVisitSummary) <em>Get Allergies Section</em>}' operation.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @see #getAllergiesSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_ALLERGIES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))->asSequence()->any(true).oclAsType(consol::AllergiesSection)";

	/**
   * The cached OCL query for the '{@link #getAllergiesSection(ClinicalOfficeVisitSummary) <em>Get Allergies Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

	public static AllergiesSection getAllergiesSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_ALLERGIES_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(323));
      try
      {
        GET_ALLERGIES_SECTION__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_SECTION__EOCL_QRY);
    return (AllergiesSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getResultsSection(ClinicalOfficeVisitSummary) <em>Get Results Section</em>}' operation.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @see #getResultsSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_RESULTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::ResultsSection))->asSequence()->any(true).oclAsType(mu2consol::ResultsSection)";

	/**
   * The cached OCL query for the '{@link #getResultsSection(ClinicalOfficeVisitSummary) <em>Get Results Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

	public static ResultsSection getResultsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_RESULTS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(324));
      try
      {
        GET_RESULTS_SECTION__EOCL_QRY = helper.createQuery(GET_RESULTS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS_SECTION__EOCL_QRY);
    return (ResultsSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getVitalSignsSection(ClinicalOfficeVisitSummary) <em>Get Vital Signs Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getVitalSignsSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))->asSequence()->any(true).oclAsType(consol::VitalSignsSection)";

	/**
   * The cached OCL query for the '{@link #getVitalSignsSection(ClinicalOfficeVisitSummary) <em>Get Vital Signs Section</em>}' query operation.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
   * @see #getVitalSignsSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::VitalSignsSection
	 * ))->asSequence()->any(true).oclAsType(consol::VitalSignsSection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static VitalSignsSection getVitalSignsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_VITAL_SIGNS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(325));
      try
      {
        GET_VITAL_SIGNS_SECTION__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_QRY);
    return (VitalSignsSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getPlanOfCareSection(ClinicalOfficeVisitSummary) <em>Get Plan Of Care Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPlanOfCareSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::PlanOfCareSection))->asSequence()->any(true).oclAsType(mu2consol::PlanOfCareSection)";

	/**
   * The cached OCL query for the '{@link #getPlanOfCareSection(ClinicalOfficeVisitSummary) <em>Get Plan Of Care Section</em>}' query operation.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
   * @see #getPlanOfCareSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::PlanOfCareSection
	 * ))->asSequence()->any(true).oclAsType(mu2consol::PlanOfCareSection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static PlanOfCareSection getPlanOfCareSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(326));
      try
      {
        GET_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_QRY);
    return (PlanOfCareSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getProceduresSection(ClinicalOfficeVisitSummary) <em>Get Procedures Section</em>}' operation.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @see #getProceduresSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_PROCEDURES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::ProceduresSection))->asSequence()->any(true).oclAsType(mu2consol::ProceduresSection)";

	/**
   * The cached OCL query for the '{@link #getProceduresSection(ClinicalOfficeVisitSummary) <em>Get Procedures Section</em>}' query operation.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
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

	public static ProceduresSection getProceduresSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_PROCEDURES_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(327));
      try
      {
        GET_PROCEDURES_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURES_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURES_SECTION__EOCL_QRY);
    return (ProceduresSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getImmunizationsSection(ClinicalOfficeVisitSummary) <em>Get Immunizations Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getImmunizationsSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_IMMUNIZATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))->asSequence()->any(true).oclAsType(consol::ImmunizationsSection)";

	/**
   * The cached OCL query for the '{@link #getImmunizationsSection(ClinicalOfficeVisitSummary) <em>Get Immunizations Section</em>}' query operation.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
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

	public static ImmunizationsSection getImmunizationsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_IMMUNIZATIONS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(328));
      try
      {
        GET_IMMUNIZATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_QRY);
    return (ImmunizationsSection) query.evaluate(clinicalOfficeVisitSummary);
  }

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
	protected static final String GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsAdministeredSection))->asSequence()->any(true).oclAsType(consol::MedicationsAdministeredSection)";

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
	 * section.oclIsKindOf(mu2consol::MedicationsAdministeredSection
	 * ))->asSequence
	 * ()->any(true).oclAsType(mu2consol::MedicationsAdministeredSection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static MedicationsAdministeredSection getMedicationsAdministeredSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(329));
      try
      {
        GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY);
    return (MedicationsAdministeredSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getReasonForVisitSection(ClinicalOfficeVisitSummary) <em>Get Reason For Visit Section</em>}' operation.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
   * @see #getReasonForVisitSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ReasonForVisitSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getReasonForVisitSection(ClinicalOfficeVisitSummary)
	 * <em>Get Reason For Visit Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReasonForVisitSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REASON_FOR_VISIT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ReasonForVisitSection
	 * ))->asSequence()->any(true).oclAsType(consol::ReasonForVisitSection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ReasonForVisitSection getReasonForVisitSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_REASON_FOR_VISIT_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(330));
      try
      {
        GET_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper.createQuery(GET_REASON_FOR_VISIT_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_REASON_FOR_VISIT_SECTION__EOCL_QRY);
    return (ReasonForVisitSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getChiefComplaintSection(ClinicalOfficeVisitSummary) <em>Get Chief Complaint Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getChiefComplaintSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getChiefComplaintSection(ClinicalOfficeVisitSummary)
	 * <em>Get Chief Complaint Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getChiefComplaintSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ChiefComplaintSection
	 * ))->asSequence()->any(true).oclAsType(consol::ChiefComplaintSection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ChiefComplaintSection getChiefComplaintSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(331));
      try
      {
        GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY);
    return (ChiefComplaintSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getChiefComplaintAndReasonForVisitSection(ClinicalOfficeVisitSummary) <em>Get Chief Complaint And Reason For Visit Section</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getChiefComplaintAndReasonForVisitSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintAndReasonForVisitSection)";

	/**
   * The cached OCL query for the '{@link #getChiefComplaintAndReasonForVisitSection(ClinicalOfficeVisitSummary) <em>Get Chief Complaint And Reason For Visit Section</em>}' query operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getChiefComplaintAndReasonForVisitSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection
	 * ))->asSequence
	 * ()->any(true).oclAsType(consol::ChiefComplaintAndReasonForVisitSection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(332));
      try
      {
        GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY);
    return (ChiefComplaintAndReasonForVisitSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getAssessmentAndPlanSection(ClinicalOfficeVisitSummary) <em>Get Assessment And Plan Section</em>}' operation.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
   * @see #getAssessmentAndPlanSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::AssessmentAndPlanSection))->asSequence()->any(true).oclAsType(mu2consol::AssessmentAndPlanSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getAssessmentAndPlanSection(ClinicalOfficeVisitSummary)
	 * <em>Get Assessment And Plan Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAssessmentAndPlanSection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::AssessmentAndPlanSection
	 * ))->asSequence()->any
	 * (true).oclAsType(mu2consol::AssessmentAndPlanSection)
	 * 
	 * @param clinicalOfficeVisitSummary
	 *            The receiving '<em><b>Clinical Office Visit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static AssessmentAndPlanSection getAssessmentAndPlanSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(333));
      try
      {
        GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY);
    return (AssessmentAndPlanSection) query.evaluate(clinicalOfficeVisitSummary);
  }

	/**
   * The cached OCL expression body for the '{@link #getInstructionsSection(ClinicalOfficeVisitSummary) <em>Get Instructions Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInstructionsSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_INSTRUCTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InstructionsSection))->asSequence()->any(true).oclAsType(consol::InstructionsSection)";

	/**
   * The cached OCL query for the '{@link #getInstructionsSection(ClinicalOfficeVisitSummary) <em>Get Instructions Section</em>}' query operation.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
   * @see #getInstructionsSection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_INSTRUCTIONS_SECTION__EOCL_QRY;

	/**
   * The cached OCL expression body for the '{@link #getSocialHistorySection(ClinicalOfficeVisitSummary) <em>Get Social History Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSocialHistorySection(ClinicalOfficeVisitSummary)
   * @generated
   * @ordered
   */
	protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::SocialHistorySection))->asSequence()->any(true).oclAsType(mu2consol::SocialHistorySection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getSocialHistorySection(ClinicalOfficeVisitSummary)
	 * <em>Get Social History Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSocialHistorySection(ClinicalOfficeVisitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

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

	public static InstructionsSection getInstructionsSection(
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary) {
    if (GET_INSTRUCTIONS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY, Mu2consolPackage.Literals.CLINICAL_OFFICE_VISIT_SUMMARY.getEAllOperations().get(334));
      try
      {
        GET_INSTRUCTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_INSTRUCTIONS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_INSTRUCTIONS_SECTION__EOCL_QRY);
    return (InstructionsSection) query.evaluate(clinicalOfficeVisitSummary);
  }

} // ClinicalOfficeVisitSummaryOperations