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

import org.eclipse.mdht.uml.cda.operations.OrganizerOperations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2;
import org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2;
import org.openhealthtools.mdht.uml.cda.consol.CareTeamTypeObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.NoteActivity;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Care Team Organizer V2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2CareTeamMember(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Care Team Member</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2CareLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Care Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2NoteActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Note Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2CareTeamTypeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Care Team Type Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2CareTeamMemberActV2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Care Team Member Act V2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#getNoteActivities() <em>Get Note Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#getCareTeamTypeObservations() <em>Get Care Team Type Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#getCareTeamMemberActV2s() <em>Get Care Team Member Act V2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CareTeamOrganizerV2Operations extends OrganizerOperations {

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
	protected CareTeamOrganizerV2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerV2TemplateId(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2TemplateId(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.500' and id.extension = '2022-06-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerV2TemplateId(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2TemplateId(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_ORGANIZER_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizerV2 The receiving '<em><b>Care Team Organizer V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerV2TemplateId(CareTeamOrganizerV2 careTeamOrganizerV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamOrganizerV2CareTeamOrganizerV2TemplateId", "ERROR");

		if (VALIDATE_CARE_TEAM_ORGANIZER_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER_V2);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_ORGANIZER_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_ORGANIZER_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamOrganizerV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_ORGANIZER_V2__CARE_TEAM_ORGANIZER_V2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("CareTeamOrganizerV2CareTeamOrganizerV2TemplateId"),
						new Object[] { careTeamOrganizerV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerV2Id(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2Id(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerV2Id(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2Id(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_ORGANIZER_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizerV2 The receiving '<em><b>Care Team Organizer V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerV2Id(CareTeamOrganizerV2 careTeamOrganizerV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamOrganizerV2CareTeamOrganizerV2Id", "ERROR");

		if (VALIDATE_CARE_TEAM_ORGANIZER_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER_V2);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CARE_TEAM_ORGANIZER_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAM_ORGANIZER_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			careTeamOrganizerV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_ORGANIZER_V2__CARE_TEAM_ORGANIZER_V2_ID,
						ConsolPlugin.INSTANCE.getString("CareTeamOrganizerV2CareTeamOrganizerV2Id"),
						new Object[] { careTeamOrganizerV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerV2Code(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2Code(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '86744-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerV2Code(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2Code(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_ORGANIZER_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizerV2 The receiving '<em><b>Care Team Organizer V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerV2Code(CareTeamOrganizerV2 careTeamOrganizerV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamOrganizerV2CareTeamOrganizerV2Code", "ERROR");

		if (VALIDATE_CARE_TEAM_ORGANIZER_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER_V2);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CARE_TEAM_ORGANIZER_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_ORGANIZER_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamOrganizerV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_ORGANIZER_V2__CARE_TEAM_ORGANIZER_V2_CODE,
						ConsolPlugin.INSTANCE.getString("CareTeamOrganizerV2CareTeamOrganizerV2Code"),
						new Object[] { careTeamOrganizerV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerV2CodeP(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2CodeP(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerV2CodeP(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2CodeP(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_ORGANIZER_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizerV2 The receiving '<em><b>Care Team Organizer V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerV2CodeP(CareTeamOrganizerV2 careTeamOrganizerV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamOrganizerV2CareTeamOrganizerV2CodeP", "ERROR");

		if (VALIDATE_CARE_TEAM_ORGANIZER_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER_V2);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CARE_TEAM_ORGANIZER_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_ORGANIZER_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeamOrganizerV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_ORGANIZER_V2__CARE_TEAM_ORGANIZER_V2_CODE_P,
						ConsolPlugin.INSTANCE.getString("CareTeamOrganizerV2CareTeamOrganizerV2CodeP"),
						new Object[] { careTeamOrganizerV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerV2StatusCode(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2StatusCode(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerV2StatusCode(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2StatusCode(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_ORGANIZER_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizerV2 The receiving '<em><b>Care Team Organizer V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerV2StatusCode(CareTeamOrganizerV2 careTeamOrganizerV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamOrganizerV2CareTeamOrganizerV2StatusCode", "ERROR");

		if (VALIDATE_CARE_TEAM_ORGANIZER_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER_V2);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_ORGANIZER_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_ORGANIZER_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamOrganizerV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_ORGANIZER_V2__CARE_TEAM_ORGANIZER_V2_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("CareTeamOrganizerV2CareTeamOrganizerV2StatusCode"),
						new Object[] { careTeamOrganizerV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerV2EffectiveTime(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2EffectiveTime(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_V2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerV2EffectiveTime(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2EffectiveTime(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_ORGANIZER_V2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizerV2 The receiving '<em><b>Care Team Organizer V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerV2EffectiveTime(CareTeamOrganizerV2 careTeamOrganizerV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamOrganizerV2CareTeamOrganizerV2EffectiveTime", "ERROR");

		if (VALIDATE_CARE_TEAM_ORGANIZER_V2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER_V2);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_V2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_ORGANIZER_V2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_ORGANIZER_V2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamOrganizerV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_ORGANIZER_V2__CARE_TEAM_ORGANIZER_V2_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("CareTeamOrganizerV2CareTeamOrganizerV2EffectiveTime"),
						new Object[] { careTeamOrganizerV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerV2ClassCode(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2ClassCode(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerV2ClassCode(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2ClassCode(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_ORGANIZER_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizerV2 The receiving '<em><b>Care Team Organizer V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerV2ClassCode(CareTeamOrganizerV2 careTeamOrganizerV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamOrganizerV2CareTeamOrganizerV2ClassCode", "ERROR");

		if (VALIDATE_CARE_TEAM_ORGANIZER_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER_V2);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CARE_TEAM_ORGANIZER_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_ORGANIZER_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamOrganizerV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_ORGANIZER_V2__CARE_TEAM_ORGANIZER_V2_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("CareTeamOrganizerV2CareTeamOrganizerV2ClassCode"),
						new Object[] { careTeamOrganizerV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerV2MoodCode(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2MoodCode(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerV2MoodCode(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2MoodCode(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_ORGANIZER_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizerV2 The receiving '<em><b>Care Team Organizer V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerV2MoodCode(CareTeamOrganizerV2 careTeamOrganizerV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamOrganizerV2CareTeamOrganizerV2MoodCode", "ERROR");

		if (VALIDATE_CARE_TEAM_ORGANIZER_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER_V2);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CARE_TEAM_ORGANIZER_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_ORGANIZER_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamOrganizerV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_ORGANIZER_V2__CARE_TEAM_ORGANIZER_V2_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("CareTeamOrganizerV2CareTeamOrganizerV2MoodCode"),
						new Object[] { careTeamOrganizerV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerV2CareTeamMember(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Care Team Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2CareTeamMember(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_TEAM_MEMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerV2CareTeamMember(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Care Team Member</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2CareTeamMember(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_TEAM_MEMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizerV2 The receiving '<em><b>Care Team Organizer V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerV2CareTeamMember(CareTeamOrganizerV2 careTeamOrganizerV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamOrganizerV2CareTeamOrganizerV2CareTeamMember", "WARNING");

		if (VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_TEAM_MEMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER_V2);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_TEAM_MEMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_TEAM_MEMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_TEAM_MEMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamOrganizerV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_ORGANIZER_V2__CARE_TEAM_ORGANIZER_V2_CARE_TEAM_MEMBER,
						ConsolPlugin.INSTANCE.getString("CareTeamOrganizerV2CareTeamOrganizerV2CareTeamMember"),
						new Object[] { careTeamOrganizerV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerV2CareLocation(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Care Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2CareLocation(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerV2CareLocation(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Care Location</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2CareLocation(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizerV2 The receiving '<em><b>Care Team Organizer V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerV2CareLocation(CareTeamOrganizerV2 careTeamOrganizerV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamOrganizerV2CareTeamOrganizerV2CareLocation", "WARNING");

		if (VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER_V2);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamOrganizerV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_ORGANIZER_V2__CARE_TEAM_ORGANIZER_V2_CARE_LOCATION,
						ConsolPlugin.INSTANCE.getString("CareTeamOrganizerV2CareTeamOrganizerV2CareLocation"),
						new Object[] { careTeamOrganizerV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerV2NoteActivity(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Note Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2NoteActivity(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_V2_NOTE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.act.oclIsUndefined() and component.act.oclIsKindOf(consol::NoteActivity))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerV2NoteActivity(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Note Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2NoteActivity(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_ORGANIZER_V2_NOTE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizerV2 The receiving '<em><b>Care Team Organizer V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerV2NoteActivity(CareTeamOrganizerV2 careTeamOrganizerV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamOrganizerV2CareTeamOrganizerV2NoteActivity", "WARNING");

		if (VALIDATE_CARE_TEAM_ORGANIZER_V2_NOTE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER_V2);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_V2_NOTE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_ORGANIZER_V2_NOTE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_ORGANIZER_V2_NOTE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamOrganizerV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_ORGANIZER_V2__CARE_TEAM_ORGANIZER_V2_NOTE_ACTIVITY,
						ConsolPlugin.INSTANCE.getString("CareTeamOrganizerV2CareTeamOrganizerV2NoteActivity"),
						new Object[] { careTeamOrganizerV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerV2CareTeamTypeObservation(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Care Team Type Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2CareTeamTypeObservation(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_TEAM_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::CareTeamTypeObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerV2CareTeamTypeObservation(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Care Team Type Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2CareTeamTypeObservation(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_TEAM_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizerV2 The receiving '<em><b>Care Team Organizer V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerV2CareTeamTypeObservation(CareTeamOrganizerV2 careTeamOrganizerV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamOrganizerV2CareTeamOrganizerV2CareTeamTypeObservation", "INFO");

		if (VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_TEAM_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER_V2);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_TEAM_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_TEAM_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_TEAM_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamOrganizerV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_ORGANIZER_V2__CARE_TEAM_ORGANIZER_V2_CARE_TEAM_TYPE_OBSERVATION,
						ConsolPlugin.INSTANCE.getString(
							"CareTeamOrganizerV2CareTeamOrganizerV2CareTeamTypeObservation"),
						new Object[] { careTeamOrganizerV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerV2CareTeamMemberActV2(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Care Team Member Act V2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2CareTeamMemberActV2(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_TEAM_MEMBER_ACT_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.act.oclIsUndefined() and component.act.oclIsKindOf(consol::CareTeamMemberActV2))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerV2CareTeamMemberActV2(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Care Team Member Act V2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2CareTeamMemberActV2(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_TEAM_MEMBER_ACT_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizerV2 The receiving '<em><b>Care Team Organizer V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamOrganizerV2CareTeamMemberActV2(CareTeamOrganizerV2 careTeamOrganizerV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamOrganizerV2CareTeamOrganizerV2CareTeamMemberActV2", "ERROR");

		if (VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_TEAM_MEMBER_ACT_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER_V2);
			try {
				VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_TEAM_MEMBER_ACT_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_TEAM_MEMBER_ACT_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_TEAM_MEMBER_ACT_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				careTeamOrganizerV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAM_ORGANIZER_V2__CARE_TEAM_ORGANIZER_V2_CARE_TEAM_MEMBER_ACT_V2,
						ConsolPlugin.INSTANCE.getString("CareTeamOrganizerV2CareTeamOrganizerV2CareTeamMemberActV2"),
						new Object[] { careTeamOrganizerV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerV2IVLTSLow(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2IVLTSLow(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_V2IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerV2IVLTSLow(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2IVLTSLow(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CARE_TEAM_ORGANIZER_V2IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizerV2 The receiving '<em><b>Care Team Organizer V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCareTeamOrganizerV2IVLTSLow(CareTeamOrganizerV2 careTeamOrganizerV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamOrganizerV2CareTeamOrganizerV2IVLTSLow", "ERROR");

		if (VALIDATE_CARE_TEAM_ORGANIZER_V2IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CARE_TEAM_ORGANIZER_V2IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_TEAM_ORGANIZER_V2IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CARE_TEAM_ORGANIZER_V2IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			careTeamOrganizerV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CARE_TEAM_ORGANIZER_V2__CARE_TEAM_ORGANIZER_V2IVLTS_LOW,
							ConsolPlugin.INSTANCE.getString("CareTeamOrganizerV2CareTeamOrganizerV2IVLTSLow"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamOrganizerV2IVLTSHigh(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2IVLTSHigh(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAM_ORGANIZER_V2IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamOrganizerV2IVLTSHigh(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamOrganizerV2IVLTSHigh(CareTeamOrganizerV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CARE_TEAM_ORGANIZER_V2IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeamOrganizerV2 The receiving '<em><b>Care Team Organizer V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCareTeamOrganizerV2IVLTSHigh(CareTeamOrganizerV2 careTeamOrganizerV2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamOrganizerV2CareTeamOrganizerV2IVLTSHigh", "INFO");

		if (VALIDATE_CARE_TEAM_ORGANIZER_V2IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAM_ORGANIZER_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CARE_TEAM_ORGANIZER_V2IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_TEAM_ORGANIZER_V2IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CARE_TEAM_ORGANIZER_V2IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			careTeamOrganizerV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CARE_TEAM_ORGANIZER_V2__CARE_TEAM_ORGANIZER_V2IVLTS_HIGH,
							ConsolPlugin.INSTANCE.getString("CareTeamOrganizerV2CareTeamOrganizerV2IVLTSHigh"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getNoteActivities(CareTeamOrganizerV2) <em>Get Note Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteActivities(CareTeamOrganizerV2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NOTE_ACTIVITIES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::NoteActivity)).oclAsType(consol::NoteActivity)";

	/**
	 * The cached OCL query for the '{@link #getNoteActivities(CareTeamOrganizerV2) <em>Get Note Activities</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteActivities(CareTeamOrganizerV2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NOTE_ACTIVITIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<NoteActivity> getNoteActivities(CareTeamOrganizerV2 careTeamOrganizerV2) {

		if (GET_NOTE_ACTIVITIES__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CARE_TEAM_ORGANIZER_V2,
				ConsolPackage.Literals.CARE_TEAM_ORGANIZER_V2.getEAllOperations().get(67));
			try {
				GET_NOTE_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_NOTE_ACTIVITIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_NOTE_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NoteActivity> result = (Collection<NoteActivity>) query.evaluate(careTeamOrganizerV2);
		return new BasicEList.UnmodifiableEList<NoteActivity>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCareTeamTypeObservations(CareTeamOrganizerV2) <em>Get Care Team Type Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeamTypeObservations(CareTeamOrganizerV2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CARE_TEAM_TYPE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CareTeamTypeObservation)).oclAsType(consol::CareTeamTypeObservation)";

	/**
	 * The cached OCL query for the '{@link #getCareTeamTypeObservations(CareTeamOrganizerV2) <em>Get Care Team Type Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeamTypeObservations(CareTeamOrganizerV2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CARE_TEAM_TYPE_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CareTeamTypeObservation> getCareTeamTypeObservations(CareTeamOrganizerV2 careTeamOrganizerV2) {

		if (GET_CARE_TEAM_TYPE_OBSERVATIONS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CARE_TEAM_ORGANIZER_V2,
				ConsolPackage.Literals.CARE_TEAM_ORGANIZER_V2.getEAllOperations().get(68));
			try {
				GET_CARE_TEAM_TYPE_OBSERVATIONS__EOCL_QRY = helper.createQuery(
					GET_CARE_TEAM_TYPE_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CARE_TEAM_TYPE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CareTeamTypeObservation> result = (Collection<CareTeamTypeObservation>) query.evaluate(
			careTeamOrganizerV2);
		return new BasicEList.UnmodifiableEList<CareTeamTypeObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCareTeamMemberActV2s(CareTeamOrganizerV2) <em>Get Care Team Member Act V2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeamMemberActV2s(CareTeamOrganizerV2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CARE_TEAM_MEMBER_ACT_V2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::CareTeamMemberActV2)).oclAsType(consol::CareTeamMemberActV2)";

	/**
	 * The cached OCL query for the '{@link #getCareTeamMemberActV2s(CareTeamOrganizerV2) <em>Get Care Team Member Act V2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeamMemberActV2s(CareTeamOrganizerV2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CARE_TEAM_MEMBER_ACT_V2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CareTeamMemberActV2> getCareTeamMemberActV2s(CareTeamOrganizerV2 careTeamOrganizerV2) {

		if (GET_CARE_TEAM_MEMBER_ACT_V2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CARE_TEAM_ORGANIZER_V2,
				ConsolPackage.Literals.CARE_TEAM_ORGANIZER_V2.getEAllOperations().get(69));
			try {
				GET_CARE_TEAM_MEMBER_ACT_V2S__EOCL_QRY = helper.createQuery(GET_CARE_TEAM_MEMBER_ACT_V2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CARE_TEAM_MEMBER_ACT_V2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CareTeamMemberActV2> result = (Collection<CareTeamMemberActV2>) query.evaluate(careTeamOrganizerV2);
		return new BasicEList.UnmodifiableEList<CareTeamMemberActV2>(result.size(), result.toArray());
	}

} // CareTeamOrganizerV2Operations
