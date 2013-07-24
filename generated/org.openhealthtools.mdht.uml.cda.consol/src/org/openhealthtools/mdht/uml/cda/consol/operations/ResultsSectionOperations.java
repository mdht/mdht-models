/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Results Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSection#validateResultsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSection#validateResultsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSection#validateResultsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSection#validateResultsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSection#validateResultsSectionResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSection#getConsolResultOrganizers() <em>Get Consol Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSection#validateResultsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultsSectionOperations extends ResultsSectionEntriesOptionalOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionCodeP(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionCodeP(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionCodeP(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionCodeP(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULTS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultsSection The receiving '<em><b>Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultsSectionCodeP(ResultsSection resultsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULTS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULTS_SECTION);
			try {
				VALIDATE_RESULTS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(resultsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.RESULTS_SECTION__RESULTS_SECTION_CODE_P,
					ConsolPlugin.INSTANCE.getString("ResultsSectionCodeP"), new Object[] { resultsSection }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.ResultsSectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ResultsSectionCodeP", passToken);
				}
				passToken.add(resultsSection);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionCode(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionCode(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '30954-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionCode(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionCode(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultsSection The receiving '<em><b>Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultsSectionCode(ResultsSection resultsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ResultsSectionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(resultsSection)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULTS_SECTION);
			try {
				VALIDATE_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(resultsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.RESULTS_SECTION__RESULTS_SECTION_CODE,
					ConsolPlugin.INSTANCE.getString("ResultsSectionCode"), new Object[] { resultsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionTitle(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionTitle(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionTitle(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionTitle(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultsSection The receiving '<em><b>Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultsSectionTitle(ResultsSection resultsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULTS_SECTION);
			try {
				VALIDATE_RESULTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(resultsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.RESULTS_SECTION__RESULTS_SECTION_TITLE,
					ConsolPlugin.INSTANCE.getString("ResultsSectionTitle"), new Object[] { resultsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionText(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionText(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionText(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionText(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultsSection The receiving '<em><b>Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultsSectionText(ResultsSection resultsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULTS_SECTION);
			try {
				VALIDATE_RESULTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(resultsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.RESULTS_SECTION__RESULTS_SECTION_TEXT,
					ConsolPlugin.INSTANCE.getString("ResultsSectionText"), new Object[] { resultsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionResultOrganizer(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Result Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionResultOrganizer(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::ResultOrganizer))";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionResultOrganizer(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Result Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionResultOrganizer(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultsSection The receiving '<em><b>Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultsSectionResultOrganizer(ResultsSection resultsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULTS_SECTION);
			try {
				VALIDATE_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			resultsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.RESULTS_SECTION__RESULTS_SECTION_RESULT_ORGANIZER,
					ConsolPlugin.INSTANCE.getString("ResultsSectionResultOrganizer"), new Object[] { resultsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolResultOrganizers(ResultsSection) <em>Get Consol Result Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolResultOrganizers(ResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_RESULT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::ResultOrganizer)).oclAsType(consol::ResultOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getConsolResultOrganizers(ResultsSection) <em>Get Consol Result Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolResultOrganizers(ResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_RESULT_ORGANIZERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ResultOrganizer> getConsolResultOrganizers(ResultsSection resultsSection) {
		if (GET_CONSOL_RESULT_ORGANIZERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RESULTS_SECTION,
				ConsolPackage.Literals.RESULTS_SECTION.getEAllOperations().get(67));
			try {
				GET_CONSOL_RESULT_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_CONSOL_RESULT_ORGANIZERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_RESULT_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ResultOrganizer> result = (Collection<ResultOrganizer>) query.evaluate(resultsSection);
		return new BasicEList.UnmodifiableEList<ResultOrganizer>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionEntriesOptionalTemplateId(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionEntriesOptionalTemplateId(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.3.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionEntriesOptionalTemplateId(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionEntriesOptionalTemplateId(ResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultsSection The receiving '<em><b>Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultsSectionEntriesOptionalTemplateId(ResultsSection resultsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULTS_SECTION);
			try {
				VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			resultsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.RESULTS_SECTION__RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ResultsSectionEntriesOptionalTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(resultsSection, context) }),
					new Object[] { resultsSection }));
			}

			return false;
		}
		return true;
	}

} // ResultsSectionOperations
