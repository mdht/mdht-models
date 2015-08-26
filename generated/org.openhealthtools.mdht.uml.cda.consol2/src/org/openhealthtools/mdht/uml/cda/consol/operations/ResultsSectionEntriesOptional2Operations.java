/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
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
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Results Section Entries Optional2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional2#getConsolResultOrganizer2s() <em>Get Consol Result Organizer2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional2#validateResultsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional2#validateResultsSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional2#validateResultsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional2#validateResultsSectionEntriesOptionalResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Result Organizer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultsSectionEntriesOptional2Operations extends ResultsSectionEntriesOptionalOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultsSectionEntriesOptional2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolResultOrganizer2s(ResultsSectionEntriesOptional2) <em>Get Consol Result Organizer2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolResultOrganizer2s(ResultsSectionEntriesOptional2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_RESULT_ORGANIZER2S__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::ResultOrganizer2)).oclAsType(consol::ResultOrganizer2)";

	/**
	 * The cached OCL query for the '{@link #getConsolResultOrganizer2s(ResultsSectionEntriesOptional2) <em>Get Consol Result Organizer2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolResultOrganizer2s(ResultsSectionEntriesOptional2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_RESULT_ORGANIZER2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ResultOrganizer2> getConsolResultOrganizer2s(
			ResultsSectionEntriesOptional2 resultsSectionEntriesOptional2) {
		if (GET_CONSOL_RESULT_ORGANIZER2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RESULTS_SECTION_ENTRIES_OPTIONAL2,
				ConsolPackage.Literals.RESULTS_SECTION_ENTRIES_OPTIONAL2.getEAllOperations().get(62));
			try {
				GET_CONSOL_RESULT_ORGANIZER2S__EOCL_QRY = helper.createQuery(GET_CONSOL_RESULT_ORGANIZER2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_RESULT_ORGANIZER2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ResultOrganizer2> result = (Collection<ResultOrganizer2>) query.evaluate(resultsSectionEntriesOptional2);
		return new BasicEList.UnmodifiableEList<ResultOrganizer2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionEntriesOptionalTemplateId(ResultsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionEntriesOptionalTemplateId(ResultsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.3' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionEntriesOptionalTemplateId(ResultsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionEntriesOptionalTemplateId(ResultsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultsSectionEntriesOptional2 The receiving '<em><b>Results Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultsSectionEntriesOptionalTemplateId(
			ResultsSectionEntriesOptional2 resultsSectionEntriesOptional2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULTS_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			resultsSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.RESULTS_SECTION_ENTRIES_OPTIONAL2__RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ResultsSectionEntriesOptional2ResultsSectionEntriesOptionalTemplateId"),
					new Object[] { resultsSectionEntriesOptional2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionEntriesOptionalCodeP(ResultsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionEntriesOptionalCodeP(ResultsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionEntriesOptionalCodeP(ResultsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionEntriesOptionalCodeP(ResultsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultsSectionEntriesOptional2 The receiving '<em><b>Results Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultsSectionEntriesOptionalCodeP(
			ResultsSectionEntriesOptional2 resultsSectionEntriesOptional2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULTS_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			resultsSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.RESULTS_SECTION_ENTRIES_OPTIONAL2__RESULTS_SECTION_ENTRIES_OPTIONAL_CODE_P,
					ConsolPlugin.INSTANCE.getString("ResultsSectionEntriesOptional2ResultsSectionEntriesOptionalCodeP"),
					new Object[] { resultsSectionEntriesOptional2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptionalCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptionalCodeP", passToken);
				}
				passToken.add(resultsSectionEntriesOptional2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionEntriesOptionalCode(ResultsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionEntriesOptionalCode(ResultsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '30954-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionEntriesOptionalCode(ResultsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionEntriesOptionalCode(ResultsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultsSectionEntriesOptional2 The receiving '<em><b>Results Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultsSectionEntriesOptionalCode(
			ResultsSectionEntriesOptional2 resultsSectionEntriesOptional2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptionalCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(resultsSectionEntriesOptional2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULTS_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			resultsSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.RESULTS_SECTION_ENTRIES_OPTIONAL2__RESULTS_SECTION_ENTRIES_OPTIONAL_CODE,
					ConsolPlugin.INSTANCE.getString("ResultsSectionEntriesOptional2ResultsSectionEntriesOptionalCode"),
					new Object[] { resultsSectionEntriesOptional2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionEntriesOptionalResultOrganizer(ResultsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Result Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionEntriesOptionalResultOrganizer(ResultsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::ResultOrganizer2))";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionEntriesOptionalResultOrganizer(ResultsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Result Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionEntriesOptionalResultOrganizer(ResultsSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultsSectionEntriesOptional2 The receiving '<em><b>Results Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultsSectionEntriesOptionalResultOrganizer(
			ResultsSectionEntriesOptional2 resultsSectionEntriesOptional2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULTS_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			resultsSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.RESULTS_SECTION_ENTRIES_OPTIONAL2__RESULTS_SECTION_ENTRIES_OPTIONAL_RESULT_ORGANIZER,
					ConsolPlugin.INSTANCE.getString("ResultsSectionEntriesOptional2ResultsSectionEntriesOptionalResultOrganizer"),
					new Object[] { resultsSectionEntriesOptional2 }));
			}

			return false;
		}
		return true;
	}

} // ResultsSectionEntriesOptional2Operations
