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
package org.openhealthtools.mdht.uml.cda.phcr.hib.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.hib.HibPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibResultOrganizer;

import org.openhealthtools.mdht.uml.cda.phcr.hib.util.HibValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrRelevantDxTestsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Phcr Relevant Dx Tests Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HibPhcrRelevantDxTestsSection#validateHibPhcrRelevantDxTestsSectionHibResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hib Phcr Relevant Dx Tests Section Hib Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HibPhcrRelevantDxTestsSection#validateHibPhcrRelevantDxTestsSectionHibResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hib Phcr Relevant Dx Tests Section Hib Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HibPhcrRelevantDxTestsSection#getHibResultObservations() <em>Get Hib Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HibPhcrRelevantDxTestsSection#getHibResultOrganizers() <em>Get Hib Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HibPhcrRelevantDxTestsSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HibPhcrRelevantDxTestsSectionOperations extends PhcrRelevantDxTestsSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HibPhcrRelevantDxTestsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHibPhcrRelevantDxTestsSectionHibResultObservation(HibPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hib Phcr Relevant Dx Tests Section Hib Result Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHibPhcrRelevantDxTestsSectionHibResultObservation(HibPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HIB_PHCR_RELEVANT_DX_TESTS_SECTION_HIB_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hib::HibResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateHibPhcrRelevantDxTestsSectionHibResultObservation(HibPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hib Phcr Relevant Dx Tests Section Hib Result Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHibPhcrRelevantDxTestsSectionHibResultObservation(HibPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HIB_PHCR_RELEVANT_DX_TESTS_SECTION_HIB_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hib::HibResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param hibPhcrRelevantDxTestsSection The receiving '<em><b>Phcr Relevant Dx Tests Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHibPhcrRelevantDxTestsSectionHibResultObservation(HibPhcrRelevantDxTestsSection hibPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HIB_PHCR_RELEVANT_DX_TESTS_SECTION_HIB_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HibPackage.Literals.HIB_PHCR_RELEVANT_DX_TESTS_SECTION);
			try {
				VALIDATE_HIB_PHCR_RELEVANT_DX_TESTS_SECTION_HIB_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HIB_PHCR_RELEVANT_DX_TESTS_SECTION_HIB_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HIB_PHCR_RELEVANT_DX_TESTS_SECTION_HIB_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hibPhcrRelevantDxTestsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HibValidator.DIAGNOSTIC_SOURCE,
						 HibValidator.HIB_PHCR_RELEVANT_DX_TESTS_SECTION__HIB_PHCR_RELEVANT_DX_TESTS_SECTION_HIB_RESULT_OBSERVATION,
						 HibPlugin.INSTANCE.getString("HibPhcrRelevantDxTestsSectionHibResultObservation"),
						 new Object [] { hibPhcrRelevantDxTestsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHibPhcrRelevantDxTestsSectionHibResultOrganizer(HibPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hib Phcr Relevant Dx Tests Section Hib Result Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHibPhcrRelevantDxTestsSectionHibResultOrganizer(HibPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HIB_PHCR_RELEVANT_DX_TESTS_SECTION_HIB_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(hib::HibResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateHibPhcrRelevantDxTestsSectionHibResultOrganizer(HibPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hib Phcr Relevant Dx Tests Section Hib Result Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHibPhcrRelevantDxTestsSectionHibResultOrganizer(HibPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HIB_PHCR_RELEVANT_DX_TESTS_SECTION_HIB_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(hib::HibResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param hibPhcrRelevantDxTestsSection The receiving '<em><b>Phcr Relevant Dx Tests Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHibPhcrRelevantDxTestsSectionHibResultOrganizer(HibPhcrRelevantDxTestsSection hibPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HIB_PHCR_RELEVANT_DX_TESTS_SECTION_HIB_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HibPackage.Literals.HIB_PHCR_RELEVANT_DX_TESTS_SECTION);
			try {
				VALIDATE_HIB_PHCR_RELEVANT_DX_TESTS_SECTION_HIB_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HIB_PHCR_RELEVANT_DX_TESTS_SECTION_HIB_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HIB_PHCR_RELEVANT_DX_TESTS_SECTION_HIB_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hibPhcrRelevantDxTestsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HibValidator.DIAGNOSTIC_SOURCE,
						 HibValidator.HIB_PHCR_RELEVANT_DX_TESTS_SECTION__HIB_PHCR_RELEVANT_DX_TESTS_SECTION_HIB_RESULT_ORGANIZER,
						 HibPlugin.INSTANCE.getString("HibPhcrRelevantDxTestsSectionHibResultOrganizer"),
						 new Object [] { hibPhcrRelevantDxTestsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getHibResultObservations(HibPhcrRelevantDxTestsSection) <em>Get Hib Result Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHibResultObservations(HibPhcrRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HIB_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hib::HibResultObservation)).oclAsType(hib::HibResultObservation)";

	/**
	 * The cached OCL query for the '{@link #getHibResultObservations(HibPhcrRelevantDxTestsSection) <em>Get Hib Result Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHibResultObservations(HibPhcrRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HIB_RESULT_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hib::HibResultObservation)).oclAsType(hib::HibResultObservation)
	 * @param hibPhcrRelevantDxTestsSection The receiving '<em><b>Phcr Relevant Dx Tests Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<HibResultObservation> getHibResultObservations(HibPhcrRelevantDxTestsSection hibPhcrRelevantDxTestsSection) {
		if (GET_HIB_RESULT_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HibPackage.Literals.HIB_PHCR_RELEVANT_DX_TESTS_SECTION, HibPackage.Literals.HIB_PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(72));
			try {
				GET_HIB_RESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_HIB_RESULT_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HIB_RESULT_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<HibResultObservation> result = (Collection<HibResultObservation>) query.evaluate(hibPhcrRelevantDxTestsSection);
		return new BasicEList.UnmodifiableEList<HibResultObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getHibResultOrganizers(HibPhcrRelevantDxTestsSection) <em>Get Hib Result Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHibResultOrganizers(HibPhcrRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HIB_RESULT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(hib::HibResultOrganizer)).oclAsType(hib::HibResultOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getHibResultOrganizers(HibPhcrRelevantDxTestsSection) <em>Get Hib Result Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHibResultOrganizers(HibPhcrRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HIB_RESULT_ORGANIZERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(hib::HibResultOrganizer)).oclAsType(hib::HibResultOrganizer)
	 * @param hibPhcrRelevantDxTestsSection The receiving '<em><b>Phcr Relevant Dx Tests Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<HibResultOrganizer> getHibResultOrganizers(HibPhcrRelevantDxTestsSection hibPhcrRelevantDxTestsSection) {
		if (GET_HIB_RESULT_ORGANIZERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HibPackage.Literals.HIB_PHCR_RELEVANT_DX_TESTS_SECTION, HibPackage.Literals.HIB_PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(73));
			try {
				GET_HIB_RESULT_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_HIB_RESULT_ORGANIZERS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HIB_RESULT_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<HibResultOrganizer> result = (Collection<HibResultOrganizer>) query.evaluate(hibPhcrRelevantDxTestsSection);
		return new BasicEList.UnmodifiableEList<HibResultOrganizer>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionTemplateId(HibPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionTemplateId(HibPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.58')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionTemplateId(HibPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionTemplateId(HibPhcrRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.58')
	 * @param hibPhcrRelevantDxTestsSection The receiving '<em><b>Phcr Relevant Dx Tests Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateResultsSectionTemplateId(HibPhcrRelevantDxTestsSection hibPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HibPackage.Literals.HIB_PHCR_RELEVANT_DX_TESTS_SECTION);
			try {
				VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hibPhcrRelevantDxTestsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HibValidator.DIAGNOSTIC_SOURCE,
						 HibValidator.HIB_PHCR_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ResultsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(hibPhcrRelevantDxTestsSection, context) }),
						 new Object [] { hibPhcrRelevantDxTestsSection }));
			}
			 
			return false;
		}
		return true;
	}

} // HibPhcrRelevantDxTestsSectionOperations