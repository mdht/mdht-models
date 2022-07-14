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
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2;
import org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergies Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2#validateAllergiesSection2NullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section2 Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2#validateAllergiesSection2Title(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section2 Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2#validateAllergiesSection2Text(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section2 Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2#validateAllergiesSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2#validateAllergiesSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2#validateAllergiesSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2#validateAllergiesSectionEntriesOptionalAllergyProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Allergy Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2#getConsolAllergyConcernAct2s() <em>Get Consol Allergy Concern Act2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergiesSection2Operations extends AllergiesSectionEntriesOptional2Operations {
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
	protected AllergiesSection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesSection2NullFlavor(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section2 Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSection2NullFlavor(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('nullFlavor')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesSection2NullFlavor(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section2 Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSection2NullFlavor(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ALLERGIES_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergiesSection2 The receiving '<em><b>Allergies Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergiesSection2NullFlavor(AllergiesSection2 allergiesSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "AllergiesSection2AllergiesSection2NullFlavor", "INFO");

		if (VALIDATE_ALLERGIES_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGIES_SECTION2);
			try {
				VALIDATE_ALLERGIES_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ALLERGIES_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ALLERGIES_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(allergiesSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGIES_SECTION2__ALLERGIES_SECTION2_NULL_FLAVOR,
						ConsolPlugin.INSTANCE.getString("AllergiesSection2AllergiesSection2NullFlavor"),
						new Object[] { allergiesSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesSection2Title(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section2 Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSection2Title(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesSection2Title(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section2 Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSection2Title(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ALLERGIES_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergiesSection2 The receiving '<em><b>Allergies Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergiesSection2Title(AllergiesSection2 allergiesSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "AllergiesSection2AllergiesSection2Title", "ERROR");

		if (VALIDATE_ALLERGIES_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGIES_SECTION2);
			try {
				VALIDATE_ALLERGIES_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ALLERGIES_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ALLERGIES_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			allergiesSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGIES_SECTION2__ALLERGIES_SECTION2_TITLE,
						ConsolPlugin.INSTANCE.getString("AllergiesSection2AllergiesSection2Title"),
						new Object[] { allergiesSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesSection2Text(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section2 Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSection2Text(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesSection2Text(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section2 Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSection2Text(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ALLERGIES_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergiesSection2 The receiving '<em><b>Allergies Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergiesSection2Text(AllergiesSection2 allergiesSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "AllergiesSection2AllergiesSection2Text", "ERROR");

		if (VALIDATE_ALLERGIES_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGIES_SECTION2);
			try {
				VALIDATE_ALLERGIES_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ALLERGIES_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ALLERGIES_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			allergiesSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGIES_SECTION2__ALLERGIES_SECTION2_TEXT,
						ConsolPlugin.INSTANCE.getString("AllergiesSection2AllergiesSection2Text"),
						new Object[] { allergiesSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesSectionEntriesOptionalTemplateId(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionEntriesOptionalTemplateId(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.6.1' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesSectionEntriesOptionalTemplateId(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionEntriesOptionalTemplateId(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergiesSection2 The receiving '<em><b>Allergies Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergiesSectionEntriesOptionalTemplateId(AllergiesSection2 allergiesSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "AllergiesSection2AllergiesSectionEntriesOptionalTemplateId", "ERROR");

		if (VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGIES_SECTION2);
			try {
				VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				allergiesSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGIES_SECTION2__ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("AllergiesSection2AllergiesSectionEntriesOptionalTemplateId"),
						new Object[] { allergiesSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesSectionEntriesOptionalCodeP(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionEntriesOptionalCodeP(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesSectionEntriesOptionalCodeP(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionEntriesOptionalCodeP(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergiesSection2 The receiving '<em><b>Allergies Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergiesSectionEntriesOptionalCodeP(AllergiesSection2 allergiesSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "AllergiesSection2AllergiesSectionEntriesOptionalCodeP", "ERROR");

		if (VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGIES_SECTION2);
			try {
				VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				allergiesSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGIES_SECTION2__ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE_P,
						ConsolPlugin.INSTANCE.getString("AllergiesSection2AllergiesSectionEntriesOptionalCodeP"),
						new Object[] { allergiesSection2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptionalCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptionalCodeP", passToken);
				}
				passToken.add(allergiesSection2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesSectionEntriesOptionalCode(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionEntriesOptionalCode(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '48765-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesSectionEntriesOptionalCode(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionEntriesOptionalCode(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergiesSection2 The receiving '<em><b>Allergies Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergiesSectionEntriesOptionalCode(AllergiesSection2 allergiesSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptionalCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(allergiesSection2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "AllergiesSection2AllergiesSectionEntriesOptionalCode", "ERROR");

		if (VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGIES_SECTION2);
			try {
				VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				allergiesSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGIES_SECTION2__ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE,
						ConsolPlugin.INSTANCE.getString("AllergiesSection2AllergiesSectionEntriesOptionalCode"),
						new Object[] { allergiesSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesSectionEntriesOptionalAllergyProblemAct(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Allergy Problem Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionEntriesOptionalAllergyProblemAct(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::AllergyConcernAct2))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesSectionEntriesOptionalAllergyProblemAct(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Allergy Problem Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesSectionEntriesOptionalAllergyProblemAct(AllergiesSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergiesSection2 The receiving '<em><b>Allergies Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergiesSectionEntriesOptionalAllergyProblemAct(AllergiesSection2 allergiesSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "AllergiesSection2AllergiesSectionEntriesOptionalAllergyProblemAct", "ERROR");

		if (VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGIES_SECTION2);
			try {
				VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				allergiesSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGIES_SECTION2__ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT,
						ConsolPlugin.INSTANCE.getString(
							"AllergiesSection2AllergiesSectionEntriesOptionalAllergyProblemAct"),
						new Object[] { allergiesSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolAllergyConcernAct2s(AllergiesSection2) <em>Get Consol Allergy Concern Act2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolAllergyConcernAct2s(AllergiesSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_ALLERGY_CONCERN_ACT2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::AllergyConcernAct2)).oclAsType(consol::AllergyConcernAct2)";

	/**
	 * The cached OCL query for the '{@link #getConsolAllergyConcernAct2s(AllergiesSection2) <em>Get Consol Allergy Concern Act2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolAllergyConcernAct2s(AllergiesSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_ALLERGY_CONCERN_ACT2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AllergyConcernAct2> getConsolAllergyConcernAct2s(AllergiesSection2 allergiesSection2) {

		if (GET_CONSOL_ALLERGY_CONCERN_ACT2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ALLERGIES_SECTION2,
				ConsolPackage.Literals.ALLERGIES_SECTION2.getEAllOperations().get(62));
			try {
				GET_CONSOL_ALLERGY_CONCERN_ACT2S__EOCL_QRY = helper.createQuery(
					GET_CONSOL_ALLERGY_CONCERN_ACT2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_ALLERGY_CONCERN_ACT2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AllergyConcernAct2> result = (Collection<AllergyConcernAct2>) query.evaluate(allergiesSection2);
		return new BasicEList.UnmodifiableEList<>(result.size(), result.toArray());
	}

} // AllergiesSection2Operations
