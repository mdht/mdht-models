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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.DrugVehicle;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#getSubstanceAdministeredActs() <em>Get Substance Administered Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#getConsolDrugVehicles() <em>Get Consol Drug Vehicles</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#getConsolInstructions() <em>Get Consol Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityAdministrationUnitCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Administration Unit Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityAdministrationUnitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Administration Unit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityDrugVehicle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Drug Vehicle</em>}</li>
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
				ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2.getEAllOperations().get(97));
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
				ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2.getEAllOperations().get(98));
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
	 * The cached OCL expression body for the '{@link #getConsolInstructions(ImmunizationActivity2) <em>Get Consol Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolInstructions(ImmunizationActivity2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_INSTRUCTIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instructions))->asSequence()->any(true).oclAsType(consol::Instructions)";

	/**
	 * The cached OCL query for the '{@link #getConsolInstructions(ImmunizationActivity2) <em>Get Consol Instructions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolInstructions(ImmunizationActivity2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_INSTRUCTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static Instructions getConsolInstructions(ImmunizationActivity2 immunizationActivity2) {
		if (GET_CONSOL_INSTRUCTIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2,
				ConsolPackage.Literals.IMMUNIZATION_ACTIVITY2.getEAllOperations().get(99));
			try {
				GET_CONSOL_INSTRUCTIONS__EOCL_QRY = helper.createQuery(GET_CONSOL_INSTRUCTIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_INSTRUCTIONS__EOCL_QRY);
		return (Instructions) query.evaluate(immunizationActivity2);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationActivityTemplateId(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationActivityTemplateId(ImmunizationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.52.2')";

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
			+ "value.codeSystem = '2.16.840.1.113883.5.85' and (value.code = 'APPFUL' or value.code = 'DROP' or value.code = 'NDROP' or value.code = 'OPDROP' or value.code = 'ORDROP' or value.code = 'OTDROP' or value.code = 'PUFF' or value.code = 'SCOOP' or value.code = 'SPRY'))";

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

} // ImmunizationActivity2Operations
