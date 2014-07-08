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

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directives Section Entries Optional2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2#validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Advance Directive Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2#getConsolAdvanceDirectiveOrganizers() <em>Get Consol Advance Directive Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2#validateAdvanceDirectivesSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2#validateAdvanceDirectivesSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2#validateAdvanceDirectivesSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectivesSectionEntriesOptional2Operations extends
		AdvanceDirectivesSectionEntriesOptionalOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvanceDirectivesSectionEntriesOptional2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveOrganizer(AdvanceDirectivesSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Advance Directive Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveOrganizer(AdvanceDirectivesSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::AdvanceDirectiveOrganizer))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveOrganizer(AdvanceDirectivesSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Advance Directive Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveOrganizer(AdvanceDirectivesSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectivesSectionEntriesOptional2 The receiving '<em><b>Advance Directives Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveOrganizer(
			AdvanceDirectivesSectionEntriesOptional2 advanceDirectivesSectionEntriesOptional2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectivesSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_ADVANCE_DIRECTIVE_ORGANIZER,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveOrganizer"),
					new Object[] { advanceDirectivesSectionEntriesOptional2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolAdvanceDirectiveOrganizers(AdvanceDirectivesSectionEntriesOptional2) <em>Get Consol Advance Directive Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolAdvanceDirectiveOrganizers(AdvanceDirectivesSectionEntriesOptional2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_ADVANCE_DIRECTIVE_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::AdvanceDirectiveOrganizer)).oclAsType(consol::AdvanceDirectiveOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getConsolAdvanceDirectiveOrganizers(AdvanceDirectivesSectionEntriesOptional2) <em>Get Consol Advance Directive Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolAdvanceDirectiveOrganizers(AdvanceDirectivesSectionEntriesOptional2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_ADVANCE_DIRECTIVE_ORGANIZERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AdvanceDirectiveOrganizer> getConsolAdvanceDirectiveOrganizers(
			AdvanceDirectivesSectionEntriesOptional2 advanceDirectivesSectionEntriesOptional2) {
		if (GET_CONSOL_ADVANCE_DIRECTIVE_ORGANIZERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2,
				ConsolPackage.Literals.ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2.getEAllOperations().get(63));
			try {
				GET_CONSOL_ADVANCE_DIRECTIVE_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_CONSOL_ADVANCE_DIRECTIVE_ORGANIZERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_ADVANCE_DIRECTIVE_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AdvanceDirectiveOrganizer> result = (Collection<AdvanceDirectiveOrganizer>) query.evaluate(advanceDirectivesSectionEntriesOptional2);
		return new BasicEList.UnmodifiableEList<AdvanceDirectiveOrganizer>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectivesSectionEntriesOptionalTemplateId(AdvanceDirectivesSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSectionEntriesOptionalTemplateId(AdvanceDirectivesSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.21.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectivesSectionEntriesOptionalTemplateId(AdvanceDirectivesSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSectionEntriesOptionalTemplateId(AdvanceDirectivesSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectivesSectionEntriesOptional2 The receiving '<em><b>Advance Directives Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectivesSectionEntriesOptionalTemplateId(
			AdvanceDirectivesSectionEntriesOptional2 advanceDirectivesSectionEntriesOptional2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectivesSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectivesSectionEntriesOptionalTemplateId"),
					new Object[] { advanceDirectivesSectionEntriesOptional2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectivesSectionEntriesOptionalCodeP(AdvanceDirectivesSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSectionEntriesOptionalCodeP(AdvanceDirectivesSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectivesSectionEntriesOptionalCodeP(AdvanceDirectivesSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSectionEntriesOptionalCodeP(AdvanceDirectivesSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectivesSectionEntriesOptional2 The receiving '<em><b>Advance Directives Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectivesSectionEntriesOptionalCodeP(
			AdvanceDirectivesSectionEntriesOptional2 advanceDirectivesSectionEntriesOptional2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectivesSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE_P,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectivesSectionEntriesOptionalCodeP"),
					new Object[] { advanceDirectivesSectionEntriesOptional2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptionalCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptionalCodeP",
						passToken);
				}
				passToken.add(advanceDirectivesSectionEntriesOptional2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectivesSectionEntriesOptionalCode(AdvanceDirectivesSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSectionEntriesOptionalCode(AdvanceDirectivesSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '42348-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectivesSectionEntriesOptionalCode(AdvanceDirectivesSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSectionEntriesOptionalCode(AdvanceDirectivesSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectivesSectionEntriesOptional2 The receiving '<em><b>Advance Directives Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectivesSectionEntriesOptionalCode(
			AdvanceDirectivesSectionEntriesOptional2 advanceDirectivesSectionEntriesOptional2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptionalCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(advanceDirectivesSectionEntriesOptional2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectivesSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectivesSectionEntriesOptionalCode"),
					new Object[] { advanceDirectivesSectionEntriesOptional2 }));
			}

			return false;
		}
		return true;
	}

} // AdvanceDirectivesSectionEntriesOptional2Operations
