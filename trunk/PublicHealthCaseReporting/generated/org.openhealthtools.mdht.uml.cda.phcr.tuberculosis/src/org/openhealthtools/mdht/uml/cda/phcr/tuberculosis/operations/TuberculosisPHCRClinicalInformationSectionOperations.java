/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrClinicalInformationSectionOperations;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPlugin;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisRelevantMedicalConditionHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.util.TuberculosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Clinical Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRClinicalInformationSection#validateTuberculosisPHCRClinicalInformationSectionTuberculosisCaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Clinical Information Section Tuberculosis Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRClinicalInformationSection#validateTuberculosisPHCRClinicalInformationSectionTuberculosisRelevantMedicalConditionHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Clinical Information Section Tuberculosis Relevant Medical Condition History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRClinicalInformationSection#getTuberculosisCaseObservation() <em>Get Tuberculosis Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRClinicalInformationSection#getTuberculosisRelevantMedicalConditionHistoryObservations() <em>Get Tuberculosis Relevant Medical Condition History Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRClinicalInformationSection#validatePhcrClinicalInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TuberculosisPHCRClinicalInformationSectionOperations extends PhcrClinicalInformationSectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TuberculosisPHCRClinicalInformationSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateTuberculosisPHCRClinicalInformationSectionTuberculosisCaseObservation(TuberculosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Clinical Information Section Tuberculosis Case Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTuberculosisPHCRClinicalInformationSectionTuberculosisCaseObservation(TuberculosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION_TUBERCULOSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(tuberculosis::TuberculosisCaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateTuberculosisPHCRClinicalInformationSectionTuberculosisCaseObservation(TuberculosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Clinical Information Section Tuberculosis Case Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTuberculosisPHCRClinicalInformationSectionTuberculosisCaseObservation(TuberculosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION_TUBERCULOSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tuberculosisPHCRClinicalInformationSection The receiving '<em><b>PHCR Clinical Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateTuberculosisPHCRClinicalInformationSectionTuberculosisCaseObservation(TuberculosisPHCRClinicalInformationSection tuberculosisPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION_TUBERCULOSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION);
      try
      {
        VALIDATE_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION_TUBERCULOSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION_TUBERCULOSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION_TUBERCULOSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisPHCRClinicalInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             TuberculosisValidator.DIAGNOSTIC_SOURCE,
             TuberculosisValidator.TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION__TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION_TUBERCULOSIS_CASE_OBSERVATION,
             TuberculosisPlugin.INSTANCE.getString("TuberculosisPHCRClinicalInformationSectionTuberculosisCaseObservation"),
             new Object [] { tuberculosisPHCRClinicalInformationSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateTuberculosisPHCRClinicalInformationSectionTuberculosisRelevantMedicalConditionHistoryObservation(TuberculosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Clinical Information Section Tuberculosis Relevant Medical Condition History Observation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTuberculosisPHCRClinicalInformationSectionTuberculosisRelevantMedicalConditionHistoryObservation(TuberculosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION_TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(tuberculosis::TuberculosisRelevantMedicalConditionHistoryObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

  /**
   * The cached OCL invariant for the '{@link #validateTuberculosisPHCRClinicalInformationSectionTuberculosisRelevantMedicalConditionHistoryObservation(TuberculosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Clinical Information Section Tuberculosis Relevant Medical Condition History Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTuberculosisPHCRClinicalInformationSectionTuberculosisRelevantMedicalConditionHistoryObservation(TuberculosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION_TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tuberculosisPHCRClinicalInformationSection The receiving '<em><b>PHCR Clinical Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateTuberculosisPHCRClinicalInformationSectionTuberculosisRelevantMedicalConditionHistoryObservation(TuberculosisPHCRClinicalInformationSection tuberculosisPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION_TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION);
      try
      {
        VALIDATE_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION_TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION_TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION_TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisPHCRClinicalInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             TuberculosisValidator.DIAGNOSTIC_SOURCE,
             TuberculosisValidator.TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION__TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION_TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION,
             TuberculosisPlugin.INSTANCE.getString("TuberculosisPHCRClinicalInformationSectionTuberculosisRelevantMedicalConditionHistoryObservation"),
             new Object [] { tuberculosisPHCRClinicalInformationSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getTuberculosisCaseObservation(TuberculosisPHCRClinicalInformationSection) <em>Get Tuberculosis Case Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTuberculosisCaseObservation(TuberculosisPHCRClinicalInformationSection)
   * @generated
   * @ordered
   */
	protected static final String GET_TUBERCULOSIS_CASE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tuberculosis::TuberculosisCaseObservation))->asSequence()->any(true).oclAsType(tuberculosis::TuberculosisCaseObservation)";

	/**
   * The cached OCL query for the '{@link #getTuberculosisCaseObservation(TuberculosisPHCRClinicalInformationSection) <em>Get Tuberculosis Case Observation</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTuberculosisCaseObservation(TuberculosisPHCRClinicalInformationSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_TUBERCULOSIS_CASE_OBSERVATION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  TuberculosisCaseObservation getTuberculosisCaseObservation(TuberculosisPHCRClinicalInformationSection tuberculosisPHCRClinicalInformationSection) {
    if (GET_TUBERCULOSIS_CASE_OBSERVATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION, TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION.getEAllOperations().get(71));
      try
      {
        GET_TUBERCULOSIS_CASE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_TUBERCULOSIS_CASE_OBSERVATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TUBERCULOSIS_CASE_OBSERVATION__EOCL_QRY);
    return (TuberculosisCaseObservation) query.evaluate(tuberculosisPHCRClinicalInformationSection);
  }

	/**
   * The cached OCL expression body for the '{@link #getTuberculosisRelevantMedicalConditionHistoryObservations(TuberculosisPHCRClinicalInformationSection) <em>Get Tuberculosis Relevant Medical Condition History Observations</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTuberculosisRelevantMedicalConditionHistoryObservations(TuberculosisPHCRClinicalInformationSection)
   * @generated
   * @ordered
   */
  protected static final String GET_TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tuberculosis::TuberculosisRelevantMedicalConditionHistoryObservation)).oclAsType(tuberculosis::TuberculosisRelevantMedicalConditionHistoryObservation)";

  /**
   * The cached OCL query for the '{@link #getTuberculosisRelevantMedicalConditionHistoryObservations(TuberculosisPHCRClinicalInformationSection) <em>Get Tuberculosis Relevant Medical Condition History Observations</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTuberculosisRelevantMedicalConditionHistoryObservations(TuberculosisPHCRClinicalInformationSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATIONS__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<TuberculosisRelevantMedicalConditionHistoryObservation> getTuberculosisRelevantMedicalConditionHistoryObservations(TuberculosisPHCRClinicalInformationSection tuberculosisPHCRClinicalInformationSection)
  {
    if (GET_TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION, TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION.getEAllOperations().get(72));
      try
      {
        GET_TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<TuberculosisRelevantMedicalConditionHistoryObservation> result = (Collection<TuberculosisRelevantMedicalConditionHistoryObservation>) query.evaluate(tuberculosisPHCRClinicalInformationSection);
    return new BasicEList.UnmodifiableEList<TuberculosisRelevantMedicalConditionHistoryObservation>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhcrClinicalInformationSectionTemplateId(TuberculosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrClinicalInformationSectionTemplateId(TuberculosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.5')";

	/**
   * The cached OCL invariant for the '{@link #validatePhcrClinicalInformationSectionTemplateId(TuberculosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrClinicalInformationSectionTemplateId(TuberculosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tuberculosisPHCRClinicalInformationSection The receiving '<em><b>PHCR Clinical Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePhcrClinicalInformationSectionTemplateId(TuberculosisPHCRClinicalInformationSection tuberculosisPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION);
      try
      {
        VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisPHCRClinicalInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             TuberculosisValidator.DIAGNOSTIC_SOURCE,
             TuberculosisValidator.TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhcrClinicalInformationSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tuberculosisPHCRClinicalInformationSection, context) }),
             new Object [] { tuberculosisPHCRClinicalInformationSection }));
      }
       
      return false;
    }
    return true;
  }

} // TuberculosisPHCRClinicalInformationSectionOperations