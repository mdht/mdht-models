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
import org.openhealthtools.mdht.uml.cda.emspcr.HeartAssessment;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Heart Assessment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeartAssessment#validateHeartAssessmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeartAssessment#validateHeartAssessmentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeartAssessment#validateHeartAssessmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeartAssessment#validateHeartAssessmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeartAssessment#validateHeartAssessmentValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeartAssessment#validateHeartAssessmentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeartAssessment#validateHeartAssessmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeartAssessmentOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeartAssessmentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHeartAssessmentTemplateId(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHeartAssessmentTemplateId(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEART_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.116')";

	/**
	 * The cached OCL invariant for the '{@link #validateHeartAssessmentTemplateId(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHeartAssessmentTemplateId(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEART_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param heartAssessment The receiving '<em><b>Heart Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHeartAssessmentTemplateId(HeartAssessment heartAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEART_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.HEART_ASSESSMENT);
			try {
				VALIDATE_HEART_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEART_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEART_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			heartAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.HEART_ASSESSMENT__HEART_ASSESSMENT_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("HeartAssessmentTemplateId"), new Object[] { heartAssessment }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHeartAssessmentCodeP(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHeartAssessmentCodeP(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEART_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHeartAssessmentCodeP(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHeartAssessmentCodeP(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEART_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param heartAssessment The receiving '<em><b>Heart Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHeartAssessmentCodeP(HeartAssessment heartAssessment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HEART_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.HEART_ASSESSMENT);
			try {
				VALIDATE_HEART_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEART_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEART_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			heartAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.HEART_ASSESSMENT__HEART_ASSESSMENT_CODE_P,
					EmspcrPlugin.INSTANCE.getString("HeartAssessmentCodeP"), new Object[] { heartAssessment }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.HeartAssessmentCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.HeartAssessmentCodeP", passToken);
				}
				passToken.add(heartAssessment);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHeartAssessmentCode(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHeartAssessmentCode(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEART_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67529-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHeartAssessmentCode(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHeartAssessmentCode(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEART_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param heartAssessment The receiving '<em><b>Heart Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHeartAssessmentCode(HeartAssessment heartAssessment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.HeartAssessmentCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(heartAssessment)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_HEART_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.HEART_ASSESSMENT);
			try {
				VALIDATE_HEART_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEART_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEART_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(heartAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.HEART_ASSESSMENT__HEART_ASSESSMENT_CODE,
					EmspcrPlugin.INSTANCE.getString("HeartAssessmentCode"), new Object[] { heartAssessment }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHeartAssessmentValue(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHeartAssessmentValue(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEART_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17239-7' or value.code = 'LA17240-5' or value.code = 'LA17241-3' or value.code = 'LA18241-2' or value.code = 'LA18242-0' or value.code = 'LA18243-8' or value.code = 'LA18244-6' or value.code = 'LA18245-3' or value.code = 'LA18246-1' or value.code = 'LA6626-1' or value.code = 'LA6630-3')))";

	/**
	 * The cached OCL invariant for the '{@link #validateHeartAssessmentValue(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHeartAssessmentValue(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEART_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param heartAssessment The receiving '<em><b>Heart Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHeartAssessmentValue(HeartAssessment heartAssessment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HEART_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.HEART_ASSESSMENT);
			try {
				VALIDATE_HEART_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEART_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEART_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			heartAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.HEART_ASSESSMENT__HEART_ASSESSMENT_VALUE,
					EmspcrPlugin.INSTANCE.getString("HeartAssessmentValue"), new Object[] { heartAssessment }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHeartAssessmentValueP(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHeartAssessmentValueP(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEART_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHeartAssessmentValueP(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHeartAssessmentValueP(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEART_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param heartAssessment The receiving '<em><b>Heart Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHeartAssessmentValueP(HeartAssessment heartAssessment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HEART_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.HEART_ASSESSMENT);
			try {
				VALIDATE_HEART_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEART_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEART_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			heartAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.HEART_ASSESSMENT__HEART_ASSESSMENT_VALUE_P,
					EmspcrPlugin.INSTANCE.getString("HeartAssessmentValueP"), new Object[] { heartAssessment }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHeartAssessmentEffectiveTime(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHeartAssessmentEffectiveTime(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEART_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHeartAssessmentEffectiveTime(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHeartAssessmentEffectiveTime(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEART_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param heartAssessment The receiving '<em><b>Heart Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHeartAssessmentEffectiveTime(HeartAssessment heartAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEART_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.HEART_ASSESSMENT);
			try {
				VALIDATE_HEART_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEART_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEART_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			heartAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.HEART_ASSESSMENT__HEART_ASSESSMENT_EFFECTIVE_TIME,
					EmspcrPlugin.INSTANCE.getString("HeartAssessmentEffectiveTime"), new Object[] { heartAssessment }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHeartAssessmentMoodCode(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHeartAssessmentMoodCode(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEART_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateHeartAssessmentMoodCode(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHeartAssessmentMoodCode(HeartAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HEART_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param heartAssessment The receiving '<em><b>Heart Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHeartAssessmentMoodCode(HeartAssessment heartAssessment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HEART_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.HEART_ASSESSMENT);
			try {
				VALIDATE_HEART_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HEART_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HEART_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			heartAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.HEART_ASSESSMENT__HEART_ASSESSMENT_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("HeartAssessmentMoodCode"), new Object[] { heartAssessment }));
			}

			return false;
		}
		return true;
	}

} // HeartAssessmentOperations
