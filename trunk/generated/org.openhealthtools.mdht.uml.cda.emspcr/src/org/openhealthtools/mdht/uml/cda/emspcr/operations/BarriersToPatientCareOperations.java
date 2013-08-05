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

import org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCare;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Barriers To Patient Care</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCare#validateBarriersToPatientCareTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Barriers To Patient Care Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCare#validateBarriersToPatientCareCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Barriers To Patient Care Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCare#validateBarriersToPatientCareCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Barriers To Patient Care Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCare#validateBarriersToPatientCareValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Barriers To Patient Care Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCare#validateBarriersToPatientCareValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Barriers To Patient Care Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCare#validateBarriersToPatientCareMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Barriers To Patient Care Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BarriersToPatientCareOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BarriersToPatientCareOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBarriersToPatientCareTemplateId(BarriersToPatientCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Barriers To Patient Care Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBarriersToPatientCareTemplateId(BarriersToPatientCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BARRIERS_TO_PATIENT_CARE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.83')";

	/**
	 * The cached OCL invariant for the '{@link #validateBarriersToPatientCareTemplateId(BarriersToPatientCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Barriers To Patient Care Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBarriersToPatientCareTemplateId(BarriersToPatientCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_BARRIERS_TO_PATIENT_CARE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param barriersToPatientCare The receiving '<em><b>Barriers To Patient Care</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBarriersToPatientCareTemplateId(BarriersToPatientCare barriersToPatientCare,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BARRIERS_TO_PATIENT_CARE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BARRIERS_TO_PATIENT_CARE);
			try {
				VALIDATE_BARRIERS_TO_PATIENT_CARE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BARRIERS_TO_PATIENT_CARE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BARRIERS_TO_PATIENT_CARE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			barriersToPatientCare)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BARRIERS_TO_PATIENT_CARE__BARRIERS_TO_PATIENT_CARE_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("BarriersToPatientCareTemplateId"),
					new Object[] { barriersToPatientCare }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBarriersToPatientCareCodeP(BarriersToPatientCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Barriers To Patient Care Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBarriersToPatientCareCodeP(BarriersToPatientCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BARRIERS_TO_PATIENT_CARE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBarriersToPatientCareCodeP(BarriersToPatientCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Barriers To Patient Care Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBarriersToPatientCareCodeP(BarriersToPatientCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_BARRIERS_TO_PATIENT_CARE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param barriersToPatientCare The receiving '<em><b>Barriers To Patient Care</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBarriersToPatientCareCodeP(BarriersToPatientCare barriersToPatientCare,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BARRIERS_TO_PATIENT_CARE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BARRIERS_TO_PATIENT_CARE);
			try {
				VALIDATE_BARRIERS_TO_PATIENT_CARE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BARRIERS_TO_PATIENT_CARE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BARRIERS_TO_PATIENT_CARE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			barriersToPatientCare)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BARRIERS_TO_PATIENT_CARE__BARRIERS_TO_PATIENT_CARE_CODE_P,
					EmspcrPlugin.INSTANCE.getString("BarriersToPatientCareCodeP"),
					new Object[] { barriersToPatientCare }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCareCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCareCodeP", passToken);
				}
				passToken.add(barriersToPatientCare);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBarriersToPatientCareCode(BarriersToPatientCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Barriers To Patient Care Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBarriersToPatientCareCode(BarriersToPatientCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BARRIERS_TO_PATIENT_CARE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67523-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateBarriersToPatientCareCode(BarriersToPatientCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Barriers To Patient Care Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBarriersToPatientCareCode(BarriersToPatientCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_BARRIERS_TO_PATIENT_CARE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param barriersToPatientCare The receiving '<em><b>Barriers To Patient Care</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBarriersToPatientCareCode(BarriersToPatientCare barriersToPatientCare,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCareCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(barriersToPatientCare)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_BARRIERS_TO_PATIENT_CARE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BARRIERS_TO_PATIENT_CARE);
			try {
				VALIDATE_BARRIERS_TO_PATIENT_CARE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BARRIERS_TO_PATIENT_CARE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BARRIERS_TO_PATIENT_CARE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			barriersToPatientCare)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BARRIERS_TO_PATIENT_CARE__BARRIERS_TO_PATIENT_CARE_CODE,
					EmspcrPlugin.INSTANCE.getString("BarriersToPatientCareCode"),
					new Object[] { barriersToPatientCare }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBarriersToPatientCareValue(BarriersToPatientCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Barriers To Patient Care Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBarriersToPatientCareValue(BarriersToPatientCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BARRIERS_TO_PATIENT_CARE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17306-4' or value.code = 'LA17307-2' or value.code = 'LA17308-0' or value.code = 'LA17309-8' or value.code = 'LA17310-6' or value.code = 'LA17311-4' or value.code = 'LA17312-2' or value.code = 'LA17313-0' or value.code = 'LA17314-8' or value.code = 'LA17315-5' or value.code = 'LA17316-3' or value.code = 'LA17317-1' or value.code = 'LA17318-9' or value.code = 'LA17711-5' or value.code = 'LA6301-1')))";

	/**
	 * The cached OCL invariant for the '{@link #validateBarriersToPatientCareValue(BarriersToPatientCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Barriers To Patient Care Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBarriersToPatientCareValue(BarriersToPatientCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_BARRIERS_TO_PATIENT_CARE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param barriersToPatientCare The receiving '<em><b>Barriers To Patient Care</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBarriersToPatientCareValue(BarriersToPatientCare barriersToPatientCare,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BARRIERS_TO_PATIENT_CARE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BARRIERS_TO_PATIENT_CARE);
			try {
				VALIDATE_BARRIERS_TO_PATIENT_CARE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BARRIERS_TO_PATIENT_CARE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BARRIERS_TO_PATIENT_CARE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			barriersToPatientCare)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BARRIERS_TO_PATIENT_CARE__BARRIERS_TO_PATIENT_CARE_VALUE,
					EmspcrPlugin.INSTANCE.getString("BarriersToPatientCareValue"),
					new Object[] { barriersToPatientCare }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBarriersToPatientCareValueP(BarriersToPatientCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Barriers To Patient Care Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBarriersToPatientCareValueP(BarriersToPatientCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BARRIERS_TO_PATIENT_CARE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateBarriersToPatientCareValueP(BarriersToPatientCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Barriers To Patient Care Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBarriersToPatientCareValueP(BarriersToPatientCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_BARRIERS_TO_PATIENT_CARE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param barriersToPatientCare The receiving '<em><b>Barriers To Patient Care</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBarriersToPatientCareValueP(BarriersToPatientCare barriersToPatientCare,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BARRIERS_TO_PATIENT_CARE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BARRIERS_TO_PATIENT_CARE);
			try {
				VALIDATE_BARRIERS_TO_PATIENT_CARE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BARRIERS_TO_PATIENT_CARE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BARRIERS_TO_PATIENT_CARE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			barriersToPatientCare)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BARRIERS_TO_PATIENT_CARE__BARRIERS_TO_PATIENT_CARE_VALUE_P,
					EmspcrPlugin.INSTANCE.getString("BarriersToPatientCareValueP"),
					new Object[] { barriersToPatientCare }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBarriersToPatientCareMoodCode(BarriersToPatientCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Barriers To Patient Care Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBarriersToPatientCareMoodCode(BarriersToPatientCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BARRIERS_TO_PATIENT_CARE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateBarriersToPatientCareMoodCode(BarriersToPatientCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Barriers To Patient Care Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBarriersToPatientCareMoodCode(BarriersToPatientCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_BARRIERS_TO_PATIENT_CARE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param barriersToPatientCare The receiving '<em><b>Barriers To Patient Care</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBarriersToPatientCareMoodCode(BarriersToPatientCare barriersToPatientCare,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BARRIERS_TO_PATIENT_CARE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BARRIERS_TO_PATIENT_CARE);
			try {
				VALIDATE_BARRIERS_TO_PATIENT_CARE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BARRIERS_TO_PATIENT_CARE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BARRIERS_TO_PATIENT_CARE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			barriersToPatientCare)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BARRIERS_TO_PATIENT_CARE__BARRIERS_TO_PATIENT_CARE_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("BarriersToPatientCareMoodCode"),
					new Object[] { barriersToPatientCare }));
			}

			return false;
		}
		return true;
	}

} // BarriersToPatientCareOperations
