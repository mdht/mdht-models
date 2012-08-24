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
package org.openhealthtools.mdht.uml.cda.phcr.pertussis.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPackage;

import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.util.PertussisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunizations Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationsSection#validatePertussisImmunizationsSectionPertussisImmunizationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Immunizations Section Pertussis Immunization Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationsSection#getPertussisImmunizationActivities() <em>Get Pertussis Immunization Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationsSection#validateImmunizationsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PertussisImmunizationsSectionOperations extends ImmunizationsSectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PertussisImmunizationsSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validatePertussisImmunizationsSectionPertussisImmunizationActivity(PertussisImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Immunizations Section Pertussis Immunization Activity</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePertussisImmunizationsSectionPertussisImmunizationActivity(PertussisImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PERTUSSIS_IMMUNIZATIONS_SECTION_PERTUSSIS_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(pertussis::PertussisImmunizationActivity))";

	/**
   * The cached OCL invariant for the '{@link #validatePertussisImmunizationsSectionPertussisImmunizationActivity(PertussisImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Immunizations Section Pertussis Immunization Activity</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePertussisImmunizationsSectionPertussisImmunizationActivity(PertussisImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PERTUSSIS_IMMUNIZATIONS_SECTION_PERTUSSIS_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pertussisImmunizationsSection The receiving '<em><b>Immunizations Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePertussisImmunizationsSectionPertussisImmunizationActivity(PertussisImmunizationsSection pertussisImmunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PERTUSSIS_IMMUNIZATIONS_SECTION_PERTUSSIS_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PertussisPackage.Literals.PERTUSSIS_IMMUNIZATIONS_SECTION);
      try
      {
        VALIDATE_PERTUSSIS_IMMUNIZATIONS_SECTION_PERTUSSIS_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERTUSSIS_IMMUNIZATIONS_SECTION_PERTUSSIS_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PERTUSSIS_IMMUNIZATIONS_SECTION_PERTUSSIS_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisImmunizationsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             PertussisValidator.DIAGNOSTIC_SOURCE,
             PertussisValidator.PERTUSSIS_IMMUNIZATIONS_SECTION__PERTUSSIS_IMMUNIZATIONS_SECTION_PERTUSSIS_IMMUNIZATION_ACTIVITY,
             PertussisPlugin.INSTANCE.getString("PertussisImmunizationsSectionPertussisImmunizationActivity"),
             new Object [] { pertussisImmunizationsSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getPertussisImmunizationActivities(PertussisImmunizationsSection) <em>Get Pertussis Immunization Activities</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPertussisImmunizationActivities(PertussisImmunizationsSection)
   * @generated
   * @ordered
   */
	protected static final String GET_PERTUSSIS_IMMUNIZATION_ACTIVITIES__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(pertussis::PertussisImmunizationActivity)).oclAsType(pertussis::PertussisImmunizationActivity)";

	/**
   * The cached OCL query for the '{@link #getPertussisImmunizationActivities(PertussisImmunizationsSection) <em>Get Pertussis Immunization Activities</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPertussisImmunizationActivities(PertussisImmunizationsSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_PERTUSSIS_IMMUNIZATION_ACTIVITIES__EOCL_QRY;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  EList<PertussisImmunizationActivity> getPertussisImmunizationActivities(PertussisImmunizationsSection pertussisImmunizationsSection) {
    if (GET_PERTUSSIS_IMMUNIZATION_ACTIVITIES__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(PertussisPackage.Literals.PERTUSSIS_IMMUNIZATIONS_SECTION, PertussisPackage.Literals.PERTUSSIS_IMMUNIZATIONS_SECTION.getEAllOperations().get(65));
      try
      {
        GET_PERTUSSIS_IMMUNIZATION_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_PERTUSSIS_IMMUNIZATION_ACTIVITIES__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PERTUSSIS_IMMUNIZATION_ACTIVITIES__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<PertussisImmunizationActivity> result = (Collection<PertussisImmunizationActivity>) query.evaluate(pertussisImmunizationsSection);
    return new BasicEList.UnmodifiableEList<PertussisImmunizationActivity>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #validateImmunizationsSectionTemplateId(PertussisImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateImmunizationsSectionTemplateId(PertussisImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.28')";

	/**
   * The cached OCL invariant for the '{@link #validateImmunizationsSectionTemplateId(PertussisImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateImmunizationsSectionTemplateId(PertussisImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pertussisImmunizationsSection The receiving '<em><b>Immunizations Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateImmunizationsSectionTemplateId(PertussisImmunizationsSection pertussisImmunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PertussisPackage.Literals.PERTUSSIS_IMMUNIZATIONS_SECTION);
      try
      {
        VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisImmunizationsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PertussisValidator.DIAGNOSTIC_SOURCE,
             PertussisValidator.PERTUSSIS_IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ImmunizationsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pertussisImmunizationsSection, context) }),
             new Object [] { pertussisImmunizationsSection }));
      }
       
      return false;
    }
    return true;
  }

} // PertussisImmunizationsSectionOperations