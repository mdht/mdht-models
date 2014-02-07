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
import org.openhealthtools.mdht.uml.cda.emspcr.PossibleInjury;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Possible Injury</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PossibleInjury#validatePossibleInjuryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Possible Injury Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PossibleInjury#validatePossibleInjuryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Possible Injury Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PossibleInjury#validatePossibleInjuryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Possible Injury Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PossibleInjury#validatePossibleInjuryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Possible Injury Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PossibleInjury#validatePossibleInjuryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Possible Injury Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PossibleInjuryOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PossibleInjuryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePossibleInjuryTemplateId(PossibleInjury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Possible Injury Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePossibleInjuryTemplateId(PossibleInjury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSSIBLE_INJURY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.64')";

	/**
	 * The cached OCL invariant for the '{@link #validatePossibleInjuryTemplateId(PossibleInjury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Possible Injury Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePossibleInjuryTemplateId(PossibleInjury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POSSIBLE_INJURY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param possibleInjury The receiving '<em><b>Possible Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePossibleInjuryTemplateId(PossibleInjury possibleInjury, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POSSIBLE_INJURY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.POSSIBLE_INJURY);
			try {
				VALIDATE_POSSIBLE_INJURY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSSIBLE_INJURY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POSSIBLE_INJURY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			possibleInjury)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.POSSIBLE_INJURY__POSSIBLE_INJURY_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("PossibleInjuryTemplateId"), new Object[] { possibleInjury }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePossibleInjuryMoodCode(PossibleInjury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Possible Injury Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePossibleInjuryMoodCode(PossibleInjury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSSIBLE_INJURY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePossibleInjuryMoodCode(PossibleInjury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Possible Injury Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePossibleInjuryMoodCode(PossibleInjury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POSSIBLE_INJURY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param possibleInjury The receiving '<em><b>Possible Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePossibleInjuryMoodCode(PossibleInjury possibleInjury, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POSSIBLE_INJURY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.POSSIBLE_INJURY);
			try {
				VALIDATE_POSSIBLE_INJURY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSSIBLE_INJURY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POSSIBLE_INJURY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			possibleInjury)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.POSSIBLE_INJURY__POSSIBLE_INJURY_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("PossibleInjuryMoodCode"), new Object[] { possibleInjury }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePossibleInjuryCodeP(PossibleInjury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Possible Injury Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePossibleInjuryCodeP(PossibleInjury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSSIBLE_INJURY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePossibleInjuryCodeP(PossibleInjury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Possible Injury Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePossibleInjuryCodeP(PossibleInjury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POSSIBLE_INJURY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param possibleInjury The receiving '<em><b>Possible Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePossibleInjuryCodeP(PossibleInjury possibleInjury, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POSSIBLE_INJURY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.POSSIBLE_INJURY);
			try {
				VALIDATE_POSSIBLE_INJURY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSSIBLE_INJURY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POSSIBLE_INJURY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(possibleInjury)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.POSSIBLE_INJURY__POSSIBLE_INJURY_CODE_P,
					EmspcrPlugin.INSTANCE.getString("PossibleInjuryCodeP"), new Object[] { possibleInjury }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.PossibleInjuryCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.PossibleInjuryCodeP", passToken);
				}
				passToken.add(possibleInjury);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePossibleInjuryCode(PossibleInjury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Possible Injury Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePossibleInjuryCode(PossibleInjury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSSIBLE_INJURY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '69467-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePossibleInjuryCode(PossibleInjury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Possible Injury Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePossibleInjuryCode(PossibleInjury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POSSIBLE_INJURY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param possibleInjury The receiving '<em><b>Possible Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePossibleInjuryCode(PossibleInjury possibleInjury, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.PossibleInjuryCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(possibleInjury)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_POSSIBLE_INJURY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.POSSIBLE_INJURY);
			try {
				VALIDATE_POSSIBLE_INJURY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSSIBLE_INJURY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POSSIBLE_INJURY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(possibleInjury)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.POSSIBLE_INJURY__POSSIBLE_INJURY_CODE,
					EmspcrPlugin.INSTANCE.getString("PossibleInjuryCode"), new Object[] { possibleInjury }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePossibleInjuryValue(PossibleInjury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Possible Injury Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePossibleInjuryValue(PossibleInjury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSSIBLE_INJURY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePossibleInjuryValue(PossibleInjury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Possible Injury Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePossibleInjuryValue(PossibleInjury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POSSIBLE_INJURY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param possibleInjury The receiving '<em><b>Possible Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePossibleInjuryValue(PossibleInjury possibleInjury, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POSSIBLE_INJURY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.POSSIBLE_INJURY);
			try {
				VALIDATE_POSSIBLE_INJURY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSSIBLE_INJURY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POSSIBLE_INJURY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(possibleInjury)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.POSSIBLE_INJURY__POSSIBLE_INJURY_VALUE,
					EmspcrPlugin.INSTANCE.getString("PossibleInjuryValue"), new Object[] { possibleInjury }));
			}

			return false;
		}
		return true;
	}

} // PossibleInjuryOperations
