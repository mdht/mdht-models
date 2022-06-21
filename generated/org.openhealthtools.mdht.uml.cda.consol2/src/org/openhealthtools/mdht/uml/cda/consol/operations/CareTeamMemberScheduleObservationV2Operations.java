/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Care Team Member Schedule Observation V2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2#validateCareTeamMemberScheduleObservationV2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2#validateCareTeamMemberScheduleObservationV2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2#validateCareTeamMemberScheduleObservationV2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2#validateCareTeamMemberScheduleObservationV2Text(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2#validateCareTeamMemberScheduleObservationV2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2#validateCareTeamMemberScheduleObservationV2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2#validateCareTeamMemberScheduleObservationV2MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2#validateCareTeamMemberScheduleObservationV2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2#validateCareTeamMemberScheduleObservationV2EDTELValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2EDTEL Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2#validateCareTeamMemberScheduleObservationV2EDReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2ED Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2#validateCareTeamMemberScheduleObservationV2IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2#validateCareTeamMemberScheduleObservationV2IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2IVLTS High</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CareTeamMemberScheduleObservationV2Operations extends ClinicalStatementOperations {

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
	protected CareTeamMemberScheduleObservationV2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberScheduleObservationV2TemplateId(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationV2TemplateId(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.500.3' and id.extension = '2022- 06-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberScheduleObservationV2TemplateId(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationV2TemplateId(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberScheduleObservationV2 The receiving '<em><b>Care Team Member Schedule Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberScheduleObservationV2TemplateId(
			CareTeamMemberScheduleObservationV2 careTeamMemberScheduleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "CareTeamMemberScheduleObservationV2CareTeamMemberScheduleObservationV2TemplateId", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2);
			try {
				VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamMemberScheduleObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2__CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"CareTeamMemberScheduleObservationV2CareTeamMemberScheduleObservationV2TemplateId"),
						new Object[] { careTeamMemberScheduleObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberScheduleObservationV2CodeP(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationV2CodeP(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberScheduleObservationV2CodeP(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationV2CodeP(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberScheduleObservationV2 The receiving '<em><b>Care Team Member Schedule Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberScheduleObservationV2CodeP(
			CareTeamMemberScheduleObservationV2 careTeamMemberScheduleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "CareTeamMemberScheduleObservationV2CareTeamMemberScheduleObservationV2CodeP", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2);
			try {
				VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamMemberScheduleObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2__CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"CareTeamMemberScheduleObservationV2CareTeamMemberScheduleObservationV2CodeP"),
						new Object[] { careTeamMemberScheduleObservationV2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2CodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2CodeP", passToken);
				}
				passToken.add(careTeamMemberScheduleObservationV2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberScheduleObservationV2Code(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationV2Code(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '57203-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberScheduleObservationV2Code(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationV2Code(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberScheduleObservationV2 The receiving '<em><b>Care Team Member Schedule Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberScheduleObservationV2Code(
			CareTeamMemberScheduleObservationV2 careTeamMemberScheduleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2CodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(careTeamMemberScheduleObservationV2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(
			context, "CareTeamMemberScheduleObservationV2CareTeamMemberScheduleObservationV2Code", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2);
			try {
				VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamMemberScheduleObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2__CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_CODE,
						ConsolPlugin.INSTANCE.getString(
							"CareTeamMemberScheduleObservationV2CareTeamMemberScheduleObservationV2Code"),
						new Object[] { careTeamMemberScheduleObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberScheduleObservationV2Text(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationV2Text(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberScheduleObservationV2Text(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationV2Text(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberScheduleObservationV2 The receiving '<em><b>Care Team Member Schedule Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberScheduleObservationV2Text(
			CareTeamMemberScheduleObservationV2 careTeamMemberScheduleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "CareTeamMemberScheduleObservationV2CareTeamMemberScheduleObservationV2Text", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2);
			try {
				VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamMemberScheduleObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2__CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_TEXT,
						ConsolPlugin.INSTANCE.getString(
							"CareTeamMemberScheduleObservationV2CareTeamMemberScheduleObservationV2Text"),
						new Object[] { careTeamMemberScheduleObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberScheduleObservationV2 The receiving '<em><b>Care Team Member Schedule Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberScheduleObservationV2Value(
			CareTeamMemberScheduleObservationV2 careTeamMemberScheduleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "CareTeamMemberScheduleObservationV2CareTeamMemberScheduleObservationV2Value", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2);
			try {
				VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamMemberScheduleObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2__CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_VALUE,
						ConsolPlugin.INSTANCE.getString(
							"CareTeamMemberScheduleObservationV2CareTeamMemberScheduleObservationV2Value"),
						new Object[] { careTeamMemberScheduleObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberScheduleObservationV2 The receiving '<em><b>Care Team Member Schedule Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberScheduleObservationV2ClassCode(
			CareTeamMemberScheduleObservationV2 careTeamMemberScheduleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "CareTeamMemberScheduleObservationV2CareTeamMemberScheduleObservationV2ClassCode", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2);
			try {
				VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamMemberScheduleObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2__CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"CareTeamMemberScheduleObservationV2CareTeamMemberScheduleObservationV2ClassCode"),
						new Object[] { careTeamMemberScheduleObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberScheduleObservationV2 The receiving '<em><b>Care Team Member Schedule Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberScheduleObservationV2MoodCode(
			CareTeamMemberScheduleObservationV2 careTeamMemberScheduleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "CareTeamMemberScheduleObservationV2CareTeamMemberScheduleObservationV2MoodCode", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2);
			try {
				VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamMemberScheduleObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2__CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString(
							"CareTeamMemberScheduleObservationV2CareTeamMemberScheduleObservationV2MoodCode"),
						new Object[] { careTeamMemberScheduleObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberScheduleObservationV2StatusCode(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationV2StatusCode(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberScheduleObservationV2StatusCode(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationV2StatusCode(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberScheduleObservationV2 The receiving '<em><b>Care Team Member Schedule Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamMemberScheduleObservationV2StatusCode(
			CareTeamMemberScheduleObservationV2 careTeamMemberScheduleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "CareTeamMemberScheduleObservationV2CareTeamMemberScheduleObservationV2StatusCode", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2);
			try {
				VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamMemberScheduleObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2__CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"CareTeamMemberScheduleObservationV2CareTeamMemberScheduleObservationV2StatusCode"),
						new Object[] { careTeamMemberScheduleObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberScheduleObservationV2ClassCode(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationV2ClassCode(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberScheduleObservationV2ClassCode(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationV2ClassCode(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberScheduleObservationV2MoodCode(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationV2MoodCode(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberScheduleObservationV2MoodCode(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationV2MoodCode(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberScheduleObservationV2Value(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationV2Value(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::IVL_TS)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberScheduleObservationV2Value(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationV2Value(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberScheduleObservationV2EDTELValue(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2EDTEL Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationV2EDTELValue(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.text->excluding(null)->select(isNullFlavorUndefined()).reference->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not value.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberScheduleObservationV2EDTELValue(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2EDTEL Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationV2EDTELValue(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberScheduleObservationV2 The receiving '<em><b>Care Team Member Schedule Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validateCareTeamMemberScheduleObservationV2EDTELValue(
			CareTeamMemberScheduleObservationV2 careTeamMemberScheduleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "CareTeamMemberScheduleObservationV2CareTeamMemberScheduleObservationV2EDTELValue", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			careTeamMemberScheduleObservationV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2__CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2EDTEL_VALUE,
							ConsolPlugin.INSTANCE.getString(
								"CareTeamMemberScheduleObservationV2CareTeamMemberScheduleObservationV2EDTELValue"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberScheduleObservationV2EDReference(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2ED Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationV2EDReference(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.text->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((reference.oclIsUndefined() or reference.isNullFlavorUndefined()) implies (not reference.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberScheduleObservationV2EDReference(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2ED Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationV2EDReference(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberScheduleObservationV2 The receiving '<em><b>Care Team Member Schedule Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validateCareTeamMemberScheduleObservationV2EDReference(
			CareTeamMemberScheduleObservationV2 careTeamMemberScheduleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "CareTeamMemberScheduleObservationV2CareTeamMemberScheduleObservationV2EDReference", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			careTeamMemberScheduleObservationV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2__CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2ED_REFERENCE,
							ConsolPlugin.INSTANCE.getString(
								"CareTeamMemberScheduleObservationV2CareTeamMemberScheduleObservationV2EDReference"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberScheduleObservationV2IVLTSLow(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationV2IVLTSLow(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberScheduleObservationV2IVLTSLow(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationV2IVLTSLow(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberScheduleObservationV2 The receiving '<em><b>Care Team Member Schedule Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validateCareTeamMemberScheduleObservationV2IVLTSLow(
			CareTeamMemberScheduleObservationV2 careTeamMemberScheduleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "CareTeamMemberScheduleObservationV2CareTeamMemberScheduleObservationV2IVLTSLow", "ERROR");

		if (VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			careTeamMemberScheduleObservationV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2__CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2IVLTS_LOW,
							ConsolPlugin.INSTANCE.getString(
								"CareTeamMemberScheduleObservationV2CareTeamMemberScheduleObservationV2IVLTSLow"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberScheduleObservationV2 The receiving '<em><b>Care Team Member Schedule Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamMemberScheduleObservationV2IVLTSHigh(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationV2IVLTSHigh(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamMemberScheduleObservationV2IVLTSHigh(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamMemberScheduleObservationV2IVLTSHigh(CareTeamMemberScheduleObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamMemberScheduleObservationV2 The receiving '<em><b>Care Team Member Schedule Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validateCareTeamMemberScheduleObservationV2IVLTSHigh(
			CareTeamMemberScheduleObservationV2 careTeamMemberScheduleObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "CareTeamMemberScheduleObservationV2CareTeamMemberScheduleObservationV2IVLTSHigh", "WARNING");

		if (VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			careTeamMemberScheduleObservationV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2__CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2IVLTS_HIGH,
							ConsolPlugin.INSTANCE.getString(
								"CareTeamMemberScheduleObservationV2CareTeamMemberScheduleObservationV2IVLTSHigh"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // CareTeamMemberScheduleObservationV2Operations
