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
import org.eclipse.mdht.uml.cda.operations.SectionOperations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.CareTeams;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Care Teams</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeams#validateCareTeamsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeams#validateCareTeamsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeams#validateCareTeamsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeams#validateCareTeamsTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeams#validateCareTeamsText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeams#validateCareTeamsCareTeamOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams Care Team Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeams#getCareTeamOrganizers() <em>Get Care Team Organizers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CareTeamsOperations extends SectionOperations {

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
	protected CareTeamsOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamsTemplateId(CareTeams, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamsTemplateId(CareTeams, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAMS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.500' and id.extension = '2019-07-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamsTemplateId(CareTeams, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamsTemplateId(CareTeams, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAMS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeams The receiving '<em><b>Care Teams</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamsTemplateId(CareTeams careTeams, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamsCareTeamsTemplateId", "ERROR");

		if (VALIDATE_CARE_TEAMS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAMS);
			try {
				VALIDATE_CARE_TEAMS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CARE_TEAMS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAMS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			careTeams)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAMS__CARE_TEAMS_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("CareTeamsCareTeamsTemplateId"), new Object[] { careTeams }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamsCodeP(CareTeams, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamsCodeP(CareTeams, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAMS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamsCodeP(CareTeams, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamsCodeP(CareTeams, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAMS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeams The receiving '<em><b>Care Teams</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamsCodeP(CareTeams careTeams, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamsCareTeamsCodeP", "ERROR");

		if (VALIDATE_CARE_TEAMS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAMS);
			try {
				VALIDATE_CARE_TEAMS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CARE_TEAMS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAMS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			careTeams)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAMS__CARE_TEAMS_CODE_P,
						ConsolPlugin.INSTANCE.getString("CareTeamsCareTeamsCodeP"), new Object[] { careTeams }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.CareTeamsCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.CareTeamsCodeP", passToken);
				}
				passToken.add(careTeams);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamsCode(CareTeams, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamsCode(CareTeams, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAMS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '85847-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamsCode(CareTeams, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamsCode(CareTeams, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAMS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeams The receiving '<em><b>Care Teams</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamsCode(CareTeams careTeams, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.CareTeamsCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(careTeams)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "CareTeamsCareTeamsCode", "ERROR");

		if (VALIDATE_CARE_TEAMS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAMS);
			try {
				VALIDATE_CARE_TEAMS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CARE_TEAMS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAMS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			careTeams)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAMS__CARE_TEAMS_CODE,
						ConsolPlugin.INSTANCE.getString("CareTeamsCareTeamsCode"), new Object[] { careTeams }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamsTitle(CareTeams, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamsTitle(CareTeams, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAMS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamsTitle(CareTeams, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamsTitle(CareTeams, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAMS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeams The receiving '<em><b>Care Teams</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamsTitle(CareTeams careTeams, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamsCareTeamsTitle", "ERROR");

		if (VALIDATE_CARE_TEAMS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAMS);
			try {
				VALIDATE_CARE_TEAMS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CARE_TEAMS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAMS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			careTeams)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAMS__CARE_TEAMS_TITLE,
						ConsolPlugin.INSTANCE.getString("CareTeamsCareTeamsTitle"), new Object[] { careTeams }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamsText(CareTeams, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamsText(CareTeams, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAMS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamsText(CareTeams, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamsText(CareTeams, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAMS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeams The receiving '<em><b>Care Teams</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamsText(CareTeams careTeams, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamsCareTeamsText", "ERROR");

		if (VALIDATE_CARE_TEAMS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAMS);
			try {
				VALIDATE_CARE_TEAMS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CARE_TEAMS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_CARE_TEAMS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			careTeams)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAMS__CARE_TEAMS_TEXT,
						ConsolPlugin.INSTANCE.getString("CareTeamsCareTeamsText"), new Object[] { careTeams }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareTeamsCareTeamOrganizer(CareTeams, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams Care Team Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamsCareTeamOrganizer(CareTeams, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_TEAMS_CARE_TEAM_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::CareTeamOrganizer))";

	/**
	 * The cached OCL invariant for the '{@link #validateCareTeamsCareTeamOrganizer(CareTeams, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams Care Team Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareTeamsCareTeamOrganizer(CareTeams, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CARE_TEAMS_CARE_TEAM_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param careTeams The receiving '<em><b>Care Teams</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCareTeamsCareTeamOrganizer(CareTeams careTeams, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CareTeamsCareTeamsCareTeamOrganizer", "WARNING");

		if (VALIDATE_CARE_TEAMS_CARE_TEAM_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_TEAMS);
			try {
				VALIDATE_CARE_TEAMS_CARE_TEAM_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CARE_TEAMS_CARE_TEAM_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CARE_TEAMS_CARE_TEAM_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(careTeams)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_TEAMS__CARE_TEAMS_CARE_TEAM_ORGANIZER,
						ConsolPlugin.INSTANCE.getString("CareTeamsCareTeamsCareTeamOrganizer"),
						new Object[] { careTeams }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCareTeamOrganizers(CareTeams) <em>Get Care Team Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeamOrganizers(CareTeams)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CARE_TEAM_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::CareTeamOrganizer)).oclAsType(consol::CareTeamOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getCareTeamOrganizers(CareTeams) <em>Get Care Team Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeamOrganizers(CareTeams)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CARE_TEAM_ORGANIZERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CareTeamOrganizer> getCareTeamOrganizers(CareTeams careTeams) {

		if (GET_CARE_TEAM_ORGANIZERS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CARE_TEAMS, ConsolPackage.Literals.CARE_TEAMS.getEAllOperations().get(61));
			try {
				GET_CARE_TEAM_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_CARE_TEAM_ORGANIZERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CARE_TEAM_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CareTeamOrganizer> result = (Collection<CareTeamOrganizer>) query.evaluate(careTeams);
		return new BasicEList.UnmodifiableEList<CareTeamOrganizer>(result.size(), result.toArray());
	}

} // CareTeamsOperations
