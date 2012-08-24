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
package org.openhealthtools.mdht.uml.cda.phcr.streppneumo.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPackage;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoResultOrganizer;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.util.StrepPneumoValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Relevant Diagnostic Tests And Or Laboratory Data Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection#validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Relevant Diagnostic Tests And Or Laboratory Data Section Strep Pneumo Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection#validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Relevant Diagnostic Tests And Or Laboratory Data Section Strep Pneumo Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection#getStrepPneumoResultObservations() <em>Get Strep Pneumo Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection#getStrepPneumoResultOrganizers() <em>Get Strep Pneumo Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations extends PhcrRelevantDxTestsSectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultObservation(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Relevant Diagnostic Tests And Or Laboratory Data Section Strep Pneumo Result Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultObservation(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_STREP_PNEUMO_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(streppneumo::StrepPneumoResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultObservation(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Relevant Diagnostic Tests And Or Laboratory Data Section Strep Pneumo Result Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultObservation(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_STREP_PNEUMO_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection The receiving '<em><b>Relevant Diagnostic Tests And Or Laboratory Data Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultObservation(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_STREP_PNEUMO_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION);
      try
      {
        VALIDATE_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_STREP_PNEUMO_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_STREP_PNEUMO_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_STREP_PNEUMO_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             StrepPneumoValidator.DIAGNOSTIC_SOURCE,
             StrepPneumoValidator.STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_STREP_PNEUMO_RESULT_OBSERVATION,
             StrepPneumoPlugin.INSTANCE.getString("StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultObservation"),
             new Object [] { strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultOrganizer(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Relevant Diagnostic Tests And Or Laboratory Data Section Strep Pneumo Result Organizer</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultOrganizer(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_STREP_PNEUMO_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(streppneumo::StrepPneumoResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultOrganizer(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Relevant Diagnostic Tests And Or Laboratory Data Section Strep Pneumo Result Organizer</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultOrganizer(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_STREP_PNEUMO_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection The receiving '<em><b>Relevant Diagnostic Tests And Or Laboratory Data Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultOrganizer(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_STREP_PNEUMO_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION);
      try
      {
        VALIDATE_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_STREP_PNEUMO_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_STREP_PNEUMO_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_STREP_PNEUMO_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             StrepPneumoValidator.DIAGNOSTIC_SOURCE,
             StrepPneumoValidator.STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_STREP_PNEUMO_RESULT_ORGANIZER,
             StrepPneumoPlugin.INSTANCE.getString("StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultOrganizer"),
             new Object [] { strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getStrepPneumoResultObservations(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection) <em>Get Strep Pneumo Result Observations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStrepPneumoResultObservations(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection)
   * @generated
   * @ordered
   */
	protected static final String GET_STREP_PNEUMO_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(streppneumo::StrepPneumoResultObservation)).oclAsType(streppneumo::StrepPneumoResultObservation)";

	/**
   * The cached OCL query for the '{@link #getStrepPneumoResultObservations(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection) <em>Get Strep Pneumo Result Observations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStrepPneumoResultObservations(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_STREP_PNEUMO_RESULT_OBSERVATIONS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  EList<StrepPneumoResultObservation> getStrepPneumoResultObservations(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection) {
    if (GET_STREP_PNEUMO_RESULT_OBSERVATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(StrepPneumoPackage.Literals.STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION, StrepPneumoPackage.Literals.STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION.getEAllOperations().get(73));
      try
      {
        GET_STREP_PNEUMO_RESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_STREP_PNEUMO_RESULT_OBSERVATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_STREP_PNEUMO_RESULT_OBSERVATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<StrepPneumoResultObservation> result = (Collection<StrepPneumoResultObservation>) query.evaluate(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection);
    return new BasicEList.UnmodifiableEList<StrepPneumoResultObservation>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #getStrepPneumoResultOrganizers(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection) <em>Get Strep Pneumo Result Organizers</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStrepPneumoResultOrganizers(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection)
   * @generated
   * @ordered
   */
	protected static final String GET_STREP_PNEUMO_RESULT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(streppneumo::StrepPneumoResultOrganizer)).oclAsType(streppneumo::StrepPneumoResultOrganizer)";

	/**
   * The cached OCL query for the '{@link #getStrepPneumoResultOrganizers(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection) <em>Get Strep Pneumo Result Organizers</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStrepPneumoResultOrganizers(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_STREP_PNEUMO_RESULT_ORGANIZERS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  EList<StrepPneumoResultOrganizer> getStrepPneumoResultOrganizers(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection) {
    if (GET_STREP_PNEUMO_RESULT_ORGANIZERS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(StrepPneumoPackage.Literals.STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION, StrepPneumoPackage.Literals.STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION.getEAllOperations().get(74));
      try
      {
        GET_STREP_PNEUMO_RESULT_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_STREP_PNEUMO_RESULT_ORGANIZERS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_STREP_PNEUMO_RESULT_ORGANIZERS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<StrepPneumoResultOrganizer> result = (Collection<StrepPneumoResultOrganizer>) query.evaluate(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection);
    return new BasicEList.UnmodifiableEList<StrepPneumoResultOrganizer>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #validateResultsSectionTemplateId(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateResultsSectionTemplateId(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.56')";

	/**
   * The cached OCL invariant for the '{@link #validateResultsSectionTemplateId(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateResultsSectionTemplateId(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection The receiving '<em><b>Relevant Diagnostic Tests And Or Laboratory Data Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateResultsSectionTemplateId(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION);
      try
      {
        VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             StrepPneumoValidator.DIAGNOSTIC_SOURCE,
             StrepPneumoValidator.STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__RESULTS_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ResultsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, context) }),
             new Object [] { strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection }));
      }
       
      return false;
    }
    return true;
  }

} // StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations