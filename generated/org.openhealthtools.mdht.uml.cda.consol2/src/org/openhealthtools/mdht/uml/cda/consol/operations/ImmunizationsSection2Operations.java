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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunizations Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2#validateImmunizationsSection2NullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section2 Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2#validateImmunizationsSection2Title(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section2 Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2#validateImmunizationsSection2Text(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section2 Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2#validateImmunizationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2#validateImmunizationsSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2#validateImmunizationsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2#validateImmunizationsSectionEntriesOptionalImmunizationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Immunization Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2#getConsolImmunizationActivity2s() <em>Get Consol Immunization Activity2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImmunizationsSection2Operations extends ImmunizationsSectionEntriesOptional2Operations {
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
	protected ImmunizationsSection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationsSection2NullFlavor(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section2 Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSection2NullFlavor(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATIONS_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('nullFlavor')";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationsSection2NullFlavor(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section2 Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSection2NullFlavor(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_IMMUNIZATIONS_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationsSection2 The receiving '<em><b>Immunizations Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationsSection2NullFlavor(ImmunizationsSection2 immunizationsSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ImmunizationsSection2ImmunizationsSection2NullFlavor", "INFO");

		if (VALIDATE_IMMUNIZATIONS_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATIONS_SECTION2);
			try {
				VALIDATE_IMMUNIZATIONS_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_IMMUNIZATIONS_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_IMMUNIZATIONS_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				immunizationsSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.IMMUNIZATIONS_SECTION2__IMMUNIZATIONS_SECTION2_NULL_FLAVOR,
						ConsolPlugin.INSTANCE.getString("ImmunizationsSection2ImmunizationsSection2NullFlavor"),
						new Object[] { immunizationsSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationsSection2Title(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section2 Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSection2Title(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATIONS_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationsSection2Title(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section2 Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSection2Title(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_IMMUNIZATIONS_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationsSection2 The receiving '<em><b>Immunizations Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationsSection2Title(ImmunizationsSection2 immunizationsSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ImmunizationsSection2ImmunizationsSection2Title", "ERROR");

		if (VALIDATE_IMMUNIZATIONS_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATIONS_SECTION2);
			try {
				VALIDATE_IMMUNIZATIONS_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_IMMUNIZATIONS_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_IMMUNIZATIONS_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(immunizationsSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.IMMUNIZATIONS_SECTION2__IMMUNIZATIONS_SECTION2_TITLE,
						ConsolPlugin.INSTANCE.getString("ImmunizationsSection2ImmunizationsSection2Title"),
						new Object[] { immunizationsSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationsSection2Text(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section2 Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSection2Text(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATIONS_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationsSection2Text(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section2 Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSection2Text(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_IMMUNIZATIONS_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationsSection2 The receiving '<em><b>Immunizations Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationsSection2Text(ImmunizationsSection2 immunizationsSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ImmunizationsSection2ImmunizationsSection2Text", "ERROR");

		if (VALIDATE_IMMUNIZATIONS_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATIONS_SECTION2);
			try {
				VALIDATE_IMMUNIZATIONS_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_IMMUNIZATIONS_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_IMMUNIZATIONS_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(immunizationsSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.IMMUNIZATIONS_SECTION2__IMMUNIZATIONS_SECTION2_TEXT,
						ConsolPlugin.INSTANCE.getString("ImmunizationsSection2ImmunizationsSection2Text"),
						new Object[] { immunizationsSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationsSectionEntriesOptionalTemplateId(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionEntriesOptionalTemplateId(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.2.1' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationsSectionEntriesOptionalTemplateId(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionEntriesOptionalTemplateId(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationsSection2 The receiving '<em><b>Immunizations Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationsSectionEntriesOptionalTemplateId(
			ImmunizationsSection2 immunizationsSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ImmunizationsSection2ImmunizationsSectionEntriesOptionalTemplateId", "ERROR");

		if (VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATIONS_SECTION2);
			try {
				VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				immunizationsSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.IMMUNIZATIONS_SECTION2__IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"ImmunizationsSection2ImmunizationsSectionEntriesOptionalTemplateId"),
						new Object[] { immunizationsSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationsSectionEntriesOptionalCodeP(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionEntriesOptionalCodeP(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationsSectionEntriesOptionalCodeP(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionEntriesOptionalCodeP(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationsSection2 The receiving '<em><b>Immunizations Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationsSectionEntriesOptionalCodeP(ImmunizationsSection2 immunizationsSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ImmunizationsSection2ImmunizationsSectionEntriesOptionalCodeP", "ERROR");

		if (VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATIONS_SECTION2);
			try {
				VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				immunizationsSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.IMMUNIZATIONS_SECTION2__IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"ImmunizationsSection2ImmunizationsSectionEntriesOptionalCodeP"),
						new Object[] { immunizationsSection2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptionalCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptionalCodeP", passToken);
				}
				passToken.add(immunizationsSection2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationsSectionEntriesOptionalCode(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionEntriesOptionalCode(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '11369-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationsSectionEntriesOptionalCode(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionEntriesOptionalCode(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationsSection2 The receiving '<em><b>Immunizations Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationsSectionEntriesOptionalCode(ImmunizationsSection2 immunizationsSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptionalCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(immunizationsSection2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "ImmunizationsSection2ImmunizationsSectionEntriesOptionalCode", "ERROR");

		if (VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATIONS_SECTION2);
			try {
				VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				immunizationsSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.IMMUNIZATIONS_SECTION2__IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE,
						ConsolPlugin.INSTANCE.getString("ImmunizationsSection2ImmunizationsSectionEntriesOptionalCode"),
						new Object[] { immunizationsSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationsSectionEntriesOptionalImmunizationActivity(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Immunization Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionEntriesOptionalImmunizationActivity(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(consol::ImmunizationActivity2))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationsSectionEntriesOptionalImmunizationActivity(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Immunization Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionEntriesOptionalImmunizationActivity(ImmunizationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationsSection2 The receiving '<em><b>Immunizations Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationsSectionEntriesOptionalImmunizationActivity(
			ImmunizationsSection2 immunizationsSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ImmunizationsSection2ImmunizationsSectionEntriesOptionalImmunizationActivity", "ERROR");

		if (VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATIONS_SECTION2);
			try {
				VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				immunizationsSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.IMMUNIZATIONS_SECTION2__IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_IMMUNIZATION_ACTIVITY,
						ConsolPlugin.INSTANCE.getString(
							"ImmunizationsSection2ImmunizationsSectionEntriesOptionalImmunizationActivity"),
						new Object[] { immunizationsSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolImmunizationActivity2s(ImmunizationsSection2) <em>Get Consol Immunization Activity2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolImmunizationActivity2s(ImmunizationsSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_IMMUNIZATION_ACTIVITY2S__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::ImmunizationActivity2)).oclAsType(consol::ImmunizationActivity2)";

	/**
	 * The cached OCL query for the '{@link #getConsolImmunizationActivity2s(ImmunizationsSection2) <em>Get Consol Immunization Activity2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolImmunizationActivity2s(ImmunizationsSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_IMMUNIZATION_ACTIVITY2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ImmunizationActivity2> getConsolImmunizationActivity2s(
			ImmunizationsSection2 immunizationsSection2) {

		if (GET_CONSOL_IMMUNIZATION_ACTIVITY2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.IMMUNIZATIONS_SECTION2,
				ConsolPackage.Literals.IMMUNIZATIONS_SECTION2.getEAllOperations().get(62));
			try {
				GET_CONSOL_IMMUNIZATION_ACTIVITY2S__EOCL_QRY = helper.createQuery(
					GET_CONSOL_IMMUNIZATION_ACTIVITY2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_IMMUNIZATION_ACTIVITY2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ImmunizationActivity2> result = (Collection<ImmunizationActivity2>) query.evaluate(
			immunizationsSection2);
		return new BasicEList.UnmodifiableEList<>(result.size(), result.toArray());
	}

} // ImmunizationsSection2Operations
