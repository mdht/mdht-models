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

import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyProblemActOperations;

import org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergy;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Drug Allergy</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergy#validateDrugAllergyParticipant1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Participant1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergy#validateAllergyProblemActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DrugAllergyOperations extends AllergyProblemActOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DrugAllergyOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDrugAllergyParticipant1(DrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Participant1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDrugAllergyParticipant1(DrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DRUG_ALLERGY_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validateDrugAllergyParticipant1(DrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Participant1</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDrugAllergyParticipant1(DrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DRUG_ALLERGY_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param drugAllergy The receiving '<em><b>Drug Allergy</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDrugAllergyParticipant1(DrugAllergy drugAllergy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_DRUG_ALLERGY_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DRUG_ALLERGY);
			try {
				VALIDATE_DRUG_ALLERGY_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_ALLERGY_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DRUG_ALLERGY_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(drugAllergy)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.DRUG_ALLERGY__DRUG_ALLERGY_PARTICIPANT1,
					EmspcrPlugin.INSTANCE.getString("DrugAllergyParticipant1"), new Object[] { drugAllergy }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyProblemActTemplateId(DrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActTemplateId(DrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.48')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyProblemActTemplateId(DrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActTemplateId(DrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param drugAllergy The receiving '<em><b>Drug Allergy</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyProblemActTemplateId(DrugAllergy drugAllergy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DRUG_ALLERGY);
			try {
				VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			drugAllergy)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.DRUG_ALLERGY__ALLERGY_PROBLEM_ACT_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("AllergyProblemActTemplateId"), new Object[] { drugAllergy }));
			}

			return false;
		}
		return true;
	}

} // DrugAllergyOperations
