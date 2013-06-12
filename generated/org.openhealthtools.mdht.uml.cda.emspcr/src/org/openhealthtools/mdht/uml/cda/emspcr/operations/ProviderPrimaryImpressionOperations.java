/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpression;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Provider Primary Impression</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpression#validateProviderPrimaryImpressionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Primary Impression Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpression#validateProviderPrimaryImpressionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Primary Impression Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpression#validateProviderPrimaryImpressionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Primary Impression Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpression#validateProviderPrimaryImpressionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Primary Impression Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpression#validateProviderPrimaryImpressionValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Primary Impression Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpression#validateProviderPrimaryImpressionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Primary Impression Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProviderPrimaryImpressionOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ProviderPrimaryImpressionOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateProviderPrimaryImpressionTemplateId(ProviderPrimaryImpression, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Primary Impression Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProviderPrimaryImpressionTemplateId(ProviderPrimaryImpression, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROVIDER_PRIMARY_IMPRESSION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.65')";

	/**
	* The cached OCL invariant for the '{@link #validateProviderPrimaryImpressionTemplateId(ProviderPrimaryImpression, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Primary Impression Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProviderPrimaryImpressionTemplateId(ProviderPrimaryImpression, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROVIDER_PRIMARY_IMPRESSION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param providerPrimaryImpression The receiving '<em><b>Provider Primary Impression</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProviderPrimaryImpressionTemplateId(
			ProviderPrimaryImpression providerPrimaryImpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROVIDER_PRIMARY_IMPRESSION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROVIDER_PRIMARY_IMPRESSION);
			try {
				VALIDATE_PROVIDER_PRIMARY_IMPRESSION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROVIDER_PRIMARY_IMPRESSION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROVIDER_PRIMARY_IMPRESSION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			providerPrimaryImpression)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROVIDER_PRIMARY_IMPRESSION__PROVIDER_PRIMARY_IMPRESSION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("ProviderPrimaryImpressionTemplateId"),
					new Object[] { providerPrimaryImpression }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProviderPrimaryImpressionCodeP(ProviderPrimaryImpression, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Primary Impression Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProviderPrimaryImpressionCodeP(ProviderPrimaryImpression, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROVIDER_PRIMARY_IMPRESSION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateProviderPrimaryImpressionCodeP(ProviderPrimaryImpression, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Primary Impression Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProviderPrimaryImpressionCodeP(ProviderPrimaryImpression, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROVIDER_PRIMARY_IMPRESSION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param providerPrimaryImpression The receiving '<em><b>Provider Primary Impression</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProviderPrimaryImpressionCodeP(ProviderPrimaryImpression providerPrimaryImpression,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROVIDER_PRIMARY_IMPRESSION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROVIDER_PRIMARY_IMPRESSION);
			try {
				VALIDATE_PROVIDER_PRIMARY_IMPRESSION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROVIDER_PRIMARY_IMPRESSION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROVIDER_PRIMARY_IMPRESSION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			providerPrimaryImpression)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROVIDER_PRIMARY_IMPRESSION__PROVIDER_PRIMARY_IMPRESSION_CODE_P,
					EmspcrPlugin.INSTANCE.getString("ProviderPrimaryImpressionCodeP"),
					new Object[] { providerPrimaryImpression }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpressionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpressionCodeP", passToken);
				}
				passToken.add(providerPrimaryImpression);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProviderPrimaryImpressionCode(ProviderPrimaryImpression, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Primary Impression Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProviderPrimaryImpressionCode(ProviderPrimaryImpression, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROVIDER_PRIMARY_IMPRESSION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67492-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateProviderPrimaryImpressionCode(ProviderPrimaryImpression, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Primary Impression Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProviderPrimaryImpressionCode(ProviderPrimaryImpression, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROVIDER_PRIMARY_IMPRESSION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param providerPrimaryImpression The receiving '<em><b>Provider Primary Impression</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProviderPrimaryImpressionCode(ProviderPrimaryImpression providerPrimaryImpression,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpressionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(providerPrimaryImpression)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PROVIDER_PRIMARY_IMPRESSION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROVIDER_PRIMARY_IMPRESSION);
			try {
				VALIDATE_PROVIDER_PRIMARY_IMPRESSION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROVIDER_PRIMARY_IMPRESSION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROVIDER_PRIMARY_IMPRESSION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			providerPrimaryImpression)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROVIDER_PRIMARY_IMPRESSION__PROVIDER_PRIMARY_IMPRESSION_CODE,
					EmspcrPlugin.INSTANCE.getString("ProviderPrimaryImpressionCode"),
					new Object[] { providerPrimaryImpression }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProviderPrimaryImpressionValue(ProviderPrimaryImpression, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Primary Impression Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProviderPrimaryImpressionValue(ProviderPrimaryImpression, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROVIDER_PRIMARY_IMPRESSION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.90'))";

	/**
	* The cached OCL invariant for the '{@link #validateProviderPrimaryImpressionValue(ProviderPrimaryImpression, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Primary Impression Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProviderPrimaryImpressionValue(ProviderPrimaryImpression, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROVIDER_PRIMARY_IMPRESSION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param providerPrimaryImpression The receiving '<em><b>Provider Primary Impression</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProviderPrimaryImpressionValue(ProviderPrimaryImpression providerPrimaryImpression,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROVIDER_PRIMARY_IMPRESSION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROVIDER_PRIMARY_IMPRESSION);
			try {
				VALIDATE_PROVIDER_PRIMARY_IMPRESSION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROVIDER_PRIMARY_IMPRESSION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROVIDER_PRIMARY_IMPRESSION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			providerPrimaryImpression)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROVIDER_PRIMARY_IMPRESSION__PROVIDER_PRIMARY_IMPRESSION_VALUE,
					EmspcrPlugin.INSTANCE.getString("ProviderPrimaryImpressionValue"),
					new Object[] { providerPrimaryImpression }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProviderPrimaryImpressionValueP(ProviderPrimaryImpression, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Primary Impression Value P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProviderPrimaryImpressionValueP(ProviderPrimaryImpression, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROVIDER_PRIMARY_IMPRESSION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	* The cached OCL invariant for the '{@link #validateProviderPrimaryImpressionValueP(ProviderPrimaryImpression, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Primary Impression Value P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProviderPrimaryImpressionValueP(ProviderPrimaryImpression, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROVIDER_PRIMARY_IMPRESSION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param providerPrimaryImpression The receiving '<em><b>Provider Primary Impression</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProviderPrimaryImpressionValueP(ProviderPrimaryImpression providerPrimaryImpression,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROVIDER_PRIMARY_IMPRESSION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROVIDER_PRIMARY_IMPRESSION);
			try {
				VALIDATE_PROVIDER_PRIMARY_IMPRESSION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROVIDER_PRIMARY_IMPRESSION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROVIDER_PRIMARY_IMPRESSION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			providerPrimaryImpression)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROVIDER_PRIMARY_IMPRESSION__PROVIDER_PRIMARY_IMPRESSION_VALUE_P,
					EmspcrPlugin.INSTANCE.getString("ProviderPrimaryImpressionValueP"),
					new Object[] { providerPrimaryImpression }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProviderPrimaryImpressionMoodCode(ProviderPrimaryImpression, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Primary Impression Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProviderPrimaryImpressionMoodCode(ProviderPrimaryImpression, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROVIDER_PRIMARY_IMPRESSION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	* The cached OCL invariant for the '{@link #validateProviderPrimaryImpressionMoodCode(ProviderPrimaryImpression, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Primary Impression Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProviderPrimaryImpressionMoodCode(ProviderPrimaryImpression, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROVIDER_PRIMARY_IMPRESSION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param providerPrimaryImpression The receiving '<em><b>Provider Primary Impression</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProviderPrimaryImpressionMoodCode(
			ProviderPrimaryImpression providerPrimaryImpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROVIDER_PRIMARY_IMPRESSION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROVIDER_PRIMARY_IMPRESSION);
			try {
				VALIDATE_PROVIDER_PRIMARY_IMPRESSION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROVIDER_PRIMARY_IMPRESSION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROVIDER_PRIMARY_IMPRESSION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			providerPrimaryImpression)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PROVIDER_PRIMARY_IMPRESSION__PROVIDER_PRIMARY_IMPRESSION_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("ProviderPrimaryImpressionMoodCode"),
					new Object[] { providerPrimaryImpression }));
			}

			return false;
		}
		return true;
	}

} // ProviderPrimaryImpressionOperations
