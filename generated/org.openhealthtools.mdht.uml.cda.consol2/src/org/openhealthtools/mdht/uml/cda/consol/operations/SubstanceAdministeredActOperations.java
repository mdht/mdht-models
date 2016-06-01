/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Substance Administered Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct#validateSubstanceAdministeredActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct#validateSubstanceAdministeredActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct#validateSubstanceAdministeredActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct#validateSubstanceAdministeredActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct#validateSubstanceAdministeredActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct#validateSubstanceAdministeredActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct#validateSubstanceAdministeredActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct#validateSubstanceAdministeredActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct#validateSubstanceAdministeredActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstanceAdministeredActOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceAdministeredActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceAdministeredActTemplateId(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceAdministeredActTemplateId(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_ADMINISTERED_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.118')";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceAdministeredActTemplateId(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceAdministeredActTemplateId(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_ADMINISTERED_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceAdministeredAct The receiving '<em><b>Substance Administered Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceAdministeredActTemplateId(SubstanceAdministeredAct substanceAdministeredAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_ADMINISTERED_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_ADMINISTERED_ACT);
			try {
				VALIDATE_SUBSTANCE_ADMINISTERED_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_SUBSTANCE_ADMINISTERED_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_ADMINISTERED_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				substanceAdministeredAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_ADMINISTERED_ACT__SUBSTANCE_ADMINISTERED_ACT_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("SubstanceAdministeredActSubstanceAdministeredActTemplateId"),
						new Object[] { substanceAdministeredAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceAdministeredActClassCode(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceAdministeredActClassCode(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_ADMINISTERED_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceAdministeredActClassCode(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceAdministeredActClassCode(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_ADMINISTERED_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceAdministeredAct The receiving '<em><b>Substance Administered Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceAdministeredActClassCode(SubstanceAdministeredAct substanceAdministeredAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_ADMINISTERED_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_ADMINISTERED_ACT);
			try {
				VALIDATE_SUBSTANCE_ADMINISTERED_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_SUBSTANCE_ADMINISTERED_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_ADMINISTERED_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceAdministeredAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_ADMINISTERED_ACT__SUBSTANCE_ADMINISTERED_ACT_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("SubstanceAdministeredActSubstanceAdministeredActClassCode"),
						new Object[] { substanceAdministeredAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceAdministeredActMoodCode(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceAdministeredActMoodCode(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_ADMINISTERED_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceAdministeredActMoodCode(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceAdministeredActMoodCode(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_ADMINISTERED_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceAdministeredAct The receiving '<em><b>Substance Administered Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceAdministeredActMoodCode(SubstanceAdministeredAct substanceAdministeredAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_ADMINISTERED_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_ADMINISTERED_ACT);
			try {
				VALIDATE_SUBSTANCE_ADMINISTERED_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_SUBSTANCE_ADMINISTERED_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_ADMINISTERED_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceAdministeredAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_ADMINISTERED_ACT__SUBSTANCE_ADMINISTERED_ACT_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("SubstanceAdministeredActSubstanceAdministeredActMoodCode"),
						new Object[] { substanceAdministeredAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceAdministeredActId(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceAdministeredActId(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_ADMINISTERED_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceAdministeredActId(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceAdministeredActId(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_ADMINISTERED_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceAdministeredAct The receiving '<em><b>Substance Administered Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceAdministeredActId(SubstanceAdministeredAct substanceAdministeredAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_ADMINISTERED_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_ADMINISTERED_ACT);
			try {
				VALIDATE_SUBSTANCE_ADMINISTERED_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_SUBSTANCE_ADMINISTERED_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_ADMINISTERED_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceAdministeredAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_ADMINISTERED_ACT__SUBSTANCE_ADMINISTERED_ACT_ID,
						ConsolPlugin.INSTANCE.getString("SubstanceAdministeredActSubstanceAdministeredActId"),
						new Object[] { substanceAdministeredAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceAdministeredActCodeP(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceAdministeredActCodeP(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_ADMINISTERED_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceAdministeredActCodeP(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceAdministeredActCodeP(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_ADMINISTERED_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceAdministeredAct The receiving '<em><b>Substance Administered Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceAdministeredActCodeP(SubstanceAdministeredAct substanceAdministeredAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_ADMINISTERED_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_ADMINISTERED_ACT);
			try {
				VALIDATE_SUBSTANCE_ADMINISTERED_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_SUBSTANCE_ADMINISTERED_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_ADMINISTERED_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceAdministeredAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_ADMINISTERED_ACT__SUBSTANCE_ADMINISTERED_ACT_CODE_P,
						ConsolPlugin.INSTANCE.getString("SubstanceAdministeredActSubstanceAdministeredActCodeP"),
						new Object[] { substanceAdministeredAct }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredActCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredActCodeP", passToken);
				}
				passToken.add(substanceAdministeredAct);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceAdministeredActCode(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceAdministeredActCode(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_ADMINISTERED_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '416118004' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceAdministeredActCode(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceAdministeredActCode(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_ADMINISTERED_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceAdministeredAct The receiving '<em><b>Substance Administered Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceAdministeredActCode(SubstanceAdministeredAct substanceAdministeredAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredActCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(substanceAdministeredAct)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_SUBSTANCE_ADMINISTERED_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_ADMINISTERED_ACT);
			try {
				VALIDATE_SUBSTANCE_ADMINISTERED_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_SUBSTANCE_ADMINISTERED_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_ADMINISTERED_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			substanceAdministeredAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_ADMINISTERED_ACT__SUBSTANCE_ADMINISTERED_ACT_CODE,
						ConsolPlugin.INSTANCE.getString("SubstanceAdministeredActSubstanceAdministeredActCode"),
						new Object[] { substanceAdministeredAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceAdministeredActStatusCode(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceAdministeredActStatusCode(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_ADMINISTERED_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceAdministeredActStatusCode(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceAdministeredActStatusCode(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_ADMINISTERED_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceAdministeredAct The receiving '<em><b>Substance Administered Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceAdministeredActStatusCode(SubstanceAdministeredAct substanceAdministeredAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_ADMINISTERED_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_ADMINISTERED_ACT);
			try {
				VALIDATE_SUBSTANCE_ADMINISTERED_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_SUBSTANCE_ADMINISTERED_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_ADMINISTERED_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				substanceAdministeredAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_ADMINISTERED_ACT__SUBSTANCE_ADMINISTERED_ACT_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("SubstanceAdministeredActSubstanceAdministeredActStatusCode"),
						new Object[] { substanceAdministeredAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceAdministeredActStatusCodeP(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceAdministeredActStatusCodeP(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_ADMINISTERED_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceAdministeredActStatusCodeP(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceAdministeredActStatusCodeP(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_ADMINISTERED_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceAdministeredAct The receiving '<em><b>Substance Administered Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceAdministeredActStatusCodeP(SubstanceAdministeredAct substanceAdministeredAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_ADMINISTERED_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_ADMINISTERED_ACT);
			try {
				VALIDATE_SUBSTANCE_ADMINISTERED_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_SUBSTANCE_ADMINISTERED_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_ADMINISTERED_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				substanceAdministeredAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_ADMINISTERED_ACT__SUBSTANCE_ADMINISTERED_ACT_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString("SubstanceAdministeredActSubstanceAdministeredActStatusCodeP"),
						new Object[] { substanceAdministeredAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceAdministeredActEffectiveTime(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceAdministeredActEffectiveTime(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_ADMINISTERED_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceAdministeredActEffectiveTime(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Administered Act Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceAdministeredActEffectiveTime(SubstanceAdministeredAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SUBSTANCE_ADMINISTERED_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceAdministeredAct The receiving '<em><b>Substance Administered Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceAdministeredActEffectiveTime(
			SubstanceAdministeredAct substanceAdministeredAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_ADMINISTERED_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_ADMINISTERED_ACT);
			try {
				VALIDATE_SUBSTANCE_ADMINISTERED_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_SUBSTANCE_ADMINISTERED_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SUBSTANCE_ADMINISTERED_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				substanceAdministeredAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_ADMINISTERED_ACT__SUBSTANCE_ADMINISTERED_ACT_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString(
							"SubstanceAdministeredActSubstanceAdministeredActEffectiveTime"),
						new Object[] { substanceAdministeredAct }));
			}

			return false;
		}
		return true;
	}

} // SubstanceAdministeredActOperations
