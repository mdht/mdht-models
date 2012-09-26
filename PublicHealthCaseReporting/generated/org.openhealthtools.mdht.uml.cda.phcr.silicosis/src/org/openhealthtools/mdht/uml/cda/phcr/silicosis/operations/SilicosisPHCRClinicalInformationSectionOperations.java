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
package org.openhealthtools.mdht.uml.cda.phcr.silicosis.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrClinicalInformationSectionOperations;

import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisHistoryOfTuberculosisObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage;

import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.util.SilicosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Clinical Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRClinicalInformationSection#validateSilicosisPHCRClinicalInformationSectionSilicosisCaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis PHCR Clinical Information Section Silicosis Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRClinicalInformationSection#validateSilicosisPHCRClinicalInformationSectionSilicosisHistoryOfTuberculosisObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis PHCR Clinical Information Section Silicosis History Of Tuberculosis Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRClinicalInformationSection#getSilicosisCaseObservation() <em>Get Silicosis Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRClinicalInformationSection#getSilicosisHistoryOfTuberculosisObservation() <em>Get Silicosis History Of Tuberculosis Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRClinicalInformationSection#validatePhcrClinicalInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SilicosisPHCRClinicalInformationSectionOperations extends PhcrClinicalInformationSectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SilicosisPHCRClinicalInformationSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateSilicosisPHCRClinicalInformationSectionSilicosisCaseObservation(SilicosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis PHCR Clinical Information Section Silicosis Case Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSilicosisPHCRClinicalInformationSectionSilicosisCaseObservation(SilicosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SILICOSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(silicosis::SilicosisCaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateSilicosisPHCRClinicalInformationSectionSilicosisCaseObservation(SilicosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis PHCR Clinical Information Section Silicosis Case Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSilicosisPHCRClinicalInformationSectionSilicosisCaseObservation(SilicosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SILICOSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(silicosis::SilicosisCaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param silicosisPHCRClinicalInformationSection The receiving '<em><b>PHCR Clinical Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateSilicosisPHCRClinicalInformationSectionSilicosisCaseObservation(SilicosisPHCRClinicalInformationSection silicosisPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SILICOSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SilicosisPackage.Literals.SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION);
      try
      {
        VALIDATE_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SILICOSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SILICOSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SILICOSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisPHCRClinicalInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SilicosisValidator.DIAGNOSTIC_SOURCE,
             SilicosisValidator.SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION__SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SILICOSIS_CASE_OBSERVATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSilicosisPHCRClinicalInformationSectionSilicosisCaseObservation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(silicosisPHCRClinicalInformationSection, context) }),
             new Object [] { silicosisPHCRClinicalInformationSection }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSilicosisPHCRClinicalInformationSectionSilicosisHistoryOfTuberculosisObservation(SilicosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis PHCR Clinical Information Section Silicosis History Of Tuberculosis Observation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSilicosisPHCRClinicalInformationSectionSilicosisHistoryOfTuberculosisObservation(SilicosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(silicosis::SilicosisHistoryOfTuberculosisObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

  /**
   * The cached OCL invariant for the '{@link #validateSilicosisPHCRClinicalInformationSectionSilicosisHistoryOfTuberculosisObservation(SilicosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis PHCR Clinical Information Section Silicosis History Of Tuberculosis Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSilicosisPHCRClinicalInformationSectionSilicosisHistoryOfTuberculosisObservation(SilicosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(silicosis::SilicosisHistoryOfTuberculosisObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param silicosisPHCRClinicalInformationSection The receiving '<em><b>PHCR Clinical Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSilicosisPHCRClinicalInformationSectionSilicosisHistoryOfTuberculosisObservation(SilicosisPHCRClinicalInformationSection silicosisPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SilicosisPackage.Literals.SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION);
      try
      {
        VALIDATE_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisPHCRClinicalInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SilicosisValidator.DIAGNOSTIC_SOURCE,
             SilicosisValidator.SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION__SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSilicosisPHCRClinicalInformationSectionSilicosisHistoryOfTuberculosisObservation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(silicosisPHCRClinicalInformationSection, context) }),
             new Object [] { silicosisPHCRClinicalInformationSection }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getSilicosisCaseObservation(SilicosisPHCRClinicalInformationSection) <em>Get Silicosis Case Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSilicosisCaseObservation(SilicosisPHCRClinicalInformationSection)
   * @generated
   * @ordered
   */
	protected static final String GET_SILICOSIS_CASE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(silicosis::SilicosisCaseObservation))->asSequence()->any(true).oclAsType(silicosis::SilicosisCaseObservation)";

	/**
   * The cached OCL query for the '{@link #getSilicosisCaseObservation(SilicosisPHCRClinicalInformationSection) <em>Get Silicosis Case Observation</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSilicosisCaseObservation(SilicosisPHCRClinicalInformationSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_SILICOSIS_CASE_OBSERVATION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(silicosis::SilicosisCaseObservation))->asSequence()->any(true).oclAsType(silicosis::SilicosisCaseObservation)
   * @param silicosisPHCRClinicalInformationSection The receiving '<em><b>PHCR Clinical Information Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  SilicosisCaseObservation getSilicosisCaseObservation(SilicosisPHCRClinicalInformationSection silicosisPHCRClinicalInformationSection) {
    if (GET_SILICOSIS_CASE_OBSERVATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SilicosisPackage.Literals.SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION, SilicosisPackage.Literals.SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION.getEAllOperations().get(71));
      try
      {
        GET_SILICOSIS_CASE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_SILICOSIS_CASE_OBSERVATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SILICOSIS_CASE_OBSERVATION__EOCL_QRY);
    return (SilicosisCaseObservation) query.evaluate(silicosisPHCRClinicalInformationSection);
  }

  /**
   * The cached OCL expression body for the '{@link #getSilicosisHistoryOfTuberculosisObservation(SilicosisPHCRClinicalInformationSection) <em>Get Silicosis History Of Tuberculosis Observation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSilicosisHistoryOfTuberculosisObservation(SilicosisPHCRClinicalInformationSection)
   * @generated
   * @ordered
   */
  protected static final String GET_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(silicosis::SilicosisHistoryOfTuberculosisObservation))->asSequence()->any(true).oclAsType(silicosis::SilicosisHistoryOfTuberculosisObservation)";

  /**
   * The cached OCL query for the '{@link #getSilicosisHistoryOfTuberculosisObservation(SilicosisPHCRClinicalInformationSection) <em>Get Silicosis History Of Tuberculosis Observation</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSilicosisHistoryOfTuberculosisObservation(SilicosisPHCRClinicalInformationSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(silicosis::SilicosisHistoryOfTuberculosisObservation))->asSequence()->any(true).oclAsType(silicosis::SilicosisHistoryOfTuberculosisObservation)
   * @param silicosisPHCRClinicalInformationSection The receiving '<em><b>PHCR Clinical Information Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  SilicosisHistoryOfTuberculosisObservation getSilicosisHistoryOfTuberculosisObservation(SilicosisPHCRClinicalInformationSection silicosisPHCRClinicalInformationSection)
  {
    if (GET_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SilicosisPackage.Literals.SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION, SilicosisPackage.Literals.SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION.getEAllOperations().get(72));
      try
      {
        GET_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION__EOCL_QRY);
    return (SilicosisHistoryOfTuberculosisObservation) query.evaluate(silicosisPHCRClinicalInformationSection);
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhcrClinicalInformationSectionTemplateId(SilicosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhcrClinicalInformationSectionTemplateId(SilicosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.34')";

  /**
   * The cached OCL invariant for the '{@link #validatePhcrClinicalInformationSectionTemplateId(SilicosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhcrClinicalInformationSectionTemplateId(SilicosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.34')
   * @param silicosisPHCRClinicalInformationSection The receiving '<em><b>PHCR Clinical Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhcrClinicalInformationSectionTemplateId(SilicosisPHCRClinicalInformationSection silicosisPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SilicosisPackage.Literals.SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION);
      try
      {
        VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisPHCRClinicalInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SilicosisValidator.DIAGNOSTIC_SOURCE,
             SilicosisValidator.SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePhcrClinicalInformationSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(silicosisPHCRClinicalInformationSection, context) }),
             new Object [] { silicosisPHCRClinicalInformationSection }));
      }
      return false;
    }
    return true;
  }

} // SilicosisPHCRClinicalInformationSectionOperations