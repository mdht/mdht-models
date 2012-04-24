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
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Results Section Entries Optional</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional#validateResultsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional#validateResultsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional#validateResultsSectionEntriesOptionalTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional#validateResultsSectionEntriesOptionalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional#validateResultsSectionEntriesOptionalResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional#getResultOrganizers() <em>Get Result Organizers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultsSectionEntriesOptionalOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultsSectionEntriesOptionalOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionEntriesOptionalTemplateId(ResultsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionEntriesOptionalTemplateId(ResultsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionEntriesOptionalTemplateId(ResultsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionEntriesOptionalTemplateId(ResultsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.3')
	 * @param resultsSectionEntriesOptional The receiving '<em><b>Results Section Entries Optional</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateResultsSectionEntriesOptionalTemplateId(
			ResultsSectionEntriesOptional resultsSectionEntriesOptional, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULTS_SECTION_ENTRIES_OPTIONAL);
			try {
				VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			resultsSectionEntriesOptional)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.RESULTS_SECTION_ENTRIES_OPTIONAL__RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ResultsSectionEntriesOptionalTemplateId"),
					new Object[] { resultsSectionEntriesOptional }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionEntriesOptionalCode(ResultsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionEntriesOptionalCode(ResultsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '30954-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionEntriesOptionalCode(ResultsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionEntriesOptionalCode(ResultsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	 * value.code = '30954-2' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param resultsSectionEntriesOptional The receiving '<em><b>Results Section Entries Optional</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateResultsSectionEntriesOptionalCode(
			ResultsSectionEntriesOptional resultsSectionEntriesOptional, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULTS_SECTION_ENTRIES_OPTIONAL);
			try {
				VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			resultsSectionEntriesOptional)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.RESULTS_SECTION_ENTRIES_OPTIONAL__RESULTS_SECTION_ENTRIES_OPTIONAL_CODE,
					ConsolPlugin.INSTANCE.getString("ResultsSectionEntriesOptionalCode"),
					new Object[] { resultsSectionEntriesOptional }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionEntriesOptionalTitle(ResultsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionEntriesOptionalTitle(ResultsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionEntriesOptionalTitle(ResultsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionEntriesOptionalTitle(ResultsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param resultsSectionEntriesOptional The receiving '<em><b>Results Section Entries Optional</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateResultsSectionEntriesOptionalTitle(
			ResultsSectionEntriesOptional resultsSectionEntriesOptional, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULTS_SECTION_ENTRIES_OPTIONAL);
			try {
				VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			resultsSectionEntriesOptional)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.RESULTS_SECTION_ENTRIES_OPTIONAL__RESULTS_SECTION_ENTRIES_OPTIONAL_TITLE,
					ConsolPlugin.INSTANCE.getString("ResultsSectionEntriesOptionalTitle"),
					new Object[] { resultsSectionEntriesOptional }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionEntriesOptionalText(ResultsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionEntriesOptionalText(ResultsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionEntriesOptionalText(ResultsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionEntriesOptionalText(ResultsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param resultsSectionEntriesOptional The receiving '<em><b>Results Section Entries Optional</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateResultsSectionEntriesOptionalText(
			ResultsSectionEntriesOptional resultsSectionEntriesOptional, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULTS_SECTION_ENTRIES_OPTIONAL);
			try {
				VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			resultsSectionEntriesOptional)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.RESULTS_SECTION_ENTRIES_OPTIONAL__RESULTS_SECTION_ENTRIES_OPTIONAL_TEXT,
					ConsolPlugin.INSTANCE.getString("ResultsSectionEntriesOptionalText"),
					new Object[] { resultsSectionEntriesOptional }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionEntriesOptionalResultOrganizer(ResultsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Result Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionEntriesOptionalResultOrganizer(ResultsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::ResultOrganizer))";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionEntriesOptionalResultOrganizer(ResultsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Result Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionEntriesOptionalResultOrganizer(ResultsSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::ResultOrganizer))
	 * @param resultsSectionEntriesOptional The receiving '<em><b>Results Section Entries Optional</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateResultsSectionEntriesOptionalResultOrganizer(
			ResultsSectionEntriesOptional resultsSectionEntriesOptional, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULTS_SECTION_ENTRIES_OPTIONAL);
			try {
				VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			resultsSectionEntriesOptional)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.RESULTS_SECTION_ENTRIES_OPTIONAL__RESULTS_SECTION_ENTRIES_OPTIONAL_RESULT_ORGANIZER,
					ConsolPlugin.INSTANCE.getString("ResultsSectionEntriesOptionalResultOrganizer"),
					new Object[] { resultsSectionEntriesOptional }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultOrganizers(ResultsSectionEntriesOptional) <em>Get Result Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultOrganizers(ResultsSectionEntriesOptional)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::ResultOrganizer)).oclAsType(consol::ResultOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getResultOrganizers(ResultsSectionEntriesOptional) <em>Get Result Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultOrganizers(ResultsSectionEntriesOptional)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULT_ORGANIZERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::ResultOrganizer)).oclAsType(consol::ResultOrganizer)
	 * @param resultsSectionEntriesOptional The receiving '<em><b>Results Section Entries Optional</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ResultOrganizer> getResultOrganizers(ResultsSectionEntriesOptional resultsSectionEntriesOptional) {
		if (GET_RESULT_ORGANIZERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.RESULTS_SECTION_ENTRIES_OPTIONAL,
				ConsolPackage.Literals.RESULTS_SECTION_ENTRIES_OPTIONAL.getEAllOperations().get(60));
			try {
				GET_RESULT_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_RESULT_ORGANIZERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULT_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ResultOrganizer> result = (Collection<ResultOrganizer>) query.evaluate(resultsSectionEntriesOptional);
		return new BasicEList.UnmodifiableEList<ResultOrganizer>(result.size(), result.toArray());
	}

} // ResultsSectionEntriesOptionalOperations
