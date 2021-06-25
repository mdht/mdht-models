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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directives Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSection2HasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Has Advance Directive Observation2 Xor Advance Directive Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSection2Title(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSection2Text(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSection2Entry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSection2EntryHasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Entry Has Advance Directive Observation2 Xor Advance Directive Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSection2EntryAdvanceDirectiveOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Entry Advance Directive Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSection2EntryAdvanceDirectiveObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Entry Advance Directive Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#getConsolAdvanceDirectiveOrganizers() <em>Get Consol Advance Directive Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional2 Advance Directive Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Advance Directive Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#getConsolAdvanceDirectiveObservation2s() <em>Get Consol Advance Directive Observation2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectivesSection2Operations extends AdvanceDirectivesSectionEntriesOptional2Operations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvanceDirectivesSection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectivesSection2HasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Has Advance Directive Observation2 Xor Advance Directive Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSection2HasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVES_SECTION2_HAS_ADVANCE_DIRECTIVE_OBSERVATION2_XOR_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(consol::AdvanceDirectiveObservation2)) or self.getOrganizers()->exists(org : cda::Organizer | org.oclIsKindOf(consol::AdvanceDirectiveOrganizer))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectivesSection2HasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Has Advance Directive Observation2 Xor Advance Directive Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSection2HasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVES_SECTION2_HAS_ADVANCE_DIRECTIVE_OBSERVATION2_XOR_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectivesSection2 The receiving '<em><b>Advance Directives Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectivesSection2HasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer(
			AdvanceDirectivesSection2 advanceDirectivesSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"AdvanceDirectivesSection2AdvanceDirectivesSection2HasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer",
			"ERROR");

		if (VALIDATE_ADVANCE_DIRECTIVES_SECTION2_HAS_ADVANCE_DIRECTIVE_OBSERVATION2_XOR_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVES_SECTION2);
			try {
				VALIDATE_ADVANCE_DIRECTIVES_SECTION2_HAS_ADVANCE_DIRECTIVE_OBSERVATION2_XOR_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_DIRECTIVES_SECTION2_HAS_ADVANCE_DIRECTIVE_OBSERVATION2_XOR_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVES_SECTION2_HAS_ADVANCE_DIRECTIVE_OBSERVATION2_XOR_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirectivesSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_DIRECTIVES_SECTION2__ADVANCE_DIRECTIVES_SECTION2_HAS_ADVANCE_DIRECTIVE_OBSERVATION2_XOR_ADVANCE_DIRECTIVE_ORGANIZER,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceDirectivesSection2AdvanceDirectivesSection2HasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer"),
						new Object[] { advanceDirectivesSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectivesSection2 The receiving '<em><b>Advance Directives Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectivesSection2Text(AdvanceDirectivesSection2 advanceDirectivesSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "AdvanceDirectivesSection2AdvanceDirectivesSection2Text", "ERROR");

		if (VALIDATE_ADVANCE_DIRECTIVES_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVES_SECTION2);
			try {
				VALIDATE_ADVANCE_DIRECTIVES_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVES_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVES_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirectivesSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_DIRECTIVES_SECTION2__ADVANCE_DIRECTIVES_SECTION2_TEXT,
						ConsolPlugin.INSTANCE.getString("AdvanceDirectivesSection2AdvanceDirectivesSection2Text"),
						new Object[] { advanceDirectivesSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectivesSection2Title(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSection2Title(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVES_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectivesSection2Title(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSection2Title(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVES_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectivesSection2Text(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSection2Text(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVES_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectivesSection2Text(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSection2Text(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVES_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectivesSection2 The receiving '<em><b>Advance Directives Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectivesSection2Title(AdvanceDirectivesSection2 advanceDirectivesSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "AdvanceDirectivesSection2AdvanceDirectivesSection2Title", "ERROR");

		if (VALIDATE_ADVANCE_DIRECTIVES_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVES_SECTION2);
			try {
				VALIDATE_ADVANCE_DIRECTIVES_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVES_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVES_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirectivesSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_DIRECTIVES_SECTION2__ADVANCE_DIRECTIVES_SECTION2_TITLE,
						ConsolPlugin.INSTANCE.getString("AdvanceDirectivesSection2AdvanceDirectivesSection2Title"),
						new Object[] { advanceDirectivesSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectivesSection2Entry(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSection2Entry(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectivesSection2Entry(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSection2Entry(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectivesSection2 The receiving '<em><b>Advance Directives Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectivesSection2Entry(AdvanceDirectivesSection2 advanceDirectivesSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "AdvanceDirectivesSection2AdvanceDirectivesSection2Entry", "ERROR");

		if (VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVES_SECTION2);
			try {
				VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirectivesSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_DIRECTIVES_SECTION2__ADVANCE_DIRECTIVES_SECTION2_ENTRY,
						ConsolPlugin.INSTANCE.getString("AdvanceDirectivesSection2AdvanceDirectivesSection2Entry"),
						new Object[] { advanceDirectivesSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectivesSection2EntryHasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Entry Has Advance Directive Observation2 Xor Advance Directive Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSection2EntryHasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY_HAS_ADVANCE_DIRECTIVE_OBSERVATION2_XOR_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject( not observation.oclIsUndefined() and not organizer.oclIsUndefined()  implies ( observation.oclIsKindOf(consol::AdvanceDirectiveObservation2) xor organizer.oclIsKindOf(consol::AdvanceDirectiveOrganizer) ))";
	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectivesSection2EntryHasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Entry Has Advance Directive Observation2 Xor Advance Directive Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSection2EntryHasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY_HAS_ADVANCE_DIRECTIVE_OBSERVATION2_XOR_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectivesSection2 The receiving '<em><b>Advance Directives Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectivesSection2EntryHasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer(
			AdvanceDirectivesSection2 advanceDirectivesSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"AdvanceDirectivesSection2AdvanceDirectivesSection2EntryHasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer",
			"ERROR");

		if (VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY_HAS_ADVANCE_DIRECTIVE_OBSERVATION2_XOR_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVES_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY_HAS_ADVANCE_DIRECTIVE_OBSERVATION2_XOR_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY_HAS_ADVANCE_DIRECTIVE_OBSERVATION2_XOR_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY_HAS_ADVANCE_DIRECTIVE_OBSERVATION2_XOR_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectivesSection2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVES_SECTION2__ADVANCE_DIRECTIVES_SECTION2_ENTRY_HAS_ADVANCE_DIRECTIVE_OBSERVATION2_XOR_ADVANCE_DIRECTIVE_ORGANIZER,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectivesSection2AdvanceDirectivesSection2EntryHasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectivesSection2EntryAdvanceDirectiveOrganizer(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Entry Advance Directive Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSection2EntryAdvanceDirectiveOrganizer(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(organizer->one(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::AdvanceDirectiveOrganizer)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectivesSection2EntryAdvanceDirectiveOrganizer(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Entry Advance Directive Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSection2EntryAdvanceDirectiveOrganizer(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectivesSection2 The receiving '<em><b>Advance Directives Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectivesSection2EntryAdvanceDirectiveOrganizer(
			AdvanceDirectivesSection2 advanceDirectivesSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "AdvanceDirectivesSection2AdvanceDirectivesSection2EntryAdvanceDirectiveOrganizer", "INFO");

		if (VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVES_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectivesSection2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVES_SECTION2__ADVANCE_DIRECTIVES_SECTION2_ENTRY_ADVANCE_DIRECTIVE_ORGANIZER,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectivesSection2AdvanceDirectivesSection2EntryAdvanceDirectiveOrganizer"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectivesSection2EntryAdvanceDirectiveObservation2(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Entry Advance Directive Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSection2EntryAdvanceDirectiveObservation2(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY_ADVANCE_DIRECTIVE_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AdvanceDirectiveObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectivesSection2EntryAdvanceDirectiveObservation2(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Entry Advance Directive Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSection2EntryAdvanceDirectiveObservation2(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY_ADVANCE_DIRECTIVE_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectivesSection2 The receiving '<em><b>Advance Directives Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectivesSection2EntryAdvanceDirectiveObservation2(
			AdvanceDirectivesSection2 advanceDirectivesSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "AdvanceDirectivesSection2AdvanceDirectivesSection2EntryAdvanceDirectiveObservation2", "INFO");

		if (VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY_ADVANCE_DIRECTIVE_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVES_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY_ADVANCE_DIRECTIVE_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY_ADVANCE_DIRECTIVE_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY_ADVANCE_DIRECTIVE_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectivesSection2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVES_SECTION2__ADVANCE_DIRECTIVES_SECTION2_ENTRY_ADVANCE_DIRECTIVE_OBSERVATION2,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectivesSection2AdvanceDirectivesSection2EntryAdvanceDirectiveObservation2"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectivesSection2 The receiving '<em><b>Advance Directives Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectivesSectionEntriesOptionalCodeP(
			AdvanceDirectivesSection2 advanceDirectivesSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "AdvanceDirectivesSection2AdvanceDirectivesSectionEntriesOptionalCodeP", "ERROR");

		if (VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVES_SECTION2);
			try {
				VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirectivesSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_DIRECTIVES_SECTION2__ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceDirectivesSection2AdvanceDirectivesSectionEntriesOptionalCodeP"),
						new Object[] { advanceDirectivesSection2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptionalCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptionalCodeP",
						passToken);
				}
				passToken.add(advanceDirectivesSection2);
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectivesSection2 The receiving '<em><b>Advance Directives Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectivesSectionEntriesOptionalCode(
			AdvanceDirectivesSection2 advanceDirectivesSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptionalCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(advanceDirectivesSection2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(
			context, "AdvanceDirectivesSection2AdvanceDirectivesSectionEntriesOptionalCode", "ERROR");

		if (VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVES_SECTION2);
			try {
				VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirectivesSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_DIRECTIVES_SECTION2__ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceDirectivesSection2AdvanceDirectivesSectionEntriesOptionalCode"),
						new Object[] { advanceDirectivesSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectivesSection2 The receiving '<em><b>Advance Directives Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizer(
			AdvanceDirectivesSection2 advanceDirectivesSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "AdvanceDirectivesSection2AdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizer",
			"ERROR");

		if (VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVES_SECTION2);
			try {
				VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirectivesSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_DIRECTIVES_SECTION2__ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2_ADVANCE_DIRECTIVE_ORGANIZER,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceDirectivesSection2AdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizer"),
						new Object[] { advanceDirectivesSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectivesSection2 The receiving '<em><b>Advance Directives Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation(
			AdvanceDirectivesSection2 advanceDirectivesSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "AdvanceDirectivesSection2AdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation",
			"ERROR");

		if (VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_ADVANCE_DIRECTIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVES_SECTION2);
			try {
				VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_ADVANCE_DIRECTIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_ADVANCE_DIRECTIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_ADVANCE_DIRECTIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirectivesSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_DIRECTIVES_SECTION2__ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_ADVANCE_DIRECTIVE_OBSERVATION,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceDirectivesSection2AdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation"),
						new Object[] { advanceDirectivesSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AdvanceDirectiveObservation2> getConsolAdvanceDirectiveObservation2s(
			AdvanceDirectivesSection2 advanceDirectivesSection2) {

		if (GET_CONSOL_ADVANCE_DIRECTIVE_OBSERVATION2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ADVANCE_DIRECTIVES_SECTION2,
				ConsolPackage.Literals.ADVANCE_DIRECTIVES_SECTION2.getEAllOperations().get(64));
			try {
				GET_CONSOL_ADVANCE_DIRECTIVE_OBSERVATION2S__EOCL_QRY = helper.createQuery(
					GET_CONSOL_ADVANCE_DIRECTIVE_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_ADVANCE_DIRECTIVE_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AdvanceDirectiveObservation2> result = (Collection<AdvanceDirectiveObservation2>) query.evaluate(
			advanceDirectivesSection2);
		return new BasicEList.UnmodifiableEList<AdvanceDirectiveObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolAdvanceDirectiveOrganizers(AdvanceDirectivesSection2) <em>Get Consol Advance Directive Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolAdvanceDirectiveOrganizers(AdvanceDirectivesSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_ADVANCE_DIRECTIVE_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::AdvanceDirectiveOrganizer)).oclAsType(consol::AdvanceDirectiveOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getConsolAdvanceDirectiveOrganizers(AdvanceDirectivesSection2) <em>Get Consol Advance Directive Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolAdvanceDirectiveOrganizers(AdvanceDirectivesSection2)
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
			AdvanceDirectivesSection2 advanceDirectivesSection2) {

		if (GET_CONSOL_ADVANCE_DIRECTIVE_ORGANIZERS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ADVANCE_DIRECTIVES_SECTION2,
				ConsolPackage.Literals.ADVANCE_DIRECTIVES_SECTION2.getEAllOperations().get(72));
			try {
				GET_CONSOL_ADVANCE_DIRECTIVE_ORGANIZERS__EOCL_QRY = helper.createQuery(
					GET_CONSOL_ADVANCE_DIRECTIVE_ORGANIZERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_ADVANCE_DIRECTIVE_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AdvanceDirectiveOrganizer> result = (Collection<AdvanceDirectiveOrganizer>) query.evaluate(
			advanceDirectivesSection2);
		return new BasicEList.UnmodifiableEList<AdvanceDirectiveOrganizer>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectivesSectionEntriesOptionalTemplateId(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSectionEntriesOptionalTemplateId(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.21.1' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectivesSectionEntriesOptionalTemplateId(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSectionEntriesOptionalTemplateId(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectivesSection2 The receiving '<em><b>Advance Directives Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectivesSectionEntriesOptionalTemplateId(
			AdvanceDirectivesSection2 advanceDirectivesSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "AdvanceDirectivesSection2AdvanceDirectivesSectionEntriesOptionalTemplateId", "ERROR");

		if (VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVES_SECTION2);
			try {
				VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirectivesSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_DIRECTIVES_SECTION2__ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceDirectivesSection2AdvanceDirectivesSectionEntriesOptionalTemplateId"),
						new Object[] { advanceDirectivesSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectivesSectionEntriesOptionalCodeP(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSectionEntriesOptionalCodeP(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectivesSectionEntriesOptionalCodeP(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSectionEntriesOptionalCodeP(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectivesSectionEntriesOptionalCode(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSectionEntriesOptionalCode(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '42348-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectivesSectionEntriesOptionalCode(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSectionEntriesOptionalCode(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizer(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional2 Advance Directive Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizer(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizer(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional2 Advance Directive Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizer(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Advance Directive Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_ADVANCE_DIRECTIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Advance Directive Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation(AdvanceDirectivesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_ADVANCE_DIRECTIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #getConsolAdvanceDirectiveObservation2s(AdvanceDirectivesSection2) <em>Get Consol Advance Directive Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolAdvanceDirectiveObservation2s(AdvanceDirectivesSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_ADVANCE_DIRECTIVE_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AdvanceDirectiveObservation2)).oclAsType(consol::AdvanceDirectiveObservation2)";

	/**
	 * The cached OCL query for the '{@link #getConsolAdvanceDirectiveObservation2s(AdvanceDirectivesSection2) <em>Get Consol Advance Directive Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolAdvanceDirectiveObservation2s(AdvanceDirectivesSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_ADVANCE_DIRECTIVE_OBSERVATION2S__EOCL_QRY;

} // AdvanceDirectivesSection2Operations
