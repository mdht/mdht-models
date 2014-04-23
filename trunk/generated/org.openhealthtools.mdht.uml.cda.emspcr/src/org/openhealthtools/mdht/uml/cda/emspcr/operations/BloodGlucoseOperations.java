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

import org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucose;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Blood Glucose</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucose#validateBloodGlucoseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Blood Glucose Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucose#validateBloodGlucoseMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Blood Glucose Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucose#validateBloodGlucoseCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Blood Glucose Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucose#validateBloodGlucoseCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Blood Glucose Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucose#validateBloodGlucoseEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Blood Glucose Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucose#validateBloodGlucoseValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Blood Glucose Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BloodGlucoseOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BloodGlucoseOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBloodGlucoseTemplateId(BloodGlucose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Blood Glucose Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBloodGlucoseTemplateId(BloodGlucose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BLOOD_GLUCOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.166')";

	/**
	 * The cached OCL invariant for the '{@link #validateBloodGlucoseTemplateId(BloodGlucose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Blood Glucose Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBloodGlucoseTemplateId(BloodGlucose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_BLOOD_GLUCOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param bloodGlucose The receiving '<em><b>Blood Glucose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBloodGlucoseTemplateId(BloodGlucose bloodGlucose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BLOOD_GLUCOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BLOOD_GLUCOSE);
			try {
				VALIDATE_BLOOD_GLUCOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BLOOD_GLUCOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BLOOD_GLUCOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			bloodGlucose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BLOOD_GLUCOSE__BLOOD_GLUCOSE_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("BloodGlucoseTemplateId"), new Object[] { bloodGlucose }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBloodGlucoseMoodCode(BloodGlucose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Blood Glucose Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBloodGlucoseMoodCode(BloodGlucose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BLOOD_GLUCOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateBloodGlucoseMoodCode(BloodGlucose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Blood Glucose Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBloodGlucoseMoodCode(BloodGlucose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_BLOOD_GLUCOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param bloodGlucose The receiving '<em><b>Blood Glucose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBloodGlucoseMoodCode(BloodGlucose bloodGlucose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BLOOD_GLUCOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BLOOD_GLUCOSE);
			try {
				VALIDATE_BLOOD_GLUCOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BLOOD_GLUCOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BLOOD_GLUCOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bloodGlucose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BLOOD_GLUCOSE__BLOOD_GLUCOSE_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("BloodGlucoseMoodCode"), new Object[] { bloodGlucose }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBloodGlucoseCodeP(BloodGlucose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Blood Glucose Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBloodGlucoseCodeP(BloodGlucose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BLOOD_GLUCOSE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBloodGlucoseCodeP(BloodGlucose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Blood Glucose Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBloodGlucoseCodeP(BloodGlucose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_BLOOD_GLUCOSE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param bloodGlucose The receiving '<em><b>Blood Glucose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBloodGlucoseCodeP(BloodGlucose bloodGlucose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BLOOD_GLUCOSE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BLOOD_GLUCOSE);
			try {
				VALIDATE_BLOOD_GLUCOSE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BLOOD_GLUCOSE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BLOOD_GLUCOSE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bloodGlucose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BLOOD_GLUCOSE__BLOOD_GLUCOSE_CODE_P,
					EmspcrPlugin.INSTANCE.getString("BloodGlucoseCodeP"), new Object[] { bloodGlucose }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucoseCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucoseCodeP", passToken);
				}
				passToken.add(bloodGlucose);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBloodGlucoseCode(BloodGlucose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Blood Glucose Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBloodGlucoseCode(BloodGlucose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BLOOD_GLUCOSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '2339-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateBloodGlucoseCode(BloodGlucose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Blood Glucose Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBloodGlucoseCode(BloodGlucose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_BLOOD_GLUCOSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param bloodGlucose The receiving '<em><b>Blood Glucose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBloodGlucoseCode(BloodGlucose bloodGlucose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucoseCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(bloodGlucose)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_BLOOD_GLUCOSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BLOOD_GLUCOSE);
			try {
				VALIDATE_BLOOD_GLUCOSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BLOOD_GLUCOSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BLOOD_GLUCOSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bloodGlucose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BLOOD_GLUCOSE__BLOOD_GLUCOSE_CODE,
					EmspcrPlugin.INSTANCE.getString("BloodGlucoseCode"), new Object[] { bloodGlucose }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBloodGlucoseEffectiveTime(BloodGlucose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Blood Glucose Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBloodGlucoseEffectiveTime(BloodGlucose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BLOOD_GLUCOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBloodGlucoseEffectiveTime(BloodGlucose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Blood Glucose Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBloodGlucoseEffectiveTime(BloodGlucose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_BLOOD_GLUCOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param bloodGlucose The receiving '<em><b>Blood Glucose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBloodGlucoseEffectiveTime(BloodGlucose bloodGlucose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BLOOD_GLUCOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BLOOD_GLUCOSE);
			try {
				VALIDATE_BLOOD_GLUCOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BLOOD_GLUCOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BLOOD_GLUCOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			bloodGlucose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BLOOD_GLUCOSE__BLOOD_GLUCOSE_EFFECTIVE_TIME,
					EmspcrPlugin.INSTANCE.getString("BloodGlucoseEffectiveTime"), new Object[] { bloodGlucose }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBloodGlucoseValue(BloodGlucose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Blood Glucose Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBloodGlucoseValue(BloodGlucose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BLOOD_GLUCOSE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

	/**
	 * The cached OCL invariant for the '{@link #validateBloodGlucoseValue(BloodGlucose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Blood Glucose Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBloodGlucoseValue(BloodGlucose, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_BLOOD_GLUCOSE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param bloodGlucose The receiving '<em><b>Blood Glucose</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBloodGlucoseValue(BloodGlucose bloodGlucose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BLOOD_GLUCOSE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BLOOD_GLUCOSE);
			try {
				VALIDATE_BLOOD_GLUCOSE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BLOOD_GLUCOSE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BLOOD_GLUCOSE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(bloodGlucose)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BLOOD_GLUCOSE__BLOOD_GLUCOSE_VALUE,
					EmspcrPlugin.INSTANCE.getString("BloodGlucoseValue"), new Object[] { bloodGlucose }));
			}

			return false;
		}
		return true;
	}

} // BloodGlucoseOperations
