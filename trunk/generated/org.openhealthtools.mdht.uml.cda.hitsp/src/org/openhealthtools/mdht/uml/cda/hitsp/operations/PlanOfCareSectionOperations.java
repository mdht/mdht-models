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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.cdt.operations.AssessmentAndPlanSectionOperations;
import org.openhealthtools.mdht.uml.cda.hitsp.Encounter;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.Immunization;
import org.openhealthtools.mdht.uml.cda.hitsp.Medication;
import org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Procedure;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Care Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection#validateHITSPPlanOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Plan Of Care Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection#validateHITSPPlanOfCareSectionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Plan Of Care Section Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection#validateHITSPPlanOfCareSectionImmunization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Plan Of Care Section Immunization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection#validateHITSPPlanOfCareSectionEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Plan Of Care Section Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection#validateHITSPPlanOfCareSectionProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Plan Of Care Section Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection#getMedication() <em>Get Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection#getImmunization() <em>Get Immunization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection#getEncounter() <em>Get Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection#getProcedure() <em>Get Procedure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanOfCareSectionOperations extends AssessmentAndPlanSectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PlanOfCareSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateHITSPPlanOfCareSectionTemplateId(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Plan Of Care Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHITSPPlanOfCareSectionTemplateId(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_HITSP_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.124')";

	/**
   * The cached OCL invariant for the '{@link #validateHITSPPlanOfCareSectionTemplateId(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Plan Of Care Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHITSPPlanOfCareSectionTemplateId(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_HITSP_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateHITSPPlanOfCareSectionTemplateId(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_HITSP_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HITSPPackage.Literals.PLAN_OF_CARE_SECTION);
      try
      {
        VALIDATE_HITSP_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HITSP_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfCareSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             HITSPValidator.DIAGNOSTIC_SOURCE,
             HITSPValidator.PLAN_OF_CARE_SECTION__HITSP_PLAN_OF_CARE_SECTION_TEMPLATE_ID,
             HITSPPlugin.INSTANCE.getString("HITSPPlanOfCareSectionTemplateId"),
             new Object [] { planOfCareSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateHITSPPlanOfCareSectionMedication(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Plan Of Care Section Medication</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHITSPPlanOfCareSectionMedication(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_HITSP_PLAN_OF_CARE_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(hitsp::Medication))";

	/**
   * The cached OCL invariant for the '{@link #validateHITSPPlanOfCareSectionMedication(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Plan Of Care Section Medication</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHITSPPlanOfCareSectionMedication(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_HITSP_PLAN_OF_CARE_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateHITSPPlanOfCareSectionMedication(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_HITSP_PLAN_OF_CARE_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HITSPPackage.Literals.PLAN_OF_CARE_SECTION);
      try
      {
        VALIDATE_HITSP_PLAN_OF_CARE_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_PLAN_OF_CARE_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HITSP_PLAN_OF_CARE_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfCareSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HITSPValidator.DIAGNOSTIC_SOURCE,
             HITSPValidator.PLAN_OF_CARE_SECTION__HITSP_PLAN_OF_CARE_SECTION_MEDICATION,
             HITSPPlugin.INSTANCE.getString("HITSPPlanOfCareSectionMedication"),
             new Object [] { planOfCareSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateHITSPPlanOfCareSectionImmunization(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Plan Of Care Section Immunization</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHITSPPlanOfCareSectionImmunization(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_HITSP_PLAN_OF_CARE_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(hitsp::Immunization))";

	/**
   * The cached OCL invariant for the '{@link #validateHITSPPlanOfCareSectionImmunization(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Plan Of Care Section Immunization</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHITSPPlanOfCareSectionImmunization(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_HITSP_PLAN_OF_CARE_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateHITSPPlanOfCareSectionImmunization(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_HITSP_PLAN_OF_CARE_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HITSPPackage.Literals.PLAN_OF_CARE_SECTION);
      try
      {
        VALIDATE_HITSP_PLAN_OF_CARE_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_PLAN_OF_CARE_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HITSP_PLAN_OF_CARE_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfCareSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HITSPValidator.DIAGNOSTIC_SOURCE,
             HITSPValidator.PLAN_OF_CARE_SECTION__HITSP_PLAN_OF_CARE_SECTION_IMMUNIZATION,
             HITSPPlugin.INSTANCE.getString("HITSPPlanOfCareSectionImmunization"),
             new Object [] { planOfCareSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateHITSPPlanOfCareSectionEncounter(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Plan Of Care Section Encounter</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHITSPPlanOfCareSectionEncounter(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_HITSP_PLAN_OF_CARE_SECTION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(hitsp::Encounter))";

	/**
   * The cached OCL invariant for the '{@link #validateHITSPPlanOfCareSectionEncounter(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Plan Of Care Section Encounter</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHITSPPlanOfCareSectionEncounter(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_HITSP_PLAN_OF_CARE_SECTION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateHITSPPlanOfCareSectionEncounter(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_HITSP_PLAN_OF_CARE_SECTION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HITSPPackage.Literals.PLAN_OF_CARE_SECTION);
      try
      {
        VALIDATE_HITSP_PLAN_OF_CARE_SECTION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_PLAN_OF_CARE_SECTION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HITSP_PLAN_OF_CARE_SECTION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfCareSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HITSPValidator.DIAGNOSTIC_SOURCE,
             HITSPValidator.PLAN_OF_CARE_SECTION__HITSP_PLAN_OF_CARE_SECTION_ENCOUNTER,
             HITSPPlugin.INSTANCE.getString("HITSPPlanOfCareSectionEncounter"),
             new Object [] { planOfCareSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateHITSPPlanOfCareSectionProcedure(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Plan Of Care Section Procedure</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHITSPPlanOfCareSectionProcedure(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_HITSP_PLAN_OF_CARE_SECTION_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(hitsp::Procedure))";

	/**
   * The cached OCL invariant for the '{@link #validateHITSPPlanOfCareSectionProcedure(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Plan Of Care Section Procedure</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHITSPPlanOfCareSectionProcedure(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_HITSP_PLAN_OF_CARE_SECTION_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateHITSPPlanOfCareSectionProcedure(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_HITSP_PLAN_OF_CARE_SECTION_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(HITSPPackage.Literals.PLAN_OF_CARE_SECTION);
      try
      {
        VALIDATE_HITSP_PLAN_OF_CARE_SECTION_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_PLAN_OF_CARE_SECTION_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HITSP_PLAN_OF_CARE_SECTION_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(planOfCareSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             HITSPValidator.DIAGNOSTIC_SOURCE,
             HITSPValidator.PLAN_OF_CARE_SECTION__HITSP_PLAN_OF_CARE_SECTION_PROCEDURE,
             HITSPPlugin.INSTANCE.getString("HITSPPlanOfCareSectionProcedure"),
             new Object [] { planOfCareSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getMedication(PlanOfCareSection) <em>Get Medication</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMedication(PlanOfCareSection)
   * @generated
   * @ordered
   */
	protected static final String GET_MEDICATION__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(hitsp::Medication))->asSequence()->any(true).oclAsType(hitsp::Medication)";

	/**
   * The cached OCL query for the '{@link #getMedication(PlanOfCareSection) <em>Get Medication</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMedication(PlanOfCareSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_MEDICATION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static Medication getMedication(PlanOfCareSection planOfCareSection) {
    if (GET_MEDICATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(HITSPPackage.Literals.PLAN_OF_CARE_SECTION, HITSPPackage.Literals.PLAN_OF_CARE_SECTION.getEAllOperations().get(80));
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
    return (Medication) query.evaluate(planOfCareSection);
  }

	/**
   * The cached OCL expression body for the '{@link #getImmunization(PlanOfCareSection) <em>Get Immunization</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getImmunization(PlanOfCareSection)
   * @generated
   * @ordered
   */
	protected static final String GET_IMMUNIZATION__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(hitsp::Immunization))->asSequence()->any(true).oclAsType(hitsp::Immunization)";

	/**
   * The cached OCL query for the '{@link #getImmunization(PlanOfCareSection) <em>Get Immunization</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getImmunization(PlanOfCareSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static Immunization getImmunization(PlanOfCareSection planOfCareSection) {
    if (GET_IMMUNIZATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(HITSPPackage.Literals.PLAN_OF_CARE_SECTION, HITSPPackage.Literals.PLAN_OF_CARE_SECTION.getEAllOperations().get(81));
      try
      {
        GET_IMMUNIZATION__EOCL_QRY = helper.createQuery(GET_IMMUNIZATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATION__EOCL_QRY);
    return (Immunization) query.evaluate(planOfCareSection);
  }

	/**
   * The cached OCL expression body for the '{@link #getEncounter(PlanOfCareSection) <em>Get Encounter</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEncounter(PlanOfCareSection)
   * @generated
   * @ordered
   */
	protected static final String GET_ENCOUNTER__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(hitsp::Encounter))->asSequence()->any(true).oclAsType(hitsp::Encounter)";

	/**
   * The cached OCL query for the '{@link #getEncounter(PlanOfCareSection) <em>Get Encounter</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEncounter(PlanOfCareSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_ENCOUNTER__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static Encounter getEncounter(PlanOfCareSection planOfCareSection) {
    if (GET_ENCOUNTER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(HITSPPackage.Literals.PLAN_OF_CARE_SECTION, HITSPPackage.Literals.PLAN_OF_CARE_SECTION.getEAllOperations().get(82));
      try
      {
        GET_ENCOUNTER__EOCL_QRY = helper.createQuery(GET_ENCOUNTER__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ENCOUNTER__EOCL_QRY);
    return (Encounter) query.evaluate(planOfCareSection);
  }

	/**
   * The cached OCL expression body for the '{@link #getProcedure(PlanOfCareSection) <em>Get Procedure</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getProcedure(PlanOfCareSection)
   * @generated
   * @ordered
   */
	protected static final String GET_PROCEDURE__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(hitsp::Procedure))->asSequence()->any(true).oclAsType(hitsp::Procedure)";

	/**
   * The cached OCL query for the '{@link #getProcedure(PlanOfCareSection) <em>Get Procedure</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getProcedure(PlanOfCareSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_PROCEDURE__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static Procedure getProcedure(PlanOfCareSection planOfCareSection) {
    if (GET_PROCEDURE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(HITSPPackage.Literals.PLAN_OF_CARE_SECTION, HITSPPackage.Literals.PLAN_OF_CARE_SECTION.getEAllOperations().get(83));
      try
      {
        GET_PROCEDURE__EOCL_QRY = helper.createQuery(GET_PROCEDURE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE__EOCL_QRY);
    return (Procedure) query.evaluate(planOfCareSection);
  }

} // PlanOfCareSectionOperations
