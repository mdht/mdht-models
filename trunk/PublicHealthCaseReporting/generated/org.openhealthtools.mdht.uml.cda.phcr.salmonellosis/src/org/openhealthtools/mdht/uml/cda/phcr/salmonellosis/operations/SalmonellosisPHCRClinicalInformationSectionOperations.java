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
package org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPackage;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.util.SalmonellosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Clinical Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRClinicalInformationSection#validateSalmonellosisPHCRClinicalInformationSectionSalmonellosisCaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis PHCR Clinical Information Section Salmonellosis Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRClinicalInformationSection#getSalmonellosisCaseObservation() <em>Get Salmonellosis Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRClinicalInformationSection#validatePhcrClinicalInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SalmonellosisPHCRClinicalInformationSectionOperations extends PhcrClinicalInformationSectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SalmonellosisPHCRClinicalInformationSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateSalmonellosisPHCRClinicalInformationSectionSalmonellosisCaseObservation(SalmonellosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis PHCR Clinical Information Section Salmonellosis Case Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSalmonellosisPHCRClinicalInformationSectionSalmonellosisCaseObservation(SalmonellosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SALMONELLOSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(salmonellosis::SalmonellosisCaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateSalmonellosisPHCRClinicalInformationSectionSalmonellosisCaseObservation(SalmonellosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis PHCR Clinical Information Section Salmonellosis Case Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSalmonellosisPHCRClinicalInformationSectionSalmonellosisCaseObservation(SalmonellosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SALMONELLOSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(salmonellosis::SalmonellosisCaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param salmonellosisPHCRClinicalInformationSection The receiving '<em><b>PHCR Clinical Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateSalmonellosisPHCRClinicalInformationSectionSalmonellosisCaseObservation(SalmonellosisPHCRClinicalInformationSection salmonellosisPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SALMONELLOSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SalmonellosisPackage.Literals.SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION);
      try
      {
        VALIDATE_SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SALMONELLOSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SALMONELLOSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SALMONELLOSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(salmonellosisPHCRClinicalInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SalmonellosisValidator.DIAGNOSTIC_SOURCE,
             SalmonellosisValidator.SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION__SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SALMONELLOSIS_CASE_OBSERVATION,
             SalmonellosisPlugin.INSTANCE.getString("SalmonellosisPHCRClinicalInformationSectionSalmonellosisCaseObservation"),
             new Object [] { salmonellosisPHCRClinicalInformationSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getSalmonellosisCaseObservation(SalmonellosisPHCRClinicalInformationSection) <em>Get Salmonellosis Case Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSalmonellosisCaseObservation(SalmonellosisPHCRClinicalInformationSection)
   * @generated
   * @ordered
   */
	protected static final String GET_SALMONELLOSIS_CASE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(salmonellosis::SalmonellosisCaseObservation))->asSequence()->first().oclAsType(salmonellosis::SalmonellosisCaseObservation)";

	/**
   * The cached OCL query for the '{@link #getSalmonellosisCaseObservation(SalmonellosisPHCRClinicalInformationSection) <em>Get Salmonellosis Case Observation</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSalmonellosisCaseObservation(SalmonellosisPHCRClinicalInformationSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_SALMONELLOSIS_CASE_OBSERVATION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(salmonellosis::SalmonellosisCaseObservation))->asSequence()->first().oclAsType(salmonellosis::SalmonellosisCaseObservation)
   * @param salmonellosisPHCRClinicalInformationSection The receiving '<em><b>PHCR Clinical Information Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  SalmonellosisCaseObservation getSalmonellosisCaseObservation(SalmonellosisPHCRClinicalInformationSection salmonellosisPHCRClinicalInformationSection) {
    if (GET_SALMONELLOSIS_CASE_OBSERVATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SalmonellosisPackage.Literals.SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION, SalmonellosisPackage.Literals.SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION.getEAllOperations().get(69));
      try
      {
        GET_SALMONELLOSIS_CASE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_SALMONELLOSIS_CASE_OBSERVATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SALMONELLOSIS_CASE_OBSERVATION__EOCL_QRY);
    return (SalmonellosisCaseObservation) query.evaluate(salmonellosisPHCRClinicalInformationSection);
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhcrClinicalInformationSectionTemplateId(SalmonellosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhcrClinicalInformationSectionTemplateId(SalmonellosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.37')";

  /**
   * The cached OCL invariant for the '{@link #validatePhcrClinicalInformationSectionTemplateId(SalmonellosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhcrClinicalInformationSectionTemplateId(SalmonellosisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.37')
   * @param salmonellosisPHCRClinicalInformationSection The receiving '<em><b>PHCR Clinical Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePhcrClinicalInformationSectionTemplateId(SalmonellosisPHCRClinicalInformationSection salmonellosisPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SalmonellosisPackage.Literals.SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION);
      try
      {
        VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(salmonellosisPHCRClinicalInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SalmonellosisValidator.DIAGNOSTIC_SOURCE,
             SalmonellosisValidator.SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhcrClinicalInformationSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(salmonellosisPHCRClinicalInformationSection, context) }),
             new Object [] { salmonellosisPHCRClinicalInformationSection }));
      }
       
      return false;
    }
    return true;
  }

} // SalmonellosisPHCRClinicalInformationSectionOperations