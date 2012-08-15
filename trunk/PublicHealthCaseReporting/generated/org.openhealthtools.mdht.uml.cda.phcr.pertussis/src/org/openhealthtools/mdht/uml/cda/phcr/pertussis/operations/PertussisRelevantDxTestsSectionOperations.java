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

import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrRelevantDxTestsSectionOperations;

import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisResultOrganizer;

import org.openhealthtools.mdht.uml.cda.phcr.pertussis.util.PertussisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Relevant Dx Tests Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisRelevantDxTestsSection#validatePertussisRelevantDxTestsSectionPertussisResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Relevant Dx Tests Section Pertussis Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisRelevantDxTestsSection#validatePertussisRelevantDxTestsSectionPertussisResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Relevant Dx Tests Section Pertussis Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisRelevantDxTestsSection#getPertussisResultObservations() <em>Get Pertussis Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisRelevantDxTestsSection#getPertussisResultOrganizers() <em>Get Pertussis Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisRelevantDxTestsSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PertussisRelevantDxTestsSectionOperations extends PhcrRelevantDxTestsSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PertussisRelevantDxTestsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePertussisRelevantDxTestsSectionPertussisResultObservation(PertussisRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Relevant Dx Tests Section Pertussis Result Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePertussisRelevantDxTestsSectionPertussisResultObservation(PertussisRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PERTUSSIS_RELEVANT_DX_TESTS_SECTION_PERTUSSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(pertussis::PertussisResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validatePertussisRelevantDxTestsSectionPertussisResultObservation(PertussisRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Relevant Dx Tests Section Pertussis Result Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePertussisRelevantDxTestsSectionPertussisResultObservation(PertussisRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PERTUSSIS_RELEVANT_DX_TESTS_SECTION_PERTUSSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(pertussis::PertussisResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param pertussisRelevantDxTestsSection The receiving '<em><b>Relevant Dx Tests Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePertussisRelevantDxTestsSectionPertussisResultObservation(PertussisRelevantDxTestsSection pertussisRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PERTUSSIS_RELEVANT_DX_TESTS_SECTION_PERTUSSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PertussisPackage.Literals.PERTUSSIS_RELEVANT_DX_TESTS_SECTION);
			try {
				VALIDATE_PERTUSSIS_RELEVANT_DX_TESTS_SECTION_PERTUSSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERTUSSIS_RELEVANT_DX_TESTS_SECTION_PERTUSSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PERTUSSIS_RELEVANT_DX_TESTS_SECTION_PERTUSSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisRelevantDxTestsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 PertussisValidator.DIAGNOSTIC_SOURCE,
						 PertussisValidator.PERTUSSIS_RELEVANT_DX_TESTS_SECTION__PERTUSSIS_RELEVANT_DX_TESTS_SECTION_PERTUSSIS_RESULT_OBSERVATION,
						 PertussisPlugin.INSTANCE.getString("PertussisRelevantDxTestsSectionPertussisResultObservation"),
						 new Object [] { pertussisRelevantDxTestsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePertussisRelevantDxTestsSectionPertussisResultOrganizer(PertussisRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Relevant Dx Tests Section Pertussis Result Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePertussisRelevantDxTestsSectionPertussisResultOrganizer(PertussisRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PERTUSSIS_RELEVANT_DX_TESTS_SECTION_PERTUSSIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(pertussis::PertussisResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validatePertussisRelevantDxTestsSectionPertussisResultOrganizer(PertussisRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Relevant Dx Tests Section Pertussis Result Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePertussisRelevantDxTestsSectionPertussisResultOrganizer(PertussisRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PERTUSSIS_RELEVANT_DX_TESTS_SECTION_PERTUSSIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(pertussis::PertussisResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param pertussisRelevantDxTestsSection The receiving '<em><b>Relevant Dx Tests Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePertussisRelevantDxTestsSectionPertussisResultOrganizer(PertussisRelevantDxTestsSection pertussisRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PERTUSSIS_RELEVANT_DX_TESTS_SECTION_PERTUSSIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PertussisPackage.Literals.PERTUSSIS_RELEVANT_DX_TESTS_SECTION);
			try {
				VALIDATE_PERTUSSIS_RELEVANT_DX_TESTS_SECTION_PERTUSSIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERTUSSIS_RELEVANT_DX_TESTS_SECTION_PERTUSSIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PERTUSSIS_RELEVANT_DX_TESTS_SECTION_PERTUSSIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisRelevantDxTestsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 PertussisValidator.DIAGNOSTIC_SOURCE,
						 PertussisValidator.PERTUSSIS_RELEVANT_DX_TESTS_SECTION__PERTUSSIS_RELEVANT_DX_TESTS_SECTION_PERTUSSIS_RESULT_ORGANIZER,
						 PertussisPlugin.INSTANCE.getString("PertussisRelevantDxTestsSectionPertussisResultOrganizer"),
						 new Object [] { pertussisRelevantDxTestsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPertussisResultObservations(PertussisRelevantDxTestsSection) <em>Get Pertussis Result Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPertussisResultObservations(PertussisRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PERTUSSIS_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(pertussis::PertussisResultObservation)).oclAsType(pertussis::PertussisResultObservation)";

	/**
	 * The cached OCL query for the '{@link #getPertussisResultObservations(PertussisRelevantDxTestsSection) <em>Get Pertussis Result Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPertussisResultObservations(PertussisRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PERTUSSIS_RESULT_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(pertussis::PertussisResultObservation)).oclAsType(pertussis::PertussisResultObservation)
	 * @param pertussisRelevantDxTestsSection The receiving '<em><b>Relevant Dx Tests Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<PertussisResultObservation> getPertussisResultObservations(PertussisRelevantDxTestsSection pertussisRelevantDxTestsSection) {
		if (GET_PERTUSSIS_RESULT_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(PertussisPackage.Literals.PERTUSSIS_RELEVANT_DX_TESTS_SECTION, PertussisPackage.Literals.PERTUSSIS_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(71));
			try {
				GET_PERTUSSIS_RESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_PERTUSSIS_RESULT_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PERTUSSIS_RESULT_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PertussisResultObservation> result = (Collection<PertussisResultObservation>) query.evaluate(pertussisRelevantDxTestsSection);
		return new BasicEList.UnmodifiableEList<PertussisResultObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPertussisResultOrganizers(PertussisRelevantDxTestsSection) <em>Get Pertussis Result Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPertussisResultOrganizers(PertussisRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PERTUSSIS_RESULT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(pertussis::PertussisResultOrganizer)).oclAsType(pertussis::PertussisResultOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getPertussisResultOrganizers(PertussisRelevantDxTestsSection) <em>Get Pertussis Result Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPertussisResultOrganizers(PertussisRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PERTUSSIS_RESULT_ORGANIZERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(pertussis::PertussisResultOrganizer)).oclAsType(pertussis::PertussisResultOrganizer)
	 * @param pertussisRelevantDxTestsSection The receiving '<em><b>Relevant Dx Tests Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<PertussisResultOrganizer> getPertussisResultOrganizers(PertussisRelevantDxTestsSection pertussisRelevantDxTestsSection) {
		if (GET_PERTUSSIS_RESULT_ORGANIZERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(PertussisPackage.Literals.PERTUSSIS_RELEVANT_DX_TESTS_SECTION, PertussisPackage.Literals.PERTUSSIS_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(72));
			try {
				GET_PERTUSSIS_RESULT_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_PERTUSSIS_RESULT_ORGANIZERS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PERTUSSIS_RESULT_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PertussisResultOrganizer> result = (Collection<PertussisResultOrganizer>) query.evaluate(pertussisRelevantDxTestsSection);
		return new BasicEList.UnmodifiableEList<PertussisResultOrganizer>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionTemplateId(PertussisRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionTemplateId(PertussisRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.27')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionTemplateId(PertussisRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionTemplateId(PertussisRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.27')
	 * @param pertussisRelevantDxTestsSection The receiving '<em><b>Relevant Dx Tests Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateResultsSectionTemplateId(PertussisRelevantDxTestsSection pertussisRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PertussisPackage.Literals.PERTUSSIS_RELEVANT_DX_TESTS_SECTION);
			try {
				VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisRelevantDxTestsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PertussisValidator.DIAGNOSTIC_SOURCE,
						 PertussisValidator.PERTUSSIS_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ResultsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pertussisRelevantDxTestsSection, context) }),
						 new Object [] { pertussisRelevantDxTestsSection }));
			}
			 
			return false;
		}
		return true;
	}

} // PertussisRelevantDxTestsSectionOperations