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

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Nutrition Recommendations</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations#validateNutritionRecommendationsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations#validateNutritionRecommendationsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations#validateNutritionRecommendationsMoodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Mood Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations#validateNutritionRecommendationsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations#validateNutritionRecommendationsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations#validateNutritionRecommendationsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations#validateNutritionRecommendationsStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations#validateNutritionRecommendationsStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations#validateNutritionRecommendationsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NutritionRecommendationsOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected NutritionRecommendationsOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateNutritionRecommendationsTemplateId(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNutritionRecommendationsTemplateId(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_NUTRITION_RECOMMENDATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.130')";

	/**
	* The cached OCL invariant for the '{@link #validateNutritionRecommendationsTemplateId(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNutritionRecommendationsTemplateId(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_NUTRITION_RECOMMENDATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param nutritionRecommendations The receiving '<em><b>Nutrition Recommendations</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateNutritionRecommendationsTemplateId(NutritionRecommendations nutritionRecommendations,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUTRITION_RECOMMENDATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATIONS);
			try {
				VALIDATE_NUTRITION_RECOMMENDATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_RECOMMENDATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_RECOMMENDATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nutritionRecommendations)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NUTRITION_RECOMMENDATIONS__NUTRITION_RECOMMENDATIONS_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("NutritionRecommendationsTemplateId"),
					new Object[] { nutritionRecommendations }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateNutritionRecommendationsClassCode(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Class Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNutritionRecommendationsClassCode(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_NUTRITION_RECOMMENDATIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	* The cached OCL invariant for the '{@link #validateNutritionRecommendationsClassCode(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Class Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNutritionRecommendationsClassCode(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_NUTRITION_RECOMMENDATIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param nutritionRecommendations The receiving '<em><b>Nutrition Recommendations</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateNutritionRecommendationsClassCode(NutritionRecommendations nutritionRecommendations,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUTRITION_RECOMMENDATIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATIONS);
			try {
				VALIDATE_NUTRITION_RECOMMENDATIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_RECOMMENDATIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_RECOMMENDATIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nutritionRecommendations)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NUTRITION_RECOMMENDATIONS__NUTRITION_RECOMMENDATIONS_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("NutritionRecommendationsClassCode"),
					new Object[] { nutritionRecommendations }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateNutritionRecommendationsMoodCodeP(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Mood Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNutritionRecommendationsMoodCodeP(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_NUTRITION_RECOMMENDATIONS_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	* The cached OCL invariant for the '{@link #validateNutritionRecommendationsMoodCodeP(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Mood Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNutritionRecommendationsMoodCodeP(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_NUTRITION_RECOMMENDATIONS_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param nutritionRecommendations The receiving '<em><b>Nutrition Recommendations</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateNutritionRecommendationsMoodCodeP(NutritionRecommendations nutritionRecommendations,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUTRITION_RECOMMENDATIONS_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATIONS);
			try {
				VALIDATE_NUTRITION_RECOMMENDATIONS_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_RECOMMENDATIONS_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_RECOMMENDATIONS_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nutritionRecommendations)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NUTRITION_RECOMMENDATIONS__NUTRITION_RECOMMENDATIONS_MOOD_CODE_P,
					ConsolPlugin.INSTANCE.getString("NutritionRecommendationsMoodCodeP"),
					new Object[] { nutritionRecommendations }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendationsMoodCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendationsMoodCodeP", passToken);
				}
				passToken.add(nutritionRecommendations);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateNutritionRecommendationsMoodCode(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNutritionRecommendationsMoodCode(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_NUTRITION_RECOMMENDATIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_DocumentActMood) and "
			+ "let value : vocab::x_DocumentActMood = self.moodCode.oclAsType(vocab::x_DocumentActMood) in "
			+ "value = vocab::x_DocumentActMood::INT or value = vocab::x_DocumentActMood::ARQ or value = vocab::x_DocumentActMood::PRMS or value = vocab::x_DocumentActMood::PRP or value = vocab::x_DocumentActMood::RQO";

	/**
	* The cached OCL invariant for the '{@link #validateNutritionRecommendationsMoodCode(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNutritionRecommendationsMoodCode(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_NUTRITION_RECOMMENDATIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param nutritionRecommendations The receiving '<em><b>Nutrition Recommendations</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateNutritionRecommendationsMoodCode(NutritionRecommendations nutritionRecommendations,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendationsMoodCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(nutritionRecommendations)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_NUTRITION_RECOMMENDATIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATIONS);
			try {
				VALIDATE_NUTRITION_RECOMMENDATIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_RECOMMENDATIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_RECOMMENDATIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nutritionRecommendations)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NUTRITION_RECOMMENDATIONS__NUTRITION_RECOMMENDATIONS_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("NutritionRecommendationsMoodCode"),
					new Object[] { nutritionRecommendations }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateNutritionRecommendationsCodeP(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNutritionRecommendationsCodeP(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_NUTRITION_RECOMMENDATIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateNutritionRecommendationsCodeP(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNutritionRecommendationsCodeP(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_NUTRITION_RECOMMENDATIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param nutritionRecommendations The receiving '<em><b>Nutrition Recommendations</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateNutritionRecommendationsCodeP(NutritionRecommendations nutritionRecommendations,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUTRITION_RECOMMENDATIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATIONS);
			try {
				VALIDATE_NUTRITION_RECOMMENDATIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_RECOMMENDATIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_RECOMMENDATIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nutritionRecommendations)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NUTRITION_RECOMMENDATIONS__NUTRITION_RECOMMENDATIONS_CODE_P,
					ConsolPlugin.INSTANCE.getString("NutritionRecommendationsCodeP"),
					new Object[] { nutritionRecommendations }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendationsCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendationsCodeP", passToken);
				}
				passToken.add(nutritionRecommendations);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateNutritionRecommendationsCode(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNutritionRecommendationsCode(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_NUTRITION_RECOMMENDATIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '61310001' or value.code = '386373004' or value.code = '418995006' or value.code = '413315001' or value.code = '182922004' or value.code = '229912004' or value.code = '225372007' or value.code = '2897151011'))";

	/**
	* The cached OCL invariant for the '{@link #validateNutritionRecommendationsCode(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNutritionRecommendationsCode(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_NUTRITION_RECOMMENDATIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param nutritionRecommendations The receiving '<em><b>Nutrition Recommendations</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateNutritionRecommendationsCode(NutritionRecommendations nutritionRecommendations,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendationsCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(nutritionRecommendations)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_NUTRITION_RECOMMENDATIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATIONS);
			try {
				VALIDATE_NUTRITION_RECOMMENDATIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_RECOMMENDATIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_RECOMMENDATIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nutritionRecommendations)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NUTRITION_RECOMMENDATIONS__NUTRITION_RECOMMENDATIONS_CODE,
					ConsolPlugin.INSTANCE.getString("NutritionRecommendationsCode"),
					new Object[] { nutritionRecommendations }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateNutritionRecommendationsStatusCode(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Status Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNutritionRecommendationsStatusCode(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_NUTRITION_RECOMMENDATIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'active')";

	/**
	* The cached OCL invariant for the '{@link #validateNutritionRecommendationsStatusCode(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Status Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNutritionRecommendationsStatusCode(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_NUTRITION_RECOMMENDATIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param nutritionRecommendations The receiving '<em><b>Nutrition Recommendations</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateNutritionRecommendationsStatusCode(NutritionRecommendations nutritionRecommendations,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUTRITION_RECOMMENDATIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATIONS);
			try {
				VALIDATE_NUTRITION_RECOMMENDATIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_RECOMMENDATIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_RECOMMENDATIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nutritionRecommendations)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NUTRITION_RECOMMENDATIONS__NUTRITION_RECOMMENDATIONS_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("NutritionRecommendationsStatusCode"),
					new Object[] { nutritionRecommendations }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateNutritionRecommendationsStatusCodeP(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Status Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNutritionRecommendationsStatusCodeP(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_NUTRITION_RECOMMENDATIONS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateNutritionRecommendationsStatusCodeP(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Status Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNutritionRecommendationsStatusCodeP(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_NUTRITION_RECOMMENDATIONS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param nutritionRecommendations The receiving '<em><b>Nutrition Recommendations</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateNutritionRecommendationsStatusCodeP(
			NutritionRecommendations nutritionRecommendations, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUTRITION_RECOMMENDATIONS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATIONS);
			try {
				VALIDATE_NUTRITION_RECOMMENDATIONS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_RECOMMENDATIONS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_RECOMMENDATIONS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nutritionRecommendations)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NUTRITION_RECOMMENDATIONS__NUTRITION_RECOMMENDATIONS_STATUS_CODE_P,
					ConsolPlugin.INSTANCE.getString("NutritionRecommendationsStatusCodeP"),
					new Object[] { nutritionRecommendations }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateNutritionRecommendationsEffectiveTime(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Effective Time</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNutritionRecommendationsEffectiveTime(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_NUTRITION_RECOMMENDATIONS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateNutritionRecommendationsEffectiveTime(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Effective Time</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNutritionRecommendationsEffectiveTime(NutritionRecommendations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_NUTRITION_RECOMMENDATIONS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param nutritionRecommendations The receiving '<em><b>Nutrition Recommendations</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateNutritionRecommendationsEffectiveTime(
			NutritionRecommendations nutritionRecommendations, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NUTRITION_RECOMMENDATIONS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATIONS);
			try {
				VALIDATE_NUTRITION_RECOMMENDATIONS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_RECOMMENDATIONS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_RECOMMENDATIONS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nutritionRecommendations)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NUTRITION_RECOMMENDATIONS__NUTRITION_RECOMMENDATIONS_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("NutritionRecommendationsEffectiveTime"),
					new Object[] { nutritionRecommendations }));
			}

			return false;
		}
		return true;
	}

} // NutritionRecommendationsOperations
