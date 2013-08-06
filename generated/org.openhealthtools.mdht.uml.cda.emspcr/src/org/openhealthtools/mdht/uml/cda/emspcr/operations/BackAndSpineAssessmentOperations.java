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

import org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Back And Spine Assessment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment#validateBackAndSpineAssessmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment#validateBackAndSpineAssessmentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment#validateBackAndSpineAssessmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment#validateBackAndSpineAssessmentTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment#validateBackAndSpineAssessmentTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment#validateBackAndSpineAssessmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment#validateBackAndSpineAssessmentValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment#validateBackAndSpineAssessmentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment#validateBackAndSpineAssessmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BackAndSpineAssessmentOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected BackAndSpineAssessmentOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateBackAndSpineAssessmentTemplateId(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBackAndSpineAssessmentTemplateId(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_BACK_AND_SPINE_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.119')";

	/**
	* The cached OCL invariant for the '{@link #validateBackAndSpineAssessmentTemplateId(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBackAndSpineAssessmentTemplateId(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_BACK_AND_SPINE_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param backAndSpineAssessment The receiving '<em><b>Back And Spine Assessment</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateBackAndSpineAssessmentTemplateId(BackAndSpineAssessment backAndSpineAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BACK_AND_SPINE_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BACK_AND_SPINE_ASSESSMENT);
			try {
				VALIDATE_BACK_AND_SPINE_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BACK_AND_SPINE_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BACK_AND_SPINE_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			backAndSpineAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BACK_AND_SPINE_ASSESSMENT__BACK_AND_SPINE_ASSESSMENT_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("BackAndSpineAssessmentTemplateId"),
					new Object[] { backAndSpineAssessment }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateBackAndSpineAssessmentCodeP(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBackAndSpineAssessmentCodeP(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_BACK_AND_SPINE_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateBackAndSpineAssessmentCodeP(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBackAndSpineAssessmentCodeP(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_BACK_AND_SPINE_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param backAndSpineAssessment The receiving '<em><b>Back And Spine Assessment</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateBackAndSpineAssessmentCodeP(BackAndSpineAssessment backAndSpineAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BACK_AND_SPINE_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BACK_AND_SPINE_ASSESSMENT);
			try {
				VALIDATE_BACK_AND_SPINE_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BACK_AND_SPINE_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BACK_AND_SPINE_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			backAndSpineAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BACK_AND_SPINE_ASSESSMENT__BACK_AND_SPINE_ASSESSMENT_CODE_P,
					EmspcrPlugin.INSTANCE.getString("BackAndSpineAssessmentCodeP"),
					new Object[] { backAndSpineAssessment }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessmentCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessmentCodeP", passToken);
				}
				passToken.add(backAndSpineAssessment);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateBackAndSpineAssessmentCode(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBackAndSpineAssessmentCode(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_BACK_AND_SPINE_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67532-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateBackAndSpineAssessmentCode(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBackAndSpineAssessmentCode(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_BACK_AND_SPINE_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param backAndSpineAssessment The receiving '<em><b>Back And Spine Assessment</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateBackAndSpineAssessmentCode(BackAndSpineAssessment backAndSpineAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessmentCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(backAndSpineAssessment)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_BACK_AND_SPINE_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BACK_AND_SPINE_ASSESSMENT);
			try {
				VALIDATE_BACK_AND_SPINE_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BACK_AND_SPINE_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BACK_AND_SPINE_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			backAndSpineAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BACK_AND_SPINE_ASSESSMENT__BACK_AND_SPINE_ASSESSMENT_CODE,
					EmspcrPlugin.INSTANCE.getString("BackAndSpineAssessmentCode"),
					new Object[] { backAndSpineAssessment }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateBackAndSpineAssessmentTargetSiteCode(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Target Site Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBackAndSpineAssessmentTargetSiteCode(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_BACK_AND_SPINE_ASSESSMENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->size() = 1 and self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA18726-2' or value.code = 'LA18727-0' or value.code = 'LA18728-8' or value.code = 'LA18729-6' or value.code = 'LA18730-4' or value.code = 'LA18731-2' or value.code = 'LA18732-0' or value.code = 'LA18733-8' or value.code = 'LA18734-6' or value.code = 'LA18735-3' or value.code = 'LA18736-1' or value.code = 'LA18737-9' or value.code = 'LA18738-7')))";

	/**
	* The cached OCL invariant for the '{@link #validateBackAndSpineAssessmentTargetSiteCode(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Target Site Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBackAndSpineAssessmentTargetSiteCode(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_BACK_AND_SPINE_ASSESSMENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param backAndSpineAssessment The receiving '<em><b>Back And Spine Assessment</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateBackAndSpineAssessmentTargetSiteCode(BackAndSpineAssessment backAndSpineAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BACK_AND_SPINE_ASSESSMENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BACK_AND_SPINE_ASSESSMENT);
			try {
				VALIDATE_BACK_AND_SPINE_ASSESSMENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BACK_AND_SPINE_ASSESSMENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BACK_AND_SPINE_ASSESSMENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			backAndSpineAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BACK_AND_SPINE_ASSESSMENT__BACK_AND_SPINE_ASSESSMENT_TARGET_SITE_CODE,
					EmspcrPlugin.INSTANCE.getString("BackAndSpineAssessmentTargetSiteCode"),
					new Object[] { backAndSpineAssessment }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateBackAndSpineAssessmentTargetSiteCodeP(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Target Site Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBackAndSpineAssessmentTargetSiteCodeP(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_BACK_AND_SPINE_ASSESSMENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->size() = 1)";

	/**
	* The cached OCL invariant for the '{@link #validateBackAndSpineAssessmentTargetSiteCodeP(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Target Site Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBackAndSpineAssessmentTargetSiteCodeP(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_BACK_AND_SPINE_ASSESSMENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param backAndSpineAssessment The receiving '<em><b>Back And Spine Assessment</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateBackAndSpineAssessmentTargetSiteCodeP(BackAndSpineAssessment backAndSpineAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BACK_AND_SPINE_ASSESSMENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BACK_AND_SPINE_ASSESSMENT);
			try {
				VALIDATE_BACK_AND_SPINE_ASSESSMENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BACK_AND_SPINE_ASSESSMENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BACK_AND_SPINE_ASSESSMENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			backAndSpineAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BACK_AND_SPINE_ASSESSMENT__BACK_AND_SPINE_ASSESSMENT_TARGET_SITE_CODE_P,
					EmspcrPlugin.INSTANCE.getString("BackAndSpineAssessmentTargetSiteCodeP"),
					new Object[] { backAndSpineAssessment }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateBackAndSpineAssessmentValue(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBackAndSpineAssessmentValue(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_BACK_AND_SPINE_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17208-2' or value.code = 'LA17209-0' or value.code = 'LA17214-0' or value.code = 'LA17215-7' or value.code = 'LA17220-7' or value.code = 'LA17244-7' or value.code = 'LA17245-4' or value.code = 'LA17256-1' or value.code = 'LA17257-9' or value.code = 'LA17258-7' or value.code = 'LA17259-5' or value.code = 'LA18220-6' or value.code = 'LA18221-4' or value.code = 'LA18222-2' or value.code = 'LA18223-0' or value.code = 'LA18224-8' or value.code = 'LA18225-5' or value.code = 'LA18226-3' or value.code = 'LA6626-1' or value.code = 'LA6630-3' or value.code = 'LA7410-9' or value.code = 'LA7452-1' or value.code = 'LA7460-4')))";

	/**
	* The cached OCL invariant for the '{@link #validateBackAndSpineAssessmentValue(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBackAndSpineAssessmentValue(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_BACK_AND_SPINE_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param backAndSpineAssessment The receiving '<em><b>Back And Spine Assessment</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateBackAndSpineAssessmentValue(BackAndSpineAssessment backAndSpineAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BACK_AND_SPINE_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BACK_AND_SPINE_ASSESSMENT);
			try {
				VALIDATE_BACK_AND_SPINE_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BACK_AND_SPINE_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BACK_AND_SPINE_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			backAndSpineAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BACK_AND_SPINE_ASSESSMENT__BACK_AND_SPINE_ASSESSMENT_VALUE,
					EmspcrPlugin.INSTANCE.getString("BackAndSpineAssessmentValue"),
					new Object[] { backAndSpineAssessment }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateBackAndSpineAssessmentValueP(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Value P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBackAndSpineAssessmentValueP(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_BACK_AND_SPINE_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	* The cached OCL invariant for the '{@link #validateBackAndSpineAssessmentValueP(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Value P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBackAndSpineAssessmentValueP(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_BACK_AND_SPINE_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param backAndSpineAssessment The receiving '<em><b>Back And Spine Assessment</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateBackAndSpineAssessmentValueP(BackAndSpineAssessment backAndSpineAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BACK_AND_SPINE_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BACK_AND_SPINE_ASSESSMENT);
			try {
				VALIDATE_BACK_AND_SPINE_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BACK_AND_SPINE_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BACK_AND_SPINE_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			backAndSpineAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BACK_AND_SPINE_ASSESSMENT__BACK_AND_SPINE_ASSESSMENT_VALUE_P,
					EmspcrPlugin.INSTANCE.getString("BackAndSpineAssessmentValueP"),
					new Object[] { backAndSpineAssessment }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateBackAndSpineAssessmentEffectiveTime(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Effective Time</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBackAndSpineAssessmentEffectiveTime(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_BACK_AND_SPINE_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateBackAndSpineAssessmentEffectiveTime(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Effective Time</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBackAndSpineAssessmentEffectiveTime(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_BACK_AND_SPINE_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param backAndSpineAssessment The receiving '<em><b>Back And Spine Assessment</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateBackAndSpineAssessmentEffectiveTime(BackAndSpineAssessment backAndSpineAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BACK_AND_SPINE_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BACK_AND_SPINE_ASSESSMENT);
			try {
				VALIDATE_BACK_AND_SPINE_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BACK_AND_SPINE_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BACK_AND_SPINE_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			backAndSpineAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BACK_AND_SPINE_ASSESSMENT__BACK_AND_SPINE_ASSESSMENT_EFFECTIVE_TIME,
					EmspcrPlugin.INSTANCE.getString("BackAndSpineAssessmentEffectiveTime"),
					new Object[] { backAndSpineAssessment }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateBackAndSpineAssessmentMoodCode(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBackAndSpineAssessmentMoodCode(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_BACK_AND_SPINE_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	* The cached OCL invariant for the '{@link #validateBackAndSpineAssessmentMoodCode(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateBackAndSpineAssessmentMoodCode(BackAndSpineAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_BACK_AND_SPINE_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param backAndSpineAssessment The receiving '<em><b>Back And Spine Assessment</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateBackAndSpineAssessmentMoodCode(BackAndSpineAssessment backAndSpineAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BACK_AND_SPINE_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BACK_AND_SPINE_ASSESSMENT);
			try {
				VALIDATE_BACK_AND_SPINE_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BACK_AND_SPINE_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BACK_AND_SPINE_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			backAndSpineAssessment)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BACK_AND_SPINE_ASSESSMENT__BACK_AND_SPINE_ASSESSMENT_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("BackAndSpineAssessmentMoodCode"),
					new Object[] { backAndSpineAssessment }));
			}

			return false;
		}
		return true;
	}

} // BackAndSpineAssessmentOperations
