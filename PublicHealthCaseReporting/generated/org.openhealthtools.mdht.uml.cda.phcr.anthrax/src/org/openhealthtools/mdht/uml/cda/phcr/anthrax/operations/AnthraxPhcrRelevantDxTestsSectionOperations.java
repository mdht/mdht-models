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
package org.openhealthtools.mdht.uml.cda.phcr.anthrax.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPackage;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxResultOrganizer;

import org.openhealthtools.mdht.uml.cda.phcr.anthrax.util.AnthraxValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrRelevantDxTestsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Phcr Relevant Dx Tests Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrRelevantDxTestsSection#validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Phcr Relevant Dx Tests Section Anthrax Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrRelevantDxTestsSection#validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Phcr Relevant Dx Tests Section Anthrax Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrRelevantDxTestsSection#getAnthraxResultOrganizers() <em>Get Anthrax Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrRelevantDxTestsSection#getAnthraxResultObservations() <em>Get Anthrax Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrRelevantDxTestsSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnthraxPhcrRelevantDxTestsSectionOperations extends PhcrRelevantDxTestsSectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AnthraxPhcrRelevantDxTestsSectionOperations() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(anthrax::AnthraxResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param anthraxPhcrRelevantDxTestsSection The receiving '<em><b>Phcr Relevant Dx Tests Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultObservation(AnthraxPhcrRelevantDxTestsSection anthraxPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION_ANTHRAX_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(AnthraxPackage.Literals.ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION);
      try
      {
        VALIDATE_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION_ANTHRAX_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION_ANTHRAX_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION_ANTHRAX_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anthraxPhcrRelevantDxTestsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             AnthraxValidator.DIAGNOSTIC_SOURCE,
             AnthraxValidator.ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION__ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION_ANTHRAX_RESULT_OBSERVATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultObservation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(anthraxPhcrRelevantDxTestsSection, context) }),
             new Object [] { anthraxPhcrRelevantDxTestsSection }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultOrganizer(AnthraxPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Phcr Relevant Dx Tests Section Anthrax Result Organizer</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultOrganizer(AnthraxPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION_ANTHRAX_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(anthrax::AnthraxResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultOrganizer(AnthraxPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Phcr Relevant Dx Tests Section Anthrax Result Organizer</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultOrganizer(AnthraxPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION_ANTHRAX_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * The cached OCL expression body for the '{@link #validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultObservation(AnthraxPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Phcr Relevant Dx Tests Section Anthrax Result Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultObservation(AnthraxPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION_ANTHRAX_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(anthrax::AnthraxResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultObservation(AnthraxPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Phcr Relevant Dx Tests Section Anthrax Result Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultObservation(AnthraxPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION_ANTHRAX_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(anthrax::AnthraxResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param anthraxPhcrRelevantDxTestsSection The receiving '<em><b>Phcr Relevant Dx Tests Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultOrganizer(AnthraxPhcrRelevantDxTestsSection anthraxPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION_ANTHRAX_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(AnthraxPackage.Literals.ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION);
      try
      {
        VALIDATE_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION_ANTHRAX_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION_ANTHRAX_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION_ANTHRAX_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anthraxPhcrRelevantDxTestsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             AnthraxValidator.DIAGNOSTIC_SOURCE,
             AnthraxValidator.ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION__ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION_ANTHRAX_RESULT_ORGANIZER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultOrganizer", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(anthraxPhcrRelevantDxTestsSection, context) }),
             new Object [] { anthraxPhcrRelevantDxTestsSection }));
      }
      return false;
    }
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(anthrax::AnthraxResultObservation)).oclAsType(anthrax::AnthraxResultObservation)
   * @param anthraxPhcrRelevantDxTestsSection The receiving '<em><b>Phcr Relevant Dx Tests Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  EList<AnthraxResultObservation> getAnthraxResultObservations(AnthraxPhcrRelevantDxTestsSection anthraxPhcrRelevantDxTestsSection) {
    if (GET_ANTHRAX_RESULT_OBSERVATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(AnthraxPackage.Literals.ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION, AnthraxPackage.Literals.ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(74));
      try
      {
        GET_ANTHRAX_RESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_ANTHRAX_RESULT_OBSERVATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ANTHRAX_RESULT_OBSERVATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<AnthraxResultObservation> result = (Collection<AnthraxResultObservation>) query.evaluate(anthraxPhcrRelevantDxTestsSection);
    return new BasicEList.UnmodifiableEList<AnthraxResultObservation>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #getAnthraxResultOrganizers(AnthraxPhcrRelevantDxTestsSection) <em>Get Anthrax Result Organizers</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAnthraxResultOrganizers(AnthraxPhcrRelevantDxTestsSection)
   * @generated
   * @ordered
   */
	protected static final String GET_ANTHRAX_RESULT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(anthrax::AnthraxResultOrganizer)).oclAsType(anthrax::AnthraxResultOrganizer)";

	/**
   * The cached OCL query for the '{@link #getAnthraxResultOrganizers(AnthraxPhcrRelevantDxTestsSection) <em>Get Anthrax Result Organizers</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAnthraxResultOrganizers(AnthraxPhcrRelevantDxTestsSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_ANTHRAX_RESULT_ORGANIZERS__EOCL_QRY;

	/**
   * The cached OCL expression body for the '{@link #getAnthraxResultObservations(AnthraxPhcrRelevantDxTestsSection) <em>Get Anthrax Result Observations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAnthraxResultObservations(AnthraxPhcrRelevantDxTestsSection)
   * @generated
   * @ordered
   */
	protected static final String GET_ANTHRAX_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(anthrax::AnthraxResultObservation)).oclAsType(anthrax::AnthraxResultObservation)";

	/**
   * The cached OCL query for the '{@link #getAnthraxResultObservations(AnthraxPhcrRelevantDxTestsSection) <em>Get Anthrax Result Observations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAnthraxResultObservations(AnthraxPhcrRelevantDxTestsSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_ANTHRAX_RESULT_OBSERVATIONS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(anthrax::AnthraxResultOrganizer)).oclAsType(anthrax::AnthraxResultOrganizer)
   * @param anthraxPhcrRelevantDxTestsSection The receiving '<em><b>Phcr Relevant Dx Tests Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  EList<AnthraxResultOrganizer> getAnthraxResultOrganizers(AnthraxPhcrRelevantDxTestsSection anthraxPhcrRelevantDxTestsSection) {
    if (GET_ANTHRAX_RESULT_ORGANIZERS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(AnthraxPackage.Literals.ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION, AnthraxPackage.Literals.ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(73));
      try
      {
        GET_ANTHRAX_RESULT_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_ANTHRAX_RESULT_ORGANIZERS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ANTHRAX_RESULT_ORGANIZERS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<AnthraxResultOrganizer> result = (Collection<AnthraxResultOrganizer>) query.evaluate(anthraxPhcrRelevantDxTestsSection);
    return new BasicEList.UnmodifiableEList<AnthraxResultOrganizer>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #validateResultsSectionTemplateId(AnthraxPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateResultsSectionTemplateId(AnthraxPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.16')";

	/**
   * The cached OCL invariant for the '{@link #validateResultsSectionTemplateId(AnthraxPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateResultsSectionTemplateId(AnthraxPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.16')
   * @param anthraxPhcrRelevantDxTestsSection The receiving '<em><b>Phcr Relevant Dx Tests Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateResultsSectionTemplateId(AnthraxPhcrRelevantDxTestsSection anthraxPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(AnthraxPackage.Literals.ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION);
      try
      {
        VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anthraxPhcrRelevantDxTestsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             AnthraxValidator.DIAGNOSTIC_SOURCE,
             AnthraxValidator.ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateResultsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(anthraxPhcrRelevantDxTestsSection, context) }),
             new Object [] { anthraxPhcrRelevantDxTestsSection }));
      }
      return false;
    }
    return true;
  }

} // AnthraxPhcrRelevantDxTestsSectionOperations