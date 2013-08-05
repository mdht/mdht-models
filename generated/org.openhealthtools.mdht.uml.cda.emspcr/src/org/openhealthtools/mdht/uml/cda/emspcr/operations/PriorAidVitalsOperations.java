/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitals;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Prior Aid Vitals</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitals#validatePriorAidVitalsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitals#validatePriorAidVitalsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitals#validatePriorAidVitalsValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitals#validatePriorAidVitalsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PriorAidVitalsOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PriorAidVitalsOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePriorAidVitalsTemplateId(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAidVitalsTemplateId(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIOR_AID_VITALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.29')";

	/**
	 * The cached OCL invariant for the '{@link #validatePriorAidVitalsTemplateId(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAidVitalsTemplateId(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRIOR_AID_VITALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param priorAidVitals The receiving '<em><b>Prior Aid Vitals</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePriorAidVitalsTemplateId(PriorAidVitals priorAidVitals, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRIOR_AID_VITALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIOR_AID_VITALS);
			try {
				VALIDATE_PRIOR_AID_VITALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_AID_VITALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_AID_VITALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			priorAidVitals)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PRIOR_AID_VITALS__PRIOR_AID_VITALS_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("PriorAidVitalsTemplateId"), new Object[] { priorAidVitals }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePriorAidVitalsCode(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAidVitalsCode(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIOR_AID_VITALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67518-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePriorAidVitalsCode(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAidVitalsCode(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRIOR_AID_VITALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param priorAidVitals The receiving '<em><b>Prior Aid Vitals</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePriorAidVitalsCode(PriorAidVitals priorAidVitals, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRIOR_AID_VITALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIOR_AID_VITALS);
			try {
				VALIDATE_PRIOR_AID_VITALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_AID_VITALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_AID_VITALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(priorAidVitals)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PRIOR_AID_VITALS__PRIOR_AID_VITALS_CODE,
					EmspcrPlugin.INSTANCE.getString("PriorAidVitalsCode"), new Object[] { priorAidVitals }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePriorAidVitalsValue(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAidVitalsValue(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIOR_AID_VITALS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePriorAidVitalsValue(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAidVitalsValue(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRIOR_AID_VITALS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param priorAidVitals The receiving '<em><b>Prior Aid Vitals</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePriorAidVitalsValue(PriorAidVitals priorAidVitals, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRIOR_AID_VITALS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIOR_AID_VITALS);
			try {
				VALIDATE_PRIOR_AID_VITALS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_AID_VITALS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_AID_VITALS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(priorAidVitals)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PRIOR_AID_VITALS__PRIOR_AID_VITALS_VALUE,
					EmspcrPlugin.INSTANCE.getString("PriorAidVitalsValue"), new Object[] { priorAidVitals }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePriorAidVitalsMoodCode(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAidVitalsMoodCode(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIOR_AID_VITALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePriorAidVitalsMoodCode(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAidVitalsMoodCode(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRIOR_AID_VITALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param priorAidVitals The receiving '<em><b>Prior Aid Vitals</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePriorAidVitalsMoodCode(PriorAidVitals priorAidVitals, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRIOR_AID_VITALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIOR_AID_VITALS);
			try {
				VALIDATE_PRIOR_AID_VITALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_AID_VITALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_AID_VITALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			priorAidVitals)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PRIOR_AID_VITALS__PRIOR_AID_VITALS_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("PriorAidVitalsMoodCode"), new Object[] { priorAidVitals }));
			}

			return false;
		}
		return true;
	}

} // PriorAidVitalsOperations
