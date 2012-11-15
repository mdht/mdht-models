/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

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
import org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.Procedure;
import org.openhealthtools.mdht.uml.cda.hitsp.Result;
import org.openhealthtools.mdht.uml.cda.hitsp.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;
import org.openhealthtools.mdht.uml.cda.ihe.operations.CodedResultsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Diagnostic Results Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection#validateDiagnosticResultsSectionHasResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Has Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection#validateDiagnosticResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection#validateDiagnosticResultsSectionDiagnosticProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Diagnostic Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection#validateDiagnosticResultsSectionResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection#validateDiagnosticResultsSectionResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection#getDiagnosticProcedures() <em>Get Diagnostic Procedures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection#getResults() <em>Get Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection#getResultOrganizers() <em>Get Result Organizers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagnosticResultsSectionOperations extends CodedResultsSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticResultsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticResultsSectionHasResult(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Has Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsSectionHasResult(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_RESULTS_SECTION_HAS_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | entry.observation.oclIsKindOf(hitsp::Result)) or self.entry->exists(entry : cda::Entry | entry.organizer.oclIsKindOf(ccd::ResultOrganizer) and entry.organizer.component.observation->exists(obs : cda::Observation | obs.oclIsKindOf(hitsp::Result)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticResultsSectionHasResult(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Has Result</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsSectionHasResult(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIAGNOSTIC_RESULTS_SECTION_HAS_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticResultsSection The receiving '<em><b>Diagnostic Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDiagnosticResultsSectionHasResult(DiagnosticResultsSection diagnosticResultsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_RESULTS_SECTION_HAS_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.DIAGNOSTIC_RESULTS_SECTION);
			try {
				VALIDATE_DIAGNOSTIC_RESULTS_SECTION_HAS_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_RESULTS_SECTION_HAS_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_RESULTS_SECTION_HAS_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			diagnosticResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_HAS_RESULT,
					HITSPPlugin.INSTANCE.getString("DiagnosticResultsSectionHasResult"),
					new Object[] { diagnosticResultsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticResultsSectionTemplateId(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsSectionTemplateId(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.122')";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticResultsSectionTemplateId(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsSectionTemplateId(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIAGNOSTIC_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticResultsSection The receiving '<em><b>Diagnostic Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDiagnosticResultsSectionTemplateId(DiagnosticResultsSection diagnosticResultsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.DIAGNOSTIC_RESULTS_SECTION);
			try {
				VALIDATE_DIAGNOSTIC_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			diagnosticResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_TEMPLATE_ID,
					HITSPPlugin.INSTANCE.getString("DiagnosticResultsSectionTemplateId"),
					new Object[] { diagnosticResultsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticResultsSectionDiagnosticProcedure(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Diagnostic Procedure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsSectionDiagnosticProcedure(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_RESULTS_SECTION_DIAGNOSTIC_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(hitsp::Procedure))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticResultsSectionDiagnosticProcedure(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Diagnostic Procedure</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsSectionDiagnosticProcedure(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIAGNOSTIC_RESULTS_SECTION_DIAGNOSTIC_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticResultsSection The receiving '<em><b>Diagnostic Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDiagnosticResultsSectionDiagnosticProcedure(
			DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_RESULTS_SECTION_DIAGNOSTIC_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.DIAGNOSTIC_RESULTS_SECTION);
			try {
				VALIDATE_DIAGNOSTIC_RESULTS_SECTION_DIAGNOSTIC_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_RESULTS_SECTION_DIAGNOSTIC_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DIAGNOSTIC_RESULTS_SECTION_DIAGNOSTIC_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			diagnosticResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_DIAGNOSTIC_PROCEDURE,
					HITSPPlugin.INSTANCE.getString("DiagnosticResultsSectionDiagnosticProcedure"),
					new Object[] { diagnosticResultsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticResultsSectionResult(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsSectionResult(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hitsp::Result))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticResultsSectionResult(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Result</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsSectionResult(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticResultsSection The receiving '<em><b>Diagnostic Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDiagnosticResultsSectionResult(DiagnosticResultsSection diagnosticResultsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.DIAGNOSTIC_RESULTS_SECTION);
			try {
				VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			diagnosticResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_RESULT,
					HITSPPlugin.INSTANCE.getString("DiagnosticResultsSectionResult"),
					new Object[] { diagnosticResultsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticResultsSectionResultOrganizer(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Result Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsSectionResultOrganizer(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(hitsp::ResultOrganizer))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticResultsSectionResultOrganizer(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Result Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsSectionResultOrganizer(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnosticResultsSection The receiving '<em><b>Diagnostic Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDiagnosticResultsSectionResultOrganizer(
			DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.DIAGNOSTIC_RESULTS_SECTION);
			try {
				VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			diagnosticResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_RESULT_ORGANIZER,
					HITSPPlugin.INSTANCE.getString("DiagnosticResultsSectionResultOrganizer"),
					new Object[] { diagnosticResultsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getDiagnosticProcedures(DiagnosticResultsSection) <em>Get Diagnostic Procedures</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticProcedures(DiagnosticResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DIAGNOSTIC_PROCEDURES__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(hitsp::Procedure)).oclAsType(hitsp::Procedure)";

	/**
	 * The cached OCL query for the '{@link #getDiagnosticProcedures(DiagnosticResultsSection) <em>Get Diagnostic Procedures</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticProcedures(DiagnosticResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DIAGNOSTIC_PROCEDURES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<Procedure> getDiagnosticProcedures(DiagnosticResultsSection diagnosticResultsSection) {
		if (GET_DIAGNOSTIC_PROCEDURES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				HITSPPackage.Literals.DIAGNOSTIC_RESULTS_SECTION,
				HITSPPackage.Literals.DIAGNOSTIC_RESULTS_SECTION.getEAllOperations().get(68));
			try {
				GET_DIAGNOSTIC_PROCEDURES__EOCL_QRY = helper.createQuery(GET_DIAGNOSTIC_PROCEDURES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DIAGNOSTIC_PROCEDURES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Procedure> result = (Collection<Procedure>) query.evaluate(diagnosticResultsSection);
		return new BasicEList.UnmodifiableEList<Procedure>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getResults(DiagnosticResultsSection) <em>Get Results</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults(DiagnosticResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hitsp::Result)).oclAsType(hitsp::Result)";

	/**
	 * The cached OCL query for the '{@link #getResults(DiagnosticResultsSection) <em>Get Results</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults(DiagnosticResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<Result> getResults(DiagnosticResultsSection diagnosticResultsSection) {
		if (GET_RESULTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				HITSPPackage.Literals.DIAGNOSTIC_RESULTS_SECTION,
				HITSPPackage.Literals.DIAGNOSTIC_RESULTS_SECTION.getEAllOperations().get(69));
			try {
				GET_RESULTS__EOCL_QRY = helper.createQuery(GET_RESULTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Result> result = (Collection<Result>) query.evaluate(diagnosticResultsSection);
		return new BasicEList.UnmodifiableEList<Result>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultOrganizers(DiagnosticResultsSection) <em>Get Result Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultOrganizers(DiagnosticResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(hitsp::ResultOrganizer)).oclAsType(hitsp::ResultOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getResultOrganizers(DiagnosticResultsSection) <em>Get Result Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultOrganizers(DiagnosticResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULT_ORGANIZERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<ResultOrganizer> getResultOrganizers(DiagnosticResultsSection diagnosticResultsSection) {
		if (GET_RESULT_ORGANIZERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				HITSPPackage.Literals.DIAGNOSTIC_RESULTS_SECTION,
				HITSPPackage.Literals.DIAGNOSTIC_RESULTS_SECTION.getEAllOperations().get(70));
			try {
				GET_RESULT_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_RESULT_ORGANIZERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULT_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ResultOrganizer> result = (Collection<ResultOrganizer>) query.evaluate(diagnosticResultsSection);
		return new BasicEList.UnmodifiableEList<ResultOrganizer>(result.size(), result.toArray());
	}

} // DiagnosticResultsSectionOperations
