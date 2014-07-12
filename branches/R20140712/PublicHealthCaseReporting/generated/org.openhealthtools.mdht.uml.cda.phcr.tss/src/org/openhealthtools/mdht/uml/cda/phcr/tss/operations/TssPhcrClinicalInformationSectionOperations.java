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
package org.openhealthtools.mdht.uml.cda.phcr.tss.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.tss.TssCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.tss.tssPackage;

import org.openhealthtools.mdht.uml.cda.phcr.tss.util.tssValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tss Phcr Clinical Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrClinicalInformationSection#validateTssPhcrClinicalInformationSectionTssCaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tss Phcr Clinical Information Section Tss Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrClinicalInformationSection#getTssCaseObservation() <em>Get Tss Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrClinicalInformationSection#validatePhcrClinicalInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TssPhcrClinicalInformationSectionOperations extends PhcrClinicalInformationSectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TssPhcrClinicalInformationSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateTssPhcrClinicalInformationSectionTssCaseObservation(TssPhcrClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tss Phcr Clinical Information Section Tss Case Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTssPhcrClinicalInformationSectionTssCaseObservation(TssPhcrClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_TSS_PHCR_CLINICAL_INFORMATION_SECTION_TSS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(tss::TssCaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateTssPhcrClinicalInformationSectionTssCaseObservation(TssPhcrClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tss Phcr Clinical Information Section Tss Case Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTssPhcrClinicalInformationSectionTssCaseObservation(TssPhcrClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_TSS_PHCR_CLINICAL_INFORMATION_SECTION_TSS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(tss::TssCaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param tssPhcrClinicalInformationSection The receiving '<em><b>Tss Phcr Clinical Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateTssPhcrClinicalInformationSectionTssCaseObservation(TssPhcrClinicalInformationSection tssPhcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_TSS_PHCR_CLINICAL_INFORMATION_SECTION_TSS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(tssPackage.Literals.TSS_PHCR_CLINICAL_INFORMATION_SECTION);
      try
      {
        VALIDATE_TSS_PHCR_CLINICAL_INFORMATION_SECTION_TSS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TSS_PHCR_CLINICAL_INFORMATION_SECTION_TSS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TSS_PHCR_CLINICAL_INFORMATION_SECTION_TSS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tssPhcrClinicalInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             tssValidator.DIAGNOSTIC_SOURCE,
             tssValidator.TSS_PHCR_CLINICAL_INFORMATION_SECTION__TSS_PHCR_CLINICAL_INFORMATION_SECTION_TSS_CASE_OBSERVATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateTssPhcrClinicalInformationSectionTssCaseObservation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tssPhcrClinicalInformationSection, context) }),
             new Object [] { tssPhcrClinicalInformationSection }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getTssCaseObservation(TssPhcrClinicalInformationSection) <em>Get Tss Case Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTssCaseObservation(TssPhcrClinicalInformationSection)
   * @generated
   * @ordered
   */
	protected static final String GET_TSS_CASE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tss::TssCaseObservation))->asSequence()->any(true).oclAsType(tss::TssCaseObservation)";

	/**
   * The cached OCL query for the '{@link #getTssCaseObservation(TssPhcrClinicalInformationSection) <em>Get Tss Case Observation</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTssCaseObservation(TssPhcrClinicalInformationSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_TSS_CASE_OBSERVATION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tss::TssCaseObservation))->asSequence()->any(true).oclAsType(tss::TssCaseObservation)
   * @param tssPhcrClinicalInformationSection The receiving '<em><b>Tss Phcr Clinical Information Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  TssCaseObservation getTssCaseObservation(TssPhcrClinicalInformationSection tssPhcrClinicalInformationSection) {
    if (GET_TSS_CASE_OBSERVATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(tssPackage.Literals.TSS_PHCR_CLINICAL_INFORMATION_SECTION, tssPackage.Literals.TSS_PHCR_CLINICAL_INFORMATION_SECTION.getEAllOperations().get(70));
      try
      {
        GET_TSS_CASE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_TSS_CASE_OBSERVATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TSS_CASE_OBSERVATION__EOCL_QRY);
    return (TssCaseObservation) query.evaluate(tssPhcrClinicalInformationSection);
  }

	/**
   * The cached OCL expression body for the '{@link #validatePhcrClinicalInformationSectionTemplateId(TssPhcrClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrClinicalInformationSectionTemplateId(TssPhcrClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.42')";

	/**
   * The cached OCL invariant for the '{@link #validatePhcrClinicalInformationSectionTemplateId(TssPhcrClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrClinicalInformationSectionTemplateId(TssPhcrClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.42')
   * @param tssPhcrClinicalInformationSection The receiving '<em><b>Tss Phcr Clinical Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePhcrClinicalInformationSectionTemplateId(TssPhcrClinicalInformationSection tssPhcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(tssPackage.Literals.TSS_PHCR_CLINICAL_INFORMATION_SECTION);
      try
      {
        VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tssPhcrClinicalInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             tssValidator.DIAGNOSTIC_SOURCE,
             tssValidator.TSS_PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePhcrClinicalInformationSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tssPhcrClinicalInformationSection, context) }),
             new Object [] { tssPhcrClinicalInformationSection }));
      }
      return false;
    }
    return true;
  }

} // TssPhcrClinicalInformationSectionOperations