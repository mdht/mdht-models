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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSDrugAllergy;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugAllergyObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizerActuallyDreg;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.OrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Non Drug Allergy Organizer Actually Dreg</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizerActuallyDreg#validateNonDrugAllergyOrganizerActuallyDregEMSDrugAllergy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Organizer Actually Dreg EMS Drug Allergy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizerActuallyDreg#validateNonDrugAllergyOrganizerActuallyDregExistenceOfDrugAllergyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Organizer Actually Dreg Existence Of Drug Allergy Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizerActuallyDreg#getEMSDrugAllergies() <em>Get EMS Drug Allergies</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizerActuallyDreg#getExistenceOfDrugAllergyObservation() <em>Get Existence Of Drug Allergy Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonDrugAllergyOrganizerActuallyDregOperations extends OrganizerOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonDrugAllergyOrganizerActuallyDregOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonDrugAllergyOrganizerActuallyDregEMSDrugAllergy(NonDrugAllergyOrganizerActuallyDreg, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Organizer Actually Dreg EMS Drug Allergy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonDrugAllergyOrganizerActuallyDregEMSDrugAllergy(NonDrugAllergyOrganizerActuallyDreg, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG_EMS_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.act.oclIsUndefined() and component.act.oclIsKindOf(emspcr::EMSDrugAllergy))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonDrugAllergyOrganizerActuallyDregEMSDrugAllergy(NonDrugAllergyOrganizerActuallyDreg, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Organizer Actually Dreg EMS Drug Allergy</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonDrugAllergyOrganizerActuallyDregEMSDrugAllergy(NonDrugAllergyOrganizerActuallyDreg, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG_EMS_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonDrugAllergyOrganizerActuallyDreg The receiving '<em><b>Non Drug Allergy Organizer Actually Dreg</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNonDrugAllergyOrganizerActuallyDregEMSDrugAllergy(
			NonDrugAllergyOrganizerActuallyDreg nonDrugAllergyOrganizerActuallyDreg, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG_EMS_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG);
			try {
				VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG_EMS_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG_EMS_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG_EMS_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonDrugAllergyOrganizerActuallyDreg)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG__NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG_EMS_DRUG_ALLERGY,
					EmspcrPlugin.INSTANCE.getString("NonDrugAllergyOrganizerActuallyDregEMSDrugAllergy"),
					new Object[] { nonDrugAllergyOrganizerActuallyDreg }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonDrugAllergyOrganizerActuallyDregExistenceOfDrugAllergyObservation(NonDrugAllergyOrganizerActuallyDreg, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Organizer Actually Dreg Existence Of Drug Allergy Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonDrugAllergyOrganizerActuallyDregExistenceOfDrugAllergyObservation(NonDrugAllergyOrganizerActuallyDreg, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::ExistenceOfDrugAllergyObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonDrugAllergyOrganizerActuallyDregExistenceOfDrugAllergyObservation(NonDrugAllergyOrganizerActuallyDreg, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Organizer Actually Dreg Existence Of Drug Allergy Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonDrugAllergyOrganizerActuallyDregExistenceOfDrugAllergyObservation(NonDrugAllergyOrganizerActuallyDreg, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonDrugAllergyOrganizerActuallyDreg The receiving '<em><b>Non Drug Allergy Organizer Actually Dreg</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNonDrugAllergyOrganizerActuallyDregExistenceOfDrugAllergyObservation(
			NonDrugAllergyOrganizerActuallyDreg nonDrugAllergyOrganizerActuallyDreg, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG);
			try {
				VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonDrugAllergyOrganizerActuallyDreg)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG__NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION,
					EmspcrPlugin.INSTANCE.getString("NonDrugAllergyOrganizerActuallyDregExistenceOfDrugAllergyObservation"),
					new Object[] { nonDrugAllergyOrganizerActuallyDreg }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEMSDrugAllergies(NonDrugAllergyOrganizerActuallyDreg) <em>Get EMS Drug Allergies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMSDrugAllergies(NonDrugAllergyOrganizerActuallyDreg)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EMS_DRUG_ALLERGIES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(emspcr::EMSDrugAllergy)).oclAsType(emspcr::EMSDrugAllergy)";

	/**
	 * The cached OCL query for the '{@link #getEMSDrugAllergies(NonDrugAllergyOrganizerActuallyDreg) <em>Get EMS Drug Allergies</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMSDrugAllergies(NonDrugAllergyOrganizerActuallyDreg)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EMS_DRUG_ALLERGIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<EMSDrugAllergy> getEMSDrugAllergies(
			NonDrugAllergyOrganizerActuallyDreg nonDrugAllergyOrganizerActuallyDreg) {
		if (GET_EMS_DRUG_ALLERGIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG,
				EmspcrPackage.Literals.NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG.getEAllOperations().get(54));
			try {
				GET_EMS_DRUG_ALLERGIES__EOCL_QRY = helper.createQuery(GET_EMS_DRUG_ALLERGIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EMS_DRUG_ALLERGIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EMSDrugAllergy> result = (Collection<EMSDrugAllergy>) query.evaluate(nonDrugAllergyOrganizerActuallyDreg);
		return new BasicEList.UnmodifiableEList<EMSDrugAllergy>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getExistenceOfDrugAllergyObservation(NonDrugAllergyOrganizerActuallyDreg) <em>Get Existence Of Drug Allergy Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistenceOfDrugAllergyObservation(NonDrugAllergyOrganizerActuallyDreg)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ExistenceOfDrugAllergyObservation))->asSequence()->any(true).oclAsType(emspcr::ExistenceOfDrugAllergyObservation)";

	/**
	 * The cached OCL query for the '{@link #getExistenceOfDrugAllergyObservation(NonDrugAllergyOrganizerActuallyDreg) <em>Get Existence Of Drug Allergy Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistenceOfDrugAllergyObservation(NonDrugAllergyOrganizerActuallyDreg)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ExistenceOfDrugAllergyObservation getExistenceOfDrugAllergyObservation(
			NonDrugAllergyOrganizerActuallyDreg nonDrugAllergyOrganizerActuallyDreg) {
		if (GET_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG,
				EmspcrPackage.Literals.NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG.getEAllOperations().get(55));
			try {
				GET_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__EOCL_QRY = helper.createQuery(GET_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__EOCL_QRY);
		return (ExistenceOfDrugAllergyObservation) query.evaluate(nonDrugAllergyOrganizerActuallyDreg);
	}

} // NonDrugAllergyOrganizerActuallyDregOperations
