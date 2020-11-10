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

import org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct;
import org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.NoteActivity;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Care Team Member Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActCareTeamMemberScheduleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Care Team Member Schedule Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActNoteActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Note Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActParticipant2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Participant2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#getCareTeamMemberScheduleObservations() <em>Get Care Team Member Schedule Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#getNoteActivities() <em>Get Note Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CareTeamMemberActOperations extends ClinicalStatementOperations {

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
	protected CareTeamMemberActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberActTemplateId(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActTemplateId(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.500.1' and id.extension = '2019-07-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberActTemplateId(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActTemplateId(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberAct The receiving '<em><b>Care Team Member Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberActTemplateId(CareTeamMemberAct careTeamMemberAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamMemberActCareTeamMemberActTemplateId", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT);
			try {
				VALIDATE_CARE_TEAM_MEMBER_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CARE_TEAM_MEMBER_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamMemberAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_ACT__CARE_TEAM_MEMBER_ACT_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("CareTeamMemberActCareTeamMemberActTemplateId"),
						new Object[] { careTeamMemberAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberActId(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActId(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberActId(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActId(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberAct The receiving '<em><b>Care Team Member Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberActId(CareTeamMemberAct careTeamMemberAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamMemberActCareTeamMemberActId", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT);
			try {
				VALIDATE_CARE_TEAM_MEMBER_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CARE_TEAM_MEMBER_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_MEMBER_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			careTeamMemberAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_ACT__CARE_TEAM_MEMBER_ACT_ID,
						ConsolPlugin.INSTANCE.getString("CareTeamMemberActCareTeamMemberActId"),
						new Object[] { careTeamMemberAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberActStatusCodeP(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActStatusCodeP(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberActStatusCodeP(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActStatusCodeP(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberAct The receiving '<em><b>Care Team Member Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberActStatusCodeP(CareTeamMemberAct careTeamMemberAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamMemberActCareTeamMemberActStatusCodeP", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT);
			try {
				VALIDATE_CARE_TEAM_MEMBER_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_MEMBER_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamMemberAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_ACT__CARE_TEAM_MEMBER_ACT_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString("CareTeamMemberActCareTeamMemberActStatusCodeP"),
						new Object[] { careTeamMemberAct }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActStatusCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActStatusCodeP", passToken);
				}
				passToken.add(careTeamMemberAct);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberActStatusCode(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActStatusCode(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " +
			"value.code = 'normal' or value.code = 'aborted' or value.code = 'active' or value.code = 'cancelled' or value.code = 'completed' or value.code = 'held' or value.code = 'new' or value.code = 'suspended' or value.code = 'nullified' or value.code = 'obsolete')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberActStatusCode(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActStatusCode(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberAct The receiving '<em><b>Care Team Member Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberActStatusCode(CareTeamMemberAct careTeamMemberAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActStatusCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(careTeamMemberAct)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "CareTeamMemberActCareTeamMemberActStatusCode", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT);
			try {
				VALIDATE_CARE_TEAM_MEMBER_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CARE_TEAM_MEMBER_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamMemberAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_ACT__CARE_TEAM_MEMBER_ACT_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("CareTeamMemberActCareTeamMemberActStatusCode"),
						new Object[] { careTeamMemberAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberActEffectiveTime(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActEffectiveTime(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberActEffectiveTime(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActEffectiveTime(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberAct The receiving '<em><b>Care Team Member Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberActEffectiveTime(CareTeamMemberAct careTeamMemberAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamMemberActCareTeamMemberActEffectiveTime", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT);
			try {
				VALIDATE_CARE_TEAM_MEMBER_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_MEMBER_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamMemberAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_ACT__CARE_TEAM_MEMBER_ACT_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("CareTeamMemberActCareTeamMemberActEffectiveTime"),
						new Object[] { careTeamMemberAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberActClassCode(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActClassCode(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberActClassCode(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActClassCode(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberAct The receiving '<em><b>Care Team Member Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberActClassCode(CareTeamMemberAct careTeamMemberAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamMemberActCareTeamMemberActClassCode", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT);
			try {
				VALIDATE_CARE_TEAM_MEMBER_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CARE_TEAM_MEMBER_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamMemberAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_ACT__CARE_TEAM_MEMBER_ACT_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("CareTeamMemberActCareTeamMemberActClassCode"),
						new Object[] { careTeamMemberAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberActMoodCode(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActMoodCode(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberActMoodCode(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActMoodCode(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberAct The receiving '<em><b>Care Team Member Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberActMoodCode(CareTeamMemberAct careTeamMemberAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamMemberActCareTeamMemberActMoodCode", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT);
			try {
				VALIDATE_CARE_TEAM_MEMBER_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CARE_TEAM_MEMBER_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamMemberAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_ACT__CARE_TEAM_MEMBER_ACT_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("CareTeamMemberActCareTeamMemberActMoodCode"),
						new Object[] { careTeamMemberAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberActPerformer(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActPerformer(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_ACT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberActPerformer(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActPerformer(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_ACT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberAct The receiving '<em><b>Care Team Member Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberActPerformer(CareTeamMemberAct careTeamMemberAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamMemberActCareTeamMemberActPerformer", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_ACT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT);
			try {
				VALIDATE_CARE_TEAM_MEMBER_ACT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CARE_TEAM_MEMBER_ACT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_ACT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamMemberAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_ACT__CARE_TEAM_MEMBER_ACT_PERFORMER,
						ConsolPlugin.INSTANCE.getString("CareTeamMemberActCareTeamMemberActPerformer"),
						new Object[] { careTeamMemberAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberActParticipant(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActParticipant(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_ACT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberActParticipant(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActParticipant(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_ACT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberAct The receiving '<em><b>Care Team Member Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberActParticipant(CareTeamMemberAct careTeamMemberAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamMemberActCareTeamMemberActParticipant", "INFO");

		if (VALIDATE_CARE_TEAM_MEMBER_ACT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT);
			try {
				VALIDATE_CARE_TEAM_MEMBER_ACT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CARE_TEAM_MEMBER_ACT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_ACT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamMemberAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_ACT__CARE_TEAM_MEMBER_ACT_PARTICIPANT,
						ConsolPlugin.INSTANCE.getString("CareTeamMemberActCareTeamMemberActParticipant"),
						new Object[] { careTeamMemberAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberActCareTeamMemberScheduleObservation(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Care Team Member Schedule Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActCareTeamMemberScheduleObservation(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_ACT_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::CareTeamMemberScheduleObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberActCareTeamMemberScheduleObservation(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Care Team Member Schedule Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActCareTeamMemberScheduleObservation(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_ACT_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberAct The receiving '<em><b>Care Team Member Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberActCareTeamMemberScheduleObservation(
			CareTeamMemberAct careTeamMemberAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamMemberActCareTeamMemberActCareTeamMemberScheduleObservation", "INFO");

		if (VALIDATE_CARE_TEAM_MEMBER_ACT_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT);
			try {
				VALIDATE_CARE_TEAM_MEMBER_ACT_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_MEMBER_ACT_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_ACT_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamMemberAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_ACT__CARE_TEAM_MEMBER_ACT_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION,
						ConsolPlugin.INSTANCE.getString(
							"CareTeamMemberActCareTeamMemberActCareTeamMemberScheduleObservation"),
						new Object[] { careTeamMemberAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberActNoteActivity(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Note Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActNoteActivity(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_ACT_NOTE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::NoteActivity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberActNoteActivity(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Note Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActNoteActivity(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_ACT_NOTE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberAct The receiving '<em><b>Care Team Member Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberActNoteActivity(CareTeamMemberAct careTeamMemberAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamMemberActCareTeamMemberActNoteActivity", "INFO");

		if (VALIDATE_CARE_TEAM_MEMBER_ACT_NOTE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT);
			try {
				VALIDATE_CARE_TEAM_MEMBER_ACT_NOTE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_MEMBER_ACT_NOTE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_ACT_NOTE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamMemberAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_ACT__CARE_TEAM_MEMBER_ACT_NOTE_ACTIVITY,
						ConsolPlugin.INSTANCE.getString("CareTeamMemberActCareTeamMemberActNoteActivity"),
						new Object[] { careTeamMemberAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberActParticipant2(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Participant2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActParticipant2(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_ACT_PARTICIPANT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberActParticipant2(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Participant2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActParticipant2(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_ACT_PARTICIPANT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberAct The receiving '<em><b>Care Team Member Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberActParticipant2(CareTeamMemberAct careTeamMemberAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamMemberActCareTeamMemberActParticipant2", "INFO");

		if (VALIDATE_CARE_TEAM_MEMBER_ACT_PARTICIPANT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT);
			try {
				VALIDATE_CARE_TEAM_MEMBER_ACT_PARTICIPANT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CARE_TEAM_MEMBER_ACT_PARTICIPANT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_ACT_PARTICIPANT2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamMemberAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_ACT__CARE_TEAM_MEMBER_ACT_PARTICIPANT2,
						ConsolPlugin.INSTANCE.getString("CareTeamMemberActCareTeamMemberActParticipant2"),
						new Object[] { careTeamMemberAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberActIVLTSLow(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActIVLTSLow(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_ACT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberActIVLTSLow(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActIVLTSLow(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CARE_TEAM_MEMBER_ACT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberAct The receiving '<em><b>Care Team Member Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validateCareTeamMemberActIVLTSLow(CareTeamMemberAct careTeamMemberAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamMemberActCareTeamMemberActIVLTSLow", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_ACT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CARE_TEAM_MEMBER_ACT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_TEAM_MEMBER_ACT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CARE_TEAM_MEMBER_ACT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			careTeamMemberAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CARE_TEAM_MEMBER_ACT__CARE_TEAM_MEMBER_ACT_IVLTS_LOW,
							ConsolPlugin.INSTANCE.getString("CareTeamMemberActCareTeamMemberActIVLTSLow"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberActIVLTSHigh(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActIVLTSHigh(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_ACT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberActIVLTSHigh(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberActIVLTSHigh(CareTeamMemberAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CARE_TEAM_MEMBER_ACT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberAct The receiving '<em><b>Care Team Member Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validateCareTeamMemberActIVLTSHigh(CareTeamMemberAct careTeamMemberAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamMemberActCareTeamMemberActIVLTSHigh", "INFO");

		if (VALIDATE_CARE_TEAM_MEMBER_ACT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CARE_TEAM_MEMBER_ACT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_TEAM_MEMBER_ACT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CARE_TEAM_MEMBER_ACT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			careTeamMemberAct);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CARE_TEAM_MEMBER_ACT__CARE_TEAM_MEMBER_ACT_IVLTS_HIGH,
							ConsolPlugin.INSTANCE.getString("CareTeamMemberActCareTeamMemberActIVLTSHigh"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCareTeamMemberScheduleObservations(CareTeamMemberAct) <em>Get Care Team Member Schedule Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeamMemberScheduleObservations(CareTeamMemberAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CareTeamMemberScheduleObservation)).oclAsType(consol::CareTeamMemberScheduleObservation)";

	/**
	 * The cached OCL query for the '{@link #getCareTeamMemberScheduleObservations(CareTeamMemberAct) <em>Get Care Team Member Schedule Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeamMemberScheduleObservations(CareTeamMemberAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CareTeamMemberScheduleObservation> getCareTeamMemberScheduleObservations(
			CareTeamMemberAct careTeamMemberAct) {

		if (GET_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATIONS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT,
				ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT.getEAllOperations().get(65));
			try {
				GET_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATIONS__EOCL_QRY = helper.createQuery(
					GET_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CareTeamMemberScheduleObservation> result = (Collection<CareTeamMemberScheduleObservation>) query.evaluate(
			careTeamMemberAct);
		return new BasicEList.UnmodifiableEList<CareTeamMemberScheduleObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getNoteActivities(CareTeamMemberAct) <em>Get Note Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteActivities(CareTeamMemberAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NOTE_ACTIVITIES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::NoteActivity)).oclAsType(consol::NoteActivity)";

	/**
	 * The cached OCL query for the '{@link #getNoteActivities(CareTeamMemberAct) <em>Get Note Activities</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteActivities(CareTeamMemberAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NOTE_ACTIVITIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<NoteActivity> getNoteActivities(CareTeamMemberAct careTeamMemberAct) {

		if (GET_NOTE_ACTIVITIES__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT,
				ConsolPackage.Literals.CARE_TEAM_MEMBER_ACT.getEAllOperations().get(66));
			try {
				GET_NOTE_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_NOTE_ACTIVITIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_NOTE_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NoteActivity> result = (Collection<NoteActivity>) query.evaluate(careTeamMemberAct);
		return new BasicEList.UnmodifiableEList<NoteActivity>(result.size(), result.toArray());
	}

} // CareTeamMemberActOperations
