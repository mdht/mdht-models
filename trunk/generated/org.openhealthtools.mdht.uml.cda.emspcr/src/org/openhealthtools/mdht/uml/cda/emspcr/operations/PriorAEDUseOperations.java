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
import org.openhealthtools.mdht.uml.cda.emspcr.PriorAEDUse;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Prior AED Use</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAEDUse#validatePriorAEDUsePriorAEDProviderParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior AED Use Prior AED Provider Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAEDUse#validatePriorAEDUseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior AED Use Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAEDUse#validatePriorAEDUseCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior AED Use Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAEDUse#validatePriorAEDUseValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior AED Use Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAEDUse#validatePriorAEDUseMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior AED Use Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PriorAEDUseOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PriorAEDUseOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePriorAEDUsePriorAEDProviderParticipation(PriorAEDUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior AED Use Prior AED Provider Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAEDUsePriorAEDProviderParticipation(PriorAEDUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIOR_AED_USE_PRIOR_AED_PROVIDER_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validatePriorAEDUsePriorAEDProviderParticipation(PriorAEDUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior AED Use Prior AED Provider Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAEDUsePriorAEDProviderParticipation(PriorAEDUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRIOR_AED_USE_PRIOR_AED_PROVIDER_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param priorAEDUse The receiving '<em><b>Prior AED Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePriorAEDUsePriorAEDProviderParticipation(PriorAEDUse priorAEDUse,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRIOR_AED_USE_PRIOR_AED_PROVIDER_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIOR_AED_USE);
			try {
				VALIDATE_PRIOR_AED_USE_PRIOR_AED_PROVIDER_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_AED_USE_PRIOR_AED_PROVIDER_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PRIOR_AED_USE_PRIOR_AED_PROVIDER_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(priorAEDUse)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PRIOR_AED_USE__PRIOR_AED_USE_PRIOR_AED_PROVIDER_PARTICIPATION,
					EmspcrPlugin.INSTANCE.getString("PriorAEDUsePriorAEDProviderParticipation"),
					new Object[] { priorAEDUse }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePriorAEDUseTemplateId(PriorAEDUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior AED Use Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAEDUseTemplateId(PriorAEDUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIOR_AED_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.126')";

	/**
	 * The cached OCL invariant for the '{@link #validatePriorAEDUseTemplateId(PriorAEDUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior AED Use Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAEDUseTemplateId(PriorAEDUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRIOR_AED_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param priorAEDUse The receiving '<em><b>Prior AED Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePriorAEDUseTemplateId(PriorAEDUse priorAEDUse, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRIOR_AED_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIOR_AED_USE);
			try {
				VALIDATE_PRIOR_AED_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_AED_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_AED_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(priorAEDUse)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PRIOR_AED_USE__PRIOR_AED_USE_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("PriorAEDUseTemplateId"), new Object[] { priorAEDUse }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePriorAEDUseCode(PriorAEDUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior AED Use Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAEDUseCode(PriorAEDUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIOR_AED_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67508-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePriorAEDUseCode(PriorAEDUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior AED Use Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAEDUseCode(PriorAEDUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRIOR_AED_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param priorAEDUse The receiving '<em><b>Prior AED Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePriorAEDUseCode(PriorAEDUse priorAEDUse, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRIOR_AED_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIOR_AED_USE);
			try {
				VALIDATE_PRIOR_AED_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_AED_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_AED_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(priorAEDUse)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PRIOR_AED_USE__PRIOR_AED_USE_CODE,
					EmspcrPlugin.INSTANCE.getString("PriorAEDUseCode"), new Object[] { priorAEDUse }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePriorAEDUseValue(PriorAEDUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior AED Use Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAEDUseValue(PriorAEDUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIOR_AED_USE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17066-4' or value.code = 'LA17067-2' or value.code = 'LA32-8')))";

	/**
	 * The cached OCL invariant for the '{@link #validatePriorAEDUseValue(PriorAEDUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior AED Use Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAEDUseValue(PriorAEDUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRIOR_AED_USE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param priorAEDUse The receiving '<em><b>Prior AED Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePriorAEDUseValue(PriorAEDUse priorAEDUse, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRIOR_AED_USE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIOR_AED_USE);
			try {
				VALIDATE_PRIOR_AED_USE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_AED_USE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_AED_USE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(priorAEDUse)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PRIOR_AED_USE__PRIOR_AED_USE_VALUE,
					EmspcrPlugin.INSTANCE.getString("PriorAEDUseValue"), new Object[] { priorAEDUse }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePriorAEDUseMoodCode(PriorAEDUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior AED Use Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAEDUseMoodCode(PriorAEDUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIOR_AED_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePriorAEDUseMoodCode(PriorAEDUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior AED Use Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAEDUseMoodCode(PriorAEDUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRIOR_AED_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param priorAEDUse The receiving '<em><b>Prior AED Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePriorAEDUseMoodCode(PriorAEDUse priorAEDUse, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRIOR_AED_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIOR_AED_USE);
			try {
				VALIDATE_PRIOR_AED_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIOR_AED_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIOR_AED_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(priorAEDUse)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PRIOR_AED_USE__PRIOR_AED_USE_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("PriorAEDUseMoodCode"), new Object[] { priorAEDUse }));
			}

			return false;
		}
		return true;
	}

} // PriorAEDUseOperations
