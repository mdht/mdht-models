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
package org.openhealthtools.mdht.uml.cda.phcr.cocci.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPackage;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesResultOrganizer;

import org.openhealthtools.mdht.uml.cda.phcr.cocci.util.CocciValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrRelevantDxTestsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coccidioides PHCR Relevant Dx Tests Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRRelevantDxTestsSection#validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides PHCR Relevant Dx Tests Section Coccidioides Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRRelevantDxTestsSection#validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides PHCR Relevant Dx Tests Section Coccidioides Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRRelevantDxTestsSection#getCoccidioidesResultObservations() <em>Get Coccidioides Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRRelevantDxTestsSection#getCoccidioidesResultOrganizers() <em>Get Coccidioides Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRRelevantDxTestsSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoccidioidesPHCRRelevantDxTestsSectionOperations extends PhcrRelevantDxTestsSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoccidioidesPHCRRelevantDxTestsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultObservation(CoccidioidesPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides PHCR Relevant Dx Tests Section Coccidioides Result Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultObservation(CoccidioidesPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION_COCCIDIOIDES_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(cocci::CoccidioidesResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultObservation(CoccidioidesPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides PHCR Relevant Dx Tests Section Coccidioides Result Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultObservation(CoccidioidesPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION_COCCIDIOIDES_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(cocci::CoccidioidesResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param coccidioidesPHCRRelevantDxTestsSection The receiving '<em><b>Coccidioides PHCR Relevant Dx Tests Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultObservation(CoccidioidesPHCRRelevantDxTestsSection coccidioidesPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION_COCCIDIOIDES_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CocciPackage.Literals.COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION);
			try {
				VALIDATE_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION_COCCIDIOIDES_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION_COCCIDIOIDES_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION_COCCIDIOIDES_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesPHCRRelevantDxTestsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CocciValidator.DIAGNOSTIC_SOURCE,
						 CocciValidator.COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION__COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION_COCCIDIOIDES_RESULT_OBSERVATION,
						 CocciPlugin.INSTANCE.getString("CoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultObservation"),
						 new Object [] { coccidioidesPHCRRelevantDxTestsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultOrganizer(CoccidioidesPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides PHCR Relevant Dx Tests Section Coccidioides Result Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultOrganizer(CoccidioidesPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION_COCCIDIOIDES_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(cocci::CoccidioidesResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultOrganizer(CoccidioidesPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides PHCR Relevant Dx Tests Section Coccidioides Result Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultOrganizer(CoccidioidesPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION_COCCIDIOIDES_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(cocci::CoccidioidesResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param coccidioidesPHCRRelevantDxTestsSection The receiving '<em><b>Coccidioides PHCR Relevant Dx Tests Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultOrganizer(CoccidioidesPHCRRelevantDxTestsSection coccidioidesPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION_COCCIDIOIDES_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CocciPackage.Literals.COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION);
			try {
				VALIDATE_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION_COCCIDIOIDES_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION_COCCIDIOIDES_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION_COCCIDIOIDES_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesPHCRRelevantDxTestsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CocciValidator.DIAGNOSTIC_SOURCE,
						 CocciValidator.COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION__COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION_COCCIDIOIDES_RESULT_ORGANIZER,
						 CocciPlugin.INSTANCE.getString("CoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultOrganizer"),
						 new Object [] { coccidioidesPHCRRelevantDxTestsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCoccidioidesResultObservations(CoccidioidesPHCRRelevantDxTestsSection) <em>Get Coccidioides Result Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoccidioidesResultObservations(CoccidioidesPHCRRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COCCIDIOIDES_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cocci::CoccidioidesResultObservation)).oclAsType(cocci::CoccidioidesResultObservation)";

	/**
	 * The cached OCL query for the '{@link #getCoccidioidesResultObservations(CoccidioidesPHCRRelevantDxTestsSection) <em>Get Coccidioides Result Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoccidioidesResultObservations(CoccidioidesPHCRRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COCCIDIOIDES_RESULT_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cocci::CoccidioidesResultObservation)).oclAsType(cocci::CoccidioidesResultObservation)
	 * @param coccidioidesPHCRRelevantDxTestsSection The receiving '<em><b>Coccidioides PHCR Relevant Dx Tests Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<CoccidioidesResultObservation> getCoccidioidesResultObservations(CoccidioidesPHCRRelevantDxTestsSection coccidioidesPHCRRelevantDxTestsSection) {
		if (GET_COCCIDIOIDES_RESULT_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CocciPackage.Literals.COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION, CocciPackage.Literals.COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(71));
			try {
				GET_COCCIDIOIDES_RESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_COCCIDIOIDES_RESULT_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COCCIDIOIDES_RESULT_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CoccidioidesResultObservation> result = (Collection<CoccidioidesResultObservation>) query.evaluate(coccidioidesPHCRRelevantDxTestsSection);
		return new BasicEList.UnmodifiableEList<CoccidioidesResultObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCoccidioidesResultOrganizers(CoccidioidesPHCRRelevantDxTestsSection) <em>Get Coccidioides Result Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoccidioidesResultOrganizers(CoccidioidesPHCRRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COCCIDIOIDES_RESULT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(cocci::CoccidioidesResultOrganizer)).oclAsType(cocci::CoccidioidesResultOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getCoccidioidesResultOrganizers(CoccidioidesPHCRRelevantDxTestsSection) <em>Get Coccidioides Result Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoccidioidesResultOrganizers(CoccidioidesPHCRRelevantDxTestsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COCCIDIOIDES_RESULT_ORGANIZERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(cocci::CoccidioidesResultOrganizer)).oclAsType(cocci::CoccidioidesResultOrganizer)
	 * @param coccidioidesPHCRRelevantDxTestsSection The receiving '<em><b>Coccidioides PHCR Relevant Dx Tests Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<CoccidioidesResultOrganizer> getCoccidioidesResultOrganizers(CoccidioidesPHCRRelevantDxTestsSection coccidioidesPHCRRelevantDxTestsSection) {
		if (GET_COCCIDIOIDES_RESULT_ORGANIZERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CocciPackage.Literals.COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION, CocciPackage.Literals.COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(72));
			try {
				GET_COCCIDIOIDES_RESULT_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_COCCIDIOIDES_RESULT_ORGANIZERS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COCCIDIOIDES_RESULT_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CoccidioidesResultOrganizer> result = (Collection<CoccidioidesResultOrganizer>) query.evaluate(coccidioidesPHCRRelevantDxTestsSection);
		return new BasicEList.UnmodifiableEList<CoccidioidesResultOrganizer>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionTemplateId(CoccidioidesPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionTemplateId(CoccidioidesPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.32')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionTemplateId(CoccidioidesPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionTemplateId(CoccidioidesPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.32')
	 * @param coccidioidesPHCRRelevantDxTestsSection The receiving '<em><b>Coccidioides PHCR Relevant Dx Tests Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateResultsSectionTemplateId(CoccidioidesPHCRRelevantDxTestsSection coccidioidesPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CocciPackage.Literals.COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION);
			try {
				VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesPHCRRelevantDxTestsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CocciValidator.DIAGNOSTIC_SOURCE,
						 CocciValidator.COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ResultsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coccidioidesPHCRRelevantDxTestsSection, context) }),
						 new Object [] { coccidioidesPHCRRelevantDxTestsSection }));
			}
			 
			return false;
		}
		return true;
	}

} // CoccidioidesPHCRRelevantDxTestsSectionOperations