/**
 * Copyright (C) 2009, OFFIS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * This software and supporting documentation were developed by
 * 
 *   OFFIS e.V.
 *   Escherweg 2, 26121 Oldenburg
 *  
 * THIS SOFTWARE IS MADE AVAILABLE,  AS IS,  AND OFFIS 
 * MAKES NO  WARRANTY REGARDING  THE  SOFTWARE,  ITS  PERFORMANCE,  ITS  
 * MERCHANTABILITY  OR FITNESS FOR ANY PARTICULAR USE, FREEDOM FROM ANY 
 * COMPUTER DISEASES  OR ITS CONFORMITY TO ANY SPECIFICATION. THE ENTIRE RISK 
 * AS TO QUALITY AND PERFORMANCE OF THE SOFTWARE IS WITH THE USER.
 *  
 * Author:  "Myriam Lipprandt <myriam.lipprandt@offis.de>", OFFIS e.V.
 * Date: 2011-12-14
 * 
 */
package org.openhealthtools.mdht.uml.cda.phmr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeSection;

import org.openhealthtools.mdht.uml.cda.phmr.MedicalEquipment;
import org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPlugin;
import org.openhealthtools.mdht.uml.cda.phmr.Results;
import org.openhealthtools.mdht.uml.cda.phmr.VitalSigns;

