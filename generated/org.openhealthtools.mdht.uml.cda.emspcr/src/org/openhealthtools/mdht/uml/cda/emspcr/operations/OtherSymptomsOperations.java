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
import org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptoms;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Other Symptoms</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptoms#validateOtherSymptomsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Symptoms Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptoms#validateOtherSymptomsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Symptoms Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptoms#validateOtherSymptomsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Symptoms Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptoms#validateOtherSymptomsValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Symptoms Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptoms#validateOtherSymptomsValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Symptoms Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptoms#validateOtherSymptomsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Symptoms Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OtherSymptomsOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected OtherSymptomsOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateOtherSymptomsTemplateId(OtherSymptoms, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Symptoms Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateOtherSymptomsTemplateId(OtherSymptoms, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_OTHER_SYMPTOMS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.67')";

	/**
	* The cached OCL invariant for the '{@link #validateOtherSymptomsTemplateId(OtherSymptoms, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Symptoms Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateOtherSymptomsTemplateId(OtherSymptoms, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_OTHER_SYMPTOMS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param otherSymptoms The receiving '<em><b>Other Symptoms</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateOtherSymptomsTemplateId(OtherSymptoms otherSymptoms, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_OTHER_SYMPTOMS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.OTHER_SYMPTOMS);
			try {
				VALIDATE_OTHER_SYMPTOMS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OTHER_SYMPTOMS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OTHER_SYMPTOMS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			otherSymptoms)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.OTHER_SYMPTOMS__OTHER_SYMPTOMS_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("OtherSymptomsTemplateId"), new Object[] { otherSymptoms }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateOtherSymptomsCodeP(OtherSymptoms, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Symptoms Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateOtherSymptomsCodeP(OtherSymptoms, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_OTHER_SYMPTOMS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateOtherSymptomsCodeP(OtherSymptoms, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Symptoms Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateOtherSymptomsCodeP(OtherSymptoms, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_OTHER_SYMPTOMS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param otherSymptoms The receiving '<em><b>Other Symptoms</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateOtherSymptomsCodeP(OtherSymptoms otherSymptoms, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_OTHER_SYMPTOMS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.OTHER_SYMPTOMS);
			try {
				VALIDATE_OTHER_SYMPTOMS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OTHER_SYMPTOMS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OTHER_SYMPTOMS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(otherSymptoms)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.OTHER_SYMPTOMS__OTHER_SYMPTOMS_CODE_P,
					EmspcrPlugin.INSTANCE.getString("OtherSymptomsCodeP"), new Object[] { otherSymptoms }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptomsCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptomsCodeP", passToken);
				}
				passToken.add(otherSymptoms);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateOtherSymptomsCode(OtherSymptoms, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Symptoms Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateOtherSymptomsCode(OtherSymptoms, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_OTHER_SYMPTOMS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67776-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateOtherSymptomsCode(OtherSymptoms, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Symptoms Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateOtherSymptomsCode(OtherSymptoms, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_OTHER_SYMPTOMS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param otherSymptoms The receiving '<em><b>Other Symptoms</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateOtherSymptomsCode(OtherSymptoms otherSymptoms, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptomsCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(otherSymptoms)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_OTHER_SYMPTOMS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.OTHER_SYMPTOMS);
			try {
				VALIDATE_OTHER_SYMPTOMS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OTHER_SYMPTOMS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OTHER_SYMPTOMS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(otherSymptoms)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.OTHER_SYMPTOMS__OTHER_SYMPTOMS_CODE,
					EmspcrPlugin.INSTANCE.getString("OtherSymptomsCode"), new Object[] { otherSymptoms }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateOtherSymptomsValue(OtherSymptoms, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Symptoms Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateOtherSymptomsValue(OtherSymptoms, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_OTHER_SYMPTOMS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.90'))";

	/**
	* The cached OCL invariant for the '{@link #validateOtherSymptomsValue(OtherSymptoms, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Symptoms Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateOtherSymptomsValue(OtherSymptoms, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_OTHER_SYMPTOMS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param otherSymptoms The receiving '<em><b>Other Symptoms</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateOtherSymptomsValue(OtherSymptoms otherSymptoms, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_OTHER_SYMPTOMS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.OTHER_SYMPTOMS);
			try {
				VALIDATE_OTHER_SYMPTOMS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OTHER_SYMPTOMS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OTHER_SYMPTOMS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(otherSymptoms)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.OTHER_SYMPTOMS__OTHER_SYMPTOMS_VALUE,
					EmspcrPlugin.INSTANCE.getString("OtherSymptomsValue"), new Object[] { otherSymptoms }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateOtherSymptomsValueP(OtherSymptoms, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Symptoms Value P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateOtherSymptomsValueP(OtherSymptoms, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_OTHER_SYMPTOMS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	* The cached OCL invariant for the '{@link #validateOtherSymptomsValueP(OtherSymptoms, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Symptoms Value P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateOtherSymptomsValueP(OtherSymptoms, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_OTHER_SYMPTOMS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param otherSymptoms The receiving '<em><b>Other Symptoms</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateOtherSymptomsValueP(OtherSymptoms otherSymptoms, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_OTHER_SYMPTOMS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.OTHER_SYMPTOMS);
			try {
				VALIDATE_OTHER_SYMPTOMS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OTHER_SYMPTOMS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OTHER_SYMPTOMS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(otherSymptoms)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.OTHER_SYMPTOMS__OTHER_SYMPTOMS_VALUE_P,
					EmspcrPlugin.INSTANCE.getString("OtherSymptomsValueP"), new Object[] { otherSymptoms }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateOtherSymptomsMoodCode(OtherSymptoms, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Symptoms Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateOtherSymptomsMoodCode(OtherSymptoms, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_OTHER_SYMPTOMS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	* The cached OCL invariant for the '{@link #validateOtherSymptomsMoodCode(OtherSymptoms, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Symptoms Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateOtherSymptomsMoodCode(OtherSymptoms, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_OTHER_SYMPTOMS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param otherSymptoms The receiving '<em><b>Other Symptoms</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateOtherSymptomsMoodCode(OtherSymptoms otherSymptoms, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_OTHER_SYMPTOMS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.OTHER_SYMPTOMS);
			try {
				VALIDATE_OTHER_SYMPTOMS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OTHER_SYMPTOMS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OTHER_SYMPTOMS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			otherSymptoms)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.OTHER_SYMPTOMS__OTHER_SYMPTOMS_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("OtherSymptomsMoodCode"), new Object[] { otherSymptoms }));
			}

			return false;
		}
		return true;
	}

} // OtherSymptomsOperations
