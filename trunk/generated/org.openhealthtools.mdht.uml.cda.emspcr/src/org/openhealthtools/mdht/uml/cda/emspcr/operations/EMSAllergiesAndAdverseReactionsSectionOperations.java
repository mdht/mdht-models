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

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergy;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugAllergyObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizer;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Allergies And Adverse Reactions Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#validateEMSAllergiesAndAdverseReactionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#validateEMSAllergiesAndAdverseReactionsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#validateEMSAllergiesAndAdverseReactionsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#validateEMSAllergiesAndAdverseReactionsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#validateEMSAllergiesAndAdverseReactionsSectionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#validateEMSAllergiesAndAdverseReactionsSectionDrugAllergyProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Drug Allergy Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#validateEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergies(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Environmental Allergies</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#getObservation() <em>Get Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#getDrugAllergyProblemAct() <em>Get Drug Allergy Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#getEnvironmentalAllergies() <em>Get Environmental Allergies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSAllergiesAndAdverseReactionsSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSAllergiesAndAdverseReactionsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionTemplateId(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSAllergiesAndAdverseReactionsSectionTemplateId(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.13')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionTemplateId(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSAllergiesAndAdverseReactionsSectionTemplateId(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsAllergiesAndAdverseReactionsSection The receiving '<em><b>EMS Allergies And Adverse Reactions Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSAllergiesAndAdverseReactionsSectionTemplateId(
			EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION);
			try {
				VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsAllergiesAndAdverseReactionsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("EMSAllergiesAndAdverseReactionsSectionTemplateId"),
					new Object[] { emsAllergiesAndAdverseReactionsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionCode(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSAllergiesAndAdverseReactionsSectionCode(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '48765-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionCode(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSAllergiesAndAdverseReactionsSectionCode(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsAllergiesAndAdverseReactionsSection The receiving '<em><b>EMS Allergies And Adverse Reactions Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSAllergiesAndAdverseReactionsSectionCode(
			EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION);
			try {
				VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsAllergiesAndAdverseReactionsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_CODE,
					EmspcrPlugin.INSTANCE.getString("EMSAllergiesAndAdverseReactionsSectionCode"),
					new Object[] { emsAllergiesAndAdverseReactionsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionTitle(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSAllergiesAndAdverseReactionsSectionTitle(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Allergies and Adverse Reactions')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionTitle(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSAllergiesAndAdverseReactionsSectionTitle(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsAllergiesAndAdverseReactionsSection The receiving '<em><b>EMS Allergies And Adverse Reactions Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSAllergiesAndAdverseReactionsSectionTitle(
			EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION);
			try {
				VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsAllergiesAndAdverseReactionsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TITLE,
					EmspcrPlugin.INSTANCE.getString("EMSAllergiesAndAdverseReactionsSectionTitle"),
					new Object[] { emsAllergiesAndAdverseReactionsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionText(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSAllergiesAndAdverseReactionsSectionText(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionText(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSAllergiesAndAdverseReactionsSectionText(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsAllergiesAndAdverseReactionsSection The receiving '<em><b>EMS Allergies And Adverse Reactions Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSAllergiesAndAdverseReactionsSectionText(
			EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION);
			try {
				VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsAllergiesAndAdverseReactionsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEXT,
					EmspcrPlugin.INSTANCE.getString("EMSAllergiesAndAdverseReactionsSectionText"),
					new Object[] { emsAllergiesAndAdverseReactionsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionObservation(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSAllergiesAndAdverseReactionsSectionObservation(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::ExistenceOfDrugAllergyObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionObservation(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSAllergiesAndAdverseReactionsSectionObservation(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsAllergiesAndAdverseReactionsSection The receiving '<em><b>EMS Allergies And Adverse Reactions Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSAllergiesAndAdverseReactionsSectionObservation(
			EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION);
			try {
				VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsAllergiesAndAdverseReactionsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_OBSERVATION,
					EmspcrPlugin.INSTANCE.getString("EMSAllergiesAndAdverseReactionsSectionObservation"),
					new Object[] { emsAllergiesAndAdverseReactionsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionDrugAllergyProblemAct(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Drug Allergy Problem Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSAllergiesAndAdverseReactionsSectionDrugAllergyProblemAct(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_DRUG_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(emspcr::DrugAllergy) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionDrugAllergyProblemAct(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Drug Allergy Problem Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSAllergiesAndAdverseReactionsSectionDrugAllergyProblemAct(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_DRUG_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsAllergiesAndAdverseReactionsSection The receiving '<em><b>EMS Allergies And Adverse Reactions Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSAllergiesAndAdverseReactionsSectionDrugAllergyProblemAct(
			EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_DRUG_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION);
			try {
				VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_DRUG_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_DRUG_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_DRUG_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsAllergiesAndAdverseReactionsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_DRUG_ALLERGY_PROBLEM_ACT,
					EmspcrPlugin.INSTANCE.getString("EMSAllergiesAndAdverseReactionsSectionDrugAllergyProblemAct"),
					new Object[] { emsAllergiesAndAdverseReactionsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergies(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Environmental Allergies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergies(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENVIRONMENTAL_ALLERGIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(emspcr::NonDrugAllergyOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergies(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Environmental Allergies</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergies(EMSAllergiesAndAdverseReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENVIRONMENTAL_ALLERGIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsAllergiesAndAdverseReactionsSection The receiving '<em><b>EMS Allergies And Adverse Reactions Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergies(
			EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENVIRONMENTAL_ALLERGIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION);
			try {
				VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENVIRONMENTAL_ALLERGIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENVIRONMENTAL_ALLERGIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENVIRONMENTAL_ALLERGIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsAllergiesAndAdverseReactionsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENVIRONMENTAL_ALLERGIES,
					EmspcrPlugin.INSTANCE.getString("EMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergies"),
					new Object[] { emsAllergiesAndAdverseReactionsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getObservation(EMSAllergiesAndAdverseReactionsSection) <em>Get Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation(EMSAllergiesAndAdverseReactionsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ExistenceOfDrugAllergyObservation))->asSequence()->any(true).oclAsType(emspcr::ExistenceOfDrugAllergyObservation)";

	/**
	 * The cached OCL query for the '{@link #getObservation(EMSAllergiesAndAdverseReactionsSection) <em>Get Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation(EMSAllergiesAndAdverseReactionsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ExistenceOfDrugAllergyObservation getObservation(
			EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection) {
		if (GET_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION,
				EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION.getEAllOperations().get(62));
			try {
				GET_OBSERVATION__EOCL_QRY = helper.createQuery(GET_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OBSERVATION__EOCL_QRY);
		return (ExistenceOfDrugAllergyObservation) query.evaluate(emsAllergiesAndAdverseReactionsSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDrugAllergyProblemAct(EMSAllergiesAndAdverseReactionsSection) <em>Get Drug Allergy Problem Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrugAllergyProblemAct(EMSAllergiesAndAdverseReactionsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DRUG_ALLERGY_PROBLEM_ACT__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(emspcr::DrugAllergy))->asSequence()->any(true).oclAsType(emspcr::DrugAllergy)";

	/**
	 * The cached OCL query for the '{@link #getDrugAllergyProblemAct(EMSAllergiesAndAdverseReactionsSection) <em>Get Drug Allergy Problem Act</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrugAllergyProblemAct(EMSAllergiesAndAdverseReactionsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DRUG_ALLERGY_PROBLEM_ACT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static DrugAllergy getDrugAllergyProblemAct(
			EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection) {
		if (GET_DRUG_ALLERGY_PROBLEM_ACT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION,
				EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION.getEAllOperations().get(63));
			try {
				GET_DRUG_ALLERGY_PROBLEM_ACT__EOCL_QRY = helper.createQuery(GET_DRUG_ALLERGY_PROBLEM_ACT__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DRUG_ALLERGY_PROBLEM_ACT__EOCL_QRY);
		return (DrugAllergy) query.evaluate(emsAllergiesAndAdverseReactionsSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEnvironmentalAllergies(EMSAllergiesAndAdverseReactionsSection) <em>Get Environmental Allergies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentalAllergies(EMSAllergiesAndAdverseReactionsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENVIRONMENTAL_ALLERGIES__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(emspcr::NonDrugAllergyOrganizer))->asSequence()->any(true).oclAsType(emspcr::NonDrugAllergyOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getEnvironmentalAllergies(EMSAllergiesAndAdverseReactionsSection) <em>Get Environmental Allergies</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentalAllergies(EMSAllergiesAndAdverseReactionsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENVIRONMENTAL_ALLERGIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static NonDrugAllergyOrganizer getEnvironmentalAllergies(
			EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection) {
		if (GET_ENVIRONMENTAL_ALLERGIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION,
				EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION.getEAllOperations().get(64));
			try {
				GET_ENVIRONMENTAL_ALLERGIES__EOCL_QRY = helper.createQuery(GET_ENVIRONMENTAL_ALLERGIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENVIRONMENTAL_ALLERGIES__EOCL_QRY);
		return (NonDrugAllergyOrganizer) query.evaluate(emsAllergiesAndAdverseReactionsSection);
	}

} // EMSAllergiesAndAdverseReactionsSectionOperations
