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
package org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.chlamydiatrachomatisResultOrganizer;

import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.util.ChlamydiatrachomatisValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrRelevantDxTestsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Relevant Dx Tests Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRRelevantDxTestsSection#validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis PHCR Relevant Dx Tests Section Chlamydiatrachomatis Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRRelevantDxTestsSection#validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis PHCR Relevant Dx Tests Section Chlamydiatrachomatis Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRRelevantDxTestsSection#getChlamydiatrachomatisResultObservations() <em>Get Chlamydiatrachomatis Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRRelevantDxTestsSection#getChlamydiatrachomatisResultOrganizers() <em>Get Chlamydiatrachomatis Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRRelevantDxTestsSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChlamydiatrachomatisPHCRRelevantDxTestsSectionOperations extends PhcrRelevantDxTestsSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChlamydiatrachomatisPHCRRelevantDxTestsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultObservation(ChlamydiatrachomatisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis PHCR Relevant Dx Tests Section Chlamydiatrachomatis Result Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultObservation(ChlamydiatrachomatisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION_CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultObservation(ChlamydiatrachomatisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis PHCR Relevant Dx Tests Section Chlamydiatrachomatis Result Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultObservation(ChlamydiatrachomatisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION_CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param chlamydiatrachomatisPHCRRelevantDxTestsSection The receiving '<em><b>PHCR Relevant Dx Tests Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultObservation(ChlamydiatrachomatisPHCRRelevantDxTestsSection chlamydiatrachomatisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION_CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION);
			try {
				VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION_CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION_CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION_CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(chlamydiatrachomatisPHCRRelevantDxTestsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ChlamydiatrachomatisValidator.DIAGNOSTIC_SOURCE,
						 ChlamydiatrachomatisValidator.CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION_CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION,
						 ChlamydiatrachomatisPlugin.INSTANCE.getString("ChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultObservation"),
						 new Object [] { chlamydiatrachomatisPHCRRelevantDxTestsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultOrganizer(ChlamydiatrachomatisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis PHCR Relevant Dx Tests Section Chlamydiatrachomatis Result Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultOrganizer(ChlamydiatrachomatisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION_CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(chlamydiatrachomatis::chlamydiatrachomatisResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultOrganizer(ChlamydiatrachomatisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis PHCR Relevant Dx Tests Section Chlamydiatrachomatis Result Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultOrganizer(ChlamydiatrachomatisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION_CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(chlamydiatrachomatis::chlamydiatrachomatisResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param chlamydiatrachomatisPHCRRelevantDxTestsSection The receiving '<em><b>PHCR Relevant Dx Tests Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultOrganizer(ChlamydiatrachomatisPHCRRelevantDxTestsSection chlamydiatrachomatisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION_CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION);
			try {
				VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION_CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION_CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION_CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(chlamydiatrachomatisPHCRRelevantDxTestsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ChlamydiatrachomatisValidator.DIAGNOSTIC_SOURCE,
						 ChlamydiatrachomatisValidator.CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION_CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER,
						 ChlamydiatrachomatisPlugin.INSTANCE.getString("ChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultOrganizer"),
						 new Object [] { chlamydiatrachomatisPHCRRelevantDxTestsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getChlamydiatrachomatisResultObservations(ChlamydiatrachomatisPHCRRelevantDxTestsSection) <em>Get Chlamydiatrachomatis Result Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChlamydiatrachomatisResultObservations(ChlamydiatrachomatisPHCRRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHLAMYDIATRACHOMATIS_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisResultObservation)).oclAsType(chlamydiatrachomatis::ChlamydiatrachomatisResultObservation)";

	/**
	 * The cached OCL query for the '{@link #getChlamydiatrachomatisResultObservations(ChlamydiatrachomatisPHCRRelevantDxTestsSection) <em>Get Chlamydiatrachomatis Result Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChlamydiatrachomatisResultObservations(ChlamydiatrachomatisPHCRRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHLAMYDIATRACHOMATIS_RESULT_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisResultObservation)).oclAsType(chlamydiatrachomatis::ChlamydiatrachomatisResultObservation)
	 * @param chlamydiatrachomatisPHCRRelevantDxTestsSection The receiving '<em><b>PHCR Relevant Dx Tests Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<ChlamydiatrachomatisResultObservation> getChlamydiatrachomatisResultObservations(ChlamydiatrachomatisPHCRRelevantDxTestsSection chlamydiatrachomatisPHCRRelevantDxTestsSection) {
		if (GET_CHLAMYDIATRACHOMATIS_RESULT_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION, ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(71));
			try {
				GET_CHLAMYDIATRACHOMATIS_RESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_CHLAMYDIATRACHOMATIS_RESULT_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHLAMYDIATRACHOMATIS_RESULT_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ChlamydiatrachomatisResultObservation> result = (Collection<ChlamydiatrachomatisResultObservation>) query.evaluate(chlamydiatrachomatisPHCRRelevantDxTestsSection);
		return new BasicEList.UnmodifiableEList<ChlamydiatrachomatisResultObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getChlamydiatrachomatisResultOrganizers(ChlamydiatrachomatisPHCRRelevantDxTestsSection) <em>Get Chlamydiatrachomatis Result Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChlamydiatrachomatisResultOrganizers(ChlamydiatrachomatisPHCRRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHLAMYDIATRACHOMATIS_RESULT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(chlamydiatrachomatis::chlamydiatrachomatisResultOrganizer)).oclAsType(chlamydiatrachomatis::chlamydiatrachomatisResultOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getChlamydiatrachomatisResultOrganizers(ChlamydiatrachomatisPHCRRelevantDxTestsSection) <em>Get Chlamydiatrachomatis Result Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChlamydiatrachomatisResultOrganizers(ChlamydiatrachomatisPHCRRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHLAMYDIATRACHOMATIS_RESULT_ORGANIZERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(chlamydiatrachomatis::chlamydiatrachomatisResultOrganizer)).oclAsType(chlamydiatrachomatis::chlamydiatrachomatisResultOrganizer)
	 * @param chlamydiatrachomatisPHCRRelevantDxTestsSection The receiving '<em><b>PHCR Relevant Dx Tests Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<chlamydiatrachomatisResultOrganizer> getChlamydiatrachomatisResultOrganizers(ChlamydiatrachomatisPHCRRelevantDxTestsSection chlamydiatrachomatisPHCRRelevantDxTestsSection) {
		if (GET_CHLAMYDIATRACHOMATIS_RESULT_ORGANIZERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION, ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(72));
			try {
				GET_CHLAMYDIATRACHOMATIS_RESULT_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_CHLAMYDIATRACHOMATIS_RESULT_ORGANIZERS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHLAMYDIATRACHOMATIS_RESULT_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<chlamydiatrachomatisResultOrganizer> result = (Collection<chlamydiatrachomatisResultOrganizer>) query.evaluate(chlamydiatrachomatisPHCRRelevantDxTestsSection);
		return new BasicEList.UnmodifiableEList<chlamydiatrachomatisResultOrganizer>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionTemplateId(ChlamydiatrachomatisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionTemplateId(ChlamydiatrachomatisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.41')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionTemplateId(ChlamydiatrachomatisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionTemplateId(ChlamydiatrachomatisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.41')
	 * @param chlamydiatrachomatisPHCRRelevantDxTestsSection The receiving '<em><b>PHCR Relevant Dx Tests Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateResultsSectionTemplateId(ChlamydiatrachomatisPHCRRelevantDxTestsSection chlamydiatrachomatisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION);
			try {
				VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(chlamydiatrachomatisPHCRRelevantDxTestsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ChlamydiatrachomatisValidator.DIAGNOSTIC_SOURCE,
						 ChlamydiatrachomatisValidator.CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ResultsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(chlamydiatrachomatisPHCRRelevantDxTestsSection, context) }),
						 new Object [] { chlamydiatrachomatisPHCRRelevantDxTestsSection }));
			}
			 
			return false;
		}
		return true;
	}

} // ChlamydiatrachomatisPHCRRelevantDxTestsSectionOperations