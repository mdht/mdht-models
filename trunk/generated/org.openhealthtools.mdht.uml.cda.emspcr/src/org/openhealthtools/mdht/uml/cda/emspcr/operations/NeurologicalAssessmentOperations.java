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
import org.openhealthtools.mdht.uml.cda.emspcr.NeurologicalAssessment;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Neurological Assessment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NeurologicalAssessment#validateNeurologicalAssessmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurological Assessment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NeurologicalAssessment#validateNeurologicalAssessmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurological Assessment Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NeurologicalAssessment#validateNeurologicalAssessmentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurological Assessment Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NeurologicalAssessment#validateNeurologicalAssessmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurological Assessment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NeurologicalAssessment#validateNeurologicalAssessmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurological Assessment Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NeurologicalAssessment#validateNeurologicalAssessmentValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurological Assessment Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NeurologicalAssessmentOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeurologicalAssessmentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeurologicalAssessmentTemplateId(NeurologicalAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurological Assessment Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurologicalAssessmentTemplateId(NeurologicalAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEUROLOGICAL_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.141')";

	/**
	 * The cached OCL invariant for the '{@link #validateNeurologicalAssessmentTemplateId(NeurologicalAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurological Assessment Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurologicalAssessmentTemplateId(NeurologicalAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEUROLOGICAL_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param neurologicalAssessment The receiving '<em><b>Neurological Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNeurologicalAssessmentTemplateId(NeurologicalAssessment neurologicalAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEUROLOGICAL_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NEUROLOGICAL_ASSESSMENT);
			try {
				VALIDATE_NEUROLOGICAL_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEUROLOGICAL_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEUROLOGICAL_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			neurologicalAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.NEUROLOGICAL_ASSESSMENT__NEUROLOGICAL_ASSESSMENT_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("NeurologicalAssessmentTemplateId"),
					new Object[] { neurologicalAssessment }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeurologicalAssessmentMoodCode(NeurologicalAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurological Assessment Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurologicalAssessmentMoodCode(NeurologicalAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEUROLOGICAL_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateNeurologicalAssessmentMoodCode(NeurologicalAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurological Assessment Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurologicalAssessmentMoodCode(NeurologicalAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEUROLOGICAL_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param neurologicalAssessment The receiving '<em><b>Neurological Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNeurologicalAssessmentMoodCode(NeurologicalAssessment neurologicalAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEUROLOGICAL_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NEUROLOGICAL_ASSESSMENT);
			try {
				VALIDATE_NEUROLOGICAL_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEUROLOGICAL_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEUROLOGICAL_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			neurologicalAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.NEUROLOGICAL_ASSESSMENT__NEUROLOGICAL_ASSESSMENT_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("NeurologicalAssessmentMoodCode"),
					new Object[] { neurologicalAssessment }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeurologicalAssessmentCodeP(NeurologicalAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurological Assessment Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurologicalAssessmentCodeP(NeurologicalAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEUROLOGICAL_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNeurologicalAssessmentCodeP(NeurologicalAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurological Assessment Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurologicalAssessmentCodeP(NeurologicalAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEUROLOGICAL_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param neurologicalAssessment The receiving '<em><b>Neurological Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNeurologicalAssessmentCodeP(NeurologicalAssessment neurologicalAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEUROLOGICAL_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NEUROLOGICAL_ASSESSMENT);
			try {
				VALIDATE_NEUROLOGICAL_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEUROLOGICAL_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEUROLOGICAL_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			neurologicalAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.NEUROLOGICAL_ASSESSMENT__NEUROLOGICAL_ASSESSMENT_CODE_P,
					EmspcrPlugin.INSTANCE.getString("NeurologicalAssessmentCodeP"),
					new Object[] { neurologicalAssessment }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.NeurologicalAssessmentCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.NeurologicalAssessmentCodeP", passToken);
				}
				passToken.add(neurologicalAssessment);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeurologicalAssessmentCode(NeurologicalAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurological Assessment Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurologicalAssessmentCode(NeurologicalAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEUROLOGICAL_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67536-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateNeurologicalAssessmentCode(NeurologicalAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurological Assessment Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurologicalAssessmentCode(NeurologicalAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEUROLOGICAL_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param neurologicalAssessment The receiving '<em><b>Neurological Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNeurologicalAssessmentCode(NeurologicalAssessment neurologicalAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.NeurologicalAssessmentCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(neurologicalAssessment)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_NEUROLOGICAL_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NEUROLOGICAL_ASSESSMENT);
			try {
				VALIDATE_NEUROLOGICAL_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEUROLOGICAL_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEUROLOGICAL_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			neurologicalAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.NEUROLOGICAL_ASSESSMENT__NEUROLOGICAL_ASSESSMENT_CODE,
					EmspcrPlugin.INSTANCE.getString("NeurologicalAssessmentCode"),
					new Object[] { neurologicalAssessment }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeurologicalAssessmentValue(NeurologicalAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurological Assessment Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurologicalAssessmentValue(NeurologicalAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEUROLOGICAL_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA15899-0' or value.code = 'LA17286-8' or value.code = 'LA17291-8' or value.code = 'LA17292-6' or value.code = 'LA17293-4' or value.code = 'LA17294-2' or value.code = 'LA17295-9' or value.code = 'LA17296-7' or value.code = 'LA17297-5' or value.code = 'LA17298-3' or value.code = 'LA17299-1' or value.code = 'LA17300-7' or value.code = 'LA17301-5' or value.code = 'LA17302-3' or value.code = 'LA17303-1' or value.code = 'LA17304-9' or value.code = 'LA17305-6' or value.code = 'LA18261-0' or value.code = 'LA18262-8' or value.code = 'LA18263-6' or value.code = 'LA18264-4' or value.code = 'LA18265-1' or value.code = 'LA6630-3')))";

	/**
	 * The cached OCL invariant for the '{@link #validateNeurologicalAssessmentValue(NeurologicalAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurological Assessment Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurologicalAssessmentValue(NeurologicalAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEUROLOGICAL_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param neurologicalAssessment The receiving '<em><b>Neurological Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNeurologicalAssessmentValue(NeurologicalAssessment neurologicalAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEUROLOGICAL_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NEUROLOGICAL_ASSESSMENT);
			try {
				VALIDATE_NEUROLOGICAL_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEUROLOGICAL_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEUROLOGICAL_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			neurologicalAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.NEUROLOGICAL_ASSESSMENT__NEUROLOGICAL_ASSESSMENT_VALUE,
					EmspcrPlugin.INSTANCE.getString("NeurologicalAssessmentValue"),
					new Object[] { neurologicalAssessment }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeurologicalAssessmentValueP(NeurologicalAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurological Assessment Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurologicalAssessmentValueP(NeurologicalAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEUROLOGICAL_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNeurologicalAssessmentValueP(NeurologicalAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurological Assessment Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurologicalAssessmentValueP(NeurologicalAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEUROLOGICAL_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param neurologicalAssessment The receiving '<em><b>Neurological Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNeurologicalAssessmentValueP(NeurologicalAssessment neurologicalAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEUROLOGICAL_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NEUROLOGICAL_ASSESSMENT);
			try {
				VALIDATE_NEUROLOGICAL_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEUROLOGICAL_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEUROLOGICAL_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			neurologicalAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.NEUROLOGICAL_ASSESSMENT__NEUROLOGICAL_ASSESSMENT_VALUE_P,
					EmspcrPlugin.INSTANCE.getString("NeurologicalAssessmentValueP"),
					new Object[] { neurologicalAssessment }));
			}

			return false;
		}
		return true;
	}

} // NeurologicalAssessmentOperations
