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
package org.openhealthtools.mdht.uml.cda.phcr.wnv.operations;

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
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPackage;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.util.WnvValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Phcr Relevant Dx Tests Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrRelevantDxTestsSection#validateWnvPhcrRelevantDxTestsSectionWnvResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wnv Phcr Relevant Dx Tests Section Wnv Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrRelevantDxTestsSection#validateWnvPhcrRelevantDxTestsSectionWnvResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wnv Phcr Relevant Dx Tests Section Wnv Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrRelevantDxTestsSection#getWnvResultObservations() <em>Get Wnv Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrRelevantDxTestsSection#getWnvResultOrganizers() <em>Get Wnv Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrRelevantDxTestsSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WnvPhcrRelevantDxTestsSectionOperations extends PhcrRelevantDxTestsSectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected WnvPhcrRelevantDxTestsSectionOperations() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(wnv::WnvResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param wnvPhcrRelevantDxTestsSection The receiving '<em><b>Phcr Relevant Dx Tests Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateWnvPhcrRelevantDxTestsSectionWnvResultOrganizer(WnvPhcrRelevantDxTestsSection wnvPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_WNV_PHCR_RELEVANT_DX_TESTS_SECTION_WNV_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(WnvPackage.Literals.WNV_PHCR_RELEVANT_DX_TESTS_SECTION);
      try
      {
        VALIDATE_WNV_PHCR_RELEVANT_DX_TESTS_SECTION_WNV_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WNV_PHCR_RELEVANT_DX_TESTS_SECTION_WNV_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_WNV_PHCR_RELEVANT_DX_TESTS_SECTION_WNV_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(wnvPhcrRelevantDxTestsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             WnvValidator.DIAGNOSTIC_SOURCE,
             WnvValidator.WNV_PHCR_RELEVANT_DX_TESTS_SECTION__WNV_PHCR_RELEVANT_DX_TESTS_SECTION_WNV_RESULT_ORGANIZER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateWnvPhcrRelevantDxTestsSectionWnvResultOrganizer", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(wnvPhcrRelevantDxTestsSection, context) }),
             new Object [] { wnvPhcrRelevantDxTestsSection }));
      }
      return false;
    }
    return true;
  }


	/**
   * The cached OCL expression body for the '{@link #validateWnvPhcrRelevantDxTestsSectionWnvResultObservation(WnvPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wnv Phcr Relevant Dx Tests Section Wnv Result Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateWnvPhcrRelevantDxTestsSectionWnvResultObservation(WnvPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_WNV_PHCR_RELEVANT_DX_TESTS_SECTION_WNV_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(wnv::WnvResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateWnvPhcrRelevantDxTestsSectionWnvResultObservation(WnvPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wnv Phcr Relevant Dx Tests Section Wnv Result Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateWnvPhcrRelevantDxTestsSectionWnvResultObservation(WnvPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_WNV_PHCR_RELEVANT_DX_TESTS_SECTION_WNV_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * The cached OCL expression body for the '{@link #validateWnvPhcrRelevantDxTestsSectionWnvResultOrganizer(WnvPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wnv Phcr Relevant Dx Tests Section Wnv Result Organizer</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateWnvPhcrRelevantDxTestsSectionWnvResultOrganizer(WnvPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_WNV_PHCR_RELEVANT_DX_TESTS_SECTION_WNV_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(wnv::WnvResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateWnvPhcrRelevantDxTestsSectionWnvResultOrganizer(WnvPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wnv Phcr Relevant Dx Tests Section Wnv Result Organizer</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateWnvPhcrRelevantDxTestsSectionWnvResultOrganizer(WnvPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_WNV_PHCR_RELEVANT_DX_TESTS_SECTION_WNV_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(wnv::WnvResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param wnvPhcrRelevantDxTestsSection The receiving '<em><b>Phcr Relevant Dx Tests Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateWnvPhcrRelevantDxTestsSectionWnvResultObservation(WnvPhcrRelevantDxTestsSection wnvPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_WNV_PHCR_RELEVANT_DX_TESTS_SECTION_WNV_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(WnvPackage.Literals.WNV_PHCR_RELEVANT_DX_TESTS_SECTION);
      try
      {
        VALIDATE_WNV_PHCR_RELEVANT_DX_TESTS_SECTION_WNV_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WNV_PHCR_RELEVANT_DX_TESTS_SECTION_WNV_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_WNV_PHCR_RELEVANT_DX_TESTS_SECTION_WNV_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(wnvPhcrRelevantDxTestsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             WnvValidator.DIAGNOSTIC_SOURCE,
             WnvValidator.WNV_PHCR_RELEVANT_DX_TESTS_SECTION__WNV_PHCR_RELEVANT_DX_TESTS_SECTION_WNV_RESULT_OBSERVATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateWnvPhcrRelevantDxTestsSectionWnvResultObservation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(wnvPhcrRelevantDxTestsSection, context) }),
             new Object [] { wnvPhcrRelevantDxTestsSection }));
      }
      return false;
    }
    return true;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(wnv::WnvResultOrganizer)).oclAsType(wnv::WnvResultOrganizer)
   * @param wnvPhcrRelevantDxTestsSection The receiving '<em><b>Phcr Relevant Dx Tests Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  EList<WnvResultOrganizer> getWnvResultOrganizers(WnvPhcrRelevantDxTestsSection wnvPhcrRelevantDxTestsSection) {
    if (GET_WNV_RESULT_ORGANIZERS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(WnvPackage.Literals.WNV_PHCR_RELEVANT_DX_TESTS_SECTION, WnvPackage.Literals.WNV_PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(74));
      try
      {
        GET_WNV_RESULT_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_WNV_RESULT_ORGANIZERS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_WNV_RESULT_ORGANIZERS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<WnvResultOrganizer> result = (Collection<WnvResultOrganizer>) query.evaluate(wnvPhcrRelevantDxTestsSection);
    return new BasicEList.UnmodifiableEList<WnvResultOrganizer>(result.size(), result.toArray());
  }


	/**
   * The cached OCL expression body for the '{@link #getWnvResultObservations(WnvPhcrRelevantDxTestsSection) <em>Get Wnv Result Observations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getWnvResultObservations(WnvPhcrRelevantDxTestsSection)
   * @generated
   * @ordered
   */
	protected static final String GET_WNV_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(wnv::WnvResultObservation)).oclAsType(wnv::WnvResultObservation)";

	/**
   * The cached OCL query for the '{@link #getWnvResultObservations(WnvPhcrRelevantDxTestsSection) <em>Get Wnv Result Observations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getWnvResultObservations(WnvPhcrRelevantDxTestsSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_WNV_RESULT_OBSERVATIONS__EOCL_QRY;

	/**
   * The cached OCL expression body for the '{@link #getWnvResultOrganizers(WnvPhcrRelevantDxTestsSection) <em>Get Wnv Result Organizers</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getWnvResultOrganizers(WnvPhcrRelevantDxTestsSection)
   * @generated
   * @ordered
   */
	protected static final String GET_WNV_RESULT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(wnv::WnvResultOrganizer)).oclAsType(wnv::WnvResultOrganizer)";

	/**
   * The cached OCL query for the '{@link #getWnvResultOrganizers(WnvPhcrRelevantDxTestsSection) <em>Get Wnv Result Organizers</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getWnvResultOrganizers(WnvPhcrRelevantDxTestsSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_WNV_RESULT_ORGANIZERS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(wnv::WnvResultObservation)).oclAsType(wnv::WnvResultObservation)
   * @param wnvPhcrRelevantDxTestsSection The receiving '<em><b>Phcr Relevant Dx Tests Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  EList<WnvResultObservation> getWnvResultObservations(WnvPhcrRelevantDxTestsSection wnvPhcrRelevantDxTestsSection) {
    if (GET_WNV_RESULT_OBSERVATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(WnvPackage.Literals.WNV_PHCR_RELEVANT_DX_TESTS_SECTION, WnvPackage.Literals.WNV_PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(73));
      try
      {
        GET_WNV_RESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_WNV_RESULT_OBSERVATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_WNV_RESULT_OBSERVATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<WnvResultObservation> result = (Collection<WnvResultObservation>) query.evaluate(wnvPhcrRelevantDxTestsSection);
    return new BasicEList.UnmodifiableEList<WnvResultObservation>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #validateResultsSectionTemplateId(WnvPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateResultsSectionTemplateId(WnvPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.46')";

	/**
   * The cached OCL invariant for the '{@link #validateResultsSectionTemplateId(WnvPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateResultsSectionTemplateId(WnvPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.46')
   * @param wnvPhcrRelevantDxTestsSection The receiving '<em><b>Phcr Relevant Dx Tests Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateResultsSectionTemplateId(WnvPhcrRelevantDxTestsSection wnvPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(WnvPackage.Literals.WNV_PHCR_RELEVANT_DX_TESTS_SECTION);
      try
      {
        VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(wnvPhcrRelevantDxTestsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             WnvValidator.DIAGNOSTIC_SOURCE,
             WnvValidator.WNV_PHCR_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateResultsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(wnvPhcrRelevantDxTestsSection, context) }),
             new Object [] { wnvPhcrRelevantDxTestsSection }));
      }
      return false;
    }
    return true;
  }

} // WnvPhcrRelevantDxTestsSectionOperations