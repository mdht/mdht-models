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
import org.openhealthtools.mdht.uml.cda.ccd.operations.ImmunizationsSectionOperations;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisImmunizationActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.util.TuberculosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Immunization Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRImmunizationSection#validateTuberculosisPHCRImmunizationSectionTuberculosisImmunizationActivitySubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Immunization Section Tuberculosis Immunization Activity Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRImmunizationSection#getTuberculosisImmunizationActivitySubstanceAdministrations() <em>Get Tuberculosis Immunization Activity Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRImmunizationSection#validateImmunizationsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TuberculosisPHCRImmunizationSectionOperations extends ImmunizationsSectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TuberculosisPHCRImmunizationSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateTuberculosisPHCRImmunizationSectionTuberculosisImmunizationActivitySubstanceAdministration(TuberculosisPHCRImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Immunization Section Tuberculosis Immunization Activity Substance Administration</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTuberculosisPHCRImmunizationSectionTuberculosisImmunizationActivitySubstanceAdministration(TuberculosisPHCRImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION_TUBERCULOSIS_IMMUNIZATION_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(tuberculosis::TuberculosisImmunizationActivitySubstanceAdministration) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

  /**
   * The cached OCL invariant for the '{@link #validateTuberculosisPHCRImmunizationSectionTuberculosisImmunizationActivitySubstanceAdministration(TuberculosisPHCRImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Immunization Section Tuberculosis Immunization Activity Substance Administration</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTuberculosisPHCRImmunizationSectionTuberculosisImmunizationActivitySubstanceAdministration(TuberculosisPHCRImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION_TUBERCULOSIS_IMMUNIZATION_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tuberculosisPHCRImmunizationSection The receiving '<em><b>PHCR Immunization Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateTuberculosisPHCRImmunizationSectionTuberculosisImmunizationActivitySubstanceAdministration(TuberculosisPHCRImmunizationSection tuberculosisPHCRImmunizationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION_TUBERCULOSIS_IMMUNIZATION_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION);
      try
      {
        VALIDATE_TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION_TUBERCULOSIS_IMMUNIZATION_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION_TUBERCULOSIS_IMMUNIZATION_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION_TUBERCULOSIS_IMMUNIZATION_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisPHCRImmunizationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             TuberculosisValidator.DIAGNOSTIC_SOURCE,
             TuberculosisValidator.TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION__TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION_TUBERCULOSIS_IMMUNIZATION_ACTIVITY_SUBSTANCE_ADMINISTRATION,
             TuberculosisPlugin.INSTANCE.getString("TuberculosisPHCRImmunizationSectionTuberculosisImmunizationActivitySubstanceAdministration"),
             new Object [] { tuberculosisPHCRImmunizationSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getTuberculosisImmunizationActivitySubstanceAdministrations(TuberculosisPHCRImmunizationSection) <em>Get Tuberculosis Immunization Activity Substance Administrations</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTuberculosisImmunizationActivitySubstanceAdministrations(TuberculosisPHCRImmunizationSection)
   * @generated
   * @ordered
   */
  protected static final String GET_TUBERCULOSIS_IMMUNIZATION_ACTIVITY_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(tuberculosis::TuberculosisImmunizationActivitySubstanceAdministration)).oclAsType(tuberculosis::TuberculosisImmunizationActivitySubstanceAdministration)";

  /**
   * The cached OCL query for the '{@link #getTuberculosisImmunizationActivitySubstanceAdministrations(TuberculosisPHCRImmunizationSection) <em>Get Tuberculosis Immunization Activity Substance Administrations</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTuberculosisImmunizationActivitySubstanceAdministrations(TuberculosisPHCRImmunizationSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_TUBERCULOSIS_IMMUNIZATION_ACTIVITY_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<TuberculosisImmunizationActivitySubstanceAdministration> getTuberculosisImmunizationActivitySubstanceAdministrations(TuberculosisPHCRImmunizationSection tuberculosisPHCRImmunizationSection)
  {
    if (GET_TUBERCULOSIS_IMMUNIZATION_ACTIVITY_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION, TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION.getEAllOperations().get(65));
      try
      {
        GET_TUBERCULOSIS_IMMUNIZATION_ACTIVITY_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY = helper.createQuery(GET_TUBERCULOSIS_IMMUNIZATION_ACTIVITY_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TUBERCULOSIS_IMMUNIZATION_ACTIVITY_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<TuberculosisImmunizationActivitySubstanceAdministration> result = (Collection<TuberculosisImmunizationActivitySubstanceAdministration>) query.evaluate(tuberculosisPHCRImmunizationSection);
    return new BasicEList.UnmodifiableEList<TuberculosisImmunizationActivitySubstanceAdministration>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #validateImmunizationsSectionTemplateId(TuberculosisPHCRImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateImmunizationsSectionTemplateId(TuberculosisPHCRImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.23')";

  /**
   * The cached OCL invariant for the '{@link #validateImmunizationsSectionTemplateId(TuberculosisPHCRImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateImmunizationsSectionTemplateId(TuberculosisPHCRImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tuberculosisPHCRImmunizationSection The receiving '<em><b>PHCR Immunization Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateImmunizationsSectionTemplateId(TuberculosisPHCRImmunizationSection tuberculosisPHCRImmunizationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION);
      try
      {
        VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisPHCRImmunizationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             TuberculosisValidator.DIAGNOSTIC_SOURCE,
             TuberculosisValidator.TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION__IMMUNIZATIONS_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ImmunizationsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tuberculosisPHCRImmunizationSection, context) }),
             new Object [] { tuberculosisPHCRImmunizationSection }));
      }
       
      return false;
    }
    return true;
  }

} // TuberculosisPHCRImmunizationSectionOperations