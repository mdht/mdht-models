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

import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrRelevantDxTestsSectionOperations;

import org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.tss.tssPackage;

import org.openhealthtools.mdht.uml.cda.phcr.tss.util.tssValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tss Phcr Relevant Dx Tests Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrRelevantDxTestsSection#validateTssPhcrRelevantDxTestsSectionTssResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tss Phcr Relevant Dx Tests Section Tss Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrRelevantDxTestsSection#validateTssPhcrRelevantDxTestsSectionTssResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tss Phcr Relevant Dx Tests Section Tss Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrRelevantDxTestsSection#getTssResultOrganizers() <em>Get Tss Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrRelevantDxTestsSection#getTssResultObservations() <em>Get Tss Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrRelevantDxTestsSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TssPhcrRelevantDxTestsSectionOperations extends PhcrRelevantDxTestsSectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TssPhcrRelevantDxTestsSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateTssPhcrRelevantDxTestsSectionTssResultOrganizer(TssPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tss Phcr Relevant Dx Tests Section Tss Result Organizer</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTssPhcrRelevantDxTestsSectionTssResultOrganizer(TssPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_TSS_PHCR_RELEVANT_DX_TESTS_SECTION_TSS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(tss::TssResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateTssPhcrRelevantDxTestsSectionTssResultOrganizer(TssPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tss Phcr Relevant Dx Tests Section Tss Result Organizer</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTssPhcrRelevantDxTestsSectionTssResultOrganizer(TssPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_TSS_PHCR_RELEVANT_DX_TESTS_SECTION_TSS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tssPhcrRelevantDxTestsSection The receiving '<em><b>Tss Phcr Relevant Dx Tests Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateTssPhcrRelevantDxTestsSectionTssResultOrganizer(TssPhcrRelevantDxTestsSection tssPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_TSS_PHCR_RELEVANT_DX_TESTS_SECTION_TSS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(tssPackage.Literals.TSS_PHCR_RELEVANT_DX_TESTS_SECTION);
      try
      {
        VALIDATE_TSS_PHCR_RELEVANT_DX_TESTS_SECTION_TSS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TSS_PHCR_RELEVANT_DX_TESTS_SECTION_TSS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TSS_PHCR_RELEVANT_DX_TESTS_SECTION_TSS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tssPhcrRelevantDxTestsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             tssValidator.DIAGNOSTIC_SOURCE,
             tssValidator.TSS_PHCR_RELEVANT_DX_TESTS_SECTION__TSS_PHCR_RELEVANT_DX_TESTS_SECTION_TSS_RESULT_ORGANIZER,
             TssPlugin.INSTANCE.getString("TssPhcrRelevantDxTestsSectionTssResultOrganizer"),
             new Object [] { tssPhcrRelevantDxTestsSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateTssPhcrRelevantDxTestsSectionTssResultObservation(TssPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tss Phcr Relevant Dx Tests Section Tss Result Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTssPhcrRelevantDxTestsSectionTssResultObservation(TssPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_TSS_PHCR_RELEVANT_DX_TESTS_SECTION_TSS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(tss::TssResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateTssPhcrRelevantDxTestsSectionTssResultObservation(TssPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tss Phcr Relevant Dx Tests Section Tss Result Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTssPhcrRelevantDxTestsSectionTssResultObservation(TssPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_TSS_PHCR_RELEVANT_DX_TESTS_SECTION_TSS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tssPhcrRelevantDxTestsSection The receiving '<em><b>Tss Phcr Relevant Dx Tests Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateTssPhcrRelevantDxTestsSectionTssResultObservation(TssPhcrRelevantDxTestsSection tssPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_TSS_PHCR_RELEVANT_DX_TESTS_SECTION_TSS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(tssPackage.Literals.TSS_PHCR_RELEVANT_DX_TESTS_SECTION);
      try
      {
        VALIDATE_TSS_PHCR_RELEVANT_DX_TESTS_SECTION_TSS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TSS_PHCR_RELEVANT_DX_TESTS_SECTION_TSS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TSS_PHCR_RELEVANT_DX_TESTS_SECTION_TSS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tssPhcrRelevantDxTestsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             tssValidator.DIAGNOSTIC_SOURCE,
             tssValidator.TSS_PHCR_RELEVANT_DX_TESTS_SECTION__TSS_PHCR_RELEVANT_DX_TESTS_SECTION_TSS_RESULT_OBSERVATION,
             TssPlugin.INSTANCE.getString("TssPhcrRelevantDxTestsSectionTssResultObservation"),
             new Object [] { tssPhcrRelevantDxTestsSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getTssResultOrganizers(TssPhcrRelevantDxTestsSection) <em>Get Tss Result Organizers</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTssResultOrganizers(TssPhcrRelevantDxTestsSection)
   * @generated
   * @ordered
   */
	protected static final String GET_TSS_RESULT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(tss::TssResultOrganizer)).oclAsType(tss::TssResultOrganizer)";

	/**
   * The cached OCL query for the '{@link #getTssResultOrganizers(TssPhcrRelevantDxTestsSection) <em>Get Tss Result Organizers</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTssResultOrganizers(TssPhcrRelevantDxTestsSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_TSS_RESULT_ORGANIZERS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  EList<TssResultOrganizer> getTssResultOrganizers(TssPhcrRelevantDxTestsSection tssPhcrRelevantDxTestsSection) {
    if (GET_TSS_RESULT_ORGANIZERS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(tssPackage.Literals.TSS_PHCR_RELEVANT_DX_TESTS_SECTION, tssPackage.Literals.TSS_PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(73));
      try
      {
        GET_TSS_RESULT_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_TSS_RESULT_ORGANIZERS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TSS_RESULT_ORGANIZERS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<TssResultOrganizer> result = (Collection<TssResultOrganizer>) query.evaluate(tssPhcrRelevantDxTestsSection);
    return new BasicEList.UnmodifiableEList<TssResultOrganizer>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #getTssResultObservations(TssPhcrRelevantDxTestsSection) <em>Get Tss Result Observations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTssResultObservations(TssPhcrRelevantDxTestsSection)
   * @generated
   * @ordered
   */
	protected static final String GET_TSS_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tss::TssResultObservation)).oclAsType(tss::TssResultObservation)";

	/**
   * The cached OCL query for the '{@link #getTssResultObservations(TssPhcrRelevantDxTestsSection) <em>Get Tss Result Observations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTssResultObservations(TssPhcrRelevantDxTestsSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_TSS_RESULT_OBSERVATIONS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  EList<TssResultObservation> getTssResultObservations(TssPhcrRelevantDxTestsSection tssPhcrRelevantDxTestsSection) {
    if (GET_TSS_RESULT_OBSERVATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(tssPackage.Literals.TSS_PHCR_RELEVANT_DX_TESTS_SECTION, tssPackage.Literals.TSS_PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(74));
      try
      {
        GET_TSS_RESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_TSS_RESULT_OBSERVATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TSS_RESULT_OBSERVATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<TssResultObservation> result = (Collection<TssResultObservation>) query.evaluate(tssPhcrRelevantDxTestsSection);
    return new BasicEList.UnmodifiableEList<TssResultObservation>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #validateResultsSectionTemplateId(TssPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateResultsSectionTemplateId(TssPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.43')";

	/**
   * The cached OCL invariant for the '{@link #validateResultsSectionTemplateId(TssPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateResultsSectionTemplateId(TssPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tssPhcrRelevantDxTestsSection The receiving '<em><b>Tss Phcr Relevant Dx Tests Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateResultsSectionTemplateId(TssPhcrRelevantDxTestsSection tssPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(tssPackage.Literals.TSS_PHCR_RELEVANT_DX_TESTS_SECTION);
      try
      {
        VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tssPhcrRelevantDxTestsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             tssValidator.DIAGNOSTIC_SOURCE,
             tssValidator.TSS_PHCR_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ResultsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tssPhcrRelevantDxTestsSection, context) }),
             new Object [] { tssPhcrRelevantDxTestsSection }));
      }
       
      return false;
    }
    return true;
  }

} // TssPhcrRelevantDxTestsSectionOperations