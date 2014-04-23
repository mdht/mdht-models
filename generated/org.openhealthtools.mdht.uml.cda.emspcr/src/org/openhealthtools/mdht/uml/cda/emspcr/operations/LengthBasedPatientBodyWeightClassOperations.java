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
import org.openhealthtools.mdht.uml.cda.emspcr.LengthBasedPatientBodyWeightClass;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Length Based Patient Body Weight Class</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LengthBasedPatientBodyWeightClass#validateLengthBasedPatientBodyWeightClassTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Length Based Patient Body Weight Class Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LengthBasedPatientBodyWeightClass#validateLengthBasedPatientBodyWeightClassMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Length Based Patient Body Weight Class Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LengthBasedPatientBodyWeightClass#validateLengthBasedPatientBodyWeightClassCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Length Based Patient Body Weight Class Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LengthBasedPatientBodyWeightClass#validateLengthBasedPatientBodyWeightClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Length Based Patient Body Weight Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LengthBasedPatientBodyWeightClass#validateLengthBasedPatientBodyWeightClassEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Length Based Patient Body Weight Class Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LengthBasedPatientBodyWeightClass#validateLengthBasedPatientBodyWeightClassValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Length Based Patient Body Weight Class Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LengthBasedPatientBodyWeightClassOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LengthBasedPatientBodyWeightClassOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLengthBasedPatientBodyWeightClassTemplateId(LengthBasedPatientBodyWeightClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Length Based Patient Body Weight Class Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLengthBasedPatientBodyWeightClassTemplateId(LengthBasedPatientBodyWeightClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.110')";

	/**
	 * The cached OCL invariant for the '{@link #validateLengthBasedPatientBodyWeightClassTemplateId(LengthBasedPatientBodyWeightClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Length Based Patient Body Weight Class Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLengthBasedPatientBodyWeightClassTemplateId(LengthBasedPatientBodyWeightClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lengthBasedPatientBodyWeightClass The receiving '<em><b>Length Based Patient Body Weight Class</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLengthBasedPatientBodyWeightClassTemplateId(
			LengthBasedPatientBodyWeightClass lengthBasedPatientBodyWeightClass, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS);
			try {
				VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			lengthBasedPatientBodyWeightClass)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS__LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("LengthBasedPatientBodyWeightClassTemplateId"),
					new Object[] { lengthBasedPatientBodyWeightClass }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLengthBasedPatientBodyWeightClassMoodCode(LengthBasedPatientBodyWeightClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Length Based Patient Body Weight Class Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLengthBasedPatientBodyWeightClassMoodCode(LengthBasedPatientBodyWeightClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateLengthBasedPatientBodyWeightClassMoodCode(LengthBasedPatientBodyWeightClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Length Based Patient Body Weight Class Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLengthBasedPatientBodyWeightClassMoodCode(LengthBasedPatientBodyWeightClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lengthBasedPatientBodyWeightClass The receiving '<em><b>Length Based Patient Body Weight Class</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLengthBasedPatientBodyWeightClassMoodCode(
			LengthBasedPatientBodyWeightClass lengthBasedPatientBodyWeightClass, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS);
			try {
				VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			lengthBasedPatientBodyWeightClass)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS__LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("LengthBasedPatientBodyWeightClassMoodCode"),
					new Object[] { lengthBasedPatientBodyWeightClass }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLengthBasedPatientBodyWeightClassCodeP(LengthBasedPatientBodyWeightClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Length Based Patient Body Weight Class Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLengthBasedPatientBodyWeightClassCodeP(LengthBasedPatientBodyWeightClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateLengthBasedPatientBodyWeightClassCodeP(LengthBasedPatientBodyWeightClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Length Based Patient Body Weight Class Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLengthBasedPatientBodyWeightClassCodeP(LengthBasedPatientBodyWeightClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lengthBasedPatientBodyWeightClass The receiving '<em><b>Length Based Patient Body Weight Class</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLengthBasedPatientBodyWeightClassCodeP(
			LengthBasedPatientBodyWeightClass lengthBasedPatientBodyWeightClass, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS);
			try {
				VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			lengthBasedPatientBodyWeightClass)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS__LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_CODE_P,
					EmspcrPlugin.INSTANCE.getString("LengthBasedPatientBodyWeightClassCodeP"),
					new Object[] { lengthBasedPatientBodyWeightClass }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.LengthBasedPatientBodyWeightClassCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.emspcr.LengthBasedPatientBodyWeightClassCodeP", passToken);
				}
				passToken.add(lengthBasedPatientBodyWeightClass);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLengthBasedPatientBodyWeightClassCode(LengthBasedPatientBodyWeightClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Length Based Patient Body Weight Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLengthBasedPatientBodyWeightClassCode(LengthBasedPatientBodyWeightClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67670-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateLengthBasedPatientBodyWeightClassCode(LengthBasedPatientBodyWeightClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Length Based Patient Body Weight Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLengthBasedPatientBodyWeightClassCode(LengthBasedPatientBodyWeightClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lengthBasedPatientBodyWeightClass The receiving '<em><b>Length Based Patient Body Weight Class</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLengthBasedPatientBodyWeightClassCode(
			LengthBasedPatientBodyWeightClass lengthBasedPatientBodyWeightClass, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.LengthBasedPatientBodyWeightClassCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(lengthBasedPatientBodyWeightClass)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS);
			try {
				VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			lengthBasedPatientBodyWeightClass)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS__LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_CODE,
					EmspcrPlugin.INSTANCE.getString("LengthBasedPatientBodyWeightClassCode"),
					new Object[] { lengthBasedPatientBodyWeightClass }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLengthBasedPatientBodyWeightClassEffectiveTime(LengthBasedPatientBodyWeightClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Length Based Patient Body Weight Class Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLengthBasedPatientBodyWeightClassEffectiveTime(LengthBasedPatientBodyWeightClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateLengthBasedPatientBodyWeightClassEffectiveTime(LengthBasedPatientBodyWeightClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Length Based Patient Body Weight Class Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLengthBasedPatientBodyWeightClassEffectiveTime(LengthBasedPatientBodyWeightClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lengthBasedPatientBodyWeightClass The receiving '<em><b>Length Based Patient Body Weight Class</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLengthBasedPatientBodyWeightClassEffectiveTime(
			LengthBasedPatientBodyWeightClass lengthBasedPatientBodyWeightClass, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS);
			try {
				VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			lengthBasedPatientBodyWeightClass)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS__LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_EFFECTIVE_TIME,
					EmspcrPlugin.INSTANCE.getString("LengthBasedPatientBodyWeightClassEffectiveTime"),
					new Object[] { lengthBasedPatientBodyWeightClass }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLengthBasedPatientBodyWeightClassValue(LengthBasedPatientBodyWeightClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Length Based Patient Body Weight Class Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLengthBasedPatientBodyWeightClassValue(LengthBasedPatientBodyWeightClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA15553-3' or value.code = 'LA15554-1' or value.code = 'LA15555-8' or value.code = 'LA17192-8' or value.code = 'LA17193-6' or value.code = 'LA17194-4' or value.code = 'LA17195-1' or value.code = 'LA17196-9' or value.code = 'LA4457-3')))";

	/**
	 * The cached OCL invariant for the '{@link #validateLengthBasedPatientBodyWeightClassValue(LengthBasedPatientBodyWeightClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Length Based Patient Body Weight Class Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLengthBasedPatientBodyWeightClassValue(LengthBasedPatientBodyWeightClass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lengthBasedPatientBodyWeightClass The receiving '<em><b>Length Based Patient Body Weight Class</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLengthBasedPatientBodyWeightClassValue(
			LengthBasedPatientBodyWeightClass lengthBasedPatientBodyWeightClass, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS);
			try {
				VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			lengthBasedPatientBodyWeightClass)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS__LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_VALUE,
					EmspcrPlugin.INSTANCE.getString("LengthBasedPatientBodyWeightClassValue"),
					new Object[] { lengthBasedPatientBodyWeightClass }));
			}

			return false;
		}
		return true;
	}

} // LengthBasedPatientBodyWeightClassOperations
