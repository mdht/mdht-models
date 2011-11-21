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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity;
import org.openhealthtools.mdht.uml.cda.consol.AllergyIntolerance;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.EpisodeObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Drug Sensitivity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityEntryRelationshipRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Entry Relationship Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivitySubjectOfTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Subject Of Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityContainsProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Contains Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityContainsAlertObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Contains Alert Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityContainsPatientAwareness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Contains Patient Awareness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityEffectiveTimeLowHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Effective Time Low High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityHasRelatedObservations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Has Related Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityRelatedObservationsTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Related Observations Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityHasRelatedReferencesTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Has Related References Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityAdverseEventDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Adverse Event Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityAdverseEventType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Adverse Event Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityAdverseEventTypeVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Adverse Event Type Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityAllergyProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityAllergyProductTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityProductDetailParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityProductDetailPlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Playing Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityProductDetailName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityProductCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityAllergyProductFoodVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Food Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityAllergyProductMedClassVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Med Class Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityAllergyProductSpecificMedVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Specific Med Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityReactionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Reaction Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityReactionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Reaction Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityReactionCodeVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Reaction Code Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivitySeverityText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Severity Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivitySeverityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Severity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivitySeverityCodeVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Severity Code Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityCodeNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Code Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityEpisodeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Episode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#validateAllergyDrugSensitivityAllergyIntolerance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Intolerance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#getEpisodeObservation() <em>Get Episode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity#getAllergyIntolerances() <em>Get Allergy Intolerances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergyDrugSensitivityOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyDrugSensitivityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityEntryRelationshipRequired(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Entry Relationship Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityEntryRelationshipRequired(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entryRelationship->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityEntryRelationshipRequired(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Entry Relationship Required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityEntryRelationshipRequired(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entryRelationship->isEmpty()
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityEntryRelationshipRequired(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ENTRY_RELATIONSHIP_REQUIRED,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityEntryRelationshipRequired"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivitySubjectOfTarget(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Subject Of Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivitySubjectOfTarget(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::SUBJ, cda::ClinicalStatement)->forAll(target : cda::ClinicalStatement | not target.oclIsUndefined() and "+
"  (target.oclIsKindOf(ccd::ProblemObservation) or target.oclIsKindOf(ccd::AlertObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivitySubjectOfTarget(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Subject Of Target</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivitySubjectOfTarget(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::SUBJ, cda::ClinicalStatement)->forAll(target : cda::ClinicalStatement | not target.oclIsUndefined() and 
	 *   (target.oclIsKindOf(ccd::ProblemObservation) or target.oclIsKindOf(ccd::AlertObservation)))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivitySubjectOfTarget(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_SUBJECT_OF_TARGET,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivitySubjectOfTarget"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityContainsProblemObservation(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Contains Problem Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityContainsProblemObservation(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSection().oclIsKindOf(ccd::ProblemSection) implies self.getObservations()"+
"   ->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::ProblemObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityContainsProblemObservation(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Contains Problem Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityContainsProblemObservation(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection().oclIsKindOf(ccd::ProblemSection) implies self.getObservations()
	 *    ->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::ProblemObservation))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityContainsProblemObservation(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_CONTAINS_PROBLEM_OBSERVATION,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityContainsProblemObservation"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityContainsAlertObservation(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Contains Alert Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityContainsAlertObservation(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSection().oclIsKindOf(ccd::AlertsSection) implies self.getObservations()"+
"   ->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityContainsAlertObservation(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Contains Alert Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityContainsAlertObservation(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection().oclIsKindOf(ccd::AlertsSection) implies self.getObservations()
	 *    ->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityContainsAlertObservation(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_CONTAINS_ALERT_OBSERVATION,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityContainsAlertObservation"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityContainsPatientAwareness(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Contains Patient Awareness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityContainsPatientAwareness(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(partic : cda::Participant2 | partic.oclIsKindOf(ccd::PatientAwareness))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityContainsPatientAwareness(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Contains Patient Awareness</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityContainsPatientAwareness(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(partic : cda::Participant2 | partic.oclIsKindOf(ccd::PatientAwareness))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityContainsPatientAwareness(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_CONTAINS_PATIENT_AWARENESS,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityContainsPatientAwareness"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityEffectiveTimeLowHigh(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Effective Time Low High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityEffectiveTimeLowHigh(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.low.oclIsUndefined()"+
"   and ((self.statusCode.code = 'completed' or self.statusCode.code = 'aborted') implies not self.effectiveTime.high.oclIsUndefined())"+
"   and ((self.statusCode.code <> 'completed' and self.statusCode.code <> 'aborted') implies self.effectiveTime.high.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityEffectiveTimeLowHigh(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Effective Time Low High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityEffectiveTimeLowHigh(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.low.oclIsUndefined()
	 *    and ((self.statusCode.code = 'completed' or self.statusCode.code = 'aborted') implies not self.effectiveTime.high.oclIsUndefined())
	 *    and ((self.statusCode.code <> 'completed' and self.statusCode.code <> 'aborted') implies self.effectiveTime.high.oclIsUndefined())
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityEffectiveTimeLowHigh(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_EFFECTIVE_TIME_LOW_HIGH,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityEffectiveTimeLowHigh"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityHasRelatedObservations(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Has Related Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityHasRelatedObservations(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_HAS_RELATED_OBSERVATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship.observation.templateId->exists(id : datatypes::II | id.root =  '1.3.6.1.4.1.19376.1.5.3.1.4.5') or self.entryRelationship.observation.templateId->exists(id : datatypes::II | id.root =  '1.3.6.1.4.1.19376.1.5.3.1.4.6')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityHasRelatedObservations(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Has Related Observations</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityHasRelatedObservations(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_HAS_RELATED_OBSERVATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.observation.templateId->exists(id : datatypes::II | id.root =  '1.3.6.1.4.1.19376.1.5.3.1.4.5') or self.entryRelationship.observation.templateId->exists(id : datatypes::II | id.root =  '1.3.6.1.4.1.19376.1.5.3.1.4.6')
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityHasRelatedObservations(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_HAS_RELATED_OBSERVATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_HAS_RELATED_OBSERVATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_HAS_RELATED_OBSERVATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_HAS_RELATED_OBSERVATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_HAS_RELATED_OBSERVATIONS,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityHasRelatedObservations"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityRelatedObservationsTypeCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Related Observations Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityRelatedObservationsTypeCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_RELATED_OBSERVATIONS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er|er.typeCode <> vocab::x_ActRelationshipEntryRelationship::SUBJ)->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityRelatedObservationsTypeCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Related Observations Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityRelatedObservationsTypeCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_RELATED_OBSERVATIONS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->select(er|er.typeCode <> vocab::x_ActRelationshipEntryRelationship::SUBJ)->isEmpty()
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityRelatedObservationsTypeCode(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_RELATED_OBSERVATIONS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_RELATED_OBSERVATIONS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_RELATED_OBSERVATIONS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_RELATED_OBSERVATIONS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_RELATED_OBSERVATIONS_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityRelatedObservationsTypeCode"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityHasRelatedReferencesTypeCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Has Related References Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityHasRelatedReferencesTypeCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_HAS_RELATED_REFERENCES_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->forAll(r | r.typeCode = vocab::x_ActRelationshipExternalReference)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityHasRelatedReferencesTypeCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Has Related References Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityHasRelatedReferencesTypeCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_HAS_RELATED_REFERENCES_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.reference->forAll(r | r.typeCode = vocab::x_ActRelationshipExternalReference)
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityHasRelatedReferencesTypeCode(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_HAS_RELATED_REFERENCES_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_HAS_RELATED_REFERENCES_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_HAS_RELATED_REFERENCES_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_HAS_RELATED_REFERENCES_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_HAS_RELATED_REFERENCES_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityHasRelatedReferencesTypeCode"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityAdverseEventDate(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Adverse Event Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAdverseEventDate(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERSE_EVENT_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation |  not obs.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityAdverseEventDate(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Adverse Event Date</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAdverseEventDate(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERSE_EVENT_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  not obs.effectiveTime.oclIsUndefined())
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityAdverseEventDate(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERSE_EVENT_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERSE_EVENT_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERSE_EVENT_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERSE_EVENT_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ADVERSE_EVENT_DATE,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityAdverseEventDate"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityAdverseEventType(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Adverse Event Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAdverseEventType(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERSE_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation |  not obs.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityAdverseEventType(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Adverse Event Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAdverseEventType(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERSE_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  not obs.code.oclIsUndefined())
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityAdverseEventType(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERSE_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERSE_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERSE_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERSE_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ADVERSE_EVENT_TYPE,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityAdverseEventType"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityAdverseEventTypeVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Adverse Event Type Vocab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAdverseEventTypeVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERSE_EVENT_TYPE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation |  not obs.code.oclIsUndefined() and obs.code.codeSystem = '2.16.840.1.113883.6.96' and (obs.code.code = '420134006' or obs.code.code ='418038007' or obs.code.code='419511003' or obs.code.code='418471000' or obs.code.code='419199007' or obs.code.code='416098002' or obs.code.code='414285001' or obs.code.code='59037007' or obs.code.code='235719002'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityAdverseEventTypeVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Adverse Event Type Vocab</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAdverseEventTypeVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERSE_EVENT_TYPE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  not obs.code.oclIsUndefined() and obs.code.codeSystem = '2.16.840.1.113883.6.96' and (obs.code.code = '420134006' or obs.code.code ='418038007' or obs.code.code='419511003' or obs.code.code='418471000' or obs.code.code='419199007' or obs.code.code='416098002' or obs.code.code='414285001' or obs.code.code='59037007' or obs.code.code='235719002'))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityAdverseEventTypeVocab(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERSE_EVENT_TYPE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERSE_EVENT_TYPE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERSE_EVENT_TYPE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERSE_EVENT_TYPE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ADVERSE_EVENT_TYPE_VOCAB,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityAdverseEventTypeVocab"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityAllergyProduct(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAllergyProduct(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation |  "+
"obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityAllergyProduct(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAllergyProduct(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined()))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityAllergyProduct(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityAllergyProduct"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityAllergyProductTypeCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAllergyProductTypeCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation |  "+
"obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies par.typeCode = vocab::ParticipationType::CSM))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityAllergyProductTypeCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAllergyProductTypeCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies par.typeCode = vocab::ParticipationType::CSM))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityAllergyProductTypeCode(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityAllergyProductTypeCode"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityProductDetailParticipantRole(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Participant Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityProductDetailParticipantRole(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation |  "+
"obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined()))))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityProductDetailParticipantRole(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Participant Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityProductDetailParticipantRole(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined()))))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityProductDetailParticipantRole(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityProductDetailParticipantRole"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Participant Role Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation |  "+
"obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and "+
"prole.classCode=vocab::RoleClassRoot::MANU))))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Participant Role Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode=vocab::RoleClassRoot::MANU))))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityProductDetailParticipantRoleClassCode"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityProductDetailPlayingEntity(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Playing Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityProductDetailPlayingEntity(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation |  "+
"obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode =vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and "+
"prole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined())))))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityProductDetailPlayingEntity(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Playing Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityProductDetailPlayingEntity(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode =vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined())))))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityProductDetailPlayingEntity(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityProductDetailPlayingEntity"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Playing Entity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation |  "+
"obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode =vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and "+
"prole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode =vocab::EntityClassRoot::MMAT )))))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Playing Entity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode =vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode =vocab::EntityClassRoot::MMAT )))))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityProductDetailPlayingEntityClassCode"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityProductDetailName(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityProductDetailName(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation |  "+
"obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and "+
"prole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.name->size() = 1)))))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityProductDetailName(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityProductDetailName(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.name->size() = 1)))))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityProductDetailName(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_NAME,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityProductDetailName"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityProductCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityProductCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation |  "+
"obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and "+
"prole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1)))))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityProductCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityProductCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1)))))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityProductCode(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_PRODUCT_CODE,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityProductCode"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityAllergyProductFoodVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Food Vocab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAllergyProductFoodVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_FOOD_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation |  "+
"obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and "+
"prole.classCode= vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1 and (playe.code.codeSystem ="+
"'2.16.840.1.113883.4.9' or playe.code.codeSystem = '2.16.840.1.113883.3.26.1.5' or playe.code.codeSystem = '2.16.840.1.113883.6.88'))))))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityAllergyProductFoodVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Food Vocab</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAllergyProductFoodVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_FOOD_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode= vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1 and (playe.code.codeSystem =
	 * '2.16.840.1.113883.4.9' or playe.code.codeSystem = '2.16.840.1.113883.3.26.1.5' or playe.code.codeSystem = '2.16.840.1.113883.6.88'))))))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityAllergyProductFoodVocab(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_FOOD_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_FOOD_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_FOOD_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_FOOD_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_FOOD_VOCAB,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityAllergyProductFoodVocab"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityAllergyProductMedClassVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Med Class Vocab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAllergyProductMedClassVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_MED_CLASS_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation |  "+
"obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and "+
"prole.classCode= vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1 and (playe.code.codeSystem ="+
"'2.16.840.1.113883.4.9' or playe.code.codeSystem = '2.16.840.1.113883.3.26.1.5' or playe.code.codeSystem = '2.16.840.1.113883.6.88'))))))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityAllergyProductMedClassVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Med Class Vocab</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAllergyProductMedClassVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_MED_CLASS_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode= vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1 and (playe.code.codeSystem =
	 * '2.16.840.1.113883.4.9' or playe.code.codeSystem = '2.16.840.1.113883.3.26.1.5' or playe.code.codeSystem = '2.16.840.1.113883.6.88'))))))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityAllergyProductMedClassVocab(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_MED_CLASS_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_MED_CLASS_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_MED_CLASS_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_MED_CLASS_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_MED_CLASS_VOCAB,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityAllergyProductMedClassVocab"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityAllergyProductSpecificMedVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Specific Med Vocab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAllergyProductSpecificMedVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_SPECIFIC_MED_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation |  "+
"obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and "+
"prole.classCode= vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1 and (playe.code.codeSystem ="+
"'2.16.840.1.113883.4.9' or playe.code.codeSystem = '2.16.840.1.113883.3.26.1.5' or playe.code.codeSystem = '2.16.840.1.113883.6.88'))))))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityAllergyProductSpecificMedVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Specific Med Vocab</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAllergyProductSpecificMedVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_SPECIFIC_MED_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation |  
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode= vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1 and (playe.code.codeSystem =
	 * '2.16.840.1.113883.4.9' or playe.code.codeSystem = '2.16.840.1.113883.3.26.1.5' or playe.code.codeSystem = '2.16.840.1.113883.6.88'))))))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityAllergyProductSpecificMedVocab(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_SPECIFIC_MED_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_SPECIFIC_MED_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_SPECIFIC_MED_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_SPECIFIC_MED_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_SPECIFIC_MED_VOCAB,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityAllergyProductSpecificMedVocab"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityReactionText(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Reaction Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityReactionText(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->forAll(obs | obs.getObservations()->forAll( ro | (not ro.oclIsKindOf(ccd::ReactionObservation)) or  (ro.oclIsKindOf(ccd::ReactionObservation) and  not ro.text.oclIsUndefined()) )  )";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityReactionText(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Reaction Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityReactionText(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->forAll(obs | obs.getObservations()->forAll( ro | (not ro.oclIsKindOf(ccd::ReactionObservation)) or  (ro.oclIsKindOf(ccd::ReactionObservation) and  not ro.text.oclIsUndefined()) )  )
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityReactionText(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_REACTION_TEXT,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityReactionText"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityReactionCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Reaction Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityReactionCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->forAll(obs | obs.getObservations()->forAll( ro | (not ro.oclIsKindOf(ccd::ReactionObservation)) or  (ro.oclIsKindOf(ccd::ReactionObservation) and  not ro.code.oclIsUndefined()) )  )";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityReactionCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Reaction Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityReactionCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->forAll(obs | obs.getObservations()->forAll( ro | (not ro.oclIsKindOf(ccd::ReactionObservation)) or  (ro.oclIsKindOf(ccd::ReactionObservation) and  not ro.code.oclIsUndefined()) )  )
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityReactionCode(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_REACTION_CODE,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityReactionCode"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityReactionCodeVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Reaction Code Vocab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityReactionCodeVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->forAll(obs | obs.getObservations()->forAll( ro | (not ro.oclIsKindOf(ccd::ReactionObservation)) or  (ro.oclIsKindOf(ccd::ReactionObservation) and  not ro.code.oclIsUndefined()  and ro.code.codeSystem = '2.16.840.1.113883.6.96' and (ro.code.code = '404684003' or ro.code.code = '243796009')  ) )  )";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityReactionCodeVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Reaction Code Vocab</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityReactionCodeVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->forAll(obs | obs.getObservations()->forAll( ro | (not ro.oclIsKindOf(ccd::ReactionObservation)) or  (ro.oclIsKindOf(ccd::ReactionObservation) and  not ro.code.oclIsUndefined()  and ro.code.codeSystem = '2.16.840.1.113883.6.96' and (ro.code.code = '404684003' or ro.code.code = '243796009')  ) )  )
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityReactionCodeVocab(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_REACTION_CODE_VOCAB,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityReactionCodeVocab"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivitySeverityText(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Severity Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivitySeverityText(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->forAll(obs | obs.getObservations()->forAll( so | (not so.oclIsKindOf(ccd::SeverityObservation)) or  (so.oclIsKindOf(ccd::SeverityObservation) and  not so.text.oclIsUndefined()) )  )";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivitySeverityText(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Severity Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivitySeverityText(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->forAll(obs | obs.getObservations()->forAll( so | (not so.oclIsKindOf(ccd::SeverityObservation)) or  (so.oclIsKindOf(ccd::SeverityObservation) and  not so.text.oclIsUndefined()) )  )
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivitySeverityText(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_SEVERITY_TEXT,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivitySeverityText"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivitySeverityCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Severity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivitySeverityCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->forAll(obs | obs.getObservations()->forAll( so | (not so.oclIsKindOf(ccd::SeverityObservation)) or  (so.oclIsKindOf(ccd::SeverityObservation) and  not so.code.oclIsUndefined()) )  )";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivitySeverityCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Severity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivitySeverityCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->forAll(obs | obs.getObservations()->forAll( so | (not so.oclIsKindOf(ccd::SeverityObservation)) or  (so.oclIsKindOf(ccd::SeverityObservation) and  not so.code.oclIsUndefined()) )  )
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivitySeverityCode(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivitySeverityCode"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivitySeverityCodeVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Severity Code Vocab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivitySeverityCodeVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->forAll(obs | obs.getObservations()->forAll( so | (not so.oclIsKindOf(ccd::SeverityObservation)) or  (so.oclIsKindOf(ccd::SeverityObservation) and  not so.code.oclIsUndefined() and so.code.codeSystem = '2.16.840.1.113883.6.96' and (so.code.code = '255604002' or so.code.code = '371923003' or so.code.code = '6736007' or so.code.code = '371924009' or so.code.code = '24484000' or so.code.code = '399166001')"+
") )  )";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivitySeverityCodeVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Severity Code Vocab</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivitySeverityCodeVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->forAll(obs | obs.getObservations()->forAll( so | (not so.oclIsKindOf(ccd::SeverityObservation)) or  (so.oclIsKindOf(ccd::SeverityObservation) and  not so.code.oclIsUndefined() and so.code.codeSystem = '2.16.840.1.113883.6.96' and (so.code.code = '255604002' or so.code.code = '371923003' or so.code.code = '6736007' or so.code.code = '371924009' or so.code.code = '24484000' or so.code.code = '399166001')
	 * ) )  )
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivitySeverityCodeVocab(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE_VOCAB,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivitySeverityCodeVocab"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityTemplateId(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityTemplateId(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.6')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityTemplateId(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityTemplateId(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.6')
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityTemplateId(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityTemplateId"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityClassCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityClassCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityClassCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityClassCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityClassCode(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityClassCode"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityMoodCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityMoodCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityMoodCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityMoodCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::EVN
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityMoodCode(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityMoodCode"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityId(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityId(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityId(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityId(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityId(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ID,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityId"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityCodeNullFlavor(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Code Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityCodeNullFlavor(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.nullFlavor = vocab::NullFlavor::NA)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityCodeNullFlavor(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Code Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityCodeNullFlavor(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.nullFlavor = vocab::NullFlavor::NA)
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityCodeNullFlavor(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_CODE_NULL_FLAVOR,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityCodeNullFlavor"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityEffectiveTime(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityEffectiveTime(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityEffectiveTime(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityEffectiveTime(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityEffectiveTime(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityEffectiveTime"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityEpisodeObservation(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Episode Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityEpisodeObservation(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::EpisodeObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityEpisodeObservation(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Episode Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityEpisodeObservation(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::EpisodeObservation))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityEpisodeObservation(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_EPISODE_OBSERVATION,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityEpisodeObservation"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityAllergyIntolerance(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Intolerance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAllergyIntolerance(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_INTOLERANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AllergyIntolerance) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityAllergyIntolerance(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Intolerance</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAllergyIntolerance(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_INTOLERANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AllergyIntolerance) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergyDrugSensitivityAllergyIntolerance(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_INTOLERANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_INTOLERANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_INTOLERANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_INTOLERANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ALLERGY_INTOLERANCE,
						 ConsolPlugin.INSTANCE.getString("AllergyDrugSensitivityAllergyIntolerance"),
						 new Object [] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEpisodeObservation(AllergyDrugSensitivity) <em>Get Episode Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisodeObservation(AllergyDrugSensitivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EPISODE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::EpisodeObservation))->asSequence()->first().oclAsType(consol::EpisodeObservation)";

	/**
	 * The cached OCL query for the '{@link #getEpisodeObservation(AllergyDrugSensitivity) <em>Get Episode Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisodeObservation(AllergyDrugSensitivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EPISODE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::EpisodeObservation))->asSequence()->first().oclAsType(consol::EpisodeObservation)
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EpisodeObservation getEpisodeObservation(AllergyDrugSensitivity allergyDrugSensitivity) {
		if (GET_EPISODE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY, ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY.getEAllOperations().get(86));
			try {
				GET_EPISODE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_EPISODE_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EPISODE_OBSERVATION__EOCL_QRY);
		return (EpisodeObservation) query.evaluate(allergyDrugSensitivity);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergyIntolerances(AllergyDrugSensitivity) <em>Get Allergy Intolerances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergyIntolerances(AllergyDrugSensitivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGY_INTOLERANCES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyIntolerance)).oclAsType(consol::AllergyIntolerance)";

	/**
	 * The cached OCL query for the '{@link #getAllergyIntolerances(AllergyDrugSensitivity) <em>Get Allergy Intolerances</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergyIntolerances(AllergyDrugSensitivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGY_INTOLERANCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyIntolerance)).oclAsType(consol::AllergyIntolerance)
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<AllergyIntolerance> getAllergyIntolerances(AllergyDrugSensitivity allergyDrugSensitivity) {
		if (GET_ALLERGY_INTOLERANCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY, ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY.getEAllOperations().get(87));
			try {
				GET_ALLERGY_INTOLERANCES__EOCL_QRY = helper.createQuery(GET_ALLERGY_INTOLERANCES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGY_INTOLERANCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AllergyIntolerance> result = (Collection<AllergyIntolerance>) query.evaluate(allergyDrugSensitivity);
		return new BasicEList.UnmodifiableEList<AllergyIntolerance>(result.size(), result.toArray());
	}

} // AllergyDrugSensitivityOperations