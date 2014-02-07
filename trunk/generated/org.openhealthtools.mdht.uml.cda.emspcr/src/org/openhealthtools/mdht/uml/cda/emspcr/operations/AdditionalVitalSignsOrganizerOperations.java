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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucose;
import org.openhealthtools.mdht.uml.cda.emspcr.CarbonDioxide;
import org.openhealthtools.mdht.uml.cda.emspcr.CarbonMonoxide;
import org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsiveness;
import org.openhealthtools.mdht.uml.cda.emspcr.PainScore;
import org.openhealthtools.mdht.uml.cda.emspcr.StrokeScore;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.OrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Additional Vital Signs Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerStrokeScoreComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Stroke Score Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerPainScoreComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Pain Score Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerLevelOfResponsivenessComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Level Of Responsiveness Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerBloodGlucoseComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Blood Glucose Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerCarbonMonoxideComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Carbon Monoxide Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerCarbonDioxideComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Carbon Dioxide Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerCardiacRhythmComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Cardiac Rhythm Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerGlasgowComaScoreOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Glasgow Coma Score Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#getStrokeScoreComponent() <em>Get Stroke Score Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#getPainScoreComponent() <em>Get Pain Score Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#getLevelOfResponsivenessComponent() <em>Get Level Of Responsiveness Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#getBloodGlucoseComponent() <em>Get Blood Glucose Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#getCarbonMonoxideComponent() <em>Get Carbon Monoxide Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#getCarbonDioxideComponent() <em>Get Carbon Dioxide Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#getCardiacRhythmComponent() <em>Get Cardiac Rhythm Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#getGlasgowComaScoreOrganizers() <em>Get Glasgow Coma Score Organizers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdditionalVitalSignsOrganizerOperations extends OrganizerOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionalVitalSignsOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdditionalVitalSignsOrganizerStrokeScoreComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Stroke Score Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerStrokeScoreComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_STROKE_SCORE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::StrokeScore))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdditionalVitalSignsOrganizerStrokeScoreComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Stroke Score Component</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerStrokeScoreComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_STROKE_SCORE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param additionalVitalSignsOrganizer The receiving '<em><b>Additional Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdditionalVitalSignsOrganizerStrokeScoreComponent(
			AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_STROKE_SCORE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_STROKE_SCORE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_STROKE_SCORE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_STROKE_SCORE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			additionalVitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.ADDITIONAL_VITAL_SIGNS_ORGANIZER__ADDITIONAL_VITAL_SIGNS_ORGANIZER_STROKE_SCORE_COMPONENT,
					EmspcrPlugin.INSTANCE.getString("AdditionalVitalSignsOrganizerStrokeScoreComponent"),
					new Object[] { additionalVitalSignsOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdditionalVitalSignsOrganizerPainScoreComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Pain Score Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerPainScoreComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_PAIN_SCORE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::PainScore))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdditionalVitalSignsOrganizerPainScoreComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Pain Score Component</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerPainScoreComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_PAIN_SCORE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param additionalVitalSignsOrganizer The receiving '<em><b>Additional Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdditionalVitalSignsOrganizerPainScoreComponent(
			AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_PAIN_SCORE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_PAIN_SCORE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_PAIN_SCORE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_PAIN_SCORE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			additionalVitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.ADDITIONAL_VITAL_SIGNS_ORGANIZER__ADDITIONAL_VITAL_SIGNS_ORGANIZER_PAIN_SCORE_COMPONENT,
					EmspcrPlugin.INSTANCE.getString("AdditionalVitalSignsOrganizerPainScoreComponent"),
					new Object[] { additionalVitalSignsOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdditionalVitalSignsOrganizerLevelOfResponsivenessComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Level Of Responsiveness Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerLevelOfResponsivenessComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_LEVEL_OF_RESPONSIVENESS_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::LevelOfResponsiveness))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdditionalVitalSignsOrganizerLevelOfResponsivenessComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Level Of Responsiveness Component</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerLevelOfResponsivenessComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_LEVEL_OF_RESPONSIVENESS_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param additionalVitalSignsOrganizer The receiving '<em><b>Additional Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdditionalVitalSignsOrganizerLevelOfResponsivenessComponent(
			AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_LEVEL_OF_RESPONSIVENESS_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_LEVEL_OF_RESPONSIVENESS_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_LEVEL_OF_RESPONSIVENESS_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_LEVEL_OF_RESPONSIVENESS_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			additionalVitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.ADDITIONAL_VITAL_SIGNS_ORGANIZER__ADDITIONAL_VITAL_SIGNS_ORGANIZER_LEVEL_OF_RESPONSIVENESS_COMPONENT,
					EmspcrPlugin.INSTANCE.getString("AdditionalVitalSignsOrganizerLevelOfResponsivenessComponent"),
					new Object[] { additionalVitalSignsOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdditionalVitalSignsOrganizerBloodGlucoseComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Blood Glucose Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerBloodGlucoseComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_BLOOD_GLUCOSE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::BloodGlucose))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdditionalVitalSignsOrganizerBloodGlucoseComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Blood Glucose Component</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerBloodGlucoseComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_BLOOD_GLUCOSE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param additionalVitalSignsOrganizer The receiving '<em><b>Additional Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdditionalVitalSignsOrganizerBloodGlucoseComponent(
			AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_BLOOD_GLUCOSE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_BLOOD_GLUCOSE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_BLOOD_GLUCOSE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_BLOOD_GLUCOSE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			additionalVitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.ADDITIONAL_VITAL_SIGNS_ORGANIZER__ADDITIONAL_VITAL_SIGNS_ORGANIZER_BLOOD_GLUCOSE_COMPONENT,
					EmspcrPlugin.INSTANCE.getString("AdditionalVitalSignsOrganizerBloodGlucoseComponent"),
					new Object[] { additionalVitalSignsOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdditionalVitalSignsOrganizerCarbonMonoxideComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Carbon Monoxide Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerCarbonMonoxideComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_CARBON_MONOXIDE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::CarbonMonoxide))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdditionalVitalSignsOrganizerCarbonMonoxideComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Carbon Monoxide Component</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerCarbonMonoxideComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_CARBON_MONOXIDE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param additionalVitalSignsOrganizer The receiving '<em><b>Additional Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdditionalVitalSignsOrganizerCarbonMonoxideComponent(
			AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_CARBON_MONOXIDE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_CARBON_MONOXIDE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_CARBON_MONOXIDE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_CARBON_MONOXIDE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			additionalVitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.ADDITIONAL_VITAL_SIGNS_ORGANIZER__ADDITIONAL_VITAL_SIGNS_ORGANIZER_CARBON_MONOXIDE_COMPONENT,
					EmspcrPlugin.INSTANCE.getString("AdditionalVitalSignsOrganizerCarbonMonoxideComponent"),
					new Object[] { additionalVitalSignsOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdditionalVitalSignsOrganizerCarbonDioxideComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Carbon Dioxide Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerCarbonDioxideComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_CARBON_DIOXIDE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::CarbonDioxide))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdditionalVitalSignsOrganizerCarbonDioxideComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Carbon Dioxide Component</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerCarbonDioxideComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_CARBON_DIOXIDE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param additionalVitalSignsOrganizer The receiving '<em><b>Additional Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdditionalVitalSignsOrganizerCarbonDioxideComponent(
			AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_CARBON_DIOXIDE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_CARBON_DIOXIDE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_CARBON_DIOXIDE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_CARBON_DIOXIDE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			additionalVitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.ADDITIONAL_VITAL_SIGNS_ORGANIZER__ADDITIONAL_VITAL_SIGNS_ORGANIZER_CARBON_DIOXIDE_COMPONENT,
					EmspcrPlugin.INSTANCE.getString("AdditionalVitalSignsOrganizerCarbonDioxideComponent"),
					new Object[] { additionalVitalSignsOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdditionalVitalSignsOrganizerCardiacRhythmComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Cardiac Rhythm Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerCardiacRhythmComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_CARDIAC_RHYTHM_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::CardiacRhythm))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdditionalVitalSignsOrganizerCardiacRhythmComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Cardiac Rhythm Component</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerCardiacRhythmComponent(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_CARDIAC_RHYTHM_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param additionalVitalSignsOrganizer The receiving '<em><b>Additional Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdditionalVitalSignsOrganizerCardiacRhythmComponent(
			AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_CARDIAC_RHYTHM_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_CARDIAC_RHYTHM_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_CARDIAC_RHYTHM_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_CARDIAC_RHYTHM_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			additionalVitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.ADDITIONAL_VITAL_SIGNS_ORGANIZER__ADDITIONAL_VITAL_SIGNS_ORGANIZER_CARDIAC_RHYTHM_COMPONENT,
					EmspcrPlugin.INSTANCE.getString("AdditionalVitalSignsOrganizerCardiacRhythmComponent"),
					new Object[] { additionalVitalSignsOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdditionalVitalSignsOrganizerTemplateId(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerTemplateId(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.30')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdditionalVitalSignsOrganizerTemplateId(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerTemplateId(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param additionalVitalSignsOrganizer The receiving '<em><b>Additional Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdditionalVitalSignsOrganizerTemplateId(
			AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			additionalVitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.ADDITIONAL_VITAL_SIGNS_ORGANIZER__ADDITIONAL_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("AdditionalVitalSignsOrganizerTemplateId"),
					new Object[] { additionalVitalSignsOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdditionalVitalSignsOrganizerMoodCode(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerMoodCode(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdditionalVitalSignsOrganizerMoodCode(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerMoodCode(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param additionalVitalSignsOrganizer The receiving '<em><b>Additional Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdditionalVitalSignsOrganizerMoodCode(
			AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			additionalVitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.ADDITIONAL_VITAL_SIGNS_ORGANIZER__ADDITIONAL_VITAL_SIGNS_ORGANIZER_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("AdditionalVitalSignsOrganizerMoodCode"),
					new Object[] { additionalVitalSignsOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdditionalVitalSignsOrganizerEffectiveTime(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerEffectiveTime(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdditionalVitalSignsOrganizerEffectiveTime(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerEffectiveTime(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param additionalVitalSignsOrganizer The receiving '<em><b>Additional Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdditionalVitalSignsOrganizerEffectiveTime(
			AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			additionalVitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.ADDITIONAL_VITAL_SIGNS_ORGANIZER__ADDITIONAL_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME,
					EmspcrPlugin.INSTANCE.getString("AdditionalVitalSignsOrganizerEffectiveTime"),
					new Object[] { additionalVitalSignsOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdditionalVitalSignsOrganizerGlasgowComaScoreOrganizer(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Glasgow Coma Score Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerGlasgowComaScoreOrganizer(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_GLASGOW_COMA_SCORE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.organizer.oclIsUndefined() and component.organizer.oclIsKindOf(emspcr::GlasgowComaScoreOrganizer))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdditionalVitalSignsOrganizerGlasgowComaScoreOrganizer(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Glasgow Coma Score Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerGlasgowComaScoreOrganizer(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_GLASGOW_COMA_SCORE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param additionalVitalSignsOrganizer The receiving '<em><b>Additional Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdditionalVitalSignsOrganizerGlasgowComaScoreOrganizer(
			AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_GLASGOW_COMA_SCORE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_GLASGOW_COMA_SCORE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_GLASGOW_COMA_SCORE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_GLASGOW_COMA_SCORE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			additionalVitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.ADDITIONAL_VITAL_SIGNS_ORGANIZER__ADDITIONAL_VITAL_SIGNS_ORGANIZER_GLASGOW_COMA_SCORE_ORGANIZER,
					EmspcrPlugin.INSTANCE.getString("AdditionalVitalSignsOrganizerGlasgowComaScoreOrganizer"),
					new Object[] { additionalVitalSignsOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getStrokeScoreComponent(AdditionalVitalSignsOrganizer) <em>Get Stroke Score Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeScoreComponent(AdditionalVitalSignsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STROKE_SCORE_COMPONENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::StrokeScore))->asSequence()->any(true).oclAsType(emspcr::StrokeScore)";

	/**
	 * The cached OCL query for the '{@link #getStrokeScoreComponent(AdditionalVitalSignsOrganizer) <em>Get Stroke Score Component</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeScoreComponent(AdditionalVitalSignsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STROKE_SCORE_COMPONENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static StrokeScore getStrokeScoreComponent(AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer) {
		if (GET_STROKE_SCORE_COMPONENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER,
				EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER.getEAllOperations().get(63));
			try {
				GET_STROKE_SCORE_COMPONENT__EOCL_QRY = helper.createQuery(GET_STROKE_SCORE_COMPONENT__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STROKE_SCORE_COMPONENT__EOCL_QRY);
		return (StrokeScore) query.evaluate(additionalVitalSignsOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPainScoreComponent(AdditionalVitalSignsOrganizer) <em>Get Pain Score Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPainScoreComponent(AdditionalVitalSignsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PAIN_SCORE_COMPONENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PainScore))->asSequence()->any(true).oclAsType(emspcr::PainScore)";

	/**
	 * The cached OCL query for the '{@link #getPainScoreComponent(AdditionalVitalSignsOrganizer) <em>Get Pain Score Component</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPainScoreComponent(AdditionalVitalSignsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PAIN_SCORE_COMPONENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PainScore getPainScoreComponent(AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer) {
		if (GET_PAIN_SCORE_COMPONENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER,
				EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER.getEAllOperations().get(64));
			try {
				GET_PAIN_SCORE_COMPONENT__EOCL_QRY = helper.createQuery(GET_PAIN_SCORE_COMPONENT__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PAIN_SCORE_COMPONENT__EOCL_QRY);
		return (PainScore) query.evaluate(additionalVitalSignsOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getLevelOfResponsivenessComponent(AdditionalVitalSignsOrganizer) <em>Get Level Of Responsiveness Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOfResponsivenessComponent(AdditionalVitalSignsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_LEVEL_OF_RESPONSIVENESS_COMPONENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::LevelOfResponsiveness))->asSequence()->any(true).oclAsType(emspcr::LevelOfResponsiveness)";

	/**
	 * The cached OCL query for the '{@link #getLevelOfResponsivenessComponent(AdditionalVitalSignsOrganizer) <em>Get Level Of Responsiveness Component</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOfResponsivenessComponent(AdditionalVitalSignsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_LEVEL_OF_RESPONSIVENESS_COMPONENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static LevelOfResponsiveness getLevelOfResponsivenessComponent(
			AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer) {
		if (GET_LEVEL_OF_RESPONSIVENESS_COMPONENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER,
				EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER.getEAllOperations().get(65));
			try {
				GET_LEVEL_OF_RESPONSIVENESS_COMPONENT__EOCL_QRY = helper.createQuery(GET_LEVEL_OF_RESPONSIVENESS_COMPONENT__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_LEVEL_OF_RESPONSIVENESS_COMPONENT__EOCL_QRY);
		return (LevelOfResponsiveness) query.evaluate(additionalVitalSignsOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getBloodGlucoseComponent(AdditionalVitalSignsOrganizer) <em>Get Blood Glucose Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloodGlucoseComponent(AdditionalVitalSignsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BLOOD_GLUCOSE_COMPONENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::BloodGlucose))->asSequence()->any(true).oclAsType(emspcr::BloodGlucose)";

	/**
	 * The cached OCL query for the '{@link #getBloodGlucoseComponent(AdditionalVitalSignsOrganizer) <em>Get Blood Glucose Component</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloodGlucoseComponent(AdditionalVitalSignsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BLOOD_GLUCOSE_COMPONENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static BloodGlucose getBloodGlucoseComponent(AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer) {
		if (GET_BLOOD_GLUCOSE_COMPONENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER,
				EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER.getEAllOperations().get(66));
			try {
				GET_BLOOD_GLUCOSE_COMPONENT__EOCL_QRY = helper.createQuery(GET_BLOOD_GLUCOSE_COMPONENT__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_BLOOD_GLUCOSE_COMPONENT__EOCL_QRY);
		return (BloodGlucose) query.evaluate(additionalVitalSignsOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCarbonMonoxideComponent(AdditionalVitalSignsOrganizer) <em>Get Carbon Monoxide Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarbonMonoxideComponent(AdditionalVitalSignsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CARBON_MONOXIDE_COMPONENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::CarbonMonoxide))->asSequence()->any(true).oclAsType(emspcr::CarbonMonoxide)";

	/**
	 * The cached OCL query for the '{@link #getCarbonMonoxideComponent(AdditionalVitalSignsOrganizer) <em>Get Carbon Monoxide Component</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarbonMonoxideComponent(AdditionalVitalSignsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CARBON_MONOXIDE_COMPONENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static CarbonMonoxide getCarbonMonoxideComponent(AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer) {
		if (GET_CARBON_MONOXIDE_COMPONENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER,
				EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER.getEAllOperations().get(67));
			try {
				GET_CARBON_MONOXIDE_COMPONENT__EOCL_QRY = helper.createQuery(GET_CARBON_MONOXIDE_COMPONENT__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CARBON_MONOXIDE_COMPONENT__EOCL_QRY);
		return (CarbonMonoxide) query.evaluate(additionalVitalSignsOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCarbonDioxideComponent(AdditionalVitalSignsOrganizer) <em>Get Carbon Dioxide Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarbonDioxideComponent(AdditionalVitalSignsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CARBON_DIOXIDE_COMPONENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::CarbonDioxide))->asSequence()->any(true).oclAsType(emspcr::CarbonDioxide)";

	/**
	 * The cached OCL query for the '{@link #getCarbonDioxideComponent(AdditionalVitalSignsOrganizer) <em>Get Carbon Dioxide Component</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarbonDioxideComponent(AdditionalVitalSignsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CARBON_DIOXIDE_COMPONENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static CarbonDioxide getCarbonDioxideComponent(AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer) {
		if (GET_CARBON_DIOXIDE_COMPONENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER,
				EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER.getEAllOperations().get(68));
			try {
				GET_CARBON_DIOXIDE_COMPONENT__EOCL_QRY = helper.createQuery(GET_CARBON_DIOXIDE_COMPONENT__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CARBON_DIOXIDE_COMPONENT__EOCL_QRY);
		return (CarbonDioxide) query.evaluate(additionalVitalSignsOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCardiacRhythmComponent(AdditionalVitalSignsOrganizer) <em>Get Cardiac Rhythm Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardiacRhythmComponent(AdditionalVitalSignsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CARDIAC_RHYTHM_COMPONENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::CardiacRhythm))->asSequence()->any(true).oclAsType(emspcr::CardiacRhythm)";

	/**
	 * The cached OCL query for the '{@link #getCardiacRhythmComponent(AdditionalVitalSignsOrganizer) <em>Get Cardiac Rhythm Component</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardiacRhythmComponent(AdditionalVitalSignsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CARDIAC_RHYTHM_COMPONENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static CardiacRhythm getCardiacRhythmComponent(AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer) {
		if (GET_CARDIAC_RHYTHM_COMPONENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER,
				EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER.getEAllOperations().get(69));
			try {
				GET_CARDIAC_RHYTHM_COMPONENT__EOCL_QRY = helper.createQuery(GET_CARDIAC_RHYTHM_COMPONENT__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CARDIAC_RHYTHM_COMPONENT__EOCL_QRY);
		return (CardiacRhythm) query.evaluate(additionalVitalSignsOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getGlasgowComaScoreOrganizers(AdditionalVitalSignsOrganizer) <em>Get Glasgow Coma Score Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlasgowComaScoreOrganizers(AdditionalVitalSignsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GLASGOW_COMA_SCORE_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(emspcr::GlasgowComaScoreOrganizer)).oclAsType(emspcr::GlasgowComaScoreOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getGlasgowComaScoreOrganizers(AdditionalVitalSignsOrganizer) <em>Get Glasgow Coma Score Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlasgowComaScoreOrganizers(AdditionalVitalSignsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GLASGOW_COMA_SCORE_ORGANIZERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<GlasgowComaScoreOrganizer> getGlasgowComaScoreOrganizers(
			AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer) {
		if (GET_GLASGOW_COMA_SCORE_ORGANIZERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER,
				EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER.getEAllOperations().get(70));
			try {
				GET_GLASGOW_COMA_SCORE_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_GLASGOW_COMA_SCORE_ORGANIZERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GLASGOW_COMA_SCORE_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<GlasgowComaScoreOrganizer> result = (Collection<GlasgowComaScoreOrganizer>) query.evaluate(additionalVitalSignsOrganizer);
		return new BasicEList.UnmodifiableEList<GlasgowComaScoreOrganizer>(result.size(), result.toArray());
	}

} // AdditionalVitalSignsOrganizerOperations
