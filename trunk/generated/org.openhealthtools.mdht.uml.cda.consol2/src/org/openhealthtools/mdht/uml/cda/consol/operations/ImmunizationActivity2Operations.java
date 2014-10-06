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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.DrugVehicle;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2;
import org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunization Activity2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2SubstanceAdministeredAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Substance Administered Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityIndication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Indication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityMedicationSupplyOrder2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Medication Supply Order2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityMedicationDispense2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Medication Dispense2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityReactionObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Reaction Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityInstruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2ImmunizationActivityConsumableImmunizationMedicationInformation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Immunization Activity Consumable Immunization Medication Information2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2ImmunizationActivityPreconditionTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Immunization Activity Precondition Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2ImmunizationActivityPreconditionPreconditionForSubstanceAdministration2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Immunization Activity Precondition Precondition For Substance Administration2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#getSubstanceAdministeredActs() <em>Get Substance Administered Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#getConsolDrugVehicles() <em>Get Consol Drug Vehicles</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#getConsolIndication2s() <em>Get Consol Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#getConsolMedicationSupplyOrder2() <em>Get Consol Medication Supply Order2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#getConsolMedicationDispense2() <em>Get Consol Medication Dispense2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#getConsolReactionObservation2() <em>Get Consol Reaction Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#getConsolInstruction2() <em>Get Consol Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityAdministrationUnitCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Administration Unit Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityAdministrationUnitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Administration Unit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityDrugVehicle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Drug Vehicle</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityConsumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityPrecondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Precondition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImmunizationActivity2Operations extends ImmunizationActivityOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationActivity2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationActivityStatusCodeP(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityStatusCodeP(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationActivityStatusCodeP(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityStatusCodeP(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationActivity2 The receiving '<em><b>Immunization Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationActivityStatusCodeP(ImmunizationActivity2 immunizationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2);
			try {
				VALIDATE_IMMUNIZATION_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_ACTIVITY2__IMMUNIZATION_ACTIVITY_STATUS_CODE_P,
					ConsolPlugin.INSTANCE.getString("ImmunizationActivityStatusCodeP"),
					new Object[] { immunizationActivity2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivityStatusCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivityStatusCodeP", passToken);
				}
				passToken.add(immunizationActivity2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationActivity2AuthorParticipation(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivity2AuthorParticipation(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_ACTIVITY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationActivity2AuthorParticipation(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivity2AuthorParticipation(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_ACTIVITY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationActivity2 The receiving '<em><b>Immunization Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationActivity2AuthorParticipation(ImmunizationActivity2 immunizationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_ACTIVITY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2);
			try {
				VALIDATE_IMMUNIZATION_ACTIVITY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_ACTIVITY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_ACTIVITY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_ACTIVITY2__IMMUNIZATION_ACTIVITY2_AUTHOR_PARTICIPATION,
					ConsolPlugin.INSTANCE.getString("ImmunizationActivity2AuthorParticipation"),
					new Object[] { immunizationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationActivity2SubstanceAdministeredAct(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Substance Administered Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivity2SubstanceAdministeredAct(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::SubstanceAdministeredAct) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationActivity2SubstanceAdministeredAct(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Substance Administered Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivity2SubstanceAdministeredAct(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationActivity2 The receiving '<em><b>Immunization Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationActivity2SubstanceAdministeredAct(
			ImmunizationActivity2 immunizationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2);
			try {
				VALIDATE_IMMUNIZATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IMMUNIZATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_ACTIVITY2__IMMUNIZATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT,
					ConsolPlugin.INSTANCE.getString("ImmunizationActivity2SubstanceAdministeredAct"),
					new Object[] { immunizationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationActivityIndication2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Indication2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityIndication2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_ACTIVITY_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationActivityIndication2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Indication2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityIndication2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_ACTIVITY_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationActivity2 The receiving '<em><b>Immunization Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationActivityIndication2(ImmunizationActivity2 immunizationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_ACTIVITY_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2);
			try {
				VALIDATE_IMMUNIZATION_ACTIVITY_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_ACTIVITY_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_ACTIVITY_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_ACTIVITY2__IMMUNIZATION_ACTIVITY_INDICATION2,
					ConsolPlugin.INSTANCE.getString("ImmunizationActivityIndication2"),
					new Object[] { immunizationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationActivityMedicationSupplyOrder2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Medication Supply Order2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityMedicationSupplyOrder2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_ACTIVITY_MEDICATION_SUPPLY_ORDER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.supply.oclIsUndefined() and entryRelationship.supply.oclIsKindOf(consol::MedicationSupplyOrder2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationActivityMedicationSupplyOrder2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Medication Supply Order2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityMedicationSupplyOrder2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_ACTIVITY_MEDICATION_SUPPLY_ORDER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationActivity2 The receiving '<em><b>Immunization Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationActivityMedicationSupplyOrder2(
			ImmunizationActivity2 immunizationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_ACTIVITY_MEDICATION_SUPPLY_ORDER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2);
			try {
				VALIDATE_IMMUNIZATION_ACTIVITY_MEDICATION_SUPPLY_ORDER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_ACTIVITY_MEDICATION_SUPPLY_ORDER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IMMUNIZATION_ACTIVITY_MEDICATION_SUPPLY_ORDER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_ACTIVITY2__IMMUNIZATION_ACTIVITY_MEDICATION_SUPPLY_ORDER2,
					ConsolPlugin.INSTANCE.getString("ImmunizationActivityMedicationSupplyOrder2"),
					new Object[] { immunizationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationActivityMedicationDispense2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Medication Dispense2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityMedicationDispense2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_ACTIVITY_MEDICATION_DISPENSE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.supply.oclIsUndefined() and entryRelationship.supply.oclIsKindOf(consol::MedicationDispense2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationActivityMedicationDispense2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Medication Dispense2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityMedicationDispense2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_ACTIVITY_MEDICATION_DISPENSE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationActivity2 The receiving '<em><b>Immunization Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationActivityMedicationDispense2(ImmunizationActivity2 immunizationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_ACTIVITY_MEDICATION_DISPENSE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2);
			try {
				VALIDATE_IMMUNIZATION_ACTIVITY_MEDICATION_DISPENSE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_ACTIVITY_MEDICATION_DISPENSE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_ACTIVITY_MEDICATION_DISPENSE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_ACTIVITY2__IMMUNIZATION_ACTIVITY_MEDICATION_DISPENSE2,
					ConsolPlugin.INSTANCE.getString("ImmunizationActivityMedicationDispense2"),
					new Object[] { immunizationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationActivityReactionObservation2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Reaction Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityReactionObservation2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_ACTIVITY_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReactionObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::CAUS)";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationActivityReactionObservation2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Reaction Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityReactionObservation2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_ACTIVITY_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationActivity2 The receiving '<em><b>Immunization Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationActivityReactionObservation2(ImmunizationActivity2 immunizationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_ACTIVITY_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2);
			try {
				VALIDATE_IMMUNIZATION_ACTIVITY_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_ACTIVITY_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_ACTIVITY_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_ACTIVITY2__IMMUNIZATION_ACTIVITY_REACTION_OBSERVATION2,
					ConsolPlugin.INSTANCE.getString("ImmunizationActivityReactionObservation2"),
					new Object[] { immunizationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationActivityInstruction2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Instruction2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityInstruction2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_ACTIVITY_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instruction2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationActivityInstruction2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Instruction2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityInstruction2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_ACTIVITY_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationActivity2 The receiving '<em><b>Immunization Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationActivityInstruction2(ImmunizationActivity2 immunizationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_ACTIVITY_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2);
			try {
				VALIDATE_IMMUNIZATION_ACTIVITY_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_ACTIVITY_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_ACTIVITY_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_ACTIVITY2__IMMUNIZATION_ACTIVITY_INSTRUCTION2,
					ConsolPlugin.INSTANCE.getString("ImmunizationActivityInstruction2"),
					new Object[] { immunizationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationActivity2ImmunizationActivityConsumableImmunizationMedicationInformation2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Immunization Activity Consumable Immunization Medication Information2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivity2ImmunizationActivityConsumableImmunizationMedicationInformation2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_ACTIVITY2_IMMUNIZATION_ACTIVITY_CONSUMABLE_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->excluding(null)->reject(manufacturedProduct->one(manufacturedProduct : cda::ManufacturedProduct | not manufacturedProduct.oclIsUndefined() and manufacturedProduct.oclIsKindOf(consol::ImmunizationMedicationInformation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationActivity2ImmunizationActivityConsumableImmunizationMedicationInformation2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Immunization Activity Consumable Immunization Medication Information2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivity2ImmunizationActivityConsumableImmunizationMedicationInformation2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_IMMUNIZATION_ACTIVITY2_IMMUNIZATION_ACTIVITY_CONSUMABLE_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationActivity2 The receiving '<em><b>Immunization Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateImmunizationActivity2ImmunizationActivityConsumableImmunizationMedicationInformation2(
			ImmunizationActivity2 immunizationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_ACTIVITY2_IMMUNIZATION_ACTIVITY_CONSUMABLE_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_IMMUNIZATION_ACTIVITY2_IMMUNIZATION_ACTIVITY_CONSUMABLE_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_IMMUNIZATION_ACTIVITY2_IMMUNIZATION_ACTIVITY_CONSUMABLE_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_IMMUNIZATION_ACTIVITY2_IMMUNIZATION_ACTIVITY_CONSUMABLE_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(immunizationActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.IMMUNIZATION_ACTIVITY2__IMMUNIZATION_ACTIVITY2_IMMUNIZATION_ACTIVITY_CONSUMABLE_IMMUNIZATION_MEDICATION_INFORMATION2,
						ConsolPlugin.INSTANCE.getString("ImmunizationActivity2ImmunizationActivityConsumableImmunizationMedicationInformation2"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationActivity2ImmunizationActivityPreconditionTypeCode(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Immunization Activity Precondition Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivity2ImmunizationActivityPreconditionTypeCode(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_ACTIVITY2_IMMUNIZATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->excluding(null)->reject(typeCode=vocab::ActRelationshipType::PRCN)";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationActivity2ImmunizationActivityPreconditionTypeCode(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Immunization Activity Precondition Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivity2ImmunizationActivityPreconditionTypeCode(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_IMMUNIZATION_ACTIVITY2_IMMUNIZATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationActivity2 The receiving '<em><b>Immunization Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateImmunizationActivity2ImmunizationActivityPreconditionTypeCode(
			ImmunizationActivity2 immunizationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_ACTIVITY2_IMMUNIZATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_IMMUNIZATION_ACTIVITY2_IMMUNIZATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_IMMUNIZATION_ACTIVITY2_IMMUNIZATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_IMMUNIZATION_ACTIVITY2_IMMUNIZATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(immunizationActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.IMMUNIZATION_ACTIVITY2__IMMUNIZATION_ACTIVITY2_IMMUNIZATION_ACTIVITY_PRECONDITION_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("ImmunizationActivity2ImmunizationActivityPreconditionTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationActivity2ImmunizationActivityPreconditionPreconditionForSubstanceAdministration2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Immunization Activity Precondition Precondition For Substance Administration2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivity2ImmunizationActivityPreconditionPreconditionForSubstanceAdministration2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_ACTIVITY2_IMMUNIZATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->excluding(null)->reject(criterion->one(criterion : cda::Criterion | not criterion.oclIsUndefined() and criterion.oclIsKindOf(consol::PreconditionForSubstanceAdministration2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationActivity2ImmunizationActivityPreconditionPreconditionForSubstanceAdministration2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Immunization Activity Precondition Precondition For Substance Administration2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivity2ImmunizationActivityPreconditionPreconditionForSubstanceAdministration2(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_IMMUNIZATION_ACTIVITY2_IMMUNIZATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationActivity2 The receiving '<em><b>Immunization Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateImmunizationActivity2ImmunizationActivityPreconditionPreconditionForSubstanceAdministration2(
			ImmunizationActivity2 immunizationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_ACTIVITY2_IMMUNIZATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_IMMUNIZATION_ACTIVITY2_IMMUNIZATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_IMMUNIZATION_ACTIVITY2_IMMUNIZATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_IMMUNIZATION_ACTIVITY2_IMMUNIZATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(immunizationActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.IMMUNIZATION_ACTIVITY2__IMMUNIZATION_ACTIVITY2_IMMUNIZATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2,
						ConsolPlugin.INSTANCE.getString("ImmunizationActivity2ImmunizationActivityPreconditionPreconditionForSubstanceAdministration2"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubstanceAdministeredActs(ImmunizationActivity2) <em>Get Substance Administered Acts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceAdministeredActs(ImmunizationActivity2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUBSTANCE_ADMINISTERED_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::SubstanceAdministeredAct)).oclAsType(consol::SubstanceAdministeredAct)";

	/**
	 * The cached OCL query for the '{@link #getSubstanceAdministeredActs(ImmunizationActivity2) <em>Get Substance Administered Acts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceAdministeredActs(ImmunizationActivity2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUBSTANCE_ADMINISTERED_ACTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<SubstanceAdministeredAct> getSubstanceAdministeredActs(
			ImmunizationActivity2 immunizationActivity2) {
		if (GET_SUBSTANCE_ADMINISTERED_ACTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2,
				ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2.getEAllOperations().get(106));
			try {
				GET_SUBSTANCE_ADMINISTERED_ACTS__EOCL_QRY = helper.createQuery(GET_SUBSTANCE_ADMINISTERED_ACTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUBSTANCE_ADMINISTERED_ACTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SubstanceAdministeredAct> result = (Collection<SubstanceAdministeredAct>) query.evaluate(immunizationActivity2);
		return new BasicEList.UnmodifiableEList<SubstanceAdministeredAct>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolDrugVehicles(ImmunizationActivity2) <em>Get Consol Drug Vehicles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolDrugVehicles(ImmunizationActivity2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_DRUG_VEHICLES__EOCL_EXP = "self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::DrugVehicle)).oclAsType(consol::DrugVehicle)";

	/**
	 * The cached OCL query for the '{@link #getConsolDrugVehicles(ImmunizationActivity2) <em>Get Consol Drug Vehicles</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolDrugVehicles(ImmunizationActivity2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_DRUG_VEHICLES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<DrugVehicle> getConsolDrugVehicles(ImmunizationActivity2 immunizationActivity2) {
		if (GET_CONSOL_DRUG_VEHICLES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2,
				ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2.getEAllOperations().get(107));
			try {
				GET_CONSOL_DRUG_VEHICLES__EOCL_QRY = helper.createQuery(GET_CONSOL_DRUG_VEHICLES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_DRUG_VEHICLES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<DrugVehicle> result = (Collection<DrugVehicle>) query.evaluate(immunizationActivity2);
		return new BasicEList.UnmodifiableEList<DrugVehicle>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolIndication2s(ImmunizationActivity2) <em>Get Consol Indication2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolIndication2s(ImmunizationActivity2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_INDICATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication2)).oclAsType(consol::Indication2)";

	/**
	 * The cached OCL query for the '{@link #getConsolIndication2s(ImmunizationActivity2) <em>Get Consol Indication2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolIndication2s(ImmunizationActivity2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_INDICATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Indication2> getConsolIndication2s(ImmunizationActivity2 immunizationActivity2) {
		if (GET_CONSOL_INDICATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2,
				ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2.getEAllOperations().get(108));
			try {
				GET_CONSOL_INDICATION2S__EOCL_QRY = helper.createQuery(GET_CONSOL_INDICATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_INDICATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Indication2> result = (Collection<Indication2>) query.evaluate(immunizationActivity2);
		return new BasicEList.UnmodifiableEList<Indication2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolMedicationSupplyOrder2(ImmunizationActivity2) <em>Get Consol Medication Supply Order2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolMedicationSupplyOrder2(ImmunizationActivity2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_MEDICATION_SUPPLY_ORDER2__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationSupplyOrder2))->asSequence()->any(true).oclAsType(consol::MedicationSupplyOrder2)";

	/**
	 * The cached OCL query for the '{@link #getConsolMedicationSupplyOrder2(ImmunizationActivity2) <em>Get Consol Medication Supply Order2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolMedicationSupplyOrder2(ImmunizationActivity2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_MEDICATION_SUPPLY_ORDER2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MedicationSupplyOrder2 getConsolMedicationSupplyOrder2(ImmunizationActivity2 immunizationActivity2) {
		if (GET_CONSOL_MEDICATION_SUPPLY_ORDER2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2,
				ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2.getEAllOperations().get(109));
			try {
				GET_CONSOL_MEDICATION_SUPPLY_ORDER2__EOCL_QRY = helper.createQuery(GET_CONSOL_MEDICATION_SUPPLY_ORDER2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_MEDICATION_SUPPLY_ORDER2__EOCL_QRY);
		return (MedicationSupplyOrder2) query.evaluate(immunizationActivity2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolMedicationDispense2(ImmunizationActivity2) <em>Get Consol Medication Dispense2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolMedicationDispense2(ImmunizationActivity2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_MEDICATION_DISPENSE2__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationDispense2))->asSequence()->any(true).oclAsType(consol::MedicationDispense2)";

	/**
	 * The cached OCL query for the '{@link #getConsolMedicationDispense2(ImmunizationActivity2) <em>Get Consol Medication Dispense2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolMedicationDispense2(ImmunizationActivity2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_MEDICATION_DISPENSE2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MedicationDispense2 getConsolMedicationDispense2(ImmunizationActivity2 immunizationActivity2) {
		if (GET_CONSOL_MEDICATION_DISPENSE2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2,
				ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2.getEAllOperations().get(110));
			try {
				GET_CONSOL_MEDICATION_DISPENSE2__EOCL_QRY = helper.createQuery(GET_CONSOL_MEDICATION_DISPENSE2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_MEDICATION_DISPENSE2__EOCL_QRY);
		return (MedicationDispense2) query.evaluate(immunizationActivity2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolReactionObservation2(ImmunizationActivity2) <em>Get Consol Reaction Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolReactionObservation2(ImmunizationActivity2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_REACTION_OBSERVATION2__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation2))->asSequence()->any(true).oclAsType(consol::ReactionObservation2)";

	/**
	 * The cached OCL query for the '{@link #getConsolReactionObservation2(ImmunizationActivity2) <em>Get Consol Reaction Observation2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolReactionObservation2(ImmunizationActivity2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_REACTION_OBSERVATION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ReactionObservation2 getConsolReactionObservation2(ImmunizationActivity2 immunizationActivity2) {
		if (GET_CONSOL_REACTION_OBSERVATION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2,
				ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2.getEAllOperations().get(111));
			try {
				GET_CONSOL_REACTION_OBSERVATION2__EOCL_QRY = helper.createQuery(GET_CONSOL_REACTION_OBSERVATION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_REACTION_OBSERVATION2__EOCL_QRY);
		return (ReactionObservation2) query.evaluate(immunizationActivity2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolInstruction2(ImmunizationActivity2) <em>Get Consol Instruction2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolInstruction2(ImmunizationActivity2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_INSTRUCTION2__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2))->asSequence()->any(true).oclAsType(consol::Instruction2)";

	/**
	 * The cached OCL query for the '{@link #getConsolInstruction2(ImmunizationActivity2) <em>Get Consol Instruction2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolInstruction2(ImmunizationActivity2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_INSTRUCTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static Instruction2 getConsolInstruction2(ImmunizationActivity2 immunizationActivity2) {
		if (GET_CONSOL_INSTRUCTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2,
				ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2.getEAllOperations().get(112));
			try {
				GET_CONSOL_INSTRUCTION2__EOCL_QRY = helper.createQuery(GET_CONSOL_INSTRUCTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_INSTRUCTION2__EOCL_QRY);
		return (Instruction2) query.evaluate(immunizationActivity2);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationActivityTemplateId(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityTemplateId(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.52' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationActivityTemplateId(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityTemplateId(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationActivity2 The receiving '<em><b>Immunization Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationActivityTemplateId(ImmunizationActivity2 immunizationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2);
			try {
				VALIDATE_IMMUNIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_ACTIVITY2__IMMUNIZATION_ACTIVITY_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ImmunizationActivityTemplateId"),
					new Object[] { immunizationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationActivityCode(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityCode(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationActivityCode(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityCode(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationActivity2 The receiving '<em><b>Immunization Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationActivityCode(ImmunizationActivity2 immunizationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2);
			try {
				VALIDATE_IMMUNIZATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_ACTIVITY2__IMMUNIZATION_ACTIVITY_CODE,
					ConsolPlugin.INSTANCE.getString("ImmunizationActivityCode"), new Object[] { immunizationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationActivityStatusCode(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityStatusCode(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "
			+ "value.code = 'normal' or value.code = 'aborted' or value.code = 'active' or value.code = 'cancelled' or value.code = 'completed' or value.code = 'held' or value.code = 'new' or value.code = 'suspended' or value.code = 'nullified' or value.code = 'obsolete')";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationActivityStatusCode(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityStatusCode(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationActivity2 The receiving '<em><b>Immunization Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationActivityStatusCode(ImmunizationActivity2 immunizationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivityStatusCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(immunizationActivity2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_IMMUNIZATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2);
			try {
				VALIDATE_IMMUNIZATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_ACTIVITY2__IMMUNIZATION_ACTIVITY_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("ImmunizationActivityStatusCode"),
					new Object[] { immunizationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationActivityRepeatNumber(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Repeat Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityRepeatNumber(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationActivityRepeatNumber(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Repeat Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityRepeatNumber(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationActivity2 The receiving '<em><b>Immunization Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationActivityRepeatNumber(ImmunizationActivity2 immunizationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2);
			try {
				VALIDATE_IMMUNIZATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_ACTIVITY2__IMMUNIZATION_ACTIVITY_REPEAT_NUMBER,
					ConsolPlugin.INSTANCE.getString("ImmunizationActivityRepeatNumber"),
					new Object[] { immunizationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationActivityAdministrationUnitCodeP(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Administration Unit Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityAdministrationUnitCodeP(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.administrationUnitCode.oclIsUndefined() or self.administrationUnitCode.isNullFlavorUndefined()) implies (not self.administrationUnitCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationActivityAdministrationUnitCodeP(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Administration Unit Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityAdministrationUnitCodeP(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationActivity2 The receiving '<em><b>Immunization Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationActivityAdministrationUnitCodeP(
			ImmunizationActivity2 immunizationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2);
			try {
				VALIDATE_IMMUNIZATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IMMUNIZATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_ACTIVITY2__IMMUNIZATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P,
					ConsolPlugin.INSTANCE.getString("ImmunizationActivityAdministrationUnitCodeP"),
					new Object[] { immunizationActivity2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivityAdministrationUnitCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivityAdministrationUnitCodeP",
						passToken);
				}
				passToken.add(immunizationActivity2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationActivityAdministrationUnitCode(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Administration Unit Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityAdministrationUnitCode(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.administrationUnitCode.oclIsUndefined() or self.administrationUnitCode.isNullFlavorUndefined()) implies (not self.administrationUnitCode.oclIsUndefined() and self.administrationUnitCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.administrationUnitCode.oclAsType(datatypes::CE) in "
			+ "value.code = 'APPFUL' or value.code = 'DROP' or value.code = 'NDROP' or value.code = 'OPDROP' or value.code = 'ORDROP' or value.code = 'OTDROP' or value.code = 'PUFF' or value.code = 'SCOOP' or value.code = 'SPRY')";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationActivityAdministrationUnitCode(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Administration Unit Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityAdministrationUnitCode(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationActivity2 The receiving '<em><b>Immunization Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationActivityAdministrationUnitCode(
			ImmunizationActivity2 immunizationActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivityAdministrationUnitCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(immunizationActivity2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_IMMUNIZATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2);
			try {
				VALIDATE_IMMUNIZATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IMMUNIZATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_ACTIVITY2__IMMUNIZATION_ACTIVITY_ADMINISTRATION_UNIT_CODE,
					ConsolPlugin.INSTANCE.getString("ImmunizationActivityAdministrationUnitCode"),
					new Object[] { immunizationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationActivityNegationInd(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Negation Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityNegationInd(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_ACTIVITY_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationActivityNegationInd(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Negation Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityNegationInd(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_ACTIVITY_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationActivity2 The receiving '<em><b>Immunization Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationActivityNegationInd(ImmunizationActivity2 immunizationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_ACTIVITY_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2);
			try {
				VALIDATE_IMMUNIZATION_ACTIVITY_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_ACTIVITY_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_ACTIVITY_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_ACTIVITY2__IMMUNIZATION_ACTIVITY_NEGATION_IND,
					ConsolPlugin.INSTANCE.getString("ImmunizationActivityNegationInd"),
					new Object[] { immunizationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationActivityDrugVehicle(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Drug Vehicle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityDrugVehicle(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_ACTIVITY_DRUG_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::DrugVehicle))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationActivityDrugVehicle(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Drug Vehicle</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityDrugVehicle(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_ACTIVITY_DRUG_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationActivity2 The receiving '<em><b>Immunization Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationActivityDrugVehicle(ImmunizationActivity2 immunizationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_ACTIVITY_DRUG_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2);
			try {
				VALIDATE_IMMUNIZATION_ACTIVITY_DRUG_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_ACTIVITY_DRUG_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_ACTIVITY_DRUG_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_ACTIVITY2__IMMUNIZATION_ACTIVITY_DRUG_VEHICLE,
					ConsolPlugin.INSTANCE.getString("ImmunizationActivityDrugVehicle"),
					new Object[] { immunizationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationActivityConsumable(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Consumable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityConsumable(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(cda::Consumable))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationActivityConsumable(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Consumable</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityConsumable(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationActivity2 The receiving '<em><b>Immunization Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationActivityConsumable(ImmunizationActivity2 immunizationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2);
			try {
				VALIDATE_IMMUNIZATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_ACTIVITY2__IMMUNIZATION_ACTIVITY_CONSUMABLE,
					ConsolPlugin.INSTANCE.getString("ImmunizationActivityConsumable"),
					new Object[] { immunizationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationActivityPrecondition(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Precondition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityPrecondition(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->exists(precondition : cda::Precondition | not precondition.oclIsUndefined() and precondition.oclIsKindOf(cda::Precondition))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationActivityPrecondition(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Precondition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityPrecondition(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IMMUNIZATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param immunizationActivity2 The receiving '<em><b>Immunization Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateImmunizationActivityPrecondition(ImmunizationActivity2 immunizationActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IMMUNIZATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2);
			try {
				VALIDATE_IMMUNIZATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunizationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IMMUNIZATION_ACTIVITY2__IMMUNIZATION_ACTIVITY_PRECONDITION,
					ConsolPlugin.INSTANCE.getString("ImmunizationActivityPrecondition"),
					new Object[] { immunizationActivity2 }));
			}

			return false;
		}
		return true;
	}

} // ImmunizationActivity2Operations
