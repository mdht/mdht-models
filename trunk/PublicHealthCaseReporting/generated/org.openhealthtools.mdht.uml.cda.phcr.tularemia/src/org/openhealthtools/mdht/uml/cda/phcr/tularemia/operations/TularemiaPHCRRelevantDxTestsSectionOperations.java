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
import org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrRelevantDxTestsSectionOperations;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.util.TularemiaValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tularemia PHCR Relevant Dx Tests Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRRelevantDxTestsSection#validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia PHCR Relevant Dx Tests Section Tularemia Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRRelevantDxTestsSection#validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia PHCR Relevant Dx Tests Section Tularemia Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRRelevantDxTestsSection#validateTularemiaPHCRRelevantDxTestsSectionImagingObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia PHCR Relevant Dx Tests Section Imaging Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRRelevantDxTestsSection#getTularemiaResultOrganizers() <em>Get Tularemia Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRRelevantDxTestsSection#getTularemiaResultObservations() <em>Get Tularemia Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRRelevantDxTestsSection#gettularemiaImagingObservations() <em>Gettularemia Imaging Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRRelevantDxTestsSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TularemiaPHCRRelevantDxTestsSectionOperations extends PhcrRelevantDxTestsSectionOperations
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TularemiaPHCRRelevantDxTestsSectionOperations() {
		super();
	}

  /**
	 * The cached OCL expression body for the '{@link #validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultOrganizer(TularemiaPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia PHCR Relevant Dx Tests Section Tularemia Result Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultOrganizer(TularemiaPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_TULAREMIA_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(tularemia::TularemiaResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

  /**
	 * The cached OCL invariant for the '{@link #validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultOrganizer(TularemiaPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia PHCR Relevant Dx Tests Section Tularemia Result Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultOrganizer(TularemiaPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static Constraint VALIDATE_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_TULAREMIA_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(tularemia::TularemiaResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param tularemiaPHCRRelevantDxTestsSection The receiving '<em><b>PHCR Relevant Dx Tests Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  boolean validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultOrganizer(TularemiaPHCRRelevantDxTestsSection tularemiaPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_TULAREMIA_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION);
			try {
				VALIDATE_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_TULAREMIA_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_TULAREMIA_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_TULAREMIA_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaPHCRRelevantDxTestsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_TULAREMIA_RESULT_ORGANIZER,
						 TularemiaPlugin.INSTANCE.getString("TularemiaPHCRRelevantDxTestsSectionTularemiaResultOrganizer"),
						 new Object [] { tularemiaPHCRRelevantDxTestsSection }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultObservation(TularemiaPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia PHCR Relevant Dx Tests Section Tularemia Result Observation</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultObservation(TularemiaPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_TULAREMIA_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(tularemia::TularemiaResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

  /**
	 * The cached OCL invariant for the '{@link #validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultObservation(TularemiaPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia PHCR Relevant Dx Tests Section Tularemia Result Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultObservation(TularemiaPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static Constraint VALIDATE_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_TULAREMIA_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(tularemia::TularemiaResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param tularemiaPHCRRelevantDxTestsSection The receiving '<em><b>PHCR Relevant Dx Tests Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  boolean validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultObservation(TularemiaPHCRRelevantDxTestsSection tularemiaPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_TULAREMIA_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION);
			try {
				VALIDATE_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_TULAREMIA_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_TULAREMIA_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_TULAREMIA_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaPHCRRelevantDxTestsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_TULAREMIA_RESULT_OBSERVATION,
						 TularemiaPlugin.INSTANCE.getString("TularemiaPHCRRelevantDxTestsSectionTularemiaResultObservation"),
						 new Object [] { tularemiaPHCRRelevantDxTestsSection }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateTularemiaPHCRRelevantDxTestsSectionImagingObservation(TularemiaPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia PHCR Relevant Dx Tests Section Imaging Observation</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTularemiaPHCRRelevantDxTestsSectionImagingObservation(TularemiaPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(phcr::ImagingObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

  /**
	 * The cached OCL invariant for the '{@link #validateTularemiaPHCRRelevantDxTestsSectionImagingObservation(TularemiaPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia PHCR Relevant Dx Tests Section Imaging Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTularemiaPHCRRelevantDxTestsSectionImagingObservation(TularemiaPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static Constraint VALIDATE_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(phcr::ImagingObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param tularemiaPHCRRelevantDxTestsSection The receiving '<em><b>PHCR Relevant Dx Tests Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  boolean validateTularemiaPHCRRelevantDxTestsSectionImagingObservation(TularemiaPHCRRelevantDxTestsSection tularemiaPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION);
			try {
				VALIDATE_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaPHCRRelevantDxTestsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_IMAGING_OBSERVATION,
						 TularemiaPlugin.INSTANCE.getString("TularemiaPHCRRelevantDxTestsSectionImagingObservation"),
						 new Object [] { tularemiaPHCRRelevantDxTestsSection }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #getTularemiaResultOrganizers(TularemiaPHCRRelevantDxTestsSection) <em>Get Tularemia Result Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTularemiaResultOrganizers(TularemiaPHCRRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_TULAREMIA_RESULT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(tularemia::TularemiaResultOrganizer)).oclAsType(tularemia::TularemiaResultOrganizer)";

  /**
	 * The cached OCL query for the '{@link #getTularemiaResultOrganizers(TularemiaPHCRRelevantDxTestsSection) <em>Get Tularemia Result Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTularemiaResultOrganizers(TularemiaPHCRRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_TULAREMIA_RESULT_ORGANIZERS__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(tularemia::TularemiaResultOrganizer)).oclAsType(tularemia::TularemiaResultOrganizer)
	 * @param tularemiaPHCRRelevantDxTestsSection The receiving '<em><b>PHCR Relevant Dx Tests Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  EList<TularemiaResultOrganizer> getTularemiaResultOrganizers(TularemiaPHCRRelevantDxTestsSection tularemiaPHCRRelevantDxTestsSection)
  {
		if (GET_TULAREMIA_RESULT_ORGANIZERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(TularemiaPackage.Literals.TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION, TularemiaPackage.Literals.TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(73));
			try {
				GET_TULAREMIA_RESULT_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_TULAREMIA_RESULT_ORGANIZERS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TULAREMIA_RESULT_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TularemiaResultOrganizer> result = (Collection<TularemiaResultOrganizer>) query.evaluate(tularemiaPHCRRelevantDxTestsSection);
		return new BasicEList.UnmodifiableEList<TularemiaResultOrganizer>(result.size(), result.toArray());
	}

  /**
	 * The cached OCL expression body for the '{@link #getTularemiaResultObservations(TularemiaPHCRRelevantDxTestsSection) <em>Get Tularemia Result Observations</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTularemiaResultObservations(TularemiaPHCRRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_TULAREMIA_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tularemia::TularemiaResultObservation)).oclAsType(tularemia::TularemiaResultObservation)";

  /**
	 * The cached OCL query for the '{@link #getTularemiaResultObservations(TularemiaPHCRRelevantDxTestsSection) <em>Get Tularemia Result Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTularemiaResultObservations(TularemiaPHCRRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_TULAREMIA_RESULT_OBSERVATIONS__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tularemia::TularemiaResultObservation)).oclAsType(tularemia::TularemiaResultObservation)
	 * @param tularemiaPHCRRelevantDxTestsSection The receiving '<em><b>PHCR Relevant Dx Tests Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  EList<TularemiaResultObservation> getTularemiaResultObservations(TularemiaPHCRRelevantDxTestsSection tularemiaPHCRRelevantDxTestsSection)
  {
		if (GET_TULAREMIA_RESULT_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(TularemiaPackage.Literals.TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION, TularemiaPackage.Literals.TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(74));
			try {
				GET_TULAREMIA_RESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_TULAREMIA_RESULT_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TULAREMIA_RESULT_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TularemiaResultObservation> result = (Collection<TularemiaResultObservation>) query.evaluate(tularemiaPHCRRelevantDxTestsSection);
		return new BasicEList.UnmodifiableEList<TularemiaResultObservation>(result.size(), result.toArray());
	}

  /**
	 * The cached OCL expression body for the '{@link #gettularemiaImagingObservations(TularemiaPHCRRelevantDxTestsSection) <em>Gettularemia Imaging Observations</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #gettularemiaImagingObservations(TularemiaPHCRRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
  protected static final String GETTULAREMIA_IMAGING_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::ImagingObservation)).oclAsType(phcr::ImagingObservation)";

  /**
	 * The cached OCL query for the '{@link #gettularemiaImagingObservations(TularemiaPHCRRelevantDxTestsSection) <em>Gettularemia Imaging Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #gettularemiaImagingObservations(TularemiaPHCRRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GETTULAREMIA_IMAGING_OBSERVATIONS__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::ImagingObservation)).oclAsType(phcr::ImagingObservation)
	 * @param tularemiaPHCRRelevantDxTestsSection The receiving '<em><b>PHCR Relevant Dx Tests Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  EList<ImagingObservation> gettularemiaImagingObservations(TularemiaPHCRRelevantDxTestsSection tularemiaPHCRRelevantDxTestsSection)
  {
		if (GETTULAREMIA_IMAGING_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(TularemiaPackage.Literals.TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION, TularemiaPackage.Literals.TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(75));
			try {
				GETTULAREMIA_IMAGING_OBSERVATIONS__EOCL_QRY = helper.createQuery(GETTULAREMIA_IMAGING_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETTULAREMIA_IMAGING_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ImagingObservation> result = (Collection<ImagingObservation>) query.evaluate(tularemiaPHCRRelevantDxTestsSection);
		return new BasicEList.UnmodifiableEList<ImagingObservation>(result.size(), result.toArray());
	}

  /**
	 * The cached OCL expression body for the '{@link #validateResultsSectionTemplateId(TularemiaPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultsSectionTemplateId(TularemiaPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.21')";

  /**
	 * The cached OCL invariant for the '{@link #validateResultsSectionTemplateId(TularemiaPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultsSectionTemplateId(TularemiaPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static Constraint VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.21')
	 * @param tularemiaPHCRRelevantDxTestsSection The receiving '<em><b>PHCR Relevant Dx Tests Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  boolean validateResultsSectionTemplateId(TularemiaPHCRRelevantDxTestsSection tularemiaPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION);
			try {
				VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaPHCRRelevantDxTestsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ResultsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tularemiaPHCRRelevantDxTestsSection, context) }),
						 new Object [] { tularemiaPHCRRelevantDxTestsSection }));
			}
			 
			return false;
		}
		return true;
	}

} // TularemiaPHCRRelevantDxTestsSectionOperations