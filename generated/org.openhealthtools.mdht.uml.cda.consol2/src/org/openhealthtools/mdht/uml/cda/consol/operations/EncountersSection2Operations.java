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
import org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSection2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounters Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection2#validateEncountersSection2NullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section2 Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection2#validateEncountersSection2Text(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section2 Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection2#validateEncountersSection2Title(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section2 Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection2#validateEncountersSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection2#validateEncountersSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection2#validateEncountersSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection2#validateEncountersSectionEntriesOptionalEncounterActivities(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Encounter Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection2#getConsolEncounterActivity2s() <em>Get Consol Encounter Activity2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncountersSection2Operations extends EncountersSectionEntriesOptional2Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncountersSection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersSection2NullFlavor(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section2 Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSection2NullFlavor(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('nullFlavor')";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersSection2NullFlavor(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section2 Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSection2NullFlavor(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ENCOUNTERS_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encountersSection2 The receiving '<em><b>Encounters Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncountersSection2NullFlavor(EncountersSection2 encountersSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTERS_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTERS_SECTION2);
			try {
				VALIDATE_ENCOUNTERS_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encountersSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENCOUNTERS_SECTION2__ENCOUNTERS_SECTION2_NULL_FLAVOR,
					ConsolPlugin.INSTANCE.getString("EncountersSection2EncountersSection2NullFlavor"),
					new Object[] { encountersSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersSection2Text(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section2 Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSection2Text(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersSection2Text(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section2 Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSection2Text(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ENCOUNTERS_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encountersSection2 The receiving '<em><b>Encounters Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncountersSection2Text(EncountersSection2 encountersSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTERS_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTERS_SECTION2);
			try {
				VALIDATE_ENCOUNTERS_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encountersSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENCOUNTERS_SECTION2__ENCOUNTERS_SECTION2_TEXT,
					ConsolPlugin.INSTANCE.getString("EncountersSection2EncountersSection2Text"),
					new Object[] { encountersSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersSection2Title(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section2 Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSection2Title(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersSection2Title(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section2 Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSection2Title(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ENCOUNTERS_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encountersSection2 The receiving '<em><b>Encounters Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncountersSection2Title(EncountersSection2 encountersSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTERS_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTERS_SECTION2);
			try {
				VALIDATE_ENCOUNTERS_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encountersSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENCOUNTERS_SECTION2__ENCOUNTERS_SECTION2_TITLE,
					ConsolPlugin.INSTANCE.getString("EncountersSection2EncountersSection2Title"),
					new Object[] { encountersSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersSectionEntriesOptionalTemplateId(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionEntriesOptionalTemplateId(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.22.1' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersSectionEntriesOptionalTemplateId(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionEntriesOptionalTemplateId(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encountersSection2 The receiving '<em><b>Encounters Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncountersSectionEntriesOptionalTemplateId(EncountersSection2 encountersSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTERS_SECTION2);
			try {
				VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encountersSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENCOUNTERS_SECTION2__ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("EncountersSection2EncountersSectionEntriesOptionalTemplateId"),
					new Object[] { encountersSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersSectionEntriesOptionalCodeP(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionEntriesOptionalCodeP(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersSectionEntriesOptionalCodeP(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionEntriesOptionalCodeP(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encountersSection2 The receiving '<em><b>Encounters Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncountersSectionEntriesOptionalCodeP(EncountersSection2 encountersSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTERS_SECTION2);
			try {
				VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encountersSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENCOUNTERS_SECTION2__ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE_P,
					ConsolPlugin.INSTANCE.getString("EncountersSection2EncountersSectionEntriesOptionalCodeP"),
					new Object[] { encountersSection2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptionalCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptionalCodeP", passToken);
				}
				passToken.add(encountersSection2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersSectionEntriesOptionalCode(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionEntriesOptionalCode(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '46240-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersSectionEntriesOptionalCode(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionEntriesOptionalCode(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encountersSection2 The receiving '<em><b>Encounters Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncountersSectionEntriesOptionalCode(EncountersSection2 encountersSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptionalCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(encountersSection2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTERS_SECTION2);
			try {
				VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encountersSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENCOUNTERS_SECTION2__ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE,
					ConsolPlugin.INSTANCE.getString("EncountersSection2EncountersSectionEntriesOptionalCode"),
					new Object[] { encountersSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersSectionEntriesOptionalEncounterActivities(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Encounter Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionEntriesOptionalEncounterActivities(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_ENCOUNTER_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(consol::EncounterActivity2))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersSectionEntriesOptionalEncounterActivities(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Encounter Activities</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionEntriesOptionalEncounterActivities(EncountersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_ENCOUNTER_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encountersSection2 The receiving '<em><b>Encounters Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncountersSectionEntriesOptionalEncounterActivities(
			EncountersSection2 encountersSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_ENCOUNTER_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTERS_SECTION2);
			try {
				VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_ENCOUNTER_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_ENCOUNTER_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_ENCOUNTER_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encountersSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENCOUNTERS_SECTION2__ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_ENCOUNTER_ACTIVITIES,
					ConsolPlugin.INSTANCE.getString("EncountersSection2EncountersSectionEntriesOptionalEncounterActivities"),
					new Object[] { encountersSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolEncounterActivity2s(EncountersSection2) <em>Get Consol Encounter Activity2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolEncounterActivity2s(EncountersSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_ENCOUNTER_ACTIVITY2S__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::EncounterActivity2)).oclAsType(consol::EncounterActivity2)";

	/**
	 * The cached OCL query for the '{@link #getConsolEncounterActivity2s(EncountersSection2) <em>Get Consol Encounter Activity2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolEncounterActivity2s(EncountersSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_ENCOUNTER_ACTIVITY2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<EncounterActivity2> getConsolEncounterActivity2s(EncountersSection2 encountersSection2) {
		if (GET_CONSOL_ENCOUNTER_ACTIVITY2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ENCOUNTERS_SECTION2,
				ConsolPackage.Literals.ENCOUNTERS_SECTION2.getEAllOperations().get(62));
			try {
				GET_CONSOL_ENCOUNTER_ACTIVITY2S__EOCL_QRY = helper.createQuery(GET_CONSOL_ENCOUNTER_ACTIVITY2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_ENCOUNTER_ACTIVITY2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EncounterActivity2> result = (Collection<EncounterActivity2>) query.evaluate(encountersSection2);
		return new BasicEList.UnmodifiableEList<EncounterActivity2>(result.size(), result.toArray());
	}

} // EncountersSection2Operations
