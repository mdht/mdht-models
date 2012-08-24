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
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations;

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
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.util.TularemiaValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tularemia PHCR Clinical Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRClinicalInformationSection#validateTularemiaPHCRClinicalInformationSectionTularemiaCaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia PHCR Clinical Information Section Tularemia Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRClinicalInformationSection#getTularemiaCaseObservation() <em>Get Tularemia Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRClinicalInformationSection#validatePhcrClinicalInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TularemiaPHCRClinicalInformationSectionOperations extends PhcrClinicalInformationSectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TularemiaPHCRClinicalInformationSectionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateTularemiaPHCRClinicalInformationSectionTularemiaCaseObservation(TularemiaPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia PHCR Clinical Information Section Tularemia Case Observation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTularemiaPHCRClinicalInformationSectionTularemiaCaseObservation(TularemiaPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION_TULAREMIA_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(tularemia::TularemiaCaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

  /**
   * The cached OCL invariant for the '{@link #validateTularemiaPHCRClinicalInformationSectionTularemiaCaseObservation(TularemiaPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia PHCR Clinical Information Section Tularemia Case Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateTularemiaPHCRClinicalInformationSectionTularemiaCaseObservation(TularemiaPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static Constraint VALIDATE_TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION_TULAREMIA_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tularemiaPHCRClinicalInformationSection The receiving '<em><b>PHCR Clinical Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  boolean validateTularemiaPHCRClinicalInformationSectionTularemiaCaseObservation(TularemiaPHCRClinicalInformationSection tularemiaPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION_TULAREMIA_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TularemiaPackage.Literals.TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION);
      try
      {
        VALIDATE_TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION_TULAREMIA_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION_TULAREMIA_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION_TULAREMIA_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaPHCRClinicalInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             TularemiaValidator.DIAGNOSTIC_SOURCE,
             TularemiaValidator.TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION_TULAREMIA_CASE_OBSERVATION,
             TularemiaPlugin.INSTANCE.getString("TularemiaPHCRClinicalInformationSectionTularemiaCaseObservation"),
             new Object [] { tularemiaPHCRClinicalInformationSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getTularemiaCaseObservation(TularemiaPHCRClinicalInformationSection) <em>Get Tularemia Case Observation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTularemiaCaseObservation(TularemiaPHCRClinicalInformationSection)
   * @generated
   * @ordered
   */
  protected static final String GET_TULAREMIA_CASE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tularemia::TularemiaCaseObservation))->asSequence()->any(true).oclAsType(tularemia::TularemiaCaseObservation)";

  /**
   * The cached OCL query for the '{@link #getTularemiaCaseObservation(TularemiaPHCRClinicalInformationSection) <em>Get Tularemia Case Observation</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTularemiaCaseObservation(TularemiaPHCRClinicalInformationSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_TULAREMIA_CASE_OBSERVATION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static  TularemiaCaseObservation getTularemiaCaseObservation(TularemiaPHCRClinicalInformationSection tularemiaPHCRClinicalInformationSection)
  {
    if (GET_TULAREMIA_CASE_OBSERVATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(TularemiaPackage.Literals.TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION, TularemiaPackage.Literals.TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION.getEAllOperations().get(70));
      try
      {
        GET_TULAREMIA_CASE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_TULAREMIA_CASE_OBSERVATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TULAREMIA_CASE_OBSERVATION__EOCL_QRY);
    return (TularemiaCaseObservation) query.evaluate(tularemiaPHCRClinicalInformationSection);
  }

  /**
   * The cached OCL expression body for the '{@link #validatePhcrClinicalInformationSectionTemplateId(TularemiaPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhcrClinicalInformationSectionTemplateId(TularemiaPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.19')";

  /**
   * The cached OCL invariant for the '{@link #validatePhcrClinicalInformationSectionTemplateId(TularemiaPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePhcrClinicalInformationSectionTemplateId(TularemiaPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static Constraint VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tularemiaPHCRClinicalInformationSection The receiving '<em><b>PHCR Clinical Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  boolean validatePhcrClinicalInformationSectionTemplateId(TularemiaPHCRClinicalInformationSection tularemiaPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TularemiaPackage.Literals.TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION);
      try
      {
        VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaPHCRClinicalInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             TularemiaValidator.DIAGNOSTIC_SOURCE,
             TularemiaValidator.TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhcrClinicalInformationSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tularemiaPHCRClinicalInformationSection, context) }),
             new Object [] { tularemiaPHCRClinicalInformationSection }));
      }
       
      return false;
    }
    return true;
  }

} // TularemiaPHCRClinicalInformationSectionOperations