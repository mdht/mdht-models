/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2;
import org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.NoteActivity;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Care Team Member Act V2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#validateCareTeamMemberActV2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#validateCareTeamMemberActV2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#validateCareTeamMemberActV2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#validateCareTeamMemberActV2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#validateCareTeamMemberActV2MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#validateCareTeamMemberActV2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#validateCareTeamMemberActV2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#validateCareTeamMemberActV2Participant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#validateCareTeamMemberActV2IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#validateCareTeamMemberActV2IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#getCareTeamMemberScheduleObservationV2s() <em>Get Care Team Member Schedule Observation V2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#getNoteActivities() <em>Get Note Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CareTeamMemberActV2Operations extends ClinicalStatementOperations {

	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CareTeamMemberActV2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberActV2TemplateId(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActV2TemplateId(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_ACT_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.500.1' and id.extension = '2022-06-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberActV2TemplateId(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActV2TemplateId(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_ACT_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberActV2 The receiving '<em><b>Care Team Member Act V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberActV2TemplateId(CareTeamMemberActV2 careTeamMemberActV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamMemberActV2CareTeamMemberActV2TemplateId", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_ACT_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT_V2);
			try {
				VALIDATE_CARE_TEAM_MEMBER_ACT_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_MEMBER_ACT_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_ACT_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamMemberActV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_ACT_V2__CARE_TEAM_MEMBER_ACT_V2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("CareTeamMemberActV2CareTeamMemberActV2TemplateId"),
						new Object[] { careTeamMemberActV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberActV2StatusCode(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActV2StatusCode(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_ACT_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberActV2StatusCode(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActV2StatusCode(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_ACT_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberActV2 The receiving '<em><b>Care Team Member Act V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberActV2StatusCode(CareTeamMemberActV2 careTeamMemberActV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamMemberActV2CareTeamMemberActV2StatusCode", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_ACT_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT_V2);
			try {
				VALIDATE_CARE_TEAM_MEMBER_ACT_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_MEMBER_ACT_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_ACT_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamMemberActV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_ACT_V2__CARE_TEAM_MEMBER_ACT_V2_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("CareTeamMemberActV2CareTeamMemberActV2StatusCode"),
						new Object[] { careTeamMemberActV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberActV2EffectiveTime(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActV2EffectiveTime(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_ACT_V2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberActV2EffectiveTime(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActV2EffectiveTime(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_ACT_V2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberActV2 The receiving '<em><b>Care Team Member Act V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberActV2EffectiveTime(CareTeamMemberActV2 careTeamMemberActV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamMemberActV2CareTeamMemberActV2EffectiveTime", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_ACT_V2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT_V2);
			try {
				VALIDATE_CARE_TEAM_MEMBER_ACT_V2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_MEMBER_ACT_V2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_ACT_V2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamMemberActV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_ACT_V2__CARE_TEAM_MEMBER_ACT_V2_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("CareTeamMemberActV2CareTeamMemberActV2EffectiveTime"),
						new Object[] { careTeamMemberActV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberActV2ClassCode(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActV2ClassCode(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_ACT_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberActV2ClassCode(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActV2ClassCode(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_ACT_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberActV2 The receiving '<em><b>Care Team Member Act V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberActV2ClassCode(CareTeamMemberActV2 careTeamMemberActV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamMemberActV2CareTeamMemberActV2ClassCode", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_ACT_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT_V2);
			try {
				VALIDATE_CARE_TEAM_MEMBER_ACT_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_MEMBER_ACT_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_ACT_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamMemberActV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_ACT_V2__CARE_TEAM_MEMBER_ACT_V2_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("CareTeamMemberActV2CareTeamMemberActV2ClassCode"),
						new Object[] { careTeamMemberActV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberActV2MoodCode(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActV2MoodCode(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_ACT_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberActV2MoodCode(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActV2MoodCode(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_ACT_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberActV2 The receiving '<em><b>Care Team Member Act V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberActV2MoodCode(CareTeamMemberActV2 careTeamMemberActV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamMemberActV2CareTeamMemberActV2MoodCode", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_ACT_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT_V2);
			try {
				VALIDATE_CARE_TEAM_MEMBER_ACT_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CARE_TEAM_MEMBER_ACT_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_ACT_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamMemberActV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_ACT_V2__CARE_TEAM_MEMBER_ACT_V2_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("CareTeamMemberActV2CareTeamMemberActV2MoodCode"),
						new Object[] { careTeamMemberActV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberActV2CodeP(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActV2CodeP(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_ACT_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberActV2CodeP(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActV2CodeP(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_ACT_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberActV2 The receiving '<em><b>Care Team Member Act V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberActV2CodeP(CareTeamMemberActV2 careTeamMemberActV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamMemberActV2CareTeamMemberActV2CodeP", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_ACT_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT_V2);
			try {
				VALIDATE_CARE_TEAM_MEMBER_ACT_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CARE_TEAM_MEMBER_ACT_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_ACT_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamMemberActV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_ACT_V2__CARE_TEAM_MEMBER_ACT_V2_CODE_P,
						ConsolPlugin.INSTANCE.getString("CareTeamMemberActV2CareTeamMemberActV2CodeP"),
						new Object[] { careTeamMemberActV2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2CodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2CodeP", passToken);
				}
				passToken.add(careTeamMemberActV2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberActV2Code(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActV2Code(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_ACT_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '85847-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberActV2Code(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActV2Code(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_ACT_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberActV2 The receiving '<em><b>Care Team Member Act V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberActV2Code(CareTeamMemberActV2 careTeamMemberActV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2CodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(careTeamMemberActV2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "CareTeamMemberActV2CareTeamMemberActV2Code", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_ACT_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT_V2);
			try {
				VALIDATE_CARE_TEAM_MEMBER_ACT_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CARE_TEAM_MEMBER_ACT_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_ACT_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamMemberActV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_ACT_V2__CARE_TEAM_MEMBER_ACT_V2_CODE,
						ConsolPlugin.INSTANCE.getString("CareTeamMemberActV2CareTeamMemberActV2Code"),
						new Object[] { careTeamMemberActV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberActV2Participant(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActV2Participant(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_ACT_V2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberActV2Participant(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActV2Participant(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_ACT_V2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberActV2 The receiving '<em><b>Care Team Member Act V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberActV2Participant(CareTeamMemberActV2 careTeamMemberActV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamMemberActV2CareTeamMemberActV2Participant", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_ACT_V2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT_V2);
			try {
				VALIDATE_CARE_TEAM_MEMBER_ACT_V2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_MEMBER_ACT_V2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_ACT_V2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamMemberActV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_ACT_V2__CARE_TEAM_MEMBER_ACT_V2_PARTICIPANT,
						ConsolPlugin.INSTANCE.getString("CareTeamMemberActV2CareTeamMemberActV2Participant"),
						new Object[] { careTeamMemberActV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberActV2IVLTSLow(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActV2IVLTSLow(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_ACT_V2IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberActV2IVLTSLow(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActV2IVLTSLow(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CARE_TEAM_MEMBER_ACT_V2IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberActV2 The receiving '<em><b>Care Team Member Act V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCareTeamMemberActV2IVLTSLow(CareTeamMemberActV2 careTeamMemberActV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamMemberActV2CareTeamMemberActV2IVLTSLow", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_ACT_V2IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CARE_TEAM_MEMBER_ACT_V2IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_TEAM_MEMBER_ACT_V2IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CARE_TEAM_MEMBER_ACT_V2IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			careTeamMemberActV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CARE_TEAM_MEMBER_ACT_V2__CARE_TEAM_MEMBER_ACT_V2IVLTS_LOW,
							ConsolPlugin.INSTANCE.getString("CareTeamMemberActV2CareTeamMemberActV2IVLTSLow"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberActV2IVLTSHigh(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActV2IVLTSHigh(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_ACT_V2IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberActV2IVLTSHigh(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActV2IVLTSHigh(CareTeamMemberActV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CARE_TEAM_MEMBER_ACT_V2IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberActV2 The receiving '<em><b>Care Team Member Act V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCareTeamMemberActV2IVLTSHigh(CareTeamMemberActV2 careTeamMemberActV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamMemberActV2CareTeamMemberActV2IVLTSHigh", "INFO");

		if (VALIDATE_CARE_TEAM_MEMBER_ACT_V2IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CARE_TEAM_MEMBER_ACT_V2IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_TEAM_MEMBER_ACT_V2IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CARE_TEAM_MEMBER_ACT_V2IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			careTeamMemberActV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CARE_TEAM_MEMBER_ACT_V2__CARE_TEAM_MEMBER_ACT_V2IVLTS_HIGH,
							ConsolPlugin.INSTANCE.getString("CareTeamMemberActV2CareTeamMemberActV2IVLTSHigh"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCareTeamMemberScheduleObservationV2s(CareTeamMemberActV2) <em>Get Care Team Member Schedule Observation V2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeamMemberScheduleObservationV2s(CareTeamMemberActV2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CareTeamMemberScheduleObservationV2)).oclAsType(consol::CareTeamMemberScheduleObservationV2)";

	/**
	 * The cached OCL query for the '{@link #getCareTeamMemberScheduleObservationV2s(CareTeamMemberActV2) <em>Get Care Team Member Schedule Observation V2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeamMemberScheduleObservationV2s(CareTeamMemberActV2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CareTeamMemberScheduleObservationV2> getCareTeamMemberScheduleObservationV2s(
			CareTeamMemberActV2 careTeamMemberActV2) {

		if (GET_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT_V2,
				ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT_V2.getEAllOperations().get(61));
			try {
				GET_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2S__EOCL_QRY = helper.createQuery(
					GET_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CareTeamMemberScheduleObservationV2> result = (Collection<CareTeamMemberScheduleObservationV2>) query.evaluate(
			careTeamMemberActV2);
		return new BasicEList.UnmodifiableEList<>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getNoteActivities(CareTeamMemberActV2) <em>Get Note Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteActivities(CareTeamMemberActV2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NOTE_ACTIVITIES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::NoteActivity)).oclAsType(consol::NoteActivity)";

	/**
	 * The cached OCL query for the '{@link #getNoteActivities(CareTeamMemberActV2) <em>Get Note Activities</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteActivities(CareTeamMemberActV2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NOTE_ACTIVITIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<NoteActivity> getNoteActivities(CareTeamMemberActV2 careTeamMemberActV2) {

		if (GET_NOTE_ACTIVITIES__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT_V2,
				ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT_V2.getEAllOperations().get(62));
			try {
				GET_NOTE_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_NOTE_ACTIVITIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_NOTE_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NoteActivity> result = (Collection<NoteActivity>) query.evaluate(careTeamMemberActV2);
		return new BasicEList.UnmodifiableEList<>(result.size(), result.toArray());
	}

} // CareTeamMemberActV2Operations