import org.openhealthtools.mdht.uml.cda.phmr.util.PhmrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Personal Healthcare Monitoring Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#validatePersonalHealthcareMonitoringReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#validatePersonalHealthcareMonitoringReportVitalSigns(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Vital Signs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#validatePersonalHealthcareMonitoringReportResults(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#validatePersonalHealthcareMonitoringReportMedicalEquipment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Medical Equipment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#validatePersonalHealthcareMonitoringReportFunctionalStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Functional Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#validatePersonalHealthcareMonitoringReportMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#validatePersonalHealthcareMonitoringReportPurpose(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Purpose</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#getVitalSigns() <em>Get Vital Signs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#getResults() <em>Get Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#getMedicalEquipment() <em>Get Medical Equipment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#getFunctionalStatus() <em>Get Functional Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#getMedication() <em>Get Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PersonalHealthcareMonitoringReport#getPurpose() <em>Get Purpose</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonalHealthcareMonitoringReportOperations extends GeneralHeaderConstraintsOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PersonalHealthcareMonitoringReportOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validatePersonalHealthcareMonitoringReportTemplateId(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePersonalHealthcareMonitoringReportTemplateId(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.9')";

	/**
   * The cached OCL invariant for the '{@link #validatePersonalHealthcareMonitoringReportTemplateId(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePersonalHealthcareMonitoringReportTemplateId(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param personalHealthcareMonitoringReport The receiving '<em><b>Personal Healthcare Monitoring Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePersonalHealthcareMonitoringReportTemplateId(PersonalHealthcareMonitoringReport personalHealthcareMonitoringReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.PERSONAL_HEALTHCARE_MONITORING_REPORT);
      try
      {
        VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(personalHealthcareMonitoringReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.PERSONAL_HEALTHCARE_MONITORING_REPORT__PERSONAL_HEALTHCARE_MONITORING_REPORT_TEMPLATE_ID,
             PhmrPlugin.INSTANCE.getString("PersonalHealthcareMonitoringReportTemplateId"),
             new Object [] { personalHealthcareMonitoringReport }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePersonalHealthcareMonitoringReportVitalSigns(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Vital Signs</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePersonalHealthcareMonitoringReportVitalSigns(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phmr::VitalSigns))";

	/**
   * The cached OCL invariant for the '{@link #validatePersonalHealthcareMonitoringReportVitalSigns(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Vital Signs</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePersonalHealthcareMonitoringReportVitalSigns(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param personalHealthcareMonitoringReport The receiving '<em><b>Personal Healthcare Monitoring Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePersonalHealthcareMonitoringReportVitalSigns(PersonalHealthcareMonitoringReport personalHealthcareMonitoringReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.PERSONAL_HEALTHCARE_MONITORING_REPORT);
      try
      {
        VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(personalHealthcareMonitoringReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.PERSONAL_HEALTHCARE_MONITORING_REPORT__PERSONAL_HEALTHCARE_MONITORING_REPORT_VITAL_SIGNS,
             PhmrPlugin.INSTANCE.getString("PersonalHealthcareMonitoringReportVitalSigns"),
             new Object [] { personalHealthcareMonitoringReport }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePersonalHealthcareMonitoringReportResults(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Results</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePersonalHealthcareMonitoringReportResults(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_RESULTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phmr::Results))";

	/**
   * The cached OCL invariant for the '{@link #validatePersonalHealthcareMonitoringReportResults(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Results</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePersonalHealthcareMonitoringReportResults(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_RESULTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param personalHealthcareMonitoringReport The receiving '<em><b>Personal Healthcare Monitoring Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePersonalHealthcareMonitoringReportResults(PersonalHealthcareMonitoringReport personalHealthcareMonitoringReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_RESULTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.PERSONAL_HEALTHCARE_MONITORING_REPORT);
      try
      {
        VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_RESULTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_RESULTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_RESULTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(personalHealthcareMonitoringReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.PERSONAL_HEALTHCARE_MONITORING_REPORT__PERSONAL_HEALTHCARE_MONITORING_REPORT_RESULTS,
             PhmrPlugin.INSTANCE.getString("PersonalHealthcareMonitoringReportResults"),
             new Object [] { personalHealthcareMonitoringReport }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePersonalHealthcareMonitoringReportMedicalEquipment(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Medical Equipment</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePersonalHealthcareMonitoringReportMedicalEquipment(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_MEDICAL_EQUIPMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phmr::MedicalEquipment))";

	/**
   * The cached OCL invariant for the '{@link #validatePersonalHealthcareMonitoringReportMedicalEquipment(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Medical Equipment</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePersonalHealthcareMonitoringReportMedicalEquipment(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_MEDICAL_EQUIPMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param personalHealthcareMonitoringReport The receiving '<em><b>Personal Healthcare Monitoring Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePersonalHealthcareMonitoringReportMedicalEquipment(PersonalHealthcareMonitoringReport personalHealthcareMonitoringReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_MEDICAL_EQUIPMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.PERSONAL_HEALTHCARE_MONITORING_REPORT);
      try
      {
        VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_MEDICAL_EQUIPMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_MEDICAL_EQUIPMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_MEDICAL_EQUIPMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(personalHealthcareMonitoringReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.PERSONAL_HEALTHCARE_MONITORING_REPORT__PERSONAL_HEALTHCARE_MONITORING_REPORT_MEDICAL_EQUIPMENT,
             PhmrPlugin.INSTANCE.getString("PersonalHealthcareMonitoringReportMedicalEquipment"),
             new Object [] { personalHealthcareMonitoringReport }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePersonalHealthcareMonitoringReportFunctionalStatus(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Functional Status</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePersonalHealthcareMonitoringReportFunctionalStatus(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_FUNCTIONAL_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::FunctionalStatusSection))";

	/**
   * The cached OCL invariant for the '{@link #validatePersonalHealthcareMonitoringReportFunctionalStatus(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Functional Status</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePersonalHealthcareMonitoringReportFunctionalStatus(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_FUNCTIONAL_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param personalHealthcareMonitoringReport The receiving '<em><b>Personal Healthcare Monitoring Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePersonalHealthcareMonitoringReportFunctionalStatus(PersonalHealthcareMonitoringReport personalHealthcareMonitoringReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_FUNCTIONAL_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.PERSONAL_HEALTHCARE_MONITORING_REPORT);
      try
      {
        VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_FUNCTIONAL_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_FUNCTIONAL_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_FUNCTIONAL_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(personalHealthcareMonitoringReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.PERSONAL_HEALTHCARE_MONITORING_REPORT__PERSONAL_HEALTHCARE_MONITORING_REPORT_FUNCTIONAL_STATUS,
             PhmrPlugin.INSTANCE.getString("PersonalHealthcareMonitoringReportFunctionalStatus"),
             new Object [] { personalHealthcareMonitoringReport }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePersonalHealthcareMonitoringReportMedication(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Medication</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePersonalHealthcareMonitoringReportMedication(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::MedicationsSection))";

	/**
   * The cached OCL invariant for the '{@link #validatePersonalHealthcareMonitoringReportMedication(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Medication</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePersonalHealthcareMonitoringReportMedication(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param personalHealthcareMonitoringReport The receiving '<em><b>Personal Healthcare Monitoring Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePersonalHealthcareMonitoringReportMedication(PersonalHealthcareMonitoringReport personalHealthcareMonitoringReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.PERSONAL_HEALTHCARE_MONITORING_REPORT);
      try
      {
        VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(personalHealthcareMonitoringReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.PERSONAL_HEALTHCARE_MONITORING_REPORT__PERSONAL_HEALTHCARE_MONITORING_REPORT_MEDICATION,
             PhmrPlugin.INSTANCE.getString("PersonalHealthcareMonitoringReportMedication"),
             new Object [] { personalHealthcareMonitoringReport }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePersonalHealthcareMonitoringReportPurpose(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Purpose</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePersonalHealthcareMonitoringReportPurpose(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_PURPOSE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::PurposeSection))";

	/**
   * The cached OCL invariant for the '{@link #validatePersonalHealthcareMonitoringReportPurpose(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Healthcare Monitoring Report Purpose</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePersonalHealthcareMonitoringReportPurpose(PersonalHealthcareMonitoringReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_PURPOSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param personalHealthcareMonitoringReport The receiving '<em><b>Personal Healthcare Monitoring Report</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePersonalHealthcareMonitoringReportPurpose(PersonalHealthcareMonitoringReport personalHealthcareMonitoringReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_PURPOSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.PERSONAL_HEALTHCARE_MONITORING_REPORT);
      try
      {
        VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_PURPOSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_PURPOSE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PERSONAL_HEALTHCARE_MONITORING_REPORT_PURPOSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(personalHealthcareMonitoringReport))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.PERSONAL_HEALTHCARE_MONITORING_REPORT__PERSONAL_HEALTHCARE_MONITORING_REPORT_PURPOSE,
             PhmrPlugin.INSTANCE.getString("PersonalHealthcareMonitoringReportPurpose"),
             new Object [] { personalHealthcareMonitoringReport }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getVitalSigns(PersonalHealthcareMonitoringReport) <em>Get Vital Signs</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getVitalSigns(PersonalHealthcareMonitoringReport)
   * @generated
   * @ordered
   */
	protected static final String GET_VITAL_SIGNS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phmr::VitalSigns))->asSequence()->any(true).oclAsType(phmr::VitalSigns)";

	/**
   * The cached OCL query for the '{@link #getVitalSigns(PersonalHealthcareMonitoringReport) <em>Get Vital Signs</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getVitalSigns(PersonalHealthcareMonitoringReport)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static  VitalSigns getVitalSigns(PersonalHealthcareMonitoringReport personalHealthcareMonitoringReport) {
    if (GET_VITAL_SIGNS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(PhmrPackage.Literals.PERSONAL_HEALTHCARE_MONITORING_REPORT, PhmrPackage.Literals.PERSONAL_HEALTHCARE_MONITORING_REPORT.getEAllOperations().get(62));
      try
      {
        GET_VITAL_SIGNS__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS__EOCL_QRY);
    return (VitalSigns) query.evaluate(personalHealthcareMonitoringReport);
  }

	/**
   * The cached OCL expression body for the '{@link #getResults(PersonalHealthcareMonitoringReport) <em>Get Results</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getResults(PersonalHealthcareMonitoringReport)
   * @generated
   * @ordered
   */
	protected static final String GET_RESULTS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phmr::Results))->asSequence()->any(true).oclAsType(phmr::Results)";

	/**
   * The cached OCL query for the '{@link #getResults(PersonalHealthcareMonitoringReport) <em>Get Results</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getResults(PersonalHealthcareMonitoringReport)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_RESULTS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static  Results getResults(PersonalHealthcareMonitoringReport personalHealthcareMonitoringReport) {
    if (GET_RESULTS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(PhmrPackage.Literals.PERSONAL_HEALTHCARE_MONITORING_REPORT, PhmrPackage.Literals.PERSONAL_HEALTHCARE_MONITORING_REPORT.getEAllOperations().get(63));
      try
      {
        GET_RESULTS__EOCL_QRY = helper.createQuery(GET_RESULTS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS__EOCL_QRY);
    return (Results) query.evaluate(personalHealthcareMonitoringReport);
  }

	/**
   * The cached OCL expression body for the '{@link #getMedicalEquipment(PersonalHealthcareMonitoringReport) <em>Get Medical Equipment</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMedicalEquipment(PersonalHealthcareMonitoringReport)
   * @generated
   * @ordered
   */
	protected static final String GET_MEDICAL_EQUIPMENT__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phmr::MedicalEquipment))->asSequence()->any(true).oclAsType(phmr::MedicalEquipment)";

	/**
   * The cached OCL query for the '{@link #getMedicalEquipment(PersonalHealthcareMonitoringReport) <em>Get Medical Equipment</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMedicalEquipment(PersonalHealthcareMonitoringReport)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_MEDICAL_EQUIPMENT__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static  MedicalEquipment getMedicalEquipment(PersonalHealthcareMonitoringReport personalHealthcareMonitoringReport) {
    if (GET_MEDICAL_EQUIPMENT__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(PhmrPackage.Literals.PERSONAL_HEALTHCARE_MONITORING_REPORT, PhmrPackage.Literals.PERSONAL_HEALTHCARE_MONITORING_REPORT.getEAllOperations().get(64));
      try
      {
        GET_MEDICAL_EQUIPMENT__EOCL_QRY = helper.createQuery(GET_MEDICAL_EQUIPMENT__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MEDICAL_EQUIPMENT__EOCL_QRY);
    return (MedicalEquipment) query.evaluate(personalHealthcareMonitoringReport);
  }

	/**
   * The cached OCL expression body for the '{@link #getFunctionalStatus(PersonalHealthcareMonitoringReport) <em>Get Functional Status</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFunctionalStatus(PersonalHealthcareMonitoringReport)
   * @generated
   * @ordered
   */
	protected static final String GET_FUNCTIONAL_STATUS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::FunctionalStatusSection))->asSequence()->any(true).oclAsType(ccd::FunctionalStatusSection)";

	/**
   * The cached OCL query for the '{@link #getFunctionalStatus(PersonalHealthcareMonitoringReport) <em>Get Functional Status</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFunctionalStatus(PersonalHealthcareMonitoringReport)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static  FunctionalStatusSection getFunctionalStatus(PersonalHealthcareMonitoringReport personalHealthcareMonitoringReport) {
    if (GET_FUNCTIONAL_STATUS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(PhmrPackage.Literals.PERSONAL_HEALTHCARE_MONITORING_REPORT, PhmrPackage.Literals.PERSONAL_HEALTHCARE_MONITORING_REPORT.getEAllOperations().get(65));
      try
      {
        GET_FUNCTIONAL_STATUS__EOCL_QRY = helper.createQuery(GET_FUNCTIONAL_STATUS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_FUNCTIONAL_STATUS__EOCL_QRY);
    return (FunctionalStatusSection) query.evaluate(personalHealthcareMonitoringReport);
  }

	/**
   * The cached OCL expression body for the '{@link #getMedication(PersonalHealthcareMonitoringReport) <em>Get Medication</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMedication(PersonalHealthcareMonitoringReport)
   * @generated
   * @ordered
   */
	protected static final String GET_MEDICATION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::MedicationsSection))->asSequence()->any(true).oclAsType(ccd::MedicationsSection)";

	/**
   * The cached OCL query for the '{@link #getMedication(PersonalHealthcareMonitoringReport) <em>Get Medication</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMedication(PersonalHealthcareMonitoringReport)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_MEDICATION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static  MedicationsSection getMedication(PersonalHealthcareMonitoringReport personalHealthcareMonitoringReport) {
    if (GET_MEDICATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(PhmrPackage.Literals.PERSONAL_HEALTHCARE_MONITORING_REPORT, PhmrPackage.Literals.PERSONAL_HEALTHCARE_MONITORING_REPORT.getEAllOperations().get(66));
      try
      {
        GET_MEDICATION__EOCL_QRY = helper.createQuery(GET_MEDICATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION__EOCL_QRY);
    return (MedicationsSection) query.evaluate(personalHealthcareMonitoringReport);
  }

	/**
   * The cached OCL expression body for the '{@link #getPurpose(PersonalHealthcareMonitoringReport) <em>Get Purpose</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPurpose(PersonalHealthcareMonitoringReport)
   * @generated
   * @ordered
   */
	protected static final String GET_PURPOSE__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::PurposeSection))->asSequence()->any(true).oclAsType(ccd::PurposeSection)";

	/**
   * The cached OCL query for the '{@link #getPurpose(PersonalHealthcareMonitoringReport) <em>Get Purpose</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPurpose(PersonalHealthcareMonitoringReport)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_PURPOSE__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static  PurposeSection getPurpose(PersonalHealthcareMonitoringReport personalHealthcareMonitoringReport) {
    if (GET_PURPOSE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(PhmrPackage.Literals.PERSONAL_HEALTHCARE_MONITORING_REPORT, PhmrPackage.Literals.PERSONAL_HEALTHCARE_MONITORING_REPORT.getEAllOperations().get(67));
      try
      {
        GET_PURPOSE__EOCL_QRY = helper.createQuery(GET_PURPOSE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PURPOSE__EOCL_QRY);
    return (PurposeSection) query.evaluate(personalHealthcareMonitoringReport);
  }

} // PersonalHealthcareMonitoringReportOperations